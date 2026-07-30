package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum FunctionClassKind {
    Function,
    SuspendFunction,
    KFunction,
    KSuspendFunction,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final FunctionClassKind m88320a(@NotNull FunctionTypeKind functionTypeKind) {
            functionTypeKind.getClass();
            if (Intrinsics.m87488d(functionTypeKind, FunctionTypeKind.Function.INSTANCE)) {
                return FunctionClassKind.Function;
            }
            if (Intrinsics.m87488d(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE)) {
                return FunctionClassKind.SuspendFunction;
            }
            if (Intrinsics.m87488d(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE)) {
                return FunctionClassKind.KFunction;
            }
            return Intrinsics.m87488d(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE) ? FunctionClassKind.KSuspendFunction : FunctionClassKind.UNKNOWN;
        }

        private Companion() {
        }
    }
}
