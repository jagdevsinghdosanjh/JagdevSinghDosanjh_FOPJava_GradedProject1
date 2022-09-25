package com.greatlearning.department.service;

import com.greatlearning.department.model.*;

/**
 * @author jagdevsingh
 *
 */
public class AdminDepartment extends SuperDepartment {
    public String departmentName, getTodaysWork, getWorkDeadline;

    public String departmentName() {
	departmentName = "Admin Department";
	return departmentName;
    }

    public String getTodaysWork() {
	getTodaysWork = "Complete your documents Submission";
	return getTodaysWork;
    }

    public String getWorkDeadline() {
	getWorkDeadline = "Complete by EOD";
	return getWorkDeadline;
    }
}
