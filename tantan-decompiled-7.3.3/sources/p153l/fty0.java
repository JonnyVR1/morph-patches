package p153l;

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
public final class fty0 {

    /* JADX INFO: renamed from: a */
    public final Context f100816a;

    /* JADX INFO: renamed from: b */
    public final String f100817b;

    /* JADX INFO: renamed from: c */
    public final Map f100818c = new TreeMap();

    /* JADX INFO: renamed from: d */
    public String f100819d;

    /* JADX INFO: renamed from: e */
    public String f100820e;

    /* JADX INFO: renamed from: f */
    public final String f100821f;

    public fty0(Context context, String str) {
        String strConcat;
        this.f100816a = context.getApplicationContext();
        this.f100817b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            dct0.m115296e("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f100821f = strConcat;
    }

    /* JADX INFO: renamed from: a */
    public final String m127401a() {
        return this.f100821f;
    }

    /* JADX INFO: renamed from: b */
    public final String m127402b() {
        return this.f100820e;
    }

    /* JADX INFO: renamed from: c */
    public final String m127403c() {
        return this.f100817b;
    }

    /* JADX INFO: renamed from: d */
    public final String m127404d() {
        return this.f100819d;
    }

    /* JADX INFO: renamed from: e */
    public final Map m127405e() {
        return this.f100818c;
    }

    /* JADX INFO: renamed from: f */
    public final void m127406f(zzl zzlVar, zzcei zzceiVar) {
        this.f100819d = zzlVar.zzj.zza;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) mis0.f137016c.m149974e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f100820e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f100818c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f100818c.put("SDKVersion", zzceiVar.zza);
        if (((Boolean) mis0.f137014a.m149974e()).booleanValue()) {
            Bundle bundleM215443b = yer0.m215443b(this.f100816a, (String) mis0.f137015b.m149974e());
            for (String str3 : bundleM215443b.keySet()) {
                this.f100818c.put(str3, bundleM215443b.get(str3).toString());
            }
        }
    }
}
