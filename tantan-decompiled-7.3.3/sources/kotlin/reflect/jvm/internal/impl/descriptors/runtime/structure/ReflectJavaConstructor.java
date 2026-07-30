package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import org.jetbrains.annotations.NotNull;
import p153l.qg50;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Constructor<?> f65032a;

    public ReflectJavaConstructor(@NotNull Constructor<?> constructor) {
        constructor.getClass();
        this.f65032a = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Constructor<?> mo89936J() {
        return this.f65032a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<JavaValueParameter> mo89938g() {
        Type[] genericParameterTypes = mo89936J().getGenericParameterTypes();
        genericParameterTypes.getClass();
        if (genericParameterTypes.length == 0) {
            return CollectionsKt.emptyList();
        }
        Class<?> declaringClass = mo89936J().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) ArraysKt.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = mo89936J().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            qg50.m176437a("Illegal generic signature: ", mo89936J());
            return null;
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            parameterAnnotations.getClass();
            parameterAnnotations = (Annotation[][]) ArraysKt.copyOfRange(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        parameterAnnotations.getClass();
        return m89946K(genericParameterTypes, parameterAnnotations, mo89936J().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = mo89936J().getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }
}
