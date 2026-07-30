package com.tencent.liteav.videodecoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p149l.ig3;

/* JADX INFO: renamed from: com.tencent.liteav.videodecoder.c */
/* JADX INFO: loaded from: classes2.dex */
class C14319c {

    /* JADX INFO: renamed from: b */
    int f59934b;

    /* JADX INFO: renamed from: c */
    private InputStream f59935c;

    /* JADX INFO: renamed from: d */
    private int f59936d;

    /* JADX INFO: renamed from: e */
    private int f59937e;

    /* JADX INFO: renamed from: f */
    private final OutputStream f59938f;

    /* JADX INFO: renamed from: h */
    private int f59940h;

    /* JADX INFO: renamed from: a */
    protected C14317a f59933a = new C14317a(50);

    /* JADX INFO: renamed from: g */
    private int[] f59939g = new int[8];

    public C14319c(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.f59935c = inputStream;
        this.f59938f = outputStream;
        this.f59936d = inputStream.read();
        this.f59937e = inputStream.read();
    }

    /* JADX INFO: renamed from: f */
    private void m84020f() throws IOException {
        int i = 0;
        while (m84029b(true) == 0) {
            i++;
        }
        if (i > 0) {
            m84031b(i);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m84021g() throws IOException {
        int[] iArr = this.f59939g;
        this.f59938f.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    /* JADX INFO: renamed from: a */
    public long m84023a(int i) throws IOException {
        if (i > 64) {
            ig3.m135964a("Can not readByte more then 64 bit");
            return 0L;
        }
        long jM84029b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            jM84029b = (jM84029b << 1) | ((long) m84029b(true));
        }
        return jM84029b;
    }

    /* JADX INFO: renamed from: b */
    public int m84029b(boolean z) throws IOException {
        if (this.f59934b == 8) {
            m84018d();
            if (this.f59936d == -1) {
                return -1;
            }
        }
        int i = this.f59936d;
        int i2 = this.f59934b;
        int i3 = (i >> (7 - i2)) & 1;
        this.f59934b = i2 + 1;
        if (z && this.f59938f != null) {
            m84038d(i3);
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public void m84036c(int i) throws IOException {
        int[] iArr = new int[i];
        int iM84034c = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iM84034c != 0) {
                iM84034c = ((m84034c("deltaScale") + i2) + 256) % 256;
            }
            if (iM84034c != 0) {
                i2 = iM84034c;
            }
            iArr[i3] = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m84038d(int i) throws IOException {
        if (this.f59940h == 8) {
            this.f59940h = 0;
            m84021g();
        }
        int[] iArr = this.f59939g;
        int i2 = this.f59940h;
        this.f59940h = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX INFO: renamed from: e */
    public void m84040e(int i) throws IOException {
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
        m84026a(0L, i2);
        m84038d(1);
        m84026a(i - i4, i2);
    }

    /* JADX INFO: renamed from: d */
    public boolean m84039d(String str) throws IOException {
        boolean zM84028a = m84028a(true);
        m84017a(str, zM84028a ? "1" : "0");
        return zM84028a;
    }

    /* JADX INFO: renamed from: d */
    private void m84018d() throws IOException {
        this.f59936d = this.f59937e;
        this.f59937e = this.f59935c.read();
        this.f59934b = 0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m84028a(boolean z) throws IOException {
        return m84029b(z) == 1;
    }

    /* JADX INFO: renamed from: a */
    private void m84017a(String str, String str2) {
    }

    /* JADX INFO: renamed from: a */
    public long m84024a(int i, String str) throws IOException {
        long jM84023a = m84023a(i);
        m84017a(str, String.valueOf(jM84023a));
        return jM84023a;
    }

    /* JADX INFO: renamed from: c */
    public int m84034c(String str) throws IOException {
        int iM84019e = m84019e();
        int i = iM84019e & 1;
        int i2 = ((iM84019e >> 1) + i) * ((i << 1) - 1);
        m84017a(str, String.valueOf(i2));
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public int m84022a(String str) throws IOException {
        int iM84019e = m84019e();
        m84017a(str, String.valueOf(iM84019e));
        return iM84019e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m84041e(String str) throws IOException {
        boolean zM84028a = m84028a(false);
        m84017a(str, zM84028a ? "1" : "0");
        return zM84028a;
    }

    /* JADX INFO: renamed from: c */
    public void m84037c(int i, String str) throws IOException {
        m84040e(i);
    }

    /* JADX INFO: renamed from: e */
    private int m84019e() throws IOException {
        int i = 0;
        while (m84029b(true) == 0) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i) - 1)) + m84023a(i));
    }

    /* JADX INFO: renamed from: a */
    public void m84025a() throws IOException {
        for (int i = this.f59940h; i < 8; i++) {
            this.f59939g[i] = 0;
        }
        this.f59940h = 0;
        m84021g();
    }

    /* JADX INFO: renamed from: c */
    public void m84035c() throws IOException {
        m84038d(1);
        m84030b();
        m84025a();
    }

    /* JADX INFO: renamed from: b */
    public void m84031b(int i) throws IOException {
        if (i > 64) {
            ig3.m135964a("Can not skip more then 64 bit");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            m84029b(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84026a(long j, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            m84038d(((int) (j >> ((i - i2) - 1))) & 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84027a(boolean z, String str) throws IOException {
        m84038d(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public void m84032b(int i, String str) throws IOException {
        m84031b(i);
        m84017a(str, "skip NBits");
    }

    /* JADX INFO: renamed from: b */
    public void m84033b(String str) throws IOException {
        m84020f();
        m84017a(str, "skip UE");
    }

    /* JADX INFO: renamed from: b */
    public void m84030b() throws IOException {
        m84026a(0L, 8 - this.f59940h);
    }
}
