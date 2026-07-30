package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import p147v.VImage;
import p147v.VText;
import p149l.rwj;
import p149l.swj;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class GiftTabView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f50353d;

    /* JADX INFO: renamed from: e */
    public VImage f50354e;

    /* JADX INFO: renamed from: f */
    public View f50355f;

    public GiftTabView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74523h0(View view) {
        swj.m186324a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74524i0(rwj rwjVar, int i) {
        int iM181399f = rwjVar.m181399f();
        VText vText = this.f50353d;
        if (iM181399f == i) {
            vText.setTextColor(Color.parseColor("#ffffff"));
        } else {
            vText.setTextColor(Color.parseColor("#80ffffff"));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m74525j0(rwj rwjVar, TabLayout.Tab tab, int i) {
        this.f50353d.setText(rwjVar.m181397d());
        tab.setCustomView(this);
        tab.setTag(Integer.valueOf(rwjVar.m181399f()));
        m74524i0(rwjVar, i);
        xdl0.m208344M(this.f50354e, false);
    }

    /* JADX INFO: renamed from: k0 */
    public void m74526k0(boolean z, boolean z2) {
        this.f50353d.setTextColor(Color.parseColor(z ? "#ffffff" : "#80ffffff"));
        if (z2) {
            xdl0.m208345M0(this.f50355f, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74523h0(this);
    }

    public void setSelect(boolean z) {
        m74526k0(z, false);
    }

    public GiftTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
