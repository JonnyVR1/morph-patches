package com.p051p1.mobile.putong.core.p058ui.settings.filter;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p151v.VText;
import p153l.t2i0;
import p153l.tu0;
import p153l.u2i0;

/* JADX INFO: loaded from: classes12.dex */
public class TagZodiacsItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36914a;

    /* JADX INFO: renamed from: b */
    public VText f36915b;

    /* JADX INFO: renamed from: c */
    public t2i0 f36916c;

    public TagZodiacsItem(Context context) {
        super(context);
        m56552b();
    }

    /* JADX INFO: renamed from: a */
    public View m56551a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u2i0.m194274b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m56552b() {
        m56551a(LayoutInflater.from(getContext()), this);
    }

    public t2i0 getBindViewData() {
        return this.f36916c;
    }

    public void setData(t2i0 t2i0Var) {
        if (t2i0Var == null) {
            return;
        }
        this.f36916c = t2i0Var;
        this.f36915b.setText(t2i0Var.f171766d);
        this.f36914a.setImageDrawable(tu0.m192702b(getContext(), this.f36916c.f171767e));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        VText vText = this.f36915b;
        if (z) {
            vText.setTextColor(Color.parseColor(this.f36916c.f171769g));
        } else {
            vText.setTextColor(Color.parseColor(this.f36916c.f171768f));
        }
    }

    public TagZodiacsItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m56552b();
    }

    public TagZodiacsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m56552b();
    }
}
