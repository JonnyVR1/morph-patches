package p153l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ContractInfo;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.OrderInfo;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.MembershipType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class xzc0 {

    /* JADX INFO: renamed from: l */
    public static xzc0 f196846l;

    /* JADX INFO: renamed from: a */
    public ContractInfo f196847a;

    /* JADX INFO: renamed from: b */
    public OrderInfo f196848b;

    /* JADX INFO: renamed from: d */
    public Merchandise f196850d;

    /* JADX INFO: renamed from: e */
    public ContractInfo f196851e;

    /* JADX INFO: renamed from: f */
    public OrderInfo f196852f;

    /* JADX INFO: renamed from: i */
    public kcg0 f196855i;

    /* JADX INFO: renamed from: j */
    public kcg0 f196856j;

    /* JADX INFO: renamed from: k */
    public final bkj0<Integer, Double, Double>[] f196857k;

    /* JADX INFO: renamed from: c */
    public final C22507a<pf60<OrderInfo, ContractInfo>> f196849c = C22507a.m222758b();

    /* JADX INFO: renamed from: g */
    public final C22507a<pf60<OrderInfo, ContractInfo>> f196853g = C22507a.m222758b();

    /* JADX INFO: renamed from: h */
    public final jxd0 f196854h = new jxd0("recall_dlg_show" + CoreModule.m30929H().userId(), Boolean.TRUE);

    public xzc0() {
        Double dValueOf = Double.valueOf(2.5d);
        bkj0 bkj0VarM104818a = bkj0.m104818a(375, dValueOf, Double.valueOf(8.0d));
        bkj0 bkj0VarM104818a2 = bkj0.m104818a(282, Double.valueOf(2.3d), Double.valueOf(7.0d));
        bkj0 bkj0VarM104818a3 = bkj0.m104818a(Integer.valueOf(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256), Double.valueOf(2.2d), Double.valueOf(6.0d));
        Double dValueOf2 = Double.valueOf(2.0d);
        this.f196857k = new bkj0[]{bkj0VarM104818a, bkj0VarM104818a2, bkj0VarM104818a3, bkj0.m104818a(127, dValueOf2, Double.valueOf(5.0d)), bkj0.m104818a(96, Double.valueOf(1.9d), Double.valueOf(4.0d)), bkj0.m104818a(65, Double.valueOf(1.7d), Double.valueOf(3.5d)), bkj0.m104818a(34, Double.valueOf(1.5d), Double.valueOf(3.0d)), bkj0.m104818a(4, Double.valueOf(1.3d), dValueOf), bkj0.m104818a(0, Double.valueOf(1.1d), dValueOf2)};
    }

    /* JADX INFO: renamed from: L */
    public static long m213706L(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: O */
    public static void m213707O() {
        if (NullChecker.m82486a(f196846l)) {
            psd0.m173633z(f196846l.f196855i);
            psd0.m173633z(f196846l.f196856j);
        }
        f196846l = null;
    }

    /* JADX INFO: renamed from: Q */
    public static String m213708Q(boolean z) {
        return String.format("开通续费，享最高%s倍加速曝光", Integer.valueOf(z ? 9 : 3));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m213709a(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m213715g(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static String m213719n() {
        return CoreModule.f18263b.getString(R$string.f28340j7);
    }

    /* JADX INFO: renamed from: r */
    public static xzc0 m213720r() {
        if (f196846l == null) {
            synchronized (xzc0.class) {
                try {
                    if (f196846l == null) {
                        f196846l = new xzc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f196846l;
    }

    /* JADX INFO: renamed from: t */
    public static String m213721t() {
        return "加速曝光";
    }

    /* JADX INFO: renamed from: A */
    public boolean m213722A(Contract contract) {
        return TEnum.equals(contract.productType, "vip") || TEnum.equals(contract.productType, "svip");
    }

    /* JADX INFO: renamed from: B */
    public boolean m213723B(MembershipType membershipType) {
        return NullChecker.m82486a(this.f196852f) && TEnum.equals(this.f196852f.membershipType, membershipType);
    }

    /* JADX INFO: renamed from: C */
    public boolean m213724C() {
        return TEnum.equals(this.f196848b.membershipType, "svip");
    }

    /* JADX INFO: renamed from: D */
    public boolean m213725D(MembershipType membershipType) {
        return NullChecker.m82486a(this.f196851e) && TEnum.equals(this.f196851e.membershipType, membershipType);
    }

    /* JADX INFO: renamed from: E */
    public boolean m213726E() {
        return NullChecker.m82486a(this.f196851e) || NullChecker.m82486a(this.f196852f);
    }

    /* JADX INFO: renamed from: F */
    public boolean m213727F() {
        return TEnum.equals(this.f196848b.membershipType, "vip");
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C22421c m213728G(Pair pair) {
        return m213741m((OrderInfo) pair.first, (ContractInfo) pair.second);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m213729H(x20 x20Var, bkj0 bkj0Var) {
        m213739k(bkj0Var);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C22421c m213730I(Pair pair) {
        return m213741m((OrderInfo) pair.first, (ContractInfo) pair.second);
    }

    /* JADX INFO: renamed from: J */
    public void m213731J() {
        psd0.m173633z(this.f196855i);
        this.f196855i = CoreModule.f18264c.f20333O0.m31082s3().switchMap(new qcj() { // from class: l.nzc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144420a.m213730I((Pair) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ozc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149859a.m213739k((bkj0) obj);
            }
        }, new y20() { // from class: l.pzc0
            @Override // p153l.y20
            public final void call(Object obj) {
                xzc0.m213715g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m213732K(ner nerVar, final x20 x20Var) {
        nerVar.duringCreated((C22421c) CoreModule.f18264c.f20333O0.m31082s3().switchMap(new qcj() { // from class: l.uzc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f181741a.m213728G((Pair) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.vzc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186471a.m213729H(x20Var, (bkj0) obj);
            }
        }, new y20() { // from class: l.wzc0
            @Override // p153l.y20
            public final void call(Object obj) {
                xzc0.m213709a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public boolean m213733M() {
        if (NullChecker.m82486a(this.f196848b)) {
            return TEnum.equals(this.f196848b.membershipType, "svip");
        }
        return NullChecker.m82486a(this.f196847a) && TEnum.equals(this.f196847a.membershipType, "svip");
    }

    /* JADX INFO: renamed from: N */
    public boolean m213734N() {
        if (NullChecker.m82486a(this.f196848b)) {
            return TEnum.equals(this.f196848b.membershipType, "vip");
        }
        return NullChecker.m82486a(this.f196847a) && TEnum.equals(this.f196847a.membershipType, "vip");
    }

    /* JADX INFO: renamed from: P */
    public C22421c<pf60<OrderInfo, ContractInfo>> m213735P() {
        return this.f196849c.asObservable();
    }

    /* JADX INFO: renamed from: R */
    public pf60[] m213736R() {
        if (NullChecker.m82486a(this.f196850d) && NullChecker.m82486a(this.f196848b)) {
            return new pf60[]{jyb.m147494Y("reauto_duration", Integer.valueOf(this.f196850d.quantity)), jyb.m147494Y("reauto_product", m213733M() ? "svip" : "vip"), jyb.m147494Y("if_auto_order", Boolean.FALSE)};
        }
        if (NullChecker.m82486a(this.f196850d) && NullChecker.m82487b(this.f196847a)) {
            return new pf60[]{jyb.m147494Y("reauto_duration", Integer.valueOf(this.f196850d.quantity)), jyb.m147494Y("reauto_product", m213733M() ? "svip" : "vip"), jyb.m147494Y("if_auto_order", Boolean.TRUE)};
        }
        return new pf60[]{jyb.m147494Y("reauto_product", m213733M() ? "svip" : "vip")};
    }

    /* JADX INFO: renamed from: S */
    public void m213737S(Act act, String str) {
        if (!CoreModule.m30933P().m143405a().mo180437a2() && NullChecker.m82486a(this.f196850d)) {
            new e0d0(act, null, this.f196850d, str).show();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m213738T() {
        this.f196854h.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public final void m213739k(bkj0<OrderInfo, ContractInfo, Merchandise> bkj0Var) {
        OrderInfo orderInfo = bkj0Var.f77081a;
        this.f196848b = orderInfo;
        ContractInfo contractInfo = bkj0Var.f77082b;
        this.f196847a = contractInfo;
        this.f196850d = bkj0Var.f77083c;
        this.f196849c.onNext(pf60.m172085a(orderInfo, contractInfo));
    }

    /* JADX INFO: renamed from: l */
    public boolean m213740l() {
        return NullChecker.m82486a(this.f196848b);
    }

    /* JADX INFO: renamed from: m */
    public final C22421c<bkj0<OrderInfo, ContractInfo, Merchandise>> m213741m(final OrderInfo orderInfo, final ContractInfo contractInfo) {
        if (NullChecker.m82486a(orderInfo) && NullChecker.m82486a(orderInfo.merchandise) && NullChecker.m82486a(orderInfo.merchandise.category)) {
            Merchandise merchandise = orderInfo.merchandise;
            this.f196850d = merchandise;
            return CoreModule.f18264c.f20396j0.m31647y5(merchandise.category).take(1).map(new qcj() { // from class: l.qzc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    OrderInfo orderInfo2 = orderInfo;
                    return bkj0.m104818a(orderInfo2, null, (Merchandise) jyb.m147529r((List) obj, new qcj() { // from class: l.szc0
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            Merchandise merchandise2 = (Merchandise) obj2;
                            return Boolean.valueOf(merchandise2.quantity == orderInfo2.merchandise.quantity && merchandise2.autoRenewable() && merchandise2.monthType());
                        }
                    }));
                }
            });
        }
        if (!NullChecker.m82486a(contractInfo)) {
            return C22421c.just(bkj0.m104818a(null, null, null));
        }
        if (contractInfo.contractStatus.equals("signing")) {
            return C22421c.just(bkj0.m104818a(null, contractInfo, null));
        }
        Merchandise merchandise2 = contractInfo.merchandise;
        this.f196850d = merchandise2;
        return CoreModule.f18264c.f20396j0.m31647y5(merchandise2.category).take(1).map(new qcj() { // from class: l.rzc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                ContractInfo contractInfo2 = contractInfo;
                return bkj0.m104818a(null, contractInfo2, (Merchandise) jyb.m147529r((List) obj, new qcj() { // from class: l.tzc0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        Merchandise merchandise3 = (Merchandise) obj2;
                        return Boolean.valueOf(merchandise3.quantity == contractInfo2.merchandise.quantity && merchandise3.autoRenewable() && merchandise3.monthType());
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public int m213742o() {
        return this.f196847a.contractCanceledDays;
    }

    /* JADX INFO: renamed from: p */
    public int m213743p() {
        return this.f196847a.continuousDays;
    }

    /* JADX INFO: renamed from: q */
    public Merchandise m213744q() {
        if (NullChecker.m82486a(this.f196851e)) {
            return this.f196851e.merchandise;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public Merchandise m213745s() {
        if (NullChecker.m82486a(this.f196852f)) {
            return this.f196852f.merchandise;
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public bkj0<String, Integer, String> m213746u() {
        return m213747v(m213733M(), m213743p());
    }

    /* JADX INFO: renamed from: v */
    public final bkj0<String, Integer, String> m213747v(boolean z, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        bkj0<Integer, Double, Double> bkj0Var = null;
        int i2 = 0;
        while (true) {
            bkj0<Integer, Double, Double>[] bkj0VarArr = this.f196857k;
            if (i2 >= bkj0VarArr.length) {
                return bkj0.m104818a("1", 1, "1");
            }
            bkj0<Integer, Double, Double> bkj0Var2 = bkj0VarArr[i2];
            if (i >= bkj0Var2.f77081a.intValue()) {
                if (bkj0Var == null) {
                    return bkj0.m104818a(decimalFormat.format(z ? bkj0Var2.f77083c : bkj0Var2.f77082b), 0, "0");
                }
                return bkj0.m104818a(decimalFormat.format(z ? bkj0Var2.f77083c : bkj0Var2.f77082b), Integer.valueOf(bkj0Var.f77081a.intValue() - i), decimalFormat.format(z ? bkj0Var.f77083c : bkj0Var.f77082b));
            }
            i2++;
            bkj0Var = bkj0Var2;
        }
    }

    /* JADX INFO: renamed from: w */
    public long m213748w() {
        long vipExpireTime;
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        if (TEnum.equals(NullChecker.m82486a(this.f196848b) ? this.f196848b.membershipType : this.f196847a.membershipType, "svip")) {
            UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("svip"));
            if (!NullChecker.m82486a(userPrivilegeM146426x4)) {
                return 1L;
            }
            vipExpireTime = userPrivilegeM146426x4.content.expiredTime;
        } else {
            vipExpireTime = CoreModule.f18264c.f20381e0.m116600p9().getVipExpireTime();
        }
        return m213706L(vipExpireTime - jGuessedCurrentServerTime);
    }

    /* JADX INFO: renamed from: x */
    public long m213749x(SummarizedPrivilegesId summarizedPrivilegesId) {
        long vipExpireTime;
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        if (TEnum.equals(summarizedPrivilegesId, "svip") || TEnum.equals(summarizedPrivilegesId, "oDiamond")) {
            UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(summarizedPrivilegesId);
            if (!NullChecker.m82486a(userPrivilegeM146426x4)) {
                return 1L;
            }
            vipExpireTime = userPrivilegeM146426x4.content.expiredTime;
        } else {
            vipExpireTime = CoreModule.f18264c.f20381e0.m116600p9().getVipExpireTime();
        }
        return m213706L(vipExpireTime - jGuessedCurrentServerTime);
    }

    /* JADX INFO: renamed from: y */
    public boolean m213750y() {
        return NullChecker.m82486a(this.f196847a) && TextUtils.equals(this.f196847a.contractStatus, "signing");
    }

    /* JADX INFO: renamed from: z */
    public boolean m213751z() {
        if (NullChecker.m82486a(this.f196848b)) {
            return true;
        }
        return NullChecker.m82486a(this.f196847a) && this.f196847a.privilegeExpiredDays <= 0;
    }
}
