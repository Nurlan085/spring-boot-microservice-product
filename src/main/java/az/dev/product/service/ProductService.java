package az.dev.product.service;

import az.dev.product.dto.request.ProductReqDto;
import az.dev.product.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(ProductReqDto productReqDto);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
