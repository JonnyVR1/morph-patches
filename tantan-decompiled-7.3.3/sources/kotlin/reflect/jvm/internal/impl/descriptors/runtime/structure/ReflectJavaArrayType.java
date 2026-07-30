package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import org.jetbrains.annotations.NotNull;
import p153l.src0;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Type f65024b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ReflectJavaType f65025c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Collection<JavaAnnotation> f65026d;

    /* JADX INFO: renamed from: e */
    public final boolean f65027e;

    public ReflectJavaArrayType(@NotNull Type type) {
        ReflectJavaType reflectJavaTypeM89958a;
        type.getClass();
        this.f65024b = type;
        Type typeMo89902I = mo89902I();
        if (!(typeMo89902I instanceof GenericArrayType)) {
            if (typeMo89902I instanceof Class) {
                Class cls = (Class) typeMo89902I;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.f65042a;
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    reflectJavaTypeM89958a = factory.m89958a(componentType);
                }
            }
            StringBuilder sb = new StringBuilder("Not an array type (");
            sb.append(mo89902I().getClass());
            src0.m187593a(sb, "): ", mo89902I());
            throw null;
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.f65042a;
        Type genericComponentType = ((GenericArrayType) typeMo89902I).getGenericComponentType();
        genericComponentType.getClass();
        reflectJavaTypeM89958a = factory2.m89958a(genericComponentType);
        this.f65025c = reflectJavaTypeM89958a;
        this.f65026d = CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    /* JADX INFO: renamed from: I */
    public Type mo89902I() {
        return this.f65024b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    @NotNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType mo89904k() {
        return this.f65025c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f65026d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89905r() {
        return this.f65027e;
    }
}
