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
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyGetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertyGetterDescriptor {

    /* JADX INFO: renamed from: m */
    public KotlinType f64963m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final PropertyGetterDescriptor f64964n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyGetterDescriptorImpl(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, boolean z2, boolean z3, @NotNull CallableMemberDescriptor.Kind kind, @Nullable PropertyGetterDescriptor propertyGetterDescriptor, @NotNull SourceElement sourceElement) {
        super(modality, descriptorVisibility, propertyDescriptor, annotations, Name.m91972n("<get-" + propertyDescriptor.getName() + ">"), z, z2, z3, kind, sourceElement);
        if (propertyDescriptor == null) {
            m89780P(0);
        }
        if (annotations == null) {
            m89780P(1);
        }
        if (modality == null) {
            m89780P(2);
        }
        if (descriptorVisibility == null) {
            m89780P(3);
        }
        if (kind == null) {
            m89780P(4);
        }
        if (sourceElement == null) {
            m89780P(5);
        }
        this.f64964n = propertyGetterDescriptor != null ? propertyGetterDescriptor : this;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89780P(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PropertyGetterDescriptor mo89336a() {
        PropertyGetterDescriptor propertyGetterDescriptor = this.f64964n;
        if (propertyGetterDescriptor == null) {
            m89780P(8);
        }
        return propertyGetterDescriptor;
    }

    /* JADX INFO: renamed from: J0 */
    public void m89782J0(KotlinType kotlinType) {
        if (kotlinType == null) {
            kotlinType = mo89473d0().getType();
        }
        this.f64963m = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo89363j(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<? extends PropertyGetterDescriptor> mo89338e() {
        Collection<PropertyAccessorDescriptor> collectionM89732E0 = super.m89732E0(true);
        if (collectionM89732E0 == null) {
            m89780P(6);
        }
        return collectionM89732E0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<ValueParameterDescriptor> mo89339g() {
        List<ValueParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m89780P(7);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.f64963m;
    }
}
