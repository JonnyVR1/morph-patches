package com.p000p1.mobile.putong.live.livingroom.base.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import l.s7m;
import l.uep0;
import l.xdl0;
import p002l.oht;
import p002l.ufd0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveRtcPlayErrorView extends LinearLayout implements s7m<ufd0> {

    /* JADX INFO: renamed from: a */
    public VLinear f3902a;

    /* JADX INFO: renamed from: b */
    public VText f3903b;

    /* JADX INFO: renamed from: c */
    public View f3904c;

    /* JADX INFO: renamed from: d */
    public VText f3905d;

    /* JADX INFO: renamed from: e */
    public ufd0 f3906e;

    public LiveRtcPlayErrorView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m5319e(View view) {
        m5323d();
        this.f3906e.m23442L3();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5320C0() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m5321b(View view) {
        oht.m19544a(this, view);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m5325i1(ufd0 ufd0Var) {
        this.f3906e = ufd0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m5323d() {
        xdl0.M(this, false);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m5324f(String str) {
        setBackgroundColor(0);
        uep0.A(new View.OnClickListener() { // from class: l.nht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16041a.m5319e(view);
            }
        }, new View[]{this.f3905d});
        this.f3903b.setText(str);
        xdl0.M(this, true);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5321b(this);
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
