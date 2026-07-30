package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.cosmos.photon.push.service.PushService;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class JavaPropertyDescriptor extends PropertyDescriptorImpl implements JavaCallableMemberDescriptor {

    /* JADX INFO: renamed from: C */
    public final boolean f65477C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public final Pair<CallableDescriptor.UserDataKey<?>, ?> f65478D;

    /* JADX INFO: renamed from: E */
    public KotlinType f65479E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaPropertyDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull SourceElement sourceElement, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, boolean z2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, z, name, kind, sourceElement, false, false, false, false, false, false);
        if (declarationDescriptor == null) {
            m90456P(0);
        }
        if (annotations == null) {
            m90456P(1);
        }
        if (modality == null) {
            m90456P(2);
        }
        if (descriptorVisibility == null) {
            m90456P(3);
        }
        if (name == null) {
            m90456P(4);
        }
        if (sourceElement == null) {
            m90456P(5);
        }
        if (kind == null) {
            m90456P(6);
        }
        this.f65479E = null;
        this.f65477C = z2;
        this.f65478D = pair;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m90456P(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = PushService.COMMAND_CREATE;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public static JavaPropertyDescriptor m90457Z0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull SourceElement sourceElement, boolean z2) {
        if (declarationDescriptor == null) {
            m90456P(7);
        }
        if (annotations == null) {
            m90456P(8);
        }
        if (modality == null) {
            m90456P(9);
        }
        if (descriptorVisibility == null) {
            m90456P(10);
        }
        if (name == null) {
            m90456P(11);
        }
        if (sourceElement == null) {
            m90456P(12);
        }
        return new JavaPropertyDescriptor(declarationDescriptor, annotations, modality, descriptorVisibility, z, name, sourceElement, null, CallableMemberDescriptor.Kind.DECLARATION, z2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: J */
    public <V> V mo89334J(CallableDescriptor.UserDataKey<V> userDataKey) {
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair = this.f65478D;
        if (pair == null || !pair.getFirst().equals(userDataKey)) {
            return null;
        }
        return (V) this.f65478D.getSecond();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public PropertyDescriptorImpl mo89745J0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name name, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m90456P(13);
        }
        if (modality == null) {
            m90456P(14);
        }
        if (descriptorVisibility == null) {
            m90456P(15);
        }
        if (kind == null) {
            m90456P(16);
        }
        if (name == null) {
            m90456P(17);
        }
        if (sourceElement == null) {
            m90456P(18);
        }
        return new JavaPropertyDescriptor(declarationDescriptor, getAnnotations(), modality, descriptorVisibility, mo89511y(), name, sourceElement, propertyDescriptor, kind, this.f65477C, this.f65478D);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    /* JADX INFO: renamed from: T0 */
    public void mo89753T0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m90456P(22);
        }
        this.f65479E = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: g0 */
    public JavaCallableMemberDescriptor mo90445g0(@Nullable KotlinType kotlinType, @NotNull List<KotlinType> list, @NotNull KotlinType kotlinType2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        if (list == null) {
            m90456P(19);
        }
        if (kotlinType2 == null) {
            m90456P(20);
        }
        PropertyDescriptor propertyDescriptorMo89336a = mo89336a() == this ? null : mo89336a();
        JavaPropertyDescriptor javaPropertyDescriptor = new JavaPropertyDescriptor(mo89190b(), getAnnotations(), mo89194i(), getVisibility(), mo89511y(), getName(), getSource(), propertyDescriptorMo89336a, getKind(), this.f65477C, pair);
        PropertyGetterDescriptorImpl getter = getGetter();
        if (getter != null) {
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = new PropertyGetterDescriptorImpl(javaPropertyDescriptor, getter.getAnnotations(), getter.mo89194i(), getter.getVisibility(), getter.mo89472U(), getter.isExternal(), getter.isInline(), getKind(), propertyDescriptorMo89336a == null ? null : propertyDescriptorMo89336a.getGetter(), getter.getSource());
            propertyGetterDescriptorImpl2.m89734G0(getter.mo89406u0());
            propertyGetterDescriptorImpl2.m89782J0(kotlinType2);
            propertyGetterDescriptorImpl = propertyGetterDescriptorImpl2;
        } else {
            propertyGetterDescriptorImpl = null;
        }
        PropertySetterDescriptor setter = getSetter();
        if (setter != null) {
            propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(javaPropertyDescriptor, setter.getAnnotations(), setter.mo89194i(), setter.getVisibility(), setter.mo89472U(), setter.isExternal(), setter.isInline(), getKind(), propertyDescriptorMo89336a == null ? null : propertyDescriptorMo89336a.getSetter(), setter.getSource());
            propertySetterDescriptorImpl.m89734G0(propertySetterDescriptorImpl.mo89406u0());
            propertySetterDescriptorImpl.m89786K0(setter.mo89339g().get(0));
        } else {
            propertySetterDescriptorImpl = null;
        }
        javaPropertyDescriptor.m89750P0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, mo89474K(), mo89476z());
        javaPropertyDescriptor.m89754U0(m89751Q0());
        Function0<NullableLazyValue<ConstantValue<?>>> function0 = this.f64989h;
        if (function0 != null) {
            javaPropertyDescriptor.m89828E0(this.f64988g, function0);
        }
        javaPropertyDescriptor.mo89342N(mo89338e());
        javaPropertyDescriptor.m89755V0(kotlinType2, getTypeParameters(), mo89335Y(), kotlinType != null ? DescriptorFactory.m92628i(this, kotlinType, Annotations.Companion.m89532b()) : null, CollectionsKt.emptyList());
        return javaPropertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        KotlinType type = getType();
        if (this.f65477C && ConstUtil.m89351a(type)) {
            return !TypeEnhancementKt.m91004i(type) || KotlinBuiltIns.m89092w0(type);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: k0 */
    public boolean mo89340k0() {
        return false;
    }
}
