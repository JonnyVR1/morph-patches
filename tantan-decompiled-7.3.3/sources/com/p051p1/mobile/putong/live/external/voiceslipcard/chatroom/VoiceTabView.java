package com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveSkinConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveTopBarConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gc2;
import p153l.izs;
import p153l.j3p0;
import p153l.jyn0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceTabView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f47376a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f47377b;

    /* JADX INFO: renamed from: c */
    public boolean f47378c;

    public VoiceTabView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m72320a(View view) {
        j3p0.m143362a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m72321b(BLiveVoiceTab bLiveVoiceTab) {
        ViewGroup.LayoutParams layoutParams = this.f47377b.getLayoutParams();
        int iM175859d = qa00.m175859d(bLiveVoiceTab.width);
        if (iM175859d == 0) {
            iM175859d = qa00.m175859d(72.0f);
        }
        layoutParams.width = iM175859d;
        this.f47377b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m72322c(boolean z, BLiveSkinConfig bLiveSkinConfig) {
        int iMo108077k;
        BLiveTopBarConfig bLiveTopBarConfig;
        TextView textView = this.f47376a;
        boolean z2 = this.f47378c;
        textView.setBackgroundResource(z ? jyn0.m147610g(z2).mo108070d() : jyn0.m147610g(z2).mo108078l());
        TextView textView2 = this.f47376a;
        if (z) {
            iMo108077k = jyn0.m147610g(this.f47378c).mo108069c();
        } else {
            iMo108077k = (bLiveSkinConfig == null || (bLiveTopBarConfig = bLiveSkinConfig.topTabBarConfig) == null || TextUtils.isEmpty(bLiveTopBarConfig.textColor)) ? jyn0.m147610g(this.f47378c).mo108077k() : gc2.m129825d(bLiveSkinConfig.topTabBarConfig.textColor);
        }
        textView2.setTextColor(iMo108077k);
        TextView textView3 = this.f47376a;
        boolean z3 = this.f47378c;
        textView3.setTextSize(z ? jyn0.m147610g(z3).mo108068b() : jyn0.m147610g(z3).mo108074h());
    }

    /* JADX INFO: renamed from: d */
    public void m72323d(BLiveVoiceTab bLiveVoiceTab, boolean z) {
        this.f47378c = z;
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceTab.tabSelectedUrl);
        VDraweeView vDraweeView = this.f47377b;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
            bnl0.m105524M(this.f47376a, true);
            this.f47376a.setText(bLiveVoiceTab.name);
        } else {
            bnl0.m105524M(vDraweeView, true);
            bnl0.m105524M(this.f47376a, false);
            m72321b(bLiveVoiceTab);
            izs.m142870u("context_square", this.f47377b, bLiveVoiceTab.tabDefaultUrl, qa00.f156298K, qa00.f156335v);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72320a(this);
    }

    public VoiceTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VoiceTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
