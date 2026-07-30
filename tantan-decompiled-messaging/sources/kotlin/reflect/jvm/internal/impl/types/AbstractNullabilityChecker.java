package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class AbstractNullabilityChecker {

    @NotNull
    public static final AbstractNullabilityChecker INSTANCE = new AbstractNullabilityChecker();

    private AbstractNullabilityChecker() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92494a(@NotNull TypeCheckerState typeCheckerState, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeCheckerState.SupertypesPolicy supertypesPolicy) {
        typeCheckerState.getClass();
        rigidTypeMarker.getClass();
        supertypesPolicy.getClass();
        TypeSystemContext typeSystemContextM92722j = typeCheckerState.m92722j();
        if ((typeSystemContextM92722j.mo90199B(rigidTypeMarker) && !typeSystemContextM92722j.mo90228P0(rigidTypeMarker)) || typeSystemContextM92722j.mo90267m(rigidTypeMarker)) {
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
                TypeCheckerState.SupertypesPolicy supertypesPolicy2 = typeSystemContextM92722j.mo90228P0(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : supertypesPolicy;
                if (Intrinsics.m87488d(supertypesPolicy2, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContextM92722j2 = typeCheckerState.m92722j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM92722j2.mo90208F0(typeSystemContextM92722j2.mo90245b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo92733a = supertypesPolicy2.mo92733a(typeCheckerState, it.next());
                        if ((typeSystemContextM92722j.mo90199B(rigidTypeMarkerMo92733a) && !typeSystemContextM92722j.mo90228P0(rigidTypeMarkerMo92733a)) || typeSystemContextM92722j.mo90267m(rigidTypeMarkerMo92733a)) {
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

    /* JADX INFO: renamed from: b */
    public final boolean m92495b(@NotNull TypeCheckerState typeCheckerState, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        typeCheckerState.getClass();
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        TypeSystemContext typeSystemContextM92722j = typeCheckerState.m92722j();
        if (INSTANCE.m92496c(typeCheckerState, rigidTypeMarker, typeConstructorMarker)) {
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
                TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContextM92722j.mo90228P0(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (Intrinsics.m87488d(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContextM92722j2 = typeCheckerState.m92722j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM92722j2.mo90208F0(typeSystemContextM92722j2.mo90245b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo92733a = supertypesPolicy.mo92733a(typeCheckerState, it.next());
                        if (INSTANCE.m92496c(typeCheckerState, rigidTypeMarkerMo92733a, typeConstructorMarker)) {
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

    /* JADX INFO: renamed from: c */
    public final boolean m92496c(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeSystemContext typeSystemContextM92722j = typeCheckerState.m92722j();
        if (typeSystemContextM92722j.mo90224N0(rigidTypeMarker)) {
            return true;
        }
        if (typeSystemContextM92722j.mo90228P0(rigidTypeMarker)) {
            return false;
        }
        if (typeCheckerState.m92727o() && typeSystemContextM92722j.mo90289x(rigidTypeMarker)) {
            return true;
        }
        return typeSystemContextM92722j.mo90234S0(typeSystemContextM92722j.mo90245b(rigidTypeMarker), typeConstructorMarker);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m92497d(@NotNull TypeCheckerState typeCheckerState, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
        typeCheckerState.getClass();
        rigidTypeMarker.getClass();
        rigidTypeMarker2.getClass();
        return m92498e(typeCheckerState, rigidTypeMarker, rigidTypeMarker2);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m92498e(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeSystemContext typeSystemContextM92722j = typeCheckerState.m92722j();
        if (AbstractTypeChecker.f66192a) {
            if (!typeSystemContextM92722j.mo90255g(rigidTypeMarker) && !typeSystemContextM92722j.mo90241Y(typeSystemContextM92722j.mo90245b(rigidTypeMarker))) {
                typeCheckerState.m92724l(rigidTypeMarker);
            }
            if (!typeSystemContextM92722j.mo90255g(rigidTypeMarker2)) {
                typeCheckerState.m92724l(rigidTypeMarker2);
            }
        }
        if (typeSystemContextM92722j.mo90228P0(rigidTypeMarker2) || typeSystemContextM92722j.mo90272o0(rigidTypeMarker) || typeSystemContextM92722j.mo90267m(rigidTypeMarker)) {
            return true;
        }
        if ((rigidTypeMarker instanceof CapturedTypeMarker) && typeSystemContextM92722j.mo90258h0((CapturedTypeMarker) rigidTypeMarker)) {
            return true;
        }
        AbstractNullabilityChecker abstractNullabilityChecker = INSTANCE;
        if (abstractNullabilityChecker.m92494a(typeCheckerState, rigidTypeMarker, TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (typeSystemContextM92722j.mo90267m(rigidTypeMarker2) || abstractNullabilityChecker.m92494a(typeCheckerState, rigidTypeMarker2, TypeCheckerState.SupertypesPolicy.UpperIfFlexible.INSTANCE) || typeSystemContextM92722j.mo90199B(rigidTypeMarker)) {
            return false;
        }
        return abstractNullabilityChecker.m92495b(typeCheckerState, rigidTypeMarker, typeSystemContextM92722j.mo90245b(rigidTypeMarker2));
    }
}
