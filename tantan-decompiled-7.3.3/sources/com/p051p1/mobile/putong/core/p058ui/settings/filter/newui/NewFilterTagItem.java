package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.kz20;
import p153l.lyh0;
import p153l.qi40;
import p153l.tu0;

/* JADX INFO: loaded from: classes12.dex */
public class NewFilterTagItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f37034a;

    /* JADX INFO: renamed from: b */
    public VText f37035b;

    /* JADX INFO: renamed from: c */
    public VImage f37036c;

    /* JADX INFO: renamed from: d */
    public qi40 f37037d;

    public NewFilterTagItem(Context context) {
        super(context);
    }

    public qi40 getBindViewData() {
        return this.f37037d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56676p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m56676p(View view) {
        kz20.m152159a(this, view);
    }

    public void setData(qi40 qi40Var) {
        if (qi40Var == null) {
            return;
        }
        this.f37037d = qi40Var;
        this.f37035b.setText(qi40Var.f157799b);
        this.f37034a.setImageDrawable(tu0.m192702b(getContext(), this.f37037d.f157800c));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f37035b.setSelected(z);
        VText vText = this.f37035b;
        if (z) {
            vText.setTypeface(lyh0.m156283c(3));
        } else {
            vText.setTypeface(lyh0.m156283c(2));
        }
        VImage vImage = this.f37036c;
        qi40 qi40Var = this.f37037d;
        bnl0.m105525M0(vImage, qi40Var != null && qi40Var.f157802e && z);
        requestLayout();
    }

    public NewFilterTagItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFilterTagItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
