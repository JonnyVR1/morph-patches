package p153l;

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
public final class b2v0 {

    /* JADX INFO: renamed from: a */
    public Context f74673a;

    /* JADX INFO: renamed from: b */
    public long f74674b = 0;

    /* JADX INFO: renamed from: a */
    public final void m102251a(Context context, zzcei zzceiVar, String str, @Nullable Runnable runnable, hew0 hew0Var) {
        m102252b(context, zzceiVar, true, null, str, null, runnable, hew0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final void m102252b(Context context, zzcei zzceiVar, boolean z, @Nullable yat0 yat0Var, String str, @Nullable String str2, @Nullable Runnable runnable, final hew0 hew0Var) {
        PackageInfo packageInfo;
        if (bxy0.m106918b().elapsedRealtime() - this.f74674b < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            dct0.m115298g("Not retrying to fetch app settings");
            return;
        }
        this.f74674b = bxy0.m106918b().elapsedRealtime();
        if (yat0Var != null && !TextUtils.isEmpty(yat0Var.m214925c())) {
            if (bxy0.m106918b().currentTimeMillis() - yat0Var.m214923a() <= ((Long) jas0.m144075c().m176505a(sgs0.f168207Y3)).longValue() && yat0Var.m214931i()) {
                return;
            }
        }
        if (context == null) {
            dct0.m115298g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            dct0.m115298g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f74673a = applicationContext;
        final rdw0 rdw0VarM176209a = qdw0.m176209a(context, 4);
        rdw0VarM176209a.zzh();
        ovs0 ovs0VarM127699a = bxy0.m106924h().m127699a(this.f74673a, zzceiVar, hew0Var);
        ivs0 ivs0Var = lvs0.f133729b;
        evs0 evs0VarM169486a = ovs0VarM127699a.m169486a("google.afma.config.fetchAppSettings", ivs0Var, ivs0Var);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            dgs0 dgs0Var = sgs0.f168227a;
            jSONObject.put("experiment_ids", TextUtils.join(Constants.SEPARATOR_COMMA, jas0.m144073a().m120796a()));
            jSONObject.put("js", zzceiVar.zza);
            try {
                ApplicationInfo applicationInfo = this.f74673a.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                d2v0.m113737k("Error fetching PackageInfo.");
            }
            hpr hprVarZzb = evs0VarM169486a.zzb(jSONObject);
            xuw0 xuw0Var = new xuw0() { // from class: l.w4u0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) throws JSONException {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        bxy0.m106933q().m120264i().mo131910t(jSONObject2.getString("appSettingsJson"));
                    }
                    rdw0 rdw0Var = rdw0VarM176209a;
                    hew0 hew0Var2 = hew0Var;
                    rdw0Var.mo162910S(zOptBoolean);
                    hew0Var2.m134677b(rdw0Var.zzl());
                    return pvw0.m173981h(null);
                }
            };
            xvw0 xvw0Var = oct0.f146738f;
            hpr hprVarM173987n = pvw0.m173987n(hprVarZzb, xuw0Var, xvw0Var);
            if (runnable != null) {
                hprVarZzb.addListener(runnable, xvw0Var);
            }
            rct0.m180821a(hprVarM173987n, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            dct0.m115296e("Error requesting application settings", e);
            rdw0VarM176209a.mo162912b(e);
            rdw0VarM176209a.mo162910S(false);
            hew0Var.m134677b(rdw0VarM176209a.zzl());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m102253c(Context context, zzcei zzceiVar, String str, yat0 yat0Var, hew0 hew0Var) {
        m102252b(context, zzceiVar, false, yat0Var, yat0Var != null ? yat0Var.m214924b() : null, str, null, hew0Var);
    }
}
