package com.p046p1.mobile.putong.feed.newui.featured;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Locale;
import p147v.VLinear;
import p149l.o6c0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCountDownView extends VLinear {

    /* JADX INFO: renamed from: c */
    public C11193a f39939c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.featured.FeedCountDownView$a */
    public class C11193a {

        /* JADX INFO: renamed from: a */
        public long f39940a;

        /* JADX INFO: renamed from: b */
        public Runnable f39941b = new Runnable() { // from class: l.yvg
            @Override // java.lang.Runnable
            public final void run() {
                this.f200255a.m61874b();
            }
        };

        public C11193a(long j) {
            this.f39940a = j;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m61874b() {
            if (this.f39940a - System.currentTimeMillis() <= 0) {
                return;
            }
            FeedCountDownView.this.setTimeDuration(this.f39940a - System.currentTimeMillis());
            FeedCountDownView feedCountDownView = FeedCountDownView.this;
            feedCountDownView.postDelayed(feedCountDownView.f39939c.f39941b, 1000L);
        }

        /* JADX INFO: renamed from: c */
        public void m61875c() {
            FeedCountDownView.this.removeCallbacks(this.f39941b);
        }
    }

    public FeedCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m61872R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m61872R(Context context) {
        LayoutInflater.from(context).inflate(o6c0.f142230l0, (ViewGroup) this, true);
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.f39939c = new C11193a(calendar.getTimeInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeDuration(long j) {
        long j2 = j / 1000;
        String str = String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf((int) (j2 / 3600)), Integer.valueOf((int) ((j2 % 3600) / 60)), Integer.valueOf((int) (j2 % 60)));
        for (int i = 0; i < getChildCount(); i++) {
            ((TextView) getChildAt(i)).setText(String.valueOf(str.charAt(i)));
        }
    }

    public void setCountTarget(long j) {
        C11193a c11193a = this.f39939c;
        if (c11193a != null) {
            c11193a.m61875c();
        }
        this.f39939c = new C11193a(j);
    }

    public FeedCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedCountDownView(Context context) {
        this(context, null);
    }
}
