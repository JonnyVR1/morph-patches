package com.p051p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12995a;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12999e;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p153l.bgt;
import p153l.csq;
import p153l.dhw;
import p153l.dum;
import p153l.e4d0;
import p153l.eks;
import p153l.ere;
import p153l.fo0;
import p153l.h1e;
import p153l.hdu;
import p153l.i6t;
import p153l.mc50;
import p153l.muj;
import p153l.nqj;
import p153l.oo2;
import p153l.pae;
import p153l.qa00;
import p153l.qcj;
import p153l.qxk;
import p153l.qzj;
import p153l.rre;
import p153l.rxj;
import p153l.tzj;
import p153l.uxj;
import p153l.vxj0;
import p153l.wqe;
import p153l.x20;
import p153l.x8e;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftTraysPresenter<V extends oo2> extends i6t<V, LiveGiftTrays> {

    /* JADX INFO: renamed from: o */
    public static final int f50980o = qa00.m175859d(36.0f);

    /* JADX INFO: renamed from: i */
    public final eks f50981i;

    /* JADX INFO: renamed from: j */
    public RunnableC12998d f50982j;

    /* JADX INFO: renamed from: k */
    public int f50983k;

    /* JADX INFO: renamed from: l */
    public int f50984l;

    /* JADX INFO: renamed from: m */
    public HandlerThread f50985m;

    /* JADX INFO: renamed from: n */
    public Handler f50986n;

    public enum TrayType {
        top,
        bottom
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter$a */
    public class C12990a extends x8e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f50987a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f50988b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e4d0 f50989c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f50990d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ GiftTrayData f50991e;

        public C12990a(String str, long j, e4d0 e4d0Var, boolean z, GiftTrayData giftTrayData) {
            this.f50987a = str;
            this.f50988b = j;
            this.f50989c = e4d0Var;
            this.f50990d = z;
            this.f50991e = giftTrayData;
        }

        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NonNull File file) {
            super.mo75431a(file);
            rre.m182727G(this.f50987a, true, false, System.currentTimeMillis() - this.f50988b);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: c */
        public void mo75432c(boolean z) {
            if (this.f50990d) {
                rre.m182726F(LiveGiftTraysPresenter.this.m213810E2().mo118373p(), this.f50991e.f50967y, z, true, false);
            }
        }

        @Override // p153l.x8e, p153l.w8e
        public void onFailed(@NotNull String str) {
            rre.m182734f(this.f50989c);
            rre.m182727G(this.f50987a, true, true, -1L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter$b */
    public class C12991b extends x8e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f50993a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveEffect f50994b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f50995c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ e4d0 f50996d;

        public C12991b(GiftTrayData giftTrayData, BLiveEffect bLiveEffect, long j, e4d0 e4d0Var) {
            this.f50993a = giftTrayData;
            this.f50994b = bLiveEffect;
            this.f50995c = j;
            this.f50996d = e4d0Var;
        }

        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NotNull File file) {
            muj.m160200i(this.f50993a, this.f50994b);
            rre.m182727G(this.f50994b.f45207id, true, false, System.currentTimeMillis() - this.f50995c);
            LiveGiftTraysPresenter.this.m75401X3(this.f50993a);
        }

        @Override // p153l.x8e, p153l.w8e
        public void onFailed(String str) {
            muj.m160198h(this.f50993a, this.f50994b);
            rre.m182727G(this.f50994b.f45207id, true, true, -1L);
            rre.m182734f(this.f50996d);
            LiveGiftTraysPresenter.this.m75401X3(this.f50993a);
        }
    }

    public LiveGiftTraysPresenter(dum dumVar, LiveGiftTrays liveGiftTrays) {
        super(dumVar);
        this.f50983k = 0;
        this.f50985m = new HandlerThread("live_gift_list");
        this.f50981i = new eks();
        mo52715C(liveGiftTrays);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ int m75392M3(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo2) {
        return (int) (bLiveGiftGearEffectInfo.since - bLiveGiftGearEffectInfo2.since);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m75401X3(GiftTrayData giftTrayData) {
        muj.m160184a(giftTrayData);
        if (((LiveGiftTrays) this.viewModel).m75378j(giftTrayData)) {
            return;
        }
        if (giftTrayData.m75353w()) {
            ((LiveGiftTrays) this.viewModel).m75382n(giftTrayData);
        }
        this.f50981i.m121073d(giftTrayData);
        synchronized (this.f50981i) {
            this.f50981i.notifyAll();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private void m75402Y3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        for (GiftTrayData giftTrayData : list) {
            if (list.get(0) == giftTrayData || giftTrayData.f50955m) {
                m75412W3(giftTrayData, true);
            } else {
                m75401X3(giftTrayData);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: Z3 */
    public void m75403Z3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        m75402Y3(list);
    }

    /* JADX INFO: renamed from: c4 */
    private void m75404c4(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        muj.m160196g(giftTrayData, bLiveEffect);
        e4d0 e4d0VarM119410b = e4d0.m119410b(giftTrayData, false, m213815L2());
        if (wqe.m207509d(bLiveEffect.type).mo144688f(bLiveEffect.f45207id, true, new C12991b(giftTrayData, bLiveEffect, System.currentTimeMillis(), e4d0VarM119410b), e4d0VarM119410b)) {
            m75401X3(giftTrayData);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: d4 */
    private List<GiftTrayData> m75405d4(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGivenGiftBrief.isGear && !bLiveGiftItem.gear.gearEffects.isEmpty()) {
            Collections.sort(bLiveGiftItem.gear.gearEffects, new Comparator() { // from class: l.ums
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return LiveGiftTraysPresenter.m75392M3((BLiveGiftGearEffectInfo) obj, (BLiveGiftGearEffectInfo) obj2);
                }
            });
        }
        return tzj.m193673a(bLiveGivenGiftBrief, bLiveGiftItem, m213810E2());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: e4 */
    private GiftTrayData m75406e4(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        GiftTrayData giftTrayDataM75336o = GiftTrayData.m75336o(bLiveGiftItem, bLiveGivenGiftBrief, m213810E2());
        giftTrayDataM75336o.f50950h = m213810E2().mo183435j().f45171id;
        tzj.m193674c(bLiveGiftItem, giftTrayDataM75336o, bLiveGivenGiftBrief);
        return giftTrayDataM75336o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v0, types: [l.oo2] */
    /* JADX INFO: renamed from: h4 */
    public List<GiftTrayData> m75407h4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        ArrayList arrayList = new ArrayList(0);
        if (bLiveGivenGiftBrief.isGiftBrief() || bLiveGivenGiftBrief.isLianMaiBrief() || bLiveGivenGiftBrief.isAudienceBrief() || bLiveGivenGiftBrief.isMultiCall() || bLiveGivenGiftBrief.isGuildCall() || bLiveGivenGiftBrief.isAuctionBrief()) {
            BLiveGiftItem bLiveGiftItemM168555w0 = m213810E2().m168555w0(bLiveGivenGiftBrief.f45233id);
            if (bLiveGiftItemM168555w0 == null) {
                rre.m182722B(bLiveGivenGiftBrief, m213810E2(), true, false, m213815L2());
                rre.m182747s(bLiveGivenGiftBrief, m213810E2(), false, m213815L2());
                m75411w4(bLiveGivenGiftBrief);
                return arrayList;
            }
            rre.m182721A(bLiveGivenGiftBrief, bLiveGiftItemM168555w0, m213810E2(), true, false, m213815L2());
            if (m213810E2().mo183435j() != null) {
                if (m75408k4(bLiveGivenGiftBrief)) {
                    return m75405d4(bLiveGivenGiftBrief, bLiveGiftItemM168555w0);
                }
                arrayList.add(m75406e4(bLiveGivenGiftBrief, bLiveGiftItemM168555w0));
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m75408k4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = bLiveGivenGiftBrief.num;
        return i > 1 && bLiveGivenGiftBrief.combos - i >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m75409o4(String str) {
        ((LiveGiftTrays) this.viewModel).m75380l(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m75410p4(vxj0 vxj0Var) {
        mo75416g4();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2] */
    /* JADX INFO: renamed from: w4 */
    private void m75411w4(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (bLiveGivenGiftBrief.pollFromNetwork) {
            muj.m160207l0(bLiveGivenGiftBrief);
            return;
        }
        m213810E2().m168445A1(new uxj.C20693a(m213810E2().m202194o(), mc50.m157912R2(m213810E2(), mo104749j3()), "live").m198495g(new x20() { // from class: l.tms
            @Override // p153l.x20
            public final void call() {
                this.f174956a.m75423r4(bLiveGivenGiftBrief);
            }
        }).m198494f(), null);
        muj.m160174Q(bLiveGivenGiftBrief);
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((LiveGiftTrays) this.viewModel).m75388y(0);
        this.f50985m.start();
        this.f50986n = new Handler(this.f50985m.getLooper());
        duringCreated(m213810E2().m168545q1().m98218B()).observeOn(qxk.m178605a(this.f50986n)).map(new qcj() { // from class: l.nms
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f142742a.m75407h4((BLiveGivenGiftBrief) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.zms
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205099a.m75403Z3((List) obj);
            }
        }));
        m138861f3(m213811F2().KeyboardEvent.show()).m138881b(new y20() { // from class: l.bns
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77586a.mo75419l4((KeyboardEventData) obj);
            }
        });
        m138861f3(m213811F2().DialogCenterEvent.changeVisibility()).m138881b(new y20() { // from class: l.dns
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89828a.mo75415f4((h1e) obj);
            }
        });
        m138861f3(m213811F2().TraysViewEvent.changeBottomSpace()).m138881b(new y20() { // from class: l.fns
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99956a.m75428x4((C12999e) obj);
            }
        });
        m138874u3(new qcj() { // from class: l.hns
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((aj1) obj).m98328u();
            }
        }).m138881b(new y20() { // from class: l.jns
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121901a.m75420m4((LongLinkSocketMessage.LiveAnimationPlayMsg) obj);
            }
        });
        m138861f3(m213811F2().GiftTraysEvent.addGiftTrayDataToList()).m138881b(new y20() { // from class: l.lns
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132839a.m75421n4((C12995a) obj);
            }
        });
        m138861f3(m213811F2().TraysViewEvent.dismissTrayView()).m138881b(new y20() { // from class: l.pms
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153227a.m75409o4((String) obj);
            }
        });
        m138861f3(m213811F2().GiftDialogEventGroup.giftDialogHeightChange()).m138881b(new y20() { // from class: l.rms
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163924a.m75410p4((vxj0) obj);
            }
        });
        m138860d3(rxj.class, new qcj() { // from class: l.vms
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184753a.m75422q4((rxj) obj);
            }
        });
        duringCreated(m213810E2().m168545q1().m98222D()).subscribe(dhw.m115829h(new y20() { // from class: l.xms
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195318a.m75417i4((LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: W3 */
    public final void m75412W3(GiftTrayData giftTrayData, boolean z) {
        String str = giftTrayData.f50967y;
        if (TextUtils.isEmpty(str)) {
            m75401X3(giftTrayData);
            return;
        }
        BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(str);
        if (bLiveEffectM122151h == null) {
            e4d0 e4d0VarM119410b = e4d0.m119410b(giftTrayData, giftTrayData.m75352v(), m213815L2());
            e4d0VarM119410b.m119411a().m173459e(false);
            ere.m122146i().m122166x(str, e4d0VarM119410b, new C12990a(str, System.currentTimeMillis(), e4d0VarM119410b, z, giftTrayData));
            muj.m160219u("本地effect资源没有");
            m75401X3(giftTrayData);
            return;
        }
        boolean z2 = giftTrayData.m75356z() || ere.m122146i().m122152j(bLiveEffectM122151h.f45207id);
        if (z) {
            rre.m182726F(m213810E2().mo118373p(), giftTrayData.f50967y, z2 || wqe.m207509d(bLiveEffectM122151h.type).m152744e(bLiveEffectM122151h.f45207id, false, null), true, true);
        }
        if (z2) {
            m75401X3(giftTrayData);
        } else {
            m75404c4(giftTrayData, bLiveEffectM122151h);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public boolean mo75413a4(GiftTrayData giftTrayData) {
        return true;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m75414b4(int i) {
        if (this.f50984l != i) {
            this.f50984l = i;
            ((LiveGiftTrays) this.viewModel).m75388y(-i);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void mo75415f4(h1e h1eVar) {
        if (h1eVar.f107441a != LiveDialogEnum.GIFT) {
            return;
        }
        if (h1eVar.f107443c) {
            mo75416g4();
        } else {
            m75414b4(this.f50983k);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void mo75416g4() {
        m75414b4(Math.max(((nqj.C18926a) m138856F3(new nqj(700))).m164322b() + f50980o, this.f50984l));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m75417i4(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (TextUtils.isEmpty(intlLuckyGiftTray.getReward()) || ((LiveGiftTrays) this.viewModel).m75376E(intlLuckyGiftTray)) {
            return;
        }
        this.f50981i.m121082n(intlLuckyGiftTray);
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m75418j4(TrayType trayType) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return true;
        }
        return ((LiveGiftTrays) v2).m75383p(trayType);
    }

    /* JADX INFO: renamed from: l4 */
    public void mo75419l4(KeyboardEventData keyboardEventData) {
        if (keyboardEventData.m73008b()) {
            m75414b4(keyboardEventData.m73007a());
        } else {
            m75414b4(this.f50983k);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m75420m4(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg) {
        m75412W3(GiftTrayData.m75332j(liveAnimationPlayMsg, this.f196918e.f90822h.mo118362A0()), false);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        reset();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m75421n4(C12995a c12995a) {
        m75412W3(c12995a.f51006f, false);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ bgt m75422q4(rxj rxjVar) {
        return this.f50981i.m121079k();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m75423r4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.pollFromNetwork = true;
        m213810E2().m168452E1(bLiveGivenGiftBrief);
    }

    public void reset() {
        HandlerThread handlerThread = this.f50985m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f50985m = null;
        }
        if (this.f50986n != null) {
            this.f50986n = null;
        }
        this.f50981i.m121077i();
        RunnableC12998d runnableC12998d = this.f50982j;
        if (runnableC12998d != null) {
            runnableC12998d.m75473d();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m75424s4(C12999e.b bVar) {
        m213811F2().TraysViewEvent.notifyTrayRewardAnimPlay().mo199273j(bVar);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((LiveGiftTrays) this.viewModel).init();
        m75430z4();
    }

    /* JADX INFO: renamed from: t4 */
    public void m75425t4(GiftTrayData giftTrayData) {
        synchronized (this.f50981i) {
            if (giftTrayData != null) {
                try {
                    this.f50981i.m121076g(giftTrayData);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f50981i.notifyAll();
        }
        m213811F2().GiftTraysEvent.onAnimationStateChange().mo199273j(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: u4 */
    public void m75426u4(GiftTrayData giftTrayData, TrayType trayType) {
        ((LiveGiftTrays) this.viewModel).m75374B(trayType, giftTrayData, mo75413a4(giftTrayData));
        m213811F2().GiftTraysEvent.onAnimationStateChange().mo199273j(Boolean.TRUE);
        qzj.m178789f(m213810E2().mo183435j(), m213810E2().mo183440n(), m213810E2().mo118373p(), mo104749j3(), giftTrayData);
    }

    /* JADX INFO: renamed from: v4 */
    public void m75427v4(GiftTrayData giftTrayData) {
        if (!TextUtils.isEmpty(giftTrayData.f50967y) || giftTrayData.m75348r()) {
            m213811F2().GiftTraysEvent.playGiftLayer().mo199273j(new C12995a.a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m75452f(giftTrayData).m75451e());
        } else {
            muj.m160206l("LiveGiftTraysPresenter playLayer", giftTrayData);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m75428x4(C12999e c12999e) {
        if (c12999e.mo125930a() == 4400 || c12999e.mo125930a() == 6000) {
            this.f50983k = c12999e.m75474b() - pae.f151269m;
            if (m213814K2().m189699f(LiveDialogEnum.GIFT) || m213814K2().m189699f(LiveDialogEnum.CHAT_INPUT)) {
                return;
            }
            m75414b4(this.f50983k);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m75429y4(String str) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).userId(str).setSource("gift").setFromIdentity(csq.m112227a(this, mo104749j3(), str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).setTo(csq.m112230d(this, mo104749j3(), str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).setScene("live").trackFrom("giftBanner").build());
    }

    /* JADX INFO: renamed from: z4 */
    public void m75430z4() {
        RunnableC12998d runnableC12998d = new RunnableC12998d(this.f50981i, this);
        this.f50982j = runnableC12998d;
        hdu.f109038b.m134613a(runnableC12998d);
    }
}
