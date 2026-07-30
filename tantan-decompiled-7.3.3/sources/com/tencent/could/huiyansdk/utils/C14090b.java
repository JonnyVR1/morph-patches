package com.tencent.could.huiyansdk.utils;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.b */
/* JADX INFO: loaded from: classes12.dex */
public class C14090b {

    /* JADX INFO: renamed from: a */
    public C14097i<byte[]> f58348a;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14090b f58349a = new C14090b();
    }

    /* JADX INFO: renamed from: a */
    public boolean m83574a(byte[] bArr) {
        synchronized (C14090b.class) {
            try {
                C14097i<byte[]> c14097i = this.f58348a;
                if (c14097i == null) {
                    return false;
                }
                return c14097i.release(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
