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
import p149l.f2c0;
import p149l.ig3;
import p149l.x6c0;

/* JADX INFO: loaded from: classes2.dex */
public class YearPickerView extends ListView implements AdapterView.OnItemClickListener, DatePickerDialog.InterfaceC14660c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC14668a f61308a;

    /* JADX INFO: renamed from: b */
    private C14667b f61309b;

    /* JADX INFO: renamed from: c */
    private int f61310c;

    /* JADX INFO: renamed from: d */
    private int f61311d;

    /* JADX INFO: renamed from: e */
    private TextViewWithCircularIndicator f61312e;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.YearPickerView$a */
    public class RunnableC14666a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f61313a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f61314b;

        public RunnableC14666a(int i, int i2) {
            this.f61313a = i;
            this.f61314b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            YearPickerView.this.setSelectionFromTop(this.f61313a, this.f61314b);
            YearPickerView.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.YearPickerView$b */
    public final class C14667b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        private final int f61316a;

        /* JADX INFO: renamed from: b */
        private final int f61317b;

        public C14667b(int i, int i2) {
            if (i > i2) {
                ig3.m135964a("minYear > maxYear");
                throw null;
            }
            this.f61316a = i;
            this.f61317b = i2;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return (this.f61317b - this.f61316a) + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return Integer.valueOf(this.f61316a + i);
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
                textViewWithCircularIndicator = (TextViewWithCircularIndicator) LayoutInflater.from(viewGroup.getContext()).inflate(x6c0.f191232e, viewGroup, false);
                textViewWithCircularIndicator.m85144d(YearPickerView.this.f61308a.mo85104u(), YearPickerView.this.f61308a.mo85106z());
            }
            int i2 = this.f61316a + i;
            boolean z = YearPickerView.this.f61308a.mo85107z2().f61323b == i2;
            textViewWithCircularIndicator.setText(String.valueOf(i2));
            textViewWithCircularIndicator.m85143b(z);
            textViewWithCircularIndicator.requestLayout();
            if (z) {
                YearPickerView.this.f61312e = textViewWithCircularIndicator;
            }
            return textViewWithCircularIndicator;
        }
    }

    public YearPickerView(Context context, InterfaceC14668a interfaceC14668a) {
        super(context);
        this.f61308a = interfaceC14668a;
        interfaceC14668a.mo85091L1(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Resources resources = context.getResources();
        this.f61310c = resources.getDimensionPixelOffset(f2c0.f94163a);
        this.f61311d = resources.getDimensionPixelOffset(f2c0.f94170h);
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(this.f61311d / 3);
        m85148e();
        setOnItemClickListener(this);
        setSelector(new StateListDrawable());
        setDividerHeight(0);
        mo85108a();
    }

    /* JADX INFO: renamed from: d */
    private static int m85147d(TextView textView) {
        return Integer.valueOf(textView.getText().toString()).intValue();
    }

    /* JADX INFO: renamed from: e */
    private void m85148e() {
        C14667b c14667b = new C14667b(this.f61308a.mo85089I3(), this.f61308a.mo85099k1());
        this.f61309b = c14667b;
        setAdapter((ListAdapter) c14667b);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14660c
    /* JADX INFO: renamed from: a */
    public void mo85108a() {
        this.f61309b.notifyDataSetChanged();
        m85149f(this.f61308a.mo85107z2().f61323b - this.f61308a.mo85089I3());
    }

    /* JADX INFO: renamed from: f */
    public void m85149f(int i) {
        m85150g(i, (this.f61310c / 2) - (this.f61311d / 2));
    }

    /* JADX INFO: renamed from: g */
    public void m85150g(int i, int i2) {
        post(new RunnableC14666a(i, i2));
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
        this.f61308a.mo85105w();
        TextViewWithCircularIndicator textViewWithCircularIndicator = (TextViewWithCircularIndicator) view;
        if (textViewWithCircularIndicator != null) {
            TextViewWithCircularIndicator textViewWithCircularIndicator2 = this.f61312e;
            if (textViewWithCircularIndicator != textViewWithCircularIndicator2) {
                if (textViewWithCircularIndicator2 != null) {
                    textViewWithCircularIndicator2.m85143b(false);
                    this.f61312e.requestLayout();
                }
                textViewWithCircularIndicator.m85143b(true);
                textViewWithCircularIndicator.requestLayout();
                this.f61312e = textViewWithCircularIndicator;
            }
            this.f61308a.mo85088D3(m85147d(textViewWithCircularIndicator));
            this.f61309b.notifyDataSetChanged();
        }
    }
}
