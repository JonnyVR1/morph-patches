package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C2466R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
class MonthAdapter extends BaseAdapter {
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;
    final Month month;

    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    public int dayToPosition(int i) {
        return firstPositionInMonth() + (i - 1);
    }

    public int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.month.daysInMonth + firstPositionInMonth();
    }

    @Override // android.widget.Adapter
    @Nullable
    public Long getItem(int i) {
        if (i < this.month.daysFromStartOfWeekToFirstOfMonth() || i > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.month.daysInWeek;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    @Override // android.widget.Adapter
    @NonNull
    public TextView getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C2466R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iFirstPositionInMonth = i - firstPositionInMonth();
        if (iFirstPositionInMonth >= 0) {
            Month month = this.month;
            if (iFirstPositionInMonth >= month.daysInMonth) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                int i2 = iFirstPositionInMonth + 1;
                textView.setTag(month);
                textView.setText(String.valueOf(i2));
                long day = this.month.getDay(i2);
                if (this.month.year == Month.today().year) {
                    textView.setContentDescription(DateStrings.getMonthDayOfWeekDay(day));
                } else {
                    textView.setContentDescription(DateStrings.getYearMonthDayOfWeekDay(day));
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        if (!this.calendarConstraints.getDateValidator().isValid(item.longValue())) {
            textView.setEnabled(false);
            this.calendarStyle.invalidDay.styleItem(textView);
            return textView;
        }
        textView.setEnabled(true);
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(item.longValue()) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                this.calendarStyle.selectedDay.styleItem(textView);
                return textView;
            }
        }
        long timeInMillis = UtcDates.getTodayCalendar().getTimeInMillis();
        long jLongValue = item.longValue();
        CalendarStyle calendarStyle = this.calendarStyle;
        if (timeInMillis == jLongValue) {
            calendarStyle.todayDay.styleItem(textView);
            return textView;
        }
        calendarStyle.day.styleItem(textView);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean isFirstInRow(int i) {
        return i % this.month.daysInWeek == 0;
    }

    public boolean isLastInRow(int i) {
        return (i + 1) % this.month.daysInWeek == 0;
    }

    public int lastPositionInMonth() {
        return (this.month.daysFromStartOfWeekToFirstOfMonth() + this.month.daysInMonth) - 1;
    }

    public int positionToDay(int i) {
        return (i - this.month.daysFromStartOfWeekToFirstOfMonth()) + 1;
    }

    public boolean withinMonth(int i) {
        return i >= firstPositionInMonth() && i <= lastPositionInMonth();
    }
}
