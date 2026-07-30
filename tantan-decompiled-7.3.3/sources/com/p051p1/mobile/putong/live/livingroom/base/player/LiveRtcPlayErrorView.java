package com.p051p1.mobile.putong.live.livingroom.base.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.iam;
import p153l.pjt;
import p153l.xnd0;
import p153l.ynp0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRtcPlayErrorView extends LinearLayout implements iam<xnd0> {

    /* JADX INFO: renamed from: a */
    public VLinear f48708a;

    /* JADX INFO: renamed from: b */
    public VText f48709b;

    /* JADX INFO: renamed from: c */
    public View f48710c;

    /* JADX INFO: renamed from: d */
    public VText f48711d;

    /* JADX INFO: renamed from: e */
    public xnd0 f48712e;

    public LiveRtcPlayErrorView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m73119e(View view) {
        m73122d();
        this.f48712e.m212144L3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m73120b(View view) {
        pjt.m172522a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xnd0 xnd0Var) {
        this.f48712e = xnd0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m73122d() {
        bnl0.m105524M(this, false);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m73123f(String str) {
        setBackgroundColor(0);
        ynp0.m216916A(new View.OnClickListener() { // from class: l.ojt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147714a.m73119e(view);
            }
        }, this.f48711d);
        this.f48709b.setText(str);
        bnl0.m105524M(this, true);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73120b(this);
    }

    public LiveRtcPlayErrorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRtcPlayErrorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LiveRtcPlayErrorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
