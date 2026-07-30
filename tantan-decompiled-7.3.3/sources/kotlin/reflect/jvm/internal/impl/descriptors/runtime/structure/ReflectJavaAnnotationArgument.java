package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Factory f65020b = new Factory(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Name f65021a;

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ReflectJavaAnnotationArgument m89897a(@NotNull Object obj, @Nullable Name name) {
            obj.getClass();
            if (ReflectClassUtilKt.m89889l(obj.getClass())) {
                return new ReflectJavaEnumValueAnnotationArgument(name, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new ReflectJavaArrayAnnotationArgument(name, (Object[]) obj);
            }
            return obj instanceof Class ? new ReflectJavaClassObjectAnnotationArgument(name, (Class) obj) : new ReflectJavaLiteralAnnotationArgument(name, obj);
        }

        private Factory() {
        }
    }

    public ReflectJavaAnnotationArgument(Name name) {
        this.f65021a = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    @Nullable
    public Name getName() {
        return this.f65021a;
    }

    public /* synthetic */ ReflectJavaAnnotationArgument(Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(name);
    }
}
