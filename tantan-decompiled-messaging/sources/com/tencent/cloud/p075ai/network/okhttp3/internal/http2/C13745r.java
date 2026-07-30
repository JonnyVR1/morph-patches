package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.r */
/* JADX INFO: loaded from: classes13.dex */
public final class C13745r implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f56769g = Logger.getLogger(C13732e.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC13777f f56770a;

    /* JADX INFO: renamed from: b */
    public final boolean f56771b;

    /* JADX INFO: renamed from: c */
    public final C13776e f56772c;

    /* JADX INFO: renamed from: d */
    public int f56773d;

    /* JADX INFO: renamed from: e */
    public boolean f56774e;

    /* JADX INFO: renamed from: f */
    public final C13731d.b f56775f;

    public C13745r(InterfaceC13777f interfaceC13777f, boolean z) {
        this.f56770a = interfaceC13777f;
        this.f56771b = z;
        C13776e c13776e = new C13776e();
        this.f56772c = c13776e;
        this.f56775f = new C13731d.b(c13776e);
        this.f56773d = 16384;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m81774a(C13748u c13748u) {
        try {
            if (this.f56774e) {
                throw new IOException("closed");
            }
            int i = this.f56773d;
            int i2 = c13748u.f56784a;
            if ((i2 & 32) != 0) {
                i = c13748u.f56785b[5];
            }
            this.f56773d = i;
            if (((i2 & 2) != 0 ? c13748u.f56785b[1] : -1) != -1) {
                C13731d.b bVar = this.f56775f;
                int i3 = (i2 & 2) != 0 ? c13748u.f56785b[1] : -1;
                if (bVar == null) {
                    throw null;
                }
                int iMin = Math.min(i3, 16384);
                int i4 = bVar.f56644e;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        bVar.f56642c = Math.min(bVar.f56642c, iMin);
                    }
                    bVar.f56643d = true;
                    bVar.f56644e = iMin;
                    int i5 = bVar.f56648i;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            bVar.m81726a();
                        } else {
                            bVar.m81725a(i5 - iMin);
                        }
                    }
                }
            }
            m81770a(0, 0, (byte) 4, (byte) 1);
            this.f56770a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m81778b(int i, long j) {
        while (j > 0) {
            int iMin = (int) Math.min(this.f56773d, j);
            long j2 = iMin;
            j -= j2;
            m81770a(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f56770a.write(this.f56772c, j2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f56774e = true;
        this.f56770a.close();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m81772a(int i, EnumC13729b enumC13729b) {
        if (!this.f56774e) {
            if (enumC13729b.f56620a != -1) {
                m81770a(i, 4, (byte) 3, (byte) 0);
                this.f56770a.mo81919b(enumC13729b.f56620a);
                this.f56770a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m81776a(boolean z, int i, C13776e c13776e, int i2) {
        if (!this.f56774e) {
            m81770a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.f56770a.write(c13776e, i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m81775a(boolean z, int i, int i2) {
        if (!this.f56774e) {
            m81770a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f56770a.mo81919b(i);
            this.f56770a.mo81919b(i2);
            this.f56770a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m81773a(int i, EnumC13729b enumC13729b, byte[] bArr) {
        try {
            if (!this.f56774e) {
                if (enumC13729b.f56620a != -1) {
                    m81770a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f56770a.mo81919b(i);
                    this.f56770a.mo81919b(enumC13729b.f56620a);
                    if (bArr.length > 0) {
                        this.f56770a.mo81910a(bArr);
                    }
                    this.f56770a.flush();
                } else {
                    C13732e.m81731a("errorCode.httpCode == -1", new Object[0]);
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
    public synchronized void m81771a(int i, long j) {
        if (this.f56774e) {
            throw new IOException("closed");
        }
        if (j != 0 && j <= 2147483647L) {
            m81770a(i, 4, (byte) 8, (byte) 0);
            this.f56770a.mo81919b((int) j);
            this.f56770a.flush();
        } else {
            C13732e.m81731a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m81770a(int i, int i2, byte b, byte b2) {
        Logger logger = f56769g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C13732e.m81732a(false, i, i2, b, b2));
        }
        int i3 = this.f56773d;
        if (i2 > i3) {
            C13732e.m81731a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            InterfaceC13777f interfaceC13777f = this.f56770a;
            interfaceC13777f.mo81923c((i2 >>> 16) & 255);
            interfaceC13777f.mo81923c((i2 >>> 8) & 255);
            interfaceC13777f.mo81923c(i2 & 255);
            this.f56770a.mo81923c(b & 255);
            this.f56770a.mo81923c(b2 & 255);
            this.f56770a.mo81919b(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return;
        }
        C13732e.m81731a("reserved bit set: %s", Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m81777a(boolean z, int i, List<C13730c> list) {
        if (!this.f56774e) {
            this.f56775f.m81730a(list);
            long j = this.f56772c.f56970b;
            int iMin = (int) Math.min(this.f56773d, j);
            long j2 = iMin;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m81770a(i, iMin, (byte) 1, b);
            this.f56770a.write(this.f56772c, j2);
            if (j > j2) {
                m81778b(i, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
