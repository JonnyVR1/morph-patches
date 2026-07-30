package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p147v.VLinear;
import p147v.VText;
import p149l.g3c0;
import p149l.t100;
import p149l.uds;

/* JADX INFO: loaded from: classes13.dex */
public class LiveFooterTipsView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f44661c;

    /* JADX INFO: renamed from: d */
    public VText f44662d;

    /* JADX INFO: renamed from: e */
    public View f44663e;

    public LiveFooterTipsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m68727P(View view) {
        uds.m193151a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m68728Q(boolean z, String str) {
        this.f44662d.setText(str);
        VText vText = this.f44662d;
        if (z) {
            vText.setTextColor(Color.parseColor("#4dffffff"));
            this.f44661c.setBackgroundResource(g3c0.f100400V);
            this.f44663e.setBackgroundResource(g3c0.f100400V);
        } else {
            vText.setTextColor(Color.parseColor("#dcdcdc"));
            this.f44661c.setBackgroundResource(g3c0.f100399U);
            this.f44663e.setBackgroundResource(g3c0.f100399U);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68727P(this);
        if (getLayoutParams() != null) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = t100.m186890d(60.0f);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.topMargin = t100.m186890d(60.0f);
            setLayoutParams(layoutParams);
        }
    }

    public LiveFooterTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFooterTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
