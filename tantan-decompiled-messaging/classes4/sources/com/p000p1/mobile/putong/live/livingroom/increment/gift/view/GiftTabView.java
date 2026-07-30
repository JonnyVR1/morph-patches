package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import l.xdl0;
import p002l.rwj;
import p002l.swj;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftTabView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f6395d;

    /* JADX INFO: renamed from: e */
    public VImage f6396e;

    /* JADX INFO: renamed from: f */
    public View f6397f;

    public GiftTabView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8110h0(View view) {
        swj.m22720a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8111i0(rwj rwjVar, int i) {
        int iM22143f = rwjVar.m22143f();
        VText vText = this.f6395d;
        if (iM22143f == i) {
            vText.setTextColor(Color.parseColor("#ffffff"));
        } else {
            vText.setTextColor(Color.parseColor("#80ffffff"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m8112j0(rwj rwjVar, TabLayout.Tab tab, int i) {
        this.f6395d.setText(rwjVar.m22141d());
        tab.setCustomView(this);
        tab.setTag(Integer.valueOf(rwjVar.m22143f()));
        m8111i0(rwjVar, i);
        xdl0.M(this.f6396e, false);
    }

    /* JADX INFO: renamed from: k0 */
    public void m8113k0(boolean z, boolean z2) {
        this.f6395d.setTextColor(Color.parseColor(z ? "#ffffff" : "#80ffffff"));
        if (z2) {
            xdl0.M0(this.f6397f, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8110h0(this);
    }

    public void setSelect(boolean z) {
        m8113k0(z, false);
    }

    public GiftTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
