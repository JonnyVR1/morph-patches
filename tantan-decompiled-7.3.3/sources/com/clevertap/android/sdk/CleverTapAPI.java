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
import com.clevertap.android.sdk.cryption.InterfaceC1199c;
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
import p153l.bu9;
import p153l.d4k0;
import p153l.gmb0;
import p153l.h4a;
import p153l.h6g0;
import p153l.hx3;
import p153l.iy40;
import p153l.kob0;
import p153l.ksm;
import p153l.mm50;
import p153l.oa5;
import p153l.ow3;
import p153l.oz40;
import p153l.s3f;
import p153l.tu3;
import p153l.uhi;
import p153l.v5g0;
import p153l.vqm;
import p153l.vw3;
import p153l.wsm;
import p153l.ww3;
import p153l.xpm;
import p153l.yuw;
import p153l.zsm;

/* JADX INFO: loaded from: classes.dex */
public class CleverTapAPI implements CTInboxActivity.InterfaceC1300b {

    /* JADX INFO: renamed from: f */
    static CleverTapInstanceConfig f4804f;

    /* JADX INFO: renamed from: g */
    private static HashMap<String, CleverTapAPI> f4805g;

    /* JADX INFO: renamed from: h */
    private static String f4806h;

    /* JADX INFO: renamed from: i */
    private static oz40 f4807i;

    /* JADX INFO: renamed from: j */
    private static oz40 f4808j;

    /* JADX INFO: renamed from: a */
    private final Context f4811a;

    /* JADX INFO: renamed from: b */
    private C1209g f4812b;

    /* JADX INFO: renamed from: c */
    private WeakReference<wsm> f4813c;

    /* JADX INFO: renamed from: d */
    private WeakReference<zsm> f4814d;

    /* JADX INFO: renamed from: e */
    private static int f4803e = LogLevel.INFO.intValue();

    /* JADX INFO: renamed from: k */
    private static final HashMap<String, NotificationRenderedListener> f4809k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    private static oa5 f4810l = oa5.f145660a;

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
    public class CallableC1187a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f4815a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f4816b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CharSequence f4817c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f4818d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f4819e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f4820f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ CleverTapAPI f4821g;

        public CallableC1187a(Context context, String str, CharSequence charSequence, int i, String str2, boolean z, CleverTapAPI cleverTapAPI) {
            this.f4815a = context;
            this.f4816b = str;
            this.f4817c = charSequence;
            this.f4818d = i;
            this.f4819e = str2;
            this.f4820f = z;
            this.f4821g = cleverTapAPI;
        }

        @Override // java.util.concurrent.Callable
        @RequiresApi(api = 26)
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            NotificationManager notificationManager = (NotificationManager) this.f4815a.getSystemService("notification");
            if (notificationManager == null) {
                return null;
            }
            hx3.m137557a();
            NotificationChannel notificationChannelM142608a = iy40.m142608a(this.f4816b, this.f4817c, this.f4818d);
            notificationChannelM142608a.setDescription(this.f4819e);
            notificationChannelM142608a.setShowBadge(this.f4820f);
            notificationManager.createNotificationChannel(notificationChannelM142608a);
            this.f4821g.m5804G().info(this.f4821g.m5844B(), "Notification channel " + this.f4817c.toString() + " has been created");
            return null;
        }
    }

    public CleverTapAPI(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C1209g c1209g, oa5 oa5Var) {
        this.f4811a = context;
        this.f4812b = c1209g;
        f4810l = oa5Var;
        m5804G().verbose(cleverTapInstanceConfig.getAccountId() + ":async_deviceID", "CoreState is set");
        m5833p();
        Logger.m5923i("CleverTap SDK initialized with accountId: " + cleverTapInstanceConfig.getAccountId() + " accountToken: " + cleverTapInstanceConfig.getAccountToken() + " accountRegion: " + cleverTapInstanceConfig.getAccountRegion());
    }

    /* JADX INFO: renamed from: A */
    private static CleverTapAPI m5800A(Context context, Bundle bundle) {
        return m5843z(context, bundle.getString(Constants.WZRK_ACCT_ID_KEY));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: A0 */
    public static void m5801A0(Context context, String str, kob0 kob0Var) {
        Iterator<CleverTapAPI> it = m5802D(context).iterator();
        while (it.hasNext()) {
            it.next().f4812b.getPushProviders().m111629t(str, kob0Var);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: D */
    public static ArrayList<CleverTapAPI> m5802D(Context context) {
        ArrayList<CleverTapAPI> arrayList = new ArrayList<>();
        HashMap<String, CleverTapAPI> map = f4805g;
        if (map != null && !map.isEmpty()) {
            arrayList.addAll(f4805g.values());
            return arrayList;
        }
        CleverTapAPI cleverTapAPIM5807K = m5807K(context);
        if (cleverTapAPIM5807K != null) {
            arrayList.add(cleverTapAPIM5807K);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    private CleverTapInstanceConfig m5803F() {
        return this.f4812b.getConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public Logger m5804G() {
        return m5803F().getLogger();
    }

    /* JADX INFO: renamed from: I */
    public static int m5805I() {
        return f4803e;
    }

    /* JADX INFO: renamed from: J */
    private static CleverTapInstanceConfig m5806J(Context context) {
        ManifestInfo manifestInfo = ManifestInfo.getInstance(context);
        String strM5934c = manifestInfo.m5934c();
        String strM5936e = manifestInfo.m5936e();
        String strM5935d = manifestInfo.m5935d();
        String strM5946o = manifestInfo.m5946o();
        String strM5947p = manifestInfo.m5947p();
        String strM5942k = manifestInfo.m5942k();
        if (strM5934c == null || strM5936e == null) {
            Logger.m5923i("Account ID or Account token is missing from AndroidManifest.xml, unable to create default instance");
            return null;
        }
        if (strM5935d == null) {
            Logger.m5923i("Account Region not specified in the AndroidManifest - using default region");
        }
        CleverTapInstanceConfig cleverTapInstanceConfigCreateDefaultInstance = CleverTapInstanceConfig.createDefaultInstance(context, strM5934c, strM5936e, strM5935d);
        if (strM5946o != null && !strM5946o.trim().isEmpty()) {
            cleverTapInstanceConfigCreateDefaultInstance.setProxyDomain(strM5946o);
        }
        if (strM5947p != null && !strM5947p.trim().isEmpty()) {
            cleverTapInstanceConfigCreateDefaultInstance.setSpikyProxyDomain(strM5947p);
        }
        if (strM5942k != null && !strM5942k.trim().isEmpty()) {
            cleverTapInstanceConfigCreateDefaultInstance.setCustomHandshakeDomain(strM5942k);
        }
        return cleverTapInstanceConfigCreateDefaultInstance;
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public static CleverTapAPI m5807K(Context context) {
        return m5808L(context, null);
    }

    /* JADX INFO: renamed from: L */
    public static CleverTapAPI m5808L(Context context, String str) {
        f4806h = "!SDK-VERSION-STRING!:com.clevertap.android:clevertap-android-sdk:8.2.0.0";
        CleverTapInstanceConfig cleverTapInstanceConfig = f4804f;
        if (cleverTapInstanceConfig != null) {
            return m5815V(context, cleverTapInstanceConfig, str);
        }
        CleverTapInstanceConfig cleverTapInstanceConfigM5806J = m5806J(context);
        f4804f = cleverTapInstanceConfigM5806J;
        if (cleverTapInstanceConfigM5806J != null) {
            return m5815V(context, cleverTapInstanceConfigM5806J, str);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    private static CleverTapAPI m5809M(Context context) {
        HashMap<String, CleverTapAPI> map;
        CleverTapAPI cleverTapAPIM5807K = m5807K(context);
        if (cleverTapAPIM5807K == null && (map = f4805g) != null && !map.isEmpty()) {
            Iterator<String> it = f4805g.keySet().iterator();
            while (it.hasNext()) {
                cleverTapAPIM5807K = f4805g.get(it.next());
                if (cleverTapAPIM5807K != null) {
                    break;
                }
            }
        }
        return cleverTapAPIM5807K;
    }

    /* JADX INFO: renamed from: P */
    public static oz40 m5810P() {
        return f4807i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: Q */
    public static NotificationRenderedListener m5811Q(String str) {
        return f4809k.get(str);
    }

    /* JADX INFO: renamed from: R */
    public static oz40 m5812R() {
        return f4808j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: S */
    public static void m5813S(Context context, Bundle bundle) {
        String string;
        if (bundle == null) {
            return;
        }
        try {
            string = bundle.getString(Constants.WZRK_ACCT_ID_KEY);
        } catch (Throwable unused) {
            string = null;
        }
        HashMap<String, CleverTapAPI> map = f4805g;
        if (map == null) {
            CleverTapAPI cleverTapAPIM5834q = m5834q(context, string);
            if (cleverTapAPIM5834q != null) {
                cleverTapAPIM5834q.m5862l0(bundle);
                return;
            }
            return;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f4805g.get(it.next());
            if (cleverTapAPI != null && ((string == null && cleverTapAPI.f4812b.getConfig().isDefaultInstance()) || cleverTapAPI.m5844B().equals(string))) {
                cleverTapAPI.m5862l0(bundle);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public static CleverTapAPI m5814U(Context context, @NonNull CleverTapInstanceConfig cleverTapInstanceConfig) {
        return m5815V(context, cleverTapInstanceConfig, null);
    }

    /* JADX INFO: renamed from: V */
    public static CleverTapAPI m5815V(Context context, @NonNull CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig == null) {
            Logger.m5927v("CleverTapInstanceConfig cannot be null");
            return null;
        }
        if (f4805g == null) {
            f4805g = new HashMap<>();
        }
        CleverTapAPI cleverTapAPI = f4805g.get(cleverTapInstanceConfig.getAccountId());
        if (cleverTapAPI == null) {
            cleverTapAPI = new CleverTapAPI(context, cleverTapInstanceConfig, str);
            f4805g.put(cleverTapInstanceConfig.getAccountId(), cleverTapAPI);
        } else if (cleverTapAPI.m5803F().getEnableCustomCleverTapId() && Utils.m5957C(str) && cleverTapAPI.m5817X()) {
            cleverTapAPI.f4812b.getLoginController().m174790y(null, null, str);
        }
        Logger.m5928v(cleverTapInstanceConfig.getAccountId() + ":async_deviceID", "CleverTapAPI instance = " + cleverTapAPI);
        return cleverTapAPI;
    }

    /* JADX INFO: renamed from: W */
    public static boolean m5816W() {
        return bu9.m106440x();
    }

    /* JADX INFO: renamed from: X */
    private boolean m5817X() {
        return this.f4812b.getDeviceInfo().m198780d0();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #1 {all -> 0x0072, blocks: (B:28:0x005d, B:30:0x0074, B:32:0x007a), top: B:52:0x005d }] */
    /* JADX INFO: renamed from: a0 */
    public static void m5818a0(Activity activity, String str) {
        Uri data;
        String string;
        Bundle extras = null;
        if (f4805g == null) {
            m5836r(activity.getApplicationContext(), null, str);
        }
        if (f4805g == null) {
            Logger.m5927v("Instances is null in onActivityCreated!");
            return;
        }
        try {
            data = activity.getIntent().getData();
            if (data != null) {
                try {
                    string = d4k0.m114206a(data.toString(), true).getString(Constants.WZRK_ACCT_ID_KEY);
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
                        Logger.m5927v("ActivityLifecycleCallback: Notification Clicked already processed for " + extras + ", dropping duplicate.");
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
            Iterator<String> it = f4805g.keySet().iterator();
            while (it.hasNext()) {
                CleverTapAPI cleverTapAPI = f4805g.get(it.next());
                if (cleverTapAPI != null) {
                    cleverTapAPI.f4812b.getActivityLifeCycleManager().m5994k(extras, data, string);
                }
            }
        } catch (Throwable th) {
            Logger.m5927v("Throwable - " + th.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m5819b0() {
        HashMap<String, CleverTapAPI> map = f4805g;
        if (map == null) {
            return;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f4805g.get(it.next());
            if (cleverTapAPI != null) {
                try {
                    cleverTapAPI.f4812b.getActivityLifeCycleManager().m5992h();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m5820c(CleverTapAPI cleverTapAPI) {
        cleverTapAPI.f4812b.getSessionManager().m212972g();
        cleverTapAPI.f4812b.getSessionManager().m212973h();
        cleverTapAPI.f4812b.getDeviceInfo().m198786l0();
        cleverTapAPI.f4812b.getDeviceInfo().m198785k0();
        cleverTapAPI.f4812b.getDeviceInfo().m198788m0();
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m5821c0(Activity activity, String str) {
        if (f4805g == null) {
            m5836r(activity.getApplicationContext(), null, str);
        }
        bu9.m106432L(true);
        if (f4805g == null) {
            Logger.m5927v("Instances is null in onActivityResumed!");
            return;
        }
        String strM106437j = bu9.m106437j();
        bu9.m106433R(activity);
        if (strM106437j == null || !strM106437j.equals(activity.getLocalClassName())) {
            bu9.m106439w();
        }
        if (bu9.m106438n() <= 0) {
            bu9.m106434a0(f4810l.mo166825a());
        }
        Iterator<String> it = f4805g.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f4805g.get(it.next());
            if (cleverTapAPI != null) {
                try {
                    cleverTapAPI.f4812b.getActivityLifeCycleManager().m5993i(activity);
                } catch (Throwable th) {
                    Logger.m5927v("Throwable - " + th.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m5822d(CleverTapAPI cleverTapAPI, final mm50 mm50Var) {
        final String strM198762E = cleverTapAPI.f4812b.getDeviceInfo().m198762E();
        if (strM198762E != null) {
            Utils.m5983z(new Runnable() { // from class: l.y85
                @Override // java.lang.Runnable
                public final void run() {
                    mm50Var.mo158955a(strM198762E);
                }
            });
        }
        cleverTapAPI.f4812b.getCallbackManager().mo96510d(mm50Var);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Void m5823e(CleverTapAPI cleverTapAPI, INotificationRenderer iNotificationRenderer, Bundle bundle, Context context) {
        synchronized (cleverTapAPI.f4812b.getPushProviders().m111617B()) {
            try {
                cleverTapAPI.f4812b.getPushProviders().m111623T(iNotificationRenderer);
                if (bundle == null || !bundle.containsKey(Constants.PT_NOTIF_ID)) {
                    cleverTapAPI.f4812b.getPushProviders().m111627c(context, bundle, -1000);
                } else {
                    cleverTapAPI.f4812b.getPushProviders().m111627c(context, bundle, bundle.getInt(Constants.PT_NOTIF_ID));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Void m5824f(CleverTapAPI cleverTapAPI) {
        if (cleverTapAPI.f4812b.getDeviceInfo().m198762E() == null) {
            return null;
        }
        cleverTapAPI.f4812b.getLoginController().m174789C();
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m5825f0(Context context, Bundle bundle) {
        CleverTapAPI cleverTapAPIM5800A = m5800A(context, bundle);
        if (cleverTapAPIM5800A != null) {
            cleverTapAPIM5800A.f4812b.getPushProviders().m111621L(bundle);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Void m5826g(CleverTapAPI cleverTapAPI) {
        String jSONString = cleverTapAPI.m5803F().toJSONString();
        if (jSONString == null) {
            Logger.m5927v("Unable to save config to SharedPrefs, config Json is null");
            return null;
        }
        v5g0.m199863w(cleverTapAPI.f4811a, cleverTapAPI.m5803F().getAccountId(), "instance", jSONString);
        return null;
    }

    @Nullable
    public static CleverTapAPI getGlobalInstance(Context context, String str) {
        return m5843z(context, str);
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
    public static /* synthetic */ Void m5828i(CleverTapAPI cleverTapAPI, h6g0 h6g0Var, C1312j c1312j, InterfaceC1199c interfaceC1199c, String str, String str2, s3f s3fVar) {
        cleverTapAPI.getClass();
        if (h6g0Var.getInAppStore() == null) {
            ksm ksmVarM6821j = c1312j.m6821j(cleverTapAPI.f4811a, interfaceC1199c, str, str2);
            h6g0Var.m133707g(ksmVarM6821j);
            s3fVar.m184251B();
            cleverTapAPI.f4812b.getCallbackManager().mo96509c(ksmVarM6821j);
        }
        if (h6g0Var.getImpressionStore() != null) {
            return null;
        }
        xpm xpmVarM6819h = c1312j.m6819h(cleverTapAPI.f4811a, str, str2);
        h6g0Var.m133706f(xpmVarM6819h);
        cleverTapAPI.f4812b.getCallbackManager().mo96509c(xpmVarM6819h);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Void m5829j(CleverTapAPI cleverTapAPI) {
        if (!cleverTapAPI.m5803F().isDefaultInstance()) {
            return null;
        }
        yuw.m217477d(cleverTapAPI.f4811a, cleverTapAPI.f4812b.getDeviceInfo(), cleverTapAPI.f4812b.getPushProviders());
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Void m5830k(CleverTapAPI cleverTapAPI, CTInboxMessage cTInboxMessage, Bundle bundle) {
        cleverTapAPI.getClass();
        Logger.m5919d("CleverTapAPI:messageDidShow() called  in async with: messageId = [" + cTInboxMessage.m6737e() + Constants.AES_SUFFIX);
        CTInboxMessage cTInboxMessageM5849O = cleverTapAPI.m5849O(cTInboxMessage.m6737e());
        if (cTInboxMessageM5849O.m6742k()) {
            return null;
        }
        cleverTapAPI.f4812b.getAnalyticsManager().m186381J(false, cTInboxMessageM5849O, bundle);
        cleverTapAPI.m5852Z(cTInboxMessageM5849O);
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: o */
    public static void m5832o(String str, NotificationRenderedListener notificationRenderedListener) {
        f4809k.put(str, notificationRenderedListener);
    }

    /* JADX INFO: renamed from: p */
    private void m5833p() {
        this.f4812b.getExecutors().m187990d().m7000g("CleverTapAPI#initializeDeviceInfo", new Callable() { // from class: l.s85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5829j(this.f166741a);
            }
        });
        if (f4810l.mo166825a() - bu9.m106438n() > 5) {
            this.f4812b.getConfig().setCreatedPostAppLaunch();
        }
        this.f4812b.getExecutors().m187990d().m7000g("setStatesAsync", new Callable() { // from class: l.t85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5820c(this.f172490a);
            }
        });
        this.f4812b.getExecutors().m187990d().m7000g("saveConfigtoSharedPrefs", new Callable() { // from class: l.u85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5826g(this.f177972a);
            }
        });
        this.f4812b.getExecutors().m187990d().m7000g("recordDeviceIDErrors", new Callable() { // from class: l.v85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5824f(this.f182849a);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    private static CleverTapAPI m5834q(Context context, String str) {
        return m5836r(context, str, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q0 */
    public static NotificationRenderedListener m5835q0(String str) {
        return f4809k.remove(str);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    private static CleverTapAPI m5836r(Context context, String str, String str2) {
        try {
            if (str == null) {
                try {
                    return m5808L(context, str2);
                } catch (Throwable th) {
                    Logger.m5930v("Error creating shared Instance: ", th.getCause());
                    return null;
                }
            }
            String strM199855i = v5g0.m199855i(context, "instance:".concat(str), "");
            if (!strM199855i.isEmpty()) {
                CleverTapInstanceConfig cleverTapInstanceConfigCreateInstance = CleverTapInstanceConfig.createInstance(strM199855i);
                Logger.m5927v("Inflated Instance Config: ".concat(strM199855i));
                if (cleverTapInstanceConfigCreateInstance != null) {
                    return m5815V(context, cleverTapInstanceConfigCreateInstance, str2);
                }
                return null;
            }
            try {
                CleverTapAPI cleverTapAPIM5807K = m5807K(context);
                if (cleverTapAPIM5807K == null || !cleverTapAPIM5807K.f4812b.getConfig().getAccountId().equals(str)) {
                    return null;
                }
                return cleverTapAPIM5807K;
            } catch (Throwable th2) {
                Logger.m5930v("Error creating shared Instance: ", th2.getCause());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static void m5837s(Context context, Bundle bundle) {
        m5838t(context, bundle, -1000);
    }

    /* JADX INFO: renamed from: t */
    public static void m5838t(Context context, Bundle bundle, int i) {
        CleverTapAPI cleverTapAPIM5800A = m5800A(context, bundle);
        if (cleverTapAPIM5800A != null) {
            C1209g c1209g = cleverTapAPIM5800A.f4812b;
            CleverTapInstanceConfig cleverTapInstanceConfigM6079f = c1209g.getConfig();
            try {
                synchronized (c1209g.getPushProviders().m111617B()) {
                    try {
                        c1209g.getPushProviders().m111623T(new h4a());
                        c1209g.getPushProviders().m111627c(context, bundle, i);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                cleverTapInstanceConfigM6079f.getLogger().debug(cleverTapInstanceConfigM6079f.getAccountId(), "Failed to process createNotification()", th2);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: t0 */
    public static void m5839t0(Context context) {
        HashMap<String, CleverTapAPI> map = f4805g;
        if (map == null) {
            CleverTapAPI cleverTapAPIM5807K = m5807K(context);
            if (cleverTapAPIM5807K != null) {
                if (cleverTapAPIM5807K.m5803F().isBackgroundSync()) {
                    cleverTapAPIM5807K.f4812b.getPushProviders().m111622R(context);
                    return;
                } else {
                    Logger.m5919d("Instance doesn't allow Background sync, not running the Job");
                    return;
                }
            }
            return;
        }
        for (String str : map.keySet()) {
            CleverTapAPI cleverTapAPI = f4805g.get(str);
            if (cleverTapAPI != null && cleverTapAPI.m5803F().isAnalyticsOnly()) {
                Logger.m5920d(str, "Instance is Analytics Only not running the Job");
            } else if (cleverTapAPI == null || !cleverTapAPI.m5803F().isBackgroundSync()) {
                Logger.m5920d(str, "Instance doesn't allow Background sync, not running the Job");
            } else {
                cleverTapAPI.f4812b.getPushProviders().m111622R(context);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5840u(Context context, String str, CharSequence charSequence, String str2, int i, boolean z) {
        CleverTapAPI cleverTapAPIM5809M = m5809M(context);
        if (cleverTapAPIM5809M == null) {
            Logger.m5927v("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                cleverTapAPIM5809M.m5847H().getExecutors().m187990d().m7000g("createNotificationChannel", new CallableC1187a(context, str, charSequence, i, str2, z, cleverTapAPIM5809M));
            }
        } catch (Throwable th) {
            cleverTapAPIM5809M.m5804G().verbose(cleverTapAPIM5809M.m5844B(), "Failure creating Notification Channel", th);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m5841w0(int i) {
        f4803e = i;
    }

    /* JADX INFO: renamed from: x0 */
    public static void m5842x0(LogLevel logLevel) {
        f4803e = logLevel.intValue();
    }

    /* JADX INFO: renamed from: z */
    private static CleverTapAPI m5843z(Context context, String str) {
        HashMap<String, CleverTapAPI> map = f4805g;
        if (map == null) {
            return m5834q(context, str);
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f4805g.get(it.next());
            if (cleverTapAPI != null && ((str == null && cleverTapAPI.f4812b.getConfig().isDefaultInstance()) || cleverTapAPI.m5844B().equals(str))) {
                return cleverTapAPI;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public String m5844B() {
        return this.f4812b.getConfig().getAccountId();
    }

    /* JADX INFO: renamed from: C */
    public ArrayList<CTInboxMessage> m5845C() {
        Logger.m5919d("CleverTapAPI:getAllInboxMessages: called");
        ArrayList<CTInboxMessage> arrayList = new ArrayList<>();
        synchronized (this.f4812b.getCTLockManager().m164938b()) {
            try {
                if (this.f4812b.getControllerManager().m204742e() == null) {
                    m5804G().debug(m5844B(), "Notification Inbox not initialized");
                    return arrayList;
                }
                for (ow3 ow3Var : this.f4812b.getControllerManager().m204742e().m122876l()) {
                    Logger.m5927v("CTMessage Dao - " + ow3Var.m169515z().toString());
                    arrayList.add(new CTInboxMessage(ow3Var.m169515z()));
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m5846E(@NonNull final mm50 mm50Var) {
        this.f4812b.getExecutors().m187987a().m7000g("getCleverTapID", new Callable() { // from class: l.x85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5822d(this.f192790a, mm50Var);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: H */
    public C1209g m5847H() {
        return this.f4812b;
    }

    /* JADX INFO: renamed from: N */
    public int m5848N() {
        synchronized (this.f4812b.getCTLockManager().m164938b()) {
            try {
                if (this.f4812b.getControllerManager().m204742e() != null) {
                    return this.f4812b.getControllerManager().m204742e().m122874i();
                }
                m5804G().debug(m5844B(), "Notification Inbox not initialized");
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public CTInboxMessage m5849O(String str) {
        Logger.m5919d("CleverTapAPI:getInboxMessageForId() called with: messageId = [" + str + Constants.AES_SUFFIX);
        synchronized (this.f4812b.getCTLockManager().m164938b()) {
            try {
                if (this.f4812b.getControllerManager().m204742e() != null) {
                    ow3 ow3VarM122875k = this.f4812b.getControllerManager().m204742e().m122875k(str);
                    return ow3VarM122875k != null ? new CTInboxMessage(ow3VarM122875k.m169515z()) : null;
                }
                m5804G().debug(m5844B(), "Notification Inbox not initialized");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m5850T(String str, Number number) {
        this.f4812b.getAnalyticsManager().m186375A(str, number);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: Y */
    public boolean m5851Y() {
        return this.f4812b.getInboxV2Bridge().m6781b();
    }

    /* JADX INFO: renamed from: Z */
    public void m5852Z(CTInboxMessage cTInboxMessage) {
        if (this.f4812b.getControllerManager().m204742e() != null) {
            this.f4812b.getControllerManager().m204742e().m122879o(cTInboxMessage);
        } else {
            m5804G().debug(m5844B(), "Notification Inbox not initialized");
        }
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxActivity.InterfaceC1300b
    /* JADX INFO: renamed from: a */
    public void mo5853a(CTInboxActivity cTInboxActivity, int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2) {
        this.f4812b.getAnalyticsManager().m186381J(true, cTInboxMessage, bundle);
        Logger.m5927v("clicked inbox notification.");
        WeakReference<zsm> weakReference = this.f4814d;
        if (weakReference != null && weakReference.get() != null) {
            this.f4814d.get().m221351a(cTInboxMessage, i, i2);
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        Logger.m5927v("clicked button of an inbox notification.");
        WeakReference<wsm> weakReference2 = this.f4813c;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        this.f4813c.get().m207786a(map);
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxActivity.InterfaceC1300b
    /* JADX INFO: renamed from: b */
    public void mo5854b(CTInboxActivity cTInboxActivity, final CTInboxMessage cTInboxMessage, final Bundle bundle) {
        this.f4812b.getExecutors().m187990d().m7000g("handleMessageDidShow", new Callable() { // from class: l.w85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5830k(this.f187827a, cTInboxMessage, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public void m5855d0(Map<String, Object> map) {
        m5856e0(map, null);
    }

    /* JADX INFO: renamed from: e0 */
    public void m5856e0(Map<String, Object> map, String str) {
        this.f4812b.getLoginController().m174788B(map, str);
    }

    /* JADX INFO: renamed from: g0 */
    public void m5857g0(boolean z) {
        this.f4812b.getInAppController().m6318X(z);
    }

    /* JADX INFO: renamed from: h0 */
    public void m5858h0(HashMap<String, Object> map, ArrayList<HashMap<String, Object>> arrayList) {
        this.f4812b.getAnalyticsManager().m186377F(map, arrayList);
    }

    /* JADX INFO: renamed from: i0 */
    public void m5859i0(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        m5860j0(str, null);
    }

    /* JADX INFO: renamed from: j0 */
    public void m5860j0(String str, Map<String, Object> map) {
        this.f4812b.getAnalyticsManager().m186379H(str, map);
    }

    /* JADX INFO: renamed from: k0 */
    public void m5861k0(String str, boolean z) {
        this.f4812b.getPushProviders().m111618C(str, gmb0.f104964a, z);
    }

    /* JADX INFO: renamed from: l0 */
    public void m5862l0(Bundle bundle) {
        this.f4812b.getAnalyticsManager().m186383L(bundle);
    }

    /* JADX INFO: renamed from: m */
    public void m5863m(String str, String str2) {
        m5865n(str, new ArrayList<>(Collections.singletonList(str2)));
    }

    /* JADX INFO: renamed from: m0 */
    public void m5864m0(Bundle bundle) {
        this.f4812b.getAnalyticsManager().m186384M(bundle);
    }

    /* JADX INFO: renamed from: n */
    public void m5865n(String str, ArrayList<String> arrayList) {
        this.f4812b.getAnalyticsManager().m186394s(str, arrayList);
    }

    /* JADX INFO: renamed from: n0 */
    public void m5866n0(Map<String, Object> map) {
        this.f4812b.getAnalyticsManager().m186385N(map);
    }

    /* JADX INFO: renamed from: o0 */
    public void m5867o0(String str, String str2) {
        m5868p0(str, new ArrayList<>(Collections.singletonList(str2)));
    }

    /* JADX INFO: renamed from: p0 */
    public void m5868p0(String str, ArrayList<String> arrayList) {
        this.f4812b.getAnalyticsManager().m186387P(str, arrayList);
    }

    /* JADX INFO: renamed from: r0 */
    public void m5869r0(String str) {
        this.f4812b.getAnalyticsManager().m186388Q(str);
    }

    public Future<?> renderPushNotification(@NonNull final INotificationRenderer iNotificationRenderer, final Context context, final Bundle bundle) {
        CleverTapInstanceConfig cleverTapInstanceConfigM6079f = this.f4812b.getConfig();
        try {
            return this.f4812b.getExecutors().m187990d().m7005n("CleverTapAPI#renderPushNotification", new Callable() { // from class: l.r85
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return CleverTapAPI.m5823e(this.f161664a, iNotificationRenderer, bundle, context);
                }
            });
        } catch (Throwable th) {
            cleverTapInstanceConfigM6079f.getLogger().debug(cleverTapInstanceConfigM6079f.getAccountId(), "Failed to process renderPushNotification()", th);
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: s0 */
    public void m5870s0(@NonNull INotificationRenderer iNotificationRenderer, Context context, Bundle bundle) {
        CleverTapInstanceConfig cleverTapInstanceConfigM6079f = this.f4812b.getConfig();
        try {
            synchronized (this.f4812b.getPushProviders().m111617B()) {
                try {
                    cleverTapInstanceConfigM6079f.getLogger().verbose(cleverTapInstanceConfigM6079f.getAccountId(), "rendering push on caller thread with id = " + Thread.currentThread().getId());
                    this.f4812b.getPushProviders().m111623T(iNotificationRenderer);
                    if (bundle == null || !bundle.containsKey(Constants.PT_NOTIF_ID)) {
                        this.f4812b.getPushProviders().m111627c(context, bundle, -1000);
                    } else {
                        this.f4812b.getPushProviders().m111627c(context, bundle, bundle.getInt(Constants.PT_NOTIF_ID));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            cleverTapInstanceConfigM6079f.getLogger().debug(cleverTapInstanceConfigM6079f.getAccountId(), "Failed to process renderPushNotification()", th2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCustomSdkVersion(String str, int i) {
        this.f4812b.getCoreMetaData().m106458U(str, i);
    }

    /* JADX INFO: renamed from: u0 */
    public void m5871u0(vw3 vw3Var) {
        this.f4812b.getCallbackManager().mo96531y(vw3Var);
    }

    /* JADX INFO: renamed from: v */
    public void m5872v(String str, Number number) {
        this.f4812b.getAnalyticsManager().m186395u(str, number);
    }

    /* JADX INFO: renamed from: v0 */
    public void m5873v0(ww3 ww3Var) {
        this.f4812b.getCallbackManager().mo96532z(ww3Var);
    }

    /* JADX INFO: renamed from: w */
    public void m5874w(final String str) {
        final String accountId = this.f4812b.getConfig().getAccountId();
        if (this.f4812b.getControllerManager() == null) {
            m5804G().verbose(accountId + ":async_deviceID", "ControllerManager not set yet! Returning from deviceIDCreated()");
            return;
        }
        final h6g0 h6g0VarM6094u = this.f4812b.getStoreRegistry();
        final InterfaceC1199c interfaceC1199cM6082i = this.f4812b.getCryptHandler();
        final C1312j c1312jM6815f = C1312j.m6815f();
        final s3f s3fVarM6084k = this.f4812b.getEvaluationManager();
        this.f4812b.getLocalDataStore().m118214u(this.f4811a);
        this.f4812b.getExecutors().m187987a().m7000g("initStores", new Callable() { // from class: l.z85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapAPI.m5828i(this.f203308a, h6g0VarM6094u, c1312jM6815f, interfaceC1199cM6082i, str, accountId, s3fVarM6084k);
            }
        });
        if (this.f4812b.getControllerManager().m204746i() == null) {
            m5804G().verbose(accountId + ":async_deviceID", "Initializing InAppFC after Device ID Created = " + str);
            this.f4812b.getControllerManager().m204758u(new vqm(this.f4811a, this.f4812b.getConfig(), str, this.f4812b.getStoreRegistry(), this.f4812b.getImpressionManager(), this.f4812b.getExecutors(), f4810l));
        }
        tu3 tu3VarM204741d = this.f4812b.getControllerManager().m204741d();
        if (tu3VarM204741d != null && TextUtils.isEmpty(tu3VarM204741d.m192718j())) {
            m5804G().verbose(accountId + ":async_deviceID", "Initializing Feature Flags after Device ID Created = " + str);
            tu3VarM204741d.m192722p(str);
        }
        CTProductConfigController cTProductConfigControllerM204743f = this.f4812b.getControllerManager().m204743f();
        if (cTProductConfigControllerM204743f != null && TextUtils.isEmpty(cTProductConfigControllerM204743f.m6937j().m6962g())) {
            m5804G().verbose(accountId + ":async_deviceID", "Initializing Product Config after Device ID Created = " + str);
            cTProductConfigControllerM204743f.m6944w(str);
        }
        m5804G().verbose(accountId + ":async_deviceID", "Got device id from DeviceInfo, notifying user profile initialized to SyncListener");
        this.f4812b.getCallbackManager().mo96527u(str);
        this.f4812b.getCallbackManager().mo96525s(str);
    }

    /* JADX INFO: renamed from: x */
    public void m5875x(boolean z) {
        this.f4812b.getDeviceInfo().m198784k(z);
    }

    /* JADX INFO: renamed from: y */
    public void m5876y(@Nullable uhi uhiVar) {
        if (this.f4812b.getControllerManager().m204742e() != null) {
            this.f4812b.getInboxV2Bridge().m6783d(FetchTrigger.USER_INITIATED, uhiVar);
            return;
        }
        m5804G().debug(m5844B(), "Notification Inbox not initialized — call initializeInbox() first");
        if (uhiVar != null) {
            this.f4812b.getInboxV2Bridge().m6784e(uhiVar);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m5877y0(Location location) {
        this.f4812b.getLocationManager().mo6063a(location);
    }

    /* JADX INFO: renamed from: z0 */
    public void m5878z0(String str, ArrayList<String> arrayList) {
        this.f4812b.getAnalyticsManager().m186392U(str, arrayList);
    }

    private CleverTapAPI(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        this(context, cleverTapInstanceConfig, CleverTapFactory.m5891l(context, cleverTapInstanceConfig, str), oa5.f145660a);
    }
}
