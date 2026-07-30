package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C2466R;
import java.util.Calendar;
import p149l.C17055gc;
import p149l.C17974kb;
import p149l.dqi0;
import p149l.gbl0;
import p149l.j760;

/* JADX INFO: loaded from: classes7.dex */
final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(C2466R.id.cancel_button);
            setNextFocusRightId(C2466R.id.confirm_button);
        }
        gbl0.m125201j0(this, new C17974kb() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // p149l.C17974kb
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull C17055gc c17055gc) {
                super.onInitializeAccessibilityNodeInfo(view, c17055gc);
                c17055gc.m125431q0(null);
            }
        });
    }

    private void gainFocus(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().lastPositionInMonth());
        } else if (i == 130) {
            setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private static int horizontalMidPoint(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean skipMonth(@Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5) {
        return l2 == null || l3 == null || l4 == null || l5 == null || l4.longValue() > l3.longValue() || l5.longValue() < l2.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int iDayToPosition;
        int iHorizontalMidPoint;
        int iDayToPosition2;
        int iHorizontalMidPoint2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = materialCalendarGridView.getAdapter();
        DateSelector<?> dateSelector = adapter.dateSelector;
        CalendarStyle calendarStyle = adapter.calendarStyle;
        Long item = adapter.getItem(adapter.firstPositionInMonth());
        Long item2 = adapter.getItem(adapter.lastPositionInMonth());
        for (j760<Long, Long> j760Var : dateSelector.getSelectedRanges()) {
            Long l2 = j760Var.f116564a;
            if (l2 != null) {
                if (j760Var.f116565b == null) {
                    continue;
                } else {
                    Long l3 = l2;
                    long jLongValue = l3.longValue();
                    Long l4 = j760Var.f116565b;
                    long jLongValue2 = l4.longValue();
                    if (skipMonth(item, item2, l3, l4)) {
                        return;
                    }
                    if (jLongValue < item.longValue()) {
                        iDayToPosition = adapter.firstPositionInMonth();
                        iHorizontalMidPoint = adapter.isFirstInRow(iDayToPosition) ? 0 : materialCalendarGridView.getChildAt(iDayToPosition - 1).getRight();
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue);
                        iDayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        iHorizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAt(iDayToPosition));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iDayToPosition2 = adapter.lastPositionInMonth();
                        iHorizontalMidPoint2 = adapter.isLastInRow(iDayToPosition2) ? materialCalendarGridView.getWidth() : materialCalendarGridView.getChildAt(iDayToPosition2).getRight();
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue2);
                        iDayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        iHorizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAt(iDayToPosition2));
                    }
                    int itemId = (int) adapter.getItemId(iDayToPosition);
                    int itemId2 = (int) adapter.getItemId(iDayToPosition2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > iDayToPosition ? 0 : iHorizontalMidPoint, childAt.getTop() + calendarStyle.day.getTopInset(), iDayToPosition2 > numColumns2 ? getWidth() : iHorizontalMidPoint2, childAt.getBottom() - calendarStyle.day.getBottomInset(), calendarStyle.rangeFill);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            gainFocus(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().firstPositionInMonth()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().firstPositionInMonth());
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof MonthAdapter) {
            super.setAdapter(listAdapter);
        } else {
            dqi0.m113073a("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().firstPositionInMonth()) {
            super.setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
