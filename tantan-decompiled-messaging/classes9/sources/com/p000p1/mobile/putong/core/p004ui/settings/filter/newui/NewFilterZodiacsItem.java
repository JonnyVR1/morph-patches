package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.c1c0;
import l.cr20;
import l.e3c0;
import l.eqh0;
import l.nu0;
import l.t100;
import p006l.luh0;
import p006l.ura;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewFilterZodiacsItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f5971a;

    /* JADX INFO: renamed from: b */
    public VText f5972b;

    /* JADX INFO: renamed from: c */
    public luh0 f5973c;

    public NewFilterZodiacsItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8877a(View view) {
        cr20.a(this, view);
    }

    public luh0 getBindViewData() {
        return this.f5973c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8877a(this);
        if (ura.m25555e().m25559d().m5636I4()) {
            this.f5972b.setTextColor(getContext().getResources().getColorStateList(c1c0.j));
            setBackgroundResource(e3c0.m1);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = t100.d(99.0f);
            layoutParams.height = t100.d(99.0f);
            setLayoutParams(layoutParams);
        }
    }

    public void setData(luh0 luh0Var) {
        if (luh0Var == null) {
            return;
        }
        this.f5973c = luh0Var;
        this.f5972b.setText(luh0Var.f16658d);
        this.f5971a.setImageDrawable(nu0.b(getContext(), this.f5973c.f16659e));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f5972b.setSelected(z);
        VText vText = this.f5972b;
        if (z) {
            vText.setTypeface(eqh0.c(3));
        } else {
            vText.setTypeface(eqh0.c(2));
        }
        requestLayout();
    }

    public NewFilterZodiacsItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFilterZodiacsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
