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
import p153l.b70;
import p153l.b8y;
import p153l.d8y;
import p153l.dct0;
import p153l.m6t0;
import p153l.mar0;
import p153l.q8s0;
import p153l.te20;
import p153l.u7y;
import p153l.w70;
import p153l.y7y;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdkWithMembers
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public static final b70 f9765e = new b70(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* JADX INFO: renamed from: a */
    public View f9766a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @VisibleForTesting
    public CustomEventBanner f9767b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @VisibleForTesting
    public CustomEventInterstitial f9768c;

    /* JADX INFO: renamed from: d */
    @Nullable
    @VisibleForTesting
    public CustomEventNative f9769d;

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Object m12400a(Class cls, @Nullable String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            }
            throw null;
        } catch (Throwable th) {
            dct0.m115298g("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.f9766a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p153l.v7y, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f9767b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f9768c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f9769d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p153l.v7y, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f9767b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f9768c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f9769d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p153l.v7y, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f9767b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f9768c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f9769d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull y7y y7yVar, @NonNull Bundle bundle, @NonNull w70 w70Var, @NonNull u7y u7yVar, @Nullable Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m12400a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f9767b = customEventBanner;
        if (customEventBanner == null) {
            y7yVar.mo113235d(this, f9765e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f9767b;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new mar0(this, y7yVar), bundle.getString("parameter"), w70Var, u7yVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull b8y b8yVar, @NonNull Bundle bundle, @NonNull u7y u7yVar, @Nullable Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m12400a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f9768c = customEventInterstitial;
        if (customEventInterstitial == null) {
            b8yVar.mo103045k(this, f9765e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f9768c;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new q8s0(this, this, b8yVar), bundle.getString("parameter"), u7yVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@NonNull Context context, @NonNull d8y d8yVar, @NonNull Bundle bundle, @NonNull te20 te20Var, @Nullable Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) m12400a(CustomEventNative.class, bundle.getString("class_name"));
        this.f9769d = customEventNative;
        if (customEventNative == null) {
            d8yVar.mo113244q(this, f9765e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f9769d;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new m6t0(this, d8yVar), bundle.getString("parameter"), te20Var, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f9768c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
