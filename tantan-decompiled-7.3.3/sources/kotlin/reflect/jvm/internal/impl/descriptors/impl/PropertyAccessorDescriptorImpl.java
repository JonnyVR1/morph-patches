package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyAccessorDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PropertyAccessorDescriptor {

    /* JADX INFO: renamed from: e */
    public boolean f64922e;

    /* JADX INFO: renamed from: f */
    public final boolean f64923f;

    /* JADX INFO: renamed from: g */
    public final Modality f64924g;

    /* JADX INFO: renamed from: h */
    public final PropertyDescriptor f64925h;

    /* JADX INFO: renamed from: i */
    public final boolean f64926i;

    /* JADX INFO: renamed from: j */
    public final CallableMemberDescriptor.Kind f64927j;

    /* JADX INFO: renamed from: k */
    public DescriptorVisibility f64928k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public FunctionDescriptor f64929l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyAccessorDescriptorImpl(@NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Name name, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(propertyDescriptor.mo89190b(), annotations, name, sourceElement);
        if (modality == null) {
            m89729P(0);
        }
        if (descriptorVisibility == null) {
            m89729P(1);
        }
        if (propertyDescriptor == null) {
            m89729P(2);
        }
        if (annotations == null) {
            m89729P(3);
        }
        if (name == null) {
            m89729P(4);
        }
        if (sourceElement == null) {
            m89729P(5);
        }
        this.f64929l = null;
        this.f64924g = modality;
        this.f64928k = descriptorVisibility;
        this.f64925h = propertyDescriptor;
        this.f64922e = z;
        this.f64923f = z2;
        this.f64926i = z3;
        this.f64927j = kind;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89729P(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* JADX INFO: renamed from: A0 */
    public boolean mo89403A0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public PropertyAccessorDescriptor mo89343a0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public abstract PropertyAccessorDescriptor mo89336a();

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public Collection<PropertyAccessorDescriptor> m89732E0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (PropertyDescriptor propertyDescriptor : mo89473d0().mo89338e()) {
            CallableDescriptor getter = z ? propertyDescriptor.getGetter() : propertyDescriptor.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F0 */
    public void m89733F0(boolean z) {
        this.f64922e = z;
    }

    /* JADX INFO: renamed from: G0 */
    public void m89734G0(@Nullable FunctionDescriptor functionDescriptor) {
        this.f64929l = functionDescriptor;
    }

    /* JADX INFO: renamed from: H0 */
    public void m89735H0(DescriptorVisibility descriptorVisibility) {
        this.f64928k = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: J */
    public <V> V mo89334J(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: N */
    public void mo89342N(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m89729P(16);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* JADX INFO: renamed from: O */
    public boolean mo89404O() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    /* JADX INFO: renamed from: U */
    public boolean mo89472U() {
        return this.f64922e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: Y */
    public ReceiverParameterDescriptor mo89335Y() {
        return mo89473d0().mo89335Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public ReceiverParameterDescriptor mo89337b0() {
        return mo89473d0().mo89337b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* JADX INFO: renamed from: c */
    public FunctionDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m89729P(7);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    @NotNull
    /* JADX INFO: renamed from: d0 */
    public PropertyDescriptor mo89473d0() {
        PropertyDescriptor propertyDescriptor = this.f64925h;
        if (propertyDescriptor == null) {
            m89729P(13);
        }
        return propertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo89192e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f64927j;
        if (kind == null) {
            m89729P(6);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m89729P(9);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f64928k;
        if (descriptorVisibility == null) {
            m89729P(11);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo89194i() {
        Modality modality = this.f64924g;
        if (modality == null) {
            m89729P(10);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f64923f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return this.f64926i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: k0 */
    public boolean mo89340k0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo89198n0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* JADX INFO: renamed from: u */
    public boolean mo89215u() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @Nullable
    /* JADX INFO: renamed from: u0 */
    public FunctionDescriptor mo89406u0() {
        return this.f64929l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public List<ReceiverParameterDescriptor> mo89341x0() {
        List<ReceiverParameterDescriptor> listMo89341x0 = mo89473d0().mo89341x0();
        if (listMo89341x0 == null) {
            m89729P(14);
        }
        return listMo89341x0;
    }
}
