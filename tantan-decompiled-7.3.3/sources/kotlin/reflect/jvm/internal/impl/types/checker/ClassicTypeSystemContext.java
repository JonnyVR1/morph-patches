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
import p153l.l85;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {

    @SourceDebugExtension
    public static final class DefaultImpls {
        @Nullable
        /* JADX INFO: renamed from: A */
        public static KotlinTypeMarker m93713A(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return InlineClassesUtilsKt.m92686j((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: B */
        public static List<KotlinTypeMarker> m93714B(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) typeParameterMarker).getUpperBounds();
                upperBounds.getClass();
                return upperBounds;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            l85.m153162a(sb, Reflection.m88396b(typeParameterMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: C */
        public static TypeVariance m93715C(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                Variance varianceMo93558c = ((TypeProjection) typeArgumentMarker).mo93558c();
                varianceMo93558c.getClass();
                return TypeSystemContextKt.m93965a(varianceMo93558c);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            l85.m153162a(sb, Reflection.m88396b(typeArgumentMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: D */
        public static TypeVariance m93716D(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                Variance varianceMo89492h = ((TypeParameterDescriptor) typeParameterMarker).mo89492h();
                varianceMo89492h.getClass();
                return TypeSystemContextKt.m93965a(varianceMo89492h);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            l85.m153162a(sb, Reflection.m88396b(typeParameterMarker.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: E */
        public static boolean m93717E(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName) {
            kotlinTypeMarker.getClass();
            fqName.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getAnnotations().mo89530d0(fqName);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: F */
        public static boolean m93718F(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker) {
            typeParameterMarker.getClass();
            if (!(typeParameterMarker instanceof TypeParameterDescriptor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeParameterMarker);
                l85.m153162a(sb, Reflection.m88396b(typeParameterMarker.getClass()));
                return false;
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) typeParameterMarker;
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.m93989r(typeParameterDescriptor, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterDescriptor);
            l85.m153162a(sb2, Reflection.m88396b(typeParameterDescriptor.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: G */
        public static boolean m93719G(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
            rigidTypeMarker.getClass();
            rigidTypeMarker2.getClass();
            if (!(rigidTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(rigidTypeMarker);
                l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
                return false;
            }
            if (rigidTypeMarker2 instanceof SimpleType) {
                return ((SimpleType) rigidTypeMarker).mo92779E0() == ((SimpleType) rigidTypeMarker2).mo92779E0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(rigidTypeMarker2);
            l85.m153162a(sb2, Reflection.m88396b(rigidTypeMarker2.getClass()));
            return false;
        }

        @NotNull
        /* JADX INFO: renamed from: H */
        public static KotlinTypeMarker m93720H(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull Collection<? extends KotlinTypeMarker> collection) {
            collection.getClass();
            return IntersectionTypeKt.m93793a(collection);
        }

        /* JADX INFO: renamed from: I */
        public static boolean m93721I(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.m89093x0((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.f64556a);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: J */
        public static boolean m93722J(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return KotlinBuiltIns.m89072d0((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: K */
        public static boolean m93723K(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).mo89207e() instanceof ClassDescriptor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: L */
        public static boolean m93724L(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo89207e = ((TypeConstructor) typeConstructorMarker).mo89207e();
                ClassDescriptor classDescriptor = classifierDescriptorMo89207e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89207e : null;
                return (classDescriptor == null || !ModalityUtilsKt.m89433a(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: M */
        public static boolean m93725M(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).mo89208g();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: N */
        public static boolean m93726N(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return KotlinTypeKt.m93535a((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: O */
        public static boolean m93727O(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo89207e = ((TypeConstructor) typeConstructorMarker).mo89207e();
                ClassDescriptor classDescriptor = classifierDescriptorMo89207e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89207e : null;
                return (classDescriptor != null ? classDescriptor.mo89191c0() : null) instanceof InlineClassRepresentation;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: P */
        public static boolean m93728P(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: Q */
        public static boolean m93729Q(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntersectionTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: R */
        public static boolean m93730R(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            return false;
        }

        /* JADX INFO: renamed from: S */
        public static boolean m93731S(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (kotlinTypeMarker instanceof SimpleType) && ((SimpleType) kotlinTypeMarker).mo90857H0();
        }

        /* JADX INFO: renamed from: T */
        public static boolean m93732T(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return kotlinTypeMarker instanceof NotNullTypeParameter;
        }

        /* JADX INFO: renamed from: U */
        public static boolean m93733U(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.m89093x0((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.f64558b);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: V */
        public static boolean m93734V(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtils.m93692l((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: W */
        public static boolean m93735W(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            return capturedTypeMarker instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: X */
        public static boolean m93736X(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof KotlinType) {
                return KotlinBuiltIns.m89089t0((KotlinType) simpleTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(simpleTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: Y */
        public static boolean m93737Y(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).m93811S0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(capturedTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: Z */
        public static boolean m93738Z(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return kotlinTypeMarker instanceof RawType;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return false;
        }

        /* JADX INFO: renamed from: a */
        public static boolean m93739a(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2) {
            typeConstructorMarker.getClass();
            typeConstructorMarker2.getClass();
            if (!(typeConstructorMarker instanceof TypeConstructor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeConstructorMarker);
                l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
                return false;
            }
            if (typeConstructorMarker2 instanceof TypeConstructor) {
                return Intrinsics.m88377d(typeConstructorMarker, typeConstructorMarker2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker2);
            l85.m153162a(sb2, Reflection.m88396b(typeConstructorMarker2.getClass()));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a0 */
        public static boolean m93740a0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (!(rigidTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(rigidTypeMarker);
                l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
                return false;
            }
            if (!KotlinTypeKt.m93535a((KotlinType) rigidTypeMarker)) {
                SimpleType simpleType = (SimpleType) rigidTypeMarker;
                if (!(simpleType.mo92781G0().mo89207e() instanceof TypeAliasDescriptor) && (simpleType.mo92781G0().mo89207e() != null || (rigidTypeMarker instanceof CapturedType) || (rigidTypeMarker instanceof NewCapturedType) || (rigidTypeMarker instanceof DefinitelyNotNullType) || (simpleType.mo92781G0() instanceof IntegerLiteralTypeConstructor) || m93742b0(classicTypeSystemContext, (SimpleTypeMarker) rigidTypeMarker))) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static int m93741b(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).mo92779E0().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return 0;
        }

        /* JADX INFO: renamed from: b0 */
        public static boolean m93742b0(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return (simpleTypeMarker instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.mo91146g(((SimpleTypeWithEnhancement) simpleTypeMarker).mo93492P());
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public static SimpleTypeMarker m93743c(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                SimpleType simpleTypeM89127m = classicTypeSystemContext.mo91144f().m89127m(Variance.INVARIANT, (KotlinType) kotlinTypeMarker);
                simpleTypeM89127m.getClass();
                return simpleTypeM89127m;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(classicTypeSystemContext);
            l85.m153162a(sb, Reflection.m88396b(classicTypeSystemContext.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: c0 */
        public static boolean m93744c0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).mo93557b();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            l85.m153162a(sb, Reflection.m88396b(typeArgumentMarker.getClass()));
            return false;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static TypeArgumentListMarker m93745d(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return (TypeArgumentListMarker) rigidTypeMarker;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d0 */
        public static boolean m93746d0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.m93992u((KotlinType) rigidTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
            return false;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public static CapturedTypeMarker m93747e(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(simpleTypeMarker);
                l85.m153162a(sb, Reflection.m88396b(simpleTypeMarker.getClass()));
                return null;
            }
            if (simpleTypeMarker instanceof SimpleTypeWithEnhancement) {
                return classicTypeSystemContext.mo91138c(((SimpleTypeWithEnhancement) simpleTypeMarker).mo93492P());
            }
            if (simpleTypeMarker instanceof NewCapturedType) {
                return (NewCapturedType) simpleTypeMarker;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e0 */
        public static boolean m93748e0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.m93993v((KotlinType) rigidTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
            return false;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public static DefinitelyNotNullTypeMarker m93749f(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                if (rigidTypeMarker instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) rigidTypeMarker;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: f0 */
        public static boolean m93750f0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (kotlinTypeMarker instanceof UnwrappedType) && (((UnwrappedType) kotlinTypeMarker).mo92781G0() instanceof NewTypeVariableConstructor);
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public static DynamicTypeMarker m93751g(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                if (flexibleTypeMarker instanceof DynamicType) {
                    return (DynamicType) flexibleTypeMarker;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(flexibleTypeMarker.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: g0 */
        public static boolean m93752g0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo89207e = ((TypeConstructor) typeConstructorMarker).mo89207e();
                return classifierDescriptorMo89207e != null && KotlinBuiltIns.m89060C0(classifierDescriptorMo89207e);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return false;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public static FlexibleTypeMarker m93753h(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrappedTypeMo93516J0 = ((KotlinType) kotlinTypeMarker).mo93516J0();
                if (unwrappedTypeMo93516J0 instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeMo93516J0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: h0 */
        public static SimpleTypeMarker m93754h0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).m93488O0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(flexibleTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public static SimpleTypeMarker m93755i(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrappedTypeMo93516J0 = ((KotlinType) kotlinTypeMarker).mo93516J0();
                if (unwrappedTypeMo93516J0 instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeMo93516J0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: i0 */
        public static KotlinTypeMarker m93756i0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).m93810R0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(capturedTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public static TypeArgumentMarker m93757j(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtilsKt.m93975d((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: j0 */
        public static KotlinTypeMarker m93758j0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof UnwrappedType) {
                return ClassicTypeSystemContextKt.m93792b((UnwrappedType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: k */
        public static SimpleType m93759k(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull CaptureStatus captureStatus) {
            rigidTypeMarker.getClass();
            captureStatus.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return NewCapturedTypeKt.m93827b((SimpleType) rigidTypeMarker, captureStatus);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: k0 */
        public static TypeCheckerState m93760k0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, boolean z, boolean z2, boolean z3) {
            return ClassicTypeCheckerStateKt.m93712b(z, z2, classicTypeSystemContext, null, null, 24, null);
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public static CaptureStatus m93761l(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).m93808P0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(capturedTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: l0 */
        public static SimpleTypeMarker m93762l0(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            SimpleType simpleTypeM89105J = classicTypeSystemContext.mo91144f().m89105J();
            simpleTypeM89105J.getClass();
            return simpleTypeM89105J;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public static KotlinTypeMarker m93763m(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
            rigidTypeMarker.getClass();
            rigidTypeMarker2.getClass();
            if (!(rigidTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(classicTypeSystemContext);
                l85.m153162a(sb, Reflection.m88396b(classicTypeSystemContext.getClass()));
                return null;
            }
            if (rigidTypeMarker2 instanceof SimpleType) {
                return KotlinTypeFactory.m93520e((SimpleType) rigidTypeMarker, (SimpleType) rigidTypeMarker2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(classicTypeSystemContext);
            l85.m153162a(sb2, Reflection.m88396b(classicTypeSystemContext.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: m0 */
        public static SimpleTypeMarker m93764m0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
            definitelyNotNullTypeMarker.getClass();
            if (definitelyNotNullTypeMarker instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) definitelyNotNullTypeMarker).m93463S0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(definitelyNotNullTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(definitelyNotNullTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public static TypeArgumentMarker m93765n(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, int i) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).mo92779E0().get(i);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: n0 */
        public static int m93766n0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).getParameters().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public static List<TypeArgumentMarker> m93767o(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).mo92779E0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: o0 */
        public static Collection<KotlinTypeMarker> m93768o0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            TypeConstructorMarker typeConstructorMarkerMo91136b = classicTypeSystemContext.mo91136b(rigidTypeMarker);
            if (typeConstructorMarkerMo91136b instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorMarkerMo91136b).m92830l();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public static KotlinBuiltIns m93769p(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            throw new UnsupportedOperationException("Not supported");
        }

        @NotNull
        /* JADX INFO: renamed from: p0 */
        public static TypeArgumentMarker m93770p0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
            capturedTypeConstructorMarker.getClass();
            if (capturedTypeConstructorMarker instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) capturedTypeConstructorMarker).mo92785d();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(capturedTypeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public static FqNameUnsafe m93771q(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo89207e = ((TypeConstructor) typeConstructorMarker).mo89207e();
                classifierDescriptorMo89207e.getClass();
                return DescriptorUtilsKt.m92874p((ClassDescriptor) classifierDescriptorMo89207e);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: q0 */
        public static KotlinTypeMarker m93772q0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeSubstitutorMarker typeSubstitutorMarker, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            typeSubstitutorMarker.getClass();
            kotlinTypeMarker.getClass();
            if (!(kotlinTypeMarker instanceof UnwrappedType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(kotlinTypeMarker);
                l85.m153162a(sb, Reflection.m88396b(kotlinTypeMarker.getClass()));
                return null;
            }
            if (typeSubstitutorMarker instanceof TypeSubstitutor) {
                KotlinType kotlinTypeM93672o = ((TypeSubstitutor) typeSubstitutorMarker).m93672o((KotlinType) kotlinTypeMarker, Variance.INVARIANT);
                kotlinTypeM93672o.getClass();
                return kotlinTypeM93672o;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeSubstitutorMarker);
            l85.m153162a(sb2, Reflection.m88396b(typeSubstitutorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public static TypeParameterMarker m93773r(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker, int i) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) typeConstructorMarker).getParameters().get(i);
                typeParameterDescriptor.getClass();
                return typeParameterDescriptor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: r0 */
        public static TypeCheckerState.SupertypesPolicy m93774r0(@NotNull final ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                final TypeSubstitutor typeSubstitutorM93648c = TypeConstructorSubstitution.Companion.m93629a((KotlinType) rigidTypeMarker).m93648c();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public SimpleTypeMarker mo93624a(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                        typeCheckerState.getClass();
                        kotlinTypeMarker.getClass();
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        TypeSubstitutor typeSubstitutor = typeSubstitutorM93648c;
                        Object objMo91135a0 = classicTypeSystemContext2.mo91135a0(kotlinTypeMarker);
                        objMo91135a0.getClass();
                        KotlinType kotlinTypeM93672o = typeSubstitutor.m93672o((KotlinType) objMo91135a0, Variance.INVARIANT);
                        kotlinTypeM93672o.getClass();
                        SimpleTypeMarker simpleTypeMarkerMo91142e = classicTypeSystemContext2.mo91142e((KotlinTypeMarker) kotlinTypeM93672o);
                        simpleTypeMarkerMo91142e.getClass();
                        return simpleTypeMarkerMo91142e;
                    }
                };
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public static List<TypeParameterMarker> m93775s(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) typeConstructorMarker).getParameters();
                parameters.getClass();
                return parameters;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: s0 */
        public static Collection<KotlinTypeMarker> m93776s0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                Collection<KotlinType> collectionMo89569c = ((TypeConstructor) typeConstructorMarker).mo89569c();
                collectionMo89569c.getClass();
                return collectionMo89569c;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: t */
        public static PrimitiveType m93777t(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo89207e = ((TypeConstructor) typeConstructorMarker).mo89207e();
                classifierDescriptorMo89207e.getClass();
                return KotlinBuiltIns.m89064Q((ClassDescriptor) classifierDescriptorMo89207e);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: t0 */
        public static CapturedTypeConstructorMarker m93778t0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).mo92781G0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(capturedTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: u */
        public static PrimitiveType m93779u(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo89207e = ((TypeConstructor) typeConstructorMarker).mo89207e();
                classifierDescriptorMo89207e.getClass();
                return KotlinBuiltIns.m89065T((ClassDescriptor) classifierDescriptorMo89207e);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: u0 */
        public static TypeConstructorMarker m93780u0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return ((SimpleType) rigidTypeMarker).mo92781G0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public static KotlinTypeMarker m93781v(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.m93986o((TypeParameterDescriptor) typeParameterMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            l85.m153162a(sb, Reflection.m88396b(typeParameterMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: v0 */
        public static TypeSubstitutorMarker m93782v0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map) {
            map.getClass();
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<TypeConstructorMarker, ? extends KotlinTypeMarker> entry : map.entrySet()) {
                TypeConstructorMarker key = entry.getKey();
                KotlinTypeMarker value = entry.getValue();
                key.getClass();
                value.getClass();
                arrayList.add(TuplesKt.m88129a((TypeConstructor) key, TypeUtilsKt.m93975d((KotlinType) value)));
            }
            TypeSubstitutor typeSubstitutorM93662f = TypeSubstitutor.m93662f(MapsKt.toMap(arrayList));
            typeSubstitutorM93662f.getClass();
            return typeSubstitutorM93662f;
        }

        @Nullable
        /* JADX INFO: renamed from: w */
        public static KotlinTypeMarker m93783w(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (classicTypeSystemContext.mo91134a(typeArgumentMarker)) {
                return null;
            }
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).getType().mo93516J0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            l85.m153162a(sb, Reflection.m88396b(typeArgumentMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: w0 */
        public static SimpleTypeMarker m93784w0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).m93489P0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(flexibleTypeMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: x */
        public static TypeConstructorMarker m93785x(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                TypeConstructor typeConstructorMo89196l = ((TypeParameterDescriptor) typeParameterMarker).mo89196l();
                typeConstructorMo89196l.getClass();
                return typeConstructorMo89196l;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            l85.m153162a(sb, Reflection.m88396b(typeParameterMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: x0 */
        public static KotlinTypeMarker m93786x0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof RigidTypeMarker) {
                return classicTypeSystemContext.mo91140d((RigidTypeMarker) kotlinTypeMarker, z);
            }
            if (kotlinTypeMarker instanceof FlexibleTypeMarker) {
                FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) kotlinTypeMarker;
                return classicTypeSystemContext.mo91104I(classicTypeSystemContext.mo91140d((RigidTypeMarker) classicTypeSystemContext.mo91148h(flexibleTypeMarker), z), classicTypeSystemContext.mo91140d((RigidTypeMarker) classicTypeSystemContext.mo91150i(flexibleTypeMarker), z));
            }
            wtq0.m207906a("sealed");
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: y */
        public static TypeParameterMarker m93787y(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
            typeVariableTypeConstructorMarker.getClass();
            if (typeVariableTypeConstructorMarker instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) typeVariableTypeConstructorMarker).m93835b();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeVariableTypeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeVariableTypeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: y0 */
        public static SimpleTypeMarker m93788y0(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, boolean z) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return ((SimpleType) rigidTypeMarker).mo90858N0(z);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            l85.m153162a(sb, Reflection.m88396b(rigidTypeMarker.getClass()));
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: z */
        public static TypeParameterMarker m93789z(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo89207e = ((TypeConstructor) typeConstructorMarker).mo89207e();
                if (classifierDescriptorMo89207e instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorMo89207e;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            l85.m153162a(sb, Reflection.m88396b(typeConstructorMarker.getClass()));
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    KotlinTypeMarker mo91104I(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: a */
    boolean mo91134a(@NotNull TypeArgumentMarker typeArgumentMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: b */
    TypeConstructorMarker mo91136b(@NotNull RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: c */
    CapturedTypeMarker mo91138c(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: d */
    SimpleTypeMarker mo91140d(@NotNull RigidTypeMarker rigidTypeMarker, boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: e */
    SimpleTypeMarker mo91142e(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: f */
    KotlinBuiltIns mo91144f();

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: g */
    boolean mo91146g(@NotNull RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: h */
    SimpleTypeMarker mo91148h(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: i */
    SimpleTypeMarker mo91150i(@NotNull FlexibleTypeMarker flexibleTypeMarker);
}
