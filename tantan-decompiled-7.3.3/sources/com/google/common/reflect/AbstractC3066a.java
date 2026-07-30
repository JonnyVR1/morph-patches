package com.google.common.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.reflect.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3066a<T, R> implements AnnotatedElement, Member {

    /* JADX INFO: renamed from: a */
    public final AccessibleObject f11340a;

    /* JADX INFO: renamed from: b */
    public final Member f11341b;

    /* JADX INFO: renamed from: com.google.common.reflect.a$a */
    public static class a<T> extends AbstractC3066a<T, T> {

        /* JADX INFO: renamed from: c */
        public final Constructor<?> f11342c;

        public a(Constructor<?> constructor) {
            super(constructor);
            this.f11342c = constructor;
        }

        /* JADX INFO: renamed from: b */
        public Type[] mo16562b() {
            Type[] genericParameterTypes = this.f11342c.getGenericParameterTypes();
            if (genericParameterTypes.length > 0 && m16606c()) {
                Class<?>[] parameterTypes = this.f11342c.getParameterTypes();
                if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                    return (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                }
            }
            return genericParameterTypes;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m16606c() {
            Class<?> declaringClass = this.f11342c.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            return (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.a$b */
    public static class b<T> extends AbstractC3066a<T, Object> {

        /* JADX INFO: renamed from: c */
        public final Method f11343c;

        public b(Method method) {
            super(method);
            this.f11343c = method;
        }
    }

    public <M extends AccessibleObject & Member> AbstractC3066a(M m) {
        xn80.m212111p(m);
        this.f11340a = m;
        this.f11341b = m;
    }

    /* JADX INFO: renamed from: a */
    public abstract TypeToken<T> mo16561a();

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3066a) {
            AbstractC3066a abstractC3066a = (AbstractC3066a) obj;
            if (mo16561a().equals(abstractC3066a.mo16561a()) && this.f11341b.equals(abstractC3066a.f11341b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f11340a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f11340a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f11340a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f11341b.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f11341b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f11341b.getName();
    }

    public int hashCode() {
        return this.f11341b.hashCode();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f11340a.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f11341b.isSynthetic();
    }

    public String toString() {
        return this.f11341b.toString();
    }
}
