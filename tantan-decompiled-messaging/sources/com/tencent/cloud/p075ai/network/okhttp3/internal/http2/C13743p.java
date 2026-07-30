package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13733f.f;
import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.C13795x;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.http.HttpTokens;
import p149l.hg3;
import p149l.hjl;
import p149l.juq0;
import p149l.rhg0;
import p149l.shg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.p */
/* JADX INFO: loaded from: classes13.dex */
public final class C13743p implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final Logger f56731e = Logger.getLogger(C13732e.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC13778g f56732a;

    /* JADX INFO: renamed from: b */
    public final a f56733b;

    /* JADX INFO: renamed from: c */
    public final boolean f56734c;

    /* JADX INFO: renamed from: d */
    public final C13731d.a f56735d;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.p$a */
    public static final class a implements InterfaceC13794w {

        /* JADX INFO: renamed from: a */
        public final InterfaceC13778g f56736a;

        /* JADX INFO: renamed from: b */
        public int f56737b;

        /* JADX INFO: renamed from: c */
        public byte f56738c;

        /* JADX INFO: renamed from: d */
        public int f56739d;

        /* JADX INFO: renamed from: e */
        public int f56740e;

        /* JADX INFO: renamed from: f */
        public short f56741f;

        public a(InterfaceC13778g interfaceC13778g) {
            this.f56736a = interfaceC13778g;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        /* JADX INFO: renamed from: a */
        public long mo81631a(C13776e c13776e, long j) throws IOException {
            int i;
            int i2;
            do {
                int i3 = this.f56740e;
                InterfaceC13778g interfaceC13778g = this.f56736a;
                if (i3 != 0) {
                    long jMo81631a = interfaceC13778g.mo81631a(c13776e, Math.min(j, i3));
                    if (jMo81631a == -1) {
                        return -1L;
                    }
                    this.f56740e = (int) (((long) this.f56740e) - jMo81631a);
                    return jMo81631a;
                }
                interfaceC13778g.mo81927d(this.f56741f);
                this.f56741f = (short) 0;
                if ((this.f56738c & 4) != 0) {
                    return -1L;
                }
                i = this.f56739d;
                int iM81745a = C13743p.m81745a(this.f56736a);
                this.f56740e = iM81745a;
                this.f56737b = iM81745a;
                byte b = (byte) (this.f56736a.readByte() & 255);
                this.f56738c = (byte) (this.f56736a.readByte() & 255);
                Logger logger = C13743p.f56731e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C13732e.m81732a(true, this.f56739d, this.f56737b, b, this.f56738c));
                }
                i2 = this.f56736a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                this.f56739d = i2;
                if (b != 9) {
                    C13732e.m81733b("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                    throw null;
                }
            } while (i2 == i);
            C13732e.m81733b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        public C13795x timeout() {
            return this.f56736a.timeout();
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.p$b */
    public interface b {
    }

    public C13743p(InterfaceC13778g interfaceC13778g, boolean z) {
        this.f56732a = interfaceC13778g;
        this.f56734c = z;
        a aVar = new a(interfaceC13778g);
        this.f56733b = aVar;
        this.f56735d = new C13731d.a(4096, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x029d  */
    /* JADX INFO: renamed from: a */
    public boolean m81751a(boolean z, b bVar) throws IOException {
        boolean z2;
        C13744q c13744q;
        boolean z3;
        boolean z4;
        long j;
        try {
            this.f56732a.mo81933f(9L);
            int iM81745a = m81745a(this.f56732a);
            if (iM81745a < 0 || iM81745a > 16384) {
                C13732e.m81733b("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM81745a));
                throw null;
            }
            byte b2 = (byte) (this.f56732a.readByte() & 255);
            if (z && b2 != 4) {
                C13732e.m81733b("Expected a SETTINGS frame but was %s", Byte.valueOf(b2));
                throw null;
            }
            byte b3 = (byte) (this.f56732a.readByte() & 255);
            int i = this.f56732a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Logger logger = f56731e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C13732e.m81732a(true, i, iM81745a, b2, b3));
            }
            switch (b2) {
                case 0:
                    if (i == 0) {
                        C13732e.m81733b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z5 = (b3 & 1) != 0;
                    if ((b3 & HttpTokens.SPACE) != 0) {
                        C13732e.m81733b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    short s = (b3 & 8) != 0 ? (short) (this.f56732a.readByte() & 255) : (short) 0;
                    int iM81744a = m81744a(iM81745a, b3, s);
                    InterfaceC13778g interfaceC13778g = this.f56732a;
                    C13733f.g gVar = (C13733f.g) bVar;
                    boolean zM81741d = C13733f.this.m81741d(i);
                    C13733f c13733f = C13733f.this;
                    if (zM81741d) {
                        c13733f.getClass();
                        C13776e c13776e = new C13776e();
                        long j2 = iM81744a;
                        interfaceC13778g.mo81933f(j2);
                        interfaceC13778g.mo81631a(c13776e, j2);
                        if (c13776e.f56970b != j2) {
                            throw new IOException(c13776e.f56970b + " != " + iM81744a);
                        }
                        z2 = true;
                        C13737j c13737j = new C13737j(c13733f, "OkHttp %s Push Data[%s]", new Object[]{c13733f.f56658d, Integer.valueOf(i)}, i, c13776e, iM81744a, z5);
                        synchronized (c13733f) {
                            if (!c13733f.f56661g) {
                                c13733f.f56663i.execute(c13737j);
                            }
                            break;
                        }
                    } else {
                        z2 = true;
                        synchronized (c13733f) {
                            c13744q = c13733f.f56657c.get(Integer.valueOf(i));
                        }
                        if (c13744q == null) {
                            C13733f.this.m81736a(i, EnumC13729b.PROTOCOL_ERROR);
                            long j3 = iM81744a;
                            C13733f.this.m81743h(j3);
                            interfaceC13778g.mo81927d(j3);
                        } else {
                            if (!C13744q.f56742m && Thread.holdsLock(c13744q)) {
                                shg0.m184191a();
                                return false;
                            }
                            C13744q.b bVar2 = c13744q.f56749g;
                            long j4 = iM81744a;
                            bVar2.getClass();
                            if (!C13744q.b.f56760h && Thread.holdsLock(C13744q.this)) {
                                shg0.m184191a();
                                return false;
                            }
                            while (j4 > 0) {
                                synchronized (C13744q.this) {
                                    z3 = bVar2.f56766f;
                                    z4 = bVar2.f56762b.f56970b + j4 > bVar2.f56763c;
                                    break;
                                }
                                if (z4) {
                                    interfaceC13778g.mo81927d(j4);
                                    C13744q.this.m81757a(EnumC13729b.FLOW_CONTROL_ERROR);
                                } else if (z3) {
                                    interfaceC13778g.mo81927d(j4);
                                } else {
                                    long jMo81631a = interfaceC13778g.mo81631a(bVar2.f56761a, j4);
                                    if (jMo81631a == -1) {
                                        hg3.m130807a();
                                        return false;
                                    }
                                    j4 -= jMo81631a;
                                    synchronized (C13744q.this) {
                                        try {
                                            if (bVar2.f56765e) {
                                                C13776e c13776e2 = bVar2.f56761a;
                                                j = c13776e2.f56970b;
                                                c13776e2.m81944k();
                                            } else {
                                                C13776e c13776e3 = bVar2.f56762b;
                                                boolean z6 = c13776e3.f56970b == 0;
                                                c13776e3.m81901a(bVar2.f56761a);
                                                if (z6) {
                                                    C13744q.this.notifyAll();
                                                }
                                                j = 0;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (j > 0) {
                                        bVar2.m81767h(j);
                                    }
                                }
                                if (z5) {
                                    c13744q.m81759a(C13706c.f56456b, true);
                                }
                            }
                            if (z5) {
                                c13744q.m81759a(C13706c.f56456b, true);
                            }
                        }
                    }
                    this.f56732a.mo81927d(s);
                    return z2;
                case 1:
                    m81749a(bVar, iM81745a, b3, i);
                    break;
                case 2:
                    if (iM81745a != 5) {
                        C13732e.m81733b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM81745a));
                        throw null;
                    }
                    if (i == 0) {
                        C13732e.m81733b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    m81748a(bVar, i);
                    break;
                    break;
                case 3:
                    m81753b(bVar, iM81745a, i);
                    break;
                case 4:
                    if (i != 0) {
                        C13732e.m81733b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b3 & 1) == 0) {
                        if (iM81745a % 6 != 0) {
                            C13732e.m81733b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iM81745a));
                            throw null;
                        }
                        C13748u c13748u = new C13748u();
                        for (int i2 = 0; i2 < iM81745a; i2 += 6) {
                            int i3 = this.f56732a.readShort() & 65535;
                            int i4 = this.f56732a.readInt();
                            if (i3 == 2) {
                                if (i4 != 0 && i4 != 1) {
                                    C13732e.m81733b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                            } else if (i3 == 3) {
                                i3 = 4;
                            } else if (i3 != 4) {
                                if (i3 == 5 && (i4 < 16384 || i4 > 16777215)) {
                                    C13732e.m81733b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i4));
                                    throw null;
                                }
                            } else {
                                if (i4 < 0) {
                                    C13732e.m81733b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                                i3 = 7;
                            }
                            c13748u.m81781a(i3, i4);
                        }
                        C13733f.g gVar2 = (C13733f.g) bVar;
                        gVar2.getClass();
                        try {
                            C13733f c13733f2 = C13733f.this;
                            c13733f2.f56662h.execute(new C13740m(gVar2, "OkHttp %s ACK Settings", new Object[]{c13733f2.f56658d}, false, c13748u));
                        } catch (RejectedExecutionException unused) {
                        }
                    } else {
                        if (iM81745a != 0) {
                            C13732e.m81733b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                        ((C13733f.g) bVar).getClass();
                    }
                    break;
                    break;
                case 5:
                    m81754c(bVar, iM81745a, b3, i);
                    break;
                case 6:
                    m81752b(bVar, iM81745a, b3, i);
                    break;
                case 7:
                    m81750a(bVar, iM81745a, i);
                    break;
                case 8:
                    m81755c(bVar, iM81745a, i);
                    break;
                default:
                    this.f56732a.mo81927d(iM81745a);
                    break;
            }
            return true;
        } catch (EOFException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m81753b(b bVar, int i, int i2) throws IOException {
        C13744q c13744qRemove;
        if (i != 4) {
            C13732e.m81733b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            C13732e.m81733b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int i3 = this.f56732a.readInt();
        EnumC13729b enumC13729bM81716a = EnumC13729b.m81716a(i3);
        if (enumC13729bM81716a == null) {
            C13732e.m81733b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
            throw null;
        }
        C13733f.g gVar = (C13733f.g) bVar;
        boolean zM81741d = C13733f.this.m81741d(i2);
        C13733f c13733f = C13733f.this;
        if (zM81741d) {
            C13738k c13738k = new C13738k(c13733f, "OkHttp %s Push Reset[%s]", new Object[]{c13733f.f56658d, Integer.valueOf(i2)}, i2, enumC13729bM81716a);
            synchronized (c13733f) {
                if (!c13733f.f56661g) {
                    c13733f.f56663i.execute(c13738k);
                }
            }
            return;
        }
        synchronized (c13733f) {
            c13744qRemove = c13733f.f56657c.remove(Integer.valueOf(i2));
            c13733f.notifyAll();
        }
        if (c13744qRemove != null) {
            synchronized (c13744qRemove) {
                if (c13744qRemove.f56753k == null) {
                    c13744qRemove.f56753k = enumC13729bM81716a;
                    c13744qRemove.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m81754c(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            C13732e.m81733b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s = (b2 & 8) != 0 ? (short) (this.f56732a.readByte() & 255) : (short) 0;
        int i3 = this.f56732a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        List<C13730c> listM81746a = m81746a(m81744a(i - 4, b2, s), s, b2, i2);
        C13733f c13733f = C13733f.this;
        synchronized (c13733f) {
            try {
                if (c13733f.f56678x.contains(Integer.valueOf(i3))) {
                    c13733f.m81736a(i3, EnumC13729b.PROTOCOL_ERROR);
                    return;
                }
                c13733f.f56678x.add(Integer.valueOf(i3));
                try {
                    C13735h c13735h = new C13735h(c13733f, "OkHttp %s Push Request[%s]", new Object[]{c13733f.f56658d, Integer.valueOf(i3)}, i3, listM81746a);
                    synchronized (c13733f) {
                        if (!c13733f.f56661g) {
                            c13733f.f56663i.execute(c13735h);
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
        this.f56732a.close();
    }

    /* JADX INFO: renamed from: c */
    public final void m81755c(b bVar, int i, int i2) throws IOException {
        C13744q c13744q;
        if (i == 4) {
            long j = ((long) this.f56732a.readInt()) & 2147483647L;
            if (j != 0) {
                C13733f.g gVar = (C13733f.g) bVar;
                if (i2 == 0) {
                    synchronized (C13733f.this) {
                        C13733f c13733f = C13733f.this;
                        c13733f.f56672r += j;
                        c13733f.notifyAll();
                    }
                    return;
                }
                C13733f c13733f2 = C13733f.this;
                synchronized (c13733f2) {
                    c13744q = c13733f2.f56657c.get(Integer.valueOf(i2));
                }
                if (c13744q != null) {
                    synchronized (c13744q) {
                        try {
                            c13744q.f56744b += j;
                            if (j > 0) {
                                c13744q.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            }
            C13732e.m81733b("windowSizeIncrement was 0", Long.valueOf(j));
            throw null;
        }
        C13732e.m81733b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m81752b(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 8) {
            C13732e.m81733b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            int i3 = this.f56732a.readInt();
            int i4 = this.f56732a.readInt();
            boolean z = (b2 & 1) != 0;
            C13733f.g gVar = (C13733f.g) bVar;
            gVar.getClass();
            C13733f c13733f = C13733f.this;
            if (z) {
                synchronized (c13733f) {
                    try {
                        if (i3 == 1) {
                            C13733f.this.f56666l++;
                        } else if (i3 == 2) {
                            C13733f.this.f56668n++;
                        } else if (i3 == 3) {
                            C13733f c13733f2 = C13733f.this;
                            c13733f2.f56669o++;
                            c13733f2.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            try {
                c13733f.f56662h.execute(c13733f.new f(true, i3, i4));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        C13732e.m81733b("TYPE_PING streamId != 0", new Object[0]);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void m81747a(b bVar) throws IOException {
        if (this.f56734c) {
            if (m81751a(true, bVar)) {
                return;
            }
            C13732e.m81733b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        InterfaceC13778g interfaceC13778g = this.f56732a;
        ByteString byteString = C13732e.f56649a;
        ByteString byteStringMo81902a = interfaceC13778g.mo81902a(byteString.size());
        Logger logger = f56731e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C13706c.m81605a("<< CONNECTION %s", byteStringMo81902a.hex()));
        }
        if (byteString.equals(byteStringMo81902a)) {
            return;
        }
        C13732e.m81733b("Expected a connection header but was %s", byteStringMo81902a.utf8());
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m81749a(b bVar, int i, byte b2, int i2) throws IOException {
        C13744q c13744q;
        if (i2 != 0) {
            boolean z = (b2 & 1) != 0;
            short s = (b2 & 8) != 0 ? (short) (this.f56732a.readByte() & 255) : (short) 0;
            if ((b2 & HttpTokens.SPACE) != 0) {
                m81748a(bVar, i2);
                i -= 5;
            }
            List<C13730c> listM81746a = m81746a(m81744a(i, b2, s), s, b2, i2);
            C13733f.g gVar = (C13733f.g) bVar;
            boolean zM81741d = C13733f.this.m81741d(i2);
            C13733f c13733f = C13733f.this;
            if (zM81741d) {
                c13733f.getClass();
                try {
                    C13736i c13736i = new C13736i(c13733f, "OkHttp %s Push Headers[%s]", new Object[]{c13733f.f56658d, Integer.valueOf(i2)}, i2, listM81746a, z);
                    synchronized (c13733f) {
                        if (!c13733f.f56661g) {
                            c13733f.f56663i.execute(c13736i);
                        }
                    }
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (c13733f) {
                try {
                    C13733f c13733f2 = C13733f.this;
                    synchronized (c13733f2) {
                        c13744q = c13733f2.f56657c.get(Integer.valueOf(i2));
                    }
                    if (c13744q == null) {
                        C13733f c13733f3 = C13733f.this;
                        if (c13733f3.f56661g) {
                            return;
                        }
                        if (i2 <= c13733f3.f56659e) {
                            return;
                        }
                        if (i2 % 2 == c13733f3.f56660f % 2) {
                            return;
                        }
                        C13744q c13744q2 = new C13744q(i2, C13733f.this, false, z, C13706c.m81623b(listM81746a));
                        C13733f c13733f4 = C13733f.this;
                        c13733f4.f56659e = i2;
                        c13733f4.f56657c.put(Integer.valueOf(i2), c13744q2);
                        C13733f.f56653y.execute(new C13739l(gVar, "OkHttp %s stream %d", new Object[]{C13733f.this.f56658d, Integer.valueOf(i2)}, c13744q2));
                        return;
                    }
                    c13744q.m81759a(C13706c.m81623b(listM81746a), z);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C13732e.m81733b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final List<C13730c> m81746a(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.f56733b;
        aVar.f56740e = i;
        aVar.f56737b = i;
        aVar.f56741f = s;
        aVar.f56738c = b2;
        aVar.f56739d = i2;
        C13731d.a aVar2 = this.f56735d;
        while (!aVar2.f56633b.mo81935g()) {
            byte b3 = aVar2.f56633b.readByte();
            int i3 = b3 & 255;
            if (i3 == 128) {
                rhg0.m179353a("index == 0");
                return null;
            }
            if ((b3 & 128) == 128) {
                int iM81719a = aVar2.m81719a(i3, 127);
                int i4 = iM81719a - 1;
                if (i4 >= 0) {
                    C13730c[] c13730cArr = C13731d.f56630a;
                    if (i4 <= c13730cArr.length - 1) {
                        aVar2.f56632a.add(c13730cArr[i4]);
                    }
                }
                int iM81718a = aVar2.m81718a(i4 - C13731d.f56630a.length);
                if (iM81718a >= 0) {
                    C13730c[] c13730cArr2 = aVar2.f56636e;
                    if (iM81718a < c13730cArr2.length) {
                        aVar2.f56632a.add(c13730cArr2[iM81718a]);
                    }
                }
                juq0.m143339a("Header index too large ", iM81719a);
                return null;
            }
            if (i3 == 64) {
                aVar2.m81721a(-1, new C13730c(C13731d.m81717a(aVar2.m81723b()), aVar2.m81723b()));
            } else if ((b3 & 64) == 64) {
                aVar2.m81721a(-1, new C13730c(aVar2.m81724c(aVar2.m81719a(i3, 63) - 1), aVar2.m81723b()));
            } else if ((b3 & HttpTokens.SPACE) == 32) {
                int iM81719a2 = aVar2.m81719a(i3, 31);
                aVar2.f56635d = iM81719a2;
                if (iM81719a2 >= 0 && iM81719a2 <= aVar2.f56634c) {
                    int i5 = aVar2.f56639h;
                    if (iM81719a2 < i5) {
                        if (iM81719a2 == 0) {
                            aVar2.m81720a();
                        } else {
                            aVar2.m81722b(i5 - iM81719a2);
                        }
                    }
                } else {
                    hjl.m131386a("Invalid dynamic table size update ", aVar2.f56635d);
                    return null;
                }
            } else if (i3 != 16 && i3 != 0) {
                aVar2.f56632a.add(new C13730c(aVar2.m81724c(aVar2.m81719a(i3, 15) - 1), aVar2.m81723b()));
            } else {
                aVar2.f56632a.add(new C13730c(C13731d.m81717a(aVar2.m81723b()), aVar2.m81723b()));
            }
        }
        C13731d.a aVar3 = this.f56735d;
        aVar3.getClass();
        ArrayList arrayList = new ArrayList(aVar3.f56632a);
        aVar3.f56632a.clear();
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m81748a(b bVar, int i) {
        this.f56732a.readInt();
        this.f56732a.readByte();
        ((C13733f.g) bVar).getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m81750a(b bVar, int i, int i2) throws IOException {
        C13744q[] c13744qArr;
        if (i < 8) {
            C13732e.m81733b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            int i3 = this.f56732a.readInt();
            int i4 = this.f56732a.readInt();
            int i5 = i - 8;
            if (EnumC13729b.m81716a(i4) != null) {
                ByteString byteStringMo81902a = ByteString.EMPTY;
                if (i5 > 0) {
                    byteStringMo81902a = this.f56732a.mo81902a(i5);
                }
                C13733f.g gVar = (C13733f.g) bVar;
                gVar.getClass();
                byteStringMo81902a.size();
                synchronized (C13733f.this) {
                    c13744qArr = (C13744q[]) C13733f.this.f56657c.values().toArray(new C13744q[C13733f.this.f56657c.size()]);
                    C13733f.this.f56661g = true;
                }
                for (C13744q c13744q : c13744qArr) {
                    if (c13744q.f56745c > i3 && c13744q.m81763d()) {
                        EnumC13729b enumC13729b = EnumC13729b.REFUSED_STREAM;
                        synchronized (c13744q) {
                            if (c13744q.f56753k == null) {
                                c13744q.f56753k = enumC13729b;
                                c13744q.notifyAll();
                            }
                        }
                        C13733f.this.m81742e(c13744q.f56745c);
                    }
                }
                return;
            }
            C13732e.m81733b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
            throw null;
        }
        C13732e.m81733b("TYPE_GOAWAY streamId != 0", new Object[0]);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static int m81745a(InterfaceC13778g interfaceC13778g) {
        return (interfaceC13778g.readByte() & 255) | ((interfaceC13778g.readByte() & 255) << 16) | ((interfaceC13778g.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    public static int m81744a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C13732e.m81733b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
