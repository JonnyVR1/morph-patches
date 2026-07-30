package com.google.firebase.sessions.settings;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010JJ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m88121d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "sessionEnabled", "", "sessionSamplingRate", "", "sessionRestartTimeout", "", "cacheDuration", "cacheUpdatedTime", "", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "getCacheDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCacheUpdatedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSessionEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSessionRestartTimeout", "getSessionSamplingRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "equals", "other", "hashCode", "toString", "", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final /* data */ class SessionConfigs {

    @Nullable
    private final Integer cacheDuration;

    @Nullable
    private final Long cacheUpdatedTime;

    @Nullable
    private final Boolean sessionEnabled;

    @Nullable
    private final Integer sessionRestartTimeout;

    @Nullable
    private final Double sessionSamplingRate;

    public SessionConfigs(@Nullable Boolean bool, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l2) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l2;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d, Integer num, Integer num2, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sessionConfigs.sessionEnabled;
        }
        if ((i & 2) != 0) {
            d = sessionConfigs.sessionSamplingRate;
        }
        if ((i & 4) != 0) {
            num = sessionConfigs.sessionRestartTimeout;
        }
        if ((i & 8) != 0) {
            num2 = sessionConfigs.cacheDuration;
        }
        if ((i & 16) != 0) {
            l2 = sessionConfigs.cacheUpdatedTime;
        }
        Long l3 = l2;
        Integer num3 = num;
        return sessionConfigs.copy(bool, d, num3, num2, l3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    @NotNull
    public final SessionConfigs copy(@Nullable Boolean sessionEnabled, @Nullable Double sessionSamplingRate, @Nullable Integer sessionRestartTimeout, @Nullable Integer cacheDuration, @Nullable Long cacheUpdatedTime) {
        return new SessionConfigs(sessionEnabled, sessionSamplingRate, sessionRestartTimeout, cacheDuration, cacheUpdatedTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return Intrinsics.m88377d(this.sessionEnabled, sessionConfigs.sessionEnabled) && Intrinsics.m88377d(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && Intrinsics.m88377d(this.sessionRestartTimeout, sessionConfigs.sessionRestartTimeout) && Intrinsics.m88377d(this.cacheDuration, sessionConfigs.cacheDuration) && Intrinsics.m88377d(this.cacheUpdatedTime, sessionConfigs.cacheUpdatedTime);
    }

    @Nullable
    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    @Nullable
    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    @Nullable
    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    @Nullable
    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    @Nullable
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        Boolean bool = this.sessionEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.sessionRestartTimeout;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDuration;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.cacheUpdatedTime;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.sessionEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionRestartTimeout=" + this.sessionRestartTimeout + ", cacheDuration=" + this.cacheDuration + ", cacheUpdatedTime=" + this.cacheUpdatedTime + ')';
    }
}
