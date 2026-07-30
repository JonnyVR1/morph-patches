package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class JavaMethodDescriptor extends SimpleFunctionDescriptorImpl implements JavaCallableMemberDescriptor {

    /* JADX INFO: renamed from: G */
    public static final CallableDescriptor.UserDataKey<ValueParameterDescriptor> f65473G = new C15324a();

    /* JADX INFO: renamed from: H */
    public static final CallableDescriptor.UserDataKey<Boolean> f65474H = new C15325b();

    /* JADX INFO: renamed from: E */
    public ParameterNamesStatus f65475E;

    /* JADX INFO: renamed from: F */
    public final boolean f65476F;

    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        ParameterNamesStatus(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }

        @NotNull
        public static ParameterNamesStatus get(boolean z, boolean z2) {
            ParameterNamesStatus parameterNamesStatus;
            if (z) {
                parameterNamesStatus = z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                parameterNamesStatus = z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (parameterNamesStatus == null) {
                $$$reportNull$$$0(0);
            }
            return parameterNamesStatus;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$a */
    public static class C15324a implements CallableDescriptor.UserDataKey<ValueParameterDescriptor> {
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$b */
    public static class C15325b implements CallableDescriptor.UserDataKey<Boolean> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, boolean z) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
        if (declarationDescriptor == null) {
            m90451P(0);
        }
        if (annotations == null) {
            m90451P(1);
        }
        if (name == null) {
            m90451P(2);
        }
        if (kind == null) {
            m90451P(3);
        }
        if (sourceElement == null) {
            m90451P(4);
        }
        this.f65475E = null;
        this.f65476F = z;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m90451P(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: i1 */
    public static JavaMethodDescriptor m90452i1(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull SourceElement sourceElement, boolean z) {
        if (declarationDescriptor == null) {
            m90451P(5);
        }
        if (annotations == null) {
            m90451P(6);
        }
        if (name == null) {
            m90451P(7);
        }
        if (sourceElement == null) {
            m90451P(8);
        }
        return new JavaMethodDescriptor(declarationDescriptor, null, annotations, name, CallableMemberDescriptor.Kind.DECLARATION, sourceElement, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: J0 */
    public boolean mo89633J0() {
        return this.f65475E.isStable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: h1 */
    public SimpleFunctionDescriptorImpl mo89793h1(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<ReceiverParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, @NotNull List<ValueParameterDescriptor> list3, @Nullable KotlinType kotlinType, @Nullable Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @Nullable Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        if (list == null) {
            m90451P(9);
        }
        if (list2 == null) {
            m90451P(10);
        }
        if (list3 == null) {
            m90451P(11);
        }
        if (descriptorVisibility == null) {
            m90451P(12);
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplMo89793h1 = super.mo89793h1(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
        m89647Y0(OperatorChecks.INSTANCE.m94017a(simpleFunctionDescriptorImplMo89793h1).m94027a());
        if (simpleFunctionDescriptorImplMo89793h1 == null) {
            m90451P(13);
        }
        return simpleFunctionDescriptorImplMo89793h1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public JavaMethodDescriptor mo89212E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m90451P(14);
        }
        if (kind == null) {
            m90451P(15);
        }
        if (annotations == null) {
            m90451P(16);
        }
        if (sourceElement == null) {
            m90451P(17);
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement, this.f65476F);
        javaMethodDescriptor.m90455l1(mo89633J0(), mo89340k0());
        return javaMethodDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: k0 */
    public boolean mo89340k0() {
        return this.f65475E.isSynthesized;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public JavaMethodDescriptor mo90445g0(@Nullable KotlinType kotlinType, @NotNull List<KotlinType> list, @NotNull KotlinType kotlinType2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        if (list == null) {
            m90451P(19);
        }
        if (kotlinType2 == null) {
            m90451P(20);
        }
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) mo89405k().mo89420n(UtilKt.m90458a(list, mo89339g(), this)).mo89414h(kotlinType2).mo89408b(kotlinType == null ? null : DescriptorFactory.m92628i(this, kotlinType, Annotations.Companion.m89532b())).mo89419m().mo89413g().build();
        if (pair != null) {
            javaMethodDescriptor.m89637N0(pair.getFirst(), pair.getSecond());
        }
        if (javaMethodDescriptor == null) {
            m90451P(21);
        }
        return javaMethodDescriptor;
    }

    /* JADX INFO: renamed from: l1 */
    public void m90455l1(boolean z, boolean z2) {
        this.f65475E = ParameterNamesStatus.get(z, z2);
    }
}
