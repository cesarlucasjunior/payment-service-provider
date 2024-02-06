package br.com.cesarlucasjunior.paymentserviceprovider.validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = LegalExpirationCardDateImpl.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface LegalExpirationCardDate {

    String message() default "Expiration date invalid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
