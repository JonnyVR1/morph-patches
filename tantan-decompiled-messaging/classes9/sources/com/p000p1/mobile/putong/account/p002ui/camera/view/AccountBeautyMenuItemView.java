package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p006l.C1218rg;
import p006l.u0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountBeautyMenuItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f722a;

    /* JADX INFO: renamed from: b */
    public View f723b;

    public AccountBeautyMenuItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m811a(View view) {
        C1218rg.m22841a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m811a(this);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f723b.setVisibility(z ? 0 : 8);
        this.f722a.setTextColor(z ? getResources().getColor(u0c0.f22403j) : -16777216);
    }

    public void setText(String str) {
        this.f722a.setText(str);
    }

    public AccountBeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
