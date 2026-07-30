package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassicTypeCheckerStateKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TypeCheckerState m93711a(boolean z, boolean z2, @NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypePreparator kotlinTypePreparator, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        classicTypeSystemContext.getClass();
        kotlinTypePreparator.getClass();
        kotlinTypeRefiner.getClass();
        return new TypeCheckerState(z, z2, false, true, classicTypeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TypeCheckerState m93712b(boolean z, boolean z2, ClassicTypeSystemContext classicTypeSystemContext, KotlinTypePreparator kotlinTypePreparator, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            classicTypeSystemContext = SimpleClassicTypeSystemContext.INSTANCE;
        }
        if ((i & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.Default.INSTANCE;
        }
        if ((i & 16) != 0) {
            kotlinTypeRefiner = KotlinTypeRefiner.Default.INSTANCE;
        }
        return m93711a(z, z2, classicTypeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }
}
