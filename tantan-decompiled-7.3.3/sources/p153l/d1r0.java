package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.C14885fi;
import com.xiaomi.push.C14928i;
import com.xiaomi.push.service.AbstractC15011e;
import com.xiaomi.push.service.C14990am;
import com.xiaomi.push.service.C14995ar;
import com.xiaomi.push.service.C15000aw;
import com.xiaomi.push.service.C15001ax;
import com.xiaomi.push.service.XMPushService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class d1r0 extends b2r0 {

    /* JADX INFO: renamed from: D */
    private Thread f84713D;

    /* JADX INFO: renamed from: E */
    private y0r0 f84714E;

    /* JADX INFO: renamed from: F */
    private z0r0 f84715F;

    /* JADX INFO: renamed from: G */
    private byte[] f84716G;

    /* JADX INFO: renamed from: l.d1r0$a */
    public class C16419a extends Thread {
        public C16419a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                d1r0.this.f84714E.m213903c();
            } catch (Exception e) {
                d1r0.this.m102233Q(9, e);
            }
        }
    }

    public d1r0(XMPushService xMPushService, v1r0 v1r0Var) {
        super(xMPushService, v1r0Var);
    }

    /* JADX INFO: renamed from: U */
    private w0r0 m113620U(boolean z) {
        c1r0 c1r0Var = new c1r0();
        if (z) {
            c1r0Var.m204327k("1");
        }
        byte[] bArrM87422i = C14928i.m87422i();
        if (bArrM87422i != null) {
            ozq0 ozq0Var = new ozq0();
            ozq0Var.m169993l(asq0.m99965b(bArrM87422i));
            c1r0Var.m204330n(ozq0Var.m118923h(), null);
        }
        return c1r0Var;
    }

    /* JADX INFO: renamed from: Z */
    private void m113622Z() throws C14885fi {
        try {
            this.f84714E = new y0r0(this.f74654u.getInputStream(), this);
            this.f84715F = new z0r0(this.f74654u.getOutputStream(), this);
            C16419a c16419a = new C16419a("Blob Reader (" + this.f177124m + ")");
            this.f84713D = c16419a;
            c16419a.start();
        } catch (Exception e) {
            throw new C14885fi("Error to init reader and writer", e);
        }
    }

    @Override // p153l.b2r0
    /* JADX INFO: renamed from: I */
    public synchronized void mo102227I() {
        m113622Z();
        this.f84715F.m218149b();
    }

    @Override // p153l.b2r0
    /* JADX INFO: renamed from: J */
    public synchronized void mo102228J(int i, Exception exc) {
        try {
            y0r0 y0r0Var = this.f84714E;
            if (y0r0Var != null) {
                y0r0Var.m213904e();
                this.f84714E = null;
            }
            z0r0 z0r0Var = this.f84715F;
            if (z0r0Var != null) {
                try {
                    z0r0Var.m218150c();
                } catch (Exception e) {
                    ouq0.m169378B("SlimConnection shutdown cause exception: " + e);
                }
                this.f84715F = null;
            }
            this.f84716G = null;
            super.mo102228J(i, exc);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.b2r0
    /* JADX INFO: renamed from: O */
    public void mo102231O(boolean z) throws C14885fi {
        if (this.f84715F == null) {
            throw new C14885fi("The BlobWriter is null.");
        }
        w0r0 w0r0VarM113620U = m113620U(z);
        ouq0.m169393m("[Slim] SND ping id=" + w0r0VarM113620U.m204317D());
        mo113631w(w0r0VarM113620U);
        m102235S();
    }

    /* JADX INFO: renamed from: W */
    public void m113623W(w0r0 w0r0Var) {
        if (w0r0Var == null) {
            return;
        }
        if (AbstractC15011e.m87808a(w0r0Var)) {
            w0r0 w0r0Var2 = new w0r0();
            w0r0Var2.m204324h(w0r0Var.m204320a());
            w0r0Var2.m204328l("SYNC", "ACK_RTT");
            w0r0Var2.m204327k(w0r0Var.m204317D());
            w0r0Var2.m204337u(w0r0Var.m204335s());
            w0r0Var2.m204325i(w0r0Var.m204340y());
            XMPushService xMPushService = this.f177126o;
            xMPushService.m87516a(new C15000aw(xMPushService, w0r0Var2));
        }
        if (w0r0Var.m204331o()) {
            ouq0.m169393m("[Slim] RCV blob chid=" + w0r0Var.m204320a() + "; id=" + w0r0Var.m204317D() + "; errCode=" + w0r0Var.m204334r() + "; err=" + w0r0Var.m204341z());
        }
        if (w0r0Var.m204320a() == 0) {
            if ("PING".equals(w0r0Var.m204322c())) {
                ouq0.m169393m("[Slim] RCV ping id=" + w0r0Var.m204317D());
                m102236T();
            } else if ("CLOSE".equals(w0r0Var.m204322c())) {
                m102233Q(13, null);
            }
        }
        Iterator<u1r0.C20459a> it = this.f177118g.values().iterator();
        while (it.hasNext()) {
            it.next().m194111a(w0r0Var);
        }
    }

    /* JADX INFO: renamed from: X */
    public synchronized byte[] m113624X() {
        try {
            if (this.f84716G == null && !TextUtils.isEmpty(this.f177121j)) {
                String strM87743a = C15001ax.m87743a();
                String str = this.f177121j;
                this.f84716G = C14995ar.m87724a(this.f177121j.getBytes(), str.substring(str.length() / 2).concat(strM87743a.substring(strM87743a.length() / 2)).getBytes());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f84716G;
    }

    /* JADX INFO: renamed from: Y */
    public void m113625Y(g2r0 g2r0Var) {
        if (g2r0Var == null) {
            return;
        }
        Iterator<u1r0.C20459a> it = this.f177118g.values().iterator();
        while (it.hasNext()) {
            it.next().m194112b(g2r0Var);
        }
    }

    @Override // p153l.u1r0
    /* JADX INFO: renamed from: i */
    public synchronized void mo113626i(C14990am.b bVar) {
        v0r0.m198911a(bVar, m102232P(), this);
    }

    @Override // p153l.u1r0
    /* JADX INFO: renamed from: k */
    public synchronized void mo113627k(String str, String str2) {
        v0r0.m198912b(str, str2, this);
    }

    @Override // p153l.u1r0
    @Deprecated
    /* JADX INFO: renamed from: o */
    public void mo113628o(g2r0 g2r0Var) throws C14885fi {
        mo113631w(w0r0.m204314f(g2r0Var, null));
    }

    @Override // p153l.u1r0
    /* JADX INFO: renamed from: p */
    public void mo113629p(w0r0[] w0r0VarArr) throws C14885fi {
        for (w0r0 w0r0Var : w0r0VarArr) {
            mo113631w(w0r0Var);
        }
    }

    @Override // p153l.u1r0
    /* JADX INFO: renamed from: q */
    public boolean mo113630q() {
        return true;
    }

    @Override // p153l.u1r0
    /* JADX INFO: renamed from: w */
    public void mo113631w(w0r0 w0r0Var) throws C14885fi {
        z0r0 z0r0Var = this.f84715F;
        if (z0r0Var == null) {
            throw new C14885fi("the writer is null.");
        }
        try {
            int iM218148a = z0r0Var.m218148a(w0r0Var);
            this.f177128q = SystemClock.elapsedRealtime();
            String strM204318E = w0r0Var.m204318E();
            if (!TextUtils.isEmpty(strM204318E)) {
                p2r0.m170392j(this.f177126o, strM204318E, iM218148a, false, true, System.currentTimeMillis());
            }
            Iterator<u1r0.C20459a> it = this.f177119h.values().iterator();
            while (it.hasNext()) {
                it.next().m194111a(w0r0Var);
            }
        } catch (Exception e) {
            throw new C14885fi(e);
        }
    }
}
