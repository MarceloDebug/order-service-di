package com.marcelodebug.order_service_di.services;

import com.marcelodebug.order_service_di.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return  order.getBasic()
                - (order.getBasic() * order.getDiscount())
                + shippingService.shipment(order);

    }
}
