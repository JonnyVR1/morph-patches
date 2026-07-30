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
public class C3643d {

    /* JADX INFO: renamed from: a */
    public static volatile C3657h1 f12591a;

    /* JADX INFO: renamed from: b */
    public static final C3643d f12592b = new C3643d();

    /* JADX INFO: renamed from: a */
    public synchronized void m18584a(Context context, String str) {
        byte[] bArr;
        byte[] bArr2;
        try {
            m18583a(context);
            if (TextUtils.isEmpty(str)) {
                f12591a.m18592a("key_push_token");
            } else {
                String strM18568a = C3636b.m18568a(context, context.getPackageName());
                byte[] bArrM18572a = C3636b.m18572a("EA23F5B8C7577CDC744ABD1C6D7E143D5123F8F282BF4E7853C1EC86BD2EDD22");
                byte[] bArrM18572a2 = C3636b.m18572a(strM18568a);
                try {
                    bArr = new byte[32];
                    new SecureRandom().nextBytes(bArr);
                } catch (Exception unused) {
                    bArr = new byte[0];
                }
                String strEncodeToString = Base64.encodeToString(C3636b.m18574a(C3636b.m18573a(C3636b.m18574a(C3636b.m18573a(bArrM18572a, -4), bArrM18572a2), 6), bArr), 0);
                boolean zM18593a = f12591a.m18593a("key_aes_gcm", strEncodeToString);
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
                            str2 = C3636b.m18569a(bArr2) + C3636b.m18569a(bArrDoFinal);
                        }
                    } catch (GeneralSecurityException e) {
                        e.getMessage();
                    }
                }
                if (zM18593a && !TextUtils.isEmpty(str2)) {
                    f12591a.m18593a("key_push_token", str2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m18585b(Context context) {
        String str;
        try {
            m18583a(context);
            str = "";
            SharedPreferences sharedPreferences = f12591a.f12622a;
            if (sharedPreferences != null && sharedPreferences.contains("key_push_token")) {
                SharedPreferences sharedPreferences2 = f12591a.f12622a;
                if (sharedPreferences2 == null || !sharedPreferences2.contains("key_aes_gcm")) {
                    f12591a.m18592a("key_push_token");
                } else {
                    SharedPreferences sharedPreferences3 = f12591a.f12622a;
                    String string = sharedPreferences3 != null ? sharedPreferences3.getString("key_push_token", "") : "";
                    SharedPreferences sharedPreferences4 = f12591a.f12622a;
                    byte[] bArrDecode = Base64.decode(sharedPreferences4 != null ? sharedPreferences4.getString("key_aes_gcm", "") : "", 0);
                    String str2 = "";
                    if (!TextUtils.isEmpty(string) && bArrDecode != null && bArrDecode.length >= 16) {
                        try {
                            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecode, "AES");
                            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                            String strSubstring = string.substring(0, 24);
                            String strSubstring2 = string.substring(24);
                            if (!TextUtils.isEmpty(strSubstring) && !TextUtils.isEmpty(strSubstring2)) {
                                cipher.init(2, secretKeySpec, new GCMParameterSpec(128, C3636b.m18572a(strSubstring)));
                                str2 = new String(cipher.doFinal(C3636b.m18572a(strSubstring2)), StandardCharsets.UTF_8);
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        }
                    }
                    if (TextUtils.isEmpty(str2)) {
                        f12591a.m18592a("key_aes_gcm");
                        f12591a.m18592a("key_push_token");
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
    public final void m18583a(Context context) {
        if (f12591a == null) {
            f12591a = new C3657h1(context, "push");
        }
    }
}
