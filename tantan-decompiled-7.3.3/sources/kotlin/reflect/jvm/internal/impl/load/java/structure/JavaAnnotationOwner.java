package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaAnnotationOwner extends JavaElement {
    @Nullable
    /* JADX INFO: renamed from: b */
    JavaAnnotation mo89898b(@NotNull FqName fqName);

    @NotNull
    Collection<JavaAnnotation> getAnnotations();

    /* JADX INFO: renamed from: r */
    boolean mo89905r();
}
