package kotlin.reflect.jvm.internal.impl.p124km;

import kotlin.contracts.ExperimentalContracts;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalContracts
public final class KmConstantValue {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f65153a;

    public KmConstantValue(@Nullable Object obj) {
        this.f65153a = obj;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KmConstantValue) && Intrinsics.m88377d(this.f65153a, ((KmConstantValue) obj).f65153a);
    }

    public int hashCode() {
        Object obj = this.f65153a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public String toString() {
        return "KmConstantValue(value=" + this.f65153a + ')';
    }
}
