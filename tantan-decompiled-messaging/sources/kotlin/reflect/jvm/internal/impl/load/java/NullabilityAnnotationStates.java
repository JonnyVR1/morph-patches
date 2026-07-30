package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface NullabilityAnnotationStates<T> {

    @NotNull
    public static final Companion Companion = Companion.f64741a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f64741a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final NullabilityAnnotationStates f64742b = new NullabilityAnnotationStatesImpl(MapsKt.emptyMap());

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final NullabilityAnnotationStates m89454a() {
            return f64742b;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    T mo89453a(@NotNull FqName fqName);
}
