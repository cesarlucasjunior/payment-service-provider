package br.com.cesarlucasjunior.paymentserviceprovider.domain;

import br.com.cesarlucasjunior.paymentserviceprovider.validator.LegalExpirationCardDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TRANSACTIONS")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal value;
    private String description;
    private PaymentMethod paymentMethod;
    private String cardNumber;
    private String nameCardNumber;
    @LegalExpirationCardDate
    private LocalDate expirationDate;
    private String verificationCode;
    private LocalDate transactionDate;

    public Transaction(BigDecimal value, String description, PaymentMethod paymentMethod, String cardNumber, String nameCardNumber, LocalDate expirationDate, String verificationCode, LocalDate transactionDate) {
        this.value = value;
        this.description = description;
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.nameCardNumber = nameCardNumber;
        this.expirationDate = expirationDate;
        this.verificationCode = verificationCode;
        this.transactionDate = transactionDate;
    }

}
