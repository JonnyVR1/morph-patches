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
    public final Annotations f64761a;

    /* JADX INFO: renamed from: b */
    public final boolean f64762b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<FqName, Boolean> f64763c;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredAnnotations(@NotNull Annotations annotations, boolean z, @NotNull Function1<? super FqName, Boolean> function1) {
        annotations.getClass();
        function1.getClass();
        this.f64761a = annotations;
        this.f64762b = z;
        this.f64763c = function1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89543a(AnnotationDescriptor annotationDescriptor) {
        FqName fqNameMo89522d = annotationDescriptor.mo89522d();
        return fqNameMo89522d != null && this.f64763c.invoke(fqNameMo89522d).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: b */
    public AnnotationDescriptor mo89529b(@NotNull FqName fqName) {
        fqName.getClass();
        if (this.f64763c.invoke(fqName).booleanValue()) {
            return this.f64761a.mo89529b(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: d0 */
    public boolean mo89530d0(@NotNull FqName fqName) {
        fqName.getClass();
        if (this.f64763c.invoke(fqName).booleanValue()) {
            return this.f64761a.mo89530d0(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z;
        Annotations annotations = this.f64761a;
        if (!(annotations instanceof Collection) || !((Collection) annotations).isEmpty()) {
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (m89543a(it.next())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (this.f64762b) {
            return !z;
        }
        return z;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        Annotations annotations = this.f64761a;
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            if (m89543a(annotationDescriptor)) {
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
