package p149l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, m87232d2 = {"Ll/k9q0;", "", "", "workSpecId", "", "generation", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final /* data */ class k9q0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String workSpecId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int generation;

    public k9q0(@NotNull String str, int i) {
        str.getClass();
        this.workSpecId = str;
        this.generation = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k9q0)) {
            return false;
        }
        k9q0 k9q0Var = (k9q0) other;
        return Intrinsics.m87488d(this.workSpecId, k9q0Var.workSpecId) && this.generation == k9q0Var.generation;
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + Integer.hashCode(this.generation);
    }

    @NotNull
    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ')';
    }
}
