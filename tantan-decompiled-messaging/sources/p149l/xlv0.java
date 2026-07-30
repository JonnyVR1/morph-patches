package p149l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class xlv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f193504a;

    /* JADX INFO: renamed from: b */
    public final Context f193505b;

    public xlv0(rmw0 rmw0Var, Context context) {
        this.f193504a = rmw0Var;
        this.f193505b = context;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ResolveInfo m209972b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x0180  */
    /* JADX WARN: Code duplicated, block: B:55:0x0182  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:58:0x0187  */
    /* JADX WARN: Code duplicated, block: B:8:0x0061  */
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vlv0 m209973a() throws Exception {
        ActivityInfo activityInfo;
        String str;
        String str2;
        String str3;
        boolean z;
        String string;
        String str4;
        boolean z2;
        boolean z3;
        PackageManager packageManager = this.f193505b.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoM209972b = m209972b(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoM209972b2 = m209972b(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        vny0.m199080r();
        exr0.m118703b();
        boolean zM134090t = i2t0.m134090t();
        Context context = this.f193505b;
        boolean zIsLatchsky = DeviceProperties.isLatchsky(context);
        boolean zIsSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).getLanguage());
        }
        Context context2 = this.f193505b;
        ResolveInfo resolveInfoM209972b3 = m209972b(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoM209972b3 == null || (activityInfo = resolveInfoM209972b3.activityInfo) == null) {
            str = null;
        } else {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context2).getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo != null) {
                    str = packageInfo.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(this.f193505b).getPackageInfo("com.android.vending", 128);
            str2 = packageInfo2 != null ? packageInfo2.versionCode + "." + packageInfo2.packageName : null;
        } catch (Exception unused2) {
        }
        Context context3 = this.f193505b;
        boolean zEquals = false;
        String str5 = Build.FINGERPRINT;
        if (packageManager != null) {
            str3 = str2;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
                zEquals = false;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= listQueryIntentActivities.size()) {
                    zEquals = false;
                    break;
                }
                List<ResolveInfo> list = listQueryIntentActivities;
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                    zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(fhx0.m121470a(context3));
                    break;
                }
                i2++;
                listQueryIntentActivities = list;
            }
        } else {
            str3 = str2;
        }
        vny0.m199080r();
        long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131999Ma)).booleanValue()) {
            vny0.m199080r();
            if (C2075b.m12306a(this.f193505b)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132023Oa)).booleanValue()) {
            Context context4 = this.f193505b;
            try {
                Bundle bundle = Wrappers.packageManager(context4).getApplicationInfo(context4.getPackageName(), 128).metaData;
                if (bundle == null || !bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                    str4 = null;
                } else {
                    string = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                }
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (resolveInfoM209972b2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (resolveInfoM209972b != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new vlv0(z3, z2, country, zM134090t, zIsLatchsky, zIsSidewinder, language, arrayList, str, str3, str5, zEquals, Build.MODEL, availableBytes, z, str4, Build.VERSION.SDK_INT);
        }
        string = "";
        str4 = string;
        if (resolveInfoM209972b2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (resolveInfoM209972b != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new vlv0(z3, z2, country, zM134090t, zIsLatchsky, zIsSidewinder, language, arrayList, str, str3, str5, zEquals, Build.MODEL, availableBytes, z, str4, Build.VERSION.SDK_INT);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 38;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f193504a.mo122102R(new Callable() { // from class: l.wlv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f187015a.m209973a();
            }
        });
    }
}
