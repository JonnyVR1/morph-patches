package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.C0609o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C2466R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p149l.C17055gc;
import p149l.C17974kb;
import p149l.gbl0;
import p149l.j760;
import p149l.otb;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";

    @Nullable
    private CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    private CalendarStyle calendarStyle;

    @Nullable
    private Month current;

    @Nullable
    private DateSelector<S> dateSelector;
    private View dayFrame;
    private RecyclerView recyclerView;
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;

    @VisibleForTesting
    static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";

    @VisibleForTesting
    static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";

    @VisibleForTesting
    static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";

    @VisibleForTesting
    static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    public interface OnDayClickListener {
        void onDayClick(long j);
    }

    private void addActionsToMonthNavigation(@NonNull View view, @NonNull final MonthsPagerAdapter monthsPagerAdapter) {
        final MaterialButton materialButton = (MaterialButton) view.findViewById(C2466R.id.month_navigation_fragment_toggle);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        gbl0.m125201j0(materialButton, new C17974kb() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
            @Override // p149l.C17974kb
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull C17055gc c17055gc) {
                super.onInitializeAccessibilityNodeInfo(view2, c17055gc);
                int visibility = MaterialCalendar.this.dayFrame.getVisibility();
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                c17055gc.m125358A0(visibility == 0 ? materialCalendar.getString(C2466R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(C2466R.string.mtrl_picker_toggle_to_day_selection));
            }
        });
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C2466R.id.month_navigation_previous);
        materialButton2.setTag(NAVIGATION_PREV_TAG);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C2466R.id.month_navigation_next);
        materialButton3.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(C2466R.id.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(C2466R.id.mtrl_calendar_day_selector_frame);
        setSelector(CalendarSelector.DAY);
        materialButton.setText(this.current.getLongName());
        this.recyclerView.addOnScrollListener(new RecyclerView.AbstractC0582t() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                if (i == 0) {
                    recyclerView.announceForAccessibility(materialButton.getText());
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
            public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                int iFindFirstVisibleItemPosition = i < 0 ? materialCalendar.getLayoutManager().findFirstVisibleItemPosition() : materialCalendar.getLayoutManager().findLastVisibleItemPosition();
                MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(iFindFirstVisibleItemPosition);
                materialButton.setText(monthsPagerAdapter.getPageTitle(iFindFirstVisibleItemPosition));
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.toggleVisibleSelector();
            }
        });
        materialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iFindFirstVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() + 1;
                if (iFindFirstVisibleItemPosition < MaterialCalendar.this.recyclerView.getAdapter().getItemCount()) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindFirstVisibleItemPosition));
                }
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition() - 1;
                if (iFindLastVisibleItemPosition >= 0) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindLastVisibleItemPosition));
                }
            }
        });
    }

    @NonNull
    private RecyclerView.AbstractC0576n createItemDecoration() {
        return new RecyclerView.AbstractC0576n() { // from class: com.google.android.material.datepicker.MaterialCalendar.4
            private final Calendar startItem = UtcDates.getUtcCalendar();
            private final Calendar endItem = UtcDates.getUtcCalendar();

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
            public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
                if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (j760<Long, Long> j760Var : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                        Long l2 = j760Var.f116564a;
                        if (l2 != null && j760Var.f116565b != null) {
                            this.startItem.setTimeInMillis(l2.longValue());
                            this.endItem.setTimeInMillis(j760Var.f116565b.longValue());
                            int positionForYear = yearGridAdapter.getPositionForYear(this.startItem.get(1));
                            int positionForYear2 = yearGridAdapter.getPositionForYear(this.endItem.get(1));
                            View viewFindViewByPosition = gridLayoutManager.findViewByPosition(positionForYear);
                            View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(positionForYear2);
                            int iM3317m = positionForYear / gridLayoutManager.m3317m();
                            int iM3317m2 = positionForYear2 / gridLayoutManager.m3317m();
                            int i = iM3317m;
                            while (i <= iM3317m2) {
                                View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.m3317m() * i);
                                if (viewFindViewByPosition3 != null) {
                                    canvas.drawRect(i == iM3317m ? viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2) : 0, viewFindViewByPosition3.getTop() + MaterialCalendar.this.calendarStyle.year.getTopInset(), i == iM3317m2 ? viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2) : recyclerView.getWidth(), viewFindViewByPosition3.getBottom() - MaterialCalendar.this.calendarStyle.year.getBottomInset(), MaterialCalendar.this.calendarStyle.rangeFill);
                                }
                                i++;
                            }
                        }
                    }
                }
            }
        };
    }

    @Px
    public static int getDayHeight(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(C2466R.dimen.mtrl_calendar_day_height);
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector, int i, @NonNull CalendarConstraints calendarConstraints) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void postSmoothRecyclerViewScroll(final int i) {
        this.recyclerView.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // java.lang.Runnable
            public void run() {
                MaterialCalendar.this.recyclerView.smoothScrollToPosition(i);
            }
        });
    }

    @Nullable
    public CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public CalendarStyle getCalendarStyle() {
        return this.calendarStyle;
    }

    @Nullable
    public Month getCurrentMonth() {
        return this.current;
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    @Nullable
    public DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    @Override // com.google.android.material.datepicker.PickerFragment, androidx.lifecycle.InterfaceC0475e
    @NotNull
    public /* bridge */ /* synthetic */ otb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @NonNull
    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.current = (Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month start = this.calendarConstraints.getStart();
        if (MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i = C2466R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C2466R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(C2466R.id.mtrl_calendar_days_of_week);
        gbl0.m125201j0(gridView, new C17974kb() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // p149l.C17974kb
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull C17055gc c17055gc) {
                super.onInitializeAccessibilityNodeInfo(view, c17055gc);
                c17055gc.m125431q0(null);
            }
        });
        gridView.setAdapter((ListAdapter) new DaysOfWeekAdapter());
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) viewInflate.findViewById(C2466R.id.mtrl_calendar_months);
        final int i3 = i2;
        this.recyclerView.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i2, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(@NonNull RecyclerView.C0588z c0588z, @NonNull int[] iArr) {
                int i4 = i3;
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                if (i4 == 0) {
                    iArr[0] = materialCalendar.recyclerView.getWidth();
                    iArr[1] = MaterialCalendar.this.recyclerView.getWidth();
                } else {
                    iArr[0] = materialCalendar.recyclerView.getHeight();
                    iArr[1] = MaterialCalendar.this.recyclerView.getHeight();
                }
            }
        });
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, new OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            public void onDayClick(long j) {
                if (MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(j)) {
                    MaterialCalendar.this.dateSelector.select(j);
                    Iterator<OnSelectionChangedListener<S>> it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onSelectionChanged(MaterialCalendar.this.dateSelector.getSelection());
                    }
                    MaterialCalendar.this.recyclerView.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.yearSelector != null) {
                        MaterialCalendar.this.yearSelector.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(C2466R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C2466R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (viewInflate.findViewById(C2466R.id.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(viewInflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new C0609o().mo3857b(this.recyclerView);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    public void setCurrentMonth(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        int position = monthsPagerAdapter.getPosition(month);
        int position2 = position - monthsPagerAdapter.getPosition(this.current);
        boolean z = Math.abs(position2) > 3;
        boolean z2 = position2 > 0;
        this.current = month;
        if (z && z2) {
            this.recyclerView.scrollToPosition(position - 3);
            postSmoothRecyclerViewScroll(position);
        } else if (!z) {
            postSmoothRecyclerViewScroll(position);
        } else {
            this.recyclerView.scrollToPosition(position + 3);
            postSmoothRecyclerViewScroll(position);
        }
    }

    public void setSelector(CalendarSelector calendarSelector) {
        this.calendarSelector = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().scrollToPosition(((YearGridAdapter) this.yearSelector.getAdapter()).getPositionForYear(this.current.year));
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    public void toggleVisibleSelector() {
        CalendarSelector calendarSelector = this.calendarSelector;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            setSelector(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            setSelector(calendarSelector2);
        }
    }
}
