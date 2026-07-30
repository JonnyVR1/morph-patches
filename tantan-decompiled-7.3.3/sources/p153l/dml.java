package p153l;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class dml implements Closeable {

    /* JADX INFO: renamed from: z */
    public static final ExecutorService f89639z = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), zlk0.m220234H("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: a */
    public final boolean f89640a;

    /* JADX INFO: renamed from: b */
    public final AbstractC16582j f89641b;

    /* JADX INFO: renamed from: d */
    public final String f89643d;

    /* JADX INFO: renamed from: e */
    public int f89644e;

    /* JADX INFO: renamed from: f */
    public int f89645f;

    /* JADX INFO: renamed from: g */
    public boolean f89646g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f89647h;

    /* JADX INFO: renamed from: i */
    public final ExecutorService f89648i;

    /* JADX INFO: renamed from: j */
    public final vnb0 f89649j;

    /* JADX INFO: renamed from: s */
    public long f89658s;

    /* JADX INFO: renamed from: u */
    public final vve0 f89660u;

    /* JADX INFO: renamed from: v */
    public final Socket f89661v;

    /* JADX INFO: renamed from: w */
    public final hml f89662w;

    /* JADX INFO: renamed from: x */
    public final C16584l f89663x;

    /* JADX INFO: renamed from: y */
    public final Set<Integer> f89664y;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, gml> f89642c = new LinkedHashMap();

    /* JADX INFO: renamed from: k */
    public long f89650k = 0;

    /* JADX INFO: renamed from: l */
    public long f89651l = 0;

    /* JADX INFO: renamed from: m */
    public long f89652m = 0;

    /* JADX INFO: renamed from: n */
    public long f89653n = 0;

    /* JADX INFO: renamed from: o */
    public long f89654o = 0;

    /* JADX INFO: renamed from: p */
    public long f89655p = 0;

    /* JADX INFO: renamed from: q */
    public long f89656q = 0;

    /* JADX INFO: renamed from: r */
    public long f89657r = 0;

    /* JADX INFO: renamed from: t */
    public vve0 f89659t = new vve0();

    /* JADX INFO: renamed from: l.dml$a */
    public class C16573a extends gc20 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89665b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ErrorCode f89666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16573a(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.f89665b = i;
            this.f89666c = errorCode;
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            try {
                dml.this.m116998m0(this.f89665b, this.f89666c);
            } catch (IOException e) {
                dml.this.m117002u(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.dml$b */
    public class C16574b extends gc20 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89668b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f89669c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16574b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f89668b = i;
            this.f89669c = j;
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            try {
                dml.this.f89662w.m135928J(this.f89668b, this.f89669c);
            } catch (IOException e) {
                dml.this.m117002u(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.dml$c */
    public class C16575c extends gc20 {
        public C16575c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            dml.this.m116997l0(false, 2, 0);
        }
    }

    /* JADX INFO: renamed from: l.dml$d */
    public class C16576d extends gc20 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89672b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f89673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16576d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f89672b = i;
            this.f89673c = list;
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            if (dml.this.f89649j.mo201967a(this.f89672b, this.f89673c)) {
                try {
                    dml.this.f89662w.m135926H(this.f89672b, ErrorCode.CANCEL);
                    synchronized (dml.this) {
                        try {
                            dml.this.f89664y.remove(Integer.valueOf(this.f89672b));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.dml$e */
    public class C16577e extends gc20 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89675b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f89676c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f89677d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16577e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f89675b = i;
            this.f89676c = list;
            this.f89677d = z;
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            boolean zMo201968b = dml.this.f89649j.mo201968b(this.f89675b, this.f89676c, this.f89677d);
            if (zMo201968b) {
                try {
                    dml.this.f89662w.m135926H(this.f89675b, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zMo201968b || this.f89677d) {
                synchronized (dml.this) {
                    try {
                        dml.this.f89664y.remove(Integer.valueOf(this.f89675b));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.dml$f */
    public class C16578f extends gc20 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89679b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Buffer f89680c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f89681d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f89682e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16578f(String str, Object[] objArr, int i, Buffer buffer, int i2, boolean z) {
            super(str, objArr);
            this.f89679b = i;
            this.f89680c = buffer;
            this.f89681d = i2;
            this.f89682e = z;
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            try {
                boolean zMo201969c = dml.this.f89649j.mo201969c(this.f89679b, this.f89680c, this.f89681d, this.f89682e);
                if (zMo201969c) {
                    dml.this.f89662w.m135926H(this.f89679b, ErrorCode.CANCEL);
                }
                if (zMo201969c || this.f89682e) {
                    synchronized (dml.this) {
                        dml.this.f89664y.remove(Integer.valueOf(this.f89679b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l.dml$g */
    public class C16579g extends gc20 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89684b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ErrorCode f89685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16579g(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.f89684b = i;
            this.f89685c = errorCode;
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            dml.this.f89649j.mo201970d(this.f89684b, this.f89685c);
            synchronized (dml.this) {
                dml.this.f89664y.remove(Integer.valueOf(this.f89684b));
            }
        }
    }

    /* JADX INFO: renamed from: l.dml$h */
    public static class C16580h {

        /* JADX INFO: renamed from: a */
        public Socket f89687a;

        /* JADX INFO: renamed from: b */
        public String f89688b;

        /* JADX INFO: renamed from: c */
        public BufferedSource f89689c;

        /* JADX INFO: renamed from: d */
        public BufferedSink f89690d;

        /* JADX INFO: renamed from: e */
        public AbstractC16582j f89691e = AbstractC16582j.f89696a;

        /* JADX INFO: renamed from: f */
        public vnb0 f89692f = vnb0.f184848a;

        /* JADX INFO: renamed from: g */
        public boolean f89693g;

        /* JADX INFO: renamed from: h */
        public int f89694h;

        public C16580h(boolean z) {
            this.f89693g = z;
        }

        /* JADX INFO: renamed from: a */
        public dml m117005a() {
            return new dml(this);
        }

        /* JADX INFO: renamed from: b */
        public C16580h m117006b(AbstractC16582j abstractC16582j) {
            this.f89691e = abstractC16582j;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16580h m117007c(int i) {
            this.f89694h = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16580h m117008d(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f89687a = socket;
            this.f89688b = str;
            this.f89689c = bufferedSource;
            this.f89690d = bufferedSink;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.dml$i */
    public final class C16581i extends gc20 {
        public C16581i() {
            super("OkHttp %s ping", dml.this.f89643d);
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            boolean z;
            synchronized (dml.this) {
                if (dml.this.f89651l < dml.this.f89650k) {
                    z = true;
                } else {
                    dml.m116972h(dml.this);
                    z = false;
                }
            }
            dml dmlVar = dml.this;
            if (z) {
                dmlVar.m117002u(null);
            } else {
                dmlVar.m116997l0(false, 1, 0);
            }
        }
    }

    /* JADX INFO: renamed from: l.dml$k */
    public final class C16583k extends gc20 {

        /* JADX INFO: renamed from: b */
        public final boolean f89697b;

        /* JADX INFO: renamed from: c */
        public final int f89698c;

        /* JADX INFO: renamed from: d */
        public final int f89699d;

        public C16583k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", dml.this.f89643d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f89697b = z;
            this.f89698c = i;
            this.f89699d = i2;
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            dml.this.m116997l0(this.f89697b, this.f89698c, this.f89699d);
        }
    }

    public dml(C16580h c16580h) {
        vve0 vve0Var = new vve0();
        this.f89660u = vve0Var;
        this.f89664y = new LinkedHashSet();
        this.f89649j = c16580h.f89692f;
        boolean z = c16580h.f89693g;
        this.f89640a = z;
        this.f89641b = c16580h.f89691e;
        int i = z ? 1 : 2;
        this.f89645f = i;
        if (z) {
            this.f89645f = i + 2;
        }
        if (z) {
            this.f89659t.m203011i(7, 16777216);
        }
        String str = c16580h.f89688b;
        this.f89643d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, zlk0.m220234H(zlk0.m220255q("OkHttp %s Writer", str), false));
        this.f89647h = scheduledThreadPoolExecutor;
        if (c16580h.f89694h != 0) {
            C16581i c16581i = new C16581i();
            int i2 = c16580h.f89694h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c16581i, i2, i2, TimeUnit.MILLISECONDS);
        }
        this.f89648i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zlk0.m220234H(zlk0.m220255q("OkHttp %s Push Observer", str), true));
        vve0Var.m203011i(7, p7f.COLOR_SPACE_UNCALIBRATED);
        vve0Var.m203011i(5, 16384);
        this.f89658s = vve0Var.m203006d();
        this.f89661v = c16580h.f89687a;
        this.f89662w = new hml(c16580h.f89690d, z);
        this.f89663x = new C16584l(new fml(c16580h.f89689c, z));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m116970e(dml dmlVar) {
        long j = dmlVar.f89651l;
        dmlVar.f89651l = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ long m116972h(dml dmlVar) {
        long j = dmlVar.f89650k;
        dmlVar.f89650k = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ long m116977n(dml dmlVar) {
        long j = dmlVar.f89653n;
        dmlVar.f89653n = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ long m116978q(dml dmlVar) {
        long j = dmlVar.f89655p;
        dmlVar.f89655p = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: B */
    public synchronized boolean m116979B(long j) {
        if (this.f89646g) {
            return false;
        }
        return this.f89653n >= this.f89652m || j < this.f89656q;
    }

    /* JADX INFO: renamed from: F */
    public synchronized int m116980F() {
        return this.f89660u.m203007e(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: H */
    public final gml m116981H(int i, List<xzk> list, boolean z) throws IOException {
        Throwable th;
        gml gmlVar;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.f89662w) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f89645f > 1073741823) {
                                try {
                                    m116991d0(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            if (this.f89646g) {
                                throw new ConnectionShutdownException();
                            }
                            int i2 = this.f89645f;
                            this.f89645f = i2 + 2;
                            gmlVar = new gml(i2, this, z3, false, null);
                            z2 = !z || this.f89658s == 0 || gmlVar.f104990b == 0;
                            if (gmlVar.m130810k()) {
                                this.f89642c.put(Integer.valueOf(i2), gmlVar);
                            }
                            if (i == 0) {
                                this.f89662w.m135936u(z3, i2, list);
                            } else {
                                if (this.f89640a) {
                                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                }
                                this.f89662w.m135925F(i, i2, list);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (z2) {
            this.f89662w.flush();
        }
        return gmlVar;
    }

    /* JADX INFO: renamed from: I */
    public gml m116982I(List<xzk> list, boolean z) throws IOException {
        return m116981H(0, list, z);
    }

    /* JADX INFO: renamed from: J */
    public void m116983J(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
        Buffer buffer = new Buffer();
        long j = i2;
        bufferedSource.require(j);
        bufferedSource.read(buffer, j);
        if (buffer.size() == j) {
            m116984M(new C16578f("OkHttp %s Push Data[%s]", new Object[]{this.f89643d, Integer.valueOf(i)}, i, buffer, i2, z));
            return;
        }
        throw new IOException(buffer.size() + " != " + i2);
    }

    /* JADX INFO: renamed from: M */
    public final synchronized void m116984M(gc20 gc20Var) {
        if (!this.f89646g) {
            this.f89648i.execute(gc20Var);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m116985N(int i, List<xzk> list, boolean z) {
        try {
            m116984M(new C16577e("OkHttp %s Push Headers[%s]", new Object[]{this.f89643d, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x003f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: Q */
    public void m116986Q(int r9, java.util.List<p153l.xzk> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f89664y     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L18
            okhttp3.internal.http2.ErrorCode r10 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.m116999n0(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L3d
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.f89664y     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3a
            r0.add(r1)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3a
            l.dml$d r2 = new l.dml$d     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.f89643d     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1}     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            r3.m116984M(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
        L39:
            return
        L3a:
            r0 = move-exception
            r3 = r8
        L3c:
            r9 = r0
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r9
        L3f:
            r0 = move-exception
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.dml.m116986Q(int, java.util.List):void");
    }

    /* JADX INFO: renamed from: S */
    public void m116987S(int i, ErrorCode errorCode) {
        m116984M(new C16579g("OkHttp %s Push Reset[%s]", new Object[]{this.f89643d, Integer.valueOf(i)}, i, errorCode));
    }

    /* JADX INFO: renamed from: U */
    public boolean m116988U(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* JADX INFO: renamed from: Z */
    public synchronized gml m116989Z(int i) {
        gml gmlVarRemove;
        gmlVarRemove = this.f89642c.remove(Integer.valueOf(i));
        notifyAll();
        return gmlVarRemove;
    }

    /* JADX INFO: renamed from: a0 */
    public void m116990a0() {
        synchronized (this) {
            try {
                long j = this.f89653n;
                long j2 = this.f89652m;
                if (j < j2) {
                    return;
                }
                this.f89652m = j2 + 1;
                this.f89656q = System.nanoTime() + 1000000000;
                try {
                    this.f89647h.execute(new C16575c("OkHttp %s ping", this.f89643d));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m117001t(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX INFO: renamed from: d0 */
    public void m116991d0(ErrorCode errorCode) throws IOException {
        synchronized (this.f89662w) {
            synchronized (this) {
                if (this.f89646g) {
                    return;
                }
                this.f89646g = true;
                this.f89662w.m135935t(this.f89644e, errorCode, zlk0.f204946a);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m116992e0() throws IOException {
        m116993h0(true);
    }

    public void flush() throws IOException {
        this.f89662w.flush();
    }

    /* JADX INFO: renamed from: h0 */
    public void m116993h0(boolean z) throws IOException {
        if (z) {
            this.f89662w.m135931k();
            this.f89662w.m135927I(this.f89659t);
            int iM203006d = this.f89659t.m203006d();
            if (iM203006d != 65535) {
                this.f89662w.m135928J(0, iM203006d - p7f.COLOR_SPACE_UNCALIBRATED);
            }
        }
        new Thread(this.f89663x).start();
    }

    /* JADX INFO: renamed from: i0 */
    public synchronized void m116994i0(long j) {
        long j2 = this.f89657r + j;
        this.f89657r = j2;
        if (j2 >= this.f89659t.m203006d() / 2) {
            m117000o0(0, this.f89657r);
            this.f89657r = 0L;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m116995j0(int i, boolean z, Buffer buffer, long j) throws IOException {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f89662w.m135932m(z, i, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.f89658s;
                            if (j2 <= 0) {
                                if (!this.f89642c.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j2), this.f89662w.m135937v());
                j3 = iMin;
                this.f89658s -= j3;
            }
            j -= j3;
            this.f89662w.m135932m(z && j == 0, i, buffer, iMin);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m116996k0(int i, boolean z, List<xzk> list) throws IOException {
        this.f89662w.m135936u(z, i, list);
    }

    /* JADX INFO: renamed from: l0 */
    public void m116997l0(boolean z, int i, int i2) {
        try {
            this.f89662w.m135924B(z, i, i2);
        } catch (IOException e) {
            m117002u(e);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m116998m0(int i, ErrorCode errorCode) throws IOException {
        this.f89662w.m135926H(i, errorCode);
    }

    /* JADX INFO: renamed from: n0 */
    public void m116999n0(int i, ErrorCode errorCode) {
        try {
            this.f89647h.execute(new C16573a("OkHttp %s stream %d", new Object[]{this.f89643d, Integer.valueOf(i)}, i, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m117000o0(int i, long j) {
        try {
            this.f89647h.execute(new C16574b("OkHttp Window Update %s stream %d", new Object[]{this.f89643d, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public void m117001t(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        gml[] gmlVarArr;
        try {
            m116991d0(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f89642c.isEmpty()) {
                    gmlVarArr = null;
                } else {
                    gmlVarArr = (gml[]) this.f89642c.values().toArray(new gml[this.f89642c.size()]);
                    this.f89642c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gmlVarArr != null) {
            for (gml gmlVar : gmlVarArr) {
                try {
                    gmlVar.m130803d(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f89662w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f89661v.close();
        } catch (IOException unused4) {
        }
        this.f89647h.shutdown();
        this.f89648i.shutdown();
    }

    /* JADX INFO: renamed from: u */
    public final void m117002u(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m117001t(errorCode, errorCode, iOException);
    }

    /* JADX INFO: renamed from: v */
    public synchronized gml m117003v(int i) {
        return this.f89642c.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: l.dml$l */
    public class C16584l extends gc20 implements fml.InterfaceC17015b {

        /* JADX INFO: renamed from: b */
        public final fml f89701b;

        /* JADX INFO: renamed from: l.dml$l$a */
        public class a extends gc20 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gml f89703b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, gml gmlVar) {
                super(str, objArr);
                this.f89703b = gmlVar;
            }

            @Override // p153l.gc20
            /* JADX INFO: renamed from: k */
            public void mo117004k() {
                try {
                    dml.this.f89641b.mo117010f(this.f89703b);
                } catch (IOException e) {
                    Platform.get().log(4, "Http2Connection.Listener failure for " + dml.this.f89643d, e);
                    try {
                        this.f89703b.m130803d(ErrorCode.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* JADX INFO: renamed from: l.dml$l$b */
        public class b extends gc20 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f89705b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ vve0 f89706c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z, vve0 vve0Var) {
                super(str, objArr);
                this.f89705b = z;
                this.f89706c = vve0Var;
            }

            @Override // p153l.gc20
            /* JADX INFO: renamed from: k */
            public void mo117004k() {
                C16584l.this.m117021l(this.f89705b, this.f89706c);
            }
        }

        /* JADX INFO: renamed from: l.dml$l$c */
        public class c extends gc20 {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // p153l.gc20
            /* JADX INFO: renamed from: k */
            public void mo117004k() {
                dml dmlVar = dml.this;
                dmlVar.f89641b.mo117009e(dmlVar);
            }
        }

        public C16584l(fml fmlVar) {
            super("OkHttp %s", dml.this.f89643d);
            this.f89701b = fmlVar;
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: a */
        public void mo117011a(int i, int i2, List<xzk> list) throws Throwable {
            dml.this.m116986Q(i2, list);
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: b */
        public void mo117012b(boolean z, int i, int i2) {
            dml dmlVar = dml.this;
            if (!z) {
                try {
                    dmlVar.f89647h.execute(dml.this.new C16583k(true, i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (dmlVar) {
                try {
                    if (i == 1) {
                        dml.m116970e(dml.this);
                    } else if (i == 2) {
                        dml.m116977n(dml.this);
                    } else if (i == 3) {
                        dml.m116978q(dml.this);
                        dml.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: c */
        public void mo117013c(int i, ErrorCode errorCode) {
            boolean zM116988U = dml.this.m116988U(i);
            dml dmlVar = dml.this;
            if (zM116988U) {
                dmlVar.m116987S(i, errorCode);
                return;
            }
            gml gmlVarM116989Z = dmlVar.m116989Z(i);
            if (gmlVarM116989Z != null) {
                gmlVarM116989Z.m130814o(errorCode);
            }
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: d */
        public void mo117014d(int i, ErrorCode errorCode, ByteString byteString) {
            gml[] gmlVarArr;
            byteString.size();
            synchronized (dml.this) {
                gmlVarArr = (gml[]) dml.this.f89642c.values().toArray(new gml[dml.this.f89642c.size()]);
                dml.this.f89646g = true;
            }
            for (gml gmlVar : gmlVarArr) {
                if (gmlVar.m130806g() > i && gmlVar.m130809j()) {
                    gmlVar.m130814o(ErrorCode.REFUSED_STREAM);
                    dml.this.m116989Z(gmlVar.m130806g());
                }
            }
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: e */
        public void mo117015e(boolean z, int i, int i2, List<xzk> list) {
            boolean zM116988U = dml.this.m116988U(i);
            dml dmlVar = dml.this;
            if (zM116988U) {
                dmlVar.m116985N(i, list, z);
                return;
            }
            synchronized (dmlVar) {
                try {
                    gml gmlVarM117003v = dml.this.m117003v(i);
                    if (gmlVarM117003v != null) {
                        gmlVarM117003v.m130813n(zlk0.m220236J(list), z);
                        return;
                    }
                    if (dml.this.f89646g) {
                        return;
                    }
                    dml dmlVar2 = dml.this;
                    if (i <= dmlVar2.f89644e) {
                        return;
                    }
                    if (i % 2 == dmlVar2.f89645f % 2) {
                        return;
                    }
                    gml gmlVar = new gml(i, dml.this, false, z, zlk0.m220236J(list));
                    dml dmlVar3 = dml.this;
                    dmlVar3.f89644e = i;
                    dmlVar3.f89642c.put(Integer.valueOf(i), gmlVar);
                    dml.f89639z.execute(new a("OkHttp %s stream %d", new Object[]{dml.this.f89643d, Integer.valueOf(i)}, gmlVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: f */
        public void mo117016f(int i, long j) {
            dml dmlVar = dml.this;
            if (i == 0) {
                synchronized (dmlVar) {
                    dml dmlVar2 = dml.this;
                    dmlVar2.f89658s += j;
                    dmlVar2.notifyAll();
                }
                return;
            }
            gml gmlVarM117003v = dmlVar.m117003v(i);
            if (gmlVarM117003v != null) {
                synchronized (gmlVarM117003v) {
                    gmlVarM117003v.m130800a(j);
                }
            }
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: h */
        public void mo117018h(boolean z, vve0 vve0Var) {
            try {
                dml.this.f89647h.execute(new b("OkHttp %s ACK Settings", new Object[]{dml.this.f89643d}, z, vve0Var));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: i */
        public void mo117019i(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            boolean zM116988U = dml.this.m116988U(i);
            dml dmlVar = dml.this;
            if (zM116988U) {
                dmlVar.m116983J(i, bufferedSource, i2, z);
                return;
            }
            gml gmlVarM117003v = dmlVar.m117003v(i);
            if (gmlVarM117003v == null) {
                dml.this.m116999n0(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                dml.this.m116994i0(j);
                bufferedSource.skip(j);
                return;
            }
            gmlVarM117003v.m130812m(bufferedSource, i2);
            if (z) {
                gmlVarM117003v.m130813n(zlk0.f204948c, true);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable, l.fml] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.f89701b.m126246e(this);
                    while (this.f89701b.m126245d(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        errorCode2 = ErrorCode.CANCEL;
                        dml.this.m117001t(errorCode3, errorCode2, null);
                        errorCode = errorCode3;
                    } catch (IOException e2) {
                        e = e2;
                        errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        dml dmlVar = dml.this;
                        dmlVar.m117001t(errorCode2, errorCode2, e);
                        errorCode = dmlVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    dml.this.m117001t(errorCode, errorCode2, e);
                    zlk0.m220245g(this.f89701b);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                dml.this.m117001t(errorCode, errorCode2, e);
                zlk0.m220245g(this.f89701b);
                throw th;
            }
            this = this.f89701b;
            zlk0.m220245g(this);
        }

        /* JADX INFO: renamed from: l */
        public void m117021l(boolean z, vve0 vve0Var) {
            gml[] gmlVarArr;
            long j;
            synchronized (dml.this.f89662w) {
                synchronized (dml.this) {
                    try {
                        int iM203006d = dml.this.f89660u.m203006d();
                        if (z) {
                            dml.this.f89660u.m203003a();
                        }
                        dml.this.f89660u.m203010h(vve0Var);
                        int iM203006d2 = dml.this.f89660u.m203006d();
                        gmlVarArr = null;
                        if (iM203006d2 == -1 || iM203006d2 == iM203006d) {
                            j = 0;
                        } else {
                            j = iM203006d2 - iM203006d;
                            if (!dml.this.f89642c.isEmpty()) {
                                gmlVarArr = (gml[]) dml.this.f89642c.values().toArray(new gml[dml.this.f89642c.size()]);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    dml dmlVar = dml.this;
                    dmlVar.f89662w.m135930b(dmlVar.f89660u);
                } catch (IOException e) {
                    dml.this.m117002u(e);
                }
            }
            if (gmlVarArr != null) {
                for (gml gmlVar : gmlVarArr) {
                    synchronized (gmlVar) {
                        gmlVar.m130800a(j);
                    }
                }
            }
            dml.f89639z.execute(new c("OkHttp %s settings", dml.this.f89643d));
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: g */
        public void mo117017g() {
        }

        @Override // p153l.fml.InterfaceC17015b
        /* JADX INFO: renamed from: j */
        public void mo117020j(int i, int i2, int i3, boolean z) {
        }
    }

    /* JADX INFO: renamed from: l.dml$j */
    public static abstract class AbstractC16582j {

        /* JADX INFO: renamed from: a */
        public static final AbstractC16582j f89696a = new a();

        /* JADX INFO: renamed from: l.dml$j$a */
        public static class a extends AbstractC16582j {
            @Override // p153l.dml.AbstractC16582j
            /* JADX INFO: renamed from: f */
            public void mo117010f(gml gmlVar) throws IOException {
                gmlVar.m130803d(ErrorCode.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo117010f(gml gmlVar) throws IOException;

        /* JADX INFO: renamed from: e */
        public void mo117009e(dml dmlVar) {
        }
    }
}
