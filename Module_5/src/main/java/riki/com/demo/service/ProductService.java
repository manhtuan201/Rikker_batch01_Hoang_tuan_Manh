package riki.com.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import riki.com.demo.product.Productreponsity;
import riki.com.demo.Model.Userproduct;

import java.util.List;
@Service

public class ProductService {
    @Autowired
    private Productreponsity repo;
    public List<Userproduct> listAll(){
        return repo.findAll();
    }
    public void save(Userproduct product){
        repo.save(product);
    }
    public Userproduct get(String makh){
        return  repo.findById(makh).get();

    }
    public void delete(String makh){
        repo.deleteById(makh);
    }
}
