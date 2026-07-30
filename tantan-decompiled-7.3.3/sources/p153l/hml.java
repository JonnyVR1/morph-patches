package p153l;

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
public final class hml implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f110633g = Logger.getLogger(cml.class.getName());

    /* JADX INFO: renamed from: a */
    public final BufferedSink f110634a;

    /* JADX INFO: renamed from: b */
    public final boolean f110635b;

    /* JADX INFO: renamed from: c */
    public final Buffer f110636c;

    /* JADX INFO: renamed from: d */
    public int f110637d;

    /* JADX INFO: renamed from: e */
    public boolean f110638e;

    /* JADX INFO: renamed from: f */
    public final zll.C21836b f110639f;

    public hml(BufferedSink bufferedSink, boolean z) {
        this.f110634a = bufferedSink;
        this.f110635b = z;
        Buffer buffer = new Buffer();
        this.f110636c = buffer;
        this.f110639f = new zll.C21836b(buffer);
        this.f110637d = 16384;
    }

    /* JADX INFO: renamed from: N */
    public static void m135923N(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m135924B(boolean z, int i, int i2) throws IOException {
        if (this.f110638e) {
            throw new IOException("closed");
        }
        m135934q(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f110634a.writeInt(i);
        this.f110634a.writeInt(i2);
        this.f110634a.flush();
    }

    /* JADX INFO: renamed from: F */
    public synchronized void m135925F(int i, int i2, List<xzk> list) throws IOException {
        if (this.f110638e) {
            throw new IOException("closed");
        }
        this.f110639f.m220290g(list);
        long size = this.f110636c.size();
        int iMin = (int) Math.min(this.f110637d - 4, size);
        long j = iMin;
        m135934q(i, iMin + 4, (byte) 5, size == j ? (byte) 4 : (byte) 0);
        this.f110634a.writeInt(i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f110634a.write(this.f110636c, j);
        if (size > j) {
            m135929M(i, size - j);
        }
    }

    /* JADX INFO: renamed from: H */
    public synchronized void m135926H(int i, ErrorCode errorCode) throws IOException {
        if (this.f110638e) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        m135934q(i, 4, (byte) 3, (byte) 0);
        this.f110634a.writeInt(errorCode.httpCode);
        this.f110634a.flush();
    }

    /* JADX INFO: renamed from: I */
    public synchronized void m135927I(vve0 vve0Var) throws IOException {
        int i;
        try {
            if (this.f110638e) {
                throw new IOException("closed");
            }
            int i2 = 0;
            m135934q(0, vve0Var.m203012j() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (vve0Var.m203009g(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.f110634a.writeShort(i);
                    this.f110634a.writeInt(vve0Var.m203004b(i2));
                }
                i2++;
            }
            this.f110634a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    public synchronized void m135928J(int i, long j) throws IOException {
        if (this.f110638e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw cml.m111284c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        m135934q(i, 4, (byte) 8, (byte) 0);
        this.f110634a.writeInt((int) j);
        this.f110634a.flush();
    }

    /* JADX INFO: renamed from: M */
    public final void m135929M(int i, long j) throws IOException {
        while (j > 0) {
            int iMin = (int) Math.min(this.f110637d, j);
            long j2 = iMin;
            j -= j2;
            m135934q(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f110634a.write(this.f110636c, j2);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m135930b(vve0 vve0Var) throws IOException {
        try {
            if (this.f110638e) {
                throw new IOException("closed");
            }
            this.f110637d = vve0Var.m203008f(this.f110637d);
            if (vve0Var.m203005c() != -1) {
                this.f110639f.m220288e(vve0Var.m203005c());
            }
            m135934q(0, 0, (byte) 4, (byte) 1);
            this.f110634a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f110638e = true;
        this.f110634a.close();
    }

    public synchronized void flush() throws IOException {
        if (this.f110638e) {
            throw new IOException("closed");
        }
        this.f110634a.flush();
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m135931k() throws IOException {
        try {
            if (this.f110638e) {
                throw new IOException("closed");
            }
            if (this.f110635b) {
                Logger logger = f110633g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(zlk0.m220255q(">> CONNECTION %s", cml.f82622a.hex()));
                }
                this.f110634a.write(cml.f82622a.toByteArray());
                this.f110634a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m135932m(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (this.f110638e) {
            throw new IOException("closed");
        }
        m135933n(i, z ? (byte) 1 : (byte) 0, buffer, i2);
    }

    /* JADX INFO: renamed from: n */
    public void m135933n(int i, byte b, Buffer buffer, int i2) throws IOException {
        m135934q(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f110634a.write(buffer, i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m135934q(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f110633g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(cml.m111283b(false, i, i2, b, b2));
        }
        int i3 = this.f110637d;
        if (i2 > i3) {
            throw cml.m111284c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw cml.m111284c("reserved bit set: %s", Integer.valueOf(i));
        }
        m135923N(this.f110634a, i2);
        this.f110634a.writeByte(b & 255);
        this.f110634a.writeByte(b2 & 255);
        this.f110634a.writeInt(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m135935t(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        try {
            if (this.f110638e) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode == -1) {
                throw cml.m111284c("errorCode.httpCode == -1", new Object[0]);
            }
            m135934q(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f110634a.writeInt(i);
            this.f110634a.writeInt(errorCode.httpCode);
            if (bArr.length > 0) {
                this.f110634a.write(bArr);
            }
            this.f110634a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m135936u(boolean z, int i, List<xzk> list) throws IOException {
        if (this.f110638e) {
            throw new IOException("closed");
        }
        this.f110639f.m220290g(list);
        long size = this.f110636c.size();
        int iMin = (int) Math.min(this.f110637d, size);
        long j = iMin;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m135934q(i, iMin, (byte) 1, b);
        this.f110634a.write(this.f110636c, j);
        if (size > j) {
            m135929M(i, size - j);
        }
    }

    /* JADX INFO: renamed from: v */
    public int m135937v() {
        return this.f110637d;
    }
}
