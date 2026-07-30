package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.vzq;

/* JADX INFO: loaded from: classes2.dex */
public final class KmAnnotation {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f64434a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<String, KmAnnotationArgument> f64435b;

    /* JADX WARN: Multi-variable type inference failed */
    public KmAnnotation(@NotNull String str, @NotNull Map<String, ? extends KmAnnotationArgument> map) {
        str.getClass();
        map.getClass();
        this.f64434a = str;
        this.f64435b = map;
    }

    /* JADX INFO: renamed from: b */
    public static final CharSequence m89084b(Pair pair) {
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
        return Intrinsics.m87488d(this.f64434a, kmAnnotation.f64434a) && Intrinsics.m87488d(this.f64435b, kmAnnotation.f64435b);
    }

    public int hashCode() {
        return (this.f64434a.hashCode() * 31) + this.f64435b.hashCode();
    }

    @NotNull
    public String toString() {
        return "@" + this.f64434a + '(' + CollectionsKt.joinToString$default(MapsKt.toList(this.f64435b), null, null, null, 0, null, vzq.INSTANCE, 31, null) + ')';
    }
}
