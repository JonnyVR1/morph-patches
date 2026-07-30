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
    public final boolean m92499a(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.mo90263k(rigidTypeMarker) != typeSystemContext.mo90263k(rigidTypeMarker2) || typeSystemContext.mo90228P0(rigidTypeMarker) != typeSystemContext.mo90228P0(rigidTypeMarker2) || typeSystemContext.mo90267m(rigidTypeMarker) != typeSystemContext.mo90267m(rigidTypeMarker2) || !typeSystemContext.mo90234S0(typeSystemContext.mo90245b(rigidTypeMarker), typeSystemContext.mo90245b(rigidTypeMarker2))) {
            return false;
        }
        if (typeSystemContext.mo90294z0(rigidTypeMarker, rigidTypeMarker2)) {
            return true;
        }
        int iMo90263k = typeSystemContext.mo90263k(rigidTypeMarker);
        for (int i = 0; i < iMo90263k; i++) {
            TypeArgumentMarker typeArgumentMarkerMo90286v0 = typeSystemContext.mo90286v0(rigidTypeMarker, i);
            TypeArgumentMarker typeArgumentMarkerMo90286v1 = typeSystemContext.mo90286v0(rigidTypeMarker2, i);
            if (typeSystemContext.mo90243a(typeArgumentMarkerMo90286v0) != typeSystemContext.mo90243a(typeArgumentMarkerMo90286v1)) {
                return false;
            }
            if (!typeSystemContext.mo90243a(typeArgumentMarkerMo90286v0)) {
                if (typeSystemContext.mo90246b0(typeArgumentMarkerMo90286v0) != typeSystemContext.mo90246b0(typeArgumentMarkerMo90286v1)) {
                    return false;
                }
                KotlinTypeMarker kotlinTypeMarkerMo90254f0 = typeSystemContext.mo90254f0(typeArgumentMarkerMo90286v0);
                kotlinTypeMarkerMo90254f0.getClass();
                KotlinTypeMarker kotlinTypeMarkerMo90254f1 = typeSystemContext.mo90254f0(typeArgumentMarkerMo90286v1);
                kotlinTypeMarkerMo90254f1.getClass();
                if (!m92501c(typeSystemContext, kotlinTypeMarkerMo90254f0, kotlinTypeMarkerMo90254f1)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m92500b(@NotNull TypeSystemContext typeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        typeSystemContext.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return m92501c(typeSystemContext, kotlinTypeMarker, kotlinTypeMarker2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m92501c(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        RigidTypeMarker rigidTypeMarkerMo90251e = typeSystemContext.mo90251e(kotlinTypeMarker);
        RigidTypeMarker rigidTypeMarkerMo90251e2 = typeSystemContext.mo90251e(kotlinTypeMarker2);
        if (rigidTypeMarkerMo90251e != null && rigidTypeMarkerMo90251e2 != null) {
            return m92499a(typeSystemContext, rigidTypeMarkerMo90251e, rigidTypeMarkerMo90251e2);
        }
        FlexibleTypeMarker flexibleTypeMarkerMo90235T = typeSystemContext.mo90235T(kotlinTypeMarker);
        FlexibleTypeMarker flexibleTypeMarkerMo90235T2 = typeSystemContext.mo90235T(kotlinTypeMarker2);
        return flexibleTypeMarkerMo90235T != null && flexibleTypeMarkerMo90235T2 != null && m92499a(typeSystemContext, typeSystemContext.mo90257h(flexibleTypeMarkerMo90235T), typeSystemContext.mo90257h(flexibleTypeMarkerMo90235T2)) && m92499a(typeSystemContext, typeSystemContext.mo90259i(flexibleTypeMarkerMo90235T), typeSystemContext.mo90259i(flexibleTypeMarkerMo90235T2));
    }
}
