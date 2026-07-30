package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FilteredAnnotations implements Annotations {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Annotations f64087a;

    /* JADX INFO: renamed from: b */
    public final boolean f64088b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<FqName, Boolean> f64089c;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredAnnotations(@NotNull Annotations annotations, boolean z, @NotNull Function1<? super FqName, Boolean> function1) {
        annotations.getClass();
        function1.getClass();
        this.f64087a = annotations;
        this.f64088b = z;
        this.f64089c = function1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88652a(AnnotationDescriptor annotationDescriptor) {
        FqName fqNameMo88631d = annotationDescriptor.mo88631d();
        return fqNameMo88631d != null && this.f64089c.invoke(fqNameMo88631d).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: b */
    public AnnotationDescriptor mo88638b(@NotNull FqName fqName) {
        fqName.getClass();
        if (this.f64089c.invoke(fqName).booleanValue()) {
            return this.f64087a.mo88638b(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: c0 */
    public boolean mo88639c0(@NotNull FqName fqName) {
        fqName.getClass();
        if (this.f64089c.invoke(fqName).booleanValue()) {
            return this.f64087a.mo88639c0(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z;
        Annotations annotations = this.f64087a;
        if (!(annotations instanceof Collection) || !((Collection) annotations).isEmpty()) {
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (m88652a(it.next())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (this.f64088b) {
            return !z;
        }
        return z;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        Annotations annotations = this.f64087a;
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            if (m88652a(annotationDescriptor)) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(@NotNull Annotations annotations, @NotNull Function1<? super FqName, Boolean> function1) {
        this(annotations, false, function1);
        annotations.getClass();
        function1.getClass();
    }
}
