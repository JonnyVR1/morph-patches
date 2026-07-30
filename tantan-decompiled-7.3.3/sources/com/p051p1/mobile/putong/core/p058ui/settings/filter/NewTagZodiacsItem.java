package com.p051p1.mobile.putong.core.p058ui.settings.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p151v.VText;
import p153l.lyh0;
import p153l.t2i0;
import p153l.tu0;
import p153l.ui40;

/* JADX INFO: loaded from: classes12.dex */
public class NewTagZodiacsItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36896a;

    /* JADX INFO: renamed from: b */
    public VText f36897b;

    /* JADX INFO: renamed from: c */
    public t2i0 f36898c;

    public NewTagZodiacsItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56542a(View view) {
        ui40.m196140a(this, view);
    }

    public t2i0 getBindViewData() {
        return this.f36898c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56542a(this);
    }

    public void setData(t2i0 t2i0Var) {
        if (t2i0Var == null) {
            return;
        }
        this.f36898c = t2i0Var;
        this.f36897b.setText(t2i0Var.f171766d);
        this.f36896a.setImageDrawable(tu0.m192702b(getContext(), this.f36898c.f171767e));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f36897b.setSelected(z);
        VText vText = this.f36897b;
        if (z) {
            vText.setTypeface(lyh0.m156283c(3));
        } else {
            vText.setTypeface(lyh0.m156283c(2));
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
