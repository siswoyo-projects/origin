package com.siswoyodotid.origin.service;

import com.siswoyodotid.origin.entity.OriginEntity;

import java.util.List;
import java.util.Optional;

public interface OriginService {
    List<OriginEntity> findAllOrigin();
    Optional<OriginEntity> findById(Long id);
    OriginEntity saveOrigin(OriginEntity originEntity);
    OriginEntity updateOrigin(OriginEntity originEntity);
    void deleteOrigin(Long id);

//  Using Request for Save and Update Origin

}
