package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C2006g;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p153l.et4;
import p153l.w11;
import p153l.wg3;
import p153l.wpg0;
import p153l.wtq0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2006g implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Charset f8936g = et4.f95689c;

    /* JADX INFO: renamed from: a */
    public final d f8937a;

    /* JADX INFO: renamed from: b */
    public final Loader f8938b = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: c */
    public final Map<Integer, b> f8939c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d */
    public g f8940d;

    /* JADX INFO: renamed from: e */
    public Socket f8941e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f8942f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$b */
    public interface b {
        /* JADX INFO: renamed from: j */
        void mo11688j(byte[] bArr);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$c */
    public final class c implements Loader.InterfaceC2064b<f> {
        public c() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo11078n(f fVar, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo11079o(f fVar, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.C2065c mo11080q(f fVar, long j, long j2, IOException iOException, int i) {
            if (!C2006g.this.f8942f) {
                C2006g.this.f8937a.m11693c(iOException);
            }
            return Loader.f9495f;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        default void m11692a(List<String> list, Exception exc) {
        }

        /* JADX INFO: renamed from: b */
        void mo11585b(List<String> list);

        /* JADX INFO: renamed from: c */
        default void m11693c(Exception exc) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final List<String> f8944a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int f8945b = 1;

        /* JADX INFO: renamed from: c */
        public long f8946c;

        /* JADX INFO: renamed from: d */
        public static byte[] m11694d(byte b, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b2 = dataInputStream.readByte();
                bArr[1] = b2;
                byteArrayOutputStream.write(b2);
            }
        }

        /* JADX INFO: renamed from: a */
        public final ImmutableList<String> m11695a(byte[] bArr) {
            w11.m204371g(this.f8945b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                wg3.m206174a("Message body is empty or does not end with a LF.");
                return null;
            }
            this.f8944a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, C2006g.f8936g) : new String(bArr, 0, bArr.length - 2, C2006g.f8936g));
            ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) this.f8944a);
            m11698e();
            return immutableListCopyOf;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final ImmutableList<String> m11696b(byte[] bArr) throws ParserException {
            w11.m204365a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, C2006g.f8936g);
            this.f8944a.add(str);
            int i = this.f8945b;
            if (i != 1) {
                if (i != 2) {
                    wpg0.m207458a();
                    return null;
                }
                long jM11709g = C2007h.m11709g(str);
                if (jM11709g != -1) {
                    this.f8946c = jM11709g;
                }
                if (str.isEmpty()) {
                    if (this.f8946c <= 0) {
                        ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) this.f8944a);
                        m11698e();
                        return immutableListCopyOf;
                    }
                    this.f8945b = 3;
                }
            } else if (C2007h.m11708f(str)) {
                this.f8945b = 2;
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public ImmutableList<String> m11697c(byte b, DataInputStream dataInputStream) throws IOException {
            ImmutableList<String> immutableListM11696b = m11696b(m11694d(b, dataInputStream));
            while (immutableListM11696b == null) {
                if (this.f8945b == 3) {
                    long j = this.f8946c;
                    if (j <= 0) {
                        wtq0.m207906a("Expects a greater than zero Content-Length.");
                        return null;
                    }
                    int iM16514d = Ints.m16514d(j);
                    w11.m204371g(iM16514d != -1);
                    byte[] bArr = new byte[iM16514d];
                    dataInputStream.readFully(bArr, 0, iM16514d);
                    immutableListM11696b = m11695a(bArr);
                } else {
                    immutableListM11696b = m11696b(m11694d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return immutableListM11696b;
        }

        /* JADX INFO: renamed from: e */
        public final void m11698e() {
            this.f8944a.clear();
            this.f8945b = 1;
            this.f8946c = 0L;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$f */
    public final class f implements Loader.InterfaceC2067e {

        /* JADX INFO: renamed from: a */
        public final DataInputStream f8947a;

        /* JADX INFO: renamed from: b */
        public final e f8948b = new e();

        /* JADX INFO: renamed from: c */
        public volatile boolean f8949c;

        public f(InputStream inputStream) {
            this.f8947a = new DataInputStream(inputStream);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
        /* JADX INFO: renamed from: a */
        public void mo11431a() throws IOException {
            while (!this.f8949c) {
                byte b = this.f8947a.readByte();
                if (b == 36) {
                    m11699b();
                } else {
                    m11700d(b);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m11699b() throws IOException {
            int unsignedByte = this.f8947a.readUnsignedByte();
            int unsignedShort = this.f8947a.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.f8947a.readFully(bArr, 0, unsignedShort);
            b bVar = (b) C2006g.this.f8939c.get(Integer.valueOf(unsignedByte));
            if (bVar == null || C2006g.this.f8942f) {
                return;
            }
            bVar.mo11688j(bArr);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
        /* JADX INFO: renamed from: c */
        public void mo11432c() {
            this.f8949c = true;
        }

        /* JADX INFO: renamed from: d */
        public final void m11700d(byte b) throws IOException {
            if (C2006g.this.f8942f) {
                return;
            }
            C2006g.this.f8937a.mo11585b(this.f8948b.m11697c(b, this.f8947a));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$g */
    public final class g implements Closeable {

        /* JADX INFO: renamed from: a */
        public final OutputStream f8951a;

        /* JADX INFO: renamed from: b */
        public final HandlerThread f8952b;

        /* JADX INFO: renamed from: c */
        public final Handler f8953c;

        public g(OutputStream outputStream) {
            this.f8951a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f8952b = handlerThread;
            handlerThread.start();
            this.f8953c = new Handler(handlerThread.getLooper());
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m11701b(g gVar, byte[] bArr, List list) {
            gVar.getClass();
            try {
                gVar.f8951a.write(bArr);
            } catch (Exception e) {
                if (C2006g.this.f8942f) {
                    return;
                }
                C2006g.this.f8937a.m11692a(list, e);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f8953c;
            final HandlerThread handlerThread = this.f8952b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: l.nqd0
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f8952b.join();
            } catch (InterruptedException unused) {
                this.f8952b.interrupt();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m11702d(final List<String> list) {
            final byte[] bArrM11704b = C2007h.m11704b(list);
            this.f8953c.post(new Runnable() { // from class: l.mqd0
                @Override // java.lang.Runnable
                public final void run() {
                    C2006g.g.m11701b(this.f138042a, bArrM11704b, list);
                }
            });
        }
    }

    public C2006g(d dVar) {
        this.f8937a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f8942f) {
            return;
        }
        try {
            g gVar = this.f8940d;
            if (gVar != null) {
                gVar.close();
            }
            this.f8938b.m12144l();
            Socket socket = this.f8941e;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f8942f = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11685g(Socket socket) throws IOException {
        this.f8941e = socket;
        this.f8940d = new g(socket.getOutputStream());
        this.f8938b.m12146n(new f(socket.getInputStream()), new c(), 0);
    }

    /* JADX INFO: renamed from: h */
    public void m11686h(int i, b bVar) {
        this.f8939c.put(Integer.valueOf(i), bVar);
    }

    /* JADX INFO: renamed from: i */
    public void m11687i(List<String> list) {
        w11.m204373i(this.f8940d);
        this.f8940d.m11702d(list);
    }
}
