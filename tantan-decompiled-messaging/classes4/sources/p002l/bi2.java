package p002l;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import l.rhg0;
import l.whq0;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class bi2 implements InterfaceC0476a {

    /* JADX INFO: renamed from: a */
    public Socket f8148a;

    /* JADX INFO: renamed from: b */
    public BufferedSource f8149b;

    /* JADX INFO: renamed from: c */
    public BufferedSink f8150c;

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a
    /* JADX INFO: renamed from: a */
    public boolean mo9132a() {
        try {
            mo9137i();
            m10345e();
            mo9136h();
            return true;
        } catch (Exception e) {
            mo9135g(e);
            return false;
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a
    /* JADX INFO: renamed from: b */
    public void mo9133b(Buffer buffer) throws IOException {
        if (this.f8150c == null) {
            rhg0.a("can't get write sink");
        } else if (buffer == null || buffer.size() <= 0) {
            mo9139k("write packet failed, the writer or packet maybe is null");
        } else {
            this.f8150c.write(buffer, buffer.size());
            this.f8150c.flush();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a
    /* JADX INFO: renamed from: c */
    public void mo9144c() {
        try {
            Socket socket = this.f8148a;
            if (socket != null) {
                socket.close();
            }
        } catch (Exception e) {
            mo9139k("disConnect the connection failed" + e.getMessage());
        }
        mo9138j();
    }

    /* JADX INFO: renamed from: d */
    public abstract Socket mo9134d() throws Exception;

    /* JADX INFO: renamed from: e */
    public final void m10345e() throws Exception {
        Socket socketMo9134d = mo9134d();
        this.f8148a = socketMo9134d;
        if (socketMo9134d == null) {
            whq0.a("socket is null");
            return;
        }
        Objects.toString(socketMo9134d.getInetAddress());
        this.f8148a.getPort();
        m10346f();
    }

    /* JADX INFO: renamed from: f */
    public final void m10346f() throws IOException {
        this.f8149b = Okio.buffer(Okio.source(this.f8148a));
        this.f8150c = Okio.buffer(Okio.sink(this.f8148a));
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo9135g(Throwable th);

    /* JADX INFO: renamed from: h */
    public abstract void mo9136h();

    /* JADX INFO: renamed from: i */
    public abstract void mo9137i();

    /* JADX INFO: renamed from: j */
    public abstract void mo9138j();

    /* JADX INFO: renamed from: k */
    public abstract void mo9139k(String str);

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a
    public BufferedSource read() throws IOException {
        BufferedSource bufferedSource = this.f8149b;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        rhg0.a("can't get read source");
        return null;
    }
}
