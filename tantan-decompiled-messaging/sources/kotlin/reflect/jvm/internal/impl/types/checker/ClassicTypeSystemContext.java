package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
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
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.k75;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {

    @SourceDebugExtension
    public static final class DefaultImpls {
        @Nullable
        /* JADX INFO: renamed from: A */
        public static KotlinTypeMarker m92822A(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return InlineClassesUtilsKt.m91795j((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: B */
        public static List<KotlinTypeMarker> m92823B(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) typeParameterMarker).getUpperBounds();
                upperBounds.getClass();
                return upperBounds;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            k75.m144645a(sb, Reflection.m87507b(typeParameterMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: C */
        public static TypeVariance m92824C(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                Variance varianceMo92667c = ((TypeProjection) typeArgumentMarker).mo92667c();
                varianceMo92667c.getClass();
                return TypeSystemContextKt.m93074a(varianceMo92667c);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            k75.m144645a(sb, Reflection.m87507b(typeArgumentMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: D */
        public static TypeVariance m92825D(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                Variance varianceMo88601h = ((TypeParameterDescriptor) typeParameterMarker).mo88601h();
                varianceMo88601h.getClass();
                return TypeSystemContextKt.m93074a(varianceMo88601h);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            k75.m144645a(sb, Reflection.m87507b(typeParameterMarker.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: E */
        public static boolean m92826E(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName) {
            kotlinTypeMarker.getClass();
            fqName.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getAnnotations().mo88639c0(fqName);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: F */
        public static boolean m92827F(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker) {
            typeParameterMarker.getClass();
            if (!(typeParameterMarker instanceof TypeParameterDescriptor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeParameterMarker);
                k75.m144645a(sb, Reflection.m87507b(typeParameterMarker.getClass()));
                return false;
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) typeParameterMarker;
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.m93098r(typeParameterDescriptor, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterDescriptor);
            k75.m144645a(sb2, Reflection.m87507b(typeParameterDescriptor.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: G */
        public static boolean m92828G(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
            rigidTypeMarker.getClass();
            rigidTypeMarker2.getClass();
            if (!(rigidTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(rigidTypeMarker);
                k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
                return false;
            }
            if (rigidTypeMarker2 instanceof SimpleType) {
                return ((SimpleType) rigidTypeMarker).mo91888E0() == ((SimpleType) rigidTypeMarker2).mo91888E0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(rigidTypeMarker2);
            k75.m144645a(sb2, Reflection.m87507b(rigidTypeMarker2.getClass()));
            return false;
        }

        @NotNull
        /* JADX INFO: renamed from: H */
        public static KotlinTypeMarker m92829H(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull Collection<? extends KotlinTypeMarker> collection) {
            collection.getClass();
            return IntersectionTypeKt.m92902a(collection);
        }

        /* JADX INFO: renamed from: I */
        public static boolean m92830I(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.m88202x0((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.f63882a);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: J */
        public static boolean m92831J(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return KotlinBuiltIns.m88181d0((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: K */
        public static boolean m92832K(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).mo88316e() instanceof ClassDescriptor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: L */
        public static boolean m92833L(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo88316e = ((TypeConstructor) typeConstructorMarker).mo88316e();
                ClassDescriptor classDescriptor = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
                return (classDescriptor == null || !ModalityUtilsKt.m88542a(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: M */
        public static boolean m92834M(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).mo88317g();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: N */
        public static boolean m92835N(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return KotlinTypeKt.m92644a((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: O */
        public static boolean m92836O(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo88316e = ((TypeConstructor) typeConstructorMarker).mo88316e();
                ClassDescriptor classDescriptor = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
                return (classDescriptor != null ? classDescriptor.mo88300c0() : null) instanceof InlineClassRepresentation;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: P */
        public static boolean m92837P(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: Q */
        public static boolean m92838Q(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntersectionTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: R */
        public static boolean m92839R(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            return false;
        }

        /* JADX INFO: renamed from: S */
        public static boolean m92840S(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (kotlinTypeMarker instanceof SimpleType) && ((SimpleType) kotlinTypeMarker).mo89966H0();
        }

        /* JADX INFO: renamed from: T */
        public static boolean m92841T(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return kotlinTypeMarker instanceof NotNullTypeParameter;
        }

        /* JADX INFO: renamed from: U */
        public static boolean m92842U(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.m88202x0((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.f63884b);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: V */
        public static boolean m92843V(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtils.m92801l((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: W */
        public static boolean m92844W(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            return capturedTypeMarker instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: X */
        public static boolean m92845X(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof KotlinType) {
                return KotlinBuiltIns.m88198t0((KotlinType) simpleTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(simpleTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: Y */
        public static boolean m92846Y(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).m92920S0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(capturedTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: Z */
        public static boolean m92847Z(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return kotlinTypeMarker instanceof RawType;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: a */
        public static boolean m92848a(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2) {
            typeConstructorMarker.getClass();
            typeConstructorMarker2.getClass();
            if (!(typeConstructorMarker instanceof TypeConstructor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeConstructorMarker);
                k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
                return false;
            }
            if (typeConstructorMarker2 instanceof TypeConstructor) {
                return Intrinsics.m87488d(typeConstructorMarker, typeConstructorMarker2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker2);
            k75.m144645a(sb2, Reflection.m87507b(typeConstructorMarker2.getClass()));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a0 */
        public static boolean m92849a0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (!(rigidTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(rigidTypeMarker);
                k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
                return false;
            }
            if (!KotlinTypeKt.m92644a((KotlinType) rigidTypeMarker)) {
                SimpleType simpleType = (SimpleType) rigidTypeMarker;
                if (!(simpleType.mo91890G0().mo88316e() instanceof TypeAliasDescriptor) && (simpleType.mo91890G0().mo88316e() != null || (rigidTypeMarker instanceof CapturedType) || (rigidTypeMarker instanceof NewCapturedType) || (rigidTypeMarker instanceof DefinitelyNotNullType) || (simpleType.mo91890G0() instanceof IntegerLiteralTypeConstructor) || m92851b0(classicTypeSystemContext, (SimpleTypeMarker) rigidTypeMarker))) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static int m92850b(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).mo91888E0().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return 0;
        }

        /* JADX INFO: renamed from: b0 */
        public static boolean m92851b0(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return (simpleTypeMarker instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.mo90255g(((SimpleTypeWithEnhancement) simpleTypeMarker).mo92601P());
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public static SimpleTypeMarker m92852c(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                SimpleType simpleTypeM88236m = classicTypeSystemContext.mo90253f().m88236m(Variance.INVARIANT, (KotlinType) kotlinTypeMarker);
                simpleTypeM88236m.getClass();
                return simpleTypeM88236m;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(classicTypeSystemContext);
            k75.m144645a(sb, Reflection.m87507b(classicTypeSystemContext.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: c0 */
        public static boolean m92853c0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).mo92666b();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            k75.m144645a(sb, Reflection.m87507b(typeArgumentMarker.getClass()));
            return false;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static TypeArgumentListMarker m92854d(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return (TypeArgumentListMarker) rigidTypeMarker;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d0 */
        public static boolean m92855d0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.m93101u((KotlinType) rigidTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
            return false;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public static CapturedTypeMarker m92856e(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(simpleTypeMarker);
                k75.m144645a(sb, Reflection.m87507b(simpleTypeMarker.getClass()));
                return null;
            }
            if (simpleTypeMarker instanceof SimpleTypeWithEnhancement) {
                return classicTypeSystemContext.mo90247c(((SimpleTypeWithEnhancement) simpleTypeMarker).mo92601P());
            }
            if (simpleTypeMarker instanceof NewCapturedType) {
                return (NewCapturedType) simpleTypeMarker;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e0 */
        public static boolean m92857e0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.m93102v((KotlinType) rigidTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
            return false;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public static DefinitelyNotNullTypeMarker m92858f(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                if (rigidTypeMarker instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) rigidTypeMarker;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: f0 */
        public static boolean m92859f0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (kotlinTypeMarker instanceof UnwrappedType) && (((UnwrappedType) kotlinTypeMarker).mo91890G0() instanceof NewTypeVariableConstructor);
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public static DynamicTypeMarker m92860g(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                if (flexibleTypeMarker instanceof DynamicType) {
                    return (DynamicType) flexibleTypeMarker;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(flexibleTypeMarker.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: g0 */
        public static boolean m92861g0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo88316e = ((TypeConstructor) typeConstructorMarker).mo88316e();
                return classifierDescriptorMo88316e != null && KotlinBuiltIns.m88169C0(classifierDescriptorMo88316e);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return false;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public static FlexibleTypeMarker m92862h(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrappedTypeMo92625J0 = ((KotlinType) kotlinTypeMarker).mo92625J0();
                if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeMo92625J0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: h0 */
        public static SimpleTypeMarker m92863h0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).m92597O0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(flexibleTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public static SimpleTypeMarker m92864i(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrappedTypeMo92625J0 = ((KotlinType) kotlinTypeMarker).mo92625J0();
                if (unwrappedTypeMo92625J0 instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeMo92625J0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: i0 */
        public static KotlinTypeMarker m92865i0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).m92919R0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(capturedTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public static TypeArgumentMarker m92866j(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtilsKt.m93084d((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: j0 */
        public static KotlinTypeMarker m92867j0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof UnwrappedType) {
                return ClassicTypeSystemContextKt.m92901b((UnwrappedType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: k */
        public static SimpleType m92868k(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull CaptureStatus captureStatus) {
            rigidTypeMarker.getClass();
            captureStatus.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return NewCapturedTypeKt.m92936b((SimpleType) rigidTypeMarker, captureStatus);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: k0 */
        public static TypeCheckerState m92869k0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, boolean z, boolean z2, boolean z3) {
            return ClassicTypeCheckerStateKt.m92821b(z, z2, classicTypeSystemContext, null, null, 24, null);
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public static CaptureStatus m92870l(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).m92917P0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(capturedTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: l0 */
        public static SimpleTypeMarker m92871l0(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            SimpleType simpleTypeM88214J = classicTypeSystemContext.mo90253f().m88214J();
            simpleTypeM88214J.getClass();
            return simpleTypeM88214J;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public static KotlinTypeMarker m92872m(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
            rigidTypeMarker.getClass();
            rigidTypeMarker2.getClass();
            if (!(rigidTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(classicTypeSystemContext);
                k75.m144645a(sb, Reflection.m87507b(classicTypeSystemContext.getClass()));
                return null;
            }
            if (rigidTypeMarker2 instanceof SimpleType) {
                return KotlinTypeFactory.m92629e((SimpleType) rigidTypeMarker, (SimpleType) rigidTypeMarker2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(classicTypeSystemContext);
            k75.m144645a(sb2, Reflection.m87507b(classicTypeSystemContext.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: m0 */
        public static SimpleTypeMarker m92873m0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
            definitelyNotNullTypeMarker.getClass();
            if (definitelyNotNullTypeMarker instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) definitelyNotNullTypeMarker).m92572S0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(definitelyNotNullTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(definitelyNotNullTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public static TypeArgumentMarker m92874n(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, int i) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).mo91888E0().get(i);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: n0 */
        public static int m92875n0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).getParameters().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public static List<TypeArgumentMarker> m92876o(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).mo91888E0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: o0 */
        public static Collection<KotlinTypeMarker> m92877o0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            TypeConstructorMarker typeConstructorMarkerMo90245b = classicTypeSystemContext.mo90245b(rigidTypeMarker);
            if (typeConstructorMarkerMo90245b instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorMarkerMo90245b).m91939l();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public static KotlinBuiltIns m92878p(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            throw new UnsupportedOperationException("Not supported");
        }

        @NotNull
        /* JADX INFO: renamed from: p0 */
        public static TypeArgumentMarker m92879p0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
            capturedTypeConstructorMarker.getClass();
            if (capturedTypeConstructorMarker instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) capturedTypeConstructorMarker).mo91894d();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(capturedTypeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public static FqNameUnsafe m92880q(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo88316e = ((TypeConstructor) typeConstructorMarker).mo88316e();
                classifierDescriptorMo88316e.getClass();
                return DescriptorUtilsKt.m91983p((ClassDescriptor) classifierDescriptorMo88316e);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: q0 */
        public static KotlinTypeMarker m92881q0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeSubstitutorMarker typeSubstitutorMarker, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            typeSubstitutorMarker.getClass();
            kotlinTypeMarker.getClass();
            if (!(kotlinTypeMarker instanceof UnwrappedType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(kotlinTypeMarker);
                k75.m144645a(sb, Reflection.m87507b(kotlinTypeMarker.getClass()));
                return null;
            }
            if (typeSubstitutorMarker instanceof TypeSubstitutor) {
                KotlinType kotlinTypeM92781o = ((TypeSubstitutor) typeSubstitutorMarker).m92781o((KotlinType) kotlinTypeMarker, Variance.INVARIANT);
                kotlinTypeM92781o.getClass();
                return kotlinTypeM92781o;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeSubstitutorMarker);
            k75.m144645a(sb2, Reflection.m87507b(typeSubstitutorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public static TypeParameterMarker m92882r(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker, int i) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) typeConstructorMarker).getParameters().get(i);
                typeParameterDescriptor.getClass();
                return typeParameterDescriptor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: r0 */
        public static TypeCheckerState.SupertypesPolicy m92883r0(@NotNull final ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                final TypeSubstitutor typeSubstitutorM92757c = TypeConstructorSubstitution.Companion.m92738a((KotlinType) rigidTypeMarker).m92757c();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public SimpleTypeMarker mo92733a(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                        typeCheckerState.getClass();
                        kotlinTypeMarker.getClass();
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        TypeSubstitutor typeSubstitutor = typeSubstitutorM92757c;
                        Object objMo90244a0 = classicTypeSystemContext2.mo90244a0(kotlinTypeMarker);
                        objMo90244a0.getClass();
                        KotlinType kotlinTypeM92781o = typeSubstitutor.m92781o((KotlinType) objMo90244a0, Variance.INVARIANT);
                        kotlinTypeM92781o.getClass();
                        SimpleTypeMarker simpleTypeMarkerMo90251e = classicTypeSystemContext2.mo90251e((KotlinTypeMarker) kotlinTypeM92781o);
                        simpleTypeMarkerMo90251e.getClass();
                        return simpleTypeMarkerMo90251e;
                    }
                };
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public static List<TypeParameterMarker> m92884s(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) typeConstructorMarker).getParameters();
                parameters.getClass();
                return parameters;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: s0 */
        public static Collection<KotlinTypeMarker> m92885s0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                Collection<KotlinType> collectionMo88678c = ((TypeConstructor) typeConstructorMarker).mo88678c();
                collectionMo88678c.getClass();
                return collectionMo88678c;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: t */
        public static PrimitiveType m92886t(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo88316e = ((TypeConstructor) typeConstructorMarker).mo88316e();
                classifierDescriptorMo88316e.getClass();
                return KotlinBuiltIns.m88173Q((ClassDescriptor) classifierDescriptorMo88316e);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: t0 */
        public static CapturedTypeConstructorMarker m92887t0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).mo91890G0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(capturedTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: u */
        public static PrimitiveType m92888u(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo88316e = ((TypeConstructor) typeConstructorMarker).mo88316e();
                classifierDescriptorMo88316e.getClass();
                return KotlinBuiltIns.m88174T((ClassDescriptor) classifierDescriptorMo88316e);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: u0 */
        public static TypeConstructorMarker m92889u0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return ((SimpleType) rigidTypeMarker).mo91890G0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public static KotlinTypeMarker m92890v(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.m93095o((TypeParameterDescriptor) typeParameterMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            k75.m144645a(sb, Reflection.m87507b(typeParameterMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: v0 */
        public static TypeSubstitutorMarker m92891v0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map) {
            map.getClass();
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<TypeConstructorMarker, ? extends KotlinTypeMarker> entry : map.entrySet()) {
                TypeConstructorMarker key = entry.getKey();
                KotlinTypeMarker value = entry.getValue();
                key.getClass();
                value.getClass();
                arrayList.add(TuplesKt.m87240a((TypeConstructor) key, TypeUtilsKt.m93084d((KotlinType) value)));
            }
            TypeSubstitutor typeSubstitutorM92771f = TypeSubstitutor.m92771f(MapsKt.toMap(arrayList));
            typeSubstitutorM92771f.getClass();
            return typeSubstitutorM92771f;
        }

        @Nullable
        /* JADX INFO: renamed from: w */
        public static KotlinTypeMarker m92892w(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (classicTypeSystemContext.mo90243a(typeArgumentMarker)) {
                return null;
            }
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).getType().mo92625J0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            k75.m144645a(sb, Reflection.m87507b(typeArgumentMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: w0 */
        public static SimpleTypeMarker m92893w0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).m92598P0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(flexibleTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: x */
        public static TypeConstructorMarker m92894x(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                TypeConstructor typeConstructorMo88305l = ((TypeParameterDescriptor) typeParameterMarker).mo88305l();
                typeConstructorMo88305l.getClass();
                return typeConstructorMo88305l;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            k75.m144645a(sb, Reflection.m87507b(typeParameterMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: x0 */
        public static KotlinTypeMarker m92895x0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof RigidTypeMarker) {
                return classicTypeSystemContext.mo90249d((RigidTypeMarker) kotlinTypeMarker, z);
            }
            if (kotlinTypeMarker instanceof FlexibleTypeMarker) {
                FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) kotlinTypeMarker;
                return classicTypeSystemContext.mo90213I(classicTypeSystemContext.mo90249d((RigidTypeMarker) classicTypeSystemContext.mo90257h(flexibleTypeMarker), z), classicTypeSystemContext.mo90249d((RigidTypeMarker) classicTypeSystemContext.mo90259i(flexibleTypeMarker), z));
            }
            qkq0.m175383a("sealed");
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: y */
        public static TypeParameterMarker m92896y(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
            typeVariableTypeConstructorMarker.getClass();
            if (typeVariableTypeConstructorMarker instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) typeVariableTypeConstructorMarker).m92944b();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeVariableTypeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeVariableTypeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: y0 */
        public static SimpleTypeMarker m92897y0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, boolean z) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return ((SimpleType) rigidTypeMarker).mo89967N0(z);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            k75.m144645a(sb, Reflection.m87507b(rigidTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: z */
        public static TypeParameterMarker m92898z(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo88316e = ((TypeConstructor) typeConstructorMarker).mo88316e();
                if (classifierDescriptorMo88316e instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorMo88316e;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            k75.m144645a(sb, Reflection.m87507b(typeConstructorMarker.getClass()));
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    KotlinTypeMarker mo90213I(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: a */
    boolean mo90243a(@NotNull TypeArgumentMarker typeArgumentMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: b */
    TypeConstructorMarker mo90245b(@NotNull RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: c */
    CapturedTypeMarker mo90247c(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: d */
    SimpleTypeMarker mo90249d(@NotNull RigidTypeMarker rigidTypeMarker, boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: e */
    SimpleTypeMarker mo90251e(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: f */
    KotlinBuiltIns mo90253f();

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: g */
    boolean mo90255g(@NotNull RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: h */
    SimpleTypeMarker mo90257h(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: i */
    SimpleTypeMarker mo90259i(@NotNull FlexibleTypeMarker flexibleTypeMarker);
}
