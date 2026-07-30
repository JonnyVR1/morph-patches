package p149l;

import com.google.android.gms.internal.ads.C2100a5;
import com.google.android.gms.internal.ads.C2109b5;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class etw0 {

    /* JADX INFO: renamed from: a */
    public static final q6x0 f93189a;

    /* JADX INFO: renamed from: b */
    public static final lxw0 f93190b;

    /* JADX INFO: renamed from: c */
    public static final hxw0 f93191c;

    /* JADX INFO: renamed from: d */
    public static final hww0 f93192d;

    /* JADX INFO: renamed from: e */
    public static final dww0 f93193e;

    static {
        q6x0 q6x0VarM166725a = oyw0.m166725a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f93189a = q6x0VarM166725a;
        f93190b = lxw0.m152104b(new jxw0() { // from class: l.atw0
            @Override // p149l.jxw0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo98886a(fow0 fow0Var) {
                q6x0 q6x0Var = etw0.f93189a;
                y3x0 y3x0VarM13343L = C2261u4.m13343L();
                y3x0VarM13343L.m212862r("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                p4x0 p4x0VarM12539L = C2109b5.m12539L();
                p4x0VarM12539L.m167440q(((zsw0) fow0Var).m220082c());
                y3x0VarM13343L.m212863s(((C2109b5) p4x0VarM12539L.m153521m()).mo12742c());
                y3x0VarM13343L.m212861q(zzgvz.RAW);
                return xxw0.m211570b((C2261u4) y3x0VarM13343L.m153521m());
            }
        }, zsw0.class, xxw0.class);
        f93191c = hxw0.m133430b(new fxw0() { // from class: l.btw0
            @Override // p149l.fxw0
            /* JADX INFO: renamed from: a */
            public final fow0 mo94582a(fyw0 fyw0Var) throws GeneralSecurityException {
                q6x0 q6x0Var = etw0.f93189a;
                xxw0 xxw0Var = (xxw0) fyw0Var;
                if (!xxw0Var.m211571c().m13352R().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    ig3.m135964a("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(xxw0Var.m211571c().m13352R())));
                    return null;
                }
                try {
                    C2109b5 c2109b5M12542O = C2109b5.m12542O(((xxw0) fyw0Var).m211571c().m13351Q(), d8x0.m110397a());
                    if (xxw0Var.m211571c().m13350P() == zzgvz.RAW) {
                        return zsw0.m220081b(c2109b5M12542O.m12544P());
                    }
                    throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + String.valueOf(xxw0Var.m211571c().m13350P()) + " with format " + String.valueOf(c2109b5M12542O));
                } catch (zzhag e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            }
        }, q6x0VarM166725a, xxw0.class);
        f93192d = hww0.m133276b(new fww0() { // from class: l.ctw0
            @Override // p149l.fww0
            /* JADX INFO: renamed from: a */
            public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                q6x0 q6x0Var = etw0.f93189a;
                n4x0 n4x0VarM12516M = C2100a5.m12516M();
                p4x0 p4x0VarM12539L = C2109b5.m12539L();
                p4x0VarM12539L.m167440q(((ysw0) rnw0Var).m215955b().m220082c());
                n4x0VarM12516M.m157918q((C2109b5) p4x0VarM12539L.m153521m());
                return wxw0.m206041a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C2100a5) n4x0VarM12516M.m153521m()).mo12742c(), zzgus.REMOTE, zzgvz.RAW, null);
            }
        }, ysw0.class, wxw0.class);
        f93193e = dww0.m113961b(new bww0() { // from class: l.dtw0
            @Override // p149l.bww0
            /* JADX INFO: renamed from: a */
            public final rnw0 mo104254a(fyw0 fyw0Var, uow0 uow0Var) throws GeneralSecurityException {
                q6x0 q6x0Var = etw0.f93189a;
                wxw0 wxw0Var = (wxw0) fyw0Var;
                if (!wxw0Var.m206046f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    ig3.m135964a("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                    return null;
                }
                if (wxw0Var.m206043c() != zzgvz.RAW) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got ".concat(String.valueOf(wxw0Var.m206043c())));
                }
                try {
                    C2100a5 c2100a5M12518O = C2100a5.m12518O(((wxw0) fyw0Var).m206044d(), d8x0.m110397a());
                    if (c2100a5M12518O.m12521L() == 0) {
                        return ysw0.m215954a(zsw0.m220081b(c2100a5M12518O.m12522P().m12544P()));
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(c2100a5M12518O)));
                } catch (zzhag e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            }
        }, q6x0VarM166725a, wxw0.class);
    }

    /* JADX INFO: renamed from: a */
    public static void m118131a(dxw0 dxw0Var) throws GeneralSecurityException {
        dxw0Var.m114039j(f93190b);
        dxw0Var.m114038i(f93191c);
        dxw0Var.m114037h(f93192d);
        dxw0Var.m114036g(f93193e);
    }
}
