package com.p051p1.mobile.putong.live.livingroom.common.usercard.view;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMaskProfileConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardWholeFrameConfig;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.e3t;
import p153l.hre;
import p153l.izs;
import p153l.jfl0;
import p153l.jhe;
import p153l.jlk0;
import p153l.l6o0;
import p153l.mdc0;
import p153l.n3d0;
import p153l.nsv;
import p153l.obc0;
import p153l.pcj;
import p153l.vxr;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveUserCardSkinView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f50244d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50245e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f50246f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50247g;

    /* JADX INFO: renamed from: h */
    public VideoEffectPlayer f50248h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f50249i;

    /* JADX INFO: renamed from: j */
    public XEGiftView f50250j;

    /* JADX INFO: renamed from: k */
    public View f50251k;

    /* JADX INFO: renamed from: l */
    public LiveMenuDialogHolder f50252l;

    public LiveUserCardSkinView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m74488h0(LiveMenuDialogHolder liveMenuDialogHolder, View view) {
        if (liveMenuDialogHolder == null || !liveMenuDialogHolder.isShowing()) {
            return;
        }
        liveMenuDialogHolder.m73022q(null);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m74493B0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (bLiveUserCardWholeFrameConfig == null) {
            bnl0.m105524M(this.f50250j, false);
            bnl0.m105524M(this.f50249i, false);
        } else if (bLiveUserCardWholeFrameConfig.resourceId > 0) {
            m74502t0(bLiveUserCardWholeFrameConfig);
        } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
            bnl0.m105524M(this.f50250j, false);
            bnl0.m105524M(this.f50249i, false);
        } else {
            bnl0.m105524M(this.f50249i, true);
            izs.m142868s("context_single_room", this.f50249i, bLiveUserCardWholeFrameConfig.staticUrl);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m74494D0(View view, boolean z) {
        boolean z2 = bnl0.m105529O0(this.f50246f) || bnl0.m105529O0(this.f50247g);
        view.setBackground(z2 ? null : n3d0.m161278b(obc0.f145998C8));
        View view2 = this.f50251k;
        if (z) {
            bnl0.m105524M(view2, false);
        } else {
            bnl0.m105524M(view2, z2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m74495m0() {
        return bnl0.m105529O0(this.f50246f) || bnl0.m105529O0(this.f50244d) || bnl0.m105529O0(this.f50247g) || bnl0.m105529O0(this.f50245e);
    }

    /* JADX INFO: renamed from: n0 */
    public void m74496n0() {
        this.f50244d.setController(null);
        this.f50245e.setController(null);
        this.f50246f.setController(null);
        this.f50247g.setController(null);
        this.f50248h.stop();
        this.f50249i.setController(null);
        m74501s0();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Boolean m74497o0() {
        return Boolean.valueOf(this.f50252l.isShowing());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f50251k = findViewById(mdc0.f136002N1);
        this.f50244d = (VDraweeView) findViewById(mdc0.f136038R1);
        this.f50245e = (VDraweeView) findViewById(mdc0.f136029Q1);
        this.f50246f = (VDraweeView) findViewById(mdc0.f136020P1);
        this.f50247g = (VDraweeView) findViewById(mdc0.f136011O1);
        this.f50248h = (VideoEffectPlayer) findViewById(mdc0.f136228l0);
        this.f50249i = (VDraweeView) findViewById(mdc0.f136218k0);
        this.f50250j = (XEGiftView) findViewById(mdc0.f136237m0);
        this.f50248h.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m74498p0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (this.f50252l.isShowing()) {
            if ("loop".equals(bLiveUserCardWholeFrameConfig.playType)) {
                m74493B0(bLiveUserCardWholeFrameConfig);
            } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
                bnl0.m105524M(this.f50250j, true);
            } else {
                bnl0.m105524M(this.f50249i, true);
                izs.m142868s("context_single_room", this.f50249i, bLiveUserCardWholeFrameConfig.staticUrl);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Boolean m74499q0() {
        return Boolean.valueOf(this.f50252l.isShowing());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m74500r0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (this.f50252l.isShowing()) {
            if ("loop".equals(bLiveUserCardWholeFrameConfig.playType)) {
                m74503u0(bLiveUserCardWholeFrameConfig);
            } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
                bnl0.m105524M(this.f50248h, true);
            } else {
                bnl0.m105524M(this.f50249i, true);
                izs.m142868s("context_single_room", this.f50249i, bLiveUserCardWholeFrameConfig.staticUrl);
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m74501s0() {
        bnl0.m105524M(this.f50246f, false);
        bnl0.m105524M(this.f50247g, false);
        bnl0.m105524M(this.f50244d, false);
        bnl0.m105524M(this.f50245e, false);
        bnl0.m105524M(this.f50249i, false);
        bnl0.m105524M(this.f50248h, false);
    }

    public void setDialogHost(final LiveMenuDialogHolder liveMenuDialogHolder) {
        this.f50252l = liveMenuDialogHolder;
        View viewFindViewById = findViewById(mdc0.f136106Y6);
        if (viewFindViewById != null) {
            bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.xfu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveUserCardSkinView.m74488h0(liveMenuDialogHolder, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m74502t0(final BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        jhe.m144897r(this.f50250j, new hre(String.valueOf(bLiveUserCardWholeFrameConfig.resourceId)).m136830m(new pcj() { // from class: l.agu
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f71284a.m74497o0();
            }
        }).m136827j(bLiveUserCardWholeFrameConfig.dynamicEffectExtends).m136826i(new x20() { // from class: l.bgu
            @Override // p153l.x20
            public final void call() {
                this.f76684a.m74498p0(bLiveUserCardWholeFrameConfig);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m74503u0(final BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        String strValueOf = String.valueOf(bLiveUserCardWholeFrameConfig.resourceId);
        bnl0.m105524M(this.f50249i, false);
        jfl0.m144685n(this.f50248h, new hre(strValueOf).m136830m(new pcj() { // from class: l.yfu
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f199650a.m74499q0();
            }
        }).m136826i(new x20() { // from class: l.zfu
            @Override // p153l.x20
            public final void call() {
                this.f204234a.m74500r0(bLiveUserCardWholeFrameConfig);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m74504v0(nsv<User> nsvVar, View view) {
        if (!m74495m0() || e3t.m119319a(nsvVar).m119322d()) {
            view.setBackground(n3d0.m161278b(obc0.f146445p));
        } else {
            view.setBackground(n3d0.m161278b(obc0.f146457q));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m74505w0(VDraweeView vDraweeView, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(vDraweeView, false);
            return;
        }
        bnl0.m105524M(vDraweeView, true);
        if (!z) {
            jlk0.m146085g(str, vDraweeView);
        } else {
            vDraweeView.getHierarchy().m207061v(new PointF(0.5f, 0.0f));
            izs.m142868s("context_single_room", vDraweeView, str);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m74506y0(nsv<User> nsvVar, View view) {
        BLiveMaskProfileConfig bLiveMaskProfileConfig;
        if (nsvVar == null || !(nsvVar.m164642g() instanceof e3t)) {
            bLiveMaskProfileConfig = (nsvVar == null || !(nsvVar.m164642g() instanceof l6o0)) ? null : l6o0.m153068c(nsvVar).f130275b.profileConfig;
        } else {
            bLiveMaskProfileConfig = e3t.m119319a(nsvVar).f91997a.profileConfig;
        }
        if (bLiveMaskProfileConfig == null) {
            m74501s0();
            return;
        }
        if (bLiveMaskProfileConfig.profileVersion == 2 || (vxr.m203876d().m170973E1() && bLiveMaskProfileConfig.profileVersion == 1)) {
            m74493B0(bLiveMaskProfileConfig.wholeFrameConfig);
        } else if (bLiveMaskProfileConfig.profileVersion == 1) {
            m74507z0(bLiveMaskProfileConfig.wholeFrameConfig);
        } else {
            m74505w0(this.f50244d, bLiveMaskProfileConfig.topFrameConfig.staticUrl, false);
            m74505w0(this.f50245e, bLiveMaskProfileConfig.topFrameConfig.dynamicUrl, false);
            m74505w0(this.f50246f, bLiveMaskProfileConfig.backgroundPictureConfig.staticUrl, true);
            m74505w0(this.f50247g, bLiveMaskProfileConfig.backgroundPictureConfig.dynamicUrl, true);
        }
        m74504v0(nsvVar, view);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m74507z0(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig) {
        if (bLiveUserCardWholeFrameConfig == null) {
            bnl0.m105524M(this.f50248h, false);
            bnl0.m105524M(this.f50249i, false);
        } else if (bLiveUserCardWholeFrameConfig.resourceId > 0) {
            m74503u0(bLiveUserCardWholeFrameConfig);
        } else if (TextUtils.isEmpty(bLiveUserCardWholeFrameConfig.staticUrl)) {
            bnl0.m105524M(this.f50248h, false);
            bnl0.m105524M(this.f50249i, false);
        } else {
            bnl0.m105524M(this.f50249i, true);
            izs.m142868s("context_single_room", this.f50249i, bLiveUserCardWholeFrameConfig.staticUrl);
        }
    }

    public LiveUserCardSkinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveUserCardSkinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
