package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* JADX INFO: loaded from: classes2.dex */
public class Reflection {

    /* JADX INFO: renamed from: a */
    public static final ReflectionFactory f63517a;

    /* JADX INFO: renamed from: b */
    public static final KClass[] f63518b;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f63517a = reflectionFactory;
        f63518b = new KClass[0];
    }

    /* JADX INFO: renamed from: a */
    public static KFunction m87506a(FunctionReference functionReference) {
        return f63517a.mo87518a(functionReference);
    }

    /* JADX INFO: renamed from: b */
    public static KClass m87507b(Class cls) {
        return f63517a.mo87519b(cls);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: c */
    public static KDeclarationContainer m87508c(Class cls) {
        return f63517a.mo87520c(cls, "");
    }

    /* JADX INFO: renamed from: d */
    public static KMutableProperty0 m87509d(MutablePropertyReference0 mutablePropertyReference0) {
        return f63517a.mo87521d(mutablePropertyReference0);
    }

    /* JADX INFO: renamed from: e */
    public static KMutableProperty1 m87510e(MutablePropertyReference1 mutablePropertyReference1) {
        return f63517a.mo87522e(mutablePropertyReference1);
    }

    /* JADX INFO: renamed from: f */
    public static KMutableProperty2 m87511f(MutablePropertyReference2 mutablePropertyReference2) {
        return f63517a.mo87523f(mutablePropertyReference2);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: g */
    public static KType m87512g(Class cls) {
        return f63517a.mo87529l(m87507b(cls), Collections.EMPTY_LIST, true);
    }

    /* JADX INFO: renamed from: h */
    public static KProperty0 m87513h(PropertyReference0 propertyReference0) {
        return f63517a.mo87524g(propertyReference0);
    }

    /* JADX INFO: renamed from: i */
    public static KProperty1 m87514i(PropertyReference1 propertyReference1) {
        return f63517a.mo87525h(propertyReference1);
    }

    /* JADX INFO: renamed from: j */
    public static KProperty2 m87515j(PropertyReference2 propertyReference2) {
        return f63517a.mo87526i(propertyReference2);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: k */
    public static String m87516k(FunctionBase functionBase) {
        return f63517a.mo87527j(functionBase);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: l */
    public static String m87517l(Lambda lambda) {
        return f63517a.mo87528k(lambda);
    }
}
