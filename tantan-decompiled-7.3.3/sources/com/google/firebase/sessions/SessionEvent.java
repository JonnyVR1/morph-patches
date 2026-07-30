package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.encoders.annotations.Encodable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionEvent;", "", "eventType", "Lcom/google/firebase/sessions/EventType;", "sessionData", "Lcom/google/firebase/sessions/SessionInfo;", "applicationInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "(Lcom/google/firebase/sessions/EventType;Lcom/google/firebase/sessions/SessionInfo;Lcom/google/firebase/sessions/ApplicationInfo;)V", "getApplicationInfo", "()Lcom/google/firebase/sessions/ApplicationInfo;", "getEventType", "()Lcom/google/firebase/sessions/EventType;", "getSessionData", "()Lcom/google/firebase/sessions/SessionInfo;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@Encodable
public final /* data */ class SessionEvent {

    @NotNull
    private final ApplicationInfo applicationInfo;

    @NotNull
    private final EventType eventType;

    @NotNull
    private final SessionInfo sessionData;

    public SessionEvent(@NotNull EventType eventType, @NotNull SessionInfo sessionInfo, @NotNull ApplicationInfo applicationInfo) {
        eventType.getClass();
        sessionInfo.getClass();
        applicationInfo.getClass();
        this.eventType = eventType;
        this.sessionData = sessionInfo;
        this.applicationInfo = applicationInfo;
    }

    public static /* synthetic */ SessionEvent copy$default(SessionEvent sessionEvent, EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = sessionEvent.eventType;
        }
        if ((i & 2) != 0) {
            sessionInfo = sessionEvent.sessionData;
        }
        if ((i & 4) != 0) {
            applicationInfo = sessionEvent.applicationInfo;
        }
        return sessionEvent.copy(eventType, sessionInfo, applicationInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EventType getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    @NotNull
    public final SessionEvent copy(@NotNull EventType eventType, @NotNull SessionInfo sessionData, @NotNull ApplicationInfo applicationInfo) {
        eventType.getClass();
        sessionData.getClass();
        applicationInfo.getClass();
        return new SessionEvent(eventType, sessionData, applicationInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) other;
        return this.eventType == sessionEvent.eventType && Intrinsics.m88377d(this.sessionData, sessionEvent.sessionData) && Intrinsics.m88377d(this.applicationInfo, sessionEvent.applicationInfo);
    }

    @NotNull
    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    @NotNull
    public final EventType getEventType() {
        return this.eventType;
    }

    @NotNull
    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return (((this.eventType.hashCode() * 31) + this.sessionData.hashCode()) * 31) + this.applicationInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionEvent(eventType=" + this.eventType + ", sessionData=" + this.sessionData + ", applicationInfo=" + this.applicationInfo + ')';
    }
}
