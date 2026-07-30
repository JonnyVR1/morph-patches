package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.fhw;
import p153l.i6t;
import p153l.iam;
import p153l.mc80;

/* JADX INFO: loaded from: classes5.dex */
public class PkWinTimesContainerView extends FrameLayout implements iam<i6t> {

    /* JADX INFO: renamed from: a */
    public PkAnchorWinTimesView f52639a;

    /* JADX INFO: renamed from: b */
    public PkOtherWinTimesView f52640b;

    public PkWinTimesContainerView(@NonNull Context context) {
        this(context, null);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m77494a(View view) {
        mc80.m157918a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m77496c(long j, long j2) {
        fhw.m125605a("PkWinTimesContainerView", "anchorWinTimes:" + j + ",otherWinTimes" + j2);
        m77497d(this.f52639a, j);
        m77497d(this.f52640b, j2);
    }

    /* JADX INFO: renamed from: d */
    public void m77497d(PkWinTimesBaseView pkWinTimesBaseView, long j) {
        if (j >= 2) {
            pkWinTimesBaseView.setWinTimes(j);
        }
    }

    @Override // p153l.iam
    public void destroy() {
        this.f52639a.m77482l();
        this.f52640b.m77492l();
    }

    /* JADX INFO: renamed from: e */
    public void m77498e() {
        this.f52639a.m77481k();
        this.f52640b.m77491k();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77494a(this);
    }

    public PkWinTimesContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkWinTimesContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(i6t i6tVar) {
    }
}
