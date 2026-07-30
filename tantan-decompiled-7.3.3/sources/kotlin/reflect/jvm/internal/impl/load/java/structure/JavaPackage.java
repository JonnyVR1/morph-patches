package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaPackage extends JavaAnnotationOwner {
    @NotNull
    /* JADX INFO: renamed from: E */
    Collection<JavaClass> mo89953E(@NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    /* JADX INFO: renamed from: d */
    FqName mo89954d();

    @NotNull
    /* JADX INFO: renamed from: n */
    Collection<JavaPackage> mo89955n();
}
