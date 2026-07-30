package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.pipeline.RemovalReason;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m88121d2 = {"Ll/y6b0;", "", "", "originalKey", "cleanedKey", "", "Ll/mzq;", "modifications", "", "wasRemoved", "Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;", "removalReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZLcom/clevertap/android/sdk/validation/pipeline/RemovalReason;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOriginalKey", "b", "c", "Ljava/util/Set;", "()Ljava/util/Set;", Constants.INAPP_DATA_TAG, "Z", "()Z", "e", "Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;", "getRemovalReason", "()Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class y6b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String originalKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String cleanedKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Set<mzq> modifications;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean wasRemoved;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final RemovalReason removalReason;

    public y6b0(@NotNull String str, @NotNull String str2, @NotNull Set<mzq> set, boolean z, @Nullable RemovalReason removalReason) {
        str.getClass();
        str2.getClass();
        set.getClass();
        this.originalKey = str;
        this.cleanedKey = str2;
        this.modifications = set;
        this.wasRemoved = z;
        this.removalReason = removalReason;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCleanedKey() {
        return this.cleanedKey;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<mzq> m214447b() {
        return this.modifications;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getWasRemoved() {
        return this.wasRemoved;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y6b0)) {
            return false;
        }
        y6b0 y6b0Var = (y6b0) other;
        return Intrinsics.m88377d(this.originalKey, y6b0Var.originalKey) && Intrinsics.m88377d(this.cleanedKey, y6b0Var.cleanedKey) && Intrinsics.m88377d(this.modifications, y6b0Var.modifications) && this.wasRemoved == y6b0Var.wasRemoved && this.removalReason == y6b0Var.removalReason;
    }

    public int hashCode() {
        int iHashCode = ((((((this.originalKey.hashCode() * 31) + this.cleanedKey.hashCode()) * 31) + this.modifications.hashCode()) * 31) + Boolean.hashCode(this.wasRemoved)) * 31;
        RemovalReason removalReason = this.removalReason;
        return iHashCode + (removalReason == null ? 0 : removalReason.hashCode());
    }

    @NotNull
    public String toString() {
        return "PropertyKeyNormalizationResult(originalKey=" + this.originalKey + ", cleanedKey=" + this.cleanedKey + ", modifications=" + this.modifications + ", wasRemoved=" + this.wasRemoved + ", removalReason=" + this.removalReason + ')';
    }
}
