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
import p149l.rad0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Type f64356b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final JavaClassifier f64357c;

    public ReflectJavaClassifierType(@NotNull Type type) {
        JavaClassifier reflectJavaClass;
        type.getClass();
        this.f64356b = type;
        Type typeMo89011I = mo89011I();
        if (typeMo89011I instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) typeMo89011I);
        } else if (typeMo89011I instanceof TypeVariable) {
            reflectJavaClass = new ReflectJavaTypeParameter((TypeVariable) typeMo89011I);
        } else {
            if (!(typeMo89011I instanceof ParameterizedType)) {
                rad0.m178492a("Not a classifier type (", typeMo89011I.getClass(), "): ", typeMo89011I);
                throw null;
            }
            Type rawType = ((ParameterizedType) typeMo89011I).getRawType();
            rawType.getClass();
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.f64357c = reflectJavaClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    /* JADX INFO: renamed from: B */
    public boolean mo89040B() {
        Type typeMo89011I = mo89011I();
        if (typeMo89011I instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeMo89011I).getTypeParameters();
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
    public Type mo89011I() {
        return this.f64356b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    public JavaAnnotation mo89007b(@NotNull FqName fqName) {
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
    public JavaClassifier mo89041i() {
        return this.f64357c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<JavaType> mo89042p() {
        List<Type> listM88994h = ReflectClassUtilKt.m88994h(mo89011I());
        ReflectJavaType.Factory factory = ReflectJavaType.f64368a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM88994h, 10));
        Iterator<T> it = listM88994h.iterator();
        while (it.hasNext()) {
            arrayList.add(factory.m89067a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89014r() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo89043s() {
        return mo89011I().toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* JADX INFO: renamed from: u */
    public String mo89044u() {
        throw new UnsupportedOperationException("Type not found: " + mo89011I());
    }
}
