package tv.danmaku.ijk.media.util.netspeedutil;

import android.text.TextUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TcpPing implements SpeedTask {

    /* JADX INFO: renamed from: a */
    private int f12553a;

    /* JADX INFO: renamed from: b */
    private String f12554b;

    /* JADX INFO: renamed from: c */
    private long f12555c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f12556d;

    /* JADX INFO: renamed from: e */
    private long f12557e;

    /* JADX INFO: renamed from: f */
    private String f12558f;

    /* JADX INFO: renamed from: g */
    private Socket f12559g;

    /* JADX INFO: renamed from: h */
    private int f12560h;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.util.netspeedutil.TcpPing$1 */
    public class CallableC13211 implements Callable<Long> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TcpPing f12561a;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            this.f12561a.m11352e(this.f12561a.m11351d());
            if (this.f12561a.f12556d != null) {
                TcpPing tcpPing = this.f12561a;
                tcpPing.m11353f(tcpPing.f12556d);
            }
            return Long.valueOf(this.f12561a.f12557e / 1000000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public String m11351d() throws IOException {
        this.f12555c = System.nanoTime();
        return InetAddress.getByName(this.f12554b).getHostAddress();
    }

    /* JADX INFO: renamed from: e */
    public void m11352e(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Socket socket = new Socket();
        this.f12559g = socket;
        this.f12558f = str;
        socket.connect(new InetSocketAddress(str, this.f12553a), this.f12560h);
    }

    /* JADX INFO: renamed from: f */
    public void m11353f(ByteBuffer byteBuffer) throws IOException {
        this.f12559g.getOutputStream().write(byteBuffer.get());
        this.f12559g.close();
        this.f12557e = System.nanoTime() - this.f12555c;
    }
}
