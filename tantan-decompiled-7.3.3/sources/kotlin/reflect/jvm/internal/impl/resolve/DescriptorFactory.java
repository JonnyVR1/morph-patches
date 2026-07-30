package kotlin.reflect.jvm.internal.impl.resolve;

import com.p051p1.mobile.putong.data.Owner;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorFactory {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory$a */
    public static class C15411a extends ClassConstructorDescriptorImpl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15411a(@NotNull ClassDescriptor classDescriptor, @NotNull SourceElement sourceElement, boolean z) {
            super(classDescriptor, null, Annotations.Companion.m89532b(), true, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
            if (classDescriptor == null) {
                m92637P(0);
            }
            if (sourceElement == null) {
                m92637P(1);
            }
            m89592j1(Collections.EMPTY_LIST, DescriptorUtils.m92661k(classDescriptor, z));
        }

        /* JADX INFO: renamed from: P */
        private static /* synthetic */ void m92637P(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m92620a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = Owner.TYPE;
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ReceiverParameterDescriptor m92621b(@NotNull CallableDescriptor callableDescriptor, @Nullable KotlinType kotlinType, @Nullable Name name, @NotNull Annotations annotations, int i) {
        if (callableDescriptor == null) {
            m92620a(32);
        }
        if (annotations == null) {
            m92620a(33);
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ContextReceiver(callableDescriptor, kotlinType, name, null), annotations, NameUtils.m91977a(i));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ReceiverParameterDescriptor m92622c(@NotNull ClassDescriptor classDescriptor, @Nullable KotlinType kotlinType, @Nullable Name name, @NotNull Annotations annotations, int i) {
        if (classDescriptor == null) {
            m92620a(34);
        }
        if (annotations == null) {
            m92620a(35);
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(classDescriptor, new ContextClassReceiver(classDescriptor, kotlinType, name, null), annotations, NameUtils.m91977a(i));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static PropertyGetterDescriptorImpl m92623d(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations) {
        if (propertyDescriptor == null) {
            m92620a(13);
        }
        if (annotations == null) {
            m92620a(14);
        }
        return m92629j(propertyDescriptor, annotations, true, false, false);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static PropertySetterDescriptorImpl m92624e(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Annotations annotations2) {
        if (propertyDescriptor == null) {
            m92620a(0);
        }
        if (annotations == null) {
            m92620a(1);
        }
        if (annotations2 == null) {
            m92620a(2);
        }
        return m92633n(propertyDescriptor, annotations, annotations2, true, false, false, propertyDescriptor.getSource());
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static PropertyDescriptor m92625f(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m92620a(26);
        }
        ModuleDescriptor moduleDescriptorM92657g = DescriptorUtils.m92657g(classDescriptor);
        ClassDescriptor classDescriptorMo92776a = StdlibClassFinderKt.m92777a(moduleDescriptorM92657g).mo92776a(moduleDescriptorM92657g);
        if (classDescriptorMo92776a == null) {
            return null;
        }
        Annotations.Companion companion = Annotations.Companion;
        Annotations annotationsM89532b = companion.m89532b();
        Modality modality = Modality.FINAL;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f64700e;
        Name name = StandardNames.f64486d;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        PropertyDescriptorImpl propertyDescriptorImplM89737I0 = PropertyDescriptorImpl.m89737I0(classDescriptor, annotationsM89532b, modality, descriptorVisibility, false, name, kind, classDescriptor.getSource(), false, false, false, false, false, false);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplM89737I0, companion.m89532b(), modality, descriptorVisibility, false, false, false, kind, null, classDescriptor.getSource());
        propertyDescriptorImplM89737I0.m89749O0(propertyGetterDescriptorImpl, null);
        SimpleType simpleTypeM93523i = KotlinTypeFactory.m93523i(TypeAttributes.Companion.m93600k(), classDescriptorMo92776a.mo89196l(), Collections.singletonList(new TypeProjectionImpl(classDescriptor.mo89349o())), false);
        List<? extends TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        propertyDescriptorImplM89737I0.m89755V0(simpleTypeM93523i, list, null, null, list);
        propertyGetterDescriptorImpl.m89782J0(propertyDescriptorImplM89737I0.getReturnType());
        return propertyDescriptorImplM89737I0;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static SimpleFunctionDescriptor m92626g(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m92620a(24);
        }
        Annotations.Companion companion = Annotations.Companion;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplM89789e1 = SimpleFunctionDescriptorImpl.m89789e1(classDescriptor, companion.m89532b(), StandardNames.f64487e, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(simpleFunctionDescriptorImplM89789e1, null, 0, companion.m89532b(), Name.m91970i("value"), DescriptorUtilsKt.m92871m(classDescriptor).m89116X(), false, false, false, null, classDescriptor.getSource());
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplM89792g1 = simpleFunctionDescriptorImplM89789e1.mo89634K0(null, null, list, list, Collections.singletonList(valueParameterDescriptorImpl), classDescriptor.mo89349o(), Modality.FINAL, DescriptorVisibilities.f64700e);
        if (simpleFunctionDescriptorImplM89792g1 == null) {
            m92620a(25);
        }
        return simpleFunctionDescriptorImplM89792g1;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static SimpleFunctionDescriptor m92627h(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m92620a(22);
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplM89789e1 = SimpleFunctionDescriptorImpl.m89789e1(classDescriptor, Annotations.Companion.m89532b(), StandardNames.f64485c, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplM89792g1 = simpleFunctionDescriptorImplM89789e1.mo89634K0(null, null, list, list, list, DescriptorUtilsKt.m92871m(classDescriptor).m89127m(Variance.INVARIANT, classDescriptor.mo89349o()), Modality.FINAL, DescriptorVisibilities.f64700e);
        if (simpleFunctionDescriptorImplM89792g1 == null) {
            m92620a(23);
        }
        return simpleFunctionDescriptorImplM89792g1;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static ReceiverParameterDescriptor m92628i(@NotNull CallableDescriptor callableDescriptor, @Nullable KotlinType kotlinType, @NotNull Annotations annotations) {
        if (callableDescriptor == null) {
            m92620a(30);
        }
        if (annotations == null) {
            m92620a(31);
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static PropertyGetterDescriptorImpl m92629j(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, boolean z, boolean z2, boolean z3) {
        if (propertyDescriptor == null) {
            m92620a(15);
        }
        if (annotations == null) {
            m92620a(16);
        }
        return m92630k(propertyDescriptor, annotations, z, z2, z3, propertyDescriptor.getSource());
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static PropertyGetterDescriptorImpl m92630k(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, boolean z, boolean z2, boolean z3, @NotNull SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            m92620a(17);
        }
        if (annotations == null) {
            m92620a(18);
        }
        if (sourceElement == null) {
            m92620a(19);
        }
        return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.mo89194i(), propertyDescriptor.getVisibility(), z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static ClassConstructorDescriptorImpl m92631l(@NotNull ClassDescriptor classDescriptor, @NotNull SourceElement sourceElement) {
        if (classDescriptor == null) {
            m92620a(20);
        }
        if (sourceElement == null) {
            m92620a(21);
        }
        return new C15411a(classDescriptor, sourceElement, false);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static PropertySetterDescriptorImpl m92632m(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Annotations annotations2, boolean z, boolean z2, boolean z3, @NotNull DescriptorVisibility descriptorVisibility, @NotNull SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            m92620a(7);
        }
        if (annotations == null) {
            m92620a(8);
        }
        if (annotations2 == null) {
            m92620a(9);
        }
        if (descriptorVisibility == null) {
            m92620a(10);
        }
        if (sourceElement == null) {
            m92620a(11);
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.mo89194i(), descriptorVisibility, z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        propertySetterDescriptorImpl.m89786K0(PropertySetterDescriptorImpl.m89783I0(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2));
        return propertySetterDescriptorImpl;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static PropertySetterDescriptorImpl m92633n(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Annotations annotations2, boolean z, boolean z2, boolean z3, @NotNull SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            m92620a(3);
        }
        if (annotations == null) {
            m92620a(4);
        }
        if (annotations2 == null) {
            m92620a(5);
        }
        if (sourceElement == null) {
            m92620a(6);
        }
        return m92632m(propertyDescriptor, annotations, annotations2, z, z2, z3, propertyDescriptor.getVisibility(), sourceElement);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m92634o(@NotNull FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            m92620a(29);
        }
        return functionDescriptor.getKind() == CallableMemberDescriptor.Kind.SYNTHESIZED && DescriptorUtils.m92638A(functionDescriptor.mo89190b());
    }

    /* JADX INFO: renamed from: p */
    public static boolean m92635p(@NotNull FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            m92620a(28);
        }
        return functionDescriptor.getName().equals(StandardNames.f64487e) && m92634o(functionDescriptor);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m92636q(@NotNull FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            m92620a(27);
        }
        return functionDescriptor.getName().equals(StandardNames.f64485c) && m92634o(functionDescriptor);
    }
}
