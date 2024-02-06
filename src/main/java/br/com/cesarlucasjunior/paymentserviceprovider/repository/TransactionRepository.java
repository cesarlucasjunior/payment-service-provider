package br.com.cesarlucasjunior.paymentserviceprovider.repository;

import br.com.cesarlucasjunior.paymentserviceprovider.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
