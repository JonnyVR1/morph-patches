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
import p149l.a0n;
import p149l.a80;
import p149l.bzx;
import p149l.ctu0;
import p149l.ee50;
import p149l.exr0;
import p149l.ezx;
import p149l.f1r0;
import p149l.fgu0;
import p149l.gzx;
import p149l.i2t0;
import p149l.j70;
import p149l.l620;
import p149l.uzr0;
import p149l.w70;
import p149l.xyx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, ee50, f1r0 {

    @NonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private j70 adLoader;

    @NonNull
    protected AdView mAdView;

    @NonNull
    protected a0n mInterstitialAd;

    public w70 buildAdRequest(Context context, xyx xyxVar, Bundle bundle, Bundle bundle2) {
        w70.C20817a c20817a = new w70.C20817a();
        Set<String> setMo160420c = xyxVar.mo160420c();
        if (setMo160420c != null) {
            Iterator<String> it = setMo160420c.iterator();
            while (it.hasNext()) {
                c20817a.m191882a(it.next());
            }
        }
        if (xyxVar.mo160421e()) {
            exr0.m118703b();
            c20817a.m191887f(i2t0.m134081A(context));
        }
        if (xyxVar.mo160418a() != -1) {
            c20817a.m191889h(xyxVar.mo160418a() == 1);
        }
        c20817a.m191888g(xyxVar.mo160419b());
        c20817a.m191883b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return c20817a.m201999i();
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
    public a0n getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // p149l.f1r0
    @Nullable
    public fgu0 getVideoController() {
        AdView adView = this.mAdView;
        if (adView != null) {
            return adView.m12217e().m172883b();
        }
        return null;
    }

    @VisibleForTesting
    public j70.C17709a newAdLoader(Context context, String str) {
        return new j70.C17709a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p149l.yyx, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.m12218a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // p149l.ee50
    public void onImmersiveModeUpdated(boolean z) {
        a0n a0nVar = this.mInterstitialAd;
        if (a0nVar != null) {
            a0nVar.mo94456d(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p149l.yyx, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.m12220c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p149l.yyx, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.m12221d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull bzx bzxVar, @NonNull Bundle bundle, @NonNull a80 a80Var, @NonNull xyx xyxVar, @NonNull Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new a80(a80Var.m95312d(), a80Var.m95310a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new uzr0(this, bzxVar));
        this.mAdView.m12219b(buildAdRequest(context, xyxVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull ezx ezxVar, @NonNull Bundle bundle, @NonNull xyx xyxVar, @NonNull Bundle bundle2) {
        a0n.m94453b(context, getAdUnitId(bundle), buildAdRequest(context, xyxVar, bundle2, bundle), new C1728a(this, ezxVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@NonNull Context context, @NonNull gzx gzxVar, @NonNull Bundle bundle, @NonNull l620 l620Var, @NonNull Bundle bundle2) {
        ctu0 ctu0Var = new ctu0(this, gzxVar);
        j70.C17709a c17709aM140069c = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).m140069c(ctu0Var);
        c17709aM140069c.m140073g(l620Var.mo148695f());
        c17709aM140069c.m140070d(l620Var.mo148694d());
        if (l620Var.mo148696g()) {
            c17709aM140069c.m140072f(ctu0Var);
        }
        if (l620Var.zzb()) {
            for (String str : l620Var.zza().keySet()) {
                c17709aM140069c.m140071e(str, ctu0Var, true != ((Boolean) l620Var.zza().get(str)).booleanValue() ? null : ctu0Var);
            }
        }
        j70 j70VarM140067a = c17709aM140069c.m140067a();
        this.adLoader = j70VarM140067a;
        j70VarM140067a.m140064a(buildAdRequest(context, l620Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        a0n a0nVar = this.mInterstitialAd;
        if (a0nVar != null) {
            a0nVar.mo94457e(null);
        }
    }
}
