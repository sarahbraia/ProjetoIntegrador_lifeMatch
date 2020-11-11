package com.Ampara.LifeMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ampara.LifeMatch.model.PostagemModel;
@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long >{
	
}
