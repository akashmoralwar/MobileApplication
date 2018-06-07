package com.cg.evm.service;

import com.cg.evm.dao.PurchaseDetailsDao;
import com.cg.evm.dao.PurchaseDetailsDaoImpl;
import com.cg.evm.dto.PurchaseDetails;

public class PurchaseDetailsServiceImpl implements PurchaseDetailsService{

	PurchaseDetailsDao purchaseDao;
	
	public PurchaseDetailsServiceImpl() {
		purchaseDao=new PurchaseDetailsDaoImpl();
	}
	@Override
	public int addPurchaseDetails(PurchaseDetails pDetails) {
		int id=purchaseDao.addPurchaseDetails(pDetails);
		return id;
	}

}
