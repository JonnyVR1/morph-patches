package com.p000p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.C0421a;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.C0425e;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.avk;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.gbu;
import l.jo0;
import l.l9e;
import l.s7m;
import l.soj0;
import l.t100;
import l.ti1;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import p002l.aet;
import p002l.aqe;
import p002l.axj;
import p002l.bqq;
import p002l.bsm;
import p002l.bvj;
import p002l.bwc0;
import p002l.dis;
import p002l.dxj;
import p002l.evj;
import p002l.h4t;
import p002l.ho2;
import p002l.i7e;
import p002l.nqe;
import p002l.spe;
import p002l.tzd;
import p002l.wrj;
import p002l.x350;
import p002l.xnj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftTraysPresenter<V extends ho2> extends h4t<V, LiveGiftTrays> {

    /* JADX INFO: renamed from: o */
    public static final int f6174o = t100.d(36.0f);

    /* JADX INFO: renamed from: i */
    public final dis f6175i;

    /* JADX INFO: renamed from: j */
    public RunnableC0424d f6176j;

    /* JADX INFO: renamed from: k */
    public int f6177k;

    /* JADX INFO: renamed from: l */
    public int f6178l;

    /* JADX INFO: renamed from: m */
    public HandlerThread f6179m;

    /* JADX INFO: renamed from: n */
    public Handler f6180n;

    public enum TrayType {
        top,
        bottom
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter$a */
    public class C0416a extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f6181a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f6182b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bwc0 f6183c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f6184d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ GiftTrayData f6185e;

        public C0416a(String str, long j, bwc0 bwc0Var, boolean z, GiftTrayData giftTrayData) {
            this.f6181a = str;
            this.f6182b = j;
            this.f6183c = bwc0Var;
            this.f6184d = z;
            this.f6185e = giftTrayData;
        }

        @Override // p002l.i7e, p002l.h7e
        /* JADX INFO: renamed from: a */
        public void mo7819a(@NonNull File file) {
            super.mo7819a(file);
            nqe.m18944G(this.f6181a, true, false, System.currentTimeMillis() - this.f6182b);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
        @Override // p002l.i7e, p002l.h7e
        /* JADX INFO: renamed from: c */
        public void mo7820c(boolean z) {
            if (this.f6184d) {
                nqe.m18943F(LiveGiftTraysPresenter.this.m25547E2().mo9893p(), this.f6185e.f6161y, z, true, false);
            }
        }

        @Override // p002l.i7e, p002l.h7e
        public void onFailed(@NotNull String str) {
            nqe.m18951f(this.f6183c);
            nqe.m18944G(this.f6181a, true, true, -1L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter$b */
    public class C0417b extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f6187a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveEffect f6188b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f6189c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bwc0 f6190d;

        public C0417b(GiftTrayData giftTrayData, BLiveEffect bLiveEffect, long j, bwc0 bwc0Var) {
            this.f6187a = giftTrayData;
            this.f6188b = bLiveEffect;
            this.f6189c = j;
            this.f6190d = bwc0Var;
        }

        @Override // p002l.i7e, p002l.h7e
        /* JADX INFO: renamed from: a */
        public void mo7819a(@NotNull File file) {
            wrj.m25408i(this.f6187a, this.f6188b);
            nqe.m18944G(this.f6188b.id, true, false, System.currentTimeMillis() - this.f6189c);
            LiveGiftTraysPresenter.this.m7787X3(this.f6187a);
        }

        @Override // p002l.i7e, p002l.h7e
        public void onFailed(String str) {
            wrj.m25406h(this.f6187a, this.f6188b);
            nqe.m18944G(this.f6188b.id, true, true, -1L);
            nqe.m18951f(this.f6190d);
            LiveGiftTraysPresenter.this.m7787X3(this.f6187a);
        }
    }

    public LiveGiftTraysPresenter(bsm bsmVar, LiveGiftTrays liveGiftTrays) {
        super(bsmVar);
        this.f6177k = 0;
        this.f6179m = new HandlerThread("live_gift_list");
        this.f6175i = new dis();
        C(liveGiftTrays);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ int m7778M3(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo2) {
        return (int) (bLiveGiftGearEffectInfo.since - bLiveGiftGearEffectInfo2.since);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m7787X3(GiftTrayData giftTrayData) {
        wrj.m25392a(giftTrayData);
        if (((LiveGiftTrays) ((bwr) this).viewModel).m7764j(giftTrayData)) {
            return;
        }
        if (giftTrayData.m7735w()) {
            ((LiveGiftTrays) ((bwr) this).viewModel).m7768n(giftTrayData);
        }
        this.f6175i.m11911d(giftTrayData);
        synchronized (this.f6175i) {
            this.f6175i.notifyAll();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private void m7788Y3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        for (GiftTrayData giftTrayData : list) {
            if (list.get(0) == giftTrayData || giftTrayData.f6149m) {
                m7799W3(giftTrayData, true);
            } else {
                m7787X3(giftTrayData);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: Z3 */
    public void m7789Z3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        m7788Y3(list);
    }

    /* JADX INFO: renamed from: c4 */
    private void m7790c4(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        wrj.m25404g(giftTrayData, bLiveEffect);
        bwc0 bwc0VarM10631b = bwc0.m10631b(giftTrayData, false, m25552L2());
        if (spe.m22604d(bLiveEffect.type).mo11107f(bLiveEffect.id, true, new C0417b(giftTrayData, bLiveEffect, System.currentTimeMillis(), bwc0VarM10631b), bwc0VarM10631b)) {
            m7787X3(giftTrayData);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d4 */
    private List<GiftTrayData> m7791d4(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGivenGiftBrief.isGear && !bLiveGiftItem.gear.gearEffects.isEmpty()) {
            Collections.sort(bLiveGiftItem.gear.gearEffects, new Comparator() { // from class: l.tks
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return LiveGiftTraysPresenter.m7778M3((BLiveGiftGearEffectInfo) obj, (BLiveGiftGearEffectInfo) obj2);
                }
            });
        }
        return dxj.m12086a(bLiveGivenGiftBrief, bLiveGiftItem, m25547E2());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: e4 */
    private GiftTrayData m7792e4(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        GiftTrayData giftTrayDataM7718o = GiftTrayData.m7718o(bLiveGiftItem, bLiveGivenGiftBrief, m25547E2());
        giftTrayDataM7718o.f6144h = m25547E2().m17234j().id;
        dxj.m12087c(bLiveGiftItem, giftTrayDataM7718o, bLiveGivenGiftBrief);
        return giftTrayDataM7718o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v0, types: [l.ho2] */
    /* JADX INFO: renamed from: h4 */
    public List<GiftTrayData> m7793h4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        ArrayList arrayList = new ArrayList(0);
        if (bLiveGivenGiftBrief.isGiftBrief() || bLiveGivenGiftBrief.isLianMaiBrief() || bLiveGivenGiftBrief.isAudienceBrief() || bLiveGivenGiftBrief.isMultiCall() || bLiveGivenGiftBrief.isGuildCall() || bLiveGivenGiftBrief.isAuctionBrief()) {
            BLiveGiftItem bLiveGiftItemM14607w0 = m25547E2().m14607w0(bLiveGivenGiftBrief.id);
            if (bLiveGiftItemM14607w0 == null) {
                nqe.m18939B(bLiveGivenGiftBrief, m25547E2(), true, false, m25552L2());
                nqe.m18964s(bLiveGivenGiftBrief, m25547E2(), false, m25552L2());
                m7797w4(bLiveGivenGiftBrief);
                return arrayList;
            }
            nqe.m18938A(bLiveGivenGiftBrief, bLiveGiftItemM14607w0, m25547E2(), true, false, m25552L2());
            if (m25547E2().m17234j() != null) {
                if (m7794k4(bLiveGivenGiftBrief)) {
                    return m7791d4(bLiveGivenGiftBrief, bLiveGiftItemM14607w0);
                }
                arrayList.add(m7792e4(bLiveGivenGiftBrief, bLiveGiftItemM14607w0));
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m7794k4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = bLiveGivenGiftBrief.num;
        return i > 1 && bLiveGivenGiftBrief.combos - i >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m7795o4(String str) {
        ((LiveGiftTrays) ((bwr) this).viewModel).m7766l(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m7796p4(soj0 soj0Var) {
        m7803g4();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX INFO: renamed from: w4 */
    private void m7797w4(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (bLiveGivenGiftBrief.pollFromNetwork) {
            wrj.m25415l0(bLiveGivenGiftBrief);
            return;
        }
        m25547E2().m14490A1(new evj.C0549a(m25547E2().m17239o(), x350.m25673R2(m25547E2(), mo9759j3()), "live").m12718g(new d30() { // from class: l.sks
            public final void call() {
                this.f19080a.m7810r4(bLiveGivenGiftBrief);
            }
        }).m12717f(), null);
        wrj.m25382Q(bLiveGivenGiftBrief);
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m7798T() {
        super.T();
        ((LiveGiftTrays) ((bwr) this).viewModel).m7774y(0);
        this.f6179m.start();
        this.f6180n = new Handler(this.f6179m.getLooper());
        duringCreated(m25547E2().m14596q1().B()).observeOn(avk.a(this.f6180n)).map(new w9j() { // from class: l.mks
            public final Object call(Object obj) {
                return this.f15434a.m7793h4((BLiveGivenGiftBrief) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.yks
            public final void call(Object obj) {
                this.f22959a.m7789Z3((List) obj);
            }
        }));
        m14189f3(m25548F2().KeyboardEvent.show()).m14209b(new e30() { // from class: l.als
            public final void call(Object obj) {
                this.f7721a.m7806l4((KeyboardEventData) obj);
            }
        });
        m14189f3(m25548F2().DialogCenterEvent.changeVisibility()).m14209b(new e30() { // from class: l.cls
            public final void call(Object obj) {
                this.f8739a.m7802f4((tzd) obj);
            }
        });
        m14189f3(m25548F2().TraysViewEvent.changeBottomSpace()).m14209b(new e30() { // from class: l.els
            public final void call(Object obj) {
                this.f9862a.m7816x4((C0425e) obj);
            }
        });
        m14202u3(new w9j() { // from class: l.gls
            public final Object call(Object obj) {
                return ((ti1) obj).u();
            }
        }).m14209b(new e30() { // from class: l.ils
            public final void call(Object obj) {
                this.f13299a.m7807m4((LongLinkSocketMessage.LiveAnimationPlayMsg) obj);
            }
        });
        m14189f3(m25548F2().GiftTraysEvent.addGiftTrayDataToList()).m14209b(new e30() { // from class: l.kls
            public final void call(Object obj) {
                this.f14375a.m7808n4((C0421a) obj);
            }
        });
        m14189f3(m25548F2().TraysViewEvent.dismissTrayView()).m14209b(new e30() { // from class: l.oks
            public final void call(Object obj) {
                this.f16686a.m7795o4((String) obj);
            }
        });
        m14189f3(m25548F2().GiftDialogEventGroup.giftDialogHeightChange()).m14209b(new e30() { // from class: l.qks
            public final void call(Object obj) {
                this.f18078a.m7796p4((soj0) obj);
            }
        });
        m14188d3(bvj.class, new w9j() { // from class: l.uks
            public final Object call(Object obj) {
                return this.f20691a.m7809q4((bvj) obj);
            }
        });
        duringCreated(m25547E2().m14596q1().D()).subscribe(ffw.h(new e30() { // from class: l.wks
            public final void call(Object obj) {
                this.f21817a.m7804i4((LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: W3 */
    public final void m7799W3(GiftTrayData giftTrayData, boolean z) {
        String str = giftTrayData.f6161y;
        if (TextUtils.isEmpty(str)) {
            m7787X3(giftTrayData);
            return;
        }
        BLiveEffect bLiveEffectM10044h = aqe.m10039i().m10044h(str);
        if (bLiveEffectM10044h == null) {
            bwc0 bwc0VarM10631b = bwc0.m10631b(giftTrayData, giftTrayData.m7734v(), m25552L2());
            bwc0VarM10631b.m10632a().m17352e(false);
            aqe.m10039i().m10059x(str, bwc0VarM10631b, new C0416a(str, System.currentTimeMillis(), bwc0VarM10631b, z, giftTrayData));
            wrj.m25427u("本地effect资源没有");
            m7787X3(giftTrayData);
            return;
        }
        boolean z2 = giftTrayData.m7738z() || aqe.m10039i().m10045j(bLiveEffectM10044h.id);
        if (z) {
            nqe.m18943F(m25547E2().mo9893p(), giftTrayData.f6161y, z2 || spe.m22604d(bLiveEffectM10044h.type).m17695e(bLiveEffectM10044h.id, false, null), true, true);
        }
        if (z2) {
            m7787X3(giftTrayData);
        } else {
            m7790c4(giftTrayData, bLiveEffectM10044h);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public boolean mo7800a4(GiftTrayData giftTrayData) {
        return true;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m7801b4(int i) {
        if (this.f6178l != i) {
            this.f6178l = i;
            ((LiveGiftTrays) ((bwr) this).viewModel).m7774y(-i);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m7802f4(tzd tzdVar) {
        if (tzdVar.f20436a != LiveDialogEnum.GIFT) {
            return;
        }
        if (tzdVar.f20438c) {
            m7803g4();
        } else {
            m7801b4(this.f6177k);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m7803g4() {
        m7801b4(Math.max(((xnj.C0900a) m14184F3(new xnj(700))).m26043b() + f6174o, this.f6178l));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m7804i4(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (TextUtils.isEmpty(intlLuckyGiftTray.getReward()) || ((LiveGiftTrays) ((bwr) this).viewModel).m7761E(intlLuckyGiftTray)) {
            return;
        }
        this.f6175i.m11920n(intlLuckyGiftTray);
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m7805j4(TrayType trayType) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar == null) {
            return true;
        }
        return ((LiveGiftTrays) s7mVar).m7769p(trayType);
    }

    /* JADX INFO: renamed from: l4 */
    public void m7806l4(KeyboardEventData keyboardEventData) {
        if (keyboardEventData.m5201b()) {
            m7801b4(keyboardEventData.m5200a());
        } else {
            m7801b4(this.f6177k);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m7807m4(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg) {
        m7799W3(GiftTrayData.m7714j(liveAnimationPlayMsg, this.f22036e.f8339h.mo14489A0()), false);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        reset();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m7808n4(C0421a c0421a) {
        m7799W3(c0421a.f6200f, false);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ aet m7809q4(bvj bvjVar) {
        return this.f6175i.m11917k();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m7810r4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.pollFromNetwork = true;
        m25547E2().m14498E1(bLiveGivenGiftBrief);
    }

    public void reset() {
        HandlerThread handlerThread = this.f6179m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f6179m = null;
        }
        if (this.f6180n != null) {
            this.f6180n = null;
        }
        this.f6175i.m11915i();
        RunnableC0424d runnableC0424d = this.f6176j;
        if (runnableC0424d != null) {
            runnableC0424d.m7871d();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m7811s4(C0425e.b bVar) {
        m25548F2().TraysViewEvent.notifyTrayRewardAnimPlay().j(bVar);
    }

    /* JADX INFO: renamed from: t */
    public void m7812t() {
        super.t();
        ((LiveGiftTrays) ((bwr) this).viewModel).init();
        m7818z4();
    }

    /* JADX INFO: renamed from: t4 */
    public void m7813t4(GiftTrayData giftTrayData) {
        synchronized (this.f6175i) {
            if (giftTrayData != null) {
                try {
                    this.f6175i.m11914g(giftTrayData);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f6175i.notifyAll();
        }
        m25548F2().GiftTraysEvent.onAnimationStateChange().j(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: u4 */
    public void m7814u4(GiftTrayData giftTrayData, TrayType trayType) {
        ((LiveGiftTrays) ((bwr) this).viewModel).m7758B(trayType, giftTrayData, mo7800a4(giftTrayData));
        m25548F2().GiftTraysEvent.onAnimationStateChange().j(Boolean.TRUE);
        axj.m10092f(m25547E2().m17234j(), m25547E2().m17238n(), m25547E2().mo9893p(), mo9759j3(), giftTrayData);
    }

    /* JADX INFO: renamed from: v4 */
    public void m7815v4(GiftTrayData giftTrayData) {
        if (!TextUtils.isEmpty(giftTrayData.f6161y) || giftTrayData.m7730r()) {
            m25548F2().GiftTraysEvent.playGiftLayer().j(new C0421a.a(1500).m7850f(giftTrayData).m7849e());
        } else {
            wrj.m25414l("LiveGiftTraysPresenter playLayer", giftTrayData);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m7816x4(C0425e c0425e) {
        if (c0425e.mo16065a() == 4400 || c0425e.mo16065a() == 6000) {
            this.f6177k = c0425e.m7872b() - l9e.m;
            if (m25551K2().m22218f(LiveDialogEnum.GIFT) || m25551K2().m22218f(LiveDialogEnum.CHAT_INPUT)) {
                return;
            }
            m7801b4(this.f6177k);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m7817y4(String str) {
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1500).userId(str).setSource("gift").setFromIdentity(bqq.m10554a(this, mo9759j3(), str, 1500)).setTo(bqq.m10557d(this, mo9759j3(), str, 1500)).setScene("live").trackFrom("giftBanner").build());
    }

    /* JADX INFO: renamed from: z4 */
    public void m7818z4() {
        RunnableC0424d runnableC0424d = new RunnableC0424d(this.f6175i, this);
        this.f6176j = runnableC0424d;
        gbu.b.a(runnableC0424d);
    }
}
