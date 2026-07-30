package tech.sud.runtime.component.p019a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayDeque;
import java.util.Iterator;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: tech.sud.runtime.component.a.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class C1197b extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private ArrayDeque<C1198c> f11172a;

    /* JADX INFO: renamed from: b */
    private long f11173b;

    public C1197b(Context context, int i) {
        super(context);
        this.f11172a = new ArrayDeque<>();
        this.f11173b = 30000L;
        if (i > 0) {
            this.f11173b = i * 1000;
        }
        setOrientation(1);
    }

    /* JADX INFO: renamed from: b */
    private int m10072b() {
        Context context = getContext();
        if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") == 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m10074c() {
        int childCount = getChildCount();
        if (childCount <= 1 || getChildAt(childCount - 1).getBottom() <= getContext().getResources().getDisplayMetrics().heightPixels - m10072b()) {
            return;
        }
        removeViewAt(0);
        post(new Runnable() { // from class: tech.sud.runtime.component.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                C1197b.this.m10074c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m10075d() {
        ArrayDeque arrayDeque = new ArrayDeque();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Long l2 = (Long) childAt.getTag();
            if (l2 != null && jCurrentTimeMillis - l2.longValue() >= this.f11173b) {
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
    public void m10076a() {
        if (this.f11172a.isEmpty()) {
            return;
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        for (C1198c c1198c : this.f11172a) {
            TextView textViewM10070a = m10070a(c1198c.m10078a());
            textViewM10070a.setTag(lValueOf);
            textViewM10070a.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            textViewM10070a.setAlpha(0.5f);
            addView(textViewM10070a);
            int iM10079b = c1198c.m10079b();
            if (iM10079b == 1) {
                textViewM10070a.setTextColor(-256);
            } else if (iM10079b == 2) {
                textViewM10070a.setTextColor(-65536);
            }
        }
        this.f11172a.clear();
        post(new Runnable() { // from class: tech.sud.runtime.component.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                C1197b.this.m10074c();
            }
        });
        if (this.f11173b > 0) {
            postDelayed(new Runnable() { // from class: tech.sud.runtime.component.a.b.2
                @Override // java.lang.Runnable
                public void run() {
                    C1197b.this.m10075d();
                }
            }, this.f11173b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10077a(int i, String str) {
        if (str != null) {
            this.f11172a.addLast(new C1198c(i, str));
        }
    }

    /* JADX INFO: renamed from: a */
    private TextView m10070a(String str) {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setBackgroundColor(-65536);
        textView.getBackground().setAlpha(C1196a.f11162a);
        textView.setText(str);
        textView.setTextSize(0, C1196a.f11163b);
        textView.setGravity(16);
        textView.setPadding(5, 0, 0, 0);
        return textView;
    }
}
