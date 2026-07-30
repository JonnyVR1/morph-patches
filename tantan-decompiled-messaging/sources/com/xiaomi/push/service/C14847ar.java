package com.xiaomi.push.service;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import p149l.ckq0;
import p149l.ilq0;
import p149l.jkq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ar */
/* JADX INFO: loaded from: classes2.dex */
public class C14847ar {

    /* JADX INFO: renamed from: a */
    private static int f62969a = 8;

    /* JADX INFO: renamed from: d */
    private int f62973d = -666;

    /* JADX INFO: renamed from: a */
    private byte[] f62970a = new byte[256];

    /* JADX INFO: renamed from: c */
    private int f62972c = 0;

    /* JADX INFO: renamed from: b */
    private int f62971b = 0;

    /* JADX INFO: renamed from: a */
    private void m86548a(int i, byte[] bArr, boolean z) {
        int length = bArr.length;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f62970a[i2] = (byte) i2;
        }
        this.f62972c = 0;
        this.f62971b = 0;
        while (true) {
            int i3 = this.f62971b;
            if (i3 >= i) {
                break;
            }
            int iM86546a = ((this.f62972c + m86546a(this.f62970a[i3])) + m86546a(bArr[this.f62971b % length])) % 256;
            this.f62972c = iM86546a;
            m86550a(this.f62970a, this.f62971b, iM86546a);
            this.f62971b++;
        }
        if (i != 256) {
            this.f62973d = ((this.f62972c + m86546a(this.f62970a[i])) + m86546a(bArr[i % length])) % 256;
        }
        if (z) {
            StringBuilder sb = new StringBuilder("S_");
            int i4 = i - 1;
            sb.append(i4);
            sb.append(":");
            for (int i5 = 0; i5 <= i; i5++) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(m86546a(this.f62970a[i5]));
            }
            sb.append("   j_");
            sb.append(i4);
            sb.append("=");
            sb.append(this.f62972c);
            sb.append("   j_");
            sb.append(i);
            sb.append("=");
            sb.append(this.f62973d);
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i4);
            sb.append("]=");
            sb.append(m86546a(this.f62970a[this.f62972c]));
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i);
            sb.append("]=");
            sb.append(m86546a(this.f62970a[this.f62973d]));
            if (this.f62970a[1] != 0) {
                sb.append("   S[1]!=0");
            }
            ilq0.m137040m(sb.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m86546a(byte b) {
        return b >= 0 ? b : b + 256;
    }

    /* JADX INFO: renamed from: a */
    private void m86549a(byte[] bArr) {
        m86548a(256, bArr, false);
    }

    /* JADX INFO: renamed from: a */
    private void m86547a() {
        this.f62972c = 0;
        this.f62971b = 0;
    }

    /* JADX INFO: renamed from: a */
    public byte m86555a() {
        int i = (this.f62971b + 1) % 256;
        this.f62971b = i;
        int iM86546a = (this.f62972c + m86546a(this.f62970a[i])) % 256;
        this.f62972c = iM86546a;
        m86550a(this.f62970a, this.f62971b, iM86546a);
        byte[] bArr = this.f62970a;
        return bArr[(m86546a(bArr[this.f62971b]) + m86546a(this.f62970a[this.f62972c])) % 256];
    }

    /* JADX INFO: renamed from: a */
    private static void m86550a(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m86553a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        C14847ar c14847ar = new C14847ar();
        c14847ar.m86549a(bArr);
        c14847ar.m86547a();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ c14847ar.m86555a());
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m86554a(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
        byte[] bArr3;
        int i3;
        if (i >= 0 && i <= bArr2.length && i + i2 <= bArr2.length) {
            if (z) {
                bArr3 = bArr2;
                i3 = i;
            } else {
                bArr3 = new byte[i2];
                i3 = 0;
            }
            C14847ar c14847ar = new C14847ar();
            c14847ar.m86549a(bArr);
            c14847ar.m86547a();
            for (int i4 = 0; i4 < i2; i4++) {
                bArr3[i3 + i4] = (byte) (bArr2[i + i4] ^ c14847ar.m86555a());
            }
            return bArr3;
        }
        ckq0.m107426a("start = ", i, " len = ", i2);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m86552a(byte[] bArr, String str) {
        return m86553a(bArr, jkq0.m141908b(str));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m86551a(String str, String str2) {
        byte[] bArrM141908b = jkq0.m141908b(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[bArrM141908b.length + 1 + bytes.length];
        for (int i = 0; i < bArrM141908b.length; i++) {
            bArr[i] = bArrM141908b[i];
        }
        bArr[bArrM141908b.length] = 95;
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[bArrM141908b.length + 1 + i2] = bytes[i2];
        }
        return bArr;
    }
}
