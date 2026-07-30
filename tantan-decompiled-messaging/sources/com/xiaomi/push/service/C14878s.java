package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.C14737fi;
import com.xiaomi.push.service.XMPushService.C14810b;
import java.util.Collection;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.s */
/* JADX INFO: loaded from: classes2.dex */
public class C14878s extends XMPushService.AbstractC14818j {

    /* JADX INFO: renamed from: a */
    private XMPushService f63108a;

    /* JADX INFO: renamed from: a */
    private String f63109a;

    /* JADX INFO: renamed from: a */
    private byte[] f63110a;

    /* JADX INFO: renamed from: b */
    private String f63111b;

    /* JADX INFO: renamed from: c */
    private String f63112c;

    public C14878s(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f63108a = xMPushService;
        this.f63109a = str;
        this.f63110a = bArr;
        this.f63111b = str2;
        this.f63112c = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
    /* JADX INFO: renamed from: a */
    public void mo85463a() {
        C14842am.b next;
        C14874p c14874pM86765a = C14875q.m86765a((Context) this.f63108a);
        if (c14874pM86765a == null) {
            try {
                c14874pM86765a = C14875q.m86766a(this.f63108a, this.f63109a, this.f63111b, this.f63112c);
            } catch (Exception e) {
                ilq0.m137025B("fail to register push account. " + e);
            }
        }
        if (c14874pM86765a == null) {
            ilq0.m137025B("no account for registration.");
            C14879t.m86788a(this.f63108a, 70000002, "no account.");
            return;
        }
        ilq0.m137040m("do registration now.");
        Collection<C14842am.b> collectionM86510a = C14842am.m86505a().m86510a("5");
        if (collectionM86510a.isEmpty()) {
            next = c14874pM86765a.m86762a(this.f63108a);
            C14882w.m86843a(this.f63108a, next);
            C14842am.m86505a().m86516a(next);
        } else {
            next = collectionM86510a.iterator().next();
        }
        if (!this.f63108a.m86361c()) {
            C14879t.m86792a(this.f63109a, this.f63110a);
            this.f63108a.m86352a(true);
            return;
        }
        try {
            C14842am.c cVar = next.f62888a;
            if (cVar == C14842am.c.binded) {
                C14882w.m86845a(this.f63108a, this.f63109a, this.f63110a);
            } else if (cVar == C14842am.c.unbind) {
                C14879t.m86792a(this.f63109a, this.f63110a);
                XMPushService xMPushService = this.f63108a;
                xMPushService.getClass();
                xMPushService.m86345a(xMPushService.new C14810b(next));
            }
        } catch (C14737fi e2) {
            ilq0.m137025B("meet error, disconnect connection. " + e2);
            this.f63108a.m86344a(10, e2);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
    /* JADX INFO: renamed from: a */
    public String mo85462a() {
        return "register app";
    }
}
