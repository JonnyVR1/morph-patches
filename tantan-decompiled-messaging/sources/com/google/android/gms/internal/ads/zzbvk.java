package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import p149l.ars0;
import p149l.ezx;
import p149l.hyb;
import p149l.v8s0;
import p149l.vny0;
import p149l.x2t0;
import p149l.xyx;
import p149l.zqs0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzbvk implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a */
    public Activity f10114a;

    /* JADX INFO: renamed from: b */
    public ezx f10115b;

    /* JADX INFO: renamed from: c */
    public Uri f10116c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        x2t0.m206864b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        x2t0.m206864b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        x2t0.m206864b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, ezx ezxVar, Bundle bundle, xyx xyxVar, Bundle bundle2) {
        this.f10115b = ezxVar;
        if (ezxVar == null) {
            x2t0.m206869g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            x2t0.m206869g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f10115b.mo119025p(this, 0);
            return;
        }
        if (!v8s0.m197514g(context)) {
            x2t0.m206869g("Default browser does not support custom tabs. Bailing out.");
            this.f10115b.mo119025p(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            x2t0.m206869g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f10115b.mo119025p(this, 0);
        } else {
            this.f10114a = (Activity) context;
            this.f10116c = Uri.parse(string);
            this.f10115b.mo119023m(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        hyb hybVarM133505a = new hyb.C17431a().m133505a();
        hybVarM133505a.f110043a.setData(this.f10116c);
        C2075b.f9714l.post(new ars0(this, new AdOverlayInfoParcel(new zzc(hybVarM133505a.f110043a, null), null, new zqs0(this), null, new zzcei(0, 0, false, false, false), null, null)));
        vny0.m199079q().m212284q();
    }
}
