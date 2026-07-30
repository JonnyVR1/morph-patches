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
import p153l.pr3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class TypeCheckerState {

    /* JADX INFO: renamed from: a */
    public final boolean f66930a;

    /* JADX INFO: renamed from: b */
    public final boolean f66931b;

    /* JADX INFO: renamed from: c */
    public final boolean f66932c;

    /* JADX INFO: renamed from: d */
    public final boolean f66933d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TypeSystemContext f66934e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final AbstractTypePreparator f66935f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final AbstractTypeRefiner f66936g;

    /* JADX INFO: renamed from: h */
    public int f66937h;

    /* JADX INFO: renamed from: i */
    public boolean f66938i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public ArrayDeque<RigidTypeMarker> f66939j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Set<RigidTypeMarker> f66940k;

    public interface ForkPointContext {

        public static final class Default implements ForkPointContext {

            /* JADX INFO: renamed from: a */
            public boolean f66941a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            /* JADX INFO: renamed from: a */
            public void mo93622a(@NotNull Function0<Boolean> function0) {
                function0.getClass();
                if (this.f66941a) {
                    return;
                }
                this.f66941a = function0.invoke().booleanValue();
            }

            /* JADX INFO: renamed from: b */
            public final boolean m93623b() {
                return this.f66941a;
            }
        }

        /* JADX INFO: renamed from: a */
        void mo93622a(@NotNull Function0<Boolean> function0);
    }

    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());
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
            public RigidTypeMarker mo93624a(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker) {
                typeCheckerState.getClass();
                kotlinTypeMarker.getClass();
                return typeCheckerState.m93613j().mo91135a0(kotlinTypeMarker);
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
            public /* bridge */ /* synthetic */ RigidTypeMarker mo93624a(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                return (RigidTypeMarker) m93625b(typeCheckerState, kotlinTypeMarker);
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public Void m93625b(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker) {
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
            public RigidTypeMarker mo93624a(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker) {
                typeCheckerState.getClass();
                kotlinTypeMarker.getClass();
                return typeCheckerState.m93613j().mo91174u(kotlinTypeMarker);
            }
        }

        public /* synthetic */ SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public abstract RigidTypeMarker mo93624a(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker);

        private SupertypesPolicy() {
        }
    }

    public TypeCheckerState(boolean z, boolean z2, boolean z3, boolean z4, @NotNull TypeSystemContext typeSystemContext, @NotNull AbstractTypePreparator abstractTypePreparator, @NotNull AbstractTypeRefiner abstractTypeRefiner) {
        typeSystemContext.getClass();
        abstractTypePreparator.getClass();
        abstractTypeRefiner.getClass();
        this.f66930a = z;
        this.f66931b = z2;
        this.f66932c = z3;
        this.f66933d = z4;
        this.f66934e = typeSystemContext;
        this.f66935f = abstractTypePreparator;
        this.f66936g = abstractTypeRefiner;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m93607d(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
            return null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return typeCheckerState.m93608c(kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Boolean m93608c(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m93609e() {
        ArrayDeque<RigidTypeMarker> arrayDeque = this.f66939j;
        arrayDeque.getClass();
        arrayDeque.clear();
        Set<RigidTypeMarker> set = this.f66940k;
        set.getClass();
        set.clear();
        this.f66938i = false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo92770f(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public LowerCapturedTypePolicy m93610g(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull CapturedTypeMarker capturedTypeMarker) {
        rigidTypeMarker.getClass();
        capturedTypeMarker.getClass();
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final ArrayDeque<RigidTypeMarker> m93611h() {
        return this.f66939j;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Set<RigidTypeMarker> m93612i() {
        return this.f66940k;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TypeSystemContext m93613j() {
        return this.f66934e;
    }

    /* JADX INFO: renamed from: k */
    public final void m93614k() {
        this.f66938i = true;
        if (this.f66939j == null) {
            this.f66939j = new ArrayDeque<>(4);
        }
        if (this.f66940k == null) {
            this.f66940k = SmartSet.Companion.m94112a();
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m93615l(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return this.f66933d && this.f66934e.mo91089A0(kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m93616m() {
        return this.f66932c;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m93617n() {
        return this.f66930a;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m93618o() {
        return this.f66931b;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final KotlinTypeMarker m93619p(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return this.f66935f.mo93449a(kotlinTypeMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final KotlinTypeMarker m93620q(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return this.f66936g.mo93450a(kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: r */
    public boolean m93621r(@NotNull Function1<? super ForkPointContext, Unit> function1) {
        function1.getClass();
        ForkPointContext.Default r0 = new ForkPointContext.Default();
        function1.invoke(r0);
        return r0.m93623b();
    }
}
