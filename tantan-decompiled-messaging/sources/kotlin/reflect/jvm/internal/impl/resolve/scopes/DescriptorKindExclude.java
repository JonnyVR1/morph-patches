package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorKindExclude {

    public static final class NonExtensions extends DescriptorKindExclude {

        @NotNull
        public static final NonExtensions INSTANCE = new NonExtensions();

        /* JADX INFO: renamed from: a */
        public static final int f65880a;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
            f65880a = (~(companion.m92051i() | companion.m92046d())) & companion.m92044b();
        }

        private NonExtensions() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        /* JADX INFO: renamed from: a */
        public int mo92028a() {
            return f65880a;
        }
    }

    public static final class TopLevelPackages extends DescriptorKindExclude {

        @NotNull
        public static final TopLevelPackages INSTANCE = new TopLevelPackages();

        private TopLevelPackages() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        /* JADX INFO: renamed from: a */
        public int mo92028a() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo92028a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
