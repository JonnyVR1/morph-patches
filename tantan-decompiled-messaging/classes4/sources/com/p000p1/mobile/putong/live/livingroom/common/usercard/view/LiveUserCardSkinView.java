package com.p000p1.mobile.putong.live.livingroom.common.usercard.view;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveMaskProfileConfig;
import com.p1.mobile.putong.live.base.data.BLiveUserCardWholeFrameConfig;
import com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p1.mobile.putong.live.base.view.XEGiftView;
import l.d1t;
import l.d30;
import l.hce;
import l.hxn0;
import l.hxs;
import l.kvc0;
import l.mqv;
import l.uvr;
import l.v9j;
import l.xdl0;
import p002l.dck0;
import p002l.dqe;
import p002l.f6l0;
import p002l.fge;
import p002l.g5c0;
import p002l.i3c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveUserCardSkinView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f5438d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5439e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f5440f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5441g;

    /* JADX INFO: renamed from: h */
    public VideoEffectPlayer f5442h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f5443i;

    /* JADX INFO: renamed from: j */
    public XEGiftView f5444j;

    /* JADX INFO: renamed from: k */
    public View f5445k;

    /* JADX INFO: renamed from: l */
    public LiveMenuDialogHolder f5446l;

    public LiveUserCardSkinView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m6841h0(LiveMenuDialogHolder liveMenuDialogHolder, View view) {
        if (liveMenuDialogHolder == null || !liveMenuDialogHolder.isShowing()) {
            return;
        }
        liveMenuDialogHolder.m5217q(null);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m6846B0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (bLiveUserCardWholeFrameConfig == null) {
            xdl0.M(this.f5444j, false);
            xdl0.M(this.f5443i, false);
        } else if (bLiveUserCardWholeFrameConfig.resourceId > 0) {
            m6855t0(bLiveUserCardWholeFrameConfig);
        } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
            xdl0.M(this.f5444j, false);
            xdl0.M(this.f5443i, false);
        } else {
            xdl0.M(this.f5443i, true);
            hxs.s("context_single_room", this.f5443i, bLiveUserCardWholeFrameConfig.staticUrl);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m6847D0(View view, boolean z) {
        boolean z2 = xdl0.O0(this.f5440f) || xdl0.O0(this.f5441g);
        view.setBackground(z2 ? null : kvc0.b(i3c0.f12455C8));
        View view2 = this.f5445k;
        if (z) {
            xdl0.M(view2, false);
        } else {
            xdl0.M(view2, z2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m6848m0() {
        return xdl0.O0(this.f5440f) || xdl0.O0(this.f5438d) || xdl0.O0(this.f5441g) || xdl0.O0(this.f5439e);
    }

    /* JADX INFO: renamed from: n0 */
    public void m6849n0() {
        this.f5438d.setController((hce) null);
        this.f5439e.setController((hce) null);
        this.f5440f.setController((hce) null);
        this.f5441g.setController((hce) null);
        this.f5442h.stop();
        this.f5443i.setController((hce) null);
        m6854s0();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Boolean m6850o0() {
        return Boolean.valueOf(this.f5446l.isShowing());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f5445k = findViewById(g5c0.f10907N1);
        this.f5438d = findViewById(g5c0.f10943R1);
        this.f5439e = findViewById(g5c0.f10934Q1);
        this.f5440f = findViewById(g5c0.f10925P1);
        this.f5441g = findViewById(g5c0.f10916O1);
        this.f5442h = findViewById(g5c0.f11133l0);
        this.f5443i = findViewById(g5c0.f11123k0);
        this.f5444j = findViewById(g5c0.f11142m0);
        this.f5442h.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m6851p0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (this.f5446l.isShowing()) {
            if ("loop".equals(bLiveUserCardWholeFrameConfig.playType)) {
                m6846B0(bLiveUserCardWholeFrameConfig);
            } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
                xdl0.M(this.f5444j, true);
            } else {
                xdl0.M(this.f5443i, true);
                hxs.s("context_single_room", this.f5443i, bLiveUserCardWholeFrameConfig.staticUrl);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Boolean m6852q0() {
        return Boolean.valueOf(this.f5446l.isShowing());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m6853r0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (this.f5446l.isShowing()) {
            if ("loop".equals(bLiveUserCardWholeFrameConfig.playType)) {
                m6856u0(bLiveUserCardWholeFrameConfig);
            } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
                xdl0.M(this.f5442h, true);
            } else {
                xdl0.M(this.f5443i, true);
                hxs.s("context_single_room", this.f5443i, bLiveUserCardWholeFrameConfig.staticUrl);
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m6854s0() {
        xdl0.M(this.f5440f, false);
        xdl0.M(this.f5441g, false);
        xdl0.M(this.f5438d, false);
        xdl0.M(this.f5439e, false);
        xdl0.M(this.f5443i, false);
        xdl0.M(this.f5442h, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDialogHost(final LiveMenuDialogHolder liveMenuDialogHolder) {
        this.f5446l = liveMenuDialogHolder;
        View viewFindViewById = findViewById(g5c0.f11011Y6);
        if (viewFindViewById != null) {
            xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.wdu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveUserCardSkinView.m6841h0(liveMenuDialogHolder, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m6855t0(final BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        fge.m13166r(this.f5444j, new dqe(String.valueOf(bLiveUserCardWholeFrameConfig.resourceId)).m11991m(new v9j() { // from class: l.zdu
            public final Object call() {
                return this.f23355a.m6850o0();
            }
        }).m11988j(bLiveUserCardWholeFrameConfig.dynamicEffectExtends).m11987i(new d30() { // from class: l.aeu
            public final void call() {
                this.f7528a.m6851p0(bLiveUserCardWholeFrameConfig);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m6856u0(final BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        String strValueOf = String.valueOf(bLiveUserCardWholeFrameConfig.resourceId);
        xdl0.M(this.f5443i, false);
        f6l0.m12964n(this.f5442h, new dqe(strValueOf).m11991m(new v9j() { // from class: l.xdu
            public final Object call() {
                return this.f22241a.m6852q0();
            }
        }).m11987i(new d30() { // from class: l.ydu
            public final void call() {
                this.f22814a.m6853r0(bLiveUserCardWholeFrameConfig);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m6857v0(mqv<User> mqvVar, View view) {
        if (!m6848m0() || d1t.a(mqvVar).d()) {
            view.setBackground(kvc0.b(i3c0.f12902p));
        } else {
            view.setBackground(kvc0.b(i3c0.f12914q));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m6858w0(VDraweeView vDraweeView, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            xdl0.M(vDraweeView, false);
            return;
        }
        xdl0.M(vDraweeView, true);
        if (!z) {
            dck0.m11739g(str, vDraweeView);
        } else {
            vDraweeView.getHierarchy().v(new PointF(0.5f, 0.0f));
            hxs.s("context_single_room", vDraweeView, str);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m6859y0(mqv<User> mqvVar, View view) {
        BLiveMaskProfileConfig bLiveMaskProfileConfig;
        if (mqvVar == null || !(mqvVar.g() instanceof d1t)) {
            bLiveMaskProfileConfig = (mqvVar == null || !(mqvVar.g() instanceof hxn0)) ? null : hxn0.c(mqvVar).b.profileConfig;
        } else {
            bLiveMaskProfileConfig = d1t.a(mqvVar).a.profileConfig;
        }
        if (bLiveMaskProfileConfig == null) {
            m6854s0();
            return;
        }
        if (bLiveMaskProfileConfig.profileVersion == 2 || (uvr.d().E1() && bLiveMaskProfileConfig.profileVersion == 1)) {
            m6846B0(bLiveMaskProfileConfig.wholeFrameConfig);
        } else if (bLiveMaskProfileConfig.profileVersion == 1) {
            m6860z0(bLiveMaskProfileConfig.wholeFrameConfig);
        } else {
            m6858w0(this.f5438d, bLiveMaskProfileConfig.topFrameConfig.staticUrl, false);
            m6858w0(this.f5439e, bLiveMaskProfileConfig.topFrameConfig.dynamicUrl, false);
            m6858w0(this.f5440f, bLiveMaskProfileConfig.backgroundPictureConfig.staticUrl, true);
            m6858w0(this.f5441g, bLiveMaskProfileConfig.backgroundPictureConfig.dynamicUrl, true);
        }
        m6857v0(mqvVar, view);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m6860z0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (bLiveUserCardWholeFrameConfig == null) {
            xdl0.M(this.f5442h, false);
            xdl0.M(this.f5443i, false);
        } else if (bLiveUserCardWholeFrameConfig.resourceId > 0) {
            m6856u0(bLiveUserCardWholeFrameConfig);
        } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
            xdl0.M(this.f5442h, false);
            xdl0.M(this.f5443i, false);
        } else {
            xdl0.M(this.f5443i, true);
            hxs.s("context_single_room", this.f5443i, bLiveUserCardWholeFrameConfig.staticUrl);
        }
    }

    public LiveUserCardSkinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveUserCardSkinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
