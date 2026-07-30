package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/qhi;", "", "Ll/rk20;", "network", "Ll/pyj0;", "unzip", "<init>", "(Ll/rk20;Ll/pyj0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll/rk20;", "()Ll/rk20;", "b", "Ll/pyj0;", "()Ll/pyj0;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class qhi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final rk20 network;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final pyj0 unzip;

    public qhi(@NotNull rk20 rk20Var, @NotNull pyj0 pyj0Var) {
        rk20Var.getClass();
        pyj0Var.getClass();
        this.network = rk20Var;
        this.unzip = pyj0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final rk20 getNetwork() {
        return this.network;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final pyj0 getUnzip() {
        return this.unzip;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof qhi)) {
            return false;
        }
        qhi qhiVar = (qhi) other;
        return Intrinsics.m88377d(this.network, qhiVar.network) && Intrinsics.m88377d(this.unzip, qhiVar.unzip);
    }

    public int hashCode() {
        rk20 rk20Var = this.network;
        int iHashCode = (rk20Var != null ? rk20Var.hashCode() : 0) * 31;
        pyj0 pyj0Var = this.unzip;
        return iHashCode + (pyj0Var != null ? pyj0Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FepProviders(network=" + this.network + ", unzip=" + this.unzip + ")";
    }
}
