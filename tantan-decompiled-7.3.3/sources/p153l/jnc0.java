package p153l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class jnc0 implements hsp0, dtp0.InterfaceC16620a {

    /* JADX INFO: renamed from: x */
    public static final List<Protocol> f121766x = Collections.singletonList(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: a */
    public final x1d0 f121767a;

    /* JADX INFO: renamed from: b */
    public final ksp0 f121768b;

    /* JADX INFO: renamed from: c */
    public final Random f121769c;

    /* JADX INFO: renamed from: d */
    public final long f121770d;

    /* JADX INFO: renamed from: e */
    public final String f121771e;

    /* JADX INFO: renamed from: f */
    public ry3 f121772f;

    /* JADX INFO: renamed from: g */
    public final Runnable f121773g;

    /* JADX INFO: renamed from: h */
    public dtp0 f121774h;

    /* JADX INFO: renamed from: i */
    public ftp0 f121775i;

    /* JADX INFO: renamed from: j */
    public ScheduledExecutorService f121776j;

    /* JADX INFO: renamed from: k */
    public AbstractC17985f f121777k;

    /* JADX INFO: renamed from: n */
    public long f121780n;

    /* JADX INFO: renamed from: o */
    public boolean f121781o;

    /* JADX INFO: renamed from: p */
    public ScheduledFuture<?> f121782p;

    /* JADX INFO: renamed from: r */
    public String f121784r;

    /* JADX INFO: renamed from: s */
    public boolean f121785s;

    /* JADX INFO: renamed from: t */
    public int f121786t;

    /* JADX INFO: renamed from: u */
    public int f121787u;

    /* JADX INFO: renamed from: v */
    public int f121788v;

    /* JADX INFO: renamed from: w */
    public boolean f121789w;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<ByteString> f121778l = new ArrayDeque<>();

    /* JADX INFO: renamed from: m */
    public final ArrayDeque<Object> f121779m = new ArrayDeque<>();

    /* JADX INFO: renamed from: q */
    public int f121783q = -1;

    /* JADX INFO: renamed from: l.jnc0$a */
    public class C17980a implements w84 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x1d0 f121790a;

        public C17980a(x1d0 x1d0Var) {
            this.f121790a = x1d0Var;
        }

        @Override // p153l.w84
        public void onFailure(ry3 ry3Var, IOException iOException) {
            jnc0.this.m146227j(iOException, null);
        }

        @Override // p153l.w84
        public void onResponse(ry3 ry3Var, i5d0 i5d0Var) {
            n6f n6fVarMo152197f = kzm.f129436a.mo152197f(i5d0Var);
            try {
                jnc0.this.m146224g(i5d0Var, n6fVarMo152197f);
                try {
                    jnc0.this.m146228k("OkHttp WebSocket " + this.f121790a.m209026k().m182276G(), n6fVarMo152197f.m161772i());
                    jnc0 jnc0Var = jnc0.this;
                    jnc0Var.f121768b.mo151277f(jnc0Var, i5d0Var);
                    jnc0.this.m146229l();
                } catch (Exception e) {
                    jnc0.this.m146227j(e, null);
                }
            } catch (IOException e2) {
                if (n6fVarMo152197f != null) {
                    n6fVarMo152197f.m161780q();
                }
                jnc0.this.m146227j(e2, i5d0Var);
                zlk0.m220245g(i5d0Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.jnc0$b */
    public final class RunnableC17981b implements Runnable {
        public RunnableC17981b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jnc0.this.m146223f();
        }
    }

    /* JADX INFO: renamed from: l.jnc0$c */
    public static final class C17982c {

        /* JADX INFO: renamed from: a */
        public final int f121793a;

        /* JADX INFO: renamed from: b */
        public final ByteString f121794b;

        /* JADX INFO: renamed from: c */
        public final long f121795c;

        public C17982c(int i, ByteString byteString, long j) {
            this.f121793a = i;
            this.f121794b = byteString;
            this.f121795c = j;
        }
    }

    /* JADX INFO: renamed from: l.jnc0$d */
    public static final class C17983d {

        /* JADX INFO: renamed from: a */
        public final int f121796a;

        /* JADX INFO: renamed from: b */
        public final ByteString f121797b;

        public C17983d(int i, ByteString byteString) {
            this.f121796a = i;
            this.f121797b = byteString;
        }
    }

    /* JADX INFO: renamed from: l.jnc0$e */
    public final class RunnableC17984e implements Runnable {
        public RunnableC17984e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jnc0.this.m146233p();
        }
    }

    /* JADX INFO: renamed from: l.jnc0$f */
    public static abstract class AbstractC17985f implements Closeable {

        /* JADX INFO: renamed from: a */
        public final boolean f121799a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f121800b;

        /* JADX INFO: renamed from: c */
        public final BufferedSink f121801c;

        public AbstractC17985f(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f121799a = z;
            this.f121800b = bufferedSource;
            this.f121801c = bufferedSink;
        }
    }

    public jnc0(x1d0 x1d0Var, ksp0 ksp0Var, Random random, long j) {
        if (!"GET".equals(x1d0Var.m209022g())) {
            yg3.m215829a("Request must be GET: ", x1d0Var.m209022g());
            throw null;
        }
        this.f121767a = x1d0Var;
        this.f121768b = ksp0Var;
        this.f121769c = random;
        this.f121770d = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f121771e = ByteString.m222317of(bArr).base64();
        this.f121773g = new Runnable() { // from class: l.inc0
            @Override // java.lang.Runnable
            public final void run() {
                jnc0.m146222e(this.f115898a);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m146222e(jnc0 jnc0Var) {
        jnc0Var.getClass();
        do {
            try {
            } catch (IOException e) {
                jnc0Var.m146227j(e, null);
                return;
            }
        } while (jnc0Var.m146232o());
    }

    @Override // p153l.dtp0.InterfaceC16620a
    /* JADX INFO: renamed from: a */
    public synchronized void mo117895a(ByteString byteString) {
        try {
            if (!this.f121785s && (!this.f121781o || !this.f121779m.isEmpty())) {
                this.f121778l.add(byteString);
                m146230m();
                this.f121787u++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.dtp0.InterfaceC16620a
    /* JADX INFO: renamed from: b */
    public synchronized void mo117896b(ByteString byteString) {
        this.f121788v++;
        this.f121789w = false;
    }

    @Override // p153l.hsp0
    /* JADX INFO: renamed from: c */
    public boolean mo137027c(ByteString byteString) {
        if (byteString != null) {
            return m146231n(byteString, 2);
        }
        mnd0.m159157a("bytes == null");
        return false;
    }

    @Override // p153l.hsp0
    public boolean close(int i, String str) {
        return m146225h(i, str, Constants.ONE_MIN_IN_MILLIS);
    }

    @Override // p153l.dtp0.InterfaceC16620a
    /* JADX INFO: renamed from: d */
    public void mo117897d(ByteString byteString) throws IOException {
        this.f121768b.mo151276e(this, byteString);
    }

    /* JADX INFO: renamed from: f */
    public void m146223f() {
        this.f121772f.cancel();
    }

    /* JADX INFO: renamed from: g */
    public void m146224g(i5d0 i5d0Var, n6f n6fVar) throws IOException {
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
        String strBase64 = ByteString.encodeUtf8(this.f121771e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (!strBase64.equals(strM138675u3)) {
            fnc0.m126359a(strBase64, strM138675u3);
        } else {
            if (n6fVar != null) {
                return;
            }
            e7b0.m119688a("Web Socket exchange missing: bad interceptor?");
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m146225h(int i, String str, long j) {
        ByteString byteStringEncodeUtf8;
        try {
            atp0.m100226c(i);
            if (str != null) {
                byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
                if (byteStringEncodeUtf8.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                }
            } else {
                byteStringEncodeUtf8 = null;
            }
            if (!this.f121785s && !this.f121781o) {
                this.f121781o = true;
                this.f121779m.add(new C17982c(i, byteStringEncodeUtf8, j));
                m146230m();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m146226i(rg50 rg50Var) {
        rg50 rg50VarM181365c = rg50Var.m181359v().m181373k(t4f.NONE).m181380r(f121766x).m181365c();
        x1d0 x1d0VarM209028b = this.f121767a.m209023h().m209034h("Upgrade", "websocket").m209034h(HttpHeaders.CONNECTION, "Upgrade").m209034h("Sec-WebSocket-Key", this.f121771e).m209034h("Sec-WebSocket-Version", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_JOININ_GROUP).m209028b();
        ry3 ry3VarMo152199h = kzm.f129436a.mo152199h(rg50VarM181365c, x1d0VarM209028b);
        this.f121772f = ry3VarMo152199h;
        ry3VarMo152199h.mo135840h(new C17980a(x1d0VarM209028b));
    }

    /* JADX INFO: renamed from: j */
    public void m146227j(Exception exc, i5d0 i5d0Var) {
        synchronized (this) {
            try {
                if (this.f121785s) {
                    return;
                }
                this.f121785s = true;
                AbstractC17985f abstractC17985f = this.f121777k;
                this.f121777k = null;
                ScheduledFuture<?> scheduledFuture = this.f121782p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f121776j;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.f121768b.mo151274c(this, exc, i5d0Var);
                } finally {
                    zlk0.m220245g(abstractC17985f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m146228k(String str, AbstractC17985f abstractC17985f) throws IOException {
        synchronized (this) {
            try {
                this.f121777k = abstractC17985f;
                this.f121775i = new ftp0(abstractC17985f.f121799a, abstractC17985f.f121801c, this.f121769c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, zlk0.m220234H(str, false));
                this.f121776j = scheduledThreadPoolExecutor;
                if (this.f121770d != 0) {
                    RunnableC17984e runnableC17984e = new RunnableC17984e();
                    long j = this.f121770d;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(runnableC17984e, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.f121779m.isEmpty()) {
                    m146230m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f121774h = new dtp0(abstractC17985f.f121799a, abstractC17985f.f121800b, this);
    }

    /* JADX INFO: renamed from: l */
    public void m146229l() throws IOException {
        while (this.f121783q == -1) {
            this.f121774h.m117889a();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m146230m() {
        ScheduledExecutorService scheduledExecutorService = this.f121776j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f121773g);
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized boolean m146231n(ByteString byteString, int i) {
        if (!this.f121785s && !this.f121781o) {
            if (this.f121780n + ((long) byteString.size()) > 16777216) {
                close(1001, null);
                return false;
            }
            this.f121780n += (long) byteString.size();
            this.f121779m.add(new C17983d(i, byteString));
            m146230m();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m146232o() throws IOException {
        String str;
        int i;
        AbstractC17985f abstractC17985f;
        synchronized (this) {
            try {
                if (this.f121785s) {
                    return false;
                }
                ftp0 ftp0Var = this.f121775i;
                ByteString byteStringPoll = this.f121778l.poll();
                Object obj = null;
                if (byteStringPoll == null) {
                    Object objPoll = this.f121779m.poll();
                    if (objPoll instanceof C17982c) {
                        i = this.f121783q;
                        str = this.f121784r;
                        if (i != -1) {
                            abstractC17985f = this.f121777k;
                            this.f121777k = null;
                            this.f121776j.shutdown();
                        } else {
                            this.f121782p = this.f121776j.schedule(new RunnableC17981b(), ((C17982c) objPoll).f121795c, TimeUnit.MILLISECONDS);
                            abstractC17985f = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        abstractC17985f = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    i = -1;
                    abstractC17985f = null;
                }
                try {
                    if (byteStringPoll != null) {
                        ftp0Var.m127385f(byteStringPoll);
                    } else if (obj instanceof C17983d) {
                        ByteString byteString = ((C17983d) obj).f121797b;
                        BufferedSink bufferedSinkBuffer = Okio.buffer(ftp0Var.m127380a(((C17983d) obj).f121796a, byteString.size()));
                        bufferedSinkBuffer.write(byteString);
                        bufferedSinkBuffer.close();
                        synchronized (this) {
                            this.f121780n -= (long) byteString.size();
                        }
                    } else {
                        if (!(obj instanceof C17982c)) {
                            throw new AssertionError();
                        }
                        C17982c c17982c = (C17982c) obj;
                        ftp0Var.m127381b(c17982c.f121793a, c17982c.f121794b);
                        if (abstractC17985f != null) {
                            this.f121768b.mo151272a(this, i, str);
                        }
                    }
                    zlk0.m220245g(abstractC17985f);
                    return true;
                } catch (Throwable th) {
                    zlk0.m220245g(abstractC17985f);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p153l.dtp0.InterfaceC16620a
    public void onReadClose(int i, String str) {
        AbstractC17985f abstractC17985f;
        if (i == -1) {
            fig0.m125680a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f121783q != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f121783q = i;
                this.f121784r = str;
                abstractC17985f = null;
                if (this.f121781o && this.f121779m.isEmpty()) {
                    AbstractC17985f abstractC17985f2 = this.f121777k;
                    this.f121777k = null;
                    ScheduledFuture<?> scheduledFuture = this.f121782p;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f121776j.shutdown();
                    abstractC17985f = abstractC17985f2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f121768b.mo151273b(this, i, str);
            if (abstractC17985f != null) {
                this.f121768b.mo151272a(this, i, str);
            }
        } finally {
            zlk0.m220245g(abstractC17985f);
        }
    }

    @Override // p153l.dtp0.InterfaceC16620a
    public void onReadMessage(String str) throws IOException {
        this.f121768b.mo151275d(this, str);
    }

    /* JADX INFO: renamed from: p */
    public void m146233p() {
        synchronized (this) {
            try {
                if (this.f121785s) {
                    return;
                }
                ftp0 ftp0Var = this.f121775i;
                int i = this.f121789w ? this.f121786t : -1;
                this.f121786t++;
                this.f121789w = true;
                if (i == -1) {
                    try {
                        ftp0Var.m127384e(ByteString.EMPTY);
                        return;
                    } catch (IOException e) {
                        m146227j(e, null);
                        return;
                    }
                }
                m146227j(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f121770d + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
