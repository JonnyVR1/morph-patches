package p149l;

import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PaymentData;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstRechargeStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.C12867a;
import com.tencent.mmkv.MMKV;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class ltv extends pl2 {

    /* JADX INFO: renamed from: A */
    public boolean f130006A;

    /* JADX INFO: renamed from: B */
    public BLiveFirstRechargeDetail f130007B;

    /* JADX INFO: renamed from: s */
    public boolean f130008s;

    /* JADX INFO: renamed from: t */
    public String f130009t;

    /* JADX INFO: renamed from: u */
    public boolean f130010u;

    /* JADX INFO: renamed from: v */
    public boolean f130011v;

    /* JADX INFO: renamed from: w */
    public c4g0 f130012w;

    /* JADX INFO: renamed from: x */
    public c4g0 f130013x;

    /* JADX INFO: renamed from: y */
    public boolean f130014y;

    /* JADX INFO: renamed from: z */
    public boolean f130015z;

    public ltv(bsm bsmVar) {
        super(bsmVar);
        this.f130008s = false;
        this.f130011v = false;
        this.f130014y = false;
        this.f130015z = false;
        this.f130006A = false;
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ List m151728G4(List list) {
        return list.size() > 5 ? list.subList(0, 5) : list;
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ BLiveData m151734M4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: Q4 */
    public BLiveFirstRechargeDetail m151738Q4() {
        return this.f130007B;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    @NotNull
    /* JADX INFO: renamed from: R4 */
    public PurchasePaymentParam m151739R4(pl2.C19263b c19263b) {
        PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        BLiveAbsData bLiveAbsDataM132152n0 = m206027E2().m132152n0();
        if (bLiveAbsDataM132152n0 != null && bLiveAbsDataM132152n0.isNormalLive() && this.f130008s) {
            purchasePaymentParamNew_.ext.purchaseEnv = PaymentData.FROM_LIVE_RECHARGE;
        }
        purchasePaymentParamNew_.itemId = c19263b.f150065a;
        int i = c19263b.f150067c;
        if (i > 0) {
            purchasePaymentParamNew_.quantity = i;
        }
        return purchasePaymentParamNew_;
    }

    /* JADX INFO: renamed from: S4 */
    public final void m151740S4(boolean z) {
        if (this.f150056l == null) {
            return;
        }
        pl2.C19263b c19263b = new pl2.C19263b();
        c19263b.f150065a = this.f150056l.defaultStockKeepUnit.f44443id;
        c19263b.f150066b = 1;
        c19263b.f150067c = 10;
        c19263b.f150068d = 10;
        c19263b.f150070f = z ? ypv.f199493a.m199350i() : ypv.f199493a.m199354k();
        mo125578l4(c19263b);
    }

    @Override // p149l.pl2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(wvk.class, new w9j() { // from class: l.usv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f178205a.m151741T4((wvk) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ Boolean m151741T4(wvk wvkVar) {
        return Boolean.valueOf(this.f130011v);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m151742U4(pl2.C19263b c19263b) {
        mo151756o4(c19263b.f150068d, true);
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: V3 */
    public List<BLiveMerchandise> mo125574V3(List<BLiveMerchandise> list) {
        BLiveFirstRechargeDetail bLiveFirstRechargeDetail;
        if (this.f150056l != null) {
            if (!m170095b4() && ((bLiveFirstRechargeDetail = this.f130007B) == null || !bLiveFirstRechargeDetail.hasAdditionalCheckout)) {
                BLiveMerchandise bLiveMerchandise = this.f150056l;
                bLiveMerchandise.isCustomRecharge = true;
                bLiveMerchandise.defaultStockKeepUnit.prices.price = 10.0d;
                bLiveMerchandise.quantity = 0;
                bLiveMerchandise.isCustomRechargeInput = false;
                list.add(bLiveMerchandise);
                return list;
            }
            BLiveMerchandise bLiveMerchandise2 = this.f150056l;
            bLiveMerchandise2.isCustomRecharge = false;
            bLiveMerchandise2.isOneRMBRecharge = true;
            bLiveMerchandise2.defaultStockKeepUnit.prices.price = 1.0d;
            bLiveMerchandise2.quantity = 10;
            bLiveMerchandise2.isCustomRechargeInput = true;
            list.add(0, bLiveMerchandise2);
        }
        return list;
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m151743V4(boolean z, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        this.f130007B = bLiveFirstRechargeDetail;
        boolean z2 = bLiveFirstRechargeDetail.isActive;
        boolean z3 = false;
        this.f130010u = z2 && bLiveFirstRechargeDetail.showDialogBonus;
        if (z2 && !bLiveFirstRechargeDetail.showDialogBonus) {
            z3 = true;
        }
        this.f130008s = z3;
        if (z3) {
            m151740S4(z);
        } else {
            osi0.m165783g("活动资格已用完");
            m206028F2().LiveBridgeImplEvent.closeLiveCampaignDialog().m172467p();
        }
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: W3 */
    public C22306c<List<BLiveMerchandise>> mo125575W3() {
        return C22306c.just(ypv.f199493a.m199352j()).flatMap(new w9j() { // from class: l.jtv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ypv.f199493a.m199343e0((String) obj, false);
            }
        }).filter(new w9j() { // from class: l.ktv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).map(new w9j() { // from class: l.vsv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ltv.m151728G4((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m151744W4(nig nigVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        this.f130007B = bLiveFirstRechargeDetail;
        boolean z = bLiveFirstRechargeDetail.isActive;
        boolean z2 = false;
        this.f130010u = z && bLiveFirstRechargeDetail.showDialogBonus;
        if (z && !bLiveFirstRechargeDetail.showDialogBonus) {
            z2 = true;
        }
        this.f130008s = z2;
        m170105q4();
        m170110x4(nigVar);
        m170091A4(nigVar, this.f130009t);
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: X3 */
    public C22306c<BLiveMerchandise> mo125576X3() {
        return ypv.f199493a.m199343e0(ProductCategory.customCoin, false).filter(new w9j() { // from class: l.gtv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.htv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just((BLiveMerchandise) ((List) obj).get(0));
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m151745X4(nig nigVar, Throwable th) {
        m170110x4(nigVar);
        m170091A4(nigVar, this.f130009t);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    @Override // p149l.pl2
    /* JADX INFO: renamed from: Y3 */
    public C22306c<BLiveData> mo125577Y3() {
        return m206027E2().m132177z1().onErrorReturn(new w9j() { // from class: l.itv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ltv.m151734M4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m151746Y4(int i, Long l2) {
        int iLongValue = (int) (((long) i) - l2.longValue());
        ((C12867a) this.viewModel).m75181P0(m151754g5(iLongValue));
        if (iLongValue <= 0) {
            ((al2) this.viewModel).mo75193v();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m151747Z4(Long l2) {
        if (l2.longValue() == 3) {
            ((C12867a) this.viewModel).m75182Q0(false);
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m151748a5(BLiveFirstRechargeStatus bLiveFirstRechargeStatus) {
        this.f130009t = bLiveFirstRechargeStatus.abGroup;
        this.f130011v = bLiveFirstRechargeStatus.showNotice;
    }

    /* JADX INFO: renamed from: b5 */
    public void m151749b5(String str) {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(900).m142598B(str).m142603t(80).m142609z(1.0d, 0.73d).m142602s(t100.m186890d(12.0f)).m142600q());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c5 */
    public void m151750c5(final boolean z) {
        this.f130006A = true;
        duringCreated(LivingNormalApiProvider.m71319Q4(m206027E2().m149818o(), mo96662j3())).subscribe(ffw.m121194e(new e30() { // from class: l.wsv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187978a.m151743V4(z, (BLiveFirstRechargeDetail) obj);
            }
        }, new e30() { // from class: l.xsv
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("网络异常，请稍后再试");
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d5 */
    public void m151751d5(final int i) {
        if (i >= 3) {
            this.f130012w = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).take(i).subscribe(ffw.m121197h(new e30() { // from class: l.atv
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71683a.m151746Y4(i, (Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: e5 */
    public void m151752e5() {
        mkd0.m154992z(this.f130013x);
        this.f130013x = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).take(3).subscribe(ffw.m121197h(new e30() { // from class: l.btv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77266a.m151747Z4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f5 */
    public void m151753f5(String str, int i, PayMethod payMethod) {
        boolean z = true;
        if (TEnum.equals(payMethod, "alipay")) {
            String str2 = this.f150060p;
            boolean z2 = this.f150053i;
            if (!this.f130008s && !this.f130010u) {
                z = false;
            }
            zgc0.m218631c(str, i, str2, z2, z);
            return;
        }
        if (TEnum.equals(payMethod, "wechat")) {
            String str3 = this.f150060p;
            boolean z3 = this.f150053i;
            if (!this.f130008s && !this.f130010u) {
                z = false;
            }
            zgc0.m218639k(str, i, str3, z3, z);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final String m151754g5(int i) {
        int i2 = i / MMKV.ExpireInDay;
        int i3 = i / MMKV.ExpireInHour;
        int i4 = i / 60;
        int i5 = i % 60;
        if (i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0) {
            return "";
        }
        if (i2 > 0) {
            return i2 + "天" + (i3 % 24) + "小时";
        }
        if (i3 > 0) {
            return i3 + "小时" + (i4 % 60) + "分";
        }
        return i4 + "分" + i5 + "秒";
    }

    /* JADX INFO: renamed from: h5 */
    public void m151755h5() {
        mkd0.m154992z(this.f130012w);
        mkd0.m154992z(this.f130013x);
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: l4 */
    public void mo125578l4(final pl2.C19263b c19263b) {
        ypv.f199493a.m199333Z(act(), m151739R4(c19263b), new d30() { // from class: l.ysv
            @Override // p149l.d30
            public final void call() {
                this.f199834a.m151742U4(c19263b);
            }
        }, new d30() { // from class: l.zsv
            @Override // p149l.d30
            public final void call() {
                this.f204647a.m170104n4();
            }
        }, c19263b.f150070f);
        m151753f5(c19263b.f150065a, c19263b.f150066b, c19263b.f150070f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    @Override // p149l.pl2
    /* JADX INFO: renamed from: o4 */
    public void mo151756o4(int i, boolean z) {
        pge0 pge0Var;
        BLiveGiftItem bLiveGiftItemM132171w0 = m206027E2().m132171w0(this.f130007B.trialGiftId);
        if (this.f130010u) {
            this.f130011v = false;
            this.f130014y = true;
            ehc0.m116449f(this, this.f130007B);
            super.mo151756o4(i, true);
            return;
        }
        if (!this.f130008s) {
            super.mo151756o4(i, true);
            return;
        }
        this.f130011v = false;
        this.f130014y = true;
        if (this.f130006A) {
            this.f130006A = false;
            m206028F2().LiveBridgeImplEvent.closeLiveCampaignDialog().m172467p();
            m206028F2().FastRechargeEventGroup.closeFastRechargeDialog().m172467p();
        }
        if (this.f150059o == 2 && (pge0Var = this.f150057m) != null) {
            ehc0.m116448e(this, this.f130007B, pge0Var.f148656e, this.f130009t, pge0Var, mo77274R2(), true, this.f130015z);
            super.mo151756o4(i, false);
        } else {
            if (bLiveGiftItemM132171w0 != null) {
                ehc0.m116448e(this, this.f130007B, bLiveGiftItemM132171w0, this.f130009t, this.f150057m, mo77274R2(), false, this.f130015z);
            }
            super.mo151756o4(i, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(LivingNormalApiProvider.m71409a4(mo96662j3(), m206027E2().m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.ctv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82502a.m151748a5((BLiveFirstRechargeStatus) obj);
            }
        }));
        duringCreated(m206028F2().LiveBridgeImplEvent.payFirstRecharge().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.dtv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87896a.m151750c5(((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: u4 */
    public void mo125580u4() {
        mo51532C(new C12867a());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    @Override // p149l.pl2
    /* JADX INFO: renamed from: v4 */
    public void mo125581v4(final nig nigVar) {
        this.f130015z = "liveSchema".equals(nigVar.f139090c);
        duringCreated(LivingNormalApiProvider.m71319Q4(m206027E2().m149818o(), mo96662j3())).subscribe(ffw.m121194e(new e30() { // from class: l.etv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93178a.m151744W4(nigVar, (BLiveFirstRechargeDetail) obj);
            }
        }, new e30() { // from class: l.ftv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99270a.m151745X4(nigVar, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: z4 */
    public boolean mo125582z4() {
        if (this.f130014y) {
            this.f130014y = false;
            return false;
        }
        if (!this.f130015z) {
            return true;
        }
        this.f130015z = false;
        return false;
    }
}
