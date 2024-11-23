package com.example.Sample.Service;


import com.example.Sample.Model.Coursemodel;
import com.example.Sample.Repository.Courserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Courseservice {
    @Autowired
    Courserepository courserepository;
    public Coursemodel create(Coursemodel coursemodel){
        return courserepository.save(coursemodel);

    }
    public String createCourse(Coursemodel coursemodel){
         courserepository.save(coursemodel);
        return "the id"+coursemodel.getId()+"created";
    }
    public String deleteCourse(int id){
        courserepository.deleteById(id);
        return "Deleted";
    }
public List<Coursemodel>addAllCourseDetails(List<Coursemodel> coursemodels){
       return courserepository.saveAll(coursemodels);

}
public Coursemodel getCourse(int id){
        return courserepository.findById(id).orElse(null);
}
public List<Coursemodel> getAll(){
        return courserepository.findAll();
}
public String deletetable(){
         courserepository.deleteAll();
         return "all data Deleted";
}
public Coursemodel updateCoursedetails(Coursemodel coursemodel,int id){
        Coursemodel oldData=null;

       oldData= courserepository.findById(id).orElse(null);
       oldData.setCoursedescrption(coursemodel.getCoursedescrption());
    oldData.setCoursefee(coursemodel.getCoursefee());
    oldData.setCourseduration(coursemodel.getCourseduration());
    oldData.setCourselesson(coursemodel.getCourselesson());
    oldData.setCoursename(coursemodel.getCoursename());
    return courserepository.save(oldData);

    }

    // custom query
    public List<Coursemodel>getDetailslessthan2500(){
        return courserepository.getDetaillessthan2500();

    }
    //public List<Coursemodel>getamountbetweentherange(){
      //  return courserepository.getamountbetweenerange();
    //}

}
