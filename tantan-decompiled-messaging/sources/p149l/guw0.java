package p149l;

import com.google.android.gms.internal.ads.C2142f5;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class guw0 {

    /* JADX INFO: renamed from: a */
    public static final pxw0 f104476a = pxw0.m171958b(new nxw0() { // from class: l.duw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return p6x0.m167699b((cuw0) rnw0Var);
        }
    }, cuw0.class, dnw0.class);

    /* JADX INFO: renamed from: b */
    public static final snw0 f104477b = iww0.m138778c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", dnw0.class, zzgus.SYMMETRIC, C2142f5.m12704Q());

    /* JADX INFO: renamed from: c */
    public static final rww0 f104478c = new rww0() { // from class: l.euw0
    };

    /* JADX INFO: renamed from: d */
    public static final pww0 f104479d = new pww0() { // from class: l.fuw0
        @Override // p149l.pww0
        /* JADX INFO: renamed from: a */
        public final rnw0 mo108458a(fow0 fow0Var, Integer num) {
            pxw0 pxw0Var = guw0.f104476a;
            return cuw0.m108814a(((iuw0) fow0Var).m138499b(), r6x0.m178103c(32), null);
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m128081a(boolean z) throws GeneralSecurityException {
        q6x0 q6x0Var = jvw0.f119995a;
        jvw0.m143580e(dxw0.m114030d());
        axw0.m99526a().m99530e(f104476a);
        zww0 zww0VarM220732b = zww0.m220732b();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", iuw0.m138498c(huw0.f109593b));
        map.put("XCHACHA20_POLY1305_RAW", iuw0.m138498c(huw0.f109595d));
        zww0VarM220732b.m220735d(Collections.unmodifiableMap(map));
        qww0.m176927b().m176929c(f104479d, iuw0.class);
        sww0.m186387a().m186388b(f104478c, iuw0.class);
        tow0.m189939e(f104477b, true);
    }
}
