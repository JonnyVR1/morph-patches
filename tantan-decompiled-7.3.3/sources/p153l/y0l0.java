package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.pipeline.ModificationReason;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/y0l0;", "", "", Constants.KEY_KEY, "originalValue", "cleanedValue", "", "Lcom/clevertap/android/sdk/validation/pipeline/ModificationReason;", "reasons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "()Ljava/util/List;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class y0l0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String originalValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String cleanedValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<ModificationReason> reasons;

    /* JADX WARN: Multi-variable type inference failed */
    public y0l0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<? extends ModificationReason> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.key = str;
        this.originalValue = str2;
        this.cleanedValue = str3;
        this.reasons = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCleanedValue() {
        return this.cleanedValue;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOriginalValue() {
        return this.originalValue;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<ModificationReason> m213883d() {
        return this.reasons;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y0l0)) {
            return false;
        }
        y0l0 y0l0Var = (y0l0) other;
        return Intrinsics.m88377d(this.key, y0l0Var.key) && Intrinsics.m88377d(this.originalValue, y0l0Var.originalValue) && Intrinsics.m88377d(this.cleanedValue, y0l0Var.cleanedValue) && Intrinsics.m88377d(this.reasons, y0l0Var.reasons);
    }

    public int hashCode() {
        return (((((this.key.hashCode() * 31) + this.originalValue.hashCode()) * 31) + this.cleanedValue.hashCode()) * 31) + this.reasons.hashCode();
    }

    @NotNull
    public String toString() {
        return "ValueModification(key=" + this.key + ", originalValue=" + this.originalValue + ", cleanedValue=" + this.cleanedValue + ", reasons=" + this.reasons + ')';
    }
}
