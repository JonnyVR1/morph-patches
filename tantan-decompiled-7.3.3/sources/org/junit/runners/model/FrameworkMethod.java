package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import org.junit.internal.runners.model.ReflectiveCallable;
import p153l.mnd0;

/* JADX INFO: loaded from: classes3.dex */
public class FrameworkMethod extends FrameworkMember<FrameworkMethod> {
    private final Method method;

    public FrameworkMethod(Method method) {
        if (method != null) {
            this.method = method;
        } else {
            mnd0.m159157a("FrameworkMethod cannot be created without an underlying method.");
            throw null;
        }
    }

    private Class<?>[] getParameterTypes() {
        return this.method.getParameterTypes();
    }

    public boolean equals(Object obj) {
        if (FrameworkMethod.class.isInstance(obj)) {
            return ((FrameworkMethod) obj).method.equals(this.method);
        }
        return false;
    }

    @Override // org.junit.runners.model.Annotatable
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.method.getAnnotation(cls);
    }

    @Override // org.junit.runners.model.Annotatable
    public Annotation[] getAnnotations() {
        return this.method.getAnnotations();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getDeclaringClass() {
        return this.method.getDeclaringClass();
    }

    public Method getMethod() {
        return this.method;
    }

    @Override // org.junit.runners.model.FrameworkMember
    public int getModifiers() {
        return this.method.getModifiers();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public String getName() {
        return this.method.getName();
    }

    public Class<?> getReturnType() {
        return this.method.getReturnType();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getType() {
        return getReturnType();
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public Object invokeExplosively(final Object obj, final Object... objArr) throws Throwable {
        return new ReflectiveCallable() { // from class: org.junit.runners.model.FrameworkMethod.1
            @Override // org.junit.internal.runners.model.ReflectiveCallable
            public Object runReflectiveCall() throws Throwable {
                return FrameworkMethod.this.method.invoke(obj, objArr);
            }
        }.run();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isShadowedBy(FrameworkMethod frameworkMethod) {
        if (!frameworkMethod.getName().equals(getName()) || frameworkMethod.getParameterTypes().length != getParameterTypes().length) {
            return false;
        }
        for (int i = 0; i < frameworkMethod.getParameterTypes().length; i++) {
            if (!frameworkMethod.getParameterTypes()[i].equals(getParameterTypes()[i])) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public boolean producesType(Type type) {
        return getParameterTypes().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.method.getReturnType());
    }

    public String toString() {
        return this.method.toString();
    }

    public void validateNoTypeParametersOnArgs(List<Throwable> list) {
        new NoGenericTypeParametersValidator(this.method).validate(list);
    }

    public void validatePublicVoid(boolean z, List<Throwable> list) {
        if (isStatic() != z) {
            list.add(new Exception("Method " + this.method.getName() + "() " + (z ? "should" : "should not") + " be static"));
        }
        if (!isPublic()) {
            list.add(new Exception("Method " + this.method.getName() + "() should be public"));
        }
        if (this.method.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.method.getName() + "() should be void"));
        }
    }

    public void validatePublicVoidNoArg(boolean z, List<Throwable> list) {
        validatePublicVoid(z, list);
        if (this.method.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.method.getName() + " should have no parameters"));
        }
    }
}
