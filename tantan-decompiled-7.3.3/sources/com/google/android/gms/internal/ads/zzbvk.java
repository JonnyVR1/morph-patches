package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import p153l.b8y;
import p153l.bis0;
import p153l.bxy0;
import p153l.dct0;
import p153l.f0t0;
import p153l.g0t0;
import p153l.u7y;
import p153l.vzb;

/* JADX INFO: loaded from: classes6.dex */
public final class zzbvk implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a */
    public Activity f10151a;

    /* JADX INFO: renamed from: b */
    public b8y f10152b;

    /* JADX INFO: renamed from: c */
    public Uri f10153c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        dct0.m115293b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        dct0.m115293b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        dct0.m115293b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, b8y b8yVar, Bundle bundle, u7y u7yVar, Bundle bundle2) {
        this.f10152b = b8yVar;
        if (b8yVar == null) {
            dct0.m115298g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            dct0.m115298g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f10152b.mo103048p(this, 0);
            return;
        }
        if (!bis0.m104509g(context)) {
            dct0.m115298g("Default browser does not support custom tabs. Bailing out.");
            this.f10152b.mo103048p(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            dct0.m115298g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f10152b.mo103048p(this, 0);
        } else {
            this.f10151a = (Activity) context;
            this.f10153c = Uri.parse(string);
            this.f10152b.mo103046m(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        vzb vzbVarM204046a = new vzb.C20961a().m204046a();
        vzbVarM204046a.f186459a.setData(this.f10153c);
        C2098b.f9751l.post(new g0t0(this, new AdOverlayInfoParcel(new zzc(vzbVarM204046a.f186459a, null), null, new f0t0(this), null, new zzcei(0, 0, false, false, false), null, null)));
        bxy0.m106933q().m120269q();
    }
}
