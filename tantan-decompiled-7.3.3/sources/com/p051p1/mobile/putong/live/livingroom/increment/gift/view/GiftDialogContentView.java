package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

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
import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p151v.VDraweeView;
import p153l.bjs;
import p153l.bnl0;
import p153l.bqj;
import p153l.cqj;
import p153l.cwj;
import p153l.e060;
import p153l.eoj;
import p153l.jjs;
import p153l.kpj;
import p153l.pcj;
import p153l.qzj;
import p153l.vrj;
import p153l.wft;
import p153l.x20;
import p153l.xxj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogContentView extends ConstraintLayout implements eoj {

    /* JADX INFO: renamed from: d */
    public View f51116d;

    /* JADX INFO: renamed from: e */
    public GiftDialogSkinView f51117e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f51118f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51119g;

    /* JADX INFO: renamed from: h */
    public Space f51120h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f51121i;

    /* JADX INFO: renamed from: j */
    public ReceiveGiftUsersView f51122j;

    /* JADX INFO: renamed from: k */
    public GiftUserInfoView f51123k;

    /* JADX INFO: renamed from: l */
    public GiftUserInfoOfficialView f51124l;

    /* JADX INFO: renamed from: m */
    public GiftWealthLevelView f51125m;

    /* JADX INFO: renamed from: n */
    public PacketProgressView f51126n;

    /* JADX INFO: renamed from: o */
    public GiftDialogGiftsView f51127o;

    /* JADX INFO: renamed from: p */
    public ViewStub f51128p;

    /* JADX INFO: renamed from: q */
    public GiftDialogBottomBar f51129q;

    /* JADX INFO: renamed from: r */
    public GiftDialogShadeLayer f51130r;

    /* JADX INFO: renamed from: s */
    public GiftOperationView f51131s;

    /* JADX INFO: renamed from: t */
    public bjs<?> f51132t;

    /* JADX INFO: renamed from: u */
    public vrj f51133u;

    /* JADX INFO: renamed from: v */
    public GiftDialogGiftsView f51134v;

    /* JADX INFO: renamed from: w */
    public xxj f51135w;

    /* JADX INFO: renamed from: x */
    public boolean f51136x;

    /* JADX INFO: renamed from: y */
    public final vrj.InterfaceC20916c f51137y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView$a */
    public class C13004a implements vrj.InterfaceC20916c {
        public C13004a() {
        }

        @Override // p153l.vrj.InterfaceC20916c
        /* JADX INFO: renamed from: a */
        public void mo75592a(boolean z) {
            if (z && GiftDialogContentView.this.f51134v != null && GiftDialogContentView.this.f51136x) {
                GiftDialogContentView.this.f51134v.m75626R0(GiftDialogContentView.this.f51135w.m213531e());
                GiftDialogContentView.this.f51136x = false;
            }
            if (z && GiftDialogContentView.this.f51134v != null) {
                GiftDialogContentView.this.getCurrentShowGiftPanel().m75629Y0();
                GiftDialogContentView.this.m75588v0();
            }
            if (!z) {
                GiftDialogContentView.this.f51132t.m104725R5();
            }
            GiftDialogContentView.this.f51132t.m213811F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().mo199273j(new cwj(z));
            GiftDialogContentView.this.f51132t.m104712K5();
        }

        @Override // p153l.vrj.InterfaceC20916c
        /* JADX INFO: renamed from: b */
        public void mo75593b() {
            GiftDialogContentView.this.f51132t.m104735Y4();
        }
    }

    public GiftDialogContentView(Context context) {
        super(context);
        this.f51136x = false;
        this.f51137y = new C13004a();
    }

    /* JADX INFO: renamed from: B0 */
    public void m75569B0(xxj xxjVar) {
        GiftDialogGiftsView giftDialogGiftsView;
        this.f51135w = xxjVar;
        this.f51136x = true;
        xxj.C21473a c21473aM213529c = xxjVar.m213529c();
        this.f51129q.m75560p0(this.f51132t, xxjVar.m213534h());
        if (!c21473aM213529c.m213543c()) {
            if (xxjVar.m213528a() || ((giftDialogGiftsView = this.f51134v) != null && bnl0.m105529O0(giftDialogGiftsView))) {
                m75583q0(false);
                m75590y0(true);
                this.f51132t.m213811F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().mo199273j(new cwj(true));
            } else {
                m75590y0(false);
            }
        }
        this.f51127o.m75626R0(xxjVar.m213530d());
        GiftDialogGiftsView giftDialogGiftsView2 = this.f51134v;
        if (giftDialogGiftsView2 != null) {
            giftDialogGiftsView2.m75626R0(xxjVar.m213531e());
        } else {
            m75578N0();
        }
        m75582p0();
    }

    /* JADX INFO: renamed from: D0 */
    public void m75570D0(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        this.f51125m.m75792t1(userLiveHierarchyProgressChange);
    }

    /* JADX INFO: renamed from: E0 */
    public void m75571E0() {
        this.f51127o.m75627S0();
        GiftDialogGiftsView giftDialogGiftsView = this.f51134v;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.m75627S0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m75572G0() {
        bnl0.m105524M(this.f51122j, false);
        bnl0.m105524M(this.f51123k, false);
        bnl0.m105524M(this.f51125m, true);
        bnl0.m105524M(this.f51126n, false);
        bnl0.m105524M(this.f51124l, true);
    }

    /* JADX INFO: renamed from: H0 */
    public void m75573H0(boolean z) {
        this.f51127o.m75628V0(z);
    }

    /* JADX INFO: renamed from: I0 */
    public void m75574I0() {
        m75576K0();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: J0 */
    public void m75575J0() {
        if (this.f51133u == null) {
            this.f51133u = new vrj(this.f51127o);
        }
        this.f51133u.m202507c(this.f51134v);
        this.f51133u.m202510f(this.f51137y);
        this.f51125m.m75791s1();
        if (!this.f51132t.m213810E2().mo183435j().isOfficialShowRoom()) {
            this.f51126n.m75137E0();
        }
        this.f51117e.m75658O();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: K0 */
    public void m75576K0() {
        if (this.f51134v == null) {
            m75583q0(true);
        }
        if (this.f51133u == null) {
            this.f51133u = new vrj(this.f51127o);
        }
        this.f51133u.m202507c(this.f51134v);
        this.f51133u.m202511g(this.f51137y);
        this.f51134v.m75622L0();
        if (this.f51132t.m213810E2().mo183435j().isOfficialShowRoom()) {
            bnl0.m105524M(this.f51124l, true);
        } else {
            this.f51126n.m75138G0();
        }
        this.f51125m.m75790r1();
        this.f51117e.m75657N();
    }

    /* JADX INFO: renamed from: L0 */
    public void m75577L0() {
        qzj.m178799p(this.f51132t.mo78457R2());
        if (this.f51132t.m104733X4()) {
            qzj.m178796m(this.f51132t.mo78457R2());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m75578N0() {
        if (this.f51134v != null) {
            return;
        }
        Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.zpj
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return this.f205475a.m75587u0();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m75579O0(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        GiftDialogGiftsView giftDialogGiftsView = this.f51134v;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.m75630a1(jjsVar, bLiveGivenGiftBrief);
        }
        GiftDialogGiftsView giftDialogGiftsView2 = this.f51127o;
        if (giftDialogGiftsView2 != null) {
            giftDialogGiftsView2.m75630a1(jjsVar, bLiveGivenGiftBrief);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75580b() {
        this.f51127o.m75631b();
        GiftDialogGiftsView giftDialogGiftsView = this.f51134v;
        if (giftDialogGiftsView != null) {
            bnl0.m105524M(giftDialogGiftsView, false);
            this.f51134v.m75631b();
        }
        if (this.f51133u == null) {
            this.f51133u = new vrj(this.f51127o);
        }
        this.f51133u.m202509e();
        this.f51125m.m75777b();
        this.f51126n.m75141b();
        this.f51117e.m75649F();
    }

    @Override // p153l.eoj
    /* JADX INFO: renamed from: e0 */
    public void mo70552e0() {
        m75575J0();
    }

    public GiftDialogGiftsView getCurrentShowGiftPanel() {
        GiftDialogGiftsView giftDialogGiftsView = this.f51134v;
        return (giftDialogGiftsView == null || !bnl0.m105529O0(giftDialogGiftsView)) ? this.f51127o : this.f51134v;
    }

    public e060 getFlyDestination() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        VDraweeView vDraweeView = this.f51118f;
        if (vDraweeView != null) {
            vDraweeView.getLocationOnScreen(iArr);
            iArr[0] = bnl0.m105592y0() / 2;
        }
        GiftDialogGiftsView giftDialogGiftsView = this.f51127o;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.getLocationOnScreen(iArr2);
            iArr2[0] = bnl0.m105592y0() / 2;
        }
        return new e060(iArr, iArr2);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m75581o0(View view) {
        bqj.m105943a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75581o0(this);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        bjs<?> bjsVar;
        super.onWindowFocusChanged(z);
        if (!z || (bjsVar = this.f51132t) == null) {
            return;
        }
        bjsVar.m104755l6();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m75582p0() {
        GiftDialogGiftsView giftDialogGiftsView = this.f51134v;
        if (giftDialogGiftsView == null || !bnl0.m105529O0(giftDialogGiftsView)) {
            this.f51125m.setPacketPanelShowingFlag(false);
        } else {
            this.f51132t.m213811F2().GiftDialogEventGroup.giftDialogShowWithPacketPanel().m199277p();
            this.f51125m.setPacketPanelShowingFlag(true);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m75583q0(boolean z) {
        if (this.f51134v == null) {
            GiftDialogGiftsView giftDialogGiftsView = (GiftDialogGiftsView) this.f51128p.inflate();
            this.f51134v = giftDialogGiftsView;
            giftDialogGiftsView.m75634z0(this.f51132t, this, true);
            if (z) {
                bnl0.m105525M0(this.f51134v, false);
                this.f51134v.m75626R0(this.f51135w.m213531e());
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m75584r0(bjs<?> bjsVar, final x20 x20Var) {
        this.f51132t = bjsVar;
        this.f51116d.setOnClickListener(new View.OnClickListener() { // from class: l.aqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        this.f51129q.m75558n0(bjsVar);
        this.f51127o.m75634z0(bjsVar, this, false);
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m75585s0() {
        GiftDialogGiftsView giftDialogGiftsView = this.f51134v;
        return giftDialogGiftsView != null && bnl0.m105529O0(giftDialogGiftsView);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.oo2] */
    /* JADX INFO: renamed from: t0 */
    public final boolean m75586t0() {
        if (this.f51132t == null) {
            return false;
        }
        return wft.m206159b(3) || !this.f51132t.m213810E2().m168498Z0();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean m75587u0() {
        m75583q0(true);
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public void m75588v0() {
        getCurrentShowGiftPanel().m75620J0();
    }

    /* JADX INFO: renamed from: w0 */
    public void m75589w0(kpj kpjVar) {
        if (!kpjVar.m150733e() || !m75586t0()) {
            bnl0.m105524M(this.f51125m, false);
        } else {
            bnl0.m105524M(this.f51125m, true);
            this.f51125m.m75785l1(this.f51132t, kpjVar);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m75590y0(boolean z) {
        GiftDialogGiftsView giftDialogGiftsView = this.f51134v;
        if (giftDialogGiftsView != null) {
            bnl0.m105525M0(giftDialogGiftsView, z);
            this.f51134v.setTranslationX(0.0f);
        }
        bnl0.m105525M0(this.f51127o, !z);
        this.f51127o.setTranslationX(0.0f);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: z0 */
    public void m75591z0(@Nullable cqj cqjVar, int i) {
        if (!NullChecker.m82486a(cqjVar) || !NullChecker.m82486a(cqjVar.m111918g().f82889e)) {
            bnl0.m105524M(this.f51123k, false);
            bnl0.m105524M(this.f51122j, false);
            return;
        }
        cqjVar.m111918g().f82887c = this.f51132t.m213810E2().mo183435j().isVoiceLive();
        if (this.f51132t.m213810E2().mo183435j().isVoiceLive()) {
            bnl0.m105524M(this.f51122j, true);
            this.f51122j.m75171Z(cqjVar, this.f51132t.mo104702F4(), i);
            return;
        }
        bnl0.m105524M(this.f51123k, true);
        GiftUserInfoView giftUserInfoView = this.f51123k;
        final bjs<?> bjsVar = this.f51132t;
        Objects.requireNonNull(bjsVar);
        giftUserInfoView.m75727t0(cqjVar, new pcj() { // from class: l.ypj
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return bjsVar.mo104702F4();
            }
        });
    }

    public GiftDialogContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51136x = false;
        this.f51137y = new C13004a();
    }
}
