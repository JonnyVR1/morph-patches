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
    public KotlinType mo91908a(@NotNull ModuleDescriptor moduleDescriptor) {
        SimpleType simpleTypeMo88458o;
        moduleDescriptor.getClass();
        ClassDescriptor classDescriptorM88507b = FindClassInModuleKt.m88507b(moduleDescriptor, StandardNames.FqNames.f63844E0);
        return (classDescriptorM88507b == null || (simpleTypeMo88458o = classDescriptorM88507b.mo88458o()) == null) ? ErrorUtils.m93002d(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt") : simpleTypeMo88458o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return mo91918b().intValue() + ".toUInt()";
    }
}
