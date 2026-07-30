package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class IncompatibleVersionErrorData<T> {

    /* JADX INFO: renamed from: a */
    public final T f66691a;

    /* JADX INFO: renamed from: b */
    public final T f66692b;

    /* JADX INFO: renamed from: c */
    public final T f66693c;

    /* JADX INFO: renamed from: d */
    public final T f66694d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f66695e;

    public IncompatibleVersionErrorData(T t, T t2, T t3, T t4, @NotNull String str) {
        str.getClass();
        this.f66691a = t;
        this.f66692b = t2;
        this.f66693c = t3;
        this.f66694d = t4;
        this.f66695e = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.m88377d(this.f66691a, incompatibleVersionErrorData.f66691a) && Intrinsics.m88377d(this.f66692b, incompatibleVersionErrorData.f66692b) && Intrinsics.m88377d(this.f66693c, incompatibleVersionErrorData.f66693c) && Intrinsics.m88377d(this.f66694d, incompatibleVersionErrorData.f66694d) && Intrinsics.m88377d(this.f66695e, incompatibleVersionErrorData.f66695e);
    }

    public int hashCode() {
        T t = this.f66691a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f66692b;
        int iHashCode2 = (iHashCode + (t2 == null ? 0 : t2.hashCode())) * 31;
        T t3 = this.f66693c;
        int iHashCode3 = (iHashCode2 + (t3 == null ? 0 : t3.hashCode())) * 31;
        T t4 = this.f66694d;
        return ((iHashCode3 + (t4 != null ? t4.hashCode() : 0)) * 31) + this.f66695e.hashCode();
    }

    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f66691a + ", compilerVersion=" + this.f66692b + ", languageVersion=" + this.f66693c + ", expectedVersion=" + this.f66694d + ", filePath=" + this.f66695e + ')';
    }
}
