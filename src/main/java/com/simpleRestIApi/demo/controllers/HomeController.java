package com.simpleRestIApi.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.simpleRestIApi.demo.model.TemplateModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Timestamp;
import java.util.Date;

@Controller
@RequestMapping("/rest/home")
public class HomeController {
    @ResponseBody
    @RequestMapping(value = "", method=RequestMethod.GET)
    public  ResponseEntity<TemplateModel> response(){
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        TemplateModel model = new TemplateModel();
        model.setMessage("json-workaet");
        model.setTime(timestamp.toString());

        return ResponseEntity.ok(model);
    }
}