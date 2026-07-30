package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p151v.VLinear;
import p151v.VText;
import p153l.mbc0;
import p153l.qa00;
import p153l.vfs;

/* JADX INFO: loaded from: classes13.dex */
public class LiveFooterTipsView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f45509c;

    /* JADX INFO: renamed from: d */
    public VText f45510d;

    /* JADX INFO: renamed from: e */
    public View f45511e;

    public LiveFooterTipsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m69910P(View view) {
        vfs.m201180a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m69911Q(boolean z, String str) {
        this.f45510d.setText(str);
        VText vText = this.f45510d;
        if (z) {
            vText.setTextColor(Color.parseColor("#4dffffff"));
            this.f45509c.setBackgroundResource(mbc0.f135662V);
            this.f45511e.setBackgroundResource(mbc0.f135662V);
        } else {
            vText.setTextColor(Color.parseColor("#dcdcdc"));
            this.f45509c.setBackgroundResource(mbc0.f135661U);
            this.f45511e.setBackgroundResource(mbc0.f135661U);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69910P(this);
        if (getLayoutParams() != null) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = qa00.m175859d(60.0f);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.topMargin = qa00.m175859d(60.0f);
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
