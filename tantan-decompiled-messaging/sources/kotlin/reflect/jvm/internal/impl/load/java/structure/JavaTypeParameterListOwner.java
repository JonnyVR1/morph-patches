package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaTypeParameterListOwner extends JavaElement {
    @NotNull
    List<JavaTypeParameter> getTypeParameters();
}
