package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.o760;
import p153l.poj0;
import p153l.pr3;
import p153l.wwq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorBasedTypeSignatureMappingKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m91083a(@NotNull ClassDescriptor classDescriptor, @NotNull TypeMappingConfiguration<?> typeMappingConfiguration) {
        classDescriptor.getClass();
        typeMappingConfiguration.getClass();
        String strMo91291d = typeMappingConfiguration.mo91291d(classDescriptor);
        if (strMo91291d != null) {
            return strMo91291d;
        }
        DeclarationDescriptor declarationDescriptorMo89190b = classDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        String strM91975g = SpecialNames.m91979b(classDescriptor.getName()).m91975g();
        strM91975g.getClass();
        if (declarationDescriptorMo89190b instanceof PackageFragmentDescriptor) {
            FqName fqNameMo89453d = ((PackageFragmentDescriptor) declarationDescriptorMo89190b).mo89453d();
            if (fqNameMo89453d.m91939c()) {
                return strM91975g;
            }
            return C15493d.m94369E(fqNameMo89453d.m91937a(), '.', '/', false, 4, null) + '/' + strM91975g;
        }
        ClassDescriptor classDescriptor2 = declarationDescriptorMo89190b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo89190b : null;
        if (classDescriptor2 == null) {
            wwq0.m208289a("Unexpected container: ", declarationDescriptorMo89190b, " for ", classDescriptor);
            return null;
        }
        String strMo91289b = typeMappingConfiguration.mo91289b(classDescriptor2);
        if (strMo91289b == null) {
            strMo91289b = m91083a(classDescriptor2, typeMappingConfiguration);
        }
        return strMo91289b + '$' + strM91975g;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m91084b(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return m91083a(classDescriptor, typeMappingConfiguration);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m91085c(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        if (callableDescriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        returnType.getClass();
        if (!KotlinBuiltIns.m89061D0(returnType)) {
            return false;
        }
        KotlinType returnType2 = callableDescriptor.getReturnType();
        returnType2.getClass();
        return (TypeUtils.m93692l(returnType2) || (callableDescriptor instanceof PropertyGetterDescriptor)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v27, types: [T, java.lang.Object] */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> T m91086d(@NotNull KotlinType kotlinType, @NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull TypeMappingMode typeMappingMode, @NotNull final TypeMappingConfiguration<? extends T> typeMappingConfiguration, @Nullable JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, @NotNull Function3<? super KotlinType, ? super T, ? super TypeMappingMode, Unit> function3) {
        T t;
        KotlinType kotlinType2;
        Object objM91086d;
        kotlinType.getClass();
        jvmTypeFactory.getClass();
        typeMappingMode.getClass();
        typeMappingConfiguration.getClass();
        function3.getClass();
        KotlinType kotlinTypeMo91290c = typeMappingConfiguration.mo91290c(kotlinType);
        if (kotlinTypeMo91290c != null) {
            return (T) m91086d(kotlinTypeMo91290c, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        if (FunctionTypesKt.m89053s(kotlinType)) {
            return (T) m91086d(SuspendFunctionTypesKt.m89167a(kotlinType), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        Object objM91304b = TypeSignatureMappingKt.m91304b(SimpleClassicTypeSystemContext.INSTANCE, kotlinType, jvmTypeFactory, typeMappingMode);
        if (objM91304b != null) {
            ?? r7 = (Object) TypeSignatureMappingKt.m91303a(jvmTypeFactory, objM91304b, typeMappingMode.m91299d());
            function3.invoke(kotlinType, r7, typeMappingMode);
            return r7;
        }
        TypeConstructor typeConstructorMo92781G0 = kotlinType.mo92781G0();
        if (typeConstructorMo92781G0 instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) typeConstructorMo92781G0;
            KotlinType kotlinTypeM93511n = intersectionTypeConstructor.m93511n();
            if (kotlinTypeM93511n == null) {
                kotlinTypeM93511n = typeMappingConfiguration.mo91294g(intersectionTypeConstructor.mo89569c());
            }
            return (T) m91086d(TypeUtilsKt.m93969D(kotlinTypeM93511n), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructorMo92781G0.mo89207e();
        if (classifierDescriptorMo89207e == null) {
            poj0.m173108a("no descriptor for type constructor of ", kotlinType);
            return null;
        }
        if (ErrorUtils.m93894m(classifierDescriptorMo89207e)) {
            T t2 = (T) jvmTypeFactory.mo91247f("error/NonExistentClass");
            typeMappingConfiguration.mo91292e(kotlinType, (ClassDescriptor) classifierDescriptorMo89207e);
            if (jvmDescriptorTypeWriter != 0) {
                jvmDescriptorTypeWriter.m91214c(t2);
            }
            return t2;
        }
        boolean z = classifierDescriptorMo89207e instanceof ClassDescriptor;
        if (z && KotlinBuiltIns.m89072d0(kotlinType)) {
            if (kotlinType.mo92779E0().size() != 1) {
                pr3.m173429a("arrays must have one type argument");
                return null;
            }
            TypeProjection typeProjection = kotlinType.mo92779E0().get(0);
            KotlinType type = typeProjection.getType();
            type.getClass();
            if (typeProjection.mo93558c() == Variance.IN_VARIANCE) {
                objM91086d = jvmTypeFactory.mo91247f("java/lang/Object");
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.m91213b();
                    jvmDescriptorTypeWriter.m91214c(objM91086d);
                    jvmDescriptorTypeWriter.m91212a();
                }
            } else {
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.m91213b();
                }
                Variance varianceMo93558c = typeProjection.mo93558c();
                varianceMo93558c.getClass();
                objM91086d = m91086d(type, jvmTypeFactory, typeMappingMode.m91301f(varianceMo93558c, true), typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.m91212a();
                }
            }
            return (T) jvmTypeFactory.mo91242a("[" + jvmTypeFactory.mo91246e(objM91086d));
        }
        if (!z) {
            if (!(classifierDescriptorMo89207e instanceof TypeParameterDescriptor)) {
                if ((classifierDescriptorMo89207e instanceof TypeAliasDescriptor) && typeMappingMode.m91297b()) {
                    return (T) m91086d(((TypeAliasDescriptor) classifierDescriptorMo89207e).mo89487V(), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
                }
                poj0.m173108a("Unknown type ", kotlinType);
                return null;
            }
            KotlinType kotlinTypeM93986o = TypeUtilsKt.m93986o((TypeParameterDescriptor) classifierDescriptorMo89207e);
            if (kotlinType.mo90857H0()) {
                kotlinTypeM93986o = TypeUtilsKt.m93967B(kotlinTypeM93986o);
            }
            T t3 = (T) m91086d(kotlinTypeM93986o, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, null, FunctionsKt.m94100l());
            if (jvmDescriptorTypeWriter != 0) {
                Name name = classifierDescriptorMo89207e.getName();
                name.getClass();
                jvmDescriptorTypeWriter.m91216e(name, t3);
            }
            return t3;
        }
        if (InlineClassesUtilsKt.m92678b(classifierDescriptorMo89207e) && !typeMappingMode.m91298c() && (kotlinType2 = (KotlinType) ExpandedTypeUtilsKt.m93484c(new ClassicTypeSystemContext() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DescriptorBasedTypeSignatureMappingKt$mapType$typeSystemContext$1
            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: A */
            public /* bridge */ boolean mo91088A(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93728P(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: A0 */
            public /* bridge */ boolean mo91089A0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93750f0(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: B */
            public boolean mo91090B(RigidTypeMarker rigidTypeMarker) {
                rigidTypeMarker.getClass();
                return mo91131X(mo91136b(rigidTypeMarker));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: B0 */
            public /* bridge */ boolean mo91091B0(SimpleTypeMarker simpleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93736X(this, simpleTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: C */
            public boolean mo91092C(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return mo91126T(kotlinTypeMarker) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: C0 */
            public /* bridge */ int mo91093C0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93766n0(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: D */
            public /* bridge */ List<KotlinTypeMarker> mo91094D(TypeParameterMarker typeParameterMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93714B(this, typeParameterMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: D0 */
            public /* bridge */ PrimitiveType mo91095D0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93777t(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: E */
            public /* bridge */ KotlinTypeMarker mo91096E(TypeSubstitutorMarker typeSubstitutorMarker, KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93772q0(this, typeSubstitutorMarker, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: E0 */
            public /* bridge */ SimpleTypeMarker mo91097E0() {
                return ClassicTypeSystemContext.DefaultImpls.m93762l0(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: F */
            public /* bridge */ TypeConstructorMarker mo91098F(TypeParameterMarker typeParameterMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93785x(this, typeParameterMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: F0 */
            public /* bridge */ Collection<KotlinTypeMarker> mo91099F0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93776s0(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: G */
            public SimpleTypeMarker mo91100G(RigidTypeMarker rigidTypeMarker) {
                SimpleTypeMarker simpleTypeMarkerMo91166q;
                rigidTypeMarker.getClass();
                DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerMo91141d0 = mo91141d0(rigidTypeMarker);
                return (definitelyNotNullTypeMarkerMo91141d0 == null || (simpleTypeMarkerMo91166q = mo91166q(definitelyNotNullTypeMarkerMo91141d0)) == null) ? (SimpleTypeMarker) rigidTypeMarker : simpleTypeMarkerMo91166q;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: G0 */
            public boolean mo91101G0(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return mo91119P0(mo91135a0(kotlinTypeMarker)) != mo91119P0(mo91174u(kotlinTypeMarker));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @Nullable
            /* JADX INFO: renamed from: H */
            public CapturedTypeMarker mo91102H(RigidTypeMarker rigidTypeMarker) {
                rigidTypeMarker.getClass();
                return mo91138c(mo91100G(rigidTypeMarker));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: H0 */
            public /* bridge */ FqNameUnsafe mo91103H0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93771q(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
            /* JADX INFO: renamed from: I */
            public /* bridge */ KotlinTypeMarker mo91104I(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
                return ClassicTypeSystemContext.DefaultImpls.m93763m(this, rigidTypeMarker, rigidTypeMarker2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: I0 */
            public /* bridge */ KotlinTypeMarker mo91105I0(KotlinTypeMarker kotlinTypeMarker, boolean z2) {
                return ClassicTypeSystemContext.DefaultImpls.m93758j0(this, kotlinTypeMarker, z2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: J */
            public /* bridge */ KotlinTypeMarker mo91106J(TypeParameterMarker typeParameterMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93781v(this, typeParameterMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: J0 */
            public KotlinTypeMarker mo91107J0(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return mo91105I0(kotlinTypeMarker, false);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: K */
            public /* bridge */ boolean mo91108K(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93733U(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @Nullable
            /* JADX INFO: renamed from: K0 */
            public List<SimpleTypeMarker> mo91109K0(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
                rigidTypeMarker.getClass();
                typeConstructorMarker.getClass();
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: L */
            public /* bridge */ Collection<KotlinTypeMarker> mo91110L(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93768o0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: L0 */
            public /* bridge */ KotlinTypeMarker mo91111L0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93713A(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: M */
            public /* bridge */ boolean mo91112M(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93735W(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: M0 */
            public /* bridge */ List<TypeParameterMarker> mo91113M0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93775s(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: N */
            public boolean mo91114N(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                FlexibleTypeMarker flexibleTypeMarkerMo91126T = mo91126T(kotlinTypeMarker);
                return (flexibleTypeMarkerMo91126T != null ? mo91123R0(flexibleTypeMarkerMo91126T) : null) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: N0 */
            public boolean mo91115N0(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return mo91108K(mo91116O(kotlinTypeMarker)) && !mo91183y0(kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: O */
            public TypeConstructorMarker mo91116O(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
                if (rigidTypeMarkerMo91142e == null) {
                    rigidTypeMarkerMo91142e = mo91135a0(kotlinTypeMarker);
                }
                return mo91136b(rigidTypeMarkerMo91142e);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: O0 */
            public /* bridge */ TypeParameterMarker mo91117O0(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93787y(this, typeVariableTypeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: P */
            public /* bridge */ boolean mo91118P(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93725M(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: P0 */
            public /* bridge */ boolean mo91119P0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93731S(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: Q */
            public /* bridge */ TypeCheckerState.SupertypesPolicy mo91120Q(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93774r0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: Q0 */
            public /* bridge */ boolean mo91121Q0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93724L(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: R */
            public boolean mo91122R(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
                return (rigidTypeMarkerMo91142e != null ? mo91141d0(rigidTypeMarkerMo91142e) : null) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: R0 */
            public /* bridge */ DynamicTypeMarker mo91123R0(FlexibleTypeMarker flexibleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93751g(this, flexibleTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: S */
            public boolean mo91124S(RigidTypeMarker rigidTypeMarker) {
                rigidTypeMarker.getClass();
                return mo91088A(mo91136b(rigidTypeMarker));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: S0 */
            public /* bridge */ boolean mo91125S0(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
                return ClassicTypeSystemContext.DefaultImpls.m93739a(this, typeConstructorMarker, typeConstructorMarker2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: T */
            public /* bridge */ FlexibleTypeMarker mo91126T(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93753h(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
            public /* bridge */ SimpleType mo91151i0(RigidTypeMarker rigidTypeMarker, CaptureStatus captureStatus) {
                return ClassicTypeSystemContext.DefaultImpls.m93759k(this, rigidTypeMarker, captureStatus);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: U */
            public /* bridge */ CaptureStatus mo91128U(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93761l(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: V */
            public /* bridge */ TypeArgumentMarker mo91129V(CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93770p0(this, capturedTypeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: W */
            public /* bridge */ KotlinTypeMarker mo91130W(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93756i0(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: X */
            public /* bridge */ boolean mo91131X(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93723K(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: Y */
            public /* bridge */ boolean mo91132Y(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93729Q(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: Z */
            public /* bridge */ SimpleTypeMarker mo91133Z(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93743c(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: a */
            public /* bridge */ boolean mo91134a(TypeArgumentMarker typeArgumentMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93744c0(this, typeArgumentMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: a0 */
            public RigidTypeMarker mo91135a0(KotlinTypeMarker kotlinTypeMarker) {
                RigidTypeMarker rigidTypeMarkerMo91148h;
                kotlinTypeMarker.getClass();
                FlexibleTypeMarker flexibleTypeMarkerMo91126T = mo91126T(kotlinTypeMarker);
                if (flexibleTypeMarkerMo91126T != null && (rigidTypeMarkerMo91148h = mo91148h(flexibleTypeMarkerMo91126T)) != null) {
                    return rigidTypeMarkerMo91148h;
                }
                RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
                rigidTypeMarkerMo91142e.getClass();
                return rigidTypeMarkerMo91142e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: b */
            public /* bridge */ TypeConstructorMarker mo91136b(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93780u0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: b0 */
            public /* bridge */ TypeVariance mo91137b0(TypeArgumentMarker typeArgumentMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93715C(this, typeArgumentMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: c */
            public /* bridge */ CapturedTypeMarker mo91138c(SimpleTypeMarker simpleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93747e(this, simpleTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: c0 */
            public /* bridge */ boolean mo91139c0(KotlinTypeMarker kotlinTypeMarker, FqName fqName) {
                return ClassicTypeSystemContext.DefaultImpls.m93717E(this, kotlinTypeMarker, fqName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: d0 */
            public /* bridge */ DefinitelyNotNullTypeMarker mo91141d0(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93749f(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext
            /* JADX INFO: renamed from: e0 */
            public /* bridge */ TypeCheckerState mo91143e0(boolean z2, boolean z3, boolean z4) {
                return ClassicTypeSystemContext.DefaultImpls.m93760k0(this, z2, z3, z4);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
            /* JADX INFO: renamed from: f */
            public KotlinBuiltIns mo91144f() {
                KotlinBuiltIns kotlinBuiltInsMo91293f = typeMappingConfiguration.mo91293f();
                return kotlinBuiltInsMo91293f == null ? ClassicTypeSystemContext.DefaultImpls.m93769p(this) : kotlinBuiltInsMo91293f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: f0 */
            public /* bridge */ KotlinTypeMarker mo91145f0(TypeArgumentMarker typeArgumentMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93783w(this, typeArgumentMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: g */
            public /* bridge */ boolean mo91146g(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93740a0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            @NotNull
            /* JADX INFO: renamed from: g0 */
            public KotlinTypeMarker mo91147g0(KotlinTypeMarker kotlinTypeMarker) {
                RigidTypeMarker rigidTypeMarkerMo91140d;
                kotlinTypeMarker.getClass();
                RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
                return (rigidTypeMarkerMo91142e == null || (rigidTypeMarkerMo91140d = mo91140d(rigidTypeMarkerMo91142e, true)) == null) ? kotlinTypeMarker : rigidTypeMarkerMo91140d;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: h0 */
            public /* bridge */ boolean mo91149h0(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93737Y(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: j */
            public /* bridge */ boolean mo91152j(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93752g0(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: j0 */
            public /* bridge */ boolean mo91153j0(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93718F(this, typeParameterMarker, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: k */
            public /* bridge */ int mo91154k(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93741b(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: k0 */
            public /* bridge */ TypeArgumentListMarker mo91155k0(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93745d(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: l */
            public boolean mo91156l(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return !Intrinsics.m88377d(mo91136b(mo91135a0(kotlinTypeMarker)), mo91136b(mo91174u(kotlinTypeMarker)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: l0 */
            public boolean mo91157l0(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
                return (rigidTypeMarkerMo91142e != null ? mo91102H(rigidTypeMarkerMo91142e) : null) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: m */
            public boolean mo91158m(RigidTypeMarker rigidTypeMarker) {
                rigidTypeMarker.getClass();
                return mo91141d0(rigidTypeMarker) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: m0 */
            public /* bridge */ TypeParameterMarker mo91159m0(TypeConstructorMarker typeConstructorMarker, int i) {
                return ClassicTypeSystemContext.DefaultImpls.m93773r(this, typeConstructorMarker, i);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @Nullable
            /* JADX INFO: renamed from: n */
            public TypeArgumentMarker mo91160n(RigidTypeMarker rigidTypeMarker, int i) {
                rigidTypeMarker.getClass();
                if (i < 0 || i >= mo91154k(rigidTypeMarker)) {
                    return null;
                }
                return mo91177v0(rigidTypeMarker, i);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: n0 */
            public /* bridge */ TypeParameterMarker mo91161n0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93789z(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: o */
            public TypeArgumentMarker mo91162o(TypeArgumentListMarker typeArgumentListMarker, int i) {
                typeArgumentListMarker.getClass();
                if (typeArgumentListMarker instanceof SimpleTypeMarker) {
                    return mo91177v0((KotlinTypeMarker) typeArgumentListMarker, i);
                }
                if (typeArgumentListMarker instanceof ArgumentList) {
                    TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i);
                    typeArgumentMarker.getClass();
                    return typeArgumentMarker;
                }
                StringBuilder sb = new StringBuilder("unknown type argument list type: ");
                sb.append(typeArgumentListMarker);
                o760.m166301a(sb, Reflection.m88396b(typeArgumentListMarker.getClass()));
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: o0 */
            public /* bridge */ boolean mo91163o0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93732T(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: p */
            public /* bridge */ KotlinTypeMarker mo91164p(KotlinTypeMarker kotlinTypeMarker, boolean z2) {
                return ClassicTypeSystemContext.DefaultImpls.m93786x0(this, kotlinTypeMarker, z2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: p0 */
            public /* bridge */ TypeVariance mo91165p0(TypeParameterMarker typeParameterMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93716D(this, typeParameterMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: q */
            public /* bridge */ SimpleTypeMarker mo91166q(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93764m0(this, definitelyNotNullTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: q0 */
            public int mo91167q0(TypeArgumentListMarker typeArgumentListMarker) {
                typeArgumentListMarker.getClass();
                if (typeArgumentListMarker instanceof RigidTypeMarker) {
                    return mo91154k((KotlinTypeMarker) typeArgumentListMarker);
                }
                if (typeArgumentListMarker instanceof ArgumentList) {
                    return ((ArgumentList) typeArgumentListMarker).size();
                }
                StringBuilder sb = new StringBuilder("unknown type argument list type: ");
                sb.append(typeArgumentListMarker);
                o760.m166301a(sb, Reflection.m88396b(typeArgumentListMarker.getClass()));
                return 0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: r */
            public /* bridge */ boolean mo91168r(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93738Z(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: r0 */
            public /* bridge */ List<TypeArgumentMarker> mo91169r0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93767o(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: s */
            public /* bridge */ boolean mo91170s(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93722J(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: s0 */
            public /* bridge */ boolean mo91171s0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93727O(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: t */
            public /* bridge */ KotlinTypeMarker mo91172t(Collection<? extends KotlinTypeMarker> collection) {
                return ClassicTypeSystemContext.DefaultImpls.m93720H(this, collection);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: t0 */
            public /* bridge */ TypeArgumentMarker mo91173t0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93757j(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: u */
            public RigidTypeMarker mo91174u(KotlinTypeMarker kotlinTypeMarker) {
                RigidTypeMarker rigidTypeMarkerMo91150i;
                kotlinTypeMarker.getClass();
                FlexibleTypeMarker flexibleTypeMarkerMo91126T = mo91126T(kotlinTypeMarker);
                if (flexibleTypeMarkerMo91126T != null && (rigidTypeMarkerMo91150i = mo91150i(flexibleTypeMarkerMo91126T)) != null) {
                    return rigidTypeMarkerMo91150i;
                }
                RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
                rigidTypeMarkerMo91142e.getClass();
                return rigidTypeMarkerMo91142e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: u0 */
            public /* bridge */ CapturedTypeConstructorMarker mo91175u0(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93778t0(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: v */
            public /* bridge */ boolean mo91176v(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93726N(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: v0 */
            public /* bridge */ TypeArgumentMarker mo91177v0(KotlinTypeMarker kotlinTypeMarker, int i) {
                return ClassicTypeSystemContext.DefaultImpls.m93765n(this, kotlinTypeMarker, i);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext
            /* JADX INFO: renamed from: w */
            public /* bridge */ boolean mo91178w() {
                return ClassicTypeSystemContext.DefaultImpls.m93730R(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: w0 */
            public /* bridge */ TypeSubstitutorMarker mo91179w0(Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map) {
                return ClassicTypeSystemContext.DefaultImpls.m93782v0(this, map);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: x */
            public /* bridge */ boolean mo91180x(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93746d0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: x0 */
            public /* bridge */ PrimitiveType mo91181x0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93779u(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: y */
            public /* bridge */ boolean mo91182y(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93748e0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: y0 */
            public /* bridge */ boolean mo91183y0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93734V(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: z */
            public /* bridge */ boolean mo91184z(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93721I(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
            /* JADX INFO: renamed from: z0 */
            public /* bridge */ boolean mo91185z0(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
                return ClassicTypeSystemContext.DefaultImpls.m93719G(this, rigidTypeMarker, rigidTypeMarker2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: d */
            public /* bridge */ SimpleTypeMarker mo91140d(RigidTypeMarker rigidTypeMarker, boolean z2) {
                return ClassicTypeSystemContext.DefaultImpls.m93788y0(this, rigidTypeMarker, z2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: e */
            public /* bridge */ SimpleTypeMarker mo91142e(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93755i(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: h */
            public /* bridge */ SimpleTypeMarker mo91148h(FlexibleTypeMarker flexibleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93754h0(this, flexibleTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: i */
            public /* bridge */ SimpleTypeMarker mo91150i(FlexibleTypeMarker flexibleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m93784w0(this, flexibleTypeMarker);
            }
        }, kotlinType)) != null) {
            return (T) m91086d(kotlinType2, jvmTypeFactory, typeMappingMode.m91302g(), typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        if (typeMappingMode.m91300e() && KotlinBuiltIns.m89082m0((ClassDescriptor) classifierDescriptorMo89207e)) {
            t = (Object) jvmTypeFactory.mo91243b();
        } else {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo89207e;
            ClassDescriptor classDescriptorMo89336a = classDescriptor.mo89336a();
            classDescriptorMo89336a.getClass();
            T tMo91288a = typeMappingConfiguration.mo91288a(classDescriptorMo89336a);
            if (tMo91288a == null) {
                if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
                    DeclarationDescriptor declarationDescriptorMo89190b = classDescriptor.mo89190b();
                    declarationDescriptorMo89190b.getClass();
                    classDescriptor = (ClassDescriptor) declarationDescriptorMo89190b;
                }
                ClassDescriptor classDescriptorMo89336a2 = classDescriptor.mo89336a();
                classDescriptorMo89336a2.getClass();
                t = (Object) jvmTypeFactory.mo91247f(m91083a(classDescriptorMo89336a2, typeMappingConfiguration));
            } else {
                t = (Object) tMo91288a;
            }
        }
        function3.invoke(kotlinType, t, typeMappingMode);
        return t;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m91087e(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, Function3 function3, int i, Object obj) {
        if ((i & 32) != 0) {
            function3 = FunctionsKt.m94100l();
        }
        return m91086d(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
    }
}
