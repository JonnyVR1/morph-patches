package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CheckResult {

    /* JADX INFO: renamed from: a */
    public final boolean f67030a;

    public static final class IllegalFunctionName extends CheckResult {

        @NotNull
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName();

        private IllegalFunctionName() {
            super(false, null);
        }
    }

    public static final class IllegalSignature extends CheckResult {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f67031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(@NotNull String str) {
            super(false, null);
            str.getClass();
            this.f67031b = str;
        }
    }

    public static final class SuccessCheck extends CheckResult {

        @NotNull
        public static final SuccessCheck INSTANCE = new SuccessCheck();

        private SuccessCheck() {
            super(true, null);
        }
    }

    public CheckResult(boolean z) {
        this.f67030a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94027a() {
        return this.f67030a;
    }

    public /* synthetic */ CheckResult(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
