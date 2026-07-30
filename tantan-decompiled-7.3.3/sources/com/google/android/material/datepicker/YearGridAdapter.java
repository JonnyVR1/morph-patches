package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C2489R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final MaterialCalendar<?> materialCalendar;

    public static class ViewHolder extends RecyclerView.AbstractC0569e0 {
        final TextView textView;

        public ViewHolder(TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }

    public YearGridAdapter(MaterialCalendar<?> materialCalendar) {
        this.materialCalendar = materialCalendar;
    }

    @NonNull
    private View.OnClickListener createYearClickListener(final int i) {
        return new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                YearGridAdapter.this.materialCalendar.setCurrentMonth(Month.create(i, YearGridAdapter.this.materialCalendar.getCurrentMonth().month));
                YearGridAdapter.this.materialCalendar.setSelector(MaterialCalendar.CalendarSelector.DAY);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.materialCalendar.getCalendarConstraints().getYearSpan();
    }

    public int getPositionForYear(int i) {
        return i - this.materialCalendar.getCalendarConstraints().getStart().year;
    }

    public int getYearForPosition(int i) {
        return this.materialCalendar.getCalendarConstraints().getStart().year + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        int yearForPosition = getYearForPosition(i);
        String string = viewHolder.textView.getContext().getString(C2489R.string.mtrl_picker_navigate_to_year_description);
        viewHolder.textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(yearForPosition)));
        viewHolder.textView.setContentDescription(String.format(string, Integer.valueOf(yearForPosition)));
        CalendarStyle calendarStyle = this.materialCalendar.getCalendarStyle();
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        CalendarItemStyle calendarItemStyle = todayCalendar.get(1) == yearForPosition ? calendarStyle.todayYear : calendarStyle.year;
        Iterator<Long> it = this.materialCalendar.getDateSelector().getSelectedDays().iterator();
        while (it.hasNext()) {
            todayCalendar.setTimeInMillis(it.next().longValue());
            if (todayCalendar.get(1) == yearForPosition) {
                calendarItemStyle = calendarStyle.selectedYear;
            }
        }
        calendarItemStyle.styleItem(viewHolder.textView);
        viewHolder.textView.setOnClickListener(createYearClickListener(yearForPosition));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C2489R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
