package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.g480;
import p149l.h4t;
import p149l.hfw;
import p149l.s7m;

/* JADX INFO: loaded from: classes5.dex */
public class PkWinTimesContainerView extends FrameLayout implements s7m<h4t> {

    /* JADX INFO: renamed from: a */
    public PkAnchorWinTimesView f51791a;

    /* JADX INFO: renamed from: b */
    public PkOtherWinTimesView f51792b;

    public PkWinTimesContainerView(@NonNull Context context) {
        this(context, null);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m76311a(View view) {
        g480.m124359a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m76313c(long j, long j2) {
        hfw.m130790a("PkWinTimesContainerView", "anchorWinTimes:" + j + ",otherWinTimes" + j2);
        m76314d(this.f51791a, j);
        m76314d(this.f51792b, j2);
    }

    /* JADX INFO: renamed from: d */
    public void m76314d(PkWinTimesBaseView pkWinTimesBaseView, long j) {
        if (j >= 2) {
            pkWinTimesBaseView.setWinTimes(j);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f51791a.m76299l();
        this.f51792b.m76309l();
    }

    /* JADX INFO: renamed from: e */
    public void m76315e() {
        this.f51791a.m76298k();
        this.f51792b.m76308k();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76311a(this);
    }

    public PkWinTimesContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkWinTimesContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(h4t h4tVar) {
    }
}
