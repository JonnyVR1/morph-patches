package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull DeprecationInfo deprecationInfo) {
        deprecationInfo.getClass();
        int iCompareTo = mo90259b().compareTo(deprecationInfo.mo90259b());
        if (iCompareTo == 0 && !mo92854f() && deprecationInfo.mo92854f()) {
            return 1;
        }
        return iCompareTo;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract DeprecationLevelValue mo90259b();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo92854f();
}
