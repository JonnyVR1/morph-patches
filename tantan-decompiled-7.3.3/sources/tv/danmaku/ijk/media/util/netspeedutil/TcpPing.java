package tv.danmaku.ijk.media.util.netspeedutil;

import android.text.TextUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public class TcpPing implements SpeedTask {

    /* JADX INFO: renamed from: a */
    private int f209850a;

    /* JADX INFO: renamed from: b */
    private String f209851b;

    /* JADX INFO: renamed from: c */
    private long f209852c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f209853d;

    /* JADX INFO: renamed from: e */
    private long f209854e;

    /* JADX INFO: renamed from: f */
    private String f209855f;

    /* JADX INFO: renamed from: g */
    private Socket f209856g;

    /* JADX INFO: renamed from: h */
    private int f209857h;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.util.netspeedutil.TcpPing$1 */
    public class CallableC226431 implements Callable<Long> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TcpPing f209858a;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            this.f209858a.m224127e(this.f209858a.m224126d());
            if (this.f209858a.f209853d != null) {
                TcpPing tcpPing = this.f209858a;
                tcpPing.m224128f(tcpPing.f209853d);
            }
            return Long.valueOf(this.f209858a.f209854e / 1000000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public String m224126d() throws IOException {
        this.f209852c = System.nanoTime();
        return InetAddress.getByName(this.f209851b).getHostAddress();
    }

    /* JADX INFO: renamed from: e */
    public void m224127e(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Socket socket = new Socket();
        this.f209856g = socket;
        this.f209855f = str;
        socket.connect(new InetSocketAddress(str, this.f209850a), this.f209857h);
    }

    /* JADX INFO: renamed from: f */
    public void m224128f(ByteBuffer byteBuffer) throws IOException {
        this.f209856g.getOutputStream().write(byteBuffer.get());
        this.f209856g.close();
        this.f209854e = System.nanoTime() - this.f209852c;
    }
}
