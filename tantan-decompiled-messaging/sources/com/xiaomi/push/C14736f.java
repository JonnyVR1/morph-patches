package com.xiaomi.push;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.xiaomi.push.service.XMPushService;
import p149l.gkq0;
import p149l.ilq0;
import p149l.osq0;
import p149l.rsq0;
import p149l.usq0;

/* JADX INFO: renamed from: com.xiaomi.push.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14736f implements rsq0 {

    /* JADX INFO: renamed from: a */
    XMPushService f61756a;

    /* JADX INFO: renamed from: b */
    osq0 f61757b;

    /* JADX INFO: renamed from: c */
    private int f61758c;

    /* JADX INFO: renamed from: d */
    private Exception f61759d;

    /* JADX INFO: renamed from: j */
    private long f61765j;

    /* JADX INFO: renamed from: k */
    private long f61766k;

    /* JADX INFO: renamed from: f */
    private long f61761f = 0;

    /* JADX INFO: renamed from: g */
    private long f61762g = 0;

    /* JADX INFO: renamed from: h */
    private long f61763h = 0;

    /* JADX INFO: renamed from: i */
    private long f61764i = 0;

    /* JADX INFO: renamed from: e */
    private String f61760e = "";

    public C14736f(XMPushService xMPushService) {
        this.f61765j = 0L;
        this.f61766k = 0L;
        this.f61756a = xMPushService;
        m85566c();
        int iMyUid = Process.myUid();
        try {
            this.f61766k = TrafficStats.getUidRxBytes(iMyUid);
            this.f61765j = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e) {
            ilq0.m137040m("Failed to obtain traffic data during initialization: " + e);
            this.f61766k = -1L;
            this.f61765j = -1L;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m85566c() {
        this.f61762g = 0L;
        this.f61764i = 0L;
        this.f61761f = 0L;
        this.f61763h = 0L;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (gkq0.m126691t(this.f61756a)) {
            this.f61761f = jElapsedRealtime;
        }
        if (this.f61756a.m86361c()) {
            this.f61763h = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m85567d() {
        ilq0.m137053z("stat connpt = " + this.f61760e + " netDuration = " + this.f61762g + " ChannelDuration = " + this.f61764i + " channelConnectedTime = " + this.f61763h);
        C14734ej c14734ej = new C14734ej();
        c14734ej.f61738a = (byte) 0;
        c14734ej.m85531a(EnumC14733ei.CHANNEL_ONLINE_RATE.m85528a());
        c14734ej.m85532a(this.f61760e);
        c14734ej.m85547d((int) (System.currentTimeMillis() / 1000));
        c14734ej.m85538b((int) (this.f61762g / 1000));
        c14734ej.m85543c((int) (this.f61764i / 1000));
        C14761h.m85875f().m85880i(c14734ej);
        m85566c();
    }

    @Override // p149l.rsq0
    /* JADX INFO: renamed from: a */
    public void mo85570a(osq0 osq0Var, int i, Exception exc) {
        long uidRxBytes;
        long uidTxBytes;
        if (this.f61758c == 0 && this.f61759d == null) {
            this.f61758c = i;
            this.f61759d = exc;
            C14780i.m86253k(osq0Var.mo165884c(), exc);
        }
        if (i == 22 && this.f61763h != 0) {
            long jM165883b = osq0Var.m165883b() - this.f61763h;
            if (jM165883b < 0) {
                jM165883b = 0;
            }
            this.f61764i += jM165883b + ((long) (usq0.m195232f() / 2));
            this.f61763h = 0L;
        }
        m85572b();
        int iMyUid = Process.myUid();
        try {
            uidRxBytes = TrafficStats.getUidRxBytes(iMyUid);
            uidTxBytes = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e) {
            ilq0.m137040m("Failed to obtain traffic data: " + e);
            uidRxBytes = -1;
            uidTxBytes = -1L;
        }
        ilq0.m137053z("Stats rx=" + (uidRxBytes - this.f61766k) + ", tx=" + (uidTxBytes - this.f61765j));
        this.f61766k = uidRxBytes;
        this.f61765j = uidTxBytes;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m85572b() {
        try {
            XMPushService xMPushService = this.f61756a;
            if (xMPushService == null) {
                return;
            }
            String strM126676e = gkq0.m126676e(xMPushService);
            boolean zM126693v = gkq0.m126693v(this.f61756a);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f61761f;
            if (j > 0) {
                this.f61762g += jElapsedRealtime - j;
                this.f61761f = 0L;
            }
            long j2 = this.f61763h;
            if (j2 != 0) {
                this.f61764i += jElapsedRealtime - j2;
                this.f61763h = 0L;
            }
            if (zM126693v) {
                if ((!TextUtils.equals(this.f61760e, strM126676e) && this.f61762g > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) || this.f61762g > 5400000) {
                    m85567d();
                }
                this.f61760e = strM126676e;
                if (this.f61761f == 0) {
                    this.f61761f = jElapsedRealtime;
                }
                if (this.f61756a.m86361c()) {
                    this.f61763h = jElapsedRealtime;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.rsq0
    /* JADX INFO: renamed from: b */
    public void mo85573b(osq0 osq0Var) {
        m85572b();
        this.f61763h = SystemClock.elapsedRealtime();
        C14780i.m86247e(0, EnumC14733ei.CONN_SUCCESS.m85528a(), osq0Var.mo165884c(), osq0Var.m165882a());
    }

    @Override // p149l.rsq0
    /* JADX INFO: renamed from: a */
    public void mo85569a(osq0 osq0Var) {
        this.f61758c = 0;
        this.f61759d = null;
        this.f61757b = osq0Var;
        this.f61760e = gkq0.m126676e(this.f61756a);
        C14780i.m86245c(0, EnumC14733ei.CONN_SUCCESS.m85528a());
    }

    /* JADX INFO: renamed from: a */
    public Exception m85568a() {
        return this.f61759d;
    }

    @Override // p149l.rsq0
    /* JADX INFO: renamed from: a */
    public void mo85571a(osq0 osq0Var, Exception exc) {
        C14780i.m86246d(0, EnumC14733ei.CHANNEL_CON_FAIL.m85528a(), 1, osq0Var.mo165884c(), gkq0.m126693v(this.f61756a) ? 1 : 0);
        m85572b();
    }
}
