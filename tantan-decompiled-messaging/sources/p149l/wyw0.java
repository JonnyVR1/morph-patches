package p149l;

import com.google.android.gms.internal.ads.C2300z3;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class wyw0 {

    /* JADX INFO: renamed from: a */
    public static final pww0 f188684a = new pww0() { // from class: l.tyw0
        @Override // p149l.pww0
        /* JADX INFO: renamed from: a */
        public final rnw0 mo108458a(fow0 fow0Var, Integer num) {
            return wyw0.m206233b((bzw0) fow0Var, null);
        }
    };

    /* JADX INFO: renamed from: b */
    public static final pxw0 f188685b = pxw0.m171958b(new nxw0() { // from class: l.uyw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return wyw0.m206234c((syw0) rnw0Var);
        }
    }, syw0.class, mzw0.class);

    /* JADX INFO: renamed from: c */
    public static final pxw0 f188686c = pxw0.m171958b(new nxw0() { // from class: l.vyw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return wyw0.m206232a((syw0) rnw0Var);
        }
    }, syw0.class, eow0.class);

    /* JADX INFO: renamed from: d */
    public static final snw0 f188687d = iww0.m138778c("type.googleapis.com/google.crypto.tink.AesCmacKey", eow0.class, zzgus.SYMMETRIC, C2300z3.m13518R());

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ eow0 m206232a(syw0 syw0Var) throws GeneralSecurityException {
        m206236e(syw0Var.m186729c());
        return n6x0.m158103a(syw0Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ syw0 m206233b(bzw0 bzw0Var, Integer num) throws GeneralSecurityException {
        m206236e(bzw0Var);
        qyw0 qyw0Var = new qyw0(null);
        qyw0Var.m177110c(bzw0Var);
        qyw0Var.m177108a(r6x0.m178103c(bzw0Var.m104698c()));
        qyw0Var.m177109b(null);
        return qyw0Var.m177111d();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ mzw0 m206234c(syw0 syw0Var) throws GeneralSecurityException {
        m206236e(syw0Var.m186729c());
        return new x0x0(syw0Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m206235d(boolean z) throws GeneralSecurityException {
        q6x0 q6x0Var = lzw0.f130684a;
        lzw0.m152401e(dxw0.m114030d());
        qww0.m176927b().m176929c(f188684a, bzw0.class);
        axw0.m99526a().m99530e(f188685b);
        axw0.m99526a().m99530e(f188686c);
        zww0 zww0VarM220732b = zww0.m220732b();
        HashMap map = new HashMap();
        bzw0 bzw0Var = v0x0.f179180e;
        map.put("AES_CMAC", bzw0Var);
        map.put("AES256_CMAC", bzw0Var);
        yyw0 yyw0Var = new yyw0(null);
        yyw0Var.m216584a(32);
        yyw0Var.m216585b(16);
        yyw0Var.m216586c(zyw0.f205755e);
        map.put("AES256_CMAC_RAW", yyw0Var.m216587d());
        zww0VarM220732b.m220735d(Collections.unmodifiableMap(map));
        tow0.m189939e(f188687d, true);
    }

    /* JADX INFO: renamed from: e */
    public static void m206236e(bzw0 bzw0Var) throws GeneralSecurityException {
        if (bzw0Var.m104698c() == 32) {
            return;
        }
        j8w0.m140474a("AesCmacKey size wrong, must be 32 bytes");
    }
}
