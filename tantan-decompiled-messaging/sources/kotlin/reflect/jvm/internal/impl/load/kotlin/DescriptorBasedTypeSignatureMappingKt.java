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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.jz50;
import p149l.lfj0;
import p149l.qnq0;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorBasedTypeSignatureMappingKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m90192a(@NotNull ClassDescriptor classDescriptor, @NotNull TypeMappingConfiguration<?> typeMappingConfiguration) {
        classDescriptor.getClass();
        typeMappingConfiguration.getClass();
        String strMo90400d = typeMappingConfiguration.mo90400d(classDescriptor);
        if (strMo90400d != null) {
            return strMo90400d;
        }
        DeclarationDescriptor declarationDescriptorMo88299b = classDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        String strM91084g = SpecialNames.m91088b(classDescriptor.getName()).m91084g();
        strM91084g.getClass();
        if (declarationDescriptorMo88299b instanceof PackageFragmentDescriptor) {
            FqName fqNameMo88562d = ((PackageFragmentDescriptor) declarationDescriptorMo88299b).mo88562d();
            if (fqNameMo88562d.m91048c()) {
                return strM91084g;
            }
            return C15386d.m93478E(fqNameMo88562d.m91046a(), '.', '/', false, 4, null) + '/' + strM91084g;
        }
        ClassDescriptor classDescriptor2 = declarationDescriptorMo88299b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo88299b : null;
        if (classDescriptor2 == null) {
            qnq0.m175688a("Unexpected container: ", declarationDescriptorMo88299b, " for ", classDescriptor);
            return null;
        }
        String strMo90398b = typeMappingConfiguration.mo90398b(classDescriptor2);
        if (strMo90398b == null) {
            strMo90398b = m90192a(classDescriptor2, typeMappingConfiguration);
        }
        return strMo90398b + '$' + strM91084g;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m90193b(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return m90192a(classDescriptor, typeMappingConfiguration);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m90194c(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        if (callableDescriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        returnType.getClass();
        if (!KotlinBuiltIns.m88170D0(returnType)) {
            return false;
        }
        KotlinType returnType2 = callableDescriptor.getReturnType();
        returnType2.getClass();
        return (TypeUtils.m92801l(returnType2) || (callableDescriptor instanceof PropertyGetterDescriptor)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v27, types: [T, java.lang.Object] */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> T m90195d(@NotNull KotlinType kotlinType, @NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull TypeMappingMode typeMappingMode, @NotNull final TypeMappingConfiguration<? extends T> typeMappingConfiguration, @Nullable JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, @NotNull Function3<? super KotlinType, ? super T, ? super TypeMappingMode, Unit> function3) {
        T t;
        KotlinType kotlinType2;
        Object objM90195d;
        kotlinType.getClass();
        jvmTypeFactory.getClass();
        typeMappingMode.getClass();
        typeMappingConfiguration.getClass();
        function3.getClass();
        KotlinType kotlinTypeMo90399c = typeMappingConfiguration.mo90399c(kotlinType);
        if (kotlinTypeMo90399c != null) {
            return (T) m90195d(kotlinTypeMo90399c, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        if (FunctionTypesKt.m88162s(kotlinType)) {
            return (T) m90195d(SuspendFunctionTypesKt.m88276a(kotlinType), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        Object objM90413b = TypeSignatureMappingKt.m90413b(SimpleClassicTypeSystemContext.INSTANCE, kotlinType, jvmTypeFactory, typeMappingMode);
        if (objM90413b != null) {
            ?? r7 = (Object) TypeSignatureMappingKt.m90412a(jvmTypeFactory, objM90413b, typeMappingMode.m90408d());
            function3.invoke(kotlinType, r7, typeMappingMode);
            return r7;
        }
        TypeConstructor typeConstructorMo91890G0 = kotlinType.mo91890G0();
        if (typeConstructorMo91890G0 instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) typeConstructorMo91890G0;
            KotlinType kotlinTypeM92620n = intersectionTypeConstructor.m92620n();
            if (kotlinTypeM92620n == null) {
                kotlinTypeM92620n = typeMappingConfiguration.mo90403g(intersectionTypeConstructor.mo88678c());
            }
            return (T) m90195d(TypeUtilsKt.m93078D(kotlinTypeM92620n), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        ClassifierDescriptor classifierDescriptorMo88316e = typeConstructorMo91890G0.mo88316e();
        if (classifierDescriptorMo88316e == null) {
            lfj0.m149710a("no descriptor for type constructor of ", kotlinType);
            return null;
        }
        if (ErrorUtils.m93003m(classifierDescriptorMo88316e)) {
            T t2 = (T) jvmTypeFactory.mo90356f("error/NonExistentClass");
            typeMappingConfiguration.mo90401e(kotlinType, (ClassDescriptor) classifierDescriptorMo88316e);
            if (jvmDescriptorTypeWriter != 0) {
                jvmDescriptorTypeWriter.m90323c(t2);
            }
            return t2;
        }
        boolean z = classifierDescriptorMo88316e instanceof ClassDescriptor;
        if (z && KotlinBuiltIns.m88181d0(kotlinType)) {
            if (kotlinType.mo91888E0().size() != 1) {
                qq3.m175877a("arrays must have one type argument");
                return null;
            }
            TypeProjection typeProjection = kotlinType.mo91888E0().get(0);
            KotlinType type = typeProjection.getType();
            type.getClass();
            if (typeProjection.mo92667c() == Variance.IN_VARIANCE) {
                objM90195d = jvmTypeFactory.mo90356f("java/lang/Object");
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.m90322b();
                    jvmDescriptorTypeWriter.m90323c(objM90195d);
                    jvmDescriptorTypeWriter.m90321a();
                }
            } else {
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.m90322b();
                }
                Variance varianceMo92667c = typeProjection.mo92667c();
                varianceMo92667c.getClass();
                objM90195d = m90195d(type, jvmTypeFactory, typeMappingMode.m90410f(varianceMo92667c, true), typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.m90321a();
                }
            }
            return (T) jvmTypeFactory.mo90351a("[" + jvmTypeFactory.mo90355e(objM90195d));
        }
        if (!z) {
            if (!(classifierDescriptorMo88316e instanceof TypeParameterDescriptor)) {
                if ((classifierDescriptorMo88316e instanceof TypeAliasDescriptor) && typeMappingMode.m90406b()) {
                    return (T) m90195d(((TypeAliasDescriptor) classifierDescriptorMo88316e).mo88596V(), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
                }
                lfj0.m149710a("Unknown type ", kotlinType);
                return null;
            }
            KotlinType kotlinTypeM93095o = TypeUtilsKt.m93095o((TypeParameterDescriptor) classifierDescriptorMo88316e);
            if (kotlinType.mo89966H0()) {
                kotlinTypeM93095o = TypeUtilsKt.m93076B(kotlinTypeM93095o);
            }
            T t3 = (T) m90195d(kotlinTypeM93095o, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, null, FunctionsKt.m93209l());
            if (jvmDescriptorTypeWriter != 0) {
                Name name = classifierDescriptorMo88316e.getName();
                name.getClass();
                jvmDescriptorTypeWriter.m90325e(name, t3);
            }
            return t3;
        }
        if (InlineClassesUtilsKt.m91787b(classifierDescriptorMo88316e) && !typeMappingMode.m90407c() && (kotlinType2 = (KotlinType) ExpandedTypeUtilsKt.m92593c(new ClassicTypeSystemContext() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DescriptorBasedTypeSignatureMappingKt$mapType$typeSystemContext$1
            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: A */
            public /* bridge */ boolean mo90197A(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92837P(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: A0 */
            public /* bridge */ boolean mo90198A0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92859f0(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: B */
            public boolean mo90199B(RigidTypeMarker rigidTypeMarker) {
                rigidTypeMarker.getClass();
                return mo90240X(mo90245b(rigidTypeMarker));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: B0 */
            public /* bridge */ boolean mo90200B0(SimpleTypeMarker simpleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92845X(this, simpleTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: C */
            public boolean mo90201C(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return mo90235T(kotlinTypeMarker) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: C0 */
            public /* bridge */ int mo90202C0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92875n0(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: D */
            public /* bridge */ List<KotlinTypeMarker> mo90203D(TypeParameterMarker typeParameterMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92823B(this, typeParameterMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: D0 */
            public /* bridge */ PrimitiveType mo90204D0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92886t(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: E */
            public /* bridge */ KotlinTypeMarker mo90205E(TypeSubstitutorMarker typeSubstitutorMarker, KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92881q0(this, typeSubstitutorMarker, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: E0 */
            public /* bridge */ SimpleTypeMarker mo90206E0() {
                return ClassicTypeSystemContext.DefaultImpls.m92871l0(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: F */
            public /* bridge */ TypeConstructorMarker mo90207F(TypeParameterMarker typeParameterMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92894x(this, typeParameterMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: F0 */
            public /* bridge */ Collection<KotlinTypeMarker> mo90208F0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92885s0(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: G */
            public SimpleTypeMarker mo90209G(RigidTypeMarker rigidTypeMarker) {
                SimpleTypeMarker simpleTypeMarkerMo90275q;
                rigidTypeMarker.getClass();
                DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerMo90250d0 = mo90250d0(rigidTypeMarker);
                return (definitelyNotNullTypeMarkerMo90250d0 == null || (simpleTypeMarkerMo90275q = mo90275q(definitelyNotNullTypeMarkerMo90250d0)) == null) ? (SimpleTypeMarker) rigidTypeMarker : simpleTypeMarkerMo90275q;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: G0 */
            public boolean mo90210G0(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return mo90228P0(mo90244a0(kotlinTypeMarker)) != mo90228P0(mo90283u(kotlinTypeMarker));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @Nullable
            /* JADX INFO: renamed from: H */
            public CapturedTypeMarker mo90211H(RigidTypeMarker rigidTypeMarker) {
                rigidTypeMarker.getClass();
                return mo90247c(mo90209G(rigidTypeMarker));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: H0 */
            public /* bridge */ FqNameUnsafe mo90212H0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92880q(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
            /* JADX INFO: renamed from: I */
            public /* bridge */ KotlinTypeMarker mo90213I(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
                return ClassicTypeSystemContext.DefaultImpls.m92872m(this, rigidTypeMarker, rigidTypeMarker2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: I0 */
            public /* bridge */ KotlinTypeMarker mo90214I0(KotlinTypeMarker kotlinTypeMarker, boolean z2) {
                return ClassicTypeSystemContext.DefaultImpls.m92867j0(this, kotlinTypeMarker, z2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: J */
            public /* bridge */ KotlinTypeMarker mo90215J(TypeParameterMarker typeParameterMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92890v(this, typeParameterMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: J0 */
            public KotlinTypeMarker mo90216J0(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return mo90214I0(kotlinTypeMarker, false);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: K */
            public /* bridge */ boolean mo90217K(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92842U(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @Nullable
            /* JADX INFO: renamed from: K0 */
            public List<SimpleTypeMarker> mo90218K0(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
                rigidTypeMarker.getClass();
                typeConstructorMarker.getClass();
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: L */
            public /* bridge */ Collection<KotlinTypeMarker> mo90219L(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92877o0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: L0 */
            public /* bridge */ KotlinTypeMarker mo90220L0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92822A(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: M */
            public /* bridge */ boolean mo90221M(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92844W(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: M0 */
            public /* bridge */ List<TypeParameterMarker> mo90222M0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92884s(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: N */
            public boolean mo90223N(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                FlexibleTypeMarker flexibleTypeMarkerMo90235T = mo90235T(kotlinTypeMarker);
                return (flexibleTypeMarkerMo90235T != null ? mo90232R0(flexibleTypeMarkerMo90235T) : null) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: N0 */
            public boolean mo90224N0(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return mo90217K(mo90225O(kotlinTypeMarker)) && !mo90292y0(kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: O */
            public TypeConstructorMarker mo90225O(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
                if (rigidTypeMarkerMo90251e == null) {
                    rigidTypeMarkerMo90251e = mo90244a0(kotlinTypeMarker);
                }
                return mo90245b(rigidTypeMarkerMo90251e);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: O0 */
            public /* bridge */ TypeParameterMarker mo90226O0(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92896y(this, typeVariableTypeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: P */
            public /* bridge */ boolean mo90227P(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92834M(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: P0 */
            public /* bridge */ boolean mo90228P0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92840S(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: Q */
            public /* bridge */ TypeCheckerState.SupertypesPolicy mo90229Q(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92883r0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: Q0 */
            public /* bridge */ boolean mo90230Q0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92833L(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: R */
            public boolean mo90231R(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
                return (rigidTypeMarkerMo90251e != null ? mo90250d0(rigidTypeMarkerMo90251e) : null) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: R0 */
            public /* bridge */ DynamicTypeMarker mo90232R0(FlexibleTypeMarker flexibleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92860g(this, flexibleTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: S */
            public boolean mo90233S(RigidTypeMarker rigidTypeMarker) {
                rigidTypeMarker.getClass();
                return mo90197A(mo90245b(rigidTypeMarker));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: S0 */
            public /* bridge */ boolean mo90234S0(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
                return ClassicTypeSystemContext.DefaultImpls.m92848a(this, typeConstructorMarker, typeConstructorMarker2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: T */
            public /* bridge */ FlexibleTypeMarker mo90235T(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92862h(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
            public /* bridge */ SimpleType mo90260i0(RigidTypeMarker rigidTypeMarker, CaptureStatus captureStatus) {
                return ClassicTypeSystemContext.DefaultImpls.m92868k(this, rigidTypeMarker, captureStatus);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: U */
            public /* bridge */ CaptureStatus mo90237U(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92870l(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: V */
            public /* bridge */ TypeArgumentMarker mo90238V(CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92879p0(this, capturedTypeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: W */
            public /* bridge */ KotlinTypeMarker mo90239W(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92865i0(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: X */
            public /* bridge */ boolean mo90240X(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92832K(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: Y */
            public /* bridge */ boolean mo90241Y(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92838Q(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: Z */
            public /* bridge */ SimpleTypeMarker mo90242Z(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92852c(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: a */
            public /* bridge */ boolean mo90243a(TypeArgumentMarker typeArgumentMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92853c0(this, typeArgumentMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: a0 */
            public RigidTypeMarker mo90244a0(KotlinTypeMarker kotlinTypeMarker) {
                RigidTypeMarker rigidTypeMarkerMo90257h;
                kotlinTypeMarker.getClass();
                FlexibleTypeMarker flexibleTypeMarkerMo90235T = mo90235T(kotlinTypeMarker);
                if (flexibleTypeMarkerMo90235T != null && (rigidTypeMarkerMo90257h = mo90257h(flexibleTypeMarkerMo90235T)) != null) {
                    return rigidTypeMarkerMo90257h;
                }
                RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
                rigidTypeMarkerMo90251e.getClass();
                return rigidTypeMarkerMo90251e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: b */
            public /* bridge */ TypeConstructorMarker mo90245b(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92889u0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: b0 */
            public /* bridge */ TypeVariance mo90246b0(TypeArgumentMarker typeArgumentMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92824C(this, typeArgumentMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: c */
            public /* bridge */ CapturedTypeMarker mo90247c(SimpleTypeMarker simpleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92856e(this, simpleTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: c0 */
            public /* bridge */ boolean mo90248c0(KotlinTypeMarker kotlinTypeMarker, FqName fqName) {
                return ClassicTypeSystemContext.DefaultImpls.m92826E(this, kotlinTypeMarker, fqName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: d0 */
            public /* bridge */ DefinitelyNotNullTypeMarker mo90250d0(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92858f(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext
            /* JADX INFO: renamed from: e0 */
            public /* bridge */ TypeCheckerState mo90252e0(boolean z2, boolean z3, boolean z4) {
                return ClassicTypeSystemContext.DefaultImpls.m92869k0(this, z2, z3, z4);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
            /* JADX INFO: renamed from: f */
            public KotlinBuiltIns mo90253f() {
                KotlinBuiltIns kotlinBuiltInsMo90402f = typeMappingConfiguration.mo90402f();
                return kotlinBuiltInsMo90402f == null ? ClassicTypeSystemContext.DefaultImpls.m92878p(this) : kotlinBuiltInsMo90402f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: f0 */
            public /* bridge */ KotlinTypeMarker mo90254f0(TypeArgumentMarker typeArgumentMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92892w(this, typeArgumentMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: g */
            public /* bridge */ boolean mo90255g(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92849a0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            @NotNull
            /* JADX INFO: renamed from: g0 */
            public KotlinTypeMarker mo90256g0(KotlinTypeMarker kotlinTypeMarker) {
                RigidTypeMarker rigidTypeMarkerMo90249d;
                kotlinTypeMarker.getClass();
                RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
                return (rigidTypeMarkerMo90251e == null || (rigidTypeMarkerMo90249d = mo90249d(rigidTypeMarkerMo90251e, true)) == null) ? kotlinTypeMarker : rigidTypeMarkerMo90249d;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: h0 */
            public /* bridge */ boolean mo90258h0(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92846Y(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: j */
            public /* bridge */ boolean mo90261j(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92861g0(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: j0 */
            public /* bridge */ boolean mo90262j0(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92827F(this, typeParameterMarker, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: k */
            public /* bridge */ int mo90263k(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92850b(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: k0 */
            public /* bridge */ TypeArgumentListMarker mo90264k0(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92854d(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: l */
            public boolean mo90265l(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                return !Intrinsics.m87488d(mo90245b(mo90244a0(kotlinTypeMarker)), mo90245b(mo90283u(kotlinTypeMarker)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: l0 */
            public boolean mo90266l0(KotlinTypeMarker kotlinTypeMarker) {
                kotlinTypeMarker.getClass();
                RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
                return (rigidTypeMarkerMo90251e != null ? mo90211H(rigidTypeMarkerMo90251e) : null) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: m */
            public boolean mo90267m(RigidTypeMarker rigidTypeMarker) {
                rigidTypeMarker.getClass();
                return mo90250d0(rigidTypeMarker) != null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: m0 */
            public /* bridge */ TypeParameterMarker mo90268m0(TypeConstructorMarker typeConstructorMarker, int i) {
                return ClassicTypeSystemContext.DefaultImpls.m92882r(this, typeConstructorMarker, i);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @Nullable
            /* JADX INFO: renamed from: n */
            public TypeArgumentMarker mo90269n(RigidTypeMarker rigidTypeMarker, int i) {
                rigidTypeMarker.getClass();
                if (i < 0 || i >= mo90263k(rigidTypeMarker)) {
                    return null;
                }
                return mo90286v0(rigidTypeMarker, i);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: n0 */
            public /* bridge */ TypeParameterMarker mo90270n0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92898z(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: o */
            public TypeArgumentMarker mo90271o(TypeArgumentListMarker typeArgumentListMarker, int i) {
                typeArgumentListMarker.getClass();
                if (typeArgumentListMarker instanceof SimpleTypeMarker) {
                    return mo90286v0((KotlinTypeMarker) typeArgumentListMarker, i);
                }
                if (typeArgumentListMarker instanceof ArgumentList) {
                    TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i);
                    typeArgumentMarker.getClass();
                    return typeArgumentMarker;
                }
                StringBuilder sb = new StringBuilder("unknown type argument list type: ");
                sb.append(typeArgumentListMarker);
                jz50.m143888a(sb, Reflection.m87507b(typeArgumentListMarker.getClass()));
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: o0 */
            public /* bridge */ boolean mo90272o0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92841T(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: p */
            public /* bridge */ KotlinTypeMarker mo90273p(KotlinTypeMarker kotlinTypeMarker, boolean z2) {
                return ClassicTypeSystemContext.DefaultImpls.m92895x0(this, kotlinTypeMarker, z2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: p0 */
            public /* bridge */ TypeVariance mo90274p0(TypeParameterMarker typeParameterMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92825D(this, typeParameterMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: q */
            public /* bridge */ SimpleTypeMarker mo90275q(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92873m0(this, definitelyNotNullTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: q0 */
            public int mo90276q0(TypeArgumentListMarker typeArgumentListMarker) {
                typeArgumentListMarker.getClass();
                if (typeArgumentListMarker instanceof RigidTypeMarker) {
                    return mo90263k((KotlinTypeMarker) typeArgumentListMarker);
                }
                if (typeArgumentListMarker instanceof ArgumentList) {
                    return ((ArgumentList) typeArgumentListMarker).size();
                }
                StringBuilder sb = new StringBuilder("unknown type argument list type: ");
                sb.append(typeArgumentListMarker);
                jz50.m143888a(sb, Reflection.m87507b(typeArgumentListMarker.getClass()));
                return 0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: r */
            public /* bridge */ boolean mo90277r(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92847Z(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: r0 */
            public /* bridge */ List<TypeArgumentMarker> mo90278r0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92876o(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: s */
            public /* bridge */ boolean mo90279s(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92831J(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: s0 */
            public /* bridge */ boolean mo90280s0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92836O(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: t */
            public /* bridge */ KotlinTypeMarker mo90281t(Collection<? extends KotlinTypeMarker> collection) {
                return ClassicTypeSystemContext.DefaultImpls.m92829H(this, collection);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: t0 */
            public /* bridge */ TypeArgumentMarker mo90282t0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92866j(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            @NotNull
            /* JADX INFO: renamed from: u */
            public RigidTypeMarker mo90283u(KotlinTypeMarker kotlinTypeMarker) {
                RigidTypeMarker rigidTypeMarkerMo90259i;
                kotlinTypeMarker.getClass();
                FlexibleTypeMarker flexibleTypeMarkerMo90235T = mo90235T(kotlinTypeMarker);
                if (flexibleTypeMarkerMo90235T != null && (rigidTypeMarkerMo90259i = mo90259i(flexibleTypeMarkerMo90235T)) != null) {
                    return rigidTypeMarkerMo90259i;
                }
                RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
                rigidTypeMarkerMo90251e.getClass();
                return rigidTypeMarkerMo90251e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: u0 */
            public /* bridge */ CapturedTypeConstructorMarker mo90284u0(CapturedTypeMarker capturedTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92887t0(this, capturedTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: v */
            public /* bridge */ boolean mo90285v(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92835N(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: v0 */
            public /* bridge */ TypeArgumentMarker mo90286v0(KotlinTypeMarker kotlinTypeMarker, int i) {
                return ClassicTypeSystemContext.DefaultImpls.m92874n(this, kotlinTypeMarker, i);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext
            /* JADX INFO: renamed from: w */
            public /* bridge */ boolean mo90287w() {
                return ClassicTypeSystemContext.DefaultImpls.m92839R(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: w0 */
            public /* bridge */ TypeSubstitutorMarker mo90288w0(Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map) {
                return ClassicTypeSystemContext.DefaultImpls.m92891v0(this, map);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: x */
            public /* bridge */ boolean mo90289x(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92855d0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
            /* JADX INFO: renamed from: x0 */
            public /* bridge */ PrimitiveType mo90290x0(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92888u(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: y */
            public /* bridge */ boolean mo90291y(RigidTypeMarker rigidTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92857e0(this, rigidTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: y0 */
            public /* bridge */ boolean mo90292y0(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92843V(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: z */
            public /* bridge */ boolean mo90293z(TypeConstructorMarker typeConstructorMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92830I(this, typeConstructorMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
            /* JADX INFO: renamed from: z0 */
            public /* bridge */ boolean mo90294z0(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
                return ClassicTypeSystemContext.DefaultImpls.m92828G(this, rigidTypeMarker, rigidTypeMarker2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: d */
            public /* bridge */ SimpleTypeMarker mo90249d(RigidTypeMarker rigidTypeMarker, boolean z2) {
                return ClassicTypeSystemContext.DefaultImpls.m92897y0(this, rigidTypeMarker, z2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: e */
            public /* bridge */ SimpleTypeMarker mo90251e(KotlinTypeMarker kotlinTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92864i(this, kotlinTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: h */
            public /* bridge */ SimpleTypeMarker mo90257h(FlexibleTypeMarker flexibleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92863h0(this, flexibleTypeMarker);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
            /* JADX INFO: renamed from: i */
            public /* bridge */ SimpleTypeMarker mo90259i(FlexibleTypeMarker flexibleTypeMarker) {
                return ClassicTypeSystemContext.DefaultImpls.m92893w0(this, flexibleTypeMarker);
            }
        }, kotlinType)) != null) {
            return (T) m90195d(kotlinType2, jvmTypeFactory, typeMappingMode.m90411g(), typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        if (typeMappingMode.m90409e() && KotlinBuiltIns.m88191m0((ClassDescriptor) classifierDescriptorMo88316e)) {
            t = (Object) jvmTypeFactory.mo90352b();
        } else {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo88316e;
            ClassDescriptor classDescriptorMo88445a = classDescriptor.mo88445a();
            classDescriptorMo88445a.getClass();
            T tMo90397a = typeMappingConfiguration.mo90397a(classDescriptorMo88445a);
            if (tMo90397a == null) {
                if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
                    DeclarationDescriptor declarationDescriptorMo88299b = classDescriptor.mo88299b();
                    declarationDescriptorMo88299b.getClass();
                    classDescriptor = (ClassDescriptor) declarationDescriptorMo88299b;
                }
                ClassDescriptor classDescriptorMo88445a2 = classDescriptor.mo88445a();
                classDescriptorMo88445a2.getClass();
                t = (Object) jvmTypeFactory.mo90356f(m90192a(classDescriptorMo88445a2, typeMappingConfiguration));
            } else {
                t = (Object) tMo90397a;
            }
        }
        function3.invoke(kotlinType, t, typeMappingMode);
        return t;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m90196e(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, Function3 function3, int i, Object obj) {
        if ((i & 32) != 0) {
            function3 = FunctionsKt.m93209l();
        }
        return m90195d(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
    }
}
