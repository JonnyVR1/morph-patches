package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {

    @NotNull
    public static final RuntimeSourceElementFactory INSTANCE = new RuntimeSourceElementFactory();

    public static final class RuntimeSourceElement implements JavaSourceElement {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final ReflectJavaElement f65003b;

        public RuntimeSourceElement(@NotNull ReflectJavaElement reflectJavaElement) {
            reflectJavaElement.getClass();
            this.f65003b = reflectJavaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        @NotNull
        /* JADX INFO: renamed from: b */
        public SourceFile mo89484b() {
            SourceFile sourceFile = SourceFile.f64738a;
            sourceFile.getClass();
            return sourceFile;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ReflectJavaElement mo89856c() {
            return this.f65003b;
        }

        @NotNull
        public String toString() {
            return RuntimeSourceElement.class.getName() + ": " + mo89856c();
        }
    }

    private RuntimeSourceElementFactory() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    @NotNull
    /* JADX INFO: renamed from: a */
    public JavaSourceElement mo89855a(@NotNull JavaElement javaElement) {
        javaElement.getClass();
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }
}
