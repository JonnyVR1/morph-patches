package kotlin.reflect.jvm.internal.impl.types;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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
    public static final SimpleType f66960a = ErrorUtils.m93893d(ErrorTypeKind.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b */
    public static final SimpleType f66961b = ErrorUtils.m93893d(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final SimpleType f66962c = new SpecialType("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d */
    public static final SimpleType f66963d = new SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends DelegatingSimpleType {

        /* JADX INFO: renamed from: b */
        public final String f66964b;

        public SpecialType(String str) {
            this.f66964b = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        /* JADX INFO: renamed from: S0 */
        private static /* synthetic */ void m93704S0(int i) {
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
        public SimpleType mo90858N0(boolean z) {
            throw new IllegalStateException(this.f66964b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        @NotNull
        /* JADX INFO: renamed from: O0 */
        public SimpleType mo90785M0(@NotNull TypeAttributes typeAttributes) {
            if (typeAttributes == null) {
                m93704S0(0);
            }
            throw new IllegalStateException(this.f66964b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        /* JADX INFO: renamed from: P0 */
        public SimpleType mo90860P0() {
            throw new IllegalStateException(this.f66964b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        /* JADX INFO: renamed from: R0 */
        public DelegatingSimpleType mo90861R0(@NotNull SimpleType simpleType) {
            if (simpleType == null) {
                m93704S0(2);
            }
            throw new IllegalStateException(this.f66964b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SpecialType mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner == null) {
                m93704S0(3);
            }
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        public String toString() {
            String str = this.f66964b;
            if (str == null) {
                m93704S0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m93681a(int i) {
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
    public static boolean m93682b(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(28);
        }
        if (kotlinType.mo90857H0()) {
            return true;
        }
        return FlexibleTypesKt.m93497b(kotlinType) && m93682b(FlexibleTypesKt.m93496a(kotlinType).m93489P0());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m93683c(@Nullable KotlinType kotlinType, @NotNull Function1<UnwrappedType, Boolean> function1) {
        if (function1 == null) {
            m93681a(43);
        }
        return m93684d(kotlinType, function1, null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m93684d(@Nullable KotlinType kotlinType, @NotNull Function1<UnwrappedType, Boolean> function1, SmartSet<KotlinType> smartSet) {
        if (function1 == null) {
            m93681a(44);
        }
        if (kotlinType == null) {
            return false;
        }
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (m93703w(kotlinType)) {
            return function1.invoke(unwrappedTypeMo93516J0).booleanValue();
        }
        if (smartSet != null && smartSet.contains(kotlinType)) {
            return false;
        }
        if (function1.invoke(unwrappedTypeMo93516J0).booleanValue()) {
            return true;
        }
        if (smartSet == null) {
            smartSet = SmartSet.m94110a();
        }
        smartSet.add(kotlinType);
        FlexibleType flexibleType = unwrappedTypeMo93516J0 instanceof FlexibleType ? (FlexibleType) unwrappedTypeMo93516J0 : null;
        if (flexibleType != null && (m93684d(flexibleType.m93488O0(), function1, smartSet) || m93684d(flexibleType.m93489P0(), function1, smartSet))) {
            return true;
        }
        if ((unwrappedTypeMo93516J0 instanceof DefinitelyNotNullType) && m93684d(((DefinitelyNotNullType) unwrappedTypeMo93516J0).m93463S0(), function1, smartSet)) {
            return true;
        }
        TypeConstructor typeConstructorMo92781G0 = kotlinType.mo92781G0();
        if (typeConstructorMo92781G0 instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = ((IntersectionTypeConstructor) typeConstructorMo92781G0).mo89569c().iterator();
            while (it.hasNext()) {
                if (m93684d(it.next(), function1, smartSet)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.mo92779E0()) {
            if (!typeProjection.mo93557b() && m93684d(typeProjection.getType(), function1, smartSet)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static KotlinType m93685e(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeSubstitutor typeSubstitutor) {
        if (kotlinType == null) {
            m93681a(20);
        }
        if (kotlinType2 == null) {
            m93681a(21);
        }
        if (typeSubstitutor == null) {
            m93681a(22);
        }
        KotlinType kotlinTypeM93673q = typeSubstitutor.m93673q(kotlinType2, Variance.INVARIANT);
        if (kotlinTypeM93673q != null) {
            return m93697q(kotlinTypeM93673q, kotlinType.mo90857H0());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static ClassDescriptor m93686f(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(30);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo89207e;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static List<TypeProjection> m93687g(@NotNull List<TypeParameterDescriptor> list) {
        if (list == null) {
            m93681a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new TypeProjectionImpl(it.next().mo89349o()));
        }
        List<TypeProjection> list2 = CollectionsKt.toList(arrayList);
        if (list2 == null) {
            m93681a(17);
        }
        return list2;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static List<KotlinType> m93688h(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(18);
        }
        TypeSubstitutor typeSubstitutorM93663g = TypeSubstitutor.m93663g(kotlinType);
        Collection<KotlinType> collectionMo89569c = kotlinType.mo92781G0().mo89569c();
        ArrayList arrayList = new ArrayList(collectionMo89569c.size());
        Iterator<KotlinType> it = collectionMo89569c.iterator();
        while (it.hasNext()) {
            KotlinType kotlinTypeM93685e = m93685e(kotlinType, it.next(), typeSubstitutorM93663g);
            if (kotlinTypeM93685e != null) {
                arrayList.add(kotlinTypeM93685e);
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static TypeParameterDescriptor m93689i(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(63);
        }
        if (kotlinType.mo92781G0().mo89207e() instanceof TypeParameterDescriptor) {
            return (TypeParameterDescriptor) kotlinType.mo92781G0().mo89207e();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m93690j(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(29);
        }
        if (kotlinType.mo92781G0().mo89207e() instanceof ClassDescriptor) {
            return false;
        }
        Iterator<KotlinType> it = m93688h(kotlinType).iterator();
        while (it.hasNext()) {
            if (m93692l(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m93691k(@Nullable KotlinType kotlinType) {
        return kotlinType != null && kotlinType.mo92781G0() == f66960a.mo92781G0();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m93692l(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(27);
        }
        if (kotlinType.mo90857H0()) {
            return true;
        }
        if (FlexibleTypesKt.m93497b(kotlinType) && m93692l(FlexibleTypesKt.m93496a(kotlinType).m93489P0())) {
            return true;
        }
        if (SpecialTypesKt.m93547c(kotlinType)) {
            return false;
        }
        if (m93693m(kotlinType)) {
            return m93690j(kotlinType);
        }
        if (kotlinType instanceof AbstractStubType) {
            TypeParameterDescriptor typeParameterDescriptorM93835b = ((AbstractStubType) kotlinType).m93393P0().m93835b();
            return typeParameterDescriptorM93835b == null || m93690j(typeParameterDescriptorM93835b.mo89349o());
        }
        TypeConstructor typeConstructorMo92781G0 = kotlinType.mo92781G0();
        if (typeConstructorMo92781G0 instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = typeConstructorMo92781G0.mo89569c().iterator();
            while (it.hasNext()) {
                if (m93692l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m93693m(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(60);
        }
        return m93689i(kotlinType) != null || (kotlinType.mo92781G0() instanceof NewTypeVariableConstructor);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static KotlinType m93694n(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(2);
        }
        return m93696p(kotlinType, false);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static KotlinType m93695o(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(1);
        }
        return m93696p(kotlinType, true);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static KotlinType m93696p(@NotNull KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            m93681a(3);
        }
        UnwrappedType unwrappedTypeMo90858N0 = kotlinType.mo93516J0().mo90858N0(z);
        if (unwrappedTypeMo90858N0 == null) {
            m93681a(4);
        }
        return unwrappedTypeMo90858N0;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static KotlinType m93697q(@NotNull KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            m93681a(8);
        }
        if (z) {
            return m93695o(kotlinType);
        }
        if (kotlinType == null) {
            m93681a(9);
        }
        return kotlinType;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static SimpleType m93698r(@NotNull SimpleType simpleType, boolean z) {
        if (simpleType == null) {
            m93681a(5);
        }
        if (!z) {
            if (simpleType == null) {
                m93681a(7);
            }
            return simpleType;
        }
        SimpleType simpleTypeMo90858N0 = simpleType.mo90858N0(true);
        if (simpleTypeMo90858N0 == null) {
            m93681a(6);
        }
        return simpleTypeMo90858N0;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static TypeProjection m93699s(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null) {
            m93681a(45);
        }
        return new StarProjectionImpl(typeParameterDescriptor);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static TypeProjection m93700t(@NotNull TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        if (typeParameterDescriptor == null) {
            m93681a(46);
        }
        return erasureTypeAttributes.mo90737b() == TypeUsage.SUPERTYPE ? new TypeProjectionImpl(StarProjectionImplKt.m93563b(typeParameterDescriptor)) : new StarProjectionImpl(typeParameterDescriptor);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static SimpleType m93701u(ClassifierDescriptor classifierDescriptor, MemberScope memberScope, Function1<KotlinTypeRefiner, SimpleType> function1) {
        if (!ErrorUtils.m93894m(classifierDescriptor)) {
            return m93702v(classifierDescriptor.mo89196l(), memberScope, function1);
        }
        ErrorType errorTypeM93893d = ErrorUtils.m93893d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, classifierDescriptor.toString());
        if (errorTypeM93893d == null) {
            m93681a(11);
        }
        return errorTypeM93893d;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static SimpleType m93702v(@NotNull TypeConstructor typeConstructor, @NotNull MemberScope memberScope, @NotNull Function1<KotlinTypeRefiner, SimpleType> function1) {
        if (typeConstructor == null) {
            m93681a(12);
        }
        if (memberScope == null) {
            m93681a(13);
        }
        if (function1 == null) {
            m93681a(14);
        }
        SimpleType simpleTypeM93528n = KotlinTypeFactory.m93528n(TypeAttributes.Companion.m93600k(), typeConstructor, m93687g(typeConstructor.getParameters()), false, memberScope, function1);
        if (simpleTypeM93528n == null) {
            m93681a(15);
        }
        return simpleTypeM93528n;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m93703w(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93681a(0);
        }
        return kotlinType == f66962c || kotlinType == f66963d;
    }
}
