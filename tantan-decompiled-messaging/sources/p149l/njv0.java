package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes6.dex */
public final class njv0 implements qlv0, plv0 {

    /* JADX INFO: renamed from: a */
    public final ApplicationInfo f139336a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final PackageInfo f139337b;

    /* JADX INFO: renamed from: c */
    public final Context f139338c;

    public njv0(ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, Context context) {
        this.f139336a = applicationInfo;
        this.f139337b = packageInfo;
        this.f139338c = context;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f139336a.packageName;
        PackageInfo packageInfo = this.f139337b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f139337b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
        try {
            Context context = this.f139338c;
            String str3 = this.f139336a.packageName;
            obw0 obw0Var = C2075b.f9714l;
            bundle.putString("dl", String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 29;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return jmw0.m142235h(this);
    }
}
