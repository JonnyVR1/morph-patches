package com.p046p1.mobile.putong.core.newui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText_AutoFit;
import p149l.ea40;
import p149l.eqh0;
import p149l.fa40;
import p149l.nu0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class NewTagStatusItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f21524a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f21525b;

    /* JADX INFO: renamed from: c */
    public VImage f21526c;

    /* JADX INFO: renamed from: d */
    public ea40 f21527d;

    public NewTagStatusItem(Context context) {
        super(context);
    }

    public ea40 getBindViewData() {
        return this.f21527d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36495p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m36495p(View view) {
        fa40.m120143a(this, view);
    }

    public void setData(ea40 ea40Var) {
        if (ea40Var == null) {
            return;
        }
        this.f21527d = ea40Var;
        this.f21525b.setText(ea40Var.f90172b);
        this.f21524a.setImageDrawable(nu0.m161424b(getContext(), this.f21527d.f90173c));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f21525b.setSelected(z);
        VText_AutoFit vText_AutoFit = this.f21525b;
        if (z) {
            vText_AutoFit.setTypeface(eqh0.m117752c(3));
        } else {
            vText_AutoFit.setTypeface(eqh0.m117752c(2));
        }
        xdl0.m208345M0(this.f21526c, z);
        requestLayout();
    }

    public NewTagStatusItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewTagStatusItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
