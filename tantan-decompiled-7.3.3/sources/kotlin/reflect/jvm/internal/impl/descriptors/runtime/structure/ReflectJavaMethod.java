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
    public final Method f65036a;

    public ReflectJavaMethod(@NotNull Method method) {
        method.getClass();
        this.f65036a = method;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    /* JADX INFO: renamed from: G */
    public boolean mo89948G() {
        return mo89952m() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Method mo89936J() {
        return this.f65036a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType getReturnType() {
        ReflectJavaType.Factory factory = ReflectJavaType.f65042a;
        Type genericReturnType = mo89936J().getGenericReturnType();
        genericReturnType.getClass();
        return factory.m89958a(genericReturnType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<JavaValueParameter> mo89951g() {
        Type[] genericParameterTypes = mo89936J().getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = mo89936J().getParameterAnnotations();
        parameterAnnotations.getClass();
        return m89946K(genericParameterTypes, parameterAnnotations, mo89936J().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = mo89936J().getTypeParameters();
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
    public JavaAnnotationArgument mo89952m() {
        Object defaultValue = mo89936J().getDefaultValue();
        if (defaultValue != null) {
            return ReflectJavaAnnotationArgument.f65020b.m89897a(defaultValue, null);
        }
        return null;
    }
}
