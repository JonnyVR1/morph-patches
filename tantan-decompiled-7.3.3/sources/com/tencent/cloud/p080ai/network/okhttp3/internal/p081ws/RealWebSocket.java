package com.tencent.cloud.p080ai.network.okhttp3.internal.p081ws;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.cloud.p080ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p080ai.network.okhttp3.AbstractC13927m;
import com.tencent.cloud.p080ai.network.okhttp3.C13932r;
import com.tencent.cloud.p080ai.network.okhttp3.Call;
import com.tencent.cloud.p080ai.network.okhttp3.Callback;
import com.tencent.cloud.p080ai.network.okhttp3.EnumC13931q;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.WebSocket;
import com.tencent.cloud.p080ai.network.okhttp3.WebSocketListener;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13875b;
import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.C13948n;
import com.tencent.cloud.p080ai.network.okio.C13951q;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
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
import org.eclipse.jetty.http.HttpHeaders;
import p153l.aqg0;
import p153l.e7b0;
import p153l.fig0;
import p153l.fnc0;
import p153l.gnc0;
import p153l.mnd0;
import p153l.yg3;
import p153l.zpg0;

/* JADX INFO: loaded from: classes12.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* JADX INFO: renamed from: x */
    public static final List<EnumC13931q> f57662x = Collections.singletonList(EnumC13931q.HTTP_1_1);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ boolean f57663y = true;

    /* JADX INFO: renamed from: a */
    public final Request f57664a;

    /* JADX INFO: renamed from: b */
    public final WebSocketListener f57665b;

    /* JADX INFO: renamed from: c */
    public final Random f57666c;

    /* JADX INFO: renamed from: d */
    public final long f57667d;

    /* JADX INFO: renamed from: e */
    public final String f57668e;

    /* JADX INFO: renamed from: f */
    public Call f57669f;

    /* JADX INFO: renamed from: g */
    public final Runnable f57670g;

    /* JADX INFO: renamed from: h */
    public WebSocketReader f57671h;

    /* JADX INFO: renamed from: i */
    public WebSocketWriter f57672i;

    /* JADX INFO: renamed from: j */
    public ScheduledExecutorService f57673j;

    /* JADX INFO: renamed from: k */
    public Streams f57674k;

    /* JADX INFO: renamed from: n */
    public long f57677n;

    /* JADX INFO: renamed from: o */
    public boolean f57678o;

    /* JADX INFO: renamed from: p */
    public ScheduledFuture<?> f57679p;

    /* JADX INFO: renamed from: r */
    public String f57681r;

    /* JADX INFO: renamed from: s */
    public boolean f57682s;

    /* JADX INFO: renamed from: t */
    public int f57683t;

    /* JADX INFO: renamed from: u */
    public int f57684u;

    /* JADX INFO: renamed from: v */
    public int f57685v;

    /* JADX INFO: renamed from: w */
    public boolean f57686w;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<ByteString> f57675l = new ArrayDeque<>();

    /* JADX INFO: renamed from: m */
    public final ArrayDeque<Object> f57676m = new ArrayDeque<>();

    /* JADX INFO: renamed from: q */
    public int f57680q = -1;

    public final class CancelRunnable implements Runnable {
        public CancelRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    public static final class Close {

        /* JADX INFO: renamed from: a */
        public final int f57690a;

        /* JADX INFO: renamed from: b */
        public final ByteString f57691b;

        /* JADX INFO: renamed from: c */
        public final long f57692c;

        public Close(int i, ByteString byteString, long j) {
            this.f57690a = i;
            this.f57691b = byteString;
            this.f57692c = j;
        }
    }

    public static final class Message {

        /* JADX INFO: renamed from: a */
        public final int f57693a;

        /* JADX INFO: renamed from: b */
        public final ByteString f57694b;

        public Message(int i, ByteString byteString) {
            this.f57693a = i;
            this.f57694b = byteString;
        }
    }

    public final class PingRunnable implements Runnable {
        public PingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            RealWebSocket realWebSocket = RealWebSocket.this;
            synchronized (realWebSocket) {
                try {
                    if (realWebSocket.f57682s) {
                        return;
                    }
                    WebSocketWriter webSocketWriter = realWebSocket.f57672i;
                    int i = realWebSocket.f57686w ? realWebSocket.f57683t : -1;
                    realWebSocket.f57683t++;
                    realWebSocket.f57686w = true;
                    if (i == -1) {
                        try {
                            webSocketWriter.m83006b(9, ByteString.EMPTY);
                            return;
                        } catch (IOException e) {
                            realWebSocket.failWebSocket(e, null);
                            return;
                        }
                    }
                    realWebSocket.failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + realWebSocket.f57667d + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final InterfaceC13940f sink;
        public final InterfaceC13941g source;

        public Streams(boolean z, InterfaceC13941g interfaceC13941g, InterfaceC13940f interfaceC13940f) {
            this.client = z;
            this.source = interfaceC13941g;
            this.sink = interfaceC13940f;
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j) {
        if (!"GET".equals(request.method())) {
            yg3.m215829a("Request must be GET: ", request.method());
            throw null;
        }
        this.f57664a = request;
        this.f57665b = webSocketListener;
        this.f57666c = random;
        this.f57667d = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f57668e = ByteString.m83068of(bArr).base64();
        this.f57670g = new Runnable() { // from class: l.hnc0
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.f110719a.m82994a();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public void m82996a(Response response, C13875b c13875b) throws ProtocolException {
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + response.message() + "'");
        }
        String strHeader = response.header(HttpHeaders.CONNECTION);
        if (!"Upgrade".equalsIgnoreCase(strHeader)) {
            gnc0.m130850a("Expected 'Connection' header value 'Upgrade' but was '", strHeader);
            return;
        }
        String strHeader2 = response.header("Upgrade");
        if (!"websocket".equalsIgnoreCase(strHeader2)) {
            gnc0.m130850a("Expected 'Upgrade' header value 'websocket' but was '", strHeader2);
            return;
        }
        String strHeader3 = response.header("Sec-WebSocket-Accept");
        String strBase64 = ByteString.encodeUtf8(this.f57668e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (!strBase64.equals(strHeader3)) {
            fnc0.m126359a(strBase64, strHeader3);
        } else {
            if (c13875b != null) {
                return;
            }
            e7b0.m119688a("Web Socket exchange missing: bad interceptor?");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m82998b() {
        if (!f57663y && !Thread.holdsLock(this)) {
            aqg0.m99478a();
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.f57673j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f57670g);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m82999c() throws IOException {
        String str;
        int i;
        Streams streams;
        synchronized (this) {
            try {
                if (this.f57682s) {
                    return false;
                }
                WebSocketWriter webSocketWriter = this.f57672i;
                ByteString byteStringPoll = this.f57675l.poll();
                Object obj = null;
                if (byteStringPoll == null) {
                    Object objPoll = this.f57676m.poll();
                    if (objPoll instanceof Close) {
                        i = this.f57680q;
                        str = this.f57681r;
                        if (i != -1) {
                            streams = this.f57674k;
                            this.f57674k = null;
                            this.f57673j.shutdown();
                        } else {
                            this.f57679p = this.f57673j.schedule(new CancelRunnable(), ((Close) objPoll).f57692c, TimeUnit.MILLISECONDS);
                            streams = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        streams = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    i = -1;
                    streams = null;
                }
                try {
                    if (byteStringPoll != null) {
                        webSocketWriter.m83006b(10, byteStringPoll);
                    } else if (obj instanceof Message) {
                        ByteString byteString = ((Message) obj).f57694b;
                        if (byteString != null) {
                            AiOkHttpHelper.getInstance().logDebug("write message size: " + byteString.size());
                        }
                        int i2 = ((Message) obj).f57693a;
                        long size = byteString.size();
                        if (webSocketWriter.f57715h) {
                            throw new IllegalStateException("Another message writer is active. Did you call close()?");
                        }
                        webSocketWriter.f57715h = true;
                        WebSocketWriter.FrameSink frameSink = webSocketWriter.f57714g;
                        frameSink.f57718a = i2;
                        frameSink.f57719b = size;
                        frameSink.f57720c = true;
                        frameSink.f57721d = false;
                        InterfaceC13940f interfaceC13940fM83143a = C13948n.m83143a(frameSink);
                        C13951q c13951q = (C13951q) interfaceC13940fM83143a;
                        if (c13951q.f57848c) {
                            throw new IllegalStateException("closed");
                        }
                        c13951q.f57846a.m83098b(byteString);
                        c13951q.mo83115f();
                        ((C13951q) interfaceC13940fM83143a).close();
                        synchronized (this) {
                            this.f57677n -= (long) byteString.size();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        webSocketWriter.m83005a(close.f57690a, close.f57691b);
                        if (streams != null) {
                            this.f57665b.onClosed(this, i, str);
                        }
                    }
                    C13869c.m82798a(streams);
                    return true;
                } catch (Throwable th) {
                    C13869c.m82798a(streams);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.WebSocket
    public void cancel() {
        this.f57669f.cancel();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.WebSocket
    public boolean close(int i, String str) {
        ByteString byteStringEncodeUtf8;
        synchronized (this) {
            try {
                String strM83000a = WebSocketProtocol.m83000a(i);
                if (strM83000a != null) {
                    throw new IllegalArgumentException(strM83000a);
                }
                if (str != null) {
                    byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
                    if (byteStringEncodeUtf8.size() > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                    }
                } else {
                    byteStringEncodeUtf8 = null;
                }
                if (!this.f57682s && !this.f57678o) {
                    this.f57678o = true;
                    this.f57676m.add(new Close(i, byteStringEncodeUtf8, Constants.ONE_MIN_IN_MILLIS));
                    m82998b();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void connect(OkHttpClient okHttpClient) {
        OkHttpClient okHttpClientBuild = okHttpClient.newBuilder().eventListener(AbstractC13927m.f57749a).protocols(f57662x).build();
        final Request requestBuild = this.f57664a.newBuilder().header("Upgrade", "websocket").header(HttpHeaders.CONNECTION, "Upgrade").header("Sec-WebSocket-Key", this.f57668e).header("Sec-WebSocket-Version", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_JOININ_GROUP).build();
        AiOkHttpHelper.getInstance().logInfo("real connect web socket: " + requestBuild.url());
        ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
        C13932r c13932rM83060a = C13932r.m83060a(okHttpClientBuild, requestBuild, true);
        this.f57669f = c13932rM83060a;
        c13932rM83060a.enqueue(new Callback() { // from class: com.tencent.cloud.ai.network.okhttp3.internal.ws.RealWebSocket.1
            @Override // com.tencent.cloud.p080ai.network.okhttp3.Callback
            public void onFailure(Call call, IOException iOException) throws IOException {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // com.tencent.cloud.p080ai.network.okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                C13875b c13875b = response.f57233m;
                try {
                    RealWebSocket.this.m82996a(response, c13875b);
                    try {
                        RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + requestBuild.url().m83049f(), c13875b.m82826a());
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        realWebSocket.f57665b.onOpen(realWebSocket, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (IOException e2) {
                    if (c13875b != null) {
                        c13875b.m82828a(-1L, true, true, null);
                    }
                    RealWebSocket.this.failWebSocket(e2, response);
                    C13869c.m82798a(response);
                }
            }
        });
    }

    public void failWebSocket(Exception exc, Response response) throws IOException {
        synchronized (this) {
            try {
                if (this.f57682s) {
                    return;
                }
                this.f57682s = true;
                Streams streams = this.f57674k;
                this.f57674k = null;
                ScheduledFuture<?> scheduledFuture = this.f57679p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f57673j;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.f57665b.onFailure(this, exc, response);
                } finally {
                    C13869c.m82798a(streams);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initReaderAndWriter(String str, Streams streams) {
        synchronized (this) {
            try {
                this.f57674k = streams;
                this.f57672i = new WebSocketWriter(streams.client, streams.sink, this.f57666c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C13869c.m82795a(str, false));
                this.f57673j = scheduledThreadPoolExecutor;
                if (this.f57667d != 0) {
                    PingRunnable pingRunnable = new PingRunnable();
                    long j = this.f57667d;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(pingRunnable, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.f57676m.isEmpty()) {
                    m82998b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f57671h = new WebSocketReader(streams.client, streams.source, this);
    }

    public void loopReader() throws IOException {
        while (this.f57680q == -1) {
            WebSocketReader webSocketReader = this.f57671h;
            webSocketReader.m83003b();
            if (webSocketReader.f57703h) {
                webSocketReader.m83002a();
            } else {
                int i = webSocketReader.f57700e;
                if (i != 1 && i != 2) {
                    throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
                }
                while (true) {
                    if (webSocketReader.f57699d) {
                        zpg0.m220844a("closed");
                        return;
                    }
                    long j = webSocketReader.f57701f;
                    if (j > 0) {
                        webSocketReader.f57697b.mo83103b(webSocketReader.f57705j, j);
                        if (!webSocketReader.f57696a) {
                            webSocketReader.f57705j.m83086a(webSocketReader.f57707l);
                            webSocketReader.f57707l.m83131h(webSocketReader.f57705j.f57818b - webSocketReader.f57701f);
                            WebSocketProtocol.m83001a(webSocketReader.f57707l, webSocketReader.f57706k);
                            webSocketReader.f57707l.close();
                        }
                    }
                    if (webSocketReader.f57702g) {
                        WebSocketReader.FrameCallback frameCallback = webSocketReader.f57698c;
                        if (i != 1) {
                            frameCallback.onReadMessage(webSocketReader.f57705j.m83129m());
                            break;
                        } else {
                            frameCallback.onReadMessage(webSocketReader.f57705j.m83130n());
                            break;
                        }
                    }
                    while (!webSocketReader.f57699d) {
                        webSocketReader.m83003b();
                        if (!webSocketReader.f57703h) {
                            break;
                        } else {
                            webSocketReader.m83002a();
                        }
                    }
                    if (webSocketReader.f57700e != 0) {
                        throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(webSocketReader.f57700e));
                    }
                }
            }
        }
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) throws IOException {
        Streams streams;
        if (i == -1) {
            fig0.m125680a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f57680q != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f57680q = i;
                this.f57681r = str;
                streams = null;
                if (this.f57678o && this.f57676m.isEmpty()) {
                    Streams streams2 = this.f57674k;
                    this.f57674k = null;
                    ScheduledFuture<?> scheduledFuture = this.f57679p;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f57673j.shutdown();
                    streams = streams2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f57665b.onClosing(this, i, str);
            if (streams != null) {
                this.f57665b.onClosed(this, i, str);
            }
        } finally {
            C13869c.m82798a(streams);
        }
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) {
        AiOkHttpHelper.getInstance().logDebug("real web socket receive message: " + str.getBytes().length);
        this.f57665b.onMessage(this, str);
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString byteString) {
        try {
            if (!this.f57682s && (!this.f57678o || !this.f57676m.isEmpty())) {
                this.f57675l.add(byteString);
                m82998b();
                this.f57684u++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString byteString) {
        this.f57685v++;
        this.f57686w = false;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.f57677n;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.WebSocket
    public Request request() {
        return this.f57664a;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.WebSocket
    public boolean send(String str) {
        if (str != null) {
            return m82997a(ByteString.encodeUtf8(str), 1);
        }
        mnd0.m159157a("text == null");
        return false;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.WebSocket
    public boolean send(ByteString byteString) {
        if (byteString != null) {
            return m82997a(byteString, 2);
        }
        mnd0.m159157a("bytes == null");
        return false;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString byteString) {
        AiOkHttpHelper.getInstance().logDebug("real web socket bytes receive message: " + byteString.size());
        this.f57665b.onMessage(this, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m82994a() throws IOException {
        do {
            try {
            } catch (IOException e) {
                failWebSocket(e, null);
                return;
            }
        } while (m82999c());
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m82997a(ByteString byteString, int i) {
        if (!this.f57682s && !this.f57678o) {
            if (this.f57677n + ((long) byteString.size()) > 16777216) {
                close(1001, null);
                return false;
            }
            this.f57677n += (long) byteString.size();
            this.f57676m.add(new Message(i, byteString));
            m82998b();
            return true;
        }
        return false;
    }
}
