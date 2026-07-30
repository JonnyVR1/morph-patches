package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.C0456a;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p1.mobile.putong.live.base.data.BLiveFirstRechargeStatus;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveMerchandise;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.mkd0;
import l.osi0;
import l.t100;
import l.w9j;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ltv extends pl2 {

    /* JADX INFO: renamed from: A */
    public boolean f15056A;

    /* JADX INFO: renamed from: B */
    public BLiveFirstRechargeDetail f15057B;

    /* JADX INFO: renamed from: s */
    public boolean f15058s;

    /* JADX INFO: renamed from: t */
    public String f15059t;

    /* JADX INFO: renamed from: u */
    public boolean f15060u;

    /* JADX INFO: renamed from: v */
    public boolean f15061v;

    /* JADX INFO: renamed from: w */
    public c4g0 f15062w;

    /* JADX INFO: renamed from: x */
    public c4g0 f15063x;

    /* JADX INFO: renamed from: y */
    public boolean f15064y;

    /* JADX INFO: renamed from: z */
    public boolean f15065z;

    public ltv(bsm bsmVar) {
        super(bsmVar);
        this.f15058s = false;
        this.f15061v = false;
        this.f15064y = false;
        this.f15065z = false;
        this.f15056A = false;
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ List m17432G4(List list) {
        return list.size() > 5 ? list.subList(0, 5) : list;
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ BLiveData m17438M4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: Q4 */
    public BLiveFirstRechargeDetail m17442Q4() {
        return this.f15057B;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    @NotNull
    /* JADX INFO: renamed from: R4 */
    public PurchasePaymentParam m17443R4(pl2.C0751b c0751b) {
        PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        BLiveAbsData bLiveAbsDataM14588n0 = m25547E2().m14588n0();
        if (bLiveAbsDataM14588n0 != null && bLiveAbsDataM14588n0.isNormalLive() && this.f15058s) {
            ((PaymentParam) purchasePaymentParamNew_).ext.purchaseEnv = "live_recharge";
        }
        ((PaymentParam) purchasePaymentParamNew_).itemId = c0751b.f17477a;
        int i = c0751b.f17479c;
        if (i > 0) {
            purchasePaymentParamNew_.quantity = i;
        }
        return purchasePaymentParamNew_;
    }

    /* JADX INFO: renamed from: S4 */
    public final void m17444S4(boolean z) {
        if (this.f17468l == null) {
            return;
        }
        pl2.C0751b c0751b = new pl2.C0751b();
        c0751b.f17477a = this.f17468l.defaultStockKeepUnit.id;
        c0751b.f17478b = 1;
        c0751b.f17479c = 10;
        c0751b.f17480d = 10;
        c0751b.f17482f = z ? ypv.a.i() : ypv.a.k();
        mo13753l4(c0751b);
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: T */
    public void mo13748T() {
        super.mo13748T();
        m14188d3(wvk.class, new w9j() { // from class: l.usv
            public final Object call(Object obj) {
                return this.f20784a.m17445T4((wvk) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ Boolean m17445T4(wvk wvkVar) {
        return Boolean.valueOf(this.f15061v);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m17446U4(pl2.C0751b c0751b) {
        mo17460o4(c0751b.f17480d, true);
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: V3 */
    public List<BLiveMerchandise> mo13749V3(List<BLiveMerchandise> list) {
        BLiveFirstRechargeDetail bLiveFirstRechargeDetail;
        if (this.f17468l != null) {
            if (!m20399b4() && ((bLiveFirstRechargeDetail = this.f15057B) == null || !bLiveFirstRechargeDetail.hasAdditionalCheckout)) {
                BLiveMerchandise bLiveMerchandise = this.f17468l;
                bLiveMerchandise.isCustomRecharge = true;
                bLiveMerchandise.defaultStockKeepUnit.prices.price = 10.0d;
                bLiveMerchandise.quantity = 0;
                bLiveMerchandise.isCustomRechargeInput = false;
                list.add(bLiveMerchandise);
                return list;
            }
            BLiveMerchandise bLiveMerchandise2 = this.f17468l;
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
    public final /* synthetic */ void m17447V4(boolean z, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        this.f15057B = bLiveFirstRechargeDetail;
        boolean z2 = bLiveFirstRechargeDetail.isActive;
        boolean z3 = false;
        this.f15060u = z2 && bLiveFirstRechargeDetail.showDialogBonus;
        if (z2 && !bLiveFirstRechargeDetail.showDialogBonus) {
            z3 = true;
        }
        this.f15058s = z3;
        if (z3) {
            m17444S4(z);
        } else {
            osi0.g("活动资格已用完");
            m25548F2().LiveBridgeImplEvent.closeLiveCampaignDialog().p();
        }
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: W3 */
    public c<List<BLiveMerchandise>> mo13750W3() {
        return c.just(ypv.a.j()).flatMap(new w9j() { // from class: l.jtv
            public final Object call(Object obj) {
                return ypv.a.e0((String) obj, false);
            }
        }).filter(new w9j() { // from class: l.ktv
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).map(new w9j() { // from class: l.vsv
            public final Object call(Object obj) {
                return ltv.m17432G4((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m17448W4(nig nigVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        this.f15057B = bLiveFirstRechargeDetail;
        boolean z = bLiveFirstRechargeDetail.isActive;
        boolean z2 = false;
        this.f15060u = z && bLiveFirstRechargeDetail.showDialogBonus;
        if (z && !bLiveFirstRechargeDetail.showDialogBonus) {
            z2 = true;
        }
        this.f15058s = z2;
        m20409q4();
        m20414x4(nigVar);
        m20395A4(nigVar, this.f15059t);
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: X3 */
    public c<BLiveMerchandise> mo13751X3() {
        return ypv.a.e0("customCoin", false).filter(new w9j() { // from class: l.gtv
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.htv
            public final Object call(Object obj) {
                return c.just((BLiveMerchandise) ((List) obj).get(0));
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m17449X4(nig nigVar, Throwable th) {
        m20414x4(nigVar);
        m20395A4(nigVar, this.f15059t);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    @Override // p002l.pl2
    /* JADX INFO: renamed from: Y3 */
    public c<BLiveData> mo13752Y3() {
        return m25547E2().m14613z1().onErrorReturn(new w9j() { // from class: l.itv
            public final Object call(Object obj) {
                return ltv.m17438M4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m17450Y4(int i, Long l2) {
        int iLongValue = (int) (((long) i) - l2.longValue());
        ((C0456a) ((bwr) this).viewModel).m8797P0(m17458g5(iLongValue));
        if (iLongValue <= 0) {
            ((al2) ((bwr) this).viewModel).mo8809v();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m17451Z4(Long l2) {
        if (l2.longValue() == 3) {
            ((C0456a) ((bwr) this).viewModel).m8798Q0(false);
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m17452a5(BLiveFirstRechargeStatus bLiveFirstRechargeStatus) {
        this.f15059t = bLiveFirstRechargeStatus.abGroup;
        this.f15061v = bLiveFirstRechargeStatus.showNotice;
    }

    /* JADX INFO: renamed from: b5 */
    public void m17453b5(String str) {
        m25548F2().OpenH5Event.open().j(jp50.m16064c(900).m16094B(str).m16099t(80).m16105z(1.0d, 0.73d).m16098s(t100.d(12.0f)).m16096q());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c5 */
    public void m17454c5(final boolean z) {
        this.f15056A = true;
        duringCreated(LivingNormalApiProvider.m4685Q4(m25547E2().m17239o(), mo9759j3())).subscribe(ffw.e(new e30() { // from class: l.wsv
            public final void call(Object obj) {
                this.f21967a.m17447V4(z, (BLiveFirstRechargeDetail) obj);
            }
        }, new e30() { // from class: l.xsv
            public final void call(Object obj) {
                osi0.g("网络异常，请稍后再试");
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d5 */
    public void m17455d5(final int i) {
        if (i >= 3) {
            this.f15062w = m14186H3(m25547E2().m14575i2(TimeUnit.SECONDS)).take(i).subscribe(ffw.h(new e30() { // from class: l.atv
                public final void call(Object obj) {
                    this.f7882a.m17450Y4(i, (Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: e5 */
    public void m17456e5() {
        mkd0.z(this.f15063x);
        this.f15063x = m14186H3(m25547E2().m14575i2(TimeUnit.SECONDS)).take(3).subscribe(ffw.h(new e30() { // from class: l.btv
            public final void call(Object obj) {
                this.f8358a.m17451Z4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f5 */
    public void m17457f5(String str, int i, PayMethod payMethod) {
        boolean z = true;
        if (TEnum.equals(payMethod, "alipay")) {
            String str2 = this.f17472p;
            boolean z2 = this.f17465i;
            if (!this.f15058s && !this.f15060u) {
                z = false;
            }
            zgc0.m27328c(str, i, str2, z2, z);
            return;
        }
        if (TEnum.equals(payMethod, "wechat")) {
            String str3 = this.f17472p;
            boolean z3 = this.f17465i;
            if (!this.f15058s && !this.f15060u) {
                z = false;
            }
            zgc0.m27336k(str, i, str3, z3, z);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final String m17458g5(int i) {
        int i2 = i / 86400;
        int i3 = i / 3600;
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
    public void m17459h5() {
        mkd0.z(this.f15062w);
        mkd0.z(this.f15063x);
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: l4 */
    public void mo13753l4(final pl2.C0751b c0751b) {
        ypv.a.Z(act(), m17443R4(c0751b), new d30() { // from class: l.ysv
            public final void call() {
                this.f23069a.m17446U4(c0751b);
            }
        }, new d30() { // from class: l.zsv
            public final void call() {
                this.f23577a.m20408n4();
            }
        }, c0751b.f17482f);
        m17457f5(c0751b.f17477a, c0751b.f17478b, c0751b.f17482f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    @Override // p002l.pl2
    /* JADX INFO: renamed from: o4 */
    public void mo17460o4(int i, boolean z) {
        pge0 pge0Var;
        BLiveGiftItem bLiveGiftItemM14607w0 = m25547E2().m14607w0(this.f15057B.trialGiftId);
        if (this.f15060u) {
            this.f15061v = false;
            this.f15064y = true;
            ehc0.m12538f(this, this.f15057B);
            super.mo17460o4(i, true);
            return;
        }
        if (!this.f15058s) {
            super.mo17460o4(i, true);
            return;
        }
        this.f15061v = false;
        this.f15064y = true;
        if (this.f15056A) {
            this.f15056A = false;
            m25548F2().LiveBridgeImplEvent.closeLiveCampaignDialog().p();
            m25548F2().FastRechargeEventGroup.closeFastRechargeDialog().p();
        }
        if (this.f17471o == 2 && (pge0Var = this.f17469m) != null) {
            ehc0.m12537e(this, this.f15057B, pge0Var.f17280e, this.f15059t, pge0Var, mo21430R2(), true, this.f15065z);
            super.mo17460o4(i, false);
        } else {
            if (bLiveGiftItemM14607w0 != null) {
                ehc0.m12537e(this, this.f15057B, bLiveGiftItemM14607w0, this.f15059t, this.f17469m, mo21430R2(), false, this.f15065z);
            }
            super.mo17460o4(i, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: t */
    public void m17461t() {
        super.t();
        duringCreated(LivingNormalApiProvider.m4775a4(mo9759j3(), m25547E2().m17239o())).subscribe(ffw.h(new e30() { // from class: l.ctv
            public final void call(Object obj) {
                this.f8936a.m17452a5((BLiveFirstRechargeStatus) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveBridgeImplEvent.payFirstRecharge().g()).subscribe(ffw.h(new e30() { // from class: l.dtv
            public final void call(Object obj) {
                this.f9422a.m17454c5(((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: u4 */
    public void mo13755u4() {
        C(new C0456a());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    @Override // p002l.pl2
    /* JADX INFO: renamed from: v4 */
    public void mo13756v4(final nig nigVar) {
        this.f15065z = "liveSchema".equals(nigVar.f16052c);
        duringCreated(LivingNormalApiProvider.m4685Q4(m25547E2().m17239o(), mo9759j3())).subscribe(ffw.e(new e30() { // from class: l.etv
            public final void call(Object obj) {
                this.f9961a.m17448W4(nigVar, (BLiveFirstRechargeDetail) obj);
            }
        }, new e30() { // from class: l.ftv
            public final void call(Object obj) {
                this.f10633a.m17449X4(nigVar, (Throwable) obj);
            }
        }));
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: z4 */
    public boolean mo13757z4() {
        if (this.f15064y) {
            this.f15064y = false;
            return false;
        }
        if (!this.f15065z) {
            return true;
        }
        this.f15065z = false;
        return false;
    }
}
