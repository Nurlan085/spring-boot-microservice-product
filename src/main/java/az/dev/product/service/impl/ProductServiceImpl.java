package az.dev.product.service.impl;

import az.dev.product.dto.request.ProductReqDto;
import az.dev.product.model.Product;
import az.dev.product.repository.ProductRepository;
import az.dev.product.service.ProductService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;

    @Override
    public Product saveProduct(ProductReqDto productReqDto) {
        Product product = Product.builder()
                .name(productReqDto.getName())
                .price(productReqDto.getPrice())
                .createTime(LocalDateTime.now())
                .build();
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
