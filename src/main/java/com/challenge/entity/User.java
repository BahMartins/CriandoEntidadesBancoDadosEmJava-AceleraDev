package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(name = "full_name", length = 100, nullable = false)
    private String fullName;

    @NotNull
    @NotBlank
    @Email
    @Size(max = 100)
    private String email;

    @NotNull
    @NotBlank
    @Size(max = 50)
    @Column(length = 50, nullable = false)
    private String nickname;

    @NotNull
    @NotBlank
    @Size(max = 255)
    private String password;

    @OneToMany(mappedBy = "id.user")
    private List<Candidate> candidates;

    @OneToMany(mappedBy = "id.user")
    private List<Submission> submissions;

    @CreatedDate
    private LocalDateTime createdAt;





}
