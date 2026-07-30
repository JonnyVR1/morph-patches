package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/h5f;", "Ll/r0l0;", "", "cleanedName", "Ll/j0l0;", "outcome", "<init>", "(Ljava/lang/String;Ll/j0l0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ll/j0l0;", "()Ll/j0l0;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class h5f implements r0l0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String cleanedName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final j0l0 outcome;

    public h5f(@NotNull String str, @NotNull j0l0 j0l0Var) {
        str.getClass();
        j0l0Var.getClass();
        this.cleanedName = str;
        this.outcome = j0l0Var;
    }

    @Override // p153l.r0l0
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public j0l0 getOutcome() {
        return this.outcome;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCleanedName() {
        return this.cleanedName;
    }

    /* JADX INFO: renamed from: c */
    public boolean m133656c() {
        return r0l0.C19716a.m179239a(this);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h5f)) {
            return false;
        }
        h5f h5fVar = (h5f) other;
        return Intrinsics.m88377d(this.cleanedName, h5fVar.cleanedName) && Intrinsics.m88377d(this.outcome, h5fVar.outcome);
    }

    public int hashCode() {
        return (this.cleanedName.hashCode() * 31) + this.outcome.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventNameValidationResult(cleanedName=" + this.cleanedName + ", outcome=" + this.outcome + ')';
    }
}
