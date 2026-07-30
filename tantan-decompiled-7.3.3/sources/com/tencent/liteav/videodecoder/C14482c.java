package com.tencent.liteav.videodecoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p153l.wg3;

/* JADX INFO: renamed from: com.tencent.liteav.videodecoder.c */
/* JADX INFO: loaded from: classes2.dex */
class C14482c {

    /* JADX INFO: renamed from: b */
    int f60782b;

    /* JADX INFO: renamed from: c */
    private InputStream f60783c;

    /* JADX INFO: renamed from: d */
    private int f60784d;

    /* JADX INFO: renamed from: e */
    private int f60785e;

    /* JADX INFO: renamed from: f */
    private final OutputStream f60786f;

    /* JADX INFO: renamed from: h */
    private int f60788h;

    /* JADX INFO: renamed from: a */
    protected C14480a f60781a = new C14480a(50);

    /* JADX INFO: renamed from: g */
    private int[] f60787g = new int[8];

    public C14482c(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.f60783c = inputStream;
        this.f60786f = outputStream;
        this.f60784d = inputStream.read();
        this.f60785e = inputStream.read();
    }

    /* JADX INFO: renamed from: f */
    private void m85203f() throws IOException {
        int i = 0;
        while (m85212b(true) == 0) {
            i++;
        }
        if (i > 0) {
            m85214b(i);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m85204g() throws IOException {
        int[] iArr = this.f60787g;
        this.f60786f.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    /* JADX INFO: renamed from: a */
    public long m85206a(int i) throws IOException {
        if (i > 64) {
            wg3.m206174a("Can not readByte more then 64 bit");
            return 0L;
        }
        long jM85212b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            jM85212b = (jM85212b << 1) | ((long) m85212b(true));
        }
        return jM85212b;
    }

    /* JADX INFO: renamed from: b */
    public int m85212b(boolean z) throws IOException {
        if (this.f60782b == 8) {
            m85201d();
            if (this.f60784d == -1) {
                return -1;
            }
        }
        int i = this.f60784d;
        int i2 = this.f60782b;
        int i3 = (i >> (7 - i2)) & 1;
        this.f60782b = i2 + 1;
        if (z && this.f60786f != null) {
            m85221d(i3);
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public void m85219c(int i) throws IOException {
        int[] iArr = new int[i];
        int iM85217c = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iM85217c != 0) {
                iM85217c = ((m85217c("deltaScale") + i2) + 256) % 256;
            }
            if (iM85217c != 0) {
                i2 = iM85217c;
            }
            iArr[i3] = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m85221d(int i) throws IOException {
        if (this.f60788h == 8) {
            this.f60788h = 0;
            m85204g();
        }
        int[] iArr = this.f60787g;
        int i2 = this.f60788h;
        this.f60788h = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX INFO: renamed from: e */
    public void m85223e(int i) throws IOException {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < 15) {
            int i5 = (1 << i3) + i4;
            if (i < i5) {
                i2 = i3;
                break;
            } else {
                i3++;
                i4 = i5;
            }
        }
        m85209a(0L, i2);
        m85221d(1);
        m85209a(i - i4, i2);
    }

    /* JADX INFO: renamed from: d */
    public boolean m85222d(String str) throws IOException {
        boolean zM85211a = m85211a(true);
        m85200a(str, zM85211a ? "1" : "0");
        return zM85211a;
    }

    /* JADX INFO: renamed from: d */
    private void m85201d() throws IOException {
        this.f60784d = this.f60785e;
        this.f60785e = this.f60783c.read();
        this.f60782b = 0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85211a(boolean z) throws IOException {
        return m85212b(z) == 1;
    }

    /* JADX INFO: renamed from: a */
    private void m85200a(String str, String str2) {
    }

    /* JADX INFO: renamed from: a */
    public long m85207a(int i, String str) throws IOException {
        long jM85206a = m85206a(i);
        m85200a(str, String.valueOf(jM85206a));
        return jM85206a;
    }

    /* JADX INFO: renamed from: c */
    public int m85217c(String str) throws IOException {
        int iM85202e = m85202e();
        int i = iM85202e & 1;
        int i2 = ((iM85202e >> 1) + i) * ((i << 1) - 1);
        m85200a(str, String.valueOf(i2));
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public int m85205a(String str) throws IOException {
        int iM85202e = m85202e();
        m85200a(str, String.valueOf(iM85202e));
        return iM85202e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85224e(String str) throws IOException {
        boolean zM85211a = m85211a(false);
        m85200a(str, zM85211a ? "1" : "0");
        return zM85211a;
    }

    /* JADX INFO: renamed from: c */
    public void m85220c(int i, String str) throws IOException {
        m85223e(i);
    }

    /* JADX INFO: renamed from: e */
    private int m85202e() throws IOException {
        int i = 0;
        while (m85212b(true) == 0) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i) - 1)) + m85206a(i));
    }

    /* JADX INFO: renamed from: a */
    public void m85208a() throws IOException {
        for (int i = this.f60788h; i < 8; i++) {
            this.f60787g[i] = 0;
        }
        this.f60788h = 0;
        m85204g();
    }

    /* JADX INFO: renamed from: c */
    public void m85218c() throws IOException {
        m85221d(1);
        m85213b();
        m85208a();
    }

    /* JADX INFO: renamed from: b */
    public void m85214b(int i) throws IOException {
        if (i > 64) {
            wg3.m206174a("Can not skip more then 64 bit");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            m85212b(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85209a(long j, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            m85221d(((int) (j >> ((i - i2) - 1))) & 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85210a(boolean z, String str) throws IOException {
        m85221d(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public void m85215b(int i, String str) throws IOException {
        m85214b(i);
        m85200a(str, "skip NBits");
    }

    /* JADX INFO: renamed from: b */
    public void m85216b(String str) throws IOException {
        m85203f();
        m85200a(str, "skip UE");
    }

    /* JADX INFO: renamed from: b */
    public void m85213b() throws IOException {
        m85209a(0L, 8 - this.f60788h);
    }
}
