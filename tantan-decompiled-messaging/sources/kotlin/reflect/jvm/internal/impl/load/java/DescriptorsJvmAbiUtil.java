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
    public static /* synthetic */ void m89369a(int i) {
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
    public static boolean m89370b(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        FieldDescriptor fieldDescriptorMo88583K;
        if (callableMemberDescriptor == null) {
            m89369a(3);
        }
        if ((callableMemberDescriptor instanceof PropertyDescriptor) && (fieldDescriptorMo88583K = ((PropertyDescriptor) callableMemberDescriptor).mo88583K()) != null && fieldDescriptorMo88583K.getAnnotations().mo88639c0(JvmAbi.f64689a)) {
            return true;
        }
        return callableMemberDescriptor.getAnnotations().mo88639c0(JvmAbi.f64689a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m89371c(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m89369a(1);
        }
        return DescriptorUtils.m91783x(declarationDescriptor) && DescriptorUtils.m91782w(declarationDescriptor.mo88299b()) && !m89372d((ClassDescriptor) declarationDescriptor);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m89372d(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m89369a(2);
        }
        return CompanionObjectMappingUtilsKt.m88139a(CompanionObjectMapping.INSTANCE, classDescriptor);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m89373e(@NotNull PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            m89369a(0);
        }
        if (propertyDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (m89371c(propertyDescriptor.mo88299b())) {
            return true;
        }
        return DescriptorUtils.m91783x(propertyDescriptor.mo88299b()) && m89370b(propertyDescriptor);
    }
}
