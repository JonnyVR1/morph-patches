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
    public static final ReflectionFactory f64191a;

    /* JADX INFO: renamed from: b */
    public static final KClass[] f64192b;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f64191a = reflectionFactory;
        f64192b = new KClass[0];
    }

    /* JADX INFO: renamed from: a */
    public static KFunction m88395a(FunctionReference functionReference) {
        return f64191a.mo88407a(functionReference);
    }

    /* JADX INFO: renamed from: b */
    public static KClass m88396b(Class cls) {
        return f64191a.mo88408b(cls);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: c */
    public static KDeclarationContainer m88397c(Class cls) {
        return f64191a.mo88409c(cls, "");
    }

    /* JADX INFO: renamed from: d */
    public static KMutableProperty0 m88398d(MutablePropertyReference0 mutablePropertyReference0) {
        return f64191a.mo88410d(mutablePropertyReference0);
    }

    /* JADX INFO: renamed from: e */
    public static KMutableProperty1 m88399e(MutablePropertyReference1 mutablePropertyReference1) {
        return f64191a.mo88411e(mutablePropertyReference1);
    }

    /* JADX INFO: renamed from: f */
    public static KMutableProperty2 m88400f(MutablePropertyReference2 mutablePropertyReference2) {
        return f64191a.mo88412f(mutablePropertyReference2);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: g */
    public static KType m88401g(Class cls) {
        return f64191a.mo88418l(m88396b(cls), Collections.EMPTY_LIST, true);
    }

    /* JADX INFO: renamed from: h */
    public static KProperty0 m88402h(PropertyReference0 propertyReference0) {
        return f64191a.mo88413g(propertyReference0);
    }

    /* JADX INFO: renamed from: i */
    public static KProperty1 m88403i(PropertyReference1 propertyReference1) {
        return f64191a.mo88414h(propertyReference1);
    }

    /* JADX INFO: renamed from: j */
    public static KProperty2 m88404j(PropertyReference2 propertyReference2) {
        return f64191a.mo88415i(propertyReference2);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: k */
    public static String m88405k(FunctionBase functionBase) {
        return f64191a.mo88416j(functionBase);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: l */
    public static String m88406l(Lambda lambda) {
        return f64191a.mo88417k(lambda);
    }
}
