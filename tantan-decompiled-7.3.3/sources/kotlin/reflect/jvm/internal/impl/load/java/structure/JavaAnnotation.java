package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaAnnotation extends JavaElement {
    @Nullable
    /* JADX INFO: renamed from: C */
    JavaClass mo89890C();

    @Nullable
    /* JADX INFO: renamed from: e */
    ClassId mo89893e();

    /* JADX INFO: renamed from: f */
    boolean mo89894f();

    @NotNull
    /* JADX INFO: renamed from: j */
    Collection<JavaAnnotationArgument> mo89895j();

    /* JADX INFO: renamed from: t */
    boolean mo89896t();
}
