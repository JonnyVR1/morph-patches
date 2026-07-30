package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13896f.f;
import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.C13958x;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.http.HttpTokens;
import p153l.aqg0;
import p153l.p3r0;
import p153l.vg3;
import p153l.yll;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.p */
/* JADX INFO: loaded from: classes12.dex */
public final class C13906p implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final Logger f57579e = Logger.getLogger(C13895e.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC13941g f57580a;

    /* JADX INFO: renamed from: b */
    public final a f57581b;

    /* JADX INFO: renamed from: c */
    public final boolean f57582c;

    /* JADX INFO: renamed from: d */
    public final C13894d.a f57583d;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.p$a */
    public static final class a implements InterfaceC13957w {

        /* JADX INFO: renamed from: a */
        public final InterfaceC13941g f57584a;

        /* JADX INFO: renamed from: b */
        public int f57585b;

        /* JADX INFO: renamed from: c */
        public byte f57586c;

        /* JADX INFO: renamed from: d */
        public int f57587d;

        /* JADX INFO: renamed from: e */
        public int f57588e;

        /* JADX INFO: renamed from: f */
        public short f57589f;

        public a(InterfaceC13941g interfaceC13941g) {
            this.f57584a = interfaceC13941g;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        /* JADX INFO: renamed from: a */
        public long mo82814a(C13939e c13939e, long j) throws IOException {
            int i;
            int i2;
            do {
                int i3 = this.f57588e;
                InterfaceC13941g interfaceC13941g = this.f57584a;
                if (i3 != 0) {
                    long jMo82814a = interfaceC13941g.mo82814a(c13939e, Math.min(j, i3));
                    if (jMo82814a == -1) {
                        return -1L;
                    }
                    this.f57588e = (int) (((long) this.f57588e) - jMo82814a);
                    return jMo82814a;
                }
                interfaceC13941g.mo83110d(this.f57589f);
                this.f57589f = (short) 0;
                if ((this.f57586c & 4) != 0) {
                    return -1L;
                }
                i = this.f57587d;
                int iM82928a = C13906p.m82928a(this.f57584a);
                this.f57588e = iM82928a;
                this.f57585b = iM82928a;
                byte b = (byte) (this.f57584a.readByte() & 255);
                this.f57586c = (byte) (this.f57584a.readByte() & 255);
                Logger logger = C13906p.f57579e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C13895e.m82915a(true, this.f57587d, this.f57585b, b, this.f57586c));
                }
                i2 = this.f57584a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                this.f57587d = i2;
                if (b != 9) {
                    C13895e.m82916b("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                    throw null;
                }
            } while (i2 == i);
            C13895e.m82916b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        public C13958x timeout() {
            return this.f57584a.timeout();
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.p$b */
    public interface b {
    }

    public C13906p(InterfaceC13941g interfaceC13941g, boolean z) {
        this.f57580a = interfaceC13941g;
        this.f57582c = z;
        a aVar = new a(interfaceC13941g);
        this.f57581b = aVar;
        this.f57583d = new C13894d.a(4096, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x029d  */
    /* JADX INFO: renamed from: a */
    public boolean m82934a(boolean z, b bVar) throws IOException {
        boolean z2;
        C13907q c13907q;
        boolean z3;
        boolean z4;
        long j;
        try {
            this.f57580a.mo83116f(9L);
            int iM82928a = m82928a(this.f57580a);
            if (iM82928a < 0 || iM82928a > 16384) {
                C13895e.m82916b("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM82928a));
                throw null;
            }
            byte b2 = (byte) (this.f57580a.readByte() & 255);
            if (z && b2 != 4) {
                C13895e.m82916b("Expected a SETTINGS frame but was %s", Byte.valueOf(b2));
                throw null;
            }
            byte b3 = (byte) (this.f57580a.readByte() & 255);
            int i = this.f57580a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Logger logger = f57579e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C13895e.m82915a(true, i, iM82928a, b2, b3));
            }
            switch (b2) {
                case 0:
                    if (i == 0) {
                        C13895e.m82916b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z5 = (b3 & 1) != 0;
                    if ((b3 & HttpTokens.SPACE) != 0) {
                        C13895e.m82916b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    short s = (b3 & 8) != 0 ? (short) (this.f57580a.readByte() & 255) : (short) 0;
                    int iM82927a = m82927a(iM82928a, b3, s);
                    InterfaceC13941g interfaceC13941g = this.f57580a;
                    C13896f.g gVar = (C13896f.g) bVar;
                    boolean zM82924d = C13896f.this.m82924d(i);
                    C13896f c13896f = C13896f.this;
                    if (zM82924d) {
                        c13896f.getClass();
                        C13939e c13939e = new C13939e();
                        long j2 = iM82927a;
                        interfaceC13941g.mo83116f(j2);
                        interfaceC13941g.mo82814a(c13939e, j2);
                        if (c13939e.f57818b != j2) {
                            throw new IOException(c13939e.f57818b + " != " + iM82927a);
                        }
                        z2 = true;
                        C13900j c13900j = new C13900j(c13896f, "OkHttp %s Push Data[%s]", new Object[]{c13896f.f57506d, Integer.valueOf(i)}, i, c13939e, iM82927a, z5);
                        synchronized (c13896f) {
                            if (!c13896f.f57509g) {
                                c13896f.f57511i.execute(c13900j);
                            }
                            break;
                        }
                    } else {
                        z2 = true;
                        synchronized (c13896f) {
                            c13907q = c13896f.f57505c.get(Integer.valueOf(i));
                        }
                        if (c13907q == null) {
                            C13896f.this.m82919a(i, EnumC13892b.PROTOCOL_ERROR);
                            long j3 = iM82927a;
                            C13896f.this.m82926h(j3);
                            interfaceC13941g.mo83110d(j3);
                        } else {
                            if (!C13907q.f57590m && Thread.holdsLock(c13907q)) {
                                aqg0.m99478a();
                                return false;
                            }
                            C13907q.b bVar2 = c13907q.f57597g;
                            long j4 = iM82927a;
                            bVar2.getClass();
                            if (!C13907q.b.f57608h && Thread.holdsLock(C13907q.this)) {
                                aqg0.m99478a();
                                return false;
                            }
                            while (j4 > 0) {
                                synchronized (C13907q.this) {
                                    z3 = bVar2.f57614f;
                                    z4 = bVar2.f57610b.f57818b + j4 > bVar2.f57611c;
                                    break;
                                }
                                if (z4) {
                                    interfaceC13941g.mo83110d(j4);
                                    C13907q.this.m82940a(EnumC13892b.FLOW_CONTROL_ERROR);
                                } else if (z3) {
                                    interfaceC13941g.mo83110d(j4);
                                } else {
                                    long jMo82814a = interfaceC13941g.mo82814a(bVar2.f57609a, j4);
                                    if (jMo82814a == -1) {
                                        vg3.m201207a();
                                        return false;
                                    }
                                    j4 -= jMo82814a;
                                    synchronized (C13907q.this) {
                                        try {
                                            if (bVar2.f57613e) {
                                                C13939e c13939e2 = bVar2.f57609a;
                                                j = c13939e2.f57818b;
                                                c13939e2.m83127k();
                                            } else {
                                                C13939e c13939e3 = bVar2.f57610b;
                                                boolean z6 = c13939e3.f57818b == 0;
                                                c13939e3.m83084a(bVar2.f57609a);
                                                if (z6) {
                                                    C13907q.this.notifyAll();
                                                }
                                                j = 0;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (j > 0) {
                                        bVar2.m82950h(j);
                                    }
                                }
                                if (z5) {
                                    c13907q.m82942a(C13869c.f57304b, true);
                                }
                            }
                            if (z5) {
                                c13907q.m82942a(C13869c.f57304b, true);
                            }
                        }
                    }
                    this.f57580a.mo83110d(s);
                    return z2;
                case 1:
                    m82932a(bVar, iM82928a, b3, i);
                    break;
                case 2:
                    if (iM82928a != 5) {
                        C13895e.m82916b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM82928a));
                        throw null;
                    }
                    if (i == 0) {
                        C13895e.m82916b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    m82931a(bVar, i);
                    break;
                    break;
                case 3:
                    m82936b(bVar, iM82928a, i);
                    break;
                case 4:
                    if (i != 0) {
                        C13895e.m82916b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b3 & 1) == 0) {
                        if (iM82928a % 6 != 0) {
                            C13895e.m82916b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iM82928a));
                            throw null;
                        }
                        C13911u c13911u = new C13911u();
                        for (int i2 = 0; i2 < iM82928a; i2 += 6) {
                            int i3 = this.f57580a.readShort() & 65535;
                            int i4 = this.f57580a.readInt();
                            if (i3 == 2) {
                                if (i4 != 0 && i4 != 1) {
                                    C13895e.m82916b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                            } else if (i3 == 3) {
                                i3 = 4;
                            } else if (i3 != 4) {
                                if (i3 == 5 && (i4 < 16384 || i4 > 16777215)) {
                                    C13895e.m82916b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i4));
                                    throw null;
                                }
                            } else {
                                if (i4 < 0) {
                                    C13895e.m82916b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                                i3 = 7;
                            }
                            c13911u.m82964a(i3, i4);
                        }
                        C13896f.g gVar2 = (C13896f.g) bVar;
                        gVar2.getClass();
                        try {
                            C13896f c13896f2 = C13896f.this;
                            c13896f2.f57510h.execute(new C13903m(gVar2, "OkHttp %s ACK Settings", new Object[]{c13896f2.f57506d}, false, c13911u));
                        } catch (RejectedExecutionException unused) {
                        }
                    } else {
                        if (iM82928a != 0) {
                            C13895e.m82916b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                        ((C13896f.g) bVar).getClass();
                    }
                    break;
                    break;
                case 5:
                    m82937c(bVar, iM82928a, b3, i);
                    break;
                case 6:
                    m82935b(bVar, iM82928a, b3, i);
                    break;
                case 7:
                    m82933a(bVar, iM82928a, i);
                    break;
                case 8:
                    m82938c(bVar, iM82928a, i);
                    break;
                default:
                    this.f57580a.mo83110d(iM82928a);
                    break;
            }
            return true;
        } catch (EOFException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m82936b(b bVar, int i, int i2) throws IOException {
        C13907q c13907qRemove;
        if (i != 4) {
            C13895e.m82916b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            C13895e.m82916b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int i3 = this.f57580a.readInt();
        EnumC13892b enumC13892bM82899a = EnumC13892b.m82899a(i3);
        if (enumC13892bM82899a == null) {
            C13895e.m82916b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
            throw null;
        }
        C13896f.g gVar = (C13896f.g) bVar;
        boolean zM82924d = C13896f.this.m82924d(i2);
        C13896f c13896f = C13896f.this;
        if (zM82924d) {
            C13901k c13901k = new C13901k(c13896f, "OkHttp %s Push Reset[%s]", new Object[]{c13896f.f57506d, Integer.valueOf(i2)}, i2, enumC13892bM82899a);
            synchronized (c13896f) {
                if (!c13896f.f57509g) {
                    c13896f.f57511i.execute(c13901k);
                }
            }
            return;
        }
        synchronized (c13896f) {
            c13907qRemove = c13896f.f57505c.remove(Integer.valueOf(i2));
            c13896f.notifyAll();
        }
        if (c13907qRemove != null) {
            synchronized (c13907qRemove) {
                if (c13907qRemove.f57601k == null) {
                    c13907qRemove.f57601k = enumC13892bM82899a;
                    c13907qRemove.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m82937c(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            C13895e.m82916b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s = (b2 & 8) != 0 ? (short) (this.f57580a.readByte() & 255) : (short) 0;
        int i3 = this.f57580a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        List<C13893c> listM82929a = m82929a(m82927a(i - 4, b2, s), s, b2, i2);
        C13896f c13896f = C13896f.this;
        synchronized (c13896f) {
            try {
                if (c13896f.f57526x.contains(Integer.valueOf(i3))) {
                    c13896f.m82919a(i3, EnumC13892b.PROTOCOL_ERROR);
                    return;
                }
                c13896f.f57526x.add(Integer.valueOf(i3));
                try {
                    C13898h c13898h = new C13898h(c13896f, "OkHttp %s Push Request[%s]", new Object[]{c13896f.f57506d, Integer.valueOf(i3)}, i3, listM82929a);
                    synchronized (c13896f) {
                        if (!c13896f.f57509g) {
                            c13896f.f57511i.execute(c13898h);
                        }
                    }
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57580a.close();
    }

    /* JADX INFO: renamed from: c */
    public final void m82938c(b bVar, int i, int i2) throws IOException {
        C13907q c13907q;
        if (i == 4) {
            long j = ((long) this.f57580a.readInt()) & 2147483647L;
            if (j != 0) {
                C13896f.g gVar = (C13896f.g) bVar;
                if (i2 == 0) {
                    synchronized (C13896f.this) {
                        C13896f c13896f = C13896f.this;
                        c13896f.f57520r += j;
                        c13896f.notifyAll();
                    }
                    return;
                }
                C13896f c13896f2 = C13896f.this;
                synchronized (c13896f2) {
                    c13907q = c13896f2.f57505c.get(Integer.valueOf(i2));
                }
                if (c13907q != null) {
                    synchronized (c13907q) {
                        try {
                            c13907q.f57592b += j;
                            if (j > 0) {
                                c13907q.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            }
            C13895e.m82916b("windowSizeIncrement was 0", Long.valueOf(j));
            throw null;
        }
        C13895e.m82916b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m82935b(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 8) {
            C13895e.m82916b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            int i3 = this.f57580a.readInt();
            int i4 = this.f57580a.readInt();
            boolean z = (b2 & 1) != 0;
            C13896f.g gVar = (C13896f.g) bVar;
            gVar.getClass();
            C13896f c13896f = C13896f.this;
            if (z) {
                synchronized (c13896f) {
                    try {
                        if (i3 == 1) {
                            C13896f.this.f57514l++;
                        } else if (i3 == 2) {
                            C13896f.this.f57516n++;
                        } else if (i3 == 3) {
                            C13896f c13896f2 = C13896f.this;
                            c13896f2.f57517o++;
                            c13896f2.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            try {
                c13896f.f57510h.execute(c13896f.new f(true, i3, i4));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        C13895e.m82916b("TYPE_PING streamId != 0", new Object[0]);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void m82930a(b bVar) throws IOException {
        if (this.f57582c) {
            if (m82934a(true, bVar)) {
                return;
            }
            C13895e.m82916b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        InterfaceC13941g interfaceC13941g = this.f57580a;
        ByteString byteString = C13895e.f57497a;
        ByteString byteStringMo83085a = interfaceC13941g.mo83085a(byteString.size());
        Logger logger = f57579e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C13869c.m82788a("<< CONNECTION %s", byteStringMo83085a.hex()));
        }
        if (byteString.equals(byteStringMo83085a)) {
            return;
        }
        C13895e.m82916b("Expected a connection header but was %s", byteStringMo83085a.utf8());
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m82932a(b bVar, int i, byte b2, int i2) throws IOException {
        C13907q c13907q;
        if (i2 != 0) {
            boolean z = (b2 & 1) != 0;
            short s = (b2 & 8) != 0 ? (short) (this.f57580a.readByte() & 255) : (short) 0;
            if ((b2 & HttpTokens.SPACE) != 0) {
                m82931a(bVar, i2);
                i -= 5;
            }
            List<C13893c> listM82929a = m82929a(m82927a(i, b2, s), s, b2, i2);
            C13896f.g gVar = (C13896f.g) bVar;
            boolean zM82924d = C13896f.this.m82924d(i2);
            C13896f c13896f = C13896f.this;
            if (zM82924d) {
                c13896f.getClass();
                try {
                    C13899i c13899i = new C13899i(c13896f, "OkHttp %s Push Headers[%s]", new Object[]{c13896f.f57506d, Integer.valueOf(i2)}, i2, listM82929a, z);
                    synchronized (c13896f) {
                        if (!c13896f.f57509g) {
                            c13896f.f57511i.execute(c13899i);
                        }
                    }
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (c13896f) {
                try {
                    C13896f c13896f2 = C13896f.this;
                    synchronized (c13896f2) {
                        c13907q = c13896f2.f57505c.get(Integer.valueOf(i2));
                    }
                    if (c13907q == null) {
                        C13896f c13896f3 = C13896f.this;
                        if (c13896f3.f57509g) {
                            return;
                        }
                        if (i2 <= c13896f3.f57507e) {
                            return;
                        }
                        if (i2 % 2 == c13896f3.f57508f % 2) {
                            return;
                        }
                        C13907q c13907q2 = new C13907q(i2, C13896f.this, false, z, C13869c.m82806b(listM82929a));
                        C13896f c13896f4 = C13896f.this;
                        c13896f4.f57507e = i2;
                        c13896f4.f57505c.put(Integer.valueOf(i2), c13907q2);
                        C13896f.f57501y.execute(new C13902l(gVar, "OkHttp %s stream %d", new Object[]{C13896f.this.f57506d, Integer.valueOf(i2)}, c13907q2));
                        return;
                    }
                    c13907q.m82942a(C13869c.m82806b(listM82929a), z);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C13895e.m82916b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final List<C13893c> m82929a(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.f57581b;
        aVar.f57588e = i;
        aVar.f57585b = i;
        aVar.f57589f = s;
        aVar.f57586c = b2;
        aVar.f57587d = i2;
        C13894d.a aVar2 = this.f57583d;
        while (!aVar2.f57481b.mo83118g()) {
            byte b3 = aVar2.f57481b.readByte();
            int i3 = b3 & 255;
            if (i3 == 128) {
                zpg0.m220844a("index == 0");
                return null;
            }
            if ((b3 & 128) == 128) {
                int iM82902a = aVar2.m82902a(i3, 127);
                int i4 = iM82902a - 1;
                if (i4 >= 0) {
                    C13893c[] c13893cArr = C13894d.f57478a;
                    if (i4 <= c13893cArr.length - 1) {
                        aVar2.f57480a.add(c13893cArr[i4]);
                    }
                }
                int iM82901a = aVar2.m82901a(i4 - C13894d.f57478a.length);
                if (iM82901a >= 0) {
                    C13893c[] c13893cArr2 = aVar2.f57484e;
                    if (iM82901a < c13893cArr2.length) {
                        aVar2.f57480a.add(c13893cArr2[iM82901a]);
                    }
                }
                p3r0.m170507a("Header index too large ", iM82902a);
                return null;
            }
            if (i3 == 64) {
                aVar2.m82904a(-1, new C13893c(C13894d.m82900a(aVar2.m82906b()), aVar2.m82906b()));
            } else if ((b3 & 64) == 64) {
                aVar2.m82904a(-1, new C13893c(aVar2.m82907c(aVar2.m82902a(i3, 63) - 1), aVar2.m82906b()));
            } else if ((b3 & HttpTokens.SPACE) == 32) {
                int iM82902a2 = aVar2.m82902a(i3, 31);
                aVar2.f57483d = iM82902a2;
                if (iM82902a2 >= 0 && iM82902a2 <= aVar2.f57482c) {
                    int i5 = aVar2.f57487h;
                    if (iM82902a2 < i5) {
                        if (iM82902a2 == 0) {
                            aVar2.m82903a();
                        } else {
                            aVar2.m82905b(i5 - iM82902a2);
                        }
                    }
                } else {
                    yll.m216601a("Invalid dynamic table size update ", aVar2.f57483d);
                    return null;
                }
            } else if (i3 != 16 && i3 != 0) {
                aVar2.f57480a.add(new C13893c(aVar2.m82907c(aVar2.m82902a(i3, 15) - 1), aVar2.m82906b()));
            } else {
                aVar2.f57480a.add(new C13893c(C13894d.m82900a(aVar2.m82906b()), aVar2.m82906b()));
            }
        }
        C13894d.a aVar3 = this.f57583d;
        aVar3.getClass();
        ArrayList arrayList = new ArrayList(aVar3.f57480a);
        aVar3.f57480a.clear();
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m82931a(b bVar, int i) {
        this.f57580a.readInt();
        this.f57580a.readByte();
        ((C13896f.g) bVar).getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m82933a(b bVar, int i, int i2) throws IOException {
        C13907q[] c13907qArr;
        if (i < 8) {
            C13895e.m82916b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            int i3 = this.f57580a.readInt();
            int i4 = this.f57580a.readInt();
            int i5 = i - 8;
            if (EnumC13892b.m82899a(i4) != null) {
                ByteString byteStringMo83085a = ByteString.EMPTY;
                if (i5 > 0) {
                    byteStringMo83085a = this.f57580a.mo83085a(i5);
                }
                C13896f.g gVar = (C13896f.g) bVar;
                gVar.getClass();
                byteStringMo83085a.size();
                synchronized (C13896f.this) {
                    c13907qArr = (C13907q[]) C13896f.this.f57505c.values().toArray(new C13907q[C13896f.this.f57505c.size()]);
                    C13896f.this.f57509g = true;
                }
                for (C13907q c13907q : c13907qArr) {
                    if (c13907q.f57593c > i3 && c13907q.m82946d()) {
                        EnumC13892b enumC13892b = EnumC13892b.REFUSED_STREAM;
                        synchronized (c13907q) {
                            if (c13907q.f57601k == null) {
                                c13907q.f57601k = enumC13892b;
                                c13907q.notifyAll();
                            }
                        }
                        C13896f.this.m82925e(c13907q.f57593c);
                    }
                }
                return;
            }
            C13895e.m82916b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
            throw null;
        }
        C13895e.m82916b("TYPE_GOAWAY streamId != 0", new Object[0]);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static int m82928a(InterfaceC13941g interfaceC13941g) {
        return (interfaceC13941g.readByte() & 255) | ((interfaceC13941g.readByte() & 255) << 16) | ((interfaceC13941g.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    public static int m82927a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C13895e.m82916b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
