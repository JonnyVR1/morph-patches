package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class TypeCheckerState {

    /* JADX INFO: renamed from: a */
    public final boolean f66256a;

    /* JADX INFO: renamed from: b */
    public final boolean f66257b;

    /* JADX INFO: renamed from: c */
    public final boolean f66258c;

    /* JADX INFO: renamed from: d */
    public final boolean f66259d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TypeSystemContext f66260e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final AbstractTypePreparator f66261f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final AbstractTypeRefiner f66262g;

    /* JADX INFO: renamed from: h */
    public int f66263h;

    /* JADX INFO: renamed from: i */
    public boolean f66264i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public ArrayDeque<RigidTypeMarker> f66265j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Set<RigidTypeMarker> f66266k;

    public interface ForkPointContext {

        public static final class Default implements ForkPointContext {

            /* JADX INFO: renamed from: a */
            public boolean f66267a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            /* JADX INFO: renamed from: a */
            public void mo92731a(@NotNull Function0<Boolean> function0) {
                function0.getClass();
                if (this.f66267a) {
                    return;
                }
                this.f66267a = function0.invoke().booleanValue();
            }

            /* JADX INFO: renamed from: b */
            public final boolean m92732b() {
                return this.f66267a;
            }
        }

        /* JADX INFO: renamed from: a */
        void mo92731a(@NotNull Function0<Boolean> function0);
    }

    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());
    }

    public static abstract class SupertypesPolicy {

        public static abstract class DoCustomTransform extends SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        @SourceDebugExtension
        public static final class LowerIfFlexible extends SupertypesPolicy {

            @NotNull
            public static final LowerIfFlexible INSTANCE = new LowerIfFlexible();

            private LowerIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            @NotNull
            /* JADX INFO: renamed from: a */
            public RigidTypeMarker mo92733a(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker) {
                typeCheckerState.getClass();
                kotlinTypeMarker.getClass();
                return typeCheckerState.m92722j().mo90244a0(kotlinTypeMarker);
            }
        }

        public static final class None extends SupertypesPolicy {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: a */
            public /* bridge */ /* synthetic */ RigidTypeMarker mo92733a(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                return (RigidTypeMarker) m92734b(typeCheckerState, kotlinTypeMarker);
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public Void m92734b(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker) {
                typeCheckerState.getClass();
                kotlinTypeMarker.getClass();
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        @SourceDebugExtension
        public static final class UpperIfFlexible extends SupertypesPolicy {

            @NotNull
            public static final UpperIfFlexible INSTANCE = new UpperIfFlexible();

            private UpperIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            @NotNull
            /* JADX INFO: renamed from: a */
            public RigidTypeMarker mo92733a(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker) {
                typeCheckerState.getClass();
                kotlinTypeMarker.getClass();
                return typeCheckerState.m92722j().mo90283u(kotlinTypeMarker);
            }
        }

        public /* synthetic */ SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public abstract RigidTypeMarker mo92733a(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker);

        private SupertypesPolicy() {
        }
    }

    public TypeCheckerState(boolean z, boolean z2, boolean z3, boolean z4, @NotNull TypeSystemContext typeSystemContext, @NotNull AbstractTypePreparator abstractTypePreparator, @NotNull AbstractTypeRefiner abstractTypeRefiner) {
        typeSystemContext.getClass();
        abstractTypePreparator.getClass();
        abstractTypeRefiner.getClass();
        this.f66256a = z;
        this.f66257b = z2;
        this.f66258c = z3;
        this.f66259d = z4;
        this.f66260e = typeSystemContext;
        this.f66261f = abstractTypePreparator;
        this.f66262g = abstractTypeRefiner;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m92716d(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
            return null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return typeCheckerState.m92717c(kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Boolean m92717c(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m92718e() {
        ArrayDeque<RigidTypeMarker> arrayDeque = this.f66265j;
        arrayDeque.getClass();
        arrayDeque.clear();
        Set<RigidTypeMarker> set = this.f66266k;
        set.getClass();
        set.clear();
        this.f66264i = false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo91879f(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public LowerCapturedTypePolicy m92719g(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull CapturedTypeMarker capturedTypeMarker) {
        rigidTypeMarker.getClass();
        capturedTypeMarker.getClass();
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final ArrayDeque<RigidTypeMarker> m92720h() {
        return this.f66265j;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Set<RigidTypeMarker> m92721i() {
        return this.f66266k;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TypeSystemContext m92722j() {
        return this.f66260e;
    }

    /* JADX INFO: renamed from: k */
    public final void m92723k() {
        this.f66264i = true;
        if (this.f66265j == null) {
            this.f66265j = new ArrayDeque<>(4);
        }
        if (this.f66266k == null) {
            this.f66266k = SmartSet.Companion.m93221a();
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m92724l(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return this.f66259d && this.f66260e.mo90198A0(kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m92725m() {
        return this.f66258c;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m92726n() {
        return this.f66256a;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m92727o() {
        return this.f66257b;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final KotlinTypeMarker m92728p(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return this.f66261f.mo92558a(kotlinTypeMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final KotlinTypeMarker m92729q(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return this.f66262g.mo92559a(kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: r */
    public boolean m92730r(@NotNull Function1<? super ForkPointContext, Unit> function1) {
        function1.getClass();
        ForkPointContext.Default r0 = new ForkPointContext.Default();
        function1.invoke(r0);
        return r0.m92732b();
    }
}
