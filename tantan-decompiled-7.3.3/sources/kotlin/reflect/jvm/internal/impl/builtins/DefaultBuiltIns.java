package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;
import p153l.umd;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy<DefaultBuiltIns> f64445h = LazyKt__LazyJVMKt.m88118b(umd.INSTANCE);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final DefaultBuiltIns m89034a() {
            return (DefaultBuiltIns) DefaultBuiltIns.f64445h.getValue();
        }

        private Companion() {
        }
    }

    public DefaultBuiltIns(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            m89120f(false);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static final DefaultBuiltIns m89031G0() {
        return new DefaultBuiltIns(false, 1, null);
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public /* synthetic */ DefaultBuiltIns(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
