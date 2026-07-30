package p149l;

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
public final class d1x0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f83312a;

    /* JADX INFO: renamed from: b */
    public static final wvw0 f83313b;

    /* JADX INFO: renamed from: c */
    public static final wvw0 f83314c;

    /* JADX INFO: renamed from: d */
    public static final lxw0 f83315d;

    /* JADX INFO: renamed from: e */
    public static final hxw0 f83316e;

    /* JADX INFO: renamed from: f */
    public static final hww0 f83317f;

    /* JADX INFO: renamed from: g */
    public static final dww0 f83318g;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.HmacKey");
        f83312a = q6x0VarM166725a;
        pvw0 pvw0VarM205784a = wvw0.m205784a();
        pvw0VarM205784a.m171694a(zzgvz.RAW, c0x0.f78187e);
        pvw0VarM205784a.m171694a(zzgvz.TINK, c0x0.f78184b);
        pvw0VarM205784a.m171694a(zzgvz.LEGACY, c0x0.f78186d);
        pvw0VarM205784a.m171694a(zzgvz.CRUNCHY, c0x0.f78185c);
        f83313b = pvw0VarM205784a.m171695b();
        pvw0 pvw0VarM205784a2 = wvw0.m205784a();
        pvw0VarM205784a2.m171694a(zzguf.SHA1, b0x0.f72467b);
        pvw0VarM205784a2.m171694a(zzguf.SHA224, b0x0.f72468c);
        pvw0VarM205784a2.m171694a(zzguf.SHA256, b0x0.f72469d);
        pvw0VarM205784a2.m171694a(zzguf.SHA384, b0x0.f72470e);
        pvw0VarM205784a2.m171694a(zzguf.SHA512, b0x0.f72471f);
        f83314c = pvw0VarM205784a2.m171695b();
        f83315d = lxw0.m152104b(new jxw0() { // from class: l.z0x0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                return d1x0.m109693b((e0x0) fow0Var);
            }
        }, e0x0.class, xxw0.class);
        f83316e = hxw0.m133430b(new fxw0() { // from class: l.a1x0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) {
                return d1x0.m109695d((xxw0) fyw0Var);
            }
        }, q6x0VarM166725a, xxw0.class);
        f83317f = hww0.m133276b(new fww0() { // from class: l.b1x0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                return d1x0.m109692a((tzw0) rnw0Var, uow0Var);
            }
        }, tzw0.class, wxw0.class);
        f83318g = dww0.m113961b(new bww0() { // from class: l.c1x0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) {
                return d1x0.m109694c((wxw0) fyw0Var, uow0Var);
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ wxw0 m109692a(tzw0 tzw0Var, uow0 uow0Var) {
        n3x0 n3x0VarM13199M = C2229q4.m13199M();
        n3x0VarM13199M.m157789r(m109697f(tzw0Var.m191227d()));
        byte[] bArrM178105d = tzw0Var.m191228e().m178105d(uow0Var);
        n3x0VarM13199M.m157788q(zzgyl.zzv(bArrM178105d, 0, bArrM178105d.length));
        return wxw0.m206041a("type.googleapis.com/google.crypto.tink.HmacKey", ((C2229q4) n3x0VarM13199M.m153521m()).mo12742c(), zzgus.SYMMETRIC, (zzgvz) f83313b.m205785b(tzw0Var.m191227d().m114356g()), tzw0Var.m191229f());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ xxw0 m109693b(e0x0 e0x0Var) {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.HmacKey");
        p3x0 p3x0VarM13224N = C2237r4.m13224N();
        p3x0VarM13224N.m167280r(m109697f(e0x0Var));
        p3x0VarM13224N.m167279q(e0x0Var.m114353c());
        y3x0VarM13343L.m212863s(((C2237r4) p3x0VarM13224N.m153521m()).mo12742c());
        y3x0VarM13343L.m212861q((zzgvz) f83313b.m205785b(e0x0Var.m114356g()));
        return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ tzw0 m109694c(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            ig3.m135964a("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            C2229q4 c2229q4M13202P = C2229q4.m13202P(wxw0Var.m206044d(), d8x0.m110397a());
            if (c2229q4M13202P.m13206L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            a0x0 a0x0VarM114351e = e0x0.m114351e();
            a0x0VarM114351e.m94496b(c2229q4M13202P.m13208R().zzd());
            a0x0VarM114351e.m94497c(c2229q4M13202P.m13207Q().m13259L());
            a0x0VarM114351e.m94495a((b0x0) f83314c.m205786c(c2229q4M13202P.m13207Q().m13260M()));
            a0x0VarM114351e.m94498d((c0x0) f83313b.m205786c(wxw0Var.m206043c()));
            e0x0 e0x0VarM94499e = a0x0VarM114351e.m94499e();
            rzw0 rzw0VarM191226c = tzw0.m191226c();
            rzw0VarM191226c.m181803c(e0x0VarM94499e);
            rzw0VarM191226c.m181802b(r6x0.m178102b(c2229q4M13202P.m13208R().zzA(), uow0Var));
            rzw0VarM191226c.m181801a(wxw0Var.m206045e());
            return rzw0VarM191226c.m181804d();
        } catch (zzhag | IllegalArgumentException unused) {
            j8w0.m140474a("Parsing HmacKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ e0x0 m109695d(xxw0 xxw0Var) throws GeneralSecurityException {
        if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            ig3.m135964a("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
            return null;
        }
        try {
            C2237r4 c2237r4M13227Q = C2237r4.m13227Q(xxw0Var.m211571c().m13351Q(), d8x0.m110397a());
            if (c2237r4M13227Q.m13231M() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + c2237r4M13227Q.m13231M());
            }
            a0x0 a0x0VarM114351e = e0x0.m114351e();
            a0x0VarM114351e.m94496b(c2237r4M13227Q.m13230L());
            a0x0VarM114351e.m94497c(c2237r4M13227Q.m13232R().m13259L());
            a0x0VarM114351e.m94495a((b0x0) f83314c.m205786c(c2237r4M13227Q.m13232R().m13260M()));
            a0x0VarM114351e.m94498d((c0x0) f83313b.m205786c(xxw0Var.m211571c().m13350P()));
            return a0x0VarM114351e.m94499e();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m109696e(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f83315d);
        dxw0Var.m114038i(f83316e);
        dxw0Var.m114037h(f83317f);
        dxw0Var.m114036g(f83318g);
    }

    /* JADX INFO: renamed from: f */
    public static C2245s4 m109697f(e0x0 e0x0Var) throws GeneralSecurityException {
        r3x0 r3x0VarM13254N = C2245s4.m13254N();
        r3x0VarM13254N.m177747r(e0x0Var.m114352b());
        r3x0VarM13254N.m177746q((zzguf) f83314c.m205785b(e0x0Var.m114355f()));
        return (C2245s4) r3x0VarM13254N.m153521m();
    }
}
