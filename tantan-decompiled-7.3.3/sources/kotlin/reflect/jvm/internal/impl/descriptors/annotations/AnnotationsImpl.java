package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsImpl implements Annotations {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<AnnotationDescriptor> f64754a;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsImpl(@NotNull List<? extends AnnotationDescriptor> list) {
        list.getClass();
        this.f64754a = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: b */
    public /* bridge */ AnnotationDescriptor mo89529b(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.m89534a(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: d0 */
    public /* bridge */ boolean mo89530d0(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.m89535b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f64754a.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return this.f64754a.iterator();
    }

    @NotNull
    public String toString() {
        return this.f64754a.toString();
    }
}
