package sample.charts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sample.charts.domain.Product;

/**
 * Spring Data repository for the Product entity.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
