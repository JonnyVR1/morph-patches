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
    public final KotlinTypeRefiner f66987b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinTypePreparator f66988c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final OverridingUtil f66989d;

    public NewKotlinTypeCheckerImpl(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypePreparator kotlinTypePreparator) {
        kotlinTypeRefiner.getClass();
        kotlinTypePreparator.getClass();
        this.f66987b = kotlinTypeRefiner;
        this.f66988c = kotlinTypePreparator;
        OverridingUtil overridingUtilM92715m = OverridingUtil.m92715m(mo93830c());
        overridingUtilM92715m.getClass();
        this.f66989d = overridingUtilM92715m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    /* JADX INFO: renamed from: a */
    public boolean mo93794a(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return m93832e(ClassicTypeCheckerStateKt.m93712b(false, false, null, m93833f(), mo93830c(), 6, null), kotlinType.mo93516J0(), kotlinType2.mo93516J0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    @NotNull
    /* JADX INFO: renamed from: b */
    public OverridingUtil mo93829b() {
        return this.f66989d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    @NotNull
    /* JADX INFO: renamed from: c */
    public KotlinTypeRefiner mo93830c() {
        return this.f66987b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    /* JADX INFO: renamed from: d */
    public boolean mo93795d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return m93834g(ClassicTypeCheckerStateKt.m93712b(true, false, null, m93833f(), mo93830c(), 6, null), kotlinType.mo93516J0(), kotlinType2.mo93516J0());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m93832e(@NotNull TypeCheckerState typeCheckerState, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        typeCheckerState.getClass();
        unwrappedType.getClass();
        unwrappedType2.getClass();
        return AbstractTypeChecker.INSTANCE.m93413m(typeCheckerState, unwrappedType, unwrappedType2);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinTypePreparator m93833f() {
        return this.f66988c;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m93834g(@NotNull TypeCheckerState typeCheckerState, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        typeCheckerState.getClass();
        unwrappedType.getClass();
        unwrappedType2.getClass();
        return AbstractTypeChecker.m93402w(AbstractTypeChecker.INSTANCE, typeCheckerState, unwrappedType, unwrappedType2, false, 8, null);
    }

    public /* synthetic */ NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinTypeRefiner, (i & 2) != 0 ? KotlinTypePreparator.Default.INSTANCE : kotlinTypePreparator);
    }
}
