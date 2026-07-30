package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p147v.VDraweeView;
import p149l.bs5;
import p149l.d5c0;
import p149l.g3c0;
import p149l.hxs;
import p149l.lcs;
import p149l.mcr;
import p149l.mep0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.wk4;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceFeedCardView extends FrameLayout {
    private TextView attributeTextView;
    private LiveAvatarNumberViewNew avatarNumberView;
    private lcs cardData;
    private VDraweeView staticBgView;
    private VDraweeView subTitleIcon;
    private TextView subTitleView;
    private TextView titleView;

    public LiveVoiceFeedCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m67461a(lcs lcsVar, mcr mcrVar, bs5 bs5Var) {
        this.cardData = lcsVar;
        xdl0.m208344M(this.staticBgView, false);
        xdl0.m208344M(this.subTitleIcon, false);
        wk4.m203651d(this.attributeTextView, lcsVar.m149361k());
        wk4.m203651d(this.subTitleView, lcsVar.m149357g());
        wk4.m203653f(lcsVar.m149359i(), lcsVar.m149360j(), bs5Var, this.titleView, mcrVar);
        this.avatarNumberView.setImageData(vwb.m200303Q(lcsVar.m149354d(), new w9j() { // from class: l.h4v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((fxk) obj).m123634a();
            }
        }));
        this.avatarNumberView.setNumberView(lcsVar.m149353c());
        this.avatarNumberView.getNumberView().setBackgroundResource(g3c0.f100450y);
        this.avatarNumberView.getNumberView().setTypeface(Typeface.defaultFromStyle(0));
        if (!TextUtils.isEmpty(lcsVar.m149358h())) {
            xdl0.m208344M(this.subTitleIcon, true);
            VDraweeView vDraweeView = this.subTitleIcon;
            String strM149358h = lcsVar.m149358h();
            int i = t100.f167264m;
            hxs.m133408u("context_square", vDraweeView, strM149358h, i, i);
        }
        if (TextUtils.isEmpty(lcsVar.m149351a())) {
            return;
        }
        xdl0.m208344M(this.staticBgView, true);
        hxs.m133408u("context_square", this.staticBgView, lcsVar.m149351a(), t100.f167247V, t100.f167249X);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.attributeTextView = (TextView) findViewById(d5c0.f84482i);
        this.titleView = (TextView) findViewById(d5c0.f84457Z0);
        this.avatarNumberView = (LiveAvatarNumberViewNew) findViewById(d5c0.f84500o);
        this.staticBgView = (VDraweeView) findViewById(d5c0.f84508r);
        this.subTitleIcon = (VDraweeView) findViewById(d5c0.f84431M0);
        this.subTitleView = (TextView) findViewById(d5c0.f84429L0);
        int iM208412y0 = (int) ((((xdl0.m208412y0() - t100.f167268q) / 2) * 200.0f) / 176.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = iM208412y0;
        setLayoutParams(layoutParams);
        mep0.m154302d1(this, t100.f167260i);
    }

    public LiveVoiceFeedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceFeedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
