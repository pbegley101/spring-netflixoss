package com.example.microservises.core.stock.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.microservises.core.stock.model.Stock;

/**
 * Created by magnus on 04/03/15.
 */
@RestController
public class StockService {

    /**
     * Sample usage: curl $HOST:$PORT/product/1
     *
     * @param symbol
     * @return
     */
    @RequestMapping("/stock/{symbol}")
    public Stock getStock(@PathVariable String symbol) {

        return new Stock(symbol, 12.3, 13.9,1.2,1.3);
    }
}
