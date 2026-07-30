package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.data.Owner;
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
import p153l.wpg0;
import p153l.xtq0;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {

    /* JADX INFO: renamed from: A */
    public FieldDescriptor f64930A;

    /* JADX INFO: renamed from: B */
    public FieldDescriptor f64931B;

    /* JADX INFO: renamed from: i */
    public final Modality f64932i;

    /* JADX INFO: renamed from: j */
    public DescriptorVisibility f64933j;

    /* JADX INFO: renamed from: k */
    public Collection<? extends PropertyDescriptor> f64934k;

    /* JADX INFO: renamed from: l */
    public final PropertyDescriptor f64935l;

    /* JADX INFO: renamed from: m */
    public final CallableMemberDescriptor.Kind f64936m;

    /* JADX INFO: renamed from: n */
    public final boolean f64937n;

    /* JADX INFO: renamed from: o */
    public final boolean f64938o;

    /* JADX INFO: renamed from: p */
    public final boolean f64939p;

    /* JADX INFO: renamed from: q */
    public final boolean f64940q;

    /* JADX INFO: renamed from: r */
    public final boolean f64941r;

    /* JADX INFO: renamed from: s */
    public final boolean f64942s;

    /* JADX INFO: renamed from: t */
    public List<ReceiverParameterDescriptor> f64943t;

    /* JADX INFO: renamed from: u */
    public ReceiverParameterDescriptor f64944u;

    /* JADX INFO: renamed from: v */
    public ReceiverParameterDescriptor f64945v;

    /* JADX INFO: renamed from: w */
    public List<TypeParameterDescriptor> f64946w;

    /* JADX INFO: renamed from: x */
    public PropertyGetterDescriptorImpl f64947x;

    /* JADX INFO: renamed from: y */
    public PropertySetterDescriptor f64948y;

    /* JADX INFO: renamed from: z */
    public boolean f64949z;

    public class CopyConfiguration {

        /* JADX INFO: renamed from: a */
        public DeclarationDescriptor f64950a;

        /* JADX INFO: renamed from: b */
        public Modality f64951b;

        /* JADX INFO: renamed from: c */
        public DescriptorVisibility f64952c;

        /* JADX INFO: renamed from: f */
        public CallableMemberDescriptor.Kind f64955f;

        /* JADX INFO: renamed from: i */
        public ReceiverParameterDescriptor f64958i;

        /* JADX INFO: renamed from: k */
        public Name f64960k;

        /* JADX INFO: renamed from: l */
        public KotlinType f64961l;

        /* JADX INFO: renamed from: d */
        public PropertyDescriptor f64953d = null;

        /* JADX INFO: renamed from: e */
        public boolean f64954e = false;

        /* JADX INFO: renamed from: g */
        public TypeSubstitution f64956g = TypeSubstitution.f66955a;

        /* JADX INFO: renamed from: h */
        public boolean f64957h = true;

        /* JADX INFO: renamed from: j */
        public List<TypeParameterDescriptor> f64959j = null;

        public CopyConfiguration() {
            this.f64950a = PropertyDescriptorImpl.this.mo89190b();
            this.f64951b = PropertyDescriptorImpl.this.mo89194i();
            this.f64952c = PropertyDescriptorImpl.this.getVisibility();
            this.f64955f = PropertyDescriptorImpl.this.getKind();
            this.f64958i = PropertyDescriptorImpl.this.f64944u;
            this.f64960k = PropertyDescriptorImpl.this.getName();
            this.f64961l = PropertyDescriptorImpl.this.getType();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m89757a(int i) {
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
        public PropertyDescriptor m89770n() {
            return PropertyDescriptorImpl.this.m89746K0(this);
        }

        /* JADX INFO: renamed from: o */
        public PropertyGetterDescriptor m89771o() {
            PropertyDescriptor propertyDescriptor = this.f64953d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getGetter();
        }

        /* JADX INFO: renamed from: p */
        public PropertySetterDescriptor m89772p() {
            PropertyDescriptor propertyDescriptor = this.f64953d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getSetter();
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public CopyConfiguration m89773q(boolean z) {
            this.f64957h = z;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public CopyConfiguration m89774r(@NotNull CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                m89757a(10);
            }
            this.f64955f = kind;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public CopyConfiguration m89775s(@NotNull Modality modality) {
            if (modality == null) {
                m89757a(6);
            }
            this.f64951b = modality;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public CopyConfiguration m89776t(@Nullable CallableMemberDescriptor callableMemberDescriptor) {
            this.f64953d = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: u */
        public CopyConfiguration m89777u(@NotNull DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                m89757a(0);
            }
            this.f64950a = declarationDescriptor;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public CopyConfiguration m89778v(@NotNull TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                m89757a(15);
            }
            this.f64956g = typeSubstitution;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: w */
        public CopyConfiguration m89779w(@NotNull DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility == null) {
                m89757a(8);
            }
            this.f64952c = descriptorVisibility;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(declarationDescriptor, annotations, name, null, z, sourceElement);
        if (declarationDescriptor == null) {
            m89739P(0);
        }
        if (annotations == null) {
            m89739P(1);
        }
        if (modality == null) {
            m89739P(2);
        }
        if (descriptorVisibility == null) {
            m89739P(3);
        }
        if (name == null) {
            m89739P(4);
        }
        if (kind == null) {
            m89739P(5);
        }
        if (sourceElement == null) {
            m89739P(6);
        }
        this.f64934k = null;
        this.f64943t = Collections.EMPTY_LIST;
        this.f64932i = modality;
        this.f64933j = descriptorVisibility;
        this.f64935l = propertyDescriptor == null ? this : propertyDescriptor;
        this.f64936m = kind;
        this.f64937n = z2;
        this.f64938o = z3;
        this.f64939p = z4;
        this.f64940q = z5;
        this.f64941r = z6;
        this.f64942s = z7;
    }

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public static PropertyDescriptorImpl m89737I0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (declarationDescriptor == null) {
            m89739P(7);
        }
        if (annotations == null) {
            m89739P(8);
        }
        if (modality == null) {
            m89739P(9);
        }
        if (descriptorVisibility == null) {
            m89739P(10);
        }
        if (name == null) {
            m89739P(11);
        }
        if (kind == null) {
            m89739P(12);
        }
        if (sourceElement == null) {
            m89739P(13);
        }
        return new PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, descriptorVisibility, z, name, kind, sourceElement, z2, z3, z4, z5, z6, z7);
    }

    /* JADX INFO: renamed from: N0 */
    public static FunctionDescriptor m89738N0(@NotNull TypeSubstitutor typeSubstitutor, @NotNull PropertyAccessorDescriptor propertyAccessorDescriptor) {
        if (typeSubstitutor == null) {
            m89739P(30);
        }
        if (propertyAccessorDescriptor == null) {
            m89739P(31);
        }
        if (propertyAccessorDescriptor.mo89406u0() != null) {
            return propertyAccessorDescriptor.mo89406u0().mo89344c(typeSubstitutor);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89739P(int i) {
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
    public static DescriptorVisibility m89740S0(DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind) {
        return (kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.m89379g(descriptorVisibility.mo89368f())) ? DescriptorVisibilities.f64703h : descriptorVisibility;
    }

    /* JADX INFO: renamed from: X0 */
    public static ReceiverParameterDescriptor m89741X0(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeM93673q = typeSubstitutor.m93673q(receiverParameterDescriptor.getType(), Variance.IN_VARIANCE);
        if (kotlinTypeM93673q == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(propertyDescriptor, new ContextReceiver(propertyDescriptor, kotlinTypeM93673q, ((ImplicitContextReceiver) receiverParameterDescriptor.getValue()).mo92984a(), receiverParameterDescriptor.getValue()), receiverParameterDescriptor.getAnnotations());
    }

    /* JADX INFO: renamed from: Y0 */
    public static ReceiverParameterDescriptor m89742Y0(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeM93673q = typeSubstitutor.m93673q(receiverParameterDescriptor.getType(), Variance.IN_VARIANCE);
        if (kotlinTypeM93673q == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(propertyDescriptor, new ExtensionReceiver(propertyDescriptor, kotlinTypeM93673q, receiverParameterDescriptor.getValue()), receiverParameterDescriptor.getAnnotations());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public PropertyDescriptor mo89343a0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        PropertyDescriptor propertyDescriptorM89770n = m89752R0().m89777u(declarationDescriptor).m89776t(null).m89775s(modality).m89779w(descriptorVisibility).m89774r(kind).m89773q(z).m89770n();
        if (propertyDescriptorM89770n == null) {
            m89739P(42);
        }
        return propertyDescriptorM89770n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: J */
    public <V> V mo89334J(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public PropertyDescriptorImpl mo89745J0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name name, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m89739P(32);
        }
        if (modality == null) {
            m89739P(33);
        }
        if (descriptorVisibility == null) {
            m89739P(34);
        }
        if (kind == null) {
            m89739P(35);
        }
        if (name == null) {
            m89739P(36);
        }
        if (sourceElement == null) {
            m89739P(37);
        }
        return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, mo89511y(), name, kind, sourceElement, mo89512y0(), isConst(), mo89198n0(), mo89192e0(), isExternal(), mo89513T());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: K */
    public FieldDescriptor mo89474K() {
        return this.f64930A;
    }

    @Nullable
    /* JADX INFO: renamed from: K0 */
    public PropertyDescriptor m89746K0(@NotNull CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        Function0<NullableLazyValue<ConstantValue<?>>> function0;
        if (copyConfiguration == null) {
            m89739P(29);
        }
        PropertyDescriptorImpl propertyDescriptorImplMo89745J0 = mo89745J0(copyConfiguration.f64950a, copyConfiguration.f64951b, copyConfiguration.f64952c, copyConfiguration.f64953d, copyConfiguration.f64955f, copyConfiguration.f64960k, m89748M0(copyConfiguration.f64954e, copyConfiguration.f64953d));
        List<TypeParameterDescriptor> typeParameters = copyConfiguration.f64959j == null ? getTypeParameters() : copyConfiguration.f64959j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorM93473b = DescriptorSubstitutor.m93473b(typeParameters, copyConfiguration.f64956g, propertyDescriptorImplMo89745J0, arrayList);
        KotlinType kotlinType = copyConfiguration.f64961l;
        KotlinType kotlinTypeM93673q = typeSubstitutorM93473b.m93673q(kotlinType, Variance.OUT_VARIANCE);
        if (kotlinTypeM93673q == null) {
            return null;
        }
        KotlinType kotlinTypeM93673q2 = typeSubstitutorM93473b.m93673q(kotlinType, Variance.IN_VARIANCE);
        if (kotlinTypeM93673q2 != null) {
            propertyDescriptorImplMo89745J0.mo89753T0(kotlinTypeM93673q2);
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = copyConfiguration.f64958i;
        if (receiverParameterDescriptor2 != null) {
            ReceiverParameterDescriptor receiverParameterDescriptorMo89344c = receiverParameterDescriptor2.mo89344c(typeSubstitutorM93473b);
            if (receiverParameterDescriptorMo89344c == null) {
                return null;
            }
            receiverParameterDescriptor = receiverParameterDescriptorMo89344c;
        } else {
            receiverParameterDescriptor = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = this.f64945v;
        ReceiverParameterDescriptor receiverParameterDescriptorM89742Y0 = receiverParameterDescriptor3 != null ? m89742Y0(typeSubstitutorM93473b, propertyDescriptorImplMo89745J0, receiverParameterDescriptor3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<ReceiverParameterDescriptor> it = this.f64943t.iterator();
        while (it.hasNext()) {
            ReceiverParameterDescriptor receiverParameterDescriptorM89741X0 = m89741X0(typeSubstitutorM93473b, propertyDescriptorImplMo89745J0, it.next());
            if (receiverParameterDescriptorM89741X0 != null) {
                arrayList2.add(receiverParameterDescriptorM89741X0);
            }
        }
        propertyDescriptorImplMo89745J0.m89755V0(kotlinTypeM93673q, arrayList, receiverParameterDescriptor, receiverParameterDescriptorM89742Y0, arrayList2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f64947x == null ? null : new PropertyGetterDescriptorImpl(propertyDescriptorImplMo89745J0, this.f64947x.getAnnotations(), copyConfiguration.f64951b, m89740S0(this.f64947x.getVisibility(), copyConfiguration.f64955f), this.f64947x.mo89472U(), this.f64947x.isExternal(), this.f64947x.isInline(), copyConfiguration.f64955f, copyConfiguration.m89771o(), SourceElement.f64737a);
        if (propertyGetterDescriptorImpl != null) {
            KotlinType returnType = this.f64947x.getReturnType();
            propertyGetterDescriptorImpl.m89734G0(m89738N0(typeSubstitutorM93473b, this.f64947x));
            propertyGetterDescriptorImpl.m89782J0(returnType != null ? typeSubstitutorM93473b.m93673q(returnType, Variance.OUT_VARIANCE) : null);
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = this.f64948y == null ? null : new PropertySetterDescriptorImpl(propertyDescriptorImplMo89745J0, this.f64948y.getAnnotations(), copyConfiguration.f64951b, m89740S0(this.f64948y.getVisibility(), copyConfiguration.f64955f), this.f64948y.mo89472U(), this.f64948y.isExternal(), this.f64948y.isInline(), copyConfiguration.f64955f, copyConfiguration.m89772p(), SourceElement.f64737a);
        if (propertySetterDescriptorImpl != null) {
            List<ValueParameterDescriptor> listM89629I0 = FunctionDescriptorImpl.m89629I0(propertySetterDescriptorImpl, this.f64948y.mo89339g(), typeSubstitutorM93473b, false, false, null);
            if (listM89629I0 == null) {
                propertyDescriptorImplMo89745J0.m89754U0(true);
                listM89629I0 = Collections.singletonList(PropertySetterDescriptorImpl.m89783I0(propertySetterDescriptorImpl, DescriptorUtilsKt.m92871m(copyConfiguration.f64950a).m89104I(), this.f64948y.mo89339g().get(0).getAnnotations()));
            }
            if (listM89629I0.size() != 1) {
                wpg0.m207458a();
                return null;
            }
            propertySetterDescriptorImpl.m89734G0(m89738N0(typeSubstitutorM93473b, this.f64948y));
            propertySetterDescriptorImpl.m89786K0(listM89629I0.get(0));
        }
        FieldDescriptor fieldDescriptor = this.f64930A;
        FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? null : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), propertyDescriptorImplMo89745J0);
        FieldDescriptor fieldDescriptor2 = this.f64931B;
        propertyDescriptorImplMo89745J0.m89750P0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? null : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), propertyDescriptorImplMo89745J0));
        if (copyConfiguration.f64957h) {
            SmartSet smartSetM94110a = SmartSet.m94110a();
            Iterator<? extends PropertyDescriptor> it2 = mo89338e().iterator();
            while (it2.hasNext()) {
                smartSetM94110a.add(it2.next().mo89344c(typeSubstitutorM93473b));
            }
            propertyDescriptorImplMo89745J0.mo89342N(smartSetM94110a);
        }
        if (isConst() && (function0 = this.f64989h) != null) {
            propertyDescriptorImplMo89745J0.m89828E0(this.f64988g, function0);
        }
        return propertyDescriptorImplMo89745J0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public PropertyGetterDescriptorImpl getGetter() {
        return this.f64947x;
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public final SourceElement m89748M0(boolean z, @Nullable PropertyDescriptor propertyDescriptor) {
        SourceElement source;
        if (z) {
            if (propertyDescriptor == null) {
                propertyDescriptor = mo89336a();
            }
            source = propertyDescriptor.getSource();
        } else {
            source = SourceElement.f64737a;
        }
        if (source == null) {
            m89739P(28);
        }
        return source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: N */
    public void mo89342N(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            m89739P(40);
        }
        this.f64934k = collection;
    }

    /* JADX INFO: renamed from: O0 */
    public void m89749O0(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, @Nullable PropertySetterDescriptor propertySetterDescriptor) {
        m89750P0(propertyGetterDescriptorImpl, propertySetterDescriptor, null, null);
    }

    /* JADX INFO: renamed from: P0 */
    public void m89750P0(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, @Nullable PropertySetterDescriptor propertySetterDescriptor, @Nullable FieldDescriptor fieldDescriptor, @Nullable FieldDescriptor fieldDescriptor2) {
        this.f64947x = propertyGetterDescriptorImpl;
        this.f64948y = propertySetterDescriptor;
        this.f64930A = fieldDescriptor;
        this.f64931B = fieldDescriptor2;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m89751Q0() {
        return this.f64949z;
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public CopyConfiguration m89752R0() {
        return new CopyConfiguration();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo88561c(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    /* JADX INFO: renamed from: T */
    public boolean mo89513T() {
        return this.f64942s;
    }

    /* JADX INFO: renamed from: T0 */
    public void mo89753T0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89739P(14);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m89754U0(boolean z) {
        this.f64949z = z;
    }

    /* JADX INFO: renamed from: V0 */
    public void m89755V0(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeParameterDescriptor> list, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<ReceiverParameterDescriptor> list2) {
        if (kotlinType == null) {
            m89739P(17);
        }
        if (list == null) {
            m89739P(18);
        }
        if (list2 == null) {
            m89739P(19);
        }
        m89826D0(kotlinType);
        this.f64946w = new ArrayList(list);
        this.f64945v = receiverParameterDescriptor2;
        this.f64944u = receiverParameterDescriptor;
        this.f64943t = list2;
    }

    /* JADX INFO: renamed from: W0 */
    public void m89756W0(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            m89739P(20);
        }
        this.f64933j = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: Y */
    public ReceiverParameterDescriptor mo89335Y() {
        return this.f64944u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public PropertyDescriptor mo89336a() {
        PropertyDescriptor propertyDescriptorMo89336a;
        PropertyDescriptor propertyDescriptor = this.f64935l;
        ?? r1 = this;
        if (propertyDescriptor != this) {
            propertyDescriptorMo89336a = propertyDescriptor.mo89336a();
        }
        if (r1 == 0) {
            r1 = propertyDescriptorMo89336a;
            m89739P(38);
        }
        r1 = propertyDescriptorMo89336a;
        return r1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public ReceiverParameterDescriptor mo89337b0() {
        return this.f64945v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: c */
    public PropertyDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m89739P(27);
        }
        return typeSubstitutor.m93670l() ? this : m89752R0().m89778v(typeSubstitutor.m93669k()).m89776t(mo89336a()).m89770n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<? extends PropertyDescriptor> mo89338e() {
        Collection<? extends PropertyDescriptor> collection = this.f64934k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            m89739P(41);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo89192e0() {
        return this.f64940q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f64936m;
        if (kind == null) {
            m89739P(39);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType type = getType();
        if (type == null) {
            m89739P(23);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.f64948y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.f64946w;
        if (list != null) {
            return list;
        }
        xtq0.m213103a("typeParameters == null for ", this);
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f64933j;
        if (descriptorVisibility == null) {
            m89739P(25);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo89194i() {
        Modality modality = this.f64932i;
        if (modality == null) {
            m89739P(24);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f64938o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f64941r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo89198n0() {
        return this.f64939p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    /* JADX INFO: renamed from: r */
    public List<PropertyAccessorDescriptor> mo89475r() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f64947x;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.f64948y;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public List<ReceiverParameterDescriptor> mo89341x0() {
        List<ReceiverParameterDescriptor> list = this.f64943t;
        if (list == null) {
            m89739P(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: y0 */
    public boolean mo89512y0() {
        return this.f64937n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: z */
    public FieldDescriptor mo89476z() {
        return this.f64931B;
    }
}
