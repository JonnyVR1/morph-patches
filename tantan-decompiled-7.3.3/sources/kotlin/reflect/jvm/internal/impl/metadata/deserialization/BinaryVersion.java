package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final int[] f66009a;

    /* JADX INFO: renamed from: b */
    public final int f66010b;

    /* JADX INFO: renamed from: c */
    public final int f66011c;

    /* JADX INFO: renamed from: d */
    public final int f66012d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<Integer> f66013e;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BinaryVersion(@NotNull int... iArr) {
        List<Integer> listEmptyList;
        iArr.getClass();
        this.f66009a = iArr;
        Integer orNull = ArraysKt.getOrNull(iArr, 0);
        this.f66010b = orNull != null ? orNull.intValue() : -1;
        Integer orNull2 = ArraysKt.getOrNull(iArr, 1);
        this.f66011c = orNull2 != null ? orNull2.intValue() : -1;
        Integer orNull3 = ArraysKt.getOrNull(iArr, 2);
        this.f66012d = orNull3 != null ? orNull3.intValue() : -1;
        if (iArr.length <= 3) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listEmptyList = CollectionsKt.toList(ArraysKt.asList(iArr).subList(3, iArr.length));
        }
        this.f66013e = listEmptyList;
    }

    /* JADX INFO: renamed from: a */
    public final int m91757a() {
        return this.f66010b;
    }

    /* JADX INFO: renamed from: b */
    public final int m91758b() {
        return this.f66011c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m91759c(int i, int i2, int i3) {
        int i4 = this.f66010b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f66011c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f66012d >= i3;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m91760d(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return m91759c(binaryVersion.f66010b, binaryVersion.f66011c, binaryVersion.f66012d);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m91761e(int i, int i2, int i3) {
        int i4 = this.f66010b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.f66011c;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.f66012d <= i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !Intrinsics.m88377d(getClass(), obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.f66010b == binaryVersion.f66010b && this.f66011c == binaryVersion.f66011c && this.f66012d == binaryVersion.f66012d && Intrinsics.m88377d(this.f66013e, binaryVersion.f66013e);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m91762f(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        int i = this.f66010b;
        if (i == 0) {
            return binaryVersion.f66010b == 0 && this.f66011c == binaryVersion.f66011c;
        }
        return i == binaryVersion.f66010b && this.f66011c <= binaryVersion.f66011c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final int[] m91763g() {
        return this.f66009a;
    }

    public int hashCode() {
        int i = this.f66010b;
        int i2 = i + (i * 31) + this.f66011c;
        int i3 = i2 + (i2 * 31) + this.f66012d;
        return i3 + (i3 * 31) + this.f66013e.hashCode();
    }

    @NotNull
    public String toString() {
        int[] iArrM91763g = m91763g();
        ArrayList arrayList = new ArrayList();
        for (int i : iArrM91763g) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
