package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import l.c1c0;
import l.e3c0;
import l.eqh0;
import l.nu0;
import l.t100;
import l.xdl0;
import l.yq20;
import p006l.ca40;
import p006l.ura;
import v.VFrame;
import v.VImage;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewFilterGenderItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f5963a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f5964b;

    /* JADX INFO: renamed from: c */
    public VImage f5965c;

    /* JADX INFO: renamed from: d */
    public ca40 f5966d;

    public NewFilterGenderItem(Context context) {
        super(context);
    }

    public ca40 getBindViewData() {
        return this.f5966d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8875p(this);
        if (ura.m25555e().m25559d().m5636I4()) {
            this.f5964b.setTextColor(getContext().getResources().getColorStateList(c1c0.j));
            setBackgroundResource(e3c0.m1);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = t100.d(99.0f);
            layoutParams.height = t100.d(99.0f);
            setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m8875p(View view) {
        yq20.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setData(ca40 ca40Var) {
        if (ca40Var == null) {
            return;
        }
        this.f5966d = ca40Var;
        this.f5964b.setText(ca40Var.f9553b);
        this.f5963a.setImageDrawable(nu0.b(getContext(), this.f5966d.f9554c));
        setSelected(isSelected());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(boolean z) {
        super/*android.view.View*/.setSelected(z);
        this.f5964b.setSelected(z);
        VText_AutoFit vText_AutoFit = this.f5964b;
        if (z) {
            vText_AutoFit.setTypeface(eqh0.c(3));
        } else {
            vText_AutoFit.setTypeface(eqh0.c(2));
        }
        VImage vImage = this.f5965c;
        ca40 ca40Var = this.f5966d;
        xdl0.M0(vImage, ((ca40Var != null && ca40Var.f9556e) || !ura.m25555e().m25559d().m5636I4()) && z);
        requestLayout();
    }

    public NewFilterGenderItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFilterGenderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
