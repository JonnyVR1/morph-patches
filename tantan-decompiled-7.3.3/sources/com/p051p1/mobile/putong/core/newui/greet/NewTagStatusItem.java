package com.p051p1.mobile.putong.core.newui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText_AutoFit;
import p153l.bnl0;
import p153l.lyh0;
import p153l.si40;
import p153l.ti40;
import p153l.tu0;

/* JADX INFO: loaded from: classes11.dex */
public class NewTagStatusItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f22266a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f22267b;

    /* JADX INFO: renamed from: c */
    public VImage f22268c;

    /* JADX INFO: renamed from: d */
    public si40 f22269d;

    public NewTagStatusItem(Context context) {
        super(context);
    }

    public si40 getBindViewData() {
        return this.f22269d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37498p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m37498p(View view) {
        ti40.m191314a(this, view);
    }

    public void setData(si40 si40Var) {
        if (si40Var == null) {
            return;
        }
        this.f22269d = si40Var;
        this.f22267b.setText(si40Var.f168795b);
        this.f22266a.setImageDrawable(tu0.m192702b(getContext(), this.f22269d.f168796c));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f22267b.setSelected(z);
        VText_AutoFit vText_AutoFit = this.f22267b;
        if (z) {
            vText_AutoFit.setTypeface(lyh0.m156283c(3));
        } else {
            vText_AutoFit.setTypeface(lyh0.m156283c(2));
        }
        bnl0.m105525M0(this.f22268c, z);
        requestLayout();
    }

    public NewTagStatusItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewTagStatusItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
