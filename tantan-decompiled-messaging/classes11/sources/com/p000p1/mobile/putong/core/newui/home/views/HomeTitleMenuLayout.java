package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import l.ldl;
import l.q0m;
import l.s7m;
import l.t100;
import l.upa;
import l.x2c0;
import l.xdl0;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VOnlineIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeTitleMenuLayout extends VLinear implements s7m {

    /* JADX INFO: renamed from: c */
    public ViewStub f2729c;

    /* JADX INFO: renamed from: d */
    public VFrame f2730d;

    /* JADX INFO: renamed from: e */
    public BoostViewContainer f2731e;

    /* JADX INFO: renamed from: f */
    public VIcon f2732f;

    /* JADX INFO: renamed from: g */
    public VFrame f2733g;

    /* JADX INFO: renamed from: h */
    public VIcon f2734h;

    /* JADX INFO: renamed from: i */
    public VFrame f2735i;

    /* JADX INFO: renamed from: j */
    public VImage f2736j;

    /* JADX INFO: renamed from: k */
    public VOnlineIndicator f2737k;

    public HomeTitleMenuLayout(@NonNull Context context) {
        super(context);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3189C0() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m3190P(View view) {
        ldl.a(this, view);
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3190P(this);
        if (upa.z()) {
            xdl0.N(this.f2734h, x2c0.Ss);
            xdl0.N(this.f2736j, x2c0.Rs);
            xdl0.N(this.f2732f, x2c0.H7);
            xdl0.D0(t100.d(32.0f), new View[]{this.f2730d});
            xdl0.C0(this.f2730d, t100.d(32.0f));
            xdl0.D0(t100.d(32.0f), new View[]{this.f2734h});
            xdl0.C0(this.f2734h, t100.d(32.0f));
            xdl0.D0(t100.d(32.0f), new View[]{this.f2736j});
            xdl0.C0(this.f2736j, t100.d(32.0f));
            xdl0.D0(t100.d(32.0f), new View[]{this.f2732f});
            xdl0.C0(this.f2732f, t100.d(32.0f));
        }
    }

    public HomeTitleMenuLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeTitleMenuLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: i1 */
    public void m3191i1(q0m q0mVar) {
    }
}
