package p006l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ContractInfo;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.OrderInfo;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Contract;
import com.p1.mobile.putong.data.MembershipType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import l.c4g0;
import l.d30;
import l.e30;
import l.hpd0;
import l.j760;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.xaj0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class src0 {

    /* JADX INFO: renamed from: l */
    public static src0 f21614l;

    /* JADX INFO: renamed from: a */
    public ContractInfo f21615a;

    /* JADX INFO: renamed from: b */
    public OrderInfo f21616b;

    /* JADX INFO: renamed from: d */
    public Merchandise f21618d;

    /* JADX INFO: renamed from: e */
    public ContractInfo f21619e;

    /* JADX INFO: renamed from: f */
    public OrderInfo f21620f;

    /* JADX INFO: renamed from: i */
    public c4g0 f21623i;

    /* JADX INFO: renamed from: j */
    public c4g0 f21624j;

    /* JADX INFO: renamed from: k */
    public final xaj0<Integer, Double, Double>[] f21625k;

    /* JADX INFO: renamed from: c */
    public final a<j760<OrderInfo, ContractInfo>> f21617c = a.b();

    /* JADX INFO: renamed from: g */
    public final a<j760<OrderInfo, ContractInfo>> f21621g = a.b();

    /* JADX INFO: renamed from: h */
    public final hpd0 f21622h = new hpd0("recall_dlg_show" + CoreModule.m1850H().userId(), Boolean.TRUE);

    public src0() {
        Double dValueOf = Double.valueOf(2.5d);
        xaj0 xaj0VarA = xaj0.a(375, dValueOf, Double.valueOf(8.0d));
        xaj0 xaj0VarA2 = xaj0.a(282, Double.valueOf(2.3d), Double.valueOf(7.0d));
        xaj0 xaj0VarA3 = xaj0.a(189, Double.valueOf(2.2d), Double.valueOf(6.0d));
        Double dValueOf2 = Double.valueOf(2.0d);
        this.f21625k = new xaj0[]{xaj0VarA, xaj0VarA2, xaj0VarA3, xaj0.a(127, dValueOf2, Double.valueOf(5.0d)), xaj0.a(96, Double.valueOf(1.9d), Double.valueOf(4.0d)), xaj0.a(65, Double.valueOf(1.7d), Double.valueOf(3.5d)), xaj0.a(34, Double.valueOf(1.5d), Double.valueOf(3.0d)), xaj0.a(4, Double.valueOf(1.3d), dValueOf), xaj0.a(0, Double.valueOf(1.1d), dValueOf2)};
    }

    /* JADX INFO: renamed from: L */
    public static long m24145L(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: O */
    public static void m24146O() {
        if (NullChecker.a(f21614l)) {
            mkd0.z(f21614l.f21623i);
            mkd0.z(f21614l.f21624j);
        }
        f21614l = null;
    }

    /* JADX INFO: renamed from: Q */
    public static String m24147Q(boolean z) {
        return String.format("开通续费，享最高%s倍加速曝光", Integer.valueOf(z ? 9 : 3));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m24148a(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m24154g(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static String m24158n() {
        return CoreModule.f1533b.getString(R.string.j7);
    }

    /* JADX INFO: renamed from: r */
    public static src0 m24159r() {
        if (f21614l == null) {
            synchronized (src0.class) {
                try {
                    if (f21614l == null) {
                        f21614l = new src0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21614l;
    }

    /* JADX INFO: renamed from: t */
    public static String m24160t() {
        return "加速曝光";
    }

    /* JADX INFO: renamed from: A */
    public boolean m24161A(Contract contract) {
        return TEnum.equals(contract.productType, "vip") || TEnum.equals(contract.productType, "svip");
    }

    /* JADX INFO: renamed from: B */
    public boolean m24162B(MembershipType membershipType) {
        return NullChecker.a(this.f21620f) && TEnum.equals(this.f21620f.membershipType, membershipType);
    }

    /* JADX INFO: renamed from: C */
    public boolean m24163C() {
        return TEnum.equals(this.f21616b.membershipType, "svip");
    }

    /* JADX INFO: renamed from: D */
    public boolean m24164D(MembershipType membershipType) {
        return NullChecker.a(this.f21619e) && TEnum.equals(this.f21619e.membershipType, membershipType);
    }

    /* JADX INFO: renamed from: E */
    public boolean m24165E() {
        return NullChecker.a(this.f21619e) || NullChecker.a(this.f21620f);
    }

    /* JADX INFO: renamed from: F */
    public boolean m24166F() {
        return TEnum.equals(this.f21616b.membershipType, "vip");
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ c m24167G(Pair pair) {
        return m24180m((OrderInfo) pair.first, (ContractInfo) pair.second);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m24168H(d30 d30Var, xaj0 xaj0Var) {
        m24178k(xaj0Var);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ c m24169I(Pair pair) {
        return m24180m((OrderInfo) pair.first, (ContractInfo) pair.second);
    }

    /* JADX INFO: renamed from: J */
    public void m24170J() {
        mkd0.z(this.f21623i);
        this.f21623i = CoreModule.f1534c.f3580O0.m2012s3().switchMap(new w9j() { // from class: l.irc0
            public final Object call(Object obj) {
                return this.f14722a.m24169I((Pair) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.jrc0
            public final void call(Object obj) {
                this.f15365a.m24178k((xaj0) obj);
            }
        }, new e30() { // from class: l.krc0
            public final void call(Object obj) {
                src0.m24154g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m24171K(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated(CoreModule.f1534c.f3580O0.m2012s3().switchMap(new w9j() { // from class: l.prc0
            public final Object call(Object obj) {
                return this.f19272a.m24167G((Pair) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.qrc0
            public final void call(Object obj) {
                this.f19988a.m24168H(d30Var, (xaj0) obj);
            }
        }, new e30() { // from class: l.rrc0
            public final void call(Object obj) {
                src0.m24148a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public boolean m24172M() {
        if (NullChecker.a(this.f21616b)) {
            return TEnum.equals(this.f21616b.membershipType, "svip");
        }
        return NullChecker.a(this.f21615a) && TEnum.equals(this.f21615a.membershipType, "svip");
    }

    /* JADX INFO: renamed from: N */
    public boolean m24173N() {
        if (NullChecker.a(this.f21616b)) {
            return TEnum.equals(this.f21616b.membershipType, "vip");
        }
        return NullChecker.a(this.f21615a) && TEnum.equals(this.f21615a.membershipType, "vip");
    }

    /* JADX INFO: renamed from: P */
    public c<j760<OrderInfo, ContractInfo>> m24174P() {
        return this.f21617c.asObservable();
    }

    /* JADX INFO: renamed from: R */
    public j760[] m24175R() {
        if (NullChecker.a(this.f21618d) && NullChecker.a(this.f21616b)) {
            return new j760[]{vwb.Y("reauto_duration", Integer.valueOf(this.f21618d.quantity)), vwb.Y("reauto_product", m24172M() ? "svip" : "vip"), vwb.Y("if_auto_order", Boolean.FALSE)};
        }
        if (NullChecker.a(this.f21618d) && NullChecker.b(this.f21615a)) {
            return new j760[]{vwb.Y("reauto_duration", Integer.valueOf(this.f21618d.quantity)), vwb.Y("reauto_product", m24172M() ? "svip" : "vip"), vwb.Y("if_auto_order", Boolean.TRUE)};
        }
        return new j760[]{vwb.Y("reauto_product", m24172M() ? "svip" : "vip")};
    }

    /* JADX INFO: renamed from: S */
    public void m24176S(Act act, String str) {
        if (!CoreModule.m1854P().m11706a().m19853a2() && NullChecker.a(this.f21618d)) {
            new zrc0(act, null, this.f21618d, str).show();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m24177T() {
        this.f21622h.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public final void m24178k(xaj0<OrderInfo, ContractInfo, Merchandise> xaj0Var) {
        OrderInfo orderInfo = (OrderInfo) xaj0Var.a;
        this.f21616b = orderInfo;
        ContractInfo contractInfo = (ContractInfo) xaj0Var.b;
        this.f21615a = contractInfo;
        this.f21618d = (Merchandise) xaj0Var.c;
        this.f21617c.onNext(j760.a(orderInfo, contractInfo));
    }

    /* JADX INFO: renamed from: l */
    public boolean m24179l() {
        return NullChecker.a(this.f21616b);
    }

    /* JADX INFO: renamed from: m */
    public final c<xaj0<OrderInfo, ContractInfo, Merchandise>> m24180m(final OrderInfo orderInfo, final ContractInfo contractInfo) {
        if (NullChecker.a(orderInfo) && NullChecker.a(orderInfo.merchandise) && NullChecker.a(orderInfo.merchandise.category)) {
            Merchandise merchandise = orderInfo.merchandise;
            this.f21618d = merchandise;
            return CoreModule.f1534c.f3643j0.m2572y5(merchandise.category).take(1).map(new w9j() { // from class: l.lrc0
                public final Object call(Object obj) {
                    OrderInfo orderInfo2 = orderInfo;
                    return xaj0.a(orderInfo2, (Object) null, (Merchandise) vwb.r((List) obj, new w9j() { // from class: l.nrc0
                        public final Object call(Object obj2) {
                            Merchandise merchandise2 = (Merchandise) obj2;
                            return Boolean.valueOf(merchandise2.quantity == orderInfo2.merchandise.quantity && merchandise2.autoRenewable() && merchandise2.monthType());
                        }
                    }));
                }
            });
        }
        if (!NullChecker.a(contractInfo)) {
            return c.just(xaj0.a((Object) null, (Object) null, (Object) null));
        }
        if (contractInfo.contractStatus.equals("signing")) {
            return c.just(xaj0.a((Object) null, contractInfo, (Object) null));
        }
        Merchandise merchandise2 = contractInfo.merchandise;
        this.f21618d = merchandise2;
        return CoreModule.f1534c.f3643j0.m2572y5(merchandise2.category).take(1).map(new w9j() { // from class: l.mrc0
            public final Object call(Object obj) {
                ContractInfo contractInfo2 = contractInfo;
                return xaj0.a((Object) null, contractInfo2, (Merchandise) vwb.r((List) obj, new w9j() { // from class: l.orc0
                    public final Object call(Object obj2) {
                        Merchandise merchandise3 = (Merchandise) obj2;
                        return Boolean.valueOf(merchandise3.quantity == contractInfo2.merchandise.quantity && merchandise3.autoRenewable() && merchandise3.monthType());
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public int m24181o() {
        return this.f21615a.contractCanceledDays;
    }

    /* JADX INFO: renamed from: p */
    public int m24182p() {
        return this.f21615a.continuousDays;
    }

    /* JADX INFO: renamed from: q */
    public Merchandise m24183q() {
        if (NullChecker.a(this.f21619e)) {
            return this.f21619e.merchandise;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public Merchandise m24184s() {
        if (NullChecker.a(this.f21620f)) {
            return this.f21620f.merchandise;
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public xaj0<String, Integer, String> m24185u() {
        return m24186v(m24172M(), m24182p());
    }

    /* JADX INFO: renamed from: v */
    public final xaj0<String, Integer, String> m24186v(boolean z, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        xaj0<Integer, Double, Double> xaj0Var = null;
        int i2 = 0;
        while (true) {
            xaj0<Integer, Double, Double>[] xaj0VarArr = this.f21625k;
            if (i2 >= xaj0VarArr.length) {
                return xaj0.a("1", 1, "1");
            }
            xaj0<Integer, Double, Double> xaj0Var2 = xaj0VarArr[i2];
            if (i >= ((Integer) xaj0Var2.a).intValue()) {
                if (xaj0Var == null) {
                    return xaj0.a(decimalFormat.format((Double) (z ? xaj0Var2.c : xaj0Var2.b)), 0, "0");
                }
                return xaj0.a(decimalFormat.format((Double) (z ? xaj0Var2.c : xaj0Var2.b)), Integer.valueOf(((Integer) xaj0Var.a).intValue() - i), decimalFormat.format((Double) (z ? xaj0Var.c : xaj0Var.b)));
            }
            i2++;
            xaj0Var = xaj0Var2;
        }
    }

    /* JADX INFO: renamed from: w */
    public long m24187w() {
        long vipExpireTime;
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        if (TEnum.equals(NullChecker.a(this.f21616b) ? this.f21616b.membershipType : this.f21615a.membershipType, "svip")) {
            UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("svip"));
            if (!NullChecker.a(userPrivilegeM27421w4)) {
                return 1L;
            }
            vipExpireTime = userPrivilegeM27421w4.content.expiredTime;
        } else {
            vipExpireTime = CoreModule.f1534c.f3628e0.m21490p9().getVipExpireTime();
        }
        return m24145L(vipExpireTime - jGuessedCurrentServerTime);
    }

    /* JADX INFO: renamed from: x */
    public long m24188x(SummarizedPrivilegesId summarizedPrivilegesId) {
        long vipExpireTime;
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        if (TEnum.equals(summarizedPrivilegesId, "svip") || TEnum.equals(summarizedPrivilegesId, "oDiamond")) {
            UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(summarizedPrivilegesId);
            if (!NullChecker.a(userPrivilegeM27421w4)) {
                return 1L;
            }
            vipExpireTime = userPrivilegeM27421w4.content.expiredTime;
        } else {
            vipExpireTime = CoreModule.f1534c.f3628e0.m21490p9().getVipExpireTime();
        }
        return m24145L(vipExpireTime - jGuessedCurrentServerTime);
    }

    /* JADX INFO: renamed from: y */
    public boolean m24189y() {
        return NullChecker.a(this.f21615a) && TextUtils.equals(this.f21615a.contractStatus, "signing");
    }

    /* JADX INFO: renamed from: z */
    public boolean m24190z() {
        if (NullChecker.a(this.f21616b)) {
            return true;
        }
        return NullChecker.a(this.f21615a) && this.f21615a.privilegeExpiredDays <= 0;
    }
}
