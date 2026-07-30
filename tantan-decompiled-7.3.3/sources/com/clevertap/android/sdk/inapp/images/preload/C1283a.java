package com.clevertap.android.sdk.inapp.images.preload;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.images.preload.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\n¨\u0006\u0012"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/images/preload/a;", "", "", "parallelDownloads", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class C1283a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int parallelDownloads;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.images.preload.a$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/images/preload/a$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/images/preload/a;", "a", "()Lcom/clevertap/android/sdk/inapp/images/preload/a;", "", "DEFAULT_PARALLEL_DOWNLOAD", "I", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C1283a m6569a() {
            return new C1283a(4);
        }

        private Companion() {
        }
    }

    public C1283a(int i) {
        this.parallelDownloads = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getParallelDownloads() {
        return this.parallelDownloads;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C1283a) && this.parallelDownloads == ((C1283a) other).parallelDownloads;
    }

    public int hashCode() {
        return Integer.hashCode(this.parallelDownloads);
    }

    @NotNull
    public String toString() {
        return "FilePreloadConfig(parallelDownloads=" + this.parallelDownloads + ')';
    }
}
