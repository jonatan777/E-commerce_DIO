package com.jonatan777.ecommerce.checkout.service;

import com.jonatan777.ecommerce.checkout.entity.CheckoutEntity; 
import com.jonatan777.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
