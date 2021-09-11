package com.khan.springbootbookseller.repository.projection;

import java.time.LocalDateTime;

public interface PurchaseItem {

    String getTitle();
    Double getPurchase();
    LocalDateTime getPurchaseTime();
}
