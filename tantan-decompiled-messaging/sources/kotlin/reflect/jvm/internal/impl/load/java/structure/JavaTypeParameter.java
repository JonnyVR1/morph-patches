package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaTypeParameter extends JavaClassifier {
    @NotNull
    Collection<JavaClassifierType> getUpperBounds();
}
