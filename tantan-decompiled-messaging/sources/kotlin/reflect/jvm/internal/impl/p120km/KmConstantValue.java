package kotlin.reflect.jvm.internal.impl.p120km;

import kotlin.contracts.ExperimentalContracts;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalContracts
public final class KmConstantValue {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f64479a;

    public KmConstantValue(@Nullable Object obj) {
        this.f64479a = obj;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KmConstantValue) && Intrinsics.m87488d(this.f64479a, ((KmConstantValue) obj).f64479a);
    }

    public int hashCode() {
        Object obj = this.f64479a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public String toString() {
        return "KmConstantValue(value=" + this.f64479a + ')';
    }
}
