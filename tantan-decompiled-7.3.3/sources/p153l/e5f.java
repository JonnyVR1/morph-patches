package p153l;

import com.clevertap.android.sdk.validation.pipeline.ModificationReason;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/e5f;", "", "", "originalName", "cleanedName", "", "Lcom/clevertap/android/sdk/validation/pipeline/ModificationReason;", "modifications", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class e5f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final String originalName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String cleanedName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Set<ModificationReason> modifications;

    /* JADX WARN: Multi-variable type inference failed */
    public e5f(@Nullable String str, @NotNull String str2, @NotNull Set<? extends ModificationReason> set) {
        str2.getClass();
        set.getClass();
        this.originalName = str;
        this.cleanedName = str2;
        this.modifications = set;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCleanedName() {
        return this.cleanedName;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<ModificationReason> m119531b() {
        return this.modifications;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOriginalName() {
        return this.originalName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e5f)) {
            return false;
        }
        e5f e5fVar = (e5f) other;
        return Intrinsics.m88377d(this.originalName, e5fVar.originalName) && Intrinsics.m88377d(this.cleanedName, e5fVar.cleanedName) && Intrinsics.m88377d(this.modifications, e5fVar.modifications);
    }

    public int hashCode() {
        String str = this.originalName;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.cleanedName.hashCode()) * 31) + this.modifications.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventNameNormalizationResult(originalName=" + this.originalName + ", cleanedName=" + this.cleanedName + ", modifications=" + this.modifications + ')';
    }
}
