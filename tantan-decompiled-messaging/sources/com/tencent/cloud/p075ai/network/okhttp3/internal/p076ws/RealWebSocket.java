package com.tencent.cloud.p075ai.network.okhttp3.internal.p076ws;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.cloud.p075ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p075ai.network.okhttp3.AbstractC13764m;
import com.tencent.cloud.p075ai.network.okhttp3.C13769r;
import com.tencent.cloud.p075ai.network.okhttp3.Call;
import com.tencent.cloud.p075ai.network.okhttp3.Callback;
import com.tencent.cloud.p075ai.network.okhttp3.EnumC13768q;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.WebSocket;
import com.tencent.cloud.p075ai.network.okhttp3.WebSocketListener;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13712b;
import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13785n;
import com.tencent.cloud.p075ai.network.okio.C13788q;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
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
import p149l.aza0;
import p149l.jfd0;
import p149l.kg3;
import p149l.rhg0;
import p149l.shg0;
import p149l.x9g0;
import p149l.yec0;
import p149l.zec0;

/* JADX INFO: loaded from: classes13.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* JADX INFO: renamed from: x */
    public static final List<EnumC13768q> f56814x = Collections.singletonList(EnumC13768q.HTTP_1_1);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ boolean f56815y = true;

    /* JADX INFO: renamed from: a */
    public final Request f56816a;

    /* JADX INFO: renamed from: b */
    public final WebSocketListener f56817b;

    /* JADX INFO: renamed from: c */
    public final Random f56818c;

    /* JADX INFO: renamed from: d */
    public final long f56819d;

    /* JADX INFO: renamed from: e */
    public final String f56820e;

    /* JADX INFO: renamed from: f */
    public Call f56821f;

    /* JADX INFO: renamed from: g */
    public final Runnable f56822g;

    /* JADX INFO: renamed from: h */
    public WebSocketReader f56823h;

    /* JADX INFO: renamed from: i */
    public WebSocketWriter f56824i;

    /* JADX INFO: renamed from: j */
    public ScheduledExecutorService f56825j;

    /* JADX INFO: renamed from: k */
    public Streams f56826k;

    /* JADX INFO: renamed from: n */
    public long f56829n;

    /* JADX INFO: renamed from: o */
    public boolean f56830o;

    /* JADX INFO: renamed from: p */
    public ScheduledFuture<?> f56831p;

    /* JADX INFO: renamed from: r */
    public String f56833r;

    /* JADX INFO: renamed from: s */
    public boolean f56834s;

    /* JADX INFO: renamed from: t */
    public int f56835t;

    /* JADX INFO: renamed from: u */
    public int f56836u;

    /* JADX INFO: renamed from: v */
    public int f56837v;

    /* JADX INFO: renamed from: w */
    public boolean f56838w;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<ByteString> f56827l = new ArrayDeque<>();

    /* JADX INFO: renamed from: m */
    public final ArrayDeque<Object> f56828m = new ArrayDeque<>();

    /* JADX INFO: renamed from: q */
    public int f56832q = -1;

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
        public final int f56842a;

        /* JADX INFO: renamed from: b */
        public final ByteString f56843b;

        /* JADX INFO: renamed from: c */
        public final long f56844c;

        public Close(int i, ByteString byteString, long j) {
            this.f56842a = i;
            this.f56843b = byteString;
            this.f56844c = j;
        }
    }

    public static final class Message {

        /* JADX INFO: renamed from: a */
        public final int f56845a;

        /* JADX INFO: renamed from: b */
        public final ByteString f56846b;

        public Message(int i, ByteString byteString) {
            this.f56845a = i;
            this.f56846b = byteString;
        }
    }

    public final class PingRunnable implements Runnable {
        public PingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket realWebSocket = RealWebSocket.this;
            synchronized (realWebSocket) {
                try {
                    if (realWebSocket.f56834s) {
                        return;
                    }
                    WebSocketWriter webSocketWriter = realWebSocket.f56824i;
                    int i = realWebSocket.f56838w ? realWebSocket.f56835t : -1;
                    realWebSocket.f56835t++;
                    realWebSocket.f56838w = true;
                    if (i == -1) {
                        try {
                            webSocketWriter.m81823b(9, ByteString.EMPTY);
                            return;
                        } catch (IOException e) {
                            realWebSocket.failWebSocket(e, null);
                            return;
                        }
                    }
                    realWebSocket.failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + realWebSocket.f56819d + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final InterfaceC13777f sink;
        public final InterfaceC13778g source;

        public Streams(boolean z, InterfaceC13778g interfaceC13778g, InterfaceC13777f interfaceC13777f) {
            this.client = z;
            this.source = interfaceC13778g;
            this.sink = interfaceC13777f;
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j) {
        if (!"GET".equals(request.method())) {
            kg3.m145878a("Request must be GET: ", request.method());
            throw null;
        }
        this.f56816a = request;
        this.f56817b = webSocketListener;
        this.f56818c = random;
        this.f56819d = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f56820e = ByteString.m81885of(bArr).base64();
        this.f56822g = new Runnable() { // from class: l.afc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69165a.m81811a();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public void m81813a(Response response, C13712b c13712b) throws ProtocolException {
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + response.message() + "'");
        }
        String strHeader = response.header("Connection");
        if (!"Upgrade".equalsIgnoreCase(strHeader)) {
            zec0.m218280a("Expected 'Connection' header value 'Upgrade' but was '", strHeader);
            return;
        }
        String strHeader2 = response.header("Upgrade");
        if (!"websocket".equalsIgnoreCase(strHeader2)) {
            zec0.m218280a("Expected 'Upgrade' header value 'websocket' but was '", strHeader2);
            return;
        }
        String strHeader3 = response.header("Sec-WebSocket-Accept");
        String strBase64 = ByteString.encodeUtf8(this.f56820e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (!strBase64.equals(strHeader3)) {
            yec0.m214344a(strBase64, strHeader3);
        } else {
            if (c13712b != null) {
                return;
            }
            aza0.m99642a("Web Socket exchange missing: bad interceptor?");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m81815b() {
        if (!f56815y && !Thread.holdsLock(this)) {
            shg0.m184191a();
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.f56825j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f56822g);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m81816c() {
        String str;
        int i;
        Streams streams;
        synchronized (this) {
            try {
                if (this.f56834s) {
                    return false;
                }
                WebSocketWriter webSocketWriter = this.f56824i;
                ByteString byteStringPoll = this.f56827l.poll();
                Object obj = null;
                if (byteStringPoll == null) {
                    Object objPoll = this.f56828m.poll();
                    if (objPoll instanceof Close) {
                        i = this.f56832q;
                        str = this.f56833r;
                        if (i != -1) {
                            streams = this.f56826k;
                            this.f56826k = null;
                            this.f56825j.shutdown();
                        } else {
                            this.f56831p = this.f56825j.schedule(new CancelRunnable(), ((Close) objPoll).f56844c, TimeUnit.MILLISECONDS);
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
                        webSocketWriter.m81823b(10, byteStringPoll);
                    } else if (obj instanceof Message) {
                        ByteString byteString = ((Message) obj).f56846b;
                        if (byteString != null) {
                            AiOkHttpHelper.getInstance().logDebug("write message size: " + byteString.size());
                        }
                        int i2 = ((Message) obj).f56845a;
                        long size = byteString.size();
                        if (webSocketWriter.f56867h) {
                            throw new IllegalStateException("Another message writer is active. Did you call close()?");
                        }
                        webSocketWriter.f56867h = true;
                        WebSocketWriter.FrameSink frameSink = webSocketWriter.f56866g;
                        frameSink.f56870a = i2;
                        frameSink.f56871b = size;
                        frameSink.f56872c = true;
                        frameSink.f56873d = false;
                        InterfaceC13777f interfaceC13777fM81960a = C13785n.m81960a(frameSink);
                        C13788q c13788q = (C13788q) interfaceC13777fM81960a;
                        if (c13788q.f57000c) {
                            throw new IllegalStateException("closed");
                        }
                        c13788q.f56998a.m81915b(byteString);
                        c13788q.mo81932f();
                        ((C13788q) interfaceC13777fM81960a).close();
                        synchronized (this) {
                            this.f56829n -= (long) byteString.size();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        webSocketWriter.m81822a(close.f56842a, close.f56843b);
                        if (streams != null) {
                            this.f56817b.onClosed(this, i, str);
                        }
                    }
                    C13706c.m81615a(streams);
                    return true;
                } catch (Throwable th) {
                    C13706c.m81615a(streams);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.WebSocket
    public void cancel() {
        this.f56821f.cancel();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.WebSocket
    public boolean close(int i, String str) {
        ByteString byteStringEncodeUtf8;
        synchronized (this) {
            try {
                String strM81817a = WebSocketProtocol.m81817a(i);
                if (strM81817a != null) {
                    throw new IllegalArgumentException(strM81817a);
                }
                if (str != null) {
                    byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
                    if (byteStringEncodeUtf8.size() > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                    }
                } else {
                    byteStringEncodeUtf8 = null;
                }
                if (!this.f56834s && !this.f56830o) {
                    this.f56830o = true;
                    this.f56828m.add(new Close(i, byteStringEncodeUtf8, Constants.ONE_MIN_IN_MILLIS));
                    m81815b();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void connect(OkHttpClient okHttpClient) {
        OkHttpClient okHttpClientBuild = okHttpClient.newBuilder().eventListener(AbstractC13764m.f56901a).protocols(f56814x).build();
        final Request requestBuild = this.f56816a.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.f56820e).header("Sec-WebSocket-Version", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_JOININ_GROUP).build();
        AiOkHttpHelper.getInstance().logInfo("real connect web socket: " + requestBuild.url());
        ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
        C13769r c13769rM81877a = C13769r.m81877a(okHttpClientBuild, requestBuild, true);
        this.f56821f = c13769rM81877a;
        c13769rM81877a.enqueue(new Callback() { // from class: com.tencent.cloud.ai.network.okhttp3.internal.ws.RealWebSocket.1
            @Override // com.tencent.cloud.p075ai.network.okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // com.tencent.cloud.p075ai.network.okhttp3.Callback
            public void onResponse(Call call, Response response) {
                ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                C13712b c13712b = response.f56385m;
                try {
                    RealWebSocket.this.m81813a(response, c13712b);
                    try {
                        RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + requestBuild.url().m81866f(), c13712b.m81643a());
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        realWebSocket.f56817b.onOpen(realWebSocket, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (IOException e2) {
                    if (c13712b != null) {
                        c13712b.m81645a(-1L, true, true, null);
                    }
                    RealWebSocket.this.failWebSocket(e2, response);
                    C13706c.m81615a(response);
                }
            }
        });
    }

    public void failWebSocket(Exception exc, Response response) {
        synchronized (this) {
            try {
                if (this.f56834s) {
                    return;
                }
                this.f56834s = true;
                Streams streams = this.f56826k;
                this.f56826k = null;
                ScheduledFuture<?> scheduledFuture = this.f56831p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f56825j;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.f56817b.onFailure(this, exc, response);
                } finally {
                    C13706c.m81615a(streams);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initReaderAndWriter(String str, Streams streams) {
        synchronized (this) {
            try {
                this.f56826k = streams;
                this.f56824i = new WebSocketWriter(streams.client, streams.sink, this.f56818c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C13706c.m81612a(str, false));
                this.f56825j = scheduledThreadPoolExecutor;
                if (this.f56819d != 0) {
                    PingRunnable pingRunnable = new PingRunnable();
                    long j = this.f56819d;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(pingRunnable, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.f56828m.isEmpty()) {
                    m81815b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f56823h = new WebSocketReader(streams.client, streams.source, this);
    }

    public void loopReader() throws IOException {
        while (this.f56832q == -1) {
            WebSocketReader webSocketReader = this.f56823h;
            webSocketReader.m81820b();
            if (webSocketReader.f56855h) {
                webSocketReader.m81819a();
            } else {
                int i = webSocketReader.f56852e;
                if (i != 1 && i != 2) {
                    throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
                }
                while (true) {
                    if (webSocketReader.f56851d) {
                        rhg0.m179353a("closed");
                        return;
                    }
                    long j = webSocketReader.f56853f;
                    if (j > 0) {
                        webSocketReader.f56849b.mo81920b(webSocketReader.f56857j, j);
                        if (!webSocketReader.f56848a) {
                            webSocketReader.f56857j.m81903a(webSocketReader.f56859l);
                            webSocketReader.f56859l.m81948h(webSocketReader.f56857j.f56970b - webSocketReader.f56853f);
                            WebSocketProtocol.m81818a(webSocketReader.f56859l, webSocketReader.f56858k);
                            webSocketReader.f56859l.close();
                        }
                    }
                    if (webSocketReader.f56854g) {
                        WebSocketReader.FrameCallback frameCallback = webSocketReader.f56850c;
                        if (i != 1) {
                            frameCallback.onReadMessage(webSocketReader.f56857j.m81946m());
                            break;
                        } else {
                            frameCallback.onReadMessage(webSocketReader.f56857j.m81947n());
                            break;
                        }
                    }
                    while (!webSocketReader.f56851d) {
                        webSocketReader.m81820b();
                        if (!webSocketReader.f56855h) {
                            break;
                        } else {
                            webSocketReader.m81819a();
                        }
                    }
                    if (webSocketReader.f56852e != 0) {
                        throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(webSocketReader.f56852e));
                    }
                }
            }
        }
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        Streams streams;
        if (i == -1) {
            x9g0.m207497a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f56832q != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f56832q = i;
                this.f56833r = str;
                streams = null;
                if (this.f56830o && this.f56828m.isEmpty()) {
                    Streams streams2 = this.f56826k;
                    this.f56826k = null;
                    ScheduledFuture<?> scheduledFuture = this.f56831p;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f56825j.shutdown();
                    streams = streams2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f56817b.onClosing(this, i, str);
            if (streams != null) {
                this.f56817b.onClosed(this, i, str);
            }
        } finally {
            C13706c.m81615a(streams);
        }
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) {
        AiOkHttpHelper.getInstance().logDebug("real web socket receive message: " + str.getBytes().length);
        this.f56817b.onMessage(this, str);
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString byteString) {
        try {
            if (!this.f56834s && (!this.f56830o || !this.f56828m.isEmpty())) {
                this.f56827l.add(byteString);
                m81815b();
                this.f56836u++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString byteString) {
        this.f56837v++;
        this.f56838w = false;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.f56829n;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.WebSocket
    public Request request() {
        return this.f56816a;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.WebSocket
    public boolean send(String str) {
        if (str != null) {
            return m81814a(ByteString.encodeUtf8(str), 1);
        }
        jfd0.m141176a("text == null");
        return false;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.WebSocket
    public boolean send(ByteString byteString) {
        if (byteString != null) {
            return m81814a(byteString, 2);
        }
        jfd0.m141176a("bytes == null");
        return false;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString byteString) {
        AiOkHttpHelper.getInstance().logDebug("real web socket bytes receive message: " + byteString.size());
        this.f56817b.onMessage(this, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m81811a() {
        do {
            try {
            } catch (IOException e) {
                failWebSocket(e, null);
                return;
            }
        } while (m81816c());
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m81814a(ByteString byteString, int i) {
        if (!this.f56834s && !this.f56830o) {
            if (this.f56829n + ((long) byteString.size()) > 16777216) {
                close(1001, null);
                return false;
            }
            this.f56829n += (long) byteString.size();
            this.f56828m.add(new Message(i, byteString));
            m81815b();
            return true;
        }
        return false;
    }
}
