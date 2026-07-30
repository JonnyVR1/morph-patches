package kotlin.reflect.jvm.internal.impl.incremental.components;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface LookupTracker {

    public static final class DO_NOTHING implements LookupTracker {

        @NotNull
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        private DO_NOTHING() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        /* JADX INFO: renamed from: a */
        public boolean mo89078a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        /* JADX INFO: renamed from: b */
        public void mo89079b(@NotNull String str, @NotNull Position position, @NotNull String str2, @NotNull ScopeKind scopeKind, @NotNull String str3) {
            str.getClass();
            position.getClass();
            str2.getClass();
            scopeKind.getClass();
            str3.getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo89078a();

    /* JADX INFO: renamed from: b */
    void mo89079b(@NotNull String str, @NotNull Position position, @NotNull String str2, @NotNull ScopeKind scopeKind, @NotNull String str3);
}
