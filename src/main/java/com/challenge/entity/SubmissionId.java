package com.challenge.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.List;


@Embeddable
@EntityListeners(AuditingEntityListener.class)
public class SubmissionId implements Serializable {


    @ManyToOne
    private User user;

    @ManyToOne
    private Challenge challenge;


}
