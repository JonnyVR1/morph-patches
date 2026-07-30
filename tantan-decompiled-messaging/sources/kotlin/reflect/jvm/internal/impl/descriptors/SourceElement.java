package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SourceElement {

    /* JADX INFO: renamed from: a */
    public static final SourceElement f64063a = new C15197a();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.SourceElement$a */
    public static class C15197a implements SourceElement {
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m88594d(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        @NotNull
        /* JADX INFO: renamed from: b */
        public SourceFile mo88593b() {
            SourceFile sourceFile = SourceFile.f64064a;
            if (sourceFile == null) {
                m88594d(0);
            }
            return sourceFile;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    SourceFile mo88593b();
}
