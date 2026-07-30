package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConstantValue<T> {

    /* JADX INFO: renamed from: a */
    public final T f66523a;

    public ConstantValue(T t) {
        this.f66523a = t;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract KotlinType mo92799a(@NotNull ModuleDescriptor moduleDescriptor);

    /* JADX INFO: renamed from: b */
    public T mo92809b() {
        return this.f66523a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        T tMo92809b = mo92809b();
        ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
        return Intrinsics.m88377d(tMo92809b, constantValue != null ? constantValue.mo92809b() : null);
    }

    public int hashCode() {
        T tMo92809b = mo92809b();
        if (tMo92809b != null) {
            return tMo92809b.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(mo92809b());
    }
}
