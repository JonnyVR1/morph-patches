package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14739g;
import com.xiaomi.push.C14752gr;
import com.xiaomi.push.C14753gs;
import com.xiaomi.push.C14756gv;
import com.xiaomi.push.C14757gw;
import com.xiaomi.push.C14762ha;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14764hc;
import com.xiaomi.push.C14765hd;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14768hg;
import com.xiaomi.push.C14770hi;
import com.xiaomi.push.C14772hk;
import com.xiaomi.push.C14774hm;
import com.xiaomi.push.C14776ho;
import com.xiaomi.push.C14778hu;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14732ed;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.EnumC14754gt;
import com.xiaomi.push.InterfaceC14777hq;
import com.xiaomi.push.service.AbstractC14843an;
import com.xiaomi.push.service.C14836ag;
import com.xiaomi.push.service.C14837ah;
import com.xiaomi.push.service.C14838ai;
import com.xiaomi.push.service.C14850au;
import com.xiaomi.push.service.C14865g;
import com.xiaomi.push.service.C14883x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import p149l.doq0;
import p149l.evq0;
import p149l.exq0;
import p149l.gwq0;
import p149l.hmq0;
import p149l.hsq0;
import p149l.hwq0;
import p149l.ilq0;
import p149l.irf;
import p149l.meb0;
import p149l.mqq0;
import p149l.mwq0;
import p149l.nqq0;
import p149l.otq0;
import p149l.vlq0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14721e {

    /* JADX INFO: renamed from: b */
    private static C14721e f61591b;

    /* JADX INFO: renamed from: c */
    private static Queue<String> f61592c;

    /* JADX INFO: renamed from: d */
    private static Object f61593d = new Object();

    /* JADX INFO: renamed from: a */
    private Context f61594a;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f61595a;

        static {
            int[] iArr = new int[EnumC14740gf.values().length];
            f61595a = iArr;
            try {
                iArr[EnumC14740gf.SendMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61595a[EnumC14740gf.Registration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61595a[EnumC14740gf.UnRegistration.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f61595a[EnumC14740gf.Subscription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f61595a[EnumC14740gf.UnSubscription.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f61595a[EnumC14740gf.Command.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f61595a[EnumC14740gf.Notification.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private C14721e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f61594a = applicationContext;
        if (applicationContext == null) {
            this.f61594a = context;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Intent m85363a(Context context, String str, Map<String, String> map, int i) {
        return C14883x.m86889b(context, str, map, i);
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
    private PushMessageHandler.InterfaceC14715a m85364c(C14763hb c14763hb, boolean z, byte[] bArr, String str, int i, Intent intent) {
        MiPushMessage miPushMessage;
        String strM85694a;
        ArrayList arrayList = null;
        try {
            InterfaceC14777hq interfaceC14777hqM156762d = mwq0.m156762d(this.f61594a, c14763hb);
            if (interfaceC14777hqM156762d == null) {
                ilq0.m137025B("receiving an un-recognized message. " + c14763hb.f62346a);
                nqq0.m160662a(this.f61594a).m160670i(this.f61594a.getPackageName(), mqq0.m155982e(i), str, "18");
                evq0.m118313f(this.f61594a, c14763hb, z);
                return null;
            }
            EnumC14740gf enumC14740gfM85905a = c14763hb.m85905a();
            ilq0.m137043p("processing a message, action=", enumC14740gfM85905a, ", hasNotified=", Boolean.valueOf(z));
            switch (a.f61595a[enumC14740gfM85905a.ordinal()]) {
                case 1:
                    if (!c14763hb.m85923b()) {
                        ilq0.m137025B("receiving an un-encrypt message(SendMessage).");
                        return null;
                    }
                    if (C14719c.m85328c(this.f61594a).m85349w() && !z) {
                        ilq0.m137040m("receive a message in pause state. drop it");
                        nqq0.m160662a(this.f61594a).m160669g(this.f61594a.getPackageName(), mqq0.m155982e(i), str, Constants.VIA_REPORT_TYPE_SET_AVATAR);
                        return null;
                    }
                    C14770hi c14770hi = (C14770hi) interfaceC14777hqM156762d;
                    C14752gr c14752grM86080a = c14770hi.m86080a();
                    if (c14752grM86080a == null) {
                        ilq0.m137025B("receive an empty message without push content, drop it");
                        nqq0.m160662a(this.f61594a).m160670i(this.f61594a.getPackageName(), mqq0.m155982e(i), str, Constants.VIA_REPORT_TYPE_DATALINE);
                        evq0.m118314g(this.f61594a, c14763hb, z);
                        return null;
                    }
                    int intExtra = intent.getIntExtra("notification_click_button", 0);
                    if (z) {
                        if (C14883x.m86883a(c14763hb)) {
                            MiPushClient.reportIgnoreRegMessageClicked(this.f61594a, c14752grM86080a.m85694a(), c14763hb.m85906a(), c14763hb.f62353b, c14752grM86080a.m85699b());
                        } else {
                            C14753gs c14753gs = c14763hb.m85906a() != null ? new C14753gs(c14763hb.m85906a()) : new C14753gs();
                            if (c14753gs.m85729a() == null) {
                                c14753gs.m85727a(new HashMap());
                            }
                            c14753gs.m85729a().put("notification_click_button", String.valueOf(intExtra));
                            MiPushClient.reportMessageClicked(this.f61594a, c14752grM86080a.m85694a(), c14753gs, c14752grM86080a.m85699b());
                        }
                    }
                    if (!z) {
                        if (!TextUtils.isEmpty(c14770hi.m86090d()) && MiPushClient.aliasSetTime(this.f61594a, c14770hi.m86090d()) < 0) {
                            MiPushClient.addAlias(this.f61594a, c14770hi.m86090d());
                        } else if (!TextUtils.isEmpty(c14770hi.m86088c()) && MiPushClient.topicSubscribedTime(this.f61594a, c14770hi.m86088c()) < 0) {
                            MiPushClient.addTopic(this.f61594a, c14770hi.m86088c());
                        }
                    }
                    C14753gs c14753gs2 = c14763hb.f62347a;
                    ?? r9 = (c14753gs2 == null || c14753gs2.m85729a() == null) ? arrayList : c14763hb.f62347a.f62183a.get("jobkey");
                    ?? r10 = r9;
                    boolean zIsEmpty = TextUtils.isEmpty(r9);
                    ?? r11 = r9;
                    if (zIsEmpty) {
                        strM85694a = c14752grM86080a.m85694a();
                    }
                    if (z || !m85373m(this.f61594a, r11)) {
                        r11 = strM85694a;
                        r11 = strM85694a;
                        MiPushMessage miPushMessageM154171b = meb0.m154171b(c14770hi, c14763hb.m85906a(), z);
                        if (miPushMessageM154171b.getPassThrough() == 0 && !z && C14883x.m86885a(miPushMessageM154171b.getExtra())) {
                            C14883x.m86864a(this.f61594a, c14763hb, bArr);
                            return arrayList;
                        }
                        String strM86867a = C14883x.m86867a(miPushMessageM154171b.getExtra(), intExtra);
                        ilq0.m137043p("receive a message, msgid=", c14752grM86080a.m85694a(), ", jobkey=", r11, ", btn=", Integer.valueOf(intExtra), ", typeId=", strM86867a, ", hasNotified=", Boolean.valueOf(z));
                        if (z && miPushMessageM154171b.getExtra() != null && !TextUtils.isEmpty(strM86867a)) {
                            Map<String, String> extra = miPushMessageM154171b.getExtra();
                            if (intExtra != 0 && c14763hb.m85906a() != null) {
                                C14722f.m85402h(this.f61594a).m85428o(c14763hb.m85906a().m85743c(), intExtra);
                            }
                            boolean zM86883a = C14883x.m86883a(c14763hb);
                            Context context = this.f61594a;
                            if (zM86883a) {
                                ?? M85363a = m85363a(context, c14763hb.f62353b, extra, intExtra);
                                M85363a.putExtra("eventMessageType", i);
                                M85363a.putExtra("messageId", str);
                                M85363a.putExtra("jobkey", r10);
                                String strM85702c = c14752grM86080a.m85702c();
                                if (!TextUtils.isEmpty(strM85702c)) {
                                    M85363a.putExtra("payload", strM85702c);
                                }
                                this.f61594a.startActivity(M85363a);
                                evq0.m118309b(this.f61594a, c14763hb);
                                nqq0.m160662a(this.f61594a).m160668f(this.f61594a.getPackageName(), mqq0.m155982e(i), str, 3006, strM86867a);
                                ilq0.m137041n("PushMessageProcessor", "start business activity succ");
                            } else {
                                ?? M85363a2 = m85363a(context, context.getPackageName(), extra, intExtra);
                                if (M85363a2 != 0) {
                                    if (!strM86867a.equals(AbstractC14843an.f62938c)) {
                                        M85363a2.putExtra("key_message", miPushMessageM154171b);
                                        M85363a2.putExtra("eventMessageType", i);
                                        M85363a2.putExtra("messageId", str);
                                        M85363a2.putExtra("jobkey", r10);
                                    }
                                    this.f61594a.startActivity(M85363a2);
                                    evq0.m118309b(this.f61594a, c14763hb);
                                    ilq0.m137041n("PushMessageProcessor", "start activity succ");
                                    nqq0.m160662a(this.f61594a).m160668f(this.f61594a.getPackageName(), mqq0.m155982e(i), str, 1006, strM86867a);
                                    if (strM86867a.equals(AbstractC14843an.f62938c)) {
                                        nqq0.m160662a(this.f61594a).m160669g(this.f61594a.getPackageName(), mqq0.m155982e(i), str, Constants.VIA_REPORT_TYPE_JOININ_GROUP);
                                    }
                                } else {
                                    ilq0.m137026C("PushMessageProcessor", "missing target intent for message: " + c14752grM86080a.m85694a() + ", typeId=" + strM86867a);
                                }
                            }
                            ilq0.m137041n("PushMessageProcessor", "pre-def msg process done.");
                            return arrayList;
                        }
                        miPushMessage = miPushMessageM154171b;
                    } else {
                        r11 = strM85694a;
                        ilq0.m137040m("drop a duplicate message, key=" + r11);
                        nqq0.m160662a(this.f61594a).m160671j(this.f61594a.getPackageName(), mqq0.m155982e(i), str, "2:" + r11);
                        miPushMessage = null;
                    }
                    if (c14763hb.m85906a() == null && !z) {
                        m85371k(c14770hi, c14763hb);
                    }
                    return miPushMessage;
                case 2:
                    C14768hg c14768hg = (C14768hg) interfaceC14777hqM156762d;
                    String str2 = C14719c.m85328c(this.f61594a).f61572d;
                    if (TextUtils.isEmpty(str2) || !TextUtils.equals(str2, c14768hg.m86036a())) {
                        ilq0.m137040m("bad Registration result:");
                        nqq0.m160662a(this.f61594a).m160670i(this.f61594a.getPackageName(), mqq0.m155982e(i), str, "21");
                        return null;
                    }
                    long jM85423b = C14722f.m85402h(this.f61594a).m85423b();
                    if (jM85423b > 0 && SystemClock.elapsedRealtime() - jM85423b > 900000) {
                        ilq0.m137040m("The received registration result has expired.");
                        nqq0.m160662a(this.f61594a).m160670i(this.f61594a.getPackageName(), mqq0.m155982e(i), str, Constants.VIA_REPORT_TYPE_CHAT_VIDEO);
                        return null;
                    }
                    C14719c.m85328c(this.f61594a).f61572d = null;
                    long j = c14768hg.f62475a;
                    Context context2 = this.f61594a;
                    if (j == 0) {
                        C14719c.m85328c(context2).m85342o(c14768hg.f62487e, c14768hg.f62488f, c14768hg.f62494l);
                        irf.m137873a(this.f61594a);
                        nqq0.m160662a(this.f61594a).m160668f(this.f61594a.getPackageName(), mqq0.m155982e(i), str, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR, "1");
                    } else {
                        nqq0.m160662a(context2).m160668f(this.f61594a.getPackageName(), mqq0.m155982e(i), str, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR, "2");
                    }
                    if (!TextUtils.isEmpty(c14768hg.f62487e)) {
                        arrayList = new ArrayList();
                        arrayList.add(c14768hg.f62487e);
                    }
                    MiPushCommandMessage miPushCommandMessageM154170a = meb0.m154170a(EnumC14732ed.COMMAND_REGISTER.f61667a, arrayList, c14768hg.f62475a, c14768hg.f62486d, null, c14768hg.m86037a());
                    C14722f.m85402h(this.f61594a).m85422X();
                    return miPushCommandMessageM154170a;
                case 3:
                    if (!c14763hb.m85923b()) {
                        ilq0.m137025B("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                    if (((C14774hm) interfaceC14777hqM156762d).f62610a == 0) {
                        C14719c.m85328c(this.f61594a).m85332e();
                        MiPushClient.clearExtras(this.f61594a);
                    }
                    PushMessageHandler.m85286a();
                    return null;
                case 4:
                    C14772hk c14772hk = (C14772hk) interfaceC14777hqM156762d;
                    if (c14772hk.f62564a == 0) {
                        MiPushClient.addTopic(this.f61594a, c14772hk.m86124b());
                    }
                    if (!TextUtils.isEmpty(c14772hk.m86124b())) {
                        arrayList = new ArrayList();
                        arrayList.add(c14772hk.m86124b());
                    }
                    StringBuilder sb = new StringBuilder("resp-cmd:");
                    EnumC14732ed enumC14732ed = EnumC14732ed.COMMAND_SUBSCRIBE_TOPIC;
                    sb.append(enumC14732ed);
                    sb.append(", ");
                    sb.append(c14772hk.m86119a());
                    ilq0.m137027D(sb.toString());
                    return meb0.m154170a(enumC14732ed.f61667a, arrayList, c14772hk.f62564a, c14772hk.f62570d, c14772hk.m86126c(), null);
                case 5:
                    C14776ho c14776ho = (C14776ho) interfaceC14777hqM156762d;
                    if (c14776ho.f62647a == 0) {
                        MiPushClient.removeTopic(this.f61594a, c14776ho.m86194b());
                    }
                    if (!TextUtils.isEmpty(c14776ho.m86194b())) {
                        arrayList = new ArrayList();
                        arrayList.add(c14776ho.m86194b());
                    }
                    StringBuilder sb2 = new StringBuilder("resp-cmd:");
                    EnumC14732ed enumC14732ed2 = EnumC14732ed.COMMAND_UNSUBSCRIBE_TOPIC;
                    sb2.append(enumC14732ed2);
                    sb2.append(", ");
                    sb2.append(c14776ho.m86189a());
                    ilq0.m137027D(sb2.toString());
                    return meb0.m154170a(enumC14732ed2.f61667a, arrayList, c14776ho.f62647a, c14776ho.f62653d, c14776ho.m86196c(), null);
                case 6:
                    doq0.m112824f(this.f61594a.getPackageName(), this.f61594a, interfaceC14777hqM156762d, EnumC14740gf.Command, bArr.length);
                    C14762ha c14762ha = (C14762ha) interfaceC14777hqM156762d;
                    String strM85892b = c14762ha.m85892b();
                    List<String> listM85887a = c14762ha.m85887a();
                    if (c14762ha.f62326a == 0) {
                        if (TextUtils.equals(strM85892b, EnumC14732ed.COMMAND_SET_ACCEPT_TIME.f61667a) && listM85887a != null && listM85887a.size() > 1) {
                            MiPushClient.addAcceptTime(this.f61594a, listM85887a.get(0), listM85887a.get(1));
                            if ("00:00".equals(listM85887a.get(0)) && "00:00".equals(listM85887a.get(1))) {
                                C14719c.m85328c(this.f61594a).m85337j(true);
                            } else {
                                C14719c.m85328c(this.f61594a).m85337j(false);
                            }
                            listM85887a = m85379f(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), listM85887a);
                        } else if (TextUtils.equals(strM85892b, EnumC14732ed.COMMAND_SET_ALIAS.f61667a) && listM85887a != null && listM85887a.size() > 0) {
                            MiPushClient.addAlias(this.f61594a, listM85887a.get(0));
                        } else if (TextUtils.equals(strM85892b, EnumC14732ed.COMMAND_UNSET_ALIAS.f61667a) && listM85887a != null && listM85887a.size() > 0) {
                            MiPushClient.removeAlias(this.f61594a, listM85887a.get(0));
                        } else if (TextUtils.equals(strM85892b, EnumC14732ed.COMMAND_SET_ACCOUNT.f61667a) && listM85887a != null && listM85887a.size() > 0) {
                            MiPushClient.addAccount(this.f61594a, listM85887a.get(0));
                        } else if (TextUtils.equals(strM85892b, EnumC14732ed.COMMAND_UNSET_ACCOUNT.f61667a) && listM85887a != null && listM85887a.size() > 0) {
                            MiPushClient.removeAccount(this.f61594a, listM85887a.get(0));
                        } else if (TextUtils.equals(strM85892b, EnumC14732ed.COMMAND_CHK_VDEVID.f61667a)) {
                            return null;
                        }
                    }
                    ilq0.m137027D("resp-cmd:" + strM85892b + ", " + c14762ha.m85886a());
                    return meb0.m154170a(strM85892b, listM85887a, c14762ha.f62326a, c14762ha.f62334d, c14762ha.m85895c(), null);
                case 7:
                    doq0.m112824f(this.f61594a.getPackageName(), this.f61594a, interfaceC14777hqM156762d, EnumC14740gf.Notification, bArr.length);
                    if (interfaceC14777hqM156762d instanceof C14757gw) {
                        C14757gw c14757gw = (C14757gw) interfaceC14777hqM156762d;
                        String strM85815a = c14757gw.m85815a();
                        ilq0.m137027D("resp-type:" + c14757gw.m85822b() + ", code:" + c14757gw.f62265a + ", " + strM85815a);
                        if (EnumC14750gp.DisablePushMessage.f62110a.equalsIgnoreCase(c14757gw.f62272d)) {
                            if (c14757gw.f62265a == 0) {
                                synchronized (gwq0.class) {
                                    try {
                                        if (gwq0.m128497c(this.f61594a).m128502f(strM85815a)) {
                                            gwq0.m128497c(this.f61594a).m128504h(strM85815a);
                                            gwq0 gwq0VarM128497c = gwq0.m128497c(this.f61594a);
                                            EnumC14726v enumC14726v = EnumC14726v.DISABLE_PUSH;
                                            if ("syncing".equals(gwq0VarM128497c.m128499b(enumC14726v))) {
                                                gwq0.m128497c(this.f61594a).m128500d(enumC14726v, "synced");
                                                MiPushClient.clearNotification(this.f61594a);
                                                MiPushClient.clearLocalNotificationType(this.f61594a);
                                                PushMessageHandler.m85286a();
                                                C14722f.m85402h(this.f61594a).m85418N();
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else if ("syncing".equals(gwq0.m128497c(this.f61594a).m128499b(EnumC14726v.DISABLE_PUSH))) {
                                synchronized (gwq0.class) {
                                    try {
                                        if (gwq0.m128497c(this.f61594a).m128502f(strM85815a)) {
                                            int iM128498a = gwq0.m128497c(this.f61594a).m128498a(strM85815a);
                                            Context context3 = this.f61594a;
                                            if (iM128498a < 10) {
                                                gwq0.m128497c(context3).m128503g(strM85815a);
                                                C14722f.m85402h(this.f61594a).m85415I(true, strM85815a);
                                            } else {
                                                gwq0.m128497c(context3).m128504h(strM85815a);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } else {
                                gwq0.m128497c(this.f61594a).m128504h(strM85815a);
                            }
                            break;
                        } else if (EnumC14750gp.EnablePushMessage.f62110a.equalsIgnoreCase(c14757gw.f62272d)) {
                            if (c14757gw.f62265a == 0) {
                                synchronized (gwq0.class) {
                                    try {
                                        if (gwq0.m128497c(this.f61594a).m128502f(strM85815a)) {
                                            gwq0.m128497c(this.f61594a).m128504h(strM85815a);
                                            gwq0 gwq0VarM128497c2 = gwq0.m128497c(this.f61594a);
                                            EnumC14726v enumC14726v2 = EnumC14726v.ENABLE_PUSH;
                                            if ("syncing".equals(gwq0VarM128497c2.m128499b(enumC14726v2))) {
                                                gwq0.m128497c(this.f61594a).m128500d(enumC14726v2, "synced");
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            } else if ("syncing".equals(gwq0.m128497c(this.f61594a).m128499b(EnumC14726v.ENABLE_PUSH))) {
                                synchronized (gwq0.class) {
                                    try {
                                        if (gwq0.m128497c(this.f61594a).m128502f(strM85815a)) {
                                            int iM128498a2 = gwq0.m128497c(this.f61594a).m128498a(strM85815a);
                                            Context context4 = this.f61594a;
                                            if (iM128498a2 < 10) {
                                                gwq0.m128497c(context4).m128503g(strM85815a);
                                                C14722f.m85402h(this.f61594a).m85415I(false, strM85815a);
                                            } else {
                                                gwq0.m128497c(context4).m128504h(strM85815a);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                            } else {
                                gwq0.m128497c(this.f61594a).m128504h(strM85815a);
                            }
                            break;
                        } else if (EnumC14750gp.ThirdPartyRegUpdate.f62110a.equalsIgnoreCase(c14757gw.f62272d)) {
                            m85375o(c14757gw);
                        } else if (EnumC14750gp.UploadTinyData.f62110a.equalsIgnoreCase(c14757gw.f62272d)) {
                            m85368h(c14757gw);
                        }
                    } else if (interfaceC14777hqM156762d instanceof C14766he) {
                        C14766he c14766he = (C14766he) interfaceC14777hqM156762d;
                        if ("registration id expired".equalsIgnoreCase(c14766he.f62387d)) {
                            List<String> allAlias = MiPushClient.getAllAlias(this.f61594a);
                            List<String> allTopic = MiPushClient.getAllTopic(this.f61594a);
                            List<String> allUserAccount = MiPushClient.getAllUserAccount(this.f61594a);
                            String acceptTime = MiPushClient.getAcceptTime(this.f61594a);
                            ilq0.m137027D("resp-type:" + c14766he.f62387d + ", " + c14766he.m85948a());
                            MiPushClient.reInitialize(this.f61594a, EnumC14754gt.RegIdExpired);
                            for (String str3 : allAlias) {
                                MiPushClient.removeAlias(this.f61594a, str3);
                                MiPushClient.setAlias(this.f61594a, str3, null);
                            }
                            for (String str4 : allTopic) {
                                MiPushClient.removeTopic(this.f61594a, str4);
                                MiPushClient.subscribe(this.f61594a, str4, null);
                            }
                            for (String str5 : allUserAccount) {
                                MiPushClient.removeAccount(this.f61594a, str5);
                                MiPushClient.setUserAccount(this.f61594a, str5, null);
                            }
                            String[] strArrSplit = acceptTime.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                            if (strArrSplit.length == 2) {
                                MiPushClient.removeAcceptTime(this.f61594a);
                                MiPushClient.addAcceptTime(this.f61594a, strArrSplit[0], strArrSplit[1]);
                            }
                        } else if (!EnumC14750gp.ClientInfoUpdateOk.f62110a.equalsIgnoreCase(c14766he.f62387d)) {
                            try {
                                if (EnumC14750gp.NormalClientConfigUpdate.f62110a.equalsIgnoreCase(c14766he.f62387d)) {
                                    C14765hd c14765hd = new C14765hd();
                                    C14788m.m86276d(c14765hd, c14766he.m85955a());
                                    C14838ai.m86494a(C14837ah.m86477a(this.f61594a), c14765hd);
                                } else if (EnumC14750gp.CustomClientConfigUpdate.f62110a.equalsIgnoreCase(c14766he.f62387d)) {
                                    C14764hc c14764hc = new C14764hc();
                                    C14788m.m86276d(c14764hc, c14766he.m85955a());
                                    C14838ai.m86493a(C14837ah.m86477a(this.f61594a), c14764hc);
                                } else if (EnumC14750gp.SyncInfoResult.f62110a.equalsIgnoreCase(c14766he.f62387d)) {
                                    exq0.m118697c(this.f61594a, c14766he);
                                } else if (EnumC14750gp.ForceSync.f62110a.equalsIgnoreCase(c14766he.f62387d)) {
                                    ilq0.m137040m("receive force sync notification");
                                    exq0.m118698d(this.f61594a, false);
                                } else if (EnumC14750gp.CancelPushMessage.f62110a.equals(c14766he.f62387d)) {
                                    ilq0.m137027D("resp-type:" + c14766he.f62387d + ", " + c14766he.m85948a());
                                    if (c14766he.m85949a() != null) {
                                        int i2 = -2;
                                        if (c14766he.m85949a().containsKey(AbstractC14843an.f62934Q)) {
                                            String str6 = c14766he.m85949a().get(AbstractC14843an.f62934Q);
                                            if (!TextUtils.isEmpty(str6)) {
                                                try {
                                                    i2 = Integer.parseInt(str6);
                                                } catch (NumberFormatException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                        if (i2 >= -1) {
                                            MiPushClient.clearNotification(this.f61594a, i2);
                                        } else {
                                            MiPushClient.clearNotification(this.f61594a, c14766he.m85949a().containsKey(AbstractC14843an.f62932O) ? c14766he.m85949a().get(AbstractC14843an.f62932O) : "", c14766he.m85949a().containsKey(AbstractC14843an.f62933P) ? c14766he.m85949a().get(AbstractC14843an.f62933P) : "");
                                        }
                                    }
                                    m85370j(c14766he);
                                    break;
                                } else if (EnumC14750gp.HybridRegisterResult.f62110a.equals(c14766he.f62387d)) {
                                    try {
                                        C14768hg c14768hg2 = new C14768hg();
                                        C14788m.m86276d(c14768hg2, c14766he.m85955a());
                                        C14717a.m85305a(this.f61594a, c14768hg2);
                                    } catch (C14778hu e2) {
                                        ilq0.m137044q(e2);
                                    }
                                    break;
                                } else if (EnumC14750gp.HybridUnregisterResult.f62110a.equals(c14766he.f62387d)) {
                                    try {
                                        C14774hm c14774hm = new C14774hm();
                                        C14788m.m86276d(c14774hm, c14766he.m85955a());
                                        C14717a.m85306b(this.f61594a, c14774hm);
                                    } catch (C14778hu e3) {
                                        ilq0.m137044q(e3);
                                    }
                                    break;
                                } else if (!EnumC14750gp.PushLogUpload.f62110a.equals(c14766he.f62387d)) {
                                    if (EnumC14750gp.DetectAppAlive.f62110a.equals(c14766he.f62387d)) {
                                        ilq0.m137050w("receive detect msg");
                                        m85377q(c14766he);
                                    } else if (C14865g.m86656a(c14766he)) {
                                        ilq0.m137050w("receive notification handle by cpra");
                                    }
                                }
                                break;
                            } catch (C14778hu unused) {
                            }
                        } else if (c14766he.m85949a() != null && c14766he.m85949a().containsKey("app_version")) {
                            C14719c.m85328c(this.f61594a).m85334g(c14766he.m85949a().get("app_version"));
                        }
                    }
                    return null;
                default:
                    return null;
            }
        } catch (C14723l e4) {
            ilq0.m137044q(e4);
            m85369i(c14763hb);
            nqq0.m160662a(this.f61594a).m160670i(this.f61594a.getPackageName(), mqq0.m155982e(i), str, Constants.VIA_ACT_TYPE_NINETEEN);
            evq0.m118313f(this.f61594a, c14763hb, z);
            return null;
        } catch (C14778hu e5) {
            ilq0.m137044q(e5);
            ilq0.m137025B("receive a message which action string is not valid. is the reg expired?");
            nqq0.m160662a(this.f61594a).m160670i(this.f61594a.getPackageName(), mqq0.m155982e(i), str, "20");
            evq0.m118313f(this.f61594a, c14763hb, z);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private PushMessageHandler.InterfaceC14715a m85365d(C14763hb c14763hb, byte[] bArr) {
        String str = null;
        try {
            InterfaceC14777hq interfaceC14777hqM156762d = mwq0.m156762d(this.f61594a, c14763hb);
            if (interfaceC14777hqM156762d == null) {
                ilq0.m137025B("message arrived: receiving an un-recognized message. " + c14763hb.f62346a);
                return null;
            }
            EnumC14740gf enumC14740gfM85905a = c14763hb.m85905a();
            ilq0.m137040m("message arrived: processing an arrived message, action=" + enumC14740gfM85905a);
            if (a.f61595a[enumC14740gfM85905a.ordinal()] != 1) {
                return null;
            }
            if (!c14763hb.m85923b()) {
                ilq0.m137025B("message arrived: receiving an un-encrypt message(SendMessage).");
                return null;
            }
            C14770hi c14770hi = (C14770hi) interfaceC14777hqM156762d;
            C14752gr c14752grM86080a = c14770hi.m86080a();
            if (c14752grM86080a == null) {
                ilq0.m137025B("message arrived: receive an empty message without push content, drop it");
                return null;
            }
            C14753gs c14753gs = c14763hb.f62347a;
            if (c14753gs != null && c14753gs.m85729a() != null) {
                str = c14763hb.f62347a.f62183a.get("jobkey");
            }
            MiPushMessage miPushMessageM154171b = meb0.m154171b(c14770hi, c14763hb.m85906a(), false);
            miPushMessageM154171b.setArrivedMessage(true);
            ilq0.m137040m("message arrived: receive a message, msgid=" + c14752grM86080a.m85694a() + ", jobkey=" + str);
            return miPushMessageM154171b;
        } catch (C14723l e) {
            ilq0.m137044q(e);
            ilq0.m137025B("message arrived: receive a message but decrypt failed. report when click.");
            return null;
        } catch (C14778hu e2) {
            ilq0.m137044q(e2);
            ilq0.m137025B("message arrived: receive a message which action string is not valid. is the reg expired?");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C14721e m85366e(Context context) {
        if (f61591b == null) {
            f61591b = new C14721e(context);
        }
        return f61591b;
    }

    /* JADX INFO: renamed from: g */
    private void m85367g() {
        SharedPreferences sharedPreferences = this.f61594a.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - sharedPreferences.getLong("last_reinitialize", 0L)) > 1800000) {
            MiPushClient.reInitialize(this.f61594a, EnumC14754gt.PackageUnregistered);
            sharedPreferences.edit().putLong("last_reinitialize", jCurrentTimeMillis).commit();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m85368h(C14757gw c14757gw) {
        String strM85815a = c14757gw.m85815a();
        ilq0.m137050w("receive ack " + strM85815a);
        Map<String, String> mapM85816a = c14757gw.m85816a();
        if (mapM85816a != null) {
            String str = mapM85816a.get("real_source");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ilq0.m137050w("receive ack : messageId = " + strM85815a + "  realSource = " + str);
            hmq0.m131742d(this.f61594a).m131751h(strM85815a, str, Boolean.valueOf(c14757gw.f62265a == 0));
        }
    }

    /* JADX INFO: renamed from: i */
    private void m85369i(C14763hb c14763hb) {
        ilq0.m137040m("receive a message but decrypt failed. report now.");
        C14766he c14766he = new C14766he(c14763hb.m85906a().f62181a, false);
        c14766he.m85960c(EnumC14750gp.DecryptMessageFail.f62110a);
        c14766he.m85956b(c14763hb.m85913a());
        c14766he.m85964d(c14763hb.f62353b);
        HashMap map = new HashMap();
        c14766he.f62382a = map;
        map.put("regid", MiPushClient.getRegId(this.f61594a));
        C14722f.m85402h(this.f61594a).m85437y(c14766he, EnumC14740gf.Notification, false, null);
    }

    /* JADX INFO: renamed from: j */
    private void m85370j(C14766he c14766he) {
        C14757gw c14757gw = new C14757gw();
        c14757gw.m85824c(EnumC14750gp.CancelPushMessageACK.f62110a);
        c14757gw.m85814a(c14766he.m85948a());
        c14757gw.m85813a(c14766he.m85942a());
        c14757gw.m85821b(c14766he.m85957b());
        c14757gw.m85828e(c14766he.m85965d());
        c14757gw.m85812a(0L);
        c14757gw.m85826d("success clear push message.");
        C14722f.m85402h(this.f61594a).m85410C(c14757gw, EnumC14740gf.Notification, false, true, null, false, this.f61594a.getPackageName(), C14719c.m85328c(this.f61594a).m85331d(), false);
    }

    /* JADX INFO: renamed from: k */
    private void m85371k(C14770hi c14770hi, C14763hb c14763hb) {
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        if (c14753gsM85906a != null) {
            c14753gsM85906a = C14850au.m86568a(c14753gsM85906a.m85724a());
        }
        C14756gv c14756gv = new C14756gv();
        c14756gv.m85785b(c14770hi.m86086b());
        c14756gv.m85779a(c14770hi.m86081a());
        c14756gv.m85778a(c14770hi.m86080a().m85693a());
        if (!TextUtils.isEmpty(c14770hi.m86088c())) {
            c14756gv.m85788c(c14770hi.m86088c());
        }
        if (!TextUtils.isEmpty(c14770hi.m86090d())) {
            c14756gv.m85791d(c14770hi.m86090d());
        }
        c14756gv.m85780a(C14788m.m86274b(this.f61594a, c14763hb));
        C14722f.m85402h(this.f61594a).m85435w(c14756gv, EnumC14740gf.AckMessage, c14753gsM85906a);
    }

    /* JADX INFO: renamed from: l */
    private void m85372l(String str, long j, EnumC14720d enumC14720d) {
        EnumC14726v enumC14726vM165964a = otq0.m165964a(enumC14720d);
        if (enumC14726vM165964a == null) {
            return;
        }
        if (j == 0) {
            synchronized (gwq0.class) {
                try {
                    if (gwq0.m128497c(this.f61594a).m128502f(str)) {
                        gwq0.m128497c(this.f61594a).m128504h(str);
                        if ("syncing".equals(gwq0.m128497c(this.f61594a).m128499b(enumC14726vM165964a))) {
                            gwq0.m128497c(this.f61594a).m128500d(enumC14726vM165964a, "synced");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"syncing".equals(gwq0.m128497c(this.f61594a).m128499b(enumC14726vM165964a))) {
            gwq0.m128497c(this.f61594a).m128504h(str);
            return;
        }
        synchronized (gwq0.class) {
            try {
                if (gwq0.m128497c(this.f61594a).m128502f(str)) {
                    int iM128498a = gwq0.m128497c(this.f61594a).m128498a(str);
                    Context context = this.f61594a;
                    if (iM128498a < 10) {
                        gwq0.m128497c(context).m128503g(str);
                        C14722f.m85402h(this.f61594a).m85412E(str, enumC14726vM165964a, enumC14720d, "retry");
                    } else {
                        gwq0.m128497c(context).m128504h(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private static boolean m85373m(Context context, String str) {
        synchronized (f61593d) {
            try {
                C14719c.m85328c(context);
                SharedPreferences sharedPreferencesM85327b = C14719c.m85327b(context);
                if (f61592c == null) {
                    String[] strArrSplit = sharedPreferencesM85327b.getString("pref_msg_ids", "").split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                    f61592c = new LinkedList();
                    for (String str2 : strArrSplit) {
                        f61592c.add(str2);
                    }
                }
                if (f61592c.contains(str)) {
                    return true;
                }
                f61592c.add(str);
                if (f61592c.size() > 25) {
                    f61592c.poll();
                }
                String strM198841d = vlq0.m198841d(f61592c, com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                SharedPreferences.Editor editorEdit = sharedPreferencesM85327b.edit();
                editorEdit.putString("pref_msg_ids", strM198841d);
                hwq0.m133262a(editorEdit);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m85374n(C14763hb c14763hb) {
        Map<String, String> mapM85729a = c14763hb.m85906a() == null ? null : c14763hb.m85906a().m85729a();
        if (mapM85729a == null) {
            return false;
        }
        String str = mapM85729a.get("push_server_action");
        return TextUtils.equals(str, "hybrid_message") || TextUtils.equals(str, "platform_message");
    }

    /* JADX INFO: renamed from: o */
    private void m85375o(C14757gw c14757gw) {
        ilq0.m137053z("ASSEMBLE_PUSH : " + c14757gw.toString());
        String strM85815a = c14757gw.m85815a();
        Map<String, String> mapM85816a = c14757gw.m85816a();
        if (mapM85816a != null) {
            String str = mapM85816a.get("RegInfo");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("brand:" + EnumC14725q.FCM.name())) {
                ilq0.m137040m("ASSEMBLE_PUSH : receive fcm token sync ack");
                Context context = this.f61594a;
                EnumC14720d enumC14720d = EnumC14720d.ASSEMBLE_PUSH_FCM;
                hsq0.m132799m(context, enumC14720d, str);
                m85372l(strM85815a, c14757gw.f62265a, enumC14720d);
                return;
            }
            StringBuilder sb = new StringBuilder("brand:");
            EnumC14725q enumC14725q = EnumC14725q.HUAWEI;
            sb.append(enumC14725q.name());
            if (!str.contains(sb.toString())) {
                if (!str.contains("channel:" + enumC14725q.name())) {
                    StringBuilder sb2 = new StringBuilder("brand:");
                    EnumC14725q enumC14725q2 = EnumC14725q.OPPO;
                    sb2.append(enumC14725q2.name());
                    if (!str.contains(sb2.toString())) {
                        if (!str.contains("channel:" + enumC14725q2.name())) {
                            StringBuilder sb3 = new StringBuilder("brand:");
                            EnumC14725q enumC14725q3 = EnumC14725q.VIVO;
                            sb3.append(enumC14725q3.name());
                            if (!str.contains(sb3.toString())) {
                                if (!str.contains("channel:" + enumC14725q3.name())) {
                                    return;
                                }
                            }
                            ilq0.m137040m("ASSEMBLE_PUSH : receive FTOS token sync ack");
                            Context context2 = this.f61594a;
                            EnumC14720d enumC14720d2 = EnumC14720d.ASSEMBLE_PUSH_FTOS;
                            hsq0.m132799m(context2, enumC14720d2, str);
                            m85372l(strM85815a, c14757gw.f62265a, enumC14720d2);
                            return;
                        }
                    }
                    ilq0.m137040m("ASSEMBLE_PUSH : receive COS token sync ack");
                    Context context3 = this.f61594a;
                    EnumC14720d enumC14720d3 = EnumC14720d.ASSEMBLE_PUSH_COS;
                    hsq0.m132799m(context3, enumC14720d3, str);
                    m85372l(strM85815a, c14757gw.f62265a, enumC14720d3);
                    return;
                }
            }
            ilq0.m137040m("ASSEMBLE_PUSH : receive hw token sync ack");
            Context context4 = this.f61594a;
            EnumC14720d enumC14720d4 = EnumC14720d.ASSEMBLE_PUSH_HUAWEI;
            hsq0.m132799m(context4, enumC14720d4, str);
            m85372l(strM85815a, c14757gw.f62265a, enumC14720d4);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m85376p(C14763hb c14763hb) {
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        if (c14753gsM85906a != null) {
            c14753gsM85906a = C14850au.m86568a(c14753gsM85906a.m85724a());
        }
        C14756gv c14756gv = new C14756gv();
        c14756gv.m85785b(c14763hb.m85913a());
        c14756gv.m85779a(c14753gsM85906a.m85728a());
        c14756gv.m85778a(c14753gsM85906a.m85723a());
        if (!TextUtils.isEmpty(c14753gsM85906a.m85738b())) {
            c14756gv.m85788c(c14753gsM85906a.m85738b());
        }
        c14756gv.m85780a(C14788m.m86274b(this.f61594a, c14763hb));
        C14722f.m85402h(this.f61594a).m85437y(c14756gv, EnumC14740gf.AckMessage, false, c14753gsM85906a);
    }

    /* JADX INFO: renamed from: q */
    private void m85377q(C14766he c14766he) {
        Map<String, String> mapM85949a = c14766he.m85949a();
        if (mapM85949a == null) {
            ilq0.m137040m("detect failed because null");
            return;
        }
        String str = (String) C14836ag.m86459a(mapM85949a, "pkgList", (Object) null);
        if (TextUtils.isEmpty(str)) {
            ilq0.m137040m("detect failed because empty");
            return;
        }
        Map<String, String> mapM85589i = C14739g.m85589i(this.f61594a, str);
        if (mapM85589i == null) {
            ilq0.m137040m("detect failed because get status illegal");
            return;
        }
        String str2 = mapM85589i.get("alive");
        String str3 = mapM85589i.get("notAlive");
        if (TextUtils.isEmpty(str2)) {
            ilq0.m137050w("detect failed because no alive process");
            return;
        }
        C14766he c14766he2 = new C14766he();
        c14766he2.m85943a(c14766he.m85948a());
        c14766he2.m85956b(c14766he.m85957b());
        c14766he2.m85964d(c14766he.m85965d());
        c14766he2.m85960c(EnumC14750gp.DetectAppAliveResult.f62110a);
        HashMap map = new HashMap();
        c14766he2.f62382a = map;
        map.put("alive", str2);
        if (Boolean.parseBoolean((String) C14836ag.m86459a(mapM85949a, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str3)) {
            c14766he2.f62382a.put("notAlive", str3);
        }
        C14722f.m85402h(this.f61594a).m85437y(c14766he2, EnumC14740gf.Notification, false, null);
    }

    /* JADX INFO: renamed from: b */
    public PushMessageHandler.InterfaceC14715a m85378b(Intent intent) {
        String action = intent.getAction();
        ilq0.m137040m("receive an intent from server, action=" + action);
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
                ilq0.m137025B("receiving an empty message, drop");
                nqq0.m160662a(this.f61594a).m160666d(this.f61594a.getPackageName(), intent, Constants.VIA_REPORT_TYPE_SET_AVATAR);
                return null;
            }
            C14763hb c14763hb = new C14763hb();
            try {
                C14788m.m86276d(c14763hb, byteArrayExtra);
                C14719c c14719cM85328c = C14719c.m85328c(this.f61594a);
                C14753gs c14753gsM85906a = c14763hb.m85906a();
                EnumC14740gf enumC14740gfM85905a = c14763hb.m85905a();
                EnumC14740gf enumC14740gf = EnumC14740gf.SendMessage;
                if (enumC14740gfM85905a == enumC14740gf && c14753gsM85906a != null && !c14719cM85328c.m85349w() && !booleanExtra) {
                    c14753gsM85906a.m85731a("mrt", stringExtra);
                    c14753gsM85906a.m85731a("mat", Long.toString(System.currentTimeMillis()));
                    if (m85374n(c14763hb)) {
                        ilq0.m137050w("this is a mina's message, ack later");
                        c14753gsM85906a.m85731a("__hybrid_message_ts", String.valueOf(c14753gsM85906a.m85723a()));
                        c14753gsM85906a.m85731a("__hybrid_device_status", String.valueOf((int) C14788m.m86274b(this.f61594a, c14763hb)));
                    } else {
                        m85376p(c14763hb);
                    }
                }
                if (c14763hb.m85905a() == enumC14740gf && !c14763hb.m85923b()) {
                    if (C14883x.m86883a(c14763hb)) {
                        ilq0.m137040m(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", c14763hb.m85921b(), c14753gsM85906a != null ? c14753gsM85906a.m85728a() : ""));
                        nqq0.m160662a(this.f61594a).m160666d(this.f61594a.getPackageName(), intent, String.format("13: %1$s", c14763hb.m85921b()));
                    } else {
                        ilq0.m137040m(String.format("drop an un-encrypted messages. %1$s, %2$s", c14763hb.m85921b(), c14753gsM85906a != null ? c14753gsM85906a.m85728a() : ""));
                        nqq0.m160662a(this.f61594a).m160666d(this.f61594a.getPackageName(), intent, String.format("14: %1$s", c14763hb.m85921b()));
                    }
                    evq0.m118310c(this.f61594a, c14763hb, booleanExtra);
                    return null;
                }
                if (c14763hb.m85905a() == enumC14740gf && c14763hb.m85923b() && C14883x.m86883a(c14763hb) && (!booleanExtra || c14753gsM85906a == null || c14753gsM85906a.m85729a() == null || !c14753gsM85906a.m85729a().containsKey("notify_effect"))) {
                    ilq0.m137040m(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", c14763hb.m85921b(), c14753gsM85906a != null ? c14753gsM85906a.m85728a() : ""));
                    nqq0.m160662a(this.f61594a).m160666d(this.f61594a.getPackageName(), intent, String.format("25: %1$s", c14763hb.m85921b()));
                    evq0.m118312e(this.f61594a, c14763hb, booleanExtra);
                    return null;
                }
                if (c14719cM85328c.m85345s() || c14763hb.f62346a == EnumC14740gf.Registration) {
                    if (!c14719cM85328c.m85345s() || !c14719cM85328c.m85351y()) {
                        return m85364c(c14763hb, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    if (c14763hb.f62346a != EnumC14740gf.UnRegistration) {
                        evq0.m118315h(this.f61594a, c14763hb, booleanExtra);
                        MiPushClient.unregisterPush(this.f61594a);
                    } else if (c14763hb.m85923b()) {
                        c14719cM85328c.m85332e();
                        MiPushClient.clearExtras(this.f61594a);
                        PushMessageHandler.m85286a();
                    } else {
                        ilq0.m137025B("receiving an un-encrypt unregistration message");
                    }
                } else {
                    if (C14883x.m86883a(c14763hb)) {
                        return m85364c(c14763hb, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    evq0.m118315h(this.f61594a, c14763hb, booleanExtra);
                    boolean zM85347u = c14719cM85328c.m85347u();
                    ilq0.m137025B("receive message without registration. need re-register!registered?" + zM85347u);
                    nqq0.m160662a(this.f61594a).m160666d(this.f61594a.getPackageName(), intent, Constants.VIA_REPORT_TYPE_WPA_STATE);
                    if (zM85347u) {
                        m85367g();
                    }
                }
            } catch (C14778hu e) {
                nqq0.m160662a(this.f61594a).m160666d(this.f61594a.getPackageName(), intent, Constants.VIA_REPORT_TYPE_START_WAP);
                ilq0.m137044q(e);
            } catch (Exception e2) {
                nqq0.m160662a(this.f61594a).m160666d(this.f61594a.getPackageName(), intent, Constants.VIA_REPORT_TYPE_START_GROUP);
                ilq0.m137044q(e2);
            }
        } else {
            if ("com.xiaomi.mipush.ERROR".equals(action)) {
                MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
                C14763hb c14763hb2 = new C14763hb();
                try {
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                    if (byteArrayExtra2 != null) {
                        C14788m.m86276d(c14763hb2, byteArrayExtra2);
                    }
                } catch (C14778hu unused) {
                }
                miPushCommandMessage.setCommand(String.valueOf(c14763hb2.m85905a()));
                miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
                miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
                ilq0.m137025B("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
                return miPushCommandMessage;
            }
            if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra3 == null) {
                    ilq0.m137025B("message arrived: receiving an empty message, drop");
                    return null;
                }
                C14763hb c14763hb3 = new C14763hb();
                try {
                    C14788m.m86276d(c14763hb3, byteArrayExtra3);
                    C14719c c14719cM85328c2 = C14719c.m85328c(this.f61594a);
                    if (C14883x.m86883a(c14763hb3)) {
                        ilq0.m137025B("message arrived: receive ignore reg message, ignore!");
                    } else if (!c14719cM85328c2.m85345s()) {
                        ilq0.m137025B("message arrived: receive message without registration. need unregister or re-register!");
                    } else {
                        if (!c14719cM85328c2.m85345s() || !c14719cM85328c2.m85351y()) {
                            return m85365d(c14763hb3, byteArrayExtra3);
                        }
                        ilq0.m137025B("message arrived: app info is invalidated");
                    }
                } catch (Exception e3) {
                    ilq0.m137025B("fail to deal with arrived message. " + e3);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public List<String> m85379f(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
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
