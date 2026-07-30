package kotlin.reflect.jvm.internal.impl.types;

import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.rad0;

/* JADX INFO: loaded from: classes2.dex */
public class TypeSubstitutor implements TypeSubstitutorMarker {

    /* JADX INFO: renamed from: b */
    public static final TypeSubstitutor f66283b = m92773h(TypeSubstitution.f66281a);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeSubstitution f66284a;

    public static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    public enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$a */
    public static class C15344a implements Function1<FqName, Boolean> {
        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m92788a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", AuthenticationTokenClaims.JSON_KEY_NAME, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(@NotNull FqName fqName) {
            if (fqName == null) {
                m92788a(0);
            }
            return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.f63865P));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$b */
    public static /* synthetic */ class C15345b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66285a;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f66285a = iArr;
            try {
                iArr[VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66285a[VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66285a[VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TypeSubstitutor(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m92766a(7);
        }
        this.f66284a = typeSubstitution;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m92766a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = MerchandiseTimeUnit.second;
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = PushService.COMMAND_CREATE;
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m92767b(int i, TypeProjection typeProjection, TypeSubstitution typeSubstitution) {
        if (i <= 100) {
            return;
        }
        rad0.m178492a("Recursion too deep. Most likely infinite loop while substituting ", m92777p(typeProjection), "; substitution: ", m92777p(typeSubstitution));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static Variance m92768c(@NotNull Variance variance, @NotNull TypeProjection typeProjection) {
        if (variance == null) {
            m92766a(35);
        }
        if (typeProjection == null) {
            m92766a(36);
        }
        if (!typeProjection.mo92666b()) {
            return m92769d(variance, typeProjection.mo92667c());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            m92766a(37);
        }
        return variance2;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static Variance m92769d(@NotNull Variance variance, @NotNull Variance variance2) {
        if (variance == null) {
            m92766a(38);
        }
        if (variance2 == null) {
            m92766a(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                m92766a(40);
            }
            return variance2;
        }
        if (variance2 == variance3) {
            if (variance == null) {
                m92766a(41);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                m92766a(42);
            }
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    /* JADX INFO: renamed from: e */
    public static VarianceConflictType m92770e(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? VarianceConflictType.IN_IN_OUT_POSITION : VarianceConflictType.NO_CONFLICT;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static TypeSubstitutor m92771f(@NotNull Map<TypeConstructor, TypeProjection> map) {
        if (map == null) {
            m92766a(5);
        }
        return m92773h(TypeConstructorSubstitution.m92736j(map));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static TypeSubstitutor m92772g(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92766a(6);
        }
        return m92773h(TypeConstructorSubstitution.m92735i(kotlinType.mo91890G0(), kotlinType.mo91888E0()));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static TypeSubstitutor m92773h(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m92766a(0);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static TypeSubstitutor m92774i(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            m92766a(3);
        }
        if (typeSubstitution2 == null) {
            m92766a(4);
        }
        return m92773h(DisjointKeysUnionTypeSubstitution.m92584i(typeSubstitution, typeSubstitution2));
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static Annotations m92775j(@NotNull Annotations annotations) {
        if (annotations == null) {
            m92766a(33);
        }
        return !annotations.mo88639c0(StandardNames.FqNames.f63865P) ? annotations : new FilteredAnnotations(annotations, new C15344a());
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static TypeProjection m92776m(@NotNull KotlinType kotlinType, @NotNull TypeProjection typeProjection, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeProjection typeProjection2) {
        if (kotlinType == null) {
            m92766a(26);
        }
        if (typeProjection == null) {
            m92766a(27);
        }
        if (typeProjection2 == null) {
            m92766a(28);
        }
        if (!kotlinType.getAnnotations().mo88639c0(StandardNames.FqNames.f63865P)) {
            if (typeProjection == null) {
                m92766a(29);
            }
            return typeProjection;
        }
        TypeConstructor typeConstructorMo91890G0 = typeProjection.getType().mo91890G0();
        if (!(typeConstructorMo91890G0 instanceof NewCapturedTypeConstructor)) {
            return typeProjection;
        }
        TypeProjection typeProjectionMo91894d = ((NewCapturedTypeConstructor) typeConstructorMo91890G0).mo91894d();
        Variance varianceMo92667c = typeProjectionMo91894d.mo92667c();
        VarianceConflictType varianceConflictTypeM92770e = m92770e(typeProjection2.mo92667c(), varianceMo92667c);
        VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
        if (varianceConflictTypeM92770e == varianceConflictType) {
            return new TypeProjectionImpl(typeProjectionMo91894d.getType());
        }
        return (typeParameterDescriptor != null && m92770e(typeParameterDescriptor.mo88601h(), varianceMo92667c) == varianceConflictType) ? new TypeProjectionImpl(typeProjectionMo91894d.getType()) : typeProjection;
    }

    /* JADX INFO: renamed from: p */
    public static String m92777p(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ExceptionUtilsKt.m93196a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + Constants.AES_SUFFIX;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public TypeSubstitution m92778k() {
        TypeSubstitution typeSubstitution = this.f66284a;
        if (typeSubstitution == null) {
            m92766a(8);
        }
        return typeSubstitution;
    }

    /* JADX INFO: renamed from: l */
    public boolean m92779l() {
        return this.f66284a.mo89882f();
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public TypeSubstitutor m92780n() {
        TypeSubstitution typeSubstitution = this.f66284a;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.mo91907b()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) this.f66284a).m92610j(), ((IndexedParametersSubstitution) this.f66284a).m92609i(), false)) : this;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public KotlinType m92781o(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            m92766a(9);
        }
        if (variance == null) {
            m92766a(10);
        }
        if (m92779l()) {
            if (kotlinType == null) {
                m92766a(11);
            }
            return kotlinType;
        }
        try {
            KotlinType type = m92787v(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type == null) {
                m92766a(12);
            }
            return type;
        } catch (SubstitutionException e) {
            ErrorType errorTypeM93002d = ErrorUtils.m93002d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (errorTypeM93002d == null) {
                m92766a(13);
            }
            return errorTypeM93002d;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public KotlinType m92782q(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            m92766a(14);
        }
        if (variance == null) {
            m92766a(15);
        }
        TypeProjection typeProjectionM92783r = m92783r(new TypeProjectionImpl(variance, m92778k().mo92580g(kotlinType, variance)));
        if (typeProjectionM92783r == null) {
            return null;
        }
        return typeProjectionM92783r.getType();
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public TypeProjection m92783r(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            m92766a(16);
        }
        TypeProjection typeProjectionM92786u = m92786u(typeProjection);
        return (this.f66284a.mo92578a() || this.f66284a.mo91907b()) ? CapturedTypeApproximationKt.m93114d(typeProjectionM92786u, this.f66284a.mo91907b()) : typeProjectionM92786u;
    }

    /* JADX INFO: renamed from: s */
    public final TypeProjection m92784s(TypeProjection typeProjection, int i) throws SubstitutionException {
        KotlinType type = typeProjection.getType();
        Variance varianceMo92667c = typeProjection.mo92667c();
        if (type.mo91890G0().mo88316e() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        SimpleType simpleTypeM92655b = SpecialTypesKt.m92655b(type);
        KotlinType kotlinTypeM92782q = simpleTypeM92655b != null ? m92780n().m92782q(simpleTypeM92655b, Variance.INVARIANT) : null;
        KotlinType kotlinTypeM92761b = TypeSubstitutionKt.m92761b(type, m92785t(type.mo91890G0().getParameters(), type.mo91888E0(), i), this.f66284a.mo92579d(type.getAnnotations()));
        if ((kotlinTypeM92761b instanceof SimpleType) && (kotlinTypeM92782q instanceof SimpleType)) {
            kotlinTypeM92761b = SpecialTypesKt.m92663j((SimpleType) kotlinTypeM92761b, (SimpleType) kotlinTypeM92782q);
        }
        return new TypeProjectionImpl(varianceMo92667c, kotlinTypeM92761b);
    }

    /* JADX INFO: renamed from: t */
    public final List<TypeProjection> m92785t(List<TypeParameterDescriptor> list, List<TypeProjection> list2, int i) throws SubstitutionException {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            TypeParameterDescriptor typeParameterDescriptor = list.get(i2);
            TypeProjection typeProjection = list2.get(i2);
            TypeProjection typeProjectionM92787v = m92787v(typeProjection, typeParameterDescriptor, i + 1);
            int i3 = C15345b.f66285a[m92770e(typeParameterDescriptor.mo88601h(), typeProjectionM92787v.mo92667c()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                typeProjectionM92787v = TypeUtils.m92808s(typeParameterDescriptor);
            } else if (i3 == 3) {
                Variance varianceMo88601h = typeParameterDescriptor.mo88601h();
                Variance variance = Variance.INVARIANT;
                if (varianceMo88601h != variance && !typeProjectionM92787v.mo92666b()) {
                    typeProjectionM92787v = new TypeProjectionImpl(variance, typeProjectionM92787v.getType());
                }
            }
            if (typeProjectionM92787v != typeProjection) {
                z = true;
            }
            arrayList.add(typeProjectionM92787v);
        }
        return !z ? list2 : arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public TypeProjection m92786u(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            m92766a(17);
        }
        if (m92779l()) {
            return typeProjection;
        }
        try {
            return m92787v(typeProjection, null, 0);
        } catch (SubstitutionException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    /* JADX INFO: renamed from: v */
    public final TypeProjection m92787v(@NotNull TypeProjection typeProjection, @Nullable TypeParameterDescriptor typeParameterDescriptor, int i) throws SubstitutionException {
        if (typeProjection == null) {
            m92766a(18);
        }
        m92767b(i, typeProjection, this.f66284a);
        if (!typeProjection.mo92666b()) {
            KotlinType type = typeProjection.getType();
            if (type instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
                UnwrappedType unwrappedTypeMo92601P = typeWithEnhancement.mo92601P();
                KotlinType kotlinTypeMo92604l0 = typeWithEnhancement.mo92604l0();
                TypeProjection typeProjectionM92787v = m92787v(new TypeProjectionImpl(typeProjection.mo92667c(), unwrappedTypeMo92601P), typeParameterDescriptor, i + 1);
                return typeProjectionM92787v.mo92666b() ? typeProjectionM92787v : new TypeProjectionImpl(typeProjectionM92787v.mo92667c(), TypeWithEnhancementKt.m92818d(typeProjectionM92787v.getType().mo92625J0(), m92782q(kotlinTypeMo92604l0, typeProjection.mo92667c())));
            }
            if (!DynamicTypesKt.m92589a(type) && !(type.mo92625J0() instanceof RawType)) {
                TypeProjection typeProjectionMo89881e = this.f66284a.mo89881e(type);
                TypeProjection typeProjectionM92776m = typeProjectionMo89881e != null ? m92776m(type, typeProjectionMo89881e, typeParameterDescriptor, typeProjection) : null;
                Variance varianceMo92667c = typeProjection.mo92667c();
                if (typeProjectionM92776m == null && FlexibleTypesKt.m92606b(type) && !TypeCapabilitiesKt.m92713b(type)) {
                    FlexibleType flexibleTypeM92605a = FlexibleTypesKt.m92605a(type);
                    int i2 = i + 1;
                    TypeProjection typeProjectionM92787v2 = m92787v(new TypeProjectionImpl(varianceMo92667c, flexibleTypeM92605a.m92597O0()), typeParameterDescriptor, i2);
                    TypeProjection typeProjectionM92787v3 = m92787v(new TypeProjectionImpl(varianceMo92667c, flexibleTypeM92605a.m92598P0()), typeParameterDescriptor, i2);
                    Variance varianceMo92667c2 = typeProjectionM92787v2.mo92667c();
                    if (typeProjectionM92787v2.getType() != flexibleTypeM92605a.m92597O0() || typeProjectionM92787v3.getType() != flexibleTypeM92605a.m92598P0()) {
                        return new TypeProjectionImpl(varianceMo92667c2, KotlinTypeFactory.m92629e(TypeSubstitutionKt.m92760a(typeProjectionM92787v2.getType()), TypeSubstitutionKt.m92760a(typeProjectionM92787v3.getType())));
                    }
                } else if (!KotlinBuiltIns.m88193o0(type) && !KotlinTypeKt.m92644a(type)) {
                    if (typeProjectionM92776m == null) {
                        TypeProjection typeProjectionM92784s = m92784s(typeProjection, i);
                        if (typeProjectionM92784s == null) {
                            m92766a(25);
                        }
                        return typeProjectionM92784s;
                    }
                    VarianceConflictType varianceConflictTypeM92770e = m92770e(varianceMo92667c, typeProjectionM92776m.mo92667c());
                    if (!CapturedTypeConstructorKt.m91904f(type)) {
                        int i3 = C15345b.f66285a[varianceConflictTypeM92770e.ordinal()];
                        if (i3 == 1) {
                            throw new SubstitutionException("Out-projection in in-position");
                        }
                        if (i3 == 2) {
                            return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.mo91890G0().mo88679f().m88214J());
                        }
                    }
                    CustomTypeParameter customTypeParameterM92712a = TypeCapabilitiesKt.m92712a(type);
                    if (typeProjectionM92776m.mo92666b()) {
                        return typeProjectionM92776m;
                    }
                    KotlinType kotlinTypeMo89974m0 = customTypeParameterM92712a != null ? customTypeParameterM92712a.mo89974m0(typeProjectionM92776m.getType()) : TypeUtils.m92806q(typeProjectionM92776m.getType(), type.mo89966H0());
                    if (!type.getAnnotations().isEmpty()) {
                        kotlinTypeMo89974m0 = TypeUtilsKt.m93077C(kotlinTypeMo89974m0, new CompositeAnnotations(kotlinTypeMo89974m0.getAnnotations(), m92775j(this.f66284a.mo92579d(type.getAnnotations()))));
                    }
                    if (varianceConflictTypeM92770e == VarianceConflictType.NO_CONFLICT) {
                        varianceMo92667c = m92769d(varianceMo92667c, typeProjectionM92776m.mo92667c());
                    }
                    return new TypeProjectionImpl(varianceMo92667c, kotlinTypeMo89974m0);
                }
            }
        }
        return typeProjection;
    }
}
