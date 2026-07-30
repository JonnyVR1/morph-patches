package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class IncompatibleVersionErrorData<T> {

    /* JADX INFO: renamed from: a */
    public final T f66017a;

    /* JADX INFO: renamed from: b */
    public final T f66018b;

    /* JADX INFO: renamed from: c */
    public final T f66019c;

    /* JADX INFO: renamed from: d */
    public final T f66020d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f66021e;

    public IncompatibleVersionErrorData(T t, T t2, T t3, T t4, @NotNull String str) {
        str.getClass();
        this.f66017a = t;
        this.f66018b = t2;
        this.f66019c = t3;
        this.f66020d = t4;
        this.f66021e = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.m87488d(this.f66017a, incompatibleVersionErrorData.f66017a) && Intrinsics.m87488d(this.f66018b, incompatibleVersionErrorData.f66018b) && Intrinsics.m87488d(this.f66019c, incompatibleVersionErrorData.f66019c) && Intrinsics.m87488d(this.f66020d, incompatibleVersionErrorData.f66020d) && Intrinsics.m87488d(this.f66021e, incompatibleVersionErrorData.f66021e);
    }

    public int hashCode() {
        T t = this.f66017a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f66018b;
        int iHashCode2 = (iHashCode + (t2 == null ? 0 : t2.hashCode())) * 31;
        T t3 = this.f66019c;
        int iHashCode3 = (iHashCode2 + (t3 == null ? 0 : t3.hashCode())) * 31;
        T t4 = this.f66020d;
        return ((iHashCode3 + (t4 != null ? t4.hashCode() : 0)) * 31) + this.f66021e.hashCode();
    }

    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f66017a + ", compilerVersion=" + this.f66018b + ", languageVersion=" + this.f66019c + ", expectedVersion=" + this.f66020d + ", filePath=" + this.f66021e + ')';
    }
}
