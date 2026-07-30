package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/ct4;", "Ll/r0l0;", "", "itemsCount", "Ll/j0l0;", "outcome", "<init>", "(ILl/j0l0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getItemsCount", "b", "Ll/j0l0;", "()Ll/j0l0;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class ct4 implements r0l0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int itemsCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final j0l0 outcome;

    public ct4(int i, @NotNull j0l0 j0l0Var) {
        j0l0Var.getClass();
        this.itemsCount = i;
        this.outcome = j0l0Var;
    }

    @Override // p153l.r0l0
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public j0l0 getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: b */
    public boolean m112443b() {
        return r0l0.C19716a.m179239a(this);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ct4)) {
            return false;
        }
        ct4 ct4Var = (ct4) other;
        return this.itemsCount == ct4Var.itemsCount && Intrinsics.m88377d(this.outcome, ct4Var.outcome);
    }

    public int hashCode() {
        return (Integer.hashCode(this.itemsCount) * 31) + this.outcome.hashCode();
    }

    @NotNull
    public String toString() {
        return "ChargedEventItemsValidationResult(itemsCount=" + this.itemsCount + ", outcome=" + this.outcome + ')';
    }
}
