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
    public final int[] f65335a;

    /* JADX INFO: renamed from: b */
    public final int f65336b;

    /* JADX INFO: renamed from: c */
    public final int f65337c;

    /* JADX INFO: renamed from: d */
    public final int f65338d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<Integer> f65339e;

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
        this.f65335a = iArr;
        Integer orNull = ArraysKt.getOrNull(iArr, 0);
        this.f65336b = orNull != null ? orNull.intValue() : -1;
        Integer orNull2 = ArraysKt.getOrNull(iArr, 1);
        this.f65337c = orNull2 != null ? orNull2.intValue() : -1;
        Integer orNull3 = ArraysKt.getOrNull(iArr, 2);
        this.f65338d = orNull3 != null ? orNull3.intValue() : -1;
        if (iArr.length <= 3) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listEmptyList = CollectionsKt.toList(ArraysKt.asList(iArr).subList(3, iArr.length));
        }
        this.f65339e = listEmptyList;
    }

    /* JADX INFO: renamed from: a */
    public final int m90866a() {
        return this.f65336b;
    }

    /* JADX INFO: renamed from: b */
    public final int m90867b() {
        return this.f65337c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90868c(int i, int i2, int i3) {
        int i4 = this.f65336b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f65337c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f65338d >= i3;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90869d(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return m90868c(binaryVersion.f65336b, binaryVersion.f65337c, binaryVersion.f65338d);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m90870e(int i, int i2, int i3) {
        int i4 = this.f65336b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.f65337c;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.f65338d <= i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !Intrinsics.m87488d(getClass(), obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.f65336b == binaryVersion.f65336b && this.f65337c == binaryVersion.f65337c && this.f65338d == binaryVersion.f65338d && Intrinsics.m87488d(this.f65339e, binaryVersion.f65339e);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m90871f(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        int i = this.f65336b;
        if (i == 0) {
            return binaryVersion.f65336b == 0 && this.f65337c == binaryVersion.f65337c;
        }
        return i == binaryVersion.f65336b && this.f65337c <= binaryVersion.f65337c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final int[] m90872g() {
        return this.f65335a;
    }

    public int hashCode() {
        int i = this.f65336b;
        int i2 = i + (i * 31) + this.f65337c;
        int i3 = i2 + (i2 * 31) + this.f65338d;
        return i3 + (i3 * 31) + this.f65339e.hashCode();
    }

    @NotNull
    public String toString() {
        int[] iArrM90872g = m90872g();
        ArrayList arrayList = new ArrayList();
        for (int i : iArrM90872g) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
