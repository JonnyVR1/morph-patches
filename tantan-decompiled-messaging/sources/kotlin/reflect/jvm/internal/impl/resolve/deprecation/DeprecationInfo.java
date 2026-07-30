package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull DeprecationInfo deprecationInfo) {
        deprecationInfo.getClass();
        int iCompareTo = mo89368b().compareTo(deprecationInfo.mo89368b());
        if (iCompareTo == 0 && !mo91963f() && deprecationInfo.mo91963f()) {
            return 1;
        }
        return iCompareTo;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract DeprecationLevelValue mo89368b();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo91963f();
}
