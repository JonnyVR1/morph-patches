package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import org.jetbrains.annotations.NotNull;
import p149l.ljc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Type f64350b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ReflectJavaType f64351c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Collection<JavaAnnotation> f64352d;

    /* JADX INFO: renamed from: e */
    public final boolean f64353e;

    public ReflectJavaArrayType(@NotNull Type type) {
        ReflectJavaType reflectJavaTypeM89067a;
        type.getClass();
        this.f64350b = type;
        Type typeMo89011I = mo89011I();
        if (!(typeMo89011I instanceof GenericArrayType)) {
            if (typeMo89011I instanceof Class) {
                Class cls = (Class) typeMo89011I;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.f64368a;
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    reflectJavaTypeM89067a = factory.m89067a(componentType);
                }
            }
            StringBuilder sb = new StringBuilder("Not an array type (");
            sb.append(mo89011I().getClass());
            ljc0.m149958a(sb, "): ", mo89011I());
            throw null;
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.f64368a;
        Type genericComponentType = ((GenericArrayType) typeMo89011I).getGenericComponentType();
        genericComponentType.getClass();
        reflectJavaTypeM89067a = factory2.m89067a(genericComponentType);
        this.f64351c = reflectJavaTypeM89067a;
        this.f64352d = CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    /* JADX INFO: renamed from: I */
    public Type mo89011I() {
        return this.f64350b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    @NotNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType mo89013k() {
        return this.f64351c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f64352d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89014r() {
        return this.f64353e;
    }
}
