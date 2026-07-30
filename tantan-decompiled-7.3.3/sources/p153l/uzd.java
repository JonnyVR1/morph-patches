package p153l;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.app.usage.UsageStatsManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.NetworkMonitor;
import com.clevertap.android.sdk.task.Task;
import com.clevertap.android.sdk.validation.ValidationError;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.QuestionCategory;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class uzd {

    /* JADX INFO: renamed from: o */
    static int f181742o = -1;

    /* JADX INFO: renamed from: c */
    private C20706c f181745c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f181746d;

    /* JADX INFO: renamed from: e */
    private final Context f181747e;

    /* JADX INFO: renamed from: k */
    private final bu9 f181753k;

    /* JADX INFO: renamed from: n */
    private final NetworkMonitor f181756n;

    /* JADX INFO: renamed from: a */
    private final Object f181743a = new Object();

    /* JADX INFO: renamed from: b */
    private boolean f181744b = false;

    /* JADX INFO: renamed from: f */
    private final Object f181748f = new Object();

    /* JADX INFO: renamed from: g */
    private boolean f181749g = false;

    /* JADX INFO: renamed from: h */
    private String f181750h = null;

    /* JADX INFO: renamed from: j */
    private boolean f181752j = false;

    /* JADX INFO: renamed from: l */
    private final ArrayList<s0l0> f181754l = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    private String f181751i = null;

    /* JADX INFO: renamed from: m */
    private String f181755m = null;

    /* JADX INFO: renamed from: l.uzd$a */
    public class CallableC20704a implements Callable<Void> {
        public CallableC20704a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            uzd.this.m198731D();
            return null;
        }
    }

    /* JADX INFO: renamed from: l.uzd$b */
    public class CallableC20705b implements Callable<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f181758a;

        public CallableC20705b(String str) {
            this.f181758a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            return uzd.this.m198740b0(this.f181758a);
        }
    }

    /* JADX INFO: renamed from: l.uzd$c */
    public class C20706c {

        /* JADX INFO: renamed from: e */
        private final int f181764e;

        /* JADX INFO: renamed from: f */
        private final double f181765f;

        /* JADX INFO: renamed from: m */
        private final double f181772m;

        /* JADX INFO: renamed from: n */
        private final String f181773n;

        /* JADX INFO: renamed from: o */
        private int f181774o;

        /* JADX INFO: renamed from: p */
        private final String f181775p;

        /* JADX INFO: renamed from: l */
        private final String f181771l = m198801C();

        /* JADX INFO: renamed from: i */
        private final String f181768i = m198829z();

        /* JADX INFO: renamed from: j */
        private final String f181769j = m198799A();

        /* JADX INFO: renamed from: g */
        private final String f181766g = m198827x();

        /* JADX INFO: renamed from: h */
        private final String f181767h = m198828y();

        /* JADX INFO: renamed from: c */
        private final String f181762c = m198824u();

        /* JADX INFO: renamed from: b */
        private final int f181761b = m198823t();

        /* JADX INFO: renamed from: a */
        private final String f181760a = m198822s();

        /* JADX INFO: renamed from: d */
        private final String f181763d = m198825v();

        /* JADX INFO: renamed from: k */
        private final int f181770k = m198800B();

        public C20706c() {
            C20707d c20707dM198802D = m198802D();
            this.f181772m = c20707dM198802D.f181778b;
            this.f181765f = c20707dM198802D.f181779c;
            this.f181764e = c20707dM198802D.f181777a;
            this.f181774o = uzd.this.m198736O();
            this.f181775p = m198826w();
            if (Build.VERSION.SDK_INT >= 28) {
                this.f181773n = m198821r();
            } else {
                this.f181773n = null;
            }
        }

        /* JADX INFO: renamed from: A */
        private String m198799A() {
            return Build.VERSION.RELEASE;
        }

        /* JADX INFO: renamed from: B */
        private int m198800B() {
            return 80200;
        }

        /* JADX INFO: renamed from: C */
        private String m198801C() {
            try {
                return uzd.this.f181747e.getPackageManager().getPackageInfo(uzd.this.f181747e.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                uzd.this.m198758y().debug(uzd.this.f181746d.getAccountId(), "Unable to get app version", e);
                return null;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: D */
        private C20707d m198802D() {
            int iWidth;
            int iHeight;
            float f;
            float f2;
            int i;
            WindowManager windowManagerM198737Z = uzd.this.m198737Z();
            if (windowManagerM198737Z == null) {
                uzd.this.m198758y().verbose(uzd.this.f181746d.getAccountId(), "WindowManager is null, returning zero dimension for width/height");
                return new C20707d(0, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManagerM198737Z.getCurrentWindowMetrics();
                Configuration configuration = uzd.this.f181747e.getResources().getConfiguration();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemGestures());
                iWidth = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.right) - insetsIgnoringVisibility.left;
                iHeight = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
                i = configuration.densityDpi;
                f = i;
                f2 = i;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManagerM198737Z.getDefaultDisplay().getMetrics(displayMetrics);
                iWidth = displayMetrics.widthPixels;
                iHeight = displayMetrics.heightPixels;
                f = displayMetrics.xdpi;
                f2 = displayMetrics.ydpi;
                i = displayMetrics.densityDpi;
            }
            return new C20707d(i, m198803E(iWidth / f), m198803E(iHeight / f2));
        }

        /* JADX INFO: renamed from: E */
        private double m198803E(double d) {
            return Math.round(d * 100.0d) / 100.0d;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ int m198812i(C20706c c20706c) {
            int i = c20706c.f181774o;
            c20706c.f181774o = i + 1;
            return i;
        }

        @RequiresApi(api = 28)
        /* JADX INFO: renamed from: r */
        private String m198821r() {
            int appStandbyBucket = ((UsageStatsManager) uzd.this.f181747e.getSystemService("usagestats")).getAppStandbyBucket();
            if (appStandbyBucket == 10) {
                return Active.TYPE;
            }
            if (appStandbyBucket == 20) {
                return "working_set";
            }
            if (appStandbyBucket == 30) {
                return "frequent";
            }
            if (appStandbyBucket != 40) {
                return appStandbyBucket != 45 ? "" : "restricted";
            }
            return "rare";
        }

        /* JADX INFO: renamed from: s */
        private String m198822s() {
            if (uzd.this.f181747e.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                return "ble";
            }
            return uzd.this.f181747e.getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? QuestionCategory.classic : "none";
        }

        /* JADX INFO: renamed from: t */
        private int m198823t() {
            try {
                return uzd.this.f181747e.getPackageManager().getPackageInfo(uzd.this.f181747e.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                uzd.this.m198758y().debug(uzd.this.f181746d.getAccountId(), "Unable to get app build", e);
                return 0;
            }
        }

        /* JADX INFO: renamed from: u */
        private String m198824u() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) uzd.this.f181747e.getSystemService("phone");
                if (telephonyManager != null) {
                    return telephonyManager.getNetworkOperatorName();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: v */
        private String m198825v() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) uzd.this.f181747e.getSystemService("phone");
                if (telephonyManager != null) {
                    return telephonyManager.getSimCountryIso();
                }
            } catch (Throwable unused) {
            }
            return "";
        }

        /* JADX INFO: renamed from: w */
        private String m198826w() {
            String language = Locale.getDefault().getLanguage();
            if ("".equals(language)) {
                language = "xx";
            }
            String country = Locale.getDefault().getCountry();
            if ("".equals(country)) {
                country = "XX";
            }
            return language + "_" + country;
        }

        /* JADX INFO: renamed from: x */
        private String m198827x() {
            return Build.MANUFACTURER;
        }

        /* JADX INFO: renamed from: y */
        private String m198828y() {
            return Build.MODEL.replace(m198827x(), "");
        }

        /* JADX INFO: renamed from: z */
        private String m198829z() {
            return "Android";
        }
    }

    /* JADX INFO: renamed from: l.uzd$d */
    public static class C20707d {

        /* JADX INFO: renamed from: a */
        public final int f181777a;

        /* JADX INFO: renamed from: b */
        public final double f181778b;

        /* JADX INFO: renamed from: c */
        public final double f181779c;

        public C20707d(int i, double d, double d2) {
            this.f181777a = i;
            this.f181778b = d;
            this.f181779c = d2;
        }
    }

    public uzd(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, bu9 bu9Var, NetworkMonitor networkMonitor) {
        this.f181747e = context;
        this.f181746d = cleverTapInstanceConfig;
        this.f181756n = networkMonitor;
        this.f181753k = bu9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public C20706c m198731D() {
        if (this.f181745c == null) {
            this.f181745c = new C20706c();
        }
        return this.f181745c;
    }

    /* JADX INFO: renamed from: F */
    private String m198732F() {
        return "deviceId:" + this.f181746d.getAccountId();
    }

    /* JADX INFO: renamed from: H */
    public static int m198733H(Context context) {
        if (f181742o == -1) {
            try {
                if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
                    f181742o = 3;
                    return 3;
                }
            } catch (Exception e) {
                Logger.m5921d("DeviceInfo", "Failed to decide whether device is a TV!", e);
            }
            try {
                f181742o = context.getResources().getBoolean(u8c0.f178023a) ? 2 : 1;
            } catch (Exception e2) {
                Logger.m5921d("DeviceInfo", "Failed to decide whether device is a smart phone or tablet!", e2);
                f181742o = 0;
            }
        }
        return f181742o;
    }

    /* JADX INFO: renamed from: I */
    private String m198734I() {
        return v5g0.m199855i(this.f181747e, m198735J(), null);
    }

    /* JADX INFO: renamed from: J */
    private String m198735J() {
        return "fallbackId:" + this.f181746d.getAccountId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: O */
    public int m198736O() {
        return v5g0.m199851c(this.f181747e, "local_in_app_count", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public WindowManager m198737Z() {
        Display display;
        Context context = this.f181747e;
        if (context == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                DisplayManager displayManager = (DisplayManager) context.getSystemService(DisplayManager.class);
                if (displayManager != null && (display = displayManager.getDisplay(0)) != null) {
                    return (WindowManager) this.f181747e.createDisplayContext(display).createWindowContext(2, null).getSystemService(WindowManager.class);
                }
            } catch (Exception e) {
                m198758y().verbose(this.f181746d.getAccountId(), "Window context creation failed", e);
            }
        }
        return (WindowManager) this.f181747e.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m198738a(uzd uzdVar, String str) {
        uzdVar.m198758y().verbose(uzdVar.f181746d.getAccountId() + ":async_deviceID", "DeviceID initialized successfully!" + Thread.currentThread());
        CleverTapAPI.m5814U(uzdVar.f181747e, uzdVar.f181746d).m5874w(str);
    }

    /* JADX INFO: renamed from: b */
    private String m198739b() {
        String strM199855i = v5g0.m199855i(this.f181747e, m198732F(), null);
        return (this.f181746d.isDefaultInstance() && strM199855i == null) ? v5g0.m199855i(this.f181747e, Constants.DEVICE_ID_TAG, null) : strM199855i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public String m198740b0(String str) {
        m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "Called initDeviceID()");
        if (this.f181746d.getEnableCustomCleverTapId()) {
            if (str == null) {
                this.f181746d.getLogger().info(m198749i0(ValidationError.USE_CUSTOM_ID_FALLBACK, new String[0]));
            }
        } else if (str != null) {
            this.f181746d.getLogger().info(m198749i0(ValidationError.USE_CUSTOM_ID_MISSING_IN_MANIFEST, new String[0]));
        }
        m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "Calling _getDeviceID");
        String strM198739b = m198739b();
        m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "Called _getDeviceID");
        if (strM198739b != null && strM198739b.trim().length() > 2) {
            m198758y().verbose(this.f181746d.getAccountId(), "CleverTap ID already present for profile");
            if (str != null) {
                m198758y().info(this.f181746d.getAccountId(), m198749i0(ValidationError.UNABLE_TO_SET_CT_CUSTOM_ID, strM198739b, str));
            }
            return strM198739b;
        }
        if (this.f181746d.getEnableCustomCleverTapId()) {
            return m198789n(str);
        }
        if (this.f181746d.isUseGoogleAdId()) {
            m198752l();
            String strM198754p = m198754p();
            m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "initDeviceID() done executing!");
            return strM198754p;
        }
        m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "Calling generateDeviceID()");
        String strM198754p2 = m198754p();
        m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "Called generateDeviceID()");
        return strM198754p2;
    }

    /* JADX INFO: renamed from: h0 */
    private String m198747h0() {
        String strM198762E = m198762E();
        if (strM198762E == null) {
            return null;
        }
        return "OptOut:".concat(strM198762E);
    }

    /* JADX INFO: renamed from: i0 */
    private String m198749i0(ValidationError validationError, String... strArr) {
        s0l0 s0l0VarM188803a = t0l0.m188803a(validationError, strArr);
        this.f181754l.add(s0l0VarM188803a);
        return s0l0VarM188803a.m183968b();
    }

    /* JADX INFO: renamed from: j */
    private String m198750j() {
        String strM198762E = m198762E();
        if (strM198762E == null) {
            return null;
        }
        return "allowSystemEvents:".concat(strM198762E);
    }

    /* JADX INFO: renamed from: j0 */
    private void m198751j0() {
        v5g0.m199865z(this.f181747e, m198732F());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:12:0x005e, B:18:0x0068, B:20:0x009a, B:21:0x00a9, B:24:0x00ac), top: B:61:0x005e, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac A[Catch: all -> 0x0065, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:12:0x005e, B:18:0x0068, B:20:0x009a, B:21:0x00a9, B:24:0x00ac), top: B:61:0x005e, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x012c A[Catch: all -> 0x013e, TryCatch #2 {, blocks: (B:42:0x0124, B:44:0x012c, B:45:0x013b, B:50:0x0140, B:51:0x014a), top: B:62:0x0124, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140 A[Catch: all -> 0x013e, TRY_ENTER, TryCatch #2 {, blocks: (B:42:0x0124, B:44:0x012c, B:45:0x013b, B:50:0x0140, B:51:0x014a), top: B:62:0x0124, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    private synchronized void m198752l() {
        try {
            m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "fetchGoogleAdID() called!");
            if (m198764K() == null && !this.f181744b) {
                boolean z = true;
                String str = null;
                try {
                    this.f181744b = true;
                    Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.f181747e);
                    Boolean bool = (Boolean) objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
                    synchronized (this.f181743a) {
                        if (bool != null) {
                            try {
                                if (!bool.booleanValue()) {
                                    z = false;
                                }
                                this.f181752j = z;
                                m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "limitAdTracking = " + this.f181752j);
                                if (this.f181752j) {
                                    m198758y().debug(this.f181746d.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                    return;
                                }
                                str = (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
                                if (str != null && str.trim().length() > 2) {
                                    synchronized (this.f181743a) {
                                        if (str.contains("00000000")) {
                                            m198758y().debug(this.f181746d.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                            return;
                                        }
                                        this.f181750h = str.replace("-", "");
                                    }
                                }
                                m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "fetchGoogleAdID() done executing!");
                            } catch (Throwable th) {
                                throw th;
                            }
                        } else {
                            z = false;
                            this.f181752j = z;
                            m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "limitAdTracking = " + this.f181752j);
                            if (this.f181752j) {
                                m198758y().debug(this.f181746d.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                return;
                            }
                            str = (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
                            if (str != null) {
                                synchronized (this.f181743a) {
                                    if (str.contains("00000000")) {
                                        m198758y().debug(this.f181746d.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                        return;
                                    }
                                    this.f181750h = str.replace("-", "");
                                }
                            }
                            m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "fetchGoogleAdID() done executing!");
                        }
                    }
                } catch (Throwable th2) {
                    if (th2.getCause() != null) {
                        m198758y().verbose(this.f181746d.getAccountId(), "Failed to get Advertising ID: " + th2 + th2.getCause().toString());
                    } else {
                        m198758y().verbose(this.f181746d.getAccountId(), "Failed to get Advertising ID: " + th2);
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m198753n0(String str) {
        m198758y().verbose(this.f181746d.getAccountId(), "Updating the fallback id - " + str);
        v5g0.m199862v(this.f181747e, m198735J(), str);
    }

    /* JADX INFO: renamed from: p */
    private synchronized String m198754p() {
        String strM198756r;
        String strConcat;
        try {
            m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "generateDeviceID() called!");
            String strM198764K = m198764K();
            if (strM198764K != null) {
                strConcat = Constants.GUID_PREFIX_GOOGLE_AD_ID.concat(strM198764K);
            } else {
                synchronized (this.f181748f) {
                    strM198756r = m198756r();
                }
                strConcat = strM198756r;
            }
            m198790o(strConcat);
            m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "generateDeviceID() done executing!");
        } catch (Throwable th) {
            throw th;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: q */
    private synchronized String m198755q() {
        String str;
        String strM198734I = m198734I();
        if (strM198734I != null) {
            return strM198734I;
        }
        synchronized (this.f181748f) {
            str = Constants.ERROR_PROFILE_PREFIX + UUID.randomUUID().toString().replace("-", "");
            m198753n0(str);
        }
        return str;
    }

    /* JADX INFO: renamed from: r */
    private String m198756r() {
        return "__" + UUID.randomUUID().toString().replace("-", "");
    }

    /* JADX INFO: renamed from: t */
    public static int m198757t(Context context) {
        return context.getApplicationInfo().icon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public Logger m198758y() {
        return this.f181746d.getLogger();
    }

    /* JADX INFO: renamed from: A */
    public String m198759A() {
        return m198731D().f181763d;
    }

    /* JADX INFO: renamed from: B */
    public String m198760B() {
        return this.f181755m;
    }

    /* JADX INFO: renamed from: C */
    public int m198761C() {
        return m198731D().f181764e;
    }

    /* JADX INFO: renamed from: E */
    public String m198762E() {
        String strM198739b = m198739b();
        return strM198739b != null ? strM198739b : m198734I();
    }

    /* JADX INFO: renamed from: G */
    public String m198763G() {
        return m198731D().f181775p;
    }

    /* JADX INFO: renamed from: K */
    public String m198764K() {
        String str;
        synchronized (this.f181743a) {
            str = this.f181750h;
        }
        return str;
    }

    /* JADX INFO: renamed from: L */
    public double m198765L() {
        return m198731D().f181765f;
    }

    /* JADX INFO: renamed from: M */
    public String m198766M() {
        return this.f181751i;
    }

    /* JADX INFO: renamed from: N */
    public int m198767N() {
        return m198731D().f181774o;
    }

    /* JADX INFO: renamed from: P */
    public String m198768P() {
        return TextUtils.isEmpty(m198760B()) ? m198763G() : m198760B();
    }

    /* JADX INFO: renamed from: Q */
    public String m198769Q() {
        return m198731D().f181766g;
    }

    /* JADX INFO: renamed from: R */
    public String m198770R() {
        return m198731D().f181767h;
    }

    /* JADX INFO: renamed from: S */
    public String m198771S() {
        NetworkMonitor networkMonitor = this.f181756n;
        if (networkMonitor == null) {
            return null;
        }
        return networkMonitor.m6856k();
    }

    /* JADX INFO: renamed from: T */
    public String m198772T() {
        return m198731D().f181768i;
    }

    /* JADX INFO: renamed from: U */
    public String m198773U() {
        return m198731D().f181769j;
    }

    /* JADX INFO: renamed from: V */
    public int m198774V() {
        return m198731D().f181770k;
    }

    /* JADX INFO: renamed from: W */
    public ArrayList<s0l0> m198775W() {
        ArrayList<s0l0> arrayList = (ArrayList) this.f181754l.clone();
        this.f181754l.clear();
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public String m198776X() {
        return m198731D().f181771l;
    }

    /* JADX INFO: renamed from: Y */
    public double m198777Y() {
        return m198731D().f181772m;
    }

    /* JADX INFO: renamed from: a0 */
    public void m198778a0() {
        C20706c.m198812i(m198731D());
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c0 */
    public Boolean m198779c0() {
        BluetoothAdapter defaultAdapter;
        try {
            if (this.f181747e.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.f181747e.getPackageName()) != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return null;
            }
            return Boolean.valueOf(defaultAdapter.isEnabled());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m198780d0() {
        String strM198762E = m198762E();
        return strM198762E != null && strM198762E.startsWith(Constants.ERROR_PROFILE_PREFIX);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m198781e0() {
        boolean z;
        synchronized (this.f181743a) {
            z = this.f181752j;
        }
        return z;
    }

    /* JADX INFO: renamed from: f0 */
    public Boolean m198782f0() {
        NetworkMonitor networkMonitor;
        if (this.f181747e.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (networkMonitor = this.f181756n) == null || networkMonitor.m6855i() == NetworkMonitor.NetworkType.UNDETECTED) {
            return null;
        }
        return Boolean.valueOf(this.f181756n.m6858o());
    }

    /* JADX INFO: renamed from: g0 */
    public void m198783g0(String str) {
        m198758y().verbose(this.f181746d.getAccountId() + ":async_deviceID", "DeviceInfo() called");
        ru3.m183186c(this.f181746d).m187987a().m7000g("getDeviceCachedInfo", new CallableC20704a());
        Task taskM187987a = ru3.m183186c(this.f181746d).m187987a();
        taskM187987a.m6999f(new vo50() { // from class: l.tzd
            @Override // p153l.vo50
            public final void onSuccess(Object obj) {
                uzd.m198738a(this.f176755a, (String) obj);
            }
        });
        taskM187987a.m7000g("initDeviceID", new CallableC20705b(str));
    }

    /* JADX INFO: renamed from: k */
    public void m198784k(boolean z) {
        this.f181749g = z;
        v5g0.m199859n(this.f181747e, this.f181746d.getAccountId(), Constants.NETWORK_INFO, this.f181749g);
        this.f181746d.getLogger().verbose(this.f181746d.getAccountId(), "Device Network Information reporting set to " + this.f181749g);
    }

    /* JADX INFO: renamed from: k0 */
    public void m198785k0() {
        String strM198747h0 = m198747h0();
        if (strM198747h0 == null) {
            this.f181746d.getLogger().verbose(this.f181746d.getAccountId(), "Unable to set current user OptOut state from storage: storage key is null");
            return;
        }
        boolean zM199850b = v5g0.m199850b(this.f181747e, this.f181746d.getAccountId(), strM198747h0);
        this.f181753k.m106457T(zM199850b);
        this.f181746d.getLogger().verbose(this.f181746d.getAccountId(), "Set current user OptOut state from storage to: " + zM199850b + " for key: " + strM198747h0);
    }

    /* JADX INFO: renamed from: l0 */
    public void m198786l0() {
        boolean zM199850b = v5g0.m199850b(this.f181747e, this.f181746d.getAccountId(), Constants.NETWORK_INFO);
        this.f181746d.getLogger().verbose(this.f181746d.getAccountId(), "Setting device network info reporting state from storage to " + zM199850b);
        this.f181749g = zM199850b;
    }

    /* JADX INFO: renamed from: m */
    public void m198787m() {
        m198790o(m198756r());
    }

    /* JADX INFO: renamed from: m0 */
    public void m198788m0() {
        String strM198750j = m198750j();
        if (strM198750j == null) {
            this.f181746d.getLogger().verbose(this.f181746d.getAccountId(), "Unable to set current user allowed system events and communications flag from storage: storage key is null");
            return;
        }
        boolean zM199850b = v5g0.m199850b(this.f181747e, this.f181746d.getAccountId(), strM198750j);
        this.f181753k.m106459V(zM199850b);
        this.f181746d.getLogger().verbose(this.f181746d.getAccountId(), "Set current user allowed system events and communications flag state from storage to: " + zM199850b + " for key: " + strM198750j);
    }

    /* JADX INFO: renamed from: n */
    public String m198789n(String str) {
        if (!Utils.m5957C(str)) {
            String strM198755q = m198755q();
            m198751j0();
            m198758y().info(this.f181746d.getAccountId(), m198749i0(ValidationError.INVALID_CT_CUSTOM_ID, str, m198734I()));
            return strM198755q;
        }
        m198758y().info(this.f181746d.getAccountId(), "Setting CleverTap ID to custom CleverTap ID : " + str);
        String str2 = Constants.CUSTOM_CLEVERTAP_ID_PREFIX + str;
        m198790o(str2);
        return str2;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: o */
    public void m198790o(String str) {
        m198758y().verbose(this.f181746d.getAccountId(), "Force updating the device ID to " + str);
        synchronized (this.f181748f) {
            v5g0.m199862v(this.f181747e, m198732F(), str);
        }
    }

    /* JADX INFO: renamed from: s */
    public String m198791s() {
        return m198731D().f181773n;
    }

    /* JADX INFO: renamed from: u */
    public JSONObject m198792u() {
        try {
            return lw3.m156021b(this, this.f181753k, this.f181749g, m198764K() != null ? new u0w(this.f181747e, this.f181746d).m193875b() : false);
        } catch (Throwable th) {
            this.f181746d.getLogger().verbose(this.f181746d.getAccountId(), "Failed to construct App Launched event", th);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: v */
    public String m198793v() {
        return m198731D().f181760a;
    }

    /* JADX INFO: renamed from: w */
    public int m198794w() {
        return m198731D().f181761b;
    }

    /* JADX INFO: renamed from: x */
    public String m198795x() {
        return m198731D().f181762c;
    }

    /* JADX INFO: renamed from: z */
    public Context m198796z() {
        return this.f181747e;
    }
}
