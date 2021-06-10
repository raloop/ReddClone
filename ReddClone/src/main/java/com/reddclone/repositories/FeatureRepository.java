package com.reddclone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reddclone.domain.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
