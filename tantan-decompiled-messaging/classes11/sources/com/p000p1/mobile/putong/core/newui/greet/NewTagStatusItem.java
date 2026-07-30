package com.p000p1.mobile.putong.core.newui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.eqh0;
import l.fa40;
import l.nu0;
import l.xdl0;
import p009l.ea40;
import v.VFrame;
import v.VImage;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewTagStatusItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f302a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f303b;

    /* JADX INFO: renamed from: c */
    public VImage f304c;

    /* JADX INFO: renamed from: d */
    public ea40 f305d;

    public NewTagStatusItem(Context context) {
        super(context);
    }

    public ea40 getBindViewData() {
        return this.f305d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m424p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m424p(View view) {
        fa40.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setData(ea40 ea40Var) {
        if (ea40Var == null) {
            return;
        }
        this.f305d = ea40Var;
        this.f303b.setText(ea40Var.f12467b);
        this.f302a.setImageDrawable(nu0.b(getContext(), this.f305d.f12468c));
        setSelected(isSelected());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(boolean z) {
        super/*android.view.View*/.setSelected(z);
        this.f303b.setSelected(z);
        VText_AutoFit vText_AutoFit = this.f303b;
        if (z) {
            vText_AutoFit.setTypeface(eqh0.c(3));
        } else {
            vText_AutoFit.setTypeface(eqh0.c(2));
        }
        xdl0.M0(this.f304c, z);
        requestLayout();
    }

    public NewTagStatusItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewTagStatusItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
