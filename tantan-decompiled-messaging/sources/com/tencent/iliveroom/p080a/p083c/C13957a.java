package com.tencent.iliveroom.p080a.p083c;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.c.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13957a {

    /* JADX INFO: renamed from: a */
    private Object[] f57838a;

    /* JADX INFO: renamed from: e */
    private int f57842e;

    /* JADX INFO: renamed from: f */
    private int f57843f;

    /* JADX INFO: renamed from: c */
    private int f57840c = 0;

    /* JADX INFO: renamed from: d */
    private int f57841d = 0;

    /* JADX INFO: renamed from: b */
    private boolean f57839b = true;

    /* JADX INFO: renamed from: g */
    private int f57844g = 0;

    public C13957a(int i) {
        this.f57843f = i;
        int i2 = i * 2;
        this.f57842e = i2;
        this.f57838a = new Object[i2];
    }

    /* JADX INFO: renamed from: a */
    public synchronized byte[] m82633a(int i) {
        if (this.f57839b) {
            return null;
        }
        if (this.f57844g - i < this.f57843f) {
            return null;
        }
        Object[] objArr = new Object[i];
        int length = 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArrM82632a = m82632a();
            objArr[i2] = bArrM82632a;
            length += bArrM82632a.length;
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
    public synchronized void m82634b() {
        this.f57840c = 0;
        this.f57841d = 0;
        this.f57839b = true;
        this.f57844g = 0;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82631a(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int length = bArr.length;
                    System.arraycopy(bArr, 0, new byte[length], 0, length);
                    this.f57844g++;
                    Object[] objArr = this.f57838a;
                    int i = this.f57840c;
                    int i2 = i + 1;
                    this.f57840c = i2;
                    objArr[i] = bArr;
                    int i3 = this.f57842e;
                    if (i2 == i3) {
                        this.f57840c = 0;
                    }
                    int i4 = this.f57840c;
                    int i5 = this.f57841d;
                    if (i4 == i5) {
                        int i6 = i5 + 1;
                        this.f57841d = i6;
                        if (i6 == i3) {
                            this.f57841d = 0;
                        }
                    }
                    this.f57839b = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized byte[] m82632a() {
        try {
            if (this.f57839b) {
                return null;
            }
            int i = this.f57844g;
            if (i < this.f57843f) {
                return null;
            }
            this.f57844g = i - 1;
            Object[] objArr = this.f57838a;
            int i2 = this.f57841d;
            int i3 = i2 + 1;
            this.f57841d = i3;
            byte[] bArr = (byte[]) objArr[i2];
            if (i3 == this.f57842e) {
                this.f57841d = 0;
            }
            if (this.f57841d == this.f57840c) {
                this.f57839b = true;
            }
            return bArr;
        } catch (Throwable th) {
            throw th;
        }
    }
}
