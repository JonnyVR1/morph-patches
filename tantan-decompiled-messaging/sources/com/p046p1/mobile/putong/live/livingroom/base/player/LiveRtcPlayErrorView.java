package com.p046p1.mobile.putong.live.livingroom.base.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p147v.VLinear;
import p147v.VText;
import p149l.oht;
import p149l.s7m;
import p149l.uep0;
import p149l.ufd0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRtcPlayErrorView extends LinearLayout implements s7m<ufd0> {

    /* JADX INFO: renamed from: a */
    public VLinear f47860a;

    /* JADX INFO: renamed from: b */
    public VText f47861b;

    /* JADX INFO: renamed from: c */
    public View f47862c;

    /* JADX INFO: renamed from: d */
    public VText f47863d;

    /* JADX INFO: renamed from: e */
    public ufd0 f47864e;

    public LiveRtcPlayErrorView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m71936e(View view) {
        m71939d();
        this.f47864e.m193378L3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m71937b(View view) {
        oht.m164461a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ufd0 ufd0Var) {
        this.f47864e = ufd0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m71939d() {
        xdl0.m208344M(this, false);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m71940f(String str) {
        setBackgroundColor(0);
        uep0.m193306A(new View.OnClickListener() { // from class: l.nht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139032a.m71936e(view);
            }
        }, this.f47863d);
        this.f47861b.setText(str);
        xdl0.m208344M(this, true);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71937b(this);
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
