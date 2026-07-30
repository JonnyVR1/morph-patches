package p149l;

import com.google.android.gms.internal.ads.C2142f5;
import com.google.android.gms.internal.ads.C2150g5;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class jvw0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f119995a;

    /* JADX INFO: renamed from: b */
    public static final lxw0 f119996b;

    /* JADX INFO: renamed from: c */
    public static final hxw0 f119997c;

    /* JADX INFO: renamed from: d */
    public static final hww0 f119998d;

    /* JADX INFO: renamed from: e */
    public static final dww0 f119999e;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f119995a = q6x0VarM166725a;
        f119996b = lxw0.m152104b(new jxw0() { // from class: l.fvw0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                return jvw0.m143579d((iuw0) fow0Var);
            }
        }, iuw0.class, xxw0.class);
        f119997c = hxw0.m133430b(new fxw0() { // from class: l.gvw0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) {
                return jvw0.m143577b((xxw0) fyw0Var);
            }
        }, q6x0VarM166725a, xxw0.class);
        f119998d = hww0.m133276b(new fww0() { // from class: l.hvw0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                return jvw0.m143578c((cuw0) rnw0Var, uow0Var);
            }
        }, cuw0.class, wxw0.class);
        f119999e = dww0.m113961b(new bww0() { // from class: l.ivw0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) {
                return jvw0.m143576a((wxw0) fyw0Var, uow0Var);
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ cuw0 m143576a(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            ig3.m135964a("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            C2142f5 c2142f5M12703O = C2142f5.m12703O(wxw0Var.m206044d(), d8x0.m110397a());
            if (c2142f5M12703O.m12706L() == 0) {
                return cuw0.m108814a(m143581f(wxw0Var.m206043c()), r6x0.m178102b(c2142f5M12703O.m12707P().zzA(), uow0Var), wxw0Var.m206045e());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhag unused) {
            j8w0.m140474a("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ iuw0 m143577b(xxw0 xxw0Var) throws GeneralSecurityException {
        if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            ig3.m135964a("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
            return null;
        }
        try {
            if (C2150g5.m12722O(xxw0Var.m211571c().m13351Q(), d8x0.m110397a()).m12723L() == 0) {
                return iuw0.m138498c(m143581f(xxw0Var.m211571c().m13350P()));
            }
            j8w0.m140474a("Only version 0 parameters are accepted");
            return null;
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ wxw0 m143578c(cuw0 cuw0Var, uow0 uow0Var) {
        d5x0 d5x0VarM12701M = C2142f5.m12701M();
        byte[] bArrM178105d = cuw0Var.m108817d().m178105d(uow0Var);
        d5x0VarM12701M.m110094q(zzgyl.zzv(bArrM178105d, 0, bArrM178105d.length));
        return wxw0.m206041a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((C2142f5) d5x0VarM12701M.m153521m()).mo12742c(), zzgus.SYMMETRIC, m143582g(cuw0Var.m108815b().m138499b()), cuw0Var.m108818e());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xxw0 m143579d(iuw0 iuw0Var) {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        y3x0VarM13343L.m212863s(C2150g5.m12721N().mo12742c());
        y3x0VarM13343L.m212861q(m143582g(iuw0Var.m138499b()));
        return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
    }

    /* JADX INFO: renamed from: e */
    public static void m143580e(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f119996b);
        dxw0Var.m114038i(f119997c);
        dxw0Var.m114037h(f119998d);
        dxw0Var.m114036g(f119999e);
    }

    /* JADX INFO: renamed from: f */
    public static huw0 m143581f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return huw0.f109593b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return huw0.f109595d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return huw0.f109594c;
    }

    /* JADX INFO: renamed from: g */
    public static zzgvz m143582g(huw0 huw0Var) throws GeneralSecurityException {
        if (huw0.f109593b.equals(huw0Var)) {
            return zzgvz.TINK;
        }
        if (huw0.f109594c.equals(huw0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (huw0.f109595d.equals(huw0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(huw0Var.toString()));
    }
}
