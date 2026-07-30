package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.xiaomi.push.C14885fi;
import com.xiaomi.push.C14901gs;
import com.xiaomi.push.C14903gu;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14926hu;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.InterfaceC14925hq;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p153l.etq0;
import p153l.g2r0;
import p153l.jxq0;
import p153l.ouq0;
import p153l.u1r0;
import p153l.w0r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.w */
/* JADX INFO: loaded from: classes2.dex */
final class C15030w {
    /* JADX INFO: renamed from: a */
    public static w0r0 m88011a(C15022p c15022p, Context context, C14911hb c14911hb) {
        try {
            w0r0 w0r0Var = new w0r0();
            w0r0Var.m204324h(5);
            w0r0Var.m204316B(c15022p.f63938a);
            w0r0Var.m204338v(m88008a(c14911hb));
            w0r0Var.m204328l("SECMSG", "message");
            String str = c15022p.f63938a;
            c14911hb.f63195a.f63053a = str.substring(0, str.indexOf("@"));
            c14911hb.f63195a.f63057c = str.substring(str.indexOf("/") + 1);
            w0r0Var.m204330n(C14936m.m87448e(c14911hb), c15022p.f63940c);
            w0r0Var.m204329m((short) 1);
            ouq0.m169393m("try send mi push message. packagename:" + c14911hb.f63200b + " action:" + c14911hb.f63193a);
            return w0r0Var;
        } catch (NullPointerException e) {
            ouq0.m169397q(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C14911hb m88017b(String str, String str2) {
        C14914he c14914he = new C14914he();
        c14914he.m87127b(str2);
        c14914he.m87131c(EnumC14898gp.AppDataCleared.f62957a);
        c14914he.m87114a(C14987aj.m87666a());
        c14914he.m87117a(false);
        return m88006a(str, str2, c14914he, EnumC14888gf.Notification);
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC14925hq<T, ?>> C14911hb m88018b(String str, String str2, T t, EnumC14888gf enumC14888gf) {
        return m88007a(str, str2, t, enumC14888gf, false);
    }

    /* JADX INFO: renamed from: a */
    private static void m88015a(final XMPushService xMPushService, final C15022p c15022p, int i) {
        C15002ay.m87762a(xMPushService).m87766a(new C15002ay.a("MSAID", i) { // from class: com.xiaomi.push.service.w.1
            @Override // com.xiaomi.push.service.C15002ay.a
            /* JADX INFO: renamed from: a */
            public void mo87768a(C15002ay c15002ay) {
                etq0 etq0VarM122490c = etq0.m122490c(xMPushService);
                String strM87765a = c15002ay.m87765a("MSAID", "msaid");
                String strMo100236a = etq0VarM122490c.mo100236a();
                if (TextUtils.isEmpty(strMo100236a) || TextUtils.equals(strM87765a, strMo100236a)) {
                    return;
                }
                c15002ay.m87767a("MSAID", "msaid", strMo100236a);
                C14914he c14914he = new C14914he();
                c14914he.m87127b(c15022p.f63941d);
                c14914he.m87131c(EnumC14898gp.ClientInfoUpdate.f62957a);
                c14914he.m87114a(C14987aj.m87666a());
                c14914he.m87116a(new HashMap());
                etq0VarM122490c.m122492e(c14914he.m87120a());
                byte[] bArrM87448e = C14936m.m87448e(C15030w.m88006a(xMPushService.getPackageName(), c15022p.f63941d, c14914he, EnumC14888gf.Notification));
                XMPushService xMPushService2 = xMPushService;
                xMPushService2.m87521a(xMPushService2.getPackageName(), bArrM87448e, true);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static String m88008a(C14911hb c14911hb) {
        Map<String, String> map;
        C14901gs c14901gs = c14911hb.f63194a;
        if (c14901gs != null && (map = c14901gs.f63034b) != null) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return c14911hb.f63200b;
    }

    /* JADX INFO: renamed from: a */
    public static void m88012a(XMPushService xMPushService) {
        C15022p c15022pM87936a = C15023q.m87936a(xMPushService.getApplicationContext());
        if (c15022pM87936a != null) {
            C14990am.b bVarM87933a = C15023q.m87936a(xMPushService.getApplicationContext()).m87933a(xMPushService);
            ouq0.m169393m("prepare account. " + bVarM87933a.f63737a);
            m88014a(xMPushService, bVarM87933a);
            C14990am.m87676a().m87687a(bVarM87933a);
            m88015a(xMPushService, c15022pM87936a, 172800);
        }
    }

    /* JADX INFO: renamed from: a */
    public static w0r0 m88010a(XMPushService xMPushService, byte[] bArr) {
        C14911hb c14911hb = new C14911hb();
        try {
            C14936m.m87447d(c14911hb, bArr);
            return m88011a(C15023q.m87936a((Context) xMPushService), xMPushService, c14911hb);
        } catch (C14926hu e) {
            ouq0.m169397q(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC14925hq<T, ?>> C14911hb m88006a(String str, String str2, T t, EnumC14888gf enumC14888gf) {
        return m88007a(str, str2, t, enumC14888gf, true);
    }

    /* JADX INFO: renamed from: a */
    private static <T extends InterfaceC14925hq<T, ?>> C14911hb m88007a(String str, String str2, T t, EnumC14888gf enumC14888gf, boolean z) {
        byte[] bArrM87448e = C14936m.m87448e(t);
        C14911hb c14911hb = new C14911hb();
        C14903gu c14903gu = new C14903gu();
        c14903gu.f63052a = 5L;
        c14903gu.f63053a = "fakeid";
        c14911hb.m87080a(c14903gu);
        c14911hb.m87082a(ByteBuffer.wrap(bArrM87448e));
        c14911hb.m87078a(enumC14888gf);
        c14911hb.m87091b(z);
        c14911hb.m87090b(str);
        c14911hb.m87083a(false);
        c14911hb.m87081a(str2);
        return c14911hb;
    }

    /* JADX INFO: renamed from: a */
    public static C14911hb m88005a(String str, String str2) {
        C14914he c14914he = new C14914he();
        c14914he.m87127b(str2);
        c14914he.m87131c("package uninstalled");
        c14914he.m87114a(g2r0.m128638k());
        c14914he.m87117a(false);
        return m88006a(str, str2, c14914he, EnumC14888gf.Notification);
    }

    /* JADX INFO: renamed from: a */
    public static void m88014a(final XMPushService xMPushService, C14990am.b bVar) {
        bVar.m87702a((Messenger) null);
        bVar.m87703a(new C14990am.b.a() { // from class: com.xiaomi.push.service.w.2
            @Override // com.xiaomi.push.service.C14990am.b.a
            /* JADX INFO: renamed from: a */
            public void mo86632a(C14990am.c cVar, C14990am.c cVar2, int i) {
                if (cVar2 == C14990am.c.binded) {
                    C15027t.m87962a(xMPushService, true);
                    C15027t.m87961a(xMPushService);
                } else if (cVar2 == C14990am.c.unbind) {
                    ouq0.m169393m("onChange unbind");
                    C15027t.m87959a(xMPushService, 70000001, " the push is not connected.");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m88016a(XMPushService xMPushService, String str, byte[] bArr) {
        jxq0.m147395g(str, xMPushService.getApplicationContext(), bArr);
        u1r0 u1r0VarM87512a = xMPushService.m87512a();
        if (u1r0VarM87512a != null) {
            if (u1r0VarM87512a.mo113630q()) {
                w0r0 w0r0VarM88010a = m88010a(xMPushService, bArr);
                if (w0r0VarM88010a != null) {
                    u1r0VarM87512a.mo113631w(w0r0VarM88010a);
                    return;
                } else {
                    C15027t.m87960a(xMPushService, str, bArr, 70000003, "not a valid message");
                    return;
                }
            }
            throw new C14885fi("Don't support XMPP connection.");
        }
        throw new C14885fi("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public static void m88013a(XMPushService xMPushService, C14911hb c14911hb) {
        jxq0.m147393e(c14911hb.m87092b(), xMPushService.getApplicationContext(), c14911hb, -1);
        u1r0 u1r0VarM87512a = xMPushService.m87512a();
        if (u1r0VarM87512a != null) {
            if (u1r0VarM87512a.mo113630q()) {
                w0r0 w0r0VarM88011a = m88011a(C15023q.m87936a((Context) xMPushService), xMPushService, c14911hb);
                if (w0r0VarM88011a != null) {
                    u1r0VarM87512a.mo113631w(w0r0VarM88011a);
                    return;
                }
                return;
            }
            throw new C14885fi("Don't support XMPP connection.");
        }
        throw new C14885fi("try send msg while connection is null.");
    }

    /* JADX INFO: renamed from: a */
    public static String m88009a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }
}
