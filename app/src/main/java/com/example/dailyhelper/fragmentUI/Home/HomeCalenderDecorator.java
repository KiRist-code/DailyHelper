package com.example.dailyhelper.fragmentUI.Home;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

import com.example.dailyhelper.R;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.spans.DotSpan;

import java.util.Collection;
import java.util.HashSet;

public class HomeCalenderDecorator implements DayViewDecorator {
//    private final Drawable drawable;
    private int color;
    private final HashSet<CalendarDay> dates;
    private TextView textView;
    public HomeCalenderDecorator(int color, Collection<CalendarDay> dates, Activity context) {
//        drawable = context.getDrawable(R.drawable.calendar_selector);
        // TODO: 2024. 12. 15. 건강, 친목, 일에 따른 drawable 만들기
        this.color = color;
        this.dates = new HashSet<>(dates);
    }

    // true를 리턴 시 모든 요일에 내가 설정한 드로어블이 적용된다
    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return dates.contains(day);
    }

    // 일자 선택 시 내가 정의한 드로어블이 적용되도록 한다
    @Override
    public void decorate(DayViewFacade view) {
//        view.setSelectionDrawable(drawable);
        view.addSpan(new DotSpan(5, color));
    }
}
