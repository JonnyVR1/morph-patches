package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C1983g;
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
import p149l.fs4;
import p149l.ig3;
import p149l.ohg0;
import p149l.p11;
import p149l.qkq0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1983g implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Charset f8899g = fs4.f99036c;

    /* JADX INFO: renamed from: a */
    public final d f8900a;

    /* JADX INFO: renamed from: b */
    public final Loader f8901b = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: c */
    public final Map<Integer, b> f8902c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d */
    public g f8903d;

    /* JADX INFO: renamed from: e */
    public Socket f8904e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f8905f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$b */
    public interface b {
        /* JADX INFO: renamed from: j */
        void mo11634j(byte[] bArr);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$c */
    public final class c implements Loader.InterfaceC2041b<f> {
        public c() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo11024n(f fVar, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo11025o(f fVar, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.C2042c mo11026q(f fVar, long j, long j2, IOException iOException, int i) {
            if (!C1983g.this.f8905f) {
                C1983g.this.f8900a.m11639c(iOException);
            }
            return Loader.f9458f;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        default void m11638a(List<String> list, Exception exc) {
        }

        /* JADX INFO: renamed from: b */
        void mo11531b(List<String> list);

        /* JADX INFO: renamed from: c */
        default void m11639c(Exception exc) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final List<String> f8907a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int f8908b = 1;

        /* JADX INFO: renamed from: c */
        public long f8909c;

        /* JADX INFO: renamed from: d */
        public static byte[] m11640d(byte b, DataInputStream dataInputStream) throws IOException {
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
        public final ImmutableList<String> m11641a(byte[] bArr) {
            p11.m167013g(this.f8908b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                ig3.m135964a("Message body is empty or does not end with a LF.");
                return null;
            }
            this.f8907a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, C1983g.f8899g) : new String(bArr, 0, bArr.length - 2, C1983g.f8899g));
            ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) this.f8907a);
            m11644e();
            return immutableListCopyOf;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final ImmutableList<String> m11642b(byte[] bArr) throws ParserException {
            p11.m167007a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, C1983g.f8899g);
            this.f8907a.add(str);
            int i = this.f8908b;
            if (i != 1) {
                if (i != 2) {
                    ohg0.m164364a();
                    return null;
                }
                long jM11655g = C1984h.m11655g(str);
                if (jM11655g != -1) {
                    this.f8909c = jM11655g;
                }
                if (str.isEmpty()) {
                    if (this.f8909c <= 0) {
                        ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) this.f8907a);
                        m11644e();
                        return immutableListCopyOf;
                    }
                    this.f8908b = 3;
                }
            } else if (C1984h.m11654f(str)) {
                this.f8908b = 2;
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public ImmutableList<String> m11643c(byte b, DataInputStream dataInputStream) throws IOException {
            ImmutableList<String> immutableListM11642b = m11642b(m11640d(b, dataInputStream));
            while (immutableListM11642b == null) {
                if (this.f8908b == 3) {
                    long j = this.f8909c;
                    if (j <= 0) {
                        qkq0.m175383a("Expects a greater than zero Content-Length.");
                        return null;
                    }
                    int iM16459d = Ints.m16459d(j);
                    p11.m167013g(iM16459d != -1);
                    byte[] bArr = new byte[iM16459d];
                    dataInputStream.readFully(bArr, 0, iM16459d);
                    immutableListM11642b = m11641a(bArr);
                } else {
                    immutableListM11642b = m11642b(m11640d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return immutableListM11642b;
        }

        /* JADX INFO: renamed from: e */
        public final void m11644e() {
            this.f8907a.clear();
            this.f8908b = 1;
            this.f8909c = 0L;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$f */
    public final class f implements Loader.InterfaceC2044e {

        /* JADX INFO: renamed from: a */
        public final DataInputStream f8910a;

        /* JADX INFO: renamed from: b */
        public final e f8911b = new e();

        /* JADX INFO: renamed from: c */
        public volatile boolean f8912c;

        public f(InputStream inputStream) {
            this.f8910a = new DataInputStream(inputStream);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
        /* JADX INFO: renamed from: a */
        public void mo11377a() throws IOException {
            while (!this.f8912c) {
                byte b = this.f8910a.readByte();
                if (b == 36) {
                    m11645b();
                } else {
                    m11646d(b);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m11645b() throws IOException {
            int unsignedByte = this.f8910a.readUnsignedByte();
            int unsignedShort = this.f8910a.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.f8910a.readFully(bArr, 0, unsignedShort);
            b bVar = (b) C1983g.this.f8902c.get(Integer.valueOf(unsignedByte));
            if (bVar == null || C1983g.this.f8905f) {
                return;
            }
            bVar.mo11634j(bArr);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
        /* JADX INFO: renamed from: c */
        public void mo11378c() {
            this.f8912c = true;
        }

        /* JADX INFO: renamed from: d */
        public final void m11646d(byte b) throws IOException {
            if (C1983g.this.f8905f) {
                return;
            }
            C1983g.this.f8900a.mo11531b(this.f8911b.m11643c(b, this.f8910a));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$g */
    public final class g implements Closeable {

        /* JADX INFO: renamed from: a */
        public final OutputStream f8914a;

        /* JADX INFO: renamed from: b */
        public final HandlerThread f8915b;

        /* JADX INFO: renamed from: c */
        public final Handler f8916c;

        public g(OutputStream outputStream) {
            this.f8914a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f8915b = handlerThread;
            handlerThread.start();
            this.f8916c = new Handler(handlerThread.getLooper());
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m11647b(g gVar, byte[] bArr, List list) {
            gVar.getClass();
            try {
                gVar.f8914a.write(bArr);
            } catch (Exception e) {
                if (C1983g.this.f8905f) {
                    return;
                }
                C1983g.this.f8900a.m11638a(list, e);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f8916c;
            final HandlerThread handlerThread = this.f8915b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: l.kid0
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f8915b.join();
            } catch (InterruptedException unused) {
                this.f8915b.interrupt();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m11648d(final List<String> list) {
            final byte[] bArrM11650b = C1984h.m11650b(list);
            this.f8916c.post(new Runnable() { // from class: l.jid0
                @Override // java.lang.Runnable
                public final void run() {
                    C1983g.g.m11647b(this.f118092a, bArrM11650b, list);
                }
            });
        }
    }

    public C1983g(d dVar) {
        this.f8900a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f8905f) {
            return;
        }
        try {
            g gVar = this.f8903d;
            if (gVar != null) {
                gVar.close();
            }
            this.f8901b.m12090l();
            Socket socket = this.f8904e;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f8905f = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11631g(Socket socket) throws IOException {
        this.f8904e = socket;
        this.f8903d = new g(socket.getOutputStream());
        this.f8901b.m12092n(new f(socket.getInputStream()), new c(), 0);
    }

    /* JADX INFO: renamed from: h */
    public void m11632h(int i, b bVar) {
        this.f8902c.put(Integer.valueOf(i), bVar);
    }

    /* JADX INFO: renamed from: i */
    public void m11633i(List<String> list) {
        p11.m167015i(this.f8903d);
        this.f8903d.m11648d(list);
    }
}
