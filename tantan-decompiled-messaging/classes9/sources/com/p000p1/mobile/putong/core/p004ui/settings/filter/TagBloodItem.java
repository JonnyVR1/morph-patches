package com.p000p1.mobile.putong.core.p004ui.settings.filter;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import l.nu0;
import l.xsh0;
import p006l.wsh0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TagBloodItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f5841a;

    /* JADX INFO: renamed from: b */
    public VText f5842b;

    /* JADX INFO: renamed from: c */
    public wsh0 f5843c;

    public TagBloodItem(Context context) {
        super(context);
        m8737b();
    }

    /* JADX INFO: renamed from: a */
    public View m8736a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xsh0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m8737b() {
        m8736a(LayoutInflater.from(getContext()), this);
    }

    public wsh0 getBindViewData() {
        return this.f5843c;
    }

    public void setData(wsh0 wsh0Var) {
        if (wsh0Var == null) {
            return;
        }
        this.f5843c = wsh0Var;
        this.f5842b.setText(wsh0Var.f25384c);
        this.f5841a.setImageDrawable(nu0.b(getContext(), this.f5843c.f25385d));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        VText vText = this.f5842b;
        if (z) {
            vText.setTextColor(Color.parseColor(this.f5843c.f25387f));
        } else {
            vText.setTextColor(Color.parseColor(this.f5843c.f25386e));
        }
    }

    public TagBloodItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8737b();
    }

    public TagBloodItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8737b();
    }
}
