package com.p046p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12832a;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12836e;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p149l.aet;
import p149l.aqe;
import p149l.avk;
import p149l.axj;
import p149l.bqq;
import p149l.bsm;
import p149l.bvj;
import p149l.bwc0;
import p149l.d30;
import p149l.dis;
import p149l.dxj;
import p149l.e30;
import p149l.evj;
import p149l.ffw;
import p149l.gbu;
import p149l.h4t;
import p149l.ho2;
import p149l.i7e;
import p149l.jo0;
import p149l.l9e;
import p149l.nqe;
import p149l.soj0;
import p149l.spe;
import p149l.t100;
import p149l.tzd;
import p149l.w9j;
import p149l.wrj;
import p149l.x350;
import p149l.xnj;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftTraysPresenter<V extends ho2> extends h4t<V, LiveGiftTrays> {

    /* JADX INFO: renamed from: o */
    public static final int f50132o = t100.m186890d(36.0f);

    /* JADX INFO: renamed from: i */
    public final dis f50133i;

    /* JADX INFO: renamed from: j */
    public RunnableC12835d f50134j;

    /* JADX INFO: renamed from: k */
    public int f50135k;

    /* JADX INFO: renamed from: l */
    public int f50136l;

    /* JADX INFO: renamed from: m */
    public HandlerThread f50137m;

    /* JADX INFO: renamed from: n */
    public Handler f50138n;

    public enum TrayType {
        top,
        bottom
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter$a */
    public class C12827a extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f50139a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f50140b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bwc0 f50141c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f50142d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ GiftTrayData f50143e;

        public C12827a(String str, long j, bwc0 bwc0Var, boolean z, GiftTrayData giftTrayData) {
            this.f50139a = str;
            this.f50140b = j;
            this.f50141c = bwc0Var;
            this.f50142d = z;
            this.f50143e = giftTrayData;
        }

        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NonNull File file) {
            super.mo74248a(file);
            nqe.m160593G(this.f50139a, true, false, System.currentTimeMillis() - this.f50140b);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: c */
        public void mo74249c(boolean z) {
            if (this.f50142d) {
                nqe.m160592F(LiveGiftTraysPresenter.this.m206027E2().mo97490p(), this.f50143e.f50119y, z, true, false);
            }
        }

        @Override // p149l.i7e, p149l.h7e
        public void onFailed(@NotNull String str) {
            nqe.m160600f(this.f50141c);
            nqe.m160593G(this.f50139a, true, true, -1L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter$b */
    public class C12828b extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f50145a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveEffect f50146b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f50147c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bwc0 f50148d;

        public C12828b(GiftTrayData giftTrayData, BLiveEffect bLiveEffect, long j, bwc0 bwc0Var) {
            this.f50145a = giftTrayData;
            this.f50146b = bLiveEffect;
            this.f50147c = j;
            this.f50148d = bwc0Var;
        }

        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NotNull File file) {
            wrj.m205236i(this.f50145a, this.f50146b);
            nqe.m160593G(this.f50146b.f44359id, true, false, System.currentTimeMillis() - this.f50147c);
            LiveGiftTraysPresenter.this.m74218X3(this.f50145a);
        }

        @Override // p149l.i7e, p149l.h7e
        public void onFailed(String str) {
            wrj.m205234h(this.f50145a, this.f50146b);
            nqe.m160593G(this.f50146b.f44359id, true, true, -1L);
            nqe.m160600f(this.f50148d);
            LiveGiftTraysPresenter.this.m74218X3(this.f50145a);
        }
    }

    public LiveGiftTraysPresenter(bsm bsmVar, LiveGiftTrays liveGiftTrays) {
        super(bsmVar);
        this.f50135k = 0;
        this.f50137m = new HandlerThread("live_gift_list");
        this.f50133i = new dis();
        mo51532C(liveGiftTrays);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ int m74209M3(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo2) {
        return (int) (bLiveGiftGearEffectInfo.since - bLiveGiftGearEffectInfo2.since);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m74218X3(GiftTrayData giftTrayData) {
        wrj.m205220a(giftTrayData);
        if (((LiveGiftTrays) this.viewModel).m74195j(giftTrayData)) {
            return;
        }
        if (giftTrayData.m74170w()) {
            ((LiveGiftTrays) this.viewModel).m74199n(giftTrayData);
        }
        this.f50133i.m111916d(giftTrayData);
        synchronized (this.f50133i) {
            this.f50133i.notifyAll();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private void m74219Y3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        for (GiftTrayData giftTrayData : list) {
            if (list.get(0) == giftTrayData || giftTrayData.f50107m) {
                m74229W3(giftTrayData, true);
            } else {
                m74218X3(giftTrayData);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: Z3 */
    public void m74220Z3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        m74219Y3(list);
    }

    /* JADX INFO: renamed from: c4 */
    private void m74221c4(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        wrj.m205232g(giftTrayData, bLiveEffect);
        bwc0 bwc0VarM104149b = bwc0.m104149b(giftTrayData, false, m206032L2());
        if (spe.m185365d(bLiveEffect.type).mo107445f(bLiveEffect.f44359id, true, new C12828b(giftTrayData, bLiveEffect, System.currentTimeMillis(), bwc0VarM104149b), bwc0VarM104149b)) {
            m74218X3(giftTrayData);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d4 */
    private List<GiftTrayData> m74222d4(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGivenGiftBrief.isGear && !bLiveGiftItem.gear.gearEffects.isEmpty()) {
            Collections.sort(bLiveGiftItem.gear.gearEffects, new Comparator() { // from class: l.tks
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return LiveGiftTraysPresenter.m74209M3((BLiveGiftGearEffectInfo) obj, (BLiveGiftGearEffectInfo) obj2);
                }
            });
        }
        return dxj.m114005a(bLiveGivenGiftBrief, bLiveGiftItem, m206027E2());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: e4 */
    private GiftTrayData m74223e4(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        GiftTrayData giftTrayDataM74153o = GiftTrayData.m74153o(bLiveGiftItem, bLiveGivenGiftBrief, m206027E2());
        giftTrayDataM74153o.f50102h = m206027E2().mo149813j().f44323id;
        dxj.m114006c(bLiveGiftItem, giftTrayDataM74153o, bLiveGivenGiftBrief);
        return giftTrayDataM74153o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v0, types: [l.ho2] */
    /* JADX INFO: renamed from: h4 */
    public List<GiftTrayData> m74224h4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        ArrayList arrayList = new ArrayList(0);
        if (bLiveGivenGiftBrief.isGiftBrief() || bLiveGivenGiftBrief.isLianMaiBrief() || bLiveGivenGiftBrief.isAudienceBrief() || bLiveGivenGiftBrief.isMultiCall() || bLiveGivenGiftBrief.isGuildCall() || bLiveGivenGiftBrief.isAuctionBrief()) {
            BLiveGiftItem bLiveGiftItemM132171w0 = m206027E2().m132171w0(bLiveGivenGiftBrief.f44385id);
            if (bLiveGiftItemM132171w0 == null) {
                nqe.m160588B(bLiveGivenGiftBrief, m206027E2(), true, false, m206032L2());
                nqe.m160613s(bLiveGivenGiftBrief, m206027E2(), false, m206032L2());
                m74228w4(bLiveGivenGiftBrief);
                return arrayList;
            }
            nqe.m160587A(bLiveGivenGiftBrief, bLiveGiftItemM132171w0, m206027E2(), true, false, m206032L2());
            if (m206027E2().mo149813j() != null) {
                if (m74225k4(bLiveGivenGiftBrief)) {
                    return m74222d4(bLiveGivenGiftBrief, bLiveGiftItemM132171w0);
                }
                arrayList.add(m74223e4(bLiveGivenGiftBrief, bLiveGiftItemM132171w0));
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74225k4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = bLiveGivenGiftBrief.num;
        return i > 1 && bLiveGivenGiftBrief.combos - i >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m74226o4(String str) {
        ((LiveGiftTrays) this.viewModel).m74197l(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m74227p4(soj0 soj0Var) {
        mo74233g4();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX INFO: renamed from: w4 */
    private void m74228w4(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (bLiveGivenGiftBrief.pollFromNetwork) {
            wrj.m205243l0(bLiveGivenGiftBrief);
            return;
        }
        m206027E2().m132055A1(new evj.C16689a(m206027E2().m149818o(), x350.m206896R2(m206027E2(), mo96662j3()), "live").m118278g(new d30() { // from class: l.sks
            @Override // p149l.d30
            public final void call() {
                this.f165012a.m74240r4(bLiveGivenGiftBrief);
            }
        }).m118277f(), null);
        wrj.m205210Q(bLiveGivenGiftBrief);
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((LiveGiftTrays) this.viewModel).m74205y(0);
        this.f50137m.start();
        this.f50138n = new Handler(this.f50137m.getLooper());
        duringCreated(m206027E2().m132160q1().m189036B()).observeOn(avk.m99199a(this.f50138n)).map(new w9j() { // from class: l.mks
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f134377a.m74224h4((BLiveGivenGiftBrief) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.yks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198830a.m74220Z3((List) obj);
            }
        }));
        m129302f3(m206028F2().KeyboardEvent.show()).m129322b(new e30() { // from class: l.als
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70514a.mo74236l4((KeyboardEventData) obj);
            }
        });
        m129302f3(m206028F2().DialogCenterEvent.changeVisibility()).m129322b(new e30() { // from class: l.cls
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81462a.mo74232f4((tzd) obj);
            }
        });
        m129302f3(m206028F2().TraysViewEvent.changeBottomSpace()).m129322b(new e30() { // from class: l.els
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92139a.m74245x4((C12836e) obj);
            }
        });
        m129315u3(new w9j() { // from class: l.gls
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((ti1) obj).m189146u();
            }
        }).m129322b(new e30() { // from class: l.ils
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113874a.m74237m4((LongLinkSocketMessage.LiveAnimationPlayMsg) obj);
            }
        });
        m129302f3(m206028F2().GiftTraysEvent.addGiftTrayDataToList()).m129322b(new e30() { // from class: l.kls
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123692a.m74238n4((C12832a) obj);
            }
        });
        m129302f3(m206028F2().TraysViewEvent.dismissTrayView()).m129322b(new e30() { // from class: l.oks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144456a.m74226o4((String) obj);
            }
        });
        m129302f3(m206028F2().GiftDialogEventGroup.giftDialogHeightChange()).m129322b(new e30() { // from class: l.qks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155160a.m74227p4((soj0) obj);
            }
        });
        m129301d3(bvj.class, new w9j() { // from class: l.uks
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176956a.m74239q4((bvj) obj);
            }
        });
        duringCreated(m206027E2().m132160q1().m189040D()).subscribe(ffw.m121197h(new e30() { // from class: l.wks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186819a.m74234i4((LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: W3 */
    public final void m74229W3(GiftTrayData giftTrayData, boolean z) {
        String str = giftTrayData.f50119y;
        if (TextUtils.isEmpty(str)) {
            m74218X3(giftTrayData);
            return;
        }
        BLiveEffect bLiveEffectM98266h = aqe.m98261i().m98266h(str);
        if (bLiveEffectM98266h == null) {
            bwc0 bwc0VarM104149b = bwc0.m104149b(giftTrayData, giftTrayData.m74169v(), m206032L2());
            bwc0VarM104149b.m104150a().m150991e(false);
            aqe.m98261i().m98281x(str, bwc0VarM104149b, new C12827a(str, System.currentTimeMillis(), bwc0VarM104149b, z, giftTrayData));
            wrj.m205255u("本地effect资源没有");
            m74218X3(giftTrayData);
            return;
        }
        boolean z2 = giftTrayData.m74173z() || aqe.m98261i().m98267j(bLiveEffectM98266h.f44359id);
        if (z) {
            nqe.m160592F(m206027E2().mo97490p(), giftTrayData.f50119y, z2 || spe.m185365d(bLiveEffectM98266h.type).m152982e(bLiveEffectM98266h.f44359id, false, null), true, true);
        }
        if (z2) {
            m74218X3(giftTrayData);
        } else {
            m74221c4(giftTrayData, bLiveEffectM98266h);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public boolean mo74230a4(GiftTrayData giftTrayData) {
        return true;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m74231b4(int i) {
        if (this.f50136l != i) {
            this.f50136l = i;
            ((LiveGiftTrays) this.viewModel).m74205y(-i);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void mo74232f4(tzd tzdVar) {
        if (tzdVar.f172729a != LiveDialogEnum.GIFT) {
            return;
        }
        if (tzdVar.f172731c) {
            mo74233g4();
        } else {
            m74231b4(this.f50135k);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void mo74233g4() {
        m74231b4(Math.max(((xnj.C21181a) m129297F3(new xnj(700))).m210171b() + f50132o, this.f50136l));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m74234i4(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (TextUtils.isEmpty(intlLuckyGiftTray.getReward()) || ((LiveGiftTrays) this.viewModel).m74193E(intlLuckyGiftTray)) {
            return;
        }
        this.f50133i.m111925n(intlLuckyGiftTray);
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m74235j4(TrayType trayType) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return true;
        }
        return ((LiveGiftTrays) v2).m74200p(trayType);
    }

    /* JADX INFO: renamed from: l4 */
    public void mo74236l4(KeyboardEventData keyboardEventData) {
        if (keyboardEventData.m71825b()) {
            m74231b4(keyboardEventData.m71824a());
        } else {
            m74231b4(this.f50135k);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m74237m4(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg) {
        m74229W3(GiftTrayData.m74149j(liveAnimationPlayMsg, this.f188512e.f77102h.mo132054A0()), false);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        reset();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m74238n4(C12832a c12832a) {
        m74229W3(c12832a.f50158f, false);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ aet m74239q4(bvj bvjVar) {
        return this.f50133i.m111922k();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m74240r4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.pollFromNetwork = true;
        m206027E2().m132063E1(bLiveGivenGiftBrief);
    }

    public void reset() {
        HandlerThread handlerThread = this.f50137m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f50137m = null;
        }
        if (this.f50138n != null) {
            this.f50138n = null;
        }
        this.f50133i.m111920i();
        RunnableC12835d runnableC12835d = this.f50134j;
        if (runnableC12835d != null) {
            runnableC12835d.m74290d();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m74241s4(C12836e.b bVar) {
        m206028F2().TraysViewEvent.notifyTrayRewardAnimPlay().mo172463j(bVar);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((LiveGiftTrays) this.viewModel).init();
        m74247z4();
    }

    /* JADX INFO: renamed from: t4 */
    public void m74242t4(GiftTrayData giftTrayData) {
        synchronized (this.f50133i) {
            if (giftTrayData != null) {
                try {
                    this.f50133i.m111919g(giftTrayData);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f50133i.notifyAll();
        }
        m206028F2().GiftTraysEvent.onAnimationStateChange().mo172463j(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: u4 */
    public void m74243u4(GiftTrayData giftTrayData, TrayType trayType) {
        ((LiveGiftTrays) this.viewModel).m74191B(trayType, giftTrayData, mo74230a4(giftTrayData));
        m206028F2().GiftTraysEvent.onAnimationStateChange().mo172463j(Boolean.TRUE);
        axj.m99432f(m206027E2().mo149813j(), m206027E2().mo149817n(), m206027E2().mo97490p(), mo96662j3(), giftTrayData);
    }

    /* JADX INFO: renamed from: v4 */
    public void m74244v4(GiftTrayData giftTrayData) {
        if (!TextUtils.isEmpty(giftTrayData.f50119y) || giftTrayData.m74165r()) {
            m206028F2().GiftTraysEvent.playGiftLayer().mo172463j(new C12832a.a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m74269f(giftTrayData).m74268e());
        } else {
            wrj.m205242l("LiveGiftTraysPresenter playLayer", giftTrayData);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m74245x4(C12836e c12836e) {
        if (c12836e.mo142569a() == 4400 || c12836e.mo142569a() == 6000) {
            this.f50135k = c12836e.m74291b() - l9e.f127089m;
            if (m206031K2().m182463f(LiveDialogEnum.GIFT) || m206031K2().m182463f(LiveDialogEnum.CHAT_INPUT)) {
                return;
            }
            m74231b4(this.f50135k);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m74246y4(String str) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).userId(str).setSource("gift").setFromIdentity(bqq.m103386a(this, mo96662j3(), str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).setTo(bqq.m103389d(this, mo96662j3(), str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).setScene("live").trackFrom("giftBanner").build());
    }

    /* JADX INFO: renamed from: z4 */
    public void m74247z4() {
        RunnableC12835d runnableC12835d = new RunnableC12835d(this.f50133i, this);
        this.f50134j = runnableC12835d;
        gbu.f101912b.m125328a(runnableC12835d);
    }
}
