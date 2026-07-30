package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaModifierListOwner extends JavaElement {
    /* JADX INFO: renamed from: H */
    boolean mo89914H();

    @NotNull
    Visibility getVisibility();

    boolean isAbstract();

    boolean isFinal();
}
