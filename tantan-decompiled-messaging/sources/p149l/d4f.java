package p149l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/d4f;", "Ll/lrk0;", "", "cleanedName", "Ll/drk0;", "outcome", "<init>", "(Ljava/lang/String;Ll/drk0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ll/drk0;", "()Ll/drk0;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class d4f implements lrk0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String cleanedName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final drk0 outcome;

    public d4f(@NotNull String str, @NotNull drk0 drk0Var) {
        str.getClass();
        drk0Var.getClass();
        this.cleanedName = str;
        this.outcome = drk0Var;
    }

    @Override // p149l.lrk0
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public drk0 getOutcome() {
        return this.outcome;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCleanedName() {
        return this.cleanedName;
    }

    /* JADX INFO: renamed from: c */
    public boolean m109984c() {
        return lrk0.C18310a.m151494a(this);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d4f)) {
            return false;
        }
        d4f d4fVar = (d4f) other;
        return Intrinsics.m87488d(this.cleanedName, d4fVar.cleanedName) && Intrinsics.m87488d(this.outcome, d4fVar.outcome);
    }

    public int hashCode() {
        return (this.cleanedName.hashCode() * 31) + this.outcome.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventNameValidationResult(cleanedName=" + this.cleanedName + ", outcome=" + this.outcome + ')';
    }
}
