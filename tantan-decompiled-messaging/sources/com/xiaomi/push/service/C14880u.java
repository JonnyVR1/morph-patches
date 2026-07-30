package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14737fi;
import com.xiaomi.push.C14739g;
import com.xiaomi.push.C14753gs;
import com.xiaomi.push.C14756gv;
import com.xiaomi.push.C14757gw;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14768hg;
import com.xiaomi.push.C14778hu;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.InterfaceC14777hq;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.atq0;
import p149l.doq0;
import p149l.fvq0;
import p149l.ilq0;
import p149l.jtq0;
import p149l.nqq0;
import p149l.ouq0;
import p149l.qrq0;
import p149l.ysq0;
import p149l.zsq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.u */
/* JADX INFO: loaded from: classes2.dex */
public class C14880u {
    /* JADX WARN: Code duplicated, block: B:152:0x042a  */
    /* JADX INFO: renamed from: a */
    public static void m86803a(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        C14763hb c14763hbM86797a = m86797a(bArr);
        C14753gs c14753gsM85906a = c14763hbM86797a.m85906a();
        InterfaceC14777hq interfaceC14777hqM86628a = null;
        if (bArr != null) {
            doq0.m112824f(c14763hbM86797a.m85921b(), xMPushService.getApplicationContext(), null, c14763hbM86797a.m85905a(), bArr.length);
        }
        if (m86815c(c14763hbM86797a) && m86807a(xMPushService, str)) {
            if (C14883x.m86901e(c14763hbM86797a)) {
                nqq0.m160662a(xMPushService.getApplicationContext()).m160669g(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), "5");
            }
            m86814c(xMPushService, c14763hbM86797a);
            return;
        }
        if (m86809a(c14763hbM86797a) && !m86807a(xMPushService, str) && !m86813b(c14763hbM86797a)) {
            if (C14883x.m86901e(c14763hbM86797a)) {
                nqq0.m160662a(xMPushService.getApplicationContext()).m160669g(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), Constants.VIA_SHARE_TYPE_INFO);
            }
            m86816d(xMPushService, c14763hbM86797a);
            return;
        }
        if ((!C14883x.m86883a(c14763hbM86797a) || !C14739g.m85596p(xMPushService, c14763hbM86797a.f62353b)) && !m86806a(xMPushService, intent)) {
            if (!C14739g.m85596p(xMPushService, c14763hbM86797a.f62353b)) {
                if (C14883x.m86901e(c14763hbM86797a)) {
                    nqq0.m160662a(xMPushService.getApplicationContext()).m160670i(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), "2");
                }
                m86799a(xMPushService, c14763hbM86797a);
                return;
            } else {
                ilq0.m137040m("receive a mipush message, we can see the app, but we can't see the receiver.");
                if (C14883x.m86901e(c14763hbM86797a)) {
                    nqq0.m160662a(xMPushService.getApplicationContext()).m160670i(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), "3");
                    return;
                }
                return;
            }
        }
        boolean z = false;
        if (EnumC14740gf.Registration == c14763hbM86797a.m85905a()) {
            String strM85921b = c14763hbM86797a.m85921b();
            SharedPreferences.Editor editorEdit = xMPushService.getSharedPreferences("pref_registered_pkg_names", 0).edit();
            editorEdit.putString(strM85921b, c14763hbM86797a.f62349a);
            editorEdit.commit();
            C14768hg c14768hgM86675a = C14870l.m86675a(c14763hbM86797a);
            if (c14768hgM86675a.m86035a() != 0 || TextUtils.isEmpty(c14768hgM86675a.m86042b())) {
                ilq0.m137025B("read regSecret failed");
            } else {
                C14870l.m86677a(xMPushService, strM85921b, c14768hgM86675a.m86042b());
            }
            C14876r.m86775a(xMPushService).m86783e(strM85921b);
            C14876r.m86775a(xMPushService).m86784f(strM85921b);
            nqq0.m160662a(xMPushService.getApplicationContext()).m160668f(strM85921b, "E100003", c14753gsM85906a.m85728a(), 6003, null);
            if (!TextUtils.isEmpty(c14753gsM85906a.m85728a())) {
                intent.putExtra("messageId", c14753gsM85906a.m85728a());
                intent.putExtra("eventMessageType", PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
            }
        }
        if (C14883x.m86899c(c14763hbM86797a)) {
            nqq0.m160662a(xMPushService.getApplicationContext()).m160667e(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), 1001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(c14753gsM85906a.m85728a())) {
                intent.putExtra("messageId", c14753gsM85906a.m85728a());
                intent.putExtra("eventMessageType", 1000);
            }
        }
        if (C14883x.m86895b(c14763hbM86797a)) {
            nqq0.m160662a(xMPushService.getApplicationContext()).m160667e(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), 2001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(c14753gsM85906a.m85728a())) {
                intent.putExtra("messageId", c14753gsM85906a.m85728a());
                intent.putExtra("eventMessageType", 2000);
            }
        }
        if (C14883x.m86883a(c14763hbM86797a)) {
            nqq0.m160662a(xMPushService.getApplicationContext()).m160667e(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), 3001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(c14753gsM85906a.m85728a())) {
                intent.putExtra("messageId", c14753gsM85906a.m85728a());
                intent.putExtra("eventMessageType", 3000);
            }
        }
        if (c14753gsM85906a != null && !TextUtils.isEmpty(c14753gsM85906a.m85746c()) && !TextUtils.isEmpty(c14753gsM85906a.m85750d()) && c14753gsM85906a.f62185b != 1 && !C14883x.m86881a((Context) xMPushService, c14763hbM86797a.f62353b, C14883x.m86885a(c14753gsM85906a.m85729a()))) {
            Map<String, String> map = c14753gsM85906a.f62183a;
            String strM85728a = map != null ? map.get("jobkey") : null;
            if (TextUtils.isEmpty(strM85728a)) {
                strM85728a = c14753gsM85906a.m85728a();
            }
            if (C14884y.m86903a(xMPushService, c14763hbM86797a.f62353b, strM85728a)) {
                nqq0.m160662a(xMPushService.getApplicationContext()).m160671j(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), "1:" + strM85728a);
                ilq0.m137040m("drop a duplicate message, key=" + strM85728a);
            } else if (fvq0.m123356j(xMPushService) && C14881v.m86826a(c14763hbM86797a)) {
                ilq0.m137040m("receive pull down message");
            } else {
                m86798a(xMPushService, c14763hbM86797a, bArr);
            }
            m86812b(xMPushService, c14763hbM86797a);
        } else if ("com.xiaomi.xmsf".contains(c14763hbM86797a.f62353b) && !c14763hbM86797a.m85923b() && c14753gsM85906a != null && c14753gsM85906a.m85729a() != null && c14753gsM85906a.m85729a().containsKey("ab")) {
            m86812b(xMPushService, c14763hbM86797a);
            ilq0.m137053z("receive abtest message. ack it." + c14753gsM85906a.m85728a());
        } else if (m86810a(xMPushService, str, c14763hbM86797a, c14753gsM85906a)) {
            if (c14753gsM85906a != null && !TextUtils.isEmpty(c14753gsM85906a.m85728a())) {
                if (C14883x.m86895b(c14763hbM86797a)) {
                    nqq0.m160662a(xMPushService.getApplicationContext()).m160668f(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), 2002, null);
                } else if (C14883x.m86883a(c14763hbM86797a)) {
                    nqq0.m160662a(xMPushService.getApplicationContext()).m160669g(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), "7");
                } else if (C14883x.m86899c(c14763hbM86797a)) {
                    nqq0.m160662a(xMPushService.getApplicationContext()).m160669g(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
                } else if (C14883x.m86900d(c14763hbM86797a)) {
                    nqq0.m160662a(xMPushService.getApplicationContext()).m160668f(c14763hbM86797a.m85921b(), "E100003", c14753gsM85906a.m85728a(), 6004, null);
                }
            }
            if (EnumC14740gf.Notification == c14763hbM86797a.f62346a) {
                try {
                    interfaceC14777hqM86628a = C14859bc.m86628a(xMPushService, c14763hbM86797a);
                    if (interfaceC14777hqM86628a == null) {
                        ilq0.m137025B("receiving an un-recognized notification message. " + c14763hbM86797a.f62346a);
                    } else {
                        z = true;
                    }
                } catch (C14778hu e) {
                    ilq0.m137025B("receive a message which action string is not valid. " + e);
                }
                if (z && (interfaceC14777hqM86628a instanceof C14766he)) {
                    C14766he c14766he = (C14766he) interfaceC14777hqM86628a;
                    if (EnumC14750gp.CancelPushMessage.f62110a.equals(c14766he.f62387d) && c14766he.m85949a() != null) {
                        String str2 = c14766he.m85949a().get(AbstractC14843an.f62934Q);
                        int i = -2;
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                i = Integer.parseInt(str2);
                            } catch (NumberFormatException e2) {
                                ilq0.m137040m("parse notifyId from STRING to INT failed: " + e2);
                            }
                        }
                        if (i >= -1) {
                            ilq0.m137040m("try to retract a message by notifyId=" + i);
                            C14883x.m86872a(xMPushService, c14763hbM86797a.f62353b, i);
                        } else {
                            String str3 = c14766he.m85949a().get(AbstractC14843an.f62932O);
                            String str4 = c14766he.m85949a().get(AbstractC14843an.f62933P);
                            ilq0.m137040m("try to retract a message by title&description.");
                            C14883x.m86874a(xMPushService, c14763hbM86797a.f62353b, str3, str4);
                        }
                        if (c14753gsM85906a != null && c14753gsM85906a.m85729a() != null && fvq0.m123356j(xMPushService) && "pulldown".equals(C14836ag.m86461a((Object) c14753gsM85906a.m85729a()))) {
                            C14881v.m86823a(c14763hbM86797a);
                        }
                        m86800a(xMPushService, c14763hbM86797a, c14766he);
                    } else if (!EnumC14750gp.SettingAppNotificationPermission.f62110a.equals(c14766he.m85961c())) {
                        ilq0.m137040m("broadcast passthrough message.");
                        xMPushService.sendBroadcast(intent, C14882w.m86838a(c14763hbM86797a.f62353b));
                    } else if (fvq0.m123356j(xMPushService)) {
                        C14881v.m86822a(xMPushService, c14763hbM86797a, c14766he);
                    }
                } else {
                    ilq0.m137040m("broadcast passthrough message.");
                    xMPushService.sendBroadcast(intent, C14882w.m86838a(c14763hbM86797a.f62353b));
                }
            } else {
                ilq0.m137040m("broadcast passthrough message.");
                xMPushService.sendBroadcast(intent, C14882w.m86838a(c14763hbM86797a.f62353b));
            }
        } else {
            nqq0.m160662a(xMPushService.getApplicationContext()).m160669g(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), Constants.VIA_SHARE_TYPE_MINI_PROGRAM);
        }
        if (c14763hbM86797a.m85905a() != EnumC14740gf.UnRegistration || "com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
            return;
        }
        xMPushService.stopSelf();
    }

    /* JADX INFO: renamed from: b */
    private static void m86811b(Context context, C14763hb c14763hb, byte[] bArr) {
        if (C14883x.m86883a(c14763hb)) {
            return;
        }
        String strM86866a = C14883x.m86866a(c14763hb);
        if (TextUtils.isEmpty(strM86866a) || m86808a(context, strM86866a, bArr)) {
            return;
        }
        nqq0.m160662a(context).m160670i(strM86866a, C14883x.m86890b(c14763hb), c14763hb.m85906a().m85728a(), "1");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m86815c(C14763hb c14763hb) {
        if (c14763hb.m85906a() == null || c14763hb.m85906a().m85729a() == null) {
            return false;
        }
        return "1".equals(c14763hb.m85906a().m85729a().get("obslete_ads_message"));
    }

    /* JADX INFO: renamed from: d */
    private static void m86816d(final XMPushService xMPushService, final C14763hb c14763hb) {
        xMPushService.m86345a(new XMPushService.AbstractC14818j(4) { // from class: com.xiaomi.push.service.u.4
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                try {
                    C14763hb c14763hbM86795a = C14880u.m86795a((Context) xMPushService, c14763hb);
                    c14763hbM86795a.m85906a().m85731a("miui_message_unrecognized", "1");
                    C14882w.m86842a(xMPushService, c14763hbM86795a);
                } catch (C14737fi e) {
                    ilq0.m137044q(e);
                    xMPushService.m86344a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "send ack message for unrecognized new miui message.";
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private static void m86814c(final XMPushService xMPushService, final C14763hb c14763hb) {
        xMPushService.m86345a(new XMPushService.AbstractC14818j(4) { // from class: com.xiaomi.push.service.u.3
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                try {
                    C14763hb c14763hbM86795a = C14880u.m86795a((Context) xMPushService, c14763hb);
                    c14763hbM86795a.m85906a().m85731a("message_obsleted", "1");
                    C14882w.m86842a(xMPushService, c14763hbM86795a);
                } catch (C14737fi e) {
                    ilq0.m137044q(e);
                    xMPushService.m86344a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "send ack message for obsleted message.";
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private static boolean m86813b(C14763hb c14763hb) {
        Map<String, String> mapM85729a = c14763hb.m85906a().m85729a();
        return mapM85729a != null && mapM85729a.containsKey("notify_effect");
    }

    /* JADX INFO: renamed from: b */
    private static void m86812b(final XMPushService xMPushService, final C14763hb c14763hb) {
        xMPushService.m86345a(new XMPushService.AbstractC14818j(4) { // from class: com.xiaomi.push.service.u.2
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                Map<String, String> mapM86820a;
                try {
                    if (fvq0.m123356j(xMPushService)) {
                        try {
                            mapM86820a = C14881v.m86820a((Context) xMPushService, c14763hb);
                        } catch (Throwable th) {
                            ilq0.m137025B("error creating params for ack message :" + th);
                            mapM86820a = null;
                        }
                    } else {
                        mapM86820a = null;
                    }
                    C14882w.m86842a(xMPushService, C14880u.m86796a(xMPushService, c14763hb, mapM86820a));
                } catch (C14737fi e) {
                    ilq0.m137025B("error sending ack message :" + e);
                    xMPushService.m86344a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "send ack message for message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m86818a(XMPushService xMPushService, atq0 atq0Var, C14842am.b bVar) {
        if (atq0Var instanceof zsq0) {
            zsq0 zsq0Var = (zsq0) atq0Var;
            ysq0 ysq0VarM98861f = zsq0Var.m98861f(BLiveStormDanmakuGiftResourceType.f44446s);
            if (ysq0VarM98861f != null) {
                try {
                    m86804a(xMPushService, C14847ar.m86552a(C14847ar.m86551a(bVar.f62901h, zsq0Var.m98866l()), ysq0VarM98861f.m215928k()), jtq0.m143160b(atq0Var.mo85578d()));
                    return;
                } catch (IllegalArgumentException e) {
                    ilq0.m137044q(e);
                    return;
                }
            }
            return;
        }
        ilq0.m137040m("not a mipush message");
    }

    /* JADX INFO: renamed from: a */
    public void m86819a(XMPushService xMPushService, qrq0 qrq0Var, C14842am.b bVar) {
        HashMap map;
        try {
            byte[] bArrM176097q = qrq0Var.m176097q(bVar.f62901h);
            if (AbstractC14863e.m86638b(qrq0Var)) {
                map = new HashMap();
                map.put("t_im", String.valueOf(qrq0Var.m176099s()));
                map.put("t_rt", String.valueOf(qrq0Var.m176084b()));
            } else {
                map = null;
            }
            m86805a(xMPushService, bArrM176097q, qrq0Var.mo176104x(), map);
        } catch (IllegalArgumentException e) {
            ilq0.m137044q(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m86804a(XMPushService xMPushService, byte[] bArr, long j) {
        m86805a(xMPushService, bArr, j, (Map<String, String>) null);
    }

    /* JADX INFO: renamed from: a */
    private static void m86805a(XMPushService xMPushService, byte[] bArr, long j, Map<String, String> map) {
        Map<String, String> mapM85729a;
        Map<String, String> mapM85729a2;
        byte[] bArrM86277e;
        C14763hb c14763hbM86797a = m86797a(bArr);
        if (c14763hbM86797a == null) {
            return;
        }
        if (TextUtils.isEmpty(c14763hbM86797a.f62353b)) {
            ilq0.m137040m("receive a mipush message without package name");
            return;
        }
        C14753gs c14753gsM85906a = c14763hbM86797a.m85906a();
        if (c14753gsM85906a != null && map != null && !map.isEmpty() && (mapM85729a2 = c14753gsM85906a.m85729a()) != null && !mapM85729a2.isEmpty()) {
            boolean z = false;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (mapM85729a2.containsKey(entry.getKey())) {
                    mapM85729a2.put(entry.getKey(), entry.getValue());
                    z = true;
                }
            }
            if (z && (bArrM86277e = C14788m.m86277e(c14763hbM86797a)) != null && bArrM86277e.length > 0) {
                bArr = bArrM86277e;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intent intentM86794a = m86794a(bArr, jCurrentTimeMillis);
        String strM86866a = C14883x.m86866a(c14763hbM86797a);
        jtq0.m143168j(xMPushService, strM86866a, j, true, true, System.currentTimeMillis());
        if (c14753gsM85906a != null && c14753gsM85906a.m85728a() != null) {
            ilq0.m137027D(String.format("receive a message. appid=%1$s, msgid= %2$s, action=%3$s", c14763hbM86797a.m85913a(), C14839aj.m86496a(c14753gsM85906a.m85728a()), c14763hbM86797a.m85905a()));
        }
        if (c14753gsM85906a != null) {
            c14753gsM85906a.m85731a("mrt", Long.toString(jCurrentTimeMillis));
        }
        EnumC14740gf enumC14740gf = EnumC14740gf.SendMessage;
        String strM85728a = "";
        if (enumC14740gf == c14763hbM86797a.m85905a() && C14876r.m86775a(xMPushService).m86777a(c14763hbM86797a.f62353b) && !C14883x.m86883a(c14763hbM86797a)) {
            if (c14753gsM85906a != null) {
                strM85728a = c14753gsM85906a.m85728a();
                if (C14883x.m86901e(c14763hbM86797a)) {
                    nqq0.m160662a(xMPushService.getApplicationContext()).m160669g(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), strM85728a, "1");
                }
            }
            ilq0.m137040m("Drop a message for unregistered, msgid=" + strM85728a);
            m86801a(xMPushService, c14763hbM86797a, c14763hbM86797a.f62353b);
            return;
        }
        if (enumC14740gf == c14763hbM86797a.m85905a() && C14876r.m86775a(xMPushService).m86781c(c14763hbM86797a.f62353b) && !C14883x.m86883a(c14763hbM86797a)) {
            if (c14753gsM85906a != null) {
                strM85728a = c14753gsM85906a.m85728a();
                if (C14883x.m86901e(c14763hbM86797a)) {
                    nqq0.m160662a(xMPushService.getApplicationContext()).m160669g(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), strM85728a, "2");
                }
            }
            ilq0.m137040m("Drop a message for push closed, msgid=" + strM85728a);
            m86801a(xMPushService, c14763hbM86797a, c14763hbM86797a.f62353b);
            return;
        }
        if (enumC14740gf == c14763hbM86797a.m85905a() && !TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") && !TextUtils.equals(xMPushService.getPackageName(), c14763hbM86797a.f62353b)) {
            ilq0.m137040m("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + c14763hbM86797a.f62353b);
            m86802a(xMPushService, c14763hbM86797a, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + c14763hbM86797a.f62353b);
            if (c14753gsM85906a == null || !C14883x.m86901e(c14763hbM86797a)) {
                return;
            }
            nqq0.m160662a(xMPushService.getApplicationContext()).m160669g(c14763hbM86797a.m85921b(), C14883x.m86890b(c14763hbM86797a), c14753gsM85906a.m85728a(), "3");
            return;
        }
        if (enumC14740gf == c14763hbM86797a.m85905a() && ouq0.m166094c() == 999 && ouq0.m166103l(xMPushService, strM86866a)) {
            ilq0.m137040m("Receive the uninstalled dual app message");
            try {
                C14882w.m86842a(xMPushService, C14882w.m86834a(strM86866a, c14763hbM86797a.m85913a()));
                ilq0.m137040m("uninstall " + strM86866a + " msg sent");
            } catch (C14737fi e) {
                ilq0.m137025B("Fail to send Message: " + e.getMessage());
                xMPushService.m86344a(10, e);
            }
            C14883x.m86871a((Context) xMPushService, strM86866a);
            return;
        }
        if (c14753gsM85906a != null && (mapM85729a = c14753gsM85906a.m85729a()) != null && mapM85729a.containsKey("hide") && "true".equalsIgnoreCase(mapM85729a.get("hide"))) {
            m86812b(xMPushService, c14763hbM86797a);
        } else {
            m86803a(xMPushService, strM86866a, bArr, intentM86794a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Intent m86794a(byte[] bArr, long j) {
        C14763hb c14763hbM86797a = m86797a(bArr);
        if (c14763hbM86797a == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(c14763hbM86797a.f62353b);
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public static C14763hb m86797a(byte[] bArr) {
        C14763hb c14763hb = new C14763hb();
        try {
            C14788m.m86276d(c14763hb, bArr);
            return c14763hb;
        } catch (Throwable th) {
            ilq0.m137044q(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86817a(Context context, C14842am.b bVar, boolean z, int i, String str) {
        C14874p c14874pM86765a;
        if (z || (c14874pM86765a = C14875q.m86765a(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        C14875q.m86766a(context, c14874pM86765a.f63096f, c14874pM86765a.f63094d, c14874pM86765a.f63095e);
    }

    /* JADX INFO: renamed from: a */
    public static void m86798a(Context context, C14763hb c14763hb, byte[] bArr) {
        Context context2;
        try {
            C14883x.c cVarM86864a = C14883x.m86864a(context, c14763hb, bArr);
            if (cVarM86864a.f63150a <= 0 || TextUtils.isEmpty(cVarM86864a.f63151a)) {
                context2 = context;
            } else {
                context2 = context;
                jtq0.m143168j(context2, cVarM86864a.f63151a, cVarM86864a.f63150a, true, false, System.currentTimeMillis());
            }
            if (fvq0.m123356j(context2) && C14881v.m86825a(context2, c14763hb, cVarM86864a.f63152a)) {
                C14881v.m86821a(context2, c14763hb);
                ilq0.m137040m("consume this broadcast by tts");
            } else {
                m86811b(context2, c14763hb, bArr);
            }
        } catch (Exception e) {
            ilq0.m137040m("notify push msg error " + e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86808a(Context context, String str, byte[] bArr) {
        if (C14739g.m85592l(context, str)) {
            Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
            intent.putExtra("mipush_payload", bArr);
            intent.setPackage(str);
            try {
                if (!context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                    ilq0.m137040m("broadcast message arrived.");
                    context.sendBroadcast(intent, C14882w.m86838a(str));
                    return true;
                }
            } catch (Exception e) {
                ilq0.m137040m("meet error when broadcast message arrived. " + e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86810a(XMPushService xMPushService, String str, C14763hb c14763hb, C14753gs c14753gs) {
        boolean z = true;
        if (c14753gs != null && c14753gs.m85729a() != null && c14753gs.m85729a().containsKey("__check_alive") && c14753gs.m85729a().containsKey("__awake")) {
            C14766he c14766he = new C14766he();
            c14766he.m85956b(c14763hb.m85913a());
            c14766he.m85964d(str);
            c14766he.m85960c(EnumC14750gp.AwakeSystemApp.f62110a);
            c14766he.m85943a(c14753gs.m85728a());
            c14766he.f62382a = new HashMap();
            boolean zM85592l = C14739g.m85592l(xMPushService.getApplicationContext(), str);
            c14766he.f62382a.put("app_running", Boolean.toString(zM85592l));
            if (!zM85592l) {
                boolean z2 = Boolean.parseBoolean(c14753gs.m85729a().get("__awake"));
                c14766he.f62382a.put("awaked", Boolean.toString(z2));
                if (!z2) {
                    z = false;
                }
            }
            try {
                C14882w.m86842a(xMPushService, C14882w.m86835a(c14763hb.m85921b(), c14763hb.m85913a(), c14766he, EnumC14740gf.Notification));
            } catch (C14737fi e) {
                ilq0.m137044q(e);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static void m86799a(final XMPushService xMPushService, final C14763hb c14763hb) {
        xMPushService.m86345a(new XMPushService.AbstractC14818j(4) { // from class: com.xiaomi.push.service.u.1
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                try {
                    C14882w.m86842a(xMPushService, C14882w.m86834a(c14763hb.m85921b(), c14763hb.m85913a()));
                } catch (C14737fi e) {
                    ilq0.m137044q(e);
                    xMPushService.m86344a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "send app absent message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86809a(C14763hb c14763hb) {
        return "com.xiaomi.xmsf".equals(c14763hb.f62353b) && c14763hb.m85906a() != null && c14763hb.m85906a().m85729a() != null && c14763hb.m85906a().m85729a().containsKey("miui_package_name");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86807a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            return (packageManager.queryBroadcastReceivers(intent2, 32).isEmpty() && packageManager.queryIntentServices(intent, 32).isEmpty()) ? false : true;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m86801a(final XMPushService xMPushService, final C14763hb c14763hb, final String str) {
        xMPushService.m86345a(new XMPushService.AbstractC14818j(4) { // from class: com.xiaomi.push.service.u.5
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                try {
                    C14763hb c14763hbM86795a = C14880u.m86795a((Context) xMPushService, c14763hb);
                    c14763hbM86795a.m85906a().m85731a("absent_target_package", str);
                    C14882w.m86842a(xMPushService, c14763hbM86795a);
                } catch (C14737fi e) {
                    ilq0.m137044q(e);
                    xMPushService.m86344a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "send app absent ack message for message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static void m86802a(final XMPushService xMPushService, final C14763hb c14763hb, final String str, final String str2) {
        xMPushService.m86345a(new XMPushService.AbstractC14818j(4) { // from class: com.xiaomi.push.service.u.6
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                try {
                    C14763hb c14763hbM86795a = C14880u.m86795a((Context) xMPushService, c14763hb);
                    c14763hbM86795a.f62347a.m85731a("error", str);
                    c14763hbM86795a.f62347a.m85731a(Reason.TYPE, str2);
                    C14882w.m86842a(xMPushService, c14763hbM86795a);
                } catch (C14737fi e) {
                    ilq0.m137044q(e);
                    xMPushService.m86344a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "send wrong message ack for message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static void m86800a(final XMPushService xMPushService, final C14763hb c14763hb, final C14766he c14766he) {
        xMPushService.m86345a(new XMPushService.AbstractC14818j(4) { // from class: com.xiaomi.push.service.u.7
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                try {
                    C14757gw c14757gw = new C14757gw();
                    c14757gw.m85824c(EnumC14750gp.CancelPushMessageACK.f62110a);
                    c14757gw.m85814a(c14766he.m85948a());
                    c14757gw.m85813a(c14766he.m85942a());
                    c14757gw.m85821b(c14766he.m85957b());
                    c14757gw.m85828e(c14766he.m85965d());
                    c14757gw.m85812a(0L);
                    c14757gw.m85826d("success clear push message.");
                    C14882w.m86842a(xMPushService, C14882w.m86847b(c14763hb.m85921b(), c14763hb.m85913a(), c14757gw, EnumC14740gf.Notification));
                } catch (C14737fi e) {
                    ilq0.m137025B("clear push message. " + e);
                    xMPushService.m86344a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "send ack message for clear push message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C14763hb m86795a(Context context, C14763hb c14763hb) {
        return m86796a(context, c14763hb, (Map<String, String>) null);
    }

    /* JADX INFO: renamed from: a */
    public static C14763hb m86796a(Context context, C14763hb c14763hb, Map<String, String> map) {
        C14756gv c14756gv = new C14756gv();
        c14756gv.m85785b(c14763hb.m85913a());
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        if (c14753gsM85906a != null) {
            c14756gv.m85779a(c14753gsM85906a.m85728a());
            c14756gv.m85778a(c14753gsM85906a.m85723a());
            if (!TextUtils.isEmpty(c14753gsM85906a.m85738b())) {
                c14756gv.m85788c(c14753gsM85906a.m85738b());
            }
        }
        c14756gv.m85780a(C14788m.m86274b(context, c14763hb));
        C14763hb c14763hbM86835a = C14882w.m86835a(c14763hb.m85921b(), c14763hb.m85913a(), c14756gv, EnumC14740gf.AckMessage);
        C14753gs c14753gsM85906a2 = c14763hb.m85906a();
        if (c14753gsM85906a2 != null) {
            c14753gsM85906a2 = C14850au.m86568a(c14753gsM85906a2.m85724a());
            Map<String, String> mapM85729a = c14753gsM85906a2.m85729a();
            String str = mapM85729a != null ? mapM85729a.get("channel_id") : null;
            c14753gsM85906a2.m85731a("mat", Long.toString(System.currentTimeMillis()));
            c14753gsM85906a2.m85731a("cs", String.valueOf(C14864f.m86640a(context, c14763hb.f62353b, str)));
        }
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str2 : map.keySet()) {
                        c14753gsM85906a2.m85731a(str2, map.get(str2));
                    }
                }
            } catch (Throwable th) {
                ilq0.m137025B("error adding params to ack message :" + th);
            }
        }
        c14763hbM86835a.m85908a(c14753gsM85906a2);
        return c14763hbM86835a;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86806a(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }
}
