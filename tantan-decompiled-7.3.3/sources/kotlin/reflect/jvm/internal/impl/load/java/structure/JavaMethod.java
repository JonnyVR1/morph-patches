package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaMethod extends JavaMember, JavaTypeParameterListOwner {
    /* JADX INFO: renamed from: G */
    boolean mo89948G();

    @NotNull
    /* JADX INFO: renamed from: g */
    List<JavaValueParameter> mo89951g();

    @NotNull
    JavaType getReturnType();

    @Nullable
    /* JADX INFO: renamed from: m */
    JavaAnnotationArgument mo89952m();
}
