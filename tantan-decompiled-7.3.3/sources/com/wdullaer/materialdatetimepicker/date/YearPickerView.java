package com.wdullaer.materialdatetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import p153l.cfc0;
import p153l.mac0;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class YearPickerView extends ListView implements AdapterView.OnItemClickListener, DatePickerDialog.InterfaceC14808c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC14816a f62155a;

    /* JADX INFO: renamed from: b */
    private C14815b f62156b;

    /* JADX INFO: renamed from: c */
    private int f62157c;

    /* JADX INFO: renamed from: d */
    private int f62158d;

    /* JADX INFO: renamed from: e */
    private TextViewWithCircularIndicator f62159e;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.YearPickerView$a */
    public class RunnableC14814a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f62160a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f62161b;

        public RunnableC14814a(int i, int i2) {
            this.f62160a = i;
            this.f62161b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            YearPickerView.this.setSelectionFromTop(this.f62160a, this.f62161b);
            YearPickerView.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.YearPickerView$b */
    public final class C14815b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        private final int f62163a;

        /* JADX INFO: renamed from: b */
        private final int f62164b;

        public C14815b(int i, int i2) {
            if (i > i2) {
                wg3.m206174a("minYear > maxYear");
                throw null;
            }
            this.f62163a = i;
            this.f62164b = i2;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return (this.f62164b - this.f62163a) + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return Integer.valueOf(this.f62163a + i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextViewWithCircularIndicator textViewWithCircularIndicator;
            if (view != null) {
                textViewWithCircularIndicator = (TextViewWithCircularIndicator) view;
            } else {
                textViewWithCircularIndicator = (TextViewWithCircularIndicator) LayoutInflater.from(viewGroup.getContext()).inflate(cfc0.f81504e, viewGroup, false);
                textViewWithCircularIndicator.m86315d(YearPickerView.this.f62155a.mo86275u(), YearPickerView.this.f62155a.mo86277z());
            }
            int i2 = this.f62163a + i;
            boolean z = YearPickerView.this.f62155a.mo86278z2().f62170b == i2;
            textViewWithCircularIndicator.setText(String.valueOf(i2));
            textViewWithCircularIndicator.m86314b(z);
            textViewWithCircularIndicator.requestLayout();
            if (z) {
                YearPickerView.this.f62159e = textViewWithCircularIndicator;
            }
            return textViewWithCircularIndicator;
        }
    }

    public YearPickerView(Context context, InterfaceC14816a interfaceC14816a) {
        super(context);
        this.f62155a = interfaceC14816a;
        interfaceC14816a.mo86262L1(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Resources resources = context.getResources();
        this.f62157c = resources.getDimensionPixelOffset(mac0.f135500a);
        this.f62158d = resources.getDimensionPixelOffset(mac0.f135507h);
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(this.f62158d / 3);
        m86319e();
        setOnItemClickListener(this);
        setSelector(new StateListDrawable());
        setDividerHeight(0);
        mo86279a();
    }

    /* JADX INFO: renamed from: d */
    private static int m86318d(TextView textView) {
        return Integer.valueOf(textView.getText().toString()).intValue();
    }

    /* JADX INFO: renamed from: e */
    private void m86319e() {
        C14815b c14815b = new C14815b(this.f62155a.mo86260I3(), this.f62155a.mo86270k1());
        this.f62156b = c14815b;
        setAdapter((ListAdapter) c14815b);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14808c
    /* JADX INFO: renamed from: a */
    public void mo86279a() {
        this.f62156b.notifyDataSetChanged();
        m86320f(this.f62155a.mo86278z2().f62170b - this.f62155a.mo86260I3());
    }

    /* JADX INFO: renamed from: f */
    public void m86320f(int i) {
        m86321g(i, (this.f62157c / 2) - (this.f62158d / 2));
    }

    /* JADX INFO: renamed from: g */
    public void m86321g(int i, int i2) {
        post(new RunnableC14814a(i, i2));
    }

    public int getFirstPositionOffset() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return childAt.getTop();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4096) {
            accessibilityEvent.setFromIndex(0);
            accessibilityEvent.setToIndex(0);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f62155a.mo86276w();
        TextViewWithCircularIndicator textViewWithCircularIndicator = (TextViewWithCircularIndicator) view;
        if (textViewWithCircularIndicator != null) {
            TextViewWithCircularIndicator textViewWithCircularIndicator2 = this.f62159e;
            if (textViewWithCircularIndicator != textViewWithCircularIndicator2) {
                if (textViewWithCircularIndicator2 != null) {
                    textViewWithCircularIndicator2.m86314b(false);
                    this.f62159e.requestLayout();
                }
                textViewWithCircularIndicator.m86314b(true);
                textViewWithCircularIndicator.requestLayout();
                this.f62159e = textViewWithCircularIndicator;
            }
            this.f62155a.mo86259D3(m86318d(textViewWithCircularIndicator));
            this.f62156b.notifyDataSetChanged();
        }
    }
}
