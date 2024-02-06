package br.com.cesarlucasjunior.paymentserviceprovider.domain.dto;

import br.com.cesarlucasjunior.paymentserviceprovider.domain.PaymentMethod;
import br.com.cesarlucasjunior.paymentserviceprovider.validator.LegalExpirationCardDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {
    private BigDecimal value;
    private String description;
    private PaymentMethod paymentMethod;
    private String cardNumber;
    private String nameCardNumber;
    @LegalExpirationCardDate
    private String expirationDate;
    private String verificationCode;
}
