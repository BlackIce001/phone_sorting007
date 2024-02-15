import java.util.*;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

 class MobileStream {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1, "Samsung", 2500));
        productsList.add(new Product(2, "Lava", 3000));
        productsList.add(new Product(3, "Redmi", 2800));
        productsList.add(new Product(4, "Apple", 2800));
        productsList.add(new Product(5, "Nokia", 9000));

        List<Product> sortedProducts = productsList.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Sorted Products by Price:");
        sortedProducts.forEach(product -> System.out.println(product.name + ": $" + product.price));
    }
}

