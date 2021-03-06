package com.heinsmith.digitalplatoon.entities;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "entity")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Entity {

    @Id
    @Column(name = "entity_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entityId;

    @Column(name = "entity_name")
    private String entityName;

    @Column(name = "email_address")
    private String emailAddress;

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
