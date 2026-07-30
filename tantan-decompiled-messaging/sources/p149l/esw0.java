package p149l;

import com.google.android.gms.internal.ads.C2197m4;
import com.google.android.gms.internal.ads.C2205n4;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class esw0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f93058a;

    /* JADX INFO: renamed from: b */
    public static final lxw0 f93059b;

    /* JADX INFO: renamed from: c */
    public static final hxw0 f93060c;

    /* JADX INFO: renamed from: d */
    public static final hww0 f93061d;

    /* JADX INFO: renamed from: e */
    public static final dww0 f93062e;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f93058a = q6x0VarM166725a;
        f93059b = lxw0.m152104b(new jxw0() { // from class: l.wrw0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                return esw0.m117962d((vrw0) fow0Var);
            }
        }, vrw0.class, xxw0.class);
        f93060c = hxw0.m133430b(new fxw0() { // from class: l.xrw0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) {
                return esw0.m117960b((xxw0) fyw0Var);
            }
        }, q6x0VarM166725a, xxw0.class);
        f93061d = hww0.m133276b(new fww0() { // from class: l.yrw0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                return esw0.m117961c((mrw0) rnw0Var, uow0Var);
            }
        }, mrw0.class, wxw0.class);
        f93062e = dww0.m113961b(new bww0() { // from class: l.zrw0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) {
                return esw0.m117959a((wxw0) fyw0Var, uow0Var);
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ mrw0 m117959a(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            ig3.m135964a("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
            return null;
        }
        try {
            C2197m4 c2197m4M12904O = C2197m4.m12904O(wxw0Var.m206044d(), d8x0.m110397a());
            if (c2197m4M12904O.m12907L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            srw0 srw0Var = new srw0(null);
            srw0Var.m185706a(c2197m4M12904O.m12908P().zzd());
            srw0Var.m185707b(m117964f(wxw0Var.m206043c()));
            vrw0 vrw0VarM185708c = srw0Var.m185708c();
            krw0 krw0Var = new krw0(null);
            krw0Var.m147030c(vrw0VarM185708c);
            krw0Var.m147029b(r6x0.m178102b(c2197m4M12904O.m12908P().zzA(), uow0Var));
            krw0Var.m147028a(wxw0Var.m206045e());
            return krw0Var.m147031d();
        } catch (zzhag unused) {
            j8w0.m140474a("Parsing AesGcmSivKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ vrw0 m117960b(xxw0 xxw0Var) throws GeneralSecurityException {
        if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            ig3.m135964a("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
            return null;
        }
        try {
            C2205n4 c2205n4M13032P = C2205n4.m13032P(xxw0Var.m211571c().m13351Q(), d8x0.m110397a());
            if (c2205n4M13032P.m13035M() != 0) {
                j8w0.m140474a("Only version 0 parameters are accepted");
                return null;
            }
            srw0 srw0Var = new srw0(null);
            srw0Var.m185706a(c2205n4M13032P.m13034L());
            srw0Var.m185707b(m117964f(xxw0Var.m211571c().m13350P()));
            return srw0Var.m185708c();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ wxw0 m117961c(mrw0 mrw0Var, uow0 uow0Var) {
        z2x0 z2x0VarM12902M = C2197m4.m12902M();
        byte[] bArrM178105d = mrw0Var.m156090c().m178105d(uow0Var);
        z2x0VarM12902M.m217002q(zzgyl.zzv(bArrM178105d, 0, bArrM178105d.length));
        return wxw0.m206041a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C2197m4) z2x0VarM12902M.m153521m()).mo12742c(), zzgus.SYMMETRIC, m117965g(mrw0Var.m156088a().m199755c()), mrw0Var.m156091d());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xxw0 m117962d(vrw0 vrw0Var) {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        b3x0 b3x0VarM13030N = C2205n4.m13030N();
        b3x0VarM13030N.m100117q(vrw0Var.m199754b());
        y3x0VarM13343L.m212863s(((C2205n4) b3x0VarM13030N.m153521m()).mo12742c());
        y3x0VarM13343L.m212861q(m117965g(vrw0Var.m199755c()));
        return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
    }

    /* JADX INFO: renamed from: e */
    public static void m117963e(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f93059b);
        dxw0Var.m114038i(f93060c);
        dxw0Var.m114037h(f93061d);
        dxw0Var.m114036g(f93062e);
    }

    /* JADX INFO: renamed from: f */
    public static trw0 m117964f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return trw0.f171875b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return trw0.f171877d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return trw0.f171876c;
    }

    /* JADX INFO: renamed from: g */
    public static zzgvz m117965g(trw0 trw0Var) throws GeneralSecurityException {
        if (trw0.f171875b.equals(trw0Var)) {
            return zzgvz.TINK;
        }
        if (trw0.f171876c.equals(trw0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (trw0.f171877d.equals(trw0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(trw0Var)));
    }
}
