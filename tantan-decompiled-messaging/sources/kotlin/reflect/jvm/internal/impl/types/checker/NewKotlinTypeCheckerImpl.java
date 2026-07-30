package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KotlinTypeRefiner f66313b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinTypePreparator f66314c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final OverridingUtil f66315d;

    public NewKotlinTypeCheckerImpl(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypePreparator kotlinTypePreparator) {
        kotlinTypeRefiner.getClass();
        kotlinTypePreparator.getClass();
        this.f66313b = kotlinTypeRefiner;
        this.f66314c = kotlinTypePreparator;
        OverridingUtil overridingUtilM91824m = OverridingUtil.m91824m(mo92939c());
        overridingUtilM91824m.getClass();
        this.f66315d = overridingUtilM91824m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    /* JADX INFO: renamed from: a */
    public boolean mo92903a(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return m92941e(ClassicTypeCheckerStateKt.m92821b(false, false, null, m92942f(), mo92939c(), 6, null), kotlinType.mo92625J0(), kotlinType2.mo92625J0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    @NotNull
    /* JADX INFO: renamed from: b */
    public OverridingUtil mo92938b() {
        return this.f66315d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    @NotNull
    /* JADX INFO: renamed from: c */
    public KotlinTypeRefiner mo92939c() {
        return this.f66313b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    /* JADX INFO: renamed from: d */
    public boolean mo92904d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return m92943g(ClassicTypeCheckerStateKt.m92821b(true, false, null, m92942f(), mo92939c(), 6, null), kotlinType.mo92625J0(), kotlinType2.mo92625J0());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m92941e(@NotNull TypeCheckerState typeCheckerState, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        typeCheckerState.getClass();
        unwrappedType.getClass();
        unwrappedType2.getClass();
        return AbstractTypeChecker.INSTANCE.m92522m(typeCheckerState, unwrappedType, unwrappedType2);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinTypePreparator m92942f() {
        return this.f66314c;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m92943g(@NotNull TypeCheckerState typeCheckerState, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        typeCheckerState.getClass();
        unwrappedType.getClass();
        unwrappedType2.getClass();
        return AbstractTypeChecker.m92511w(AbstractTypeChecker.INSTANCE, typeCheckerState, unwrappedType, unwrappedType2, false, 8, null);
    }

    public /* synthetic */ NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinTypeRefiner, (i & 2) != 0 ? KotlinTypePreparator.Default.INSTANCE : kotlinTypePreparator);
    }
}
