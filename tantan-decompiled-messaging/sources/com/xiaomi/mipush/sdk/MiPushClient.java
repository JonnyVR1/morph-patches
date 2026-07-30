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
import com.xiaomi.push.C14739g;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14753gs;
import com.xiaomi.push.C14760gz;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14767hf;
import com.xiaomi.push.C14771hj;
import com.xiaomi.push.C14773hl;
import com.xiaomi.push.C14775hn;
import com.xiaomi.push.EnumC14732ed;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.EnumC14754gt;
import com.xiaomi.push.service.C14837ah;
import com.xiaomi.push.service.C14839aj;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p149l.ayv;
import p149l.beb0;
import p149l.cwq0;
import p149l.cx5;
import p149l.dpq0;
import p149l.epq0;
import p149l.exq0;
import p149l.f95;
import p149l.fvq0;
import p149l.gkq0;
import p149l.gwq0;
import p149l.hsq0;
import p149l.hwq0;
import p149l.ig3;
import p149l.ilq0;
import p149l.ioq0;
import p149l.jvq0;
import p149l.kqq0;
import p149l.lqq0;
import p149l.meb0;
import p149l.mqq0;
import p149l.njq0;
import p149l.nuq0;
import p149l.nwq0;
import p149l.ouq0;
import p149l.ovq0;
import p149l.qtc0;
import p149l.qu5;
import p149l.uiq0;
import p149l.vlq0;
import p149l.vvq0;
import p149l.xqq0;
import p149l.yjq0;
import p149l.zhq0;

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
    public static class RunnableC14700a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f61531a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f61532b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f61533c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC14707h f61534d;

        public RunnableC14700a(String str, String str2, String str3, InterfaceC14707h interfaceC14707h) {
            this.f61531a = str;
            this.f61532b = str2;
            this.f61533c = str3;
            this.f61534d = interfaceC14707h;
        }

        @Override // java.lang.Runnable
        public void run() {
            MiPushClient.initialize(MiPushClient.sContext, this.f61531a, this.f61532b, null, this.f61533c, this.f61534d);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$b */
    public static class RunnableC14701b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            epq0.m117673a(MiPushClient.sContext);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$c */
    public static class RunnableC14702c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (fvq0.m123366t()) {
                return;
            }
            if (ouq0.m166111t(MiPushClient.sContext) != null || yjq0.m215084c(MiPushClient.sContext).mo97175a()) {
                C14766he c14766he = new C14766he();
                c14766he.m85956b(C14719c.m85328c(MiPushClient.sContext).m85331d());
                c14766he.m85960c(EnumC14750gp.ClientInfoUpdate.f62110a);
                c14766he.m85943a(C14839aj.m86495a());
                c14766he.m85945a(new HashMap());
                String strM166111t = ouq0.m166111t(MiPushClient.sContext);
                String str = "";
                if (!TextUtils.isEmpty(strM166111t)) {
                    str = "" + vlq0.m198839b(strM166111t);
                }
                String strM166115x = ouq0.m166115x(MiPushClient.sContext);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strM166115x)) {
                    str = str + Constants.SEPARATOR_COMMA + strM166115x;
                }
                if (!TextUtils.isEmpty(str)) {
                    c14766he.m85949a().put("imei_md5", str);
                }
                yjq0.m215084c(MiPushClient.sContext).m215086e(c14766he.m85949a());
                int iM166094c = ouq0.m166094c();
                if (iM166094c >= 0) {
                    c14766he.m85949a().put("space_id", Integer.toString(iM166094c));
                }
                C14722f.m85402h(MiPushClient.sContext).m85437y(c14766he, EnumC14740gf.Notification, false, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$d */
    public static class RunnableC14703d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String[] f61535a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f61536b;

        public RunnableC14703d(String[] strArr, Context context) {
            this.f61535a = strArr;
            this.f61536b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            PackageInfo packageInfo;
            try {
                for (String str : this.f61535a) {
                    if (!TextUtils.isEmpty(str) && (packageInfo = this.f61536b.getPackageManager().getPackageInfo(str, 4)) != null) {
                        MiPushClient.awakePushServiceByPackageInfo(this.f61536b, packageInfo);
                    }
                }
            } catch (Throwable th) {
                ilq0.m137044q(th);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$e */
    public static class C14704e implements mqq0.InterfaceC18538a {
        @Override // p149l.mqq0.InterfaceC18538a
        /* JADX INFO: renamed from: a */
        public void mo85271a(Context context, C14744gj c14744gj) {
            C14718b.m85309a(context, c14744gj);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$f */
    public static class C14705f extends C14837ah.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f61537a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14705f(int i, String str, Context context) {
            super(i, str);
            this.f61537a = context;
        }

        @Override // com.xiaomi.push.service.C14837ah.a
        public void onCallback() {
            mqq0.m155988k(this.f61537a);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$g */
    public static class C14706g {

        /* JADX INFO: renamed from: a */
        private long f61538a = -1;

        /* JADX INFO: renamed from: a */
        public long m85272a() {
            return this.f61538a;
        }

        /* JADX INFO: renamed from: b */
        public void m85273b(long j) {
            this.f61538a = j;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$h */
    public interface InterfaceC14707h<R> {
        void onResult(R r);
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$i */
    @Deprecated
    public static abstract class AbstractC14708i {

        /* JADX INFO: renamed from: a */
        private String f61539a;

        /* JADX INFO: renamed from: a */
        public String m85274a() {
            return this.f61539a;
        }

        /* JADX INFO: renamed from: b */
        public void m85275b(String str, long j, String str2, List<String> list) {
        }

        /* JADX INFO: renamed from: c */
        public void m85276c(long j, String str, String str2) {
        }

        /* JADX INFO: renamed from: d */
        public void m85277d(MiPushMessage miPushMessage) {
        }

        /* JADX INFO: renamed from: e */
        public void m85278e(String str, String str2, String str3, boolean z) {
        }

        /* JADX INFO: renamed from: f */
        public void m85279f(long j, String str, String str2) {
        }

        /* JADX INFO: renamed from: g */
        public void m85280g(long j, String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$j */
    public static class C14709j {

        /* JADX INFO: renamed from: a */
        private String f61540a = null;

        /* JADX INFO: renamed from: b */
        private long f61541b = -1;

        /* JADX INFO: renamed from: a */
        public long m85281a() {
            return this.f61541b;
        }

        /* JADX INFO: renamed from: b */
        public String m85282b() {
            return this.f61540a;
        }

        /* JADX INFO: renamed from: c */
        public void m85283c(long j) {
            this.f61541b = j;
        }

        /* JADX INFO: renamed from: d */
        public void m85284d(String str) {
            this.f61540a = str;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$k */
    public interface InterfaceC14710k extends InterfaceC14707h<C14709j> {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$l */
    public interface InterfaceC14711l extends InterfaceC14707h<C14706g> {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiPushClient$m */
    public interface InterfaceC14712m extends InterfaceC14707h<C14709j> {
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
        hwq0.m133262a(editorEdit);
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
        hwq0.m133262a(editorEdit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_EXTRA, 0).edit();
        editorEdit.putLong("last_reg_request", System.currentTimeMillis());
        hwq0.m133262a(editorEdit);
    }

    public static synchronized void addTopic(Context context, String str) {
        context.getSharedPreferences(PREF_EXTRA, 0).edit().putLong("topic_" + str, System.currentTimeMillis()).commit();
    }

    public static long aliasSetTime(Context context, String str) {
        return context.getSharedPreferences(PREF_EXTRA, 0).getLong("alias_" + str, -1L);
    }

    public static void awakeApps(Context context, String[] strArr) {
        njq0.m159772f(context).m159773g(new RunnableC14703d(strArr, context));
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
                        PushMessageHandler.m85289a(context, intent);
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
        qtc0.m176411a("param ", str, " is not nullable");
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
        C14722f.m85402h(context).m85425d0();
    }

    public static void clearNotification(Context context) {
        C14722f.m85402h(context).m85427n(-1);
    }

    public static void disablePush(Context context) {
        C14722f.m85402h(context).m85414H(true);
    }

    public static void enablePush(Context context) {
        C14722f.m85402h(context).m85414H(false);
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
        if (C14719c.m85328c(context).m85345s()) {
            return C14719c.m85328c(context).m85350x();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return fvq0.m123362p();
    }

    public static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, "context");
        return xqq0.m210593c(context).m210602k(EnumC14720d.ASSEMBLE_PUSH_FCM);
    }

    public static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, "context");
        return xqq0.m210593c(context).m210602k(EnumC14720d.ASSEMBLE_PUSH_HUAWEI);
    }

    public static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, "context");
        return xqq0.m210593c(context).m210602k(EnumC14720d.ASSEMBLE_PUSH_COS);
    }

    public static boolean getOpenVIVOPush(Context context) {
        return xqq0.m210593c(context).m210602k(EnumC14720d.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (C14719c.m85328c(context).m85345s()) {
            return C14719c.m85328c(context).m85344q();
        }
        return null;
    }

    private static void initEventPerfLogic(Context context) {
        mqq0.m155992o(new C14704e());
        qu5 qu5VarM155983f = mqq0.m155983f(context);
        zhq0.m218833f(context).m218849h("5_9_9-C");
        f95.m120074a(context, qu5VarM155983f, new kqq0(context), new lqq0(context));
        uiq0.m193958b(context);
        jvq0.m143536a(context, qu5VarM155983f);
        C14837ah.m86477a(context).m86486a(new C14705f(100, "perf event job update", context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initialize(Context context, String str, String str2, AbstractC14708i abstractC14708i, String str3, InterfaceC14707h interfaceC14707h) {
        try {
            ilq0.m137038k(context.getApplicationContext());
            ilq0.m137027D("sdk_version = 5_9_9-C");
            yjq0.m215084c(context).m215085d();
            ioq0.m137369a(context);
            if (abstractC14708i != null) {
                PushMessageHandler.m85297a(abstractC14708i);
            }
            if (interfaceC14707h != null) {
                PushMessageHandler.m85296a(interfaceC14707h);
            }
            if (nwq0.m161884g(sContext)) {
                C14724m.m85440b(sContext);
            }
            boolean z = C14719c.m85328c(sContext).m85330a() != cx5.m109080a();
            if (!z && !shouldSendRegRequest(sContext)) {
                C14722f.m85402h(sContext).m85426m();
                ilq0.m137040m("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z || !C14719c.m85328c(sContext).m85339l(str, str2) || C14719c.m85328c(sContext).m85351y()) {
                String strM198838a = vlq0.m198838a(6);
                C14719c.m85328c(sContext).m85332e();
                C14719c.m85328c(sContext).m85333f(cx5.m109080a());
                C14719c.m85328c(sContext).m85336i(str, str2, strM198838a);
                C14718b.a.m85311b().m85319h("com.xiaomi.xmpushsdk.tinydataPending.appId");
                clearExtras(sContext);
                clearNotification(context);
                C14767hf c14767hf = new C14767hf();
                c14767hf.m85984a(C14839aj.m86497b());
                c14767hf.m85991b(str);
                c14767hf.m86003e(str2);
                c14767hf.m86000d(sContext.getPackageName());
                c14767hf.m86006f(strM198838a);
                Context context2 = sContext;
                c14767hf.m85996c(C14739g.m85588h(context2, context2.getPackageName()));
                Context context3 = sContext;
                c14767hf.m85990b(C14739g.m85582b(context3, context3.getPackageName()));
                c14767hf.m86012h("5_9_9-C");
                c14767hf.m85982a(50909);
                c14767hf.m85983a(EnumC14754gt.Init);
                if (!TextUtils.isEmpty(str3)) {
                    c14767hf.m86009g(str3);
                }
                if (!fvq0.m123366t()) {
                    String strM166114w = ouq0.m166114w(sContext);
                    if (!TextUtils.isEmpty(strM166114w)) {
                        c14767hf.m86015i(vlq0.m198839b(strM166114w) + Constants.SEPARATOR_COMMA + ouq0.m166116y(sContext));
                    }
                }
                int iM166094c = ouq0.m166094c();
                if (iM166094c >= 0) {
                    c14767hf.m85995c(iM166094c);
                }
                C14722f.m85402h(sContext).m85433u(c14767hf, z);
                sContext.getSharedPreferences(PREF_EXTRA, 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == meb0.m154172c(sContext)) {
                    checkNotNull(abstractC14708i, "callback");
                    abstractC14708i.m85276c(0L, null, C14719c.m85328c(sContext).m85344q());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C14719c.m85328c(sContext).m85344q());
                    meb0.m154175f(sContext, meb0.m154170a(EnumC14732ed.COMMAND_REGISTER.f61667a, arrayList, 0L, null, null, null));
                }
                C14722f.m85402h(sContext).m85426m();
                if (C14719c.m85328c(sContext).m85338k()) {
                    C14766he c14766he = new C14766he();
                    c14766he.m85956b(C14719c.m85328c(sContext).m85331d());
                    c14766he.m85960c(EnumC14750gp.ClientInfoUpdate.f62110a);
                    c14766he.m85943a(C14839aj.m86495a());
                    HashMap map = new HashMap();
                    c14766he.f62382a = map;
                    Context context4 = sContext;
                    map.put("app_version", C14739g.m85588h(context4, context4.getPackageName()));
                    Map<String, String> map2 = c14766he.f62382a;
                    Context context5 = sContext;
                    map2.put("app_version_code", Integer.toString(C14739g.m85582b(context5, context5.getPackageName())));
                    c14766he.f62382a.put("push_sdk_vn", "5_9_9-C");
                    c14766he.f62382a.put("push_sdk_vc", Integer.toString(50909));
                    String strM85348v = C14719c.m85328c(sContext).m85348v();
                    if (!TextUtils.isEmpty(strM85348v)) {
                        c14766he.f62382a.put("deviceid", strM85348v);
                    }
                    C14722f.m85402h(sContext).m85437y(c14766he, EnumC14740gf.Notification, false, null);
                    C14722f.m85402h(sContext).m85430q(sContext);
                }
                if (!ovq0.m166207d(sContext, "update_devId", false)) {
                    updateImeiOrOaid();
                    ovq0.m166205b(sContext, "update_devId", true);
                }
                if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                    C14766he c14766he2 = new C14766he();
                    c14766he2.m85956b(C14719c.m85328c(sContext).m85331d());
                    c14766he2.m85960c(EnumC14750gp.PullOfflineMessage.f62110a);
                    c14766he2.m85943a(C14839aj.m86495a());
                    c14766he2.m85946a(false);
                    C14722f.m85402h(sContext).m85438z(c14766he2, EnumC14740gf.Notification, false, null, false);
                    addPullNotificationTime(sContext);
                }
            }
            addRegRequestTime(sContext);
            scheduleOcVersionCheckJob();
            scheduleDataCollectionJobs(sContext);
            initEventPerfLogic(sContext);
            exq0.m118696b(sContext);
            if (!sContext.getPackageName().equals("com.xiaomi.xmsf")) {
                if (ayv.m99584a() != null) {
                    ayv.m99585b(sContext, ayv.m99584a());
                }
                ilq0.m137034g(2);
            }
            operateSyncAction(context);
        } catch (Throwable th) {
            ilq0.m137044q(th);
        }
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(gwq0.m128497c(sContext).m128499b(EnumC14726v.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(gwq0.m128497c(sContext).m128499b(EnumC14726v.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        gwq0 gwq0VarM128497c = gwq0.m128497c(sContext);
        EnumC14726v enumC14726v = EnumC14726v.UPLOAD_HUAWEI_TOKEN;
        if ("syncing".equals(gwq0VarM128497c.m128499b(enumC14726v))) {
            C14722f.m85402h(sContext).m85412E(null, enumC14726v, EnumC14720d.ASSEMBLE_PUSH_HUAWEI, "init");
        }
        if ("syncing".equals(gwq0.m128497c(sContext).m128499b(EnumC14726v.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        gwq0 gwq0VarM128497c2 = gwq0.m128497c(sContext);
        EnumC14726v enumC14726v2 = EnumC14726v.UPLOAD_COS_TOKEN;
        if ("syncing".equals(gwq0VarM128497c2.m128499b(enumC14726v2))) {
            C14722f.m85402h(sContext).m85412E(null, enumC14726v2, EnumC14720d.ASSEMBLE_PUSH_COS, "init");
        }
        gwq0 gwq0VarM128497c3 = gwq0.m128497c(sContext);
        EnumC14726v enumC14726v3 = EnumC14726v.UPLOAD_FTOS_TOKEN;
        if ("syncing".equals(gwq0VarM128497c3.m128499b(enumC14726v3))) {
            C14722f.m85402h(context).m85412E(null, enumC14726v3, EnumC14720d.ASSEMBLE_PUSH_FTOS, "init");
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    public static void reInitialize(Context context, EnumC14754gt enumC14754gt) {
        ilq0.m137027D("re-register reason: " + enumC14754gt);
        String strM198838a = vlq0.m198838a(6);
        String strM85331d = C14719c.m85328c(context).m85331d();
        String strM85340m = C14719c.m85328c(context).m85340m();
        C14719c.m85328c(context).m85332e();
        clearExtrasForInitialize(context);
        clearNotification(context);
        C14719c.m85328c(context).m85333f(cx5.m109080a());
        C14719c.m85328c(context).m85336i(strM85331d, strM85340m, strM198838a);
        C14767hf c14767hf = new C14767hf();
        c14767hf.m85984a(C14839aj.m86497b());
        c14767hf.m85991b(strM85331d);
        c14767hf.m86003e(strM85340m);
        c14767hf.m86006f(strM198838a);
        c14767hf.m86000d(context.getPackageName());
        c14767hf.m85996c(C14739g.m85588h(context, context.getPackageName()));
        c14767hf.m85990b(C14739g.m85582b(context, context.getPackageName()));
        c14767hf.m86012h("5_9_9-C");
        c14767hf.m85982a(50909);
        c14767hf.m85983a(enumC14754gt);
        int iM166094c = ouq0.m166094c();
        if (iM166094c >= 0) {
            c14767hf.m85995c(iM166094c);
        }
        C14722f.m85402h(context).m85433u(c14767hf, false);
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
            vvq0.m200199a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter, 2);
        } catch (Throwable th) {
            ilq0.m137040m("dynamic register network status receiver failed:" + th);
        }
        gkq0.m126675d(sContext);
    }

    private static void registerPush(Context context, String str, String str2, beb0 beb0Var, String str3, InterfaceC14707h interfaceC14707h) {
        checkNotNull(context, "context");
        checkNotNull(str, Message.APP_ID);
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        nwq0.m161882e(context2);
        if (!NetworkStatusReceiver.m86787a()) {
            registerNetworkReceiver(sContext);
        }
        xqq0.m210593c(sContext).m210600g(beb0Var);
        njq0.m159772f(context2).m159773g(new RunnableC14700a(str, str2, str3, interfaceC14707h));
    }

    public static void registerToken(Context context, String str, String str2, String str3, InterfaceC14710k interfaceC14710k) {
        registerPush(context, str, str2, new beb0(), null, interfaceC14710k);
    }

    public static synchronized void removeAcceptTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_EXTRA, 0).edit();
        editorEdit.remove("accept_time");
        hwq0.m133262a(editorEdit);
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
        C14722f.m85402h(context).m85424b0();
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        if (C14719c.m85328c(context).m85343p()) {
            EnumC14750gp enumC14750gp = z ? EnumC14750gp.APP_SLEEP : EnumC14750gp.APP_WAKEUP;
            C14766he c14766he = new C14766he();
            c14766he.m85956b(C14719c.m85328c(context).m85331d());
            c14766he.m85960c(enumC14750gp.f62110a);
            c14766he.m85964d(context.getPackageName());
            c14766he.m85943a(C14839aj.m86495a());
            c14766he.m85946a(false);
            C14722f.m85402h(context).m85438z(c14766he, EnumC14740gf.Notification, false, null, false);
        }
    }

    public static void reportIgnoreRegMessageClicked(Context context, String str, C14753gs c14753gs, String str2, String str3) {
        C14766he c14766he = new C14766he();
        if (TextUtils.isEmpty(str3)) {
            ilq0.m137025B("do not report clicked message");
            return;
        }
        c14766he.m85956b(str3);
        c14766he.m85960c("bar:click");
        c14766he.m85943a(str);
        c14766he.m85946a(false);
        C14722f.m85402h(context).m85409B(c14766he, EnumC14740gf.Notification, false, true, c14753gs, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        C14753gs c14753gs = new C14753gs();
        c14753gs.m85726a(miPushMessage.getMessageId());
        c14753gs.m85737b(miPushMessage.getTopic());
        c14753gs.m85749d(miPushMessage.getDescription());
        c14753gs.m85745c(miPushMessage.getTitle());
        c14753gs.m85744c(miPushMessage.getNotifyId());
        c14753gs.m85725a(miPushMessage.getNotifyType());
        c14753gs.m85736b(miPushMessage.getPassThrough());
        c14753gs.m85727a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), c14753gs, null);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (C14837ah.m86477a(sContext).m86489a(EnumC14745gk.DataCollectionSwitch.m85646a(), getDefaultSwitch())) {
            dpq0.m112924b().m112926c(new nuq0(context));
            njq0.m159772f(sContext).m159774h(new RunnableC14701b(), 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        njq0.m159772f(sContext).m159778l(new cwq0(sContext), C14837ah.m86477a(sContext).m86481a(EnumC14745gk.OcVersionCheckFrequency.m85646a(), MMKV.ExpireInDay), 5);
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        if (i < 0 || i >= 24 || i3 < 0 || i3 >= 24 || i2 < 0 || i2 >= 60 || i4 < 0 || i4 >= 60) {
            ig3.m135964a("the input parameter is not valid.");
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
            setCommand(context, EnumC14732ed.COMMAND_SET_ACCEPT_TIME.f61667a, (ArrayList<String>) arrayList, str);
        } else if (1 == meb0.m154172c(context)) {
            PushMessageHandler.m85295a(context, str, EnumC14732ed.COMMAND_SET_ACCEPT_TIME.f61667a, 0L, null, arrayList2);
        } else {
            meb0.m154175f(context, meb0.m154170a(EnumC14732ed.COMMAND_SET_ACCEPT_TIME.f61667a, arrayList2, 0L, null, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, EnumC14732ed.COMMAND_SET_ALIAS.f61667a, str, str2);
    }

    public static void setCommand(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        EnumC14732ed enumC14732ed = EnumC14732ed.COMMAND_SET_ALIAS;
        if (enumC14732ed.f61667a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) < 86400000) {
            if (1 == meb0.m154172c(context)) {
                PushMessageHandler.m85295a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                meb0.m154175f(context, meb0.m154170a(enumC14732ed.f61667a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (EnumC14732ed.COMMAND_UNSET_ALIAS.f61667a.equalsIgnoreCase(str) && aliasSetTime(context, str2) < 0) {
            ilq0.m137040m("Don't cancel alias for " + vlq0.m198840c(arrayList.toString(), 3) + " is unseted");
            return;
        }
        EnumC14732ed enumC14732ed2 = EnumC14732ed.COMMAND_SET_ACCOUNT;
        if (enumC14732ed2.f61667a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) < 3600000) {
            if (1 == meb0.m154172c(context)) {
                PushMessageHandler.m85295a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                meb0.m154175f(context, meb0.m154170a(enumC14732ed2.f61667a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (!EnumC14732ed.COMMAND_UNSET_ACCOUNT.f61667a.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
            setCommand(context, str, (ArrayList<String>) arrayList, str3);
            return;
        }
        ilq0.m137040m("Don't cancel account for " + vlq0.m198840c(arrayList.toString(), 3) + " is unseted");
    }

    public static void setLocalNotificationType(Context context, int i) {
        C14722f.m85402h(context).m85419O(i);
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, EnumC14732ed.COMMAND_SET_ACCOUNT.f61667a, str, str2);
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences(PREF_EXTRA, 0).getLong("last_pull_notification", -1L)) > Constants.INBOX_V2_THROTTLE_WINDOW_MS;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences(PREF_EXTRA, 0).getLong("last_reg_request", -1L)) > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return C14722f.m85402h(context).m85416J();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (TextUtils.isEmpty(C14719c.m85328c(context).m85331d()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) <= 86400000) {
            if (1 == meb0.m154172c(context)) {
                PushMessageHandler.m85294a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            meb0.m154175f(context, meb0.m154170a(EnumC14732ed.COMMAND_SUBSCRIBE_TOPIC.f61667a, arrayList, 0L, null, null, null));
            return;
        }
        C14771hj c14771hj = new C14771hj();
        String strM86495a = C14839aj.m86495a();
        c14771hj.m86103a(strM86495a);
        c14771hj.m86107b(C14719c.m85328c(context).m85331d());
        c14771hj.m86109c(str);
        c14771hj.m86111d(context.getPackageName());
        c14771hj.m86113e(str2);
        ilq0.m137027D("cmd:" + EnumC14732ed.COMMAND_SUBSCRIBE_TOPIC + ", " + strM86495a);
        C14722f.m85402h(context).m85435w(c14771hj, EnumC14740gf.Subscription, null);
    }

    @Deprecated
    public static void syncAssembleCOSPushToken(Context context) {
    }

    public static void syncAssembleFCMPushToken(Context context) {
        C14722f.m85402h(context).m85412E(null, EnumC14726v.UPLOAD_FCM_TOKEN, EnumC14720d.ASSEMBLE_PUSH_FCM, "");
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

    public static void turnOffPush(Context context, InterfaceC14711l interfaceC14711l) {
        disablePush(context);
        if (interfaceC14711l != null) {
            C14706g c14706g = new C14706g();
            c14706g.m85273b(0L);
            c14706g.m85272a();
            interfaceC14711l.onResult(c14706g);
        }
    }

    public static void turnOnPush(Context context, InterfaceC14711l interfaceC14711l) {
        enablePush(context);
        if (interfaceC14711l != null) {
            C14706g c14706g = new C14706g();
            c14706g.m85273b(0L);
            c14706g.m85272a();
            interfaceC14711l.onResult(c14706g);
        }
    }

    public static void unRegisterToken(Context context, InterfaceC14712m interfaceC14712m) {
        unregisterPush(context);
        if (interfaceC14712m != null) {
            C14709j c14709j = new C14709j();
            c14709j.m85284d(null);
            c14709j.m85282b();
            c14709j.m85283c(0L);
            c14709j.m85281a();
            interfaceC14712m.onResult(c14709j);
        }
    }

    public static void unregisterPush(Context context) {
        hsq0.m132800n(context);
        C14837ah.m86477a(context).m86485a();
        if (C14719c.m85328c(context).m85343p()) {
            C14773hl c14773hl = new C14773hl();
            c14773hl.m86135a(C14839aj.m86495a());
            c14773hl.m86140b(C14719c.m85328c(context).m85331d());
            c14773hl.m86143c(C14719c.m85328c(context).m85344q());
            c14773hl.m86147e(C14719c.m85328c(context).m85340m());
            c14773hl.m86145d(context.getPackageName());
            C14722f.m85402h(context).m85434v(c14773hl);
            PushMessageHandler.m85286a();
            PushMessageHandler.m85299b();
            C14719c.m85328c(context).m85341n();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, EnumC14732ed.COMMAND_UNSET_ALIAS.f61667a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, EnumC14732ed.COMMAND_UNSET_ACCOUNT.f61667a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (C14719c.m85328c(context).m85343p()) {
            if (topicSubscribedTime(context, str) < 0) {
                ilq0.m137040m("Don't cancel subscribe for " + vlq0.m198840c(str, 3) + " is unsubscribed");
                return;
            }
            C14775hn c14775hn = new C14775hn();
            String strM86495a = C14839aj.m86495a();
            c14775hn.m86173a(strM86495a);
            c14775hn.m86177b(C14719c.m85328c(context).m85331d());
            c14775hn.m86179c(str);
            c14775hn.m86181d(context.getPackageName());
            c14775hn.m86183e(str2);
            ilq0.m137027D("cmd:" + EnumC14732ed.COMMAND_UNSUBSCRIBE_TOPIC + ", " + strM86495a);
            C14722f.m85402h(context).m85435w(c14775hn, EnumC14740gf.UnSubscription, null);
        }
    }

    private static void updateImeiOrOaid() {
        new Thread(new RunnableC14702c()).start();
    }

    public static void clearNotification(Context context, String str, String str2) {
        C14722f.m85402h(context).m85413G(str, str2);
    }

    public static void clearNotification(Context context, int i) {
        C14722f.m85402h(context).m85427n(i);
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new beb0(), str3, null);
    }

    public static void registerPush(Context context, String str, String str2, beb0 beb0Var) {
        registerPush(context, str, str2, beb0Var, null, null);
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new beb0());
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    public static void reportMessageClicked(Context context, String str, C14753gs c14753gs, String str2) {
        C14766he c14766he = new C14766he();
        if (TextUtils.isEmpty(str2)) {
            if (C14719c.m85328c(context).m85343p()) {
                c14766he.m85956b(C14719c.m85328c(context).m85331d());
            } else {
                ilq0.m137025B("do not report clicked message");
                return;
            }
        } else {
            c14766he.m85956b(str2);
        }
        c14766he.m85960c("bar:click");
        c14766he.m85943a(str);
        c14766he.m85946a(false);
        C14722f.m85402h(context).m85437y(c14766he, EnumC14740gf.Notification, false, c14753gs);
    }

    public static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(C14719c.m85328c(context).m85331d())) {
            return;
        }
        C14760gz c14760gz = new C14760gz();
        String strM86495a = C14839aj.m86495a();
        c14760gz.m85850a(strM86495a);
        c14760gz.m85857b(C14719c.m85328c(context).m85331d());
        c14760gz.m85860c(str);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            c14760gz.m85853a(it.next());
        }
        c14760gz.m85865e(str2);
        c14760gz.m85863d(context.getPackageName());
        ilq0.m137027D("cmd:" + str + ", " + strM86495a);
        C14722f.m85402h(context).m85435w(c14760gz, EnumC14740gf.Command, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, AbstractC14708i abstractC14708i) {
        initialize(context, str, str2, abstractC14708i, null, null);
    }
}
