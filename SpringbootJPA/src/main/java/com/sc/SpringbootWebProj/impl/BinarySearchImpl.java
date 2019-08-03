package com.sc.SpringbootWebProj.impl;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sc.SpringbootWebProj.SpringbootWebProjApplication;
import com.sc.SpringbootWebProj.sort.SortInterface;


@Component
public class BinarySearchImpl {
	
	private static final Logger logger	= LoggerFactory.getLogger(SpringbootWebProjApplication.class);
	
	SortInterface si; 
	 
	public BinarySearchImpl(SortInterface si) {
		super();
		this.si = si;
	}

	public boolean isPresent(int[] sourceNumbers, int numberToBeSearched) {
		si.sort(sourceNumbers);
		logger.info("BinarySearchSymbol:searchSymbol() Binary Searching " +numberToBeSearched);
		//Arrays.asList(sourceNumbers).contains(numberToBeSearched)
		return true;
	}

	
}
