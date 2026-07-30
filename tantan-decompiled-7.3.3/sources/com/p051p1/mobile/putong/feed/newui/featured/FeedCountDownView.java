package com.p051p1.mobile.putong.feed.newui.featured;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Locale;
import p151v.VLinear;
import p153l.tec0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCountDownView extends VLinear {

    /* JADX INFO: renamed from: c */
    public C11356a f40787c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.featured.FeedCountDownView$a */
    public class C11356a {

        /* JADX INFO: renamed from: a */
        public long f40788a;

        /* JADX INFO: renamed from: b */
        public Runnable f40789b = new Runnable() { // from class: l.nxg
            @Override // java.lang.Runnable
            public final void run() {
                this.f144122a.m63057b();
            }
        };

        public C11356a(long j) {
            this.f40788a = j;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m63057b() {
            if (this.f40788a - System.currentTimeMillis() <= 0) {
                return;
            }
            FeedCountDownView.this.setTimeDuration(this.f40788a - System.currentTimeMillis());
            FeedCountDownView feedCountDownView = FeedCountDownView.this;
            feedCountDownView.postDelayed(feedCountDownView.f40787c.f40789b, 1000L);
        }

        /* JADX INFO: renamed from: c */
        public void m63058c() {
            FeedCountDownView.this.removeCallbacks(this.f40789b);
        }
    }

    public FeedCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63055R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m63055R(Context context) {
        LayoutInflater.from(context).inflate(tec0.f173699l0, (ViewGroup) this, true);
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.f40787c = new C11356a(calendar.getTimeInMillis());
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
        C11356a c11356a = this.f40787c;
        if (c11356a != null) {
            c11356a.m63058c();
        }
        this.f40787c = new C11356a(j);
    }

    public FeedCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedCountDownView(Context context) {
        this(context, null);
    }
}
