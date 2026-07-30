package p149l;

import com.google.android.gms.internal.ads.C2117c4;
import com.google.android.gms.internal.ads.C2125d4;
import com.google.android.gms.internal.ads.C2133e4;
import com.google.android.gms.internal.ads.C2141f4;
import com.google.android.gms.internal.ads.C2149g4;
import com.google.android.gms.internal.ads.C2229q4;
import com.google.android.gms.internal.ads.C2237r4;
import com.google.android.gms.internal.ads.C2245s4;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class zpw0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f204316a;

    /* JADX INFO: renamed from: b */
    public static final lxw0 f204317b;

    /* JADX INFO: renamed from: c */
    public static final hxw0 f204318c;

    /* JADX INFO: renamed from: d */
    public static final hww0 f204319d;

    /* JADX INFO: renamed from: e */
    public static final dww0 f204320e;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f204316a = q6x0VarM166725a;
        f204317b = lxw0.m152104b(new jxw0() { // from class: l.vpw0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                return zpw0.m219804d((rpw0) fow0Var);
            }
        }, rpw0.class, xxw0.class);
        f204318c = hxw0.m133430b(new fxw0() { // from class: l.wpw0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) {
                return zpw0.m219802b((xxw0) fyw0Var);
            }
        }, q6x0VarM166725a, xxw0.class);
        f204319d = hww0.m133276b(new fww0() { // from class: l.xpw0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                return zpw0.m219803c((hpw0) rnw0Var, uow0Var);
            }
        }, hpw0.class, wxw0.class);
        f204320e = dww0.m113961b(new bww0() { // from class: l.ypw0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) {
                return zpw0.m219801a((wxw0) fyw0Var, uow0Var);
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ hpw0 m219801a(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            ig3.m135964a("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
            return null;
        }
        try {
            C2117c4 c2117c4M12623O = C2117c4.m12623O(wxw0Var.m206044d(), d8x0.m110397a());
            if (c2117c4M12623O.m12627L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (c2117c4M12623O.m12628P().m12676L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (c2117c4M12623O.m12629Q().m13206L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            npw0 npw0Var = new npw0(null);
            npw0Var.m160543a(c2117c4M12623O.m12628P().m12678Q().zzd());
            npw0Var.m160545c(c2117c4M12623O.m12629Q().m13208R().zzd());
            npw0Var.m160546d(c2117c4M12623O.m12628P().m12677P().m12719L());
            npw0Var.m160547e(c2117c4M12623O.m12629Q().m13207Q().m13259L());
            npw0Var.m160544b(m219806f(c2117c4M12623O.m12629Q().m13207Q().m13260M()));
            npw0Var.m160548f(m219807g(wxw0Var.m206043c()));
            rpw0 rpw0VarM160549g = npw0Var.m160549g();
            fpw0 fpw0Var = new fpw0(null);
            fpw0Var.m122679d(rpw0VarM160549g);
            fpw0Var.m122676a(r6x0.m178102b(c2117c4M12623O.m12628P().m12678Q().zzA(), uow0Var));
            fpw0Var.m122677b(r6x0.m178102b(c2117c4M12623O.m12629Q().m13208R().zzA(), uow0Var));
            fpw0Var.m122678c(wxw0Var.m206045e());
            return fpw0Var.m122680e();
        } catch (zzhag unused) {
            j8w0.m140474a("Parsing AesCtrHmacAeadKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ rpw0 m219802b(xxw0 xxw0Var) throws GeneralSecurityException {
        if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            ig3.m135964a("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
            return null;
        }
        try {
            C2125d4 c2125d4M12650N = C2125d4.m12650N(xxw0Var.m211571c().m13351Q(), d8x0.m110397a());
            if (c2125d4M12650N.m12654P().m13231M() != 0) {
                j8w0.m140474a("Only version 0 keys are accepted");
                return null;
            }
            npw0 npw0Var = new npw0(null);
            npw0Var.m160543a(c2125d4M12650N.m12653O().m12699L());
            npw0Var.m160545c(c2125d4M12650N.m12654P().m13230L());
            npw0Var.m160546d(c2125d4M12650N.m12653O().m12700P().m12719L());
            npw0Var.m160547e(c2125d4M12650N.m12654P().m13232R().m13259L());
            npw0Var.m160544b(m219806f(c2125d4M12650N.m12654P().m13232R().m13260M()));
            npw0Var.m160548f(m219807g(xxw0Var.m211571c().m13350P()));
            return npw0Var.m160549g();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ wxw0 m219803c(hpw0 hpw0Var, uow0 uow0Var) {
        b2x0 b2x0VarM12621M = C2117c4.m12621M();
        f2x0 f2x0VarM12671M = C2133e4.m12671M();
        n2x0 n2x0VarM12715M = C2149g4.m12715M();
        n2x0VarM12715M.m157684q(hpw0Var.m132386a().m180404d());
        f2x0VarM12671M.m119242r((C2149g4) n2x0VarM12715M.m153521m());
        byte[] bArrM178105d = hpw0Var.m132388c().m178105d(uow0Var);
        f2x0VarM12671M.m119241q(zzgyl.zzv(bArrM178105d, 0, bArrM178105d.length));
        b2x0VarM12621M.m100032q((C2133e4) f2x0VarM12671M.m153521m());
        n3x0 n3x0VarM13199M = C2229q4.m13199M();
        n3x0VarM13199M.m157789r(m219808h(hpw0Var.m132386a()));
        byte[] bArrM178105d2 = hpw0Var.m132389d().m178105d(uow0Var);
        n3x0VarM13199M.m157788q(zzgyl.zzv(bArrM178105d2, 0, bArrM178105d2.length));
        b2x0VarM12621M.m100033r((C2229q4) n3x0VarM13199M.m153521m());
        return wxw0.m206041a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C2117c4) b2x0VarM12621M.m153521m()).mo12742c(), zzgus.SYMMETRIC, m219809i(hpw0Var.m132386a().m180407g()), hpw0Var.m132390e());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xxw0 m219804d(rpw0 rpw0Var) {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        d2x0 d2x0VarM12648L = C2125d4.m12648L();
        h2x0 h2x0VarM12694M = C2141f4.m12694M();
        n2x0 n2x0VarM12715M = C2149g4.m12715M();
        n2x0VarM12715M.m157684q(rpw0Var.m180404d());
        h2x0VarM12694M.m129147r((C2149g4) n2x0VarM12715M.m153521m());
        h2x0VarM12694M.m129146q(rpw0Var.m180402b());
        d2x0VarM12648L.m109833q((C2141f4) h2x0VarM12694M.m153521m());
        p3x0 p3x0VarM13224N = C2237r4.m13224N();
        p3x0VarM13224N.m167280r(m219808h(rpw0Var));
        p3x0VarM13224N.m167279q(rpw0Var.m180403c());
        d2x0VarM12648L.m109834r((C2237r4) p3x0VarM13224N.m153521m());
        y3x0VarM13343L.m212863s(((C2125d4) d2x0VarM12648L.m153521m()).mo12742c());
        y3x0VarM13343L.m212861q(m219809i(rpw0Var.m180407g()));
        return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
    }

    /* JADX INFO: renamed from: e */
    public static void m219805e(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f204317b);
        dxw0Var.m114038i(f204318c);
        dxw0Var.m114037h(f204319d);
        dxw0Var.m114036g(f204320e);
    }

    /* JADX INFO: renamed from: f */
    public static opw0 m219806f(zzguf zzgufVar) throws GeneralSecurityException {
        zzguf zzgufVar2 = zzguf.UNKNOWN_HASH;
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgufVar.ordinal();
        if (iOrdinal == 1) {
            return opw0.f145053b;
        }
        if (iOrdinal == 2) {
            return opw0.f145056e;
        }
        if (iOrdinal == 3) {
            return opw0.f145055d;
        }
        if (iOrdinal == 4) {
            return opw0.f145057f;
        }
        if (iOrdinal == 5) {
            return opw0.f145054c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzgufVar.zza());
    }

    /* JADX INFO: renamed from: g */
    public static ppw0 m219807g(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzguf zzgufVar = zzguf.UNKNOWN_HASH;
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return ppw0.f150726b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ppw0.f150728d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return ppw0.f150727c;
    }

    /* JADX INFO: renamed from: h */
    public static C2245s4 m219808h(rpw0 rpw0Var) throws GeneralSecurityException {
        zzguf zzgufVar;
        r3x0 r3x0VarM13254N = C2245s4.m13254N();
        r3x0VarM13254N.m177747r(rpw0Var.m180405e());
        opw0 opw0VarM180406f = rpw0Var.m180406f();
        if (opw0.f145053b.equals(opw0VarM180406f)) {
            zzgufVar = zzguf.SHA1;
        } else if (opw0.f145054c.equals(opw0VarM180406f)) {
            zzgufVar = zzguf.SHA224;
        } else if (opw0.f145055d.equals(opw0VarM180406f)) {
            zzgufVar = zzguf.SHA256;
        } else if (opw0.f145056e.equals(opw0VarM180406f)) {
            zzgufVar = zzguf.SHA384;
        } else {
            if (!opw0.f145057f.equals(opw0VarM180406f)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(opw0VarM180406f)));
            }
            zzgufVar = zzguf.SHA512;
        }
        r3x0VarM13254N.m177746q(zzgufVar);
        return (C2245s4) r3x0VarM13254N.m153521m();
    }

    /* JADX INFO: renamed from: i */
    public static zzgvz m219809i(ppw0 ppw0Var) throws GeneralSecurityException {
        if (ppw0.f150726b.equals(ppw0Var)) {
            return zzgvz.TINK;
        }
        if (ppw0.f150727c.equals(ppw0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (ppw0.f150728d.equals(ppw0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ppw0Var)));
    }
}
