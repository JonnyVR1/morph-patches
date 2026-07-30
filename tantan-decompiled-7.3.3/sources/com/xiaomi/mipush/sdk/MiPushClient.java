package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.Message;
import com.tencent.mmkv.MMKV;
import com.xiaomi.push.C14887g;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14901gs;
import com.xiaomi.push.C14908gz;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14915hf;
import com.xiaomi.push.C14919hj;
import com.xiaomi.push.C14921hl;
import com.xiaomi.push.C14923hn;
import com.xiaomi.push.EnumC14880ed;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.EnumC14902gt;
import com.xiaomi.push.service.C14985ah;
import com.xiaomi.push.service.C14987aj;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p153l.b5r0;
import p153l.bvq0;
import p153l.d0r0;
import p153l.erq0;
import p153l.etq0;
import p153l.fmb0;
import p153l.ga5;
import p153l.hy5;
import p153l.i5r0;
import p153l.jyq0;
import p153l.k6r0;
import p153l.kyq0;
import p153l.l4r0;
import p153l.m5r0;
import p153l.mtq0;
import p153l.n1r0;
import p153l.n5r0;
import p153l.ouq0;
import p153l.oxq0;
import p153l.p4r0;
import p153l.qmb0;
import p153l.qzq0;
import p153l.rzq0;
import p153l.szq0;
import p153l.t3r0;
import p153l.t5r0;
import p153l.tsq0;
import p153l.u3r0;
import p153l.u4r0;
import p153l.uv5;
import p153l.v1d0;
import p153l.wg3;
import p153l.xzv;
import p153l.zrq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    private static Context sContext;
    private static long sCurMsgId = System.currentTimeMillis();

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$a */
    public static class RunnableC14848a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f62378a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f62379b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f62380c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC14855h f62381d;

        public RunnableC14848a(String str, String str2, String str3, InterfaceC14855h interfaceC14855h) {
            this.f62378a = str;
            this.f62379b = str2;
            this.f62380c = str3;
            this.f62381d = interfaceC14855h;
        }

        @Override // java.lang.Runnable
        public void run() {
            MiPushClient.initialize(MiPushClient.sContext, this.f62378a, this.f62379b, null, this.f62380c, this.f62381d);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$b */
    public static class RunnableC14849b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            kyq0.m152127a(MiPushClient.sContext);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$c */
    public static class RunnableC14850c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (l4r0.m152835t()) {
                return;
            }
            if (u3r0.m194412t(MiPushClient.sContext) != null || etq0.m122490c(MiPushClient.sContext).mo100237a()) {
                C14914he c14914he = new C14914he();
                c14914he.m87127b(C14867c.m86499c(MiPushClient.sContext).m86502d());
                c14914he.m87131c(EnumC14898gp.ClientInfoUpdate.f62957a);
                c14914he.m87114a(C14987aj.m87666a());
                c14914he.m87116a(new HashMap());
                String strM194412t = u3r0.m194412t(MiPushClient.sContext);
                String str = "";
                if (!TextUtils.isEmpty(strM194412t)) {
                    str = "" + bvq0.m106588b(strM194412t);
                }
                String strM194416x = u3r0.m194416x(MiPushClient.sContext);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strM194416x)) {
                    str = str + Constants.SEPARATOR_COMMA + strM194416x;
                }
                if (!TextUtils.isEmpty(str)) {
                    c14914he.m87120a().put("imei_md5", str);
                }
                etq0.m122490c(MiPushClient.sContext).m122492e(c14914he.m87120a());
                int iM194395c = u3r0.m194395c();
                if (iM194395c >= 0) {
                    c14914he.m87120a().put("space_id", Integer.toString(iM194395c));
                }
                C14870f.m86573h(MiPushClient.sContext).m86608y(c14914he, EnumC14888gf.Notification, false, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$d */
    public static class RunnableC14851d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String[] f62382a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f62383b;

        public RunnableC14851d(String[] strArr, Context context) {
            this.f62382a = strArr;
            this.f62383b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            PackageInfo packageInfo;
            try {
                for (String str : this.f62382a) {
                    if (!TextUtils.isEmpty(str) && (packageInfo = this.f62383b.getPackageManager().getPackageInfo(str, 4)) != null) {
                        MiPushClient.awakePushServiceByPackageInfo(this.f62383b, packageInfo);
                    }
                }
            } catch (Throwable th) {
                ouq0.m169397q(th);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$e */
    public static class C14852e implements szq0.InterfaceC20197a {
        @Override // p153l.szq0.InterfaceC20197a
        /* JADX INFO: renamed from: a */
        public void mo86442a(Context context, C14892gj c14892gj) {
            C14866b.m86480a(context, c14892gj);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$f */
    public static class C14853f extends C14985ah.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f62384a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14853f(int i, String str, Context context) {
            super(i, str);
            this.f62384a = context;
        }

        @Override // com.xiaomi.push.service.C14985ah.a
        public void onCallback() {
            szq0.m188674k(this.f62384a);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$g */
    public static class C14854g {

        /* JADX INFO: renamed from: a */
        private long f62385a = -1;

        /* JADX INFO: renamed from: a */
        public long m86443a() {
            return this.f62385a;
        }

        /* JADX INFO: renamed from: b */
        public void m86444b(long j) {
            this.f62385a = j;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$h */
    public interface InterfaceC14855h<R> {
        void onResult(R r);
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$i */
    @Deprecated
    public static abstract class AbstractC14856i {

        /* JADX INFO: renamed from: a */
        private String f62386a;

        /* JADX INFO: renamed from: a */
        public String m86445a() {
            return this.f62386a;
        }

        /* JADX INFO: renamed from: b */
        public void m86446b(String str, long j, String str2, List<String> list) {
        }

        /* JADX INFO: renamed from: c */
        public void m86447c(long j, String str, String str2) {
        }

        /* JADX INFO: renamed from: d */
        public void m86448d(MiPushMessage miPushMessage) {
        }

        /* JADX INFO: renamed from: e */
        public void m86449e(String str, String str2, String str3, boolean z) {
        }

        /* JADX INFO: renamed from: f */
        public void m86450f(long j, String str, String str2) {
        }

        /* JADX INFO: renamed from: g */
        public void m86451g(long j, String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$j */
    public static class C14857j {

        /* JADX INFO: renamed from: a */
        private String f62387a = null;

        /* JADX INFO: renamed from: b */
        private long f62388b = -1;

        /* JADX INFO: renamed from: a */
        public long m86452a() {
            return this.f62388b;
        }

        /* JADX INFO: renamed from: b */
        public String m86453b() {
            return this.f62387a;
        }

        /* JADX INFO: renamed from: c */
        public void m86454c(long j) {
            this.f62388b = j;
        }

        /* JADX INFO: renamed from: d */
        public void m86455d(String str) {
            this.f62387a = str;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$k */
    public interface InterfaceC14858k extends InterfaceC14855h<C14857j> {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$l */
    public interface InterfaceC14859l extends InterfaceC14855h<C14854g> {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$m */
    public interface InterfaceC14860m extends InterfaceC14855h<C14857j> {
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        return TextUtils.equals(getAcceptTime(context), str + Constants.SEPARATOR_COMMA + str2);
    }

    public static long accountSetTime(Context context, String str) {
        return context.getSharedPreferences(PREF_EXTRA, 0).getLong("account_" + str, -1L);
    }

    public static synchronized void addAcceptTime(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_EXTRA, 0).edit();
        editorEdit.putString("accept_time", str + Constants.SEPARATOR_COMMA + str2);
        n5r0.m161732a(editorEdit);
    }

    public static synchronized void addAccount(Context context, String str) {
        context.getSharedPreferences(PREF_EXTRA, 0).edit().putLong("account_" + str, System.currentTimeMillis()).commit();
    }

    public static synchronized void addAlias(Context context, String str) {
        context.getSharedPreferences(PREF_EXTRA, 0).edit().putLong("alias_" + str, System.currentTimeMillis()).commit();
    }

    private static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_EXTRA, 0).edit();
        editorEdit.putLong("last_pull_notification", System.currentTimeMillis());
        n5r0.m161732a(editorEdit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_EXTRA, 0).edit();
        editorEdit.putLong("last_reg_request", System.currentTimeMillis());
        n5r0.m161732a(editorEdit);
    }

    public static synchronized void addTopic(Context context, String str) {
        context.getSharedPreferences(PREF_EXTRA, 0).edit().putLong("topic_" + str, System.currentTimeMillis()).commit();
    }

    public static long aliasSetTime(Context context, String str) {
        return context.getSharedPreferences(PREF_EXTRA, 0).getLong("alias_" + str, -1L);
    }

    public static void awakeApps(Context context, String[] strArr) {
        tsq0.m192627f(context).m192628g(new RunnableC14851d(strArr, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        PushMessageHandler.m86460a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        v1d0.m199002a("param ", str, " is not nullable");
    }

    public static void clearExtras(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_EXTRA, 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    private static void clearExtrasForInitialize(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_EXTRA, 0).edit();
        Iterator<String> it = getAllAlias(context).iterator();
        while (it.hasNext()) {
            editorEdit.remove("alias_" + it.next());
        }
        Iterator<String> it2 = getAllUserAccount(context).iterator();
        while (it2.hasNext()) {
            editorEdit.remove("account_" + it2.next());
        }
        Iterator<String> it3 = getAllTopic(context).iterator();
        while (it3.hasNext()) {
            editorEdit.remove("topic_" + it3.next());
        }
        editorEdit.remove("accept_time");
        editorEdit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        C14870f.m86573h(context).m86596d0();
    }

    public static void clearNotification(Context context) {
        C14870f.m86573h(context).m86598n(-1);
    }

    public static void disablePush(Context context) {
        C14870f.m86573h(context).m86585H(true);
    }

    public static void enablePush(Context context) {
        C14870f.m86573h(context).m86585H(false);
    }

    public static String getAcceptTime(Context context) {
        return context.getSharedPreferences(PREF_EXTRA, 0).getString("accept_time", "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences(PREF_EXTRA, 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences(PREF_EXTRA, 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences(PREF_EXTRA, 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (C14867c.m86499c(context).m86516s()) {
            return C14867c.m86499c(context).m86521x();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return l4r0.m152831p();
    }

    public static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, "context");
        return d0r0.m113425c(context).m113434k(EnumC14868d.ASSEMBLE_PUSH_FCM);
    }

    public static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, "context");
        return d0r0.m113425c(context).m113434k(EnumC14868d.ASSEMBLE_PUSH_HUAWEI);
    }

    public static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, "context");
        return d0r0.m113425c(context).m113434k(EnumC14868d.ASSEMBLE_PUSH_COS);
    }

    public static boolean getOpenVIVOPush(Context context) {
        return d0r0.m113425c(context).m113434k(EnumC14868d.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (C14867c.m86499c(context).m86516s()) {
            return C14867c.m86499c(context).m86515q();
        }
        return null;
    }

    private static void initEventPerfLogic(Context context) {
        szq0.m188678o(new C14852e());
        uv5 uv5VarM188669f = szq0.m188669f(context);
        erq0.m122263f(context).m122279h("5_9_9-C");
        ga5.m129687a(context, uv5VarM188669f, new qzq0(context), new rzq0(context));
        zrq0.m221183b(context);
        p4r0.m170576a(context, uv5VarM188669f);
        C14985ah.m87648a(context).m87657a(new C14853f(100, "perf event job update", context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initialize(Context context, String str, String str2, AbstractC14856i abstractC14856i, String str3, InterfaceC14855h interfaceC14855h) {
        try {
            ouq0.m169391k(context.getApplicationContext());
            ouq0.m169380D("sdk_version = 5_9_9-C");
            etq0.m122490c(context).m122491d();
            oxq0.m169724a(context);
            if (abstractC14856i != null) {
                PushMessageHandler.m86468a(abstractC14856i);
            }
            if (interfaceC14855h != null) {
                PushMessageHandler.m86467a(interfaceC14855h);
            }
            if (t5r0.m189423g(sContext)) {
                C14872m.m86611b(sContext);
            }
            boolean z = C14867c.m86499c(sContext).m86501a() != hy5.m137713a();
            if (!z && !shouldSendRegRequest(sContext)) {
                C14870f.m86573h(sContext).m86597m();
                ouq0.m169393m("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z || !C14867c.m86499c(sContext).m86510l(str, str2) || C14867c.m86499c(sContext).m86522y()) {
                String strM106587a = bvq0.m106587a(6);
                C14867c.m86499c(sContext).m86503e();
                C14867c.m86499c(sContext).m86504f(hy5.m137713a());
                C14867c.m86499c(sContext).m86507i(str, str2, strM106587a);
                C14866b.a.m86482b().m86490h("com.xiaomi.xmpushsdk.tinydataPending.appId");
                clearExtras(sContext);
                clearNotification(context);
                C14915hf c14915hf = new C14915hf();
                c14915hf.m87155a(C14987aj.m87668b());
                c14915hf.m87162b(str);
                c14915hf.m87174e(str2);
                c14915hf.m87171d(sContext.getPackageName());
                c14915hf.m87177f(strM106587a);
                Context context2 = sContext;
                c14915hf.m87167c(C14887g.m86759h(context2, context2.getPackageName()));
                Context context3 = sContext;
                c14915hf.m87161b(C14887g.m86753b(context3, context3.getPackageName()));
                c14915hf.m87183h("5_9_9-C");
                c14915hf.m87153a(50909);
                c14915hf.m87154a(EnumC14902gt.Init);
                if (!TextUtils.isEmpty(str3)) {
                    c14915hf.m87180g(str3);
                }
                if (!l4r0.m152835t()) {
                    String strM194415w = u3r0.m194415w(sContext);
                    if (!TextUtils.isEmpty(strM194415w)) {
                        c14915hf.m87186i(bvq0.m106588b(strM194415w) + Constants.SEPARATOR_COMMA + u3r0.m194417y(sContext));
                    }
                }
                int iM194395c = u3r0.m194395c();
                if (iM194395c >= 0) {
                    c14915hf.m87166c(iM194395c);
                }
                C14870f.m86573h(sContext).m86604u(c14915hf, z);
                sContext.getSharedPreferences(PREF_EXTRA, 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == qmb0.m177073c(sContext)) {
                    checkNotNull(abstractC14856i, "callback");
                    abstractC14856i.m86447c(0L, null, C14867c.m86499c(sContext).m86515q());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C14867c.m86499c(sContext).m86515q());
                    qmb0.m177076f(sContext, qmb0.m177071a(EnumC14880ed.COMMAND_REGISTER.f62514a, arrayList, 0L, null, null, null));
                }
                C14870f.m86573h(sContext).m86597m();
                if (C14867c.m86499c(sContext).m86509k()) {
                    C14914he c14914he = new C14914he();
                    c14914he.m87127b(C14867c.m86499c(sContext).m86502d());
                    c14914he.m87131c(EnumC14898gp.ClientInfoUpdate.f62957a);
                    c14914he.m87114a(C14987aj.m87666a());
                    HashMap map = new HashMap();
                    c14914he.f63229a = map;
                    Context context4 = sContext;
                    map.put("app_version", C14887g.m86759h(context4, context4.getPackageName()));
                    Map<String, String> map2 = c14914he.f63229a;
                    Context context5 = sContext;
                    map2.put("app_version_code", Integer.toString(C14887g.m86753b(context5, context5.getPackageName())));
                    c14914he.f63229a.put("push_sdk_vn", "5_9_9-C");
                    c14914he.f63229a.put("push_sdk_vc", Integer.toString(50909));
                    String strM86519v = C14867c.m86499c(sContext).m86519v();
                    if (!TextUtils.isEmpty(strM86519v)) {
                        c14914he.f63229a.put("deviceid", strM86519v);
                    }
                    C14870f.m86573h(sContext).m86608y(c14914he, EnumC14888gf.Notification, false, null);
                    C14870f.m86573h(sContext).m86601q(sContext);
                }
                if (!u4r0.m194498d(sContext, "update_devId", false)) {
                    updateImeiOrOaid();
                    u4r0.m194496b(sContext, "update_devId", true);
                }
                if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                    C14914he c14914he2 = new C14914he();
                    c14914he2.m87127b(C14867c.m86499c(sContext).m86502d());
                    c14914he2.m87131c(EnumC14898gp.PullOfflineMessage.f62957a);
                    c14914he2.m87114a(C14987aj.m87666a());
                    c14914he2.m87117a(false);
                    C14870f.m86573h(sContext).m86609z(c14914he2, EnumC14888gf.Notification, false, null, false);
                    addPullNotificationTime(sContext);
                }
            }
            addRegRequestTime(sContext);
            scheduleOcVersionCheckJob();
            scheduleDataCollectionJobs(sContext);
            initEventPerfLogic(sContext);
            k6r0.m148562b(sContext);
            if (!sContext.getPackageName().equals("com.xiaomi.xmsf")) {
                if (xzv.m213820a() != null) {
                    xzv.m213821b(sContext, xzv.m213820a());
                }
                ouq0.m169387g(2);
            }
            operateSyncAction(context);
        } catch (Throwable th) {
            ouq0.m169397q(th);
        }
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(m5r0.m157115c(sContext).m157117b(EnumC14874v.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(m5r0.m157115c(sContext).m157117b(EnumC14874v.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        m5r0 m5r0VarM157115c = m5r0.m157115c(sContext);
        EnumC14874v enumC14874v = EnumC14874v.UPLOAD_HUAWEI_TOKEN;
        if ("syncing".equals(m5r0VarM157115c.m157117b(enumC14874v))) {
            C14870f.m86573h(sContext).m86583E(null, enumC14874v, EnumC14868d.ASSEMBLE_PUSH_HUAWEI, "init");
        }
        if ("syncing".equals(m5r0.m157115c(sContext).m157117b(EnumC14874v.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        m5r0 m5r0VarM157115c2 = m5r0.m157115c(sContext);
        EnumC14874v enumC14874v2 = EnumC14874v.UPLOAD_COS_TOKEN;
        if ("syncing".equals(m5r0VarM157115c2.m157117b(enumC14874v2))) {
            C14870f.m86573h(sContext).m86583E(null, enumC14874v2, EnumC14868d.ASSEMBLE_PUSH_COS, "init");
        }
        m5r0 m5r0VarM157115c3 = m5r0.m157115c(sContext);
        EnumC14874v enumC14874v3 = EnumC14874v.UPLOAD_FTOS_TOKEN;
        if ("syncing".equals(m5r0VarM157115c3.m157117b(enumC14874v3))) {
            C14870f.m86573h(context).m86583E(null, enumC14874v3, EnumC14868d.ASSEMBLE_PUSH_FTOS, "init");
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    public static void reInitialize(Context context, EnumC14902gt enumC14902gt) {
        ouq0.m169380D("re-register reason: " + enumC14902gt);
        String strM106587a = bvq0.m106587a(6);
        String strM86502d = C14867c.m86499c(context).m86502d();
        String strM86511m = C14867c.m86499c(context).m86511m();
        C14867c.m86499c(context).m86503e();
        clearExtrasForInitialize(context);
        clearNotification(context);
        C14867c.m86499c(context).m86504f(hy5.m137713a());
        C14867c.m86499c(context).m86507i(strM86502d, strM86511m, strM106587a);
        C14915hf c14915hf = new C14915hf();
        c14915hf.m87155a(C14987aj.m87668b());
        c14915hf.m87162b(strM86502d);
        c14915hf.m87174e(strM86511m);
        c14915hf.m87177f(strM106587a);
        c14915hf.m87171d(context.getPackageName());
        c14915hf.m87167c(C14887g.m86759h(context, context.getPackageName()));
        c14915hf.m87161b(C14887g.m86753b(context, context.getPackageName()));
        c14915hf.m87183h("5_9_9-C");
        c14915hf.m87153a(50909);
        c14915hf.m87154a(enumC14902gt);
        int iM194395c = u3r0.m194395c();
        if (iM194395c >= 0) {
            c14915hf.m87166c(iM194395c);
        }
        C14870f.m86573h(context).m86604u(c14915hf, false);
    }

    @Deprecated
    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            b5r0.m102621a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter, 2);
        } catch (Throwable th) {
            ouq0.m169393m("dynamic register network status receiver failed:" + th);
        }
        mtq0.m160028d(sContext);
    }

    private static void registerPush(Context context, String str, String str2, fmb0 fmb0Var, String str3, InterfaceC14855h interfaceC14855h) {
        checkNotNull(context, "context");
        checkNotNull(str, Message.APP_ID);
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        t5r0.m189421e(context2);
        if (!NetworkStatusReceiver.m87958a()) {
            registerNetworkReceiver(sContext);
        }
        d0r0.m113425c(sContext).m113432g(fmb0Var);
        tsq0.m192627f(context2).m192628g(new RunnableC14848a(str, str2, str3, interfaceC14855h));
    }

    public static void registerToken(Context context, String str, String str2, String str3, InterfaceC14858k interfaceC14858k) {
        registerPush(context, str, str2, new fmb0(), null, interfaceC14858k);
    }

    public static synchronized void removeAcceptTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_EXTRA, 0).edit();
        editorEdit.remove("accept_time");
        n5r0.m161732a(editorEdit);
    }

    public static synchronized void removeAccount(Context context, String str) {
        context.getSharedPreferences(PREF_EXTRA, 0).edit().remove("account_" + str).commit();
    }

    public static synchronized void removeAlias(Context context, String str) {
        context.getSharedPreferences(PREF_EXTRA, 0).edit().remove("alias_" + str).commit();
    }

    public static synchronized void removeAllAccounts(Context context) {
        Iterator<String> it = getAllUserAccount(context).iterator();
        while (it.hasNext()) {
            removeAccount(context, it.next());
        }
    }

    public static synchronized void removeAllAliases(Context context) {
        Iterator<String> it = getAllAlias(context).iterator();
        while (it.hasNext()) {
            removeAlias(context, it.next());
        }
    }

    public static synchronized void removeAllTopics(Context context) {
        Iterator<String> it = getAllTopic(context).iterator();
        while (it.hasNext()) {
            removeTopic(context, it.next());
        }
    }

    public static synchronized void removeTopic(Context context, String str) {
        context.getSharedPreferences(PREF_EXTRA, 0).edit().remove("topic_" + str).commit();
    }

    public static void removeWindow(Context context) {
        C14870f.m86573h(context).m86595b0();
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        if (C14867c.m86499c(context).m86514p()) {
            EnumC14898gp enumC14898gp = z ? EnumC14898gp.APP_SLEEP : EnumC14898gp.APP_WAKEUP;
            C14914he c14914he = new C14914he();
            c14914he.m87127b(C14867c.m86499c(context).m86502d());
            c14914he.m87131c(enumC14898gp.f62957a);
            c14914he.m87135d(context.getPackageName());
            c14914he.m87114a(C14987aj.m87666a());
            c14914he.m87117a(false);
            C14870f.m86573h(context).m86609z(c14914he, EnumC14888gf.Notification, false, null, false);
        }
    }

    public static void reportIgnoreRegMessageClicked(Context context, String str, C14901gs c14901gs, String str2, String str3) {
        C14914he c14914he = new C14914he();
        if (TextUtils.isEmpty(str3)) {
            ouq0.m169378B("do not report clicked message");
            return;
        }
        c14914he.m87127b(str3);
        c14914he.m87131c("bar:click");
        c14914he.m87114a(str);
        c14914he.m87117a(false);
        C14870f.m86573h(context).m86580B(c14914he, EnumC14888gf.Notification, false, true, c14901gs, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        C14901gs c14901gs = new C14901gs();
        c14901gs.m86897a(miPushMessage.getMessageId());
        c14901gs.m86908b(miPushMessage.getTopic());
        c14901gs.m86920d(miPushMessage.getDescription());
        c14901gs.m86916c(miPushMessage.getTitle());
        c14901gs.m86915c(miPushMessage.getNotifyId());
        c14901gs.m86896a(miPushMessage.getNotifyType());
        c14901gs.m86907b(miPushMessage.getPassThrough());
        c14901gs.m86898a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), c14901gs, null);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (C14985ah.m87648a(sContext).m87660a(EnumC14893gk.DataCollectionSwitch.m86817a(), getDefaultSwitch())) {
            jyq0.m147615b().m147617c(new t3r0(context));
            tsq0.m192627f(sContext).m192629h(new RunnableC14849b(), 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        tsq0.m192627f(sContext).m192633l(new i5r0(sContext), C14985ah.m87648a(sContext).m87652a(EnumC14893gk.OcVersionCheckFrequency.m86817a(), MMKV.ExpireInDay), 5);
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        if (i < 0 || i >= 24 || i3 < 0 || i3 >= 24 || i2 < 0 || i2 >= 60 || i4 < 0 || i4 >= 60) {
            wg3.m206174a("the input parameter is not valid.");
            return;
        }
        long rawOffset = ((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60;
        long j = ((((long) ((i * 60) + i2)) + rawOffset) + 1440) % 1440;
        long j2 = ((((long) ((i3 * 60) + i4)) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j / 60), Long.valueOf(j % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i), Integer.valueOf(i2)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i4)));
        if (!acceptTimeSet(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context, EnumC14880ed.COMMAND_SET_ACCEPT_TIME.f62514a, (ArrayList<String>) arrayList, str);
        } else if (1 == qmb0.m177073c(context)) {
            PushMessageHandler.m86466a(context, str, EnumC14880ed.COMMAND_SET_ACCEPT_TIME.f62514a, 0L, null, arrayList2);
        } else {
            qmb0.m177076f(context, qmb0.m177071a(EnumC14880ed.COMMAND_SET_ACCEPT_TIME.f62514a, arrayList2, 0L, null, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, EnumC14880ed.COMMAND_SET_ALIAS.f62514a, str, str2);
    }

    public static void setCommand(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        EnumC14880ed enumC14880ed = EnumC14880ed.COMMAND_SET_ALIAS;
        if (enumC14880ed.f62514a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) < 86400000) {
            if (1 == qmb0.m177073c(context)) {
                PushMessageHandler.m86466a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                qmb0.m177076f(context, qmb0.m177071a(enumC14880ed.f62514a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (EnumC14880ed.COMMAND_UNSET_ALIAS.f62514a.equalsIgnoreCase(str) && aliasSetTime(context, str2) < 0) {
            ouq0.m169393m("Don't cancel alias for " + bvq0.m106589c(arrayList.toString(), 3) + " is unseted");
            return;
        }
        EnumC14880ed enumC14880ed2 = EnumC14880ed.COMMAND_SET_ACCOUNT;
        if (enumC14880ed2.f62514a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) < 3600000) {
            if (1 == qmb0.m177073c(context)) {
                PushMessageHandler.m86466a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                qmb0.m177076f(context, qmb0.m177071a(enumC14880ed2.f62514a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (!EnumC14880ed.COMMAND_UNSET_ACCOUNT.f62514a.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
            setCommand(context, str, (ArrayList<String>) arrayList, str3);
            return;
        }
        ouq0.m169393m("Don't cancel account for " + bvq0.m106589c(arrayList.toString(), 3) + " is unseted");
    }

    public static void setLocalNotificationType(Context context, int i) {
        C14870f.m86573h(context).m86590O(i);
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, EnumC14880ed.COMMAND_SET_ACCOUNT.f62514a, str, str2);
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences(PREF_EXTRA, 0).getLong("last_pull_notification", -1L)) > Constants.INBOX_V2_THROTTLE_WINDOW_MS;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences(PREF_EXTRA, 0).getLong("last_reg_request", -1L)) > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return C14870f.m86573h(context).m86587J();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (TextUtils.isEmpty(C14867c.m86499c(context).m86502d()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) <= 86400000) {
            if (1 == qmb0.m177073c(context)) {
                PushMessageHandler.m86465a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            qmb0.m177076f(context, qmb0.m177071a(EnumC14880ed.COMMAND_SUBSCRIBE_TOPIC.f62514a, arrayList, 0L, null, null, null));
            return;
        }
        C14919hj c14919hj = new C14919hj();
        String strM87666a = C14987aj.m87666a();
        c14919hj.m87274a(strM87666a);
        c14919hj.m87278b(C14867c.m86499c(context).m86502d());
        c14919hj.m87280c(str);
        c14919hj.m87282d(context.getPackageName());
        c14919hj.m87284e(str2);
        ouq0.m169380D("cmd:" + EnumC14880ed.COMMAND_SUBSCRIBE_TOPIC + ", " + strM87666a);
        C14870f.m86573h(context).m86606w(c14919hj, EnumC14888gf.Subscription, null);
    }

    @Deprecated
    public static void syncAssembleCOSPushToken(Context context) {
    }

    public static void syncAssembleFCMPushToken(Context context) {
        C14870f.m86573h(context).m86583E(null, EnumC14874v.UPLOAD_FCM_TOKEN, EnumC14868d.ASSEMBLE_PUSH_FCM, "");
    }

    @Deprecated
    public static void syncAssembleFTOSPushToken(Context context) {
    }

    @Deprecated
    public static void syncAssemblePushToken(Context context) {
    }

    public static long topicSubscribedTime(Context context, String str) {
        return context.getSharedPreferences(PREF_EXTRA, 0).getLong("topic_" + str, -1L);
    }

    public static void turnOffPush(Context context, InterfaceC14859l interfaceC14859l) {
        disablePush(context);
        if (interfaceC14859l != null) {
            C14854g c14854g = new C14854g();
            c14854g.m86444b(0L);
            c14854g.m86443a();
            interfaceC14859l.onResult(c14854g);
        }
    }

    public static void turnOnPush(Context context, InterfaceC14859l interfaceC14859l) {
        enablePush(context);
        if (interfaceC14859l != null) {
            C14854g c14854g = new C14854g();
            c14854g.m86444b(0L);
            c14854g.m86443a();
            interfaceC14859l.onResult(c14854g);
        }
    }

    public static void unRegisterToken(Context context, InterfaceC14860m interfaceC14860m) {
        unregisterPush(context);
        if (interfaceC14860m != null) {
            C14857j c14857j = new C14857j();
            c14857j.m86455d(null);
            c14857j.m86453b();
            c14857j.m86454c(0L);
            c14857j.m86452a();
            interfaceC14860m.onResult(c14857j);
        }
    }

    public static void unregisterPush(Context context) {
        n1r0.m161142n(context);
        C14985ah.m87648a(context).m87656a();
        if (C14867c.m86499c(context).m86514p()) {
            C14921hl c14921hl = new C14921hl();
            c14921hl.m87306a(C14987aj.m87666a());
            c14921hl.m87311b(C14867c.m86499c(context).m86502d());
            c14921hl.m87314c(C14867c.m86499c(context).m86515q());
            c14921hl.m87318e(C14867c.m86499c(context).m86511m());
            c14921hl.m87316d(context.getPackageName());
            C14870f.m86573h(context).m86605v(c14921hl);
            PushMessageHandler.m86457a();
            PushMessageHandler.m86470b();
            C14867c.m86499c(context).m86512n();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, EnumC14880ed.COMMAND_UNSET_ALIAS.f62514a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, EnumC14880ed.COMMAND_UNSET_ACCOUNT.f62514a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (C14867c.m86499c(context).m86514p()) {
            if (topicSubscribedTime(context, str) < 0) {
                ouq0.m169393m("Don't cancel subscribe for " + bvq0.m106589c(str, 3) + " is unsubscribed");
                return;
            }
            C14923hn c14923hn = new C14923hn();
            String strM87666a = C14987aj.m87666a();
            c14923hn.m87344a(strM87666a);
            c14923hn.m87348b(C14867c.m86499c(context).m86502d());
            c14923hn.m87350c(str);
            c14923hn.m87352d(context.getPackageName());
            c14923hn.m87354e(str2);
            ouq0.m169380D("cmd:" + EnumC14880ed.COMMAND_UNSUBSCRIBE_TOPIC + ", " + strM87666a);
            C14870f.m86573h(context).m86606w(c14923hn, EnumC14888gf.UnSubscription, null);
        }
    }

    private static void updateImeiOrOaid() {
        new Thread(new RunnableC14850c()).start();
    }

    public static void clearNotification(Context context, String str, String str2) {
        C14870f.m86573h(context).m86584G(str, str2);
    }

    public static void clearNotification(Context context, int i) {
        C14870f.m86573h(context).m86598n(i);
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new fmb0(), str3, null);
    }

    public static void registerPush(Context context, String str, String str2, fmb0 fmb0Var) {
        registerPush(context, str, str2, fmb0Var, null, null);
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new fmb0());
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    public static void reportMessageClicked(Context context, String str, C14901gs c14901gs, String str2) {
        C14914he c14914he = new C14914he();
        if (TextUtils.isEmpty(str2)) {
            if (C14867c.m86499c(context).m86514p()) {
                c14914he.m87127b(C14867c.m86499c(context).m86502d());
            } else {
                ouq0.m169378B("do not report clicked message");
                return;
            }
        } else {
            c14914he.m87127b(str2);
        }
        c14914he.m87131c("bar:click");
        c14914he.m87114a(str);
        c14914he.m87117a(false);
        C14870f.m86573h(context).m86608y(c14914he, EnumC14888gf.Notification, false, c14901gs);
    }

    public static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(C14867c.m86499c(context).m86502d())) {
            return;
        }
        C14908gz c14908gz = new C14908gz();
        String strM87666a = C14987aj.m87666a();
        c14908gz.m87021a(strM87666a);
        c14908gz.m87028b(C14867c.m86499c(context).m86502d());
        c14908gz.m87031c(str);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            c14908gz.m87024a(it.next());
        }
        c14908gz.m87036e(str2);
        c14908gz.m87034d(context.getPackageName());
        ouq0.m169380D("cmd:" + str + ", " + strM87666a);
        C14870f.m86573h(context).m86606w(c14908gz, EnumC14888gf.Command, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, AbstractC14856i abstractC14856i) {
        initialize(context, str, str2, abstractC14856i, null, null);
    }
}
