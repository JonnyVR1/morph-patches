package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeRefinementSupport {

    /* JADX INFO: renamed from: a */
    public final boolean f66317a;

    public static final class Enabled extends TypeRefinementSupport {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final KotlinTypeRefiner f66318b;

        @NotNull
        /* JADX INFO: renamed from: b */
        public final KotlinTypeRefiner m92982b() {
            return this.f66318b;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92981a() {
        return this.f66317a;
    }
}
