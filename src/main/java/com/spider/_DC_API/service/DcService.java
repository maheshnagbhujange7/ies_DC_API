package com.spider._DC_API.service;

import java.util.Map;

import com.spider._DC_API.bindings.DcSummary;
import com.spider._DC_API.bindings.Education;
import com.spider._DC_API.bindings.Income;
import com.spider._DC_API.bindings.Kids;
import com.spider._DC_API.bindings.PlanSelection;

public interface DcService {

	public Map<Integer, String> getPlans();
	
	public boolean savePlanSelection(PlanSelection planSel);
	
	public boolean saveIncome(Income income);
	
	public boolean saveEducation(Education education);
	
	public boolean saveKids(Kids kids);
	
	public DcSummary fetchSummaryInfo(Long caseNum);
}
