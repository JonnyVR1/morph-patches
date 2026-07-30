package com.p000p1.mobile.putong.core.p004ui.purpose;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.eqh0;
import l.t100;
import l.ucb0;
import l.xdl0;
import p006l.huh0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PurposeItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public PurposeItem f5094a;

    /* JADX INFO: renamed from: b */
    public VFrame f5095b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5096c;

    /* JADX INFO: renamed from: d */
    public VImage f5097d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f5098e;

    /* JADX INFO: renamed from: f */
    public int f5099f;

    public PurposeItem(Context context) {
        super(context);
        this.f5099f = (xdl0.y0() - t100.d(112.0f)) / 3;
    }

    public huh0 getBindViewData() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7779p(this);
        this.f5098e.setTypeface(eqh0.c(3));
        xdl0.D0(this.f5099f, new View[]{this.f5094a});
        xdl0.C0(this.f5094a, this.f5099f + t100.d(23.0f));
        xdl0.D0(this.f5099f, new View[]{this.f5095b});
        xdl0.C0(this.f5095b, this.f5099f);
    }

    /* JADX INFO: renamed from: p */
    public final void m7779p(View view) {
        ucb0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(boolean z) {
        super/*android.view.View*/.setSelected(z);
        this.f5098e.setSelected(z);
        xdl0.M0(this.f5097d, z);
    }

    public PurposeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5099f = (xdl0.y0() - t100.d(112.0f)) / 3;
    }

    public PurposeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5099f = (xdl0.y0() - t100.d(112.0f)) / 3;
    }

    public void setData(huh0 huh0Var) {
    }
}
