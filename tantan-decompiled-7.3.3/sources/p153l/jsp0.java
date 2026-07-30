package p153l;

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
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes9.dex */
public class jsp0 implements isp0, ctp0.InterfaceC16360a {

    /* JADX INFO: renamed from: v */
    public static final List<Protocol> f122484v = Collections.singletonList(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: a */
    public final x1d0 f122485a;

    /* JADX INFO: renamed from: b */
    public final lsp0 f122486b;

    /* JADX INFO: renamed from: c */
    public final Random f122487c;

    /* JADX INFO: renamed from: d */
    public final String f122488d;

    /* JADX INFO: renamed from: e */
    public ry3 f122489e;

    /* JADX INFO: renamed from: f */
    public final Runnable f122490f;

    /* JADX INFO: renamed from: g */
    public ctp0 f122491g;

    /* JADX INFO: renamed from: h */
    public etp0 f122492h;

    /* JADX INFO: renamed from: i */
    public ScheduledExecutorService f122493i;

    /* JADX INFO: renamed from: j */
    public AbstractC18035i f122494j;

    /* JADX INFO: renamed from: m */
    public long f122497m;

    /* JADX INFO: renamed from: n */
    public boolean f122498n;

    /* JADX INFO: renamed from: o */
    public ScheduledFuture<?> f122499o;

    /* JADX INFO: renamed from: q */
    public String f122501q;

    /* JADX INFO: renamed from: r */
    public boolean f122502r;

    /* JADX INFO: renamed from: s */
    public int f122503s;

    /* JADX INFO: renamed from: t */
    public int f122504t;

    /* JADX INFO: renamed from: u */
    public int f122505u;

    /* JADX INFO: renamed from: k */
    public final ArrayDeque<ByteString> f122495k = new ArrayDeque<>();

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<Object> f122496l = new ArrayDeque<>();

    /* JADX INFO: renamed from: p */
    public int f122500p = -1;

    /* JADX INFO: renamed from: l.jsp0$a */
    public class RunnableC18027a implements Runnable {
        public RunnableC18027a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                } catch (IOException e) {
                    jsp0.this.mo141889f(e, null);
                    return;
                }
            } while (jsp0.this.m146861p());
        }
    }

    /* JADX INFO: renamed from: l.jsp0$c */
    public class C18029c implements w84 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x1d0 f122508a;

        /* JADX INFO: renamed from: l.jsp0$c$a */
        public class a extends AbstractC18035i {

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ n6f f122510d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, n6f n6fVar) {
                super(z, bufferedSource, bufferedSink);
                this.f122510d = n6fVar;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f122510d.m161764a(-1L, true, true, null);
            }
        }

        public C18029c(x1d0 x1d0Var) {
            this.f122508a = x1d0Var;
        }

        @Override // p153l.w84
        public void onFailure(ry3 ry3Var, IOException iOException) {
            jsp0.this.mo141889f(iOException, null);
        }

        @Override // p153l.w84
        public void onResponse(ry3 ry3Var, i5d0 i5d0Var) {
            C18029c c18029c;
            n6f n6fVarMo152197f = kzm.f129436a.mo152197f(i5d0Var);
            try {
                jsp0.this.m146854h(i5d0Var, n6fVarMo152197f);
                jnc0.AbstractC17985f abstractC17985fM161772i = n6fVarMo152197f.m161772i();
                try {
                    String str = "OkHttp WebSocket " + this.f122508a.m209026k().m182276G();
                    c18029c = this;
                    try {
                        a aVar = c18029c.new a(true, abstractC17985fM161772i.f121800b, abstractC17985fM161772i.f121801c, n6fVarMo152197f);
                        jsp0 jsp0Var = jsp0.this;
                        jsp0Var.m146857k(str, jsp0Var.f122505u, aVar);
                        jsp0 jsp0Var2 = jsp0.this;
                        jsp0Var2.f122486b.mo30498f(jsp0Var2, i5d0Var);
                        jsp0.this.m146858l();
                    } catch (Exception e) {
                        e = e;
                        jsp0.this.mo141889f(e, null);
                    }
                } catch (Exception e2) {
                    e = e2;
                    c18029c = this;
                }
            } catch (IOException e3) {
                if (n6fVarMo152197f != null) {
                    n6fVarMo152197f.m161780q();
                }
                jsp0.this.mo141889f(e3, i5d0Var);
                zlk0.m220245g(i5d0Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.jsp0$d */
    public class RejectedExecutionHandlerC18030d implements RejectedExecutionHandler {
        public RejectedExecutionHandlerC18030d() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            jsp0.this.mo141889f(new RejectedExecutionException(), null);
        }
    }

    /* JADX INFO: renamed from: l.jsp0$e */
    public final class RunnableC18031e implements Runnable {
        public RunnableC18031e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jsp0.this.m146853g();
        }
    }

    /* JADX INFO: renamed from: l.jsp0$f */
    public static final class C18032f {

        /* JADX INFO: renamed from: a */
        public final int f122514a;

        /* JADX INFO: renamed from: b */
        public final ByteString f122515b;

        /* JADX INFO: renamed from: c */
        public final long f122516c;

        public C18032f(int i, ByteString byteString, long j) {
            this.f122514a = i;
            this.f122515b = byteString;
            this.f122516c = j;
        }
    }

    /* JADX INFO: renamed from: l.jsp0$g */
    public static final class C18033g {

        /* JADX INFO: renamed from: a */
        public final int f122517a;

        /* JADX INFO: renamed from: b */
        public final ByteString f122518b;

        public C18033g(int i, ByteString byteString) {
            this.f122517a = i;
            this.f122518b = byteString;
        }
    }

    /* JADX INFO: renamed from: l.jsp0$i */
    public static abstract class AbstractC18035i implements Closeable {

        /* JADX INFO: renamed from: a */
        public final boolean f122521a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f122522b;

        /* JADX INFO: renamed from: c */
        public final BufferedSink f122523c;

        public AbstractC18035i(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f122521a = z;
            this.f122522b = bufferedSource;
            this.f122523c = bufferedSink;
        }
    }

    public jsp0(x1d0 x1d0Var, lsp0 lsp0Var, Random random) {
        if (!"GET".equals(x1d0Var.m209022g())) {
            yg3.m215829a("Request must be GET: ", x1d0Var.m209022g());
            throw null;
        }
        this.f122485a = x1d0Var;
        this.f122486b = lsp0Var;
        this.f122487c = random;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f122488d = ByteString.m222317of(bArr).base64();
        this.f122490f = new RunnableC18027a();
    }

    /* JADX INFO: renamed from: m */
    public static isp0 m146852m(x1d0 x1d0Var, rg50 rg50Var, int i, String str, boolean z, lsp0 lsp0Var) {
        jsp0 jsp0Var = new jsp0(x1d0Var, lsp0Var, new Random());
        jsp0Var.f122505u = i;
        jsp0Var.m146856j(rg50Var, str, z);
        return jsp0Var;
    }

    @Override // p153l.ctp0.InterfaceC16360a
    /* JADX INFO: renamed from: a */
    public synchronized void mo112543a(ByteString byteString) {
        try {
            if (!this.f122502r && (!this.f122498n || !this.f122496l.isEmpty())) {
                this.f122495k.add(byteString);
                m146859n();
                this.f122503s++;
                this.f122486b.mo30499g(byteString);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ctp0.InterfaceC16360a
    /* JADX INFO: renamed from: b */
    public synchronized void mo112544b(ByteString byteString) {
        this.f122504t++;
        if (this.f122502r) {
            return;
        }
        this.f122486b.mo30500h(byteString);
    }

    @Override // p153l.isp0
    /* JADX INFO: renamed from: c */
    public boolean mo141887c(ByteString byteString) {
        if (byteString != null) {
            return m146860o(byteString, 2);
        }
        mnd0.m159157a("bytes == null");
        return false;
    }

    @Override // p153l.isp0
    public boolean close(int i, String str) {
        return m146855i(i, str, Constants.ONE_MIN_IN_MILLIS);
    }

    @Override // p153l.ctp0.InterfaceC16360a
    /* JADX INFO: renamed from: d */
    public void mo112545d(ByteString byteString) throws IOException {
        if (this.f122502r) {
            return;
        }
        this.f122486b.mo30497e(this, byteString);
    }

    @Override // p153l.isp0
    /* JADX INFO: renamed from: e */
    public boolean mo141888e(ByteString byteString) {
        ScheduledExecutorService scheduledExecutorService;
        if (this.f122502r || this.f122498n || (scheduledExecutorService = this.f122493i) == null || scheduledExecutorService.isShutdown()) {
            return false;
        }
        this.f122493i.execute(new RunnableC18034h(byteString));
        return true;
    }

    @Override // p153l.isp0
    /* JADX INFO: renamed from: f */
    public void mo141889f(Exception exc, @Nullable i5d0 i5d0Var) {
        synchronized (this) {
            try {
                if (this.f122502r) {
                    return;
                }
                this.f122502r = true;
                AbstractC18035i abstractC18035i = this.f122494j;
                this.f122494j = null;
                ScheduledFuture<?> scheduledFuture = this.f122499o;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f122493i;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.f122486b.mo30495c(this, exc, i5d0Var);
                } finally {
                    zlk0.m220245g(abstractC18035i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m146853g() {
        this.f122489e.cancel();
    }

    /* JADX INFO: renamed from: h */
    public void m146854h(i5d0 i5d0Var, @Nullable n6f n6fVar) throws IOException {
        if (i5d0Var.m138673q() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + i5d0Var.m138673q() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i5d0Var.m138662J() + "'");
        }
        String strM138675u = i5d0Var.m138675u(HttpHeaders.CONNECTION);
        if (!"Upgrade".equalsIgnoreCase(strM138675u)) {
            gnc0.m130850a("Expected 'Connection' header value 'Upgrade' but was '", strM138675u);
            return;
        }
        String strM138675u2 = i5d0Var.m138675u("Upgrade");
        if (!"websocket".equalsIgnoreCase(strM138675u2)) {
            gnc0.m130850a("Expected 'Upgrade' header value 'websocket' but was '", strM138675u2);
            return;
        }
        String strM138675u3 = i5d0Var.m138675u("Sec-WebSocket-Accept");
        String strBase64 = ByteString.encodeUtf8(this.f122488d + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (!strBase64.equals(strM138675u3)) {
            fnc0.m126359a(strBase64, strM138675u3);
        } else {
            if (n6fVar != null) {
                return;
            }
            e7b0.m119688a("Web Socket exchange missing: bad interceptor?");
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m146855i(int i, String str, long j) {
        ByteString byteStringEncodeUtf8;
        try {
            btp0.m106377c(i);
            if (str != null) {
                byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
                if (byteStringEncodeUtf8.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                }
            } else {
                byteStringEncodeUtf8 = null;
            }
            if (!this.f122502r && !this.f122498n) {
                this.f122498n = true;
                this.f122496l.add(new C18032f(i, byteStringEncodeUtf8, j));
                m146859n();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m146856j(rg50 rg50Var, String str, boolean z) {
        rg50.C19837b c19837bM181380r = rg50Var.m181359v().m181373k(t4f.NONE).m181380r(f122484v);
        if (!z) {
            c19837bM181380r.m181382t(new C18028b());
        }
        rg50 rg50VarM181365c = c19837bM181380r.m181365c();
        x1d0 x1d0VarM209028b = this.f122485a.m209023h().m209034h("User-Agent", str).m209034h("Upgrade", "websocket").m209034h(HttpHeaders.CONNECTION, "Upgrade").m209034h("Sec-WebSocket-Key", this.f122488d).m209034h("Sec-WebSocket-Version", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_JOININ_GROUP).m209028b();
        ry3 ry3VarMo152199h = kzm.f129436a.mo152199h(rg50VarM181365c, x1d0VarM209028b);
        this.f122489e = ry3VarMo152199h;
        zj20.m219963c(ry3VarMo152199h, new C18029c(x1d0VarM209028b));
    }

    /* JADX INFO: renamed from: k */
    public void m146857k(String str, long j, AbstractC18035i abstractC18035i) throws IOException {
        synchronized (this) {
            try {
                this.f122494j = abstractC18035i;
                this.f122492h = new etp0(abstractC18035i.f122521a, abstractC18035i.f122523c, this.f122487c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, zlk0.m220234H(str, false), new RejectedExecutionHandlerC18030d());
                this.f122493i = scheduledThreadPoolExecutor;
                if (j != 0) {
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(new RunnableC18034h(), j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.f122496l.isEmpty()) {
                    m146859n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f122491g = new ctp0(abstractC18035i.f122521a, abstractC18035i.f122522b, this);
    }

    /* JADX INFO: renamed from: l */
    public void m146858l() throws IOException {
        while (this.f122500p == -1) {
            this.f122491g.m112537a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m146859n() {
        ScheduledExecutorService scheduledExecutorService = this.f122493i;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        this.f122493i.execute(this.f122490f);
    }

    /* JADX INFO: renamed from: o */
    public synchronized boolean m146860o(ByteString byteString, int i) {
        if (!this.f122502r && !this.f122498n) {
            if (this.f122497m + ((long) byteString.size()) > 16777216) {
                close(1001, null);
                return false;
            }
            this.f122497m += (long) byteString.size();
            this.f122496l.add(new C18033g(i, byteString));
            m146859n();
            return true;
        }
        return false;
    }

    @Override // p153l.ctp0.InterfaceC16360a
    public void onReadClose(int i, String str) {
        AbstractC18035i abstractC18035i;
        if (i == -1) {
            fig0.m125680a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f122500p != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f122500p = i;
                this.f122501q = str;
                abstractC18035i = null;
                if (this.f122498n && this.f122496l.isEmpty()) {
                    AbstractC18035i abstractC18035i2 = this.f122494j;
                    this.f122494j = null;
                    ScheduledFuture<?> scheduledFuture = this.f122499o;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f122493i.shutdown();
                    abstractC18035i = abstractC18035i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f122486b.mo30494b(this, i, str);
            if (abstractC18035i != null) {
                this.f122486b.mo30493a(this, i, str);
            }
        } finally {
            zlk0.m220245g(abstractC18035i);
        }
    }

    @Override // p153l.ctp0.InterfaceC16360a
    public void onReadMessage(String str) throws IOException {
        if (this.f122502r) {
            return;
        }
        this.f122486b.mo30496d(this, str);
    }

    /* JADX INFO: renamed from: p */
    public boolean m146861p() throws IOException {
        String str;
        int i;
        AbstractC18035i abstractC18035i;
        synchronized (this) {
            try {
                if (this.f122502r) {
                    return false;
                }
                etp0 etp0Var = this.f122492h;
                ByteString byteStringPoll = this.f122495k.poll();
                Object obj = null;
                if (byteStringPoll == null) {
                    Object objPoll = this.f122496l.poll();
                    if (objPoll instanceof C18032f) {
                        i = this.f122500p;
                        str = this.f122501q;
                        if (i != -1) {
                            abstractC18035i = this.f122494j;
                            this.f122494j = null;
                            this.f122493i.shutdown();
                        } else {
                            this.f122499o = this.f122493i.schedule(new RunnableC18031e(), ((C18032f) objPoll).f122516c, TimeUnit.MILLISECONDS);
                            abstractC18035i = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        abstractC18035i = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    i = -1;
                    abstractC18035i = null;
                }
                try {
                    if (byteStringPoll != null) {
                        etp0Var.m122488f(byteStringPoll);
                    } else if (obj instanceof C18033g) {
                        ByteString byteString = ((C18033g) obj).f122518b;
                        BufferedSink bufferedSinkBuffer = Okio.buffer(etp0Var.m122483a(((C18033g) obj).f122517a, byteString.size()));
                        bufferedSinkBuffer.write(byteString);
                        bufferedSinkBuffer.close();
                        synchronized (this) {
                            this.f122497m -= (long) byteString.size();
                        }
                    } else {
                        if (!(obj instanceof C18032f)) {
                            throw new AssertionError();
                        }
                        C18032f c18032f = (C18032f) obj;
                        etp0Var.m122484b(c18032f.f122514a, c18032f.f122515b);
                        if (abstractC18035i != null) {
                            this.f122486b.mo30493a(this, i, str);
                        }
                    }
                    zlk0.m220245g(abstractC18035i);
                    return true;
                } catch (Throwable th) {
                    zlk0.m220245g(abstractC18035i);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m146862q(ByteString byteString) {
        synchronized (this) {
            try {
                if (this.f122502r) {
                    return;
                }
                etp0 etp0Var = this.f122492h;
                if (byteString == null) {
                    try {
                        byteString = ByteString.EMPTY;
                    } catch (IOException e) {
                        mo141889f(e, null);
                        return;
                    }
                }
                etp0Var.m122487e(byteString);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.isp0
    public void release() {
        synchronized (this) {
            try {
                if (this.f122502r) {
                    return;
                }
                this.f122502r = true;
                AbstractC18035i abstractC18035i = this.f122494j;
                this.f122494j = null;
                ScheduledFuture<?> scheduledFuture = this.f122499o;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f122493i;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                zlk0.m220245g(abstractC18035i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.jsp0$h */
    public final class RunnableC18034h implements Runnable {

        /* JADX INFO: renamed from: a */
        public ByteString f122519a;

        public RunnableC18034h(ByteString byteString) {
            this.f122519a = byteString;
        }

        @Override // java.lang.Runnable
        public void run() {
            jsp0.this.m146862q(this.f122519a);
        }

        public RunnableC18034h() {
        }
    }

    /* JADX INFO: renamed from: l.jsp0$b */
    public class C18028b extends ProxySelector {
        public C18028b() {
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
