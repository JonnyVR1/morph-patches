package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
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
import okhttp3.Protocol;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* JADX INFO: loaded from: classes8.dex */
public class fjp0 implements djp0, yjp0.InterfaceC21421a {

    /* JADX INFO: renamed from: v */
    public static final List<Protocol> f97805v = Collections.singletonList(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: a */
    public final stc0 f97806a;

    /* JADX INFO: renamed from: b */
    public final hjp0 f97807b;

    /* JADX INFO: renamed from: c */
    public final Random f97808c;

    /* JADX INFO: renamed from: d */
    public final String f97809d;

    /* JADX INFO: renamed from: e */
    public sx3 f97810e;

    /* JADX INFO: renamed from: f */
    public final Runnable f97811f;

    /* JADX INFO: renamed from: g */
    public yjp0 f97812g;

    /* JADX INFO: renamed from: h */
    public akp0 f97813h;

    /* JADX INFO: renamed from: i */
    public ScheduledExecutorService f97814i;

    /* JADX INFO: renamed from: j */
    public AbstractC16861i f97815j;

    /* JADX INFO: renamed from: m */
    public long f97818m;

    /* JADX INFO: renamed from: n */
    public boolean f97819n;

    /* JADX INFO: renamed from: o */
    public ScheduledFuture<?> f97820o;

    /* JADX INFO: renamed from: q */
    public String f97822q;

    /* JADX INFO: renamed from: r */
    public boolean f97823r;

    /* JADX INFO: renamed from: s */
    public int f97824s;

    /* JADX INFO: renamed from: t */
    public int f97825t;

    /* JADX INFO: renamed from: u */
    public int f97826u;

    /* JADX INFO: renamed from: k */
    public final ArrayDeque<ByteString> f97816k = new ArrayDeque<>();

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<Object> f97817l = new ArrayDeque<>();

    /* JADX INFO: renamed from: p */
    public int f97821p = -1;

    /* JADX INFO: renamed from: l.fjp0$a */
    public class RunnableC16853a implements Runnable {
        public RunnableC16853a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                } catch (IOException e) {
                    fjp0.this.mo112096f(e, null);
                    return;
                }
            } while (fjp0.this.m121619p());
        }
    }

    /* JADX INFO: renamed from: l.fjp0$c */
    public class C16855c implements x74 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ stc0 f97829a;

        /* JADX INFO: renamed from: l.fjp0$c$a */
        public class a extends AbstractC16861i {

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ j5f f97831d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, j5f j5fVar) {
                super(z, bufferedSource, bufferedSink);
                this.f97831d = j5fVar;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f97831d.m139844a(-1L, true, true, null);
            }
        }

        public C16855c(stc0 stc0Var) {
            this.f97829a = stc0Var;
        }

        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) {
            fjp0.this.mo112096f(iOException, null);
        }

        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) {
            C16855c c16855c;
            j5f j5fVarMo144876f = kxm.f125142a.mo144876f(exc0Var);
            try {
                fjp0.this.m121612h(exc0Var, j5fVarMo144876f);
                cfc0.AbstractC16122f abstractC16122fM139852i = j5fVarMo144876f.m139852i();
                try {
                    String str = "OkHttp WebSocket " + this.f97829a.m185881k().m107512G();
                    c16855c = this;
                    try {
                        a aVar = c16855c.new a(true, abstractC16122fM139852i.f80586b, abstractC16122fM139852i.f80587c, j5fVarMo144876f);
                        fjp0 fjp0Var = fjp0.this;
                        fjp0Var.m121615k(str, fjp0Var.f97826u, aVar);
                        fjp0 fjp0Var2 = fjp0.this;
                        fjp0Var2.f97807b.mo29500f(fjp0Var2, exc0Var);
                        fjp0.this.m121616l();
                    } catch (Exception e) {
                        e = e;
                        fjp0.this.mo112096f(e, null);
                    }
                } catch (Exception e2) {
                    e = e2;
                    c16855c = this;
                }
            } catch (IOException e3) {
                if (j5fVarMo144876f != null) {
                    j5fVarMo144876f.m139860q();
                }
                fjp0.this.mo112096f(e3, exc0Var);
                tck0.m188006g(exc0Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.fjp0$d */
    public class RejectedExecutionHandlerC16856d implements RejectedExecutionHandler {
        public RejectedExecutionHandlerC16856d() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            fjp0.this.mo112096f(new RejectedExecutionException(), null);
        }
    }

    /* JADX INFO: renamed from: l.fjp0$e */
    public final class RunnableC16857e implements Runnable {
        public RunnableC16857e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fjp0.this.m121611g();
        }
    }

    /* JADX INFO: renamed from: l.fjp0$f */
    public static final class C16858f {

        /* JADX INFO: renamed from: a */
        public final int f97835a;

        /* JADX INFO: renamed from: b */
        public final ByteString f97836b;

        /* JADX INFO: renamed from: c */
        public final long f97837c;

        public C16858f(int i, ByteString byteString, long j) {
            this.f97835a = i;
            this.f97836b = byteString;
            this.f97837c = j;
        }
    }

    /* JADX INFO: renamed from: l.fjp0$g */
    public static final class C16859g {

        /* JADX INFO: renamed from: a */
        public final int f97838a;

        /* JADX INFO: renamed from: b */
        public final ByteString f97839b;

        public C16859g(int i, ByteString byteString) {
            this.f97838a = i;
            this.f97839b = byteString;
        }
    }

    /* JADX INFO: renamed from: l.fjp0$i */
    public static abstract class AbstractC16861i implements Closeable {

        /* JADX INFO: renamed from: a */
        public final boolean f97842a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f97843b;

        /* JADX INFO: renamed from: c */
        public final BufferedSink f97844c;

        public AbstractC16861i(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f97842a = z;
            this.f97843b = bufferedSource;
            this.f97844c = bufferedSink;
        }
    }

    public fjp0(stc0 stc0Var, hjp0 hjp0Var, Random random) {
        if (!"GET".equals(stc0Var.m185877g())) {
            kg3.m145878a("Request must be GET: ", stc0Var.m185877g());
            throw null;
        }
        this.f97806a = stc0Var;
        this.f97807b = hjp0Var;
        this.f97808c = random;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f97809d = ByteString.m221050of(bArr).base64();
        this.f97811f = new RunnableC16853a();
    }

    /* JADX INFO: renamed from: m */
    public static djp0 m121607m(stc0 stc0Var, k850 k850Var, int i, String str, boolean z, hjp0 hjp0Var) {
        fjp0 fjp0Var = new fjp0(stc0Var, hjp0Var, new Random());
        fjp0Var.f97826u = i;
        fjp0Var.m121614j(k850Var, str, z);
        return fjp0Var;
    }

    @Override // p149l.yjp0.InterfaceC21421a
    /* JADX INFO: renamed from: a */
    public synchronized void mo121608a(ByteString byteString) {
        try {
            if (!this.f97823r && (!this.f97819n || !this.f97817l.isEmpty())) {
                this.f97816k.add(byteString);
                m121617n();
                this.f97824s++;
                this.f97807b.mo29501g(byteString);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.yjp0.InterfaceC21421a
    /* JADX INFO: renamed from: b */
    public synchronized void mo121609b(ByteString byteString) {
        this.f97825t++;
        if (this.f97823r) {
            return;
        }
        this.f97807b.mo29502h(byteString);
    }

    @Override // p149l.djp0
    /* JADX INFO: renamed from: c */
    public boolean mo112094c(ByteString byteString) {
        if (byteString != null) {
            return m121618o(byteString, 2);
        }
        jfd0.m141176a("bytes == null");
        return false;
    }

    @Override // p149l.djp0
    public boolean close(int i, String str) {
        return m121613i(i, str, Constants.ONE_MIN_IN_MILLIS);
    }

    @Override // p149l.yjp0.InterfaceC21421a
    /* JADX INFO: renamed from: d */
    public void mo121610d(ByteString byteString) throws IOException {
        if (this.f97823r) {
            return;
        }
        this.f97807b.mo29499e(this, byteString);
    }

    @Override // p149l.djp0
    /* JADX INFO: renamed from: e */
    public boolean mo112095e(ByteString byteString) {
        ScheduledExecutorService scheduledExecutorService;
        if (this.f97823r || this.f97819n || (scheduledExecutorService = this.f97814i) == null || scheduledExecutorService.isShutdown()) {
            return false;
        }
        this.f97814i.execute(new RunnableC16860h(byteString));
        return true;
    }

    @Override // p149l.djp0
    /* JADX INFO: renamed from: f */
    public void mo112096f(Exception exc, @Nullable exc0 exc0Var) {
        synchronized (this) {
            try {
                if (this.f97823r) {
                    return;
                }
                this.f97823r = true;
                AbstractC16861i abstractC16861i = this.f97815j;
                this.f97815j = null;
                ScheduledFuture<?> scheduledFuture = this.f97820o;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f97814i;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.f97807b.mo29497c(this, exc, exc0Var);
                } finally {
                    tck0.m188006g(abstractC16861i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m121611g() {
        this.f97810e.cancel();
    }

    /* JADX INFO: renamed from: h */
    public void m121612h(exc0 exc0Var, @Nullable j5f j5fVar) throws IOException {
        if (exc0Var.m118609q() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + exc0Var.m118609q() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + exc0Var.m118598J() + "'");
        }
        String strM118611u = exc0Var.m118611u("Connection");
        if (!"Upgrade".equalsIgnoreCase(strM118611u)) {
            zec0.m218280a("Expected 'Connection' header value 'Upgrade' but was '", strM118611u);
            return;
        }
        String strM118611u2 = exc0Var.m118611u("Upgrade");
        if (!"websocket".equalsIgnoreCase(strM118611u2)) {
            zec0.m218280a("Expected 'Upgrade' header value 'websocket' but was '", strM118611u2);
            return;
        }
        String strM118611u3 = exc0Var.m118611u("Sec-WebSocket-Accept");
        String strBase64 = ByteString.encodeUtf8(this.f97809d + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (!strBase64.equals(strM118611u3)) {
            yec0.m214344a(strBase64, strM118611u3);
        } else {
            if (j5fVar != null) {
                return;
            }
            aza0.m99642a("Web Socket exchange missing: bad interceptor?");
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m121613i(int i, String str, long j) {
        ByteString byteStringEncodeUtf8;
        try {
            xjp0.m209734c(i);
            if (str != null) {
                byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
                if (byteStringEncodeUtf8.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                }
            } else {
                byteStringEncodeUtf8 = null;
            }
            if (!this.f97823r && !this.f97819n) {
                this.f97819n = true;
                this.f97817l.add(new C16858f(i, byteStringEncodeUtf8, j));
                m121617n();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m121614j(k850 k850Var, String str, boolean z) {
        k850.C17954b c17954bM144896q = k850Var.m144867v().m144890k(o3f.NONE).m144896q(f97805v);
        if (!z) {
            c17954bM144896q.m144898s(new C16854b());
        }
        k850 k850VarM144882c = c17954bM144896q.m144882c();
        stc0 stc0VarM185883b = this.f97806a.m185878h().m185889h("User-Agent", str).m185889h("Upgrade", "websocket").m185889h("Connection", "Upgrade").m185889h("Sec-WebSocket-Key", this.f97809d).m185889h("Sec-WebSocket-Version", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_JOININ_GROUP).m185883b();
        sx3 sx3VarMo144878h = kxm.f125142a.mo144878h(k850VarM144882c, stc0VarM185883b);
        this.f97810e = sx3VarMo144878h;
        qb20.m173812c(sx3VarMo144878h, new C16855c(stc0VarM185883b));
    }

    /* JADX INFO: renamed from: k */
    public void m121615k(String str, long j, AbstractC16861i abstractC16861i) throws IOException {
        synchronized (this) {
            try {
                this.f97815j = abstractC16861i;
                this.f97813h = new akp0(abstractC16861i.f97842a, abstractC16861i.f97844c, this.f97808c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, tck0.m187995H(str, false), new RejectedExecutionHandlerC16856d());
                this.f97814i = scheduledThreadPoolExecutor;
                if (j != 0) {
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(new RunnableC16860h(), j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.f97817l.isEmpty()) {
                    m121617n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f97812g = new yjp0(abstractC16861i.f97842a, abstractC16861i.f97843b, this);
    }

    /* JADX INFO: renamed from: l */
    public void m121616l() throws IOException {
        while (this.f97821p == -1) {
            this.f97812g.m215077a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m121617n() {
        ScheduledExecutorService scheduledExecutorService = this.f97814i;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        this.f97814i.execute(this.f97811f);
    }

    /* JADX INFO: renamed from: o */
    public synchronized boolean m121618o(ByteString byteString, int i) {
        if (!this.f97823r && !this.f97819n) {
            if (this.f97818m + ((long) byteString.size()) > 16777216) {
                close(1001, null);
                return false;
            }
            this.f97818m += (long) byteString.size();
            this.f97817l.add(new C16859g(i, byteString));
            m121617n();
            return true;
        }
        return false;
    }

    @Override // p149l.yjp0.InterfaceC21421a
    public void onReadClose(int i, String str) {
        AbstractC16861i abstractC16861i;
        if (i == -1) {
            x9g0.m207497a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f97821p != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f97821p = i;
                this.f97822q = str;
                abstractC16861i = null;
                if (this.f97819n && this.f97817l.isEmpty()) {
                    AbstractC16861i abstractC16861i2 = this.f97815j;
                    this.f97815j = null;
                    ScheduledFuture<?> scheduledFuture = this.f97820o;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f97814i.shutdown();
                    abstractC16861i = abstractC16861i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f97807b.mo29496b(this, i, str);
            if (abstractC16861i != null) {
                this.f97807b.mo29495a(this, i, str);
            }
        } finally {
            tck0.m188006g(abstractC16861i);
        }
    }

    @Override // p149l.yjp0.InterfaceC21421a
    public void onReadMessage(String str) throws IOException {
        if (this.f97823r) {
            return;
        }
        this.f97807b.mo29498d(this, str);
    }

    /* JADX INFO: renamed from: p */
    public boolean m121619p() throws IOException {
        String str;
        int i;
        AbstractC16861i abstractC16861i;
        synchronized (this) {
            try {
                if (this.f97823r) {
                    return false;
                }
                akp0 akp0Var = this.f97813h;
                ByteString byteStringPoll = this.f97816k.poll();
                Object obj = null;
                if (byteStringPoll == null) {
                    Object objPoll = this.f97817l.poll();
                    if (objPoll instanceof C16858f) {
                        i = this.f97821p;
                        str = this.f97822q;
                        if (i != -1) {
                            abstractC16861i = this.f97815j;
                            this.f97815j = null;
                            this.f97814i.shutdown();
                        } else {
                            this.f97820o = this.f97814i.schedule(new RunnableC16857e(), ((C16858f) objPoll).f97837c, TimeUnit.MILLISECONDS);
                            abstractC16861i = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        abstractC16861i = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    i = -1;
                    abstractC16861i = null;
                }
                try {
                    if (byteStringPoll != null) {
                        akp0Var.m97168f(byteStringPoll);
                    } else if (obj instanceof C16859g) {
                        ByteString byteString = ((C16859g) obj).f97839b;
                        BufferedSink bufferedSinkBuffer = Okio.buffer(akp0Var.m97163a(((C16859g) obj).f97838a, byteString.size()));
                        bufferedSinkBuffer.write(byteString);
                        bufferedSinkBuffer.close();
                        synchronized (this) {
                            this.f97818m -= (long) byteString.size();
                        }
                    } else {
                        if (!(obj instanceof C16858f)) {
                            throw new AssertionError();
                        }
                        C16858f c16858f = (C16858f) obj;
                        akp0Var.m97164b(c16858f.f97835a, c16858f.f97836b);
                        if (abstractC16861i != null) {
                            this.f97807b.mo29495a(this, i, str);
                        }
                    }
                    tck0.m188006g(abstractC16861i);
                    return true;
                } catch (Throwable th) {
                    tck0.m188006g(abstractC16861i);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m121620q(ByteString byteString) {
        synchronized (this) {
            try {
                if (this.f97823r) {
                    return;
                }
                akp0 akp0Var = this.f97813h;
                if (byteString == null) {
                    try {
                        byteString = ByteString.EMPTY;
                    } catch (IOException e) {
                        mo112096f(e, null);
                        return;
                    }
                }
                akp0Var.m97167e(byteString);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.djp0
    public void release() {
        synchronized (this) {
            try {
                if (this.f97823r) {
                    return;
                }
                this.f97823r = true;
                AbstractC16861i abstractC16861i = this.f97815j;
                this.f97815j = null;
                ScheduledFuture<?> scheduledFuture = this.f97820o;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f97814i;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                tck0.m188006g(abstractC16861i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.fjp0$h */
    public final class RunnableC16860h implements Runnable {

        /* JADX INFO: renamed from: a */
        public ByteString f97840a;

        public RunnableC16860h(ByteString byteString) {
            this.f97840a = byteString;
        }

        @Override // java.lang.Runnable
        public void run() {
            fjp0.this.m121620q(this.f97840a);
        }

        public RunnableC16860h() {
        }
    }

    /* JADX INFO: renamed from: l.fjp0$b */
    public class C16854b extends ProxySelector {
        public C16854b() {
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
