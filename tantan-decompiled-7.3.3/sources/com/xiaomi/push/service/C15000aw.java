package com.xiaomi.push.service;

import com.xiaomi.push.C14885fi;
import p153l.ouq0;
import p153l.w0r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.aw */
/* JADX INFO: loaded from: classes2.dex */
public class C15000aw extends XMPushService.AbstractC14966j {

    /* JADX INFO: renamed from: a */
    private XMPushService f63835a;

    /* JADX INFO: renamed from: a */
    private w0r0 f63836a;

    public C15000aw(XMPushService xMPushService, w0r0 w0r0Var) {
        super(4);
        this.f63835a = xMPushService;
        this.f63836a = w0r0Var;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
    /* JADX INFO: renamed from: a */
    public void mo86634a() {
        try {
            w0r0 w0r0Var = this.f63836a;
            if (w0r0Var != null) {
                if (AbstractC15011e.m87808a(w0r0Var)) {
                    this.f63836a.m204315A(System.currentTimeMillis() - this.f63836a.m204321b());
                }
                this.f63835a.m87522a(this.f63836a);
            }
        } catch (C14885fi e) {
            ouq0.m169397q(e);
            this.f63835a.m87515a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
    /* JADX INFO: renamed from: a */
    public String mo86633a() {
        return "send a message.";
    }
}
