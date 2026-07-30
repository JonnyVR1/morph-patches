package com.google.firebase.crashlytics.internal.metadata;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m87232d2 = {"Lcom/google/firebase/crashlytics/internal/metadata/EventMetadata;", "", "sessionId", "", "timestamp", "", "additionalCustomKeys", "", "(Ljava/lang/String;JLjava/util/Map;)V", "getAdditionalCustomKeys", "()Ljava/util/Map;", "getSessionId", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-crashlytics"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final /* data */ class EventMetadata {

    @NotNull
    private final Map<String, String> additionalCustomKeys;

    @NotNull
    private final String sessionId;
    private final long timestamp;

    @JvmOverloads
    public EventMetadata(@NotNull String str, long j, @NotNull Map<String, String> map) {
        str.getClass();
        map.getClass();
        this.sessionId = str;
        this.timestamp = j;
        this.additionalCustomKeys = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, String str, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventMetadata.sessionId;
        }
        if ((i & 2) != 0) {
            j = eventMetadata.timestamp;
        }
        if ((i & 4) != 0) {
            map = eventMetadata.additionalCustomKeys;
        }
        return eventMetadata.copy(str, j, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.additionalCustomKeys;
    }

    @NotNull
    public final EventMetadata copy(@NotNull String sessionId, long timestamp, @NotNull Map<String, String> additionalCustomKeys) {
        sessionId.getClass();
        additionalCustomKeys.getClass();
        return new EventMetadata(sessionId, timestamp, additionalCustomKeys);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return Intrinsics.m87488d(this.sessionId, eventMetadata.sessionId) && this.timestamp == eventMetadata.timestamp && Intrinsics.m87488d(this.additionalCustomKeys, eventMetadata.additionalCustomKeys);
    }

    @NotNull
    public final Map<String, String> getAdditionalCustomKeys() {
        return this.additionalCustomKeys;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.sessionId.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.additionalCustomKeys.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventMetadata(sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", additionalCustomKeys=" + this.additionalCustomKeys + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EventMetadata(@NotNull String str, long j) {
        this(str, j, null, 4, null);
        str.getClass();
    }

    public /* synthetic */ EventMetadata(String str, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
