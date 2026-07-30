package p153l;

import com.google.android.gms.internal.ads.C2236o4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class p1x0 {

    /* JADX INFO: renamed from: a */
    public static final v6x0 f150223a = v6x0.m200155b(new t6x0() { // from class: l.n1x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return tex0.m190903b((m1x0) xww0Var);
        }
    }, m1x0.class, jww0.class);

    /* JADX INFO: renamed from: b */
    public static final v5x0 f150224b = new v5x0() { // from class: l.o1x0
        @Override // p153l.v5x0
        /* JADX INFO: renamed from: a */
        public final xww0 mo102265a(lxw0 lxw0Var, Integer num) {
            v6x0 v6x0Var = p1x0.f150223a;
            return m1x0.m156723a(((r1x0) lxw0Var).m179457b(), xfx0.m210862c(32), null);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final yww0 f150225c = o5x0.m166180c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", jww0.class, zzgus.SYMMETRIC, C2236o4.m13144Q());

    /* JADX INFO: renamed from: a */
    public static void m170319a(boolean z) throws GeneralSecurityException {
        wfx0 wfx0Var = w1x0.f186846a;
        w1x0.m204482e(j6x0.m143725d());
        g6x0.m129300a().m129304e(f150223a);
        w5x0.m204996b().m204998c(f150224b, r1x0.class);
        f6x0 f6x0VarM124326b = f6x0.m124326b();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", r1x0.m179456c(q1x0.f155227b));
        map.put("CHACHA20_POLY1305_RAW", r1x0.m179456c(q1x0.f155229d));
        f6x0VarM124326b.m124329d(Collections.unmodifiableMap(map));
        zxw0.m222092e(f150225c, true);
    }
}
