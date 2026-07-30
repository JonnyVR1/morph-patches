package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p147v.VText;
import p149l.c1c0;
import p149l.cr20;
import p149l.e3c0;
import p149l.eqh0;
import p149l.luh0;
import p149l.nu0;
import p149l.t100;
import p149l.ura;

/* JADX INFO: loaded from: classes9.dex */
public class NewFilterZodiacsItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36190a;

    /* JADX INFO: renamed from: b */
    public VText f36191b;

    /* JADX INFO: renamed from: c */
    public luh0 f36192c;

    public NewFilterZodiacsItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55494a(View view) {
        cr20.m108327a(this, view);
    }

    public luh0 getBindViewData() {
        return this.f36192c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55494a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f36191b.setTextColor(getContext().getResources().getColorStateList(c1c0.f78253j));
            setBackgroundResource(e3c0.f89128m1);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = t100.m186890d(99.0f);
            layoutParams.height = t100.m186890d(99.0f);
            setLayoutParams(layoutParams);
        }
    }

    public void setData(luh0 luh0Var) {
        if (luh0Var == null) {
            return;
        }
        this.f36192c = luh0Var;
        this.f36191b.setText(luh0Var.f130065d);
        this.f36190a.setImageDrawable(nu0.m161424b(getContext(), this.f36192c.f130066e));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f36191b.setSelected(z);
        VText vText = this.f36191b;
        if (z) {
            vText.setTypeface(eqh0.m117752c(3));
        } else {
            vText.setTypeface(eqh0.m117752c(2));
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
