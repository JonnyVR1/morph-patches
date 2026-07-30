package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.internal.consent_sdk.zzca;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.p051p1.mobile.putong.data.OMSData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class wgy0 {

    /* JADX INFO: renamed from: a */
    public final c9y0 f189073a;

    /* JADX INFO: renamed from: b */
    public final Activity f189074b;

    /* JADX INFO: renamed from: c */
    public final ux5 f189075c;

    /* JADX INFO: renamed from: d */
    public final wx5 f189076d;

    public /* synthetic */ wgy0(c9y0 c9y0Var, Activity activity, ux5 ux5Var, wx5 wx5Var, mdy0 mdy0Var) {
        this.f189073a = c9y0Var;
        this.f189074b = activity;
        this.f189075c = ux5Var;
        this.f189076d = wx5Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ cdt0 m206330a(wgy0 wgy0Var) throws zzg {
        Bundle bundle;
        List arrayList;
        List list;
        PackageInfo packageInfo;
        cdt0 cdt0Var = new cdt0();
        String strM208368c = wgy0Var.f189076d.m208368c();
        if (TextUtils.isEmpty(strM208368c)) {
            try {
                bundle = wgy0Var.f189073a.f80535a.getPackageManager().getApplicationInfo(wgy0Var.f189073a.f80535a.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strM208368c = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strM208368c)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        cdt0Var.f81264a = strM208368c;
        if (wgy0Var.f189075c.m198399b()) {
            arrayList = new ArrayList();
            int iM198398a = wgy0Var.f189075c.m198398a();
            if (iM198398a == 1) {
                arrayList.add(zzca.GEO_OVERRIDE_EEA);
            } else if (iM198398a == 2) {
                arrayList.add(zzca.GEO_OVERRIDE_NON_EEA);
            } else if (iM198398a == 3) {
                arrayList.add(zzca.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (iM198398a == 4) {
                arrayList.add(zzca.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzca.PREVIEWING_DEBUG_MESSAGES);
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        cdt0Var.f81272i = arrayList;
        cdt0Var.f81268e = wgy0Var.f189073a.f80536b.m192352b();
        cdt0Var.f81267d = Boolean.valueOf(wgy0Var.f189076d.m208367b());
        cdt0Var.f81266c = Locale.getDefault().toLanguageTag();
        b8t0 b8t0Var = new b8t0();
        int i = Build.VERSION.SDK_INT;
        b8t0Var.f75477b = Integer.valueOf(i);
        b8t0Var.f75476a = Build.MODEL;
        b8t0Var.f75478c = 2;
        cdt0Var.f81265b = b8t0Var;
        Configuration configuration = wgy0Var.f189073a.f80535a.getResources().getConfiguration();
        wgy0Var.f189073a.f80535a.getResources().getConfiguration();
        nat0 nat0Var = new nat0();
        nat0Var.f141043a = Integer.valueOf(configuration.screenWidthDp);
        nat0Var.f141044b = Integer.valueOf(configuration.screenHeightDp);
        nat0Var.f141045c = Double.valueOf(wgy0Var.f189073a.f80535a.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list = Collections.EMPTY_LIST;
        } else {
            Activity activity = wgy0Var.f189074b;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list = Collections.EMPTY_LIST;
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        f9t0 f9t0Var = new f9t0();
                        f9t0Var.f97910b = Integer.valueOf(rect.left);
                        f9t0Var.f97911c = Integer.valueOf(rect.right);
                        f9t0Var.f97909a = Integer.valueOf(rect.top);
                        f9t0Var.f97912d = Integer.valueOf(rect.bottom);
                        arrayList2.add(f9t0Var);
                    }
                }
                list = arrayList2;
            }
        }
        nat0Var.f141046d = list;
        cdt0Var.f81269f = nat0Var;
        c9y0 c9y0Var = wgy0Var.f189073a;
        Application application = c9y0Var.f80535a;
        try {
            packageInfo = c9y0Var.f80535a.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        f4t0 f4t0Var = new f4t0();
        f4t0Var.f97141a = application.getPackageName();
        CharSequence applicationLabel = wgy0Var.f189073a.f80535a.getPackageManager().getApplicationLabel(wgy0Var.f189073a.f80535a.getApplicationInfo());
        f4t0Var.f97142b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            f4t0Var.f97143c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        cdt0Var.f81270g = f4t0Var;
        vbt0 vbt0Var = new vbt0();
        vbt0Var.f183293a = OMSData.OMS_CONFIG_VERSION;
        cdt0Var.f81271h = vbt0Var;
        return cdt0Var;
    }
}
