package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SpecialTypesKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final AbbreviatedType m93545a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (unwrappedTypeMo93516J0 instanceof AbbreviatedType) {
            return (AbbreviatedType) unwrappedTypeMo93516J0;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final SimpleType m93546b(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        AbbreviatedType abbreviatedTypeM93545a = m93545a(kotlinType);
        if (abbreviatedTypeM93545a != null) {
            return abbreviatedTypeM93545a.m93378S0();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m93547c(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.mo93516J0() instanceof DefinitelyNotNullType;
    }

    /* JADX INFO: renamed from: d */
    public static final IntersectionTypeConstructor m93548d(IntersectionTypeConstructor intersectionTypeConstructor) {
        KotlinType kotlinType;
        Collection<KotlinType> collectionMo89569c = intersectionTypeConstructor.mo89569c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89569c, 10));
        Iterator<T> it = collectionMo89569c.iterator();
        boolean z = false;
        while (true) {
            kotlinType = null;
            if (!it.hasNext()) {
                break;
            }
            KotlinType kotlinTypeM93550f = (KotlinType) it.next();
            if (TypeUtils.m93692l(kotlinTypeM93550f)) {
                kotlinTypeM93550f = m93550f(kotlinTypeM93550f.mo93516J0(), false, 1, null);
                z = true;
            }
            arrayList.add(kotlinTypeM93550f);
        }
        if (!z) {
            return null;
        }
        KotlinType kotlinTypeM93511n = intersectionTypeConstructor.m93511n();
        if (kotlinTypeM93511n != null) {
            if (TypeUtils.m93692l(kotlinTypeM93511n)) {
                kotlinTypeM93511n = m93550f(kotlinTypeM93511n.mo93516J0(), false, 1, null);
            }
            kotlinType = kotlinTypeM93511n;
        }
        return new IntersectionTypeConstructor(arrayList).m93514t(kotlinType);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final UnwrappedType m93549e(@NotNull UnwrappedType unwrappedType, boolean z) {
        unwrappedType.getClass();
        DefinitelyNotNullType definitelyNotNullTypeM93465c = DefinitelyNotNullType.Companion.m93465c(DefinitelyNotNullType.Companion, unwrappedType, z, false, 4, null);
        if (definitelyNotNullTypeM93465c != null) {
            return definitelyNotNullTypeM93465c;
        }
        SimpleType simpleTypeM93551g = m93551g(unwrappedType);
        return simpleTypeM93551g != null ? simpleTypeM93551g : unwrappedType.mo90858N0(false);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ UnwrappedType m93550f(UnwrappedType unwrappedType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m93549e(unwrappedType, z);
    }

    /* JADX INFO: renamed from: g */
    public static final SimpleType m93551g(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructorM93548d;
        TypeConstructor typeConstructorMo92781G0 = kotlinType.mo92781G0();
        IntersectionTypeConstructor intersectionTypeConstructor = typeConstructorMo92781G0 instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) typeConstructorMo92781G0 : null;
        if (intersectionTypeConstructor == null || (intersectionTypeConstructorM93548d = m93548d(intersectionTypeConstructor)) == null) {
            return null;
        }
        return intersectionTypeConstructorM93548d.m93510l();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final SimpleType m93552h(@NotNull SimpleType simpleType, boolean z) {
        simpleType.getClass();
        DefinitelyNotNullType definitelyNotNullTypeM93465c = DefinitelyNotNullType.Companion.m93465c(DefinitelyNotNullType.Companion, simpleType, z, false, 4, null);
        if (definitelyNotNullTypeM93465c != null) {
            return definitelyNotNullTypeM93465c;
        }
        SimpleType simpleTypeM93551g = m93551g(simpleType);
        return simpleTypeM93551g == null ? simpleType.mo90858N0(false) : simpleTypeM93551g;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ SimpleType m93553i(SimpleType simpleType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m93552h(simpleType, z);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final SimpleType m93554j(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        return KotlinTypeKt.m93535a(simpleType) ? simpleType : new AbbreviatedType(simpleType, simpleType2);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final NewCapturedType m93555k(@NotNull NewCapturedType newCapturedType) {
        newCapturedType.getClass();
        return new NewCapturedType(newCapturedType.m93808P0(), newCapturedType.mo92781G0(), newCapturedType.m93810R0(), newCapturedType.mo92780F0(), newCapturedType.mo90857H0(), true);
    }
}
