package p149l;

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
public final class lmc0 {

    @NotNull
    public static final lmc0 INSTANCE = new lmc0();

    /* JADX INFO: renamed from: a */
    public final ClassLiteralValue m150561a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.isPrimitive()) {
            if (Intrinsics.m87488d(cls, Void.TYPE)) {
                return new ClassLiteralValue(ClassId.Companion.m91045c(StandardNames.FqNames.f63890e.m91068m()), i);
            }
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            primitiveType.getClass();
            return i > 0 ? new ClassLiteralValue(ClassId.Companion.m91045c(primitiveType.getArrayTypeFqName()), i - 1) : new ClassLiteralValue(ClassId.Companion.m91045c(primitiveType.getTypeFqName()), i);
        }
        ClassId classIdM88991e = ReflectClassUtilKt.m88991e(cls);
        ClassId classIdM88355m = JavaToKotlinClassMap.INSTANCE.m88355m(classIdM88991e.m91034a());
        if (classIdM88355m != null) {
            classIdM88991e = classIdM88355m;
        }
        return new ClassLiteralValue(classIdM88991e, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m150562b(@NotNull Class<?> cls, @NotNull KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) {
        cls.getClass();
        annotationVisitor.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            m150566f(annotationVisitor, annotation);
        }
        annotationVisitor.visitEnd();
    }

    /* JADX INFO: renamed from: c */
    public final void m150563c(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Constructor<?>[] constructorArr;
        int i;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        declaredConstructors.getClass();
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor<?> constructor = declaredConstructors[i2];
            Name name = SpecialNames.f65494i;
            vef0 vef0Var = vef0.INSTANCE;
            constructor.getClass();
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorMo90135a = memberVisitor.mo90135a(name, vef0Var.m198177a(constructor));
            if (methodAnnotationVisitorMo90135a == null) {
                constructorArr = declaredConstructors;
                i = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    m150566f(methodAnnotationVisitorMo90135a, annotation);
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
                            Class<?> clsM87452b = JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            ClassId classIdM88991e = ReflectClassUtilKt.m88991e(clsM87452b);
                            int i5 = length;
                            annotation2.getClass();
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo90137a = methodAnnotationVisitorMo90135a.mo90137a(i3 + length2, classIdM88991e, new ReflectAnnotationSource(annotation2));
                            if (annotationArgumentVisitorMo90137a != null) {
                                INSTANCE.m150568h(annotationArgumentVisitorMo90137a, annotation2, clsM87452b);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i5;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                methodAnnotationVisitorMo90135a.visitEnd();
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m150564d(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            Name nameM91079i = Name.m91079i(field.getName());
            nameM91079i.getClass();
            KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorMo90136b = memberVisitor.mo90136b(nameM91079i, vef0.INSTANCE.m198178b(field), null);
            if (annotationVisitorMo90136b != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    m150566f(annotationVisitorMo90136b, annotation);
                }
                annotationVisitorMo90136b.visitEnd();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m150565e(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            Name nameM91079i = Name.m91079i(method.getName());
            nameM91079i.getClass();
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorMo90135a = memberVisitor.mo90135a(nameM91079i, vef0.INSTANCE.m198179c(method));
            if (methodAnnotationVisitorMo90135a != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    m150566f(methodAnnotationVisitorMo90135a, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                parameterAnnotations.getClass();
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i = 0; i < length; i++) {
                    Annotation[] annotationArr2 = annotationArr[i];
                    annotationArr2.getClass();
                    for (Annotation annotation2 : annotationArr2) {
                        Class<?> clsM87452b = JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a(annotation2));
                        ClassId classIdM88991e = ReflectClassUtilKt.m88991e(clsM87452b);
                        annotation2.getClass();
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo90137a = methodAnnotationVisitorMo90135a.mo90137a(i, classIdM88991e, new ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorMo90137a != null) {
                            INSTANCE.m150568h(annotationArgumentVisitorMo90137a, annotation2, clsM87452b);
                        }
                    }
                }
                methodAnnotationVisitorMo90135a.visitEnd();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m150566f(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws InvocationTargetException {
        Class<?> clsM87452b = JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo88132b = annotationVisitor.mo88132b(ReflectClassUtilKt.m88991e(clsM87452b), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorMo88132b != null) {
            INSTANCE.m150568h(annotationArgumentVisitorMo88132b, annotation, clsM87452b);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m150567g(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (Intrinsics.m87488d(enclosingClass, Class.class)) {
            annotationArgumentVisitor.mo90181c(name, m150561a((Class) obj));
            return;
        }
        if (ReflectKotlinClassKt.f64326a.contains(enclosingClass)) {
            annotationArgumentVisitor.mo90182d(name, obj);
            return;
        }
        if (ReflectClassUtilKt.m88998l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            ClassId classIdM88991e = ReflectClassUtilKt.m88991e(enclosingClass);
            Name nameM91079i = Name.m91079i(((Enum) obj).name());
            nameM91079i.getClass();
            annotationArgumentVisitor.mo90179a(name, classIdM88991e, nameM91079i);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            interfaces.getClass();
            Class<?> cls = (Class) ArraysKt.single(interfaces);
            cls.getClass();
            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo90180b = annotationArgumentVisitor.mo90180b(name, ReflectClassUtilKt.m88991e(cls));
            if (annotationArgumentVisitorMo90180b == null) {
                return;
            }
            m150568h(annotationArgumentVisitorMo90180b, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorMo90183e = annotationArgumentVisitor.mo90183e(name);
        if (annotationArrayArgumentVisitorMo90183e == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i = 0;
        if (componentType.isEnum()) {
            ClassId classIdM88991e2 = ReflectClassUtilKt.m88991e(componentType);
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i < length) {
                Object obj2 = objArr[i];
                obj2.getClass();
                Name nameM91079i2 = Name.m91079i(((Enum) obj2).name());
                nameM91079i2.getClass();
                annotationArrayArgumentVisitorMo90183e.mo90189c(classIdM88991e2, nameM91079i2);
                i++;
            }
        } else if (Intrinsics.m87488d(componentType, Class.class)) {
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i < length2) {
                Object obj3 = objArr2[i];
                obj3.getClass();
                annotationArrayArgumentVisitorMo90183e.mo90190d(m150561a((Class) obj3));
                i++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i < length3) {
                Object obj4 = objArr3[i];
                KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo90188b = annotationArrayArgumentVisitorMo90183e.mo90188b(ReflectClassUtilKt.m88991e(componentType));
                if (annotationArgumentVisitorMo90188b != null) {
                    obj4.getClass();
                    m150568h(annotationArgumentVisitorMo90188b, (Annotation) obj4, componentType);
                }
                i++;
            }
        } else {
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i < length4) {
                annotationArrayArgumentVisitorMo90183e.mo90187a(objArr4[i]);
                i++;
            }
        }
        annotationArrayArgumentVisitorMo90183e.visitEnd();
    }

    /* JADX INFO: renamed from: h */
    public final void m150568h(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                Name nameM91079i = Name.m91079i(method.getName());
                nameM91079i.getClass();
                m150567g(annotationArgumentVisitor, nameM91079i, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    /* JADX INFO: renamed from: i */
    public final void m150569i(@NotNull Class<?> cls, @NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        cls.getClass();
        memberVisitor.getClass();
        m150565e(cls, memberVisitor);
        m150563c(cls, memberVisitor);
        m150564d(cls, memberVisitor);
    }
}
