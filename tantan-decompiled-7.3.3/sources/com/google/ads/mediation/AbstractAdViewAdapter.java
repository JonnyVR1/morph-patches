package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Iterator;
import java.util.Set;
import p153l.a2n;
import p153l.a9s0;
import p153l.b8y;
import p153l.d8y;
import p153l.f70;
import p153l.i2v0;
import p153l.k6s0;
import p153l.lar0;
import p153l.lm50;
import p153l.lpu0;
import p153l.obt0;
import p153l.s70;
import p153l.te20;
import p153l.u7y;
import p153l.w70;
import p153l.y7y;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, lm50, lar0 {

    @NonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private f70 adLoader;

    @NonNull
    protected AdView mAdView;

    @NonNull
    protected a2n mInterstitialAd;

    public s70 buildAdRequest(Context context, u7y u7yVar, Bundle bundle, Bundle bundle2) {
        s70.C19999a c19999a = new s70.C19999a();
        Set<String> setMo123244c = u7yVar.mo123244c();
        if (setMo123244c != null) {
            Iterator<String> it = setMo123244c.iterator();
            while (it.hasNext()) {
                c19999a.m179960a(it.next());
            }
        }
        if (u7yVar.mo123246e()) {
            k6s0.m148569b();
            c19999a.m179965f(obt0.m167034A(context));
        }
        if (u7yVar.mo123242a() != -1) {
            c19999a.m179967h(u7yVar.mo123242a() == 1);
        }
        c19999a.m179966g(u7yVar.mo123243b());
        c19999a.m179961b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return c19999a.m184941i();
    }

    @NonNull
    public abstract Bundle buildExtrasBundle(@NonNull Bundle bundle, @NonNull Bundle bundle2);

    @NonNull
    public String getAdUnitId(@NonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.mAdView;
    }

    @VisibleForTesting
    public a2n getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // p153l.lar0
    @Nullable
    public lpu0 getVideoController() {
        AdView adView = this.mAdView;
        if (adView != null) {
            return adView.m12271e().m200828b();
        }
        return null;
    }

    @VisibleForTesting
    public f70.C16918a newAdLoader(Context context, String str) {
        return new f70.C16918a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p153l.v7y, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.m12272a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // p153l.lm50
    public void onImmersiveModeUpdated(boolean z) {
        a2n a2nVar = this.mInterstitialAd;
        if (a2nVar != null) {
            a2nVar.mo95719d(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p153l.v7y, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.m12274c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p153l.v7y, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.m12275d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull y7y y7yVar, @NonNull Bundle bundle, @NonNull w70 w70Var, @NonNull u7y u7yVar, @NonNull Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new w70(w70Var.m205215d(), w70Var.m205213a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new a9s0(this, y7yVar));
        this.mAdView.m12273b(buildAdRequest(context, u7yVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull b8y b8yVar, @NonNull Bundle bundle, @NonNull u7y u7yVar, @NonNull Bundle bundle2) {
        a2n.m95716b(context, getAdUnitId(bundle), buildAdRequest(context, u7yVar, bundle2, bundle), new C1751a(this, b8yVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@NonNull Context context, @NonNull d8y d8yVar, @NonNull Bundle bundle, @NonNull te20 te20Var, @NonNull Bundle bundle2) {
        i2v0 i2v0Var = new i2v0(this, d8yVar);
        f70.C16918a c16918aM124343c = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).m124343c(i2v0Var);
        c16918aM124343c.m124347g(te20Var.mo123247f());
        c16918aM124343c.m124344d(te20Var.mo123245d());
        if (te20Var.mo123248g()) {
            c16918aM124343c.m124346f(i2v0Var);
        }
        if (te20Var.zzb()) {
            for (String str : te20Var.zza().keySet()) {
                c16918aM124343c.m124345e(str, i2v0Var, true != ((Boolean) te20Var.zza().get(str)).booleanValue() ? null : i2v0Var);
            }
        }
        f70 f70VarM124341a = c16918aM124343c.m124341a();
        this.adLoader = f70VarM124341a;
        f70VarM124341a.m124338a(buildAdRequest(context, te20Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        a2n a2nVar = this.mInterstitialAd;
        if (a2nVar != null) {
            a2nVar.mo95720e(null);
        }
    }
}
