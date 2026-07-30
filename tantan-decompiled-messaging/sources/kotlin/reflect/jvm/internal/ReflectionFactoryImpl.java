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
    public static KDeclarationContainerImpl m87999m(CallableReference callableReference) {
        KDeclarationContainer owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.INSTANCE;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: a */
    public KFunction mo87518a(FunctionReference functionReference) {
        return new KFunctionImpl(m87999m(functionReference), functionReference.getName(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: b */
    public KClass mo87519b(Class cls) {
        return CachesKt.m87668m(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: c */
    public KDeclarationContainer mo87520c(Class cls, String str) {
        return CachesKt.m87669n(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: d */
    public KMutableProperty0 mo87521d(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(m87999m(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: e */
    public KMutableProperty1 mo87522e(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(m87999m(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: f */
    public KMutableProperty2 mo87523f(MutablePropertyReference2 mutablePropertyReference2) {
        return new KMutableProperty2Impl(m87999m(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: g */
    public KProperty0 mo87524g(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(m87999m(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: h */
    public KProperty1 mo87525h(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(m87999m(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: i */
    public KProperty2 mo87526i(PropertyReference2 propertyReference2) {
        return new KProperty2Impl(m87999m(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: j */
    public String mo87527j(FunctionBase functionBase) {
        KFunctionImpl kFunctionImplM88040c;
        KFunction kFunctionM87647a = ReflectLambdaKt.m87647a(functionBase);
        return (kFunctionM87647a == null || (kFunctionImplM88040c = UtilKt.m88040c(kFunctionM87647a)) == null) ? super.mo87527j(functionBase) : ReflectionObjectRenderer.INSTANCE.m88022t(kFunctionImplM88040c);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: k */
    public String mo87528k(Lambda lambda) {
        return mo87527j(lambda);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* JADX INFO: renamed from: l */
    public KType mo87529l(KClassifier kClassifier, List<KTypeProjection> list, boolean z) {
        return kClassifier instanceof ClassBasedDeclarationContainer ? CachesKt.m87666k(((ClassBasedDeclarationContainer) kClassifier).mo87465d(), list, z) : KClassifiers.m87636b(kClassifier, list, z, Collections.EMPTY_LIST);
    }
}
