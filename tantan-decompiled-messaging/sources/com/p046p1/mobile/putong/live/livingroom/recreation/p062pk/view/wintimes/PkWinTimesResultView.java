package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;
import p149l.i3c0;
import p149l.i480;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkWinTimesResultView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f51806a;

    /* JADX INFO: renamed from: b */
    public PkWinTimesNumView f51807b;

    /* JADX INFO: renamed from: c */
    public VImage f51808c;

    /* JADX INFO: renamed from: d */
    public VImage f51809d;

    public PkWinTimesResultView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m76319a(View view) {
        i480.m134322a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m76320b(long j) {
        m76323e();
        if (j == -1) {
            this.f51809d.setImageResource(i3c0.f110909X4);
            xdl0.m208344M(this.f51809d, true);
            xdl0.m208344M(this.f51806a, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m76321c(long j) {
        m76323e();
        if (j == -1) {
            this.f51809d.setImageResource(i3c0.f110787M5);
            xdl0.m208344M(this.f51809d, true);
            xdl0.m208344M(this.f51806a, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m76322d(long j) {
        m76323e();
        if (j >= 2) {
            this.f51807b.m76318c(false);
            this.f51807b.setNumber(j);
            this.f51808c.setImageResource(i3c0.f110727H5);
            xdl0.m208344M(this.f51806a, true);
            xdl0.m208344M(this.f51809d, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m76323e() {
        xdl0.m208344M(this.f51809d, false);
        xdl0.m208344M(this.f51806a, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76319a(this);
    }

    public PkWinTimesResultView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkWinTimesResultView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
