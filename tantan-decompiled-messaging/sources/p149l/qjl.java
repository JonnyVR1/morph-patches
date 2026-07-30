package p149l;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes2.dex */
public final class qjl implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f154945g = Logger.getLogger(ljl.class.getName());

    /* JADX INFO: renamed from: a */
    public final BufferedSink f154946a;

    /* JADX INFO: renamed from: b */
    public final boolean f154947b;

    /* JADX INFO: renamed from: c */
    public final Buffer f154948c;

    /* JADX INFO: renamed from: d */
    public int f154949d;

    /* JADX INFO: renamed from: e */
    public boolean f154950e;

    /* JADX INFO: renamed from: f */
    public final ijl.C17566b f154951f;

    public qjl(BufferedSink bufferedSink, boolean z) {
        this.f154946a = bufferedSink;
        this.f154947b = z;
        Buffer buffer = new Buffer();
        this.f154948c = buffer;
        this.f154951f = new ijl.C17566b(buffer);
        this.f154949d = 16384;
    }

    /* JADX INFO: renamed from: N */
    public static void m175001N(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m175002B(boolean z, int i, int i2) throws IOException {
        if (this.f154950e) {
            throw new IOException("closed");
        }
        m175012q(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f154946a.writeInt(i);
        this.f154946a.writeInt(i2);
        this.f154946a.flush();
    }

    /* JADX INFO: renamed from: F */
    public synchronized void m175003F(int i, int i2, List<hxk> list) throws IOException {
        if (this.f154950e) {
            throw new IOException("closed");
        }
        this.f154951f.m136651g(list);
        long size = this.f154948c.size();
        int iMin = (int) Math.min(this.f154949d - 4, size);
        long j = iMin;
        m175012q(i, iMin + 4, (byte) 5, size == j ? (byte) 4 : (byte) 0);
        this.f154946a.writeInt(i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f154946a.write(this.f154948c, j);
        if (size > j) {
            m175007M(i, size - j);
        }
    }

    /* JADX INFO: renamed from: H */
    public synchronized void m175004H(int i, ErrorCode errorCode) throws IOException {
        if (this.f154950e) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        m175012q(i, 4, (byte) 3, (byte) 0);
        this.f154946a.writeInt(errorCode.httpCode);
        this.f154946a.flush();
    }

    /* JADX INFO: renamed from: I */
    public synchronized void m175005I(one0 one0Var) throws IOException {
        int i;
        try {
            if (this.f154950e) {
                throw new IOException("closed");
            }
            int i2 = 0;
            m175012q(0, one0Var.m165179j() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (one0Var.m165176g(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.f154946a.writeShort(i);
                    this.f154946a.writeInt(one0Var.m165171b(i2));
                }
                i2++;
            }
            this.f154946a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    public synchronized void m175006J(int i, long j) throws IOException {
        if (this.f154950e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw ljl.m149984c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        m175012q(i, 4, (byte) 8, (byte) 0);
        this.f154946a.writeInt((int) j);
        this.f154946a.flush();
    }

    /* JADX INFO: renamed from: M */
    public final void m175007M(int i, long j) throws IOException {
        while (j > 0) {
            int iMin = (int) Math.min(this.f154949d, j);
            long j2 = iMin;
            j -= j2;
            m175012q(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f154946a.write(this.f154948c, j2);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m175008b(one0 one0Var) throws IOException {
        try {
            if (this.f154950e) {
                throw new IOException("closed");
            }
            this.f154949d = one0Var.m165175f(this.f154949d);
            if (one0Var.m165172c() != -1) {
                this.f154951f.m136649e(one0Var.m165172c());
            }
            m175012q(0, 0, (byte) 4, (byte) 1);
            this.f154946a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f154950e = true;
        this.f154946a.close();
    }

    public synchronized void flush() throws IOException {
        if (this.f154950e) {
            throw new IOException("closed");
        }
        this.f154946a.flush();
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m175009k() throws IOException {
        try {
            if (this.f154950e) {
                throw new IOException("closed");
            }
            if (this.f154947b) {
                Logger logger = f154945g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(tck0.m188016q(">> CONNECTION %s", ljl.f128336a.hex()));
                }
                this.f154946a.write(ljl.f128336a.toByteArray());
                this.f154946a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m175010m(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (this.f154950e) {
            throw new IOException("closed");
        }
        m175011n(i, z ? (byte) 1 : (byte) 0, buffer, i2);
    }

    /* JADX INFO: renamed from: n */
    public void m175011n(int i, byte b, Buffer buffer, int i2) throws IOException {
        m175012q(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f154946a.write(buffer, i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m175012q(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f154945g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(ljl.m149983b(false, i, i2, b, b2));
        }
        int i3 = this.f154949d;
        if (i2 > i3) {
            throw ljl.m149984c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw ljl.m149984c("reserved bit set: %s", Integer.valueOf(i));
        }
        m175001N(this.f154946a, i2);
        this.f154946a.writeByte(b & 255);
        this.f154946a.writeByte(b2 & 255);
        this.f154946a.writeInt(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m175013t(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        try {
            if (this.f154950e) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode == -1) {
                throw ljl.m149984c("errorCode.httpCode == -1", new Object[0]);
            }
            m175012q(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f154946a.writeInt(i);
            this.f154946a.writeInt(errorCode.httpCode);
            if (bArr.length > 0) {
                this.f154946a.write(bArr);
            }
            this.f154946a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m175014u(boolean z, int i, List<hxk> list) throws IOException {
        if (this.f154950e) {
            throw new IOException("closed");
        }
        this.f154951f.m136651g(list);
        long size = this.f154948c.size();
        int iMin = (int) Math.min(this.f154949d, size);
        long j = iMin;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m175012q(i, iMin, (byte) 1, b);
        this.f154946a.write(this.f154948c, j);
        if (size > j) {
            m175007M(i, size - j);
        }
    }

    /* JADX INFO: renamed from: v */
    public int m175015v() {
        return this.f154949d;
    }
}
