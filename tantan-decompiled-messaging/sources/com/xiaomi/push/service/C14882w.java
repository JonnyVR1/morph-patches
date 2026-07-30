package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.xiaomi.push.C14737fi;
import com.xiaomi.push.C14753gs;
import com.xiaomi.push.C14755gu;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14778hu;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.InterfaceC14777hq;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p149l.atq0;
import p149l.doq0;
import p149l.ilq0;
import p149l.osq0;
import p149l.qrq0;
import p149l.yjq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.w */
/* JADX INFO: loaded from: classes2.dex */
final class C14882w {
    /* JADX INFO: renamed from: a */
    public static qrq0 m86840a(C14874p c14874p, Context context, C14763hb c14763hb) {
        try {
            qrq0 qrq0Var = new qrq0();
            qrq0Var.m176088h(5);
            qrq0Var.m176079B(c14874p.f63091a);
            qrq0Var.m176102v(m86837a(c14763hb));
            qrq0Var.m176092l("SECMSG", "message");
            String str = c14874p.f63091a;
            c14763hb.f62348a.f62206a = str.substring(0, str.indexOf("@"));
            c14763hb.f62348a.f62210c = str.substring(str.indexOf("/") + 1);
            qrq0Var.m176094n(C14788m.m86277e(c14763hb), c14874p.f63093c);
            qrq0Var.m176093m((short) 1);
            ilq0.m137040m("try send mi push message. packagename:" + c14763hb.f62353b + " action:" + c14763hb.f62346a);
            return qrq0Var;
        } catch (NullPointerException e) {
            ilq0.m137044q(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C14763hb m86846b(String str, String str2) {
        C14766he c14766he = new C14766he();
        c14766he.m85956b(str2);
        c14766he.m85960c(EnumC14750gp.AppDataCleared.f62110a);
        c14766he.m85943a(C14839aj.m86495a());
        c14766he.m85946a(false);
        return m86835a(str, str2, c14766he, EnumC14740gf.Notification);
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC14777hq<T, ?>> C14763hb m86847b(String str, String str2, T t, EnumC14740gf enumC14740gf) {
        return m86836a(str, str2, t, enumC14740gf, false);
    }

    /* JADX INFO: renamed from: a */
    private static void m86844a(final XMPushService xMPushService, final C14874p c14874p, int i) {
        C14854ay.m86591a(xMPushService).m86595a(new C14854ay.a("MSAID", i) { // from class: com.xiaomi.push.service.w.1
            @Override // com.xiaomi.push.service.C14854ay.a
            /* JADX INFO: renamed from: a */
            public void mo86597a(C14854ay c14854ay) {
                yjq0 yjq0VarM215084c = yjq0.m215084c(xMPushService);
                String strM86594a = c14854ay.m86594a("MSAID", "msaid");
                String strMo97174a = yjq0VarM215084c.mo97174a();
                if (TextUtils.isEmpty(strMo97174a) || TextUtils.equals(strM86594a, strMo97174a)) {
                    return;
                }
                c14854ay.m86596a("MSAID", "msaid", strMo97174a);
                C14766he c14766he = new C14766he();
                c14766he.m85956b(c14874p.f63094d);
                c14766he.m85960c(EnumC14750gp.ClientInfoUpdate.f62110a);
                c14766he.m85943a(C14839aj.m86495a());
                c14766he.m85945a(new HashMap());
                yjq0VarM215084c.m215086e(c14766he.m85949a());
                byte[] bArrM86277e = C14788m.m86277e(C14882w.m86835a(xMPushService.getPackageName(), c14874p.f63094d, c14766he, EnumC14740gf.Notification));
                XMPushService xMPushService2 = xMPushService;
                xMPushService2.m86350a(xMPushService2.getPackageName(), bArrM86277e, true);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static String m86837a(C14763hb c14763hb) {
        Map<String, String> map;
        C14753gs c14753gs = c14763hb.f62347a;
        if (c14753gs != null && (map = c14753gs.f62187b) != null) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return c14763hb.f62353b;
    }

    /* JADX INFO: renamed from: a */
    public static void m86841a(XMPushService xMPushService) {
        C14874p c14874pM86765a = C14875q.m86765a(xMPushService.getApplicationContext());
        if (c14874pM86765a != null) {
            C14842am.b bVarM86762a = C14875q.m86765a(xMPushService.getApplicationContext()).m86762a(xMPushService);
            ilq0.m137040m("prepare account. " + bVarM86762a.f62890a);
            m86843a(xMPushService, bVarM86762a);
            C14842am.m86505a().m86516a(bVarM86762a);
            m86844a(xMPushService, c14874pM86765a, 172800);
        }
    }

    /* JADX INFO: renamed from: a */
    public static qrq0 m86839a(XMPushService xMPushService, byte[] bArr) {
        C14763hb c14763hb = new C14763hb();
        try {
            C14788m.m86276d(c14763hb, bArr);
            return m86840a(C14875q.m86765a((Context) xMPushService), xMPushService, c14763hb);
        } catch (C14778hu e) {
            ilq0.m137044q(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC14777hq<T, ?>> C14763hb m86835a(String str, String str2, T t, EnumC14740gf enumC14740gf) {
        return m86836a(str, str2, t, enumC14740gf, true);
    }

    /* JADX INFO: renamed from: a */
    private static <T extends InterfaceC14777hq<T, ?>> C14763hb m86836a(String str, String str2, T t, EnumC14740gf enumC14740gf, boolean z) {
        byte[] bArrM86277e = C14788m.m86277e(t);
        C14763hb c14763hb = new C14763hb();
        C14755gu c14755gu = new C14755gu();
        c14755gu.f62205a = 5L;
        c14755gu.f62206a = "fakeid";
        c14763hb.m85909a(c14755gu);
        c14763hb.m85911a(ByteBuffer.wrap(bArrM86277e));
        c14763hb.m85907a(enumC14740gf);
        c14763hb.m85920b(z);
        c14763hb.m85919b(str);
        c14763hb.m85912a(false);
        c14763hb.m85910a(str2);
        return c14763hb;
    }

    /* JADX INFO: renamed from: a */
    public static C14763hb m86834a(String str, String str2) {
        C14766he c14766he = new C14766he();
        c14766he.m85956b(str2);
        c14766he.m85960c("package uninstalled");
        c14766he.m85943a(atq0.m98856k());
        c14766he.m85946a(false);
        return m86835a(str, str2, c14766he, EnumC14740gf.Notification);
    }

    /* JADX INFO: renamed from: a */
    public static void m86843a(final XMPushService xMPushService, C14842am.b bVar) {
        bVar.m86531a((Messenger) null);
        bVar.m86532a(new C14842am.b.a() { // from class: com.xiaomi.push.service.w.2
            @Override // com.xiaomi.push.service.C14842am.b.a
            /* JADX INFO: renamed from: a */
            public void mo85461a(C14842am.c cVar, C14842am.c cVar2, int i) {
                if (cVar2 == C14842am.c.binded) {
                    C14879t.m86791a(xMPushService, true);
                    C14879t.m86790a(xMPushService);
                } else if (cVar2 == C14842am.c.unbind) {
                    ilq0.m137040m("onChange unbind");
                    C14879t.m86788a(xMPushService, 70000001, " the push is not connected.");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m86845a(XMPushService xMPushService, String str, byte[] bArr) {
        doq0.m112825g(str, xMPushService.getApplicationContext(), bArr);
        osq0 osq0VarM86341a = xMPushService.m86341a();
        if (osq0VarM86341a != null) {
            if (osq0VarM86341a.mo165896q()) {
                qrq0 qrq0VarM86839a = m86839a(xMPushService, bArr);
                if (qrq0VarM86839a != null) {
                    osq0VarM86341a.mo165902w(qrq0VarM86839a);
                    return;
                } else {
                    C14879t.m86789a(xMPushService, str, bArr, 70000003, "not a valid message");
                    return;
                }
            }
            throw new C14737fi("Don't support XMPP connection.");
        }
        throw new C14737fi("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public static void m86842a(XMPushService xMPushService, C14763hb c14763hb) {
        doq0.m112823e(c14763hb.m85921b(), xMPushService.getApplicationContext(), c14763hb, -1);
        osq0 osq0VarM86341a = xMPushService.m86341a();
        if (osq0VarM86341a != null) {
            if (osq0VarM86341a.mo165896q()) {
                qrq0 qrq0VarM86840a = m86840a(C14875q.m86765a((Context) xMPushService), xMPushService, c14763hb);
                if (qrq0VarM86840a != null) {
                    osq0VarM86341a.mo165902w(qrq0VarM86840a);
                    return;
                }
                return;
            }
            throw new C14737fi("Don't support XMPP connection.");
        }
        throw new C14737fi("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public static String m86838a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }
}
