package p153l;

import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes9.dex */
public class etp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f95782a;

    /* JADX INFO: renamed from: b */
    public final Random f95783b;

    /* JADX INFO: renamed from: c */
    public final BufferedSink f95784c;

    /* JADX INFO: renamed from: d */
    public boolean f95785d;

    /* JADX INFO: renamed from: e */
    public final Buffer f95786e = new Buffer();

    /* JADX INFO: renamed from: f */
    public final C16829a f95787f = new C16829a();

    /* JADX INFO: renamed from: g */
    public boolean f95788g;

    /* JADX INFO: renamed from: h */
    public final byte[] f95789h;

    /* JADX INFO: renamed from: i */
    public final byte[] f95790i;

    /* JADX INFO: renamed from: l.etp0$a */
    public final class C16829a implements Sink {

        /* JADX INFO: renamed from: a */
        public int f95791a;

        /* JADX INFO: renamed from: b */
        public long f95792b;

        /* JADX INFO: renamed from: c */
        public boolean f95793c;

        /* JADX INFO: renamed from: d */
        public boolean f95794d;

        public C16829a() {
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f95794d) {
                zpg0.m220844a("closed");
                return;
            }
            etp0 etp0Var = etp0.this;
            etp0Var.m122486d(this.f95791a, etp0Var.f95786e.size(), this.f95793c, true);
            this.f95794d = true;
            etp0.this.f95788g = false;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f95794d) {
                zpg0.m220844a("closed");
                return;
            }
            etp0 etp0Var = etp0.this;
            etp0Var.m122486d(this.f95791a, etp0Var.f95786e.size(), this.f95793c, false);
            this.f95793c = false;
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return etp0.this.f95784c.getTimeout();
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f95794d) {
                zpg0.m220844a("closed");
                return;
            }
            etp0.this.f95786e.write(buffer, j);
            boolean z = this.f95793c && this.f95792b != -1 && etp0.this.f95786e.size() > this.f95792b - 8192;
            long jCompleteSegmentByteCount = etp0.this.f95786e.completeSegmentByteCount();
            if (jCompleteSegmentByteCount <= 0 || z) {
                return;
            }
            etp0.this.m122486d(this.f95791a, jCompleteSegmentByteCount, this.f95793c, false);
            this.f95793c = false;
        }
    }

    public etp0(boolean z, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            mnd0.m159157a("sink == null");
            throw null;
        }
        if (random == null) {
            mnd0.m159157a("random == null");
            throw null;
        }
        this.f95782a = z;
        this.f95784c = bufferedSink;
        this.f95783b = random;
        this.f95789h = z ? new byte[4] : null;
        this.f95790i = z ? new byte[8192] : null;
    }

    /* JADX INFO: renamed from: a */
    public Sink m122483a(int i, long j) {
        if (this.f95788g) {
            wtq0.m207906a("Another message writer is active. Did you call close()?");
            return null;
        }
        this.f95788g = true;
        C16829a c16829a = this.f95787f;
        c16829a.f95791a = i;
        c16829a.f95792b = j;
        c16829a.f95793c = true;
        c16829a.f95794d = false;
        return c16829a;
    }

    /* JADX INFO: renamed from: b */
    public void m122484b(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                btp0.m106377c(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            m122485c(8, byteString2);
        } finally {
            this.f95785d = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m122485c(int i, ByteString byteString) throws IOException {
        if (this.f95785d) {
            zpg0.m220844a("closed");
            return;
        }
        int size = byteString.size();
        if (size > 125) {
            wg3.m206174a("Payload size must be less than or equal to 125");
            return;
        }
        this.f95784c.writeByte(i | 128);
        boolean z = this.f95782a;
        BufferedSink bufferedSink = this.f95784c;
        if (z) {
            bufferedSink.writeByte(size | 128);
            this.f95783b.nextBytes(this.f95789h);
            this.f95784c.write(this.f95789h);
            byte[] byteArray = byteString.toByteArray();
            btp0.m106376b(byteArray, byteArray.length, this.f95789h, 0L);
            this.f95784c.write(byteArray);
        } else {
            bufferedSink.writeByte(size);
            this.f95784c.write(byteString);
        }
        this.f95784c.flush();
    }

    /* JADX INFO: renamed from: d */
    public void m122486d(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f95785d) {
            zpg0.m220844a("closed");
            return;
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f95784c.writeByte(i);
        int i2 = this.f95782a ? 128 : 0;
        if (j <= 125) {
            this.f95784c.writeByte(i2 | ((int) j));
        } else {
            BufferedSink bufferedSink = this.f95784c;
            if (j <= 65535) {
                bufferedSink.writeByte(i2 | 126);
                this.f95784c.writeShort((int) j);
            } else {
                bufferedSink.writeByte(i2 | 127);
                this.f95784c.writeLong(j);
            }
        }
        if (this.f95782a) {
            this.f95783b.nextBytes(this.f95789h);
            this.f95784c.write(this.f95789h);
            long j2 = 0;
            while (j2 < j) {
                int i3 = this.f95786e.read(this.f95790i, 0, (int) Math.min(j, this.f95790i.length));
                if (i3 == -1) {
                    aqg0.m99478a();
                    return;
                }
                long j3 = i3;
                btp0.m106376b(this.f95790i, j3, this.f95789h, j2);
                this.f95784c.write(this.f95790i, 0, i3);
                j2 += j3;
            }
        } else {
            this.f95784c.write(this.f95786e, j);
        }
        this.f95784c.emit();
    }

    /* JADX INFO: renamed from: e */
    public void m122487e(ByteString byteString) throws IOException {
        m122485c(9, byteString);
    }

    /* JADX INFO: renamed from: f */
    public void m122488f(ByteString byteString) throws IOException {
        m122485c(10, byteString);
    }
}
