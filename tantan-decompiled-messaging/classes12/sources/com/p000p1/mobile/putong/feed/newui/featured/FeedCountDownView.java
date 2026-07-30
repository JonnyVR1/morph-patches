package com.p000p1.mobile.putong.feed.newui.featured;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Locale;
import p007l.o6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCountDownView extends VLinear {

    /* JADX INFO: renamed from: c */
    public C2037a f1400c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.featured.FeedCountDownView$a */
    public class C2037a {

        /* JADX INFO: renamed from: a */
        public long f1401a;

        /* JADX INFO: renamed from: b */
        public Runnable f1402b = new Runnable() { // from class: l.yvg
            @Override // java.lang.Runnable
            public final void run() {
                this.f15511a.m2841b();
            }
        };

        public C2037a(long j) {
            this.f1401a = j;
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.featured.FeedCountDownView] */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m2841b() {
            if (this.f1401a - System.currentTimeMillis() <= 0) {
                return;
            }
            FeedCountDownView.this.setTimeDuration(this.f1401a - System.currentTimeMillis());
            ?? r5 = FeedCountDownView.this;
            r5.postDelayed(r5.f1400c.f1402b, 1000L);
        }

        /* JADX INFO: renamed from: c */
        public void m2842c() {
            FeedCountDownView.this.removeCallbacks(this.f1402b);
        }
    }

    public FeedCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2839R(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    private void m2839R(Context context) {
        LayoutInflater.from(context).inflate(o6c0.f11249l0, (ViewGroup) this, true);
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.f1400c = new C2037a(calendar.getTimeInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setTimeDuration(long j) {
        long j2 = j / 1000;
        String str = String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf((int) (j2 / 3600)), Integer.valueOf((int) ((j2 % 3600) / 60)), Integer.valueOf((int) (j2 % 60)));
        for (int i = 0; i < getChildCount(); i++) {
            ((TextView) getChildAt(i)).setText(String.valueOf(str.charAt(i)));
        }
    }

    public void setCountTarget(long j) {
        C2037a c2037a = this.f1400c;
        if (c2037a != null) {
            c2037a.m2842c();
        }
        this.f1400c = new C2037a(j);
    }

    public FeedCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedCountDownView(Context context) {
        this(context, null);
    }
}
