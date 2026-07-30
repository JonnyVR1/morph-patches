package p153l;

import com.google.android.gms.internal.ads.C2165f5;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class m3x0 {

    /* JADX INFO: renamed from: a */
    public static final v6x0 f134714a = v6x0.m200155b(new t6x0() { // from class: l.j3x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return vfx0.m201196b((i3x0) xww0Var);
        }
    }, i3x0.class, jww0.class);

    /* JADX INFO: renamed from: b */
    public static final yww0 f134715b = o5x0.m166180c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", jww0.class, zzgus.SYMMETRIC, C2165f5.m12758Q());

    /* JADX INFO: renamed from: c */
    public static final x5x0 f134716c = new x5x0() { // from class: l.k3x0
    };

    /* JADX INFO: renamed from: d */
    public static final v5x0 f134717d = new v5x0() { // from class: l.l3x0
        @Override // p153l.v5x0
        /* JADX INFO: renamed from: a */
        public final xww0 mo102265a(lxw0 lxw0Var, Integer num) {
            v6x0 v6x0Var = m3x0.f134714a;
            return i3x0.m138347a(((o3x0) lxw0Var).m165893b(), xfx0.m210862c(32), null);
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m156948a(boolean z) throws GeneralSecurityException {
        wfx0 wfx0Var = p4x0.f150572a;
        p4x0.m170585e(j6x0.m143725d());
        g6x0.m129300a().m129304e(f134714a);
        f6x0 f6x0VarM124326b = f6x0.m124326b();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", o3x0.m165892c(n3x0.f140042b));
        map.put("XCHACHA20_POLY1305_RAW", o3x0.m165892c(n3x0.f140044d));
        f6x0VarM124326b.m124329d(Collections.unmodifiableMap(map));
        w5x0.m204996b().m204998c(f134717d, o3x0.class);
        y5x0.m214337a().m214338b(f134716c, o3x0.class);
        zxw0.m222092e(f134715b, true);
    }
}
