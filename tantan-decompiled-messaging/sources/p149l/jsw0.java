package p149l;

import com.google.android.gms.internal.ads.C2213o4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class jsw0 {

    /* JADX INFO: renamed from: a */
    public static final pxw0 f119547a = pxw0.m171958b(new nxw0() { // from class: l.hsw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return n5x0.m158020b((gsw0) rnw0Var);
        }
    }, gsw0.class, dnw0.class);

    /* JADX INFO: renamed from: b */
    public static final pww0 f119548b = new pww0() { // from class: l.isw0
        @Override // p149l.pww0
        /* JADX INFO: renamed from: a */
        public final rnw0 mo108458a(fow0 fow0Var, Integer num) {
            pxw0 pxw0Var = jsw0.f119547a;
            return gsw0.m127853a(((lsw0) fow0Var).m151650b(), r6x0.m178103c(32), null);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final snw0 f119549c = iww0.m138778c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", dnw0.class, zzgus.SYMMETRIC, C2213o4.m13090Q());

    /* JADX INFO: renamed from: a */
    public static void m143062a(boolean z) throws GeneralSecurityException {
        q6x0 q6x0Var = qsw0.f156279a;
        qsw0.m176374e(dxw0.m114030d());
        axw0.m99526a().m99530e(f119547a);
        qww0.m176927b().m176929c(f119548b, lsw0.class);
        zww0 zww0VarM220732b = zww0.m220732b();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", lsw0.m151649c(ksw0.f124511b));
        map.put("CHACHA20_POLY1305_RAW", lsw0.m151649c(ksw0.f124513d));
        zww0VarM220732b.m220735d(Collections.unmodifiableMap(map));
        tow0.m189939e(f119549c, true);
    }
}
