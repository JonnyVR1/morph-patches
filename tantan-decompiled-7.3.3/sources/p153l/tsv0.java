package p153l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes6.dex */
public final class tsv0 implements wuv0, vuv0 {

    /* JADX INFO: renamed from: a */
    public final ApplicationInfo f176043a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final PackageInfo f176044b;

    /* JADX INFO: renamed from: c */
    public final Context f176045c;

    public tsv0(ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, Context context) {
        this.f176043a = applicationInfo;
        this.f176044b = packageInfo;
        this.f176045c = context;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f176043a.packageName;
        PackageInfo packageInfo = this.f176044b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f176044b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
        try {
            Context context = this.f176045c;
            String str3 = this.f176043a.packageName;
            ukw0 ukw0Var = C2098b.f9751l;
            bundle.putString("dl", String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 29;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return pvw0.m173981h(this);
    }
}
