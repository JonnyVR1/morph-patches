package p149l;

import com.google.android.gms.internal.ads.C2118c5;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class xsw0 {

    /* JADX INFO: renamed from: a */
    public static final snw0 f194319a = iww0.m138778c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", dnw0.class, zzgus.SYMMETRIC, C2118c5.m12633Q());

    /* JADX INFO: renamed from: b */
    public static final pww0 f194320b = new pww0() { // from class: l.vsw0
        @Override // p149l.pww0
        /* JADX INFO: renamed from: a */
        public final rnw0 mo108458a(fow0 fow0Var, Integer num) {
            return ktw0.m147221a((ptw0) fow0Var);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final pxw0 f194321c = pxw0.m171958b(new nxw0() { // from class: l.wsw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) throws GeneralSecurityException {
            ktw0 ktw0Var = (ktw0) rnw0Var;
            snw0 snw0Var = xsw0.f194319a;
            try {
                return new usw0(C2261u4.m13346O(wow0.m204876b(ktw0Var.m147222b().m171386b()), d8x0.m110397a()), dow0.m112830a(ktw0Var.m147222b().m171387c()).zzb());
            } catch (zzhag e) {
                throw new GeneralSecurityException("Parsing of DEK key template failed: ", e);
            }
        }
    }, ktw0.class, dnw0.class);

    /* JADX INFO: renamed from: a */
    public static void m210840a(boolean z) throws GeneralSecurityException {
        q6x0 q6x0Var = utw0.f178300a;
        utw0.m195315e(dxw0.m114030d());
        qww0.m176927b().m176929c(f194320b, ptw0.class);
        axw0.m99526a().m99530e(f194321c);
        tow0.m189939e(f194319a, true);
    }
}
