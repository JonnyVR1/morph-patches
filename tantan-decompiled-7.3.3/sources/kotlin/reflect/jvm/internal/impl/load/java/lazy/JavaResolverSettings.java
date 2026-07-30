package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaResolverSettings {

    @NotNull
    public static final Companion Companion = Companion.f65504a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f65504a = new Companion();

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
        public boolean mo90497a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        /* JADX INFO: renamed from: b */
        public boolean mo90498b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        /* JADX INFO: renamed from: c */
        public boolean mo90499c() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        /* JADX INFO: renamed from: d */
        public boolean mo90500d() {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo90497a();

    /* JADX INFO: renamed from: b */
    boolean mo90498b();

    /* JADX INFO: renamed from: c */
    boolean mo90499c();

    /* JADX INFO: renamed from: d */
    boolean mo90500d();
}
