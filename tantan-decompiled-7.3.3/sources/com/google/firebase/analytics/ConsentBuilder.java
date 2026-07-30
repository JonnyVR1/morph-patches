package com.google.firebase.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m88121d2 = {"Lcom/google/firebase/analytics/ConsentBuilder;", "", "<init>", "()V", "adStorage", "Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;", "getAdStorage", "()Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;", "setAdStorage", "(Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;)V", "analyticsStorage", "getAnalyticsStorage", "setAnalyticsStorage", "adUserData", "getAdUserData", "setAdUserData", "adPersonalization", "getAdPersonalization", "setAdPersonalization", "asMap", "", "Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentType;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ConsentBuilder {

    @Nullable
    private FirebaseAnalytics.ConsentStatus zza;

    @Nullable
    private FirebaseAnalytics.ConsentStatus zzb;

    @Nullable
    private FirebaseAnalytics.ConsentStatus zzc;

    @Nullable
    private FirebaseAnalytics.ConsentStatus zzd;

    @NotNull
    public final Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.ConsentStatus consentStatus = this.zza;
        if (consentStatus != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
        }
        FirebaseAnalytics.ConsentStatus consentStatus2 = this.zzb;
        if (consentStatus2 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus2);
        }
        FirebaseAnalytics.ConsentStatus consentStatus3 = this.zzc;
        if (consentStatus3 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus3);
        }
        FirebaseAnalytics.ConsentStatus consentStatus4 = this.zzd;
        if (consentStatus4 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus4);
        }
        return linkedHashMap;
    }

    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: getAdPersonalization, reason: from getter */
    public final FirebaseAnalytics.ConsentStatus getZzd() {
        return this.zzd;
    }

    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: getAdStorage, reason: from getter */
    public final FirebaseAnalytics.ConsentStatus getZza() {
        return this.zza;
    }

    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: getAdUserData, reason: from getter */
    public final FirebaseAnalytics.ConsentStatus getZzc() {
        return this.zzc;
    }

    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: getAnalyticsStorage, reason: from getter */
    public final FirebaseAnalytics.ConsentStatus getZzb() {
        return this.zzb;
    }

    public final void setAdPersonalization(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zzd = consentStatus;
    }

    public final void setAdStorage(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zza = consentStatus;
    }

    public final void setAdUserData(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zzc = consentStatus;
    }

    public final void setAnalyticsStorage(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zzb = consentStatus;
    }
}
