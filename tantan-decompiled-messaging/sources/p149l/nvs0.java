package p149l;

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
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class nvs0 {

    /* JADX INFO: renamed from: A */
    public int f140815A;

    /* JADX INFO: renamed from: B */
    public final String f140816B;

    /* JADX INFO: renamed from: C */
    public boolean f140817C;

    /* JADX INFO: renamed from: a */
    public int f140818a;

    /* JADX INFO: renamed from: b */
    public boolean f140819b;

    /* JADX INFO: renamed from: c */
    public boolean f140820c;

    /* JADX INFO: renamed from: d */
    public int f140821d;

    /* JADX INFO: renamed from: e */
    public int f140822e;

    /* JADX INFO: renamed from: f */
    public int f140823f;

    /* JADX INFO: renamed from: g */
    public String f140824g;

    /* JADX INFO: renamed from: h */
    public int f140825h;

    /* JADX INFO: renamed from: i */
    public int f140826i;

    /* JADX INFO: renamed from: j */
    public int f140827j;

    /* JADX INFO: renamed from: k */
    public boolean f140828k;

    /* JADX INFO: renamed from: l */
    public int f140829l;

    /* JADX INFO: renamed from: m */
    public double f140830m;

    /* JADX INFO: renamed from: n */
    public boolean f140831n;

    /* JADX INFO: renamed from: o */
    public String f140832o;

    /* JADX INFO: renamed from: p */
    public String f140833p;

    /* JADX INFO: renamed from: q */
    public final boolean f140834q;

    /* JADX INFO: renamed from: r */
    public final boolean f140835r;

    /* JADX INFO: renamed from: s */
    public final String f140836s;

    /* JADX INFO: renamed from: t */
    public final boolean f140837t;

    /* JADX INFO: renamed from: u */
    public final boolean f140838u;

    /* JADX INFO: renamed from: v */
    public final boolean f140839v;

    /* JADX INFO: renamed from: w */
    public final String f140840w;

    /* JADX INFO: renamed from: x */
    public final String f140841x;

    /* JADX INFO: renamed from: y */
    public float f140842y;

    /* JADX INFO: renamed from: z */
    public int f140843z;

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    public nvs0(Context context) {
        ActivityInfo activityInfo;
        String str;
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        m7s0.m153417a(context);
        m161760c(context);
        m161762e(context);
        m161761d(context);
        Locale locale = Locale.getDefault();
        this.f140834q = m161758b(packageManager, "geo:0,0?q=donuts") != null;
        this.f140835r = m161758b(packageManager, "http://www.google.com") != null;
        this.f140836s = locale.getCountry();
        vny0.m199080r();
        exr0.m118703b();
        this.f140837t = i2t0.m134090t();
        this.f140838u = DeviceProperties.isLatchsky(context);
        this.f140839v = DeviceProperties.isSidewinder(context);
        this.f140840w = locale.getLanguage();
        ResolveInfo resolveInfoM161758b = m161758b(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (resolveInfoM161758b == null || (activityInfo = resolveInfoM161758b.activityInfo) == null) {
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
        this.f140841x = str;
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
            if (packageInfo2 != null) {
                str2 = packageInfo2.versionCode + "." + packageInfo2.packageName;
            }
        } catch (Exception unused2) {
        }
        this.f140816B = str2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f140842y = displayMetrics.density;
        this.f140843z = displayMetrics.widthPixels;
        this.f140815A = displayMetrics.heightPixels;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ResolveInfo m161758b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            vny0.m199079q().m212290w(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final ovs0 m161759a() {
        return new ovs0(this.f140818a, this.f140834q, this.f140835r, this.f140824g, this.f140836s, this.f140837t, this.f140838u, this.f140839v, this.f140819b, this.f140820c, this.f140840w, this.f140841x, this.f140816B, this.f140821d, this.f140825h, this.f140826i, this.f140827j, this.f140822e, this.f140823f, this.f140842y, this.f140843z, this.f140815A, this.f140830m, this.f140831n, this.f140828k, this.f140829l, this.f140832o, this.f140817C, this.f140833p);
    }

    /* JADX INFO: renamed from: c */
    public final void m161760c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f140818a = audioManager.getMode();
                this.f140819b = audioManager.isMusicActive();
                this.f140820c = audioManager.isSpeakerphoneOn();
                this.f140821d = audioManager.getStreamVolume(3);
                this.f140822e = audioManager.getRingerMode();
                this.f140823f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                vny0.m199079q().m212290w(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f140818a = -2;
        this.f140819b = false;
        this.f140820c = false;
        this.f140821d = 0;
        this.f140822e = 2;
        this.f140823f = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: d */
    public final void m161761d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentM136342l = (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132449wa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? ii5.m136342l(context, null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentM136342l == null) {
            this.f140830m = -1.0d;
            this.f140831n = false;
        } else {
            int intExtra = intentM136342l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.f140830m = intentM136342l.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / intentM136342l.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1);
            this.f140831n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    /* JADX INFO: renamed from: e */
    public final void m161762e(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f140824g = telephonyManager.getNetworkOperator();
        if (PlatformVersion.isAtLeastR()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132423u8)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.f140826i = networkType;
        this.f140827j = telephonyManager.getPhoneType();
        this.f140825h = -2;
        this.f140828k = false;
        this.f140829l = -1;
        vny0.m199080r();
        if (C2075b.m12309b0(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f140825h = activeNetworkInfo.getType();
                this.f140829l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f140825h = -1;
            }
            this.f140828k = connectivityManager.isActiveNetworkMetered();
        }
    }

    public nvs0(Context context, ovs0 ovs0Var) {
        m7s0.m153417a(context);
        m161760c(context);
        m161762e(context);
        m161761d(context);
        this.f140832o = Build.FINGERPRINT;
        this.f140833p = Build.DEVICE;
        this.f140817C = v8s0.m197514g(context);
        this.f140834q = ovs0Var.f145831a;
        this.f140835r = ovs0Var.f145832b;
        this.f140836s = ovs0Var.f145834d;
        this.f140837t = ovs0Var.f145835e;
        this.f140838u = ovs0Var.f145836f;
        this.f140839v = ovs0Var.f145837g;
        this.f140840w = ovs0Var.f145838h;
        this.f140841x = ovs0Var.f145839i;
        this.f140816B = ovs0Var.f145840j;
        this.f140842y = ovs0Var.f145843m;
        this.f140843z = ovs0Var.f145844n;
        this.f140815A = ovs0Var.f145845o;
    }
}
