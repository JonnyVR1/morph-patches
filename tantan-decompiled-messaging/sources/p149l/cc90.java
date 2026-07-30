package p149l;

import com.tantanapp.httpdns.probe.IPProbeService$Status;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class cc90 extends juh0 {

    /* JADX INFO: renamed from: a */
    public ezl f80215a;

    /* JADX INFO: renamed from: b */
    public dzl f80216b;

    /* JADX INFO: renamed from: c */
    public bc90 f80217c;

    /* JADX INFO: renamed from: d */
    public AtomicInteger f80218d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e */
    public AtomicInteger f80219e = new AtomicInteger(0);

    /* JADX INFO: renamed from: l.cc90$a */
    public class RunnableC16106a implements Runnable {
        public RunnableC16106a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            cc90.this.m106042c();
        }
    }

    public cc90(bc90 bc90Var, ezl ezlVar, dzl dzlVar) {
        this.f80217c = bc90Var;
        this.f80215a = ezlVar;
        this.f80216b = dzlVar;
    }

    @Override // p149l.juh0
    /* JADX INFO: renamed from: a */
    public String mo106041a() {
        return this.f80215a.f93905b;
    }

    /* JADX INFO: renamed from: c */
    public final void m106042c() {
        if (m106043d(this.f80215a.f93905b)) {
            this.f80218d.getAndIncrement();
            this.f80219e.set(0);
        } else {
            this.f80219e.getAndIncrement();
            d5e.m110050a("探测结果失败" + this.f80219e.get() + "次 !!!");
            this.f80218d.set(0);
        }
        int i = this.f80218d.get();
        ezl ezlVar = this.f80215a;
        if (i == ezlVar.f93906c) {
            ezlVar.f93911h = true;
            this.f80218d.set(0);
            dzl dzlVar = this.f80216b;
            if (dzlVar != null) {
                dzlVar.mo114129a(this.f80215a);
            }
        }
        int i2 = this.f80219e.get();
        ezl ezlVar2 = this.f80215a;
        if (i2 == ezlVar2.f93907d) {
            ezlVar2.f93911h = false;
            this.f80219e.set(0);
            if (this.f80216b != null) {
                d5e.m110050a("探测结果失败10次，去更新:" + this.f80215a.f93905b + "!!!");
                this.f80216b.mo114129a(this.f80215a);
            }
        }
        if (hkl.m131567c().m131570b() || this.f80217c.m101049b(this.f80215a.f93904a) != IPProbeService$Status.PROBING) {
            return;
        }
        hfi0.m130761a().m130763c(this, this.f80215a.f93908e * 1000);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m106043d(String str) throws Throwable {
        Socket socket = null;
        boolean z = false;
        try {
            try {
                try {
                    Socket socket2 = new Socket();
                    try {
                        socket2.connect(new InetSocketAddress(str, this.f80215a.f93909f), this.f80215a.f93910g);
                        z = true;
                        d5e.m110050a("探测结果:" + str + " succuess!!!");
                        socket2.close();
                    } catch (IOException unused) {
                        socket = socket2;
                        d5e.m110050a("探测结果:" + str + " faild!!!");
                        if (socket != null) {
                            socket.close();
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        socket = socket2;
                        if (socket != null) {
                            try {
                                socket.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused4) {
        }
        return z;
    }

    @Override // java.lang.Runnable
    public void run() {
        p21.m167123a(new RunnableC16106a());
    }
}
