package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext$$Util;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityChecker {

    @NotNull
    public static final NullabilityChecker INSTANCE = new NullabilityChecker();

    private NullabilityChecker() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92945a(@NotNull UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        return AbstractNullabilityChecker.INSTANCE.m92494a(TypeCheckerProviderContext$$Util.m93017a(SimpleClassicTypeSystemContext.INSTANCE, false, true, false, 4, null), FlexibleTypesKt.m92607c(unwrappedType), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE);
    }
}
