package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.C14737fi;
import com.xiaomi.push.C14780i;
import com.xiaomi.push.service.AbstractC14863e;
import com.xiaomi.push.service.C14842am;
import com.xiaomi.push.service.C14847ar;
import com.xiaomi.push.service.C14852aw;
import com.xiaomi.push.service.C14853ax;
import com.xiaomi.push.service.XMPushService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class xrq0 extends vsq0 {

    /* JADX INFO: renamed from: D */
    private Thread f194163D;

    /* JADX INFO: renamed from: E */
    private srq0 f194164E;

    /* JADX INFO: renamed from: F */
    private trq0 f194165F;

    /* JADX INFO: renamed from: G */
    private byte[] f194166G;

    /* JADX INFO: renamed from: l.xrq0$a */
    public class C21204a extends Thread {
        public C21204a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                xrq0.this.f194164E.m185702c();
            } catch (Exception e) {
                xrq0.this.m199903Q(9, e);
            }
        }
    }

    public xrq0(XMPushService xMPushService, psq0 psq0Var) {
        super(xMPushService, psq0Var);
    }

    /* JADX INFO: renamed from: U */
    private qrq0 m210705U(boolean z) {
        wrq0 wrq0Var = new wrq0();
        if (z) {
            wrq0Var.m176091k("1");
        }
        byte[] bArrM86251i = C14780i.m86251i();
        if (bArrM86251i != null) {
            iqq0 iqq0Var = new iqq0();
            iqq0Var.m137787l(viq0.m198603b(bArrM86251i));
            wrq0Var.m176094n(iqq0Var.m215761h(), null);
        }
        return wrq0Var;
    }

    /* JADX INFO: renamed from: Z */
    private void m210707Z() throws C14737fi {
        try {
            this.f194164E = new srq0(this.f182868u.getInputStream(), this);
            this.f194165F = new trq0(this.f182868u.getOutputStream(), this);
            C21204a c21204a = new C21204a("Blob Reader (" + this.f145499m + ")");
            this.f194163D = c21204a;
            c21204a.start();
        } catch (Exception e) {
            throw new C14737fi("Error to init reader and writer", e);
        }
    }

    @Override // p149l.vsq0
    /* JADX INFO: renamed from: I */
    public synchronized void mo199897I() {
        m210707Z();
        this.f194165F.m190426b();
    }

    @Override // p149l.vsq0
    /* JADX INFO: renamed from: J */
    public synchronized void mo199898J(int i, Exception exc) {
        try {
            srq0 srq0Var = this.f194164E;
            if (srq0Var != null) {
                srq0Var.m185703e();
                this.f194164E = null;
            }
            trq0 trq0Var = this.f194165F;
            if (trq0Var != null) {
                try {
                    trq0Var.m190427c();
                } catch (Exception e) {
                    ilq0.m137025B("SlimConnection shutdown cause exception: " + e);
                }
                this.f194165F = null;
            }
            this.f194166G = null;
            super.mo199898J(i, exc);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.vsq0
    /* JADX INFO: renamed from: O */
    public void mo199901O(boolean z) throws C14737fi {
        if (this.f194165F == null) {
            throw new C14737fi("The BlobWriter is null.");
        }
        qrq0 qrq0VarM210705U = m210705U(z);
        ilq0.m137040m("[Slim] SND ping id=" + qrq0VarM210705U.m176080D());
        mo165902w(qrq0VarM210705U);
        m199905S();
    }

    /* JADX INFO: renamed from: W */
    public void m210708W(qrq0 qrq0Var) {
        if (qrq0Var == null) {
            return;
        }
        if (AbstractC14863e.m86637a(qrq0Var)) {
            qrq0 qrq0Var2 = new qrq0();
            qrq0Var2.m176088h(qrq0Var.m176083a());
            qrq0Var2.m176092l("SYNC", "ACK_RTT");
            qrq0Var2.m176091k(qrq0Var.m176080D());
            qrq0Var2.m176101u(qrq0Var.m176099s());
            qrq0Var2.m176089i(qrq0Var.m176105y());
            XMPushService xMPushService = this.f145501o;
            xMPushService.m86345a(new C14852aw(xMPushService, qrq0Var2));
        }
        if (qrq0Var.m176095o()) {
            ilq0.m137040m("[Slim] RCV blob chid=" + qrq0Var.m176083a() + "; id=" + qrq0Var.m176080D() + "; errCode=" + qrq0Var.m176098r() + "; err=" + qrq0Var.m176106z());
        }
        if (qrq0Var.m176083a() == 0) {
            if ("PING".equals(qrq0Var.m176085c())) {
                ilq0.m137040m("[Slim] RCV ping id=" + qrq0Var.m176080D());
                m199906T();
            } else if ("CLOSE".equals(qrq0Var.m176085c())) {
                m199903Q(13, null);
            }
        }
        Iterator<osq0.C19027a> it = this.f145493g.values().iterator();
        while (it.hasNext()) {
            it.next().m165906a(qrq0Var);
        }
    }

    /* JADX INFO: renamed from: X */
    public synchronized byte[] m210709X() {
        try {
            if (this.f194166G == null && !TextUtils.isEmpty(this.f145496j)) {
                String strM86572a = C14853ax.m86572a();
                String str = this.f145496j;
                this.f194166G = C14847ar.m86553a(this.f145496j.getBytes(), str.substring(str.length() / 2).concat(strM86572a.substring(strM86572a.length() / 2)).getBytes());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f194166G;
    }

    /* JADX INFO: renamed from: Y */
    public void m210710Y(atq0 atq0Var) {
        if (atq0Var == null) {
            return;
        }
        Iterator<osq0.C19027a> it = this.f145493g.values().iterator();
        while (it.hasNext()) {
            it.next().m165907b(atq0Var);
        }
    }

    @Override // p149l.osq0
    /* JADX INFO: renamed from: i */
    public synchronized void mo165888i(C14842am.b bVar) {
        prq0.m171058a(bVar, m199902P(), this);
    }

    @Override // p149l.osq0
    /* JADX INFO: renamed from: k */
    public synchronized void mo165890k(String str, String str2) {
        prq0.m171059b(str, str2, this);
    }

    @Override // p149l.osq0
    @Deprecated
    /* JADX INFO: renamed from: o */
    public void mo165894o(atq0 atq0Var) throws C14737fi {
        mo165902w(qrq0.m176077f(atq0Var, null));
    }

    @Override // p149l.osq0
    /* JADX INFO: renamed from: p */
    public void mo165895p(qrq0[] qrq0VarArr) throws C14737fi {
        for (qrq0 qrq0Var : qrq0VarArr) {
            mo165902w(qrq0Var);
        }
    }

    @Override // p149l.osq0
    /* JADX INFO: renamed from: q */
    public boolean mo165896q() {
        return true;
    }

    @Override // p149l.osq0
    /* JADX INFO: renamed from: w */
    public void mo165902w(qrq0 qrq0Var) throws C14737fi {
        trq0 trq0Var = this.f194165F;
        if (trq0Var == null) {
            throw new C14737fi("the writer is null.");
        }
        try {
            int iM190425a = trq0Var.m190425a(qrq0Var);
            this.f145503q = SystemClock.elapsedRealtime();
            String strM176081E = qrq0Var.m176081E();
            if (!TextUtils.isEmpty(strM176081E)) {
                jtq0.m143168j(this.f145501o, strM176081E, iM190425a, false, true, System.currentTimeMillis());
            }
            Iterator<osq0.C19027a> it = this.f145494h.values().iterator();
            while (it.hasNext()) {
                it.next().m165906a(qrq0Var);
            }
        } catch (Exception e) {
            throw new C14737fi(e);
        }
    }
}
