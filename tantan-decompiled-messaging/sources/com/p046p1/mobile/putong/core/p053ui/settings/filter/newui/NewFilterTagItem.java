package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.ar20;
import p149l.ca40;
import p149l.eqh0;
import p149l.nu0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class NewFilterTagItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f36186a;

    /* JADX INFO: renamed from: b */
    public VText f36187b;

    /* JADX INFO: renamed from: c */
    public VImage f36188c;

    /* JADX INFO: renamed from: d */
    public ca40 f36189d;

    public NewFilterTagItem(Context context) {
        super(context);
    }

    public ca40 getBindViewData() {
        return this.f36189d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55493p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m55493p(View view) {
        ar20.m98368a(this, view);
    }

    public void setData(ca40 ca40Var) {
        if (ca40Var == null) {
            return;
        }
        this.f36189d = ca40Var;
        this.f36187b.setText(ca40Var.f80002b);
        this.f36186a.setImageDrawable(nu0.m161424b(getContext(), this.f36189d.f80003c));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f36187b.setSelected(z);
        VText vText = this.f36187b;
        if (z) {
            vText.setTypeface(eqh0.m117752c(3));
        } else {
            vText.setTypeface(eqh0.m117752c(2));
        }
        VImage vImage = this.f36188c;
        ca40 ca40Var = this.f36189d;
        xdl0.m208345M0(vImage, ca40Var != null && ca40Var.f80005e && z);
        requestLayout();
    }

    public NewFilterTagItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFilterTagItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
