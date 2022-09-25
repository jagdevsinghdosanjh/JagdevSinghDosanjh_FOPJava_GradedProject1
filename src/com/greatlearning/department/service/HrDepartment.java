package com.greatlearning.department.service;

import com.greatlearning.department.model.*;

/**
 * @author jagdevsingh
 *
 */
public class HrDepartment extends SuperDepartment {
    public String departmentName, getTodaysWork, getWorkDeadline, doActivity;

    public String departmentName() {
	departmentName = "Hr Depeartment";
	return departmentName;
    }

    public String getTodaysWork() {
	getTodaysWork = "Fill today's timesheet and mark your attendance";
	return getTodaysWork;
    }

    public String getWorkDeadline() {
	getWorkDeadline = "Complete by EOD";
	return getWorkDeadline;
    }

    public String doActivity() {
	doActivity = "team Lunch";
	return doActivity;
    }
}
