package com.arkeup.link_innov.gestion_profil_mcs.service.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.arkeup.link_innov.gestion_profil_mcs.donnee.domain.referential.ThematicArea;
import com.arkeup.link_innov.gestion_profil_mcs.service.repository.common.mongo_es.CommonMongoToESRepository;
import com.arkeup.link_innov.gestion_profil_mcs.service.repository.elastic_search.ThematicAreaESRepository;
import com.arkeup.link_innov.gestion_profil_mcs.service.repository.mongo.mcs.ThematicAreaMongoRepository;

/**
 *
 * @author bona
 */
public interface ThematicAreaRepository extends CommonMongoToESRepository<ThematicArea, String, ThematicAreaMongoRepository, ThematicAreaESRepository> {

    public Page<ThematicArea> findAll(Pageable pageable);
}
