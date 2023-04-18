package com.siswoyodotid.origin.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_origin")
public class OriginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "origin_id")
    private String origin_id;

    @Column(name = "origin_desc")
    private String origin_desc;

    public OriginEntity() {
    }

    public OriginEntity(Long id, String origin_id, String origin_desc) {
        this.id = id;
        this.origin_id = origin_id;
        this.origin_desc = origin_desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin_id() {
        return origin_id;
    }

    public void setOrigin_id(String origin_id) {
        this.origin_id = origin_id;
    }

    public String getOrigin_desc() {
        return origin_desc;
    }

    public void setOrigin_desc(String origin_desc) {
        this.origin_desc= origin_desc;
    }
}
