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
import p153l.e1i0;
import p153l.f1i0;
import p153l.tu0;

/* JADX INFO: loaded from: classes12.dex */
public class TagBloodItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36908a;

    /* JADX INFO: renamed from: b */
    public VText f36909b;

    /* JADX INFO: renamed from: c */
    public e1i0 f36910c;

    public TagBloodItem(Context context) {
        super(context);
        m56547b();
    }

    /* JADX INFO: renamed from: a */
    public View m56546a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f1i0.m123576b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m56547b() {
        m56546a(LayoutInflater.from(getContext()), this);
    }

    public e1i0 getBindViewData() {
        return this.f36910c;
    }

    public void setData(e1i0 e1i0Var) {
        if (e1i0Var == null) {
            return;
        }
        this.f36910c = e1i0Var;
        this.f36909b.setText(e1i0Var.f91618c);
        this.f36908a.setImageDrawable(tu0.m192702b(getContext(), this.f36910c.f91619d));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        VText vText = this.f36909b;
        if (z) {
            vText.setTextColor(Color.parseColor(this.f36910c.f91621f));
        } else {
            vText.setTextColor(Color.parseColor(this.f36910c.f91620e));
        }
    }

    public TagBloodItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m56547b();
    }

    public TagBloodItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m56547b();
    }
}
