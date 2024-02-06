package br.com.cesarlucasjunior.paymentserviceprovider.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;
import java.time.LocalDate;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ProblemDetail handleValidationErrors(MethodArgumentNotValidException exception) {
        var problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, exception.getMessage());
        problemDetail.setType(URI.create("/transaction"));
        problemDetail.setTitle("Erro durante validação dos dados enviados!");
        problemDetail.setDetail(exception.getBindingResult().getFieldErrors().toString());
        problemDetail.setProperty("timestamp", LocalDate.now());
        return problemDetail;
    }
}
