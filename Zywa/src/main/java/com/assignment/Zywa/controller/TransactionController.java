package com.assignment.Zywa.controller;

import com.assignment.Zywa.service.Transcript;
import jakarta.transaction.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
@AllArgsConstructor

public class TransactionController {


    private Transcript transcript;

    @GetMapping
    public List<Transaction> transactionList(@RequestParam String email, @RequestParam String date1 , String date2 ){
        return transcript.geneatestatement(email, date1, date2);
    }

}
