package com.cg.processor;

import org.springframework.batch.item.ItemProcessor;

import com.cg.model.Report;

//run before writing
public class FilterReportProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {

		//filter object which age = 30
		if(item.getAge()==30){
			return null; // null = ignore this object
		}
		return item;
	}

}