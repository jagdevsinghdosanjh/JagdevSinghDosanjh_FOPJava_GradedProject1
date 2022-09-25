package com.greatlearning.department.service;

import com.greatlearning.department.model.*;

/**
 * @author jagdevsingh
 *
 */
public class TechDepartment extends SuperDepartment {
    public String departmentName, getTodaysWork, getTechStackInformation;

    public String departmentName() {
	departmentName = "Tech Department";
	return departmentName;
    }

    public String getTodaysWork() {
	getTodaysWork = "Complete coding of Module 1";
	return getTodaysWork;
    }

    public String getWorkDeadline() {
	getWorkDeadline = "Complete by EOD";
	return getWorkDeadline;
    }

    public String getTechStackInformation() {
	getTechStackInformation = "core Java";
	return getTechStackInformation;
    }
}