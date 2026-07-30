package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ClassId f65850b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Name f65851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumValue(@NotNull ClassId classId, @NotNull Name name) {
        super(TuplesKt.m87240a(classId, name));
        classId.getClass();
        name.getClass();
        this.f65850b = classId;
        this.f65851c = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: a */
    public KotlinType mo91908a(@NotNull ModuleDescriptor moduleDescriptor) {
        SimpleType simpleTypeMo88458o;
        moduleDescriptor.getClass();
        ClassDescriptor classDescriptorM88507b = FindClassInModuleKt.m88507b(moduleDescriptor, this.f65850b);
        if (classDescriptorM88507b != null) {
            if (!DescriptorUtils.m91747A(classDescriptorM88507b)) {
                classDescriptorM88507b = null;
            }
            if (classDescriptorM88507b != null && (simpleTypeMo88458o = classDescriptorM88507b.mo88458o()) != null) {
                return simpleTypeMo88458o;
            }
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = this.f65850b.toString();
        String string2 = this.f65851c.toString();
        string2.getClass();
        return ErrorUtils.m93002d(errorTypeKind, string, string2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Name m91926c() {
        return this.f65851c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f65850b.m91040h());
        sb.append('.');
        sb.append(this.f65851c);
        return sb.toString();
    }
}
