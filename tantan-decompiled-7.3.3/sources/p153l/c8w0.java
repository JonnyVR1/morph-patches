package p153l;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.C2189i5;
import com.google.android.gms.internal.ads.zzgyl;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class c8w0 {
    @VisibleForTesting
    public c8w0() {
        try {
            eyw0.m123272a();
        } catch (GeneralSecurityException e) {
            d2v0.m113737k("Failed to Configure Aead. ".concat(e.toString()));
            bxy0.m106933q().m120275w(e, "CryptoUtils.registerAead");
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m108383a() {
        C2189i5 c2189i5Zzt = zzgyl.zzt();
        try {
            mww0.m160601b(hxw0.m137661c(axw0.m100855a(f6x0.m124326b().m124327a("AES128_GCM"))), lww0.m156127b(c2189i5Zzt));
        } catch (IOException | GeneralSecurityException e) {
            d2v0.m113737k("Failed to generate key".concat(e.toString()));
            bxy0.m106933q().m120275w(e, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(c2189i5Zzt.m12825m().zzA(), 11);
        c2189i5Zzt.zzc();
        return strEncodeToString;
    }

    /* JADX INFO: renamed from: b */
    public static final String m108384b(byte[] bArr, byte[] bArr2, String str, swu0 swu0Var) {
        hxw0 hxw0VarM108385c = m108385c(str);
        if (hxw0VarM108385c == null) {
            return null;
        }
        try {
            byte[] bArrMo95732a = ((jww0) hxw0VarM108385c.m137668e(k7x0.m148646a(), jww0.class)).mo95732a(bArr, bArr2);
            swu0Var.m188363a().put("ds", "1");
            return new String(bArrMo95732a, "UTF-8");
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
            d2v0.m113737k("Failed to decrypt ".concat(e.toString()));
            bxy0.m106933q().m120275w(e, "CryptoUtils.decrypt");
            swu0Var.m188363a().put("dsf", e.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final hxw0 m108385c(String str) {
        try {
            return mww0.m160600a(kww0.m151743b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            d2v0.m113737k("Failed to get keysethandle".concat(e.toString()));
            bxy0.m106933q().m120275w(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
