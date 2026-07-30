package p153l;

import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes2.dex */
public final class ftp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f100772a;

    /* JADX INFO: renamed from: b */
    public final Random f100773b;

    /* JADX INFO: renamed from: c */
    public final BufferedSink f100774c;

    /* JADX INFO: renamed from: d */
    public final Buffer f100775d;

    /* JADX INFO: renamed from: e */
    public boolean f100776e;

    /* JADX INFO: renamed from: f */
    public final Buffer f100777f = new Buffer();

    /* JADX INFO: renamed from: g */
    public final C17071a f100778g = new C17071a();

    /* JADX INFO: renamed from: h */
    public boolean f100779h;

    /* JADX INFO: renamed from: i */
    public final byte[] f100780i;

    /* JADX INFO: renamed from: j */
    public final Buffer.UnsafeCursor f100781j;

    /* JADX INFO: renamed from: l.ftp0$a */
    public final class C17071a implements Sink {

        /* JADX INFO: renamed from: a */
        public int f100782a;

        /* JADX INFO: renamed from: b */
        public long f100783b;

        /* JADX INFO: renamed from: c */
        public boolean f100784c;

        /* JADX INFO: renamed from: d */
        public boolean f100785d;

        public C17071a() {
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f100785d) {
                zpg0.m220844a("closed");
                return;
            }
            ftp0 ftp0Var = ftp0.this;
            ftp0Var.m127383d(this.f100782a, ftp0Var.f100777f.size(), this.f100784c, true);
            this.f100785d = true;
            ftp0.this.f100779h = false;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f100785d) {
                zpg0.m220844a("closed");
                return;
            }
            ftp0 ftp0Var = ftp0.this;
            ftp0Var.m127383d(this.f100782a, ftp0Var.f100777f.size(), this.f100784c, false);
            this.f100784c = false;
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return ftp0.this.f100774c.getTimeout();
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f100785d) {
                zpg0.m220844a("closed");
                return;
            }
            ftp0.this.f100777f.write(buffer, j);
            boolean z = this.f100784c && this.f100783b != -1 && ftp0.this.f100777f.size() > this.f100783b - 8192;
            long jCompleteSegmentByteCount = ftp0.this.f100777f.completeSegmentByteCount();
            if (jCompleteSegmentByteCount <= 0 || z) {
                return;
            }
            ftp0.this.m127383d(this.f100782a, jCompleteSegmentByteCount, this.f100784c, false);
            this.f100784c = false;
        }
    }

    public ftp0(boolean z, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            mnd0.m159157a("sink == null");
            throw null;
        }
        if (random == null) {
            mnd0.m159157a("random == null");
            throw null;
        }
        this.f100772a = z;
        this.f100774c = bufferedSink;
        this.f100775d = bufferedSink.getBufferField();
        this.f100773b = random;
        this.f100780i = z ? new byte[4] : null;
        this.f100781j = z ? new Buffer.UnsafeCursor() : null;
    }

    /* JADX INFO: renamed from: a */
    public Sink m127380a(int i, long j) {
        if (this.f100779h) {
            wtq0.m207906a("Another message writer is active. Did you call close()?");
            return null;
        }
        this.f100779h = true;
        C17071a c17071a = this.f100778g;
        c17071a.f100782a = i;
        c17071a.f100783b = j;
        c17071a.f100784c = true;
        c17071a.f100785d = false;
        return c17071a;
    }

    /* JADX INFO: renamed from: b */
    public void m127381b(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                atp0.m100226c(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            m127382c(8, byteString2);
        } finally {
            this.f100776e = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m127382c(int i, ByteString byteString) throws IOException {
        if (this.f100776e) {
            zpg0.m220844a("closed");
            return;
        }
        int size = byteString.size();
        if (size > 125) {
            wg3.m206174a("Payload size must be less than or equal to 125");
            return;
        }
        this.f100775d.writeByte(i | 128);
        boolean z = this.f100772a;
        Buffer buffer = this.f100775d;
        if (z) {
            buffer.writeByte(size | 128);
            this.f100773b.nextBytes(this.f100780i);
            this.f100775d.write(this.f100780i);
            if (size > 0) {
                long size2 = this.f100775d.size();
                this.f100775d.write(byteString);
                this.f100775d.readAndWriteUnsafe(this.f100781j);
                this.f100781j.seek(size2);
                atp0.m100225b(this.f100781j, this.f100780i);
                this.f100781j.close();
            }
        } else {
            buffer.writeByte(size);
            this.f100775d.write(byteString);
        }
        this.f100774c.flush();
    }

    /* JADX INFO: renamed from: d */
    public void m127383d(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f100776e) {
            zpg0.m220844a("closed");
            return;
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f100775d.writeByte(i);
        int i2 = this.f100772a ? 128 : 0;
        if (j <= 125) {
            this.f100775d.writeByte(((int) j) | i2);
        } else {
            Buffer buffer = this.f100775d;
            if (j <= 65535) {
                buffer.writeByte(i2 | 126);
                this.f100775d.writeShort((int) j);
            } else {
                buffer.writeByte(i2 | 127);
                this.f100775d.writeLong(j);
            }
        }
        if (this.f100772a) {
            this.f100773b.nextBytes(this.f100780i);
            this.f100775d.write(this.f100780i);
            if (j > 0) {
                long size = this.f100775d.size();
                this.f100775d.write(this.f100777f, j);
                this.f100775d.readAndWriteUnsafe(this.f100781j);
                this.f100781j.seek(size);
                atp0.m100225b(this.f100781j, this.f100780i);
                this.f100781j.close();
            }
        } else {
            this.f100775d.write(this.f100777f, j);
        }
        this.f100774c.emit();
    }

    /* JADX INFO: renamed from: e */
    public void m127384e(ByteString byteString) throws IOException {
        m127382c(9, byteString);
    }

    /* JADX INFO: renamed from: f */
    public void m127385f(ByteString byteString) throws IOException {
        m127382c(10, byteString);
    }
}
