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
import p149l.nu0;
import p149l.wsh0;
import p149l.xsh0;

/* JADX INFO: loaded from: classes9.dex */
public class TagBloodItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36060a;

    /* JADX INFO: renamed from: b */
    public VText f36061b;

    /* JADX INFO: renamed from: c */
    public wsh0 f36062c;

    public TagBloodItem(Context context) {
        super(context);
        m55364b();
    }

    /* JADX INFO: renamed from: a */
    public View m55363a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xsh0.m210759b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m55364b() {
        m55363a(LayoutInflater.from(getContext()), this);
    }

    public wsh0 getBindViewData() {
        return this.f36062c;
    }

    public void setData(wsh0 wsh0Var) {
        if (wsh0Var == null) {
            return;
        }
        this.f36062c = wsh0Var;
        this.f36061b.setText(wsh0Var.f187934c);
        this.f36060a.setImageDrawable(nu0.m161424b(getContext(), this.f36062c.f187935d));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        VText vText = this.f36061b;
        if (z) {
            vText.setTextColor(Color.parseColor(this.f36062c.f187937f));
        } else {
            vText.setTextColor(Color.parseColor(this.f36062c.f187936e));
        }
    }

    public TagBloodItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m55364b();
    }

    public TagBloodItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m55364b();
    }
}
