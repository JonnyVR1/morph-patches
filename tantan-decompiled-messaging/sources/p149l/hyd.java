package p149l;

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
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.QuestionCategory;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class hyd {

    /* JADX INFO: renamed from: o */
    static int f110057o = -1;

    /* JADX INFO: renamed from: c */
    private C17434c f110060c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f110061d;

    /* JADX INFO: renamed from: e */
    private final Context f110062e;

    /* JADX INFO: renamed from: k */
    private final qs9 f110068k;

    /* JADX INFO: renamed from: n */
    private final NetworkMonitor f110071n;

    /* JADX INFO: renamed from: a */
    private final Object f110058a = new Object();

    /* JADX INFO: renamed from: b */
    private boolean f110059b = false;

    /* JADX INFO: renamed from: f */
    private final Object f110063f = new Object();

    /* JADX INFO: renamed from: g */
    private boolean f110064g = false;

    /* JADX INFO: renamed from: h */
    private String f110065h = null;

    /* JADX INFO: renamed from: j */
    private boolean f110067j = false;

    /* JADX INFO: renamed from: l */
    private final ArrayList<mrk0> f110069l = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    private String f110066i = null;

    /* JADX INFO: renamed from: m */
    private String f110070m = null;

    /* JADX INFO: renamed from: l.hyd$a */
    public class CallableC17432a implements Callable<Void> {
        public CallableC17432a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            hyd.this.m133508D();
            return null;
        }
    }

    /* JADX INFO: renamed from: l.hyd$b */
    public class CallableC17433b implements Callable<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f110073a;

        public CallableC17433b(String str) {
            this.f110073a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            return hyd.this.m133517b0(this.f110073a);
        }
    }

    /* JADX INFO: renamed from: l.hyd$c */
    public class C17434c {

        /* JADX INFO: renamed from: e */
        private final int f110079e;

        /* JADX INFO: renamed from: f */
        private final double f110080f;

        /* JADX INFO: renamed from: m */
        private final double f110087m;

        /* JADX INFO: renamed from: n */
        private final String f110088n;

        /* JADX INFO: renamed from: o */
        private int f110089o;

        /* JADX INFO: renamed from: p */
        private final String f110090p;

        /* JADX INFO: renamed from: l */
        private final String f110086l = m133578C();

        /* JADX INFO: renamed from: i */
        private final String f110083i = m133606z();

        /* JADX INFO: renamed from: j */
        private final String f110084j = m133576A();

        /* JADX INFO: renamed from: g */
        private final String f110081g = m133604x();

        /* JADX INFO: renamed from: h */
        private final String f110082h = m133605y();

        /* JADX INFO: renamed from: c */
        private final String f110077c = m133601u();

        /* JADX INFO: renamed from: b */
        private final int f110076b = m133600t();

        /* JADX INFO: renamed from: a */
        private final String f110075a = m133599s();

        /* JADX INFO: renamed from: d */
        private final String f110078d = m133602v();

        /* JADX INFO: renamed from: k */
        private final int f110085k = m133577B();

        public C17434c() {
            C17435d c17435dM133579D = m133579D();
            this.f110087m = c17435dM133579D.f110093b;
            this.f110080f = c17435dM133579D.f110094c;
            this.f110079e = c17435dM133579D.f110092a;
            this.f110089o = hyd.this.m133513O();
            this.f110090p = m133603w();
            if (Build.VERSION.SDK_INT >= 28) {
                this.f110088n = m133598r();
            } else {
                this.f110088n = null;
            }
        }

        /* JADX INFO: renamed from: A */
        private String m133576A() {
            return Build.VERSION.RELEASE;
        }

        /* JADX INFO: renamed from: B */
        private int m133577B() {
            return 80200;
        }

        /* JADX INFO: renamed from: C */
        private String m133578C() {
            try {
                return hyd.this.f110062e.getPackageManager().getPackageInfo(hyd.this.f110062e.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                hyd.this.m133535y().debug(hyd.this.f110061d.getAccountId(), "Unable to get app version", e);
                return null;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: D */
        private C17435d m133579D() {
            int iWidth;
            int iHeight;
            float f;
            float f2;
            int i;
            WindowManager windowManagerM133514Z = hyd.this.m133514Z();
            if (windowManagerM133514Z == null) {
                hyd.this.m133535y().verbose(hyd.this.f110061d.getAccountId(), "WindowManager is null, returning zero dimension for width/height");
                return new C17435d(0, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManagerM133514Z.getCurrentWindowMetrics();
                Configuration configuration = hyd.this.f110062e.getResources().getConfiguration();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemGestures());
                iWidth = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.right) - insetsIgnoringVisibility.left;
                iHeight = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
                i = configuration.densityDpi;
                f = i;
                f2 = i;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManagerM133514Z.getDefaultDisplay().getMetrics(displayMetrics);
                iWidth = displayMetrics.widthPixels;
                iHeight = displayMetrics.heightPixels;
                f = displayMetrics.xdpi;
                f2 = displayMetrics.ydpi;
                i = displayMetrics.densityDpi;
            }
            return new C17435d(i, m133580E(iWidth / f), m133580E(iHeight / f2));
        }

        /* JADX INFO: renamed from: E */
        private double m133580E(double d) {
            return Math.round(d * 100.0d) / 100.0d;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ int m133589i(C17434c c17434c) {
            int i = c17434c.f110089o;
            c17434c.f110089o = i + 1;
            return i;
        }

        @RequiresApi(api = 28)
        /* JADX INFO: renamed from: r */
        private String m133598r() {
            int appStandbyBucket = ((UsageStatsManager) hyd.this.f110062e.getSystemService("usagestats")).getAppStandbyBucket();
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
        private String m133599s() {
            if (hyd.this.f110062e.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                return "ble";
            }
            return hyd.this.f110062e.getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? QuestionCategory.classic : "none";
        }

        /* JADX INFO: renamed from: t */
        private int m133600t() {
            try {
                return hyd.this.f110062e.getPackageManager().getPackageInfo(hyd.this.f110062e.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                hyd.this.m133535y().debug(hyd.this.f110061d.getAccountId(), "Unable to get app build", e);
                return 0;
            }
        }

        /* JADX INFO: renamed from: u */
        private String m133601u() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) hyd.this.f110062e.getSystemService("phone");
                if (telephonyManager != null) {
                    return telephonyManager.getNetworkOperatorName();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: v */
        private String m133602v() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) hyd.this.f110062e.getSystemService("phone");
                if (telephonyManager != null) {
                    return telephonyManager.getSimCountryIso();
                }
            } catch (Throwable unused) {
            }
            return "";
        }

        /* JADX INFO: renamed from: w */
        private String m133603w() {
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
        private String m133604x() {
            return Build.MANUFACTURER;
        }

        /* JADX INFO: renamed from: y */
        private String m133605y() {
            return Build.MODEL.replace(m133604x(), "");
        }

        /* JADX INFO: renamed from: z */
        private String m133606z() {
            return "Android";
        }
    }

    /* JADX INFO: renamed from: l.hyd$d */
    public static class C17435d {

        /* JADX INFO: renamed from: a */
        public final int f110092a;

        /* JADX INFO: renamed from: b */
        public final double f110093b;

        /* JADX INFO: renamed from: c */
        public final double f110094c;

        public C17435d(int i, double d, double d2) {
            this.f110092a = i;
            this.f110093b = d;
            this.f110094c = d2;
        }
    }

    public hyd(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, qs9 qs9Var, NetworkMonitor networkMonitor) {
        this.f110062e = context;
        this.f110061d = cleverTapInstanceConfig;
        this.f110071n = networkMonitor;
        this.f110068k = qs9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public C17434c m133508D() {
        if (this.f110060c == null) {
            this.f110060c = new C17434c();
        }
        return this.f110060c;
    }

    /* JADX INFO: renamed from: F */
    private String m133509F() {
        return "deviceId:" + this.f110061d.getAccountId();
    }

    /* JADX INFO: renamed from: H */
    public static int m133510H(Context context) {
        if (f110057o == -1) {
            try {
                if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
                    f110057o = 3;
                    return 3;
                }
            } catch (Exception e) {
                Logger.m5867d("DeviceInfo", "Failed to decide whether device is a TV!", e);
            }
            try {
                f110057o = context.getResources().getBoolean(p0c0.f146580a) ? 2 : 1;
            } catch (Exception e2) {
                Logger.m5867d("DeviceInfo", "Failed to decide whether device is a smart phone or tablet!", e2);
                f110057o = 0;
            }
        }
        return f110057o;
    }

    /* JADX INFO: renamed from: I */
    private String m133511I() {
        return mxf0.m156889i(this.f110062e, m133512J(), null);
    }

    /* JADX INFO: renamed from: J */
    private String m133512J() {
        return "fallbackId:" + this.f110061d.getAccountId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: O */
    public int m133513O() {
        return mxf0.m156885c(this.f110062e, "local_in_app_count", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public WindowManager m133514Z() {
        Display display;
        Context context = this.f110062e;
        if (context == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                DisplayManager displayManager = (DisplayManager) context.getSystemService(DisplayManager.class);
                if (displayManager != null && (display = displayManager.getDisplay(0)) != null) {
                    return (WindowManager) this.f110062e.createDisplayContext(display).createWindowContext(2, null).getSystemService(WindowManager.class);
                }
            } catch (Exception e) {
                m133535y().verbose(this.f110061d.getAccountId(), "Window context creation failed", e);
            }
        }
        return (WindowManager) this.f110062e.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m133515a(hyd hydVar, String str) {
        hydVar.m133535y().verbose(hydVar.f110061d.getAccountId() + ":async_deviceID", "DeviceID initialized successfully!" + Thread.currentThread());
        CleverTapAPI.m5760U(hydVar.f110062e, hydVar.f110061d).m5820w(str);
    }

    /* JADX INFO: renamed from: b */
    private String m133516b() {
        String strM156889i = mxf0.m156889i(this.f110062e, m133509F(), null);
        return (this.f110061d.isDefaultInstance() && strM156889i == null) ? mxf0.m156889i(this.f110062e, Constants.DEVICE_ID_TAG, null) : strM156889i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public String m133517b0(String str) {
        m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "Called initDeviceID()");
        if (this.f110061d.getEnableCustomCleverTapId()) {
            if (str == null) {
                this.f110061d.getLogger().info(m133526i0(ValidationError.USE_CUSTOM_ID_FALLBACK, new String[0]));
            }
        } else if (str != null) {
            this.f110061d.getLogger().info(m133526i0(ValidationError.USE_CUSTOM_ID_MISSING_IN_MANIFEST, new String[0]));
        }
        m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "Calling _getDeviceID");
        String strM133516b = m133516b();
        m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "Called _getDeviceID");
        if (strM133516b != null && strM133516b.trim().length() > 2) {
            m133535y().verbose(this.f110061d.getAccountId(), "CleverTap ID already present for profile");
            if (str != null) {
                m133535y().info(this.f110061d.getAccountId(), m133526i0(ValidationError.UNABLE_TO_SET_CT_CUSTOM_ID, strM133516b, str));
            }
            return strM133516b;
        }
        if (this.f110061d.getEnableCustomCleverTapId()) {
            return m133566n(str);
        }
        if (this.f110061d.isUseGoogleAdId()) {
            m133529l();
            String strM133531p = m133531p();
            m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "initDeviceID() done executing!");
            return strM133531p;
        }
        m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "Calling generateDeviceID()");
        String strM133531p2 = m133531p();
        m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "Called generateDeviceID()");
        return strM133531p2;
    }

    /* JADX INFO: renamed from: h0 */
    private String m133524h0() {
        String strM133539E = m133539E();
        if (strM133539E == null) {
            return null;
        }
        return "OptOut:".concat(strM133539E);
    }

    /* JADX INFO: renamed from: i0 */
    private String m133526i0(ValidationError validationError, String... strArr) {
        mrk0 mrk0VarM160744a = nrk0.m160744a(validationError, strArr);
        this.f110069l.add(mrk0VarM160744a);
        return mrk0VarM160744a.m156035b();
    }

    /* JADX INFO: renamed from: j */
    private String m133527j() {
        String strM133539E = m133539E();
        if (strM133539E == null) {
            return null;
        }
        return "allowSystemEvents:".concat(strM133539E);
    }

    /* JADX INFO: renamed from: j0 */
    private void m133528j0() {
        mxf0.m156899z(this.f110062e, m133509F());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:12:0x005e, B:18:0x0068, B:20:0x009a, B:21:0x00a9, B:24:0x00ac), top: B:61:0x005e, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac A[Catch: all -> 0x0065, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:12:0x005e, B:18:0x0068, B:20:0x009a, B:21:0x00a9, B:24:0x00ac), top: B:61:0x005e, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x012c A[Catch: all -> 0x013e, TryCatch #2 {, blocks: (B:42:0x0124, B:44:0x012c, B:45:0x013b, B:50:0x0140, B:51:0x014a), top: B:62:0x0124, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140 A[Catch: all -> 0x013e, TRY_ENTER, TryCatch #2 {, blocks: (B:42:0x0124, B:44:0x012c, B:45:0x013b, B:50:0x0140, B:51:0x014a), top: B:62:0x0124, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    private synchronized void m133529l() {
        try {
            m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "fetchGoogleAdID() called!");
            if (m133541K() == null && !this.f110059b) {
                boolean z = true;
                String str = null;
                try {
                    this.f110059b = true;
                    Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.f110062e);
                    Boolean bool = (Boolean) objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
                    synchronized (this.f110058a) {
                        if (bool != null) {
                            try {
                                if (!bool.booleanValue()) {
                                    z = false;
                                }
                                this.f110067j = z;
                                m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "limitAdTracking = " + this.f110067j);
                                if (this.f110067j) {
                                    m133535y().debug(this.f110061d.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                    return;
                                }
                                str = (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
                                if (str != null && str.trim().length() > 2) {
                                    synchronized (this.f110058a) {
                                        if (str.contains("00000000")) {
                                            m133535y().debug(this.f110061d.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                            return;
                                        }
                                        this.f110065h = str.replace("-", "");
                                    }
                                }
                                m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "fetchGoogleAdID() done executing!");
                            } catch (Throwable th) {
                                throw th;
                            }
                        } else {
                            z = false;
                            this.f110067j = z;
                            m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "limitAdTracking = " + this.f110067j);
                            if (this.f110067j) {
                                m133535y().debug(this.f110061d.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                return;
                            }
                            str = (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
                            if (str != null) {
                                synchronized (this.f110058a) {
                                    if (str.contains("00000000")) {
                                        m133535y().debug(this.f110061d.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                        return;
                                    }
                                    this.f110065h = str.replace("-", "");
                                }
                            }
                            m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "fetchGoogleAdID() done executing!");
                        }
                    }
                } catch (Throwable th2) {
                    if (th2.getCause() != null) {
                        m133535y().verbose(this.f110061d.getAccountId(), "Failed to get Advertising ID: " + th2 + th2.getCause().toString());
                    } else {
                        m133535y().verbose(this.f110061d.getAccountId(), "Failed to get Advertising ID: " + th2);
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m133530n0(String str) {
        m133535y().verbose(this.f110061d.getAccountId(), "Updating the fallback id - " + str);
        mxf0.m156896v(this.f110062e, m133512J(), str);
    }

    /* JADX INFO: renamed from: p */
    private synchronized String m133531p() {
        String strM133533r;
        String strConcat;
        try {
            m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "generateDeviceID() called!");
            String strM133541K = m133541K();
            if (strM133541K != null) {
                strConcat = Constants.GUID_PREFIX_GOOGLE_AD_ID.concat(strM133541K);
            } else {
                synchronized (this.f110063f) {
                    strM133533r = m133533r();
                }
                strConcat = strM133533r;
            }
            m133567o(strConcat);
            m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "generateDeviceID() done executing!");
        } catch (Throwable th) {
            throw th;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: q */
    private synchronized String m133532q() {
        String str;
        String strM133511I = m133511I();
        if (strM133511I != null) {
            return strM133511I;
        }
        synchronized (this.f110063f) {
            str = Constants.ERROR_PROFILE_PREFIX + UUID.randomUUID().toString().replace("-", "");
            m133530n0(str);
        }
        return str;
    }

    /* JADX INFO: renamed from: r */
    private String m133533r() {
        return "__" + UUID.randomUUID().toString().replace("-", "");
    }

    /* JADX INFO: renamed from: t */
    public static int m133534t(Context context) {
        return context.getApplicationInfo().icon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public Logger m133535y() {
        return this.f110061d.getLogger();
    }

    /* JADX INFO: renamed from: A */
    public String m133536A() {
        return m133508D().f110078d;
    }

    /* JADX INFO: renamed from: B */
    public String m133537B() {
        return this.f110070m;
    }

    /* JADX INFO: renamed from: C */
    public int m133538C() {
        return m133508D().f110079e;
    }

    /* JADX INFO: renamed from: E */
    public String m133539E() {
        String strM133516b = m133516b();
        return strM133516b != null ? strM133516b : m133511I();
    }

    /* JADX INFO: renamed from: G */
    public String m133540G() {
        return m133508D().f110090p;
    }

    /* JADX INFO: renamed from: K */
    public String m133541K() {
        String str;
        synchronized (this.f110058a) {
            str = this.f110065h;
        }
        return str;
    }

    /* JADX INFO: renamed from: L */
    public double m133542L() {
        return m133508D().f110080f;
    }

    /* JADX INFO: renamed from: M */
    public String m133543M() {
        return this.f110066i;
    }

    /* JADX INFO: renamed from: N */
    public int m133544N() {
        return m133508D().f110089o;
    }

    /* JADX INFO: renamed from: P */
    public String m133545P() {
        return TextUtils.isEmpty(m133537B()) ? m133540G() : m133537B();
    }

    /* JADX INFO: renamed from: Q */
    public String m133546Q() {
        return m133508D().f110081g;
    }

    /* JADX INFO: renamed from: R */
    public String m133547R() {
        return m133508D().f110082h;
    }

    /* JADX INFO: renamed from: S */
    public String m133548S() {
        NetworkMonitor networkMonitor = this.f110071n;
        if (networkMonitor == null) {
            return null;
        }
        return networkMonitor.m6802k();
    }

    /* JADX INFO: renamed from: T */
    public String m133549T() {
        return m133508D().f110083i;
    }

    /* JADX INFO: renamed from: U */
    public String m133550U() {
        return m133508D().f110084j;
    }

    /* JADX INFO: renamed from: V */
    public int m133551V() {
        return m133508D().f110085k;
    }

    /* JADX INFO: renamed from: W */
    public ArrayList<mrk0> m133552W() {
        ArrayList<mrk0> arrayList = (ArrayList) this.f110069l.clone();
        this.f110069l.clear();
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public String m133553X() {
        return m133508D().f110086l;
    }

    /* JADX INFO: renamed from: Y */
    public double m133554Y() {
        return m133508D().f110087m;
    }

    /* JADX INFO: renamed from: a0 */
    public void m133555a0() {
        C17434c.m133589i(m133508D());
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c0 */
    public Boolean m133556c0() {
        BluetoothAdapter defaultAdapter;
        try {
            if (this.f110062e.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.f110062e.getPackageName()) != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return null;
            }
            return Boolean.valueOf(defaultAdapter.isEnabled());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m133557d0() {
        String strM133539E = m133539E();
        return strM133539E != null && strM133539E.startsWith(Constants.ERROR_PROFILE_PREFIX);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m133558e0() {
        boolean z;
        synchronized (this.f110058a) {
            z = this.f110067j;
        }
        return z;
    }

    /* JADX INFO: renamed from: f0 */
    public Boolean m133559f0() {
        NetworkMonitor networkMonitor;
        if (this.f110062e.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (networkMonitor = this.f110071n) == null || networkMonitor.m6801i() == NetworkMonitor.NetworkType.UNDETECTED) {
            return null;
        }
        return Boolean.valueOf(this.f110071n.m6804o());
    }

    /* JADX INFO: renamed from: g0 */
    public void m133560g0(String str) {
        m133535y().verbose(this.f110061d.getAccountId() + ":async_deviceID", "DeviceInfo() called");
        st3.m185849c(this.f110061d).m190589a().m6946g("getDeviceCachedInfo", new CallableC17432a());
        Task taskM190589a = st3.m185849c(this.f110061d).m190589a();
        taskM190589a.m6945f(new pg50() { // from class: l.gyd
            @Override // p149l.pg50
            public final void onSuccess(Object obj) {
                hyd.m133515a(this.f105006a, (String) obj);
            }
        });
        taskM190589a.m6946g("initDeviceID", new CallableC17433b(str));
    }

    /* JADX INFO: renamed from: k */
    public void m133561k(boolean z) {
        this.f110064g = z;
        mxf0.m156893n(this.f110062e, this.f110061d.getAccountId(), Constants.NETWORK_INFO, this.f110064g);
        this.f110061d.getLogger().verbose(this.f110061d.getAccountId(), "Device Network Information reporting set to " + this.f110064g);
    }

    /* JADX INFO: renamed from: k0 */
    public void m133562k0() {
        String strM133524h0 = m133524h0();
        if (strM133524h0 == null) {
            this.f110061d.getLogger().verbose(this.f110061d.getAccountId(), "Unable to set current user OptOut state from storage: storage key is null");
            return;
        }
        boolean zM156884b = mxf0.m156884b(this.f110062e, this.f110061d.getAccountId(), strM133524h0);
        this.f110068k.m176190T(zM156884b);
        this.f110061d.getLogger().verbose(this.f110061d.getAccountId(), "Set current user OptOut state from storage to: " + zM156884b + " for key: " + strM133524h0);
    }

    /* JADX INFO: renamed from: l0 */
    public void m133563l0() {
        boolean zM156884b = mxf0.m156884b(this.f110062e, this.f110061d.getAccountId(), Constants.NETWORK_INFO);
        this.f110061d.getLogger().verbose(this.f110061d.getAccountId(), "Setting device network info reporting state from storage to " + zM156884b);
        this.f110064g = zM156884b;
    }

    /* JADX INFO: renamed from: m */
    public void m133564m() {
        m133567o(m133533r());
    }

    /* JADX INFO: renamed from: m0 */
    public void m133565m0() {
        String strM133527j = m133527j();
        if (strM133527j == null) {
            this.f110061d.getLogger().verbose(this.f110061d.getAccountId(), "Unable to set current user allowed system events and communications flag from storage: storage key is null");
            return;
        }
        boolean zM156884b = mxf0.m156884b(this.f110062e, this.f110061d.getAccountId(), strM133527j);
        this.f110068k.m176192V(zM156884b);
        this.f110061d.getLogger().verbose(this.f110061d.getAccountId(), "Set current user allowed system events and communications flag state from storage to: " + zM156884b + " for key: " + strM133527j);
    }

    /* JADX INFO: renamed from: n */
    public String m133566n(String str) {
        if (!Utils.m5903C(str)) {
            String strM133532q = m133532q();
            m133528j0();
            m133535y().info(this.f110061d.getAccountId(), m133526i0(ValidationError.INVALID_CT_CUSTOM_ID, str, m133511I()));
            return strM133532q;
        }
        m133535y().info(this.f110061d.getAccountId(), "Setting CleverTap ID to custom CleverTap ID : " + str);
        String str2 = Constants.CUSTOM_CLEVERTAP_ID_PREFIX + str;
        m133567o(str2);
        return str2;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: o */
    public void m133567o(String str) {
        m133535y().verbose(this.f110061d.getAccountId(), "Force updating the device ID to " + str);
        synchronized (this.f110063f) {
            mxf0.m156896v(this.f110062e, m133509F(), str);
        }
    }

    /* JADX INFO: renamed from: s */
    public String m133568s() {
        return m133508D().f110088n;
    }

    /* JADX INFO: renamed from: u */
    public JSONObject m133569u() {
        try {
            return mv3.m156463b(this, this.f110068k, this.f110064g, m133541K() != null ? new wyv(this.f110062e, this.f110061d).m206219b() : false);
        } catch (Throwable th) {
            this.f110061d.getLogger().verbose(this.f110061d.getAccountId(), "Failed to construct App Launched event", th);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: v */
    public String m133570v() {
        return m133508D().f110075a;
    }

    /* JADX INFO: renamed from: w */
    public int m133571w() {
        return m133508D().f110076b;
    }

    /* JADX INFO: renamed from: x */
    public String m133572x() {
        return m133508D().f110077c;
    }

    /* JADX INFO: renamed from: z */
    public Context m133573z() {
        return this.f110062e;
    }
}
