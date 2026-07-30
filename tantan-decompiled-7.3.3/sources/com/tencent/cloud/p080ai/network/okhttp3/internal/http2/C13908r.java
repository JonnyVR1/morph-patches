package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.r */
/* JADX INFO: loaded from: classes12.dex */
public final class C13908r implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f57617g = Logger.getLogger(C13895e.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC13940f f57618a;

    /* JADX INFO: renamed from: b */
    public final boolean f57619b;

    /* JADX INFO: renamed from: c */
    public final C13939e f57620c;

    /* JADX INFO: renamed from: d */
    public int f57621d;

    /* JADX INFO: renamed from: e */
    public boolean f57622e;

    /* JADX INFO: renamed from: f */
    public final C13894d.b f57623f;

    public C13908r(InterfaceC13940f interfaceC13940f, boolean z) {
        this.f57618a = interfaceC13940f;
        this.f57619b = z;
        C13939e c13939e = new C13939e();
        this.f57620c = c13939e;
        this.f57623f = new C13894d.b(c13939e);
        this.f57621d = 16384;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82957a(C13911u c13911u) {
        try {
            if (this.f57622e) {
                throw new IOException("closed");
            }
            int i = this.f57621d;
            int i2 = c13911u.f57632a;
            if ((i2 & 32) != 0) {
                i = c13911u.f57633b[5];
            }
            this.f57621d = i;
            if (((i2 & 2) != 0 ? c13911u.f57633b[1] : -1) != -1) {
                C13894d.b bVar = this.f57623f;
                int i3 = (i2 & 2) != 0 ? c13911u.f57633b[1] : -1;
                if (bVar == null) {
                    throw null;
                }
                int iMin = Math.min(i3, 16384);
                int i4 = bVar.f57492e;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        bVar.f57490c = Math.min(bVar.f57490c, iMin);
                    }
                    bVar.f57491d = true;
                    bVar.f57492e = iMin;
                    int i5 = bVar.f57496i;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            bVar.m82909a();
                        } else {
                            bVar.m82908a(i5 - iMin);
                        }
                    }
                }
            }
            m82953a(0, 0, (byte) 4, (byte) 1);
            this.f57618a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m82961b(int i, long j) {
        while (j > 0) {
            int iMin = (int) Math.min(this.f57621d, j);
            long j2 = iMin;
            j -= j2;
            m82953a(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f57618a.write(this.f57620c, j2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f57622e = true;
        this.f57618a.close();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82955a(int i, EnumC13892b enumC13892b) {
        if (!this.f57622e) {
            if (enumC13892b.f57468a != -1) {
                m82953a(i, 4, (byte) 3, (byte) 0);
                this.f57618a.mo83102b(enumC13892b.f57468a);
                this.f57618a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82959a(boolean z, int i, C13939e c13939e, int i2) {
        if (!this.f57622e) {
            m82953a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.f57618a.write(c13939e, i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82958a(boolean z, int i, int i2) {
        if (!this.f57622e) {
            m82953a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f57618a.mo83102b(i);
            this.f57618a.mo83102b(i2);
            this.f57618a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82956a(int i, EnumC13892b enumC13892b, byte[] bArr) {
        try {
            if (!this.f57622e) {
                if (enumC13892b.f57468a != -1) {
                    m82953a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f57618a.mo83102b(i);
                    this.f57618a.mo83102b(enumC13892b.f57468a);
                    if (bArr.length > 0) {
                        this.f57618a.mo83093a(bArr);
                    }
                    this.f57618a.flush();
                } else {
                    C13895e.m82914a("errorCode.httpCode == -1", new Object[0]);
                    throw null;
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82954a(int i, long j) {
        if (this.f57622e) {
            throw new IOException("closed");
        }
        if (j != 0 && j <= 2147483647L) {
            m82953a(i, 4, (byte) 8, (byte) 0);
            this.f57618a.mo83102b((int) j);
            this.f57618a.flush();
        } else {
            C13895e.m82914a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82953a(int i, int i2, byte b, byte b2) {
        Logger logger = f57617g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C13895e.m82915a(false, i, i2, b, b2));
        }
        int i3 = this.f57621d;
        if (i2 > i3) {
            C13895e.m82914a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            InterfaceC13940f interfaceC13940f = this.f57618a;
            interfaceC13940f.mo83106c((i2 >>> 16) & 255);
            interfaceC13940f.mo83106c((i2 >>> 8) & 255);
            interfaceC13940f.mo83106c(i2 & 255);
            this.f57618a.mo83106c(b & 255);
            this.f57618a.mo83106c(b2 & 255);
            this.f57618a.mo83102b(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return;
        }
        C13895e.m82914a("reserved bit set: %s", Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82960a(boolean z, int i, List<C13893c> list) {
        if (!this.f57622e) {
            this.f57623f.m82913a(list);
            long j = this.f57620c.f57818b;
            int iMin = (int) Math.min(this.f57621d, j);
            long j2 = iMin;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m82953a(i, iMin, (byte) 1, b);
            this.f57618a.write(this.f57620c, j2);
            if (j > j2) {
                m82961b(i, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
