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
import p149l.nek0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DayPickerView extends ListView implements AbsListView.OnScrollListener, DatePickerDialog.InterfaceC14660c {

    /* JADX INFO: renamed from: q */
    public static int f61232q = -1;

    /* JADX INFO: renamed from: r */
    private static SimpleDateFormat f61233r = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: a */
    protected int f61234a;

    /* JADX INFO: renamed from: b */
    protected boolean f61235b;

    /* JADX INFO: renamed from: c */
    protected int f61236c;

    /* JADX INFO: renamed from: d */
    protected float f61237d;

    /* JADX INFO: renamed from: e */
    protected Context f61238e;

    /* JADX INFO: renamed from: f */
    protected Handler f61239f;

    /* JADX INFO: renamed from: g */
    protected AbstractC14669b.a f61240g;

    /* JADX INFO: renamed from: h */
    protected AbstractC14669b f61241h;

    /* JADX INFO: renamed from: i */
    protected AbstractC14669b.a f61242i;

    /* JADX INFO: renamed from: j */
    protected int f61243j;

    /* JADX INFO: renamed from: k */
    protected long f61244k;

    /* JADX INFO: renamed from: l */
    protected int f61245l;

    /* JADX INFO: renamed from: m */
    protected int f61246m;

    /* JADX INFO: renamed from: n */
    private InterfaceC14668a f61247n;

    /* JADX INFO: renamed from: o */
    private boolean f61248o;

    /* JADX INFO: renamed from: p */
    protected RunnableC14663b f61249p;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DayPickerView$a */
    public class RunnableC14662a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f61250a;

        public RunnableC14662a(int i) {
            this.f61250a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            DayPickerView.this.setSelection(this.f61250a);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DayPickerView$b */
    public class RunnableC14663b implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f61252a;

        public RunnableC14663b() {
        }

        /* JADX INFO: renamed from: a */
        public void m85120a(AbsListView absListView, int i) {
            DayPickerView.this.f61239f.removeCallbacks(this);
            this.f61252a = i;
            DayPickerView.this.f61239f.postDelayed(this, 40L);
        }

        @Override // java.lang.Runnable
        public void run() {
            DayPickerView dayPickerView;
            int i;
            DayPickerView.this.f61246m = this.f61252a;
            if (Log.isLoggable("MonthFragment", 3)) {
                int i2 = DayPickerView.this.f61245l;
            }
            int i3 = this.f61252a;
            if (i3 == 0 && (i = (dayPickerView = DayPickerView.this).f61245l) != 0) {
                if (i != 1) {
                    dayPickerView.f61245l = i3;
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
                    if (!z || top >= DayPickerView.f61232q) {
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
            DayPickerView.this.f61245l = i3;
        }
    }

    public DayPickerView(Context context, InterfaceC14668a interfaceC14668a) {
        super(context);
        this.f61234a = 6;
        this.f61235b = false;
        this.f61236c = 7;
        this.f61237d = 1.0f;
        this.f61240g = new AbstractC14669b.a();
        this.f61242i = new AbstractC14669b.a();
        this.f61245l = 0;
        this.f61246m = 0;
        this.f61249p = new RunnableC14663b();
        m85115f(context);
        setController(interfaceC14668a);
    }

    /* JADX INFO: renamed from: c */
    private AbstractC14669b.a m85110c() {
        AbstractC14669b.a accessibilityFocus;
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
    private static String m85111d(AbstractC14669b.a aVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(aVar.f61323b, aVar.f61324c, aVar.f61325d);
        return ("" + calendar.getDisplayName(2, 2, Locale.getDefault())).concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) + f61233r.format(calendar.getTime());
    }

    /* JADX INFO: renamed from: j */
    private boolean m85112j(AbstractC14669b.a aVar) {
        if (aVar == null) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof MonthView) && ((MonthView) childAt).m85135n(aVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14660c
    /* JADX INFO: renamed from: a */
    public void mo85108a() {
        m85114e(this.f61247n.mo85107z2(), false, true, true);
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC14669b mo85113b(Context context, InterfaceC14668a interfaceC14668a);

    /* JADX INFO: renamed from: e */
    public boolean m85114e(AbstractC14669b.a aVar, boolean z, boolean z2, boolean z3) {
        View childAt;
        if (z2) {
            this.f61240g.m85157a(aVar);
        }
        this.f61242i.m85157a(aVar);
        int iMo85089I3 = (((aVar.f61323b - this.f61247n.mo85089I3()) * 12) + aVar.f61324c) - this.f61247n.mo85093T3().get(2);
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
            this.f61241h.m85155f(this.f61240g);
        }
        Log.isLoggable("MonthFragment", 3);
        if (iMo85089I3 != positionForView || z3) {
            setMonthDisplayed(this.f61242i);
            this.f61245l = 2;
            if (z) {
                smoothScrollToPositionFromTop(iMo85089I3, f61232q, 250);
                return true;
            }
            m85117h(iMo85089I3);
        } else if (z2) {
            setMonthDisplayed(this.f61240g);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m85115f(Context context) {
        this.f61239f = new Handler();
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        setDrawSelectorOnTop(false);
        this.f61238e = context;
        m85119k();
    }

    /* JADX INFO: renamed from: g */
    public void m85116g() {
        m85118i();
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
    public void m85117h(int i) {
        clearFocus();
        post(new RunnableC14662a(i));
        onScrollStateChanged(this, 0);
    }

    /* JADX INFO: renamed from: i */
    public void m85118i() {
        AbstractC14669b abstractC14669b = this.f61241h;
        if (abstractC14669b == null) {
            this.f61241h = mo85113b(getContext(), this.f61247n);
        } else {
            abstractC14669b.m85155f(this.f61240g);
        }
        setAdapter((ListAdapter) this.f61241h);
    }

    /* JADX INFO: renamed from: k */
    public void m85119k() {
        setCacheColorHint(0);
        setDivider(null);
        setItemsCanFocus(true);
        setFastScrollEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOnScrollListener(this);
        setFadingEdgeLength(0);
        setFriction(ViewConfiguration.getScrollFriction() * this.f61237d);
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        AbstractC14669b.a aVarM85110c = m85110c();
        super.layoutChildren();
        if (this.f61248o) {
            this.f61248o = false;
        } else {
            m85112j(aVarM85110c);
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
        this.f61244k = (absListView.getFirstVisiblePosition() * monthView.getHeight()) - monthView.getBottom();
        this.f61245l = this.f61246m;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.f61249p.m85120a(absListView, i);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        View childAt;
        if (i != 4096 && i != 8192) {
            return super.performAccessibilityAction(i, bundle);
        }
        int firstVisiblePosition = getFirstVisiblePosition() + this.f61247n.mo85093T3().get(2);
        AbstractC14669b.a aVar = new AbstractC14669b.a((firstVisiblePosition / 12) + this.f61247n.mo85089I3(), firstVisiblePosition % 12, 1);
        if (i == 4096) {
            int i2 = aVar.f61324c + 1;
            aVar.f61324c = i2;
            if (i2 == 12) {
                aVar.f61324c = 0;
                aVar.f61323b++;
            }
        } else if (i == 8192 && (childAt = getChildAt(0)) != null && childAt.getTop() >= -1) {
            int i3 = aVar.f61324c - 1;
            aVar.f61324c = i3;
            if (i3 == -1) {
                aVar.f61324c = 11;
                aVar.f61323b--;
            }
        }
        nek0.m159118h(this, m85111d(aVar));
        m85114e(aVar, true, false, true);
        this.f61248o = true;
        return true;
    }

    public void setController(InterfaceC14668a interfaceC14668a) {
        this.f61247n = interfaceC14668a;
        interfaceC14668a.mo85091L1(this);
        m85118i();
        mo85108a();
    }

    public void setMonthDisplayed(AbstractC14669b.a aVar) {
        this.f61243j = aVar.f61324c;
        invalidateViews();
    }

    public DayPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61234a = 6;
        this.f61235b = false;
        this.f61236c = 7;
        this.f61237d = 1.0f;
        this.f61240g = new AbstractC14669b.a();
        this.f61242i = new AbstractC14669b.a();
        this.f61245l = 0;
        this.f61246m = 0;
        this.f61249p = new RunnableC14663b();
        m85115f(context);
    }
}
