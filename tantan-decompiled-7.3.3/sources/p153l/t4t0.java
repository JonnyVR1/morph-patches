package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class t4t0 {

    /* JADX INFO: renamed from: A */
    public int f172102A;

    /* JADX INFO: renamed from: B */
    public final String f172103B;

    /* JADX INFO: renamed from: C */
    public boolean f172104C;

    /* JADX INFO: renamed from: a */
    public int f172105a;

    /* JADX INFO: renamed from: b */
    public boolean f172106b;

    /* JADX INFO: renamed from: c */
    public boolean f172107c;

    /* JADX INFO: renamed from: d */
    public int f172108d;

    /* JADX INFO: renamed from: e */
    public int f172109e;

    /* JADX INFO: renamed from: f */
    public int f172110f;

    /* JADX INFO: renamed from: g */
    public String f172111g;

    /* JADX INFO: renamed from: h */
    public int f172112h;

    /* JADX INFO: renamed from: i */
    public int f172113i;

    /* JADX INFO: renamed from: j */
    public int f172114j;

    /* JADX INFO: renamed from: k */
    public boolean f172115k;

    /* JADX INFO: renamed from: l */
    public int f172116l;

    /* JADX INFO: renamed from: m */
    public double f172117m;

    /* JADX INFO: renamed from: n */
    public boolean f172118n;

    /* JADX INFO: renamed from: o */
    public String f172119o;

    /* JADX INFO: renamed from: p */
    public String f172120p;

    /* JADX INFO: renamed from: q */
    public final boolean f172121q;

    /* JADX INFO: renamed from: r */
    public final boolean f172122r;

    /* JADX INFO: renamed from: s */
    public final String f172123s;

    /* JADX INFO: renamed from: t */
    public final boolean f172124t;

    /* JADX INFO: renamed from: u */
    public final boolean f172125u;

    /* JADX INFO: renamed from: v */
    public final boolean f172126v;

    /* JADX INFO: renamed from: w */
    public final String f172127w;

    /* JADX INFO: renamed from: x */
    public final String f172128x;

    /* JADX INFO: renamed from: y */
    public float f172129y;

    /* JADX INFO: renamed from: z */
    public int f172130z;

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    public t4t0(Context context) {
        ActivityInfo activityInfo;
        String str;
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        sgs0.m185829a(context);
        m189309c(context);
        m189311e(context);
        m189310d(context);
        Locale locale = Locale.getDefault();
        this.f172121q = m189307b(packageManager, "geo:0,0?q=donuts") != null;
        this.f172122r = m189307b(packageManager, "http://www.google.com") != null;
        this.f172123s = locale.getCountry();
        bxy0.m106934r();
        k6s0.m148569b();
        this.f172124t = obt0.m167043t();
        this.f172125u = DeviceProperties.isLatchsky(context);
        this.f172126v = DeviceProperties.isSidewinder(context);
        this.f172127w = locale.getLanguage();
        ResolveInfo resolveInfoM189307b = m189307b(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (resolveInfoM189307b == null || (activityInfo = resolveInfoM189307b.activityInfo) == null) {
            str = null;
        } else {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo != null) {
                    str = packageInfo.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f172128x = str;
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
            if (packageInfo2 != null) {
                str2 = packageInfo2.versionCode + "." + packageInfo2.packageName;
            }
        } catch (Exception unused2) {
        }
        this.f172103B = str2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f172129y = displayMetrics.density;
        this.f172130z = displayMetrics.widthPixels;
        this.f172102A = displayMetrics.heightPixels;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ResolveInfo m189307b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            bxy0.m106933q().m120275w(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final u4t0 m189308a() {
        return new u4t0(this.f172105a, this.f172121q, this.f172122r, this.f172111g, this.f172123s, this.f172124t, this.f172125u, this.f172126v, this.f172106b, this.f172107c, this.f172127w, this.f172128x, this.f172103B, this.f172108d, this.f172112h, this.f172113i, this.f172114j, this.f172109e, this.f172110f, this.f172129y, this.f172130z, this.f172102A, this.f172117m, this.f172118n, this.f172115k, this.f172116l, this.f172119o, this.f172104C, this.f172120p);
    }

    /* JADX INFO: renamed from: c */
    public final void m189309c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f172105a = audioManager.getMode();
                this.f172106b = audioManager.isMusicActive();
                this.f172107c = audioManager.isSpeakerphoneOn();
                this.f172108d = audioManager.getStreamVolume(3);
                this.f172109e = audioManager.getRingerMode();
                this.f172110f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                bxy0.m106933q().m120275w(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f172105a = -2;
        this.f172106b = false;
        this.f172107c = false;
        this.f172108d = 0;
        this.f172109e = 2;
        this.f172110f = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: d */
    public final void m189310d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentM145018l = (!((Boolean) jas0.m144075c().m176505a(sgs0.f168520wa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? jj5.m145018l(context, null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentM145018l == null) {
            this.f172117m = -1.0d;
            this.f172118n = false;
        } else {
            int intExtra = intentM145018l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.f172117m = intentM145018l.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / intentM145018l.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1);
            this.f172118n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    /* JADX INFO: renamed from: e */
    public final void m189311e(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f172111g = telephonyManager.getNetworkOperator();
        if (PlatformVersion.isAtLeastR()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168494u8)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.f172113i = networkType;
        this.f172114j = telephonyManager.getPhoneType();
        this.f172112h = -2;
        this.f172115k = false;
        this.f172116l = -1;
        bxy0.m106934r();
        if (C2098b.m12363b0(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f172112h = activeNetworkInfo.getType();
                this.f172116l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f172112h = -1;
            }
            this.f172115k = connectivityManager.isActiveNetworkMetered();
        }
    }

    public t4t0(Context context, u4t0 u4t0Var) {
        sgs0.m185829a(context);
        m189309c(context);
        m189311e(context);
        m189310d(context);
        this.f172119o = Build.FINGERPRINT;
        this.f172120p = Build.DEVICE;
        this.f172104C = bis0.m104509g(context);
        this.f172121q = u4t0Var.f177487a;
        this.f172122r = u4t0Var.f177488b;
        this.f172123s = u4t0Var.f177490d;
        this.f172124t = u4t0Var.f177491e;
        this.f172125u = u4t0Var.f177492f;
        this.f172126v = u4t0Var.f177493g;
        this.f172127w = u4t0Var.f177494h;
        this.f172128x = u4t0Var.f177495i;
        this.f172103B = u4t0Var.f177496j;
        this.f172129y = u4t0Var.f177499m;
        this.f172130z = u4t0Var.f177500n;
        this.f172102A = u4t0Var.f177501o;
    }
}
