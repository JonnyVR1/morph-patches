package com.p000p1.mobile.putong.core.p004ui.settings.filter;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import l.muh0;
import l.nu0;
import p006l.luh0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TagZodiacsItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f5847a;

    /* JADX INFO: renamed from: b */
    public VText f5848b;

    /* JADX INFO: renamed from: c */
    public luh0 f5849c;

    public TagZodiacsItem(Context context) {
        super(context);
        m8742b();
    }

    /* JADX INFO: renamed from: a */
    public View m8741a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return muh0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m8742b() {
        m8741a(LayoutInflater.from(getContext()), this);
    }

    public luh0 getBindViewData() {
        return this.f5849c;
    }

    public void setData(luh0 luh0Var) {
        if (luh0Var == null) {
            return;
        }
        this.f5849c = luh0Var;
        this.f5848b.setText(luh0Var.f16658d);
        this.f5847a.setImageDrawable(nu0.b(getContext(), this.f5849c.f16659e));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        VText vText = this.f5848b;
        if (z) {
            vText.setTextColor(Color.parseColor(this.f5849c.f16661g));
        } else {
            vText.setTextColor(Color.parseColor(this.f5849c.f16660f));
        }
    }

    public TagZodiacsItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8742b();
    }

    public TagZodiacsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8742b();
    }
}
