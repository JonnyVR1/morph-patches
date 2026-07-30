package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {

    @NotNull
    public static final Companion Companion = Companion.f66985a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f66985a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final NewKotlinTypeCheckerImpl f66986b = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.INSTANCE, null, 2, 0 == true ? 1 : 0);

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final NewKotlinTypeCheckerImpl m93831a() {
            return f66986b;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    OverridingUtil mo93829b();

    @NotNull
    /* JADX INFO: renamed from: c */
    KotlinTypeRefiner mo93830c();
}
