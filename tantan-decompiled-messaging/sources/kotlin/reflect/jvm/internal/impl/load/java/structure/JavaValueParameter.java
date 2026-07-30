package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaValueParameter extends JavaAnnotationOwner {
    /* JADX INFO: renamed from: a */
    boolean mo89070a();

    @Nullable
    Name getName();

    @NotNull
    JavaType getType();
}
