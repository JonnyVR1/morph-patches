package p149l;

import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes8.dex */
public class akp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f70292a;

    /* JADX INFO: renamed from: b */
    public final Random f70293b;

    /* JADX INFO: renamed from: c */
    public final BufferedSink f70294c;

    /* JADX INFO: renamed from: d */
    public boolean f70295d;

    /* JADX INFO: renamed from: e */
    public final Buffer f70296e = new Buffer();

    /* JADX INFO: renamed from: f */
    public final C15647a f70297f = new C15647a();

    /* JADX INFO: renamed from: g */
    public boolean f70298g;

    /* JADX INFO: renamed from: h */
    public final byte[] f70299h;

    /* JADX INFO: renamed from: i */
    public final byte[] f70300i;

    /* JADX INFO: renamed from: l.akp0$a */
    public final class C15647a implements Sink {

        /* JADX INFO: renamed from: a */
        public int f70301a;

        /* JADX INFO: renamed from: b */
        public long f70302b;

        /* JADX INFO: renamed from: c */
        public boolean f70303c;

        /* JADX INFO: renamed from: d */
        public boolean f70304d;

        public C15647a() {
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f70304d) {
                rhg0.m179353a("closed");
                return;
            }
            akp0 akp0Var = akp0.this;
            akp0Var.m97166d(this.f70301a, akp0Var.f70296e.size(), this.f70303c, true);
            this.f70304d = true;
            akp0.this.f70298g = false;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f70304d) {
                rhg0.m179353a("closed");
                return;
            }
            akp0 akp0Var = akp0.this;
            akp0Var.m97166d(this.f70301a, akp0Var.f70296e.size(), this.f70303c, false);
            this.f70303c = false;
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return akp0.this.f70294c.getTimeout();
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f70304d) {
                rhg0.m179353a("closed");
                return;
            }
            akp0.this.f70296e.write(buffer, j);
            boolean z = this.f70303c && this.f70302b != -1 && akp0.this.f70296e.size() > this.f70302b - 8192;
            long jCompleteSegmentByteCount = akp0.this.f70296e.completeSegmentByteCount();
            if (jCompleteSegmentByteCount <= 0 || z) {
                return;
            }
            akp0.this.m97166d(this.f70301a, jCompleteSegmentByteCount, this.f70303c, false);
            this.f70303c = false;
        }
    }

    public akp0(boolean z, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            jfd0.m141176a("sink == null");
            throw null;
        }
        if (random == null) {
            jfd0.m141176a("random == null");
            throw null;
        }
        this.f70292a = z;
        this.f70294c = bufferedSink;
        this.f70293b = random;
        this.f70299h = z ? new byte[4] : null;
        this.f70300i = z ? new byte[8192] : null;
    }

    /* JADX INFO: renamed from: a */
    public Sink m97163a(int i, long j) {
        if (this.f70298g) {
            qkq0.m175383a("Another message writer is active. Did you call close()?");
            return null;
        }
        this.f70298g = true;
        C15647a c15647a = this.f70297f;
        c15647a.f70301a = i;
        c15647a.f70302b = j;
        c15647a.f70303c = true;
        c15647a.f70304d = false;
        return c15647a;
    }

    /* JADX INFO: renamed from: b */
    public void m97164b(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                xjp0.m209734c(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            m97165c(8, byteString2);
        } finally {
            this.f70295d = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m97165c(int i, ByteString byteString) throws IOException {
        if (this.f70295d) {
            rhg0.m179353a("closed");
            return;
        }
        int size = byteString.size();
        if (size > 125) {
            ig3.m135964a("Payload size must be less than or equal to 125");
            return;
        }
        this.f70294c.writeByte(i | 128);
        boolean z = this.f70292a;
        BufferedSink bufferedSink = this.f70294c;
        if (z) {
            bufferedSink.writeByte(size | 128);
            this.f70293b.nextBytes(this.f70299h);
            this.f70294c.write(this.f70299h);
            byte[] byteArray = byteString.toByteArray();
            xjp0.m209733b(byteArray, byteArray.length, this.f70299h, 0L);
            this.f70294c.write(byteArray);
        } else {
            bufferedSink.writeByte(size);
            this.f70294c.write(byteString);
        }
        this.f70294c.flush();
    }

    /* JADX INFO: renamed from: d */
    public void m97166d(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f70295d) {
            rhg0.m179353a("closed");
            return;
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f70294c.writeByte(i);
        int i2 = this.f70292a ? 128 : 0;
        if (j <= 125) {
            this.f70294c.writeByte(i2 | ((int) j));
        } else {
            BufferedSink bufferedSink = this.f70294c;
            if (j <= 65535) {
                bufferedSink.writeByte(i2 | 126);
                this.f70294c.writeShort((int) j);
            } else {
                bufferedSink.writeByte(i2 | 127);
                this.f70294c.writeLong(j);
            }
        }
        if (this.f70292a) {
            this.f70293b.nextBytes(this.f70299h);
            this.f70294c.write(this.f70299h);
            long j2 = 0;
            while (j2 < j) {
                int i3 = this.f70296e.read(this.f70300i, 0, (int) Math.min(j, this.f70300i.length));
                if (i3 == -1) {
                    shg0.m184191a();
                    return;
                }
                long j3 = i3;
                xjp0.m209733b(this.f70300i, j3, this.f70299h, j2);
                this.f70294c.write(this.f70300i, 0, i3);
                j2 += j3;
            }
        } else {
            this.f70294c.write(this.f70296e, j);
        }
        this.f70294c.emit();
    }

    /* JADX INFO: renamed from: e */
    public void m97167e(ByteString byteString) throws IOException {
        m97165c(9, byteString);
    }

    /* JADX INFO: renamed from: f */
    public void m97168f(ByteString byteString) throws IOException {
        m97165c(10, byteString);
    }
}
