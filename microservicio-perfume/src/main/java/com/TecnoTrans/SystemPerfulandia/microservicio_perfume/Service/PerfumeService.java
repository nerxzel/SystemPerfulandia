package com.TecnoTrans.SystemPerfulandia.microservicio_perfume.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TecnoTrans.SystemPerfulandia.microservicio_perfume.Model.Perfume;
import com.TecnoTrans.SystemPerfulandia.microservicio_perfume.Repository.PerfumeRepository;

import java.util.List;

@Service
public class PerfumeService {

    @Autowired
    PerfumeRepository perfumeRepository;

    public List<Perfume> getPerfumes(){
        return perfumeRepository.findAll();
    }

    public Perfume getPerfumeById(Long id){
        return perfumeRepository.findById(id).orElse(new Perfume());
    }

    public void addPerfume(Perfume perfume) {
        perfumeRepository.save(perfume);
    }

    public void updatePerfume(Perfume perfume) {
        perfumeRepository.save(perfume);
    }

    public void deletePerfumeById(Long id) {
        perfumeRepository.deleteById(id);
    }

}
