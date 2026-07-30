package com.p046p1.mobile.putong.core.p053ui.settings.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p147v.VText;
import p149l.eqh0;
import p149l.ga40;
import p149l.luh0;
import p149l.nu0;

/* JADX INFO: loaded from: classes9.dex */
public class NewTagZodiacsItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36048a;

    /* JADX INFO: renamed from: b */
    public VText f36049b;

    /* JADX INFO: renamed from: c */
    public luh0 f36050c;

    public NewTagZodiacsItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55359a(View view) {
        ga40.m124919a(this, view);
    }

    public luh0 getBindViewData() {
        return this.f36050c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55359a(this);
    }

    public void setData(luh0 luh0Var) {
        if (luh0Var == null) {
            return;
        }
        this.f36050c = luh0Var;
        this.f36049b.setText(luh0Var.f130065d);
        this.f36048a.setImageDrawable(nu0.m161424b(getContext(), this.f36050c.f130066e));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f36049b.setSelected(z);
        VText vText = this.f36049b;
        if (z) {
            vText.setTypeface(eqh0.m117752c(3));
        } else {
            vText.setTypeface(eqh0.m117752c(2));
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
