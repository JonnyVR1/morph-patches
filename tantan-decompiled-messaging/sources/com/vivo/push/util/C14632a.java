package com.vivo.push.util;

import android.content.Context;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.vivo.push.util.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14632a {

    /* JADX INFO: renamed from: c */
    private static volatile C14632a f61096c;

    /* JADX INFO: renamed from: a */
    private byte[] f61097a;

    /* JADX INFO: renamed from: b */
    private byte[] f61098b;

    private C14632a(Context context) {
        C14654w.m85045b().m85047a(ContextDelegate.getContext(context));
        C14654w c14654wM85045b = C14654w.m85045b();
        this.f61097a = c14654wM85045b.m85048c();
        this.f61098b = c14654wM85045b.m85049d();
    }

    /* JADX INFO: renamed from: a */
    public final String m84955a(String str) throws Exception {
        String strM84976a = C14637f.m84976a(m84953a());
        String strM84976a2 = C14637f.m84976a(m84954b());
        byte[] bytes = str.getBytes("utf-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(strM84976a2.getBytes("utf-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(strM84976a.getBytes("utf-8")));
        return Base64.encodeToString(cipher.doFinal(bytes), 2);
    }

    /* JADX INFO: renamed from: b */
    public final String m84956b(String str) throws Exception {
        return new String(C14637f.m84977a(C14637f.m84976a(m84953a()), C14637f.m84976a(m84954b()), Base64.decode(str, 2)), "utf-8");
    }

    /* JADX INFO: renamed from: b */
    private byte[] m84954b() {
        byte[] bArr = this.f61098b;
        return (bArr == null || bArr.length <= 0) ? C14654w.m85045b().m85049d() : bArr;
    }

    /* JADX INFO: renamed from: a */
    public static C14632a m84952a(Context context) {
        if (f61096c == null) {
            synchronized (C14632a.class) {
                try {
                    if (f61096c == null) {
                        f61096c = new C14632a(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f61096c;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m84953a() {
        byte[] bArr = this.f61097a;
        return (bArr == null || bArr.length <= 0) ? C14654w.m85045b().m85048c() : bArr;
    }
}
