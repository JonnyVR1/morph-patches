package tech.sud.runtime.component.p142a;

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
class C22519b extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private ArrayDeque<C22520c> f208469a;

    /* JADX INFO: renamed from: b */
    private long f208470b;

    public C22519b(Context context, int i) {
        super(context);
        this.f208469a = new ArrayDeque<>();
        this.f208470b = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
        if (i > 0) {
            this.f208470b = i * 1000;
        }
        setOrientation(1);
    }

    /* JADX INFO: renamed from: b */
    private int m222847b() {
        Context context = getContext();
        if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") == 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m222849c() {
        int childCount = getChildCount();
        if (childCount <= 1 || getChildAt(childCount - 1).getBottom() <= getContext().getResources().getDisplayMetrics().heightPixels - m222847b()) {
            return;
        }
        removeViewAt(0);
        post(new Runnable() { // from class: tech.sud.runtime.component.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                C22519b.this.m222849c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m222850d() {
        ArrayDeque arrayDeque = new ArrayDeque();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Long l2 = (Long) childAt.getTag();
            if (l2 != null && jCurrentTimeMillis - l2.longValue() >= this.f208470b) {
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
    public void m222851a() {
        if (this.f208469a.isEmpty()) {
            return;
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        for (C22520c c22520c : this.f208469a) {
            TextView textViewM222845a = m222845a(c22520c.m222853a());
            textViewM222845a.setTag(lValueOf);
            textViewM222845a.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            textViewM222845a.setAlpha(0.5f);
            addView(textViewM222845a);
            int iM222854b = c22520c.m222854b();
            if (iM222854b == 1) {
                textViewM222845a.setTextColor(-256);
            } else if (iM222854b == 2) {
                textViewM222845a.setTextColor(-65536);
            }
        }
        this.f208469a.clear();
        post(new Runnable() { // from class: tech.sud.runtime.component.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                C22519b.this.m222849c();
            }
        });
        if (this.f208470b > 0) {
            postDelayed(new Runnable() { // from class: tech.sud.runtime.component.a.b.2
                @Override // java.lang.Runnable
                public void run() {
                    C22519b.this.m222850d();
                }
            }, this.f208470b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m222852a(int i, String str) {
        if (str != null) {
            this.f208469a.addLast(new C22520c(i, str));
        }
    }

    /* JADX INFO: renamed from: a */
    private TextView m222845a(String str) {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setBackgroundColor(-65536);
        textView.getBackground().setAlpha(C22518a.f208459a);
        textView.setText(str);
        textView.setTextSize(0, C22518a.f208460b);
        textView.setGravity(16);
        textView.setPadding(5, 0, 0, 0);
        return textView;
    }
}
