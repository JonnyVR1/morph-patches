package com.xiaomi.push.service;

import com.xiaomi.push.C14909h;
import com.xiaomi.push.service.XMPushService.C14961e;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.as */
/* JADX INFO: loaded from: classes2.dex */
class C14996as {

    /* JADX INFO: renamed from: d */
    private static int f63821d = 300000;

    /* JADX INFO: renamed from: a */
    private XMPushService f63824a;

    /* JADX INFO: renamed from: b */
    private int f63825b = 0;

    /* JADX INFO: renamed from: c */
    private int f63826c = 0;

    /* JADX INFO: renamed from: a */
    private int f63822a = 500;

    /* JADX INFO: renamed from: a */
    private long f63823a = 0;

    public C14996as(XMPushService xMPushService) {
        this.f63824a = xMPushService;
    }

    /* JADX INFO: renamed from: a */
    public void m87729a(boolean z) {
        if (!this.f63824a.m87526a()) {
            ouq0.m169406z("should not reconnect as no client or network.");
            return;
        }
        XMPushService xMPushService = this.f63824a;
        if (z) {
            if (!xMPushService.m87527a(1)) {
                this.f63825b++;
            }
            this.f63824a.m87514a(1);
            ouq0.m169394n("ReconnectionManager", "-->tryReconnect(): exec ConnectJob");
            XMPushService xMPushService2 = this.f63824a;
            xMPushService2.getClass();
            xMPushService2.m87516a(xMPushService2.new C14961e());
            return;
        }
        if (xMPushService.m87527a(1)) {
            return;
        }
        int iM87727a = m87727a();
        this.f63825b++;
        ouq0.m169393m("schedule reconnect in " + iM87727a + "ms");
        XMPushService xMPushService3 = this.f63824a;
        xMPushService3.getClass();
        xMPushService3.m87517a(xMPushService3.new C14961e(), (long) iM87727a);
        if (this.f63825b == 2 && C14909h.m87046f().m87053k()) {
            C15033z.m88079b();
        }
        if (this.f63825b == 3) {
            C15033z.m88076a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87728a() {
        this.f63823a = System.currentTimeMillis();
        this.f63824a.m87514a(1);
        this.f63825b = 0;
    }

    /* JADX INFO: renamed from: a */
    private int m87727a() {
        double d;
        if (this.f63825b > 8) {
            return 300000;
        }
        double dRandom = (Math.random() * 2.0d) + 1.0d;
        int i = this.f63825b;
        if (i > 4) {
            d = 60000.0d;
        } else {
            if (i <= 1) {
                if (this.f63823a == 0) {
                    return 0;
                }
                if (System.currentTimeMillis() - this.f63823a < 310000) {
                    int i2 = this.f63822a;
                    int i3 = f63821d;
                    if (i2 >= i3) {
                        return i2;
                    }
                    int i4 = this.f63826c + 1;
                    this.f63826c = i4;
                    if (i4 >= 4) {
                        return i3;
                    }
                    this.f63822a = (int) (((double) i2) * 1.5d);
                    return i2;
                }
                this.f63822a = 1000;
                this.f63826c = 0;
                return 0;
            }
            d = 10000.0d;
        }
        return (int) (dRandom * d);
    }
}
