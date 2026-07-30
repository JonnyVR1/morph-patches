package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p149l.sef0;
import p149l.tef0;
import p149l.uef0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SignatureEnhancement {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JavaTypeEnhancement f64979a;

    public SignatureEnhancement(@NotNull JavaTypeEnhancement javaTypeEnhancement) {
        javaTypeEnhancement.getClass();
        this.f64979a = javaTypeEnhancement;
    }

    /* JADX INFO: renamed from: g */
    public static final Boolean m90077g(UnwrappedType unwrappedType) {
        ClassifierDescriptor classifierDescriptorMo88316e = unwrappedType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorMo88316e.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        return Boolean.valueOf(Intrinsics.m87488d(name, javaToKotlinClassMap.m88350h().m91051f()) && Intrinsics.m87488d(DescriptorUtilsKt.m91978k(classifierDescriptorMo88316e), javaToKotlinClassMap.m88350h()));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ KotlinType m90078j(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1 function1, int i, Object obj) {
        return signatureEnhancement.m90085h(callableMemberDescriptor, annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i & 32) != 0 ? false : z2, function1);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ KotlinType m90079k(SignatureEnhancement signatureEnhancement, uef0 uef0Var, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i & 8) != 0) {
            z = false;
        }
        return signatureEnhancement.m90086i(uef0Var, kotlinType, list, typeEnhancementInfo2, z);
    }

    /* JADX INFO: renamed from: m */
    public static final KotlinType m90080m(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0 = callableMemberDescriptor.mo88446b0();
        receiverParameterDescriptorMo88446b0.getClass();
        KotlinType type = receiverParameterDescriptorMo88446b0.getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: n */
    public static final KotlinType m90081n(ValueParameterDescriptor valueParameterDescriptor, CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        KotlinType type = callableMemberDescriptor.mo88448g().get(valueParameterDescriptor.getIndex()).getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: o */
    public static final KotlinType m90082o(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        KotlinType returnType = callableMemberDescriptor.getReturnType();
        returnType.getClass();
        return returnType;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m90083s(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        return unwrappedType instanceof RawType;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m90084f(KotlinType kotlinType) {
        return TypeUtils.m92792c(kotlinType, tef0.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public final KotlinType m90085h(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        uef0 uef0Var = new uef0(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType kotlinTypeInvoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> collectionMo88447e = callableMemberDescriptor.mo88447e();
        collectionMo88447e.getClass();
        Collection<? extends CallableMemberDescriptor> collection = collectionMo88447e;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            callableMemberDescriptor2.getClass();
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return m90086i(uef0Var, kotlinTypeInvoke, arrayList, typeEnhancementInfo, z2);
    }

    /* JADX INFO: renamed from: i */
    public final KotlinType m90086i(uef0 uef0Var, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        return this.f64979a.m89948a(kotlinType, uef0Var.m89926g(kotlinType, list, typeEnhancementInfo, z), uef0Var.mo89917D());
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0215, code lost:
    
        if (r0 == null) goto L133;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D m90087l(D r18, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r19) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.m90087l(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: p */
    public final <D extends CallableMemberDescriptor> Collection<D> m90088p(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Collection<? extends D> collection) {
        lazyJavaResolverContext.getClass();
        collection.getClass();
        Collection<? extends D> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(m90087l((CallableMemberDescriptor) it.next(), lazyJavaResolverContext));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final KotlinType m90089q(@NotNull KotlinType kotlinType, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        kotlinType.getClass();
        lazyJavaResolverContext.getClass();
        KotlinType kotlinTypeM90079k = m90079k(this, new uef0(null, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_USE, true), kotlinType, CollectionsKt.emptyList(), null, false, 12, null);
        return kotlinTypeM90079k == null ? kotlinType : kotlinTypeM90079k;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final List<KotlinType> m90090r(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull List<? extends KotlinType> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        typeParameterDescriptor.getClass();
        list.getClass();
        lazyJavaResolverContext.getClass();
        List<? extends KotlinType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (KotlinType kotlinType : list2) {
            if (!TypeUtilsKt.m93085e(kotlinType, sef0.INSTANCE)) {
                KotlinType kotlinTypeM90079k = m90079k(this, new uef0(typeParameterDescriptor, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), kotlinType, CollectionsKt.emptyList(), null, false, 12, null);
                if (kotlinTypeM90079k != null) {
                    kotlinType = kotlinTypeM90079k;
                }
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public final KotlinType m90091t(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContextM89579k;
        return m90085h(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (lazyJavaResolverContextM89579k = ContextKt.m89579k(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : lazyJavaResolverContextM89579k, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z, function1);
    }

    /* JADX INFO: renamed from: u */
    public final <D extends CallableMemberDescriptor> Annotations m90092u(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassifierDescriptor classifierDescriptorM88478a = DescriptorUtilKt.m88478a(d);
        if (classifierDescriptorM88478a == null) {
            return d.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = classifierDescriptorM88478a instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) classifierDescriptorM88478a : null;
        List<JavaAnnotation> listM89672M0 = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.m89672M0() : null;
        List<JavaAnnotation> list = listM89672M0;
        if (list == null || list.isEmpty()) {
            return d.getAnnotations();
        }
        List<JavaAnnotation> list2 = listM89672M0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it.next(), true));
        }
        return Annotations.Companion.m88640a(CollectionsKt.plus((Iterable) d.getAnnotations(), (Iterable) arrayList));
    }
}
