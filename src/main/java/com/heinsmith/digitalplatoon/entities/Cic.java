package com.heinsmith.digitalplatoon.entities;

import javax.persistence.Column;
import java.sql.Date;

@javax.persistence.Entity
public class Cic extends Entity {

    @Column(name = "cic_id")
    private Long cicId;

    @Column(name = "cic_type")
    private String cicType;

    private String subject;
    private String body;

    @Column(name = "source_system")
    private String sourceSystem;

    @Column(name = "cic_timestamp")
    private Date cicTimeStamp;

    public Long getCicId() {
        return cicId;
    }

    public void setCicId(Long cicId) {
        this.cicId = cicId;
    }

    public String getCicType() {
        return cicType;
    }

    public void setCicType(String cicType) {
        this.cicType = cicType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public Date getCicTimeStamp() {
        return cicTimeStamp;
    }

    public void setCicTimeStamp(Date cicTimeStamp) {
        this.cicTimeStamp = cicTimeStamp;
    }
}
