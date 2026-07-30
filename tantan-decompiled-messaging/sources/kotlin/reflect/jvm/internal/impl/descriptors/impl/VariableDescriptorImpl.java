package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VariableDescriptorImpl extends DeclarationDescriptorNonRootImpl implements VariableDescriptor {

    /* JADX INFO: renamed from: e */
    public KotlinType f64312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @Nullable KotlinType kotlinType, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (declarationDescriptor == null) {
            m88934P(0);
        }
        if (annotations == null) {
            m88934P(1);
        }
        if (name == null) {
            m88934P(2);
        }
        if (sourceElement == null) {
            m88934P(3);
        }
        this.f64312e = kotlinType;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m88934P(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public VariableDescriptor mo88445a() {
        VariableDescriptor variableDescriptor = (VariableDescriptor) super.mo88445a();
        if (variableDescriptor == null) {
            m88934P(5);
        }
        return variableDescriptor;
    }

    /* JADX INFO: renamed from: D0 */
    public void m88935D0(KotlinType kotlinType) {
        this.f64312e = kotlinType;
    }

    /* JADX INFO: renamed from: Y */
    public ReceiverParameterDescriptor mo88444Y() {
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public ReceiverParameterDescriptor mo88446b0() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ DeclarationDescriptorNonRoot mo88453c(TypeSubstitutor typeSubstitutor) {
        return mo88453c(typeSubstitutor);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<? extends CallableDescriptor> mo88447e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            m88934P(7);
        }
        return set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<ValueParameterDescriptor> mo88448g() {
        List<ValueParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m88934P(6);
        }
        return list;
    }

    @NotNull
    public KotlinType getReturnType() {
        KotlinType type = getType();
        if (type == null) {
            m88934P(10);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType = this.f64312e;
        if (kotlinType == null) {
            m88934P(4);
        }
        return kotlinType;
    }

    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m88934P(8);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: k0 */
    public boolean mo88449k0() {
        return false;
    }
}
