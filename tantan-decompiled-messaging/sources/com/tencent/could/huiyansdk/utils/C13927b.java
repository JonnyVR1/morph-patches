package com.tencent.could.huiyansdk.utils;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13927b {

    /* JADX INFO: renamed from: a */
    public C13934i<byte[]> f57500a;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13927b f57501a = new C13927b();
    }

    /* JADX INFO: renamed from: a */
    public boolean m82391a(byte[] bArr) {
        synchronized (C13927b.class) {
            try {
                C13934i<byte[]> c13934i = this.f57500a;
                if (c13934i == null) {
                    return false;
                }
                return c13934i.release(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
