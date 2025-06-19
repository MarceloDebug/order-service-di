package com.marcelodebug.order_service_di.services;

import com.marcelodebug.order_service_di.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        if(order.getBasic() < 100){
            return 20.00;
        }
        else if(order.getBasic()>=200){
            return 0.00;
        }
        else{
            return 12.00;
        }
    }
}
