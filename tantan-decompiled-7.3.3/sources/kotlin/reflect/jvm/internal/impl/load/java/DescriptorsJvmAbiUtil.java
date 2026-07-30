package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorsJvmAbiUtil {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m90260a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m90261b(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        FieldDescriptor fieldDescriptorMo89474K;
        if (callableMemberDescriptor == null) {
            m90260a(3);
        }
        if ((callableMemberDescriptor instanceof PropertyDescriptor) && (fieldDescriptorMo89474K = ((PropertyDescriptor) callableMemberDescriptor).mo89474K()) != null && fieldDescriptorMo89474K.getAnnotations().mo89530d0(JvmAbi.f65363a)) {
            return true;
        }
        return callableMemberDescriptor.getAnnotations().mo89530d0(JvmAbi.f65363a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m90262c(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m90260a(1);
        }
        return DescriptorUtils.m92674x(declarationDescriptor) && DescriptorUtils.m92673w(declarationDescriptor.mo89190b()) && !m90263d((ClassDescriptor) declarationDescriptor);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m90263d(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m90260a(2);
        }
        return CompanionObjectMappingUtilsKt.m89030a(CompanionObjectMapping.INSTANCE, classDescriptor);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m90264e(@NotNull PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            m90260a(0);
        }
        if (propertyDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (m90262c(propertyDescriptor.mo89190b())) {
            return true;
        }
        return DescriptorUtils.m92674x(propertyDescriptor.mo89190b()) && m90261b(propertyDescriptor);
    }
}
