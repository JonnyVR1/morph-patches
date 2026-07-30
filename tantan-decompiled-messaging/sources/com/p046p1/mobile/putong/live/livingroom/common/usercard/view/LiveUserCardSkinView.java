package com.p046p1.mobile.putong.live.livingroom.common.usercard.view;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMaskProfileConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardWholeFrameConfig;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import p147v.VDraweeView;
import p149l.d1t;
import p149l.d30;
import p149l.dck0;
import p149l.dqe;
import p149l.f6l0;
import p149l.fge;
import p149l.g5c0;
import p149l.hxn0;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.mqv;
import p149l.uvr;
import p149l.v9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveUserCardSkinView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f49396d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49397e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49398f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49399g;

    /* JADX INFO: renamed from: h */
    public VideoEffectPlayer f49400h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f49401i;

    /* JADX INFO: renamed from: j */
    public XEGiftView f49402j;

    /* JADX INFO: renamed from: k */
    public View f49403k;

    /* JADX INFO: renamed from: l */
    public LiveMenuDialogHolder f49404l;

    public LiveUserCardSkinView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m73305h0(LiveMenuDialogHolder liveMenuDialogHolder, View view) {
        if (liveMenuDialogHolder == null || !liveMenuDialogHolder.isShowing()) {
            return;
        }
        liveMenuDialogHolder.m71839q(null);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m73310B0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (bLiveUserCardWholeFrameConfig == null) {
            xdl0.m208344M(this.f49402j, false);
            xdl0.m208344M(this.f49401i, false);
        } else if (bLiveUserCardWholeFrameConfig.resourceId > 0) {
            m73319t0(bLiveUserCardWholeFrameConfig);
        } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
            xdl0.m208344M(this.f49402j, false);
            xdl0.m208344M(this.f49401i, false);
        } else {
            xdl0.m208344M(this.f49401i, true);
            hxs.m133406s("context_single_room", this.f49401i, bLiveUserCardWholeFrameConfig.staticUrl);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m73311D0(View view, boolean z) {
        boolean z2 = xdl0.m208349O0(this.f49398f) || xdl0.m208349O0(this.f49399g);
        view.setBackground(z2 ? null : kvc0.m147353b(i3c0.f110670C8));
        View view2 = this.f49403k;
        if (z) {
            xdl0.m208344M(view2, false);
        } else {
            xdl0.m208344M(view2, z2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m73312m0() {
        return xdl0.m208349O0(this.f49398f) || xdl0.m208349O0(this.f49396d) || xdl0.m208349O0(this.f49399g) || xdl0.m208349O0(this.f49397e);
    }

    /* JADX INFO: renamed from: n0 */
    public void m73313n0() {
        this.f49396d.setController(null);
        this.f49397e.setController(null);
        this.f49398f.setController(null);
        this.f49399g.setController(null);
        this.f49400h.stop();
        this.f49401i.setController(null);
        m73318s0();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Boolean m73314o0() {
        return Boolean.valueOf(this.f49404l.isShowing());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f49403k = findViewById(g5c0.f100757N1);
        this.f49396d = (VDraweeView) findViewById(g5c0.f100793R1);
        this.f49397e = (VDraweeView) findViewById(g5c0.f100784Q1);
        this.f49398f = (VDraweeView) findViewById(g5c0.f100775P1);
        this.f49399g = (VDraweeView) findViewById(g5c0.f100766O1);
        this.f49400h = (VideoEffectPlayer) findViewById(g5c0.f100983l0);
        this.f49401i = (VDraweeView) findViewById(g5c0.f100973k0);
        this.f49402j = (XEGiftView) findViewById(g5c0.f100992m0);
        this.f49400h.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m73315p0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (this.f49404l.isShowing()) {
            if ("loop".equals(bLiveUserCardWholeFrameConfig.playType)) {
                m73310B0(bLiveUserCardWholeFrameConfig);
            } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
                xdl0.m208344M(this.f49402j, true);
            } else {
                xdl0.m208344M(this.f49401i, true);
                hxs.m133406s("context_single_room", this.f49401i, bLiveUserCardWholeFrameConfig.staticUrl);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Boolean m73316q0() {
        return Boolean.valueOf(this.f49404l.isShowing());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m73317r0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (this.f49404l.isShowing()) {
            if ("loop".equals(bLiveUserCardWholeFrameConfig.playType)) {
                m73320u0(bLiveUserCardWholeFrameConfig);
            } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
                xdl0.m208344M(this.f49400h, true);
            } else {
                xdl0.m208344M(this.f49401i, true);
                hxs.m133406s("context_single_room", this.f49401i, bLiveUserCardWholeFrameConfig.staticUrl);
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m73318s0() {
        xdl0.m208344M(this.f49398f, false);
        xdl0.m208344M(this.f49399g, false);
        xdl0.m208344M(this.f49396d, false);
        xdl0.m208344M(this.f49397e, false);
        xdl0.m208344M(this.f49401i, false);
        xdl0.m208344M(this.f49400h, false);
    }

    public void setDialogHost(final LiveMenuDialogHolder liveMenuDialogHolder) {
        this.f49404l = liveMenuDialogHolder;
        View viewFindViewById = findViewById(g5c0.f100861Y6);
        if (viewFindViewById != null) {
            xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.wdu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveUserCardSkinView.m73305h0(liveMenuDialogHolder, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m73319t0(final BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        fge.m121214r(this.f49402j, new dqe(String.valueOf(bLiveUserCardWholeFrameConfig.resourceId)).m113019m(new v9j() { // from class: l.zdu
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f202718a.m73314o0();
            }
        }).m113016j(bLiveUserCardWholeFrameConfig.dynamicEffectExtends).m113015i(new d30() { // from class: l.aeu
            @Override // p149l.d30
            public final void call() {
                this.f69098a.m73315p0(bLiveUserCardWholeFrameConfig);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m73320u0(final BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        String strValueOf = String.valueOf(bLiveUserCardWholeFrameConfig.resourceId);
        xdl0.m208344M(this.f49401i, false);
        f6l0.m119627n(this.f49400h, new dqe(strValueOf).m113019m(new v9j() { // from class: l.xdu
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f192465a.m73316q0();
            }
        }).m113015i(new d30() { // from class: l.ydu
            @Override // p149l.d30
            public final void call() {
                this.f197638a.m73317r0(bLiveUserCardWholeFrameConfig);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m73321v0(mqv<User> mqvVar, View view) {
        if (!m73312m0() || d1t.m109678a(mqvVar).m109681d()) {
            view.setBackground(kvc0.m147353b(i3c0.f111117p));
        } else {
            view.setBackground(kvc0.m147353b(i3c0.f111129q));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m73322w0(VDraweeView vDraweeView, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(vDraweeView, false);
            return;
        }
        xdl0.m208344M(vDraweeView, true);
        if (!z) {
            dck0.m110722g(str, vDraweeView);
        } else {
            vDraweeView.getHierarchy().m112075v(new PointF(0.5f, 0.0f));
            hxs.m133406s("context_single_room", vDraweeView, str);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m73323y0(mqv<User> mqvVar, View view) {
        BLiveMaskProfileConfig bLiveMaskProfileConfig;
        if (mqvVar == null || !(mqvVar.m156004g() instanceof d1t)) {
            bLiveMaskProfileConfig = (mqvVar == null || !(mqvVar.m156004g() instanceof hxn0)) ? null : hxn0.m133350c(mqvVar).f109896b.profileConfig;
        } else {
            bLiveMaskProfileConfig = d1t.m109678a(mqvVar).f83297a.profileConfig;
        }
        if (bLiveMaskProfileConfig == null) {
            m73318s0();
            return;
        }
        if (bLiveMaskProfileConfig.profileVersion == 2 || (uvr.m196087d().m162666E1() && bLiveMaskProfileConfig.profileVersion == 1)) {
            m73310B0(bLiveMaskProfileConfig.wholeFrameConfig);
        } else if (bLiveMaskProfileConfig.profileVersion == 1) {
            m73324z0(bLiveMaskProfileConfig.wholeFrameConfig);
        } else {
            m73322w0(this.f49396d, bLiveMaskProfileConfig.topFrameConfig.staticUrl, false);
            m73322w0(this.f49397e, bLiveMaskProfileConfig.topFrameConfig.dynamicUrl, false);
            m73322w0(this.f49398f, bLiveMaskProfileConfig.backgroundPictureConfig.staticUrl, true);
            m73322w0(this.f49399g, bLiveMaskProfileConfig.backgroundPictureConfig.dynamicUrl, true);
        }
        m73321v0(mqvVar, view);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m73324z0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (bLiveUserCardWholeFrameConfig == null) {
            xdl0.m208344M(this.f49400h, false);
            xdl0.m208344M(this.f49401i, false);
        } else if (bLiveUserCardWholeFrameConfig.resourceId > 0) {
            m73320u0(bLiveUserCardWholeFrameConfig);
        } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
            xdl0.m208344M(this.f49400h, false);
            xdl0.m208344M(this.f49401i, false);
        } else {
            xdl0.m208344M(this.f49401i, true);
            hxs.m133406s("context_single_room", this.f49401i, bLiveUserCardWholeFrameConfig.staticUrl);
        }
    }

    public LiveUserCardSkinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveUserCardSkinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
