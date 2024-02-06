package br.com.cesarlucasjunior.paymentserviceprovider.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class LegalExpirationCardDateImpl implements ConstraintValidator<LegalExpirationCardDate, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        var expirationDate = LocalDate.parse(value);
        var today = LocalDate.now();
        return !expirationDate.isBefore(today) && !expirationDate.isEqual(today);
    }
}
