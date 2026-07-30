package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeRefinementSupport {

    /* JADX INFO: renamed from: a */
    public final boolean f66991a;

    public static final class Enabled extends TypeRefinementSupport {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final KotlinTypeRefiner f66992b;

        @NotNull
        /* JADX INFO: renamed from: b */
        public final KotlinTypeRefiner m93873b() {
            return this.f66992b;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m93872a() {
        return this.f66991a;
    }
}
