package p153l;

import com.google.android.gms.internal.ads.C2180h4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class mzw0 {

    /* JADX INFO: renamed from: a */
    public static final v6x0 f139570a = v6x0.m200155b(new t6x0() { // from class: l.kzw0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return qex0.m176277b((jzw0) xww0Var);
        }
    }, jzw0.class, jww0.class);

    /* JADX INFO: renamed from: b */
    public static final yww0 f139571b = o5x0.m166180c("type.googleapis.com/google.crypto.tink.AesEaxKey", jww0.class, zzgus.SYMMETRIC, C2180h4.m12788R());

    /* JADX INFO: renamed from: c */
    public static final v5x0 f139572c = new v5x0() { // from class: l.lzw0
        @Override // p153l.v5x0
        /* JADX INFO: renamed from: a */
        public final xww0 mo102265a(lxw0 lxw0Var, Integer num) throws GeneralSecurityException {
            rzw0 rzw0Var = (rzw0) lxw0Var;
            v6x0 v6x0Var = mzw0.f139570a;
            if (rzw0Var.m183863c() == 24) {
                phw0.m172339a("192 bit AES GCM Parameters are not valid");
                return null;
            }
            hzw0 hzw0Var = new hzw0(null);
            hzw0Var.m137943c(rzw0Var);
            hzw0Var.m137941a(null);
            hzw0Var.m137942b(xfx0.m210862c(rzw0Var.m183863c()));
            return hzw0Var.m137944d();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m160929a(boolean z) throws GeneralSecurityException {
        wfx0 wfx0Var = wzw0.f191834a;
        wzw0.m208777e(j6x0.m143725d());
        g6x0.m129300a().m129304e(f139570a);
        f6x0 f6x0VarM124326b = f6x0.m124326b();
        HashMap map = new HashMap();
        map.put("AES128_EAX", h3x0.f107704c);
        ozw0 ozw0Var = new ozw0(null);
        ozw0Var.m170001a(16);
        ozw0Var.m170002b(16);
        ozw0Var.m170003c(16);
        pzw0 pzw0Var = pzw0.f154986d;
        ozw0Var.m170004d(pzw0Var);
        map.put("AES128_EAX_RAW", ozw0Var.m170005e());
        map.put("AES256_EAX", h3x0.f107705d);
        ozw0 ozw0Var2 = new ozw0(null);
        ozw0Var2.m170001a(16);
        ozw0Var2.m170002b(32);
        ozw0Var2.m170003c(16);
        ozw0Var2.m170004d(pzw0Var);
        map.put("AES256_EAX_RAW", ozw0Var2.m170005e());
        f6x0VarM124326b.m124329d(Collections.unmodifiableMap(map));
        w5x0.m204996b().m204998c(f139572c, rzw0.class);
        zxw0.m222092e(f139571b, true);
    }
}
