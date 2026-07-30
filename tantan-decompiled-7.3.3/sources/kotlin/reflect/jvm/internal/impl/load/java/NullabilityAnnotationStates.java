package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface NullabilityAnnotationStates<T> {

    @NotNull
    public static final Companion Companion = Companion.f65415a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f65415a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final NullabilityAnnotationStates f65416b = new NullabilityAnnotationStatesImpl(MapsKt.emptyMap());

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final NullabilityAnnotationStates m90345a() {
            return f65416b;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    T mo90344a(@NotNull FqName fqName);
}
