package kotlin.reflect.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.ReflectionFactory;
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
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectLambdaKt;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectionFactoryImpl extends ReflectionFactory {
    /* JADX INFO: renamed from: m */
    public static KDeclarationContainerImpl m88890m(CallableReference callableReference) {
        KDeclarationContainer owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.INSTANCE;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: a */
    public KFunction mo88407a(FunctionReference functionReference) {
        return new KFunctionImpl(m88890m(functionReference), functionReference.getName(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: b */
    public KClass mo88408b(Class cls) {
        return CachesKt.m88559m(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: c */
    public KDeclarationContainer mo88409c(Class cls, String str) {
        return CachesKt.m88560n(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: d */
    public KMutableProperty0 mo88410d(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(m88890m(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: e */
    public KMutableProperty1 mo88411e(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(m88890m(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: f */
    public KMutableProperty2 mo88412f(MutablePropertyReference2 mutablePropertyReference2) {
        return new KMutableProperty2Impl(m88890m(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: g */
    public KProperty0 mo88413g(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(m88890m(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: h */
    public KProperty1 mo88414h(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(m88890m(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: i */
    public KProperty2 mo88415i(PropertyReference2 propertyReference2) {
        return new KProperty2Impl(m88890m(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: j */
    public String mo88416j(FunctionBase functionBase) {
        KFunctionImpl kFunctionImplM88931c;
        KFunction kFunctionM88538a = ReflectLambdaKt.m88538a(functionBase);
        return (kFunctionM88538a == null || (kFunctionImplM88931c = UtilKt.m88931c(kFunctionM88538a)) == null) ? super.mo88416j(functionBase) : ReflectionObjectRenderer.INSTANCE.m88913t(kFunctionImplM88931c);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: k */
    public String mo88417k(Lambda lambda) {
        return mo88416j(lambda);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: l */
    public KType mo88418l(KClassifier kClassifier, List<KTypeProjection> list, boolean z) {
        return kClassifier instanceof ClassBasedDeclarationContainer ? CachesKt.m88557k(((ClassBasedDeclarationContainer) kClassifier).mo88354d(), list, z) : KClassifiers.m88527b(kClassifier, list, z, Collections.EMPTY_LIST);
    }
}
