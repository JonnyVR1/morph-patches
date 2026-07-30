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
import p153l.C18115k8;
import p153l.C18360l8;
import p153l.mpq;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class AbstractTypeChecker {

    @NotNull
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();

    /* JADX INFO: renamed from: a */
    @JvmField
    public static boolean f66866a;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66867a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f66868b;

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
            f66867a = iArr;
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
            f66868b = iArr2;
        }
    }

    private AbstractTypeChecker() {
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m93398d(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        KotlinTypeMarker kotlinTypeMarkerM93951m;
        RigidTypeMarker rigidTypeMarkerM93938b0;
        return (rigidTypeMarker instanceof CapturedTypeMarker) && (kotlinTypeMarkerM93951m = TypeSystemContextContextualKt.m93951m(typeSystemContext, TypeSystemContextContextualKt.m93930V(typeSystemContext, TypeSystemContextContextualKt.m93933Y(typeSystemContext, (CapturedTypeMarker) rigidTypeMarker)))) != null && (rigidTypeMarkerM93938b0 = TypeSystemContextContextualKt.m93938b0(typeSystemContext, kotlinTypeMarkerM93951m)) != null && TypeSystemContextContextualKt.m93912D(typeSystemContext, rigidTypeMarkerM93938b0);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m93399e(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        TypeConstructorMarker typeConstructorMarkerM93936a0 = TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker);
        if (!(typeConstructorMarkerM93936a0 instanceof IntersectionTypeConstructorMarker)) {
            return false;
        }
        Collection<KotlinTypeMarker> collectionM93932X = TypeSystemContextContextualKt.m93932X(typeSystemContext, typeConstructorMarkerM93936a0);
        if ((collectionM93932X instanceof Collection) && collectionM93932X.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionM93932X.iterator();
        while (it.hasNext()) {
            RigidTypeMarker rigidTypeMarkerM93943e = TypeSystemContextContextualKt.m93943e(typeSystemContext, (KotlinTypeMarker) it.next());
            if (rigidTypeMarkerM93943e != null && TypeSystemContextContextualKt.m93912D(typeSystemContext, rigidTypeMarkerM93943e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m93400f(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        return TypeSystemContextContextualKt.m93912D(typeSystemContext, rigidTypeMarker) || m93398d(typeSystemContext, rigidTypeMarker);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m93401g(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2, boolean z) {
        TypeCheckerState typeCheckerState2;
        RigidTypeMarker rigidTypeMarker3;
        Collection<KotlinTypeMarker> collectionM93929U = TypeSystemContextContextualKt.m93929U(typeSystemContext, rigidTypeMarker);
        if ((collectionM93929U instanceof Collection) && collectionM93929U.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : collectionM93929U) {
            if (Intrinsics.m88377d(TypeSystemContextContextualKt.m93934Z(typeSystemContext, kotlinTypeMarker), TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker2))) {
                return true;
            }
            if (z) {
                typeCheckerState2 = typeCheckerState;
                rigidTypeMarker3 = rigidTypeMarker2;
                if (m93402w(INSTANCE, typeCheckerState2, rigidTypeMarker3, kotlinTypeMarker, false, 8, null)) {
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
    public static /* synthetic */ boolean m93402w(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker.m93422v(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m93403y(Collection collection, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeCheckerState.ForkPointContext forkPointContext) {
        forkPointContext.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            forkPointContext.mo93622a(new C18360l8(typeCheckerState, typeSystemContext, (RigidTypeMarker) it.next(), rigidTypeMarker));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m93404z(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        return INSTANCE.m93420t(typeCheckerState, typeSystemContext, TypeSystemContextContextualKt.m93937b(typeSystemContext, rigidTypeMarker), rigidTypeMarker2);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m93405A(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterMarker typeParameterMarkerM93952n;
        RigidTypeMarker rigidTypeMarkerM93943e = TypeSystemContextContextualKt.m93943e(typeSystemContext, kotlinTypeMarker);
        if (rigidTypeMarkerM93943e instanceof CapturedTypeMarker) {
            CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) rigidTypeMarkerM93943e;
            if (TypeSystemContextContextualKt.m93918J(typeSystemContext, capturedTypeMarker) || !TypeSystemContextContextualKt.m93920L(typeSystemContext, TypeSystemContextContextualKt.m93930V(typeSystemContext, TypeSystemContextContextualKt.m93933Y(typeSystemContext, capturedTypeMarker))) || TypeSystemContextContextualKt.m93945g(typeSystemContext, capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
                return false;
            }
            TypeConstructorMarker typeConstructorMarkerM93934Z = TypeSystemContextContextualKt.m93934Z(typeSystemContext, kotlinTypeMarker2);
            TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructorMarkerM93934Z instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructorMarkerM93934Z : null;
            if (typeVariableTypeConstructorMarker != null && (typeParameterMarkerM93952n = TypeSystemContextContextualKt.m93952n(typeSystemContext, typeVariableTypeConstructorMarker)) != null && TypeSystemContextContextualKt.m93955q(typeSystemContext, typeParameterMarkerM93952n, typeConstructorMarker)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final List<RigidTypeMarker> m93406B(TypeSystemContext typeSystemContext, List<? extends RigidTypeMarker> list) {
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                TypeArgumentListMarker typeArgumentListMarkerM93937b = TypeSystemContextContextualKt.m93937b(typeSystemContext, (RigidTypeMarker) obj);
                int iMo91167q0 = typeSystemContext.mo91167q0(typeArgumentListMarkerM93937b);
                int i = 0;
                while (true) {
                    if (i >= iMo91167q0) {
                        arrayList.add(obj);
                        break;
                    }
                    KotlinTypeMarker kotlinTypeMarkerM93951m = TypeSystemContextContextualKt.m93951m(typeSystemContext, typeSystemContext.mo91162o(typeArgumentListMarkerM93937b, i));
                    if ((kotlinTypeMarkerM93951m != null ? TypeSystemContextContextualKt.m93941d(typeSystemContext, kotlinTypeMarkerM93951m) : null) != null) {
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
    public final Boolean m93407c(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (!TypeSystemContextContextualKt.m93912D(typeSystemContext, rigidTypeMarker) && !TypeSystemContextContextualKt.m93912D(typeSystemContext, rigidTypeMarker2)) {
            return null;
        }
        if (m93400f(typeSystemContext, rigidTypeMarker) && m93400f(typeSystemContext, rigidTypeMarker2)) {
            return Boolean.TRUE;
        }
        if (TypeSystemContextContextualKt.m93912D(typeSystemContext, rigidTypeMarker)) {
            if (m93401g(typeSystemContext, typeCheckerState, rigidTypeMarker, rigidTypeMarker2, false)) {
                return Boolean.TRUE;
            }
        } else if (TypeSystemContextContextualKt.m93912D(typeSystemContext, rigidTypeMarker2) && (m93399e(typeSystemContext, rigidTypeMarker) || m93401g(typeSystemContext, typeCheckerState, rigidTypeMarker2, rigidTypeMarker, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x011a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX INFO: renamed from: h */
    public final Boolean m93408h(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeParameterMarker typeParameterMarkerM93416p;
        boolean z = false;
        if (TypeSystemContextContextualKt.m93909A(typeSystemContext, rigidTypeMarker) || TypeSystemContextContextualKt.m93909A(typeSystemContext, rigidTypeMarker2)) {
            if (typeCheckerState.m93617n()) {
                return Boolean.TRUE;
            }
            return (!TypeSystemContextContextualKt.m93915G(typeSystemContext, rigidTypeMarker) || TypeSystemContextContextualKt.m93915G(typeSystemContext, rigidTypeMarker2)) ? Boolean.valueOf(AbstractStrictEqualityTypeChecker.INSTANCE.m93391b(typeSystemContext, TypeSystemContextContextualKt.m93942d0(typeSystemContext, rigidTypeMarker, false), TypeSystemContextContextualKt.m93942d0(typeSystemContext, rigidTypeMarker2, false))) : Boolean.FALSE;
        }
        if (TypeSystemContextContextualKt.m93922N(typeSystemContext, rigidTypeMarker) && TypeSystemContextContextualKt.m93922N(typeSystemContext, rigidTypeMarker2)) {
            return Boolean.valueOf(m93419s(typeSystemContext, rigidTypeMarker, rigidTypeMarker2) || typeCheckerState.m93618o());
        }
        if (TypeSystemContextContextualKt.m93921M(typeSystemContext, rigidTypeMarker) || TypeSystemContextContextualKt.m93921M(typeSystemContext, rigidTypeMarker2)) {
            return Boolean.valueOf(typeCheckerState.m93618o());
        }
        CapturedTypeMarker capturedTypeMarkerM93939c = TypeSystemContextContextualKt.m93939c(typeSystemContext, rigidTypeMarker2);
        KotlinTypeMarker kotlinTypeMarkerM93925Q = capturedTypeMarkerM93939c != null ? TypeSystemContextContextualKt.m93925Q(typeSystemContext, capturedTypeMarkerM93939c) : null;
        if (capturedTypeMarkerM93939c != null && kotlinTypeMarkerM93925Q != null) {
            if (TypeSystemContextContextualKt.m93915G(typeSystemContext, rigidTypeMarker2)) {
                kotlinTypeMarkerM93925Q = TypeSystemContextContextualKt.m93940c0(typeSystemContext, kotlinTypeMarkerM93925Q, true);
            } else if (TypeSystemContextContextualKt.m93962x(typeSystemContext, rigidTypeMarker2)) {
                kotlinTypeMarkerM93925Q = TypeSystemContextContextualKt.m93926R(typeSystemContext, kotlinTypeMarkerM93925Q);
            }
            int i = WhenMappings.f66868b[typeCheckerState.m93610g(rigidTypeMarker, capturedTypeMarkerM93939c).ordinal()];
            if (i == 1) {
                return Boolean.valueOf(m93402w(this, typeCheckerState, rigidTypeMarker, kotlinTypeMarkerM93925Q, false, 8, null));
            }
            if (i != 2) {
                if (i != 3) {
                    nbr.m162172a();
                    return null;
                }
            } else if (m93402w(this, typeCheckerState, rigidTypeMarker, kotlinTypeMarkerM93925Q, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        TypeConstructorMarker typeConstructorMarkerM93936a0 = TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker2);
        if (TypeSystemContextContextualKt.m93914F(typeSystemContext, typeConstructorMarkerM93936a0)) {
            TypeSystemContextContextualKt.m93915G(typeSystemContext, rigidTypeMarker2);
            Collection<KotlinTypeMarker> collectionM93932X = TypeSystemContextContextualKt.m93932X(typeSystemContext, typeConstructorMarkerM93936a0);
            if ((collectionM93932X instanceof Collection) && collectionM93932X.isEmpty()) {
                z = true;
            } else {
                Iterator<T> it = collectionM93932X.iterator();
                while (it.hasNext()) {
                    if (!m93402w(INSTANCE, typeCheckerState, rigidTypeMarker, (KotlinTypeMarker) it.next(), false, 8, null)) {
                    }
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
        TypeConstructorMarker typeConstructorMarkerM93936a1 = TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker);
        if (rigidTypeMarker instanceof CapturedTypeMarker) {
            typeParameterMarkerM93416p = m93416p(typeSystemContext, rigidTypeMarker2, rigidTypeMarker);
            if (typeParameterMarkerM93416p != null && TypeSystemContextContextualKt.m93955q(typeSystemContext, typeParameterMarkerM93416p, TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker2))) {
                return Boolean.TRUE;
            }
        } else if (TypeSystemContextContextualKt.m93914F(typeSystemContext, typeConstructorMarkerM93936a1)) {
            Collection<KotlinTypeMarker> collectionM93932X2 = TypeSystemContextContextualKt.m93932X(typeSystemContext, typeConstructorMarkerM93936a1);
            if ((collectionM93932X2 instanceof Collection) && collectionM93932X2.isEmpty()) {
                typeParameterMarkerM93416p = m93416p(typeSystemContext, rigidTypeMarker2, rigidTypeMarker);
                if (typeParameterMarkerM93416p != null) {
                    return Boolean.TRUE;
                }
            } else {
                Iterator<T> it2 = collectionM93932X2.iterator();
                while (it2.hasNext()) {
                    if (!(((KotlinTypeMarker) it2.next()) instanceof CapturedTypeMarker)) {
                    }
                }
                typeParameterMarkerM93416p = m93416p(typeSystemContext, rigidTypeMarker2, rigidTypeMarker);
                if (typeParameterMarkerM93416p != null) {
                    return Boolean.TRUE;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final List<RigidTypeMarker> m93409i(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicyMo91120Q;
        List<SimpleTypeMarker> listM93946h = TypeSystemContextContextualKt.m93946h(typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        if (listM93946h != null) {
            return listM93946h;
        }
        if (!TypeSystemContextContextualKt.m93959u(typeSystemContext, typeConstructorMarker) && TypeSystemContextContextualKt.m93958t(typeSystemContext, rigidTypeMarker)) {
            return CollectionsKt.emptyList();
        }
        if (TypeSystemContextContextualKt.m93960v(typeSystemContext, typeConstructorMarker)) {
            if (!typeSystemContext.mo91125S0(TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker), typeConstructorMarker)) {
                return CollectionsKt.emptyList();
            }
            RigidTypeMarker rigidTypeMarkerMo91151i0 = typeSystemContext.mo91151i0(rigidTypeMarker, CaptureStatus.FOR_SUBTYPING);
            if (rigidTypeMarkerMo91151i0 != null) {
                rigidTypeMarker = rigidTypeMarkerMo91151i0;
            }
            return CollectionsKt.listOf(rigidTypeMarker);
        }
        SmartList smartList = new SmartList();
        typeCheckerState.m93614k();
        ArrayDeque<RigidTypeMarker> arrayDequeM93611h = typeCheckerState.m93611h();
        arrayDequeM93611h.getClass();
        Set<RigidTypeMarker> setM93612i = typeCheckerState.m93612i();
        setM93612i.getClass();
        arrayDequeM93611h.push(rigidTypeMarker);
        while (!arrayDequeM93611h.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeM93611h.pop();
            rigidTypeMarkerPop.getClass();
            if (setM93612i.add(rigidTypeMarkerPop)) {
                RigidTypeMarker rigidTypeMarkerMo91151i1 = typeSystemContext.mo91151i0(rigidTypeMarkerPop, CaptureStatus.FOR_SUBTYPING);
                if (rigidTypeMarkerMo91151i1 == null) {
                    rigidTypeMarkerMo91151i1 = rigidTypeMarkerPop;
                }
                if (typeSystemContext.mo91125S0(TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarkerMo91151i1), typeConstructorMarker)) {
                    smartList.add(rigidTypeMarkerMo91151i1);
                    supertypesPolicyMo91120Q = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicyMo91120Q = TypeSystemContextContextualKt.m93935a(typeSystemContext, rigidTypeMarkerMo91151i1) == 0 ? TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE : typeCheckerState.m93613j().mo91120Q(rigidTypeMarkerMo91151i1);
                }
                if (Intrinsics.m88377d(supertypesPolicyMo91120Q, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicyMo91120Q = null;
                }
                if (supertypesPolicyMo91120Q != null) {
                    TypeSystemContext typeSystemContextM93613j = typeCheckerState.m93613j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM93613j.mo91099F0(typeSystemContextM93613j.mo91136b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeM93611h.add(supertypesPolicyMo91120Q.mo93624a(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.m93609e();
        return smartList;
    }

    /* JADX INFO: renamed from: j */
    public final List<RigidTypeMarker> m93410j(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return m93406B(typeSystemContext, m93409i(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m93411k(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        KotlinTypeMarker kotlinTypeMarkerM93619p = typeCheckerState.m93619p(typeCheckerState.m93620q(kotlinTypeMarker));
        KotlinTypeMarker kotlinTypeMarkerM93619p2 = typeCheckerState.m93619p(typeCheckerState.m93620q(kotlinTypeMarker2));
        if (typeCheckerState.m93616m() && TypeSystemContextContextualKt.m93910B(typeSystemContext, kotlinTypeMarkerM93619p) && TypeSystemContextContextualKt.m93961w(typeSystemContext, kotlinTypeMarkerM93619p2)) {
            FlexibleTypeMarker flexibleTypeMarkerM93941d = TypeSystemContextContextualKt.m93941d(typeSystemContext, kotlinTypeMarkerM93619p);
            flexibleTypeMarkerM93941d.getClass();
            RigidTypeMarker rigidTypeMarkerM93923O = TypeSystemContextContextualKt.m93923O(typeSystemContext, flexibleTypeMarkerM93941d);
            RigidTypeMarker rigidTypeMarkerM93943e = TypeSystemContextContextualKt.m93943e(typeSystemContext, kotlinTypeMarkerM93619p2);
            rigidTypeMarkerM93943e.getClass();
            return m93411k(typeCheckerState, typeSystemContext, rigidTypeMarkerM93923O, TypeSystemContextContextualKt.m93927S(typeSystemContext, rigidTypeMarkerM93943e), z);
        }
        Boolean boolM93408h = m93408h(typeCheckerState, typeSystemContext, TypeSystemContextContextualKt.m93924P(typeSystemContext, kotlinTypeMarkerM93619p), TypeSystemContextContextualKt.m93938b0(typeSystemContext, kotlinTypeMarkerM93619p2));
        if (boolM93408h == null) {
            Boolean boolM93608c = typeCheckerState.m93608c(kotlinTypeMarkerM93619p, kotlinTypeMarkerM93619p2, z);
            return boolM93608c != null ? boolM93608c.booleanValue() : m93423x(typeCheckerState, typeSystemContext, TypeSystemContextContextualKt.m93924P(typeSystemContext, kotlinTypeMarkerM93619p), TypeSystemContextContextualKt.m93938b0(typeSystemContext, kotlinTypeMarkerM93619p2));
        }
        boolean zBooleanValue = boolM93408h.booleanValue();
        typeCheckerState.m93608c(kotlinTypeMarkerM93619p, kotlinTypeMarkerM93619p2, z);
        return zBooleanValue;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final TypeVariance m93412l(@NotNull TypeVariance typeVariance, @NotNull TypeVariance typeVariance2) {
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
    public final boolean m93413m(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        typeCheckerState.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        TypeSystemContext typeSystemContextM93613j = typeCheckerState.m93613j();
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        if (abstractTypeChecker.m93418r(typeSystemContextM93613j, kotlinTypeMarker) && abstractTypeChecker.m93418r(typeSystemContextM93613j, kotlinTypeMarker2)) {
            KotlinTypeMarker kotlinTypeMarkerM93619p = typeCheckerState.m93619p(typeCheckerState.m93620q(kotlinTypeMarker));
            KotlinTypeMarker kotlinTypeMarkerM93619p2 = typeCheckerState.m93619p(typeCheckerState.m93620q(kotlinTypeMarker2));
            RigidTypeMarker rigidTypeMarkerMo91135a0 = typeSystemContextM93613j.mo91135a0(kotlinTypeMarkerM93619p);
            if (!typeSystemContextM93613j.mo91125S0(typeSystemContextM93613j.mo91116O(kotlinTypeMarkerM93619p), typeSystemContextM93613j.mo91116O(kotlinTypeMarkerM93619p2))) {
                return false;
            }
            if (typeSystemContextM93613j.mo91154k(rigidTypeMarkerMo91135a0) == 0) {
                return typeSystemContextM93613j.mo91101G0(kotlinTypeMarkerM93619p) || typeSystemContextM93613j.mo91101G0(kotlinTypeMarkerM93619p2) || typeSystemContextM93613j.mo91119P0(rigidTypeMarkerMo91135a0) == typeSystemContextM93613j.mo91119P0(typeSystemContextM93613j.mo91135a0(kotlinTypeMarkerM93619p2));
            }
        }
        return m93402w(abstractTypeChecker, typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, false, 8, null) && m93402w(abstractTypeChecker, typeCheckerState, kotlinTypeMarker2, kotlinTypeMarker, false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<RigidTypeMarker> m93414n(@NotNull TypeCheckerState typeCheckerState, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        typeCheckerState.getClass();
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        return INSTANCE.m93415o(typeCheckerState, typeCheckerState.m93613j(), rigidTypeMarker, typeConstructorMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<RigidTypeMarker> m93415o(@NotNull TypeCheckerState typeCheckerState, @NotNull TypeSystemContext typeSystemContext, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        typeCheckerState.getClass();
        typeSystemContext.getClass();
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        if (TypeSystemContextContextualKt.m93958t(typeSystemContext, rigidTypeMarker)) {
            return m93410j(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        }
        if (!TypeSystemContextContextualKt.m93959u(typeSystemContext, typeConstructorMarker) && !TypeSystemContextContextualKt.m93913E(typeSystemContext, typeConstructorMarker)) {
            return m93409i(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        }
        SmartList<RigidTypeMarker> smartList = new SmartList();
        typeCheckerState.m93614k();
        ArrayDeque<RigidTypeMarker> arrayDequeM93611h = typeCheckerState.m93611h();
        arrayDequeM93611h.getClass();
        Set<RigidTypeMarker> setM93612i = typeCheckerState.m93612i();
        setM93612i.getClass();
        arrayDequeM93611h.push(rigidTypeMarker);
        while (!arrayDequeM93611h.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeM93611h.pop();
            rigidTypeMarkerPop.getClass();
            if (setM93612i.add(rigidTypeMarkerPop)) {
                if (TypeSystemContextContextualKt.m93958t(typeSystemContext, rigidTypeMarkerPop)) {
                    smartList.add(rigidTypeMarkerPop);
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (Intrinsics.m88377d(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    TypeSystemContext typeSystemContextM93613j = typeCheckerState.m93613j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM93613j.mo91099F0(typeSystemContextM93613j.mo91136b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeM93611h.add(supertypesPolicy.mo93624a(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.m93609e();
        ArrayList arrayList = new ArrayList();
        for (RigidTypeMarker rigidTypeMarker2 : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            rigidTypeMarker2.getClass();
            CollectionsKt.addAll(arrayList, abstractTypeChecker.m93410j(typeCheckerState, typeSystemContext, rigidTypeMarker2, typeConstructorMarker));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final TypeParameterMarker m93416p(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        KotlinTypeMarker kotlinTypeMarkerM93951m;
        int iM93935a = TypeSystemContextContextualKt.m93935a(typeSystemContext, kotlinTypeMarker);
        int i = 0;
        while (true) {
            if (i >= iM93935a) {
                return null;
            }
            TypeArgumentMarker typeArgumentMarkerM93948j = TypeSystemContextContextualKt.m93948j(typeSystemContext, kotlinTypeMarker, i);
            TypeArgumentMarker typeArgumentMarker = TypeSystemContextContextualKt.m93920L(typeSystemContext, typeArgumentMarkerM93948j) ? null : typeArgumentMarkerM93948j;
            if (typeArgumentMarker != null && (kotlinTypeMarkerM93951m = TypeSystemContextContextualKt.m93951m(typeSystemContext, typeArgumentMarker)) != null) {
                boolean z = TypeSystemContextContextualKt.m93957s(typeSystemContext, TypeSystemContextContextualKt.m93924P(typeSystemContext, kotlinTypeMarkerM93951m)) && TypeSystemContextContextualKt.m93957s(typeSystemContext, TypeSystemContextContextualKt.m93924P(typeSystemContext, kotlinTypeMarker2));
                if (Intrinsics.m88377d(kotlinTypeMarkerM93951m, kotlinTypeMarker2) || (z && Intrinsics.m88377d(TypeSystemContextContextualKt.m93934Z(typeSystemContext, kotlinTypeMarkerM93951m), TypeSystemContextContextualKt.m93934Z(typeSystemContext, kotlinTypeMarker2)))) {
                    return TypeSystemContextContextualKt.m93950l(typeSystemContext, TypeSystemContextContextualKt.m93934Z(typeSystemContext, kotlinTypeMarker), i);
                }
                TypeParameterMarker typeParameterMarkerM93416p = m93416p(typeSystemContext, kotlinTypeMarkerM93951m, kotlinTypeMarker2);
                if (typeParameterMarkerM93416p != null) {
                    return typeParameterMarkerM93416p;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m93417q(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        TypeConstructorMarker typeConstructorMarkerM93936a0 = TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker);
        if (TypeSystemContextContextualKt.m93959u(typeSystemContext, typeConstructorMarkerM93936a0)) {
            return TypeSystemContextContextualKt.m93917I(typeSystemContext, typeConstructorMarkerM93936a0);
        }
        if (TypeSystemContextContextualKt.m93917I(typeSystemContext, TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker))) {
            return true;
        }
        typeCheckerState.m93614k();
        ArrayDeque<RigidTypeMarker> arrayDequeM93611h = typeCheckerState.m93611h();
        arrayDequeM93611h.getClass();
        Set<RigidTypeMarker> setM93612i = typeCheckerState.m93612i();
        setM93612i.getClass();
        arrayDequeM93611h.push(rigidTypeMarker);
        while (!arrayDequeM93611h.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeM93611h.pop();
            rigidTypeMarkerPop.getClass();
            if (setM93612i.add(rigidTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy = TypeSystemContextContextualKt.m93958t(typeSystemContext, rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (Intrinsics.m88377d(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContextM93613j = typeCheckerState.m93613j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM93613j.mo91099F0(typeSystemContextM93613j.mo91136b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo93624a = supertypesPolicy.mo93624a(typeCheckerState, it.next());
                        if (TypeSystemContextContextualKt.m93917I(typeSystemContext, TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarkerMo93624a))) {
                            typeCheckerState.m93609e();
                            return true;
                        }
                        arrayDequeM93611h.add(rigidTypeMarkerMo93624a);
                    }
                }
            }
        }
        typeCheckerState.m93609e();
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m93418r(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return (!TypeSystemContextContextualKt.m93963y(typeSystemContext, TypeSystemContextContextualKt.m93934Z(typeSystemContext, kotlinTypeMarker)) || TypeSystemContextContextualKt.m93964z(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.m93961w(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.m93916H(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.m93911C(typeSystemContext, kotlinTypeMarker)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m93419s(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker) != TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker2)) {
            return false;
        }
        if (TypeSystemContextContextualKt.m93962x(typeSystemContext, rigidTypeMarker) || !TypeSystemContextContextualKt.m93962x(typeSystemContext, rigidTypeMarker2)) {
            return !TypeSystemContextContextualKt.m93915G(typeSystemContext, rigidTypeMarker) || TypeSystemContextContextualKt.m93915G(typeSystemContext, rigidTypeMarker2);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m93420t(@NotNull TypeCheckerState typeCheckerState, @NotNull TypeSystemContext typeSystemContext, @NotNull TypeArgumentListMarker typeArgumentListMarker, @NotNull RigidTypeMarker rigidTypeMarker) {
        boolean zM93413m;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        typeCheckerState2.getClass();
        typeSystemContext.getClass();
        typeArgumentListMarker.getClass();
        rigidTypeMarker.getClass();
        TypeConstructorMarker typeConstructorMarkerM93936a0 = TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker);
        int iM93931W = TypeSystemContextContextualKt.m93931W(typeSystemContext, typeArgumentListMarker);
        int iM93928T = TypeSystemContextContextualKt.m93928T(typeSystemContext, typeConstructorMarkerM93936a0);
        if (iM93931W != iM93928T || iM93931W != TypeSystemContextContextualKt.m93935a(typeSystemContext, rigidTypeMarker)) {
            return false;
        }
        for (int i = 0; i < iM93928T; i++) {
            TypeArgumentMarker typeArgumentMarkerM93948j = TypeSystemContextContextualKt.m93948j(typeSystemContext, rigidTypeMarker, i);
            KotlinTypeMarker kotlinTypeMarkerM93951m = TypeSystemContextContextualKt.m93951m(typeSystemContext, typeArgumentMarkerM93948j);
            if (kotlinTypeMarkerM93951m != null) {
                TypeArgumentMarker typeArgumentMarkerM93947i = TypeSystemContextContextualKt.m93947i(typeSystemContext, typeArgumentListMarker, i);
                TypeSystemContextContextualKt.m93953o(typeSystemContext, typeArgumentMarkerM93947i);
                TypeVariance typeVariance = TypeVariance.INV;
                KotlinTypeMarker kotlinTypeMarkerM93951m2 = TypeSystemContextContextualKt.m93951m(typeSystemContext, typeArgumentMarkerM93947i);
                kotlinTypeMarkerM93951m2.getClass();
                TypeVariance typeVarianceM93412l = m93412l(TypeSystemContextContextualKt.m93954p(typeSystemContext, TypeSystemContextContextualKt.m93950l(typeSystemContext, typeConstructorMarkerM93936a0, i)), TypeSystemContextContextualKt.m93953o(typeSystemContext, typeArgumentMarkerM93948j));
                if (typeVarianceM93412l == null) {
                    return typeCheckerState2.m93617n();
                }
                if (typeVarianceM93412l != typeVariance || (!m93405A(typeSystemContext, kotlinTypeMarkerM93951m2, kotlinTypeMarkerM93951m, typeConstructorMarkerM93936a0) && !m93405A(typeSystemContext, kotlinTypeMarkerM93951m, kotlinTypeMarkerM93951m2, typeConstructorMarkerM93936a0))) {
                    if (typeCheckerState2.f66937h > 100) {
                        mpq.m159379a("Arguments depth is too high. Some related argument: ", kotlinTypeMarkerM93951m2);
                        return false;
                    }
                    typeCheckerState2.f66937h++;
                    int i2 = WhenMappings.f66867a[typeVarianceM93412l.ordinal()];
                    if (i2 == 1) {
                        zM93413m = INSTANCE.m93413m(typeCheckerState2, kotlinTypeMarkerM93951m2, kotlinTypeMarkerM93951m);
                    } else if (i2 == 2) {
                        typeCheckerState2 = typeCheckerState;
                        zM93413m = m93402w(INSTANCE, typeCheckerState2, kotlinTypeMarkerM93951m2, kotlinTypeMarkerM93951m, false, 8, null);
                    } else {
                        if (i2 != 3) {
                            nbr.m162172a();
                            return false;
                        }
                        zM93413m = m93402w(INSTANCE, typeCheckerState2, kotlinTypeMarkerM93951m, kotlinTypeMarkerM93951m2, false, 8, null);
                        typeCheckerState2 = typeCheckerState;
                    }
                    typeCheckerState2.f66937h--;
                    if (!zM93413m) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: u */
    public final boolean m93421u(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        typeCheckerState.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return m93402w(this, typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, false, 8, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: v */
    public final boolean m93422v(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        typeCheckerState.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        if (!typeCheckerState.mo92770f(kotlinTypeMarker, kotlinTypeMarker2)) {
            return false;
        }
        return INSTANCE.m93411k(typeCheckerState, typeCheckerState.m93613j(), kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX INFO: renamed from: x */
    public final boolean m93423x(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        Collection<RigidTypeMarker> arrayList;
        RigidTypeMarker rigidTypeMarkerM93943e;
        TypeConstructorMarker typeConstructorMarker;
        boolean z;
        KotlinTypeMarker kotlinTypeMarkerM93951m;
        if (f66866a) {
            if (!TypeSystemContextContextualKt.m93919K(typeSystemContext, rigidTypeMarker) && !TypeSystemContextContextualKt.m93914F(typeSystemContext, TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker))) {
                typeCheckerState.m93615l(rigidTypeMarker);
            }
            if (!TypeSystemContextContextualKt.m93919K(typeSystemContext, rigidTypeMarker2)) {
                typeCheckerState.m93615l(rigidTypeMarker2);
            }
        }
        boolean z2 = false;
        if (!AbstractNullabilityChecker.INSTANCE.m93388d(typeCheckerState, rigidTypeMarker, rigidTypeMarker2)) {
            return false;
        }
        Boolean boolM93407c = m93407c(typeCheckerState, typeSystemContext, rigidTypeMarker, rigidTypeMarker2);
        if (boolM93407c != null) {
            boolean zBooleanValue = boolM93407c.booleanValue();
            TypeCheckerState.m93607d(typeCheckerState, rigidTypeMarker, rigidTypeMarker2, false, 4, null);
            return zBooleanValue;
        }
        TypeConstructorMarker typeConstructorMarkerM93936a0 = TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker2);
        boolean z3 = true;
        if ((typeSystemContext.mo91125S0(TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker), typeConstructorMarkerM93936a0) && TypeSystemContextContextualKt.m93928T(typeSystemContext, typeConstructorMarkerM93936a0) == 0) || TypeSystemContextContextualKt.m93956r(typeSystemContext, TypeSystemContextContextualKt.m93936a0(typeSystemContext, rigidTypeMarker2))) {
            return true;
        }
        List<RigidTypeMarker> listM93414n = m93414n(typeCheckerState, rigidTypeMarker, typeConstructorMarkerM93936a0);
        int i = 10;
        if (listM93414n.size() > 1) {
            TypeSystemContext typeSystemContextM93613j = typeCheckerState.m93613j();
            TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext = typeSystemContextM93613j instanceof TypeSystemInferenceExtensionContext ? (TypeSystemInferenceExtensionContext) typeSystemContextM93613j : null;
            if (typeSystemInferenceExtensionContext == null || !typeSystemInferenceExtensionContext.mo91178w()) {
                List<RigidTypeMarker> list = listM93414n;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (RigidTypeMarker rigidTypeMarker3 : list) {
                    rigidTypeMarkerM93943e = TypeSystemContextContextualKt.m93943e(typeSystemContext, typeCheckerState.m93619p(rigidTypeMarker3));
                    if (rigidTypeMarkerM93943e == null) {
                        rigidTypeMarker3 = rigidTypeMarkerM93943e;
                    }
                    arrayList.add(rigidTypeMarker3);
                }
            } else {
                arrayList = new LinkedHashSet();
                for (RigidTypeMarker rigidTypeMarker4 : listM93414n) {
                    RigidTypeMarker rigidTypeMarkerM93943e2 = TypeSystemContextContextualKt.m93943e(typeSystemContext, typeCheckerState.m93619p(rigidTypeMarker4));
                    if (rigidTypeMarkerM93943e2 != null) {
                        rigidTypeMarker4 = rigidTypeMarkerM93943e2;
                    }
                    arrayList.add(rigidTypeMarker4);
                }
            }
        } else {
            List<RigidTypeMarker> list2 = listM93414n;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            while (r7.hasNext()) {
                rigidTypeMarkerM93943e = TypeSystemContextContextualKt.m93943e(typeSystemContext, typeCheckerState.m93619p(rigidTypeMarker3));
                if (rigidTypeMarkerM93943e == null) {
                    rigidTypeMarker3 = rigidTypeMarkerM93943e;
                }
                arrayList.add(rigidTypeMarker3);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return m93417q(typeCheckerState, typeSystemContext, rigidTypeMarker);
        }
        if (size == 1) {
            return m93420t(typeCheckerState, typeSystemContext, TypeSystemContextContextualKt.m93937b(typeSystemContext, (RigidTypeMarker) CollectionsKt.first(arrayList)), rigidTypeMarker2);
        }
        ArgumentList argumentList = new ArgumentList(TypeSystemContextContextualKt.m93928T(typeSystemContext, typeConstructorMarkerM93936a0));
        int iM93928T = TypeSystemContextContextualKt.m93928T(typeSystemContext, typeConstructorMarkerM93936a0);
        int i2 = 0;
        boolean z4 = false;
        while (i2 < iM93928T) {
            z4 = (z4 || TypeSystemContextContextualKt.m93954p(typeSystemContext, TypeSystemContextContextualKt.m93950l(typeSystemContext, typeConstructorMarkerM93936a0, i2)) != TypeVariance.OUT) ? z3 : z2;
            if (z4) {
                typeConstructorMarker = typeConstructorMarkerM93936a0;
                z = z3;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, i));
                for (RigidTypeMarker rigidTypeMarker5 : arrayList) {
                    boolean z5 = z3;
                    TypeArgumentMarker typeArgumentMarkerM93949k = TypeSystemContextContextualKt.m93949k(typeSystemContext, rigidTypeMarker5, i2);
                    if (typeArgumentMarkerM93949k != null) {
                        TypeConstructorMarker typeConstructorMarker2 = typeConstructorMarkerM93936a0;
                        if (TypeSystemContextContextualKt.m93953o(typeSystemContext, typeArgumentMarkerM93949k) != TypeVariance.INV) {
                            typeArgumentMarkerM93949k = null;
                        }
                        if (typeArgumentMarkerM93949k != null && (kotlinTypeMarkerM93951m = TypeSystemContextContextualKt.m93951m(typeSystemContext, typeArgumentMarkerM93949k)) != null) {
                            arrayList2.add(kotlinTypeMarkerM93951m);
                            z3 = z5;
                            typeConstructorMarkerM93936a0 = typeConstructorMarker2;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + rigidTypeMarker5 + ", subType: " + rigidTypeMarker + ", superType: " + rigidTypeMarker2).toString());
                }
                typeConstructorMarker = typeConstructorMarkerM93936a0;
                z = z3;
                argumentList.add(TypeSystemContextContextualKt.m93944f(typeSystemContext, typeSystemContext.mo91172t(arrayList2)));
            }
            i2++;
            z3 = z;
            typeConstructorMarkerM93936a0 = typeConstructorMarker;
            z2 = false;
            i = 10;
        }
        return (z4 || !m93420t(typeCheckerState, typeSystemContext, argumentList, rigidTypeMarker2)) ? typeCheckerState.m93621r(new C18115k8(arrayList, typeCheckerState, typeSystemContext, rigidTypeMarker2)) : z3;
    }
}
