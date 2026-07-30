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
    public static final AbbreviatedType m92654a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (unwrappedTypeMo92625J0 instanceof AbbreviatedType) {
            return (AbbreviatedType) unwrappedTypeMo92625J0;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final SimpleType m92655b(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        AbbreviatedType abbreviatedTypeM92654a = m92654a(kotlinType);
        if (abbreviatedTypeM92654a != null) {
            return abbreviatedTypeM92654a.m92487S0();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m92656c(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.mo92625J0() instanceof DefinitelyNotNullType;
    }

    /* JADX INFO: renamed from: d */
    public static final IntersectionTypeConstructor m92657d(IntersectionTypeConstructor intersectionTypeConstructor) {
        KotlinType kotlinType;
        Collection<KotlinType> collectionMo88678c = intersectionTypeConstructor.mo88678c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo88678c, 10));
        Iterator<T> it = collectionMo88678c.iterator();
        boolean z = false;
        while (true) {
            kotlinType = null;
            if (!it.hasNext()) {
                break;
            }
            KotlinType kotlinTypeM92659f = (KotlinType) it.next();
            if (TypeUtils.m92801l(kotlinTypeM92659f)) {
                kotlinTypeM92659f = m92659f(kotlinTypeM92659f.mo92625J0(), false, 1, null);
                z = true;
            }
            arrayList.add(kotlinTypeM92659f);
        }
        if (!z) {
            return null;
        }
        KotlinType kotlinTypeM92620n = intersectionTypeConstructor.m92620n();
        if (kotlinTypeM92620n != null) {
            if (TypeUtils.m92801l(kotlinTypeM92620n)) {
                kotlinTypeM92620n = m92659f(kotlinTypeM92620n.mo92625J0(), false, 1, null);
            }
            kotlinType = kotlinTypeM92620n;
        }
        return new IntersectionTypeConstructor(arrayList).m92623t(kotlinType);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final UnwrappedType m92658e(@NotNull UnwrappedType unwrappedType, boolean z) {
        unwrappedType.getClass();
        DefinitelyNotNullType definitelyNotNullTypeM92574c = DefinitelyNotNullType.Companion.m92574c(DefinitelyNotNullType.Companion, unwrappedType, z, false, 4, null);
        if (definitelyNotNullTypeM92574c != null) {
            return definitelyNotNullTypeM92574c;
        }
        SimpleType simpleTypeM92660g = m92660g(unwrappedType);
        return simpleTypeM92660g != null ? simpleTypeM92660g : unwrappedType.mo89967N0(false);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ UnwrappedType m92659f(UnwrappedType unwrappedType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m92658e(unwrappedType, z);
    }

    /* JADX INFO: renamed from: g */
    public static final SimpleType m92660g(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructorM92657d;
        TypeConstructor typeConstructorMo91890G0 = kotlinType.mo91890G0();
        IntersectionTypeConstructor intersectionTypeConstructor = typeConstructorMo91890G0 instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) typeConstructorMo91890G0 : null;
        if (intersectionTypeConstructor == null || (intersectionTypeConstructorM92657d = m92657d(intersectionTypeConstructor)) == null) {
            return null;
        }
        return intersectionTypeConstructorM92657d.m92619l();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final SimpleType m92661h(@NotNull SimpleType simpleType, boolean z) {
        simpleType.getClass();
        DefinitelyNotNullType definitelyNotNullTypeM92574c = DefinitelyNotNullType.Companion.m92574c(DefinitelyNotNullType.Companion, simpleType, z, false, 4, null);
        if (definitelyNotNullTypeM92574c != null) {
            return definitelyNotNullTypeM92574c;
        }
        SimpleType simpleTypeM92660g = m92660g(simpleType);
        return simpleTypeM92660g == null ? simpleType.mo89967N0(false) : simpleTypeM92660g;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ SimpleType m92662i(SimpleType simpleType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m92661h(simpleType, z);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final SimpleType m92663j(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        return KotlinTypeKt.m92644a(simpleType) ? simpleType : new AbbreviatedType(simpleType, simpleType2);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final NewCapturedType m92664k(@NotNull NewCapturedType newCapturedType) {
        newCapturedType.getClass();
        return new NewCapturedType(newCapturedType.m92917P0(), newCapturedType.mo91890G0(), newCapturedType.m92919R0(), newCapturedType.mo91889F0(), newCapturedType.mo89966H0(), true);
    }
}
