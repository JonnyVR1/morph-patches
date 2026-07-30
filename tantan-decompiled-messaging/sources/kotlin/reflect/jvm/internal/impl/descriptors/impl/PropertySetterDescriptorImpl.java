package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ohg0;

/* JADX INFO: loaded from: classes2.dex */
public class PropertySetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertySetterDescriptor {

    /* JADX INFO: renamed from: m */
    public ValueParameterDescriptor f64291m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final PropertySetterDescriptor f64292n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertySetterDescriptorImpl(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, boolean z2, boolean z3, @NotNull CallableMemberDescriptor.Kind kind, @Nullable PropertySetterDescriptor propertySetterDescriptor, @NotNull SourceElement sourceElement) {
        super(modality, descriptorVisibility, propertyDescriptor, annotations, Name.m91081n("<set-" + propertyDescriptor.getName() + ">"), z, z2, z3, kind, sourceElement);
        if (propertyDescriptor == null) {
            m88893P(0);
        }
        if (annotations == null) {
            m88893P(1);
        }
        if (modality == null) {
            m88893P(2);
        }
        if (descriptorVisibility == null) {
            m88893P(3);
        }
        if (kind == null) {
            m88893P(4);
        }
        if (sourceElement == null) {
            m88893P(5);
        }
        this.f64292n = propertySetterDescriptor != null ? propertySetterDescriptor : this;
    }

    /* JADX INFO: renamed from: I0 */
    public static ValueParameterDescriptorImpl m88892I0(@NotNull PropertySetterDescriptor propertySetterDescriptor, @NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        if (propertySetterDescriptor == null) {
            m88893P(7);
        }
        if (kotlinType == null) {
            m88893P(8);
        }
        if (annotations == null) {
            m88893P(9);
        }
        return new ValueParameterDescriptorImpl(propertySetterDescriptor, null, 0, annotations, SpecialNames.f65500o, kotlinType, false, false, false, null, SourceElement.f64063a);
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m88893P(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public PropertySetterDescriptor mo88445a() {
        PropertySetterDescriptor propertySetterDescriptor = this.f64292n;
        if (propertySetterDescriptor == null) {
            m88893P(13);
        }
        return propertySetterDescriptor;
    }

    /* JADX INFO: renamed from: K0 */
    public void m88895K0(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        if (valueParameterDescriptor == null) {
            m88893P(6);
        }
        this.f64291m = valueParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo88467d(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<? extends PropertySetterDescriptor> mo88447e() {
        Collection<PropertyAccessorDescriptor> collectionM88841E0 = super.m88841E0(false);
        if (collectionM88841E0 == null) {
            m88893P(10);
        }
        return collectionM88841E0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<ValueParameterDescriptor> mo88448g() {
        ValueParameterDescriptor valueParameterDescriptor = this.f64291m;
        if (valueParameterDescriptor == null) {
            ohg0.m164364a();
            return null;
        }
        List<ValueParameterDescriptor> listSingletonList = Collections.singletonList(valueParameterDescriptor);
        if (listSingletonList == null) {
            m88893P(11);
        }
        return listSingletonList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        SimpleType simpleTypeM88228a0 = DescriptorUtilsKt.m91980m(this).m88228a0();
        if (simpleTypeM88228a0 == null) {
            m88893P(12);
        }
        return simpleTypeM88228a0;
    }
}
