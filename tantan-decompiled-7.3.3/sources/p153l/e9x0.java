package p153l;

import com.google.android.gms.internal.ads.C2252q4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class e9x0 {

    /* JADX INFO: renamed from: a */
    public static final v6x0 f92708a = v6x0.m200155b(new t6x0() { // from class: l.a9x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return new eax0((z8x0) xww0Var);
        }
    }, z8x0.class, s8x0.class);

    /* JADX INFO: renamed from: b */
    public static final v6x0 f92709b = v6x0.m200155b(new t6x0() { // from class: l.b9x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return tfx0.m191003b((z8x0) xww0Var);
        }
    }, z8x0.class, kxw0.class);

    /* JADX INFO: renamed from: c */
    public static final yww0 f92710c = o5x0.m166180c("type.googleapis.com/google.crypto.tink.HmacKey", kxw0.class, zzgus.SYMMETRIC, C2252q4.m13257S());

    /* JADX INFO: renamed from: d */
    public static final x5x0 f92711d = new x5x0() { // from class: l.c9x0
    };

    /* JADX INFO: renamed from: e */
    public static final v5x0 f92712e = new v5x0() { // from class: l.d9x0
        @Override // p153l.v5x0
        /* JADX INFO: renamed from: a */
        public final xww0 mo102265a(lxw0 lxw0Var, Integer num) {
            k9x0 k9x0Var = (k9x0) lxw0Var;
            x8x0 x8x0Var = new x8x0(null);
            x8x0Var.m209758c(k9x0Var);
            x8x0Var.m209757b(xfx0.m210862c(k9x0Var.m148902c()));
            x8x0Var.m209756a(null);
            return x8x0Var.m209759d();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m119958a(boolean z) throws GeneralSecurityException {
        wfx0 wfx0Var = jax0.f119064a;
        jax0.m144168e(j6x0.m143725d());
        g6x0.m129300a().m129304e(f92708a);
        g6x0.m129300a().m129304e(f92709b);
        f6x0 f6x0VarM124326b = f6x0.m124326b();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", bax0.f75742a);
        g9x0 g9x0Var = new g9x0(null);
        g9x0Var.m129676b(32);
        g9x0Var.m129677c(16);
        i9x0 i9x0Var = i9x0.f113527e;
        g9x0Var.m129678d(i9x0Var);
        h9x0 h9x0Var = h9x0.f108439d;
        g9x0Var.m129675a(h9x0Var);
        map.put("HMAC_SHA256_128BITTAG_RAW", g9x0Var.m129679e());
        g9x0 g9x0Var2 = new g9x0(null);
        g9x0Var2.m129676b(32);
        g9x0Var2.m129677c(32);
        i9x0 i9x0Var2 = i9x0.f113524b;
        g9x0Var2.m129678d(i9x0Var2);
        g9x0Var2.m129675a(h9x0Var);
        map.put("HMAC_SHA256_256BITTAG", g9x0Var2.m129679e());
        g9x0 g9x0Var3 = new g9x0(null);
        g9x0Var3.m129676b(32);
        g9x0Var3.m129677c(32);
        g9x0Var3.m129678d(i9x0Var);
        g9x0Var3.m129675a(h9x0Var);
        map.put("HMAC_SHA256_256BITTAG_RAW", g9x0Var3.m129679e());
        g9x0 g9x0Var4 = new g9x0(null);
        g9x0Var4.m129676b(64);
        g9x0Var4.m129677c(16);
        g9x0Var4.m129678d(i9x0Var2);
        h9x0 h9x0Var2 = h9x0.f108441f;
        g9x0Var4.m129675a(h9x0Var2);
        map.put("HMAC_SHA512_128BITTAG", g9x0Var4.m129679e());
        g9x0 g9x0Var5 = new g9x0(null);
        g9x0Var5.m129676b(64);
        g9x0Var5.m129677c(16);
        g9x0Var5.m129678d(i9x0Var);
        g9x0Var5.m129675a(h9x0Var2);
        map.put("HMAC_SHA512_128BITTAG_RAW", g9x0Var5.m129679e());
        g9x0 g9x0Var6 = new g9x0(null);
        g9x0Var6.m129676b(64);
        g9x0Var6.m129677c(32);
        g9x0Var6.m129678d(i9x0Var2);
        g9x0Var6.m129675a(h9x0Var2);
        map.put("HMAC_SHA512_256BITTAG", g9x0Var6.m129679e());
        g9x0 g9x0Var7 = new g9x0(null);
        g9x0Var7.m129676b(64);
        g9x0Var7.m129677c(32);
        g9x0Var7.m129678d(i9x0Var);
        g9x0Var7.m129675a(h9x0Var2);
        map.put("HMAC_SHA512_256BITTAG_RAW", g9x0Var7.m129679e());
        map.put("HMAC_SHA512_512BITTAG", bax0.f75745d);
        g9x0 g9x0Var8 = new g9x0(null);
        g9x0Var8.m129676b(64);
        g9x0Var8.m129677c(64);
        g9x0Var8.m129678d(i9x0Var);
        g9x0Var8.m129675a(h9x0Var2);
        map.put("HMAC_SHA512_512BITTAG_RAW", g9x0Var8.m129679e());
        f6x0VarM124326b.m124329d(Collections.unmodifiableMap(map));
        w5x0.m204996b().m204998c(f92712e, k9x0.class);
        y5x0.m214337a().m214338b(f92711d, k9x0.class);
        f5x0.m124252c().m124257f(f92710c, 2, true);
    }
}
