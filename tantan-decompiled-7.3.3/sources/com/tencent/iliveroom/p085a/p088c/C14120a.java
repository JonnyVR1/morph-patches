package com.tencent.iliveroom.p085a.p088c;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.c.a */
/* JADX INFO: loaded from: classes12.dex */
public class C14120a {

    /* JADX INFO: renamed from: a */
    private Object[] f58686a;

    /* JADX INFO: renamed from: e */
    private int f58690e;

    /* JADX INFO: renamed from: f */
    private int f58691f;

    /* JADX INFO: renamed from: c */
    private int f58688c = 0;

    /* JADX INFO: renamed from: d */
    private int f58689d = 0;

    /* JADX INFO: renamed from: b */
    private boolean f58687b = true;

    /* JADX INFO: renamed from: g */
    private int f58692g = 0;

    public C14120a(int i) {
        this.f58691f = i;
        int i2 = i * 2;
        this.f58690e = i2;
        this.f58686a = new Object[i2];
    }

    /* JADX INFO: renamed from: a */
    public synchronized byte[] m83816a(int i) {
        if (this.f58687b) {
            return null;
        }
        if (this.f58692g - i < this.f58691f) {
            return null;
        }
        Object[] objArr = new Object[i];
        int length = 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArrM83815a = m83815a();
            objArr[i2] = bArrM83815a;
            length += bArrM83815a.length;
        }
        if (length == 0) {
            return null;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr2 = (byte[]) objArr[i3];
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m83817b() {
        this.f58688c = 0;
        this.f58689d = 0;
        this.f58687b = true;
        this.f58692g = 0;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83814a(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int length = bArr.length;
                    System.arraycopy(bArr, 0, new byte[length], 0, length);
                    this.f58692g++;
                    Object[] objArr = this.f58686a;
                    int i = this.f58688c;
                    int i2 = i + 1;
                    this.f58688c = i2;
                    objArr[i] = bArr;
                    int i3 = this.f58690e;
                    if (i2 == i3) {
                        this.f58688c = 0;
                    }
                    int i4 = this.f58688c;
                    int i5 = this.f58689d;
                    if (i4 == i5) {
                        int i6 = i5 + 1;
                        this.f58689d = i6;
                        if (i6 == i3) {
                            this.f58689d = 0;
                        }
                    }
                    this.f58687b = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized byte[] m83815a() {
        try {
            if (this.f58687b) {
                return null;
            }
            int i = this.f58692g;
            if (i < this.f58691f) {
                return null;
            }
            this.f58692g = i - 1;
            Object[] objArr = this.f58686a;
            int i2 = this.f58689d;
            int i3 = i2 + 1;
            this.f58689d = i3;
            byte[] bArr = (byte[]) objArr[i2];
            if (i3 == this.f58690e) {
                this.f58689d = 0;
            }
            if (this.f58689d == this.f58688c) {
                this.f58687b = true;
            }
            return bArr;
        } catch (Throwable th) {
            throw th;
        }
    }
}
