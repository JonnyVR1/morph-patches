package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14887g;
import com.xiaomi.push.C14900gr;
import com.xiaomi.push.C14901gs;
import com.xiaomi.push.C14904gv;
import com.xiaomi.push.C14905gw;
import com.xiaomi.push.C14910ha;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14912hc;
import com.xiaomi.push.C14913hd;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14916hg;
import com.xiaomi.push.C14918hi;
import com.xiaomi.push.C14920hk;
import com.xiaomi.push.C14922hm;
import com.xiaomi.push.C14924ho;
import com.xiaomi.push.C14926hu;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14880ed;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.EnumC14902gt;
import com.xiaomi.push.InterfaceC14925hq;
import com.xiaomi.push.service.AbstractC14991an;
import com.xiaomi.push.service.C14984ag;
import com.xiaomi.push.service.C14985ah;
import com.xiaomi.push.service.C14986ai;
import com.xiaomi.push.service.C14998au;
import com.xiaomi.push.service.C15013g;
import com.xiaomi.push.service.C15031x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import p153l.bvq0;
import p153l.jxq0;
import p153l.k4r0;
import p153l.k6r0;
import p153l.m5r0;
import p153l.n1r0;
import p153l.n5r0;
import p153l.nvq0;
import p153l.ouq0;
import p153l.psf;
import p153l.qmb0;
import p153l.s5r0;
import p153l.szq0;
import p153l.tzq0;
import p153l.u2r0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14869e {

    /* JADX INFO: renamed from: b */
    private static C14869e f62438b;

    /* JADX INFO: renamed from: c */
    private static Queue<String> f62439c;

    /* JADX INFO: renamed from: d */
    private static Object f62440d = new Object();

    /* JADX INFO: renamed from: a */
    private Context f62441a;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f62442a;

        static {
            int[] iArr = new int[EnumC14888gf.values().length];
            f62442a = iArr;
            try {
                iArr[EnumC14888gf.SendMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62442a[EnumC14888gf.Registration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62442a[EnumC14888gf.UnRegistration.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62442a[EnumC14888gf.Subscription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62442a[EnumC14888gf.UnSubscription.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62442a[EnumC14888gf.Command.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62442a[EnumC14888gf.Notification.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private C14869e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f62441a = applicationContext;
        if (applicationContext == null) {
            this.f62441a = context;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Intent m86534a(Context context, String str, Map<String, String> map, int i) {
        return C15031x.m88060b(context, str, map, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX INFO: renamed from: c */
    private PushMessageHandler.InterfaceC14863a m86535c(C14911hb c14911hb, boolean z, byte[] bArr, String str, int i, Intent intent) {
        MiPushMessage miPushMessage;
        String strM86865a;
        ArrayList arrayList = null;
        try {
            InterfaceC14925hq interfaceC14925hqM184809d = s5r0.m184809d(this.f62441a, c14911hb);
            if (interfaceC14925hqM184809d == null) {
                ouq0.m169378B("receiving an un-recognized message. " + c14911hb.f63193a);
                tzq0.m193695a(this.f62441a).m193703i(this.f62441a.getPackageName(), szq0.m188668e(i), str, "18");
                k4r0.m148291f(this.f62441a, c14911hb, z);
                return null;
            }
            EnumC14888gf enumC14888gfM87076a = c14911hb.m87076a();
            ouq0.m169396p("processing a message, action=", enumC14888gfM87076a, ", hasNotified=", Boolean.valueOf(z));
            switch (a.f62442a[enumC14888gfM87076a.ordinal()]) {
                case 1:
                    if (!c14911hb.m87094b()) {
                        ouq0.m169378B("receiving an un-encrypt message(SendMessage).");
                        return null;
                    }
                    if (C14867c.m86499c(this.f62441a).m86520w() && !z) {
                        ouq0.m169393m("receive a message in pause state. drop it");
                        tzq0.m193695a(this.f62441a).m193702g(this.f62441a.getPackageName(), szq0.m188668e(i), str, Constants.VIA_REPORT_TYPE_SET_AVATAR);
                        return null;
                    }
                    C14918hi c14918hi = (C14918hi) interfaceC14925hqM184809d;
                    C14900gr c14900grM87251a = c14918hi.m87251a();
                    if (c14900grM87251a == null) {
                        ouq0.m169378B("receive an empty message without push content, drop it");
                        tzq0.m193695a(this.f62441a).m193703i(this.f62441a.getPackageName(), szq0.m188668e(i), str, Constants.VIA_REPORT_TYPE_DATALINE);
                        k4r0.m148292g(this.f62441a, c14911hb, z);
                        return null;
                    }
                    int intExtra = intent.getIntExtra("notification_click_button", 0);
                    if (z) {
                        if (C15031x.m88054a(c14911hb)) {
                            MiPushClient.reportIgnoreRegMessageClicked(this.f62441a, c14900grM87251a.m86865a(), c14911hb.m87077a(), c14911hb.f63200b, c14900grM87251a.m86870b());
                        } else {
                            C14901gs c14901gs = c14911hb.m87077a() != null ? new C14901gs(c14911hb.m87077a()) : new C14901gs();
                            if (c14901gs.m86900a() == null) {
                                c14901gs.m86898a(new HashMap());
                            }
                            c14901gs.m86900a().put("notification_click_button", String.valueOf(intExtra));
                            MiPushClient.reportMessageClicked(this.f62441a, c14900grM87251a.m86865a(), c14901gs, c14900grM87251a.m86870b());
                        }
                    }
                    if (!z) {
                        if (!TextUtils.isEmpty(c14918hi.m87261d()) && MiPushClient.aliasSetTime(this.f62441a, c14918hi.m87261d()) < 0) {
                            MiPushClient.addAlias(this.f62441a, c14918hi.m87261d());
                        } else if (!TextUtils.isEmpty(c14918hi.m87259c()) && MiPushClient.topicSubscribedTime(this.f62441a, c14918hi.m87259c()) < 0) {
                            MiPushClient.addTopic(this.f62441a, c14918hi.m87259c());
                        }
                    }
                    C14901gs c14901gs2 = c14911hb.f63194a;
                    ?? r9 = (c14901gs2 == null || c14901gs2.m86900a() == null) ? arrayList : c14911hb.f63194a.f63030a.get("jobkey");
                    ?? r10 = r9;
                    boolean zIsEmpty = TextUtils.isEmpty(r9);
                    ?? r11 = r9;
                    if (zIsEmpty) {
                        strM86865a = c14900grM87251a.m86865a();
                    }
                    if (z || !m86544m(this.f62441a, r11)) {
                        r11 = strM86865a;
                        r11 = strM86865a;
                        MiPushMessage miPushMessageM177072b = qmb0.m177072b(c14918hi, c14911hb.m87077a(), z);
                        if (miPushMessageM177072b.getPassThrough() == 0 && !z && C15031x.m88056a(miPushMessageM177072b.getExtra())) {
                            C15031x.m88035a(this.f62441a, c14911hb, bArr);
                            return arrayList;
                        }
                        String strM88038a = C15031x.m88038a(miPushMessageM177072b.getExtra(), intExtra);
                        ouq0.m169396p("receive a message, msgid=", c14900grM87251a.m86865a(), ", jobkey=", r11, ", btn=", Integer.valueOf(intExtra), ", typeId=", strM88038a, ", hasNotified=", Boolean.valueOf(z));
                        if (z && miPushMessageM177072b.getExtra() != null && !TextUtils.isEmpty(strM88038a)) {
                            Map<String, String> extra = miPushMessageM177072b.getExtra();
                            if (intExtra != 0 && c14911hb.m87077a() != null) {
                                C14870f.m86573h(this.f62441a).m86599o(c14911hb.m87077a().m86914c(), intExtra);
                            }
                            boolean zM88054a = C15031x.m88054a(c14911hb);
                            Context context = this.f62441a;
                            if (zM88054a) {
                                ?? M86534a = m86534a(context, c14911hb.f63200b, extra, intExtra);
                                M86534a.putExtra("eventMessageType", i);
                                M86534a.putExtra("messageId", str);
                                M86534a.putExtra("jobkey", r10);
                                String strM86873c = c14900grM87251a.m86873c();
                                if (!TextUtils.isEmpty(strM86873c)) {
                                    M86534a.putExtra("payload", strM86873c);
                                }
                                this.f62441a.startActivity(M86534a);
                                k4r0.m148287b(this.f62441a, c14911hb);
                                tzq0.m193695a(this.f62441a).m193701f(this.f62441a.getPackageName(), szq0.m188668e(i), str, 3006, strM88038a);
                                ouq0.m169394n("PushMessageProcessor", "start business activity succ");
                            } else {
                                ?? M86534a2 = m86534a(context, context.getPackageName(), extra, intExtra);
                                if (M86534a2 != 0) {
                                    if (!strM88038a.equals(AbstractC14991an.f63785c)) {
                                        M86534a2.putExtra("key_message", miPushMessageM177072b);
                                        M86534a2.putExtra("eventMessageType", i);
                                        M86534a2.putExtra("messageId", str);
                                        M86534a2.putExtra("jobkey", r10);
                                    }
                                    this.f62441a.startActivity(M86534a2);
                                    k4r0.m148287b(this.f62441a, c14911hb);
                                    ouq0.m169394n("PushMessageProcessor", "start activity succ");
                                    tzq0.m193695a(this.f62441a).m193701f(this.f62441a.getPackageName(), szq0.m188668e(i), str, 1006, strM88038a);
                                    if (strM88038a.equals(AbstractC14991an.f63785c)) {
                                        tzq0.m193695a(this.f62441a).m193702g(this.f62441a.getPackageName(), szq0.m188668e(i), str, Constants.VIA_REPORT_TYPE_JOININ_GROUP);
                                    }
                                } else {
                                    ouq0.m169379C("PushMessageProcessor", "missing target intent for message: " + c14900grM87251a.m86865a() + ", typeId=" + strM88038a);
                                }
                            }
                            ouq0.m169394n("PushMessageProcessor", "pre-def msg process done.");
                            return arrayList;
                        }
                        miPushMessage = miPushMessageM177072b;
                    } else {
                        r11 = strM86865a;
                        ouq0.m169393m("drop a duplicate message, key=" + r11);
                        tzq0.m193695a(this.f62441a).m193704j(this.f62441a.getPackageName(), szq0.m188668e(i), str, "2:" + r11);
                        miPushMessage = null;
                    }
                    if (c14911hb.m87077a() == null && !z) {
                        m86542k(c14918hi, c14911hb);
                    }
                    return miPushMessage;
                case 2:
                    C14916hg c14916hg = (C14916hg) interfaceC14925hqM184809d;
                    String str2 = C14867c.m86499c(this.f62441a).f62419d;
                    if (TextUtils.isEmpty(str2) || !TextUtils.equals(str2, c14916hg.m87207a())) {
                        ouq0.m169393m("bad Registration result:");
                        tzq0.m193695a(this.f62441a).m193703i(this.f62441a.getPackageName(), szq0.m188668e(i), str, "21");
                        return null;
                    }
                    long jM86594b = C14870f.m86573h(this.f62441a).m86594b();
                    if (jM86594b > 0 && SystemClock.elapsedRealtime() - jM86594b > 900000) {
                        ouq0.m169393m("The received registration result has expired.");
                        tzq0.m193695a(this.f62441a).m193703i(this.f62441a.getPackageName(), szq0.m188668e(i), str, Constants.VIA_REPORT_TYPE_CHAT_VIDEO);
                        return null;
                    }
                    C14867c.m86499c(this.f62441a).f62419d = null;
                    long j = c14916hg.f63322a;
                    Context context2 = this.f62441a;
                    if (j == 0) {
                        C14867c.m86499c(context2).m86513o(c14916hg.f63334e, c14916hg.f63335f, c14916hg.f63341l);
                        psf.m173641a(this.f62441a);
                        tzq0.m193695a(this.f62441a).m193701f(this.f62441a.getPackageName(), szq0.m188668e(i), str, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR, "1");
                    } else {
                        tzq0.m193695a(context2).m193701f(this.f62441a.getPackageName(), szq0.m188668e(i), str, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR, "2");
                    }
                    if (!TextUtils.isEmpty(c14916hg.f63334e)) {
                        arrayList = new ArrayList();
                        arrayList.add(c14916hg.f63334e);
                    }
                    MiPushCommandMessage miPushCommandMessageM177071a = qmb0.m177071a(EnumC14880ed.COMMAND_REGISTER.f62514a, arrayList, c14916hg.f63322a, c14916hg.f63333d, null, c14916hg.m87208a());
                    C14870f.m86573h(this.f62441a).m86593X();
                    return miPushCommandMessageM177071a;
                case 3:
                    if (!c14911hb.m87094b()) {
                        ouq0.m169378B("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                    if (((C14922hm) interfaceC14925hqM184809d).f63457a == 0) {
                        C14867c.m86499c(this.f62441a).m86503e();
                        MiPushClient.clearExtras(this.f62441a);
                    }
                    PushMessageHandler.m86457a();
                    return null;
                case 4:
                    C14920hk c14920hk = (C14920hk) interfaceC14925hqM184809d;
                    if (c14920hk.f63411a == 0) {
                        MiPushClient.addTopic(this.f62441a, c14920hk.m87295b());
                    }
                    if (!TextUtils.isEmpty(c14920hk.m87295b())) {
                        arrayList = new ArrayList();
                        arrayList.add(c14920hk.m87295b());
                    }
                    StringBuilder sb = new StringBuilder("resp-cmd:");
                    EnumC14880ed enumC14880ed = EnumC14880ed.COMMAND_SUBSCRIBE_TOPIC;
                    sb.append(enumC14880ed);
                    sb.append(", ");
                    sb.append(c14920hk.m87290a());
                    ouq0.m169380D(sb.toString());
                    return qmb0.m177071a(enumC14880ed.f62514a, arrayList, c14920hk.f63411a, c14920hk.f63417d, c14920hk.m87297c(), null);
                case 5:
                    C14924ho c14924ho = (C14924ho) interfaceC14925hqM184809d;
                    if (c14924ho.f63494a == 0) {
                        MiPushClient.removeTopic(this.f62441a, c14924ho.m87365b());
                    }
                    if (!TextUtils.isEmpty(c14924ho.m87365b())) {
                        arrayList = new ArrayList();
                        arrayList.add(c14924ho.m87365b());
                    }
                    StringBuilder sb2 = new StringBuilder("resp-cmd:");
                    EnumC14880ed enumC14880ed2 = EnumC14880ed.COMMAND_UNSUBSCRIBE_TOPIC;
                    sb2.append(enumC14880ed2);
                    sb2.append(", ");
                    sb2.append(c14924ho.m87360a());
                    ouq0.m169380D(sb2.toString());
                    return qmb0.m177071a(enumC14880ed2.f62514a, arrayList, c14924ho.f63494a, c14924ho.f63500d, c14924ho.m87367c(), null);
                case 6:
                    jxq0.m147394f(this.f62441a.getPackageName(), this.f62441a, interfaceC14925hqM184809d, EnumC14888gf.Command, bArr.length);
                    C14910ha c14910ha = (C14910ha) interfaceC14925hqM184809d;
                    String strM87063b = c14910ha.m87063b();
                    List<String> listM87058a = c14910ha.m87058a();
                    if (c14910ha.f63173a == 0) {
                        if (TextUtils.equals(strM87063b, EnumC14880ed.COMMAND_SET_ACCEPT_TIME.f62514a) && listM87058a != null && listM87058a.size() > 1) {
                            MiPushClient.addAcceptTime(this.f62441a, listM87058a.get(0), listM87058a.get(1));
                            if ("00:00".equals(listM87058a.get(0)) && "00:00".equals(listM87058a.get(1))) {
                                C14867c.m86499c(this.f62441a).m86508j(true);
                            } else {
                                C14867c.m86499c(this.f62441a).m86508j(false);
                            }
                            listM87058a = m86550f(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), listM87058a);
                        } else if (TextUtils.equals(strM87063b, EnumC14880ed.COMMAND_SET_ALIAS.f62514a) && listM87058a != null && listM87058a.size() > 0) {
                            MiPushClient.addAlias(this.f62441a, listM87058a.get(0));
                        } else if (TextUtils.equals(strM87063b, EnumC14880ed.COMMAND_UNSET_ALIAS.f62514a) && listM87058a != null && listM87058a.size() > 0) {
                            MiPushClient.removeAlias(this.f62441a, listM87058a.get(0));
                        } else if (TextUtils.equals(strM87063b, EnumC14880ed.COMMAND_SET_ACCOUNT.f62514a) && listM87058a != null && listM87058a.size() > 0) {
                            MiPushClient.addAccount(this.f62441a, listM87058a.get(0));
                        } else if (TextUtils.equals(strM87063b, EnumC14880ed.COMMAND_UNSET_ACCOUNT.f62514a) && listM87058a != null && listM87058a.size() > 0) {
                            MiPushClient.removeAccount(this.f62441a, listM87058a.get(0));
                        } else if (TextUtils.equals(strM87063b, EnumC14880ed.COMMAND_CHK_VDEVID.f62514a)) {
                            return null;
                        }
                    }
                    ouq0.m169380D("resp-cmd:" + strM87063b + ", " + c14910ha.m87057a());
                    return qmb0.m177071a(strM87063b, listM87058a, c14910ha.f63173a, c14910ha.f63181d, c14910ha.m87066c(), null);
                case 7:
                    jxq0.m147394f(this.f62441a.getPackageName(), this.f62441a, interfaceC14925hqM184809d, EnumC14888gf.Notification, bArr.length);
                    if (interfaceC14925hqM184809d instanceof C14905gw) {
                        C14905gw c14905gw = (C14905gw) interfaceC14925hqM184809d;
                        String strM86986a = c14905gw.m86986a();
                        ouq0.m169380D("resp-type:" + c14905gw.m86993b() + ", code:" + c14905gw.f63112a + ", " + strM86986a);
                        if (EnumC14898gp.DisablePushMessage.f62957a.equalsIgnoreCase(c14905gw.f63119d)) {
                            if (c14905gw.f63112a == 0) {
                                synchronized (m5r0.class) {
                                    try {
                                        if (m5r0.m157115c(this.f62441a).m157120f(strM86986a)) {
                                            m5r0.m157115c(this.f62441a).m157122h(strM86986a);
                                            m5r0 m5r0VarM157115c = m5r0.m157115c(this.f62441a);
                                            EnumC14874v enumC14874v = EnumC14874v.DISABLE_PUSH;
                                            if ("syncing".equals(m5r0VarM157115c.m157117b(enumC14874v))) {
                                                m5r0.m157115c(this.f62441a).m157118d(enumC14874v, "synced");
                                                MiPushClient.clearNotification(this.f62441a);
                                                MiPushClient.clearLocalNotificationType(this.f62441a);
                                                PushMessageHandler.m86457a();
                                                C14870f.m86573h(this.f62441a).m86589N();
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else if ("syncing".equals(m5r0.m157115c(this.f62441a).m157117b(EnumC14874v.DISABLE_PUSH))) {
                                synchronized (m5r0.class) {
                                    try {
                                        if (m5r0.m157115c(this.f62441a).m157120f(strM86986a)) {
                                            int iM157116a = m5r0.m157115c(this.f62441a).m157116a(strM86986a);
                                            Context context3 = this.f62441a;
                                            if (iM157116a < 10) {
                                                m5r0.m157115c(context3).m157121g(strM86986a);
                                                C14870f.m86573h(this.f62441a).m86586I(true, strM86986a);
                                            } else {
                                                m5r0.m157115c(context3).m157122h(strM86986a);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } else {
                                m5r0.m157115c(this.f62441a).m157122h(strM86986a);
                            }
                            break;
                        } else if (EnumC14898gp.EnablePushMessage.f62957a.equalsIgnoreCase(c14905gw.f63119d)) {
                            if (c14905gw.f63112a == 0) {
                                synchronized (m5r0.class) {
                                    try {
                                        if (m5r0.m157115c(this.f62441a).m157120f(strM86986a)) {
                                            m5r0.m157115c(this.f62441a).m157122h(strM86986a);
                                            m5r0 m5r0VarM157115c2 = m5r0.m157115c(this.f62441a);
                                            EnumC14874v enumC14874v2 = EnumC14874v.ENABLE_PUSH;
                                            if ("syncing".equals(m5r0VarM157115c2.m157117b(enumC14874v2))) {
                                                m5r0.m157115c(this.f62441a).m157118d(enumC14874v2, "synced");
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            } else if ("syncing".equals(m5r0.m157115c(this.f62441a).m157117b(EnumC14874v.ENABLE_PUSH))) {
                                synchronized (m5r0.class) {
                                    try {
                                        if (m5r0.m157115c(this.f62441a).m157120f(strM86986a)) {
                                            int iM157116a2 = m5r0.m157115c(this.f62441a).m157116a(strM86986a);
                                            Context context4 = this.f62441a;
                                            if (iM157116a2 < 10) {
                                                m5r0.m157115c(context4).m157121g(strM86986a);
                                                C14870f.m86573h(this.f62441a).m86586I(false, strM86986a);
                                            } else {
                                                m5r0.m157115c(context4).m157122h(strM86986a);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                            } else {
                                m5r0.m157115c(this.f62441a).m157122h(strM86986a);
                            }
                            break;
                        } else if (EnumC14898gp.ThirdPartyRegUpdate.f62957a.equalsIgnoreCase(c14905gw.f63119d)) {
                            m86546o(c14905gw);
                        } else if (EnumC14898gp.UploadTinyData.f62957a.equalsIgnoreCase(c14905gw.f63119d)) {
                            m86539h(c14905gw);
                        }
                    } else if (interfaceC14925hqM184809d instanceof C14914he) {
                        C14914he c14914he = (C14914he) interfaceC14925hqM184809d;
                        if ("registration id expired".equalsIgnoreCase(c14914he.f63234d)) {
                            List<String> allAlias = MiPushClient.getAllAlias(this.f62441a);
                            List<String> allTopic = MiPushClient.getAllTopic(this.f62441a);
                            List<String> allUserAccount = MiPushClient.getAllUserAccount(this.f62441a);
                            String acceptTime = MiPushClient.getAcceptTime(this.f62441a);
                            ouq0.m169380D("resp-type:" + c14914he.f63234d + ", " + c14914he.m87119a());
                            MiPushClient.reInitialize(this.f62441a, EnumC14902gt.RegIdExpired);
                            for (String str3 : allAlias) {
                                MiPushClient.removeAlias(this.f62441a, str3);
                                MiPushClient.setAlias(this.f62441a, str3, null);
                            }
                            for (String str4 : allTopic) {
                                MiPushClient.removeTopic(this.f62441a, str4);
                                MiPushClient.subscribe(this.f62441a, str4, null);
                            }
                            for (String str5 : allUserAccount) {
                                MiPushClient.removeAccount(this.f62441a, str5);
                                MiPushClient.setUserAccount(this.f62441a, str5, null);
                            }
                            String[] strArrSplit = acceptTime.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                            if (strArrSplit.length == 2) {
                                MiPushClient.removeAcceptTime(this.f62441a);
                                MiPushClient.addAcceptTime(this.f62441a, strArrSplit[0], strArrSplit[1]);
                            }
                        } else if (!EnumC14898gp.ClientInfoUpdateOk.f62957a.equalsIgnoreCase(c14914he.f63234d)) {
                            try {
                                if (EnumC14898gp.NormalClientConfigUpdate.f62957a.equalsIgnoreCase(c14914he.f63234d)) {
                                    C14913hd c14913hd = new C14913hd();
                                    C14936m.m87447d(c14913hd, c14914he.m87126a());
                                    C14986ai.m87665a(C14985ah.m87648a(this.f62441a), c14913hd);
                                } else if (EnumC14898gp.CustomClientConfigUpdate.f62957a.equalsIgnoreCase(c14914he.f63234d)) {
                                    C14912hc c14912hc = new C14912hc();
                                    C14936m.m87447d(c14912hc, c14914he.m87126a());
                                    C14986ai.m87664a(C14985ah.m87648a(this.f62441a), c14912hc);
                                } else if (EnumC14898gp.SyncInfoResult.f62957a.equalsIgnoreCase(c14914he.f63234d)) {
                                    k6r0.m148563c(this.f62441a, c14914he);
                                } else if (EnumC14898gp.ForceSync.f62957a.equalsIgnoreCase(c14914he.f63234d)) {
                                    ouq0.m169393m("receive force sync notification");
                                    k6r0.m148564d(this.f62441a, false);
                                } else if (EnumC14898gp.CancelPushMessage.f62957a.equals(c14914he.f63234d)) {
                                    ouq0.m169380D("resp-type:" + c14914he.f63234d + ", " + c14914he.m87119a());
                                    if (c14914he.m87120a() != null) {
                                        int i2 = -2;
                                        if (c14914he.m87120a().containsKey(AbstractC14991an.f63781Q)) {
                                            String str6 = c14914he.m87120a().get(AbstractC14991an.f63781Q);
                                            if (!TextUtils.isEmpty(str6)) {
                                                try {
                                                    i2 = Integer.parseInt(str6);
                                                } catch (NumberFormatException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                        if (i2 >= -1) {
                                            MiPushClient.clearNotification(this.f62441a, i2);
                                        } else {
                                            MiPushClient.clearNotification(this.f62441a, c14914he.m87120a().containsKey(AbstractC14991an.f63779O) ? c14914he.m87120a().get(AbstractC14991an.f63779O) : "", c14914he.m87120a().containsKey(AbstractC14991an.f63780P) ? c14914he.m87120a().get(AbstractC14991an.f63780P) : "");
                                        }
                                    }
                                    m86541j(c14914he);
                                    break;
                                } else if (EnumC14898gp.HybridRegisterResult.f62957a.equals(c14914he.f63234d)) {
                                    try {
                                        C14916hg c14916hg2 = new C14916hg();
                                        C14936m.m87447d(c14916hg2, c14914he.m87126a());
                                        C14865a.m86476a(this.f62441a, c14916hg2);
                                    } catch (C14926hu e2) {
                                        ouq0.m169397q(e2);
                                    }
                                    break;
                                } else if (EnumC14898gp.HybridUnregisterResult.f62957a.equals(c14914he.f63234d)) {
                                    try {
                                        C14922hm c14922hm = new C14922hm();
                                        C14936m.m87447d(c14922hm, c14914he.m87126a());
                                        C14865a.m86477b(this.f62441a, c14922hm);
                                    } catch (C14926hu e3) {
                                        ouq0.m169397q(e3);
                                    }
                                    break;
                                } else if (!EnumC14898gp.PushLogUpload.f62957a.equals(c14914he.f63234d)) {
                                    if (EnumC14898gp.DetectAppAlive.f62957a.equals(c14914he.f63234d)) {
                                        ouq0.m169403w("receive detect msg");
                                        m86548q(c14914he);
                                    } else if (C15013g.m87827a(c14914he)) {
                                        ouq0.m169403w("receive notification handle by cpra");
                                    }
                                }
                                break;
                            } catch (C14926hu unused) {
                            }
                        } else if (c14914he.m87120a() != null && c14914he.m87120a().containsKey("app_version")) {
                            C14867c.m86499c(this.f62441a).m86505g(c14914he.m87120a().get("app_version"));
                        }
                    }
                    return null;
                default:
                    return null;
            }
        } catch (C14871l e4) {
            ouq0.m169397q(e4);
            m86540i(c14911hb);
            tzq0.m193695a(this.f62441a).m193703i(this.f62441a.getPackageName(), szq0.m188668e(i), str, Constants.VIA_ACT_TYPE_NINETEEN);
            k4r0.m148291f(this.f62441a, c14911hb, z);
            return null;
        } catch (C14926hu e5) {
            ouq0.m169397q(e5);
            ouq0.m169378B("receive a message which action string is not valid. is the reg expired?");
            tzq0.m193695a(this.f62441a).m193703i(this.f62441a.getPackageName(), szq0.m188668e(i), str, "20");
            k4r0.m148291f(this.f62441a, c14911hb, z);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private PushMessageHandler.InterfaceC14863a m86536d(C14911hb c14911hb, byte[] bArr) {
        String str = null;
        try {
            InterfaceC14925hq interfaceC14925hqM184809d = s5r0.m184809d(this.f62441a, c14911hb);
            if (interfaceC14925hqM184809d == null) {
                ouq0.m169378B("message arrived: receiving an un-recognized message. " + c14911hb.f63193a);
                return null;
            }
            EnumC14888gf enumC14888gfM87076a = c14911hb.m87076a();
            ouq0.m169393m("message arrived: processing an arrived message, action=" + enumC14888gfM87076a);
            if (a.f62442a[enumC14888gfM87076a.ordinal()] != 1) {
                return null;
            }
            if (!c14911hb.m87094b()) {
                ouq0.m169378B("message arrived: receiving an un-encrypt message(SendMessage).");
                return null;
            }
            C14918hi c14918hi = (C14918hi) interfaceC14925hqM184809d;
            C14900gr c14900grM87251a = c14918hi.m87251a();
            if (c14900grM87251a == null) {
                ouq0.m169378B("message arrived: receive an empty message without push content, drop it");
                return null;
            }
            C14901gs c14901gs = c14911hb.f63194a;
            if (c14901gs != null && c14901gs.m86900a() != null) {
                str = c14911hb.f63194a.f63030a.get("jobkey");
            }
            MiPushMessage miPushMessageM177072b = qmb0.m177072b(c14918hi, c14911hb.m87077a(), false);
            miPushMessageM177072b.setArrivedMessage(true);
            ouq0.m169393m("message arrived: receive a message, msgid=" + c14900grM87251a.m86865a() + ", jobkey=" + str);
            return miPushMessageM177072b;
        } catch (C14871l e) {
            ouq0.m169397q(e);
            ouq0.m169378B("message arrived: receive a message but decrypt failed. report when click.");
            return null;
        } catch (C14926hu e2) {
            ouq0.m169397q(e2);
            ouq0.m169378B("message arrived: receive a message which action string is not valid. is the reg expired?");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C14869e m86537e(Context context) {
        if (f62438b == null) {
            f62438b = new C14869e(context);
        }
        return f62438b;
    }

    /* JADX INFO: renamed from: g */
    private void m86538g() {
        SharedPreferences sharedPreferences = this.f62441a.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - sharedPreferences.getLong("last_reinitialize", 0L)) > 1800000) {
            MiPushClient.reInitialize(this.f62441a, EnumC14902gt.PackageUnregistered);
            sharedPreferences.edit().putLong("last_reinitialize", jCurrentTimeMillis).commit();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m86539h(C14905gw c14905gw) {
        String strM86986a = c14905gw.m86986a();
        ouq0.m169403w("receive ack " + strM86986a);
        Map<String, String> mapM86987a = c14905gw.m86987a();
        if (mapM86987a != null) {
            String str = mapM86987a.get("real_source");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ouq0.m169403w("receive ack : messageId = " + strM86986a + "  realSource = " + str);
            nvq0.m164913d(this.f62441a).m164922h(strM86986a, str, Boolean.valueOf(c14905gw.f63112a == 0));
        }
    }

    /* JADX INFO: renamed from: i */
    private void m86540i(C14911hb c14911hb) {
        ouq0.m169393m("receive a message but decrypt failed. report now.");
        C14914he c14914he = new C14914he(c14911hb.m87077a().f63028a, false);
        c14914he.m87131c(EnumC14898gp.DecryptMessageFail.f62957a);
        c14914he.m87127b(c14911hb.m87084a());
        c14914he.m87135d(c14911hb.f63200b);
        HashMap map = new HashMap();
        c14914he.f63229a = map;
        map.put("regid", MiPushClient.getRegId(this.f62441a));
        C14870f.m86573h(this.f62441a).m86608y(c14914he, EnumC14888gf.Notification, false, null);
    }

    /* JADX INFO: renamed from: j */
    private void m86541j(C14914he c14914he) {
        C14905gw c14905gw = new C14905gw();
        c14905gw.m86995c(EnumC14898gp.CancelPushMessageACK.f62957a);
        c14905gw.m86985a(c14914he.m87119a());
        c14905gw.m86984a(c14914he.m87113a());
        c14905gw.m86992b(c14914he.m87128b());
        c14905gw.m86999e(c14914he.m87136d());
        c14905gw.m86983a(0L);
        c14905gw.m86997d("success clear push message.");
        C14870f.m86573h(this.f62441a).m86581C(c14905gw, EnumC14888gf.Notification, false, true, null, false, this.f62441a.getPackageName(), C14867c.m86499c(this.f62441a).m86502d(), false);
    }

    /* JADX INFO: renamed from: k */
    private void m86542k(C14918hi c14918hi, C14911hb c14911hb) {
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        if (c14901gsM87077a != null) {
            c14901gsM87077a = C14998au.m87739a(c14901gsM87077a.m86895a());
        }
        C14904gv c14904gv = new C14904gv();
        c14904gv.m86956b(c14918hi.m87257b());
        c14904gv.m86950a(c14918hi.m87252a());
        c14904gv.m86949a(c14918hi.m87251a().m86864a());
        if (!TextUtils.isEmpty(c14918hi.m87259c())) {
            c14904gv.m86959c(c14918hi.m87259c());
        }
        if (!TextUtils.isEmpty(c14918hi.m87261d())) {
            c14904gv.m86962d(c14918hi.m87261d());
        }
        c14904gv.m86951a(C14936m.m87445b(this.f62441a, c14911hb));
        C14870f.m86573h(this.f62441a).m86606w(c14904gv, EnumC14888gf.AckMessage, c14901gsM87077a);
    }

    /* JADX INFO: renamed from: l */
    private void m86543l(String str, long j, EnumC14868d enumC14868d) {
        EnumC14874v enumC14874vM194296a = u2r0.m194296a(enumC14868d);
        if (enumC14874vM194296a == null) {
            return;
        }
        if (j == 0) {
            synchronized (m5r0.class) {
                try {
                    if (m5r0.m157115c(this.f62441a).m157120f(str)) {
                        m5r0.m157115c(this.f62441a).m157122h(str);
                        if ("syncing".equals(m5r0.m157115c(this.f62441a).m157117b(enumC14874vM194296a))) {
                            m5r0.m157115c(this.f62441a).m157118d(enumC14874vM194296a, "synced");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"syncing".equals(m5r0.m157115c(this.f62441a).m157117b(enumC14874vM194296a))) {
            m5r0.m157115c(this.f62441a).m157122h(str);
            return;
        }
        synchronized (m5r0.class) {
            try {
                if (m5r0.m157115c(this.f62441a).m157120f(str)) {
                    int iM157116a = m5r0.m157115c(this.f62441a).m157116a(str);
                    Context context = this.f62441a;
                    if (iM157116a < 10) {
                        m5r0.m157115c(context).m157121g(str);
                        C14870f.m86573h(this.f62441a).m86583E(str, enumC14874vM194296a, enumC14868d, "retry");
                    } else {
                        m5r0.m157115c(context).m157122h(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private static boolean m86544m(Context context, String str) {
        synchronized (f62440d) {
            try {
                C14867c.m86499c(context);
                SharedPreferences sharedPreferencesM86498b = C14867c.m86498b(context);
                if (f62439c == null) {
                    String[] strArrSplit = sharedPreferencesM86498b.getString("pref_msg_ids", "").split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                    f62439c = new LinkedList();
                    for (String str2 : strArrSplit) {
                        f62439c.add(str2);
                    }
                }
                if (f62439c.contains(str)) {
                    return true;
                }
                f62439c.add(str);
                if (f62439c.size() > 25) {
                    f62439c.poll();
                }
                String strM106590d = bvq0.m106590d(f62439c, com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                SharedPreferences.Editor editorEdit = sharedPreferencesM86498b.edit();
                editorEdit.putString("pref_msg_ids", strM106590d);
                n5r0.m161732a(editorEdit);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m86545n(C14911hb c14911hb) {
        Map<String, String> mapM86900a = c14911hb.m87077a() == null ? null : c14911hb.m87077a().m86900a();
        if (mapM86900a == null) {
            return false;
        }
        String str = mapM86900a.get("push_server_action");
        return TextUtils.equals(str, "hybrid_message") || TextUtils.equals(str, "platform_message");
    }

    /* JADX INFO: renamed from: o */
    private void m86546o(C14905gw c14905gw) {
        ouq0.m169406z("ASSEMBLE_PUSH : " + c14905gw.toString());
        String strM86986a = c14905gw.m86986a();
        Map<String, String> mapM86987a = c14905gw.m86987a();
        if (mapM86987a != null) {
            String str = mapM86987a.get("RegInfo");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("brand:" + EnumC14873q.FCM.name())) {
                ouq0.m169393m("ASSEMBLE_PUSH : receive fcm token sync ack");
                Context context = this.f62441a;
                EnumC14868d enumC14868d = EnumC14868d.ASSEMBLE_PUSH_FCM;
                n1r0.m161141m(context, enumC14868d, str);
                m86543l(strM86986a, c14905gw.f63112a, enumC14868d);
                return;
            }
            StringBuilder sb = new StringBuilder("brand:");
            EnumC14873q enumC14873q = EnumC14873q.HUAWEI;
            sb.append(enumC14873q.name());
            if (!str.contains(sb.toString())) {
                if (!str.contains("channel:" + enumC14873q.name())) {
                    StringBuilder sb2 = new StringBuilder("brand:");
                    EnumC14873q enumC14873q2 = EnumC14873q.OPPO;
                    sb2.append(enumC14873q2.name());
                    if (!str.contains(sb2.toString())) {
                        if (!str.contains("channel:" + enumC14873q2.name())) {
                            StringBuilder sb3 = new StringBuilder("brand:");
                            EnumC14873q enumC14873q3 = EnumC14873q.VIVO;
                            sb3.append(enumC14873q3.name());
                            if (!str.contains(sb3.toString())) {
                                if (!str.contains("channel:" + enumC14873q3.name())) {
                                    return;
                                }
                            }
                            ouq0.m169393m("ASSEMBLE_PUSH : receive FTOS token sync ack");
                            Context context2 = this.f62441a;
                            EnumC14868d enumC14868d2 = EnumC14868d.ASSEMBLE_PUSH_FTOS;
                            n1r0.m161141m(context2, enumC14868d2, str);
                            m86543l(strM86986a, c14905gw.f63112a, enumC14868d2);
                            return;
                        }
                    }
                    ouq0.m169393m("ASSEMBLE_PUSH : receive COS token sync ack");
                    Context context3 = this.f62441a;
                    EnumC14868d enumC14868d3 = EnumC14868d.ASSEMBLE_PUSH_COS;
                    n1r0.m161141m(context3, enumC14868d3, str);
                    m86543l(strM86986a, c14905gw.f63112a, enumC14868d3);
                    return;
                }
            }
            ouq0.m169393m("ASSEMBLE_PUSH : receive hw token sync ack");
            Context context4 = this.f62441a;
            EnumC14868d enumC14868d4 = EnumC14868d.ASSEMBLE_PUSH_HUAWEI;
            n1r0.m161141m(context4, enumC14868d4, str);
            m86543l(strM86986a, c14905gw.f63112a, enumC14868d4);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m86547p(C14911hb c14911hb) {
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        if (c14901gsM87077a != null) {
            c14901gsM87077a = C14998au.m87739a(c14901gsM87077a.m86895a());
        }
        C14904gv c14904gv = new C14904gv();
        c14904gv.m86956b(c14911hb.m87084a());
        c14904gv.m86950a(c14901gsM87077a.m86899a());
        c14904gv.m86949a(c14901gsM87077a.m86894a());
        if (!TextUtils.isEmpty(c14901gsM87077a.m86909b())) {
            c14904gv.m86959c(c14901gsM87077a.m86909b());
        }
        c14904gv.m86951a(C14936m.m87445b(this.f62441a, c14911hb));
        C14870f.m86573h(this.f62441a).m86608y(c14904gv, EnumC14888gf.AckMessage, false, c14901gsM87077a);
    }

    /* JADX INFO: renamed from: q */
    private void m86548q(C14914he c14914he) {
        Map<String, String> mapM87120a = c14914he.m87120a();
        if (mapM87120a == null) {
            ouq0.m169393m("detect failed because null");
            return;
        }
        String str = (String) C14984ag.m87630a(mapM87120a, "pkgList", (Object) null);
        if (TextUtils.isEmpty(str)) {
            ouq0.m169393m("detect failed because empty");
            return;
        }
        Map<String, String> mapM86760i = C14887g.m86760i(this.f62441a, str);
        if (mapM86760i == null) {
            ouq0.m169393m("detect failed because get status illegal");
            return;
        }
        String str2 = mapM86760i.get("alive");
        String str3 = mapM86760i.get("notAlive");
        if (TextUtils.isEmpty(str2)) {
            ouq0.m169403w("detect failed because no alive process");
            return;
        }
        C14914he c14914he2 = new C14914he();
        c14914he2.m87114a(c14914he.m87119a());
        c14914he2.m87127b(c14914he.m87128b());
        c14914he2.m87135d(c14914he.m87136d());
        c14914he2.m87131c(EnumC14898gp.DetectAppAliveResult.f62957a);
        HashMap map = new HashMap();
        c14914he2.f63229a = map;
        map.put("alive", str2);
        if (Boolean.parseBoolean((String) C14984ag.m87630a(mapM87120a, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str3)) {
            c14914he2.f63229a.put("notAlive", str3);
        }
        C14870f.m86573h(this.f62441a).m86608y(c14914he2, EnumC14888gf.Notification, false, null);
    }

    /* JADX INFO: renamed from: b */
    public PushMessageHandler.InterfaceC14863a m86549b(Intent intent) {
        String action = intent.getAction();
        ouq0.m169393m("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                ouq0.m169378B("receiving an empty message, drop");
                tzq0.m193695a(this.f62441a).m193699d(this.f62441a.getPackageName(), intent, Constants.VIA_REPORT_TYPE_SET_AVATAR);
                return null;
            }
            C14911hb c14911hb = new C14911hb();
            try {
                C14936m.m87447d(c14911hb, byteArrayExtra);
                C14867c c14867cM86499c = C14867c.m86499c(this.f62441a);
                C14901gs c14901gsM87077a = c14911hb.m87077a();
                EnumC14888gf enumC14888gfM87076a = c14911hb.m87076a();
                EnumC14888gf enumC14888gf = EnumC14888gf.SendMessage;
                if (enumC14888gfM87076a == enumC14888gf && c14901gsM87077a != null && !c14867cM86499c.m86520w() && !booleanExtra) {
                    c14901gsM87077a.m86902a("mrt", stringExtra);
                    c14901gsM87077a.m86902a("mat", Long.toString(System.currentTimeMillis()));
                    if (m86545n(c14911hb)) {
                        ouq0.m169403w("this is a mina's message, ack later");
                        c14901gsM87077a.m86902a("__hybrid_message_ts", String.valueOf(c14901gsM87077a.m86894a()));
                        c14901gsM87077a.m86902a("__hybrid_device_status", String.valueOf((int) C14936m.m87445b(this.f62441a, c14911hb)));
                    } else {
                        m86547p(c14911hb);
                    }
                }
                if (c14911hb.m87076a() == enumC14888gf && !c14911hb.m87094b()) {
                    if (C15031x.m88054a(c14911hb)) {
                        ouq0.m169393m(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", c14911hb.m87092b(), c14901gsM87077a != null ? c14901gsM87077a.m86899a() : ""));
                        tzq0.m193695a(this.f62441a).m193699d(this.f62441a.getPackageName(), intent, String.format("13: %1$s", c14911hb.m87092b()));
                    } else {
                        ouq0.m169393m(String.format("drop an un-encrypted messages. %1$s, %2$s", c14911hb.m87092b(), c14901gsM87077a != null ? c14901gsM87077a.m86899a() : ""));
                        tzq0.m193695a(this.f62441a).m193699d(this.f62441a.getPackageName(), intent, String.format("14: %1$s", c14911hb.m87092b()));
                    }
                    k4r0.m148288c(this.f62441a, c14911hb, booleanExtra);
                    return null;
                }
                if (c14911hb.m87076a() == enumC14888gf && c14911hb.m87094b() && C15031x.m88054a(c14911hb) && (!booleanExtra || c14901gsM87077a == null || c14901gsM87077a.m86900a() == null || !c14901gsM87077a.m86900a().containsKey("notify_effect"))) {
                    ouq0.m169393m(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", c14911hb.m87092b(), c14901gsM87077a != null ? c14901gsM87077a.m86899a() : ""));
                    tzq0.m193695a(this.f62441a).m193699d(this.f62441a.getPackageName(), intent, String.format("25: %1$s", c14911hb.m87092b()));
                    k4r0.m148290e(this.f62441a, c14911hb, booleanExtra);
                    return null;
                }
                if (c14867cM86499c.m86516s() || c14911hb.f63193a == EnumC14888gf.Registration) {
                    if (!c14867cM86499c.m86516s() || !c14867cM86499c.m86522y()) {
                        return m86535c(c14911hb, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    if (c14911hb.f63193a != EnumC14888gf.UnRegistration) {
                        k4r0.m148293h(this.f62441a, c14911hb, booleanExtra);
                        MiPushClient.unregisterPush(this.f62441a);
                    } else if (c14911hb.m87094b()) {
                        c14867cM86499c.m86503e();
                        MiPushClient.clearExtras(this.f62441a);
                        PushMessageHandler.m86457a();
                    } else {
                        ouq0.m169378B("receiving an un-encrypt unregistration message");
                    }
                } else {
                    if (C15031x.m88054a(c14911hb)) {
                        return m86535c(c14911hb, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    k4r0.m148293h(this.f62441a, c14911hb, booleanExtra);
                    boolean zM86518u = c14867cM86499c.m86518u();
                    ouq0.m169378B("receive message without registration. need re-register!registered?" + zM86518u);
                    tzq0.m193695a(this.f62441a).m193699d(this.f62441a.getPackageName(), intent, Constants.VIA_REPORT_TYPE_WPA_STATE);
                    if (zM86518u) {
                        m86538g();
                    }
                }
            } catch (C14926hu e) {
                tzq0.m193695a(this.f62441a).m193699d(this.f62441a.getPackageName(), intent, Constants.VIA_REPORT_TYPE_START_WAP);
                ouq0.m169397q(e);
            } catch (Exception e2) {
                tzq0.m193695a(this.f62441a).m193699d(this.f62441a.getPackageName(), intent, Constants.VIA_REPORT_TYPE_START_GROUP);
                ouq0.m169397q(e2);
            }
        } else {
            if ("com.xiaomi.mipush.ERROR".equals(action)) {
                MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
                C14911hb c14911hb2 = new C14911hb();
                try {
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                    if (byteArrayExtra2 != null) {
                        C14936m.m87447d(c14911hb2, byteArrayExtra2);
                    }
                } catch (C14926hu unused) {
                }
                miPushCommandMessage.setCommand(String.valueOf(c14911hb2.m87076a()));
                miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
                miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
                ouq0.m169378B("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
                return miPushCommandMessage;
            }
            if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra3 == null) {
                    ouq0.m169378B("message arrived: receiving an empty message, drop");
                    return null;
                }
                C14911hb c14911hb3 = new C14911hb();
                try {
                    C14936m.m87447d(c14911hb3, byteArrayExtra3);
                    C14867c c14867cM86499c2 = C14867c.m86499c(this.f62441a);
                    if (C15031x.m88054a(c14911hb3)) {
                        ouq0.m169378B("message arrived: receive ignore reg message, ignore!");
                    } else if (!c14867cM86499c2.m86516s()) {
                        ouq0.m169378B("message arrived: receive message without registration. need unregister or re-register!");
                    } else {
                        if (!c14867cM86499c2.m86516s() || !c14867cM86499c2.m86522y()) {
                            return m86536d(c14911hb3, byteArrayExtra3);
                        }
                        ouq0.m169378B("message arrived: app info is invalidated");
                    }
                } catch (Exception e3) {
                    ouq0.m169378B("fail to deal with arrived message. " + e3);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public List<String> m86550f(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long j = Long.parseLong(list.get(0).split(":")[0]);
        long j2 = ((((j * 60) + Long.parseLong(list.get(0).split(":")[1])) - rawOffset) + 1440) % 1440;
        long j3 = ((((Long.parseLong(list.get(1).split(":")[0]) * 60) + Long.parseLong(list.get(1).split(":")[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60)));
        return arrayList;
    }
}
