package p149l;

import com.google.android.gms.internal.ads.C2157h4;
import com.google.android.gms.internal.ads.C2165i4;
import com.google.android.gms.internal.ads.C2173j4;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class qqw0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f155941a;

    /* JADX INFO: renamed from: b */
    public static final lxw0 f155942b;

    /* JADX INFO: renamed from: c */
    public static final hxw0 f155943c;

    /* JADX INFO: renamed from: d */
    public static final hww0 f155944d;

    /* JADX INFO: renamed from: e */
    public static final dww0 f155945e;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f155941a = q6x0VarM166725a;
        f155942b = lxw0.m152104b(new jxw0() { // from class: l.mqw0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                return qqw0.m175975d((lqw0) fow0Var);
            }
        }, lqw0.class, xxw0.class);
        f155943c = hxw0.m133430b(new fxw0() { // from class: l.nqw0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) {
                return qqw0.m175973b((xxw0) fyw0Var);
            }
        }, q6x0VarM166725a, xxw0.class);
        f155944d = hww0.m133276b(new fww0() { // from class: l.oqw0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                return qqw0.m175974c((dqw0) rnw0Var, uow0Var);
            }
        }, dqw0.class, wxw0.class);
        f155945e = dww0.m113961b(new bww0() { // from class: l.pqw0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) {
                return qqw0.m175972a((wxw0) fyw0Var, uow0Var);
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ dqw0 m175972a(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            ig3.m135964a("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
            return null;
        }
        try {
            C2157h4 c2157h4M12733O = C2157h4.m12733O(wxw0Var.m206044d(), d8x0.m110397a());
            if (c2157h4M12733O.m12737L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            iqw0 iqw0Var = new iqw0(null);
            iqw0Var.m137806b(c2157h4M12733O.m12739Q().zzd());
            iqw0Var.m137805a(c2157h4M12733O.m12738P().m12780L());
            iqw0Var.m137807c(16);
            iqw0Var.m137808d(m175977f(wxw0Var.m206043c()));
            lqw0 lqw0VarM137809e = iqw0Var.m137809e();
            bqw0 bqw0Var = new bqw0(null);
            bqw0Var.m103426c(lqw0VarM137809e);
            bqw0Var.m103425b(r6x0.m178102b(c2157h4M12733O.m12739Q().zzA(), uow0Var));
            bqw0Var.m103424a(wxw0Var.m206045e());
            return bqw0Var.m103427d();
        } catch (zzhag unused) {
            j8w0.m140474a("Parsing AesEaxcKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ lqw0 m175973b(xxw0 xxw0Var) throws GeneralSecurityException {
        if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            ig3.m135964a("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
            return null;
        }
        try {
            C2165i4 c2165i4M12765O = C2165i4.m12765O(xxw0Var.m211571c().m13351Q(), d8x0.m110397a());
            iqw0 iqw0Var = new iqw0(null);
            iqw0Var.m137806b(c2165i4M12765O.m12768L());
            iqw0Var.m137805a(c2165i4M12765O.m12769P().m12780L());
            iqw0Var.m137807c(16);
            iqw0Var.m137808d(m175977f(xxw0Var.m211571c().m13350P()));
            return iqw0Var.m137809e();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ wxw0 m175974c(dqw0 dqw0Var, uow0 uow0Var) {
        p2x0 p2x0VarM12731M = C2157h4.m12731M();
        p2x0VarM12731M.m167228r(m175978g(dqw0Var.m113147a()));
        byte[] bArrM178105d = dqw0Var.m113149c().m178105d(uow0Var);
        p2x0VarM12731M.m167227q(zzgyl.zzv(bArrM178105d, 0, bArrM178105d.length));
        return wxw0.m206041a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C2157h4) p2x0VarM12731M.m153521m()).mo12742c(), zzgus.SYMMETRIC, m175979h(dqw0Var.m113147a().m151107d()), dqw0Var.m113150d());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xxw0 m175975d(lqw0 lqw0Var) {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.AesEaxKey");
        r2x0 r2x0VarM12763M = C2165i4.m12763M();
        r2x0VarM12763M.m177621r(m175978g(lqw0Var));
        r2x0VarM12763M.m177620q(lqw0Var.m151106c());
        y3x0VarM13343L.m212863s(((C2165i4) r2x0VarM12763M.m153521m()).mo12742c());
        y3x0VarM13343L.m212861q(m175979h(lqw0Var.m151107d()));
        return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
    }

    /* JADX INFO: renamed from: e */
    public static void m175976e(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f155942b);
        dxw0Var.m114038i(f155943c);
        dxw0Var.m114037h(f155944d);
        dxw0Var.m114036g(f155945e);
    }

    /* JADX INFO: renamed from: f */
    public static jqw0 m175977f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return jqw0.f119329b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return jqw0.f119331d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return jqw0.f119330c;
    }

    /* JADX INFO: renamed from: g */
    public static C2173j4 m175978g(lqw0 lqw0Var) throws GeneralSecurityException {
        t2x0 t2x0VarM12776M = C2173j4.m12776M();
        t2x0VarM12776M.m187059q(lqw0Var.m151105b());
        return (C2173j4) t2x0VarM12776M.m153521m();
    }

    /* JADX INFO: renamed from: h */
    public static zzgvz m175979h(jqw0 jqw0Var) throws GeneralSecurityException {
        if (jqw0.f119329b.equals(jqw0Var)) {
            return zzgvz.TINK;
        }
        if (jqw0.f119330c.equals(jqw0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (jqw0.f119331d.equals(jqw0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(jqw0Var)));
    }
}
