package p149l;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.C2166i5;
import com.google.android.gms.internal.ads.zzgyl;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class wyv0 {
    @VisibleForTesting
    public wyv0() {
        try {
            yow0.m215552a();
        } catch (GeneralSecurityException e) {
            xsu0.m210834k("Failed to Configure Aead. ".concat(e.toString()));
            vny0.m199079q().m212290w(e, "CryptoUtils.registerAead");
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m206229a() {
        C2166i5 c2166i5Zzt = zzgyl.zzt();
        try {
            gnw0.m127194b(bow0.m102994c(unw0.m194530a(zww0.m220732b().m220733a("AES128_GCM"))), fnw0.m122385b(c2166i5Zzt));
        } catch (IOException | GeneralSecurityException e) {
            xsu0.m210834k("Failed to generate key".concat(e.toString()));
            vny0.m199079q().m212290w(e, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(c2166i5Zzt.m12771m().zzA(), 11);
        c2166i5Zzt.zzc();
        return strEncodeToString;
    }

    /* JADX INFO: renamed from: b */
    public static final String m206230b(byte[] bArr, byte[] bArr2, String str, mnu0 mnu0Var) {
        bow0 bow0VarM206231c = m206231c(str);
        if (bow0VarM206231c == null) {
            return null;
        }
        try {
            byte[] bArrMo108198a = ((dnw0) bow0VarM206231c.m103001e(eyw0.m118801a(), dnw0.class)).mo108198a(bArr, bArr2);
            mnu0Var.m155566a().put("ds", "1");
            return new String(bArrMo108198a, "UTF-8");
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
            xsu0.m210834k("Failed to decrypt ".concat(e.toString()));
            vny0.m199079q().m212290w(e, "CryptoUtils.decrypt");
            mnu0Var.m155566a().put("dsf", e.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final bow0 m206231c(String str) {
        try {
            return gnw0.m127193a(enw0.m117297b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            xsu0.m210834k("Failed to get keysethandle".concat(e.toString()));
            vny0.m199079q().m212290w(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
