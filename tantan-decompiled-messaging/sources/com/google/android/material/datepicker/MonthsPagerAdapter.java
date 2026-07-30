package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C2466R;
import p149l.gbl0;
import p149l.ig3;

/* JADX INFO: loaded from: classes7.dex */
class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {

    @NonNull
    private final CalendarConstraints calendarConstraints;
    private final DateSelector<?> dateSelector;
    private final int itemHeight;
    private final MaterialCalendar.OnDayClickListener onDayClickListener;

    public static class ViewHolder extends RecyclerView.AbstractC0566d0 {
        final MaterialCalendarGridView monthGrid;
        final TextView monthTitle;

        public ViewHolder(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C2466R.id.month_title);
            this.monthTitle = textView;
            gbl0.m125203k0(textView, true);
            this.monthGrid = (MaterialCalendarGridView) linearLayout.findViewById(C2466R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public MonthsPagerAdapter(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, MaterialCalendar.OnDayClickListener onDayClickListener) {
        Month start = calendarConstraints.getStart();
        Month end = calendarConstraints.getEnd();
        Month openAt = calendarConstraints.getOpenAt();
        if (start.compareTo(openAt) > 0) {
            ig3.m135964a("firstPage cannot be after currentPage");
            throw null;
        }
        if (openAt.compareTo(end) > 0) {
            ig3.m135964a("currentPage cannot be after lastPage");
            throw null;
        }
        this.itemHeight = (MonthAdapter.MAXIMUM_WEEKS * MaterialCalendar.getDayHeight(context)) + (MaterialDatePicker.isFullscreen(context) ? MaterialCalendar.getDayHeight(context) : 0);
        this.calendarConstraints = calendarConstraints;
        this.dateSelector = dateSelector;
        this.onDayClickListener = onDayClickListener;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.calendarConstraints.getMonthSpan();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.calendarConstraints.getStart().monthsLater(i).getStableId();
    }

    @NonNull
    public Month getPageMonth(int i) {
        return this.calendarConstraints.getStart().monthsLater(i);
    }

    @NonNull
    public CharSequence getPageTitle(int i) {
        return getPageMonth(i).getLongName();
    }

    public int getPosition(@NonNull Month month) {
        return this.calendarConstraints.getStart().monthsUntil(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Month monthMonthsLater = this.calendarConstraints.getStart().monthsLater(i);
        viewHolder.monthTitle.setText(monthMonthsLater.getLongName());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.monthGrid.findViewById(C2466R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthMonthsLater.equals(materialCalendarGridView.getAdapter().month)) {
            MonthAdapter monthAdapter = new MonthAdapter(monthMonthsLater, this.dateSelector, this.calendarConstraints);
            materialCalendarGridView.setNumColumns(monthMonthsLater.daysInWeek);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                if (materialCalendarGridView.getAdapter().withinMonth(i2)) {
                    MonthsPagerAdapter.this.onDayClickListener.onDayClick(materialCalendarGridView.getAdapter().getItem(i2).longValue());
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C2466R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.isFullscreen(viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0578p(-1, this.itemHeight));
        return new ViewHolder(linearLayout, true);
    }
}
