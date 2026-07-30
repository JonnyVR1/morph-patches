package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14885fi;
import com.xiaomi.push.C14887g;
import com.xiaomi.push.C14901gs;
import com.xiaomi.push.C14904gv;
import com.xiaomi.push.C14905gw;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14916hg;
import com.xiaomi.push.C14926hu;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.InterfaceC14925hq;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.e2r0;
import p153l.f2r0;
import p153l.g2r0;
import p153l.jxq0;
import p153l.l4r0;
import p153l.ouq0;
import p153l.p2r0;
import p153l.tzq0;
import p153l.u3r0;
import p153l.w0r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.u */
/* JADX INFO: loaded from: classes2.dex */
public class C15028u {
    /* JADX WARN: Code duplicated, block: B:152:0x042a  */
    /* JADX INFO: renamed from: a */
    public static void m87974a(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        C14911hb c14911hbM87968a = m87968a(bArr);
        C14901gs c14901gsM87077a = c14911hbM87968a.m87077a();
        InterfaceC14925hq interfaceC14925hqM87799a = null;
        if (bArr != null) {
            jxq0.m147394f(c14911hbM87968a.m87092b(), xMPushService.getApplicationContext(), null, c14911hbM87968a.m87076a(), bArr.length);
        }
        if (m87986c(c14911hbM87968a) && m87978a(xMPushService, str)) {
            if (C15031x.m88072e(c14911hbM87968a)) {
                tzq0.m193695a(xMPushService.getApplicationContext()).m193702g(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), "5");
            }
            m87985c(xMPushService, c14911hbM87968a);
            return;
        }
        if (m87980a(c14911hbM87968a) && !m87978a(xMPushService, str) && !m87984b(c14911hbM87968a)) {
            if (C15031x.m88072e(c14911hbM87968a)) {
                tzq0.m193695a(xMPushService.getApplicationContext()).m193702g(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), Constants.VIA_SHARE_TYPE_INFO);
            }
            m87987d(xMPushService, c14911hbM87968a);
            return;
        }
        if ((!C15031x.m88054a(c14911hbM87968a) || !C14887g.m86767p(xMPushService, c14911hbM87968a.f63200b)) && !m87977a(xMPushService, intent)) {
            if (!C14887g.m86767p(xMPushService, c14911hbM87968a.f63200b)) {
                if (C15031x.m88072e(c14911hbM87968a)) {
                    tzq0.m193695a(xMPushService.getApplicationContext()).m193703i(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), "2");
                }
                m87970a(xMPushService, c14911hbM87968a);
                return;
            } else {
                ouq0.m169393m("receive a mipush message, we can see the app, but we can't see the receiver.");
                if (C15031x.m88072e(c14911hbM87968a)) {
                    tzq0.m193695a(xMPushService.getApplicationContext()).m193703i(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), "3");
                    return;
                }
                return;
            }
        }
        boolean z = false;
        if (EnumC14888gf.Registration == c14911hbM87968a.m87076a()) {
            String strM87092b = c14911hbM87968a.m87092b();
            SharedPreferences.Editor editorEdit = xMPushService.getSharedPreferences("pref_registered_pkg_names", 0).edit();
            editorEdit.putString(strM87092b, c14911hbM87968a.f63196a);
            editorEdit.commit();
            C14916hg c14916hgM87846a = C15018l.m87846a(c14911hbM87968a);
            if (c14916hgM87846a.m87206a() != 0 || TextUtils.isEmpty(c14916hgM87846a.m87213b())) {
                ouq0.m169378B("read regSecret failed");
            } else {
                C15018l.m87848a(xMPushService, strM87092b, c14916hgM87846a.m87213b());
            }
            C15024r.m87946a(xMPushService).m87954e(strM87092b);
            C15024r.m87946a(xMPushService).m87955f(strM87092b);
            tzq0.m193695a(xMPushService.getApplicationContext()).m193701f(strM87092b, "E100003", c14901gsM87077a.m86899a(), 6003, null);
            if (!TextUtils.isEmpty(c14901gsM87077a.m86899a())) {
                intent.putExtra("messageId", c14901gsM87077a.m86899a());
                intent.putExtra("eventMessageType", PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
            }
        }
        if (C15031x.m88070c(c14911hbM87968a)) {
            tzq0.m193695a(xMPushService.getApplicationContext()).m193700e(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), 1001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(c14901gsM87077a.m86899a())) {
                intent.putExtra("messageId", c14901gsM87077a.m86899a());
                intent.putExtra("eventMessageType", 1000);
            }
        }
        if (C15031x.m88066b(c14911hbM87968a)) {
            tzq0.m193695a(xMPushService.getApplicationContext()).m193700e(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), 2001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(c14901gsM87077a.m86899a())) {
                intent.putExtra("messageId", c14901gsM87077a.m86899a());
                intent.putExtra("eventMessageType", 2000);
            }
        }
        if (C15031x.m88054a(c14911hbM87968a)) {
            tzq0.m193695a(xMPushService.getApplicationContext()).m193700e(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), 3001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(c14901gsM87077a.m86899a())) {
                intent.putExtra("messageId", c14901gsM87077a.m86899a());
                intent.putExtra("eventMessageType", 3000);
            }
        }
        if (c14901gsM87077a != null && !TextUtils.isEmpty(c14901gsM87077a.m86917c()) && !TextUtils.isEmpty(c14901gsM87077a.m86921d()) && c14901gsM87077a.f63032b != 1 && !C15031x.m88052a((Context) xMPushService, c14911hbM87968a.f63200b, C15031x.m88056a(c14901gsM87077a.m86900a()))) {
            Map<String, String> map = c14901gsM87077a.f63030a;
            String strM86899a = map != null ? map.get("jobkey") : null;
            if (TextUtils.isEmpty(strM86899a)) {
                strM86899a = c14901gsM87077a.m86899a();
            }
            if (C15032y.m88074a(xMPushService, c14911hbM87968a.f63200b, strM86899a)) {
                tzq0.m193695a(xMPushService.getApplicationContext()).m193704j(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), "1:" + strM86899a);
                ouq0.m169393m("drop a duplicate message, key=" + strM86899a);
            } else if (l4r0.m152825j(xMPushService) && C15029v.m87997a(c14911hbM87968a)) {
                ouq0.m169393m("receive pull down message");
            } else {
                m87969a(xMPushService, c14911hbM87968a, bArr);
            }
            m87983b(xMPushService, c14911hbM87968a);
        } else if ("com.xiaomi.xmsf".contains(c14911hbM87968a.f63200b) && !c14911hbM87968a.m87094b() && c14901gsM87077a != null && c14901gsM87077a.m86900a() != null && c14901gsM87077a.m86900a().containsKey("ab")) {
            m87983b(xMPushService, c14911hbM87968a);
            ouq0.m169406z("receive abtest message. ack it." + c14901gsM87077a.m86899a());
        } else if (m87981a(xMPushService, str, c14911hbM87968a, c14901gsM87077a)) {
            if (c14901gsM87077a != null && !TextUtils.isEmpty(c14901gsM87077a.m86899a())) {
                if (C15031x.m88066b(c14911hbM87968a)) {
                    tzq0.m193695a(xMPushService.getApplicationContext()).m193701f(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), 2002, null);
                } else if (C15031x.m88054a(c14911hbM87968a)) {
                    tzq0.m193695a(xMPushService.getApplicationContext()).m193702g(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), "7");
                } else if (C15031x.m88070c(c14911hbM87968a)) {
                    tzq0.m193695a(xMPushService.getApplicationContext()).m193702g(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
                } else if (C15031x.m88071d(c14911hbM87968a)) {
                    tzq0.m193695a(xMPushService.getApplicationContext()).m193701f(c14911hbM87968a.m87092b(), "E100003", c14901gsM87077a.m86899a(), 6004, null);
                }
            }
            if (EnumC14888gf.Notification == c14911hbM87968a.f63193a) {
                try {
                    interfaceC14925hqM87799a = C15007bc.m87799a(xMPushService, c14911hbM87968a);
                    if (interfaceC14925hqM87799a == null) {
                        ouq0.m169378B("receiving an un-recognized notification message. " + c14911hbM87968a.f63193a);
                    } else {
                        z = true;
                    }
                } catch (C14926hu e) {
                    ouq0.m169378B("receive a message which action string is not valid. " + e);
                }
                if (z && (interfaceC14925hqM87799a instanceof C14914he)) {
                    C14914he c14914he = (C14914he) interfaceC14925hqM87799a;
                    if (EnumC14898gp.CancelPushMessage.f62957a.equals(c14914he.f63234d) && c14914he.m87120a() != null) {
                        String str2 = c14914he.m87120a().get(AbstractC14991an.f63781Q);
                        int i = -2;
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                i = Integer.parseInt(str2);
                            } catch (NumberFormatException e2) {
                                ouq0.m169393m("parse notifyId from STRING to INT failed: " + e2);
                            }
                        }
                        if (i >= -1) {
                            ouq0.m169393m("try to retract a message by notifyId=" + i);
                            C15031x.m88043a(xMPushService, c14911hbM87968a.f63200b, i);
                        } else {
                            String str3 = c14914he.m87120a().get(AbstractC14991an.f63779O);
                            String str4 = c14914he.m87120a().get(AbstractC14991an.f63780P);
                            ouq0.m169393m("try to retract a message by title&description.");
                            C15031x.m88045a(xMPushService, c14911hbM87968a.f63200b, str3, str4);
                        }
                        if (c14901gsM87077a != null && c14901gsM87077a.m86900a() != null && l4r0.m152825j(xMPushService) && "pulldown".equals(C14984ag.m87632a((Object) c14901gsM87077a.m86900a()))) {
                            C15029v.m87994a(c14911hbM87968a);
                        }
                        m87971a(xMPushService, c14911hbM87968a, c14914he);
                    } else if (!EnumC14898gp.SettingAppNotificationPermission.f62957a.equals(c14914he.m87132c())) {
                        ouq0.m169393m("broadcast passthrough message.");
                        xMPushService.sendBroadcast(intent, C15030w.m88009a(c14911hbM87968a.f63200b));
                    } else if (l4r0.m152825j(xMPushService)) {
                        C15029v.m87993a(xMPushService, c14911hbM87968a, c14914he);
                    }
                } else {
                    ouq0.m169393m("broadcast passthrough message.");
                    xMPushService.sendBroadcast(intent, C15030w.m88009a(c14911hbM87968a.f63200b));
                }
            } else {
                ouq0.m169393m("broadcast passthrough message.");
                xMPushService.sendBroadcast(intent, C15030w.m88009a(c14911hbM87968a.f63200b));
            }
        } else {
            tzq0.m193695a(xMPushService.getApplicationContext()).m193702g(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), Constants.VIA_SHARE_TYPE_MINI_PROGRAM);
        }
        if (c14911hbM87968a.m87076a() != EnumC14888gf.UnRegistration || "com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
            return;
        }
        xMPushService.stopSelf();
    }

    /* JADX INFO: renamed from: b */
    private static void m87982b(Context context, C14911hb c14911hb, byte[] bArr) {
        if (C15031x.m88054a(c14911hb)) {
            return;
        }
        String strM88037a = C15031x.m88037a(c14911hb);
        if (TextUtils.isEmpty(strM88037a) || m87979a(context, strM88037a, bArr)) {
            return;
        }
        tzq0.m193695a(context).m193703i(strM88037a, C15031x.m88061b(c14911hb), c14911hb.m87077a().m86899a(), "1");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m87986c(C14911hb c14911hb) {
        if (c14911hb.m87077a() == null || c14911hb.m87077a().m86900a() == null) {
            return false;
        }
        return "1".equals(c14911hb.m87077a().m86900a().get("obslete_ads_message"));
    }

    /* JADX INFO: renamed from: d */
    private static void m87987d(final XMPushService xMPushService, final C14911hb c14911hb) {
        xMPushService.m87516a(new XMPushService.AbstractC14966j(4) { // from class: com.xiaomi.push.service.u.4
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                try {
                    C14911hb c14911hbM87966a = C15028u.m87966a((Context) xMPushService, c14911hb);
                    c14911hbM87966a.m87077a().m86902a("miui_message_unrecognized", "1");
                    C15030w.m88013a(xMPushService, c14911hbM87966a);
                } catch (C14885fi e) {
                    ouq0.m169397q(e);
                    xMPushService.m87515a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "send ack message for unrecognized new miui message.";
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private static void m87985c(final XMPushService xMPushService, final C14911hb c14911hb) {
        xMPushService.m87516a(new XMPushService.AbstractC14966j(4) { // from class: com.xiaomi.push.service.u.3
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                try {
                    C14911hb c14911hbM87966a = C15028u.m87966a((Context) xMPushService, c14911hb);
                    c14911hbM87966a.m87077a().m86902a("message_obsleted", "1");
                    C15030w.m88013a(xMPushService, c14911hbM87966a);
                } catch (C14885fi e) {
                    ouq0.m169397q(e);
                    xMPushService.m87515a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "send ack message for obsleted message.";
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private static boolean m87984b(C14911hb c14911hb) {
        Map<String, String> mapM86900a = c14911hb.m87077a().m86900a();
        return mapM86900a != null && mapM86900a.containsKey("notify_effect");
    }

    /* JADX INFO: renamed from: b */
    private static void m87983b(final XMPushService xMPushService, final C14911hb c14911hb) {
        xMPushService.m87516a(new XMPushService.AbstractC14966j(4) { // from class: com.xiaomi.push.service.u.2
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                Map<String, String> mapM87991a;
                try {
                    if (l4r0.m152825j(xMPushService)) {
                        try {
                            mapM87991a = C15029v.m87991a((Context) xMPushService, c14911hb);
                        } catch (Throwable th) {
                            ouq0.m169378B("error creating params for ack message :" + th);
                            mapM87991a = null;
                        }
                    } else {
                        mapM87991a = null;
                    }
                    C15030w.m88013a(xMPushService, C15028u.m87967a(xMPushService, c14911hb, mapM87991a));
                } catch (C14885fi e) {
                    ouq0.m169378B("error sending ack message :" + e);
                    xMPushService.m87515a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "send ack message for message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m87989a(XMPushService xMPushService, g2r0 g2r0Var, C14990am.b bVar) {
        if (g2r0Var instanceof f2r0) {
            f2r0 f2r0Var = (f2r0) g2r0Var;
            e2r0 e2r0VarM128643f = f2r0Var.m128643f(BLiveStormDanmakuGiftResourceType.f45294s);
            if (e2r0VarM128643f != null) {
                try {
                    m87975a(xMPushService, C14995ar.m87723a(C14995ar.m87722a(bVar.f63748h, f2r0Var.m128648l()), e2r0VarM128643f.m119163k()), p2r0.m170384b(g2r0Var.mo86749d()));
                    return;
                } catch (IllegalArgumentException e) {
                    ouq0.m169397q(e);
                    return;
                }
            }
            return;
        }
        ouq0.m169393m("not a mipush message");
    }

    /* JADX INFO: renamed from: a */
    public void m87990a(XMPushService xMPushService, w0r0 w0r0Var, C14990am.b bVar) {
        HashMap map;
        try {
            byte[] bArrM204333q = w0r0Var.m204333q(bVar.f63748h);
            if (AbstractC15011e.m87809b(w0r0Var)) {
                map = new HashMap();
                map.put("t_im", String.valueOf(w0r0Var.m204335s()));
                map.put("t_rt", String.valueOf(w0r0Var.m204321b()));
            } else {
                map = null;
            }
            m87976a(xMPushService, bArrM204333q, w0r0Var.mo107636x(), map);
        } catch (IllegalArgumentException e) {
            ouq0.m169397q(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m87975a(XMPushService xMPushService, byte[] bArr, long j) {
        m87976a(xMPushService, bArr, j, (Map<String, String>) null);
    }

    /* JADX INFO: renamed from: a */
    private static void m87976a(XMPushService xMPushService, byte[] bArr, long j, Map<String, String> map) {
        Map<String, String> mapM86900a;
        Map<String, String> mapM86900a2;
        byte[] bArrM87448e;
        C14911hb c14911hbM87968a = m87968a(bArr);
        if (c14911hbM87968a == null) {
            return;
        }
        if (TextUtils.isEmpty(c14911hbM87968a.f63200b)) {
            ouq0.m169393m("receive a mipush message without package name");
            return;
        }
        C14901gs c14901gsM87077a = c14911hbM87968a.m87077a();
        if (c14901gsM87077a != null && map != null && !map.isEmpty() && (mapM86900a2 = c14901gsM87077a.m86900a()) != null && !mapM86900a2.isEmpty()) {
            boolean z = false;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (mapM86900a2.containsKey(entry.getKey())) {
                    mapM86900a2.put(entry.getKey(), entry.getValue());
                    z = true;
                }
            }
            if (z && (bArrM87448e = C14936m.m87448e(c14911hbM87968a)) != null && bArrM87448e.length > 0) {
                bArr = bArrM87448e;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intent intentM87965a = m87965a(bArr, jCurrentTimeMillis);
        String strM88037a = C15031x.m88037a(c14911hbM87968a);
        p2r0.m170392j(xMPushService, strM88037a, j, true, true, System.currentTimeMillis());
        if (c14901gsM87077a != null && c14901gsM87077a.m86899a() != null) {
            ouq0.m169380D(String.format("receive a message. appid=%1$s, msgid= %2$s, action=%3$s", c14911hbM87968a.m87084a(), C14987aj.m87667a(c14901gsM87077a.m86899a()), c14911hbM87968a.m87076a()));
        }
        if (c14901gsM87077a != null) {
            c14901gsM87077a.m86902a("mrt", Long.toString(jCurrentTimeMillis));
        }
        EnumC14888gf enumC14888gf = EnumC14888gf.SendMessage;
        String strM86899a = "";
        if (enumC14888gf == c14911hbM87968a.m87076a() && C15024r.m87946a(xMPushService).m87948a(c14911hbM87968a.f63200b) && !C15031x.m88054a(c14911hbM87968a)) {
            if (c14901gsM87077a != null) {
                strM86899a = c14901gsM87077a.m86899a();
                if (C15031x.m88072e(c14911hbM87968a)) {
                    tzq0.m193695a(xMPushService.getApplicationContext()).m193702g(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), strM86899a, "1");
                }
            }
            ouq0.m169393m("Drop a message for unregistered, msgid=" + strM86899a);
            m87972a(xMPushService, c14911hbM87968a, c14911hbM87968a.f63200b);
            return;
        }
        if (enumC14888gf == c14911hbM87968a.m87076a() && C15024r.m87946a(xMPushService).m87952c(c14911hbM87968a.f63200b) && !C15031x.m88054a(c14911hbM87968a)) {
            if (c14901gsM87077a != null) {
                strM86899a = c14901gsM87077a.m86899a();
                if (C15031x.m88072e(c14911hbM87968a)) {
                    tzq0.m193695a(xMPushService.getApplicationContext()).m193702g(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), strM86899a, "2");
                }
            }
            ouq0.m169393m("Drop a message for push closed, msgid=" + strM86899a);
            m87972a(xMPushService, c14911hbM87968a, c14911hbM87968a.f63200b);
            return;
        }
        if (enumC14888gf == c14911hbM87968a.m87076a() && !TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") && !TextUtils.equals(xMPushService.getPackageName(), c14911hbM87968a.f63200b)) {
            ouq0.m169393m("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + c14911hbM87968a.f63200b);
            m87973a(xMPushService, c14911hbM87968a, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + c14911hbM87968a.f63200b);
            if (c14901gsM87077a == null || !C15031x.m88072e(c14911hbM87968a)) {
                return;
            }
            tzq0.m193695a(xMPushService.getApplicationContext()).m193702g(c14911hbM87968a.m87092b(), C15031x.m88061b(c14911hbM87968a), c14901gsM87077a.m86899a(), "3");
            return;
        }
        if (enumC14888gf == c14911hbM87968a.m87076a() && u3r0.m194395c() == 999 && u3r0.m194404l(xMPushService, strM88037a)) {
            ouq0.m169393m("Receive the uninstalled dual app message");
            try {
                C15030w.m88013a(xMPushService, C15030w.m88005a(strM88037a, c14911hbM87968a.m87084a()));
                ouq0.m169393m("uninstall " + strM88037a + " msg sent");
            } catch (C14885fi e) {
                ouq0.m169378B("Fail to send Message: " + e.getMessage());
                xMPushService.m87515a(10, e);
            }
            C15031x.m88042a((Context) xMPushService, strM88037a);
            return;
        }
        if (c14901gsM87077a != null && (mapM86900a = c14901gsM87077a.m86900a()) != null && mapM86900a.containsKey("hide") && "true".equalsIgnoreCase(mapM86900a.get("hide"))) {
            m87983b(xMPushService, c14911hbM87968a);
        } else {
            m87974a(xMPushService, strM88037a, bArr, intentM87965a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Intent m87965a(byte[] bArr, long j) {
        C14911hb c14911hbM87968a = m87968a(bArr);
        if (c14911hbM87968a == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(c14911hbM87968a.f63200b);
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public static C14911hb m87968a(byte[] bArr) {
        C14911hb c14911hb = new C14911hb();
        try {
            C14936m.m87447d(c14911hb, bArr);
            return c14911hb;
        } catch (Throwable th) {
            ouq0.m169397q(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87988a(Context context, C14990am.b bVar, boolean z, int i, String str) {
        C15022p c15022pM87936a;
        if (z || (c15022pM87936a = C15023q.m87936a(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        C15023q.m87937a(context, c15022pM87936a.f63943f, c15022pM87936a.f63941d, c15022pM87936a.f63942e);
    }

    /* JADX INFO: renamed from: a */
    public static void m87969a(Context context, C14911hb c14911hb, byte[] bArr) {
        Context context2;
        try {
            C15031x.c cVarM88035a = C15031x.m88035a(context, c14911hb, bArr);
            if (cVarM88035a.f63997a <= 0 || TextUtils.isEmpty(cVarM88035a.f63998a)) {
                context2 = context;
            } else {
                context2 = context;
                p2r0.m170392j(context2, cVarM88035a.f63998a, cVarM88035a.f63997a, true, false, System.currentTimeMillis());
            }
            if (l4r0.m152825j(context2) && C15029v.m87996a(context2, c14911hb, cVarM88035a.f63999a)) {
                C15029v.m87992a(context2, c14911hb);
                ouq0.m169393m("consume this broadcast by tts");
            } else {
                m87982b(context2, c14911hb, bArr);
            }
        } catch (Exception e) {
            ouq0.m169393m("notify push msg error " + e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87979a(Context context, String str, byte[] bArr) {
        if (C14887g.m86763l(context, str)) {
            Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
            intent.putExtra("mipush_payload", bArr);
            intent.setPackage(str);
            try {
                if (!context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                    ouq0.m169393m("broadcast message arrived.");
                    context.sendBroadcast(intent, C15030w.m88009a(str));
                    return true;
                }
            } catch (Exception e) {
                ouq0.m169393m("meet error when broadcast message arrived. " + e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87981a(XMPushService xMPushService, String str, C14911hb c14911hb, C14901gs c14901gs) {
        boolean z = true;
        if (c14901gs != null && c14901gs.m86900a() != null && c14901gs.m86900a().containsKey("__check_alive") && c14901gs.m86900a().containsKey("__awake")) {
            C14914he c14914he = new C14914he();
            c14914he.m87127b(c14911hb.m87084a());
            c14914he.m87135d(str);
            c14914he.m87131c(EnumC14898gp.AwakeSystemApp.f62957a);
            c14914he.m87114a(c14901gs.m86899a());
            c14914he.f63229a = new HashMap();
            boolean zM86763l = C14887g.m86763l(xMPushService.getApplicationContext(), str);
            c14914he.f63229a.put("app_running", Boolean.toString(zM86763l));
            if (!zM86763l) {
                boolean z2 = Boolean.parseBoolean(c14901gs.m86900a().get("__awake"));
                c14914he.f63229a.put("awaked", Boolean.toString(z2));
                if (!z2) {
                    z = false;
                }
            }
            try {
                C15030w.m88013a(xMPushService, C15030w.m88006a(c14911hb.m87092b(), c14911hb.m87084a(), c14914he, EnumC14888gf.Notification));
            } catch (C14885fi e) {
                ouq0.m169397q(e);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static void m87970a(final XMPushService xMPushService, final C14911hb c14911hb) {
        xMPushService.m87516a(new XMPushService.AbstractC14966j(4) { // from class: com.xiaomi.push.service.u.1
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                try {
                    C15030w.m88013a(xMPushService, C15030w.m88005a(c14911hb.m87092b(), c14911hb.m87084a()));
                } catch (C14885fi e) {
                    ouq0.m169397q(e);
                    xMPushService.m87515a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "send app absent message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87980a(C14911hb c14911hb) {
        return "com.xiaomi.xmsf".equals(c14911hb.f63200b) && c14911hb.m87077a() != null && c14911hb.m87077a().m86900a() != null && c14911hb.m87077a().m86900a().containsKey("miui_package_name");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87978a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            return (packageManager.queryBroadcastReceivers(intent2, 32).isEmpty() && packageManager.queryIntentServices(intent, 32).isEmpty()) ? false : true;
        } catch (Exception e) {
            ouq0.m169397q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m87972a(final XMPushService xMPushService, final C14911hb c14911hb, final String str) {
        xMPushService.m87516a(new XMPushService.AbstractC14966j(4) { // from class: com.xiaomi.push.service.u.5
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                try {
                    C14911hb c14911hbM87966a = C15028u.m87966a((Context) xMPushService, c14911hb);
                    c14911hbM87966a.m87077a().m86902a("absent_target_package", str);
                    C15030w.m88013a(xMPushService, c14911hbM87966a);
                } catch (C14885fi e) {
                    ouq0.m169397q(e);
                    xMPushService.m87515a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "send app absent ack message for message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static void m87973a(final XMPushService xMPushService, final C14911hb c14911hb, final String str, final String str2) {
        xMPushService.m87516a(new XMPushService.AbstractC14966j(4) { // from class: com.xiaomi.push.service.u.6
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                try {
                    C14911hb c14911hbM87966a = C15028u.m87966a((Context) xMPushService, c14911hb);
                    c14911hbM87966a.f63194a.m86902a("error", str);
                    c14911hbM87966a.f63194a.m86902a(Reason.TYPE, str2);
                    C15030w.m88013a(xMPushService, c14911hbM87966a);
                } catch (C14885fi e) {
                    ouq0.m169397q(e);
                    xMPushService.m87515a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "send wrong message ack for message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static void m87971a(final XMPushService xMPushService, final C14911hb c14911hb, final C14914he c14914he) {
        xMPushService.m87516a(new XMPushService.AbstractC14966j(4) { // from class: com.xiaomi.push.service.u.7
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                try {
                    C14905gw c14905gw = new C14905gw();
                    c14905gw.m86995c(EnumC14898gp.CancelPushMessageACK.f62957a);
                    c14905gw.m86985a(c14914he.m87119a());
                    c14905gw.m86984a(c14914he.m87113a());
                    c14905gw.m86992b(c14914he.m87128b());
                    c14905gw.m86999e(c14914he.m87136d());
                    c14905gw.m86983a(0L);
                    c14905gw.m86997d("success clear push message.");
                    C15030w.m88013a(xMPushService, C15030w.m88018b(c14911hb.m87092b(), c14911hb.m87084a(), c14905gw, EnumC14888gf.Notification));
                } catch (C14885fi e) {
                    ouq0.m169378B("clear push message. " + e);
                    xMPushService.m87515a(10, e);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "send ack message for clear push message.";
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C14911hb m87966a(Context context, C14911hb c14911hb) {
        return m87967a(context, c14911hb, (Map<String, String>) null);
    }

    /* JADX INFO: renamed from: a */
    public static C14911hb m87967a(Context context, C14911hb c14911hb, Map<String, String> map) {
        C14904gv c14904gv = new C14904gv();
        c14904gv.m86956b(c14911hb.m87084a());
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        if (c14901gsM87077a != null) {
            c14904gv.m86950a(c14901gsM87077a.m86899a());
            c14904gv.m86949a(c14901gsM87077a.m86894a());
            if (!TextUtils.isEmpty(c14901gsM87077a.m86909b())) {
                c14904gv.m86959c(c14901gsM87077a.m86909b());
            }
        }
        c14904gv.m86951a(C14936m.m87445b(context, c14911hb));
        C14911hb c14911hbM88006a = C15030w.m88006a(c14911hb.m87092b(), c14911hb.m87084a(), c14904gv, EnumC14888gf.AckMessage);
        C14901gs c14901gsM87077a2 = c14911hb.m87077a();
        if (c14901gsM87077a2 != null) {
            c14901gsM87077a2 = C14998au.m87739a(c14901gsM87077a2.m86895a());
            Map<String, String> mapM86900a = c14901gsM87077a2.m86900a();
            String str = mapM86900a != null ? mapM86900a.get("channel_id") : null;
            c14901gsM87077a2.m86902a("mat", Long.toString(System.currentTimeMillis()));
            c14901gsM87077a2.m86902a("cs", String.valueOf(C15012f.m87811a(context, c14911hb.f63200b, str)));
        }
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str2 : map.keySet()) {
                        c14901gsM87077a2.m86902a(str2, map.get(str2));
                    }
                }
            } catch (Throwable th) {
                ouq0.m169378B("error adding params to ack message :" + th);
            }
        }
        c14911hbM88006a.m87079a(c14901gsM87077a2);
        return c14911hbM88006a;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87977a(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }
}
