package com.khan.springbootbookseller.service;

import com.khan.springbootbookseller.model.PurchaseHistory;
import com.khan.springbootbookseller.repository.projection.PurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
