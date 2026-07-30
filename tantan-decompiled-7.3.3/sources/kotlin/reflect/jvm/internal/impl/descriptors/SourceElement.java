package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SourceElement {

    /* JADX INFO: renamed from: a */
    public static final SourceElement f64737a = new C15304a();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.SourceElement$a */
    public static class C15304a implements SourceElement {
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m89485d(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        @NotNull
        /* JADX INFO: renamed from: b */
        public SourceFile mo89484b() {
            SourceFile sourceFile = SourceFile.f64738a;
            if (sourceFile == null) {
                m89485d(0);
            }
            return sourceFile;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    SourceFile mo89484b();
}
