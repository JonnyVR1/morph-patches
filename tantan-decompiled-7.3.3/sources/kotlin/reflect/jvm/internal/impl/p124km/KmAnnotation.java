package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.w1r;

/* JADX INFO: loaded from: classes2.dex */
public final class KmAnnotation {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f65108a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<String, KmAnnotationArgument> f65109b;

    /* JADX WARN: Multi-variable type inference failed */
    public KmAnnotation(@NotNull String str, @NotNull Map<String, ? extends KmAnnotationArgument> map) {
        str.getClass();
        map.getClass();
        this.f65108a = str;
        this.f65109b = map;
    }

    /* JADX INFO: renamed from: b */
    public static final CharSequence m89975b(Pair pair) {
        pair.getClass();
        return ((String) pair.component1()) + " = " + ((KmAnnotationArgument) pair.component2());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmAnnotation)) {
            return false;
        }
        KmAnnotation kmAnnotation = (KmAnnotation) obj;
        return Intrinsics.m88377d(this.f65108a, kmAnnotation.f65108a) && Intrinsics.m88377d(this.f65109b, kmAnnotation.f65109b);
    }

    public int hashCode() {
        return (this.f65108a.hashCode() * 31) + this.f65109b.hashCode();
    }

    @NotNull
    public String toString() {
        return "@" + this.f65108a + '(' + CollectionsKt.joinToString$default(MapsKt.toList(this.f65109b), null, null, null, 0, null, w1r.INSTANCE, 31, null) + ')';
    }
}
