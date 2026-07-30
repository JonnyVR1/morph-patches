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
import p149l.sf80;

/* JADX INFO: renamed from: com.google.common.reflect.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3043a<T, R> implements AnnotatedElement, Member {

    /* JADX INFO: renamed from: a */
    public final AccessibleObject f11303a;

    /* JADX INFO: renamed from: b */
    public final Member f11304b;

    /* JADX INFO: renamed from: com.google.common.reflect.a$a */
    public static class a<T> extends AbstractC3043a<T, T> {

        /* JADX INFO: renamed from: c */
        public final Constructor<?> f11305c;

        public a(Constructor<?> constructor) {
            super(constructor);
            this.f11305c = constructor;
        }

        /* JADX INFO: renamed from: b */
        public Type[] mo16507b() {
            Type[] genericParameterTypes = this.f11305c.getGenericParameterTypes();
            if (genericParameterTypes.length > 0 && m16551c()) {
                Class<?>[] parameterTypes = this.f11305c.getParameterTypes();
                if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                    return (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                }
            }
            return genericParameterTypes;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m16551c() {
            Class<?> declaringClass = this.f11305c.getDeclaringClass();
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
    public static class b<T> extends AbstractC3043a<T, Object> {

        /* JADX INFO: renamed from: c */
        public final Method f11306c;

        public b(Method method) {
            super(method);
            this.f11306c = method;
        }
    }

    public <M extends AccessibleObject & Member> AbstractC3043a(M m) {
        sf80.m183894p(m);
        this.f11303a = m;
        this.f11304b = m;
    }

    /* JADX INFO: renamed from: a */
    public abstract TypeToken<T> mo16506a();

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3043a) {
            AbstractC3043a abstractC3043a = (AbstractC3043a) obj;
            if (mo16506a().equals(abstractC3043a.mo16506a()) && this.f11304b.equals(abstractC3043a.f11304b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f11303a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f11303a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f11303a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f11304b.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f11304b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f11304b.getName();
    }

    public int hashCode() {
        return this.f11304b.hashCode();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f11303a.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f11304b.isSynthetic();
    }

    public String toString() {
        return this.f11304b.toString();
    }
}
