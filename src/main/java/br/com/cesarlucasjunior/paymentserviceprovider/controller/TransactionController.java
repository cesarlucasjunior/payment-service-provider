package br.com.cesarlucasjunior.paymentserviceprovider.controller;

import br.com.cesarlucasjunior.paymentserviceprovider.domain.Transaction;
import br.com.cesarlucasjunior.paymentserviceprovider.domain.dto.TransactionDTO;
import br.com.cesarlucasjunior.paymentserviceprovider.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> save(@Valid @RequestBody TransactionDTO transactionDTO) {
        var transaction = transactionService.save(transactionDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(transaction);
    }
}
