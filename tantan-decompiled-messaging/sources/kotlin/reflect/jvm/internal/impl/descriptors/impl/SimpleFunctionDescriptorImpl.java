package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.facebook.AuthenticationTokenClaims;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleFunctionDescriptorImpl extends FunctionDescriptorImpl implements SimpleFunctionDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFunctionDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
        if (declarationDescriptor == null) {
            m88897P(0);
        }
        if (annotations == null) {
            m88897P(1);
        }
        if (name == null) {
            m88897P(2);
        }
        if (kind == null) {
            m88897P(3);
        }
        if (sourceElement == null) {
            m88897P(4);
        }
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m88897P(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = Constants.COPY_TYPE;
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = PushService.COMMAND_CREATE;
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: e1 */
    public static SimpleFunctionDescriptorImpl m88898e1(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m88897P(5);
        }
        if (annotations == null) {
            m88897P(6);
        }
        if (name == null) {
            m88897P(7);
        }
        if (kind == null) {
            m88897P(8);
        }
        if (sourceElement == null) {
            m88897P(9);
        }
        return new SimpleFunctionDescriptorImpl(declarationDescriptor, null, annotations, name, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public FunctionDescriptorImpl mo88321E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m88897P(25);
        }
        if (kind == null) {
            m88897P(26);
        }
        if (annotations == null) {
            m88897P(27);
        }
        if (sourceElement == null) {
            m88897P(28);
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        return new SimpleFunctionDescriptorImpl(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public SimpleFunctionDescriptor mo88452a0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) super.mo88452a0(declarationDescriptor, modality, descriptorVisibility, kind, z);
        if (simpleFunctionDescriptor == null) {
            m88897P(29);
        }
        return simpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public SimpleFunctionDescriptor mo88445a() {
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) super.mo88445a();
        if (simpleFunctionDescriptor == null) {
            m88897P(24);
        }
        return simpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public SimpleFunctionDescriptorImpl mo88743K0(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<ReceiverParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, @NotNull List<ValueParameterDescriptor> list3, @Nullable KotlinType kotlinType, @Nullable Modality modality, @NotNull DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            m88897P(14);
        }
        if (list2 == null) {
            m88897P(15);
        }
        if (list3 == null) {
            m88897P(16);
        }
        if (descriptorVisibility == null) {
            m88897P(17);
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplMo88902h1 = mo88902h1(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, null);
        if (simpleFunctionDescriptorImplMo88902h1 == null) {
            m88897P(18);
        }
        return simpleFunctionDescriptorImplMo88902h1;
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public SimpleFunctionDescriptorImpl mo88902h1(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<ReceiverParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, @NotNull List<ValueParameterDescriptor> list3, @Nullable KotlinType kotlinType, @Nullable Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @Nullable Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        if (list == null) {
            m88897P(19);
        }
        if (list2 == null) {
            m88897P(20);
        }
        if (list3 == null) {
            m88897P(21);
        }
        if (descriptorVisibility == null) {
            m88897P(22);
        }
        super.mo88743K0(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility);
        if (map != null && !map.isEmpty()) {
            this.f64155D = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    /* JADX INFO: renamed from: k */
    public FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> mo88514k() {
        FunctionDescriptor.CopyBuilder copyBuilderMo88514k = super.mo88514k();
        if (copyBuilderMo88514k == null) {
            m88897P(30);
        }
        return copyBuilderMo88514k;
    }
}
