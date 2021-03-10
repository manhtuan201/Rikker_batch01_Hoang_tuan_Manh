package riki.com.demo.product;

import org.springframework.data.jpa.repository.JpaRepository;
import riki.com.demo.Model.Userproduct;

public interface Productreponsity extends JpaRepository<Userproduct,String> {
}
