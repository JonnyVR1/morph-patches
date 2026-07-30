package p153l;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/p85;", "", "", "", "toDelete", "Ll/ow3;", "finalList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final /* data */ class p85 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<String> toDelete;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<ow3> finalList;

    /* JADX WARN: Multi-variable type inference failed */
    public p85(@NotNull List<String> list, @NotNull List<? extends ow3> list2) {
        list.getClass();
        list2.getClass();
        this.toDelete = list;
        this.finalList = list2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<ow3> m171181a() {
        return this.finalList;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<String> m171182b() {
        return this.toDelete;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p85)) {
            return false;
        }
        p85 p85Var = (p85) other;
        return Intrinsics.m88377d(this.toDelete, p85Var.toDelete) && Intrinsics.m88377d(this.finalList, p85Var.finalList);
    }

    public int hashCode() {
        return (this.toDelete.hashCode() * 31) + this.finalList.hashCode();
    }

    @NotNull
    public String toString() {
        return "CleanupResult(toDelete=" + this.toDelete + ", finalList=" + this.finalList + ')';
    }
}
