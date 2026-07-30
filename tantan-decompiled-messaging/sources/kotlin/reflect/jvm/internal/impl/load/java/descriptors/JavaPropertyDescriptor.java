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
    public final boolean f64803C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public final Pair<CallableDescriptor.UserDataKey<?>, ?> f64804D;

    /* JADX INFO: renamed from: E */
    public KotlinType f64805E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaPropertyDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull SourceElement sourceElement, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, boolean z2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, z, name, kind, sourceElement, false, false, false, false, false, false);
        if (declarationDescriptor == null) {
            m89565P(0);
        }
        if (annotations == null) {
            m89565P(1);
        }
        if (modality == null) {
            m89565P(2);
        }
        if (descriptorVisibility == null) {
            m89565P(3);
        }
        if (name == null) {
            m89565P(4);
        }
        if (sourceElement == null) {
            m89565P(5);
        }
        if (kind == null) {
            m89565P(6);
        }
        this.f64805E = null;
        this.f64803C = z2;
        this.f64804D = pair;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89565P(int i) {
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
    public static JavaPropertyDescriptor m89566Z0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull SourceElement sourceElement, boolean z2) {
        if (declarationDescriptor == null) {
            m89565P(7);
        }
        if (annotations == null) {
            m89565P(8);
        }
        if (modality == null) {
            m89565P(9);
        }
        if (descriptorVisibility == null) {
            m89565P(10);
        }
        if (name == null) {
            m89565P(11);
        }
        if (sourceElement == null) {
            m89565P(12);
        }
        return new JavaPropertyDescriptor(declarationDescriptor, annotations, modality, descriptorVisibility, z, name, sourceElement, null, CallableMemberDescriptor.Kind.DECLARATION, z2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: J */
    public <V> V mo88443J(CallableDescriptor.UserDataKey<V> userDataKey) {
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair = this.f64804D;
        if (pair == null || !pair.getFirst().equals(userDataKey)) {
            return null;
        }
        return (V) this.f64804D.getSecond();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public PropertyDescriptorImpl mo88854J0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name name, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m89565P(13);
        }
        if (modality == null) {
            m89565P(14);
        }
        if (descriptorVisibility == null) {
            m89565P(15);
        }
        if (kind == null) {
            m89565P(16);
        }
        if (name == null) {
            m89565P(17);
        }
        if (sourceElement == null) {
            m89565P(18);
        }
        return new JavaPropertyDescriptor(declarationDescriptor, getAnnotations(), modality, descriptorVisibility, mo88620y(), name, sourceElement, propertyDescriptor, kind, this.f64803C, this.f64804D);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    /* JADX INFO: renamed from: T0 */
    public void mo88862T0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89565P(22);
        }
        this.f64805E = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: g0 */
    public JavaCallableMemberDescriptor mo89554g0(@Nullable KotlinType kotlinType, @NotNull List<KotlinType> list, @NotNull KotlinType kotlinType2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        if (list == null) {
            m89565P(19);
        }
        if (kotlinType2 == null) {
            m89565P(20);
        }
        PropertyDescriptor propertyDescriptorMo88445a = mo88445a() == this ? null : mo88445a();
        JavaPropertyDescriptor javaPropertyDescriptor = new JavaPropertyDescriptor(mo88299b(), getAnnotations(), mo88303i(), getVisibility(), mo88620y(), getName(), getSource(), propertyDescriptorMo88445a, getKind(), this.f64803C, pair);
        PropertyGetterDescriptorImpl getter = getGetter();
        if (getter != null) {
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = new PropertyGetterDescriptorImpl(javaPropertyDescriptor, getter.getAnnotations(), getter.mo88303i(), getter.getVisibility(), getter.mo88581U(), getter.isExternal(), getter.isInline(), getKind(), propertyDescriptorMo88445a == null ? null : propertyDescriptorMo88445a.getGetter(), getter.getSource());
            propertyGetterDescriptorImpl2.m88843G0(getter.mo88515u0());
            propertyGetterDescriptorImpl2.m88891J0(kotlinType2);
            propertyGetterDescriptorImpl = propertyGetterDescriptorImpl2;
        } else {
            propertyGetterDescriptorImpl = null;
        }
        PropertySetterDescriptor setter = getSetter();
        if (setter != null) {
            propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(javaPropertyDescriptor, setter.getAnnotations(), setter.mo88303i(), setter.getVisibility(), setter.mo88581U(), setter.isExternal(), setter.isInline(), getKind(), propertyDescriptorMo88445a == null ? null : propertyDescriptorMo88445a.getSetter(), setter.getSource());
            propertySetterDescriptorImpl.m88843G0(propertySetterDescriptorImpl.mo88515u0());
            propertySetterDescriptorImpl.m88895K0(setter.mo88448g().get(0));
        } else {
            propertySetterDescriptorImpl = null;
        }
        javaPropertyDescriptor.m88859P0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, mo88583K(), mo88585z());
        javaPropertyDescriptor.m88863U0(m88860Q0());
        Function0<NullableLazyValue<ConstantValue<?>>> function0 = this.f64315h;
        if (function0 != null) {
            javaPropertyDescriptor.m88937E0(this.f64314g, function0);
        }
        javaPropertyDescriptor.mo88451N(mo88447e());
        javaPropertyDescriptor.m88864V0(kotlinType2, getTypeParameters(), mo88444Y(), kotlinType != null ? DescriptorFactory.m91737i(this, kotlinType, Annotations.Companion.m88641b()) : null, CollectionsKt.emptyList());
        return javaPropertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        KotlinType type = getType();
        if (this.f64803C && ConstUtil.m88460a(type)) {
            return !TypeEnhancementKt.m90113i(type) || KotlinBuiltIns.m88201w0(type);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: k0 */
    public boolean mo88449k0() {
        return false;
    }
}
