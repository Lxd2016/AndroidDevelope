package com.android.cd.weight.calendar.interf;


import com.android.cd.weight.calendar.model.CalendarDate;


public interface OnSelectDateListener {
    void onSelectDate(CalendarDate date);

    void onSelectOtherMonth(int offset);//点击其它月份日期
}
