package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ExcludedTypeAnnotations {

    @NotNull
    public static final ExcludedTypeAnnotations INSTANCE = new ExcludedTypeAnnotations();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Set<FqName> f66481a = SetsKt.setOf((Object[]) new FqName[]{new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact")});

    private ExcludedTypeAnnotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Set<FqName> m92589a() {
        return f66481a;
    }
}
