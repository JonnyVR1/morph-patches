package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m87232d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "sessionId", "", "firstSessionId", "sessionIndex", "", "eventTimestampUs", "", "dataCollectionStatus", "Lcom/google/firebase/sessions/DataCollectionStatus;", "firebaseInstallationId", "firebaseAuthenticationToken", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;Ljava/lang/String;)V", "getDataCollectionStatus", "()Lcom/google/firebase/sessions/DataCollectionStatus;", "getEventTimestampUs", "()J", "getFirebaseAuthenticationToken", "()Ljava/lang/String;", "getFirebaseInstallationId", "getFirstSessionId", "getSessionId", "getSessionIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final /* data */ class SessionInfo {

    @NotNull
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;

    @NotNull
    private final String firebaseAuthenticationToken;

    @NotNull
    private final String firebaseInstallationId;

    @NotNull
    private final String firstSessionId;

    @NotNull
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(@NotNull String str, @NotNull String str2, int i, long j, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String str3, @NotNull String str4) {
        str.getClass();
        str2.getClass();
        dataCollectionStatus.getClass();
        str3.getClass();
        str4.getClass();
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i;
        this.eventTimestampUs = j;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = str3;
        this.firebaseAuthenticationToken = str4;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i, long j, DataCollectionStatus dataCollectionStatus, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sessionInfo.sessionId;
        }
        if ((i2 & 2) != 0) {
            str2 = sessionInfo.firstSessionId;
        }
        if ((i2 & 4) != 0) {
            i = sessionInfo.sessionIndex;
        }
        if ((i2 & 8) != 0) {
            j = sessionInfo.eventTimestampUs;
        }
        if ((i2 & 16) != 0) {
            dataCollectionStatus = sessionInfo.dataCollectionStatus;
        }
        if ((i2 & 32) != 0) {
            str3 = sessionInfo.firebaseInstallationId;
        }
        if ((i2 & 64) != 0) {
            str4 = sessionInfo.firebaseAuthenticationToken;
        }
        String str5 = str4;
        DataCollectionStatus dataCollectionStatus2 = dataCollectionStatus;
        long j2 = j;
        int i3 = i;
        return sessionInfo.copy(str, str2, i3, j2, dataCollectionStatus2, str3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    @NotNull
    public final SessionInfo copy(@NotNull String sessionId, @NotNull String firstSessionId, int sessionIndex, long eventTimestampUs, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        sessionId.getClass();
        firstSessionId.getClass();
        dataCollectionStatus.getClass();
        firebaseInstallationId.getClass();
        firebaseAuthenticationToken.getClass();
        return new SessionInfo(sessionId, firstSessionId, sessionIndex, eventTimestampUs, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) other;
        return Intrinsics.m87488d(this.sessionId, sessionInfo.sessionId) && Intrinsics.m87488d(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && Intrinsics.m87488d(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && Intrinsics.m87488d(this.firebaseInstallationId, sessionInfo.firebaseInstallationId) && Intrinsics.m87488d(this.firebaseAuthenticationToken, sessionInfo.firebaseAuthenticationToken);
    }

    @NotNull
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @NotNull
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    @NotNull
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public int hashCode() {
        return (((((((((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + Integer.hashCode(this.sessionIndex)) * 31) + Long.hashCode(this.eventTimestampUs)) * 31) + this.dataCollectionStatus.hashCode()) * 31) + this.firebaseInstallationId.hashCode()) * 31) + this.firebaseAuthenticationToken.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionInfo(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", eventTimestampUs=" + this.eventTimestampUs + ", dataCollectionStatus=" + this.dataCollectionStatus + ", firebaseInstallationId=" + this.firebaseInstallationId + ", firebaseAuthenticationToken=" + this.firebaseAuthenticationToken + ')';
    }
}
