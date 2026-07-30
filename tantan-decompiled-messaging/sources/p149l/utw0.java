package p149l;

import com.google.android.gms.internal.ads.C2118c5;
import com.google.android.gms.internal.ads.C2126d5;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class utw0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f178300a;

    /* JADX INFO: renamed from: b */
    public static final lxw0 f178301b;

    /* JADX INFO: renamed from: c */
    public static final hxw0 f178302c;

    /* JADX INFO: renamed from: d */
    public static final hww0 f178303d;

    /* JADX INFO: renamed from: e */
    public static final dww0 f178304e;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f178300a = q6x0VarM166725a;
        f178301b = lxw0.m152104b(new jxw0() { // from class: l.qtw0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                return utw0.m195314d((ptw0) fow0Var);
            }
        }, ptw0.class, xxw0.class);
        f178302c = hxw0.m133430b(new fxw0() { // from class: l.rtw0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) {
                return utw0.m195312b((xxw0) fyw0Var);
            }
        }, q6x0VarM166725a, xxw0.class);
        f178303d = hww0.m133276b(new fww0() { // from class: l.stw0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                return utw0.m195313c((ktw0) rnw0Var, uow0Var);
            }
        }, ktw0.class, wxw0.class);
        f178304e = dww0.m113961b(new bww0() { // from class: l.ttw0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) {
                return utw0.m195311a((wxw0) fyw0Var, uow0Var);
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ktw0 m195311a(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            ig3.m135964a("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
            return null;
        }
        try {
            C2118c5 c2118c5M12632O = C2118c5.m12632O(wxw0Var.m206044d(), d8x0.m110397a());
            if (wxw0Var.m206043c() != zzgvz.RAW) {
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with OutputPrefixType RAW, got ".concat(String.valueOf(c2118c5M12632O)));
            }
            if (c2118c5M12632O.m12635L() == 0) {
                return ktw0.m147221a(m195316f(c2118c5M12632O.m12636P()));
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(c2118c5M12632O)));
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ptw0 m195312b(xxw0 xxw0Var) throws GeneralSecurityException {
        if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            ig3.m135964a("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
            return null;
        }
        try {
            return m195316f(C2126d5.m12658P(xxw0Var.m211571c().m13351Q(), d8x0.m110397a()));
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ wxw0 m195313c(ktw0 ktw0Var, uow0 uow0Var) {
        r4x0 r4x0VarM12630M = C2118c5.m12630M();
        r4x0VarM12630M.m177873q(m195317g(ktw0Var.m147222b()));
        return wxw0.m206041a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((C2118c5) r4x0VarM12630M.m153521m()).mo12742c(), zzgus.REMOTE, zzgvz.RAW, null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xxw0 m195314d(ptw0 ptw0Var) {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        y3x0VarM13343L.m212863s(m195317g(ptw0Var).mo12742c());
        y3x0VarM13343L.m212861q(zzgvz.RAW);
        return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
    }

    /* JADX INFO: renamed from: e */
    public static void m195315e(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f178301b);
        dxw0Var.m114038i(f178302c);
        dxw0Var.m114037h(f178303d);
        dxw0Var.m114036g(f178304e);
    }

    /* JADX INFO: renamed from: f */
    public static ptw0 m195316f(C2126d5 c2126d5) throws GeneralSecurityException {
        ntw0 ntw0Var;
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r(c2126d5.m12661L().m13352R());
        y3x0VarM13343L.m212863s(c2126d5.m12661L().m13351Q());
        y3x0VarM13343L.m212861q(zzgvz.RAW);
        fow0 fow0VarM204875a = wow0.m204875a(((C2261u4) y3x0VarM13343L.m153521m()).m12744h());
        if (fow0VarM204875a instanceof irw0) {
            ntw0Var = ntw0.f140544b;
        } else if (fow0VarM204875a instanceof lsw0) {
            ntw0Var = ntw0.f140546d;
        } else if (fow0VarM204875a instanceof iuw0) {
            ntw0Var = ntw0.f140545c;
        } else if (fow0VarM204875a instanceof rpw0) {
            ntw0Var = ntw0.f140547e;
        } else if (fow0VarM204875a instanceof lqw0) {
            ntw0Var = ntw0.f140548f;
        } else {
            if (!(fow0VarM204875a instanceof vrw0)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(fow0VarM204875a.toString()));
            }
            ntw0Var = ntw0.f140549g;
        }
        mtw0 mtw0Var = new mtw0(null);
        mtw0Var.m156364c(c2126d5.m12662Q());
        mtw0Var.m156362a((apw0) fow0VarM204875a);
        mtw0Var.m156363b(ntw0Var);
        return mtw0Var.m156365d();
    }

    /* JADX INFO: renamed from: g */
    public static C2126d5 m195317g(ptw0 ptw0Var) throws GeneralSecurityException {
        try {
            C2261u4 c2261u4M13346O = C2261u4.m13346O(wow0.m204876b(ptw0Var.m171386b()), d8x0.m110397a());
            t4x0 t4x0VarM12655M = C2126d5.m12655M();
            t4x0VarM12655M.m187230r(ptw0Var.m171387c());
            t4x0VarM12655M.m187229q(c2261u4M13346O);
            return (C2126d5) t4x0VarM12655M.m153521m();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }
}
