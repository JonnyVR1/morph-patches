package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzcei;
import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class vsu0 {

    /* JADX INFO: renamed from: a */
    public Context f182888a;

    /* JADX INFO: renamed from: b */
    public long f182889b = 0;

    /* JADX INFO: renamed from: a */
    public final void m199909a(Context context, zzcei zzceiVar, String str, @Nullable Runnable runnable, b5w0 b5w0Var) {
        m199910b(context, zzceiVar, true, null, str, null, runnable, b5w0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final void m199910b(Context context, zzcei zzceiVar, boolean z, @Nullable s1t0 s1t0Var, String str, @Nullable String str2, @Nullable Runnable runnable, final b5w0 b5w0Var) {
        PackageInfo packageInfo;
        if (vny0.m199064b().elapsedRealtime() - this.f182889b < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            x2t0.m206869g("Not retrying to fetch app settings");
            return;
        }
        this.f182889b = vny0.m199064b().elapsedRealtime();
        if (s1t0Var != null && !TextUtils.isEmpty(s1t0Var.m182044c())) {
            if (vny0.m199064b().currentTimeMillis() - s1t0Var.m182042a() <= ((Long) d1s0.m109677c().m144697a(m7s0.f132136Y3)).longValue() && s1t0Var.m182050i()) {
                return;
            }
        }
        if (context == null) {
            x2t0.m206869g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            x2t0.m206869g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f182888a = applicationContext;
        final l4w0 l4w0VarM144514a = k4w0.m144514a(context, 4);
        l4w0VarM144514a.zzh();
        ims0 ims0VarM219291a = vny0.m199070h().m219291a(this.f182888a, zzceiVar, b5w0Var);
        cms0 cms0Var = fms0.f98370b;
        yls0 yls0VarM137088a = ims0VarM219291a.m137088a("google.afma.config.fetchAppSettings", cms0Var, cms0Var);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            x6s0 x6s0Var = m7s0.f132156a;
            jSONObject.put("experiment_ids", TextUtils.join(Constants.SEPARATOR_COMMA, d1s0.m109675a().m213241a()));
            jSONObject.put("js", zzceiVar.zza);
            try {
                ApplicationInfo applicationInfo = this.f182888a.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                xsu0.m210834k("Error fetching PackageInfo.");
            }
            gnr gnrVarZzb = yls0VarM137088a.zzb(jSONObject);
            rlw0 rlw0Var = new rlw0() { // from class: l.qvt0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) throws JSONException {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        vny0.m199079q().m212279i().mo96961t(jSONObject2.getString("appSettingsJson"));
                    }
                    l4w0 l4w0Var = l4w0VarM144514a;
                    b5w0 b5w0Var2 = b5w0Var;
                    l4w0Var.mo129461S(zOptBoolean);
                    b5w0Var2.m100344b(l4w0Var.zzl());
                    return jmw0.m142235h(null);
                }
            };
            rmw0 rmw0Var = i3t0.f111377f;
            gnr gnrVarM142241n = jmw0.m142241n(gnrVarZzb, rlw0Var, rmw0Var);
            if (runnable != null) {
                gnrVarZzb.addListener(runnable, rmw0Var);
            }
            l3t0.m148407a(gnrVarM142241n, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            x2t0.m206867e("Error requesting application settings", e);
            l4w0VarM144514a.mo129463b(e);
            l4w0VarM144514a.mo129461S(false);
            b5w0Var.m100344b(l4w0VarM144514a.zzl());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m199911c(Context context, zzcei zzceiVar, String str, s1t0 s1t0Var, b5w0 b5w0Var) {
        m199910b(context, zzceiVar, false, s1t0Var, s1t0Var != null ? s1t0Var.m182043b() : null, str, null, b5w0Var);
    }
}
