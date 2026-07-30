package com.vivo.push.util;

import android.content.Context;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.vivo.push.util.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14780a {

    /* JADX INFO: renamed from: c */
    private static volatile C14780a f61943c;

    /* JADX INFO: renamed from: a */
    private byte[] f61944a;

    /* JADX INFO: renamed from: b */
    private byte[] f61945b;

    private C14780a(Context context) {
        C14802w.m86216b().m86218a(ContextDelegate.getContext(context));
        C14802w c14802wM86216b = C14802w.m86216b();
        this.f61944a = c14802wM86216b.m86219c();
        this.f61945b = c14802wM86216b.m86220d();
    }

    /* JADX INFO: renamed from: a */
    public final String m86126a(String str) throws Exception {
        String strM86147a = C14785f.m86147a(m86124a());
        String strM86147a2 = C14785f.m86147a(m86125b());
        byte[] bytes = str.getBytes("utf-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(strM86147a2.getBytes("utf-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(strM86147a.getBytes("utf-8")));
        return Base64.encodeToString(cipher.doFinal(bytes), 2);
    }

    /* JADX INFO: renamed from: b */
    public final String m86127b(String str) throws Exception {
        return new String(C14785f.m86148a(C14785f.m86147a(m86124a()), C14785f.m86147a(m86125b()), Base64.decode(str, 2)), "utf-8");
    }

    /* JADX INFO: renamed from: b */
    private byte[] m86125b() {
        byte[] bArr = this.f61945b;
        return (bArr == null || bArr.length <= 0) ? C14802w.m86216b().m86220d() : bArr;
    }

    /* JADX INFO: renamed from: a */
    public static C14780a m86123a(Context context) {
        if (f61943c == null) {
            synchronized (C14780a.class) {
                try {
                    if (f61943c == null) {
                        f61943c = new C14780a(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f61943c;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m86124a() {
        byte[] bArr = this.f61944a;
        return (bArr == null || bArr.length <= 0) ? C14802w.m86216b().m86219c() : bArr;
    }
}
