package p153l;

import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ii2 implements InterfaceC13050a {

    /* JADX INFO: renamed from: a */
    public Socket f115047a;

    /* JADX INFO: renamed from: b */
    public BufferedSource f115048b;

    /* JADX INFO: renamed from: c */
    public BufferedSink f115049c;

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a
    /* JADX INFO: renamed from: a */
    public boolean mo76680a() {
        try {
            mo76685i();
            m140047e();
            mo76684h();
            return true;
        } catch (Exception e) {
            mo76683g(e);
            return false;
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a
    /* JADX INFO: renamed from: b */
    public void mo76681b(Buffer buffer) throws IOException {
        if (this.f115049c == null) {
            zpg0.m220844a("can't get write sink");
        } else if (buffer == null || buffer.size() <= 0) {
            mo76687k("write packet failed, the writer or packet maybe is null");
        } else {
            this.f115049c.write(buffer, buffer.size());
            this.f115049c.flush();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a
    /* JADX INFO: renamed from: c */
    public void mo76692c() {
        try {
            Socket socket = this.f115047a;
            if (socket != null) {
                socket.close();
            }
        } catch (Exception e) {
            mo76687k("disConnect the connection failed" + e.getMessage());
        }
        mo76686j();
    }

    /* JADX INFO: renamed from: d */
    public abstract Socket mo76682d() throws Exception;

    /* JADX INFO: renamed from: e */
    public final void m140047e() throws Exception {
        Socket socketMo76682d = mo76682d();
        this.f115047a = socketMo76682d;
        if (socketMo76682d == null) {
            brq0.m106161a("socket is null");
            return;
        }
        Objects.toString(socketMo76682d.getInetAddress());
        this.f115047a.getPort();
        m140048f();
    }

    /* JADX INFO: renamed from: f */
    public final void m140048f() throws IOException {
        this.f115048b = Okio.buffer(Okio.source(this.f115047a));
        this.f115049c = Okio.buffer(Okio.sink(this.f115047a));
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo76683g(Throwable th);

    /* JADX INFO: renamed from: h */
    public abstract void mo76684h();

    /* JADX INFO: renamed from: i */
    public abstract void mo76685i();

    /* JADX INFO: renamed from: j */
    public abstract void mo76686j();

    /* JADX INFO: renamed from: k */
    public abstract void mo76687k(String str);

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a
    public BufferedSource read() throws IOException {
        BufferedSource bufferedSource = this.f115048b;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        zpg0.m220844a("can't get read source");
        return null;
    }
}
