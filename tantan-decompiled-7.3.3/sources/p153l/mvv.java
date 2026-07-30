package p153l;

import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PaymentData;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstRechargeStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.C13030a;
import com.tencent.mmkv.MMKV;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class mvv extends xl2 {

    /* JADX INFO: renamed from: A */
    public boolean f138947A;

    /* JADX INFO: renamed from: B */
    public BLiveFirstRechargeDetail f138948B;

    /* JADX INFO: renamed from: s */
    public boolean f138949s;

    /* JADX INFO: renamed from: t */
    public String f138950t;

    /* JADX INFO: renamed from: u */
    public boolean f138951u;

    /* JADX INFO: renamed from: v */
    public boolean f138952v;

    /* JADX INFO: renamed from: w */
    public kcg0 f138953w;

    /* JADX INFO: renamed from: x */
    public kcg0 f138954x;

    /* JADX INFO: renamed from: y */
    public boolean f138955y;

    /* JADX INFO: renamed from: z */
    public boolean f138956z;

    public mvv(dum dumVar) {
        super(dumVar);
        this.f138949s = false;
        this.f138952v = false;
        this.f138955y = false;
        this.f138956z = false;
        this.f138947A = false;
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ List m160330G4(List list) {
        return list.size() > 5 ? list.subList(0, 5) : list;
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ BLiveData m160336M4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: Q4 */
    public BLiveFirstRechargeDetail m160340Q4() {
        return this.f138948B;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    @NotNull
    /* JADX INFO: renamed from: R4 */
    public PurchasePaymentParam m160341R4(xl2.C21365b c21365b) {
        PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        BLiveAbsData bLiveAbsDataM168538n0 = m213810E2().m168538n0();
        if (bLiveAbsDataM168538n0 != null && bLiveAbsDataM168538n0.isNormalLive() && this.f138949s) {
            purchasePaymentParamNew_.ext.purchaseEnv = PaymentData.FROM_LIVE_RECHARGE;
        }
        purchasePaymentParamNew_.itemId = c21365b.f194849a;
        int i = c21365b.f194851c;
        if (i > 0) {
            purchasePaymentParamNew_.quantity = i;
        }
        return purchasePaymentParamNew_;
    }

    /* JADX INFO: renamed from: S4 */
    public final void m160342S4(boolean z) {
        if (this.f194840l == null) {
            return;
        }
        xl2.C21365b c21365b = new xl2.C21365b();
        c21365b.f194849a = this.f194840l.defaultStockKeepUnit.f45291id;
        c21365b.f194850b = 1;
        c21365b.f194851c = 10;
        c21365b.f194852d = 10;
        c21365b.f194854f = z ? zrv.f205799a.m207672i() : zrv.f205799a.m207676k();
        mo130113l4(c21365b);
    }

    @Override // p153l.xl2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(myk.class, new qcj() { // from class: l.vuv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f185862a.m160343T4((myk) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ Boolean m160343T4(myk mykVar) {
        return Boolean.valueOf(this.f138952v);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m160344U4(xl2.C21365b c21365b) {
        mo160358o4(c21365b.f194852d, true);
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: V3 */
    public List<BLiveMerchandise> mo130109V3(List<BLiveMerchandise> list) {
        BLiveFirstRechargeDetail bLiveFirstRechargeDetail;
        if (this.f194840l != null) {
            if (!m211475b4() && ((bLiveFirstRechargeDetail = this.f138948B) == null || !bLiveFirstRechargeDetail.hasAdditionalCheckout)) {
                BLiveMerchandise bLiveMerchandise = this.f194840l;
                bLiveMerchandise.isCustomRecharge = true;
                bLiveMerchandise.defaultStockKeepUnit.prices.price = 10.0d;
                bLiveMerchandise.quantity = 0;
                bLiveMerchandise.isCustomRechargeInput = false;
                list.add(bLiveMerchandise);
                return list;
            }
            BLiveMerchandise bLiveMerchandise2 = this.f194840l;
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
    public final /* synthetic */ void m160345V4(boolean z, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        this.f138948B = bLiveFirstRechargeDetail;
        boolean z2 = bLiveFirstRechargeDetail.isActive;
        boolean z3 = false;
        this.f138951u = z2 && bLiveFirstRechargeDetail.showDialogBonus;
        if (z2 && !bLiveFirstRechargeDetail.showDialogBonus) {
            z3 = true;
        }
        this.f138949s = z3;
        if (z3) {
            m160342S4(z);
        } else {
            r1j0.m179420g("活动资格已用完");
            m213811F2().LiveBridgeImplEvent.closeLiveCampaignDialog().m199277p();
        }
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: W3 */
    public C22421c<List<BLiveMerchandise>> mo130110W3() {
        return C22421c.just(zrv.f205799a.m207674j()).flatMap(new qcj() { // from class: l.kvv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zrv.f205799a.m207665e0((String) obj, false);
            }
        }).filter(new qcj() { // from class: l.lvv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).map(new qcj() { // from class: l.wuv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mvv.m160330G4((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m160346W4(bkg bkgVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        this.f138948B = bLiveFirstRechargeDetail;
        boolean z = bLiveFirstRechargeDetail.isActive;
        boolean z2 = false;
        this.f138951u = z && bLiveFirstRechargeDetail.showDialogBonus;
        if (z && !bLiveFirstRechargeDetail.showDialogBonus) {
            z2 = true;
        }
        this.f138949s = z2;
        m211485q4();
        m211490x4(bkgVar);
        m211471A4(bkgVar, this.f138950t);
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: X3 */
    public C22421c<BLiveMerchandise> mo130111X3() {
        return zrv.f205799a.m207665e0(ProductCategory.customCoin, false).filter(new qcj() { // from class: l.hvv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.ivv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just((BLiveMerchandise) ((List) obj).get(0));
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m160347X4(bkg bkgVar, Throwable th) {
        m211490x4(bkgVar);
        m211471A4(bkgVar, this.f138950t);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    @Override // p153l.xl2
    /* JADX INFO: renamed from: Y3 */
    public C22421c<BLiveData> mo130112Y3() {
        return m213810E2().m168561z1().onErrorReturn(new qcj() { // from class: l.jvv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mvv.m160336M4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m160348Y4(int i, Long l2) {
        int iLongValue = (int) (((long) i) - l2.longValue());
        ((C13030a) this.viewModel).m76364P0(m160356g5(iLongValue));
        if (iLongValue <= 0) {
            ((il2) this.viewModel).mo76376v();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m160349Z4(Long l2) {
        if (l2.longValue() == 3) {
            ((C13030a) this.viewModel).m76365Q0(false);
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m160350a5(BLiveFirstRechargeStatus bLiveFirstRechargeStatus) {
        this.f138950t = bLiveFirstRechargeStatus.abGroup;
        this.f138952v = bLiveFirstRechargeStatus.showNotice;
    }

    /* JADX INFO: renamed from: b5 */
    public void m160351b5(String str) {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(900).m174141B(str).m174146t(80).m174152z(1.0d, 0.73d).m174145s(qa00.m175859d(12.0f)).m174143q());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: c5 */
    public void m160352c5(final boolean z) {
        this.f138947A = true;
        duringCreated(LivingNormalApiProvider.m72502Q4(m213810E2().m202194o(), mo104749j3())).subscribe(dhw.m115826e(new y20() { // from class: l.xuv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196325a.m160345V4(z, (BLiveFirstRechargeDetail) obj);
            }
        }, new y20() { // from class: l.yuv
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("网络异常，请稍后再试");
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: d5 */
    public void m160353d5(final int i) {
        if (i >= 3) {
            this.f138953w = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).take(i).subscribe(dhw.m115829h(new y20() { // from class: l.bvv
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f78640a.m160348Y4(i, (Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: e5 */
    public void m160354e5() {
        psd0.m173633z(this.f138954x);
        this.f138954x = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).take(3).subscribe(dhw.m115829h(new y20() { // from class: l.cvv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84065a.m160349Z4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f5 */
    public void m160355f5(String str, int i, PayMethod payMethod) {
        boolean z = true;
        if (TEnum.equals(payMethod, "alipay")) {
            String str2 = this.f194844p;
            boolean z2 = this.f194837i;
            if (!this.f138949s && !this.f138951u) {
                z = false;
            }
            gpc0.m131243c(str, i, str2, z2, z);
            return;
        }
        if (TEnum.equals(payMethod, "wechat")) {
            String str3 = this.f194844p;
            boolean z3 = this.f194837i;
            if (!this.f138949s && !this.f138951u) {
                z = false;
            }
            gpc0.m131251k(str, i, str3, z3, z);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final String m160356g5(int i) {
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
    public void m160357h5() {
        psd0.m173633z(this.f138953w);
        psd0.m173633z(this.f138954x);
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: l4 */
    public void mo130113l4(final xl2.C21365b c21365b) {
        zrv.f205799a.m207655Z(act(), m160341R4(c21365b), new x20() { // from class: l.zuv
            @Override // p153l.x20
            public final void call() {
                this.f206159a.m160344U4(c21365b);
            }
        }, new x20() { // from class: l.avv
            @Override // p153l.x20
            public final void call() {
                this.f73661a.m211484n4();
            }
        }, c21365b.f194854f);
        m160355f5(c21365b.f194849a, c21365b.f194850b, c21365b.f194854f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    @Override // p153l.xl2
    /* JADX INFO: renamed from: o4 */
    public void mo160358o4(int i, boolean z) {
        uoe0 uoe0Var;
        BLiveGiftItem bLiveGiftItemM168555w0 = m213810E2().m168555w0(this.f138948B.trialGiftId);
        if (this.f138951u) {
            this.f138952v = false;
            this.f138955y = true;
            lpc0.m155176f(this, this.f138948B);
            super.mo160358o4(i, true);
            return;
        }
        if (!this.f138949s) {
            super.mo160358o4(i, true);
            return;
        }
        this.f138952v = false;
        this.f138955y = true;
        if (this.f138947A) {
            this.f138947A = false;
            m213811F2().LiveBridgeImplEvent.closeLiveCampaignDialog().m199277p();
            m213811F2().FastRechargeEventGroup.closeFastRechargeDialog().m199277p();
        }
        if (this.f194843o == 2 && (uoe0Var = this.f194841m) != null) {
            lpc0.m155175e(this, this.f138948B, uoe0Var.f180057e, this.f138950t, uoe0Var, mo78457R2(), true, this.f138956z);
            super.mo160358o4(i, false);
        } else {
            if (bLiveGiftItemM168555w0 != null) {
                lpc0.m155175e(this, this.f138948B, bLiveGiftItemM168555w0, this.f138950t, this.f194841m, mo78457R2(), false, this.f138956z);
            }
            super.mo160358o4(i, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(LivingNormalApiProvider.m72592a4(mo104749j3(), m213810E2().m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.dvv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90953a.m160350a5((BLiveFirstRechargeStatus) obj);
            }
        }));
        duringCreated(m213811F2().LiveBridgeImplEvent.payFirstRecharge().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.evv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96029a.m160352c5(((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: u4 */
    public void mo130115u4() {
        mo52715C(new C13030a());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    @Override // p153l.xl2
    /* JADX INFO: renamed from: v4 */
    public void mo130116v4(final bkg bkgVar) {
        this.f138956z = "liveSchema".equals(bkgVar.f77069c);
        duringCreated(LivingNormalApiProvider.m72502Q4(m213810E2().m202194o(), mo104749j3())).subscribe(dhw.m115826e(new y20() { // from class: l.fvv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101095a.m160346W4(bkgVar, (BLiveFirstRechargeDetail) obj);
            }
        }, new y20() { // from class: l.gvv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106690a.m160347X4(bkgVar, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: z4 */
    public boolean mo130117z4() {
        if (this.f138955y) {
            this.f138955y = false;
            return false;
        }
        if (!this.f138956z) {
            return true;
        }
        this.f138956z = false;
        return false;
    }
}
