package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.uid0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Type f65030b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final JavaClassifier f65031c;

    public ReflectJavaClassifierType(@NotNull Type type) {
        JavaClassifier reflectJavaClass;
        type.getClass();
        this.f65030b = type;
        Type typeMo89902I = mo89902I();
        if (typeMo89902I instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) typeMo89902I);
        } else if (typeMo89902I instanceof TypeVariable) {
            reflectJavaClass = new ReflectJavaTypeParameter((TypeVariable) typeMo89902I);
        } else {
            if (!(typeMo89902I instanceof ParameterizedType)) {
                uid0.m196153a("Not a classifier type (", typeMo89902I.getClass(), "): ", typeMo89902I);
                throw null;
            }
            Type rawType = ((ParameterizedType) typeMo89902I).getRawType();
            rawType.getClass();
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.f65031c = reflectJavaClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    /* JADX INFO: renamed from: B */
    public boolean mo89931B() {
        Type typeMo89902I = mo89902I();
        if (typeMo89902I instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeMo89902I).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    /* JADX INFO: renamed from: I */
    public Type mo89902I() {
        return this.f65030b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    public JavaAnnotation mo89898b(@NotNull FqName fqName) {
        fqName.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* JADX INFO: renamed from: i */
    public JavaClassifier mo89932i() {
        return this.f65031c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<JavaType> mo89933p() {
        List<Type> listM89885h = ReflectClassUtilKt.m89885h(mo89902I());
        ReflectJavaType.Factory factory = ReflectJavaType.f65042a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89885h, 10));
        Iterator<T> it = listM89885h.iterator();
        while (it.hasNext()) {
            arrayList.add(factory.m89958a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89905r() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo89934s() {
        return mo89902I().toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* JADX INFO: renamed from: u */
    public String mo89935u() {
        throw new UnsupportedOperationException("Type not found: " + mo89902I());
    }
}
