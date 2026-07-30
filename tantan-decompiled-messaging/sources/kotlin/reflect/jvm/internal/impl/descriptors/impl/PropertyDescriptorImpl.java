package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.data.Owner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ohg0;
import p149l.rkq0;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {

    /* JADX INFO: renamed from: A */
    public FieldDescriptor f64256A;

    /* JADX INFO: renamed from: B */
    public FieldDescriptor f64257B;

    /* JADX INFO: renamed from: i */
    public final Modality f64258i;

    /* JADX INFO: renamed from: j */
    public DescriptorVisibility f64259j;

    /* JADX INFO: renamed from: k */
    public Collection<? extends PropertyDescriptor> f64260k;

    /* JADX INFO: renamed from: l */
    public final PropertyDescriptor f64261l;

    /* JADX INFO: renamed from: m */
    public final CallableMemberDescriptor.Kind f64262m;

    /* JADX INFO: renamed from: n */
    public final boolean f64263n;

    /* JADX INFO: renamed from: o */
    public final boolean f64264o;

    /* JADX INFO: renamed from: p */
    public final boolean f64265p;

    /* JADX INFO: renamed from: q */
    public final boolean f64266q;

    /* JADX INFO: renamed from: r */
    public final boolean f64267r;

    /* JADX INFO: renamed from: s */
    public final boolean f64268s;

    /* JADX INFO: renamed from: t */
    public List<ReceiverParameterDescriptor> f64269t;

    /* JADX INFO: renamed from: u */
    public ReceiverParameterDescriptor f64270u;

    /* JADX INFO: renamed from: v */
    public ReceiverParameterDescriptor f64271v;

    /* JADX INFO: renamed from: w */
    public List<TypeParameterDescriptor> f64272w;

    /* JADX INFO: renamed from: x */
    public PropertyGetterDescriptorImpl f64273x;

    /* JADX INFO: renamed from: y */
    public PropertySetterDescriptor f64274y;

    /* JADX INFO: renamed from: z */
    public boolean f64275z;

    public class CopyConfiguration {

        /* JADX INFO: renamed from: a */
        public DeclarationDescriptor f64276a;

        /* JADX INFO: renamed from: b */
        public Modality f64277b;

        /* JADX INFO: renamed from: c */
        public DescriptorVisibility f64278c;

        /* JADX INFO: renamed from: f */
        public CallableMemberDescriptor.Kind f64281f;

        /* JADX INFO: renamed from: i */
        public ReceiverParameterDescriptor f64284i;

        /* JADX INFO: renamed from: k */
        public Name f64286k;

        /* JADX INFO: renamed from: l */
        public KotlinType f64287l;

        /* JADX INFO: renamed from: d */
        public PropertyDescriptor f64279d = null;

        /* JADX INFO: renamed from: e */
        public boolean f64280e = false;

        /* JADX INFO: renamed from: g */
        public TypeSubstitution f64282g = TypeSubstitution.f66281a;

        /* JADX INFO: renamed from: h */
        public boolean f64283h = true;

        /* JADX INFO: renamed from: j */
        public List<TypeParameterDescriptor> f64285j = null;

        public CopyConfiguration() {
            this.f64276a = PropertyDescriptorImpl.this.mo88299b();
            this.f64277b = PropertyDescriptorImpl.this.mo88303i();
            this.f64278c = PropertyDescriptorImpl.this.getVisibility();
            this.f64281f = PropertyDescriptorImpl.this.getKind();
            this.f64284i = PropertyDescriptorImpl.this.f64270u;
            this.f64286k = PropertyDescriptorImpl.this.getName();
            this.f64287l = PropertyDescriptorImpl.this.getType();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m88866a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                    break;
                default:
                    objArr[0] = Owner.TYPE;
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Nullable
        /* JADX INFO: renamed from: n */
        public PropertyDescriptor m88879n() {
            return PropertyDescriptorImpl.this.m88855K0(this);
        }

        /* JADX INFO: renamed from: o */
        public PropertyGetterDescriptor m88880o() {
            PropertyDescriptor propertyDescriptor = this.f64279d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getGetter();
        }

        /* JADX INFO: renamed from: p */
        public PropertySetterDescriptor m88881p() {
            PropertyDescriptor propertyDescriptor = this.f64279d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getSetter();
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public CopyConfiguration m88882q(boolean z) {
            this.f64283h = z;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public CopyConfiguration m88883r(@NotNull CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                m88866a(10);
            }
            this.f64281f = kind;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public CopyConfiguration m88884s(@NotNull Modality modality) {
            if (modality == null) {
                m88866a(6);
            }
            this.f64277b = modality;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public CopyConfiguration m88885t(@Nullable CallableMemberDescriptor callableMemberDescriptor) {
            this.f64279d = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: u */
        public CopyConfiguration m88886u(@NotNull DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                m88866a(0);
            }
            this.f64276a = declarationDescriptor;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public CopyConfiguration m88887v(@NotNull TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                m88866a(15);
            }
            this.f64282g = typeSubstitution;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: w */
        public CopyConfiguration m88888w(@NotNull DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility == null) {
                m88866a(8);
            }
            this.f64278c = descriptorVisibility;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(declarationDescriptor, annotations, name, null, z, sourceElement);
        if (declarationDescriptor == null) {
            m88848P(0);
        }
        if (annotations == null) {
            m88848P(1);
        }
        if (modality == null) {
            m88848P(2);
        }
        if (descriptorVisibility == null) {
            m88848P(3);
        }
        if (name == null) {
            m88848P(4);
        }
        if (kind == null) {
            m88848P(5);
        }
        if (sourceElement == null) {
            m88848P(6);
        }
        this.f64260k = null;
        this.f64269t = Collections.EMPTY_LIST;
        this.f64258i = modality;
        this.f64259j = descriptorVisibility;
        this.f64261l = propertyDescriptor == null ? this : propertyDescriptor;
        this.f64262m = kind;
        this.f64263n = z2;
        this.f64264o = z3;
        this.f64265p = z4;
        this.f64266q = z5;
        this.f64267r = z6;
        this.f64268s = z7;
    }

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public static PropertyDescriptorImpl m88846I0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (declarationDescriptor == null) {
            m88848P(7);
        }
        if (annotations == null) {
            m88848P(8);
        }
        if (modality == null) {
            m88848P(9);
        }
        if (descriptorVisibility == null) {
            m88848P(10);
        }
        if (name == null) {
            m88848P(11);
        }
        if (kind == null) {
            m88848P(12);
        }
        if (sourceElement == null) {
            m88848P(13);
        }
        return new PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, descriptorVisibility, z, name, kind, sourceElement, z2, z3, z4, z5, z6, z7);
    }

    /* JADX INFO: renamed from: N0 */
    public static FunctionDescriptor m88847N0(@NotNull TypeSubstitutor typeSubstitutor, @NotNull PropertyAccessorDescriptor propertyAccessorDescriptor) {
        if (typeSubstitutor == null) {
            m88848P(30);
        }
        if (propertyAccessorDescriptor == null) {
            m88848P(31);
        }
        if (propertyAccessorDescriptor.mo88515u0() != null) {
            return propertyAccessorDescriptor.mo88515u0().mo88453c(typeSubstitutor);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m88848P(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = Constants.COPY_TYPE;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = PushService.COMMAND_CREATE;
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: S0 */
    public static DescriptorVisibility m88849S0(DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind) {
        return (kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.m88488g(descriptorVisibility.mo88477f())) ? DescriptorVisibilities.f64029h : descriptorVisibility;
    }

    /* JADX INFO: renamed from: X0 */
    public static ReceiverParameterDescriptor m88850X0(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeM92782q = typeSubstitutor.m92782q(receiverParameterDescriptor.getType(), Variance.IN_VARIANCE);
        if (kotlinTypeM92782q == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(propertyDescriptor, new ContextReceiver(propertyDescriptor, kotlinTypeM92782q, ((ImplicitContextReceiver) receiverParameterDescriptor.getValue()).mo92093a(), receiverParameterDescriptor.getValue()), receiverParameterDescriptor.getAnnotations());
    }

    /* JADX INFO: renamed from: Y0 */
    public static ReceiverParameterDescriptor m88851Y0(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeM92782q = typeSubstitutor.m92782q(receiverParameterDescriptor.getType(), Variance.IN_VARIANCE);
        if (kotlinTypeM92782q == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(propertyDescriptor, new ExtensionReceiver(propertyDescriptor, kotlinTypeM92782q, receiverParameterDescriptor.getValue()), receiverParameterDescriptor.getAnnotations());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public PropertyDescriptor mo88452a0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        PropertyDescriptor propertyDescriptorM88879n = m88861R0().m88886u(declarationDescriptor).m88885t(null).m88884s(modality).m88888w(descriptorVisibility).m88883r(kind).m88882q(z).m88879n();
        if (propertyDescriptorM88879n == null) {
            m88848P(42);
        }
        return propertyDescriptorM88879n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: J */
    public <V> V mo88443J(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public PropertyDescriptorImpl mo88854J0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name name, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m88848P(32);
        }
        if (modality == null) {
            m88848P(33);
        }
        if (descriptorVisibility == null) {
            m88848P(34);
        }
        if (kind == null) {
            m88848P(35);
        }
        if (name == null) {
            m88848P(36);
        }
        if (sourceElement == null) {
            m88848P(37);
        }
        return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, mo88620y(), name, kind, sourceElement, mo88621y0(), isConst(), mo88307n0(), mo88301e0(), isExternal(), mo88622T());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: K */
    public FieldDescriptor mo88583K() {
        return this.f64256A;
    }

    @Nullable
    /* JADX INFO: renamed from: K0 */
    public PropertyDescriptor m88855K0(@NotNull CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        Function0<NullableLazyValue<ConstantValue<?>>> function0;
        if (copyConfiguration == null) {
            m88848P(29);
        }
        PropertyDescriptorImpl propertyDescriptorImplMo88854J0 = mo88854J0(copyConfiguration.f64276a, copyConfiguration.f64277b, copyConfiguration.f64278c, copyConfiguration.f64279d, copyConfiguration.f64281f, copyConfiguration.f64286k, m88857M0(copyConfiguration.f64280e, copyConfiguration.f64279d));
        List<TypeParameterDescriptor> typeParameters = copyConfiguration.f64285j == null ? getTypeParameters() : copyConfiguration.f64285j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorM92582b = DescriptorSubstitutor.m92582b(typeParameters, copyConfiguration.f64282g, propertyDescriptorImplMo88854J0, arrayList);
        KotlinType kotlinType = copyConfiguration.f64287l;
        KotlinType kotlinTypeM92782q = typeSubstitutorM92582b.m92782q(kotlinType, Variance.OUT_VARIANCE);
        if (kotlinTypeM92782q == null) {
            return null;
        }
        KotlinType kotlinTypeM92782q2 = typeSubstitutorM92582b.m92782q(kotlinType, Variance.IN_VARIANCE);
        if (kotlinTypeM92782q2 != null) {
            propertyDescriptorImplMo88854J0.mo88862T0(kotlinTypeM92782q2);
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = copyConfiguration.f64284i;
        if (receiverParameterDescriptor2 != null) {
            ReceiverParameterDescriptor receiverParameterDescriptorMo88453c = receiverParameterDescriptor2.mo88453c(typeSubstitutorM92582b);
            if (receiverParameterDescriptorMo88453c == null) {
                return null;
            }
            receiverParameterDescriptor = receiverParameterDescriptorMo88453c;
        } else {
            receiverParameterDescriptor = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = this.f64271v;
        ReceiverParameterDescriptor receiverParameterDescriptorM88851Y0 = receiverParameterDescriptor3 != null ? m88851Y0(typeSubstitutorM92582b, propertyDescriptorImplMo88854J0, receiverParameterDescriptor3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<ReceiverParameterDescriptor> it = this.f64269t.iterator();
        while (it.hasNext()) {
            ReceiverParameterDescriptor receiverParameterDescriptorM88850X0 = m88850X0(typeSubstitutorM92582b, propertyDescriptorImplMo88854J0, it.next());
            if (receiverParameterDescriptorM88850X0 != null) {
                arrayList2.add(receiverParameterDescriptorM88850X0);
            }
        }
        propertyDescriptorImplMo88854J0.m88864V0(kotlinTypeM92782q, arrayList, receiverParameterDescriptor, receiverParameterDescriptorM88851Y0, arrayList2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f64273x == null ? null : new PropertyGetterDescriptorImpl(propertyDescriptorImplMo88854J0, this.f64273x.getAnnotations(), copyConfiguration.f64277b, m88849S0(this.f64273x.getVisibility(), copyConfiguration.f64281f), this.f64273x.mo88581U(), this.f64273x.isExternal(), this.f64273x.isInline(), copyConfiguration.f64281f, copyConfiguration.m88880o(), SourceElement.f64063a);
        if (propertyGetterDescriptorImpl != null) {
            KotlinType returnType = this.f64273x.getReturnType();
            propertyGetterDescriptorImpl.m88843G0(m88847N0(typeSubstitutorM92582b, this.f64273x));
            propertyGetterDescriptorImpl.m88891J0(returnType != null ? typeSubstitutorM92582b.m92782q(returnType, Variance.OUT_VARIANCE) : null);
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = this.f64274y == null ? null : new PropertySetterDescriptorImpl(propertyDescriptorImplMo88854J0, this.f64274y.getAnnotations(), copyConfiguration.f64277b, m88849S0(this.f64274y.getVisibility(), copyConfiguration.f64281f), this.f64274y.mo88581U(), this.f64274y.isExternal(), this.f64274y.isInline(), copyConfiguration.f64281f, copyConfiguration.m88881p(), SourceElement.f64063a);
        if (propertySetterDescriptorImpl != null) {
            List<ValueParameterDescriptor> listM88738I0 = FunctionDescriptorImpl.m88738I0(propertySetterDescriptorImpl, this.f64274y.mo88448g(), typeSubstitutorM92582b, false, false, null);
            if (listM88738I0 == null) {
                propertyDescriptorImplMo88854J0.m88863U0(true);
                listM88738I0 = Collections.singletonList(PropertySetterDescriptorImpl.m88892I0(propertySetterDescriptorImpl, DescriptorUtilsKt.m91980m(copyConfiguration.f64276a).m88213I(), this.f64274y.mo88448g().get(0).getAnnotations()));
            }
            if (listM88738I0.size() != 1) {
                ohg0.m164364a();
                return null;
            }
            propertySetterDescriptorImpl.m88843G0(m88847N0(typeSubstitutorM92582b, this.f64274y));
            propertySetterDescriptorImpl.m88895K0(listM88738I0.get(0));
        }
        FieldDescriptor fieldDescriptor = this.f64256A;
        FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? null : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), propertyDescriptorImplMo88854J0);
        FieldDescriptor fieldDescriptor2 = this.f64257B;
        propertyDescriptorImplMo88854J0.m88859P0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? null : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), propertyDescriptorImplMo88854J0));
        if (copyConfiguration.f64283h) {
            SmartSet smartSetM93219a = SmartSet.m93219a();
            Iterator<? extends PropertyDescriptor> it2 = mo88447e().iterator();
            while (it2.hasNext()) {
                smartSetM93219a.add(it2.next().mo88453c(typeSubstitutorM92582b));
            }
            propertyDescriptorImplMo88854J0.mo88451N(smartSetM93219a);
        }
        if (isConst() && (function0 = this.f64315h) != null) {
            propertyDescriptorImplMo88854J0.m88937E0(this.f64314g, function0);
        }
        return propertyDescriptorImplMo88854J0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public PropertyGetterDescriptorImpl getGetter() {
        return this.f64273x;
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public final SourceElement m88857M0(boolean z, @Nullable PropertyDescriptor propertyDescriptor) {
        SourceElement source;
        if (z) {
            if (propertyDescriptor == null) {
                propertyDescriptor = mo88445a();
            }
            source = propertyDescriptor.getSource();
        } else {
            source = SourceElement.f64063a;
        }
        if (source == null) {
            m88848P(28);
        }
        return source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: N */
    public void mo88451N(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            m88848P(40);
        }
        this.f64260k = collection;
    }

    /* JADX INFO: renamed from: O0 */
    public void m88858O0(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, @Nullable PropertySetterDescriptor propertySetterDescriptor) {
        m88859P0(propertyGetterDescriptorImpl, propertySetterDescriptor, null, null);
    }

    /* JADX INFO: renamed from: P0 */
    public void m88859P0(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, @Nullable PropertySetterDescriptor propertySetterDescriptor, @Nullable FieldDescriptor fieldDescriptor, @Nullable FieldDescriptor fieldDescriptor2) {
        this.f64273x = propertyGetterDescriptorImpl;
        this.f64274y = propertySetterDescriptor;
        this.f64256A = fieldDescriptor;
        this.f64257B = fieldDescriptor2;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m88860Q0() {
        return this.f64275z;
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public CopyConfiguration m88861R0() {
        return new CopyConfiguration();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo87670c(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    /* JADX INFO: renamed from: T */
    public boolean mo88622T() {
        return this.f64268s;
    }

    /* JADX INFO: renamed from: T0 */
    public void mo88862T0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88848P(14);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m88863U0(boolean z) {
        this.f64275z = z;
    }

    /* JADX INFO: renamed from: V0 */
    public void m88864V0(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeParameterDescriptor> list, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<ReceiverParameterDescriptor> list2) {
        if (kotlinType == null) {
            m88848P(17);
        }
        if (list == null) {
            m88848P(18);
        }
        if (list2 == null) {
            m88848P(19);
        }
        m88935D0(kotlinType);
        this.f64272w = new ArrayList(list);
        this.f64271v = receiverParameterDescriptor2;
        this.f64270u = receiverParameterDescriptor;
        this.f64269t = list2;
    }

    /* JADX INFO: renamed from: W0 */
    public void m88865W0(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            m88848P(20);
        }
        this.f64259j = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: Y */
    public ReceiverParameterDescriptor mo88444Y() {
        return this.f64270u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public PropertyDescriptor mo88445a() {
        PropertyDescriptor propertyDescriptorMo88445a;
        PropertyDescriptor propertyDescriptor = this.f64261l;
        ?? r1 = this;
        if (propertyDescriptor != this) {
            propertyDescriptorMo88445a = propertyDescriptor.mo88445a();
        }
        if (r1 == 0) {
            r1 = propertyDescriptorMo88445a;
            m88848P(38);
        }
        r1 = propertyDescriptorMo88445a;
        return r1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public ReceiverParameterDescriptor mo88446b0() {
        return this.f64271v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: c */
    public PropertyDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m88848P(27);
        }
        return typeSubstitutor.m92779l() ? this : m88861R0().m88887v(typeSubstitutor.m92778k()).m88885t(mo88445a()).m88879n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<? extends PropertyDescriptor> mo88447e() {
        Collection<? extends PropertyDescriptor> collection = this.f64260k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            m88848P(41);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo88301e0() {
        return this.f64266q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f64262m;
        if (kind == null) {
            m88848P(39);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType type = getType();
        if (type == null) {
            m88848P(23);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.f64274y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.f64272w;
        if (list != null) {
            return list;
        }
        rkq0.m179764a("typeParameters == null for ", this);
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f64259j;
        if (descriptorVisibility == null) {
            m88848P(25);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo88303i() {
        Modality modality = this.f64258i;
        if (modality == null) {
            m88848P(24);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f64264o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f64267r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo88307n0() {
        return this.f64265p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    /* JADX INFO: renamed from: r */
    public List<PropertyAccessorDescriptor> mo88584r() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f64273x;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.f64274y;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public List<ReceiverParameterDescriptor> mo88450x0() {
        List<ReceiverParameterDescriptor> list = this.f64269t;
        if (list == null) {
            m88848P(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: y0 */
    public boolean mo88621y0() {
        return this.f64263n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: z */
    public FieldDescriptor mo88585z() {
        return this.f64257B;
    }
}
