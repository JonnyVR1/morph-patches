package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.C2489R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes7.dex */
final class CalendarStyle {

    @NonNull
    final CalendarItemStyle day;

    @NonNull
    final CalendarItemStyle invalidDay;

    @NonNull
    final Paint rangeFill;

    @NonNull
    final CalendarItemStyle selectedDay;

    @NonNull
    final CalendarItemStyle selectedYear;

    @NonNull
    final CalendarItemStyle todayDay;

    @NonNull
    final CalendarItemStyle todayYear;

    @NonNull
    final CalendarItemStyle year;

    public CalendarStyle(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, C2489R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C2489R.styleable.MaterialCalendar);
        this.day = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.MaterialCalendar_dayStyle, 0));
        this.invalidDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.selectedDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.todayDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C2489R.styleable.MaterialCalendar_rangeFillColor);
        this.year = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.MaterialCalendar_yearStyle, 0));
        this.selectedYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.todayYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.rangeFill = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
