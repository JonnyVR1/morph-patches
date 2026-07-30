package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

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
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView;
import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.d30;
import l.v9j;
import l.vdt;
import l.xdl0;
import p002l.ahs;
import p002l.axj;
import p002l.fpj;
import p002l.hvj;
import p002l.ihs;
import p002l.lnj;
import p002l.mnj;
import p002l.mtj;
import p002l.olj;
import p002l.umj;
import p002l.yr50;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftDialogContentView extends ConstraintLayout implements olj {

    /* JADX INFO: renamed from: d */
    public View f6310d;

    /* JADX INFO: renamed from: e */
    public GiftDialogSkinView f6311e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f6312f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f6313g;

    /* JADX INFO: renamed from: h */
    public Space f6314h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f6315i;

    /* JADX INFO: renamed from: j */
    public ReceiveGiftUsersView f6316j;

    /* JADX INFO: renamed from: k */
    public GiftUserInfoView f6317k;

    /* JADX INFO: renamed from: l */
    public GiftUserInfoOfficialView f6318l;

    /* JADX INFO: renamed from: m */
    public GiftWealthLevelView f6319m;

    /* JADX INFO: renamed from: n */
    public PacketProgressView f6320n;

    /* JADX INFO: renamed from: o */
    public GiftDialogGiftsView f6321o;

    /* JADX INFO: renamed from: p */
    public ViewStub f6322p;

    /* JADX INFO: renamed from: q */
    public GiftDialogBottomBar f6323q;

    /* JADX INFO: renamed from: r */
    public GiftDialogShadeLayer f6324r;

    /* JADX INFO: renamed from: s */
    public GiftOperationView f6325s;

    /* JADX INFO: renamed from: t */
    public ahs<?> f6326t;

    /* JADX INFO: renamed from: u */
    public fpj f6327u;

    /* JADX INFO: renamed from: v */
    public GiftDialogGiftsView f6328v;

    /* JADX INFO: renamed from: w */
    public hvj f6329w;

    /* JADX INFO: renamed from: x */
    public boolean f6330x;

    /* JADX INFO: renamed from: y */
    public final fpj.InterfaceC0578c f6331y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView$a */
    public class C0430a implements fpj.InterfaceC0578c {
        public C0430a() {
        }

        @Override // p002l.fpj.InterfaceC0578c
        /* JADX INFO: renamed from: a */
        public void mo7993a(boolean z) {
            if (z && GiftDialogContentView.this.f6328v != null && GiftDialogContentView.this.f6330x) {
                GiftDialogContentView.this.f6328v.m8027R0(GiftDialogContentView.this.f6329w.m14840e());
                GiftDialogContentView.this.f6330x = false;
            }
            if (z && GiftDialogContentView.this.f6328v != null) {
                GiftDialogContentView.this.getCurrentShowGiftPanel().m8030Y0();
                GiftDialogContentView.this.m7989v0();
            }
            if (!z) {
                GiftDialogContentView.this.f6326t.m9734R5();
            }
            GiftDialogContentView.this.f6326t.m25548F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().j(new mtj(z));
            GiftDialogContentView.this.f6326t.m9721K5();
        }

        @Override // p002l.fpj.InterfaceC0578c
        /* JADX INFO: renamed from: b */
        public void mo7994b() {
            GiftDialogContentView.this.f6326t.m9745Y4();
        }
    }

    public GiftDialogContentView(Context context) {
        super(context);
        this.f6330x = false;
        this.f6331y = new C0430a();
    }

    /* JADX INFO: renamed from: B0 */
    public void m7969B0(hvj hvjVar) {
        ConstraintLayout constraintLayout;
        this.f6329w = hvjVar;
        this.f6330x = true;
        hvj.C0611a c0611aM14838c = hvjVar.m14838c();
        this.f6323q.m7960p0(this.f6326t, hvjVar.m14843h());
        if (!c0611aM14838c.m14852c()) {
            if (hvjVar.m14837a() || ((constraintLayout = this.f6328v) != null && xdl0.O0(constraintLayout))) {
                m7984q0(false);
                m7991y0(true);
                this.f6326t.m25548F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().j(new mtj(true));
            } else {
                m7991y0(false);
            }
        }
        this.f6321o.m8027R0(hvjVar.m14839d());
        GiftDialogGiftsView giftDialogGiftsView = this.f6328v;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.m8027R0(hvjVar.m14840e());
        } else {
            m7978N0();
        }
        m7983p0();
    }

    /* JADX INFO: renamed from: D0 */
    public void m7970D0(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        this.f6319m.m8201t1(userLiveHierarchyProgressChange);
    }

    /* JADX INFO: renamed from: E0 */
    public void m7971E0() {
        this.f6321o.m8028S0();
        GiftDialogGiftsView giftDialogGiftsView = this.f6328v;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.m8028S0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m7972G0() {
        xdl0.M(this.f6316j, false);
        xdl0.M(this.f6317k, false);
        xdl0.M(this.f6319m, true);
        xdl0.M(this.f6320n, false);
        xdl0.M(this.f6318l, true);
    }

    /* JADX INFO: renamed from: H0 */
    public void m7973H0(boolean z) {
        this.f6321o.m8029V0(z);
    }

    /* JADX INFO: renamed from: I0 */
    public void m7974I0() {
        m7976K0();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: J0 */
    public void m7975J0() {
        if (this.f6327u == null) {
            this.f6327u = new fpj(this.f6321o);
        }
        this.f6327u.m13449c(this.f6328v);
        this.f6327u.m13452f(this.f6331y);
        this.f6319m.m8200s1();
        if (!this.f6326t.m25547E2().m17234j().isOfficialShowRoom()) {
            this.f6320n.m7512E0();
        }
        this.f6311e.m8060O();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K0 */
    public void m7976K0() {
        if (this.f6328v == null) {
            m7984q0(true);
        }
        if (this.f6327u == null) {
            this.f6327u = new fpj(this.f6321o);
        }
        this.f6327u.m13449c(this.f6328v);
        this.f6327u.m13453g(this.f6331y);
        this.f6328v.m8023L0();
        if (this.f6326t.m25547E2().m17234j().isOfficialShowRoom()) {
            xdl0.M(this.f6318l, true);
        } else {
            this.f6320n.m7513G0();
        }
        this.f6319m.m8199r1();
        this.f6311e.m8059N();
    }

    /* JADX INFO: renamed from: L0 */
    public void m7977L0() {
        axj.m10102p(this.f6326t.mo21430R2());
        if (this.f6326t.m9743X4()) {
            axj.m10099m(this.f6326t.mo21430R2());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m7978N0() {
        if (this.f6328v != null) {
            return;
        }
        Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.jnj
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return this.f13878a.m7988u0();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m7979O0(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        GiftDialogGiftsView giftDialogGiftsView = this.f6328v;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.m8031a1(ihsVar, bLiveGivenGiftBrief);
        }
        GiftDialogGiftsView giftDialogGiftsView2 = this.f6321o;
        if (giftDialogGiftsView2 != null) {
            giftDialogGiftsView2.m8031a1(ihsVar, bLiveGivenGiftBrief);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7980b() {
        this.f6321o.m8032b();
        ConstraintLayout constraintLayout = this.f6328v;
        if (constraintLayout != null) {
            xdl0.M(constraintLayout, false);
            this.f6328v.m8032b();
        }
        if (this.f6327u == null) {
            this.f6327u = new fpj(this.f6321o);
        }
        this.f6327u.m13451e();
        this.f6319m.m8186b();
        this.f6320n.m7516b();
        this.f6311e.m8051F();
    }

    @Override // p002l.olj
    /* JADX INFO: renamed from: e0 */
    public void mo7981e0() {
        m7975J0();
    }

    public GiftDialogGiftsView getCurrentShowGiftPanel() {
        ConstraintLayout constraintLayout = this.f6328v;
        return (constraintLayout == null || !xdl0.O0(constraintLayout)) ? this.f6321o : this.f6328v;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public yr50 getFlyDestination() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        VDraweeView vDraweeView = this.f6312f;
        if (vDraweeView != null) {
            vDraweeView.getLocationOnScreen(iArr);
            iArr[0] = xdl0.y0() / 2;
        }
        ConstraintLayout constraintLayout = this.f6321o;
        if (constraintLayout != null) {
            constraintLayout.getLocationOnScreen(iArr2);
            iArr2[0] = xdl0.y0() / 2;
        }
        return new yr50(iArr, iArr2);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m7982o0(View view) {
        lnj.m17326a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7982o0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        ahs<?> ahsVar;
        super/*android.view.View*/.onWindowFocusChanged(z);
        if (!z || (ahsVar = this.f6326t) == null) {
            return;
        }
        ahsVar.m9765l6();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m7983p0() {
        ConstraintLayout constraintLayout = this.f6328v;
        if (constraintLayout == null || !xdl0.O0(constraintLayout)) {
            this.f6319m.setPacketPanelShowingFlag(false);
        } else {
            this.f6326t.m25548F2().GiftDialogEventGroup.giftDialogShowWithPacketPanel().p();
            this.f6319m.setPacketPanelShowingFlag(true);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m7984q0(boolean z) {
        if (this.f6328v == null) {
            GiftDialogGiftsView giftDialogGiftsView = (GiftDialogGiftsView) this.f6322p.inflate();
            this.f6328v = giftDialogGiftsView;
            giftDialogGiftsView.m8035z0(this.f6326t, this, true);
            if (z) {
                xdl0.M0(this.f6328v, false);
                this.f6328v.m8027R0(this.f6329w.m14840e());
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m7985r0(ahs<?> ahsVar, final d30 d30Var) {
        this.f6326t = ahsVar;
        this.f6310d.setOnClickListener(new View.OnClickListener() { // from class: l.knj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        this.f6323q.m7958n0(ahsVar);
        this.f6321o.m8035z0(ahsVar, this, false);
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m7986s0() {
        ConstraintLayout constraintLayout = this.f6328v;
        return constraintLayout != null && xdl0.O0(constraintLayout);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2] */
    /* JADX INFO: renamed from: t0 */
    public final boolean m7987t0() {
        if (this.f6326t == null) {
            return false;
        }
        return vdt.b(3) || !this.f6326t.m25547E2().m14548Z0();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean m7988u0() {
        m7984q0(true);
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public void m7989v0() {
        getCurrentShowGiftPanel().m8021J0();
    }

    /* JADX INFO: renamed from: w0 */
    public void m7990w0(umj umjVar) {
        if (!umjVar.m23558e() || !m7987t0()) {
            xdl0.M(this.f6319m, false);
        } else {
            xdl0.M(this.f6319m, true);
            this.f6319m.m8194l1(this.f6326t, umjVar);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m7991y0(boolean z) {
        ConstraintLayout constraintLayout = this.f6328v;
        if (constraintLayout != null) {
            xdl0.M0(constraintLayout, z);
            this.f6328v.setTranslationX(0.0f);
        }
        xdl0.M0(this.f6321o, !z);
        this.f6321o.setTranslationX(0.0f);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: z0 */
    public void m7992z0(@Nullable mnj mnjVar, int i) {
        if (!NullChecker.a(mnjVar) || !NullChecker.a(mnjVar.m18095g().f15446e)) {
            xdl0.M(this.f6317k, false);
            xdl0.M(this.f6316j, false);
            return;
        }
        mnjVar.m18095g().f15444c = this.f6326t.m25547E2().m17234j().isVoiceLive();
        if (this.f6326t.m25547E2().m17234j().isVoiceLive()) {
            xdl0.M(this.f6316j, true);
            this.f6316j.m7548Z(mnjVar, this.f6326t.mo9711F4(), i);
            return;
        }
        xdl0.M(this.f6317k, true);
        GiftUserInfoView giftUserInfoView = this.f6317k;
        final ahs<?> ahsVar = this.f6326t;
        Objects.requireNonNull(ahsVar);
        giftUserInfoView.m8133t0(mnjVar, new v9j() { // from class: l.inj
            public final Object call() {
                return ahsVar.mo9711F4();
            }
        });
    }

    public GiftDialogContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6330x = false;
        this.f6331y = new C0430a();
    }
}
