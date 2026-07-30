package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.ar20;
import l.eqh0;
import l.nu0;
import l.xdl0;
import p006l.ca40;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewFilterTagItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f5967a;

    /* JADX INFO: renamed from: b */
    public VText f5968b;

    /* JADX INFO: renamed from: c */
    public VImage f5969c;

    /* JADX INFO: renamed from: d */
    public ca40 f5970d;

    public NewFilterTagItem(Context context) {
        super(context);
    }

    public ca40 getBindViewData() {
        return this.f5970d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8876p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m8876p(View view) {
        ar20.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setData(ca40 ca40Var) {
        if (ca40Var == null) {
            return;
        }
        this.f5970d = ca40Var;
        this.f5968b.setText(ca40Var.f9553b);
        this.f5967a.setImageDrawable(nu0.b(getContext(), this.f5970d.f9554c));
        setSelected(isSelected());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(boolean z) {
        super/*android.view.View*/.setSelected(z);
        this.f5968b.setSelected(z);
        VText vText = this.f5968b;
        if (z) {
            vText.setTypeface(eqh0.c(3));
        } else {
            vText.setTypeface(eqh0.c(2));
        }
        VImage vImage = this.f5969c;
        ca40 ca40Var = this.f5970d;
        xdl0.M0(vImage, ca40Var != null && ca40Var.f9556e && z);
        requestLayout();
    }

    public NewFilterTagItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFilterTagItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
