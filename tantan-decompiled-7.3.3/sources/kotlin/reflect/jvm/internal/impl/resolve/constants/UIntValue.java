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
public final class UIntValue extends UnsignedValueConstant<Integer> {
    public UIntValue(int i) {
        super(Integer.valueOf(i));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: a */
    public KotlinType mo92799a(@NotNull ModuleDescriptor moduleDescriptor) {
        SimpleType simpleTypeMo89349o;
        moduleDescriptor.getClass();
        ClassDescriptor classDescriptorM89398b = FindClassInModuleKt.m89398b(moduleDescriptor, StandardNames.FqNames.f64518E0);
        return (classDescriptorM89398b == null || (simpleTypeMo89349o = classDescriptorM89398b.mo89349o()) == null) ? ErrorUtils.m93893d(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt") : simpleTypeMo89349o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return mo92809b().intValue() + ".toUInt()";
    }
}
