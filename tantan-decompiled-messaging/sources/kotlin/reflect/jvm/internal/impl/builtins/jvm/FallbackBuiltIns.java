package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FallbackBuiltIns extends KotlinBuiltIns {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final KotlinBuiltIns f63966h = new FallbackBuiltIns();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final KotlinBuiltIns m88342a() {
            return FallbackBuiltIns.f63966h;
        }

        private Companion() {
        }
    }

    public FallbackBuiltIns() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        m88229f(true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public PlatformDependentDeclarationFilter.All mo88218N() {
        return PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}
