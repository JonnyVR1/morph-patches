package kotlin.reflect.jvm.internal.impl.types;

import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
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
import p153l.uid0;

/* JADX INFO: loaded from: classes2.dex */
public class TypeSubstitutor implements TypeSubstitutorMarker {

    /* JADX INFO: renamed from: b */
    public static final TypeSubstitutor f66957b = m93664h(TypeSubstitution.f66955a);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeSubstitution f66958a;

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
    public static class C15451a implements Function1<FqName, Boolean> {
        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m93679a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", AuthenticationTokenClaims.JSON_KEY_NAME, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(@NotNull FqName fqName) {
            if (fqName == null) {
                m93679a(0);
            }
            return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.f64539P));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$b */
    public static /* synthetic */ class C15452b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66959a;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f66959a = iArr;
            try {
                iArr[VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66959a[VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66959a[VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TypeSubstitutor(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m93657a(7);
        }
        this.f66958a = typeSubstitution;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m93657a(int i) {
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
    public static void m93658b(int i, TypeProjection typeProjection, TypeSubstitution typeSubstitution) {
        if (i <= 100) {
            return;
        }
        uid0.m196153a("Recursion too deep. Most likely infinite loop while substituting ", m93668p(typeProjection), "; substitution: ", m93668p(typeSubstitution));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static Variance m93659c(@NotNull Variance variance, @NotNull TypeProjection typeProjection) {
        if (variance == null) {
            m93657a(35);
        }
        if (typeProjection == null) {
            m93657a(36);
        }
        if (!typeProjection.mo93557b()) {
            return m93660d(variance, typeProjection.mo93558c());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            m93657a(37);
        }
        return variance2;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static Variance m93660d(@NotNull Variance variance, @NotNull Variance variance2) {
        if (variance == null) {
            m93657a(38);
        }
        if (variance2 == null) {
            m93657a(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                m93657a(40);
            }
            return variance2;
        }
        if (variance2 == variance3) {
            if (variance == null) {
                m93657a(41);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                m93657a(42);
            }
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    /* JADX INFO: renamed from: e */
    public static VarianceConflictType m93661e(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? VarianceConflictType.IN_IN_OUT_POSITION : VarianceConflictType.NO_CONFLICT;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static TypeSubstitutor m93662f(@NotNull Map<TypeConstructor, TypeProjection> map) {
        if (map == null) {
            m93657a(5);
        }
        return m93664h(TypeConstructorSubstitution.m93627j(map));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static TypeSubstitutor m93663g(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m93657a(6);
        }
        return m93664h(TypeConstructorSubstitution.m93626i(kotlinType.mo92781G0(), kotlinType.mo92779E0()));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static TypeSubstitutor m93664h(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m93657a(0);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static TypeSubstitutor m93665i(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            m93657a(3);
        }
        if (typeSubstitution2 == null) {
            m93657a(4);
        }
        return m93664h(DisjointKeysUnionTypeSubstitution.m93475i(typeSubstitution, typeSubstitution2));
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static Annotations m93666j(@NotNull Annotations annotations) {
        if (annotations == null) {
            m93657a(33);
        }
        return !annotations.mo89530d0(StandardNames.FqNames.f64539P) ? annotations : new FilteredAnnotations(annotations, new C15451a());
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static TypeProjection m93667m(@NotNull KotlinType kotlinType, @NotNull TypeProjection typeProjection, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeProjection typeProjection2) {
        if (kotlinType == null) {
            m93657a(26);
        }
        if (typeProjection == null) {
            m93657a(27);
        }
        if (typeProjection2 == null) {
            m93657a(28);
        }
        if (!kotlinType.getAnnotations().mo89530d0(StandardNames.FqNames.f64539P)) {
            if (typeProjection == null) {
                m93657a(29);
            }
            return typeProjection;
        }
        TypeConstructor typeConstructorMo92781G0 = typeProjection.getType().mo92781G0();
        if (!(typeConstructorMo92781G0 instanceof NewCapturedTypeConstructor)) {
            return typeProjection;
        }
        TypeProjection typeProjectionMo92785d = ((NewCapturedTypeConstructor) typeConstructorMo92781G0).mo92785d();
        Variance varianceMo93558c = typeProjectionMo92785d.mo93558c();
        VarianceConflictType varianceConflictTypeM93661e = m93661e(typeProjection2.mo93558c(), varianceMo93558c);
        VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
        if (varianceConflictTypeM93661e == varianceConflictType) {
            return new TypeProjectionImpl(typeProjectionMo92785d.getType());
        }
        return (typeParameterDescriptor != null && m93661e(typeParameterDescriptor.mo89492h(), varianceMo93558c) == varianceConflictType) ? new TypeProjectionImpl(typeProjectionMo92785d.getType()) : typeProjection;
    }

    /* JADX INFO: renamed from: p */
    public static String m93668p(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ExceptionUtilsKt.m94087a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + Constants.AES_SUFFIX;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public TypeSubstitution m93669k() {
        TypeSubstitution typeSubstitution = this.f66958a;
        if (typeSubstitution == null) {
            m93657a(8);
        }
        return typeSubstitution;
    }

    /* JADX INFO: renamed from: l */
    public boolean m93670l() {
        return this.f66958a.mo90773f();
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public TypeSubstitutor m93671n() {
        TypeSubstitution typeSubstitution = this.f66958a;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.mo92798b()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) this.f66958a).m93501j(), ((IndexedParametersSubstitution) this.f66958a).m93500i(), false)) : this;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public KotlinType m93672o(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            m93657a(9);
        }
        if (variance == null) {
            m93657a(10);
        }
        if (m93670l()) {
            if (kotlinType == null) {
                m93657a(11);
            }
            return kotlinType;
        }
        try {
            KotlinType type = m93678v(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type == null) {
                m93657a(12);
            }
            return type;
        } catch (SubstitutionException e) {
            ErrorType errorTypeM93893d = ErrorUtils.m93893d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (errorTypeM93893d == null) {
                m93657a(13);
            }
            return errorTypeM93893d;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public KotlinType m93673q(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            m93657a(14);
        }
        if (variance == null) {
            m93657a(15);
        }
        TypeProjection typeProjectionM93674r = m93674r(new TypeProjectionImpl(variance, m93669k().mo93471g(kotlinType, variance)));
        if (typeProjectionM93674r == null) {
            return null;
        }
        return typeProjectionM93674r.getType();
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public TypeProjection m93674r(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            m93657a(16);
        }
        TypeProjection typeProjectionM93677u = m93677u(typeProjection);
        return (this.f66958a.mo93469a() || this.f66958a.mo92798b()) ? CapturedTypeApproximationKt.m94005d(typeProjectionM93677u, this.f66958a.mo92798b()) : typeProjectionM93677u;
    }

    /* JADX INFO: renamed from: s */
    public final TypeProjection m93675s(TypeProjection typeProjection, int i) throws SubstitutionException {
        KotlinType type = typeProjection.getType();
        Variance varianceMo93558c = typeProjection.mo93558c();
        if (type.mo92781G0().mo89207e() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        SimpleType simpleTypeM93546b = SpecialTypesKt.m93546b(type);
        KotlinType kotlinTypeM93673q = simpleTypeM93546b != null ? m93671n().m93673q(simpleTypeM93546b, Variance.INVARIANT) : null;
        KotlinType kotlinTypeM93652b = TypeSubstitutionKt.m93652b(type, m93676t(type.mo92781G0().getParameters(), type.mo92779E0(), i), this.f66958a.mo93470d(type.getAnnotations()));
        if ((kotlinTypeM93652b instanceof SimpleType) && (kotlinTypeM93673q instanceof SimpleType)) {
            kotlinTypeM93652b = SpecialTypesKt.m93554j((SimpleType) kotlinTypeM93652b, (SimpleType) kotlinTypeM93673q);
        }
        return new TypeProjectionImpl(varianceMo93558c, kotlinTypeM93652b);
    }

    /* JADX INFO: renamed from: t */
    public final List<TypeProjection> m93676t(List<TypeParameterDescriptor> list, List<TypeProjection> list2, int i) throws SubstitutionException {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            TypeParameterDescriptor typeParameterDescriptor = list.get(i2);
            TypeProjection typeProjection = list2.get(i2);
            TypeProjection typeProjectionM93678v = m93678v(typeProjection, typeParameterDescriptor, i + 1);
            int i3 = C15452b.f66959a[m93661e(typeParameterDescriptor.mo89492h(), typeProjectionM93678v.mo93558c()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                typeProjectionM93678v = TypeUtils.m93699s(typeParameterDescriptor);
            } else if (i3 == 3) {
                Variance varianceMo89492h = typeParameterDescriptor.mo89492h();
                Variance variance = Variance.INVARIANT;
                if (varianceMo89492h != variance && !typeProjectionM93678v.mo93557b()) {
                    typeProjectionM93678v = new TypeProjectionImpl(variance, typeProjectionM93678v.getType());
                }
            }
            if (typeProjectionM93678v != typeProjection) {
                z = true;
            }
            arrayList.add(typeProjectionM93678v);
        }
        return !z ? list2 : arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public TypeProjection m93677u(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            m93657a(17);
        }
        if (m93670l()) {
            return typeProjection;
        }
        try {
            return m93678v(typeProjection, null, 0);
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
    public final TypeProjection m93678v(@NotNull TypeProjection typeProjection, @Nullable TypeParameterDescriptor typeParameterDescriptor, int i) throws SubstitutionException {
        if (typeProjection == null) {
            m93657a(18);
        }
        m93658b(i, typeProjection, this.f66958a);
        if (!typeProjection.mo93557b()) {
            KotlinType type = typeProjection.getType();
            if (type instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
                UnwrappedType unwrappedTypeMo93492P = typeWithEnhancement.mo93492P();
                KotlinType kotlinTypeMo93495l0 = typeWithEnhancement.mo93495l0();
                TypeProjection typeProjectionM93678v = m93678v(new TypeProjectionImpl(typeProjection.mo93558c(), unwrappedTypeMo93492P), typeParameterDescriptor, i + 1);
                return typeProjectionM93678v.mo93557b() ? typeProjectionM93678v : new TypeProjectionImpl(typeProjectionM93678v.mo93558c(), TypeWithEnhancementKt.m93709d(typeProjectionM93678v.getType().mo93516J0(), m93673q(kotlinTypeMo93495l0, typeProjection.mo93558c())));
            }
            if (!DynamicTypesKt.m93480a(type) && !(type.mo93516J0() instanceof RawType)) {
                TypeProjection typeProjectionMo90772e = this.f66958a.mo90772e(type);
                TypeProjection typeProjectionM93667m = typeProjectionMo90772e != null ? m93667m(type, typeProjectionMo90772e, typeParameterDescriptor, typeProjection) : null;
                Variance varianceMo93558c = typeProjection.mo93558c();
                if (typeProjectionM93667m == null && FlexibleTypesKt.m93497b(type) && !TypeCapabilitiesKt.m93604b(type)) {
                    FlexibleType flexibleTypeM93496a = FlexibleTypesKt.m93496a(type);
                    int i2 = i + 1;
                    TypeProjection typeProjectionM93678v2 = m93678v(new TypeProjectionImpl(varianceMo93558c, flexibleTypeM93496a.m93488O0()), typeParameterDescriptor, i2);
                    TypeProjection typeProjectionM93678v3 = m93678v(new TypeProjectionImpl(varianceMo93558c, flexibleTypeM93496a.m93489P0()), typeParameterDescriptor, i2);
                    Variance varianceMo93558c2 = typeProjectionM93678v2.mo93558c();
                    if (typeProjectionM93678v2.getType() != flexibleTypeM93496a.m93488O0() || typeProjectionM93678v3.getType() != flexibleTypeM93496a.m93489P0()) {
                        return new TypeProjectionImpl(varianceMo93558c2, KotlinTypeFactory.m93520e(TypeSubstitutionKt.m93651a(typeProjectionM93678v2.getType()), TypeSubstitutionKt.m93651a(typeProjectionM93678v3.getType())));
                    }
                } else if (!KotlinBuiltIns.m89084o0(type) && !KotlinTypeKt.m93535a(type)) {
                    if (typeProjectionM93667m == null) {
                        TypeProjection typeProjectionM93675s = m93675s(typeProjection, i);
                        if (typeProjectionM93675s == null) {
                            m93657a(25);
                        }
                        return typeProjectionM93675s;
                    }
                    VarianceConflictType varianceConflictTypeM93661e = m93661e(varianceMo93558c, typeProjectionM93667m.mo93558c());
                    if (!CapturedTypeConstructorKt.m92795f(type)) {
                        int i3 = C15452b.f66959a[varianceConflictTypeM93661e.ordinal()];
                        if (i3 == 1) {
                            throw new SubstitutionException("Out-projection in in-position");
                        }
                        if (i3 == 2) {
                            return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.mo92781G0().mo89570f().m89105J());
                        }
                    }
                    CustomTypeParameter customTypeParameterM93603a = TypeCapabilitiesKt.m93603a(type);
                    if (typeProjectionM93667m.mo93557b()) {
                        return typeProjectionM93667m;
                    }
                    KotlinType kotlinTypeMo90865m0 = customTypeParameterM93603a != null ? customTypeParameterM93603a.mo90865m0(typeProjectionM93667m.getType()) : TypeUtils.m93697q(typeProjectionM93667m.getType(), type.mo90857H0());
                    if (!type.getAnnotations().isEmpty()) {
                        kotlinTypeMo90865m0 = TypeUtilsKt.m93968C(kotlinTypeMo90865m0, new CompositeAnnotations(kotlinTypeMo90865m0.getAnnotations(), m93666j(this.f66958a.mo93470d(type.getAnnotations()))));
                    }
                    if (varianceConflictTypeM93661e == VarianceConflictType.NO_CONFLICT) {
                        varianceMo93558c = m93660d(varianceMo93558c, typeProjectionM93667m.mo93558c());
                    }
                    return new TypeProjectionImpl(varianceMo93558c, kotlinTypeMo90865m0);
                }
            }
        }
        return typeProjection;
    }
}
