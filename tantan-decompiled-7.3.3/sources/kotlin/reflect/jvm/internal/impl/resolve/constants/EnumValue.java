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
    public final ClassId f66524b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Name f66525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumValue(@NotNull ClassId classId, @NotNull Name name) {
        super(TuplesKt.m88129a(classId, name));
        classId.getClass();
        name.getClass();
        this.f66524b = classId;
        this.f66525c = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: a */
    public KotlinType mo92799a(@NotNull ModuleDescriptor moduleDescriptor) {
        SimpleType simpleTypeMo89349o;
        moduleDescriptor.getClass();
        ClassDescriptor classDescriptorM89398b = FindClassInModuleKt.m89398b(moduleDescriptor, this.f66524b);
        if (classDescriptorM89398b != null) {
            if (!DescriptorUtils.m92638A(classDescriptorM89398b)) {
                classDescriptorM89398b = null;
            }
            if (classDescriptorM89398b != null && (simpleTypeMo89349o = classDescriptorM89398b.mo89349o()) != null) {
                return simpleTypeMo89349o;
            }
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = this.f66524b.toString();
        String string2 = this.f66525c.toString();
        string2.getClass();
        return ErrorUtils.m93893d(errorTypeKind, string, string2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Name m92817c() {
        return this.f66525c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f66524b.m91931h());
        sb.append('.');
        sb.append(this.f66525c);
        return sb.toString();
    }
}
