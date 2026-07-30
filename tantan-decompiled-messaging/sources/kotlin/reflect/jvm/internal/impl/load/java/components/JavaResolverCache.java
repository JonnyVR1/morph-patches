package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaResolverCache {

    /* JADX INFO: renamed from: a */
    public static final JavaResolverCache f64782a = new C15215a();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache$a */
    public static class C15215a implements JavaResolverCache {
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m89539f(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        /* JADX INFO: renamed from: a */
        public void mo89534a(@NotNull JavaElement javaElement, @NotNull ConstructorDescriptor constructorDescriptor) {
            if (javaElement == null) {
                m89539f(3);
            }
            if (constructorDescriptor == null) {
                m89539f(4);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        /* JADX INFO: renamed from: b */
        public void mo89535b(@NotNull JavaMember javaMember, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
            if (javaMember == null) {
                m89539f(1);
            }
            if (simpleFunctionDescriptor == null) {
                m89539f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        /* JADX INFO: renamed from: c */
        public void mo89536c(@NotNull JavaClass javaClass, @NotNull ClassDescriptor classDescriptor) {
            if (javaClass == null) {
                m89539f(7);
            }
            if (classDescriptor == null) {
                m89539f(8);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        /* JADX INFO: renamed from: d */
        public void mo89537d(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor) {
            if (javaField == null) {
                m89539f(5);
            }
            if (propertyDescriptor == null) {
                m89539f(6);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        @Nullable
        /* JADX INFO: renamed from: e */
        public ClassDescriptor mo89538e(@NotNull FqName fqName) {
            if (fqName != null) {
                return null;
            }
            m89539f(0);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo89534a(@NotNull JavaElement javaElement, @NotNull ConstructorDescriptor constructorDescriptor);

    /* JADX INFO: renamed from: b */
    void mo89535b(@NotNull JavaMember javaMember, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor);

    /* JADX INFO: renamed from: c */
    void mo89536c(@NotNull JavaClass javaClass, @NotNull ClassDescriptor classDescriptor);

    /* JADX INFO: renamed from: d */
    void mo89537d(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor);

    @Nullable
    /* JADX INFO: renamed from: e */
    ClassDescriptor mo89538e(@NotNull FqName fqName);
}
