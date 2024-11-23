package com.example.Sample.Controller;


import com.example.Sample.Model.Coursemodel;
import com.example.Sample.Service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //for defining this is coursecontroller
@RequestMapping("/Course")
public class Coursecontroller {

    @Autowired
    Courseservice courseservice;

    @PostMapping("/addCourse")
public Coursemodel createCourse(@RequestBody Coursemodel coursemodel){
  return courseservice.create(coursemodel);
}
@GetMapping("/addCourse")
        public String createCourseReturnstring(@RequestBody Coursemodel coursemodel){
            courseservice.createCourse(coursemodel);
            return courseservice.createCourse(coursemodel);
    }
    @DeleteMapping("/deleteCourse/{id}")
        public String deletethecourseReturnString(@PathVariable int id){
        return courseservice.deleteCourse(id);

    }
    @PostMapping("/addAllCourse")
    public List<Coursemodel>addAllCourse(@RequestBody List<Coursemodel> coursemodels){
        return courseservice.addAllCourseDetails(coursemodels);
    }
@GetMapping("/getCourseDetails /{id}")
    public Coursemodel getCourseDetails(@PathVariable int id){
        return courseservice.getCourse(id);
}
@GetMapping("/getAllCourse")
    public List<Coursemodel>getAllCourseDetails(){
        return courseservice.getAll();
}
@GetMapping("/deleteAll")
    public String deleteAllData(){
        return courseservice.deletetable();
}
@PutMapping("/update/{id}")
    public Coursemodel  updatecourse(@RequestBody Coursemodel coursemodel,@PathVariable int id){
        return courseservice.updateCoursedetails(coursemodel,id);
}

//Custom query means we can give the command like select c from tablename;
    @GetMapping("/getlessthancourse")
    public List<Coursemodel> getCoursefeelessthan2500(){
        return courseservice.getDetailslessthan2500();

    }
   // @GetMapping("/getValuesbetween")
  //  public List<Coursemodel>getValuebetween2000to3000(){
      //  return courseservice.getamountbetweentherange();
    //}

}
