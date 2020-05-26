package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class Acceleration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(length = 100, nullable = false)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 50)
    @Column(length = 50, nullable = false)
    private String slug;

    @ManyToOne
    private Challenge challenge;

    @OneToMany(mappedBy = "id.acceleration")
    private List<Candidate> candidates;

    @CreatedDate
    private LocalDateTime createdAt;



}
