package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VOnlineIndicator;
import p149l.ldl;
import p149l.q0m;
import p149l.s7m;
import p149l.t100;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeTitleMenuLayout extends VLinear implements s7m {

    /* JADX INFO: renamed from: c */
    public ViewStub f23951c;

    /* JADX INFO: renamed from: d */
    public VFrame f23952d;

    /* JADX INFO: renamed from: e */
    public BoostViewContainer f23953e;

    /* JADX INFO: renamed from: f */
    public VIcon f23954f;

    /* JADX INFO: renamed from: g */
    public VFrame f23955g;

    /* JADX INFO: renamed from: h */
    public VIcon f23956h;

    /* JADX INFO: renamed from: i */
    public VFrame f23957i;

    /* JADX INFO: renamed from: j */
    public VImage f23958j;

    /* JADX INFO: renamed from: k */
    public VOnlineIndicator f23959k;

    public HomeTitleMenuLayout(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m39173P(View view) {
        ldl.m149445a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39173P(this);
        if (upa.m194847z()) {
            xdl0.m208346N(this.f23956h, x2c0.f189746Ss);
            xdl0.m208346N(this.f23958j, x2c0.f189715Rs);
            xdl0.m208346N(this.f23954f, x2c0.f189384H7);
            xdl0.m208327D0(t100.m186890d(32.0f), this.f23952d);
            xdl0.m208325C0(this.f23952d, t100.m186890d(32.0f));
            xdl0.m208327D0(t100.m186890d(32.0f), this.f23956h);
            xdl0.m208325C0(this.f23956h, t100.m186890d(32.0f));
            xdl0.m208327D0(t100.m186890d(32.0f), this.f23958j);
            xdl0.m208325C0(this.f23958j, t100.m186890d(32.0f));
            xdl0.m208327D0(t100.m186890d(32.0f), this.f23954f);
            xdl0.m208325C0(this.f23954f, t100.m186890d(32.0f));
        }
    }

    public HomeTitleMenuLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeTitleMenuLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(q0m q0mVar) {
    }
}
