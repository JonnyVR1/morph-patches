package com.xiaomi.push.service;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import p153l.itq0;
import p153l.ouq0;
import p153l.ptq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ar */
/* JADX INFO: loaded from: classes2.dex */
public class C14995ar {

    /* JADX INFO: renamed from: a */
    private static int f63816a = 8;

    /* JADX INFO: renamed from: d */
    private int f63820d = -666;

    /* JADX INFO: renamed from: a */
    private byte[] f63817a = new byte[256];

    /* JADX INFO: renamed from: c */
    private int f63819c = 0;

    /* JADX INFO: renamed from: b */
    private int f63818b = 0;

    /* JADX INFO: renamed from: a */
    private void m87719a(int i, byte[] bArr, boolean z) {
        int length = bArr.length;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f63817a[i2] = (byte) i2;
        }
        this.f63819c = 0;
        this.f63818b = 0;
        while (true) {
            int i3 = this.f63818b;
            if (i3 >= i) {
                break;
            }
            int iM87717a = ((this.f63819c + m87717a(this.f63817a[i3])) + m87717a(bArr[this.f63818b % length])) % 256;
            this.f63819c = iM87717a;
            m87721a(this.f63817a, this.f63818b, iM87717a);
            this.f63818b++;
        }
        if (i != 256) {
            this.f63820d = ((this.f63819c + m87717a(this.f63817a[i])) + m87717a(bArr[i % length])) % 256;
        }
        if (z) {
            StringBuilder sb = new StringBuilder("S_");
            int i4 = i - 1;
            sb.append(i4);
            sb.append(":");
            for (int i5 = 0; i5 <= i; i5++) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(m87717a(this.f63817a[i5]));
            }
            sb.append("   j_");
            sb.append(i4);
            sb.append("=");
            sb.append(this.f63819c);
            sb.append("   j_");
            sb.append(i);
            sb.append("=");
            sb.append(this.f63820d);
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i4);
            sb.append("]=");
            sb.append(m87717a(this.f63817a[this.f63819c]));
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i);
            sb.append("]=");
            sb.append(m87717a(this.f63817a[this.f63820d]));
            if (this.f63817a[1] != 0) {
                sb.append("   S[1]!=0");
            }
            ouq0.m169393m(sb.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m87717a(byte b) {
        return b >= 0 ? b : b + 256;
    }

    /* JADX INFO: renamed from: a */
    private void m87720a(byte[] bArr) {
        m87719a(256, bArr, false);
    }

    /* JADX INFO: renamed from: a */
    private void m87718a() {
        this.f63819c = 0;
        this.f63818b = 0;
    }

    /* JADX INFO: renamed from: a */
    public byte m87726a() {
        int i = (this.f63818b + 1) % 256;
        this.f63818b = i;
        int iM87717a = (this.f63819c + m87717a(this.f63817a[i])) % 256;
        this.f63819c = iM87717a;
        m87721a(this.f63817a, this.f63818b, iM87717a);
        byte[] bArr = this.f63817a;
        return bArr[(m87717a(bArr[this.f63818b]) + m87717a(this.f63817a[this.f63819c])) % 256];
    }

    /* JADX INFO: renamed from: a */
    private static void m87721a(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m87724a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        C14995ar c14995ar = new C14995ar();
        c14995ar.m87720a(bArr);
        c14995ar.m87718a();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ c14995ar.m87726a());
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m87725a(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
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
            C14995ar c14995ar = new C14995ar();
            c14995ar.m87720a(bArr);
            c14995ar.m87718a();
            for (int i4 = 0; i4 < i2; i4++) {
                bArr3[i3 + i4] = (byte) (bArr2[i + i4] ^ c14995ar.m87726a());
            }
            return bArr3;
        }
        itq0.m142074a("start = ", i, " len = ", i2);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m87723a(byte[] bArr, String str) {
        return m87724a(bArr, ptq0.m173774b(str));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m87722a(String str, String str2) {
        byte[] bArrM173774b = ptq0.m173774b(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[bArrM173774b.length + 1 + bytes.length];
        for (int i = 0; i < bArrM173774b.length; i++) {
            bArr[i] = bArrM173774b[i];
        }
        bArr[bArrM173774b.length] = 95;
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[bArrM173774b.length + 1 + i2] = bytes[i2];
        }
        return bArr;
    }
}
