package com.khan.springbootbookseller.service;


import com.khan.springbootbookseller.model.PurchaseHistory;
import com.khan.springbootbookseller.repository.PurchaseHistoryRepository;
import com.khan.springbootbookseller.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements  IPurchaseHistoryService {


    private final PurchaseHistoryRepository purchaseHistoryRepository;

    @Autowired
    public PurchaseHistoryService(PurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }


    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory)
    {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }


    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId){
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);

    }
}
