package com.heroes.heroes.repositories;

import com.heroes.heroes.entities.HeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<HeroEntity,Long> {
}
