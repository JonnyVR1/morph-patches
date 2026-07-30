package p149l;

import com.google.android.gms.internal.ads.C2099a4;
import com.google.android.gms.internal.ads.C2108b4;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.C2300z3;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class lzw0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f130684a;

    /* JADX INFO: renamed from: b */
    public static final lxw0 f130685b;

    /* JADX INFO: renamed from: c */
    public static final hxw0 f130686c;

    /* JADX INFO: renamed from: d */
    public static final hww0 f130687d;

    /* JADX INFO: renamed from: e */
    public static final dww0 f130688e;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f130684a = q6x0VarM166725a;
        f130685b = lxw0.m152104b(new jxw0() { // from class: l.hzw0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                return lzw0.m152398b((bzw0) fow0Var);
            }
        }, bzw0.class, xxw0.class);
        f130686c = hxw0.m133430b(new fxw0() { // from class: l.izw0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) {
                return lzw0.m152400d((xxw0) fyw0Var);
            }
        }, q6x0VarM166725a, xxw0.class);
        f130687d = hww0.m133276b(new fww0() { // from class: l.jzw0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                return lzw0.m152397a((syw0) rnw0Var, uow0Var);
            }
        }, syw0.class, wxw0.class);
        f130688e = dww0.m113961b(new bww0() { // from class: l.kzw0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) {
                return lzw0.m152399c((wxw0) fyw0Var, uow0Var);
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ wxw0 m152397a(syw0 syw0Var, uow0 uow0Var) {
        v1x0 v1x0VarM13515M = C2300z3.m13515M();
        v1x0VarM13515M.m196670r(m152403g(syw0Var.m186729c()));
        byte[] bArrM178105d = syw0Var.m186730d().m178105d(uow0Var);
        v1x0VarM13515M.m196669q(zzgyl.zzv(bArrM178105d, 0, bArrM178105d.length));
        return wxw0.m206041a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C2300z3) v1x0VarM13515M.m153521m()).mo12742c(), zzgus.SYMMETRIC, m152404h(syw0Var.m186729c().m104700e()), syw0Var.m186731e());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ xxw0 m152398b(bzw0 bzw0Var) {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.AesCmacKey");
        x1x0 x1x0VarM12509M = C2099a4.m12509M();
        x1x0VarM12509M.m206766r(m152403g(bzw0Var));
        x1x0VarM12509M.m206765q(bzw0Var.m104698c());
        y3x0VarM13343L.m212863s(((C2099a4) x1x0VarM12509M.m153521m()).mo12742c());
        y3x0VarM13343L.m212861q(m152404h(bzw0Var.m104700e()));
        return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ syw0 m152399c(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            ig3.m135964a("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
            return null;
        }
        try {
            C2300z3 c2300z3M13517O = C2300z3.m13517O(wxw0Var.m206044d(), d8x0.m110397a());
            if (c2300z3M13517O.m13521L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            yyw0 yyw0Var = new yyw0(null);
            yyw0Var.m216584a(c2300z3M13517O.m13523Q().zzd());
            yyw0Var.m216585b(c2300z3M13517O.m13522P().m12538L());
            yyw0Var.m216586c(m152402f(wxw0Var.m206043c()));
            bzw0 bzw0VarM216587d = yyw0Var.m216587d();
            qyw0 qyw0Var = new qyw0(null);
            qyw0Var.m177110c(bzw0VarM216587d);
            qyw0Var.m177108a(r6x0.m178102b(c2300z3M13517O.m13523Q().zzA(), uow0Var));
            qyw0Var.m177109b(wxw0Var.m206045e());
            return qyw0Var.m177111d();
        } catch (zzhag | IllegalArgumentException unused) {
            j8w0.m140474a("Parsing AesCmacKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ bzw0 m152400d(xxw0 xxw0Var) throws GeneralSecurityException {
        if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            ig3.m135964a("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
            return null;
        }
        try {
            C2099a4 c2099a4M12511O = C2099a4.m12511O(xxw0Var.m211571c().m13351Q(), d8x0.m110397a());
            yyw0 yyw0Var = new yyw0(null);
            yyw0Var.m216584a(c2099a4M12511O.m12514L());
            yyw0Var.m216585b(c2099a4M12511O.m12515P().m12538L());
            yyw0Var.m216586c(m152402f(xxw0Var.m211571c().m13350P()));
            return yyw0Var.m216587d();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m152401e(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f130685b);
        dxw0Var.m114038i(f130686c);
        dxw0Var.m114037h(f130687d);
        dxw0Var.m114036g(f130688e);
    }

    /* JADX INFO: renamed from: f */
    public static zyw0 m152402f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return zyw0.f205752b;
        }
        if (iOrdinal == 2) {
            return zyw0.f205754d;
        }
        if (iOrdinal == 3) {
            return zyw0.f205755e;
        }
        if (iOrdinal == 4) {
            return zyw0.f205753c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
    }

    /* JADX INFO: renamed from: g */
    public static C2108b4 m152403g(bzw0 bzw0Var) {
        z1x0 z1x0VarM12534M = C2108b4.m12534M();
        z1x0VarM12534M.m216825q(bzw0Var.m104697b());
        return (C2108b4) z1x0VarM12534M.m153521m();
    }

    /* JADX INFO: renamed from: h */
    public static zzgvz m152404h(zyw0 zyw0Var) throws GeneralSecurityException {
        if (zyw0.f205752b.equals(zyw0Var)) {
            return zzgvz.TINK;
        }
        if (zyw0.f205753c.equals(zyw0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (zyw0.f205755e.equals(zyw0Var)) {
            return zzgvz.RAW;
        }
        if (zyw0.f205754d.equals(zyw0Var)) {
            return zzgvz.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zyw0Var)));
    }
}
