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
    public static final Factory f65042a = new Factory(null);

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ReflectJavaType m89958a(@NotNull Type type) {
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
    public abstract Type mo89902I();

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    public JavaAnnotation mo89898b(FqName fqName) {
        Object obj;
        Object next;
        ClassId classIdMo89893e;
        fqName.getClass();
        Iterator<T> it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                classIdMo89893e = ((JavaAnnotation) next).mo89893e();
            }
            return (JavaAnnotation) obj;
        } while (!Intrinsics.m88377d(classIdMo89893e != null ? classIdMo89893e.m91925a() : null, fqName));
        obj = next;
        return (JavaAnnotation) obj;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.m88377d(mo89902I(), ((ReflectJavaType) obj).mo89902I());
    }

    public int hashCode() {
        return mo89902I().hashCode();
    }

    @NotNull
    public String toString() {
        return getClass().getName() + ": " + mo89902I();
    }
}
