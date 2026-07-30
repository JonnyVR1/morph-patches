package com.clevertap.android.sdk.inapp.delay;

import com.p046p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult;", "", "b", "Error", "a", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$a;", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$Error;", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$b;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface DelayedInAppResult {

    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$Error;", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult;", "", "inAppId", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$Error$ErrorReason;", Reason.TYPE, "", "throwable", "<init>", "(Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$Error$ErrorReason;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$Error$ErrorReason;", "()Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$Error$ErrorReason;", "c", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "ErrorReason", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class Error implements DelayedInAppResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String inAppId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ErrorReason reason;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final Throwable throwable;

        @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$Error$ErrorReason;", "", "message", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "NOT_FOUND_IN_DB", "STORE_NOT_INITIALIZED", "DB_SAVE_FAILED", "UNKNOWN", "toString", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public enum ErrorReason {
            NOT_FOUND_IN_DB("Delayed in-app not found in database"),
            STORE_NOT_INITIALIZED("DelayedLegacyInAppStore is not initialized"),
            DB_SAVE_FAILED("Failed to save delayed in-app to database"),
            UNKNOWN("Unknown error occurred");

            private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

            @NotNull
            private final String message;

            ErrorReason(String str) {
                this.message = str;
            }

            @NotNull
            public static EnumEntries<ErrorReason> getEntries() {
                return $ENTRIES;
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return this.message;
            }
        }

        public Error(@NotNull String str, @NotNull ErrorReason errorReason, @Nullable Throwable th) {
            str.getClass();
            errorReason.getClass();
            this.inAppId = str;
            this.reason = errorReason;
            this.throwable = th;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInAppId() {
            return this.inAppId;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ErrorReason getReason() {
            return this.reason;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.m87488d(this.inAppId, error.inAppId) && this.reason == error.reason && Intrinsics.m87488d(this.throwable, error.throwable);
        }

        public int hashCode() {
            int iHashCode = ((this.inAppId.hashCode() * 31) + this.reason.hashCode()) * 31;
            Throwable th = this.throwable;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @NotNull
        public String toString() {
            return "Error(inAppId=" + this.inAppId + ", reason=" + this.reason + ", throwable=" + this.throwable + ')';
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.DelayedInAppResult$a */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$a;", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult;", "", "id", Reason.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C1221a implements DelayedInAppResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String reason;

        public C1221a(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.reason = str2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C1221a)) {
                return false;
            }
            C1221a c1221a = (C1221a) other;
            return Intrinsics.m87488d(this.id, c1221a.id) && Intrinsics.m87488d(this.reason, c1221a.reason);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Discarded(id=" + this.id + ", reason=" + this.reason + ')';
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.DelayedInAppResult$b */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult$b;", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult;", "", "inAppId", "Lorg/json/JSONObject;", "inApp", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C1222b implements DelayedInAppResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String inAppId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final JSONObject inApp;

        public C1222b(@NotNull String str, @NotNull JSONObject jSONObject) {
            str.getClass();
            jSONObject.getClass();
            this.inAppId = str;
            this.inApp = jSONObject;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final JSONObject getInApp() {
            return this.inApp;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInAppId() {
            return this.inAppId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C1222b)) {
                return false;
            }
            C1222b c1222b = (C1222b) other;
            return Intrinsics.m87488d(this.inAppId, c1222b.inAppId) && Intrinsics.m87488d(this.inApp, c1222b.inApp);
        }

        public int hashCode() {
            return (this.inAppId.hashCode() * 31) + this.inApp.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(inAppId=" + this.inAppId + ", inApp=" + this.inApp + ')';
        }
    }
}
