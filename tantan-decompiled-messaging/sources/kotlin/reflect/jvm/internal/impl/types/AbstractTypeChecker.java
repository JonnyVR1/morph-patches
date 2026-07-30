package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C19153p8;
import p149l.C19443q8;
import p149l.l9r;
import p149l.nnq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class AbstractTypeChecker {

    @NotNull
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();

    /* JADX INFO: renamed from: a */
    @JvmField
    public static boolean f66192a;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66193a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f66194b;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66193a = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f66194b = iArr2;
        }
    }

    private AbstractTypeChecker() {
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m92507d(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        KotlinTypeMarker kotlinTypeMarkerM93060m;
        RigidTypeMarker rigidTypeMarkerM93047b0;
        return (rigidTypeMarker instanceof CapturedTypeMarker) && (kotlinTypeMarkerM93060m = TypeSystemContextContextualKt.m93060m(typeSystemContext, TypeSystemContextContextualKt.m93039V(typeSystemContext, TypeSystemContextContextualKt.m93042Y(typeSystemContext, (CapturedTypeMarker) rigidTypeMarker)))) != null && (rigidTypeMarkerM93047b0 = TypeSystemContextContextualKt.m93047b0(typeSystemContext, kotlinTypeMarkerM93060m)) != null && TypeSystemContextContextualKt.m93021D(typeSystemContext, rigidTypeMarkerM93047b0);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m92508e(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        TypeConstructorMarker typeConstructorMarkerM93045a0 = TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker);
        if (!(typeConstructorMarkerM93045a0 instanceof IntersectionTypeConstructorMarker)) {
            return false;
        }
        Collection<KotlinTypeMarker> collectionM93041X = TypeSystemContextContextualKt.m93041X(typeSystemContext, typeConstructorMarkerM93045a0);
        if ((collectionM93041X instanceof Collection) && collectionM93041X.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionM93041X.iterator();
        while (it.hasNext()) {
            RigidTypeMarker rigidTypeMarkerM93052e = TypeSystemContextContextualKt.m93052e(typeSystemContext, (KotlinTypeMarker) it.next());
            if (rigidTypeMarkerM93052e != null && TypeSystemContextContextualKt.m93021D(typeSystemContext, rigidTypeMarkerM93052e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m92509f(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        return TypeSystemContextContextualKt.m93021D(typeSystemContext, rigidTypeMarker) || m92507d(typeSystemContext, rigidTypeMarker);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m92510g(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2, boolean z) {
        TypeCheckerState typeCheckerState2;
        RigidTypeMarker rigidTypeMarker3;
        Collection<KotlinTypeMarker> collectionM93038U = TypeSystemContextContextualKt.m93038U(typeSystemContext, rigidTypeMarker);
        if ((collectionM93038U instanceof Collection) && collectionM93038U.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : collectionM93038U) {
            if (Intrinsics.m87488d(TypeSystemContextContextualKt.m93043Z(typeSystemContext, kotlinTypeMarker), TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker2))) {
                return true;
            }
            if (z) {
                typeCheckerState2 = typeCheckerState;
                rigidTypeMarker3 = rigidTypeMarker2;
                if (m92511w(INSTANCE, typeCheckerState2, rigidTypeMarker3, kotlinTypeMarker, false, 8, null)) {
                    return true;
                }
            } else {
                typeCheckerState2 = typeCheckerState;
                rigidTypeMarker3 = rigidTypeMarker2;
            }
            typeCheckerState = typeCheckerState2;
            rigidTypeMarker2 = rigidTypeMarker3;
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m92511w(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker.m92531v(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m92512y(Collection collection, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeCheckerState.ForkPointContext forkPointContext) {
        forkPointContext.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            forkPointContext.mo92731a(new C19443q8(typeCheckerState, typeSystemContext, (RigidTypeMarker) it.next(), rigidTypeMarker));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m92513z(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        return INSTANCE.m92529t(typeCheckerState, typeSystemContext, TypeSystemContextContextualKt.m93046b(typeSystemContext, rigidTypeMarker), rigidTypeMarker2);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m92514A(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterMarker typeParameterMarkerM93061n;
        RigidTypeMarker rigidTypeMarkerM93052e = TypeSystemContextContextualKt.m93052e(typeSystemContext, kotlinTypeMarker);
        if (rigidTypeMarkerM93052e instanceof CapturedTypeMarker) {
            CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) rigidTypeMarkerM93052e;
            if (TypeSystemContextContextualKt.m93027J(typeSystemContext, capturedTypeMarker) || !TypeSystemContextContextualKt.m93029L(typeSystemContext, TypeSystemContextContextualKt.m93039V(typeSystemContext, TypeSystemContextContextualKt.m93042Y(typeSystemContext, capturedTypeMarker))) || TypeSystemContextContextualKt.m93054g(typeSystemContext, capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
                return false;
            }
            TypeConstructorMarker typeConstructorMarkerM93043Z = TypeSystemContextContextualKt.m93043Z(typeSystemContext, kotlinTypeMarker2);
            TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructorMarkerM93043Z instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructorMarkerM93043Z : null;
            if (typeVariableTypeConstructorMarker != null && (typeParameterMarkerM93061n = TypeSystemContextContextualKt.m93061n(typeSystemContext, typeVariableTypeConstructorMarker)) != null && TypeSystemContextContextualKt.m93064q(typeSystemContext, typeParameterMarkerM93061n, typeConstructorMarker)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final List<RigidTypeMarker> m92515B(TypeSystemContext typeSystemContext, List<? extends RigidTypeMarker> list) {
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                TypeArgumentListMarker typeArgumentListMarkerM93046b = TypeSystemContextContextualKt.m93046b(typeSystemContext, (RigidTypeMarker) obj);
                int iMo90276q0 = typeSystemContext.mo90276q0(typeArgumentListMarkerM93046b);
                int i = 0;
                while (true) {
                    if (i >= iMo90276q0) {
                        arrayList.add(obj);
                        break;
                    }
                    KotlinTypeMarker kotlinTypeMarkerM93060m = TypeSystemContextContextualKt.m93060m(typeSystemContext, typeSystemContext.mo90271o(typeArgumentListMarkerM93046b, i));
                    if ((kotlinTypeMarkerM93060m != null ? TypeSystemContextContextualKt.m93050d(typeSystemContext, kotlinTypeMarkerM93060m) : null) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m92516c(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (!TypeSystemContextContextualKt.m93021D(typeSystemContext, rigidTypeMarker) && !TypeSystemContextContextualKt.m93021D(typeSystemContext, rigidTypeMarker2)) {
            return null;
        }
        if (m92509f(typeSystemContext, rigidTypeMarker) && m92509f(typeSystemContext, rigidTypeMarker2)) {
            return Boolean.TRUE;
        }
        if (TypeSystemContextContextualKt.m93021D(typeSystemContext, rigidTypeMarker)) {
            if (m92510g(typeSystemContext, typeCheckerState, rigidTypeMarker, rigidTypeMarker2, false)) {
                return Boolean.TRUE;
            }
        } else if (TypeSystemContextContextualKt.m93021D(typeSystemContext, rigidTypeMarker2) && (m92508e(typeSystemContext, rigidTypeMarker) || m92510g(typeSystemContext, typeCheckerState, rigidTypeMarker2, rigidTypeMarker, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x011a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX INFO: renamed from: h */
    public final Boolean m92517h(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeParameterMarker typeParameterMarkerM92525p;
        boolean z = false;
        if (TypeSystemContextContextualKt.m93018A(typeSystemContext, rigidTypeMarker) || TypeSystemContextContextualKt.m93018A(typeSystemContext, rigidTypeMarker2)) {
            if (typeCheckerState.m92726n()) {
                return Boolean.TRUE;
            }
            return (!TypeSystemContextContextualKt.m93024G(typeSystemContext, rigidTypeMarker) || TypeSystemContextContextualKt.m93024G(typeSystemContext, rigidTypeMarker2)) ? Boolean.valueOf(AbstractStrictEqualityTypeChecker.INSTANCE.m92500b(typeSystemContext, TypeSystemContextContextualKt.m93051d0(typeSystemContext, rigidTypeMarker, false), TypeSystemContextContextualKt.m93051d0(typeSystemContext, rigidTypeMarker2, false))) : Boolean.FALSE;
        }
        if (TypeSystemContextContextualKt.m93031N(typeSystemContext, rigidTypeMarker) && TypeSystemContextContextualKt.m93031N(typeSystemContext, rigidTypeMarker2)) {
            return Boolean.valueOf(m92528s(typeSystemContext, rigidTypeMarker, rigidTypeMarker2) || typeCheckerState.m92727o());
        }
        if (TypeSystemContextContextualKt.m93030M(typeSystemContext, rigidTypeMarker) || TypeSystemContextContextualKt.m93030M(typeSystemContext, rigidTypeMarker2)) {
            return Boolean.valueOf(typeCheckerState.m92727o());
        }
        CapturedTypeMarker capturedTypeMarkerM93048c = TypeSystemContextContextualKt.m93048c(typeSystemContext, rigidTypeMarker2);
        KotlinTypeMarker kotlinTypeMarkerM93034Q = capturedTypeMarkerM93048c != null ? TypeSystemContextContextualKt.m93034Q(typeSystemContext, capturedTypeMarkerM93048c) : null;
        if (capturedTypeMarkerM93048c != null && kotlinTypeMarkerM93034Q != null) {
            if (TypeSystemContextContextualKt.m93024G(typeSystemContext, rigidTypeMarker2)) {
                kotlinTypeMarkerM93034Q = TypeSystemContextContextualKt.m93049c0(typeSystemContext, kotlinTypeMarkerM93034Q, true);
            } else if (TypeSystemContextContextualKt.m93071x(typeSystemContext, rigidTypeMarker2)) {
                kotlinTypeMarkerM93034Q = TypeSystemContextContextualKt.m93035R(typeSystemContext, kotlinTypeMarkerM93034Q);
            }
            int i = WhenMappings.f66194b[typeCheckerState.m92719g(rigidTypeMarker, capturedTypeMarkerM93048c).ordinal()];
            if (i == 1) {
                return Boolean.valueOf(m92511w(this, typeCheckerState, rigidTypeMarker, kotlinTypeMarkerM93034Q, false, 8, null));
            }
            if (i != 2) {
                if (i != 3) {
                    l9r.m149037a();
                    return null;
                }
            } else if (m92511w(this, typeCheckerState, rigidTypeMarker, kotlinTypeMarkerM93034Q, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        TypeConstructorMarker typeConstructorMarkerM93045a0 = TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker2);
        if (TypeSystemContextContextualKt.m93023F(typeSystemContext, typeConstructorMarkerM93045a0)) {
            TypeSystemContextContextualKt.m93024G(typeSystemContext, rigidTypeMarker2);
            Collection<KotlinTypeMarker> collectionM93041X = TypeSystemContextContextualKt.m93041X(typeSystemContext, typeConstructorMarkerM93045a0);
            if ((collectionM93041X instanceof Collection) && collectionM93041X.isEmpty()) {
                z = true;
            } else {
                Iterator<T> it = collectionM93041X.iterator();
                while (it.hasNext()) {
                    if (!m92511w(INSTANCE, typeCheckerState, rigidTypeMarker, (KotlinTypeMarker) it.next(), false, 8, null)) {
                    }
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
        TypeConstructorMarker typeConstructorMarkerM93045a1 = TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker);
        if (rigidTypeMarker instanceof CapturedTypeMarker) {
            typeParameterMarkerM92525p = m92525p(typeSystemContext, rigidTypeMarker2, rigidTypeMarker);
            if (typeParameterMarkerM92525p != null && TypeSystemContextContextualKt.m93064q(typeSystemContext, typeParameterMarkerM92525p, TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker2))) {
                return Boolean.TRUE;
            }
        } else if (TypeSystemContextContextualKt.m93023F(typeSystemContext, typeConstructorMarkerM93045a1)) {
            Collection<KotlinTypeMarker> collectionM93041X2 = TypeSystemContextContextualKt.m93041X(typeSystemContext, typeConstructorMarkerM93045a1);
            if ((collectionM93041X2 instanceof Collection) && collectionM93041X2.isEmpty()) {
                typeParameterMarkerM92525p = m92525p(typeSystemContext, rigidTypeMarker2, rigidTypeMarker);
                if (typeParameterMarkerM92525p != null) {
                    return Boolean.TRUE;
                }
            } else {
                Iterator<T> it2 = collectionM93041X2.iterator();
                while (it2.hasNext()) {
                    if (!(((KotlinTypeMarker) it2.next()) instanceof CapturedTypeMarker)) {
                    }
                }
                typeParameterMarkerM92525p = m92525p(typeSystemContext, rigidTypeMarker2, rigidTypeMarker);
                if (typeParameterMarkerM92525p != null) {
                    return Boolean.TRUE;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final List<RigidTypeMarker> m92518i(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicyMo90229Q;
        List<SimpleTypeMarker> listM93055h = TypeSystemContextContextualKt.m93055h(typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        if (listM93055h != null) {
            return listM93055h;
        }
        if (!TypeSystemContextContextualKt.m93068u(typeSystemContext, typeConstructorMarker) && TypeSystemContextContextualKt.m93067t(typeSystemContext, rigidTypeMarker)) {
            return CollectionsKt.emptyList();
        }
        if (TypeSystemContextContextualKt.m93069v(typeSystemContext, typeConstructorMarker)) {
            if (!typeSystemContext.mo90234S0(TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker), typeConstructorMarker)) {
                return CollectionsKt.emptyList();
            }
            RigidTypeMarker rigidTypeMarkerMo90260i0 = typeSystemContext.mo90260i0(rigidTypeMarker, CaptureStatus.FOR_SUBTYPING);
            if (rigidTypeMarkerMo90260i0 != null) {
                rigidTypeMarker = rigidTypeMarkerMo90260i0;
            }
            return CollectionsKt.listOf(rigidTypeMarker);
        }
        SmartList smartList = new SmartList();
        typeCheckerState.m92723k();
        ArrayDeque<RigidTypeMarker> arrayDequeM92720h = typeCheckerState.m92720h();
        arrayDequeM92720h.getClass();
        Set<RigidTypeMarker> setM92721i = typeCheckerState.m92721i();
        setM92721i.getClass();
        arrayDequeM92720h.push(rigidTypeMarker);
        while (!arrayDequeM92720h.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeM92720h.pop();
            rigidTypeMarkerPop.getClass();
            if (setM92721i.add(rigidTypeMarkerPop)) {
                RigidTypeMarker rigidTypeMarkerMo90260i1 = typeSystemContext.mo90260i0(rigidTypeMarkerPop, CaptureStatus.FOR_SUBTYPING);
                if (rigidTypeMarkerMo90260i1 == null) {
                    rigidTypeMarkerMo90260i1 = rigidTypeMarkerPop;
                }
                if (typeSystemContext.mo90234S0(TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarkerMo90260i1), typeConstructorMarker)) {
                    smartList.add(rigidTypeMarkerMo90260i1);
                    supertypesPolicyMo90229Q = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicyMo90229Q = TypeSystemContextContextualKt.m93044a(typeSystemContext, rigidTypeMarkerMo90260i1) == 0 ? TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE : typeCheckerState.m92722j().mo90229Q(rigidTypeMarkerMo90260i1);
                }
                if (Intrinsics.m87488d(supertypesPolicyMo90229Q, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicyMo90229Q = null;
                }
                if (supertypesPolicyMo90229Q != null) {
                    TypeSystemContext typeSystemContextM92722j = typeCheckerState.m92722j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM92722j.mo90208F0(typeSystemContextM92722j.mo90245b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeM92720h.add(supertypesPolicyMo90229Q.mo92733a(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.m92718e();
        return smartList;
    }

    /* JADX INFO: renamed from: j */
    public final List<RigidTypeMarker> m92519j(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return m92515B(typeSystemContext, m92518i(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m92520k(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        KotlinTypeMarker kotlinTypeMarkerM92728p = typeCheckerState.m92728p(typeCheckerState.m92729q(kotlinTypeMarker));
        KotlinTypeMarker kotlinTypeMarkerM92728p2 = typeCheckerState.m92728p(typeCheckerState.m92729q(kotlinTypeMarker2));
        if (typeCheckerState.m92725m() && TypeSystemContextContextualKt.m93019B(typeSystemContext, kotlinTypeMarkerM92728p) && TypeSystemContextContextualKt.m93070w(typeSystemContext, kotlinTypeMarkerM92728p2)) {
            FlexibleTypeMarker flexibleTypeMarkerM93050d = TypeSystemContextContextualKt.m93050d(typeSystemContext, kotlinTypeMarkerM92728p);
            flexibleTypeMarkerM93050d.getClass();
            RigidTypeMarker rigidTypeMarkerM93032O = TypeSystemContextContextualKt.m93032O(typeSystemContext, flexibleTypeMarkerM93050d);
            RigidTypeMarker rigidTypeMarkerM93052e = TypeSystemContextContextualKt.m93052e(typeSystemContext, kotlinTypeMarkerM92728p2);
            rigidTypeMarkerM93052e.getClass();
            return m92520k(typeCheckerState, typeSystemContext, rigidTypeMarkerM93032O, TypeSystemContextContextualKt.m93036S(typeSystemContext, rigidTypeMarkerM93052e), z);
        }
        Boolean boolM92517h = m92517h(typeCheckerState, typeSystemContext, TypeSystemContextContextualKt.m93033P(typeSystemContext, kotlinTypeMarkerM92728p), TypeSystemContextContextualKt.m93047b0(typeSystemContext, kotlinTypeMarkerM92728p2));
        if (boolM92517h == null) {
            Boolean boolM92717c = typeCheckerState.m92717c(kotlinTypeMarkerM92728p, kotlinTypeMarkerM92728p2, z);
            return boolM92717c != null ? boolM92717c.booleanValue() : m92532x(typeCheckerState, typeSystemContext, TypeSystemContextContextualKt.m93033P(typeSystemContext, kotlinTypeMarkerM92728p), TypeSystemContextContextualKt.m93047b0(typeSystemContext, kotlinTypeMarkerM92728p2));
        }
        boolean zBooleanValue = boolM92517h.booleanValue();
        typeCheckerState.m92717c(kotlinTypeMarkerM92728p, kotlinTypeMarkerM92728p2, z);
        return zBooleanValue;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final TypeVariance m92521l(@NotNull TypeVariance typeVariance, @NotNull TypeVariance typeVariance2) {
        typeVariance.getClass();
        typeVariance2.getClass();
        TypeVariance typeVariance3 = TypeVariance.INV;
        if (typeVariance == typeVariance3) {
            return typeVariance2;
        }
        if (typeVariance2 == typeVariance3 || typeVariance == typeVariance2) {
            return typeVariance;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m92522m(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        typeCheckerState.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        TypeSystemContext typeSystemContextM92722j = typeCheckerState.m92722j();
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        if (abstractTypeChecker.m92527r(typeSystemContextM92722j, kotlinTypeMarker) && abstractTypeChecker.m92527r(typeSystemContextM92722j, kotlinTypeMarker2)) {
            KotlinTypeMarker kotlinTypeMarkerM92728p = typeCheckerState.m92728p(typeCheckerState.m92729q(kotlinTypeMarker));
            KotlinTypeMarker kotlinTypeMarkerM92728p2 = typeCheckerState.m92728p(typeCheckerState.m92729q(kotlinTypeMarker2));
            RigidTypeMarker rigidTypeMarkerMo90244a0 = typeSystemContextM92722j.mo90244a0(kotlinTypeMarkerM92728p);
            if (!typeSystemContextM92722j.mo90234S0(typeSystemContextM92722j.mo90225O(kotlinTypeMarkerM92728p), typeSystemContextM92722j.mo90225O(kotlinTypeMarkerM92728p2))) {
                return false;
            }
            if (typeSystemContextM92722j.mo90263k(rigidTypeMarkerMo90244a0) == 0) {
                return typeSystemContextM92722j.mo90210G0(kotlinTypeMarkerM92728p) || typeSystemContextM92722j.mo90210G0(kotlinTypeMarkerM92728p2) || typeSystemContextM92722j.mo90228P0(rigidTypeMarkerMo90244a0) == typeSystemContextM92722j.mo90228P0(typeSystemContextM92722j.mo90244a0(kotlinTypeMarkerM92728p2));
            }
        }
        return m92511w(abstractTypeChecker, typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, false, 8, null) && m92511w(abstractTypeChecker, typeCheckerState, kotlinTypeMarker2, kotlinTypeMarker, false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<RigidTypeMarker> m92523n(@NotNull TypeCheckerState typeCheckerState, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        typeCheckerState.getClass();
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        return INSTANCE.m92524o(typeCheckerState, typeCheckerState.m92722j(), rigidTypeMarker, typeConstructorMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<RigidTypeMarker> m92524o(@NotNull TypeCheckerState typeCheckerState, @NotNull TypeSystemContext typeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        typeCheckerState.getClass();
        typeSystemContext.getClass();
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        if (TypeSystemContextContextualKt.m93067t(typeSystemContext, rigidTypeMarker)) {
            return m92519j(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        }
        if (!TypeSystemContextContextualKt.m93068u(typeSystemContext, typeConstructorMarker) && !TypeSystemContextContextualKt.m93022E(typeSystemContext, typeConstructorMarker)) {
            return m92518i(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        }
        SmartList<RigidTypeMarker> smartList = new SmartList();
        typeCheckerState.m92723k();
        ArrayDeque<RigidTypeMarker> arrayDequeM92720h = typeCheckerState.m92720h();
        arrayDequeM92720h.getClass();
        Set<RigidTypeMarker> setM92721i = typeCheckerState.m92721i();
        setM92721i.getClass();
        arrayDequeM92720h.push(rigidTypeMarker);
        while (!arrayDequeM92720h.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeM92720h.pop();
            rigidTypeMarkerPop.getClass();
            if (setM92721i.add(rigidTypeMarkerPop)) {
                if (TypeSystemContextContextualKt.m93067t(typeSystemContext, rigidTypeMarkerPop)) {
                    smartList.add(rigidTypeMarkerPop);
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (Intrinsics.m87488d(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    TypeSystemContext typeSystemContextM92722j = typeCheckerState.m92722j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM92722j.mo90208F0(typeSystemContextM92722j.mo90245b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeM92720h.add(supertypesPolicy.mo92733a(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.m92718e();
        ArrayList arrayList = new ArrayList();
        for (RigidTypeMarker rigidTypeMarker2 : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            rigidTypeMarker2.getClass();
            CollectionsKt.addAll(arrayList, abstractTypeChecker.m92519j(typeCheckerState, typeSystemContext, rigidTypeMarker2, typeConstructorMarker));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final TypeParameterMarker m92525p(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        KotlinTypeMarker kotlinTypeMarkerM93060m;
        int iM93044a = TypeSystemContextContextualKt.m93044a(typeSystemContext, kotlinTypeMarker);
        int i = 0;
        while (true) {
            if (i >= iM93044a) {
                return null;
            }
            TypeArgumentMarker typeArgumentMarkerM93057j = TypeSystemContextContextualKt.m93057j(typeSystemContext, kotlinTypeMarker, i);
            TypeArgumentMarker typeArgumentMarker = TypeSystemContextContextualKt.m93029L(typeSystemContext, typeArgumentMarkerM93057j) ? null : typeArgumentMarkerM93057j;
            if (typeArgumentMarker != null && (kotlinTypeMarkerM93060m = TypeSystemContextContextualKt.m93060m(typeSystemContext, typeArgumentMarker)) != null) {
                boolean z = TypeSystemContextContextualKt.m93066s(typeSystemContext, TypeSystemContextContextualKt.m93033P(typeSystemContext, kotlinTypeMarkerM93060m)) && TypeSystemContextContextualKt.m93066s(typeSystemContext, TypeSystemContextContextualKt.m93033P(typeSystemContext, kotlinTypeMarker2));
                if (Intrinsics.m87488d(kotlinTypeMarkerM93060m, kotlinTypeMarker2) || (z && Intrinsics.m87488d(TypeSystemContextContextualKt.m93043Z(typeSystemContext, kotlinTypeMarkerM93060m), TypeSystemContextContextualKt.m93043Z(typeSystemContext, kotlinTypeMarker2)))) {
                    return TypeSystemContextContextualKt.m93059l(typeSystemContext, TypeSystemContextContextualKt.m93043Z(typeSystemContext, kotlinTypeMarker), i);
                }
                TypeParameterMarker typeParameterMarkerM92525p = m92525p(typeSystemContext, kotlinTypeMarkerM93060m, kotlinTypeMarker2);
                if (typeParameterMarkerM92525p != null) {
                    return typeParameterMarkerM92525p;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m92526q(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        TypeConstructorMarker typeConstructorMarkerM93045a0 = TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker);
        if (TypeSystemContextContextualKt.m93068u(typeSystemContext, typeConstructorMarkerM93045a0)) {
            return TypeSystemContextContextualKt.m93026I(typeSystemContext, typeConstructorMarkerM93045a0);
        }
        if (TypeSystemContextContextualKt.m93026I(typeSystemContext, TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker))) {
            return true;
        }
        typeCheckerState.m92723k();
        ArrayDeque<RigidTypeMarker> arrayDequeM92720h = typeCheckerState.m92720h();
        arrayDequeM92720h.getClass();
        Set<RigidTypeMarker> setM92721i = typeCheckerState.m92721i();
        setM92721i.getClass();
        arrayDequeM92720h.push(rigidTypeMarker);
        while (!arrayDequeM92720h.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeM92720h.pop();
            rigidTypeMarkerPop.getClass();
            if (setM92721i.add(rigidTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy = TypeSystemContextContextualKt.m93067t(typeSystemContext, rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (Intrinsics.m87488d(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContextM92722j = typeCheckerState.m92722j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM92722j.mo90208F0(typeSystemContextM92722j.mo90245b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo92733a = supertypesPolicy.mo92733a(typeCheckerState, it.next());
                        if (TypeSystemContextContextualKt.m93026I(typeSystemContext, TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarkerMo92733a))) {
                            typeCheckerState.m92718e();
                            return true;
                        }
                        arrayDequeM92720h.add(rigidTypeMarkerMo92733a);
                    }
                }
            }
        }
        typeCheckerState.m92718e();
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m92527r(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return (!TypeSystemContextContextualKt.m93072y(typeSystemContext, TypeSystemContextContextualKt.m93043Z(typeSystemContext, kotlinTypeMarker)) || TypeSystemContextContextualKt.m93073z(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.m93070w(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.m93025H(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.m93020C(typeSystemContext, kotlinTypeMarker)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m92528s(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker) != TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker2)) {
            return false;
        }
        if (TypeSystemContextContextualKt.m93071x(typeSystemContext, rigidTypeMarker) || !TypeSystemContextContextualKt.m93071x(typeSystemContext, rigidTypeMarker2)) {
            return !TypeSystemContextContextualKt.m93024G(typeSystemContext, rigidTypeMarker) || TypeSystemContextContextualKt.m93024G(typeSystemContext, rigidTypeMarker2);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m92529t(@NotNull TypeCheckerState typeCheckerState, @NotNull TypeSystemContext typeSystemContext, @NotNull TypeArgumentListMarker typeArgumentListMarker, @NotNull RigidTypeMarker rigidTypeMarker) {
        boolean zM92522m;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        typeCheckerState2.getClass();
        typeSystemContext.getClass();
        typeArgumentListMarker.getClass();
        rigidTypeMarker.getClass();
        TypeConstructorMarker typeConstructorMarkerM93045a0 = TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker);
        int iM93040W = TypeSystemContextContextualKt.m93040W(typeSystemContext, typeArgumentListMarker);
        int iM93037T = TypeSystemContextContextualKt.m93037T(typeSystemContext, typeConstructorMarkerM93045a0);
        if (iM93040W != iM93037T || iM93040W != TypeSystemContextContextualKt.m93044a(typeSystemContext, rigidTypeMarker)) {
            return false;
        }
        for (int i = 0; i < iM93037T; i++) {
            TypeArgumentMarker typeArgumentMarkerM93057j = TypeSystemContextContextualKt.m93057j(typeSystemContext, rigidTypeMarker, i);
            KotlinTypeMarker kotlinTypeMarkerM93060m = TypeSystemContextContextualKt.m93060m(typeSystemContext, typeArgumentMarkerM93057j);
            if (kotlinTypeMarkerM93060m != null) {
                TypeArgumentMarker typeArgumentMarkerM93056i = TypeSystemContextContextualKt.m93056i(typeSystemContext, typeArgumentListMarker, i);
                TypeSystemContextContextualKt.m93062o(typeSystemContext, typeArgumentMarkerM93056i);
                TypeVariance typeVariance = TypeVariance.INV;
                KotlinTypeMarker kotlinTypeMarkerM93060m2 = TypeSystemContextContextualKt.m93060m(typeSystemContext, typeArgumentMarkerM93056i);
                kotlinTypeMarkerM93060m2.getClass();
                TypeVariance typeVarianceM92521l = m92521l(TypeSystemContextContextualKt.m93063p(typeSystemContext, TypeSystemContextContextualKt.m93059l(typeSystemContext, typeConstructorMarkerM93045a0, i)), TypeSystemContextContextualKt.m93062o(typeSystemContext, typeArgumentMarkerM93057j));
                if (typeVarianceM92521l == null) {
                    return typeCheckerState2.m92726n();
                }
                if (typeVarianceM92521l != typeVariance || (!m92514A(typeSystemContext, kotlinTypeMarkerM93060m2, kotlinTypeMarkerM93060m, typeConstructorMarkerM93045a0) && !m92514A(typeSystemContext, kotlinTypeMarkerM93060m, kotlinTypeMarkerM93060m2, typeConstructorMarkerM93045a0))) {
                    if (typeCheckerState2.f66263h > 100) {
                        nnq.m160357a("Arguments depth is too high. Some related argument: ", kotlinTypeMarkerM93060m2);
                        return false;
                    }
                    typeCheckerState2.f66263h++;
                    int i2 = WhenMappings.f66193a[typeVarianceM92521l.ordinal()];
                    if (i2 == 1) {
                        zM92522m = INSTANCE.m92522m(typeCheckerState2, kotlinTypeMarkerM93060m2, kotlinTypeMarkerM93060m);
                    } else if (i2 == 2) {
                        typeCheckerState2 = typeCheckerState;
                        zM92522m = m92511w(INSTANCE, typeCheckerState2, kotlinTypeMarkerM93060m2, kotlinTypeMarkerM93060m, false, 8, null);
                    } else {
                        if (i2 != 3) {
                            l9r.m149037a();
                            return false;
                        }
                        zM92522m = m92511w(INSTANCE, typeCheckerState2, kotlinTypeMarkerM93060m, kotlinTypeMarkerM93060m2, false, 8, null);
                        typeCheckerState2 = typeCheckerState;
                    }
                    typeCheckerState2.f66263h--;
                    if (!zM92522m) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: u */
    public final boolean m92530u(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        typeCheckerState.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return m92511w(this, typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, false, 8, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: v */
    public final boolean m92531v(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        typeCheckerState.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        if (!typeCheckerState.mo91879f(kotlinTypeMarker, kotlinTypeMarker2)) {
            return false;
        }
        return INSTANCE.m92520k(typeCheckerState, typeCheckerState.m92722j(), kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX INFO: renamed from: x */
    public final boolean m92532x(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        Collection<RigidTypeMarker> arrayList;
        RigidTypeMarker rigidTypeMarkerM93052e;
        TypeConstructorMarker typeConstructorMarker;
        boolean z;
        KotlinTypeMarker kotlinTypeMarkerM93060m;
        if (f66192a) {
            if (!TypeSystemContextContextualKt.m93028K(typeSystemContext, rigidTypeMarker) && !TypeSystemContextContextualKt.m93023F(typeSystemContext, TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker))) {
                typeCheckerState.m92724l(rigidTypeMarker);
            }
            if (!TypeSystemContextContextualKt.m93028K(typeSystemContext, rigidTypeMarker2)) {
                typeCheckerState.m92724l(rigidTypeMarker2);
            }
        }
        boolean z2 = false;
        if (!AbstractNullabilityChecker.INSTANCE.m92497d(typeCheckerState, rigidTypeMarker, rigidTypeMarker2)) {
            return false;
        }
        Boolean boolM92516c = m92516c(typeCheckerState, typeSystemContext, rigidTypeMarker, rigidTypeMarker2);
        if (boolM92516c != null) {
            boolean zBooleanValue = boolM92516c.booleanValue();
            TypeCheckerState.m92716d(typeCheckerState, rigidTypeMarker, rigidTypeMarker2, false, 4, null);
            return zBooleanValue;
        }
        TypeConstructorMarker typeConstructorMarkerM93045a0 = TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker2);
        boolean z3 = true;
        if ((typeSystemContext.mo90234S0(TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker), typeConstructorMarkerM93045a0) && TypeSystemContextContextualKt.m93037T(typeSystemContext, typeConstructorMarkerM93045a0) == 0) || TypeSystemContextContextualKt.m93065r(typeSystemContext, TypeSystemContextContextualKt.m93045a0(typeSystemContext, rigidTypeMarker2))) {
            return true;
        }
        List<RigidTypeMarker> listM92523n = m92523n(typeCheckerState, rigidTypeMarker, typeConstructorMarkerM93045a0);
        int i = 10;
        if (listM92523n.size() > 1) {
            TypeSystemContext typeSystemContextM92722j = typeCheckerState.m92722j();
            TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext = typeSystemContextM92722j instanceof TypeSystemInferenceExtensionContext ? (TypeSystemInferenceExtensionContext) typeSystemContextM92722j : null;
            if (typeSystemInferenceExtensionContext == null || !typeSystemInferenceExtensionContext.mo90287w()) {
                List<RigidTypeMarker> list = listM92523n;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (RigidTypeMarker rigidTypeMarker3 : list) {
                    rigidTypeMarkerM93052e = TypeSystemContextContextualKt.m93052e(typeSystemContext, typeCheckerState.m92728p(rigidTypeMarker3));
                    if (rigidTypeMarkerM93052e == null) {
                        rigidTypeMarker3 = rigidTypeMarkerM93052e;
                    }
                    arrayList.add(rigidTypeMarker3);
                }
            } else {
                arrayList = new LinkedHashSet();
                for (RigidTypeMarker rigidTypeMarker4 : listM92523n) {
                    RigidTypeMarker rigidTypeMarkerM93052e2 = TypeSystemContextContextualKt.m93052e(typeSystemContext, typeCheckerState.m92728p(rigidTypeMarker4));
                    if (rigidTypeMarkerM93052e2 != null) {
                        rigidTypeMarker4 = rigidTypeMarkerM93052e2;
                    }
                    arrayList.add(rigidTypeMarker4);
                }
            }
        } else {
            List<RigidTypeMarker> list2 = listM92523n;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            while (r7.hasNext()) {
                rigidTypeMarkerM93052e = TypeSystemContextContextualKt.m93052e(typeSystemContext, typeCheckerState.m92728p(rigidTypeMarker3));
                if (rigidTypeMarkerM93052e == null) {
                    rigidTypeMarker3 = rigidTypeMarkerM93052e;
                }
                arrayList.add(rigidTypeMarker3);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return m92526q(typeCheckerState, typeSystemContext, rigidTypeMarker);
        }
        if (size == 1) {
            return m92529t(typeCheckerState, typeSystemContext, TypeSystemContextContextualKt.m93046b(typeSystemContext, (RigidTypeMarker) CollectionsKt.first(arrayList)), rigidTypeMarker2);
        }
        ArgumentList argumentList = new ArgumentList(TypeSystemContextContextualKt.m93037T(typeSystemContext, typeConstructorMarkerM93045a0));
        int iM93037T = TypeSystemContextContextualKt.m93037T(typeSystemContext, typeConstructorMarkerM93045a0);
        int i2 = 0;
        boolean z4 = false;
        while (i2 < iM93037T) {
            z4 = (z4 || TypeSystemContextContextualKt.m93063p(typeSystemContext, TypeSystemContextContextualKt.m93059l(typeSystemContext, typeConstructorMarkerM93045a0, i2)) != TypeVariance.OUT) ? z3 : z2;
            if (z4) {
                typeConstructorMarker = typeConstructorMarkerM93045a0;
                z = z3;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, i));
                for (RigidTypeMarker rigidTypeMarker5 : arrayList) {
                    boolean z5 = z3;
                    TypeArgumentMarker typeArgumentMarkerM93058k = TypeSystemContextContextualKt.m93058k(typeSystemContext, rigidTypeMarker5, i2);
                    if (typeArgumentMarkerM93058k != null) {
                        TypeConstructorMarker typeConstructorMarker2 = typeConstructorMarkerM93045a0;
                        if (TypeSystemContextContextualKt.m93062o(typeSystemContext, typeArgumentMarkerM93058k) != TypeVariance.INV) {
                            typeArgumentMarkerM93058k = null;
                        }
                        if (typeArgumentMarkerM93058k != null && (kotlinTypeMarkerM93060m = TypeSystemContextContextualKt.m93060m(typeSystemContext, typeArgumentMarkerM93058k)) != null) {
                            arrayList2.add(kotlinTypeMarkerM93060m);
                            z3 = z5;
                            typeConstructorMarkerM93045a0 = typeConstructorMarker2;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + rigidTypeMarker5 + ", subType: " + rigidTypeMarker + ", superType: " + rigidTypeMarker2).toString());
                }
                typeConstructorMarker = typeConstructorMarkerM93045a0;
                z = z3;
                argumentList.add(TypeSystemContextContextualKt.m93053f(typeSystemContext, typeSystemContext.mo90281t(arrayList2)));
            }
            i2++;
            z3 = z;
            typeConstructorMarkerM93045a0 = typeConstructorMarker;
            z2 = false;
            i = 10;
        }
        return (z4 || !m92529t(typeCheckerState, typeSystemContext, argumentList, rigidTypeMarker2)) ? typeCheckerState.m92730r(new C19153p8(arrayList, typeCheckerState, typeSystemContext, rigidTypeMarker2)) : z3;
    }
}
