package com.android.cd.weight.calendar.interf;

import android.graphics.Canvas;

import com.android.cd.weight.calendar.view.Day;

public interface IDayRenderer {

    void refreshContent();

    void drawDay(Canvas canvas, Day day);

    IDayRenderer copy();

}
