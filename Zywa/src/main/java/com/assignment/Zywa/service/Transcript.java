package com.assignment.Zywa.service;

import com.assignment.Zywa.Repo.TransactionRepo;
import jakarta.transaction.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
@AllArgsConstructor

public class Transcript {
    private TransactionRepo transactionRepo;
    private static final String File = "C:\\Users\\SARTHAK MONDAL\\Downloads\\transcript.pdf";

    public List<Transaction> geneatestatement (String email, String date1, String date2 ){

        LocalDate start= LocalDate.parse(date1, DateTimeFormatter.ISO_DATE);
        LocalDate end= LocalDate.parse(date2, DateTimeFormatter.ISO_DATE);
        private String entity= email;

        List<Transaction> transactionList = transactionRepo.findAll().stream().filter(transaction -> transaction.getemail().equals(email))
                .filter(transaction -> transaction.getdate1().isEqual(start)).filter(transaction -> Transaction.getdate1.isEqual(end)).toList();

        return transactionList;
    }

    private void pdf(List<Transaction> transactions){


        OutputStream outputStream= new FileOutputStream(File);

        PdfPcell customerInfo new pdfPcell(new Phrase("date1"+  date1));
        PdfCell date2 = new PdfPcell(new Phrase("date2"+ date2));

        return transactionList;




    }
}
