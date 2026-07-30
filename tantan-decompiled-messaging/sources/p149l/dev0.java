package p149l;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class dev0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final iyv0 f85862a;

    /* JADX INFO: renamed from: b */
    public final long f85863b;

    public dev0(iyv0 iyv0Var, long j) {
        Preconditions.checkNotNull(iyv0Var, "the targeting must not be null");
        this.f85862a = iyv0Var;
        this.f85863b = j;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzl zzlVar = this.f85862a.f115494d;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.f85862a.f115496f);
        int i = this.f85862a.f115505o.f161517a;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f85863b);
        vyv0.m200679f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
        vyv0.m200675b(bundle, "extras", zzlVar.zzc);
        int i3 = zzlVar.zzd;
        vyv0.m200678e(bundle, "cust_gender", i3, i3 != -1);
        vyv0.m200677d(bundle, "kw", zzlVar.zze);
        int i4 = zzlVar.zzg;
        vyv0.m200678e(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzlVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzlVar.zzy);
        vyv0.m200678e(bundle, "d_imp_hdr", 1, zzlVar.zza >= 2 && zzlVar.zzh);
        String str = zzlVar.zzi;
        vyv0.m200679f(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzlVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = location.getLongitude() * 1.0E7d;
            Bundle bundle2 = new Bundle();
            bundle2.putFloat(Constants.KEY_RADIUS, accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong(com.meituan.robust.Constants.LONG, (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        vyv0.m200676c(bundle, "url", zzlVar.zzl);
        vyv0.m200677d(bundle, "neighboring_content_urls", zzlVar.zzv);
        vyv0.m200675b(bundle, "custom_targeting", zzlVar.zzn);
        vyv0.m200677d(bundle, "category_exclusions", zzlVar.zzo);
        vyv0.m200676c(bundle, "request_agent", zzlVar.zzp);
        vyv0.m200676c(bundle, "request_pkg", zzlVar.zzq);
        vyv0.m200680g(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza >= 7);
        if (zzlVar.zza >= 8) {
            int i5 = zzlVar.zzt;
            vyv0.m200678e(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            vyv0.m200676c(bundle, "max_ad_content_rating", zzlVar.zzu);
        }
    }
}
