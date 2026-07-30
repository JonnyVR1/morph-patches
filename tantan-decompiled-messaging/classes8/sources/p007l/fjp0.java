package p007l;

import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.aza0;
import l.cfc0;
import l.exc0;
import l.j5f;
import l.jfd0;
import l.k850;
import l.kg3;
import l.kxm;
import l.o3f;
import l.stc0;
import l.sx3;
import l.tck0;
import l.x74;
import l.x9g0;
import l.yec0;
import l.zec0;
import okhttp3.Protocol;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class fjp0 implements djp0, yjp0.InterfaceC0793a {

    /* JADX INFO: renamed from: v */
    public static final List<Protocol> f2690v = Collections.singletonList(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: a */
    public final stc0 f2691a;

    /* JADX INFO: renamed from: b */
    public final hjp0 f2692b;

    /* JADX INFO: renamed from: c */
    public final Random f2693c;

    /* JADX INFO: renamed from: d */
    public final String f2694d;

    /* JADX INFO: renamed from: e */
    public sx3 f2695e;

    /* JADX INFO: renamed from: f */
    public final Runnable f2696f;

    /* JADX INFO: renamed from: g */
    public yjp0 f2697g;

    /* JADX INFO: renamed from: h */
    public akp0 f2698h;

    /* JADX INFO: renamed from: i */
    public ScheduledExecutorService f2699i;

    /* JADX INFO: renamed from: j */
    public AbstractC0544i f2700j;

    /* JADX INFO: renamed from: m */
    public long f2703m;

    /* JADX INFO: renamed from: n */
    public boolean f2704n;

    /* JADX INFO: renamed from: o */
    public ScheduledFuture<?> f2705o;

    /* JADX INFO: renamed from: q */
    public String f2707q;

    /* JADX INFO: renamed from: r */
    public boolean f2708r;

    /* JADX INFO: renamed from: s */
    public int f2709s;

    /* JADX INFO: renamed from: t */
    public int f2710t;

    /* JADX INFO: renamed from: u */
    public int f2711u;

    /* JADX INFO: renamed from: k */
    public final ArrayDeque<ByteString> f2701k = new ArrayDeque<>();

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<Object> f2702l = new ArrayDeque<>();

    /* JADX INFO: renamed from: p */
    public int f2706p = -1;

    /* JADX INFO: renamed from: l.fjp0$a */
    public class RunnableC0536a implements Runnable {
        public RunnableC0536a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                } catch (IOException e) {
                    fjp0.this.mo8996f(e, null);
                    return;
                }
            } while (fjp0.this.m9142p());
        }
    }

    /* JADX INFO: renamed from: l.fjp0$c */
    public class C0538c implements x74 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ stc0 f2714a;

        /* JADX INFO: renamed from: l.fjp0$c$a */
        public class a extends AbstractC0544i {

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ j5f f2716d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, j5f j5fVar) {
                super(z, bufferedSource, bufferedSink);
                this.f2716d = j5fVar;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f2716d.a(-1L, true, true, (IOException) null);
            }
        }

        public C0538c(stc0 stc0Var) {
            this.f2714a = stc0Var;
        }

        public void onFailure(sx3 sx3Var, IOException iOException) {
            fjp0.this.mo8996f(iOException, null);
        }

        public void onResponse(sx3 sx3Var, exc0 exc0Var) {
            C0538c c0538c;
            j5f j5fVarF = kxm.a.f(exc0Var);
            try {
                fjp0.this.m9135h(exc0Var, j5fVarF);
                cfc0.f fVarI = j5fVarF.i();
                try {
                    String str = "OkHttp WebSocket " + this.f2714a.k().G();
                    c0538c = this;
                    try {
                        a aVar = c0538c.new a(true, fVarI.b, fVarI.c, j5fVarF);
                        fjp0 fjp0Var = fjp0.this;
                        fjp0Var.m9138k(str, fjp0Var.f2711u, aVar);
                        fjp0 fjp0Var2 = fjp0.this;
                        fjp0Var2.f2692b.m9341f(fjp0Var2, exc0Var);
                        fjp0.this.m9139l();
                    } catch (Exception e) {
                        e = e;
                        fjp0.this.mo8996f(e, null);
                    }
                } catch (Exception e2) {
                    e = e2;
                    c0538c = this;
                }
            } catch (IOException e3) {
                if (j5fVarF != null) {
                    j5fVarF.q();
                }
                fjp0.this.mo8996f(e3, exc0Var);
                tck0.g(exc0Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.fjp0$d */
    public class RejectedExecutionHandlerC0539d implements RejectedExecutionHandler {
        public RejectedExecutionHandlerC0539d() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            fjp0.this.mo8996f(new RejectedExecutionException(), null);
        }
    }

    /* JADX INFO: renamed from: l.fjp0$e */
    public final class RunnableC0540e implements Runnable {
        public RunnableC0540e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fjp0.this.m9134g();
        }
    }

    /* JADX INFO: renamed from: l.fjp0$f */
    public static final class C0541f {

        /* JADX INFO: renamed from: a */
        public final int f2720a;

        /* JADX INFO: renamed from: b */
        public final ByteString f2721b;

        /* JADX INFO: renamed from: c */
        public final long f2722c;

        public C0541f(int i, ByteString byteString, long j) {
            this.f2720a = i;
            this.f2721b = byteString;
            this.f2722c = j;
        }
    }

    /* JADX INFO: renamed from: l.fjp0$g */
    public static final class C0542g {

        /* JADX INFO: renamed from: a */
        public final int f2723a;

        /* JADX INFO: renamed from: b */
        public final ByteString f2724b;

        public C0542g(int i, ByteString byteString) {
            this.f2723a = i;
            this.f2724b = byteString;
        }
    }

    /* JADX INFO: renamed from: l.fjp0$i */
    public static abstract class AbstractC0544i implements Closeable {

        /* JADX INFO: renamed from: a */
        public final boolean f2727a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f2728b;

        /* JADX INFO: renamed from: c */
        public final BufferedSink f2729c;

        public AbstractC0544i(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f2727a = z;
            this.f2728b = bufferedSource;
            this.f2729c = bufferedSink;
        }
    }

    public fjp0(stc0 stc0Var, hjp0 hjp0Var, Random random) {
        if (!"GET".equals(stc0Var.g())) {
            kg3.a("Request must be GET: ", stc0Var.g());
            throw null;
        }
        this.f2691a = stc0Var;
        this.f2692b = hjp0Var;
        this.f2693c = random;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f2694d = ByteString.of(bArr).base64();
        this.f2696f = new RunnableC0536a();
    }

    /* JADX INFO: renamed from: m */
    public static djp0 m9130m(stc0 stc0Var, k850 k850Var, int i, String str, boolean z, hjp0 hjp0Var) {
        fjp0 fjp0Var = new fjp0(stc0Var, hjp0Var, new Random());
        fjp0Var.f2711u = i;
        fjp0Var.m9137j(k850Var, str, z);
        return fjp0Var;
    }

    @Override // p007l.yjp0.InterfaceC0793a
    /* JADX INFO: renamed from: a */
    public synchronized void mo9131a(ByteString byteString) {
        try {
            if (!this.f2708r && (!this.f2704n || !this.f2702l.isEmpty())) {
                this.f2701k.add(byteString);
                m9140n();
                this.f2709s++;
                this.f2692b.m9342g(byteString);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p007l.yjp0.InterfaceC0793a
    /* JADX INFO: renamed from: b */
    public synchronized void mo9132b(ByteString byteString) {
        this.f2710t++;
        if (this.f2708r) {
            return;
        }
        this.f2692b.m9343h(byteString);
    }

    @Override // p007l.djp0
    /* JADX INFO: renamed from: c */
    public boolean mo8994c(ByteString byteString) {
        if (byteString != null) {
            return m9141o(byteString, 2);
        }
        jfd0.a("bytes == null");
        return false;
    }

    @Override // p007l.djp0
    public boolean close(int i, String str) {
        return m9136i(i, str, 60000L);
    }

    @Override // p007l.yjp0.InterfaceC0793a
    /* JADX INFO: renamed from: d */
    public void mo9133d(ByteString byteString) throws IOException {
        if (this.f2708r) {
            return;
        }
        this.f2692b.m9340e(this, byteString);
    }

    @Override // p007l.djp0
    /* JADX INFO: renamed from: e */
    public boolean mo8995e(ByteString byteString) {
        ScheduledExecutorService scheduledExecutorService;
        if (this.f2708r || this.f2704n || (scheduledExecutorService = this.f2699i) == null || scheduledExecutorService.isShutdown()) {
            return false;
        }
        this.f2699i.execute(new RunnableC0543h(byteString));
        return true;
    }

    @Override // p007l.djp0
    /* JADX INFO: renamed from: f */
    public void mo8996f(Exception exc, @Nullable exc0 exc0Var) {
        synchronized (this) {
            try {
                if (this.f2708r) {
                    return;
                }
                this.f2708r = true;
                AbstractC0544i abstractC0544i = this.f2700j;
                this.f2700j = null;
                ScheduledFuture<?> scheduledFuture = this.f2705o;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f2699i;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.f2692b.m9338c(this, exc, exc0Var);
                } finally {
                    tck0.g(abstractC0544i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m9134g() {
        this.f2695e.cancel();
    }

    /* JADX INFO: renamed from: h */
    public void m9135h(exc0 exc0Var, @Nullable j5f j5fVar) throws IOException {
        if (exc0Var.q() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + exc0Var.q() + " " + exc0Var.J() + "'");
        }
        String strU = exc0Var.u("Connection");
        if (!"Upgrade".equalsIgnoreCase(strU)) {
            zec0.a("Expected 'Connection' header value 'Upgrade' but was '", strU);
            return;
        }
        String strU2 = exc0Var.u("Upgrade");
        if (!"websocket".equalsIgnoreCase(strU2)) {
            zec0.a("Expected 'Upgrade' header value 'websocket' but was '", strU2);
            return;
        }
        String strU3 = exc0Var.u("Sec-WebSocket-Accept");
        String strBase64 = ByteString.encodeUtf8(this.f2694d + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (!strBase64.equals(strU3)) {
            yec0.a(strBase64, strU3);
        } else {
            if (j5fVar != null) {
                return;
            }
            aza0.a("Web Socket exchange missing: bad interceptor?");
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m9136i(int i, String str, long j) {
        ByteString byteStringEncodeUtf8;
        try {
            xjp0.m11838c(i);
            if (str != null) {
                byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
                if (byteStringEncodeUtf8.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                }
            } else {
                byteStringEncodeUtf8 = null;
            }
            if (!this.f2708r && !this.f2704n) {
                this.f2704n = true;
                this.f2702l.add(new C0541f(i, byteStringEncodeUtf8, j));
                m9140n();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m9137j(k850 k850Var, String str, boolean z) {
        k850.b bVarQ = k850Var.v().k(o3f.NONE).q(f2690v);
        if (!z) {
            bVarQ.s(new C0537b());
        }
        k850 k850VarC = bVarQ.c();
        stc0 stc0VarB = this.f2691a.h().h("User-Agent", str).h("Upgrade", "websocket").h("Connection", "Upgrade").h("Sec-WebSocket-Key", this.f2694d).h("Sec-WebSocket-Version", "13").b();
        sx3 sx3VarH = kxm.a.h(k850VarC, stc0VarB);
        this.f2695e = sx3VarH;
        qb20.m10335c(sx3VarH, new C0538c(stc0VarB));
    }

    /* JADX INFO: renamed from: k */
    public void m9138k(String str, long j, AbstractC0544i abstractC0544i) throws IOException {
        synchronized (this) {
            try {
                this.f2700j = abstractC0544i;
                this.f2698h = new akp0(abstractC0544i.f2727a, abstractC0544i.f2729c, this.f2693c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, tck0.H(str, false), new RejectedExecutionHandlerC0539d());
                this.f2699i = scheduledThreadPoolExecutor;
                if (j != 0) {
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(new RunnableC0543h(), j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.f2702l.isEmpty()) {
                    m9140n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2697g = new yjp0(abstractC0544i.f2727a, abstractC0544i.f2728b, this);
    }

    /* JADX INFO: renamed from: l */
    public void m9139l() throws IOException {
        while (this.f2706p == -1) {
            this.f2697g.m11928a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m9140n() {
        ScheduledExecutorService scheduledExecutorService = this.f2699i;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        this.f2699i.execute(this.f2696f);
    }

    /* JADX INFO: renamed from: o */
    public synchronized boolean m9141o(ByteString byteString, int i) {
        if (!this.f2708r && !this.f2704n) {
            if (this.f2703m + ((long) byteString.size()) > 16777216) {
                close(1001, null);
                return false;
            }
            this.f2703m += (long) byteString.size();
            this.f2702l.add(new C0542g(i, byteString));
            m9140n();
            return true;
        }
        return false;
    }

    @Override // p007l.yjp0.InterfaceC0793a
    public void onReadClose(int i, String str) {
        AbstractC0544i abstractC0544i;
        if (i == -1) {
            x9g0.a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f2706p != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f2706p = i;
                this.f2707q = str;
                abstractC0544i = null;
                if (this.f2704n && this.f2702l.isEmpty()) {
                    AbstractC0544i abstractC0544i2 = this.f2700j;
                    this.f2700j = null;
                    ScheduledFuture<?> scheduledFuture = this.f2705o;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f2699i.shutdown();
                    abstractC0544i = abstractC0544i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f2692b.m9337b(this, i, str);
            if (abstractC0544i != null) {
                this.f2692b.m9336a(this, i, str);
            }
        } finally {
            tck0.g(abstractC0544i);
        }
    }

    @Override // p007l.yjp0.InterfaceC0793a
    public void onReadMessage(String str) throws IOException {
        if (this.f2708r) {
            return;
        }
        this.f2692b.m9339d(this, str);
    }

    /* JADX INFO: renamed from: p */
    public boolean m9142p() throws IOException {
        String str;
        int i;
        AbstractC0544i abstractC0544i;
        synchronized (this) {
            try {
                if (this.f2708r) {
                    return false;
                }
                akp0 akp0Var = this.f2698h;
                ByteString byteStringPoll = this.f2701k.poll();
                Object obj = null;
                if (byteStringPoll == null) {
                    Object objPoll = this.f2702l.poll();
                    if (objPoll instanceof C0541f) {
                        i = this.f2706p;
                        str = this.f2707q;
                        if (i != -1) {
                            abstractC0544i = this.f2700j;
                            this.f2700j = null;
                            this.f2699i.shutdown();
                        } else {
                            this.f2705o = this.f2699i.schedule(new RunnableC0540e(), ((C0541f) objPoll).f2722c, TimeUnit.MILLISECONDS);
                            abstractC0544i = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        abstractC0544i = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    i = -1;
                    abstractC0544i = null;
                }
                try {
                    if (byteStringPoll != null) {
                        akp0Var.m8563f(byteStringPoll);
                    } else if (obj instanceof C0542g) {
                        ByteString byteString = ((C0542g) obj).f2724b;
                        BufferedSink bufferedSinkBuffer = Okio.buffer(akp0Var.m8558a(((C0542g) obj).f2723a, byteString.size()));
                        bufferedSinkBuffer.write(byteString);
                        bufferedSinkBuffer.close();
                        synchronized (this) {
                            this.f2703m -= (long) byteString.size();
                        }
                    } else {
                        if (!(obj instanceof C0541f)) {
                            throw new AssertionError();
                        }
                        C0541f c0541f = (C0541f) obj;
                        akp0Var.m8559b(c0541f.f2720a, c0541f.f2721b);
                        if (abstractC0544i != null) {
                            this.f2692b.m9336a(this, i, str);
                        }
                    }
                    tck0.g(abstractC0544i);
                    return true;
                } catch (Throwable th) {
                    tck0.g(abstractC0544i);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m9143q(ByteString byteString) {
        synchronized (this) {
            try {
                if (this.f2708r) {
                    return;
                }
                akp0 akp0Var = this.f2698h;
                if (byteString == null) {
                    try {
                        byteString = ByteString.EMPTY;
                    } catch (IOException e) {
                        mo8996f(e, null);
                        return;
                    }
                }
                akp0Var.m8562e(byteString);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p007l.djp0
    public void release() {
        synchronized (this) {
            try {
                if (this.f2708r) {
                    return;
                }
                this.f2708r = true;
                AbstractC0544i abstractC0544i = this.f2700j;
                this.f2700j = null;
                ScheduledFuture<?> scheduledFuture = this.f2705o;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f2699i;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                tck0.g(abstractC0544i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.fjp0$h */
    public final class RunnableC0543h implements Runnable {

        /* JADX INFO: renamed from: a */
        public ByteString f2725a;

        public RunnableC0543h(ByteString byteString) {
            this.f2725a = byteString;
        }

        @Override // java.lang.Runnable
        public void run() {
            fjp0.this.m9143q(this.f2725a);
        }

        public RunnableC0543h() {
        }
    }

    /* JADX INFO: renamed from: l.fjp0$b */
    public class C0537b extends ProxySelector {
        public C0537b() {
        }

        @Override // java.net.ProxySelector
        public List<Proxy> select(URI uri) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }

        @Override // java.net.ProxySelector
        public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        }
    }
}
