package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AbstractStrictEqualityTypeChecker {

    @NotNull
    public static final AbstractStrictEqualityTypeChecker INSTANCE = new AbstractStrictEqualityTypeChecker();

    private AbstractStrictEqualityTypeChecker() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m93390a(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.mo91154k(rigidTypeMarker) != typeSystemContext.mo91154k(rigidTypeMarker2) || typeSystemContext.mo91119P0(rigidTypeMarker) != typeSystemContext.mo91119P0(rigidTypeMarker2) || typeSystemContext.mo91158m(rigidTypeMarker) != typeSystemContext.mo91158m(rigidTypeMarker2) || !typeSystemContext.mo91125S0(typeSystemContext.mo91136b(rigidTypeMarker), typeSystemContext.mo91136b(rigidTypeMarker2))) {
            return false;
        }
        if (typeSystemContext.mo91185z0(rigidTypeMarker, rigidTypeMarker2)) {
            return true;
        }
        int iMo91154k = typeSystemContext.mo91154k(rigidTypeMarker);
        for (int i = 0; i < iMo91154k; i++) {
            TypeArgumentMarker typeArgumentMarkerMo91177v0 = typeSystemContext.mo91177v0(rigidTypeMarker, i);
            TypeArgumentMarker typeArgumentMarkerMo91177v1 = typeSystemContext.mo91177v0(rigidTypeMarker2, i);
            if (typeSystemContext.mo91134a(typeArgumentMarkerMo91177v0) != typeSystemContext.mo91134a(typeArgumentMarkerMo91177v1)) {
                return false;
            }
            if (!typeSystemContext.mo91134a(typeArgumentMarkerMo91177v0)) {
                if (typeSystemContext.mo91137b0(typeArgumentMarkerMo91177v0) != typeSystemContext.mo91137b0(typeArgumentMarkerMo91177v1)) {
                    return false;
                }
                KotlinTypeMarker kotlinTypeMarkerMo91145f0 = typeSystemContext.mo91145f0(typeArgumentMarkerMo91177v0);
                kotlinTypeMarkerMo91145f0.getClass();
                KotlinTypeMarker kotlinTypeMarkerMo91145f1 = typeSystemContext.mo91145f0(typeArgumentMarkerMo91177v1);
                kotlinTypeMarkerMo91145f1.getClass();
                if (!m93392c(typeSystemContext, kotlinTypeMarkerMo91145f0, kotlinTypeMarkerMo91145f1)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m93391b(@NotNull TypeSystemContext typeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        typeSystemContext.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return m93392c(typeSystemContext, kotlinTypeMarker, kotlinTypeMarker2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m93392c(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        RigidTypeMarker rigidTypeMarkerMo91142e = typeSystemContext.mo91142e(kotlinTypeMarker);
        RigidTypeMarker rigidTypeMarkerMo91142e2 = typeSystemContext.mo91142e(kotlinTypeMarker2);
        if (rigidTypeMarkerMo91142e != null && rigidTypeMarkerMo91142e2 != null) {
            return m93390a(typeSystemContext, rigidTypeMarkerMo91142e, rigidTypeMarkerMo91142e2);
        }
        FlexibleTypeMarker flexibleTypeMarkerMo91126T = typeSystemContext.mo91126T(kotlinTypeMarker);
        FlexibleTypeMarker flexibleTypeMarkerMo91126T2 = typeSystemContext.mo91126T(kotlinTypeMarker2);
        return flexibleTypeMarkerMo91126T != null && flexibleTypeMarkerMo91126T2 != null && m93390a(typeSystemContext, typeSystemContext.mo91148h(flexibleTypeMarkerMo91126T), typeSystemContext.mo91148h(flexibleTypeMarkerMo91126T2)) && m93390a(typeSystemContext, typeSystemContext.mo91150i(flexibleTypeMarkerMo91126T), typeSystemContext.mo91150i(flexibleTypeMarkerMo91126T2));
    }
}
