package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;
import p149l.old;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy<DefaultBuiltIns> f63771h = LazyKt__LazyJVMKt.m87229b(old.INSTANCE);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final DefaultBuiltIns m88143a() {
            return (DefaultBuiltIns) DefaultBuiltIns.f63771h.getValue();
        }

        private Companion() {
        }
    }

    public DefaultBuiltIns(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            m88229f(false);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static final DefaultBuiltIns m88140G0() {
        return new DefaultBuiltIns(false, 1, null);
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public /* synthetic */ DefaultBuiltIns(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
