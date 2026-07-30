package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VImage;
import p153l.bnl0;
import p153l.obc0;
import p153l.oc80;

/* JADX INFO: loaded from: classes5.dex */
public class PkWinTimesResultView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f52654a;

    /* JADX INFO: renamed from: b */
    public PkWinTimesNumView f52655b;

    /* JADX INFO: renamed from: c */
    public VImage f52656c;

    /* JADX INFO: renamed from: d */
    public VImage f52657d;

    public PkWinTimesResultView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m77502a(View view) {
        oc80.m167141a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m77503b(long j) {
        m77506e();
        if (j == -1) {
            this.f52657d.setImageResource(obc0.f146237X4);
            bnl0.m105524M(this.f52657d, true);
            bnl0.m105524M(this.f52654a, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m77504c(long j) {
        m77506e();
        if (j == -1) {
            this.f52657d.setImageResource(obc0.f146115M5);
            bnl0.m105524M(this.f52657d, true);
            bnl0.m105524M(this.f52654a, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m77505d(long j) {
        m77506e();
        if (j >= 2) {
            this.f52655b.m77501c(false);
            this.f52655b.setNumber(j);
            this.f52656c.setImageResource(obc0.f146055H5);
            bnl0.m105524M(this.f52654a, true);
            bnl0.m105524M(this.f52657d, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m77506e() {
        bnl0.m105524M(this.f52657d, false);
        bnl0.m105524M(this.f52654a, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77502a(this);
    }

    public PkWinTimesResultView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkWinTimesResultView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
