package com.wdullaer.materialdatetimepicker.date;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p153l.tnk0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DayPickerView extends ListView implements AbsListView.OnScrollListener, DatePickerDialog.InterfaceC14808c {

    /* JADX INFO: renamed from: q */
    public static int f62079q = -1;

    /* JADX INFO: renamed from: r */
    private static SimpleDateFormat f62080r = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: a */
    protected int f62081a;

    /* JADX INFO: renamed from: b */
    protected boolean f62082b;

    /* JADX INFO: renamed from: c */
    protected int f62083c;

    /* JADX INFO: renamed from: d */
    protected float f62084d;

    /* JADX INFO: renamed from: e */
    protected Context f62085e;

    /* JADX INFO: renamed from: f */
    protected Handler f62086f;

    /* JADX INFO: renamed from: g */
    protected AbstractC14817b.a f62087g;

    /* JADX INFO: renamed from: h */
    protected AbstractC14817b f62088h;

    /* JADX INFO: renamed from: i */
    protected AbstractC14817b.a f62089i;

    /* JADX INFO: renamed from: j */
    protected int f62090j;

    /* JADX INFO: renamed from: k */
    protected long f62091k;

    /* JADX INFO: renamed from: l */
    protected int f62092l;

    /* JADX INFO: renamed from: m */
    protected int f62093m;

    /* JADX INFO: renamed from: n */
    private InterfaceC14816a f62094n;

    /* JADX INFO: renamed from: o */
    private boolean f62095o;

    /* JADX INFO: renamed from: p */
    protected RunnableC14811b f62096p;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DayPickerView$a */
    public class RunnableC14810a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f62097a;

        public RunnableC14810a(int i) {
            this.f62097a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            DayPickerView.this.setSelection(this.f62097a);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DayPickerView$b */
    public class RunnableC14811b implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f62099a;

        public RunnableC14811b() {
        }

        /* JADX INFO: renamed from: a */
        public void m86291a(AbsListView absListView, int i) {
            DayPickerView.this.f62086f.removeCallbacks(this);
            this.f62099a = i;
            DayPickerView.this.f62086f.postDelayed(this, 40L);
        }

        @Override // java.lang.Runnable
        public void run() {
            DayPickerView dayPickerView;
            int i;
            DayPickerView.this.f62093m = this.f62099a;
            if (Log.isLoggable("MonthFragment", 3)) {
                int i2 = DayPickerView.this.f62092l;
            }
            int i3 = this.f62099a;
            if (i3 == 0 && (i = (dayPickerView = DayPickerView.this).f62092l) != 0) {
                if (i != 1) {
                    dayPickerView.f62092l = i3;
                    View childAt = dayPickerView.getChildAt(0);
                    int i4 = 0;
                    while (childAt != null && childAt.getBottom() <= 0) {
                        i4++;
                        childAt = DayPickerView.this.getChildAt(i4);
                    }
                    if (childAt == null) {
                        return;
                    }
                    boolean z = (DayPickerView.this.getFirstVisiblePosition() == 0 || DayPickerView.this.getLastVisiblePosition() == DayPickerView.this.getCount() - 1) ? false : true;
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int height = DayPickerView.this.getHeight() / 2;
                    if (!z || top >= DayPickerView.f62079q) {
                        return;
                    }
                    DayPickerView dayPickerView2 = DayPickerView.this;
                    if (bottom > height) {
                        dayPickerView2.smoothScrollBy(top, 250);
                        return;
                    } else {
                        dayPickerView2.smoothScrollBy(bottom, 250);
                        return;
                    }
                }
            }
            DayPickerView.this.f62092l = i3;
        }
    }

    public DayPickerView(Context context, InterfaceC14816a interfaceC14816a) {
        super(context);
        this.f62081a = 6;
        this.f62082b = false;
        this.f62083c = 7;
        this.f62084d = 1.0f;
        this.f62087g = new AbstractC14817b.a();
        this.f62089i = new AbstractC14817b.a();
        this.f62092l = 0;
        this.f62093m = 0;
        this.f62096p = new RunnableC14811b();
        m86286f(context);
        setController(interfaceC14816a);
    }

    /* JADX INFO: renamed from: c */
    private AbstractC14817b.a m86281c() {
        AbstractC14817b.a accessibilityFocus;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof MonthView) && (accessibilityFocus = ((MonthView) childAt).getAccessibilityFocus()) != null) {
                return accessibilityFocus;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static String m86282d(AbstractC14817b.a aVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(aVar.f62170b, aVar.f62171c, aVar.f62172d);
        return ("" + calendar.getDisplayName(2, 2, Locale.getDefault())).concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) + f62080r.format(calendar.getTime());
    }

    /* JADX INFO: renamed from: j */
    private boolean m86283j(AbstractC14817b.a aVar) {
        if (aVar == null) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof MonthView) && ((MonthView) childAt).m86306n(aVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14808c
    /* JADX INFO: renamed from: a */
    public void mo86279a() {
        m86285e(this.f62094n.mo86278z2(), false, true, true);
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC14817b mo86284b(Context context, InterfaceC14816a interfaceC14816a);

    /* JADX INFO: renamed from: e */
    public boolean m86285e(AbstractC14817b.a aVar, boolean z, boolean z2, boolean z3) {
        View childAt;
        if (z2) {
            this.f62087g.m86328a(aVar);
        }
        this.f62089i.m86328a(aVar);
        int iMo86260I3 = (((aVar.f62170b - this.f62094n.mo86260I3()) * 12) + aVar.f62171c) - this.f62094n.mo86264T3().get(2);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            childAt = getChildAt(i);
            if (childAt == null) {
                break;
            }
            int top = childAt.getTop();
            Log.isLoggable("MonthFragment", 3);
            if (top >= 0) {
                break;
            }
            i = i2;
        }
        int positionForView = childAt != null ? getPositionForView(childAt) : 0;
        if (z2) {
            this.f62088h.m86326f(this.f62087g);
        }
        Log.isLoggable("MonthFragment", 3);
        if (iMo86260I3 != positionForView || z3) {
            setMonthDisplayed(this.f62089i);
            this.f62092l = 2;
            if (z) {
                smoothScrollToPositionFromTop(iMo86260I3, f62079q, 250);
                return true;
            }
            m86288h(iMo86260I3);
        } else if (z2) {
            setMonthDisplayed(this.f62087g);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m86286f(Context context) {
        this.f62086f = new Handler();
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        setDrawSelectorOnTop(false);
        this.f62085e = context;
        m86290k();
    }

    /* JADX INFO: renamed from: g */
    public void m86287g() {
        m86289i();
    }

    public int getMostVisiblePosition() {
        int firstVisiblePosition = getFirstVisiblePosition();
        int height = getHeight();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < height) {
            View childAt = getChildAt(i2);
            if (childAt == null) {
                break;
            }
            int bottom = childAt.getBottom();
            int iMin = Math.min(bottom, height) - Math.max(0, childAt.getTop());
            if (iMin > i3) {
                i4 = i2;
                i3 = iMin;
            }
            i2++;
            i = bottom;
        }
        return firstVisiblePosition + i4;
    }

    /* JADX INFO: renamed from: h */
    public void m86288h(int i) {
        clearFocus();
        post(new RunnableC14810a(i));
        onScrollStateChanged(this, 0);
    }

    /* JADX INFO: renamed from: i */
    public void m86289i() {
        AbstractC14817b abstractC14817b = this.f62088h;
        if (abstractC14817b == null) {
            this.f62088h = mo86284b(getContext(), this.f62094n);
        } else {
            abstractC14817b.m86326f(this.f62087g);
        }
        setAdapter((ListAdapter) this.f62088h);
    }

    /* JADX INFO: renamed from: k */
    public void m86290k() {
        setCacheColorHint(0);
        setDivider(null);
        setItemsCanFocus(true);
        setFastScrollEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOnScrollListener(this);
        setFadingEdgeLength(0);
        setFriction(ViewConfiguration.getScrollFriction() * this.f62084d);
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        AbstractC14817b.a aVarM86281c = m86281c();
        super.layoutChildren();
        if (this.f62095o) {
            this.f62095o = false;
        } else {
            m86283j(aVarM86281c);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(-1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        MonthView monthView = (MonthView) absListView.getChildAt(0);
        if (monthView == null) {
            return;
        }
        this.f62091k = (absListView.getFirstVisiblePosition() * monthView.getHeight()) - monthView.getBottom();
        this.f62092l = this.f62093m;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.f62096p.m86291a(absListView, i);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        View childAt;
        if (i != 4096 && i != 8192) {
            return super.performAccessibilityAction(i, bundle);
        }
        int firstVisiblePosition = getFirstVisiblePosition() + this.f62094n.mo86264T3().get(2);
        AbstractC14817b.a aVar = new AbstractC14817b.a((firstVisiblePosition / 12) + this.f62094n.mo86260I3(), firstVisiblePosition % 12, 1);
        if (i == 4096) {
            int i2 = aVar.f62171c + 1;
            aVar.f62171c = i2;
            if (i2 == 12) {
                aVar.f62171c = 0;
                aVar.f62170b++;
            }
        } else if (i == 8192 && (childAt = getChildAt(0)) != null && childAt.getTop() >= -1) {
            int i3 = aVar.f62171c - 1;
            aVar.f62171c = i3;
            if (i3 == -1) {
                aVar.f62171c = 11;
                aVar.f62170b--;
            }
        }
        tnk0.m191948h(this, m86282d(aVar));
        m86285e(aVar, true, false, true);
        this.f62095o = true;
        return true;
    }

    public void setController(InterfaceC14816a interfaceC14816a) {
        this.f62094n = interfaceC14816a;
        interfaceC14816a.mo86262L1(this);
        m86289i();
        mo86279a();
    }

    public void setMonthDisplayed(AbstractC14817b.a aVar) {
        this.f62090j = aVar.f62171c;
        invalidateViews();
    }

    public DayPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62081a = 6;
        this.f62082b = false;
        this.f62083c = 7;
        this.f62084d = 1.0f;
        this.f62087g = new AbstractC14817b.a();
        this.f62089i = new AbstractC14817b.a();
        this.f62092l = 0;
        this.f62093m = 0;
        this.f62096p = new RunnableC14811b();
        m86286f(context);
    }
}
