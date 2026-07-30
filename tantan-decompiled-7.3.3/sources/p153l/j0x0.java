package p153l;

import com.google.android.gms.internal.ads.C2204k4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class j0x0 {

    /* JADX INFO: renamed from: a */
    public static final v6x0 f117895a = v6x0.m200155b(new t6x0() { // from class: l.g0x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return rex0.m181159b((a0x0) xww0Var);
        }
    }, a0x0.class, jww0.class);

    /* JADX INFO: renamed from: b */
    public static final yww0 f117896b = o5x0.m166180c("type.googleapis.com/google.crypto.tink.AesGcmKey", jww0.class, zzgus.SYMMETRIC, C2204k4.m12877Q());

    /* JADX INFO: renamed from: c */
    public static final x5x0 f117897c = new x5x0() { // from class: l.h0x0
    };

    /* JADX INFO: renamed from: d */
    public static final v5x0 f117898d = new v5x0() { // from class: l.i0x0
        @Override // p153l.v5x0
        /* JADX INFO: renamed from: a */
        public final xww0 mo102265a(lxw0 lxw0Var, Integer num) throws GeneralSecurityException {
            o0x0 o0x0Var = (o0x0) lxw0Var;
            v6x0 v6x0Var = j0x0.f117895a;
            if (o0x0Var.m165553b() == 24) {
                phw0.m172339a("192 bit AES GCM Parameters are not valid");
                return null;
            }
            yzw0 yzw0Var = new yzw0(null);
            yzw0Var.m218089c(o0x0Var);
            yzw0Var.m218087a(null);
            yzw0Var.m218088b(xfx0.m210862c(o0x0Var.m165553b()));
            return yzw0Var.m218090d();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m143062a(boolean z) throws GeneralSecurityException {
        wfx0 wfx0Var = a4x0.f68458a;
        a4x0.m96003e(j6x0.m143725d());
        g6x0.m129300a().m129304e(f117895a);
        f6x0 f6x0VarM124326b = f6x0.m124326b();
        HashMap map = new HashMap();
        map.put("AES128_GCM", h3x0.f107702a);
        l0x0 l0x0Var = new l0x0(null);
        l0x0Var.m152401a(12);
        l0x0Var.m152402b(16);
        l0x0Var.m152403c(16);
        m0x0 m0x0Var = m0x0.f134369d;
        l0x0Var.m152404d(m0x0Var);
        map.put("AES128_GCM_RAW", l0x0Var.m152405e());
        map.put("AES256_GCM", h3x0.f107703b);
        l0x0 l0x0Var2 = new l0x0(null);
        l0x0Var2.m152401a(12);
        l0x0Var2.m152402b(32);
        l0x0Var2.m152403c(16);
        l0x0Var2.m152404d(m0x0Var);
        map.put("AES256_GCM_RAW", l0x0Var2.m152405e());
        f6x0VarM124326b.m124329d(Collections.unmodifiableMap(map));
        y5x0.m214337a().m214338b(f117897c, o0x0.class);
        w5x0.m204996b().m204998c(f117898d, o0x0.class);
        f5x0.m124252c().m124257f(f117896b, 2, true);
    }
}
