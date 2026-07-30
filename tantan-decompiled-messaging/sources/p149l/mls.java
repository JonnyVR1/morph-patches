package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray.LiveVChatGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p133rx.C22306c;
import p149l.jlu;

/* JADX INFO: loaded from: classes13.dex */
public class mls<T extends jlu> extends zeu<LiveVChatGiftTrays> {

    /* JADX INFO: renamed from: j */
    public static final int f134520j = t100.m186890d(36.0f);

    /* JADX INFO: renamed from: f */
    public final dis f134521f;

    /* JADX INFO: renamed from: g */
    public s9j0 f134522g;

    /* JADX INFO: renamed from: h */
    public HandlerThread f134523h;

    /* JADX INFO: renamed from: i */
    public Handler f134524i;

    /* JADX INFO: renamed from: l.mls$b */
    public class C18497b extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f134526a;

        public C18497b(GiftTrayData giftTrayData) {
            this.f134526a = giftTrayData;
        }

        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(File file) {
            mls.this.m155257e3(this.f134526a);
        }

        @Override // p149l.i7e, p149l.h7e
        public void onFailed(String str) {
            mls.this.m155257e3(this.f134526a);
        }
    }

    public mls(jlu jluVar, LiveVChatGiftTrays liveVChatGiftTrays) {
        super(jluVar);
        this.f134523h = new HandlerThread("live_gift_list");
        this.f134521f = new dis();
        mo51532C(liveVChatGiftTrays);
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ void m155252Y2(Throwable th) {
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ int m155253Z2(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo2) {
        return (int) (bLiveGiftGearEffectInfo.since - bLiveGiftGearEffectInfo2.since);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public void m155257e3(GiftTrayData giftTrayData) {
        if (((LiveVChatGiftTrays) this.viewModel).m69351c(giftTrayData)) {
            return;
        }
        if (giftTrayData.m74170w()) {
            ((LiveVChatGiftTrays) this.viewModel).m69355i(giftTrayData);
        }
        this.f134521f.m111916d(giftTrayData);
        synchronized (this.f134521f) {
            this.f134521f.notifyAll();
        }
    }

    /* JADX INFO: renamed from: B3 */
    public void m155258B3(GiftTrayData giftTrayData) {
        if (!TextUtils.isEmpty(giftTrayData.f50087Q == 1 ? giftTrayData.f50085O : giftTrayData.f50119y) || giftTrayData.m74165r()) {
            if (giftTrayData.f50086P == 1) {
                m218411K2().GiftTraysEventGroup.m69183b().mo172463j(new fxj.C16957a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m123633f(giftTrayData).m123632e());
            } else {
                m218411K2().GiftTraysEventGroup.m69185d().mo172463j(new fxj.C16957a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m123633f(giftTrayData).m123632e());
            }
        }
    }

    /* JADX INFO: renamed from: C3 */
    public final void m155259C3(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (bLiveGivenGiftBrief.pollFromNetwork) {
            return;
        }
        m218409H2().m203914N(new evj.C16689a(m218409H2().m203945v(), m218409H2().m203938o(), "live").m118278g(new d30() { // from class: l.rks
            @Override // p149l.d30
            public final void call() {
                this.f159880a.m155279x3(bLiveGivenGiftBrief);
            }
        }).m118277f(), null);
    }

    /* JADX INFO: renamed from: D3 */
    public void m155260D3() {
        s9j0 s9j0Var = new s9j0(this.f134521f, this);
        this.f134522g = s9j0Var;
        gbu.f101912b.m125328a(s9j0Var);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((LiveVChatGiftTrays) this.viewModel).m69358l(0);
        this.f134523h.start();
        this.f134524i = new Handler(this.f134523h.getLooper());
        duringCreated((C22306c<T>) m218409H2().f186998c.m216979l().m189036B()).observeOn(avk.m99199a(this.f134524i)).filter(new w9j() { // from class: l.nks
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139468a.m155273r3((BLiveGivenGiftBrief) obj);
            }
        }).map(new w9j() { // from class: l.vks
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181842a.m155270o3((BLiveGivenGiftBrief) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.xks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193348a.m155263g3((List) obj);
            }
        }));
        duringCreated((C22306c<T>) m218411K2().GiftDialogEventGroup.m69173a().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.zks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203559a.m155269n3((Boolean) obj);
            }
        }));
        duringCreated((C22306c<T>) m218409H2().f186998c.m216979l().m189146u()).subscribe(ffw.m121194e(new e30() { // from class: l.bls
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76208a.m155274s3((LongLinkSocketMessage.LiveAnimationPlayMsg) obj);
            }
        }, new e30() { // from class: l.dls
            @Override // p149l.e30
            public final void call(Object obj) {
                mls.m155252Y2((Throwable) obj);
            }
        }));
        duringCreated((C22306c<T>) m218411K2().GiftTraysEventGroup.m69182a().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.fls
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98219a.m155275t3((fxj) obj);
            }
        }));
        m218408F2(lpj.class, new w9j() { // from class: l.hls
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108371a.m155276u3((lpj) obj);
            }
        });
        duringCreated((C22306c<T>) m218411K2().TraysViewEventGroup.m69205a().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.jls
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118565a.m155277v3((String) obj);
            }
        }));
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.lls
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128747a.m155278w3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d3 */
    public final void m155261d3(GiftTrayData giftTrayData) {
        String str = giftTrayData.f50087Q == 1 ? giftTrayData.f50085O : giftTrayData.f50119y;
        if (TextUtils.isEmpty(str)) {
            m155257e3(giftTrayData);
            return;
        }
        BLiveEffect bLiveEffectM98266h = aqe.m98261i().m98266h(str);
        if (bLiveEffectM98266h == null) {
            bwc0 bwc0VarM104149b = bwc0.m104149b(giftTrayData, giftTrayData.m74169v(), m218414N2());
            bwc0VarM104149b.m104150a().m150991e(false);
            System.currentTimeMillis();
            aqe.m98261i().m98281x(str, bwc0VarM104149b, new C18496a());
            m155257e3(giftTrayData);
            return;
        }
        if (giftTrayData.m74173z() || aqe.m98261i().m98267j(bLiveEffectM98266h.f44359id)) {
            m155257e3(giftTrayData);
        } else {
            m155266j3(giftTrayData, bLiveEffectM98266h);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final void m155262f3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        for (GiftTrayData giftTrayData : list) {
            if (list.get(0) == giftTrayData || giftTrayData.f50107m) {
                m155261d3(giftTrayData);
            } else {
                m155257e3(giftTrayData);
            }
        }
    }

    @MainThread
    /* JADX INFO: renamed from: g3 */
    public final void m155263g3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        m155262f3(list);
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m155264h3(GiftTrayData giftTrayData) {
        return true;
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m155265i3(BLiveEnterRoom bLiveEnterRoom) {
        if (TextUtils.isEmpty(bLiveEnterRoom.enterVersion == 1 ? bLiveEnterRoom.newResourceId : bLiveEnterRoom.effectId)) {
            return false;
        }
        m155261d3(GiftTrayData.m74147g(bLiveEnterRoom, "videoChat"));
        return true;
    }

    /* JADX INFO: renamed from: j3 */
    public final void m155266j3(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        if (spe.m185365d(bLiveEffect.type).mo107445f(bLiveEffect.f44359id, true, new C18497b(giftTrayData), bwc0.m104149b(giftTrayData, false, m218414N2()))) {
            m155257e3(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final List<GiftTrayData> m155267k3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGivenGiftBrief.isGear && !bLiveGiftItem.gear.gearEffects.isEmpty()) {
            Collections.sort(bLiveGiftItem.gear.gearEffects, new Comparator() { // from class: l.pks
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return mls.m155253Z2((BLiveGiftGearEffectInfo) obj, (BLiveGiftGearEffectInfo) obj2);
                }
            });
        }
        return exj.m118669a(bLiveGivenGiftBrief, bLiveGiftItem, m218409H2().m203942s());
    }

    /* JADX INFO: renamed from: m3 */
    public final GiftTrayData m155268m3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        GiftTrayData giftTrayDataM74153o = GiftTrayData.m74153o(bLiveGiftItem, bLiveGivenGiftBrief, null);
        BLiveGiftItem bLiveGiftItemM203941r = m218409H2().m203941r(bLiveGiftItem.f44377id);
        if (bLiveGiftItemM203941r != null) {
            String str = bLiveGiftItemM203941r.url;
            giftTrayDataM74153o.f50118x = str;
            giftTrayDataM74153o.f50117w = str;
        }
        giftTrayDataM74153o.f50102h = m218409H2().m203942s();
        exj.m118670c(bLiveGiftItem, giftTrayDataM74153o, bLiveGivenGiftBrief);
        return giftTrayDataM74153o;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        reset();
    }

    /* JADX INFO: renamed from: n3 */
    public void m155269n3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((LiveVChatGiftTrays) v2).m69358l(-t100.m186890d(100.0f));
        } else {
            ((LiveVChatGiftTrays) v2).m69358l(0);
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final List<GiftTrayData> m155270o3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        ArrayList arrayList = new ArrayList(0);
        if (!bLiveGivenGiftBrief.isGiftBrief() && !bLiveGivenGiftBrief.isLianMaiBrief() && !bLiveGivenGiftBrief.isAudienceBrief() && !bLiveGivenGiftBrief.isMultiCall() && !bLiveGivenGiftBrief.isGuildCall() && !bLiveGivenGiftBrief.isAuctionBrief()) {
            return arrayList;
        }
        BLiveGiftItem bLiveGiftItemM203941r = m218409H2().m203941r(bLiveGivenGiftBrief.f44385id);
        if (bLiveGiftItemM203941r == null) {
            m155259C3(bLiveGivenGiftBrief);
            return arrayList;
        }
        if (m155272q3(bLiveGivenGiftBrief)) {
            return m155267k3(bLiveGivenGiftBrief, bLiveGiftItemM203941r);
        }
        arrayList.add(m155268m3(bLiveGivenGiftBrief, bLiveGiftItemM203941r));
        return arrayList;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m155271p3(LiveGiftTraysPresenter.TrayType trayType) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return true;
        }
        return ((LiveVChatGiftTrays) v2).m69356j(trayType);
    }

    /* JADX INFO: renamed from: q3 */
    public final boolean m155272q3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = bLiveGivenGiftBrief.num;
        return i > 1 && bLiveGivenGiftBrief.combos - i >= 0;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Boolean m155273r3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return Boolean.valueOf(TextUtils.isEmpty(bLiveGivenGiftBrief.videoChatId) || bLiveGivenGiftBrief.videoChatId.equals(m218409H2().m203901A().f44474id));
    }

    public void reset() {
        HandlerThread handlerThread = this.f134523h;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f134523h = null;
        }
        if (this.f134524i != null) {
            this.f134524i = null;
        }
        this.f134521f.m111920i();
        s9j0 s9j0Var = this.f134522g;
        if (s9j0Var != null) {
            s9j0Var.m182734d();
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m155274s3(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg) {
        m155261d3(GiftTrayData.m74149j(liveAnimationPlayMsg, "videoChat"));
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m155275t3(fxj fxjVar) {
        m155261d3(fxjVar.f99770f);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ Boolean m155276u3(lpj lpjVar) {
        return Boolean.valueOf(m155265i3(lpjVar.f129224c));
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m155277v3(String str) {
        ((LiveVChatGiftTrays) this.viewModel).m69353e(str);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m155278w3(String str) {
        if (slk0.m184825a(m218409H2().m203901A())) {
            m155260D3();
            return;
        }
        if (slk0.m184829e(m218409H2().m203901A())) {
            this.f134521f.m111920i();
            s9j0 s9j0Var = this.f134522g;
            if (s9j0Var != null) {
                s9j0Var.m182734d();
            }
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m155279x3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.pollFromNetwork = true;
        m218409H2().m203916P(bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: y3 */
    public void m155280y3(GiftTrayData giftTrayData) {
        synchronized (this.f134521f) {
            if (giftTrayData != null) {
                try {
                    this.f134521f.m111919g(giftTrayData);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f134521f.notifyAll();
        }
        m218411K2().GiftTraysEventGroup.m69184c().mo172463j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: z3 */
    public void m155281z3(GiftTrayData giftTrayData, LiveGiftTraysPresenter.TrayType trayType) {
        ((LiveVChatGiftTrays) this.viewModel).m69360p(trayType, giftTrayData, m155264h3(giftTrayData));
        m218411K2().GiftTraysEventGroup.m69184c().mo172463j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l.mls$a */
    public class C18496a extends i7e {
        public C18496a() {
        }

        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NonNull File file) {
            super.mo74248a(file);
        }

        @Override // p149l.i7e, p149l.h7e
        public void onFailed(String str) {
        }
    }
}
