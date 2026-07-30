package p149l;

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

/* JADX INFO: loaded from: classes2.dex */
public final class cfc0 implements cjp0, zjp0.InterfaceC21716a {

    /* JADX INFO: renamed from: x */
    public static final List<Protocol> f80552x = Collections.singletonList(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: a */
    public final stc0 f80553a;

    /* JADX INFO: renamed from: b */
    public final gjp0 f80554b;

    /* JADX INFO: renamed from: c */
    public final Random f80555c;

    /* JADX INFO: renamed from: d */
    public final long f80556d;

    /* JADX INFO: renamed from: e */
    public final String f80557e;

    /* JADX INFO: renamed from: f */
    public sx3 f80558f;

    /* JADX INFO: renamed from: g */
    public final Runnable f80559g;

    /* JADX INFO: renamed from: h */
    public zjp0 f80560h;

    /* JADX INFO: renamed from: i */
    public bkp0 f80561i;

    /* JADX INFO: renamed from: j */
    public ScheduledExecutorService f80562j;

    /* JADX INFO: renamed from: k */
    public AbstractC16122f f80563k;

    /* JADX INFO: renamed from: n */
    public long f80566n;

    /* JADX INFO: renamed from: o */
    public boolean f80567o;

    /* JADX INFO: renamed from: p */
    public ScheduledFuture<?> f80568p;

    /* JADX INFO: renamed from: r */
    public String f80570r;

    /* JADX INFO: renamed from: s */
    public boolean f80571s;

    /* JADX INFO: renamed from: t */
    public int f80572t;

    /* JADX INFO: renamed from: u */
    public int f80573u;

    /* JADX INFO: renamed from: v */
    public int f80574v;

    /* JADX INFO: renamed from: w */
    public boolean f80575w;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<ByteString> f80564l = new ArrayDeque<>();

    /* JADX INFO: renamed from: m */
    public final ArrayDeque<Object> f80565m = new ArrayDeque<>();

    /* JADX INFO: renamed from: q */
    public int f80569q = -1;

    /* JADX INFO: renamed from: l.cfc0$a */
    public class C16117a implements x74 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ stc0 f80576a;

        public C16117a(stc0 stc0Var) {
            this.f80576a = stc0Var;
        }

        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) {
            cfc0.this.m106498j(iOException, null);
        }

        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) {
            j5f j5fVarMo144876f = kxm.f125142a.mo144876f(exc0Var);
            try {
                cfc0.this.m106495g(exc0Var, j5fVarMo144876f);
                try {
                    cfc0.this.m106499k("OkHttp WebSocket " + this.f80576a.m185881k().m107512G(), j5fVarMo144876f.m139852i());
                    cfc0 cfc0Var = cfc0.this;
                    cfc0Var.f80554b.mo126553f(cfc0Var, exc0Var);
                    cfc0.this.m106500l();
                } catch (Exception e) {
                    cfc0.this.m106498j(e, null);
                }
            } catch (IOException e2) {
                if (j5fVarMo144876f != null) {
                    j5fVarMo144876f.m139860q();
                }
                cfc0.this.m106498j(e2, exc0Var);
                tck0.m188006g(exc0Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.cfc0$b */
    public final class RunnableC16118b implements Runnable {
        public RunnableC16118b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            cfc0.this.m106494f();
        }
    }

    /* JADX INFO: renamed from: l.cfc0$c */
    public static final class C16119c {

        /* JADX INFO: renamed from: a */
        public final int f80579a;

        /* JADX INFO: renamed from: b */
        public final ByteString f80580b;

        /* JADX INFO: renamed from: c */
        public final long f80581c;

        public C16119c(int i, ByteString byteString, long j) {
            this.f80579a = i;
            this.f80580b = byteString;
            this.f80581c = j;
        }
    }

    /* JADX INFO: renamed from: l.cfc0$d */
    public static final class C16120d {

        /* JADX INFO: renamed from: a */
        public final int f80582a;

        /* JADX INFO: renamed from: b */
        public final ByteString f80583b;

        public C16120d(int i, ByteString byteString) {
            this.f80582a = i;
            this.f80583b = byteString;
        }
    }

    /* JADX INFO: renamed from: l.cfc0$e */
    public final class RunnableC16121e implements Runnable {
        public RunnableC16121e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            cfc0.this.m106504p();
        }
    }

    /* JADX INFO: renamed from: l.cfc0$f */
    public static abstract class AbstractC16122f implements Closeable {

        /* JADX INFO: renamed from: a */
        public final boolean f80585a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f80586b;

        /* JADX INFO: renamed from: c */
        public final BufferedSink f80587c;

        public AbstractC16122f(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f80585a = z;
            this.f80586b = bufferedSource;
            this.f80587c = bufferedSink;
        }
    }

    public cfc0(stc0 stc0Var, gjp0 gjp0Var, Random random, long j) {
        if (!"GET".equals(stc0Var.m185877g())) {
            kg3.m145878a("Request must be GET: ", stc0Var.m185877g());
            throw null;
        }
        this.f80553a = stc0Var;
        this.f80554b = gjp0Var;
        this.f80555c = random;
        this.f80556d = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f80557e = ByteString.m221050of(bArr).base64();
        this.f80559g = new Runnable() { // from class: l.bfc0
            @Override // java.lang.Runnable
            public final void run() {
                cfc0.m106489e(this.f75291a);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m106489e(cfc0 cfc0Var) {
        cfc0Var.getClass();
        do {
            try {
            } catch (IOException e) {
                cfc0Var.m106498j(e, null);
                return;
            }
        } while (cfc0Var.m106503o());
    }

    @Override // p149l.zjp0.InterfaceC21716a
    /* JADX INFO: renamed from: a */
    public synchronized void mo106490a(ByteString byteString) {
        try {
            if (!this.f80571s && (!this.f80567o || !this.f80565m.isEmpty())) {
                this.f80564l.add(byteString);
                m106501m();
                this.f80573u++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.zjp0.InterfaceC21716a
    /* JADX INFO: renamed from: b */
    public synchronized void mo106491b(ByteString byteString) {
        this.f80574v++;
        this.f80575w = false;
    }

    @Override // p149l.cjp0
    /* JADX INFO: renamed from: c */
    public boolean mo106492c(ByteString byteString) {
        if (byteString != null) {
            return m106502n(byteString, 2);
        }
        jfd0.m141176a("bytes == null");
        return false;
    }

    @Override // p149l.cjp0
    public boolean close(int i, String str) {
        return m106496h(i, str, Constants.ONE_MIN_IN_MILLIS);
    }

    @Override // p149l.zjp0.InterfaceC21716a
    /* JADX INFO: renamed from: d */
    public void mo106493d(ByteString byteString) throws IOException {
        this.f80554b.mo126552e(this, byteString);
    }

    /* JADX INFO: renamed from: f */
    public void m106494f() {
        this.f80558f.cancel();
    }

    /* JADX INFO: renamed from: g */
    public void m106495g(exc0 exc0Var, j5f j5fVar) throws IOException {
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
        String strBase64 = ByteString.encodeUtf8(this.f80557e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (!strBase64.equals(strM118611u3)) {
            yec0.m214344a(strBase64, strM118611u3);
        } else {
            if (j5fVar != null) {
                return;
            }
            aza0.m99642a("Web Socket exchange missing: bad interceptor?");
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m106496h(int i, String str, long j) {
        ByteString byteStringEncodeUtf8;
        try {
            wjp0.m203482c(i);
            if (str != null) {
                byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
                if (byteStringEncodeUtf8.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                }
            } else {
                byteStringEncodeUtf8 = null;
            }
            if (!this.f80571s && !this.f80567o) {
                this.f80567o = true;
                this.f80565m.add(new C16119c(i, byteStringEncodeUtf8, j));
                m106501m();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m106497i(k850 k850Var) {
        k850 k850VarM144882c = k850Var.m144867v().m144890k(o3f.NONE).m144896q(f80552x).m144882c();
        stc0 stc0VarM185883b = this.f80553a.m185878h().m185889h("Upgrade", "websocket").m185889h("Connection", "Upgrade").m185889h("Sec-WebSocket-Key", this.f80557e).m185889h("Sec-WebSocket-Version", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_JOININ_GROUP).m185883b();
        sx3 sx3VarMo144878h = kxm.f125142a.mo144878h(k850VarM144882c, stc0VarM185883b);
        this.f80558f = sx3VarMo144878h;
        sx3VarMo144878h.mo96077h(new C16117a(stc0VarM185883b));
    }

    /* JADX INFO: renamed from: j */
    public void m106498j(Exception exc, exc0 exc0Var) {
        synchronized (this) {
            try {
                if (this.f80571s) {
                    return;
                }
                this.f80571s = true;
                AbstractC16122f abstractC16122f = this.f80563k;
                this.f80563k = null;
                ScheduledFuture<?> scheduledFuture = this.f80568p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f80562j;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.f80554b.mo126550c(this, exc, exc0Var);
                } finally {
                    tck0.m188006g(abstractC16122f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m106499k(String str, AbstractC16122f abstractC16122f) throws IOException {
        synchronized (this) {
            try {
                this.f80563k = abstractC16122f;
                this.f80561i = new bkp0(abstractC16122f.f80585a, abstractC16122f.f80587c, this.f80555c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, tck0.m187995H(str, false));
                this.f80562j = scheduledThreadPoolExecutor;
                if (this.f80556d != 0) {
                    RunnableC16121e runnableC16121e = new RunnableC16121e();
                    long j = this.f80556d;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(runnableC16121e, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.f80565m.isEmpty()) {
                    m106501m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f80560h = new zjp0(abstractC16122f.f80585a, abstractC16122f.f80586b, this);
    }

    /* JADX INFO: renamed from: l */
    public void m106500l() throws IOException {
        while (this.f80569q == -1) {
            this.f80560h.m219128a();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m106501m() {
        ScheduledExecutorService scheduledExecutorService = this.f80562j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f80559g);
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized boolean m106502n(ByteString byteString, int i) {
        if (!this.f80571s && !this.f80567o) {
            if (this.f80566n + ((long) byteString.size()) > 16777216) {
                close(1001, null);
                return false;
            }
            this.f80566n += (long) byteString.size();
            this.f80565m.add(new C16120d(i, byteString));
            m106501m();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m106503o() throws IOException {
        String str;
        int i;
        AbstractC16122f abstractC16122f;
        synchronized (this) {
            try {
                if (this.f80571s) {
                    return false;
                }
                bkp0 bkp0Var = this.f80561i;
                ByteString byteStringPoll = this.f80564l.poll();
                Object obj = null;
                if (byteStringPoll == null) {
                    Object objPoll = this.f80565m.poll();
                    if (objPoll instanceof C16119c) {
                        i = this.f80569q;
                        str = this.f80570r;
                        if (i != -1) {
                            abstractC16122f = this.f80563k;
                            this.f80563k = null;
                            this.f80562j.shutdown();
                        } else {
                            this.f80568p = this.f80562j.schedule(new RunnableC16118b(), ((C16119c) objPoll).f80581c, TimeUnit.MILLISECONDS);
                            abstractC16122f = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        abstractC16122f = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    i = -1;
                    abstractC16122f = null;
                }
                try {
                    if (byteStringPoll != null) {
                        bkp0Var.m102502f(byteStringPoll);
                    } else if (obj instanceof C16120d) {
                        ByteString byteString = ((C16120d) obj).f80583b;
                        BufferedSink bufferedSinkBuffer = Okio.buffer(bkp0Var.m102497a(((C16120d) obj).f80582a, byteString.size()));
                        bufferedSinkBuffer.write(byteString);
                        bufferedSinkBuffer.close();
                        synchronized (this) {
                            this.f80566n -= (long) byteString.size();
                        }
                    } else {
                        if (!(obj instanceof C16119c)) {
                            throw new AssertionError();
                        }
                        C16119c c16119c = (C16119c) obj;
                        bkp0Var.m102498b(c16119c.f80579a, c16119c.f80580b);
                        if (abstractC16122f != null) {
                            this.f80554b.mo126548a(this, i, str);
                        }
                    }
                    tck0.m188006g(abstractC16122f);
                    return true;
                } catch (Throwable th) {
                    tck0.m188006g(abstractC16122f);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p149l.zjp0.InterfaceC21716a
    public void onReadClose(int i, String str) {
        AbstractC16122f abstractC16122f;
        if (i == -1) {
            x9g0.m207497a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f80569q != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f80569q = i;
                this.f80570r = str;
                abstractC16122f = null;
                if (this.f80567o && this.f80565m.isEmpty()) {
                    AbstractC16122f abstractC16122f2 = this.f80563k;
                    this.f80563k = null;
                    ScheduledFuture<?> scheduledFuture = this.f80568p;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f80562j.shutdown();
                    abstractC16122f = abstractC16122f2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f80554b.mo126549b(this, i, str);
            if (abstractC16122f != null) {
                this.f80554b.mo126548a(this, i, str);
            }
        } finally {
            tck0.m188006g(abstractC16122f);
        }
    }

    @Override // p149l.zjp0.InterfaceC21716a
    public void onReadMessage(String str) throws IOException {
        this.f80554b.mo126551d(this, str);
    }

    /* JADX INFO: renamed from: p */
    public void m106504p() {
        synchronized (this) {
            try {
                if (this.f80571s) {
                    return;
                }
                bkp0 bkp0Var = this.f80561i;
                int i = this.f80575w ? this.f80572t : -1;
                this.f80572t++;
                this.f80575w = true;
                if (i == -1) {
                    try {
                        bkp0Var.m102501e(ByteString.EMPTY);
                        return;
                    } catch (IOException e) {
                        m106498j(e, null);
                        return;
                    }
                }
                m106498j(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f80556d + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
