package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaResolverSettings {

    @NotNull
    public static final Companion Companion = Companion.f64830a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f64830a = new Companion();

        private Companion() {
        }
    }

    public static final class Default implements JavaResolverSettings {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        /* JADX INFO: renamed from: a */
        public boolean mo89606a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        /* JADX INFO: renamed from: b */
        public boolean mo89607b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        /* JADX INFO: renamed from: c */
        public boolean mo89608c() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        /* JADX INFO: renamed from: d */
        public boolean mo89609d() {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo89606a();

    /* JADX INFO: renamed from: b */
    boolean mo89607b();

    /* JADX INFO: renamed from: c */
    boolean mo89608c();

    /* JADX INFO: renamed from: d */
    boolean mo89609d();
}
