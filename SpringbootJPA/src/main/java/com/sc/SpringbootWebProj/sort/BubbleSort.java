package com.sc.SpringbootWebProj.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.sc.SpringbootWebProj.SpringbootWebProjApplication;
@Component
@Primary
public class BubbleSort implements SortInterface{

	private static final Logger logger	= LoggerFactory.getLogger(SpringbootWebProjApplication.class);
	
	@Override
	public int[] sort(int[] sourceNumbers) {
		logger.info("BubbleSort");
		return sourceNumbers;
	}
	
}
