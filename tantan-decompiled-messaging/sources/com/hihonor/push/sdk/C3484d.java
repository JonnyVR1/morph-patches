package com.hihonor.push.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.hihonor.push.sdk.d */
/* JADX INFO: loaded from: classes7.dex */
public class C3484d {

    /* JADX INFO: renamed from: a */
    public static volatile C3498h1 f11850a;

    /* JADX INFO: renamed from: b */
    public static final C3484d f11851b = new C3484d();

    /* JADX INFO: renamed from: a */
    public synchronized void m17507a(Context context, String str) {
        byte[] bArr;
        byte[] bArr2;
        try {
            m17506a(context);
            if (TextUtils.isEmpty(str)) {
                f11850a.m17515a("key_push_token");
            } else {
                String strM17491a = C3477b.m17491a(context, context.getPackageName());
                byte[] bArrM17495a = C3477b.m17495a("EA23F5B8C7577CDC744ABD1C6D7E143D5123F8F282BF4E7853C1EC86BD2EDD22");
                byte[] bArrM17495a2 = C3477b.m17495a(strM17491a);
                try {
                    bArr = new byte[32];
                    new SecureRandom().nextBytes(bArr);
                } catch (Exception unused) {
                    bArr = new byte[0];
                }
                String strEncodeToString = Base64.encodeToString(C3477b.m17497a(C3477b.m17496a(C3477b.m17497a(C3477b.m17496a(bArrM17495a, -4), bArrM17495a2), 6), bArr), 0);
                boolean zM17516a = f11850a.m17516a("key_aes_gcm", strEncodeToString);
                byte[] bArrDecode = Base64.decode(strEncodeToString, 0);
                String str2 = "";
                if (!TextUtils.isEmpty(str) && bArrDecode != null && bArrDecode.length >= 16) {
                    try {
                        try {
                            bArr2 = new byte[12];
                            new SecureRandom().nextBytes(bArr2);
                        } catch (Exception unused2) {
                            bArr2 = new byte[0];
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecode, "AES");
                        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                        cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr2));
                        byte[] bArrDoFinal = cipher.doFinal(bytes);
                        if (bArrDoFinal != null && bArrDoFinal.length != 0) {
                            str2 = C3477b.m17492a(bArr2) + C3477b.m17492a(bArrDoFinal);
                        }
                    } catch (GeneralSecurityException e) {
                        e.getMessage();
                    }
                }
                if (zM17516a && !TextUtils.isEmpty(str2)) {
                    f11850a.m17516a("key_push_token", str2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m17508b(Context context) {
        String str;
        try {
            m17506a(context);
            str = "";
            SharedPreferences sharedPreferences = f11850a.f11881a;
            if (sharedPreferences != null && sharedPreferences.contains("key_push_token")) {
                SharedPreferences sharedPreferences2 = f11850a.f11881a;
                if (sharedPreferences2 == null || !sharedPreferences2.contains("key_aes_gcm")) {
                    f11850a.m17515a("key_push_token");
                } else {
                    SharedPreferences sharedPreferences3 = f11850a.f11881a;
                    String string = sharedPreferences3 != null ? sharedPreferences3.getString("key_push_token", "") : "";
                    SharedPreferences sharedPreferences4 = f11850a.f11881a;
                    byte[] bArrDecode = Base64.decode(sharedPreferences4 != null ? sharedPreferences4.getString("key_aes_gcm", "") : "", 0);
                    String str2 = "";
                    if (!TextUtils.isEmpty(string) && bArrDecode != null && bArrDecode.length >= 16) {
                        try {
                            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecode, "AES");
                            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                            String strSubstring = string.substring(0, 24);
                            String strSubstring2 = string.substring(24);
                            if (!TextUtils.isEmpty(strSubstring) && !TextUtils.isEmpty(strSubstring2)) {
                                cipher.init(2, secretKeySpec, new GCMParameterSpec(128, C3477b.m17495a(strSubstring)));
                                str2 = new String(cipher.doFinal(C3477b.m17495a(strSubstring2)), StandardCharsets.UTF_8);
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        }
                    }
                    if (TextUtils.isEmpty(str2)) {
                        f11850a.m17515a("key_aes_gcm");
                        f11850a.m17515a("key_push_token");
                    } else {
                        str = str2;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final void m17506a(Context context) {
        if (f11850a == null) {
            f11850a = new C3498h1(context, "push");
        }
    }
}
