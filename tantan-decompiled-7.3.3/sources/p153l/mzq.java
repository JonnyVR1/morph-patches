package p153l;

import com.clevertap.android.sdk.validation.pipeline.ModificationReason;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/mzq;", "", "", "originalKey", "cleanedKey", "", "Lcom/clevertap/android/sdk/validation/pipeline/ModificationReason;", "reasons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class mzq {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String originalKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String cleanedKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<ModificationReason> reasons;

    /* JADX WARN: Multi-variable type inference failed */
    public mzq(@NotNull String str, @NotNull String str2, @NotNull List<? extends ModificationReason> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.originalKey = str;
        this.cleanedKey = str2;
        this.reasons = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCleanedKey() {
        return this.cleanedKey;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOriginalKey() {
        return this.originalKey;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<ModificationReason> m160919c() {
        return this.reasons;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof mzq)) {
            return false;
        }
        mzq mzqVar = (mzq) other;
        return Intrinsics.m88377d(this.originalKey, mzqVar.originalKey) && Intrinsics.m88377d(this.cleanedKey, mzqVar.cleanedKey) && Intrinsics.m88377d(this.reasons, mzqVar.reasons);
    }

    public int hashCode() {
        return (((this.originalKey.hashCode() * 31) + this.cleanedKey.hashCode()) * 31) + this.reasons.hashCode();
    }

    @NotNull
    public String toString() {
        return "KeyModification(originalKey=" + this.originalKey + ", cleanedKey=" + this.cleanedKey + ", reasons=" + this.reasons + ')';
    }
}
