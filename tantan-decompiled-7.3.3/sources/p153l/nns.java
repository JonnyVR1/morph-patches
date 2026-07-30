package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray.LiveVChatGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p137rx.C22421c;
import p153l.knu;

/* JADX INFO: loaded from: classes9.dex */
public class nns<T extends knu> extends ahu<LiveVChatGiftTrays> {

    /* JADX INFO: renamed from: j */
    public static final int f142876j = qa00.m175859d(36.0f);

    /* JADX INFO: renamed from: f */
    public final eks f142877f;

    /* JADX INFO: renamed from: g */
    public wij0 f142878g;

    /* JADX INFO: renamed from: h */
    public HandlerThread f142879h;

    /* JADX INFO: renamed from: i */
    public Handler f142880i;

    /* JADX INFO: renamed from: l.nns$b */
    public class C18909b extends x8e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f142882a;

        public C18909b(GiftTrayData giftTrayData) {
            this.f142882a = giftTrayData;
        }

        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(File file) {
            nns.this.m163971e3(this.f142882a);
        }

        @Override // p153l.x8e, p153l.w8e
        public void onFailed(String str) {
            nns.this.m163971e3(this.f142882a);
        }
    }

    public nns(knu knuVar, LiveVChatGiftTrays liveVChatGiftTrays) {
        super(knuVar);
        this.f142879h = new HandlerThread("live_gift_list");
        this.f142877f = new eks();
        mo52715C(liveVChatGiftTrays);
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ void m163966Y2(Throwable th) {
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ int m163967Z2(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo2) {
        return (int) (bLiveGiftGearEffectInfo.since - bLiveGiftGearEffectInfo2.since);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public void m163971e3(GiftTrayData giftTrayData) {
        if (((LiveVChatGiftTrays) this.viewModel).m70534c(giftTrayData)) {
            return;
        }
        if (giftTrayData.m75353w()) {
            ((LiveVChatGiftTrays) this.viewModel).m70538i(giftTrayData);
        }
        this.f142877f.m121073d(giftTrayData);
        synchronized (this.f142877f) {
            this.f142877f.notifyAll();
        }
    }

    /* JADX INFO: renamed from: B3 */
    public void m163972B3(GiftTrayData giftTrayData) {
        if (!TextUtils.isEmpty(giftTrayData.f50935Q == 1 ? giftTrayData.f50933O : giftTrayData.f50967y) || giftTrayData.m75348r()) {
            if (giftTrayData.f50934P == 1) {
                m97928K2().GiftTraysEventGroup.m70366b().mo199273j(new vzj.C20963a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m204113f(giftTrayData).m204112e());
            } else {
                m97928K2().GiftTraysEventGroup.m70368d().mo199273j(new vzj.C20963a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m204113f(giftTrayData).m204112e());
            }
        }
    }

    /* JADX INFO: renamed from: C3 */
    public final void m163973C3(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (bLiveGivenGiftBrief.pollFromNetwork) {
            return;
        }
        m97926H2().m212321N(new uxj.C20693a(m97926H2().m212352v(), m97926H2().m212345o(), "live").m198495g(new x20() { // from class: l.sms
            @Override // p153l.x20
            public final void call() {
                this.f169610a.m163993x3(bLiveGivenGiftBrief);
            }
        }).m198494f(), null);
    }

    /* JADX INFO: renamed from: D3 */
    public void m163974D3() {
        wij0 wij0Var = new wij0(this.f142877f, this);
        this.f142878g = wij0Var;
        hdu.f109038b.m134613a(wij0Var);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((LiveVChatGiftTrays) this.viewModel).m70541l(0);
        this.f142879h.start();
        this.f142880i = new Handler(this.f142879h.getLooper());
        duringCreated((C22421c<T>) m97926H2().f195472c.m120391l().m98218B()).observeOn(qxk.m178605a(this.f142880i)).filter(new qcj() { // from class: l.oms
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147995a.m163987r3((BLiveGivenGiftBrief) obj);
            }
        }).map(new qcj() { // from class: l.wms
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189836a.m163984o3((BLiveGivenGiftBrief) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.yms
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200711a.m163977g3((List) obj);
            }
        }));
        duringCreated((C22421c<T>) m97928K2().GiftDialogEventGroup.m70356a().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ans
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72378a.m163983n3((Boolean) obj);
            }
        }));
        duringCreated((C22421c<T>) m97926H2().f195472c.m120391l().m98328u()).subscribe(dhw.m115826e(new y20() { // from class: l.cns
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82785a.m163988s3((LongLinkSocketMessage.LiveAnimationPlayMsg) obj);
            }
        }, new y20() { // from class: l.ens
            @Override // p153l.y20
            public final void call(Object obj) {
                nns.m163966Y2((Throwable) obj);
            }
        }));
        duringCreated((C22421c<T>) m97928K2().GiftTraysEventGroup.m70365a().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.gns
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105138a.m163989t3((vzj) obj);
            }
        }));
        m97925F2(bsj.class, new qcj() { // from class: l.ins
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f115998a.m163990u3((bsj) obj);
            }
        });
        duringCreated((C22421c<T>) m97928K2().TraysViewEventGroup.m70388a().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.kns
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127636a.m163991v3((String) obj);
            }
        }));
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.mns
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137726a.m163992w3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d3 */
    public final void m163975d3(GiftTrayData giftTrayData) {
        String str = giftTrayData.f50935Q == 1 ? giftTrayData.f50933O : giftTrayData.f50967y;
        if (TextUtils.isEmpty(str)) {
            m163971e3(giftTrayData);
            return;
        }
        BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(str);
        if (bLiveEffectM122151h == null) {
            e4d0 e4d0VarM119410b = e4d0.m119410b(giftTrayData, giftTrayData.m75352v(), m97931N2());
            e4d0VarM119410b.m119411a().m173459e(false);
            System.currentTimeMillis();
            ere.m122146i().m122166x(str, e4d0VarM119410b, new C18908a());
            m163971e3(giftTrayData);
            return;
        }
        if (giftTrayData.m75356z() || ere.m122146i().m122152j(bLiveEffectM122151h.f45207id)) {
            m163971e3(giftTrayData);
        } else {
            m163980j3(giftTrayData, bLiveEffectM122151h);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final void m163976f3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        for (GiftTrayData giftTrayData : list) {
            if (list.get(0) == giftTrayData || giftTrayData.f50955m) {
                m163975d3(giftTrayData);
            } else {
                m163971e3(giftTrayData);
            }
        }
    }

    @MainThread
    /* JADX INFO: renamed from: g3 */
    public final void m163977g3(List<GiftTrayData> list) {
        if (list.isEmpty()) {
            return;
        }
        m163976f3(list);
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m163978h3(GiftTrayData giftTrayData) {
        return true;
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m163979i3(BLiveEnterRoom bLiveEnterRoom) {
        if (TextUtils.isEmpty(bLiveEnterRoom.enterVersion == 1 ? bLiveEnterRoom.newResourceId : bLiveEnterRoom.effectId)) {
            return false;
        }
        m163975d3(GiftTrayData.m75330g(bLiveEnterRoom, "videoChat"));
        return true;
    }

    /* JADX INFO: renamed from: j3 */
    public final void m163980j3(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        if (wqe.m207509d(bLiveEffect.type).mo144688f(bLiveEffect.f45207id, true, new C18909b(giftTrayData), e4d0.m119410b(giftTrayData, false, m97931N2()))) {
            m163971e3(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final List<GiftTrayData> m163981k3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGivenGiftBrief.isGear && !bLiveGiftItem.gear.gearEffects.isEmpty()) {
            Collections.sort(bLiveGiftItem.gear.gearEffects, new Comparator() { // from class: l.qms
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return nns.m163967Z2((BLiveGiftGearEffectInfo) obj, (BLiveGiftGearEffectInfo) obj2);
                }
            });
        }
        return uzj.m198840a(bLiveGivenGiftBrief, bLiveGiftItem, m97926H2().m212349s());
    }

    /* JADX INFO: renamed from: m3 */
    public final GiftTrayData m163982m3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        GiftTrayData giftTrayDataM75336o = GiftTrayData.m75336o(bLiveGiftItem, bLiveGivenGiftBrief, null);
        BLiveGiftItem bLiveGiftItemM212348r = m97926H2().m212348r(bLiveGiftItem.f45225id);
        if (bLiveGiftItemM212348r != null) {
            String str = bLiveGiftItemM212348r.url;
            giftTrayDataM75336o.f50966x = str;
            giftTrayDataM75336o.f50965w = str;
        }
        giftTrayDataM75336o.f50950h = m97926H2().m212349s();
        uzj.m198841c(bLiveGiftItem, giftTrayDataM75336o, bLiveGivenGiftBrief);
        return giftTrayDataM75336o;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        reset();
    }

    /* JADX INFO: renamed from: n3 */
    public void m163983n3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((LiveVChatGiftTrays) v2).m70541l(-qa00.m175859d(100.0f));
        } else {
            ((LiveVChatGiftTrays) v2).m70541l(0);
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final List<GiftTrayData> m163984o3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        ArrayList arrayList = new ArrayList(0);
        if (!bLiveGivenGiftBrief.isGiftBrief() && !bLiveGivenGiftBrief.isLianMaiBrief() && !bLiveGivenGiftBrief.isAudienceBrief() && !bLiveGivenGiftBrief.isMultiCall() && !bLiveGivenGiftBrief.isGuildCall() && !bLiveGivenGiftBrief.isAuctionBrief()) {
            return arrayList;
        }
        BLiveGiftItem bLiveGiftItemM212348r = m97926H2().m212348r(bLiveGivenGiftBrief.f45233id);
        if (bLiveGiftItemM212348r == null) {
            m163973C3(bLiveGivenGiftBrief);
            return arrayList;
        }
        if (m163986q3(bLiveGivenGiftBrief)) {
            return m163981k3(bLiveGivenGiftBrief, bLiveGiftItemM212348r);
        }
        arrayList.add(m163982m3(bLiveGivenGiftBrief, bLiveGiftItemM212348r));
        return arrayList;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m163985p3(LiveGiftTraysPresenter.TrayType trayType) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return true;
        }
        return ((LiveVChatGiftTrays) v2).m70539j(trayType);
    }

    /* JADX INFO: renamed from: q3 */
    public final boolean m163986q3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = bLiveGivenGiftBrief.num;
        return i > 1 && bLiveGivenGiftBrief.combos - i >= 0;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Boolean m163987r3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return Boolean.valueOf(TextUtils.isEmpty(bLiveGivenGiftBrief.videoChatId) || bLiveGivenGiftBrief.videoChatId.equals(m97926H2().m212308A().f45322id));
    }

    public void reset() {
        HandlerThread handlerThread = this.f142879h;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f142879h = null;
        }
        if (this.f142880i != null) {
            this.f142880i = null;
        }
        this.f142877f.m121077i();
        wij0 wij0Var = this.f142878g;
        if (wij0Var != null) {
            wij0Var.m206590d();
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m163988s3(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg) {
        m163975d3(GiftTrayData.m75332j(liveAnimationPlayMsg, "videoChat"));
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m163989t3(vzj vzjVar) {
        m163975d3(vzjVar.f186492f);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ Boolean m163990u3(bsj bsjVar) {
        return Boolean.valueOf(m163979i3(bsjVar.f78160c));
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m163991v3(String str) {
        ((LiveVChatGiftTrays) this.viewModel).m70536e(str);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m163992w3(String str) {
        if (yuk0.m217435a(m97926H2().m212308A())) {
            m163974D3();
            return;
        }
        if (yuk0.m217439e(m97926H2().m212308A())) {
            this.f142877f.m121077i();
            wij0 wij0Var = this.f142878g;
            if (wij0Var != null) {
                wij0Var.m206590d();
            }
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m163993x3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.pollFromNetwork = true;
        m97926H2().m212323P(bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: y3 */
    public void m163994y3(GiftTrayData giftTrayData) {
        synchronized (this.f142877f) {
            if (giftTrayData != null) {
                try {
                    this.f142877f.m121076g(giftTrayData);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f142877f.notifyAll();
        }
        m97928K2().GiftTraysEventGroup.m70367c().mo199273j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: z3 */
    public void m163995z3(GiftTrayData giftTrayData, LiveGiftTraysPresenter.TrayType trayType) {
        ((LiveVChatGiftTrays) this.viewModel).m70543p(trayType, giftTrayData, m163978h3(giftTrayData));
        m97928K2().GiftTraysEventGroup.m70367c().mo199273j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l.nns$a */
    public class C18908a extends x8e {
        public C18908a() {
        }

        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NonNull File file) {
            super.mo75431a(file);
        }

        @Override // p153l.x8e, p153l.w8e
        public void onFailed(String str) {
        }
    }
}
