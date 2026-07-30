package p149l;

import com.google.android.gms.internal.ads.C2181k4;
import com.google.android.gms.internal.ads.C2189l4;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class uuw0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f178464a;

    /* JADX INFO: renamed from: b */
    public static final lxw0 f178465b;

    /* JADX INFO: renamed from: c */
    public static final hxw0 f178466c;

    /* JADX INFO: renamed from: d */
    public static final hww0 f178467d;

    /* JADX INFO: renamed from: e */
    public static final dww0 f178468e;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f178464a = q6x0VarM166725a;
        f178465b = lxw0.m152104b(new jxw0() { // from class: l.juw0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                return uuw0.m196042d((irw0) fow0Var);
            }
        }, irw0.class, xxw0.class);
        f178466c = hxw0.m133430b(new fxw0() { // from class: l.ruw0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) {
                return uuw0.m196040b((xxw0) fyw0Var);
            }
        }, q6x0VarM166725a, xxw0.class);
        f178467d = hww0.m133276b(new fww0() { // from class: l.suw0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                return uuw0.m196041c((uqw0) rnw0Var, uow0Var);
            }
        }, uqw0.class, wxw0.class);
        f178468e = dww0.m113961b(new bww0() { // from class: l.tuw0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) {
                return uuw0.m196039a((wxw0) fyw0Var, uow0Var);
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ uqw0 m196039a(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            ig3.m135964a("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
            return null;
        }
        try {
            C2181k4 c2181k4M12822O = C2181k4.m12822O(wxw0Var.m206044d(), d8x0.m110397a());
            if (c2181k4M12822O.m12825L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            frw0 frw0VarM137918c = irw0.m137918c();
            frw0VarM137918c.m122902b(c2181k4M12822O.m12826P().zzd());
            frw0VarM137918c.m122901a(12);
            frw0VarM137918c.m122903c(16);
            frw0VarM137918c.m122904d(m196044f(wxw0Var.m206043c()));
            irw0 irw0VarM122905e = frw0VarM137918c.m122905e();
            sqw0 sqw0VarM195021a = uqw0.m195021a();
            sqw0VarM195021a.m185614c(irw0VarM122905e);
            sqw0VarM195021a.m185613b(r6x0.m178102b(c2181k4M12822O.m12826P().zzA(), uow0Var));
            sqw0VarM195021a.m185612a(wxw0Var.m206045e());
            return sqw0VarM195021a.m185615d();
        } catch (zzhag unused) {
            j8w0.m140474a("Parsing AesGcmKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ irw0 m196040b(xxw0 xxw0Var) throws GeneralSecurityException {
        if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            ig3.m135964a("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
            return null;
        }
        try {
            C2189l4 c2189l4M12868P = C2189l4.m12868P(xxw0Var.m211571c().m13351Q(), d8x0.m110397a());
            if (c2189l4M12868P.m12871M() != 0) {
                j8w0.m140474a("Only version 0 parameters are accepted");
                return null;
            }
            frw0 frw0VarM137918c = irw0.m137918c();
            frw0VarM137918c.m122902b(c2189l4M12868P.m12870L());
            frw0VarM137918c.m122901a(12);
            frw0VarM137918c.m122903c(16);
            frw0VarM137918c.m122904d(m196044f(xxw0Var.m211571c().m13350P()));
            return frw0VarM137918c.m122905e();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ wxw0 m196041c(uqw0 uqw0Var, uow0 uow0Var) {
        v2x0 v2x0VarM12820M = C2181k4.m12820M();
        byte[] bArrM178105d = uqw0Var.m195024d().m178105d(uow0Var);
        v2x0VarM12820M.m196824q(zzgyl.zzv(bArrM178105d, 0, bArrM178105d.length));
        return wxw0.m206041a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C2181k4) v2x0VarM12820M.m153521m()).mo12742c(), zzgus.SYMMETRIC, m196045g(uqw0Var.m195022b().m137920d()), uqw0Var.m195025e());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xxw0 m196042d(irw0 irw0Var) {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.AesGcmKey");
        x2x0 x2x0VarM12866N = C2189l4.m12866N();
        x2x0VarM12866N.m206882q(irw0Var.m137919b());
        y3x0VarM13343L.m212863s(((C2189l4) x2x0VarM12866N.m153521m()).mo12742c());
        y3x0VarM13343L.m212861q(m196045g(irw0Var.m137920d()));
        return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
    }

    /* JADX INFO: renamed from: e */
    public static void m196043e(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f178465b);
        dxw0Var.m114038i(f178466c);
        dxw0Var.m114037h(f178467d);
        dxw0Var.m114036g(f178468e);
    }

    /* JADX INFO: renamed from: f */
    public static grw0 m196044f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return grw0.f104121b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return grw0.f104123d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return grw0.f104122c;
    }

    /* JADX INFO: renamed from: g */
    public static zzgvz m196045g(grw0 grw0Var) throws GeneralSecurityException {
        if (grw0.f104121b.equals(grw0Var)) {
            return zzgvz.TINK;
        }
        if (grw0.f104122c.equals(grw0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (grw0.f104123d.equals(grw0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(grw0Var)));
    }
}
