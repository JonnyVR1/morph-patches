package com.xiaomi.push.service;

import com.xiaomi.push.C14761h;
import com.xiaomi.push.service.XMPushService.C14813e;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.as */
/* JADX INFO: loaded from: classes2.dex */
class C14848as {

    /* JADX INFO: renamed from: d */
    private static int f62974d = 300000;

    /* JADX INFO: renamed from: a */
    private XMPushService f62977a;

    /* JADX INFO: renamed from: b */
    private int f62978b = 0;

    /* JADX INFO: renamed from: c */
    private int f62979c = 0;

    /* JADX INFO: renamed from: a */
    private int f62975a = 500;

    /* JADX INFO: renamed from: a */
    private long f62976a = 0;

    public C14848as(XMPushService xMPushService) {
        this.f62977a = xMPushService;
    }

    /* JADX INFO: renamed from: a */
    public void m86558a(boolean z) {
        if (!this.f62977a.m86355a()) {
            ilq0.m137053z("should not reconnect as no client or network.");
            return;
        }
        XMPushService xMPushService = this.f62977a;
        if (z) {
            if (!xMPushService.m86356a(1)) {
                this.f62978b++;
            }
            this.f62977a.m86343a(1);
            ilq0.m137041n("ReconnectionManager", "-->tryReconnect(): exec ConnectJob");
            XMPushService xMPushService2 = this.f62977a;
            xMPushService2.getClass();
            xMPushService2.m86345a(xMPushService2.new C14813e());
            return;
        }
        if (xMPushService.m86356a(1)) {
            return;
        }
        int iM86556a = m86556a();
        this.f62978b++;
        ilq0.m137040m("schedule reconnect in " + iM86556a + "ms");
        XMPushService xMPushService3 = this.f62977a;
        xMPushService3.getClass();
        xMPushService3.m86346a(xMPushService3.new C14813e(), (long) iM86556a);
        if (this.f62978b == 2 && C14761h.m85875f().m85882k()) {
            C14885z.m86908b();
        }
        if (this.f62978b == 3) {
            C14885z.m86905a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86557a() {
        this.f62976a = System.currentTimeMillis();
        this.f62977a.m86343a(1);
        this.f62978b = 0;
    }

    /* JADX INFO: renamed from: a */
    private int m86556a() {
        double d;
        if (this.f62978b > 8) {
            return 300000;
        }
        double dRandom = (Math.random() * 2.0d) + 1.0d;
        int i = this.f62978b;
        if (i > 4) {
            d = 60000.0d;
        } else {
            if (i <= 1) {
                if (this.f62976a == 0) {
                    return 0;
                }
                if (System.currentTimeMillis() - this.f62976a < 310000) {
                    int i2 = this.f62975a;
                    int i3 = f62974d;
                    if (i2 >= i3) {
                        return i2;
                    }
                    int i4 = this.f62979c + 1;
                    this.f62979c = i4;
                    if (i4 >= 4) {
                        return i3;
                    }
                    this.f62975a = (int) (((double) i2) * 1.5d);
                    return i2;
                }
                this.f62975a = 1000;
                this.f62979c = 0;
                return 0;
            }
            d = 10000.0d;
        }
        return (int) (dRandom * d);
    }
}
