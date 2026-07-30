package com.clevertap.android.sdk;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.cryption.InterfaceC1176c;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.interfaces.NotificationRenderedListener;
import com.clevertap.android.sdk.network.fetch.FetchTrigger;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import com.clevertap.android.sdk.pushnotification.INotificationRenderer;
import com.clevertap.android.sdk.pushnotification.NotificationInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p149l.ar40;
import p149l.avj0;
import p149l.ceb0;
import p149l.fe50;
import p149l.ggb0;
import p149l.iqm;
import p149l.iw3;
import p149l.mxf0;
import p149l.n2f;
import p149l.n95;
import p149l.pv3;
import p149l.qs9;
import p149l.tom;
import p149l.up40;
import p149l.uqm;
import p149l.ut3;
import p149l.vnm;
import p149l.wv3;
import p149l.xqm;
import p149l.xv3;
import p149l.yei;
import p149l.zrw;
import p149l.zxf0;

/* JADX INFO: loaded from: classes.dex */
public class CleverTapAPI implements CTInboxActivity.InterfaceC1277b {

    /* JADX INFO: renamed from: f */
    static CleverTapInstanceConfig f4767f;

    /* JADX INFO: renamed from: g */
    private static HashMap<String, CleverTapAPI> f4768g;

    /* JADX INFO: renamed from: h */
    private static String f4769h;

    /* JADX INFO: renamed from: i */
    private static ar40 f4770i;

    /* JADX INFO: renamed from: j */
    private static ar40 f4771j;

    /* JADX INFO: renamed from: a */
    private final Context f4774a;

    /* JADX INFO: renamed from: b */
    private C1186g f4775b;

    /* JADX INFO: renamed from: c */
    private WeakReference<uqm> f4776c;

    /* JADX INFO: renamed from: d */
    private WeakReference<xqm> f4777d;

    /* JADX INFO: renamed from: e */
    private static int f4766e = LogLevel.INFO.intValue();

    /* JADX INFO: renamed from: k */
    private static final HashMap<String, NotificationRenderedListener> f4772k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    private static n95 f4773l = n95.f137721a;

    public enum LogLevel {
        OFF(-1),
        INFO(0),
        DEBUG(2),
        VERBOSE(3);

        private final int value;

        LogLevel(int i) {
            this.value = i;
        }

        public int intValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.CleverTapAPI$a */
    public class CallableC1164a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f4778a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f4779b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CharSequence f4780c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f4781d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f4782e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f4783f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ CleverTapAPI f4784g;

        public CallableC1164a(Context context, String str, CharSequence charSequence, int i, String str2, boolean z, CleverTapAPI cleverTapAPI) {
            this.f4778a = context;
            this.f4779b = str;
            this.f4780c = charSequence;
            this.f4781d = i;
            this.f4782e = str2;
            this.f4783f = z;
            this.f4784g = cleverTapAPI;
        }

        @Override // java.util.concurrent.Callable
        @RequiresApi(api = 26)
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            NotificationManager notificationManager = (NotificationManager) this.f4778a.getSystemService("notification");
            if (notificationManager == null) {
                return null;
            }
            iw3.m138716a();
            NotificationChannel notificationChannelM194605a = up40.m194605a(this.f4779b, this.f4780c, this.f4781d);
            notificationChannelM194605a.setDescription(this.f4782e);
            notificationChannelM194605a.setShowBadge(this.f4783f);
            notificationManager.createNotificationChannel(notificationChannelM194605a);
            this.f4784g.m5750G().info(this.f4784g.m5790B(), "Notification channel " + this.f4780c.toString() + " has been created");
            return null;
        }
    }

    public CleverTapAPI(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C1186g c1186g, n95 n95Var) {
        this.f4774a = context;
        this.f4775b = c1186g;
        f4773l = n95Var;
        m5750G().verbose(cleverTapInstanceConfig.getAccountId() + ":async_deviceID", "CoreState is set");
        m5779p();
        Logger.m5869i("CleverTap SDK initialized with accountId: " + cleverTapInstanceConfig.getAccountId() + " accountToken: " + cleverTapInstanceConfig.getAccountToken() + " accountRegion: " + cleverTapInstanceConfig.getAccountRegion());
    }

    /* JADX INFO: renamed from: A */
    private static CleverTapAPI m5746A(Context context, Bundle bundle) {
        return m5789z(context, bundle.getString(Constants.WZRK_ACCT_ID_KEY));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: A0 */
    public static void m5747A0(Context context, String str, ggb0 ggb0Var) {
        Iterator<CleverTapAPI> it = m5748D(context).iterator();
        while (it.hasNext()) {
            it.next().f4775b.getPushProviders().m214540t(str, ggb0Var);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: D */
    public static ArrayList<CleverTapAPI> m5748D(Context context) {
        ArrayList<CleverTapAPI> arrayList = new ArrayList<>();
        HashMap<String, CleverTapAPI> map = f4768g;
        if (map != null && !map.isEmpty()) {
            arrayList.addAll(f4768g.values());
            return arrayList;
        }
        CleverTapAPI cleverTapAPIM5753K = m5753K(context);
        if (cleverTapAPIM5753K != null) {
            arrayList.add(cleverTapAPIM5753K);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    private CleverTapInstanceConfig m5749F() {
        return this.f4775b.getConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public Logger m5750G() {
        return m5749F().getLogger();
    }

    /* JADX INFO: renamed from: I */
    public static int m5751I() {
        return f4766e;
    }

    /* JADX INFO: renamed from: J */
    private static CleverTapInstanceConfig m5752J(Context context) {
        ManifestInfo manifestInfo = ManifestInfo.getInstance(context);
        String strM5880c = manifestInfo.m5880c();
        String strM5882e = manifestInfo.m5882e();
        String strM5881d = manifestInfo.m5881d();
        String strM5892o = manifestInfo.m5892o();
        String strM5893p = manifestInfo.m5893p();
        String strM5888k = manifestInfo.m5888k();
        if (strM5880c == null || strM5882e == null) {
            Logger.m5869i("Account ID or Account token is missing from AndroidManifest.xml, unable to create default instance");
            return null;
        }
        if (strM5881d == null) {
            Logger.m5869i("Account Region not specified in the AndroidManifest - using default region");
        }
        CleverTapInstanceConfig cleverTapInstanceConfigCreateDefaultInstance = CleverTapInstanceConfig.createDefaultInstance(context, strM5880c, strM5882e, strM5881d);
        if (strM5892o != null && !strM5892o.trim().isEmpty()) {
            cleverTapInstanceConfigCreateDefaultInstance.setProxyDomain(strM5892o);
        }
        if (strM5893p != null && !strM5893p.trim().isEmpty()) {
            cleverTapInstanceConfigCreateDefaultInstance.setSpikyProxyDomain(strM5893p);
        }
        if (strM5888k != null && !strM5888k.trim().isEmpty()) {
            cleverTapInstanceConfigCreateDefaultInstance.setCustomHandshakeDomain(strM5888k);
        }
        return cleverTapInstanceConfigCreateDefaultInstance;
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public static CleverTapAPI m5753K(Context context) {
        return m5754L(context, null);
    }

    /* JADX INFO: renamed from: L */
    public static CleverTapAPI m5754L(Context context, String str) {
        f4769h = "!SDK-VERSION-STRING!:com.clevertap.android:clevertap-android-sdk:8.2.0.0";
        CleverTapInstanceConfig cleverTapInstanceConfig = f4767f;
        if (cleverTapInstanceConfig != null) {
            return m5761V(context, cleverTapInstanceConfig, str);
        }
        CleverTapInstanceConfig cleverTapInstanceConfigM5752J = m5752J(context);
        f4767f = cleverTapInstanceConfigM5752J;
        if (cleverTapInstanceConfigM5752J != null) {
            return m5761V(context, cleverTapInstanceConfigM5752J, str);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    private static CleverTapAPI m5755M(Context context) {
        HashMap<String, CleverTapAPI> map;
        CleverTapAPI cleverTapAPIM5753K = m5753K(context);
        if (cleverTapAPIM5753K == null && (map = f4768g) != null && !map.isEmpty()) {
            Iterator<String> it = f4768g.keySet().iterator();
            while (it.hasNext()) {
                cleverTapAPIM5753K = f4768g.get(it.next());
                if (cleverTapAPIM5753K != null) {
                    break;
                }
            }
        }
        return cleverTapAPIM5753K;
    }

    /* JADX INFO: renamed from: P */
    public static ar40 m5756P() {
        return f4770i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: Q */
    public static NotificationRenderedListener m5757Q(String str) {
        return f4772k.get(str);
    }

    /* JADX INFO: renamed from: R */
    public static ar40 m5758R() {
        return f4771j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: S */
    public static void m5759S(Context context, Bundle bundle) {
        String string;
        if (bundle == null) {
            return;
        }
        try {
            string = bundle.getString(Constants.WZRK_ACCT_ID_KEY);
        } catch (Throwable unused) {
            string = null;
        }
        HashMap<String, CleverTapAPI> map = f4768g;
        if (map == null) {
            CleverTapAPI cleverTapAPIM5780q = m5780q(context, string);
            if (cleverTapAPIM5780q != null) {
                cleverTapAPIM5780q.m5808l0(bundle);
                return;
            }
            return;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f4768g.get(it.next());
            if (cleverTapAPI != null && ((string == null && cleverTapAPI.f4775b.getConfig().isDefaultInstance()) || cleverTapAPI.m5790B().equals(string))) {
                cleverTapAPI.m5808l0(bundle);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public static CleverTapAPI m5760U(Context context, @NonNull CleverTapInstanceConfig cleverTapInstanceConfig) {
        return m5761V(context, cleverTapInstanceConfig, null);
    }

    /* JADX INFO: renamed from: V */
    public static CleverTapAPI m5761V(Context context, @NonNull CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig == null) {
            Logger.m5873v("CleverTapInstanceConfig cannot be null");
            return null;
        }
        if (f4768g == null) {
            f4768g = new HashMap<>();
        }
        CleverTapAPI cleverTapAPI = f4768g.get(cleverTapInstanceConfig.getAccountId());
        if (cleverTapAPI == null) {
            cleverTapAPI = new CleverTapAPI(context, cleverTapInstanceConfig, str);
            f4768g.put(cleverTapInstanceConfig.getAccountId(), cleverTapAPI);
        } else if (cleverTapAPI.m5749F().getEnableCustomCleverTapId() && Utils.m5903C(str) && cleverTapAPI.m5763X()) {
            cleverTapAPI.f4775b.getLoginController().m191105y(null, null, str);
        }
        Logger.m5874v(cleverTapInstanceConfig.getAccountId() + ":async_deviceID", "CleverTapAPI instance = " + cleverTapAPI);
        return cleverTapAPI;
    }

    /* JADX INFO: renamed from: W */
    public static boolean m5762W() {
        return qs9.m176173x();
    }

    /* JADX INFO: renamed from: X */
    private boolean m5763X() {
        return this.f4775b.getDeviceInfo().m133557d0();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #1 {all -> 0x0072, blocks: (B:28:0x005d, B:30:0x0074, B:32:0x007a), top: B:52:0x005d }] */
    /* JADX INFO: renamed from: a0 */
    public static void m5764a0(Activity activity, String str) {
        Uri data;
        String string;
        Bundle extras = null;
        if (f4768g == null) {
            m5782r(activity.getApplicationContext(), null, str);
        }
        if (f4768g == null) {
            Logger.m5873v("Instances is null in onActivityCreated!");
            return;
        }
        try {
            data = activity.getIntent().getData();
            if (data != null) {
                try {
                    string = avj0.m99193a(data.toString(), true).getString(Constants.WZRK_ACCT_ID_KEY);
                } catch (Throwable unused) {
                    string = null;
                }
            } else {
                string = null;
            }
        } catch (Throwable unused2) {
            data = null;
        }
        boolean z = false;
        try {
            extras = activity.getIntent().getExtras();
            if (extras != null && !extras.isEmpty()) {
                boolean z2 = extras.containsKey(Constants.WZRK_FROM_KEY) && Constants.WZRK_FROM.equals(extras.get(Constants.WZRK_FROM_KEY));
                if (z2) {
                    try {
                        Logger.m5873v("ActivityLifecycleCallback: Notification Clicked already processed for " + extras + ", dropping duplicate.");
                        if (extras.containsKey(Constants.WZRK_ACCT_ID_KEY)) {
                            string = (String) extras.get(Constants.WZRK_ACCT_ID_KEY);
                        }
                    } catch (Throwable unused3) {
                    }
                } else if (extras.containsKey(Constants.WZRK_ACCT_ID_KEY)) {
                    string = (String) extras.get(Constants.WZRK_ACCT_ID_KEY);
                }
                z = z2;
            }
        } catch (Throwable unused4) {
        }
        if (z && data == null) {
            return;
        }
        try {
            Iterator<String> it = f4768g.keySet().iterator();
            while (it.hasNext()) {
                CleverTapAPI cleverTapAPI = f4768g.get(it.next());
                if (cleverTapAPI != null) {
                    cleverTapAPI.f4775b.getActivityLifeCycleManager().m5940k(extras, data, string);
                }
            }
        } catch (Throwable th) {
            Logger.m5873v("Throwable - " + th.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m5765b0() {
        HashMap<String, CleverTapAPI> map = f4768g;
        if (map == null) {
            return;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f4768g.get(it.next());
            if (cleverTapAPI != null) {
                try {
                    cleverTapAPI.f4775b.getActivityLifeCycleManager().m5938h();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m5766c(CleverTapAPI cleverTapAPI) {
        cleverTapAPI.f4775b.getSessionManager().m184593g();
        cleverTapAPI.f4775b.getSessionManager().m184594h();
        cleverTapAPI.f4775b.getDeviceInfo().m133563l0();
        cleverTapAPI.f4775b.getDeviceInfo().m133562k0();
        cleverTapAPI.f4775b.getDeviceInfo().m133565m0();
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m5767c0(Activity activity, String str) {
        if (f4768g == null) {
            m5782r(activity.getApplicationContext(), null, str);
        }
        qs9.m176165L(true);
        if (f4768g == null) {
            Logger.m5873v("Instances is null in onActivityResumed!");
            return;
        }
        String strM176170j = qs9.m176170j();
        qs9.m176166R(activity);
        if (strM176170j == null || !strM176170j.equals(activity.getLocalClassName())) {
            qs9.m176172w();
        }
        if (qs9.m176171n() <= 0) {
            qs9.m176167a0(f4773l.mo158531a());
        }
        Iterator<String> it = f4768g.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f4768g.get(it.next());
            if (cleverTapAPI != null) {
                try {
                    cleverTapAPI.f4775b.getActivityLifeCycleManager().m5939i(activity);
                } catch (Throwable th) {
                    Logger.m5873v("Throwable - " + th.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m5768d(CleverTapAPI cleverTapAPI, final fe50 fe50Var) {
        final String strM133539E = cleverTapAPI.f4775b.getDeviceInfo().m133539E();
        if (strM133539E != null) {
            Utils.m5929z(new Runnable() { // from class: l.x75
                @Override // java.lang.Runnable
                public final void run() {
                    fe50Var.mo121026a(strM133539E);
                }
            });
        }
        cleverTapAPI.f4775b.getCallbackManager().mo100730d(fe50Var);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Void m5769e(CleverTapAPI cleverTapAPI, INotificationRenderer iNotificationRenderer, Bundle bundle, Context context) {
        synchronized (cleverTapAPI.f4775b.getPushProviders().m214528B()) {
            try {
                cleverTapAPI.f4775b.getPushProviders().m214534T(iNotificationRenderer);
                if (bundle == null || !bundle.containsKey(Constants.PT_NOTIF_ID)) {
                    cleverTapAPI.f4775b.getPushProviders().m214538c(context, bundle, -1000);
                } else {
                    cleverTapAPI.f4775b.getPushProviders().m214538c(context, bundle, bundle.getInt(Constants.PT_NOTIF_ID));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Void m5770f(CleverTapAPI cleverTapAPI) {
        if (cleverTapAPI.f4775b.getDeviceInfo().m133539E() == null) {
            return null;
        }
        cleverTapAPI.f4775b.getLoginController().m191104C();
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m5771f0(Context context, Bundle bundle) {
        CleverTapAPI cleverTapAPIM5746A = m5746A(context, bundle);
        if (cleverTapAPIM5746A != null) {
            cleverTapAPIM5746A.f4775b.getPushProviders().m214532L(bundle);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Void m5772g(CleverTapAPI cleverTapAPI) {
        String jSONString = cleverTapAPI.m5749F().toJSONString();
        if (jSONString == null) {
            Logger.m5873v("Unable to save config to SharedPrefs, config Json is null");
            return null;
        }
        mxf0.m156897w(cleverTapAPI.f4774a, cleverTapAPI.m5749F().getAccountId(), "instance", jSONString);
        return null;
    }

    @Nullable
    public static CleverTapAPI getGlobalInstance(Context context, String str) {
        return m5789z(context, str);
    }

    public static NotificationInfo getNotificationInfo(Bundle bundle) {
        boolean z = false;
        if (bundle == null) {
            return new NotificationInfo(false, false);
        }
        boolean zContainsKey = bundle.containsKey(Constants.NOTIFICATION_TAG);
        if (zContainsKey && bundle.containsKey(Constants.NOTIF_MSG)) {
            z = true;
        }
        return new NotificationInfo(zContainsKey, z);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Void m5774i(CleverTapAPI cleverTapAPI, zxf0 zxf0Var, C1289j c1289j, InterfaceC1176c interfaceC1176c, String str, String str2, n2f n2fVar) {
        cleverTapAPI.getClass();
        if (zxf0Var.getInAppStore() == null) {
            iqm iqmVarM6767j = c1289j.m6767j(cleverTapAPI.f4774a, interfaceC1176c, str, str2);
            zxf0Var.m220795g(iqmVarM6767j);
            n2fVar.m157615B();
            cleverTapAPI.f4775b.getCallbackManager().mo100729c(iqmVarM6767j);
        }
        if (zxf0Var.getImpressionStore() != null) {
            return null;
        }
        vnm vnmVarM6765h = c1289j.m6765h(cleverTapAPI.f4774a, str, str2);
        zxf0Var.m220794f(vnmVarM6765h);
        cleverTapAPI.f4775b.getCallbackManager().mo100729c(vnmVarM6765h);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Void m5775j(CleverTapAPI cleverTapAPI) {
        if (!cleverTapAPI.m5749F().isDefaultInstance()) {
            return null;
        }
        zrw.m219986d(cleverTapAPI.f4774a, cleverTapAPI.f4775b.getDeviceInfo(), cleverTapAPI.f4775b.getPushProviders());
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Void m5776k(CleverTapAPI cleverTapAPI, CTInboxMessage cTInboxMessage, Bundle bundle) {
        cleverTapAPI.getClass();
        Logger.m5865d("CleverTapAPI:messageDidShow() called  in async with: messageId = [" + cTInboxMessage.m6683e() + Constants.AES_SUFFIX);
        CTInboxMessage cTInboxMessageM5795O = cleverTapAPI.m5795O(cTInboxMessage.m6683e());
        if (cTInboxMessageM5795O.m6688k()) {
            return null;
        }
        cleverTapAPI.f4775b.getAnalyticsManager().m203625J(false, cTInboxMessageM5795O, bundle);
        cleverTapAPI.m5798Z(cTInboxMessageM5795O);
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: o */
    public static void m5778o(String str, NotificationRenderedListener notificationRenderedListener) {
        f4772k.put(str, notificationRenderedListener);
    }

    /* JADX INFO: renamed from: p */
    private void m5779p() {
        this.f4775b.getExecutors().m190592d().m6946g("CleverTapAPI#initializeDeviceInfo", new Callable() { // from class: l.r75
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5775j(this.f158010a);
            }
        });
        if (f4773l.mo158531a() - qs9.m176171n() > 5) {
            this.f4775b.getConfig().setCreatedPostAppLaunch();
        }
        this.f4775b.getExecutors().m190592d().m6946g("setStatesAsync", new Callable() { // from class: l.s75
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5766c(this.f162888a);
            }
        });
        this.f4775b.getExecutors().m190592d().m6946g("saveConfigtoSharedPrefs", new Callable() { // from class: l.t75
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5772g(this.f168661a);
            }
        });
        this.f4775b.getExecutors().m190592d().m6946g("recordDeviceIDErrors", new Callable() { // from class: l.u75
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5770f(this.f174929a);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    private static CleverTapAPI m5780q(Context context, String str) {
        return m5782r(context, str, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q0 */
    public static NotificationRenderedListener m5781q0(String str) {
        return f4772k.remove(str);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    private static CleverTapAPI m5782r(Context context, String str, String str2) {
        try {
            if (str == null) {
                try {
                    return m5754L(context, str2);
                } catch (Throwable th) {
                    Logger.m5876v("Error creating shared Instance: ", th.getCause());
                    return null;
                }
            }
            String strM156889i = mxf0.m156889i(context, "instance:".concat(str), "");
            if (!strM156889i.isEmpty()) {
                CleverTapInstanceConfig cleverTapInstanceConfigCreateInstance = CleverTapInstanceConfig.createInstance(strM156889i);
                Logger.m5873v("Inflated Instance Config: ".concat(strM156889i));
                if (cleverTapInstanceConfigCreateInstance != null) {
                    return m5761V(context, cleverTapInstanceConfigCreateInstance, str2);
                }
                return null;
            }
            try {
                CleverTapAPI cleverTapAPIM5753K = m5753K(context);
                if (cleverTapAPIM5753K == null || !cleverTapAPIM5753K.f4775b.getConfig().getAccountId().equals(str)) {
                    return null;
                }
                return cleverTapAPIM5753K;
            } catch (Throwable th2) {
                Logger.m5876v("Error creating shared Instance: ", th2.getCause());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static void m5783s(Context context, Bundle bundle) {
        m5784t(context, bundle, -1000);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002d */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5784t(android.content.Context r5, android.os.Bundle r6, int r7) {
        /*
            com.clevertap.android.sdk.CleverTapAPI r0 = m5746A(r5, r6)
            if (r0 == 0) goto L3b
            com.clevertap.android.sdk.g r0 = r0.f4775b
            com.clevertap.android.sdk.CleverTapInstanceConfig r1 = r0.getConfig()
            l.yfb0 r2 = r0.getPushProviders()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = r2.m214528B()     // Catch: java.lang.Throwable -> L2d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L2d
            l.yfb0 r3 = r0.getPushProviders()     // Catch: java.lang.Throwable -> L2a
            l.w2a r4 = new l.w2a     // Catch: java.lang.Throwable -> L2a
            r4.<init>()     // Catch: java.lang.Throwable -> L2a
            r3.m214534T(r4)     // Catch: java.lang.Throwable -> L2a
            l.yfb0 r0 = r0.getPushProviders()     // Catch: java.lang.Throwable -> L2a
            r0.m214538c(r5, r6, r7)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r5     // Catch: java.lang.Throwable -> L2d
        L2d:
            r5 = move-exception
            com.clevertap.android.sdk.Logger r6 = r1.getLogger()
            java.lang.String r7 = r1.getAccountId()
            java.lang.String r0 = "Failed to process createNotification()"
            r6.debug(r7, r0, r5)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.CleverTapAPI.m5784t(android.content.Context, android.os.Bundle, int):void");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: t0 */
    public static void m5785t0(Context context) {
        HashMap<String, CleverTapAPI> map = f4768g;
        if (map == null) {
            CleverTapAPI cleverTapAPIM5753K = m5753K(context);
            if (cleverTapAPIM5753K != null) {
                if (cleverTapAPIM5753K.m5749F().isBackgroundSync()) {
                    cleverTapAPIM5753K.f4775b.getPushProviders().m214533R(context);
                    return;
                } else {
                    Logger.m5865d("Instance doesn't allow Background sync, not running the Job");
                    return;
                }
            }
            return;
        }
        for (String str : map.keySet()) {
            CleverTapAPI cleverTapAPI = f4768g.get(str);
            if (cleverTapAPI != null && cleverTapAPI.m5749F().isAnalyticsOnly()) {
                Logger.m5866d(str, "Instance is Analytics Only not running the Job");
            } else if (cleverTapAPI == null || !cleverTapAPI.m5749F().isBackgroundSync()) {
                Logger.m5866d(str, "Instance doesn't allow Background sync, not running the Job");
            } else {
                cleverTapAPI.f4775b.getPushProviders().m214533R(context);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5786u(Context context, String str, CharSequence charSequence, String str2, int i, boolean z) {
        CleverTapAPI cleverTapAPIM5755M = m5755M(context);
        if (cleverTapAPIM5755M == null) {
            Logger.m5873v("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                cleverTapAPIM5755M.m5793H().getExecutors().m190592d().m6946g("createNotificationChannel", new CallableC1164a(context, str, charSequence, i, str2, z, cleverTapAPIM5755M));
            }
        } catch (Throwable th) {
            cleverTapAPIM5755M.m5750G().verbose(cleverTapAPIM5755M.m5790B(), "Failure creating Notification Channel", th);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m5787w0(int i) {
        f4766e = i;
    }

    /* JADX INFO: renamed from: x0 */
    public static void m5788x0(LogLevel logLevel) {
        f4766e = logLevel.intValue();
    }

    /* JADX INFO: renamed from: z */
    private static CleverTapAPI m5789z(Context context, String str) {
        HashMap<String, CleverTapAPI> map = f4768g;
        if (map == null) {
            return m5780q(context, str);
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f4768g.get(it.next());
            if (cleverTapAPI != null && ((str == null && cleverTapAPI.f4775b.getConfig().isDefaultInstance()) || cleverTapAPI.m5790B().equals(str))) {
                return cleverTapAPI;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public String m5790B() {
        return this.f4775b.getConfig().getAccountId();
    }

    /* JADX INFO: renamed from: C */
    public ArrayList<CTInboxMessage> m5791C() {
        Logger.m5865d("CleverTapAPI:getAllInboxMessages: called");
        ArrayList<CTInboxMessage> arrayList = new ArrayList<>();
        synchronized (this.f4775b.getCTLockManager().m166152b()) {
            try {
                if (this.f4775b.getControllerManager().m177570e() == null) {
                    m5750G().debug(m5790B(), "Notification Inbox not initialized");
                    return arrayList;
                }
                for (pv3 pv3Var : this.f4775b.getControllerManager().m177570e().m123263l()) {
                    Logger.m5873v("CTMessage Dao - " + pv3Var.m171521z().toString());
                    arrayList.add(new CTInboxMessage(pv3Var.m171521z()));
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m5792E(@NonNull final fe50 fe50Var) {
        this.f4775b.getExecutors().m190589a().m6946g("getCleverTapID", new Callable() { // from class: l.w75
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5768d(this.f185022a, fe50Var);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: H */
    public C1186g m5793H() {
        return this.f4775b;
    }

    /* JADX INFO: renamed from: N */
    public int m5794N() {
        synchronized (this.f4775b.getCTLockManager().m166152b()) {
            try {
                if (this.f4775b.getControllerManager().m177570e() != null) {
                    return this.f4775b.getControllerManager().m177570e().m123261i();
                }
                m5750G().debug(m5790B(), "Notification Inbox not initialized");
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public CTInboxMessage m5795O(String str) {
        Logger.m5865d("CleverTapAPI:getInboxMessageForId() called with: messageId = [" + str + Constants.AES_SUFFIX);
        synchronized (this.f4775b.getCTLockManager().m166152b()) {
            try {
                if (this.f4775b.getControllerManager().m177570e() != null) {
                    pv3 pv3VarM123262k = this.f4775b.getControllerManager().m177570e().m123262k(str);
                    return pv3VarM123262k != null ? new CTInboxMessage(pv3VarM123262k.m171521z()) : null;
                }
                m5750G().debug(m5790B(), "Notification Inbox not initialized");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m5796T(String str, Number number) {
        this.f4775b.getAnalyticsManager().m203619A(str, number);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: Y */
    public boolean m5797Y() {
        return this.f4775b.getInboxV2Bridge().m6727b();
    }

    /* JADX INFO: renamed from: Z */
    public void m5798Z(CTInboxMessage cTInboxMessage) {
        if (this.f4775b.getControllerManager().m177570e() != null) {
            this.f4775b.getControllerManager().m177570e().m123266o(cTInboxMessage);
        } else {
            m5750G().debug(m5790B(), "Notification Inbox not initialized");
        }
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxActivity.InterfaceC1277b
    /* JADX INFO: renamed from: a */
    public void mo5799a(CTInboxActivity cTInboxActivity, int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2) {
        this.f4775b.getAnalyticsManager().m203625J(true, cTInboxMessage, bundle);
        Logger.m5873v("clicked inbox notification.");
        WeakReference<xqm> weakReference = this.f4777d;
        if (weakReference != null && weakReference.get() != null) {
            this.f4777d.get().m210583a(cTInboxMessage, i, i2);
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        Logger.m5873v("clicked button of an inbox notification.");
        WeakReference<uqm> weakReference2 = this.f4776c;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        this.f4776c.get().m194993a(map);
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxActivity.InterfaceC1277b
    /* JADX INFO: renamed from: b */
    public void mo5800b(CTInboxActivity cTInboxActivity, final CTInboxMessage cTInboxMessage, final Bundle bundle) {
        this.f4775b.getExecutors().m190592d().m6946g("handleMessageDidShow", new Callable() { // from class: l.v75
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5776k(this.f180298a, cTInboxMessage, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public void m5801d0(Map<String, Object> map) {
        m5802e0(map, null);
    }

    /* JADX INFO: renamed from: e0 */
    public void m5802e0(Map<String, Object> map, String str) {
        this.f4775b.getLoginController().m191103B(map, str);
    }

    /* JADX INFO: renamed from: g0 */
    public void m5803g0(boolean z) {
        this.f4775b.getInAppController().m6264X(z);
    }

    /* JADX INFO: renamed from: h0 */
    public void m5804h0(HashMap<String, Object> map, ArrayList<HashMap<String, Object>> arrayList) {
        this.f4775b.getAnalyticsManager().m203621F(map, arrayList);
    }

    /* JADX INFO: renamed from: i0 */
    public void m5805i0(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        m5806j0(str, null);
    }

    /* JADX INFO: renamed from: j0 */
    public void m5806j0(String str, Map<String, Object> map) {
        this.f4775b.getAnalyticsManager().m203623H(str, map);
    }

    /* JADX INFO: renamed from: k0 */
    public void m5807k0(String str, boolean z) {
        this.f4775b.getPushProviders().m214529C(str, ceb0.f80450a, z);
    }

    /* JADX INFO: renamed from: l0 */
    public void m5808l0(Bundle bundle) {
        this.f4775b.getAnalyticsManager().m203627L(bundle);
    }

    /* JADX INFO: renamed from: m */
    public void m5809m(String str, String str2) {
        m5811n(str, new ArrayList<>(Collections.singletonList(str2)));
    }

    /* JADX INFO: renamed from: m0 */
    public void m5810m0(Bundle bundle) {
        this.f4775b.getAnalyticsManager().m203628M(bundle);
    }

    /* JADX INFO: renamed from: n */
    public void m5811n(String str, ArrayList<String> arrayList) {
        this.f4775b.getAnalyticsManager().m203637s(str, arrayList);
    }

    /* JADX INFO: renamed from: n0 */
    public void m5812n0(Map<String, Object> map) {
        this.f4775b.getAnalyticsManager().m203629N(map);
    }

    /* JADX INFO: renamed from: o0 */
    public void m5813o0(String str, String str2) {
        m5814p0(str, new ArrayList<>(Collections.singletonList(str2)));
    }

    /* JADX INFO: renamed from: p0 */
    public void m5814p0(String str, ArrayList<String> arrayList) {
        this.f4775b.getAnalyticsManager().m203631P(str, arrayList);
    }

    /* JADX INFO: renamed from: r0 */
    public void m5815r0(String str) {
        this.f4775b.getAnalyticsManager().m203632Q(str);
    }

    public Future<?> renderPushNotification(@NonNull final INotificationRenderer iNotificationRenderer, final Context context, final Bundle bundle) {
        CleverTapInstanceConfig cleverTapInstanceConfigM6025f = this.f4775b.getConfig();
        try {
            return this.f4775b.getExecutors().m190592d().m6951n("CleverTapAPI#renderPushNotification", new Callable() { // from class: l.q75
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return CleverTapAPI.m5769e(this.f152985a, iNotificationRenderer, bundle, context);
                }
            });
        } catch (Throwable th) {
            cleverTapInstanceConfigM6025f.getLogger().debug(cleverTapInstanceConfigM6025f.getAccountId(), "Failed to process renderPushNotification()", th);
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: s0 */
    public void m5816s0(@NonNull INotificationRenderer iNotificationRenderer, Context context, Bundle bundle) {
        CleverTapInstanceConfig cleverTapInstanceConfigM6025f = this.f4775b.getConfig();
        try {
            synchronized (this.f4775b.getPushProviders().m214528B()) {
                try {
                    cleverTapInstanceConfigM6025f.getLogger().verbose(cleverTapInstanceConfigM6025f.getAccountId(), "rendering push on caller thread with id = " + Thread.currentThread().getId());
                    this.f4775b.getPushProviders().m214534T(iNotificationRenderer);
                    if (bundle == null || !bundle.containsKey(Constants.PT_NOTIF_ID)) {
                        this.f4775b.getPushProviders().m214538c(context, bundle, -1000);
                    } else {
                        this.f4775b.getPushProviders().m214538c(context, bundle, bundle.getInt(Constants.PT_NOTIF_ID));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            cleverTapInstanceConfigM6025f.getLogger().debug(cleverTapInstanceConfigM6025f.getAccountId(), "Failed to process renderPushNotification()", th2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCustomSdkVersion(String str, int i) {
        this.f4775b.getCoreMetaData().m176191U(str, i);
    }

    /* JADX INFO: renamed from: u0 */
    public void m5817u0(wv3 wv3Var) {
        this.f4775b.getCallbackManager().mo100751y(wv3Var);
    }

    /* JADX INFO: renamed from: v */
    public void m5818v(String str, Number number) {
        this.f4775b.getAnalyticsManager().m203638u(str, number);
    }

    /* JADX INFO: renamed from: v0 */
    public void m5819v0(xv3 xv3Var) {
        this.f4775b.getCallbackManager().mo100752z(xv3Var);
    }

    /* JADX INFO: renamed from: w */
    public void m5820w(final String str) {
        final String accountId = this.f4775b.getConfig().getAccountId();
        if (this.f4775b.getControllerManager() == null) {
            m5750G().verbose(accountId + ":async_deviceID", "ControllerManager not set yet! Returning from deviceIDCreated()");
            return;
        }
        final zxf0 zxf0VarM6040u = this.f4775b.getStoreRegistry();
        final InterfaceC1176c interfaceC1176cM6028i = this.f4775b.getCryptHandler();
        final C1289j c1289jM6761f = C1289j.m6761f();
        final n2f n2fVarM6030k = this.f4775b.getEvaluationManager();
        this.f4775b.getLocalDataStore().m108598u(this.f4774a);
        this.f4775b.getExecutors().m190589a().m6946g("initStores", new Callable() { // from class: l.y75
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5774i(this.f196671a, zxf0VarM6040u, c1289jM6761f, interfaceC1176cM6028i, str, accountId, n2fVarM6030k);
            }
        });
        if (this.f4775b.getControllerManager().m177574i() == null) {
            m5750G().verbose(accountId + ":async_deviceID", "Initializing InAppFC after Device ID Created = " + str);
            this.f4775b.getControllerManager().m177586u(new tom(this.f4774a, this.f4775b.getConfig(), str, this.f4775b.getStoreRegistry(), this.f4775b.getImpressionManager(), this.f4775b.getExecutors(), f4773l));
        }
        ut3 ut3VarM177569d = this.f4775b.getControllerManager().m177569d();
        if (ut3VarM177569d != null && TextUtils.isEmpty(ut3VarM177569d.m195289j())) {
            m5750G().verbose(accountId + ":async_deviceID", "Initializing Feature Flags after Device ID Created = " + str);
            ut3VarM177569d.m195293p(str);
        }
        CTProductConfigController cTProductConfigControllerM177571f = this.f4775b.getControllerManager().m177571f();
        if (cTProductConfigControllerM177571f != null && TextUtils.isEmpty(cTProductConfigControllerM177571f.m6883j().m6908g())) {
            m5750G().verbose(accountId + ":async_deviceID", "Initializing Product Config after Device ID Created = " + str);
            cTProductConfigControllerM177571f.m6890w(str);
        }
        m5750G().verbose(accountId + ":async_deviceID", "Got device id from DeviceInfo, notifying user profile initialized to SyncListener");
        this.f4775b.getCallbackManager().mo100747u(str);
        this.f4775b.getCallbackManager().mo100745s(str);
    }

    /* JADX INFO: renamed from: x */
    public void m5821x(boolean z) {
        this.f4775b.getDeviceInfo().m133561k(z);
    }

    /* JADX INFO: renamed from: y */
    public void m5822y(@Nullable yei yeiVar) {
        if (this.f4775b.getControllerManager().m177570e() != null) {
            this.f4775b.getInboxV2Bridge().m6729d(FetchTrigger.USER_INITIATED, yeiVar);
            return;
        }
        m5750G().debug(m5790B(), "Notification Inbox not initialized — call initializeInbox() first");
        if (yeiVar != null) {
            this.f4775b.getInboxV2Bridge().m6730e(yeiVar);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m5823y0(Location location) {
        this.f4775b.getLocationManager().mo6009a(location);
    }

    /* JADX INFO: renamed from: z0 */
    public void m5824z0(String str, ArrayList<String> arrayList) {
        this.f4775b.getAnalyticsManager().m203636U(str, arrayList);
    }

    private CleverTapAPI(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        this(context, cleverTapInstanceConfig, CleverTapFactory.m5837l(context, cleverTapInstanceConfig, str), n95.f137721a);
    }
}
