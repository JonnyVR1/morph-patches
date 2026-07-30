package p149l;

import com.google.android.gms.internal.ads.C2213o4;
import com.google.android.gms.internal.ads.C2221p4;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class qsw0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f156279a;

    /* JADX INFO: renamed from: b */
    public static final lxw0 f156280b;

    /* JADX INFO: renamed from: c */
    public static final hxw0 f156281c;

    /* JADX INFO: renamed from: d */
    public static final hww0 f156282d;

    /* JADX INFO: renamed from: e */
    public static final dww0 f156283e;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f156279a = q6x0VarM166725a;
        f156280b = lxw0.m152104b(new jxw0() { // from class: l.msw0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                return qsw0.m176373d((lsw0) fow0Var);
            }
        }, lsw0.class, xxw0.class);
        f156281c = hxw0.m133430b(new fxw0() { // from class: l.nsw0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) {
                return qsw0.m176371b((xxw0) fyw0Var);
            }
        }, q6x0VarM166725a, xxw0.class);
        f156282d = hww0.m133276b(new fww0() { // from class: l.osw0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                return qsw0.m176372c((gsw0) rnw0Var, uow0Var);
            }
        }, gsw0.class, wxw0.class);
        f156283e = dww0.m113961b(new bww0() { // from class: l.psw0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) {
                return qsw0.m176370a((wxw0) fyw0Var, uow0Var);
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ gsw0 m176370a(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            ig3.m135964a("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            C2213o4 c2213o4M13089O = C2213o4.m13089O(wxw0Var.m206044d(), d8x0.m110397a());
            if (c2213o4M13089O.m13092L() == 0) {
                return gsw0.m127853a(m176375f(wxw0Var.m206043c()), r6x0.m178102b(c2213o4M13089O.m13093P().zzA(), uow0Var), wxw0Var.m206045e());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhag unused) {
            j8w0.m140474a("Parsing ChaCha20Poly1305Key failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ lsw0 m176371b(xxw0 xxw0Var) throws GeneralSecurityException {
        if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            ig3.m135964a("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
            return null;
        }
        try {
            C2221p4.m13158N(xxw0Var.m211571c().m13351Q(), d8x0.m110397a());
            return lsw0.m151649c(m176375f(xxw0Var.m211571c().m13350P()));
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ wxw0 m176372c(gsw0 gsw0Var, uow0 uow0Var) {
        d3x0 d3x0VarM13087M = C2213o4.m13087M();
        byte[] bArrM178105d = gsw0Var.m127856d().m178105d(uow0Var);
        d3x0VarM13087M.m109967q(zzgyl.zzv(bArrM178105d, 0, bArrM178105d.length));
        return wxw0.m206041a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((C2213o4) d3x0VarM13087M.m153521m()).mo12742c(), zzgus.SYMMETRIC, m176376g(gsw0Var.m127854b().m151650b()), gsw0Var.m127857e());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xxw0 m176373d(lsw0 lsw0Var) {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        y3x0VarM13343L.m212863s(C2221p4.m13157M().mo12742c());
        y3x0VarM13343L.m212861q(m176376g(lsw0Var.m151650b()));
        return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
    }

    /* JADX INFO: renamed from: e */
    public static void m176374e(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f156280b);
        dxw0Var.m114038i(f156281c);
        dxw0Var.m114037h(f156282d);
        dxw0Var.m114036g(f156283e);
    }

    /* JADX INFO: renamed from: f */
    public static ksw0 m176375f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return ksw0.f124511b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ksw0.f124513d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return ksw0.f124512c;
    }

    /* JADX INFO: renamed from: g */
    public static zzgvz m176376g(ksw0 ksw0Var) throws GeneralSecurityException {
        if (ksw0.f124511b.equals(ksw0Var)) {
            return zzgvz.TINK;
        }
        if (ksw0.f124512c.equals(ksw0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (ksw0.f124513d.equals(ksw0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ksw0Var.toString()));
    }
}
