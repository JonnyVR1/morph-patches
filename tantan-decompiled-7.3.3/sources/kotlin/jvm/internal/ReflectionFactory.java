package kotlin.jvm.internal;

import java.util.List;
import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectionFactory {
    /* JADX INFO: renamed from: a */
    public KFunction mo88407a(FunctionReference functionReference) {
        return functionReference;
    }

    /* JADX INFO: renamed from: b */
    public KClass mo88408b(Class cls) {
        return new ClassReference(cls);
    }

    /* JADX INFO: renamed from: c */
    public KDeclarationContainer mo88409c(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    /* JADX INFO: renamed from: d */
    public KMutableProperty0 mo88410d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* JADX INFO: renamed from: e */
    public KMutableProperty1 mo88411e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* JADX INFO: renamed from: f */
    public KMutableProperty2 mo88412f(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    /* JADX INFO: renamed from: g */
    public KProperty0 mo88413g(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* JADX INFO: renamed from: h */
    public KProperty1 mo88414h(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* JADX INFO: renamed from: i */
    public KProperty2 mo88415i(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    @SinceKotlin
    /* JADX INFO: renamed from: j */
    public String mo88416j(FunctionBase functionBase) {
        String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    @SinceKotlin
    /* JADX INFO: renamed from: k */
    public String mo88417k(Lambda lambda) {
        return mo88416j(lambda);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: l */
    public KType mo88418l(KClassifier kClassifier, List<KTypeProjection> list, boolean z) {
        return new TypeReference(kClassifier, list, z);
    }
}
