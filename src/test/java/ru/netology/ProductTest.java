package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Product;

public class ProductTest {
    Product product1 = new Product(5, "gum", 50);
    Product product2 = new Product(10, "orange", 100);
    Product product3 = new Product(15, "apple", 150);
    Product product4 = new Product(20, "juice", 200);
    Product product5 = new Product(25, "candies", 250);

    @Test
    public void shouldAddProduct() {
        ShopRepository repo = new ShopRepository();

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.add(product4);
        repo.add(product5);

        Product[] expected = {product1, product2, product3, product4, product5};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveProduct() {
        ShopRepository repo = new ShopRepository();


        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(5);
        });

    }

    @Test
    public void shouldSaveProduct() {
        ShopRepository repo = new ShopRepository();

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.add(product4);
        repo.add(product5);

        Product[] expected = {product1, product2, product3, product4, product5};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}

