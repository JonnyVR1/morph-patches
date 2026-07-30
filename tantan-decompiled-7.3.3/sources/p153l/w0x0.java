package p153l;

import com.google.android.gms.internal.ads.C2220m4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes6.dex */
public final class w0x0 {

    /* JADX INFO: renamed from: a */
    public static final v6x0 f186735a = v6x0.m200155b(new t6x0() { // from class: l.t0x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return r4x0.m179828b((s0x0) xww0Var);
        }
    }, s0x0.class, jww0.class);

    /* JADX INFO: renamed from: b */
    public static final v5x0 f186736b = new v5x0() { // from class: l.u0x0
        @Override // p153l.v5x0
        /* JADX INFO: renamed from: a */
        public final xww0 mo102265a(lxw0 lxw0Var, Integer num) {
            b1x0 b1x0Var = (b1x0) lxw0Var;
            q0x0 q0x0Var = new q0x0(null);
            q0x0Var.m174795c(b1x0Var);
            q0x0Var.m174793a(null);
            q0x0Var.m174794b(xfx0.m210862c(b1x0Var.m101511b()));
            return q0x0Var.m174796d();
        }
    };

    /* JADX INFO: renamed from: c */
    public static final x5x0 f186737c = new x5x0() { // from class: l.v0x0
    };

    /* JADX INFO: renamed from: d */
    public static final yww0 f186738d = o5x0.m166180c("type.googleapis.com/google.crypto.tink.AesGcmSivKey", jww0.class, zzgus.SYMMETRIC, C2220m4.m12959Q());

    /* JADX INFO: renamed from: a */
    public static void m204355a(boolean z) throws GeneralSecurityException {
        wfx0 wfx0Var = k1x0.f123554a;
        k1x0.m147932e(j6x0.m143725d());
        if (m204356b()) {
            g6x0.m129300a().m129304e(f186735a);
            f6x0 f6x0VarM124326b = f6x0.m124326b();
            HashMap map = new HashMap();
            y0x0 y0x0Var = new y0x0(null);
            y0x0Var.m213907a(16);
            z0x0 z0x0Var = z0x0.f202435b;
            y0x0Var.m213908b(z0x0Var);
            map.put("AES128_GCM_SIV", y0x0Var.m213909c());
            y0x0 y0x0Var2 = new y0x0(null);
            y0x0Var2.m213907a(16);
            z0x0 z0x0Var2 = z0x0.f202437d;
            y0x0Var2.m213908b(z0x0Var2);
            map.put("AES128_GCM_SIV_RAW", y0x0Var2.m213909c());
            y0x0 y0x0Var3 = new y0x0(null);
            y0x0Var3.m213907a(32);
            y0x0Var3.m213908b(z0x0Var);
            map.put("AES256_GCM_SIV", y0x0Var3.m213909c());
            y0x0 y0x0Var4 = new y0x0(null);
            y0x0Var4.m213907a(32);
            y0x0Var4.m213908b(z0x0Var2);
            map.put("AES256_GCM_SIV_RAW", y0x0Var4.m213909c());
            f6x0VarM124326b.m124329d(Collections.unmodifiableMap(map));
            y5x0.m214337a().m214338b(f186737c, b1x0.class);
            w5x0.m204996b().m204998c(f186736b, b1x0.class);
            zxw0.m222092e(f186738d, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m204356b() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
