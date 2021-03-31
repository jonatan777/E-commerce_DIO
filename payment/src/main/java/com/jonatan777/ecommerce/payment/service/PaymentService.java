package com.jonatan777.ecommerce.payment.service;

import com.jonatan777.ecommerce.checkout.event.CheckoutCreatedEvent; 
import com.jonatan777.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
