package com.p000p1.mobile.putong.core.p004ui.settings.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.eqh0;
import l.ga40;
import l.nu0;
import p006l.luh0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewTagZodiacsItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f5829a;

    /* JADX INFO: renamed from: b */
    public VText f5830b;

    /* JADX INFO: renamed from: c */
    public luh0 f5831c;

    public NewTagZodiacsItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8732a(View view) {
        ga40.a(this, view);
    }

    public luh0 getBindViewData() {
        return this.f5831c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8732a(this);
    }

    public void setData(luh0 luh0Var) {
        if (luh0Var == null) {
            return;
        }
        this.f5831c = luh0Var;
        this.f5830b.setText(luh0Var.f16658d);
        this.f5829a.setImageDrawable(nu0.b(getContext(), this.f5831c.f16659e));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f5830b.setSelected(z);
        VText vText = this.f5830b;
        if (z) {
            vText.setTypeface(eqh0.c(3));
        } else {
            vText.setTypeface(eqh0.c(2));
        }
        requestLayout();
    }

    public NewTagZodiacsItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewTagZodiacsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
