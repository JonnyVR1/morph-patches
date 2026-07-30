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
    private int f208928a;

    /* JADX INFO: renamed from: b */
    private String f208929b;

    /* JADX INFO: renamed from: c */
    private long f208930c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f208931d;

    /* JADX INFO: renamed from: e */
    private long f208932e;

    /* JADX INFO: renamed from: f */
    private String f208933f;

    /* JADX INFO: renamed from: g */
    private Socket f208934g;

    /* JADX INFO: renamed from: h */
    private int f208935h;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.util.netspeedutil.TcpPing$1 */
    public class CallableC225281 implements Callable<Long> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TcpPing f208936a;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            this.f208936a.m222881e(this.f208936a.m222880d());
            if (this.f208936a.f208931d != null) {
                TcpPing tcpPing = this.f208936a;
                tcpPing.m222882f(tcpPing.f208931d);
            }
            return Long.valueOf(this.f208936a.f208932e / 1000000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public String m222880d() throws IOException {
        this.f208930c = System.nanoTime();
        return InetAddress.getByName(this.f208929b).getHostAddress();
    }

    /* JADX INFO: renamed from: e */
    public void m222881e(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Socket socket = new Socket();
        this.f208934g = socket;
        this.f208933f = str;
        socket.connect(new InetSocketAddress(str, this.f208928a), this.f208935h);
    }

    /* JADX INFO: renamed from: f */
    public void m222882f(ByteBuffer byteBuffer) throws IOException {
        this.f208934g.getOutputStream().write(byteBuffer.get());
        this.f208934g.close();
        this.f208932e = System.nanoTime() - this.f208930c;
    }
}
