package p149l;

import com.google.android.gms.internal.ads.C2117c4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class lpw0 {

    /* JADX INFO: renamed from: a */
    public static final pxw0 f129255a = pxw0.m171958b(new nxw0() { // from class: l.ipw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return o5x0.m162816b((hpw0) rnw0Var);
        }
    }, hpw0.class, dnw0.class);

    /* JADX INFO: renamed from: b */
    public static final snw0 f129256b = iww0.m138778c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", dnw0.class, zzgus.SYMMETRIC, C2117c4.m12624R());

    /* JADX INFO: renamed from: c */
    public static final rww0 f129257c = new rww0() { // from class: l.jpw0
    };

    /* JADX INFO: renamed from: d */
    public static final pww0 f129258d = new pww0() { // from class: l.kpw0
        @Override // p149l.pww0
        /* JADX INFO: renamed from: a */
        public final rnw0 mo108458a(fow0 fow0Var, Integer num) throws GeneralSecurityException {
            rpw0 rpw0Var = (rpw0) fow0Var;
            pxw0 pxw0Var = lpw0.f129255a;
            if (rpw0Var.m180402b() != 16 && rpw0Var.m180402b() != 32) {
                j8w0.m140474a("AES key size must be 16 or 32 bytes");
                return null;
            }
            fpw0 fpw0Var = new fpw0(null);
            fpw0Var.m122679d(rpw0Var);
            fpw0Var.m122678c(null);
            fpw0Var.m122676a(r6x0.m178103c(rpw0Var.m180402b()));
            fpw0Var.m122677b(r6x0.m178103c(rpw0Var.m180403c()));
            return fpw0Var.m122680e();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m150903a(boolean z) throws GeneralSecurityException {
        q6x0 q6x0Var = zpw0.f204316a;
        zpw0.m219805e(dxw0.m114030d());
        axw0.m99526a().m99530e(f129255a);
        zww0 zww0VarM220732b = zww0.m220732b();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", buw0.f77378e);
        npw0 npw0Var = new npw0(null);
        npw0Var.m160543a(16);
        npw0Var.m160545c(32);
        npw0Var.m160547e(16);
        npw0Var.m160546d(16);
        opw0 opw0Var = opw0.f145055d;
        npw0Var.m160544b(opw0Var);
        ppw0 ppw0Var = ppw0.f150728d;
        npw0Var.m160548f(ppw0Var);
        map.put("AES128_CTR_HMAC_SHA256_RAW", npw0Var.m160549g());
        map.put("AES256_CTR_HMAC_SHA256", buw0.f77379f);
        npw0 npw0Var2 = new npw0(null);
        npw0Var2.m160543a(32);
        npw0Var2.m160545c(32);
        npw0Var2.m160547e(32);
        npw0Var2.m160546d(16);
        npw0Var2.m160544b(opw0Var);
        npw0Var2.m160548f(ppw0Var);
        map.put("AES256_CTR_HMAC_SHA256_RAW", npw0Var2.m160549g());
        zww0VarM220732b.m220735d(Collections.unmodifiableMap(map));
        sww0.m186387a().m186388b(f129257c, rpw0.class);
        qww0.m176927b().m176929c(f129258d, rpw0.class);
        zvw0.m220487c().m220492f(f129256b, 2, true);
    }
}
