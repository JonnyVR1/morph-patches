package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ur5;
import p149l.vr5;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CompositeAnnotations implements Annotations {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<Annotations> f64086a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(@NotNull Annotations... annotationsArr) {
        this((List<? extends Annotations>) ArraysKt.toList(annotationsArr));
        annotationsArr.getClass();
    }

    /* JADX INFO: renamed from: f */
    public static final AnnotationDescriptor m88650f(FqName fqName, Annotations annotations) {
        annotations.getClass();
        return annotations.mo88638b(fqName);
    }

    /* JADX INFO: renamed from: g */
    public static final Sequence m88651g(Annotations annotations) {
        annotations.getClass();
        return CollectionsKt.asSequence(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: b */
    public AnnotationDescriptor mo88638b(@NotNull FqName fqName) {
        fqName.getClass();
        return (AnnotationDescriptor) SequencesKt___SequencesKt.m93288H(SequencesKt___SequencesKt.m93295O(CollectionsKt.asSequence(this.f64086a), new ur5(fqName)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: c0 */
    public boolean mo88639c0(@NotNull FqName fqName) {
        fqName.getClass();
        Iterator it = CollectionsKt.asSequence(this.f64086a).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).mo88639c0(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.f64086a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt___SequencesKt.m93289I(CollectionsKt.asSequence(this.f64086a), vr5.INSTANCE).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(@NotNull List<? extends Annotations> list) {
        list.getClass();
        this.f64086a = list;
    }
}
