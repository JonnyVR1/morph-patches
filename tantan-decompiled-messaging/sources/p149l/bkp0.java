package p149l;

import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes2.dex */
public final class bkp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f76102a;

    /* JADX INFO: renamed from: b */
    public final Random f76103b;

    /* JADX INFO: renamed from: c */
    public final BufferedSink f76104c;

    /* JADX INFO: renamed from: d */
    public final Buffer f76105d;

    /* JADX INFO: renamed from: e */
    public boolean f76106e;

    /* JADX INFO: renamed from: f */
    public final Buffer f76107f = new Buffer();

    /* JADX INFO: renamed from: g */
    public final C15901a f76108g = new C15901a();

    /* JADX INFO: renamed from: h */
    public boolean f76109h;

    /* JADX INFO: renamed from: i */
    public final byte[] f76110i;

    /* JADX INFO: renamed from: j */
    public final Buffer.UnsafeCursor f76111j;

    /* JADX INFO: renamed from: l.bkp0$a */
    public final class C15901a implements Sink {

        /* JADX INFO: renamed from: a */
        public int f76112a;

        /* JADX INFO: renamed from: b */
        public long f76113b;

        /* JADX INFO: renamed from: c */
        public boolean f76114c;

        /* JADX INFO: renamed from: d */
        public boolean f76115d;

        public C15901a() {
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f76115d) {
                rhg0.m179353a("closed");
                return;
            }
            bkp0 bkp0Var = bkp0.this;
            bkp0Var.m102500d(this.f76112a, bkp0Var.f76107f.size(), this.f76114c, true);
            this.f76115d = true;
            bkp0.this.f76109h = false;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f76115d) {
                rhg0.m179353a("closed");
                return;
            }
            bkp0 bkp0Var = bkp0.this;
            bkp0Var.m102500d(this.f76112a, bkp0Var.f76107f.size(), this.f76114c, false);
            this.f76114c = false;
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return bkp0.this.f76104c.getTimeout();
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f76115d) {
                rhg0.m179353a("closed");
                return;
            }
            bkp0.this.f76107f.write(buffer, j);
            boolean z = this.f76114c && this.f76113b != -1 && bkp0.this.f76107f.size() > this.f76113b - 8192;
            long jCompleteSegmentByteCount = bkp0.this.f76107f.completeSegmentByteCount();
            if (jCompleteSegmentByteCount <= 0 || z) {
                return;
            }
            bkp0.this.m102500d(this.f76112a, jCompleteSegmentByteCount, this.f76114c, false);
            this.f76114c = false;
        }
    }

    public bkp0(boolean z, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            jfd0.m141176a("sink == null");
            throw null;
        }
        if (random == null) {
            jfd0.m141176a("random == null");
            throw null;
        }
        this.f76102a = z;
        this.f76104c = bufferedSink;
        this.f76105d = bufferedSink.getBufferField();
        this.f76103b = random;
        this.f76110i = z ? new byte[4] : null;
        this.f76111j = z ? new Buffer.UnsafeCursor() : null;
    }

    /* JADX INFO: renamed from: a */
    public Sink m102497a(int i, long j) {
        if (this.f76109h) {
            qkq0.m175383a("Another message writer is active. Did you call close()?");
            return null;
        }
        this.f76109h = true;
        C15901a c15901a = this.f76108g;
        c15901a.f76112a = i;
        c15901a.f76113b = j;
        c15901a.f76114c = true;
        c15901a.f76115d = false;
        return c15901a;
    }

    /* JADX INFO: renamed from: b */
    public void m102498b(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                wjp0.m203482c(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            m102499c(8, byteString2);
        } finally {
            this.f76106e = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m102499c(int i, ByteString byteString) throws IOException {
        if (this.f76106e) {
            rhg0.m179353a("closed");
            return;
        }
        int size = byteString.size();
        if (size > 125) {
            ig3.m135964a("Payload size must be less than or equal to 125");
            return;
        }
        this.f76105d.writeByte(i | 128);
        boolean z = this.f76102a;
        Buffer buffer = this.f76105d;
        if (z) {
            buffer.writeByte(size | 128);
            this.f76103b.nextBytes(this.f76110i);
            this.f76105d.write(this.f76110i);
            if (size > 0) {
                long size2 = this.f76105d.size();
                this.f76105d.write(byteString);
                this.f76105d.readAndWriteUnsafe(this.f76111j);
                this.f76111j.seek(size2);
                wjp0.m203481b(this.f76111j, this.f76110i);
                this.f76111j.close();
            }
        } else {
            buffer.writeByte(size);
            this.f76105d.write(byteString);
        }
        this.f76104c.flush();
    }

    /* JADX INFO: renamed from: d */
    public void m102500d(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f76106e) {
            rhg0.m179353a("closed");
            return;
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f76105d.writeByte(i);
        int i2 = this.f76102a ? 128 : 0;
        if (j <= 125) {
            this.f76105d.writeByte(((int) j) | i2);
        } else {
            Buffer buffer = this.f76105d;
            if (j <= 65535) {
                buffer.writeByte(i2 | 126);
                this.f76105d.writeShort((int) j);
            } else {
                buffer.writeByte(i2 | 127);
                this.f76105d.writeLong(j);
            }
        }
        if (this.f76102a) {
            this.f76103b.nextBytes(this.f76110i);
            this.f76105d.write(this.f76110i);
            if (j > 0) {
                long size = this.f76105d.size();
                this.f76105d.write(this.f76107f, j);
                this.f76105d.readAndWriteUnsafe(this.f76111j);
                this.f76111j.seek(size);
                wjp0.m203481b(this.f76111j, this.f76110i);
                this.f76111j.close();
            }
        } else {
            this.f76105d.write(this.f76107f, j);
        }
        this.f76104c.emit();
    }

    /* JADX INFO: renamed from: e */
    public void m102501e(ByteString byteString) throws IOException {
        m102499c(9, byteString);
    }

    /* JADX INFO: renamed from: f */
    public void m102502f(ByteString byteString) throws IOException {
        m102499c(10, byteString);
    }
}
