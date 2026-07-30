package com.xiaomi.push.service;

import com.xiaomi.push.C14737fi;
import p149l.ilq0;
import p149l.qrq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.c */
/* JADX INFO: loaded from: classes2.dex */
class C14861c extends XMPushService.AbstractC14818j {

    /* JADX INFO: renamed from: a */
    private XMPushService f63032a;

    /* JADX INFO: renamed from: a */
    private qrq0[] f63033a;

    public C14861c(XMPushService xMPushService, qrq0[] qrq0VarArr) {
        super(4);
        this.f63032a = xMPushService;
        this.f63033a = qrq0VarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
    /* JADX INFO: renamed from: a */
    public void mo85463a() {
        try {
            qrq0[] qrq0VarArr = this.f63033a;
            if (qrq0VarArr != null) {
                this.f63032a.m86354a(qrq0VarArr);
            }
        } catch (C14737fi e) {
            ilq0.m137044q(e);
            this.f63032a.m86344a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
    /* JADX INFO: renamed from: a */
    public String mo85462a() {
        return "batch send message.";
    }
}
