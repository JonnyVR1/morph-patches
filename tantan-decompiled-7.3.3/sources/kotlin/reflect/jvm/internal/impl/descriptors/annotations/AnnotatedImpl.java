package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotatedImpl implements Annotated {

    /* JADX INFO: renamed from: a */
    public final Annotations f64743a;

    public AnnotatedImpl(@NotNull Annotations annotations) {
        if (annotations == null) {
            m89520P(0);
        }
        this.f64743a = annotations;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89520P(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.f64743a;
        if (annotations == null) {
            m89520P(1);
        }
        return annotations;
    }
}
