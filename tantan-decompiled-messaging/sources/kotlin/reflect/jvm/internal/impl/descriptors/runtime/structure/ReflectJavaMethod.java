package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaMethod extends ReflectJavaMember implements JavaMethod {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Method f64362a;

    public ReflectJavaMethod(@NotNull Method method) {
        method.getClass();
        this.f64362a = method;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    /* JADX INFO: renamed from: G */
    public boolean mo89057G() {
        return mo89061m() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Method mo89045J() {
        return this.f64362a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType getReturnType() {
        ReflectJavaType.Factory factory = ReflectJavaType.f64368a;
        Type genericReturnType = mo89045J().getGenericReturnType();
        genericReturnType.getClass();
        return factory.m89067a(genericReturnType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<JavaValueParameter> mo89060g() {
        Type[] genericParameterTypes = mo89045J().getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = mo89045J().getParameterAnnotations();
        parameterAnnotations.getClass();
        return m89055K(genericParameterTypes, parameterAnnotations, mo89045J().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = mo89045J().getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    @Nullable
    /* JADX INFO: renamed from: m */
    public JavaAnnotationArgument mo89061m() {
        Object defaultValue = mo89045J().getDefaultValue();
        if (defaultValue != null) {
            return ReflectJavaAnnotationArgument.f64346b.m89006a(defaultValue, null);
        }
        return null;
    }
}
