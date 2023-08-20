package com.thepuar.watchdog.repository;

import com.thepuar.watchdog.model.EventTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EventTagRepository extends JpaRepository<EventTag, Long>, CrudRepository<EventTag, Long> {

}
