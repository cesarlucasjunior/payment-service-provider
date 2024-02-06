package br.com.cesarlucasjunior.paymentserviceprovider.service;

import br.com.cesarlucasjunior.paymentserviceprovider.domain.Transaction;
import br.com.cesarlucasjunior.paymentserviceprovider.domain.dto.TransactionDTO;
import br.com.cesarlucasjunior.paymentserviceprovider.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction save(TransactionDTO transactionDTO) {
        var transaction = new Transaction(
                transactionDTO.getValue(),
                transactionDTO.getDescription(),
                transactionDTO.getPaymentMethod(),
                transactionDTO.getCardNumber().substring(transactionDTO.getCardNumber().length() - 4),
                transactionDTO.getNameCardNumber(),
                LocalDate.parse(transactionDTO.getExpirationDate()),
                transactionDTO.getVerificationCode(),
                LocalDate.now()
        );

        return transactionRepository.save(transaction);
    }
}
