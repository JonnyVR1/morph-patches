package p149l;

import com.google.android.gms.internal.ads.C2197m4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes6.dex */
public final class qrw0 {

    /* JADX INFO: renamed from: a */
    public static final pxw0 f156054a = pxw0.m171958b(new nxw0() { // from class: l.nrw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return lvw0.m151917b((mrw0) rnw0Var);
        }
    }, mrw0.class, dnw0.class);

    /* JADX INFO: renamed from: b */
    public static final pww0 f156055b = new pww0() { // from class: l.orw0
        @Override // p149l.pww0
        /* JADX INFO: renamed from: a */
        public final rnw0 mo108458a(fow0 fow0Var, Integer num) {
            vrw0 vrw0Var = (vrw0) fow0Var;
            krw0 krw0Var = new krw0(null);
            krw0Var.m147030c(vrw0Var);
            krw0Var.m147028a(null);
            krw0Var.m147029b(r6x0.m178103c(vrw0Var.m199754b()));
            return krw0Var.m147031d();
        }
    };

    /* JADX INFO: renamed from: c */
    public static final rww0 f156056c = new rww0() { // from class: l.prw0
    };

    /* JADX INFO: renamed from: d */
    public static final snw0 f156057d = iww0.m138778c("type.googleapis.com/google.crypto.tink.AesGcmSivKey", dnw0.class, zzgus.SYMMETRIC, C2197m4.m12905Q());

    /* JADX INFO: renamed from: a */
    public static void m176132a(boolean z) throws GeneralSecurityException {
        q6x0 q6x0Var = esw0.f93058a;
        esw0.m117963e(dxw0.m114030d());
        if (m176133b()) {
            axw0.m99526a().m99530e(f156054a);
            zww0 zww0VarM220732b = zww0.m220732b();
            HashMap map = new HashMap();
            srw0 srw0Var = new srw0(null);
            srw0Var.m185706a(16);
            trw0 trw0Var = trw0.f171875b;
            srw0Var.m185707b(trw0Var);
            map.put("AES128_GCM_SIV", srw0Var.m185708c());
            srw0 srw0Var2 = new srw0(null);
            srw0Var2.m185706a(16);
            trw0 trw0Var2 = trw0.f171877d;
            srw0Var2.m185707b(trw0Var2);
            map.put("AES128_GCM_SIV_RAW", srw0Var2.m185708c());
            srw0 srw0Var3 = new srw0(null);
            srw0Var3.m185706a(32);
            srw0Var3.m185707b(trw0Var);
            map.put("AES256_GCM_SIV", srw0Var3.m185708c());
            srw0 srw0Var4 = new srw0(null);
            srw0Var4.m185706a(32);
            srw0Var4.m185707b(trw0Var2);
            map.put("AES256_GCM_SIV_RAW", srw0Var4.m185708c());
            zww0VarM220732b.m220735d(Collections.unmodifiableMap(map));
            sww0.m186387a().m186388b(f156056c, vrw0.class);
            qww0.m176927b().m176929c(f156055b, vrw0.class);
            tow0.m189939e(f156057d, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m176133b() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
