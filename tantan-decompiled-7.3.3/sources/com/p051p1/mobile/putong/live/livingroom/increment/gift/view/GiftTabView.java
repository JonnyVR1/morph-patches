package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.hzj;
import p153l.izj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftTabView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f51201d;

    /* JADX INFO: renamed from: e */
    public VImage f51202e;

    /* JADX INFO: renamed from: f */
    public View f51203f;

    public GiftTabView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75706h0(View view) {
        izj.m142810a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75707i0(hzj hzjVar, int i) {
        int iM137898f = hzjVar.m137898f();
        VText vText = this.f51201d;
        if (iM137898f == i) {
            vText.setTextColor(Color.parseColor("#ffffff"));
        } else {
            vText.setTextColor(Color.parseColor("#80ffffff"));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m75708j0(hzj hzjVar, TabLayout.Tab tab, int i) {
        this.f51201d.setText(hzjVar.m137896d());
        tab.setCustomView(this);
        tab.setTag(Integer.valueOf(hzjVar.m137898f()));
        m75707i0(hzjVar, i);
        bnl0.m105524M(this.f51202e, false);
    }

    /* JADX INFO: renamed from: k0 */
    public void m75709k0(boolean z, boolean z2) {
        this.f51201d.setTextColor(Color.parseColor(z ? "#ffffff" : "#80ffffff"));
        if (z2) {
            bnl0.m105525M0(this.f51203f, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75706h0(this);
    }

    public void setSelect(boolean z) {
        m75709k0(z, false);
    }

    public GiftTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
