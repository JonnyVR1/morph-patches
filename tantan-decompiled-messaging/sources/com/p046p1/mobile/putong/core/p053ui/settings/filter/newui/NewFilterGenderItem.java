package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText_AutoFit;
import p149l.c1c0;
import p149l.ca40;
import p149l.e3c0;
import p149l.eqh0;
import p149l.nu0;
import p149l.t100;
import p149l.ura;
import p149l.xdl0;
import p149l.yq20;

/* JADX INFO: loaded from: classes9.dex */
public class NewFilterGenderItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f36182a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f36183b;

    /* JADX INFO: renamed from: c */
    public VImage f36184c;

    /* JADX INFO: renamed from: d */
    public ca40 f36185d;

    public NewFilterGenderItem(Context context) {
        super(context);
    }

    public ca40 getBindViewData() {
        return this.f36185d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55492p(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f36183b.setTextColor(getContext().getResources().getColorStateList(c1c0.f78253j));
            setBackgroundResource(e3c0.f89128m1);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = t100.m186890d(99.0f);
            layoutParams.height = t100.m186890d(99.0f);
            setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m55492p(View view) {
        yq20.m215694a(this, view);
    }

    public void setData(ca40 ca40Var) {
        if (ca40Var == null) {
            return;
        }
        this.f36185d = ca40Var;
        this.f36183b.setText(ca40Var.f80002b);
        this.f36182a.setImageDrawable(nu0.m161424b(getContext(), this.f36185d.f80003c));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f36183b.setSelected(z);
        VText_AutoFit vText_AutoFit = this.f36183b;
        if (z) {
            vText_AutoFit.setTypeface(eqh0.m117752c(3));
        } else {
            vText_AutoFit.setTypeface(eqh0.m117752c(2));
        }
        VImage vImage = this.f36184c;
        ca40 ca40Var = this.f36185d;
        xdl0.m208345M0(vImage, ((ca40Var != null && ca40Var.f80005e) || !ura.m195053e().m195057d().mo33699I4()) && z);
        requestLayout();
    }

    public NewFilterGenderItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFilterGenderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
