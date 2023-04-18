package com.siswoyodotid.origin.repository;

import com.siswoyodotid.origin.entity.OriginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OriginRepository extends JpaRepository<OriginEntity, Long> {

}
