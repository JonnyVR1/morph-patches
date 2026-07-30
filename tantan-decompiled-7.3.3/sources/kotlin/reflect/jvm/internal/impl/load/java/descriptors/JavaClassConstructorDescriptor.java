package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {

    /* JADX INFO: renamed from: F */
    public Boolean f65468F;

    /* JADX INFO: renamed from: G */
    public Boolean f65469G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor, @Nullable JavaClassConstructorDescriptor javaClassConstructorDescriptor, @NotNull Annotations annotations, boolean z, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z, kind, sourceElement);
        if (classDescriptor == null) {
            m90446P(0);
        }
        if (annotations == null) {
            m90446P(1);
        }
        if (kind == null) {
            m90446P(2);
        }
        if (sourceElement == null) {
            m90446P(3);
        }
        this.f65468F = null;
        this.f65469G = null;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m90446P(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: m1 */
    public static JavaClassConstructorDescriptor m90447m1(@NotNull ClassDescriptor classDescriptor, @NotNull Annotations annotations, boolean z, @NotNull SourceElement sourceElement) {
        if (classDescriptor == null) {
            m90446P(4);
        }
        if (annotations == null) {
            m90446P(5);
        }
        if (sourceElement == null) {
            m90446P(6);
        }
        return new JavaClassConstructorDescriptor(classDescriptor, null, annotations, z, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: J0 */
    public boolean mo89633J0() {
        return this.f65468F.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: R0 */
    public void mo89641R0(boolean z) {
        this.f65468F = Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: S0 */
    public void mo89642S0(boolean z) {
        this.f65469G = Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: k0 */
    public boolean mo89340k0() {
        return this.f65469G.booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public JavaClassConstructorDescriptor m90448l1(@NotNull ClassDescriptor classDescriptor, @Nullable JavaClassConstructorDescriptor javaClassConstructorDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, @NotNull Annotations annotations) {
        if (classDescriptor == null) {
            m90446P(12);
        }
        if (kind == null) {
            m90446P(13);
        }
        if (sourceElement == null) {
            m90446P(14);
        }
        if (annotations == null) {
            m90446P(15);
        }
        return new JavaClassConstructorDescriptor(classDescriptor, javaClassConstructorDescriptor, annotations, this.f64794E, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public JavaClassConstructorDescriptor mo89212E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m90446P(7);
        }
        if (kind == null) {
            m90446P(8);
        }
        if (annotations == null) {
            m90446P(9);
        }
        if (sourceElement == null) {
            m90446P(10);
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            JavaClassConstructorDescriptor javaClassConstructorDescriptorM90448l1 = m90448l1((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, kind, sourceElement, annotations);
            javaClassConstructorDescriptorM90448l1.mo89641R0(mo89633J0());
            javaClassConstructorDescriptorM90448l1.mo89642S0(mo89340k0());
            return javaClassConstructorDescriptorM90448l1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public JavaClassConstructorDescriptor mo90445g0(@Nullable KotlinType kotlinType, @NotNull List<KotlinType> list, @NotNull KotlinType kotlinType2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        if (list == null) {
            m90446P(16);
        }
        if (kotlinType2 == null) {
            m90446P(17);
        }
        JavaClassConstructorDescriptor javaClassConstructorDescriptorMo89212E0 = mo89212E0(mo89190b(), null, getKind(), null, getAnnotations(), getSource());
        javaClassConstructorDescriptorMo89212E0.mo89634K0(kotlinType == null ? null : DescriptorFactory.m92628i(javaClassConstructorDescriptorMo89212E0, kotlinType, Annotations.Companion.m89532b()), mo89335Y(), CollectionsKt.emptyList(), getTypeParameters(), UtilKt.m90458a(list, mo89339g(), javaClassConstructorDescriptorMo89212E0), kotlinType2, mo89194i(), getVisibility());
        if (pair != null) {
            javaClassConstructorDescriptorMo89212E0.m89637N0(pair.getFirst(), pair.getSecond());
        }
        return javaClassConstructorDescriptorMo89212E0;
    }
}
