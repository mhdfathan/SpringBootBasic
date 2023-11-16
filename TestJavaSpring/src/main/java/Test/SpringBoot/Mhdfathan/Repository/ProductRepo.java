package Test.SpringBoot.Mhdfathan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Test.SpringBoot.Mhdfathan.Model.Product;

/**
 * ProductRepo
 */
public interface ProductRepo extends JpaRepository<Product,Long> {

    
}