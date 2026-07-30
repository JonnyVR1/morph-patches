package com.p046p1.mobile.putong.core.p053ui.settings.filter;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p147v.VText;
import p149l.luh0;
import p149l.muh0;
import p149l.nu0;

/* JADX INFO: loaded from: classes9.dex */
public class TagZodiacsItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36066a;

    /* JADX INFO: renamed from: b */
    public VText f36067b;

    /* JADX INFO: renamed from: c */
    public luh0 f36068c;

    public TagZodiacsItem(Context context) {
        super(context);
        m55369b();
    }

    /* JADX INFO: renamed from: a */
    public View m55368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return muh0.m156405b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m55369b() {
        m55368a(LayoutInflater.from(getContext()), this);
    }

    public luh0 getBindViewData() {
        return this.f36068c;
    }

    public void setData(luh0 luh0Var) {
        if (luh0Var == null) {
            return;
        }
        this.f36068c = luh0Var;
        this.f36067b.setText(luh0Var.f130065d);
        this.f36066a.setImageDrawable(nu0.m161424b(getContext(), this.f36068c.f130066e));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        VText vText = this.f36067b;
        if (z) {
            vText.setTextColor(Color.parseColor(this.f36068c.f130068g));
        } else {
            vText.setTextColor(Color.parseColor(this.f36068c.f130067f));
        }
    }

    public TagZodiacsItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m55369b();
    }

    public TagZodiacsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m55369b();
    }
}
