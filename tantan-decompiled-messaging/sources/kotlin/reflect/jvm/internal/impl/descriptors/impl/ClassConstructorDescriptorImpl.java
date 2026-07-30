package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ClassConstructorDescriptorImpl extends FunctionDescriptorImpl implements ClassConstructorDescriptor {

    /* JADX INFO: renamed from: E */
    public final boolean f64120E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassConstructorDescriptorImpl(@NotNull ClassDescriptor classDescriptor, @Nullable ConstructorDescriptor constructorDescriptor, @NotNull Annotations annotations, boolean z, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(classDescriptor, constructorDescriptor, annotations, SpecialNames.f65494i, kind, sourceElement);
        if (classDescriptor == null) {
            m88693P(0);
        }
        if (annotations == null) {
            m88693P(1);
        }
        if (kind == null) {
            m88693P(2);
        }
        if (sourceElement == null) {
            m88693P(3);
        }
        this.f64120E = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m88693P(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = Constants.COPY_TYPE;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = PushService.COMMAND_CREATE;
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: g1 */
    public static ClassConstructorDescriptorImpl m88694g1(@NotNull ClassDescriptor classDescriptor, @NotNull Annotations annotations, boolean z, @NotNull SourceElement sourceElement) {
        if (classDescriptor == null) {
            m88693P(4);
        }
        if (annotations == null) {
            m88693P(5);
        }
        if (sourceElement == null) {
            m88693P(6);
        }
        return new ClassConstructorDescriptorImpl(classDescriptor, null, annotations, z, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    @NotNull
    /* JADX INFO: renamed from: F */
    public ClassDescriptor mo88462F() {
        ClassDescriptor classDescriptorMo88299b = mo88299b();
        if (classDescriptorMo88299b == null) {
            m88693P(18);
        }
        return classDescriptorMo88299b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: N */
    public void mo88451N(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m88693P(22);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo87843f(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public ClassConstructorDescriptor mo88445a() {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.mo88445a();
        if (classConstructorDescriptor == null) {
            m88693P(19);
        }
        return classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    /* JADX INFO: renamed from: c */
    public ClassConstructorDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m88693P(20);
        }
        return (ClassConstructorDescriptor) super.mo88453c(typeSubstitutor);
    }

    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final List<ReceiverParameterDescriptor> m88696d1() {
        ClassDescriptor classDescriptorMo88299b = mo88299b();
        if (classDescriptorMo88299b.mo88457f0().isEmpty()) {
            List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
            if (list == null) {
                m88693P(16);
            }
            return list;
        }
        List<ReceiverParameterDescriptor> listMo88457f0 = classDescriptorMo88299b.mo88457f0();
        if (listMo88457f0 == null) {
            m88693P(15);
        }
        return listMo88457f0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<? extends FunctionDescriptor> mo88447e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            m88693P(21);
        }
        return set;
    }

    @Nullable
    /* JADX INFO: renamed from: e1 */
    public ReceiverParameterDescriptor m88697e1() {
        ClassDescriptor classDescriptorMo88299b = mo88299b();
        if (!classDescriptorMo88299b.mo88312t()) {
            return null;
        }
        DeclarationDescriptor declarationDescriptorMo88299b = classDescriptorMo88299b.mo88299b();
        if (declarationDescriptorMo88299b instanceof ClassDescriptor) {
            return ((ClassDescriptor) declarationDescriptorMo88299b).mo88456R();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public ClassConstructorDescriptor mo88452a0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.mo88452a0(declarationDescriptor, modality, descriptorVisibility, kind, z);
        if (classConstructorDescriptor == null) {
            m88693P(27);
        }
        return classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public ClassConstructorDescriptorImpl mo88321E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m88693P(23);
        }
        if (kind == null) {
            m88693P(24);
        }
        if (annotations == null) {
            m88693P(25);
        }
        if (sourceElement == null) {
            m88693P(26);
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            return new ClassConstructorDescriptorImpl((ClassDescriptor) declarationDescriptor, this, annotations, this.f64120E, kind2, sourceElement);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    /* JADX INFO: renamed from: i0 */
    public boolean mo88463i0() {
        return this.f64120E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor mo88299b() {
        ClassDescriptor classDescriptor = (ClassDescriptor) super.mo88299b();
        if (classDescriptor == null) {
            m88693P(17);
        }
        return classDescriptor;
    }

    /* JADX INFO: renamed from: j1 */
    public ClassConstructorDescriptorImpl m88701j1(@NotNull List<ValueParameterDescriptor> list, @NotNull DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            m88693P(13);
        }
        if (descriptorVisibility == null) {
            m88693P(14);
        }
        m88702k1(list, descriptorVisibility, mo88299b().mo88309p());
        return this;
    }

    /* JADX INFO: renamed from: k1 */
    public ClassConstructorDescriptorImpl m88702k1(@NotNull List<ValueParameterDescriptor> list, @NotNull DescriptorVisibility descriptorVisibility, @NotNull List<TypeParameterDescriptor> list2) {
        if (list == null) {
            m88693P(10);
        }
        if (descriptorVisibility == null) {
            m88693P(11);
        }
        if (list2 == null) {
            m88693P(12);
        }
        super.mo88743K0(null, m88697e1(), m88696d1(), list2, list, null, Modality.FINAL, descriptorVisibility);
        return this;
    }
}
