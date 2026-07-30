package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzdtn;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.data.Device;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.bis0;
import p153l.bow0;
import p153l.bts0;
import p153l.bxy0;
import p153l.cct0;
import p153l.d2v0;
import p153l.d5t0;
import p153l.dct0;
import p153l.dgs0;
import p153l.dpw0;
import p153l.hpr;
import p153l.jas0;
import p153l.jj5;
import p153l.k6s0;
import p153l.koy0;
import p153l.kus0;
import p153l.lqx0;
import p153l.nbt0;
import p153l.nit0;
import p153l.njt0;
import p153l.obt0;
import p153l.pvw0;
import p153l.pyv0;
import p153l.q6w0;
import p153l.qft0;
import p153l.qjs0;
import p153l.s6t0;
import p153l.sgs0;
import p153l.t6w0;
import p153l.ukw0;
import p153l.vzb;
import p153l.yer0;
import p153l.yky0;
import p153l.ysy0;
import p153l.zjt0;
import p153l.zws0;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2098b {

    /* JADX INFO: renamed from: l */
    public static final ukw0 f9751l = new pyv0(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    @GuardedBy("userAgentLock")
    public String f9758g;

    /* JADX INFO: renamed from: h */
    public volatile String f9759h;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9752a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final AtomicReference f9753b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public final AtomicReference f9754c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f9755d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public boolean f9756e = true;

    /* JADX INFO: renamed from: f */
    public final Object f9757f = new Object();

    /* JADX INFO: renamed from: i */
    public boolean f9760i = false;

    /* JADX INFO: renamed from: j */
    public boolean f9761j = false;

    /* JADX INFO: renamed from: k */
    public final Executor f9762k = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: A */
    public static int m12344A(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return HuiYanResultSender.TIMEOUT_MS;
        }
        dct0.m115298g("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return HuiYanResultSender.TIMEOUT_MS;
    }

    /* JADX INFO: renamed from: B */
    public static final void m12345B(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final String m12346C(final Context context, String str) {
        String strM12352S;
        String str2;
        if (str == null) {
            return m12352S();
        }
        try {
            njt0 njt0VarM163465a = njt0.m163465a();
            if (TextUtils.isEmpty(njt0VarM163465a.f142345a)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str2 = (String) qft0.m176409a(context, new Callable() { // from class: l.zgt0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                d2v0.m113737k("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            d2v0.m113737k("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    str2 = (String) qft0.m176409a(context, new Callable() { // from class: l.git0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                d2v0.m113737k("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                d2v0.m113737k("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            d2v0.m113737k("Reading user agent from WebSettings");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                            if (z) {
                                sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                d2v0.m113737k("Persisting user agent.");
                            }
                            return defaultUserAgent;
                        }
                    });
                }
                njt0VarM163465a.f142345a = str2;
            }
            strM12352S = njt0VarM163465a.f142345a;
        } catch (Exception unused) {
            strM12352S = null;
        }
        if (TextUtils.isEmpty(strM12352S)) {
            strM12352S = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strM12352S)) {
            strM12352S = m12352S();
        }
        String strConcat = strM12352S + " (Mobile; " + str;
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                strConcat = strConcat.concat(";aia");
            }
        } catch (Exception e) {
            bxy0.m106933q().m120275w(e, "AdUtil.getUserAgent");
        }
        return strConcat.concat(")");
    }

    /* JADX INFO: renamed from: F */
    public static List m12347F() {
        dgs0 dgs0Var = sgs0.f168227a;
        List listM120797b = jas0.m144073a().m120797b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM120797b.iterator();
        while (it.hasNext()) {
            Iterator it2 = dpw0.m117427c(bow0.m105711b(',')).m117429d((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    d2v0.m113737k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: P */
    public static final boolean m12349P(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: Q */
    public static final void m12350Q(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    /* JADX INFO: renamed from: R */
    public static final String m12351R(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m12386y(m12385x(context));
    }

    /* JADX INFO: renamed from: S */
    public static final String m12352S() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* JADX INFO: renamed from: T */
    public static final String m12353T() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2;
    }

    /* JADX INFO: renamed from: U */
    public static final DisplayMetrics m12354U(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: V */
    public static final int[] m12355V() {
        return new int[]{0, 0};
    }

    /* JADX INFO: renamed from: W */
    public static final Map m12356W(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            bxy0.m106933q().m120275w(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    /* JADX INFO: renamed from: X */
    public static final long m12357X(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: Y */
    public static final WebResourceResponse m12358Y(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", bxy0.m106934r().m12389E(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new bts0(context).m106383b(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse(FastJsonJsonView.DEFAULT_JSONP_CONTENT_TYPE, "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            dct0.m115299h("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public static final String m12359Z() {
        Resources resourcesM120261e = bxy0.m106933q().m120261e();
        return resourcesM120261e != null ? resourcesM120261e.getString(R$string.f9711s) : "Test Ad";
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m12360a(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    public static final zws0 m12361a0(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                dct0.m115295d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zws0 ? (zws0) iInterfaceQueryLocalInterface : new kus0(iBinder);
        } catch (Exception e) {
            bxy0.m106933q().m120275w(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12362b(String str) {
        if (!cct0.m109067k()) {
            return false;
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168112Q4)).booleanValue()) {
            return false;
        }
        String str2 = (String) jas0.m144075c().m176505a(sgs0.f168136S4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(Constants.PACKNAME_END)) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) jas0.m144075c().m176505a(sgs0.f168124R4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(Constants.PACKNAME_END)) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public static final boolean m12363b0(Context context, String str) {
        Context contextM114319a = d5t0.m114319a(context);
        return Wrappers.packageManager(contextM114319a).checkPermission(str, contextM114319a.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m12364c(Context context) {
        KeyguardManager keyguardManagerM12384w;
        return (context == null || (keyguardManagerM12384w = m12384w(context)) == null || !keyguardManagerM12384w.isKeyguardLocked()) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m12365d(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            dct0.m115296e("Error loading class.", th);
            bxy0.m106933q().m120275w(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m12366e() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m12367f(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m12368g(Context context) {
        try {
            Bundle bundleM12385x = m12385x(context);
            return TextUtils.isEmpty(m12386y(bundleM12385x)) && !TextUtils.isEmpty(bundleM12385x.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m12369h(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final void m12370i(View view, int i, MotionEvent motionEvent) {
        String strM175619a;
        int i2;
        int iHeight;
        int iWidth;
        String str;
        q6w0 q6w0VarMo13733c;
        t6w0 t6w0VarMo13743h;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdtn) {
                childAt = ((zzdtn) childAt).getChildAt(0);
            }
            if ((childAt instanceof zzj) || (childAt instanceof NativeAdView)) {
                strM175619a = "NATIVE";
                i2 = 1;
            } else {
                strM175619a = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            bxy0.m106934r();
            long jM12357X = m12357X(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof zjt0) || (t6w0VarMo13743h = ((zjt0) childAt).mo13743h()) == null) {
                str = "none";
            } else {
                str = t6w0VarMo13743h.f172368b;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof nit0) && (q6w0VarMo13733c = ((nit0) childAt).mo13733c()) != null) {
                strM175619a = q6w0.m175619a(q6w0VarMo13733c.f155875b);
                i2 = q6w0VarMo13733c.f155883f;
                str2 = q6w0VarMo13733c.f155852F;
            }
            dct0.m115297f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strM175619a, Integer.valueOf(i2), childAt.getClass().getName(), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jM12357X), Integer.toString(i, 2)));
        } catch (Exception e) {
            dct0.m115296e("Failure getting view location.", e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final AlertDialog.Builder m12371j(Context context) {
        bxy0.m106935s();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    /* JADX INFO: renamed from: k */
    public static final void m12372k(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new s6t0(context, str, (String) it.next()).mo96667b();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m12373l(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) qjs0.f158041b.m149974e()).booleanValue()) {
                CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static final String m12374m(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (i == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final int m12375n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            dct0.m115298g("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final Map m12376o(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: p */
    public static final int[] m12377p(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m12355V() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    /* JADX INFO: renamed from: q */
    public static final int[] m12378q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrM12355V = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m12355V() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{k6s0.m148569b().m167053e(activity, iArrM12355V[0]), k6s0.m148569b().m167053e(activity, iArrM12355V[1])};
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m12379r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = bxy0.m106934r().f9756e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m12349P(view);
        long jM12357X = m12357X(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z)) {
            return false;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168372l1)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168277da)).booleanValue()) {
            if (jM12357X < ((Integer) jas0.m144075c().m176505a(sgs0.f168303fa)).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static final void m12380s(Context context, Intent intent) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168532xa)).booleanValue()) {
            m12345B(context, intent);
            return;
        }
        try {
            m12345B(context, intent);
        } catch (SecurityException e) {
            dct0.m115299h("", e);
            bxy0.m106933q().m120275w(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m12381t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m12350Q(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            dct0.m115293b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            dct0.m115296e("No browser is found.", e);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final int[] m12382u(Activity activity) {
        int[] iArrM12377p = m12377p(activity);
        return new int[]{k6s0.m148569b().m167053e(activity, iArrM12377p[0]), k6s0.m148569b().m167053e(activity, iArrM12377p[1])};
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m12383v(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m12379r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m12384w(context));
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static KeyguardManager m12384w(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static Bundle m12385x(Context context) throws RemoteException {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            d2v0.m113738l("Error getting metadata", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m12386y(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    /* JADX INFO: renamed from: z */
    public static boolean m12387z(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: D */
    public final hpr m12388D(final Uri uri) {
        return pvw0.m173983j(new Callable() { // from class: l.hhy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ukw0 ukw0Var = C2098b.f9751l;
                bxy0.m106934r();
                return C2098b.m12376o(uri);
            }
        }, this.f9762k);
    }

    /* JADX INFO: renamed from: E */
    public final String m12389E(Context context, String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168046Ka)).booleanValue()) {
            if (this.f9759h != null) {
                return this.f9759h;
            }
            this.f9759h = m12346C(context, str);
            return this.f9759h;
        }
        synchronized (this.f9757f) {
            try {
                String str2 = this.f9758g;
                if (str2 != null) {
                    return str2;
                }
                String strM12346C = m12346C(context, str);
                this.f9758g = strM12346C;
                return strM12346C;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m12390H(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int iM12344A = m12344A(i);
        dct0.m115297f("HTTP timeout: " + iM12344A + " milliseconds.");
        httpURLConnection.setConnectTimeout(iM12344A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iM12344A);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", m12389E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m12391I(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f9754c.set(yer0.m215443b(context, str));
    }

    /* JADX INFO: renamed from: J */
    public final void m12392J(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z) {
        bxy0.m106934r();
        bundle.putString(Device.TYPE, m12353T());
        dgs0 dgs0Var = sgs0.f168227a;
        bundle.putString("eids", TextUtils.join(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, jas0.m144073a().m120796a()));
        if (bundle.isEmpty()) {
            dct0.m115293b("Empty or null bundle.");
        } else {
            final String str3 = (String) jas0.m144075c().m176505a(sgs0.f168238aa);
            if (!this.f9755d.getAndSet(true)) {
                this.f9754c.set(yer0.m215442a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: l.vdy0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.f183689a.m12391I(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f9754c.get());
        }
        k6s0.m148569b();
        obt0.m167048y(context, str, "gmob-apps", bundle, true, new nbt0() { // from class: l.v8y0
            @Override // p153l.nbt0
            public final boolean zza(String str4) {
                ukw0 ukw0Var = C2098b.f9751l;
                bxy0.m106934r();
                C2098b.m12372k(context, str, str4);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final boolean m12393K(String str) {
        return m12387z(str, this.f9752a, (String) jas0.m144075c().m176505a(sgs0.f168241b0));
    }

    /* JADX INFO: renamed from: L */
    public final boolean m12394L(String str) {
        return m12387z(str, this.f9753b, (String) jas0.m144075c().m176505a(sgs0.f168254c0));
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: M */
    public final boolean m12395M(Context context) {
        if (this.f9761j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        sgs0.m185829a(context);
        koy0 koy0Var = null;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168520wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            jj5.m145018l(context.getApplicationContext(), new zzq(this, koy0Var), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this, koy0Var), intentFilter, 4);
        }
        this.f9761j = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: N */
    public final boolean m12396N(Context context) {
        if (this.f9760i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        sgs0.m185829a(context);
        ysy0 ysy0Var = null;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168520wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            jj5.m145018l(context.getApplicationContext(), new zzs(this, ysy0Var), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzs(this, ysy0Var), intentFilter, 4);
        }
        this.f9760i = true;
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final int m12397O(Context context, Uri uri) {
        int i;
        if (context == null) {
            d2v0.m113737k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i = 0;
        } else {
            d2v0.m113737k("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        }
        dgs0 dgs0Var = sgs0.f168526x4;
        Boolean bool = (Boolean) jas0.m144075c().m176505a(dgs0Var);
        dgs0 dgs0Var2 = sgs0.f168538y4;
        if (true == bool.equals(jas0.m144075c().m176505a(dgs0Var2))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue()) {
            bis0 bis0Var = new bis0();
            bis0Var.m104514e(new yky0(this, bis0Var, context, uri));
            bis0Var.m104511b((Activity) context);
        }
        if (!((Boolean) jas0.m144075c().m176505a(dgs0Var2)).booleanValue()) {
            return 5;
        }
        vzb vzbVarM204046a = new vzb.C20961a().m204046a();
        vzbVarM204046a.f186459a.setPackage(lqx0.m155512a(context));
        vzbVarM204046a.m204045a(context, uri);
        return 5;
    }
}
