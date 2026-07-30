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
    public final boolean m93385a(@NotNull TypeCheckerState typeCheckerState, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeCheckerState.SupertypesPolicy supertypesPolicy) {
        typeCheckerState.getClass();
        rigidTypeMarker.getClass();
        supertypesPolicy.getClass();
        TypeSystemContext typeSystemContextM93613j = typeCheckerState.m93613j();
        if ((typeSystemContextM93613j.mo91090B(rigidTypeMarker) && !typeSystemContextM93613j.mo91119P0(rigidTypeMarker)) || typeSystemContextM93613j.mo91158m(rigidTypeMarker)) {
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
                TypeCheckerState.SupertypesPolicy supertypesPolicy2 = typeSystemContextM93613j.mo91119P0(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : supertypesPolicy;
                if (Intrinsics.m88377d(supertypesPolicy2, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContextM93613j2 = typeCheckerState.m93613j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM93613j2.mo91099F0(typeSystemContextM93613j2.mo91136b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo93624a = supertypesPolicy2.mo93624a(typeCheckerState, it.next());
                        if ((typeSystemContextM93613j.mo91090B(rigidTypeMarkerMo93624a) && !typeSystemContextM93613j.mo91119P0(rigidTypeMarkerMo93624a)) || typeSystemContextM93613j.mo91158m(rigidTypeMarkerMo93624a)) {
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

    /* JADX INFO: renamed from: b */
    public final boolean m93386b(@NotNull TypeCheckerState typeCheckerState, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        typeCheckerState.getClass();
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        TypeSystemContext typeSystemContextM93613j = typeCheckerState.m93613j();
        if (INSTANCE.m93387c(typeCheckerState, rigidTypeMarker, typeConstructorMarker)) {
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
                TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContextM93613j.mo91119P0(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (Intrinsics.m88377d(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContextM93613j2 = typeCheckerState.m93613j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextM93613j2.mo91099F0(typeSystemContextM93613j2.mo91136b(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo93624a = supertypesPolicy.mo93624a(typeCheckerState, it.next());
                        if (INSTANCE.m93387c(typeCheckerState, rigidTypeMarkerMo93624a, typeConstructorMarker)) {
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

    /* JADX INFO: renamed from: c */
    public final boolean m93387c(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeSystemContext typeSystemContextM93613j = typeCheckerState.m93613j();
        if (typeSystemContextM93613j.mo91115N0(rigidTypeMarker)) {
            return true;
        }
        if (typeSystemContextM93613j.mo91119P0(rigidTypeMarker)) {
            return false;
        }
        if (typeCheckerState.m93618o() && typeSystemContextM93613j.mo91180x(rigidTypeMarker)) {
            return true;
        }
        return typeSystemContextM93613j.mo91125S0(typeSystemContextM93613j.mo91136b(rigidTypeMarker), typeConstructorMarker);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m93388d(@NotNull TypeCheckerState typeCheckerState, @NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
        typeCheckerState.getClass();
        rigidTypeMarker.getClass();
        rigidTypeMarker2.getClass();
        return m93389e(typeCheckerState, rigidTypeMarker, rigidTypeMarker2);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m93389e(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeSystemContext typeSystemContextM93613j = typeCheckerState.m93613j();
        if (AbstractTypeChecker.f66866a) {
            if (!typeSystemContextM93613j.mo91146g(rigidTypeMarker) && !typeSystemContextM93613j.mo91132Y(typeSystemContextM93613j.mo91136b(rigidTypeMarker))) {
                typeCheckerState.m93615l(rigidTypeMarker);
            }
            if (!typeSystemContextM93613j.mo91146g(rigidTypeMarker2)) {
                typeCheckerState.m93615l(rigidTypeMarker2);
            }
        }
        if (typeSystemContextM93613j.mo91119P0(rigidTypeMarker2) || typeSystemContextM93613j.mo91163o0(rigidTypeMarker) || typeSystemContextM93613j.mo91158m(rigidTypeMarker)) {
            return true;
        }
        if ((rigidTypeMarker instanceof CapturedTypeMarker) && typeSystemContextM93613j.mo91149h0((CapturedTypeMarker) rigidTypeMarker)) {
            return true;
        }
        AbstractNullabilityChecker abstractNullabilityChecker = INSTANCE;
        if (abstractNullabilityChecker.m93385a(typeCheckerState, rigidTypeMarker, TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (typeSystemContextM93613j.mo91158m(rigidTypeMarker2) || abstractNullabilityChecker.m93385a(typeCheckerState, rigidTypeMarker2, TypeCheckerState.SupertypesPolicy.UpperIfFlexible.INSTANCE) || typeSystemContextM93613j.mo91090B(rigidTypeMarker)) {
            return false;
        }
        return abstractNullabilityChecker.m93386b(typeCheckerState, rigidTypeMarker, typeSystemContextM93613j.mo91136b(rigidTypeMarker2));
    }
}
