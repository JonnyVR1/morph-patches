package p153l;

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
public final class jnv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final o7w0 f121909a;

    /* JADX INFO: renamed from: b */
    public final long f121910b;

    public jnv0(o7w0 o7w0Var, long j) {
        Preconditions.checkNotNull(o7w0Var, "the targeting must not be null");
        this.f121909a = o7w0Var;
        this.f121910b = j;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzl zzlVar = this.f121909a.f145318d;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.f121909a.f145320f);
        int i = this.f121909a.f145329o.f192644a;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f121910b);
        b8w0.m103043f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
        b8w0.m103039b(bundle, "extras", zzlVar.zzc);
        int i3 = zzlVar.zzd;
        b8w0.m103042e(bundle, "cust_gender", i3, i3 != -1);
        b8w0.m103041d(bundle, "kw", zzlVar.zze);
        int i4 = zzlVar.zzg;
        b8w0.m103042e(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzlVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzlVar.zzy);
        b8w0.m103042e(bundle, "d_imp_hdr", 1, zzlVar.zza >= 2 && zzlVar.zzh);
        String str = zzlVar.zzi;
        b8w0.m103043f(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
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
        b8w0.m103040c(bundle, "url", zzlVar.zzl);
        b8w0.m103041d(bundle, "neighboring_content_urls", zzlVar.zzv);
        b8w0.m103039b(bundle, "custom_targeting", zzlVar.zzn);
        b8w0.m103041d(bundle, "category_exclusions", zzlVar.zzo);
        b8w0.m103040c(bundle, "request_agent", zzlVar.zzp);
        b8w0.m103040c(bundle, "request_pkg", zzlVar.zzq);
        b8w0.m103044g(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza >= 7);
        if (zzlVar.zza >= 8) {
            int i5 = zzlVar.zzt;
            b8w0.m103042e(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            b8w0.m103040c(bundle, "max_ad_content_rating", zzlVar.zzu);
        }
    }
}
