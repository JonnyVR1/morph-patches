package com.tencent.cloud.p080ai.network.okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p153l.aqg0;
import p153l.fcg0;
import p153l.gig0;
import p153l.gzi0;
import p153l.mnd0;
import p153l.vg3;
import p153l.wg3;
import p153l.wtq0;
import p153l.xg3;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.r */
/* JADX INFO: loaded from: classes12.dex */
public final class C13952r implements InterfaceC13941g {

    /* JADX INFO: renamed from: a */
    public final C13939e f57849a = new C13939e();

    /* JADX INFO: renamed from: b */
    public final InterfaceC13957w f57850b;

    /* JADX INFO: renamed from: c */
    public boolean f57851c;

    public C13952r(InterfaceC13957w interfaceC13957w) {
        if (interfaceC13957w != null) {
            this.f57850b = interfaceC13957w;
        } else {
            mnd0.m159157a("source == null");
            throw null;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: a */
    public int mo83079a(C13950p c13950p) throws EOFException {
        C13939e c13939e;
        if (this.f57851c) {
            wtq0.m207906a("closed");
            return 0;
        }
        do {
            C13939e c13939e2 = this.f57849a;
            C13953s c13953s = c13939e2.f57817a;
            ByteString[] byteStringArr = c13950p.f57845a;
            int length = byteStringArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                ByteString byteString = byteStringArr[i];
                int iMin = (int) Math.min(c13939e2.f57818b, byteString.size());
                if (iMin == 0 || c13939e2.m83096a(c13953s, c13953s.f57854b, byteString, 0, iMin)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return -1;
            }
            long size = c13950p.f57845a[i].size();
            c13939e = this.f57849a;
            if (size <= c13939e.f57818b) {
                c13939e.mo83110d(size);
                return i;
            }
        } while (this.f57850b.mo82814a(c13939e, 8192L) != -1);
        return -1;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: b */
    public boolean mo83104b(long j) {
        C13939e c13939e;
        if (j < 0) {
            fcg0.m125008a("byteCount < 0: ", j);
            return false;
        }
        if (this.f57851c) {
            wtq0.m207906a("closed");
            return false;
        }
        do {
            c13939e = this.f57849a;
            if (c13939e.f57818b >= j) {
                return true;
            }
        } while (this.f57850b.mo82814a(c13939e, 8192L) != -1);
        return false;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: c */
    public String mo83107c(long j) throws EOFException {
        if (j < 0) {
            fcg0.m125008a("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM83153a = m83153a((byte) 10, 0L, j2);
        if (jM83153a != -1) {
            return this.f57849a.m83124i(jM83153a);
        }
        if (j2 < Long.MAX_VALUE && mo83104b(j2) && this.f57849a.m83120h(j2 - 1) == 13 && mo83104b(j2 + 1) && this.f57849a.m83120h(j2) == 10) {
            return this.f57849a.m83124i(j2);
        }
        C13939e c13939e = new C13939e();
        C13939e c13939e2 = this.f57849a;
        c13939e2.m83088a(c13939e, 0L, Math.min(32L, c13939e2.f57818b));
        xg3.m210876a(Math.min(this.f57849a.f57818b, j), c13939e.m83129m().hex());
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f57851c) {
            return;
        }
        this.f57851c = true;
        this.f57850b.close();
        this.f57849a.m83127k();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: d */
    public void mo83110d(long j) throws EOFException {
        if (this.f57851c) {
            wtq0.m207906a("closed");
            return;
        }
        while (j > 0) {
            C13939e c13939e = this.f57849a;
            if (c13939e.f57818b == 0 && this.f57850b.mo82814a(c13939e, 8192L) == -1) {
                vg3.m201207a();
                return;
            } else {
                long jMin = Math.min(j, this.f57849a.f57818b);
                this.f57849a.mo83110d(jMin);
                j -= jMin;
            }
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: e */
    public String mo83113e() {
        return mo83107c(Long.MAX_VALUE);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: f */
    public void mo83116f(long j) throws EOFException {
        if (mo83104b(j)) {
            return;
        }
        vg3.m201207a();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: g */
    public boolean mo83118g() {
        if (!this.f57851c) {
            return this.f57849a.mo83118g() && this.f57850b.mo82814a(this.f57849a, 8192L) == -1;
        }
        wtq0.m207906a("closed");
        return false;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: h */
    public byte[] mo83122h() {
        this.f57849a.m83084a(this.f57850b);
        return this.f57849a.mo83122h();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f57851c;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: j */
    public short mo83126j() throws EOFException {
        mo83116f(2L);
        return C13959y.m83163a(this.f57849a.readShort());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C13939e c13939e = this.f57849a;
        if (c13939e.f57818b == 0 && this.f57850b.mo82814a(c13939e, 8192L) == -1) {
            return -1;
        }
        return this.f57849a.read(byteBuffer);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public byte readByte() throws EOFException {
        mo83116f(1L);
        return this.f57849a.readByte();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public void readFully(byte[] bArr) throws EOFException {
        try {
            mo83116f(bArr.length);
            this.f57849a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C13939e c13939e = this.f57849a;
                long j = c13939e.f57818b;
                if (j <= 0) {
                    throw e;
                }
                int iM83080a = c13939e.m83080a(bArr, i, (int) j);
                if (iM83080a == -1) {
                    aqg0.m99478a();
                    return;
                }
                i += iM83080a;
            }
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public int readInt() throws EOFException {
        mo83116f(4L);
        return this.f57849a.readInt();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public long readLong() throws EOFException {
        mo83116f(8L);
        return this.f57849a.readLong();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public short readShort() throws EOFException {
        mo83116f(2L);
        return this.f57849a.readShort();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    public C13958x timeout() {
        return this.f57850b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f57850b + ")";
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: g */
    public byte[] mo83119g(long j) throws EOFException {
        if (mo83104b(j)) {
            return this.f57849a.mo83119g(j);
        }
        vg3.m201207a();
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: b */
    public void mo83103b(C13939e c13939e, long j) throws EOFException {
        try {
            if (mo83104b(j)) {
                C13939e c13939e2 = this.f57849a;
                long j2 = c13939e2.f57818b;
                if (j2 >= j) {
                    c13939e.write(c13939e2, j);
                    return;
                } else {
                    c13939e.write(c13939e2, j2);
                    vg3.m201207a();
                    return;
                }
            }
            throw new EOFException();
        } catch (EOFException e) {
            c13939e.m83084a(this.f57849a);
            throw e;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.r$a */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C13952r c13952r = C13952r.this;
            if (!c13952r.f57851c) {
                return (int) Math.min(c13952r.f57849a.f57818b, 2147483647L);
            }
            zpg0.m220844a("closed");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C13952r.this.close();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (C13952r.this.f57851c) {
                zpg0.m220844a("closed");
                return 0;
            }
            C13959y.m83164a(bArr.length, i, i2);
            C13952r c13952r = C13952r.this;
            C13939e c13939e = c13952r.f57849a;
            if (c13939e.f57818b == 0 && c13952r.f57850b.mo82814a(c13939e, 8192L) == -1) {
                return -1;
            }
            return C13952r.this.f57849a.m83080a(bArr, i, i2);
        }

        public String toString() {
            return C13952r.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C13952r c13952r = C13952r.this;
            if (!c13952r.f57851c) {
                C13939e c13939e = c13952r.f57849a;
                if (c13939e.f57818b == 0 && c13952r.f57850b.mo82814a(c13939e, 8192L) == -1) {
                    return -1;
                }
                return C13952r.this.f57849a.readByte() & 255;
            }
            zpg0.m220844a("closed");
            return 0;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: b */
    public int mo83097b() throws EOFException {
        mo83116f(4L);
        return C13959y.m83162a(this.f57849a.readInt());
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: d */
    public InputStream mo83109d() {
        return new a();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    /* JADX INFO: renamed from: a */
    public long mo82814a(C13939e c13939e, long j) {
        if (c13939e == null) {
            wg3.m206174a("sink == null");
            return 0L;
        }
        if (j >= 0) {
            if (!this.f57851c) {
                C13939e c13939e2 = this.f57849a;
                if (c13939e2.f57818b == 0 && this.f57850b.mo82814a(c13939e2, 8192L) == -1) {
                    return -1L;
                }
                return this.f57849a.mo82814a(c13939e, Math.min(j, this.f57849a.f57818b));
            }
            wtq0.m207906a("closed");
            return 0L;
        }
        fcg0.m125008a("byteCount < 0: ", j);
        return 0L;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: a */
    public ByteString mo83085a(long j) throws EOFException {
        if (mo83104b(j)) {
            return this.f57849a.mo83085a(j);
        }
        vg3.m201207a();
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g, com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: a */
    public C13939e mo83087a() {
        return this.f57849a;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: a */
    public String mo83095a(Charset charset) {
        if (charset != null) {
            this.f57849a.m83084a(this.f57850b);
            C13939e c13939e = this.f57849a;
            c13939e.getClass();
            try {
                return c13939e.m83094a(c13939e.f57818b, charset);
            } catch (EOFException e) {
                gig0.m130323a(e);
                return null;
            }
        }
        wg3.m206174a("charset == null");
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: a */
    public long mo83081a(byte b) {
        return m83153a(b, 0L, Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public long m83153a(byte b, long j, long j2) {
        if (this.f57851c) {
            wtq0.m207906a("closed");
            return 0L;
        }
        if (j < 0 || j2 < j) {
            gzi0.m133102a("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)});
            return 0L;
        }
        long jMax = j;
        while (jMax < j2) {
            byte b2 = b;
            long j3 = j2;
            long jM83082a = this.f57849a.m83082a(b2, jMax, j3);
            if (jM83082a != -1) {
                return jM83082a;
            }
            C13939e c13939e = this.f57849a;
            long j4 = c13939e.f57818b;
            if (j4 >= j3 || this.f57850b.mo82814a(c13939e, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: c */
    public long mo83105c() throws EOFException {
        mo83116f(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo83104b(i2)) {
                break;
            }
            byte bM83120h = this.f57849a.m83120h(i);
            if ((bM83120h < 48 || bM83120h > 57) && ((bM83120h < 97 || bM83120h > 102) && (bM83120h < 65 || bM83120h > 70))) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM83120h)));
            }
            i = i2;
        }
        return this.f57849a.mo83105c();
    }
}
