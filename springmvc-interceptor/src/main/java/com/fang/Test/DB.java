package com.fang.Test;
import java.util.HashMap;
import java.util.Map;
/**
 * 模拟DataBase
 * @author lis
 *
 */
public class DB {

    private static Map<String, Product> products = new HashMap<>();
    static {
        // 初始化数据
        products.put("1", new Product("1"));
        products.put("2", new Product("2"));
    }
    public static Product getProduct(String productId) {
        return products.get(productId);
    }
}

