package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b80 {
    @NonNull
    public abstract r9l0 getSDKVersionInfo();

    @NonNull
    public abstract r9l0 getVersionInfo();

    public abstract void initialize(@NonNull Context context, @NonNull hum humVar, @NonNull List<z7y> list);

    public void loadAppOpenAd(@NonNull w7y w7yVar, @NonNull t7y<Object, Object> t7yVar) {
        t7yVar.mo95420a(new b70(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(@NonNull x7y x7yVar, @NonNull t7y<Object, Object> t7yVar) {
        t7yVar.mo95420a(new b70(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(@NonNull x7y x7yVar, @NonNull t7y<Object, Object> t7yVar) {
        t7yVar.mo95420a(new b70(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(@NonNull a8y a8yVar, @NonNull t7y<Object, Object> t7yVar) {
        t7yVar.mo95420a(new b70(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(@NonNull c8y c8yVar, @NonNull t7y<nxj0, Object> t7yVar) {
        t7yVar.mo95420a(new b70(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(@NonNull e8y e8yVar, @NonNull t7y<Object, Object> t7yVar) {
        t7yVar.mo95420a(new b70(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(@NonNull e8y e8yVar, @NonNull t7y<Object, Object> t7yVar) {
        t7yVar.mo95420a(new b70(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
