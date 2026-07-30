package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p147v.VDraweeView;
import p149l.ahs;
import p149l.axj;
import p149l.d30;
import p149l.fpj;
import p149l.hvj;
import p149l.ihs;
import p149l.lnj;
import p149l.mnj;
import p149l.mtj;
import p149l.olj;
import p149l.umj;
import p149l.v9j;
import p149l.vdt;
import p149l.xdl0;
import p149l.yr50;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogContentView extends ConstraintLayout implements olj {

    /* JADX INFO: renamed from: d */
    public View f50268d;

    /* JADX INFO: renamed from: e */
    public GiftDialogSkinView f50269e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f50270f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50271g;

    /* JADX INFO: renamed from: h */
    public Space f50272h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f50273i;

    /* JADX INFO: renamed from: j */
    public ReceiveGiftUsersView f50274j;

    /* JADX INFO: renamed from: k */
    public GiftUserInfoView f50275k;

    /* JADX INFO: renamed from: l */
    public GiftUserInfoOfficialView f50276l;

    /* JADX INFO: renamed from: m */
    public GiftWealthLevelView f50277m;

    /* JADX INFO: renamed from: n */
    public PacketProgressView f50278n;

    /* JADX INFO: renamed from: o */
    public GiftDialogGiftsView f50279o;

    /* JADX INFO: renamed from: p */
    public ViewStub f50280p;

    /* JADX INFO: renamed from: q */
    public GiftDialogBottomBar f50281q;

    /* JADX INFO: renamed from: r */
    public GiftDialogShadeLayer f50282r;

    /* JADX INFO: renamed from: s */
    public GiftOperationView f50283s;

    /* JADX INFO: renamed from: t */
    public ahs<?> f50284t;

    /* JADX INFO: renamed from: u */
    public fpj f50285u;

    /* JADX INFO: renamed from: v */
    public GiftDialogGiftsView f50286v;

    /* JADX INFO: renamed from: w */
    public hvj f50287w;

    /* JADX INFO: renamed from: x */
    public boolean f50288x;

    /* JADX INFO: renamed from: y */
    public final fpj.InterfaceC16905c f50289y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView$a */
    public class C12841a implements fpj.InterfaceC16905c {
        public C12841a() {
        }

        @Override // p149l.fpj.InterfaceC16905c
        /* JADX INFO: renamed from: a */
        public void mo74409a(boolean z) {
            if (z && GiftDialogContentView.this.f50286v != null && GiftDialogContentView.this.f50288x) {
                GiftDialogContentView.this.f50286v.m74443R0(GiftDialogContentView.this.f50287w.m133172e());
                GiftDialogContentView.this.f50288x = false;
            }
            if (z && GiftDialogContentView.this.f50286v != null) {
                GiftDialogContentView.this.getCurrentShowGiftPanel().m74446Y0();
                GiftDialogContentView.this.m74405v0();
            }
            if (!z) {
                GiftDialogContentView.this.f50284t.m96638R5();
            }
            GiftDialogContentView.this.f50284t.m206028F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().mo172463j(new mtj(z));
            GiftDialogContentView.this.f50284t.m96625K5();
        }

        @Override // p149l.fpj.InterfaceC16905c
        /* JADX INFO: renamed from: b */
        public void mo74410b() {
            GiftDialogContentView.this.f50284t.m96648Y4();
        }
    }

    public GiftDialogContentView(Context context) {
        super(context);
        this.f50288x = false;
        this.f50289y = new C12841a();
    }

    /* JADX INFO: renamed from: B0 */
    public void m74386B0(hvj hvjVar) {
        GiftDialogGiftsView giftDialogGiftsView;
        this.f50287w = hvjVar;
        this.f50288x = true;
        hvj.C17412a c17412aM133170c = hvjVar.m133170c();
        this.f50281q.m74377p0(this.f50284t, hvjVar.m133175h());
        if (!c17412aM133170c.m133184c()) {
            if (hvjVar.m133169a() || ((giftDialogGiftsView = this.f50286v) != null && xdl0.m208349O0(giftDialogGiftsView))) {
                m74400q0(false);
                m74407y0(true);
                this.f50284t.m206028F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().mo172463j(new mtj(true));
            } else {
                m74407y0(false);
            }
        }
        this.f50279o.m74443R0(hvjVar.m133171d());
        GiftDialogGiftsView giftDialogGiftsView2 = this.f50286v;
        if (giftDialogGiftsView2 != null) {
            giftDialogGiftsView2.m74443R0(hvjVar.m133172e());
        } else {
            m74395N0();
        }
        m74399p0();
    }

    /* JADX INFO: renamed from: D0 */
    public void m74387D0(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        this.f50277m.m74609t1(userLiveHierarchyProgressChange);
    }

    /* JADX INFO: renamed from: E0 */
    public void m74388E0() {
        this.f50279o.m74444S0();
        GiftDialogGiftsView giftDialogGiftsView = this.f50286v;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.m74444S0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m74389G0() {
        xdl0.m208344M(this.f50274j, false);
        xdl0.m208344M(this.f50275k, false);
        xdl0.m208344M(this.f50277m, true);
        xdl0.m208344M(this.f50278n, false);
        xdl0.m208344M(this.f50276l, true);
    }

    /* JADX INFO: renamed from: H0 */
    public void m74390H0(boolean z) {
        this.f50279o.m74445V0(z);
    }

    /* JADX INFO: renamed from: I0 */
    public void m74391I0() {
        m74393K0();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: J0 */
    public void m74392J0() {
        if (this.f50285u == null) {
            this.f50285u = new fpj(this.f50279o);
        }
        this.f50285u.m122606c(this.f50286v);
        this.f50285u.m122609f(this.f50289y);
        this.f50277m.m74608s1();
        if (!this.f50284t.m206027E2().mo149813j().isOfficialShowRoom()) {
            this.f50278n.m73954E0();
        }
        this.f50269e.m74475O();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K0 */
    public void m74393K0() {
        if (this.f50286v == null) {
            m74400q0(true);
        }
        if (this.f50285u == null) {
            this.f50285u = new fpj(this.f50279o);
        }
        this.f50285u.m122606c(this.f50286v);
        this.f50285u.m122610g(this.f50289y);
        this.f50286v.m74439L0();
        if (this.f50284t.m206027E2().mo149813j().isOfficialShowRoom()) {
            xdl0.m208344M(this.f50276l, true);
        } else {
            this.f50278n.m73955G0();
        }
        this.f50277m.m74607r1();
        this.f50269e.m74474N();
    }

    /* JADX INFO: renamed from: L0 */
    public void m74394L0() {
        axj.m99442p(this.f50284t.mo77274R2());
        if (this.f50284t.m96646X4()) {
            axj.m99439m(this.f50284t.mo77274R2());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m74395N0() {
        if (this.f50286v != null) {
            return;
        }
        Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.jnj
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return this.f118856a.m74404u0();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m74396O0(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        GiftDialogGiftsView giftDialogGiftsView = this.f50286v;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.m74447a1(ihsVar, bLiveGivenGiftBrief);
        }
        GiftDialogGiftsView giftDialogGiftsView2 = this.f50279o;
        if (giftDialogGiftsView2 != null) {
            giftDialogGiftsView2.m74447a1(ihsVar, bLiveGivenGiftBrief);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m74397b() {
        this.f50279o.m74448b();
        GiftDialogGiftsView giftDialogGiftsView = this.f50286v;
        if (giftDialogGiftsView != null) {
            xdl0.m208344M(giftDialogGiftsView, false);
            this.f50286v.m74448b();
        }
        if (this.f50285u == null) {
            this.f50285u = new fpj(this.f50279o);
        }
        this.f50285u.m122608e();
        this.f50277m.m74594b();
        this.f50278n.m73958b();
        this.f50269e.m74466F();
    }

    @Override // p149l.olj
    /* JADX INFO: renamed from: e0 */
    public void mo69369e0() {
        m74392J0();
    }

    public GiftDialogGiftsView getCurrentShowGiftPanel() {
        GiftDialogGiftsView giftDialogGiftsView = this.f50286v;
        return (giftDialogGiftsView == null || !xdl0.m208349O0(giftDialogGiftsView)) ? this.f50279o : this.f50286v;
    }

    public yr50 getFlyDestination() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        VDraweeView vDraweeView = this.f50270f;
        if (vDraweeView != null) {
            vDraweeView.getLocationOnScreen(iArr);
            iArr[0] = xdl0.m208412y0() / 2;
        }
        GiftDialogGiftsView giftDialogGiftsView = this.f50279o;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.getLocationOnScreen(iArr2);
            iArr2[0] = xdl0.m208412y0() / 2;
        }
        return new yr50(iArr, iArr2);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m74398o0(View view) {
        lnj.m150690a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74398o0(this);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        ahs<?> ahsVar;
        super.onWindowFocusChanged(z);
        if (!z || (ahsVar = this.f50284t) == null) {
            return;
        }
        ahsVar.m96668l6();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m74399p0() {
        GiftDialogGiftsView giftDialogGiftsView = this.f50286v;
        if (giftDialogGiftsView == null || !xdl0.m208349O0(giftDialogGiftsView)) {
            this.f50277m.setPacketPanelShowingFlag(false);
        } else {
            this.f50284t.m206028F2().GiftDialogEventGroup.giftDialogShowWithPacketPanel().m172467p();
            this.f50277m.setPacketPanelShowingFlag(true);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m74400q0(boolean z) {
        if (this.f50286v == null) {
            GiftDialogGiftsView giftDialogGiftsView = (GiftDialogGiftsView) this.f50280p.inflate();
            this.f50286v = giftDialogGiftsView;
            giftDialogGiftsView.m74451z0(this.f50284t, this, true);
            if (z) {
                xdl0.m208345M0(this.f50286v, false);
                this.f50286v.m74443R0(this.f50287w.m133172e());
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m74401r0(ahs<?> ahsVar, final d30 d30Var) {
        this.f50284t = ahsVar;
        this.f50268d.setOnClickListener(new View.OnClickListener() { // from class: l.knj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        this.f50281q.m74375n0(ahsVar);
        this.f50279o.m74451z0(ahsVar, this, false);
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m74402s0() {
        GiftDialogGiftsView giftDialogGiftsView = this.f50286v;
        return giftDialogGiftsView != null && xdl0.m208349O0(giftDialogGiftsView);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2] */
    /* JADX INFO: renamed from: t0 */
    public final boolean m74403t0() {
        if (this.f50284t == null) {
            return false;
        }
        return vdt.m198092b(3) || !this.f50284t.m206027E2().m132112Z0();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean m74404u0() {
        m74400q0(true);
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public void m74405v0() {
        getCurrentShowGiftPanel().m74437J0();
    }

    /* JADX INFO: renamed from: w0 */
    public void m74406w0(umj umjVar) {
        if (!umjVar.m194368e() || !m74403t0()) {
            xdl0.m208344M(this.f50277m, false);
        } else {
            xdl0.m208344M(this.f50277m, true);
            this.f50277m.m74602l1(this.f50284t, umjVar);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m74407y0(boolean z) {
        GiftDialogGiftsView giftDialogGiftsView = this.f50286v;
        if (giftDialogGiftsView != null) {
            xdl0.m208345M0(giftDialogGiftsView, z);
            this.f50286v.setTranslationX(0.0f);
        }
        xdl0.m208345M0(this.f50279o, !z);
        this.f50279o.setTranslationX(0.0f);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: z0 */
    public void m74408z0(@Nullable mnj mnjVar, int i) {
        if (!NullChecker.m81303a(mnjVar) || !NullChecker.m81303a(mnjVar.m155518g().f134444e)) {
            xdl0.m208344M(this.f50275k, false);
            xdl0.m208344M(this.f50274j, false);
            return;
        }
        mnjVar.m155518g().f134442c = this.f50284t.m206027E2().mo149813j().isVoiceLive();
        if (this.f50284t.m206027E2().mo149813j().isVoiceLive()) {
            xdl0.m208344M(this.f50274j, true);
            this.f50274j.m73988Z(mnjVar, this.f50284t.mo96615F4(), i);
            return;
        }
        xdl0.m208344M(this.f50275k, true);
        GiftUserInfoView giftUserInfoView = this.f50275k;
        final ahs<?> ahsVar = this.f50284t;
        Objects.requireNonNull(ahsVar);
        giftUserInfoView.m74544t0(mnjVar, new v9j() { // from class: l.inj
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ahsVar.mo96615F4();
            }
        });
    }

    public GiftDialogContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50288x = false;
        this.f50289y = new C12841a();
    }
}
