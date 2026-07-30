package p149l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class zjy0 {

    /* JADX INFO: renamed from: a */
    public final Context f203486a;

    /* JADX INFO: renamed from: b */
    public final String f203487b;

    /* JADX INFO: renamed from: c */
    public final Map f203488c = new TreeMap();

    /* JADX INFO: renamed from: d */
    public String f203489d;

    /* JADX INFO: renamed from: e */
    public String f203490e;

    /* JADX INFO: renamed from: f */
    public final String f203491f;

    public zjy0(Context context, String str) {
        String strConcat;
        this.f203486a = context.getApplicationContext();
        this.f203487b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            x2t0.m206867e("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f203491f = strConcat;
    }

    /* JADX INFO: renamed from: a */
    public final String m219153a() {
        return this.f203491f;
    }

    /* JADX INFO: renamed from: b */
    public final String m219154b() {
        return this.f203490e;
    }

    /* JADX INFO: renamed from: c */
    public final String m219155c() {
        return this.f203487b;
    }

    /* JADX INFO: renamed from: d */
    public final String m219156d() {
        return this.f203489d;
    }

    /* JADX INFO: renamed from: e */
    public final Map m219157e() {
        return this.f203488c;
    }

    /* JADX INFO: renamed from: f */
    public final void m219158f(zzl zzlVar, zzcei zzceiVar) {
        this.f203489d = zzlVar.zzj.zza;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) g9s0.f101587c.m115379e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f203490e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f203488c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f203488c.put("SDKVersion", zzceiVar.zza);
        if (((Boolean) g9s0.f101585a.m115379e()).booleanValue()) {
            Bundle bundleM182372b = s5r0.m182372b(this.f203486a, (String) g9s0.f101586b.m115379e());
            for (String str3 : bundleM182372b.keySet()) {
                this.f203488c.put(str3, bundleM182372b.get(str3).toString());
            }
        }
    }
}
