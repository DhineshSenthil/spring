package com.example.Sample.Repository;

import com.example.Sample.Model.Coursemodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Repository
public interface Courserepository extends JpaRepository<Coursemodel,Integer> {

@Query("Select c from Coursemodel c where c.coursefee<2500 ")
    List<Coursemodel> getDetaillessthan2500();
        // Interface so it does not create a  " Body "
    //@Query(value = " SELECT c FROM Coursemodel c WHERE c.coursefee BETWEEN :2000 AND :3000 ")
   // List<Coursemodel>getamountbetweenerange();
}

//Select f from Coursemodel f where t.coursefee BETWEEN :2000 AND :3000