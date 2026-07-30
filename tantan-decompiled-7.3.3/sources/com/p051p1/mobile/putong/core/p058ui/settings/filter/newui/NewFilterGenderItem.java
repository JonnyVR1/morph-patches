package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText_AutoFit;
import p153l.bnl0;
import p153l.gta;
import p153l.iz20;
import p153l.j9c0;
import p153l.kbc0;
import p153l.lyh0;
import p153l.qa00;
import p153l.qi40;
import p153l.tu0;

/* JADX INFO: loaded from: classes12.dex */
public class NewFilterGenderItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f37030a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f37031b;

    /* JADX INFO: renamed from: c */
    public VImage f37032c;

    /* JADX INFO: renamed from: d */
    public qi40 f37033d;

    public NewFilterGenderItem(Context context) {
        super(context);
    }

    public qi40 getBindViewData() {
        return this.f37033d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56675p(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f37031b.setTextColor(getContext().getResources().getColorStateList(j9c0.f118873j));
            setBackgroundResource(kbc0.f124891m1);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = qa00.m175859d(99.0f);
            layoutParams.height = qa00.m175859d(99.0f);
            setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m56675p(View view) {
        iz20.m142755a(this, view);
    }

    public void setData(qi40 qi40Var) {
        if (qi40Var == null) {
            return;
        }
        this.f37033d = qi40Var;
        this.f37031b.setText(qi40Var.f157799b);
        this.f37030a.setImageDrawable(tu0.m192702b(getContext(), this.f37033d.f157800c));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f37031b.setSelected(z);
        VText_AutoFit vText_AutoFit = this.f37031b;
        if (z) {
            vText_AutoFit.setTypeface(lyh0.m156283c(3));
        } else {
            vText_AutoFit.setTypeface(lyh0.m156283c(2));
        }
        VImage vImage = this.f37032c;
        qi40 qi40Var = this.f37033d;
        bnl0.m105525M0(vImage, ((qi40Var != null && qi40Var.f157802e) || !gta.m132210e().m132214d().mo34702I4()) && z);
        requestLayout();
    }

    public NewFilterGenderItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFilterGenderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
