package az.dev.product.controller;

import az.dev.product.dto.request.ProductReqDto;
import az.dev.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody ProductReqDto productReqDto) {
        return new ResponseEntity<>(productService.saveProduct(productReqDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable("productId") Long productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(productService.findAllProducts());
    }
}
