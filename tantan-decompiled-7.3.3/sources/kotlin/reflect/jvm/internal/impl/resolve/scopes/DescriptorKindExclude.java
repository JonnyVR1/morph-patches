package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorKindExclude {

    public static final class NonExtensions extends DescriptorKindExclude {

        @NotNull
        public static final NonExtensions INSTANCE = new NonExtensions();

        /* JADX INFO: renamed from: a */
        public static final int f66554a;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
            f66554a = (~(companion.m92942i() | companion.m92937d())) & companion.m92935b();
        }

        private NonExtensions() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        /* JADX INFO: renamed from: a */
        public int mo92919a() {
            return f66554a;
        }
    }

    public static final class TopLevelPackages extends DescriptorKindExclude {

        @NotNull
        public static final TopLevelPackages INSTANCE = new TopLevelPackages();

        private TopLevelPackages() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        /* JADX INFO: renamed from: a */
        public int mo92919a() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo92919a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
