package p149l;

import com.google.android.gms.internal.ads.C2181k4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class drw0 {

    /* JADX INFO: renamed from: a */
    public static final pxw0 f87697a = pxw0.m171958b(new nxw0() { // from class: l.arw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return l5x0.m148680b((uqw0) rnw0Var);
        }
    }, uqw0.class, dnw0.class);

    /* JADX INFO: renamed from: b */
    public static final snw0 f87698b = iww0.m138778c("type.googleapis.com/google.crypto.tink.AesGcmKey", dnw0.class, zzgus.SYMMETRIC, C2181k4.m12823Q());

    /* JADX INFO: renamed from: c */
    public static final rww0 f87699c = new rww0() { // from class: l.brw0
    };

    /* JADX INFO: renamed from: d */
    public static final pww0 f87700d = new pww0() { // from class: l.crw0
        @Override // p149l.pww0
        /* JADX INFO: renamed from: a */
        public final rnw0 mo108458a(fow0 fow0Var, Integer num) throws GeneralSecurityException {
            irw0 irw0Var = (irw0) fow0Var;
            pxw0 pxw0Var = drw0.f87697a;
            if (irw0Var.m137919b() == 24) {
                j8w0.m140474a("192 bit AES GCM Parameters are not valid");
                return null;
            }
            sqw0 sqw0Var = new sqw0(null);
            sqw0Var.m185614c(irw0Var);
            sqw0Var.m185612a(null);
            sqw0Var.m185613b(r6x0.m178103c(irw0Var.m137919b()));
            return sqw0Var.m185615d();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m113365a(boolean z) throws GeneralSecurityException {
        q6x0 q6x0Var = uuw0.f178464a;
        uuw0.m196043e(dxw0.m114030d());
        axw0.m99526a().m99530e(f87697a);
        zww0 zww0VarM220732b = zww0.m220732b();
        HashMap map = new HashMap();
        map.put("AES128_GCM", buw0.f77374a);
        frw0 frw0Var = new frw0(null);
        frw0Var.m122901a(12);
        frw0Var.m122902b(16);
        frw0Var.m122903c(16);
        grw0 grw0Var = grw0.f104123d;
        frw0Var.m122904d(grw0Var);
        map.put("AES128_GCM_RAW", frw0Var.m122905e());
        map.put("AES256_GCM", buw0.f77375b);
        frw0 frw0Var2 = new frw0(null);
        frw0Var2.m122901a(12);
        frw0Var2.m122902b(32);
        frw0Var2.m122903c(16);
        frw0Var2.m122904d(grw0Var);
        map.put("AES256_GCM_RAW", frw0Var2.m122905e());
        zww0VarM220732b.m220735d(Collections.unmodifiableMap(map));
        sww0.m186387a().m186388b(f87699c, irw0.class);
        qww0.m176927b().m176929c(f87700d, irw0.class);
        zvw0.m220487c().m220492f(f87698b, 2, true);
    }
}
