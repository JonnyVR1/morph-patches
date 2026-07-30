package p149l;

import com.google.android.gms.internal.ads.C2157h4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class gqw0 {

    /* JADX INFO: renamed from: a */
    public static final pxw0 f103996a = pxw0.m171958b(new nxw0() { // from class: l.eqw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return k5x0.m144556b((dqw0) rnw0Var);
        }
    }, dqw0.class, dnw0.class);

    /* JADX INFO: renamed from: b */
    public static final snw0 f103997b = iww0.m138778c("type.googleapis.com/google.crypto.tink.AesEaxKey", dnw0.class, zzgus.SYMMETRIC, C2157h4.m12734R());

    /* JADX INFO: renamed from: c */
    public static final pww0 f103998c = new pww0() { // from class: l.fqw0
        @Override // p149l.pww0
        /* JADX INFO: renamed from: a */
        public final rnw0 mo108458a(fow0 fow0Var, Integer num) throws GeneralSecurityException {
            lqw0 lqw0Var = (lqw0) fow0Var;
            pxw0 pxw0Var = gqw0.f103996a;
            if (lqw0Var.m151106c() == 24) {
                j8w0.m140474a("192 bit AES GCM Parameters are not valid");
                return null;
            }
            bqw0 bqw0Var = new bqw0(null);
            bqw0Var.m103426c(lqw0Var);
            bqw0Var.m103424a(null);
            bqw0Var.m103425b(r6x0.m178103c(lqw0Var.m151106c()));
            return bqw0Var.m103427d();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m127631a(boolean z) throws GeneralSecurityException {
        q6x0 q6x0Var = qqw0.f155941a;
        qqw0.m175976e(dxw0.m114030d());
        axw0.m99526a().m99530e(f103996a);
        zww0 zww0VarM220732b = zww0.m220732b();
        HashMap map = new HashMap();
        map.put("AES128_EAX", buw0.f77376c);
        iqw0 iqw0Var = new iqw0(null);
        iqw0Var.m137805a(16);
        iqw0Var.m137806b(16);
        iqw0Var.m137807c(16);
        jqw0 jqw0Var = jqw0.f119331d;
        iqw0Var.m137808d(jqw0Var);
        map.put("AES128_EAX_RAW", iqw0Var.m137809e());
        map.put("AES256_EAX", buw0.f77377d);
        iqw0 iqw0Var2 = new iqw0(null);
        iqw0Var2.m137805a(16);
        iqw0Var2.m137806b(32);
        iqw0Var2.m137807c(16);
        iqw0Var2.m137808d(jqw0Var);
        map.put("AES256_EAX_RAW", iqw0Var2.m137809e());
        zww0VarM220732b.m220735d(Collections.unmodifiableMap(map));
        qww0.m176927b().m176929c(f103998c, lqw0.class);
        tow0.m189939e(f103997b, true);
    }
}
