package com.xiaomi.push.service;

import com.xiaomi.push.C14885fi;
import p153l.ouq0;
import p153l.w0r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.c */
/* JADX INFO: loaded from: classes2.dex */
class C15009c extends XMPushService.AbstractC14966j {

    /* JADX INFO: renamed from: a */
    private XMPushService f63879a;

    /* JADX INFO: renamed from: a */
    private w0r0[] f63880a;

    public C15009c(XMPushService xMPushService, w0r0[] w0r0VarArr) {
        super(4);
        this.f63879a = xMPushService;
        this.f63880a = w0r0VarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
    /* JADX INFO: renamed from: a */
    public void mo86634a() {
        try {
            w0r0[] w0r0VarArr = this.f63880a;
            if (w0r0VarArr != null) {
                this.f63879a.m87525a(w0r0VarArr);
            }
        } catch (C14885fi e) {
            ouq0.m169397q(e);
            this.f63879a.m87515a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
    /* JADX INFO: renamed from: a */
    public String mo86633a() {
        return "batch send message.";
    }
}
