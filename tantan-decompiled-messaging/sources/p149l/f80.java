package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f80 {
    @NonNull
    public abstract m0l0 getSDKVersionInfo();

    @NonNull
    public abstract m0l0 getVersionInfo();

    public abstract void initialize(@NonNull Context context, @NonNull fsm fsmVar, @NonNull List<czx> list);

    public void loadAppOpenAd(@NonNull zyx zyxVar, @NonNull wyx<Object, Object> wyxVar) {
        wyxVar.mo127630a(new f70(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(@NonNull azx azxVar, @NonNull wyx<Object, Object> wyxVar) {
        wyxVar.mo127630a(new f70(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(@NonNull azx azxVar, @NonNull wyx<Object, Object> wyxVar) {
        wyxVar.mo127630a(new f70(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(@NonNull dzx dzxVar, @NonNull wyx<Object, Object> wyxVar) {
        wyxVar.mo127630a(new f70(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(@NonNull fzx fzxVar, @NonNull wyx<koj0, Object> wyxVar) {
        wyxVar.mo127630a(new f70(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(@NonNull hzx hzxVar, @NonNull wyx<Object, Object> wyxVar) {
        wyxVar.mo127630a(new f70(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(@NonNull hzx hzxVar, @NonNull wyx<Object, Object> wyxVar) {
        wyxVar.mo127630a(new f70(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
