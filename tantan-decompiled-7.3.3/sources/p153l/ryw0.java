package p153l;

import com.google.android.gms.internal.ads.C2140c4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ryw0 {

    /* JADX INFO: renamed from: a */
    public static final v6x0 f165471a = v6x0.m200155b(new t6x0() { // from class: l.oyw0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return uex0.m195819b((nyw0) xww0Var);
        }
    }, nyw0.class, jww0.class);

    /* JADX INFO: renamed from: b */
    public static final yww0 f165472b = o5x0.m166180c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", jww0.class, zzgus.SYMMETRIC, C2140c4.m12678R());

    /* JADX INFO: renamed from: c */
    public static final x5x0 f165473c = new x5x0() { // from class: l.pyw0
    };

    /* JADX INFO: renamed from: d */
    public static final v5x0 f165474d = new v5x0() { // from class: l.qyw0
        @Override // p153l.v5x0
        /* JADX INFO: renamed from: a */
        public final xww0 mo102265a(lxw0 lxw0Var, Integer num) throws GeneralSecurityException {
            xyw0 xyw0Var = (xyw0) lxw0Var;
            v6x0 v6x0Var = ryw0.f165471a;
            if (xyw0Var.m213652b() != 16 && xyw0Var.m213652b() != 32) {
                phw0.m172339a("AES key size must be 16 or 32 bytes");
                return null;
            }
            lyw0 lyw0Var = new lyw0(null);
            lyw0Var.m156396d(xyw0Var);
            lyw0Var.m156395c(null);
            lyw0Var.m156393a(xfx0.m210862c(xyw0Var.m213652b()));
            lyw0Var.m156394b(xfx0.m210862c(xyw0Var.m213653c()));
            return lyw0Var.m156397e();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m183653a(boolean z) throws GeneralSecurityException {
        wfx0 wfx0Var = fzw0.f101555a;
        fzw0.m128346e(j6x0.m143725d());
        g6x0.m129300a().m129304e(f165471a);
        f6x0 f6x0VarM124326b = f6x0.m124326b();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", h3x0.f107706e);
        tyw0 tyw0Var = new tyw0(null);
        tyw0Var.m193624a(16);
        tyw0Var.m193626c(32);
        tyw0Var.m193628e(16);
        tyw0Var.m193627d(16);
        uyw0 uyw0Var = uyw0.f181678d;
        tyw0Var.m193625b(uyw0Var);
        vyw0 vyw0Var = vyw0.f186430d;
        tyw0Var.m193629f(vyw0Var);
        map.put("AES128_CTR_HMAC_SHA256_RAW", tyw0Var.m193630g());
        map.put("AES256_CTR_HMAC_SHA256", h3x0.f107707f);
        tyw0 tyw0Var2 = new tyw0(null);
        tyw0Var2.m193624a(32);
        tyw0Var2.m193626c(32);
        tyw0Var2.m193628e(32);
        tyw0Var2.m193627d(16);
        tyw0Var2.m193625b(uyw0Var);
        tyw0Var2.m193629f(vyw0Var);
        map.put("AES256_CTR_HMAC_SHA256_RAW", tyw0Var2.m193630g());
        f6x0VarM124326b.m124329d(Collections.unmodifiableMap(map));
        y5x0.m214337a().m214338b(f165473c, xyw0.class);
        w5x0.m204996b().m204998c(f165474d, xyw0.class);
        f5x0.m124252c().m124257f(f165472b, 2, true);
    }
}
