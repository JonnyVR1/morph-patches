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
    public static final FqName f65810a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ClassId f65811b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final FqName f65812c;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmInline");
        f65810a = fqName;
        f65811b = ClassId.Companion.m91045c(fqName);
        f65812c = new FqName("kotlin.jvm.JvmName");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m91786a(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        if (!(callableDescriptor instanceof PropertyGetterDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptorMo88582d0 = ((PropertyGetterDescriptor) callableDescriptor).mo88582d0();
        propertyDescriptorMo88582d0.getClass();
        return m91791f(propertyDescriptorMo88582d0);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m91787b(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).mo88300c0() instanceof InlineClassRepresentation);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m91788c(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e != null) {
            return m91787b(classifierDescriptorMo88316e);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m91789d(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).mo88300c0() instanceof MultiFieldValueClassRepresentation);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m91790e(@NotNull VariableDescriptor variableDescriptor) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentationM91984q;
        variableDescriptor.getClass();
        if (variableDescriptor.mo88446b0() != null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorMo88299b = variableDescriptor.mo88299b();
        Name nameM88537c = null;
        ClassDescriptor classDescriptor = declarationDescriptorMo88299b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo88299b : null;
        if (classDescriptor != null && (inlineClassRepresentationM91984q = DescriptorUtilsKt.m91984q(classDescriptor)) != null) {
            nameM88537c = inlineClassRepresentationM91984q.m88537c();
        }
        return Intrinsics.m87488d(nameM88537c, variableDescriptor.getName());
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m91791f(@NotNull VariableDescriptor variableDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentationMo88300c0;
        variableDescriptor.getClass();
        if (variableDescriptor.mo88446b0() != null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorMo88299b = variableDescriptor.mo88299b();
        ClassDescriptor classDescriptor = declarationDescriptorMo88299b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo88299b : null;
        if (classDescriptor == null || (valueClassRepresentationMo88300c0 = classDescriptor.mo88300c0()) == null) {
            return false;
        }
        Name name = variableDescriptor.getName();
        name.getClass();
        return valueClassRepresentationMo88300c0.mo88536a(name);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m91792g(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return m91787b(declarationDescriptor) || m91789d(declarationDescriptor);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m91793h(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e != null) {
            return m91792g(classifierDescriptorMo88316e);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m91794i(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        return (classifierDescriptorMo88316e == null || !m91789d(classifierDescriptorMo88316e) || SimpleClassicTypeSystemContext.INSTANCE.mo90292y0(kotlinType)) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final KotlinType m91795j(@NotNull KotlinType kotlinType) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentationM91984q;
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        ClassDescriptor classDescriptor = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
        if (classDescriptor == null || (inlineClassRepresentationM91984q = DescriptorUtilsKt.m91984q(classDescriptor)) == null) {
            return null;
        }
        return (SimpleType) inlineClassRepresentationM91984q.m88538d();
    }
}
