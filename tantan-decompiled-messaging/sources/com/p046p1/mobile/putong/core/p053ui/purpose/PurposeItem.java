package com.p046p1.mobile.putong.core.p053ui.purpose;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText_AutoFit;
import p149l.eqh0;
import p149l.huh0;
import p149l.t100;
import p149l.ucb0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class PurposeItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public PurposeItem f35313a;

    /* JADX INFO: renamed from: b */
    public VFrame f35314b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f35315c;

    /* JADX INFO: renamed from: d */
    public VImage f35316d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f35317e;

    /* JADX INFO: renamed from: f */
    public int f35318f;

    public PurposeItem(Context context) {
        super(context);
        this.f35318f = (xdl0.m208412y0() - t100.m186890d(112.0f)) / 3;
    }

    public huh0 getBindViewData() {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54444p(this);
        this.f35317e.setTypeface(eqh0.m117752c(3));
        xdl0.m208327D0(this.f35318f, this.f35313a);
        xdl0.m208325C0(this.f35313a, this.f35318f + t100.m186890d(23.0f));
        xdl0.m208327D0(this.f35318f, this.f35314b);
        xdl0.m208325C0(this.f35314b, this.f35318f);
    }

    /* JADX INFO: renamed from: p */
    public final void m54444p(View view) {
        ucb0.m193008a(this, view);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f35317e.setSelected(z);
        xdl0.m208345M0(this.f35316d, z);
    }

    public PurposeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35318f = (xdl0.m208412y0() - t100.m186890d(112.0f)) / 3;
    }

    public PurposeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35318f = (xdl0.m208412y0() - t100.m186890d(112.0f)) / 3;
    }

    public void setData(huh0 huh0Var) {
    }
}
