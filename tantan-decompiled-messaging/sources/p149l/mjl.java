package p149l;

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
public final class mjl implements Closeable {

    /* JADX INFO: renamed from: z */
    public static final ExecutorService f134144z = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), tck0.m187995H("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: a */
    public final boolean f134145a;

    /* JADX INFO: renamed from: b */
    public final AbstractC18478j f134146b;

    /* JADX INFO: renamed from: d */
    public final String f134148d;

    /* JADX INFO: renamed from: e */
    public int f134149e;

    /* JADX INFO: renamed from: f */
    public int f134150f;

    /* JADX INFO: renamed from: g */
    public boolean f134151g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f134152h;

    /* JADX INFO: renamed from: i */
    public final ExecutorService f134153i;

    /* JADX INFO: renamed from: j */
    public final rfb0 f134154j;

    /* JADX INFO: renamed from: s */
    public long f134163s;

    /* JADX INFO: renamed from: u */
    public final one0 f134165u;

    /* JADX INFO: renamed from: v */
    public final Socket f134166v;

    /* JADX INFO: renamed from: w */
    public final qjl f134167w;

    /* JADX INFO: renamed from: x */
    public final C18480l f134168x;

    /* JADX INFO: renamed from: y */
    public final Set<Integer> f134169y;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, pjl> f134147c = new LinkedHashMap();

    /* JADX INFO: renamed from: k */
    public long f134155k = 0;

    /* JADX INFO: renamed from: l */
    public long f134156l = 0;

    /* JADX INFO: renamed from: m */
    public long f134157m = 0;

    /* JADX INFO: renamed from: n */
    public long f134158n = 0;

    /* JADX INFO: renamed from: o */
    public long f134159o = 0;

    /* JADX INFO: renamed from: p */
    public long f134160p = 0;

    /* JADX INFO: renamed from: q */
    public long f134161q = 0;

    /* JADX INFO: renamed from: r */
    public long f134162r = 0;

    /* JADX INFO: renamed from: t */
    public one0 f134164t = new one0();

    /* JADX INFO: renamed from: l.mjl$a */
    public class C18469a extends y320 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f134170b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ErrorCode f134171c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18469a(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.f134170b = i;
            this.f134171c = errorCode;
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            try {
                mjl.this.m154876l0(this.f134170b, this.f134171c);
            } catch (IOException e) {
                mjl.this.m154880u(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.mjl$b */
    public class C18470b extends y320 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f134173b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f134174c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18470b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f134173b = i;
            this.f134174c = j;
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            try {
                mjl.this.f134167w.m175006J(this.f134173b, this.f134174c);
            } catch (IOException e) {
                mjl.this.m154880u(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.mjl$c */
    public class C18471c extends y320 {
        public C18471c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            mjl.this.m154875k0(false, 2, 0);
        }
    }

    /* JADX INFO: renamed from: l.mjl$d */
    public class C18472d extends y320 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f134177b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f134178c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18472d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f134177b = i;
            this.f134178c = list;
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            if (mjl.this.f134154j.mo179121a(this.f134177b, this.f134178c)) {
                try {
                    mjl.this.f134167w.m175004H(this.f134177b, ErrorCode.CANCEL);
                    synchronized (mjl.this) {
                        try {
                            mjl.this.f134169y.remove(Integer.valueOf(this.f134177b));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.mjl$e */
    public class C18473e extends y320 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f134180b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f134181c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f134182d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18473e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f134180b = i;
            this.f134181c = list;
            this.f134182d = z;
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            boolean zMo179122b = mjl.this.f134154j.mo179122b(this.f134180b, this.f134181c, this.f134182d);
            if (zMo179122b) {
                try {
                    mjl.this.f134167w.m175004H(this.f134180b, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zMo179122b || this.f134182d) {
                synchronized (mjl.this) {
                    try {
                        mjl.this.f134169y.remove(Integer.valueOf(this.f134180b));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.mjl$f */
    public class C18474f extends y320 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f134184b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Buffer f134185c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f134186d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f134187e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18474f(String str, Object[] objArr, int i, Buffer buffer, int i2, boolean z) {
            super(str, objArr);
            this.f134184b = i;
            this.f134185c = buffer;
            this.f134186d = i2;
            this.f134187e = z;
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            try {
                boolean zMo179123c = mjl.this.f134154j.mo179123c(this.f134184b, this.f134185c, this.f134186d, this.f134187e);
                if (zMo179123c) {
                    mjl.this.f134167w.m175004H(this.f134184b, ErrorCode.CANCEL);
                }
                if (zMo179123c || this.f134187e) {
                    synchronized (mjl.this) {
                        mjl.this.f134169y.remove(Integer.valueOf(this.f134184b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l.mjl$g */
    public class C18475g extends y320 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f134189b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ErrorCode f134190c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18475g(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.f134189b = i;
            this.f134190c = errorCode;
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            mjl.this.f134154j.mo179124d(this.f134189b, this.f134190c);
            synchronized (mjl.this) {
                mjl.this.f134169y.remove(Integer.valueOf(this.f134189b));
            }
        }
    }

    /* JADX INFO: renamed from: l.mjl$h */
    public static class C18476h {

        /* JADX INFO: renamed from: a */
        public Socket f134192a;

        /* JADX INFO: renamed from: b */
        public String f134193b;

        /* JADX INFO: renamed from: c */
        public BufferedSource f134194c;

        /* JADX INFO: renamed from: d */
        public BufferedSink f134195d;

        /* JADX INFO: renamed from: e */
        public AbstractC18478j f134196e = AbstractC18478j.f134201a;

        /* JADX INFO: renamed from: f */
        public rfb0 f134197f = rfb0.f159135a;

        /* JADX INFO: renamed from: g */
        public boolean f134198g;

        /* JADX INFO: renamed from: h */
        public int f134199h;

        public C18476h(boolean z) {
            this.f134198g = z;
        }

        /* JADX INFO: renamed from: a */
        public mjl m154882a() {
            return new mjl(this);
        }

        /* JADX INFO: renamed from: b */
        public C18476h m154883b(AbstractC18478j abstractC18478j) {
            this.f134196e = abstractC18478j;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18476h m154884c(int i) {
            this.f134199h = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18476h m154885d(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f134192a = socket;
            this.f134193b = str;
            this.f134194c = bufferedSource;
            this.f134195d = bufferedSink;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.mjl$i */
    public final class C18477i extends y320 {
        public C18477i() {
            super("OkHttp %s ping", mjl.this.f134148d);
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            boolean z;
            synchronized (mjl.this) {
                if (mjl.this.f134156l < mjl.this.f134155k) {
                    z = true;
                } else {
                    mjl.m154850h(mjl.this);
                    z = false;
                }
            }
            mjl mjlVar = mjl.this;
            if (z) {
                mjlVar.m154880u(null);
            } else {
                mjlVar.m154875k0(false, 1, 0);
            }
        }
    }

    /* JADX INFO: renamed from: l.mjl$k */
    public final class C18479k extends y320 {

        /* JADX INFO: renamed from: b */
        public final boolean f134202b;

        /* JADX INFO: renamed from: c */
        public final int f134203c;

        /* JADX INFO: renamed from: d */
        public final int f134204d;

        public C18479k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", mjl.this.f134148d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f134202b = z;
            this.f134203c = i;
            this.f134204d = i2;
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            mjl.this.m154875k0(this.f134202b, this.f134203c, this.f134204d);
        }
    }

    public mjl(C18476h c18476h) {
        one0 one0Var = new one0();
        this.f134165u = one0Var;
        this.f134169y = new LinkedHashSet();
        this.f134154j = c18476h.f134197f;
        boolean z = c18476h.f134198g;
        this.f134145a = z;
        this.f134146b = c18476h.f134196e;
        int i = z ? 1 : 2;
        this.f134150f = i;
        if (z) {
            this.f134150f = i + 2;
        }
        if (z) {
            this.f134164t.m165178i(7, 16777216);
        }
        String str = c18476h.f134193b;
        this.f134148d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, tck0.m187995H(tck0.m188016q("OkHttp %s Writer", str), false));
        this.f134152h = scheduledThreadPoolExecutor;
        if (c18476h.f134199h != 0) {
            C18477i c18477i = new C18477i();
            int i2 = c18476h.f134199h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c18477i, i2, i2, TimeUnit.MILLISECONDS);
        }
        this.f134153i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), tck0.m187995H(tck0.m188016q("OkHttp %s Push Observer", str), true));
        one0Var.m165178i(7, j6f.COLOR_SPACE_UNCALIBRATED);
        one0Var.m165178i(5, 16384);
        this.f134163s = one0Var.m165173d();
        this.f134166v = c18476h.f134192a;
        this.f134167w = new qjl(c18476h.f134195d, z);
        this.f134168x = new C18480l(new ojl(c18476h.f134194c, z));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m154848e(mjl mjlVar) {
        long j = mjlVar.f134156l;
        mjlVar.f134156l = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ long m154850h(mjl mjlVar) {
        long j = mjlVar.f134155k;
        mjlVar.f134155k = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ long m154855n(mjl mjlVar) {
        long j = mjlVar.f134158n;
        mjlVar.f134158n = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ long m154856q(mjl mjlVar) {
        long j = mjlVar.f134160p;
        mjlVar.f134160p = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: B */
    public synchronized boolean m154857B(long j) {
        if (this.f134151g) {
            return false;
        }
        return this.f134158n >= this.f134157m || j < this.f134161q;
    }

    /* JADX INFO: renamed from: F */
    public synchronized int m154858F() {
        return this.f134165u.m165174e(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: H */
    public final pjl m154859H(int i, List<hxk> list, boolean z) throws IOException {
        Throwable th;
        pjl pjlVar;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.f134167w) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f134150f > 1073741823) {
                                try {
                                    m154869c0(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            if (this.f134151g) {
                                throw new ConnectionShutdownException();
                            }
                            int i2 = this.f134150f;
                            this.f134150f = i2 + 2;
                            pjlVar = new pjl(i2, this, z3, false, null);
                            z2 = !z || this.f134163s == 0 || pjlVar.f149811b == 0;
                            if (pjlVar.m169896k()) {
                                this.f134147c.put(Integer.valueOf(i2), pjlVar);
                            }
                            if (i == 0) {
                                this.f134167w.m175014u(z3, i2, list);
                            } else {
                                if (this.f134145a) {
                                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                }
                                this.f134167w.m175003F(i, i2, list);
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
            this.f134167w.flush();
        }
        return pjlVar;
    }

    /* JADX INFO: renamed from: I */
    public pjl m154860I(List<hxk> list, boolean z) throws IOException {
        return m154859H(0, list, z);
    }

    /* JADX INFO: renamed from: J */
    public void m154861J(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
        Buffer buffer = new Buffer();
        long j = i2;
        bufferedSource.require(j);
        bufferedSource.read(buffer, j);
        if (buffer.size() == j) {
            m154862M(new C18474f("OkHttp %s Push Data[%s]", new Object[]{this.f134148d, Integer.valueOf(i)}, i, buffer, i2, z));
            return;
        }
        throw new IOException(buffer.size() + " != " + i2);
    }

    /* JADX INFO: renamed from: M */
    public final synchronized void m154862M(y320 y320Var) {
        if (!this.f134151g) {
            this.f134153i.execute(y320Var);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m154863N(int i, List<hxk> list, boolean z) {
        try {
            m154862M(new C18473e("OkHttp %s Push Headers[%s]", new Object[]{this.f134148d, Integer.valueOf(i)}, i, list, z));
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
    public void m154864Q(int r9, java.util.List<p149l.hxk> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f134169y     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L18
            okhttp3.internal.http2.ErrorCode r10 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.m154877m0(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L3d
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.f134169y     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3a
            r0.add(r1)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3a
            l.mjl$d r2 = new l.mjl$d     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.f134148d     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1}     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            r3.m154862M(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
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
        throw new UnsupportedOperationException("Method not decompiled: p149l.mjl.m154864Q(int, java.util.List):void");
    }

    /* JADX INFO: renamed from: S */
    public void m154865S(int i, ErrorCode errorCode) {
        m154862M(new C18475g("OkHttp %s Push Reset[%s]", new Object[]{this.f134148d, Integer.valueOf(i)}, i, errorCode));
    }

    /* JADX INFO: renamed from: T */
    public boolean m154866T(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* JADX INFO: renamed from: Y */
    public synchronized pjl m154867Y(int i) {
        pjl pjlVarRemove;
        pjlVarRemove = this.f134147c.remove(Integer.valueOf(i));
        notifyAll();
        return pjlVarRemove;
    }

    /* JADX INFO: renamed from: Z */
    public void m154868Z() {
        synchronized (this) {
            try {
                long j = this.f134158n;
                long j2 = this.f134157m;
                if (j < j2) {
                    return;
                }
                this.f134157m = j2 + 1;
                this.f134161q = System.nanoTime() + 1000000000;
                try {
                    this.f134152h.execute(new C18471c("OkHttp %s ping", this.f134148d));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m154869c0(ErrorCode errorCode) throws IOException {
        synchronized (this.f134167w) {
            synchronized (this) {
                if (this.f134151g) {
                    return;
                }
                this.f134151g = true;
                this.f134167w.m175013t(this.f134149e, errorCode, tck0.f169450a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m154879t(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX INFO: renamed from: d0 */
    public void m154870d0() throws IOException {
        m154871g0(true);
    }

    public void flush() throws IOException {
        this.f134167w.flush();
    }

    /* JADX INFO: renamed from: g0 */
    public void m154871g0(boolean z) throws IOException {
        if (z) {
            this.f134167w.m175009k();
            this.f134167w.m175005I(this.f134164t);
            int iM165173d = this.f134164t.m165173d();
            if (iM165173d != 65535) {
                this.f134167w.m175006J(0, iM165173d - j6f.COLOR_SPACE_UNCALIBRATED);
            }
        }
        new Thread(this.f134168x).start();
    }

    /* JADX INFO: renamed from: h0 */
    public synchronized void m154872h0(long j) {
        long j2 = this.f134162r + j;
        this.f134162r = j2;
        if (j2 >= this.f134164t.m165173d() / 2) {
            m154878n0(0, this.f134162r);
            this.f134162r = 0L;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m154873i0(int i, boolean z, Buffer buffer, long j) throws IOException {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f134167w.m175010m(z, i, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.f134163s;
                            if (j2 <= 0) {
                                if (!this.f134147c.containsKey(Integer.valueOf(i))) {
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
                iMin = Math.min((int) Math.min(j, j2), this.f134167w.m175015v());
                j3 = iMin;
                this.f134163s -= j3;
            }
            j -= j3;
            this.f134167w.m175010m(z && j == 0, i, buffer, iMin);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m154874j0(int i, boolean z, List<hxk> list) throws IOException {
        this.f134167w.m175014u(z, i, list);
    }

    /* JADX INFO: renamed from: k0 */
    public void m154875k0(boolean z, int i, int i2) {
        try {
            this.f134167w.m175002B(z, i, i2);
        } catch (IOException e) {
            m154880u(e);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m154876l0(int i, ErrorCode errorCode) throws IOException {
        this.f134167w.m175004H(i, errorCode);
    }

    /* JADX INFO: renamed from: m0 */
    public void m154877m0(int i, ErrorCode errorCode) {
        try {
            this.f134152h.execute(new C18469a("OkHttp %s stream %d", new Object[]{this.f134148d, Integer.valueOf(i)}, i, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m154878n0(int i, long j) {
        try {
            this.f134152h.execute(new C18470b("OkHttp Window Update %s stream %d", new Object[]{this.f134148d, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public void m154879t(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        pjl[] pjlVarArr;
        try {
            m154869c0(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f134147c.isEmpty()) {
                    pjlVarArr = null;
                } else {
                    pjlVarArr = (pjl[]) this.f134147c.values().toArray(new pjl[this.f134147c.size()]);
                    this.f134147c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pjlVarArr != null) {
            for (pjl pjlVar : pjlVarArr) {
                try {
                    pjlVar.m169889d(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f134167w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f134166v.close();
        } catch (IOException unused4) {
        }
        this.f134152h.shutdown();
        this.f134153i.shutdown();
    }

    /* JADX INFO: renamed from: u */
    public final void m154880u(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m154879t(errorCode, errorCode, iOException);
    }

    /* JADX INFO: renamed from: v */
    public synchronized pjl m154881v(int i) {
        return this.f134147c.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: l.mjl$l */
    public class C18480l extends y320 implements ojl.InterfaceC18963b {

        /* JADX INFO: renamed from: b */
        public final ojl f134206b;

        /* JADX INFO: renamed from: l.mjl$l$a */
        public class a extends y320 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ pjl f134208b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, pjl pjlVar) {
                super(str, objArr);
                this.f134208b = pjlVar;
            }

            @Override // p149l.y320
            /* JADX INFO: renamed from: k */
            public void mo96078k() {
                try {
                    mjl.this.f134146b.mo101334f(this.f134208b);
                } catch (IOException e) {
                    Platform.get().log(4, "Http2Connection.Listener failure for " + mjl.this.f134148d, e);
                    try {
                        this.f134208b.m169889d(ErrorCode.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* JADX INFO: renamed from: l.mjl$l$b */
        public class b extends y320 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f134210b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ one0 f134211c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z, one0 one0Var) {
                super(str, objArr);
                this.f134210b = z;
                this.f134211c = one0Var;
            }

            @Override // p149l.y320
            /* JADX INFO: renamed from: k */
            public void mo96078k() {
                C18480l.this.m154896l(this.f134210b, this.f134211c);
            }
        }

        /* JADX INFO: renamed from: l.mjl$l$c */
        public class c extends y320 {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // p149l.y320
            /* JADX INFO: renamed from: k */
            public void mo96078k() {
                mjl mjlVar = mjl.this;
                mjlVar.f134146b.mo101333e(mjlVar);
            }
        }

        public C18480l(ojl ojlVar) {
            super("OkHttp %s", mjl.this.f134148d);
            this.f134206b = ojlVar;
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: a */
        public void mo154886a(int i, int i2, List<hxk> list) throws Throwable {
            mjl.this.m154864Q(i2, list);
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: b */
        public void mo154887b(boolean z, int i, int i2) {
            mjl mjlVar = mjl.this;
            if (!z) {
                try {
                    mjlVar.f134152h.execute(mjl.this.new C18479k(true, i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (mjlVar) {
                try {
                    if (i == 1) {
                        mjl.m154848e(mjl.this);
                    } else if (i == 2) {
                        mjl.m154855n(mjl.this);
                    } else if (i == 3) {
                        mjl.m154856q(mjl.this);
                        mjl.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: c */
        public void mo154888c(int i, ErrorCode errorCode) {
            boolean zM154866T = mjl.this.m154866T(i);
            mjl mjlVar = mjl.this;
            if (zM154866T) {
                mjlVar.m154865S(i, errorCode);
                return;
            }
            pjl pjlVarM154867Y = mjlVar.m154867Y(i);
            if (pjlVarM154867Y != null) {
                pjlVarM154867Y.m169900o(errorCode);
            }
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: d */
        public void mo154889d(int i, ErrorCode errorCode, ByteString byteString) {
            pjl[] pjlVarArr;
            byteString.size();
            synchronized (mjl.this) {
                pjlVarArr = (pjl[]) mjl.this.f134147c.values().toArray(new pjl[mjl.this.f134147c.size()]);
                mjl.this.f134151g = true;
            }
            for (pjl pjlVar : pjlVarArr) {
                if (pjlVar.m169892g() > i && pjlVar.m169895j()) {
                    pjlVar.m169900o(ErrorCode.REFUSED_STREAM);
                    mjl.this.m154867Y(pjlVar.m169892g());
                }
            }
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: e */
        public void mo154890e(boolean z, int i, int i2, List<hxk> list) {
            boolean zM154866T = mjl.this.m154866T(i);
            mjl mjlVar = mjl.this;
            if (zM154866T) {
                mjlVar.m154863N(i, list, z);
                return;
            }
            synchronized (mjlVar) {
                try {
                    pjl pjlVarM154881v = mjl.this.m154881v(i);
                    if (pjlVarM154881v != null) {
                        pjlVarM154881v.m169899n(tck0.m187997J(list), z);
                        return;
                    }
                    if (mjl.this.f134151g) {
                        return;
                    }
                    mjl mjlVar2 = mjl.this;
                    if (i <= mjlVar2.f134149e) {
                        return;
                    }
                    if (i % 2 == mjlVar2.f134150f % 2) {
                        return;
                    }
                    pjl pjlVar = new pjl(i, mjl.this, false, z, tck0.m187997J(list));
                    mjl mjlVar3 = mjl.this;
                    mjlVar3.f134149e = i;
                    mjlVar3.f134147c.put(Integer.valueOf(i), pjlVar);
                    mjl.f134144z.execute(new a("OkHttp %s stream %d", new Object[]{mjl.this.f134148d, Integer.valueOf(i)}, pjlVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: f */
        public void mo154891f(int i, long j) {
            mjl mjlVar = mjl.this;
            if (i == 0) {
                synchronized (mjlVar) {
                    mjl mjlVar2 = mjl.this;
                    mjlVar2.f134163s += j;
                    mjlVar2.notifyAll();
                }
                return;
            }
            pjl pjlVarM154881v = mjlVar.m154881v(i);
            if (pjlVarM154881v != null) {
                synchronized (pjlVarM154881v) {
                    pjlVarM154881v.m169886a(j);
                }
            }
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: h */
        public void mo154893h(boolean z, one0 one0Var) {
            try {
                mjl.this.f134152h.execute(new b("OkHttp %s ACK Settings", new Object[]{mjl.this.f134148d}, z, one0Var));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: i */
        public void mo154894i(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            boolean zM154866T = mjl.this.m154866T(i);
            mjl mjlVar = mjl.this;
            if (zM154866T) {
                mjlVar.m154861J(i, bufferedSource, i2, z);
                return;
            }
            pjl pjlVarM154881v = mjlVar.m154881v(i);
            if (pjlVarM154881v == null) {
                mjl.this.m154877m0(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                mjl.this.m154872h0(j);
                bufferedSource.skip(j);
                return;
            }
            pjlVarM154881v.m169898m(bufferedSource, i2);
            if (z) {
                pjlVarM154881v.m169899n(tck0.f169452c, true);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable, l.ojl] */
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
        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.f134206b.m164665e(this);
                    while (this.f134206b.m164664d(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        errorCode2 = ErrorCode.CANCEL;
                        mjl.this.m154879t(errorCode3, errorCode2, null);
                        errorCode = errorCode3;
                    } catch (IOException e2) {
                        e = e2;
                        errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        mjl mjlVar = mjl.this;
                        mjlVar.m154879t(errorCode2, errorCode2, e);
                        errorCode = mjlVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    mjl.this.m154879t(errorCode, errorCode2, e);
                    tck0.m188006g(this.f134206b);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                mjl.this.m154879t(errorCode, errorCode2, e);
                tck0.m188006g(this.f134206b);
                throw th;
            }
            this = this.f134206b;
            tck0.m188006g(this);
        }

        /* JADX INFO: renamed from: l */
        public void m154896l(boolean z, one0 one0Var) {
            pjl[] pjlVarArr;
            long j;
            synchronized (mjl.this.f134167w) {
                synchronized (mjl.this) {
                    try {
                        int iM165173d = mjl.this.f134165u.m165173d();
                        if (z) {
                            mjl.this.f134165u.m165170a();
                        }
                        mjl.this.f134165u.m165177h(one0Var);
                        int iM165173d2 = mjl.this.f134165u.m165173d();
                        pjlVarArr = null;
                        if (iM165173d2 == -1 || iM165173d2 == iM165173d) {
                            j = 0;
                        } else {
                            j = iM165173d2 - iM165173d;
                            if (!mjl.this.f134147c.isEmpty()) {
                                pjlVarArr = (pjl[]) mjl.this.f134147c.values().toArray(new pjl[mjl.this.f134147c.size()]);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    mjl mjlVar = mjl.this;
                    mjlVar.f134167w.m175008b(mjlVar.f134165u);
                } catch (IOException e) {
                    mjl.this.m154880u(e);
                }
            }
            if (pjlVarArr != null) {
                for (pjl pjlVar : pjlVarArr) {
                    synchronized (pjlVar) {
                        pjlVar.m169886a(j);
                    }
                }
            }
            mjl.f134144z.execute(new c("OkHttp %s settings", mjl.this.f134148d));
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: g */
        public void mo154892g() {
        }

        @Override // p149l.ojl.InterfaceC18963b
        /* JADX INFO: renamed from: j */
        public void mo154895j(int i, int i2, int i3, boolean z) {
        }
    }

    /* JADX INFO: renamed from: l.mjl$j */
    public static abstract class AbstractC18478j {

        /* JADX INFO: renamed from: a */
        public static final AbstractC18478j f134201a = new a();

        /* JADX INFO: renamed from: l.mjl$j$a */
        public static class a extends AbstractC18478j {
            @Override // p149l.mjl.AbstractC18478j
            /* JADX INFO: renamed from: f */
            public void mo101334f(pjl pjlVar) throws IOException {
                pjlVar.m169889d(ErrorCode.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo101334f(pjl pjlVar) throws IOException;

        /* JADX INFO: renamed from: e */
        public void mo101333e(mjl mjlVar) {
        }
    }
}
