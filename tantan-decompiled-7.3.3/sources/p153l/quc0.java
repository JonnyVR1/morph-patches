package p153l;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class quc0 {

    @NotNull
    public static final quc0 INSTANCE = new quc0();

    /* JADX INFO: renamed from: a */
    public final ClassLiteralValue m178137a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.isPrimitive()) {
            if (Intrinsics.m88377d(cls, Void.TYPE)) {
                return new ClassLiteralValue(ClassId.Companion.m91936c(StandardNames.FqNames.f64564e.m91959m()), i);
            }
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            primitiveType.getClass();
            return i > 0 ? new ClassLiteralValue(ClassId.Companion.m91936c(primitiveType.getArrayTypeFqName()), i - 1) : new ClassLiteralValue(ClassId.Companion.m91936c(primitiveType.getTypeFqName()), i);
        }
        ClassId classIdM89882e = ReflectClassUtilKt.m89882e(cls);
        ClassId classIdM89246m = JavaToKotlinClassMap.INSTANCE.m89246m(classIdM89882e.m91925a());
        if (classIdM89246m != null) {
            classIdM89882e = classIdM89246m;
        }
        return new ClassLiteralValue(classIdM89882e, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m178138b(@NotNull Class<?> cls, @NotNull KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) {
        cls.getClass();
        annotationVisitor.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            m178142f(annotationVisitor, annotation);
        }
        annotationVisitor.visitEnd();
    }

    /* JADX INFO: renamed from: c */
    public final void m178139c(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Constructor<?>[] constructorArr;
        int i;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        declaredConstructors.getClass();
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor<?> constructor = declaredConstructors[i2];
            Name name = SpecialNames.f66168i;
            cnf0 cnf0Var = cnf0.INSTANCE;
            constructor.getClass();
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorMo91026a = memberVisitor.mo91026a(name, cnf0Var.m111500a(constructor));
            if (methodAnnotationVisitorMo91026a == null) {
                constructorArr = declaredConstructors;
                i = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    m178142f(methodAnnotationVisitorMo91026a, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                parameterAnnotations.getClass();
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        Annotation[] annotationArr = parameterAnnotations[i3];
                        annotationArr.getClass();
                        int length4 = annotationArr.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            Annotation annotation2 = annotationArr[i4];
                            Class<?> clsM88341b = JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            ClassId classIdM89882e = ReflectClassUtilKt.m89882e(clsM88341b);
                            int i5 = length;
                            annotation2.getClass();
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo91028a = methodAnnotationVisitorMo91026a.mo91028a(i3 + length2, classIdM89882e, new ReflectAnnotationSource(annotation2));
                            if (annotationArgumentVisitorMo91028a != null) {
                                INSTANCE.m178144h(annotationArgumentVisitorMo91028a, annotation2, clsM88341b);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i5;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                methodAnnotationVisitorMo91026a.visitEnd();
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m178140d(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            Name nameM91970i = Name.m91970i(field.getName());
            nameM91970i.getClass();
            KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorMo91027b = memberVisitor.mo91027b(nameM91970i, cnf0.INSTANCE.m111501b(field), null);
            if (annotationVisitorMo91027b != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    m178142f(annotationVisitorMo91027b, annotation);
                }
                annotationVisitorMo91027b.visitEnd();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m178141e(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            Name nameM91970i = Name.m91970i(method.getName());
            nameM91970i.getClass();
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorMo91026a = memberVisitor.mo91026a(nameM91970i, cnf0.INSTANCE.m111502c(method));
            if (methodAnnotationVisitorMo91026a != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    m178142f(methodAnnotationVisitorMo91026a, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                parameterAnnotations.getClass();
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i = 0; i < length; i++) {
                    Annotation[] annotationArr2 = annotationArr[i];
                    annotationArr2.getClass();
                    for (Annotation annotation2 : annotationArr2) {
                        Class<?> clsM88341b = JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a(annotation2));
                        ClassId classIdM89882e = ReflectClassUtilKt.m89882e(clsM88341b);
                        annotation2.getClass();
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo91028a = methodAnnotationVisitorMo91026a.mo91028a(i, classIdM89882e, new ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorMo91028a != null) {
                            INSTANCE.m178144h(annotationArgumentVisitorMo91028a, annotation2, clsM88341b);
                        }
                    }
                }
                methodAnnotationVisitorMo91026a.visitEnd();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m178142f(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws InvocationTargetException {
        Class<?> clsM88341b = JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo89023b = annotationVisitor.mo89023b(ReflectClassUtilKt.m89882e(clsM88341b), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorMo89023b != null) {
            INSTANCE.m178144h(annotationArgumentVisitorMo89023b, annotation, clsM88341b);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m178143g(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (Intrinsics.m88377d(enclosingClass, Class.class)) {
            annotationArgumentVisitor.mo91072c(name, m178137a((Class) obj));
            return;
        }
        if (ReflectKotlinClassKt.f65000a.contains(enclosingClass)) {
            annotationArgumentVisitor.mo91073d(name, obj);
            return;
        }
        if (ReflectClassUtilKt.m89889l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            ClassId classIdM89882e = ReflectClassUtilKt.m89882e(enclosingClass);
            Name nameM91970i = Name.m91970i(((Enum) obj).name());
            nameM91970i.getClass();
            annotationArgumentVisitor.mo91070a(name, classIdM89882e, nameM91970i);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            interfaces.getClass();
            Class<?> cls = (Class) ArraysKt.single(interfaces);
            cls.getClass();
            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo91071b = annotationArgumentVisitor.mo91071b(name, ReflectClassUtilKt.m89882e(cls));
            if (annotationArgumentVisitorMo91071b == null) {
                return;
            }
            m178144h(annotationArgumentVisitorMo91071b, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorMo91074e = annotationArgumentVisitor.mo91074e(name);
        if (annotationArrayArgumentVisitorMo91074e == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i = 0;
        if (componentType.isEnum()) {
            ClassId classIdM89882e2 = ReflectClassUtilKt.m89882e(componentType);
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i < length) {
                Object obj2 = objArr[i];
                obj2.getClass();
                Name nameM91970i2 = Name.m91970i(((Enum) obj2).name());
                nameM91970i2.getClass();
                annotationArrayArgumentVisitorMo91074e.mo91080c(classIdM89882e2, nameM91970i2);
                i++;
            }
        } else if (Intrinsics.m88377d(componentType, Class.class)) {
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i < length2) {
                Object obj3 = objArr2[i];
                obj3.getClass();
                annotationArrayArgumentVisitorMo91074e.mo91081d(m178137a((Class) obj3));
                i++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i < length3) {
                Object obj4 = objArr3[i];
                KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo91079b = annotationArrayArgumentVisitorMo91074e.mo91079b(ReflectClassUtilKt.m89882e(componentType));
                if (annotationArgumentVisitorMo91079b != null) {
                    obj4.getClass();
                    m178144h(annotationArgumentVisitorMo91079b, (Annotation) obj4, componentType);
                }
                i++;
            }
        } else {
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i < length4) {
                annotationArrayArgumentVisitorMo91074e.mo91078a(objArr4[i]);
                i++;
            }
        }
        annotationArrayArgumentVisitorMo91074e.visitEnd();
    }

    /* JADX INFO: renamed from: h */
    public final void m178144h(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                Name nameM91970i = Name.m91970i(method.getName());
                nameM91970i.getClass();
                m178143g(annotationArgumentVisitor, nameM91970i, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    /* JADX INFO: renamed from: i */
    public final void m178145i(@NotNull Class<?> cls, @NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        cls.getClass();
        memberVisitor.getClass();
        m178141e(cls, memberVisitor);
        m178139c(cls, memberVisitor);
        m178140d(cls, memberVisitor);
    }
}
