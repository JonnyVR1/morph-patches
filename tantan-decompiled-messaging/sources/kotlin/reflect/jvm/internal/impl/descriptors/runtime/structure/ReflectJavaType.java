package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReflectJavaType implements JavaType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Factory f64368a = new Factory(null);

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ReflectJavaType m89067a(@NotNull Type type) {
            type.getClass();
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new ReflectJavaArrayType(type);
            }
            return type instanceof WildcardType ? new ReflectJavaWildcardType((WildcardType) type) : new ReflectJavaClassifierType(type);
        }

        private Factory() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public abstract Type mo89011I();

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    public JavaAnnotation mo89007b(FqName fqName) {
        Object obj;
        Object next;
        ClassId classIdMo89002e;
        fqName.getClass();
        Iterator<T> it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                classIdMo89002e = ((JavaAnnotation) next).mo89002e();
            }
            return (JavaAnnotation) obj;
        } while (!Intrinsics.m87488d(classIdMo89002e != null ? classIdMo89002e.m91034a() : null, fqName));
        obj = next;
        return (JavaAnnotation) obj;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.m87488d(mo89011I(), ((ReflectJavaType) obj).mo89011I());
    }

    public int hashCode() {
        return mo89011I().hashCode();
    }

    @NotNull
    public String toString() {
        return getClass().getName() + ": " + mo89011I();
    }
}
