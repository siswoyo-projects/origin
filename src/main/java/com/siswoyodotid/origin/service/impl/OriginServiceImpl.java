package com.siswoyodotid.origin.service.impl;

import com.siswoyodotid.origin.entity.OriginEntity;
import com.siswoyodotid.origin.repository.OriginRepository;
import com.siswoyodotid.origin.service.OriginService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OriginServiceImpl implements OriginService {

    private final OriginRepository originRepository;

    public OriginServiceImpl(OriginRepository originRepository) {
        this.originRepository = originRepository;
    }

    @Override
    public List<OriginEntity> findAllOrigin() {
        return originRepository.findAll();
    }

    @Override
    public Optional<OriginEntity> findById(Long id) {
        return originRepository.findById(id);
    }

    @Override
    public OriginEntity saveOrigin(OriginEntity originEntity) {
        return originRepository.save(originEntity);
    }

    @Override
    public OriginEntity updateOrigin(OriginEntity originEntity) {
        return originRepository.save(originEntity);
    }

    @Override
    public void deleteOrigin(Long id) {
        originRepository.deleteById(id);
    }

}
