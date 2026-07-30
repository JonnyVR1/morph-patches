package tech.sud.runtime.component.p138a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.ArrayDeque;
import java.util.Iterator;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: tech.sud.runtime.component.a.b */
/* JADX INFO: loaded from: classes3.dex */
class C22404b extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private ArrayDeque<C22405c> f207547a;

    /* JADX INFO: renamed from: b */
    private long f207548b;

    public C22404b(Context context, int i) {
        super(context);
        this.f207547a = new ArrayDeque<>();
        this.f207548b = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
        if (i > 0) {
            this.f207548b = i * 1000;
        }
        setOrientation(1);
    }

    /* JADX INFO: renamed from: b */
    private int m221601b() {
        Context context = getContext();
        if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") == 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m221603c() {
        int childCount = getChildCount();
        if (childCount <= 1 || getChildAt(childCount - 1).getBottom() <= getContext().getResources().getDisplayMetrics().heightPixels - m221601b()) {
            return;
        }
        removeViewAt(0);
        post(new Runnable() { // from class: tech.sud.runtime.component.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                C22404b.this.m221603c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m221604d() {
        ArrayDeque arrayDeque = new ArrayDeque();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Long l2 = (Long) childAt.getTag();
            if (l2 != null && jCurrentTimeMillis - l2.longValue() >= this.f207548b) {
                arrayDeque.addLast(childAt);
            }
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m221605a() {
        if (this.f207547a.isEmpty()) {
            return;
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        for (C22405c c22405c : this.f207547a) {
            TextView textViewM221599a = m221599a(c22405c.m221607a());
            textViewM221599a.setTag(lValueOf);
            textViewM221599a.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            textViewM221599a.setAlpha(0.5f);
            addView(textViewM221599a);
            int iM221608b = c22405c.m221608b();
            if (iM221608b == 1) {
                textViewM221599a.setTextColor(-256);
            } else if (iM221608b == 2) {
                textViewM221599a.setTextColor(-65536);
            }
        }
        this.f207547a.clear();
        post(new Runnable() { // from class: tech.sud.runtime.component.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                C22404b.this.m221603c();
            }
        });
        if (this.f207548b > 0) {
            postDelayed(new Runnable() { // from class: tech.sud.runtime.component.a.b.2
                @Override // java.lang.Runnable
                public void run() {
                    C22404b.this.m221604d();
                }
            }, this.f207548b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221606a(int i, String str) {
        if (str != null) {
            this.f207547a.addLast(new C22405c(i, str));
        }
    }

    /* JADX INFO: renamed from: a */
    private TextView m221599a(String str) {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setBackgroundColor(-65536);
        textView.getBackground().setAlpha(C22403a.f207537a);
        textView.setText(str);
        textView.setTextSize(0, C22403a.f207538b);
        textView.setGravity(16);
        textView.setPadding(5, 0, 0, 0);
        return textView;
    }
}
