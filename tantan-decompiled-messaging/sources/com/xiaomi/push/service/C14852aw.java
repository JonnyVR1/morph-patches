package com.xiaomi.push.service;

import com.xiaomi.push.C14737fi;
import p149l.ilq0;
import p149l.qrq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.aw */
/* JADX INFO: loaded from: classes2.dex */
public class C14852aw extends XMPushService.AbstractC14818j {

    /* JADX INFO: renamed from: a */
    private XMPushService f62988a;

    /* JADX INFO: renamed from: a */
    private qrq0 f62989a;

    public C14852aw(XMPushService xMPushService, qrq0 qrq0Var) {
        super(4);
        this.f62988a = xMPushService;
        this.f62989a = qrq0Var;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
    /* JADX INFO: renamed from: a */
    public void mo85463a() {
        try {
            qrq0 qrq0Var = this.f62989a;
            if (qrq0Var != null) {
                if (AbstractC14863e.m86637a(qrq0Var)) {
                    this.f62989a.m176078A(System.currentTimeMillis() - this.f62989a.m176084b());
                }
                this.f62988a.m86351a(this.f62989a);
            }
        } catch (C14737fi e) {
            ilq0.m137044q(e);
            this.f62988a.m86344a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
    /* JADX INFO: renamed from: a */
    public String mo85462a() {
        return "send a message.";
    }
}
