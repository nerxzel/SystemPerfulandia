package com.TecnoTrans.SystemPerfulandia.microservicio_perfume.Repository;

import com.TecnoTrans.SystemPerfulandia.microservicio_perfume.Model.Perfume;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfumeRepository extends JpaRepository<Perfume, Long>{

}
