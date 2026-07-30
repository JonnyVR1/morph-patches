package p153l;

import com.tantanapp.httpdns.probe.IPProbeService$Status;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class gk90 extends r2i0 {

    /* JADX INFO: renamed from: a */
    public z1m f104711a;

    /* JADX INFO: renamed from: b */
    public y1m f104712b;

    /* JADX INFO: renamed from: c */
    public fk90 f104713c;

    /* JADX INFO: renamed from: d */
    public AtomicInteger f104714d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e */
    public AtomicInteger f104715e = new AtomicInteger(0);

    /* JADX INFO: renamed from: l.gk90$a */
    public class RunnableC17237a implements Runnable {
        public RunnableC17237a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gk90.this.m130571c();
        }
    }

    public gk90(fk90 fk90Var, z1m z1mVar, y1m y1mVar) {
        this.f104713c = fk90Var;
        this.f104711a = z1mVar;
        this.f104712b = y1mVar;
    }

    @Override // p153l.r2i0
    /* JADX INFO: renamed from: a */
    public String mo130570a() {
        return this.f104711a.f202570b;
    }

    /* JADX INFO: renamed from: c */
    public final void m130571c() {
        if (m130572d(this.f104711a.f202570b)) {
            this.f104714d.getAndIncrement();
            this.f104715e.set(0);
        } else {
            this.f104715e.getAndIncrement();
            r6e.m180005a("探测结果失败" + this.f104715e.get() + "次 !!!");
            this.f104714d.set(0);
        }
        int i = this.f104714d.get();
        z1m z1mVar = this.f104711a;
        if (i == z1mVar.f202571c) {
            z1mVar.f202576h = true;
            this.f104714d.set(0);
            y1m y1mVar = this.f104712b;
            if (y1mVar != null) {
                y1mVar.mo194675a(this.f104711a);
            }
        }
        int i2 = this.f104715e.get();
        z1m z1mVar2 = this.f104711a;
        if (i2 == z1mVar2.f202572d) {
            z1mVar2.f202576h = false;
            this.f104715e.set(0);
            if (this.f104712b != null) {
                r6e.m180005a("探测结果失败10次，去更新:" + this.f104711a.f202570b + "!!!");
                this.f104712b.mo194675a(this.f104711a);
            }
        }
        if (vml.m201753c().m201756b() || this.f104713c.m125981b(this.f104711a.f202569a) != IPProbeService$Status.PROBING) {
            return;
        }
        hoi0.m136434a().m136436c(this, this.f104711a.f202573e * 1000);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m130572d(String str) throws Throwable {
        Socket socket = null;
        boolean z = false;
        try {
            try {
                try {
                    Socket socket2 = new Socket();
                    try {
                        socket2.connect(new InetSocketAddress(str, this.f104711a.f202574f), this.f104711a.f202575g);
                        z = true;
                        r6e.m180005a("探测结果:" + str + " succuess!!!");
                        socket2.close();
                    } catch (IOException unused) {
                        socket = socket2;
                        r6e.m180005a("探测结果:" + str + " faild!!!");
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
        w21.m204498a(new RunnableC17237a());
    }
}
