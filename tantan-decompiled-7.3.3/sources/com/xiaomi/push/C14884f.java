package com.xiaomi.push;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.xiaomi.push.service.XMPushService;
import p153l.a2r0;
import p153l.mtq0;
import p153l.ouq0;
import p153l.u1r0;
import p153l.x1r0;

/* JADX INFO: renamed from: com.xiaomi.push.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14884f implements x1r0 {

    /* JADX INFO: renamed from: a */
    XMPushService f62603a;

    /* JADX INFO: renamed from: b */
    u1r0 f62604b;

    /* JADX INFO: renamed from: c */
    private int f62605c;

    /* JADX INFO: renamed from: d */
    private Exception f62606d;

    /* JADX INFO: renamed from: j */
    private long f62612j;

    /* JADX INFO: renamed from: k */
    private long f62613k;

    /* JADX INFO: renamed from: f */
    private long f62608f = 0;

    /* JADX INFO: renamed from: g */
    private long f62609g = 0;

    /* JADX INFO: renamed from: h */
    private long f62610h = 0;

    /* JADX INFO: renamed from: i */
    private long f62611i = 0;

    /* JADX INFO: renamed from: e */
    private String f62607e = "";

    public C14884f(XMPushService xMPushService) {
        this.f62612j = 0L;
        this.f62613k = 0L;
        this.f62603a = xMPushService;
        m86737c();
        int iMyUid = Process.myUid();
        try {
            this.f62613k = TrafficStats.getUidRxBytes(iMyUid);
            this.f62612j = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e) {
            ouq0.m169393m("Failed to obtain traffic data during initialization: " + e);
            this.f62613k = -1L;
            this.f62612j = -1L;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m86737c() {
        this.f62609g = 0L;
        this.f62611i = 0L;
        this.f62608f = 0L;
        this.f62610h = 0L;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mtq0.m160044t(this.f62603a)) {
            this.f62608f = jElapsedRealtime;
        }
        if (this.f62603a.m87532c()) {
            this.f62610h = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m86738d() {
        ouq0.m169406z("stat connpt = " + this.f62607e + " netDuration = " + this.f62609g + " ChannelDuration = " + this.f62611i + " channelConnectedTime = " + this.f62610h);
        C14882ej c14882ej = new C14882ej();
        c14882ej.f62585a = (byte) 0;
        c14882ej.m86702a(EnumC14881ei.CHANNEL_ONLINE_RATE.m86699a());
        c14882ej.m86703a(this.f62607e);
        c14882ej.m86718d((int) (System.currentTimeMillis() / 1000));
        c14882ej.m86709b((int) (this.f62609g / 1000));
        c14882ej.m86714c((int) (this.f62611i / 1000));
        C14909h.m87046f().m87051i(c14882ej);
        m86737c();
    }

    @Override // p153l.x1r0
    /* JADX INFO: renamed from: a */
    public void mo86741a(u1r0 u1r0Var, int i, Exception exc) {
        long uidRxBytes;
        long uidTxBytes;
        if (this.f62605c == 0 && this.f62606d == null) {
            this.f62605c = i;
            this.f62606d = exc;
            C14928i.m87424k(u1r0Var.mo102237c(), exc);
        }
        if (i == 22 && this.f62610h != 0) {
            long jM194096b = u1r0Var.m194096b() - this.f62610h;
            if (jM194096b < 0) {
                jM194096b = 0;
            }
            this.f62611i += jM194096b + ((long) (a2r0.m95731f() / 2));
            this.f62610h = 0L;
        }
        m86743b();
        int iMyUid = Process.myUid();
        try {
            uidRxBytes = TrafficStats.getUidRxBytes(iMyUid);
            uidTxBytes = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e) {
            ouq0.m169393m("Failed to obtain traffic data: " + e);
            uidRxBytes = -1;
            uidTxBytes = -1L;
        }
        ouq0.m169406z("Stats rx=" + (uidRxBytes - this.f62613k) + ", tx=" + (uidTxBytes - this.f62612j));
        this.f62613k = uidRxBytes;
        this.f62612j = uidTxBytes;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m86743b() {
        try {
            XMPushService xMPushService = this.f62603a;
            if (xMPushService == null) {
                return;
            }
            String strM160029e = mtq0.m160029e(xMPushService);
            boolean zM160046v = mtq0.m160046v(this.f62603a);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f62608f;
            if (j > 0) {
                this.f62609g += jElapsedRealtime - j;
                this.f62608f = 0L;
            }
            long j2 = this.f62610h;
            if (j2 != 0) {
                this.f62611i += jElapsedRealtime - j2;
                this.f62610h = 0L;
            }
            if (zM160046v) {
                if ((!TextUtils.equals(this.f62607e, strM160029e) && this.f62609g > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) || this.f62609g > 5400000) {
                    m86738d();
                }
                this.f62607e = strM160029e;
                if (this.f62608f == 0) {
                    this.f62608f = jElapsedRealtime;
                }
                if (this.f62603a.m87532c()) {
                    this.f62610h = jElapsedRealtime;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.x1r0
    /* JADX INFO: renamed from: b */
    public void mo86744b(u1r0 u1r0Var) {
        m86743b();
        this.f62610h = SystemClock.elapsedRealtime();
        C14928i.m87418e(0, EnumC14881ei.CONN_SUCCESS.m86699a(), u1r0Var.mo102237c(), u1r0Var.m194095a());
    }

    @Override // p153l.x1r0
    /* JADX INFO: renamed from: a */
    public void mo86740a(u1r0 u1r0Var) {
        this.f62605c = 0;
        this.f62606d = null;
        this.f62604b = u1r0Var;
        this.f62607e = mtq0.m160029e(this.f62603a);
        C14928i.m87416c(0, EnumC14881ei.CONN_SUCCESS.m86699a());
    }

    /* JADX INFO: renamed from: a */
    public Exception m86739a() {
        return this.f62606d;
    }

    @Override // p153l.x1r0
    /* JADX INFO: renamed from: a */
    public void mo86742a(u1r0 u1r0Var, Exception exc) {
        C14928i.m87417d(0, EnumC14881ei.CHANNEL_CON_FAIL.m86699a(), 1, u1r0Var.mo102237c(), mtq0.m160046v(this.f62603a) ? 1 : 0);
        m86743b();
    }
}
