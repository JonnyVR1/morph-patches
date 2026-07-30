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
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzdtn;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.data.Device;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
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
import p149l.d1s0;
import p149l.efy0;
import p149l.els0;
import p149l.exr0;
import p149l.fhx0;
import p149l.gnr;
import p149l.h2t0;
import p149l.h9t0;
import p149l.hat0;
import p149l.hyb;
import p149l.i2t0;
import p149l.ii5;
import p149l.jmw0;
import p149l.jpv0;
import p149l.k6t0;
import p149l.kas0;
import p149l.kxv0;
import p149l.m7s0;
import p149l.mxs0;
import p149l.nxv0;
import p149l.obw0;
import p149l.s5r0;
import p149l.sby0;
import p149l.sjy0;
import p149l.tat0;
import p149l.tns0;
import p149l.v8s0;
import p149l.vew0;
import p149l.vjs0;
import p149l.vny0;
import p149l.w2t0;
import p149l.x2t0;
import p149l.x6s0;
import p149l.xfw0;
import p149l.xsu0;
import p149l.xvs0;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2075b {

    /* JADX INFO: renamed from: l */
    public static final obw0 f9714l = new jpv0(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    @GuardedBy("userAgentLock")
    public String f9721g;

    /* JADX INFO: renamed from: h */
    public volatile String f9722h;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9715a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final AtomicReference f9716b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public final AtomicReference f9717c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f9718d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public boolean f9719e = true;

    /* JADX INFO: renamed from: f */
    public final Object f9720f = new Object();

    /* JADX INFO: renamed from: i */
    public boolean f9723i = false;

    /* JADX INFO: renamed from: j */
    public boolean f9724j = false;

    /* JADX INFO: renamed from: k */
    public final Executor f9725k = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: A */
    public static int m12290A(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return HuiYanResultSender.TIMEOUT_MS;
        }
        x2t0.m206869g("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return HuiYanResultSender.TIMEOUT_MS;
    }

    /* JADX INFO: renamed from: B */
    public static final void m12291B(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final String m12292C(final Context context, String str) {
        String strM12298S;
        String str2;
        if (str == null) {
            return m12298S();
        }
        try {
            hat0 hat0VarM130199a = hat0.m130199a();
            if (TextUtils.isEmpty(hat0VarM130199a.f106837a)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str2 = (String) k6t0.m144630a(context, new Callable() { // from class: l.t7t0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                xsu0.m210834k("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            xsu0.m210834k("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    str2 = (String) k6t0.m144630a(context, new Callable() { // from class: l.a9t0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                xsu0.m210834k("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                xsu0.m210834k("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            xsu0.m210834k("Reading user agent from WebSettings");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                            if (z) {
                                sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                xsu0.m210834k("Persisting user agent.");
                            }
                            return defaultUserAgent;
                        }
                    });
                }
                hat0VarM130199a.f106837a = str2;
            }
            strM12298S = hat0VarM130199a.f106837a;
        } catch (Exception unused) {
            strM12298S = null;
        }
        if (TextUtils.isEmpty(strM12298S)) {
            strM12298S = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strM12298S)) {
            strM12298S = m12298S();
        }
        String strConcat = strM12298S + " (Mobile; " + str;
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                strConcat = strConcat.concat(";aia");
            }
        } catch (Exception e) {
            vny0.m199079q().m212290w(e, "AdUtil.getUserAgent");
        }
        return strConcat.concat(")");
    }

    /* JADX INFO: renamed from: F */
    public static List m12293F() {
        x6s0 x6s0Var = m7s0.f132156a;
        List listM213242b = d1s0.m109675a().m213242b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM213242b.iterator();
        while (it.hasNext()) {
            Iterator it2 = xfw0.m208616c(vew0.m198261b(',')).m208618d((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    xsu0.m210834k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: P */
    public static final boolean m12295P(View view) {
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
    public static final void m12296Q(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    /* JADX INFO: renamed from: R */
    public static final String m12297R(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m12332y(m12331x(context));
    }

    /* JADX INFO: renamed from: S */
    public static final String m12298S() {
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
    public static final String m12299T() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2;
    }

    /* JADX INFO: renamed from: U */
    public static final DisplayMetrics m12300U(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: V */
    public static final int[] m12301V() {
        return new int[]{0, 0};
    }

    /* JADX INFO: renamed from: W */
    public static final Map m12302W(String str) {
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
            vny0.m199079q().m212290w(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    /* JADX INFO: renamed from: X */
    public static final long m12303X(View view) {
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
    public static final WebResourceResponse m12304Y(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", vny0.m199080r().m12335E(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new vjs0(context).m198686b(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse(FastJsonJsonView.DEFAULT_JSONP_CONTENT_TYPE, "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            x2t0.m206870h("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public static final String m12305Z() {
        Resources resourcesM212276e = vny0.m199079q().m212276e();
        return resourcesM212276e != null ? resourcesM212276e.getString(R$string.f9674s) : "Test Ad";
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m12306a(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    public static final tns0 m12307a0(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                x2t0.m206866d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof tns0 ? (tns0) iInterfaceQueryLocalInterface : new els0(iBinder);
        } catch (Exception e) {
            vny0.m199079q().m212290w(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12308b(String str) {
        if (!w2t0.m201220k()) {
            return false;
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132041Q4)).booleanValue()) {
            return false;
        }
        String str2 = (String) d1s0.m109677c().m144697a(m7s0.f132065S4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(Constants.PACKNAME_END)) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) d1s0.m109677c().m144697a(m7s0.f132053R4);
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
    public static final boolean m12309b0(Context context, String str) {
        Context contextM211305a = xvs0.m211305a(context);
        return Wrappers.packageManager(contextM211305a).checkPermission(str, contextM211305a.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m12310c(Context context) {
        KeyguardManager keyguardManagerM12330w;
        return (context == null || (keyguardManagerM12330w = m12330w(context)) == null || !keyguardManagerM12330w.isKeyguardLocked()) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m12311d(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            x2t0.m206867e("Error loading class.", th);
            vny0.m199079q().m212290w(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m12312e() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m12313f(Context context) {
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
    public static final boolean m12314g(Context context) {
        try {
            Bundle bundleM12331x = m12331x(context);
            return TextUtils.isEmpty(m12332y(bundleM12331x)) && !TextUtils.isEmpty(bundleM12331x.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m12315h(Context context) {
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
    public static final void m12316i(View view, int i, MotionEvent motionEvent) {
        String strM147809a;
        int i2;
        int iHeight;
        int iWidth;
        String str;
        kxv0 kxv0VarMo13679c;
        nxv0 nxv0VarMo13689h;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdtn) {
                childAt = ((zzdtn) childAt).getChildAt(0);
            }
            if ((childAt instanceof zzj) || (childAt instanceof NativeAdView)) {
                strM147809a = "NATIVE";
                i2 = 1;
            } else {
                strM147809a = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            vny0.m199080r();
            long jM12303X = m12303X(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof tat0) || (nxv0VarMo13689h = ((tat0) childAt).mo13689h()) == null) {
                str = "none";
            } else {
                str = nxv0VarMo13689h.f141055b;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof h9t0) && (kxv0VarMo13679c = ((h9t0) childAt).mo13679c()) != null) {
                strM147809a = kxv0.m147809a(kxv0VarMo13679c.f125185b);
                i2 = kxv0VarMo13679c.f125193f;
                str2 = kxv0VarMo13679c.f125162F;
            }
            x2t0.m206868f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strM147809a, Integer.valueOf(i2), childAt.getClass().getName(), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jM12303X), Integer.toString(i, 2)));
        } catch (Exception e) {
            x2t0.m206867e("Failure getting view location.", e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final AlertDialog.Builder m12317j(Context context) {
        vny0.m199081s();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    /* JADX INFO: renamed from: k */
    public static final void m12318k(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new mxs0(context, str, (String) it.next()).mo124731b();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m12319l(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) kas0.f122146b.m115379e()).booleanValue()) {
                CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static final String m12320m(InputStreamReader inputStreamReader) throws IOException {
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
    public static final int m12321n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            x2t0.m206869g("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final Map m12322o(Uri uri) {
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
    public static final int[] m12323p(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m12301V() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    /* JADX INFO: renamed from: q */
    public static final int[] m12324q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrM12301V = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m12301V() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{exr0.m118703b().m134100e(activity, iArrM12301V[0]), exr0.m118703b().m134100e(activity, iArrM12301V[1])};
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m12325r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = vny0.m199080r().f9719e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m12295P(view);
        long jM12303X = m12303X(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z)) {
            return false;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132301l1)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132206da)).booleanValue()) {
            if (jM12303X < ((Integer) d1s0.m109677c().m144697a(m7s0.f132232fa)).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static final void m12326s(Context context, Intent intent) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132461xa)).booleanValue()) {
            m12291B(context, intent);
            return;
        }
        try {
            m12291B(context, intent);
        } catch (SecurityException e) {
            x2t0.m206870h("", e);
            vny0.m199079q().m212290w(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m12327t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m12296Q(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            x2t0.m206864b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            x2t0.m206867e("No browser is found.", e);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final int[] m12328u(Activity activity) {
        int[] iArrM12323p = m12323p(activity);
        return new int[]{exr0.m118703b().m134100e(activity, iArrM12323p[0]), exr0.m118703b().m134100e(activity, iArrM12323p[1])};
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m12329v(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m12325r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m12330w(context));
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static KeyguardManager m12330w(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static Bundle m12331x(Context context) throws RemoteException {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            xsu0.m210835l("Error getting metadata", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m12332y(Bundle bundle) {
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
    public static boolean m12333z(String str, AtomicReference atomicReference, String str2) {
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
    public final gnr m12334D(final Uri uri) {
        return jmw0.m142237j(new Callable() { // from class: l.b8y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                obw0 obw0Var = C2075b.f9714l;
                vny0.m199080r();
                return C2075b.m12322o(uri);
            }
        }, this.f9725k);
    }

    /* JADX INFO: renamed from: E */
    public final String m12335E(Context context, String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131975Ka)).booleanValue()) {
            if (this.f9722h != null) {
                return this.f9722h;
            }
            this.f9722h = m12292C(context, str);
            return this.f9722h;
        }
        synchronized (this.f9720f) {
            try {
                String str2 = this.f9721g;
                if (str2 != null) {
                    return str2;
                }
                String strM12292C = m12292C(context, str);
                this.f9721g = strM12292C;
                return strM12292C;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m12336H(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int iM12290A = m12290A(i);
        x2t0.m206868f("HTTP timeout: " + iM12290A + " milliseconds.");
        httpURLConnection.setConnectTimeout(iM12290A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iM12290A);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", m12335E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m12337I(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f9717c.set(s5r0.m182372b(context, str));
    }

    /* JADX INFO: renamed from: J */
    public final void m12338J(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z) {
        vny0.m199080r();
        bundle.putString(Device.TYPE, m12299T());
        x6s0 x6s0Var = m7s0.f132156a;
        bundle.putString("eids", TextUtils.join(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, d1s0.m109675a().m213241a()));
        if (bundle.isEmpty()) {
            x2t0.m206864b("Empty or null bundle.");
        } else {
            final String str3 = (String) d1s0.m109677c().m144697a(m7s0.f132167aa);
            if (!this.f9718d.getAndSet(true)) {
                this.f9717c.set(s5r0.m182371a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: l.p4y0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.f147245a.m12337I(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f9717c.get());
        }
        exr0.m118703b();
        i2t0.m134095y(context, str, "gmob-apps", bundle, true, new h2t0() { // from class: l.pzx0
            @Override // p149l.h2t0
            public final boolean zza(String str4) {
                obw0 obw0Var = C2075b.f9714l;
                vny0.m199080r();
                C2075b.m12318k(context, str, str4);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final boolean m12339K(String str) {
        return m12333z(str, this.f9715a, (String) d1s0.m109677c().m144697a(m7s0.f132170b0));
    }

    /* JADX INFO: renamed from: L */
    public final boolean m12340L(String str) {
        return m12333z(str, this.f9716b, (String) d1s0.m109677c().m144697a(m7s0.f132183c0));
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: M */
    public final boolean m12341M(Context context) {
        if (this.f9724j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        m7s0.m153417a(context);
        efy0 efy0Var = null;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132449wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            ii5.m136342l(context.getApplicationContext(), new zzq(this, efy0Var), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this, efy0Var), intentFilter, 4);
        }
        this.f9724j = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: N */
    public final boolean m12342N(Context context) {
        if (this.f9723i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        m7s0.m153417a(context);
        sjy0 sjy0Var = null;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132449wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            ii5.m136342l(context.getApplicationContext(), new zzs(this, sjy0Var), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzs(this, sjy0Var), intentFilter, 4);
        }
        this.f9723i = true;
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final int m12343O(Context context, Uri uri) {
        int i;
        if (context == null) {
            xsu0.m210834k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i = 0;
        } else {
            xsu0.m210834k("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        }
        x6s0 x6s0Var = m7s0.f132455x4;
        Boolean bool = (Boolean) d1s0.m109677c().m144697a(x6s0Var);
        x6s0 x6s0Var2 = m7s0.f132467y4;
        if (true == bool.equals(d1s0.m109677c().m144697a(x6s0Var2))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue()) {
            v8s0 v8s0Var = new v8s0();
            v8s0Var.m197519e(new sby0(this, v8s0Var, context, uri));
            v8s0Var.m197516b((Activity) context);
        }
        if (!((Boolean) d1s0.m109677c().m144697a(x6s0Var2)).booleanValue()) {
            return 5;
        }
        hyb hybVarM133505a = new hyb.C17431a().m133505a();
        hybVarM133505a.f110043a.setPackage(fhx0.m121470a(context));
        hybVarM133505a.m133504a(context, uri);
        return 5;
    }
}
