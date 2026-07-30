package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StrictEqualityTypeChecker {

    @NotNull
    public static final StrictEqualityTypeChecker INSTANCE = new StrictEqualityTypeChecker();

    private StrictEqualityTypeChecker() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m93860a(@NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        unwrappedType.getClass();
        unwrappedType2.getClass();
        return AbstractStrictEqualityTypeChecker.INSTANCE.m93391b(SimpleClassicTypeSystemContext.INSTANCE, unwrappedType, unwrappedType2);
    }
}
