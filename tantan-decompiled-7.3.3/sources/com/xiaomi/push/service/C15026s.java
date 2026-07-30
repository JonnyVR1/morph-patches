package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.C14885fi;
import com.xiaomi.push.service.XMPushService.C14958b;
import java.util.Collection;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.s */
/* JADX INFO: loaded from: classes2.dex */
public class C15026s extends XMPushService.AbstractC14966j {

    /* JADX INFO: renamed from: a */
    private XMPushService f63955a;

    /* JADX INFO: renamed from: a */
    private String f63956a;

    /* JADX INFO: renamed from: a */
    private byte[] f63957a;

    /* JADX INFO: renamed from: b */
    private String f63958b;

    /* JADX INFO: renamed from: c */
    private String f63959c;

    public C15026s(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f63955a = xMPushService;
        this.f63956a = str;
        this.f63957a = bArr;
        this.f63958b = str2;
        this.f63959c = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
    /* JADX INFO: renamed from: a */
    public void mo86634a() {
        C14990am.b next;
        C15022p c15022pM87936a = C15023q.m87936a((Context) this.f63955a);
        if (c15022pM87936a == null) {
            try {
                c15022pM87936a = C15023q.m87937a(this.f63955a, this.f63956a, this.f63958b, this.f63959c);
            } catch (Exception e) {
                ouq0.m169378B("fail to register push account. " + e);
            }
        }
        if (c15022pM87936a == null) {
            ouq0.m169378B("no account for registration.");
            C15027t.m87959a(this.f63955a, 70000002, "no account.");
            return;
        }
        ouq0.m169393m("do registration now.");
        Collection<C14990am.b> collectionM87681a = C14990am.m87676a().m87681a("5");
        if (collectionM87681a.isEmpty()) {
            next = c15022pM87936a.m87933a(this.f63955a);
            C15030w.m88014a(this.f63955a, next);
            C14990am.m87676a().m87687a(next);
        } else {
            next = collectionM87681a.iterator().next();
        }
        if (!this.f63955a.m87532c()) {
            C15027t.m87963a(this.f63956a, this.f63957a);
            this.f63955a.m87523a(true);
            return;
        }
        try {
            C14990am.c cVar = next.f63735a;
            if (cVar == C14990am.c.binded) {
                C15030w.m88016a(this.f63955a, this.f63956a, this.f63957a);
            } else if (cVar == C14990am.c.unbind) {
                C15027t.m87963a(this.f63956a, this.f63957a);
                XMPushService xMPushService = this.f63955a;
                xMPushService.getClass();
                xMPushService.m87516a(xMPushService.new C14958b(next));
            }
        } catch (C14885fi e2) {
            ouq0.m169378B("meet error, disconnect connection. " + e2);
            this.f63955a.m87515a(10, e2);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
    /* JADX INFO: renamed from: a */
    public String mo86633a() {
        return "register app";
    }
}
