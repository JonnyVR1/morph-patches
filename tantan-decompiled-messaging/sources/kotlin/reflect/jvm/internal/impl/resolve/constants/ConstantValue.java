package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConstantValue<T> {

    /* JADX INFO: renamed from: a */
    public final T f65849a;

    public ConstantValue(T t) {
        this.f65849a = t;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract KotlinType mo91908a(@NotNull ModuleDescriptor moduleDescriptor);

    /* JADX INFO: renamed from: b */
    public T mo91918b() {
        return this.f65849a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        T tMo91918b = mo91918b();
        ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
        return Intrinsics.m87488d(tMo91918b, constantValue != null ? constantValue.mo91918b() : null);
    }

    public int hashCode() {
        T tMo91918b = mo91918b();
        if (tMo91918b != null) {
            return tMo91918b.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(mo91918b());
    }
}
