package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class InlineClassesUtilsKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FqName f66484a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ClassId f66485b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final FqName f66486c;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmInline");
        f66484a = fqName;
        f66485b = ClassId.Companion.m91936c(fqName);
        f66486c = new FqName("kotlin.jvm.JvmName");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m92677a(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        if (!(callableDescriptor instanceof PropertyGetterDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptorMo89473d0 = ((PropertyGetterDescriptor) callableDescriptor).mo89473d0();
        propertyDescriptorMo89473d0.getClass();
        return m92682f(propertyDescriptorMo89473d0);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92678b(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).mo89191c0() instanceof InlineClassRepresentation);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m92679c(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e != null) {
            return m92678b(classifierDescriptorMo89207e);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m92680d(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).mo89191c0() instanceof MultiFieldValueClassRepresentation);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m92681e(@NotNull VariableDescriptor variableDescriptor) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentationM92875q;
        variableDescriptor.getClass();
        if (variableDescriptor.mo89337b0() != null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorMo89190b = variableDescriptor.mo89190b();
        Name nameM89428c = null;
        ClassDescriptor classDescriptor = declarationDescriptorMo89190b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo89190b : null;
        if (classDescriptor != null && (inlineClassRepresentationM92875q = DescriptorUtilsKt.m92875q(classDescriptor)) != null) {
            nameM89428c = inlineClassRepresentationM92875q.m89428c();
        }
        return Intrinsics.m88377d(nameM89428c, variableDescriptor.getName());
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m92682f(@NotNull VariableDescriptor variableDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentationMo89191c0;
        variableDescriptor.getClass();
        if (variableDescriptor.mo89337b0() != null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorMo89190b = variableDescriptor.mo89190b();
        ClassDescriptor classDescriptor = declarationDescriptorMo89190b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo89190b : null;
        if (classDescriptor == null || (valueClassRepresentationMo89191c0 = classDescriptor.mo89191c0()) == null) {
            return false;
        }
        Name name = variableDescriptor.getName();
        name.getClass();
        return valueClassRepresentationMo89191c0.mo89427a(name);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m92683g(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return m92678b(declarationDescriptor) || m92680d(declarationDescriptor);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m92684h(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e != null) {
            return m92683g(classifierDescriptorMo89207e);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m92685i(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        return (classifierDescriptorMo89207e == null || !m92680d(classifierDescriptorMo89207e) || SimpleClassicTypeSystemContext.INSTANCE.mo91183y0(kotlinType)) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final KotlinType m92686j(@NotNull KotlinType kotlinType) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentationM92875q;
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        ClassDescriptor classDescriptor = classifierDescriptorMo89207e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89207e : null;
        if (classDescriptor == null || (inlineClassRepresentationM92875q = DescriptorUtilsKt.m92875q(classDescriptor)) == null) {
            return null;
        }
        return (SimpleType) inlineClassRepresentationM92875q.m89429d();
    }
}
