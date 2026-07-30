package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;
import p149l.a80;
import p149l.bzx;
import p149l.ezx;
import p149l.f70;
import p149l.g1r0;
import p149l.gxs0;
import p149l.gzx;
import p149l.kzr0;
import p149l.l620;
import p149l.x2t0;
import p149l.xyx;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdkWithMembers
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public static final f70 f9728e = new f70(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* JADX INFO: renamed from: a */
    public View f9729a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @VisibleForTesting
    public CustomEventBanner f9730b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @VisibleForTesting
    public CustomEventInterstitial f9731c;

    /* JADX INFO: renamed from: d */
    @Nullable
    @VisibleForTesting
    public CustomEventNative f9732d;

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Object m12346a(Class cls, @Nullable String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            }
            throw null;
        } catch (Throwable th) {
            x2t0.m206869g("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.f9729a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p149l.yyx, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f9730b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f9731c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f9732d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p149l.yyx, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f9730b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f9731c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f9732d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p149l.yyx, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f9730b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f9731c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f9732d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull bzx bzxVar, @NonNull Bundle bundle, @NonNull a80 a80Var, @NonNull xyx xyxVar, @Nullable Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m12346a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f9730b = customEventBanner;
        if (customEventBanner == null) {
            bzxVar.mo104702d(this, f9728e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f9730b;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new g1r0(this, bzxVar), bundle.getString("parameter"), a80Var, xyxVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull ezx ezxVar, @NonNull Bundle bundle, @NonNull xyx xyxVar, @Nullable Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m12346a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f9731c = customEventInterstitial;
        if (customEventInterstitial == null) {
            ezxVar.mo119022k(this, f9728e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f9731c;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new kzr0(this, this, ezxVar), bundle.getString("parameter"), xyxVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@NonNull Context context, @NonNull gzx gzxVar, @NonNull Bundle bundle, @NonNull l620 l620Var, @Nullable Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) m12346a(CustomEventNative.class, bundle.getString("class_name"));
        this.f9732d = customEventNative;
        if (customEventNative == null) {
            gzxVar.mo128932q(this, f9728e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f9732d;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new gxs0(this, gzxVar), bundle.getString("parameter"), l620Var, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f9731c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
