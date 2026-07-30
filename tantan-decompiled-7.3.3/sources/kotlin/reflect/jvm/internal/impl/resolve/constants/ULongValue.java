package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ULongValue extends UnsignedValueConstant<Long> {
    public ULongValue(long j) {
        super(Long.valueOf(j));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: a */
    public KotlinType mo92799a(@NotNull ModuleDescriptor moduleDescriptor) {
        SimpleType simpleTypeMo89349o;
        moduleDescriptor.getClass();
        ClassDescriptor classDescriptorM89398b = FindClassInModuleKt.m89398b(moduleDescriptor, StandardNames.FqNames.f64520F0);
        return (classDescriptorM89398b == null || (simpleTypeMo89349o = classDescriptorM89398b.mo89349o()) == null) ? ErrorUtils.m93893d(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "ULong") : simpleTypeMo89349o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return mo92809b().longValue() + ".toULong()";
    }
}
