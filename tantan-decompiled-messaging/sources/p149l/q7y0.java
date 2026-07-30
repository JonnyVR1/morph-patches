package p149l;

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
import com.p046p1.mobile.putong.data.OMSData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class q7y0 {

    /* JADX INFO: renamed from: a */
    public final wzx0 f153097a;

    /* JADX INFO: renamed from: b */
    public final Activity f153098b;

    /* JADX INFO: renamed from: c */
    public final pw5 f153099c;

    /* JADX INFO: renamed from: d */
    public final rw5 f153100d;

    public /* synthetic */ q7y0(wzx0 wzx0Var, Activity activity, pw5 pw5Var, rw5 rw5Var, g4y0 g4y0Var) {
        this.f153097a = wzx0Var;
        this.f153098b = activity;
        this.f153099c = pw5Var;
        this.f153100d = rw5Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ w3t0 m173316a(q7y0 q7y0Var) throws zzg {
        Bundle bundle;
        List arrayList;
        List list;
        PackageInfo packageInfo;
        w3t0 w3t0Var = new w3t0();
        String strM181377c = q7y0Var.f153100d.m181377c();
        if (TextUtils.isEmpty(strM181377c)) {
            try {
                bundle = q7y0Var.f153097a.f188771a.getPackageManager().getApplicationInfo(q7y0Var.f153097a.f188771a.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strM181377c = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strM181377c)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        w3t0Var.f184435a = strM181377c;
        if (q7y0Var.f153099c.m171705b()) {
            arrayList = new ArrayList();
            int iM171704a = q7y0Var.f153099c.m171704a();
            if (iM171704a == 1) {
                arrayList.add(zzca.GEO_OVERRIDE_EEA);
            } else if (iM171704a == 2) {
                arrayList.add(zzca.GEO_OVERRIDE_NON_EEA);
            } else if (iM171704a == 3) {
                arrayList.add(zzca.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (iM171704a == 4) {
                arrayList.add(zzca.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzca.PREVIEWING_DEBUG_MESSAGES);
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        w3t0Var.f184443i = arrayList;
        w3t0Var.f184439e = q7y0Var.f153097a.f188772b.m159447b();
        w3t0Var.f184438d = Boolean.valueOf(q7y0Var.f153100d.m181376b());
        w3t0Var.f184437c = Locale.getDefault().toLanguageTag();
        vys0 vys0Var = new vys0();
        int i = Build.VERSION.SDK_INT;
        vys0Var.f183550b = Integer.valueOf(i);
        vys0Var.f183549a = Build.MODEL;
        vys0Var.f183551c = 2;
        w3t0Var.f184436b = vys0Var;
        Configuration configuration = q7y0Var.f153097a.f188771a.getResources().getConfiguration();
        q7y0Var.f153097a.f188771a.getResources().getConfiguration();
        h1t0 h1t0Var = new h1t0();
        h1t0Var.f105460a = Integer.valueOf(configuration.screenWidthDp);
        h1t0Var.f105461b = Integer.valueOf(configuration.screenHeightDp);
        h1t0Var.f105462c = Double.valueOf(q7y0Var.f153097a.f188771a.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list = Collections.EMPTY_LIST;
        } else {
            Activity activity = q7y0Var.f153098b;
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
                        zzs0 zzs0Var = new zzs0();
                        zzs0Var.f205823b = Integer.valueOf(rect.left);
                        zzs0Var.f205824c = Integer.valueOf(rect.right);
                        zzs0Var.f205822a = Integer.valueOf(rect.top);
                        zzs0Var.f205825d = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzs0Var);
                    }
                }
                list = arrayList2;
            }
        }
        h1t0Var.f105463d = list;
        w3t0Var.f184440f = h1t0Var;
        wzx0 wzx0Var = q7y0Var.f153097a;
        Application application = wzx0Var.f188771a;
        try {
            packageInfo = wzx0Var.f188771a.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zus0 zus0Var = new zus0();
        zus0Var.f204886a = application.getPackageName();
        CharSequence applicationLabel = q7y0Var.f153097a.f188771a.getPackageManager().getApplicationLabel(q7y0Var.f153097a.f188771a.getApplicationInfo());
        zus0Var.f204887b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zus0Var.f204888c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        w3t0Var.f184441g = zus0Var;
        p2t0 p2t0Var = new p2t0();
        p2t0Var.f146929a = OMSData.OMS_CONFIG_VERSION;
        w3t0Var.f184442h = p2t0Var;
        return w3t0Var;
    }
}
