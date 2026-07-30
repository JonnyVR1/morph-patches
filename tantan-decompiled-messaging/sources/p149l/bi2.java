package p149l;

import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bi2 implements InterfaceC12887a {

    /* JADX INFO: renamed from: a */
    public Socket f75690a;

    /* JADX INFO: renamed from: b */
    public BufferedSource f75691b;

    /* JADX INFO: renamed from: c */
    public BufferedSink f75692c;

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a
    /* JADX INFO: renamed from: a */
    public boolean mo75497a() {
        try {
            mo75502i();
            m101968e();
            mo75501h();
            return true;
        } catch (Exception e) {
            mo75500g(e);
            return false;
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a
    /* JADX INFO: renamed from: b */
    public void mo75498b(Buffer buffer) throws IOException {
        if (this.f75692c == null) {
            rhg0.m179353a("can't get write sink");
        } else if (buffer == null || buffer.size() <= 0) {
            mo75504k("write packet failed, the writer or packet maybe is null");
        } else {
            this.f75692c.write(buffer, buffer.size());
            this.f75692c.flush();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a
    /* JADX INFO: renamed from: c */
    public void mo75509c() {
        try {
            Socket socket = this.f75690a;
            if (socket != null) {
                socket.close();
            }
        } catch (Exception e) {
            mo75504k("disConnect the connection failed" + e.getMessage());
        }
        mo75503j();
    }

    /* JADX INFO: renamed from: d */
    public abstract Socket mo75499d() throws Exception;

    /* JADX INFO: renamed from: e */
    public final void m101968e() throws Exception {
        Socket socketMo75499d = mo75499d();
        this.f75690a = socketMo75499d;
        if (socketMo75499d == null) {
            whq0.m203241a("socket is null");
            return;
        }
        Objects.toString(socketMo75499d.getInetAddress());
        this.f75690a.getPort();
        m101969f();
    }

    /* JADX INFO: renamed from: f */
    public final void m101969f() throws IOException {
        this.f75691b = Okio.buffer(Okio.source(this.f75690a));
        this.f75692c = Okio.buffer(Okio.sink(this.f75690a));
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo75500g(Throwable th);

    /* JADX INFO: renamed from: h */
    public abstract void mo75501h();

    /* JADX INFO: renamed from: i */
    public abstract void mo75502i();

    /* JADX INFO: renamed from: j */
    public abstract void mo75503j();

    /* JADX INFO: renamed from: k */
    public abstract void mo75504k(String str);

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a
    public BufferedSource read() throws IOException {
        BufferedSource bufferedSource = this.f75691b;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        rhg0.m179353a("can't get read source");
        return null;
    }
}
