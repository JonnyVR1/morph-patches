package kotlin.reflect.jvm.internal.impl.types;

import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class TypeUtils {

    /* JADX INFO: renamed from: a */
    public static final SimpleType f66286a = ErrorUtils.m93002d(ErrorTypeKind.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b */
    public static final SimpleType f66287b = ErrorUtils.m93002d(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final SimpleType f66288c = new SpecialType("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d */
    public static final SimpleType f66289d = new SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends DelegatingSimpleType {

        /* JADX INFO: renamed from: b */
        public final String f66290b;

        public SpecialType(String str) {
            this.f66290b = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        /* JADX INFO: renamed from: S0 */
        private static /* synthetic */ void m92813S0(int i) {
            String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i == 2) {
                objArr[0] = "delegate";
            } else if (i == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i == 1) {
                objArr[1] = "toString";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i == 3) {
                    objArr[2] = "refine";
                } else if (i != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        @NotNull
        /* JADX INFO: renamed from: N0 */
        public SimpleType mo89967N0(boolean z) {
            throw new IllegalStateException(this.f66290b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        @NotNull
        /* JADX INFO: renamed from: O0 */
        public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
            if (typeAttributes == null) {
                m92813S0(0);
            }
            throw new IllegalStateException(this.f66290b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        /* JADX INFO: renamed from: P0 */
        public SimpleType mo89969P0() {
            throw new IllegalStateException(this.f66290b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        /* JADX INFO: renamed from: R0 */
        public DelegatingSimpleType mo89970R0(@NotNull SimpleType simpleType) {
            if (simpleType == null) {
                m92813S0(2);
            }
            throw new IllegalStateException(this.f66290b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SpecialType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner == null) {
                m92813S0(3);
            }
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        public String toString() {
            String str = this.f66290b;
            if (str == null) {
                m92813S0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m92790a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = LovePlanetStage.result;
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m92791b(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(28);
        }
        if (kotlinType.mo89966H0()) {
            return true;
        }
        return FlexibleTypesKt.m92606b(kotlinType) && m92791b(FlexibleTypesKt.m92605a(kotlinType).m92598P0());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m92792c(@Nullable KotlinType kotlinType, @NotNull Function1<UnwrappedType, Boolean> function1) {
        if (function1 == null) {
            m92790a(43);
        }
        return m92793d(kotlinType, function1, null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m92793d(@Nullable KotlinType kotlinType, @NotNull Function1<UnwrappedType, Boolean> function1, SmartSet<KotlinType> smartSet) {
        if (function1 == null) {
            m92790a(44);
        }
        if (kotlinType == null) {
            return false;
        }
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (m92812w(kotlinType)) {
            return function1.invoke(unwrappedTypeMo92625J0).booleanValue();
        }
        if (smartSet != null && smartSet.contains(kotlinType)) {
            return false;
        }
        if (function1.invoke(unwrappedTypeMo92625J0).booleanValue()) {
            return true;
        }
        if (smartSet == null) {
            smartSet = SmartSet.m93219a();
        }
        smartSet.add(kotlinType);
        FlexibleType flexibleType = unwrappedTypeMo92625J0 instanceof FlexibleType ? (FlexibleType) unwrappedTypeMo92625J0 : null;
        if (flexibleType != null && (m92793d(flexibleType.m92597O0(), function1, smartSet) || m92793d(flexibleType.m92598P0(), function1, smartSet))) {
            return true;
        }
        if ((unwrappedTypeMo92625J0 instanceof DefinitelyNotNullType) && m92793d(((DefinitelyNotNullType) unwrappedTypeMo92625J0).m92572S0(), function1, smartSet)) {
            return true;
        }
        TypeConstructor typeConstructorMo91890G0 = kotlinType.mo91890G0();
        if (typeConstructorMo91890G0 instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = ((IntersectionTypeConstructor) typeConstructorMo91890G0).mo88678c().iterator();
            while (it.hasNext()) {
                if (m92793d(it.next(), function1, smartSet)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.mo91888E0()) {
            if (!typeProjection.mo92666b() && m92793d(typeProjection.getType(), function1, smartSet)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static KotlinType m92794e(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeSubstitutor typeSubstitutor) {
        if (kotlinType == null) {
            m92790a(20);
        }
        if (kotlinType2 == null) {
            m92790a(21);
        }
        if (typeSubstitutor == null) {
            m92790a(22);
        }
        KotlinType kotlinTypeM92782q = typeSubstitutor.m92782q(kotlinType2, Variance.INVARIANT);
        if (kotlinTypeM92782q != null) {
            return m92806q(kotlinTypeM92782q, kotlinType.mo89966H0());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static ClassDescriptor m92795f(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(30);
        }
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo88316e;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static List<TypeProjection> m92796g(@NotNull List<TypeParameterDescriptor> list) {
        if (list == null) {
            m92790a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new TypeProjectionImpl(it.next().mo88458o()));
        }
        List<TypeProjection> list2 = CollectionsKt.toList(arrayList);
        if (list2 == null) {
            m92790a(17);
        }
        return list2;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static List<KotlinType> m92797h(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(18);
        }
        TypeSubstitutor typeSubstitutorM92772g = TypeSubstitutor.m92772g(kotlinType);
        Collection<KotlinType> collectionMo88678c = kotlinType.mo91890G0().mo88678c();
        ArrayList arrayList = new ArrayList(collectionMo88678c.size());
        Iterator<KotlinType> it = collectionMo88678c.iterator();
        while (it.hasNext()) {
            KotlinType kotlinTypeM92794e = m92794e(kotlinType, it.next(), typeSubstitutorM92772g);
            if (kotlinTypeM92794e != null) {
                arrayList.add(kotlinTypeM92794e);
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static TypeParameterDescriptor m92798i(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(63);
        }
        if (kotlinType.mo91890G0().mo88316e() instanceof TypeParameterDescriptor) {
            return (TypeParameterDescriptor) kotlinType.mo91890G0().mo88316e();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m92799j(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(29);
        }
        if (kotlinType.mo91890G0().mo88316e() instanceof ClassDescriptor) {
            return false;
        }
        Iterator<KotlinType> it = m92797h(kotlinType).iterator();
        while (it.hasNext()) {
            if (m92801l(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m92800k(@Nullable KotlinType kotlinType) {
        return kotlinType != null && kotlinType.mo91890G0() == f66286a.mo91890G0();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m92801l(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(27);
        }
        if (kotlinType.mo89966H0()) {
            return true;
        }
        if (FlexibleTypesKt.m92606b(kotlinType) && m92801l(FlexibleTypesKt.m92605a(kotlinType).m92598P0())) {
            return true;
        }
        if (SpecialTypesKt.m92656c(kotlinType)) {
            return false;
        }
        if (m92802m(kotlinType)) {
            return m92799j(kotlinType);
        }
        if (kotlinType instanceof AbstractStubType) {
            TypeParameterDescriptor typeParameterDescriptorM92944b = ((AbstractStubType) kotlinType).m92502P0().m92944b();
            return typeParameterDescriptorM92944b == null || m92799j(typeParameterDescriptorM92944b.mo88458o());
        }
        TypeConstructor typeConstructorMo91890G0 = kotlinType.mo91890G0();
        if (typeConstructorMo91890G0 instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = typeConstructorMo91890G0.mo88678c().iterator();
            while (it.hasNext()) {
                if (m92801l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m92802m(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(60);
        }
        return m92798i(kotlinType) != null || (kotlinType.mo91890G0() instanceof NewTypeVariableConstructor);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static KotlinType m92803n(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(2);
        }
        return m92805p(kotlinType, false);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static KotlinType m92804o(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(1);
        }
        return m92805p(kotlinType, true);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static KotlinType m92805p(@NotNull KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            m92790a(3);
        }
        UnwrappedType unwrappedTypeMo89967N0 = kotlinType.mo92625J0().mo89967N0(z);
        if (unwrappedTypeMo89967N0 == null) {
            m92790a(4);
        }
        return unwrappedTypeMo89967N0;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static KotlinType m92806q(@NotNull KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            m92790a(8);
        }
        if (z) {
            return m92804o(kotlinType);
        }
        if (kotlinType == null) {
            m92790a(9);
        }
        return kotlinType;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static SimpleType m92807r(@NotNull SimpleType simpleType, boolean z) {
        if (simpleType == null) {
            m92790a(5);
        }
        if (!z) {
            if (simpleType == null) {
                m92790a(7);
            }
            return simpleType;
        }
        SimpleType simpleTypeMo89967N0 = simpleType.mo89967N0(true);
        if (simpleTypeMo89967N0 == null) {
            m92790a(6);
        }
        return simpleTypeMo89967N0;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static TypeProjection m92808s(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null) {
            m92790a(45);
        }
        return new StarProjectionImpl(typeParameterDescriptor);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static TypeProjection m92809t(@NotNull TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        if (typeParameterDescriptor == null) {
            m92790a(46);
        }
        return erasureTypeAttributes.mo89846b() == TypeUsage.SUPERTYPE ? new TypeProjectionImpl(StarProjectionImplKt.m92672b(typeParameterDescriptor)) : new StarProjectionImpl(typeParameterDescriptor);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static SimpleType m92810u(ClassifierDescriptor classifierDescriptor, MemberScope memberScope, Function1<KotlinTypeRefiner, SimpleType> function1) {
        if (!ErrorUtils.m93003m(classifierDescriptor)) {
            return m92811v(classifierDescriptor.mo88305l(), memberScope, function1);
        }
        ErrorType errorTypeM93002d = ErrorUtils.m93002d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, classifierDescriptor.toString());
        if (errorTypeM93002d == null) {
            m92790a(11);
        }
        return errorTypeM93002d;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static SimpleType m92811v(@NotNull TypeConstructor typeConstructor, @NotNull MemberScope memberScope, @NotNull Function1<KotlinTypeRefiner, SimpleType> function1) {
        if (typeConstructor == null) {
            m92790a(12);
        }
        if (memberScope == null) {
            m92790a(13);
        }
        if (function1 == null) {
            m92790a(14);
        }
        SimpleType simpleTypeM92637n = KotlinTypeFactory.m92637n(TypeAttributes.Companion.m92709k(), typeConstructor, m92796g(typeConstructor.getParameters()), false, memberScope, function1);
        if (simpleTypeM92637n == null) {
            m92790a(15);
        }
        return simpleTypeM92637n;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m92812w(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92790a(0);
        }
        return kotlinType == f66288c || kotlinType == f66289d;
    }
}
