package com.greatlearning.department.model;

/**
 * @author jagdevsingh
 *
 */
public abstract class SuperDepartment {
    public static String departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday;

    public String departmentName() {
	departmentName = "Super Department";
	return departmentName;
    }

    public String getTodaysWork() {
	getTodaysWork = "No Work as of now";
	return getTodaysWork;
    }

    public String getWorkDeadline() {
	getWorkDeadline = "Nil";
	return getWorkDeadline;
    }

    public String isTodayAHoliday() {
	isTodayAHoliday = "Today is not a holiday";
	return isTodayAHoliday;
    }
}