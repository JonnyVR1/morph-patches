package p149l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ContractInfo;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.OrderInfo;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.MembershipType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class src0 {

    /* JADX INFO: renamed from: l */
    public static src0 f166069l;

    /* JADX INFO: renamed from: a */
    public ContractInfo f166070a;

    /* JADX INFO: renamed from: b */
    public OrderInfo f166071b;

    /* JADX INFO: renamed from: d */
    public Merchandise f166073d;

    /* JADX INFO: renamed from: e */
    public ContractInfo f166074e;

    /* JADX INFO: renamed from: f */
    public OrderInfo f166075f;

    /* JADX INFO: renamed from: i */
    public c4g0 f166078i;

    /* JADX INFO: renamed from: j */
    public c4g0 f166079j;

    /* JADX INFO: renamed from: k */
    public final xaj0<Integer, Double, Double>[] f166080k;

    /* JADX INFO: renamed from: c */
    public final C22392a<j760<OrderInfo, ContractInfo>> f166072c = C22392a.m221512b();

    /* JADX INFO: renamed from: g */
    public final C22392a<j760<OrderInfo, ContractInfo>> f166076g = C22392a.m221512b();

    /* JADX INFO: renamed from: h */
    public final hpd0 f166077h = new hpd0("recall_dlg_show" + CoreModule.m29931H().userId(), Boolean.TRUE);

    public src0() {
        Double dValueOf = Double.valueOf(2.5d);
        xaj0 xaj0VarM207578a = xaj0.m207578a(375, dValueOf, Double.valueOf(8.0d));
        xaj0 xaj0VarM207578a2 = xaj0.m207578a(282, Double.valueOf(2.3d), Double.valueOf(7.0d));
        xaj0 xaj0VarM207578a3 = xaj0.m207578a(Integer.valueOf(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256), Double.valueOf(2.2d), Double.valueOf(6.0d));
        Double dValueOf2 = Double.valueOf(2.0d);
        this.f166080k = new xaj0[]{xaj0VarM207578a, xaj0VarM207578a2, xaj0VarM207578a3, xaj0.m207578a(127, dValueOf2, Double.valueOf(5.0d)), xaj0.m207578a(96, Double.valueOf(1.9d), Double.valueOf(4.0d)), xaj0.m207578a(65, Double.valueOf(1.7d), Double.valueOf(3.5d)), xaj0.m207578a(34, Double.valueOf(1.5d), Double.valueOf(3.0d)), xaj0.m207578a(4, Double.valueOf(1.3d), dValueOf), xaj0.m207578a(0, Double.valueOf(1.1d), dValueOf2)};
    }

    /* JADX INFO: renamed from: L */
    public static long m185642L(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: O */
    public static void m185643O() {
        if (NullChecker.m81303a(f166069l)) {
            mkd0.m154992z(f166069l.f166078i);
            mkd0.m154992z(f166069l.f166079j);
        }
        f166069l = null;
    }

    /* JADX INFO: renamed from: Q */
    public static String m185644Q(boolean z) {
        return String.format("开通续费，享最高%s倍加速曝光", Integer.valueOf(z ? 9 : 3));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m185645a(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m185651g(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static String m185655n() {
        return CoreModule.f17544b.getString(R$string.f27492j7);
    }

    /* JADX INFO: renamed from: r */
    public static src0 m185656r() {
        if (f166069l == null) {
            synchronized (src0.class) {
                try {
                    if (f166069l == null) {
                        f166069l = new src0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f166069l;
    }

    /* JADX INFO: renamed from: t */
    public static String m185657t() {
        return "加速曝光";
    }

    /* JADX INFO: renamed from: A */
    public boolean m185658A(Contract contract) {
        return TEnum.equals(contract.productType, "vip") || TEnum.equals(contract.productType, "svip");
    }

    /* JADX INFO: renamed from: B */
    public boolean m185659B(MembershipType membershipType) {
        return NullChecker.m81303a(this.f166075f) && TEnum.equals(this.f166075f.membershipType, membershipType);
    }

    /* JADX INFO: renamed from: C */
    public boolean m185660C() {
        return TEnum.equals(this.f166071b.membershipType, "svip");
    }

    /* JADX INFO: renamed from: D */
    public boolean m185661D(MembershipType membershipType) {
        return NullChecker.m81303a(this.f166074e) && TEnum.equals(this.f166074e.membershipType, membershipType);
    }

    /* JADX INFO: renamed from: E */
    public boolean m185662E() {
        return NullChecker.m81303a(this.f166074e) || NullChecker.m81303a(this.f166075f);
    }

    /* JADX INFO: renamed from: F */
    public boolean m185663F() {
        return TEnum.equals(this.f166071b.membershipType, "vip");
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C22306c m185664G(Pair pair) {
        return m185677m((OrderInfo) pair.first, (ContractInfo) pair.second);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m185665H(d30 d30Var, xaj0 xaj0Var) {
        m185675k(xaj0Var);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C22306c m185666I(Pair pair) {
        return m185677m((OrderInfo) pair.first, (ContractInfo) pair.second);
    }

    /* JADX INFO: renamed from: J */
    public void m185667J() {
        mkd0.m154992z(this.f166078i);
        this.f166078i = CoreModule.f17545c.f19591O0.m30084s3().switchMap(new w9j() { // from class: l.irc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f114617a.m185666I((Pair) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.jrc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119392a.m185675k((xaj0) obj);
            }
        }, new e30() { // from class: l.krc0
            @Override // p149l.e30
            public final void call(Object obj) {
                src0.m185651g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m185668K(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated((C22306c) CoreModule.f17545c.f19591O0.m30084s3().switchMap(new w9j() { // from class: l.prc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150868a.m185664G((Pair) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.qrc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155980a.m185665H(d30Var, (xaj0) obj);
            }
        }, new e30() { // from class: l.rrc0
            @Override // p149l.e30
            public final void call(Object obj) {
                src0.m185645a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public boolean m185669M() {
        if (NullChecker.m81303a(this.f166071b)) {
            return TEnum.equals(this.f166071b.membershipType, "svip");
        }
        return NullChecker.m81303a(this.f166070a) && TEnum.equals(this.f166070a.membershipType, "svip");
    }

    /* JADX INFO: renamed from: N */
    public boolean m185670N() {
        if (NullChecker.m81303a(this.f166071b)) {
            return TEnum.equals(this.f166071b.membershipType, "vip");
        }
        return NullChecker.m81303a(this.f166070a) && TEnum.equals(this.f166070a.membershipType, "vip");
    }

    /* JADX INFO: renamed from: P */
    public C22306c<j760<OrderInfo, ContractInfo>> m185671P() {
        return this.f166072c.asObservable();
    }

    /* JADX INFO: renamed from: R */
    public j760[] m185672R() {
        if (NullChecker.m81303a(this.f166073d) && NullChecker.m81303a(this.f166071b)) {
            return new j760[]{vwb.m200311Y("reauto_duration", Integer.valueOf(this.f166073d.quantity)), vwb.m200311Y("reauto_product", m185669M() ? "svip" : "vip"), vwb.m200311Y("if_auto_order", Boolean.FALSE)};
        }
        if (NullChecker.m81303a(this.f166073d) && NullChecker.m81304b(this.f166070a)) {
            return new j760[]{vwb.m200311Y("reauto_duration", Integer.valueOf(this.f166073d.quantity)), vwb.m200311Y("reauto_product", m185669M() ? "svip" : "vip"), vwb.m200311Y("if_auto_order", Boolean.TRUE)};
        }
        return new j760[]{vwb.m200311Y("reauto_product", m185669M() ? "svip" : "vip")};
    }

    /* JADX INFO: renamed from: S */
    public void m185673S(Act act, String str) {
        if (!CoreModule.m29935P().m94651a().mo158345a2() && NullChecker.m81303a(this.f166073d)) {
            new zrc0(act, null, this.f166073d, str).show();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m185674T() {
        this.f166077h.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public final void m185675k(xaj0<OrderInfo, ContractInfo, Merchandise> xaj0Var) {
        OrderInfo orderInfo = xaj0Var.f191751a;
        this.f166071b = orderInfo;
        ContractInfo contractInfo = xaj0Var.f191752b;
        this.f166070a = contractInfo;
        this.f166073d = xaj0Var.f191753c;
        this.f166072c.onNext(j760.m140076a(orderInfo, contractInfo));
    }

    /* JADX INFO: renamed from: l */
    public boolean m185676l() {
        return NullChecker.m81303a(this.f166071b);
    }

    /* JADX INFO: renamed from: m */
    public final C22306c<xaj0<OrderInfo, ContractInfo, Merchandise>> m185677m(final OrderInfo orderInfo, final ContractInfo contractInfo) {
        if (NullChecker.m81303a(orderInfo) && NullChecker.m81303a(orderInfo.merchandise) && NullChecker.m81303a(orderInfo.merchandise.category)) {
            Merchandise merchandise = orderInfo.merchandise;
            this.f166073d = merchandise;
            return CoreModule.f17545c.f19654j0.m30644y5(merchandise.category).take(1).map(new w9j() { // from class: l.lrc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    OrderInfo orderInfo2 = orderInfo;
                    return xaj0.m207578a(orderInfo2, null, (Merchandise) vwb.m200346r((List) obj, new w9j() { // from class: l.nrc0
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            Merchandise merchandise2 = (Merchandise) obj2;
                            return Boolean.valueOf(merchandise2.quantity == orderInfo2.merchandise.quantity && merchandise2.autoRenewable() && merchandise2.monthType());
                        }
                    }));
                }
            });
        }
        if (!NullChecker.m81303a(contractInfo)) {
            return C22306c.just(xaj0.m207578a(null, null, null));
        }
        if (contractInfo.contractStatus.equals("signing")) {
            return C22306c.just(xaj0.m207578a(null, contractInfo, null));
        }
        Merchandise merchandise2 = contractInfo.merchandise;
        this.f166073d = merchandise2;
        return CoreModule.f17545c.f19654j0.m30644y5(merchandise2.category).take(1).map(new w9j() { // from class: l.mrc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                ContractInfo contractInfo2 = contractInfo;
                return xaj0.m207578a(null, contractInfo2, (Merchandise) vwb.m200346r((List) obj, new w9j() { // from class: l.orc0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        Merchandise merchandise3 = (Merchandise) obj2;
                        return Boolean.valueOf(merchandise3.quantity == contractInfo2.merchandise.quantity && merchandise3.autoRenewable() && merchandise3.monthType());
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public int m185678o() {
        return this.f166070a.contractCanceledDays;
    }

    /* JADX INFO: renamed from: p */
    public int m185679p() {
        return this.f166070a.continuousDays;
    }

    /* JADX INFO: renamed from: q */
    public Merchandise m185680q() {
        if (NullChecker.m81303a(this.f166074e)) {
            return this.f166074e.merchandise;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public Merchandise m185681s() {
        if (NullChecker.m81303a(this.f166075f)) {
            return this.f166075f.merchandise;
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public xaj0<String, Integer, String> m185682u() {
        return m185683v(m185669M(), m185679p());
    }

    /* JADX INFO: renamed from: v */
    public final xaj0<String, Integer, String> m185683v(boolean z, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        xaj0<Integer, Double, Double> xaj0Var = null;
        int i2 = 0;
        while (true) {
            xaj0<Integer, Double, Double>[] xaj0VarArr = this.f166080k;
            if (i2 >= xaj0VarArr.length) {
                return xaj0.m207578a("1", 1, "1");
            }
            xaj0<Integer, Double, Double> xaj0Var2 = xaj0VarArr[i2];
            if (i >= xaj0Var2.f191751a.intValue()) {
                if (xaj0Var == null) {
                    return xaj0.m207578a(decimalFormat.format(z ? xaj0Var2.f191753c : xaj0Var2.f191752b), 0, "0");
                }
                return xaj0.m207578a(decimalFormat.format(z ? xaj0Var2.f191753c : xaj0Var2.f191752b), Integer.valueOf(xaj0Var.f191751a.intValue() - i), decimalFormat.format(z ? xaj0Var.f191753c : xaj0Var.f191752b));
            }
            i2++;
            xaj0Var = xaj0Var2;
        }
    }

    /* JADX INFO: renamed from: w */
    public long m185684w() {
        long vipExpireTime;
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        if (TEnum.equals(NullChecker.m81303a(this.f166071b) ? this.f166071b.membershipType : this.f166070a.membershipType, "svip")) {
            UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("svip"));
            if (!NullChecker.m81303a(userPrivilegeM210113w4)) {
                return 1L;
            }
            vipExpireTime = userPrivilegeM210113w4.content.expiredTime;
        } else {
            vipExpireTime = CoreModule.f17545c.f19639e0.m169527p9().getVipExpireTime();
        }
        return m185642L(vipExpireTime - jGuessedCurrentServerTime);
    }

    /* JADX INFO: renamed from: x */
    public long m185685x(SummarizedPrivilegesId summarizedPrivilegesId) {
        long vipExpireTime;
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        if (TEnum.equals(summarizedPrivilegesId, "svip") || TEnum.equals(summarizedPrivilegesId, "oDiamond")) {
            UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(summarizedPrivilegesId);
            if (!NullChecker.m81303a(userPrivilegeM210113w4)) {
                return 1L;
            }
            vipExpireTime = userPrivilegeM210113w4.content.expiredTime;
        } else {
            vipExpireTime = CoreModule.f17545c.f19639e0.m169527p9().getVipExpireTime();
        }
        return m185642L(vipExpireTime - jGuessedCurrentServerTime);
    }

    /* JADX INFO: renamed from: y */
    public boolean m185686y() {
        return NullChecker.m81303a(this.f166070a) && TextUtils.equals(this.f166070a.contractStatus, "signing");
    }

    /* JADX INFO: renamed from: z */
    public boolean m185687z() {
        if (NullChecker.m81303a(this.f166071b)) {
            return true;
        }
        return NullChecker.m81303a(this.f166070a) && this.f166070a.privilegeExpiredDays <= 0;
    }
}
