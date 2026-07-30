package p007l;

import java.io.IOException;
import java.util.Random;
import l.ig3;
import l.jfd0;
import l.qkq0;
import l.rhg0;
import l.shg0;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class akp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f1864a;

    /* JADX INFO: renamed from: b */
    public final Random f1865b;

    /* JADX INFO: renamed from: c */
    public final BufferedSink f1866c;

    /* JADX INFO: renamed from: d */
    public boolean f1867d;

    /* JADX INFO: renamed from: e */
    public final Buffer f1868e = new Buffer();

    /* JADX INFO: renamed from: f */
    public final C0491a f1869f = new C0491a();

    /* JADX INFO: renamed from: g */
    public boolean f1870g;

    /* JADX INFO: renamed from: h */
    public final byte[] f1871h;

    /* JADX INFO: renamed from: i */
    public final byte[] f1872i;

    /* JADX INFO: renamed from: l.akp0$a */
    public final class C0491a implements Sink {

        /* JADX INFO: renamed from: a */
        public int f1873a;

        /* JADX INFO: renamed from: b */
        public long f1874b;

        /* JADX INFO: renamed from: c */
        public boolean f1875c;

        /* JADX INFO: renamed from: d */
        public boolean f1876d;

        public C0491a() {
        }

        public void close() throws IOException {
            if (this.f1876d) {
                rhg0.a("closed");
                return;
            }
            akp0 akp0Var = akp0.this;
            akp0Var.m8561d(this.f1873a, akp0Var.f1868e.size(), this.f1875c, true);
            this.f1876d = true;
            akp0.this.f1870g = false;
        }

        public void flush() throws IOException {
            if (this.f1876d) {
                rhg0.a("closed");
                return;
            }
            akp0 akp0Var = akp0.this;
            akp0Var.m8561d(this.f1873a, akp0Var.f1868e.size(), this.f1875c, false);
            this.f1875c = false;
        }

        public Timeout timeout() {
            return akp0.this.f1866c.timeout();
        }

        public void write(Buffer buffer, long j) throws IOException {
            if (this.f1876d) {
                rhg0.a("closed");
                return;
            }
            akp0.this.f1868e.write(buffer, j);
            boolean z = this.f1875c && this.f1874b != -1 && akp0.this.f1868e.size() > this.f1874b - 8192;
            long jCompleteSegmentByteCount = akp0.this.f1868e.completeSegmentByteCount();
            if (jCompleteSegmentByteCount <= 0 || z) {
                return;
            }
            akp0.this.m8561d(this.f1873a, jCompleteSegmentByteCount, this.f1875c, false);
            this.f1875c = false;
        }
    }

    public akp0(boolean z, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            jfd0.a("sink == null");
            throw null;
        }
        if (random == null) {
            jfd0.a("random == null");
            throw null;
        }
        this.f1864a = z;
        this.f1866c = bufferedSink;
        this.f1865b = random;
        this.f1871h = z ? new byte[4] : null;
        this.f1872i = z ? new byte[8192] : null;
    }

    /* JADX INFO: renamed from: a */
    public Sink m8558a(int i, long j) {
        if (this.f1870g) {
            qkq0.a("Another message writer is active. Did you call close()?");
            return null;
        }
        this.f1870g = true;
        C0491a c0491a = this.f1869f;
        c0491a.f1873a = i;
        c0491a.f1874b = j;
        c0491a.f1875c = true;
        c0491a.f1876d = false;
        return c0491a;
    }

    /* JADX INFO: renamed from: b */
    public void m8559b(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                xjp0.m11838c(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            m8560c(8, byteString2);
        } finally {
            this.f1867d = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8560c(int i, ByteString byteString) throws IOException {
        if (this.f1867d) {
            rhg0.a("closed");
            return;
        }
        int size = byteString.size();
        if (size > 125) {
            ig3.a("Payload size must be less than or equal to 125");
            return;
        }
        this.f1866c.writeByte(i | 128);
        boolean z = this.f1864a;
        BufferedSink bufferedSink = this.f1866c;
        if (z) {
            bufferedSink.writeByte(size | 128);
            this.f1865b.nextBytes(this.f1871h);
            this.f1866c.write(this.f1871h);
            byte[] byteArray = byteString.toByteArray();
            xjp0.m11837b(byteArray, byteArray.length, this.f1871h, 0L);
            this.f1866c.write(byteArray);
        } else {
            bufferedSink.writeByte(size);
            this.f1866c.write(byteString);
        }
        this.f1866c.flush();
    }

    /* JADX INFO: renamed from: d */
    public void m8561d(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f1867d) {
            rhg0.a("closed");
            return;
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f1866c.writeByte(i);
        int i2 = this.f1864a ? 128 : 0;
        if (j <= 125) {
            this.f1866c.writeByte(i2 | ((int) j));
        } else {
            BufferedSink bufferedSink = this.f1866c;
            if (j <= 65535) {
                bufferedSink.writeByte(i2 | 126);
                this.f1866c.writeShort((int) j);
            } else {
                bufferedSink.writeByte(i2 | 127);
                this.f1866c.writeLong(j);
            }
        }
        if (this.f1864a) {
            this.f1865b.nextBytes(this.f1871h);
            this.f1866c.write(this.f1871h);
            long j2 = 0;
            while (j2 < j) {
                int i3 = this.f1868e.read(this.f1872i, 0, (int) Math.min(j, this.f1872i.length));
                if (i3 == -1) {
                    shg0.a();
                    return;
                }
                long j3 = i3;
                xjp0.m11837b(this.f1872i, j3, this.f1871h, j2);
                this.f1866c.write(this.f1872i, 0, i3);
                j2 += j3;
            }
        } else {
            this.f1866c.write(this.f1868e, j);
        }
        this.f1866c.emit();
    }

    /* JADX INFO: renamed from: e */
    public void m8562e(ByteString byteString) throws IOException {
        m8560c(9, byteString);
    }

    /* JADX INFO: renamed from: f */
    public void m8563f(ByteString byteString) throws IOException {
        m8560c(10, byteString);
    }
}
