package com.clevertap.android.sdk.cryption;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Lcom/clevertap/android/sdk/cryption/d;", "", "", "data", "", "migrationSuccessful", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class C1200d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final String data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean migrationSuccessful;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.d$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/clevertap/android/sdk/cryption/d$a;", "", "<init>", "()V", "", "data", "Lcom/clevertap/android/sdk/cryption/d;", "a", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/cryption/d;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C1200d m6034a(@Nullable String data) {
            return new C1200d(data, false);
        }

        private Companion() {
        }
    }

    public C1200d(@Nullable String str, boolean z) {
        this.data = str;
        this.migrationSuccessful = z;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getMigrationSuccessful() {
        return this.migrationSuccessful;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1200d)) {
            return false;
        }
        C1200d c1200d = (C1200d) other;
        return Intrinsics.m88377d(this.data, c1200d.data) && this.migrationSuccessful == c1200d.migrationSuccessful;
    }

    public int hashCode() {
        String str = this.data;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.migrationSuccessful);
    }

    @NotNull
    public String toString() {
        return "MigrationResult(data=" + this.data + ", migrationSuccessful=" + this.migrationSuccessful + ')';
    }
}
