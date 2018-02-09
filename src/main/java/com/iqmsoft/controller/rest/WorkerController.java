package com.iqmsoft.controller.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.model.Worker;

import java.util.Arrays;

@RestController
public class WorkerController {

    @GetMapping("/workers")
    public ResponseEntity<?> employee() {
        Worker e1 = new Worker("Test1", 30, 2005, "Manager", "Male");
        Worker e2 = new Worker("Test2", 31, 2006, "Cashier", "Male");
        Worker e3 = new Worker("Test3", 32, 2007, "Accountant", "Male");
        Worker e4 = new Worker("Test4", 33, 2007, "Clerk", "Male");
        return ResponseEntity.ok(Arrays.asList(e1, e2, e3, e4));
    }

}
