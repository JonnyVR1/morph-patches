package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p153l.anf0;
import p153l.bnf0;
import p153l.wmf0;
import p153l.wtq0;
import p153l.xmf0;
import p153l.ymf0;
import p153l.zmf0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SignatureEnhancement {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JavaTypeEnhancement f65653a;

    public SignatureEnhancement(@NotNull JavaTypeEnhancement javaTypeEnhancement) {
        javaTypeEnhancement.getClass();
        this.f65653a = javaTypeEnhancement;
    }

    /* JADX INFO: renamed from: g */
    public static final Boolean m90968g(UnwrappedType unwrappedType) {
        ClassifierDescriptor classifierDescriptorMo89207e = unwrappedType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorMo89207e.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        return Boolean.valueOf(Intrinsics.m88377d(name, javaToKotlinClassMap.m89241h().m91942f()) && Intrinsics.m88377d(DescriptorUtilsKt.m92869k(classifierDescriptorMo89207e), javaToKotlinClassMap.m89241h()));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ KotlinType m90969j(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1 function1, int i, Object obj) {
        return signatureEnhancement.m90976h(callableMemberDescriptor, annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i & 32) != 0 ? false : z2, function1);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ KotlinType m90970k(SignatureEnhancement signatureEnhancement, bnf0 bnf0Var, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i & 8) != 0) {
            z = false;
        }
        return signatureEnhancement.m90977i(bnf0Var, kotlinType, list, typeEnhancementInfo2, z);
    }

    /* JADX INFO: renamed from: m */
    public static final KotlinType m90971m(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = callableMemberDescriptor.mo89337b0();
        receiverParameterDescriptorMo89337b0.getClass();
        KotlinType type = receiverParameterDescriptorMo89337b0.getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: n */
    public static final KotlinType m90972n(ValueParameterDescriptor valueParameterDescriptor, CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        KotlinType type = callableMemberDescriptor.mo89339g().get(valueParameterDescriptor.getIndex()).getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: o */
    public static final KotlinType m90973o(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        KotlinType returnType = callableMemberDescriptor.getReturnType();
        returnType.getClass();
        return returnType;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m90974s(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        return unwrappedType instanceof RawType;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m90975f(KotlinType kotlinType) {
        return TypeUtils.m93683c(kotlinType, anf0.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public final KotlinType m90976h(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        bnf0 bnf0Var = new bnf0(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType kotlinTypeInvoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> collectionMo89338e = callableMemberDescriptor.mo89338e();
        collectionMo89338e.getClass();
        Collection<? extends CallableMemberDescriptor> collection = collectionMo89338e;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            callableMemberDescriptor2.getClass();
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return m90977i(bnf0Var, kotlinTypeInvoke, arrayList, typeEnhancementInfo, z2);
    }

    /* JADX INFO: renamed from: i */
    public final KotlinType m90977i(bnf0 bnf0Var, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        return this.f65653a.m90839a(kotlinType, bnf0Var.m90817g(kotlinType, list, typeEnhancementInfo, z), bnf0Var.mo90808D());
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0215, code lost:
    
        if (r0 == null) goto L133;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D extends CallableMemberDescriptor> D m90978l(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        D d2;
        KotlinType kotlinTypeM90982t;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        boolean z;
        boolean z2;
        boolean z3;
        KotlinType type;
        List<TypeEnhancementInfo> listM90960b;
        String strM90959a;
        PropertyDescriptorImpl propertyDescriptorImpl;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplM89747L0;
        if (!(d instanceof JavaCallableMemberDescriptor)) {
            return d;
        }
        if (d.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE || d.mo89336a().mo89338e().size() != 1) {
            LazyJavaResolverContext lazyJavaResolverContextM90470k = ContextKt.m90470k(lazyJavaResolverContext, m90983u(d, lazyJavaResolverContext));
            if (!(d instanceof JavaPropertyDescriptor) || (propertyGetterDescriptorImplM89747L0 = (propertyDescriptorImpl = (PropertyDescriptorImpl) d).getGetter()) == null || propertyGetterDescriptorImplM89747L0.mo89472U()) {
                d2 = d;
            } else {
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplM89747L1 = propertyDescriptorImpl.getGetter();
                propertyGetterDescriptorImplM89747L1.getClass();
                d2 = propertyGetterDescriptorImplM89747L1;
            }
            KotlinType type2 = null;
            if (d.mo89337b0() != null) {
                FunctionDescriptor functionDescriptor = d2 instanceof FunctionDescriptor ? (FunctionDescriptor) d2 : null;
                kotlinTypeM90982t = m90982t(d, functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.mo89334J(JavaMethodDescriptor.f65473G) : null, lazyJavaResolverContextM90470k, null, false, wmf0.INSTANCE);
            } else {
                kotlinTypeM90982t = null;
            }
            JavaMethodDescriptor javaMethodDescriptor = d instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) d : null;
            int i = 0;
            if (javaMethodDescriptor != null) {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                DeclarationDescriptor declarationDescriptorMo89190b = javaMethodDescriptor.mo89190b();
                declarationDescriptorMo89190b.getClass();
                String strM91266a = MethodSignatureBuildingUtilsKt.m91266a(signatureBuildingComponents, (ClassDescriptor) declarationDescriptorMo89190b, MethodSignatureMappingKt.m91269c(javaMethodDescriptor, false, false, 3, null));
                if (strM91266a != null) {
                    PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfoM90962d = PredefinedEnhancementInfoKt.m90891K0().get(strM91266a);
                    if (predefinedFunctionEnhancementInfoM90962d == null) {
                        predefinedFunctionEnhancementInfoM90962d = null;
                    } else {
                        if (predefinedFunctionEnhancementInfoM90962d.m90959a() != null && ((strM90959a = predefinedFunctionEnhancementInfoM90962d.m90959a()) == null || !C15493d.m94374J(strM90959a, "2.", false, 2, null))) {
                            wtq0.m207906a("Check failed.");
                            return null;
                        }
                        if (predefinedFunctionEnhancementInfoM90962d.m90959a() != null) {
                            predefinedFunctionEnhancementInfoM90962d = predefinedFunctionEnhancementInfoM90962d.m90962d();
                        }
                    }
                    predefinedFunctionEnhancementInfo = predefinedFunctionEnhancementInfoM90962d;
                } else {
                    predefinedFunctionEnhancementInfo = null;
                }
            } else {
                predefinedFunctionEnhancementInfo = null;
            }
            if (predefinedFunctionEnhancementInfo != null) {
                predefinedFunctionEnhancementInfo.m90960b().size();
                ((JavaMethodDescriptor) d).mo89339g().size();
            }
            boolean z4 = (UtilsKt.m90395c(lazyJavaResolverContext.m90508a().m90481i()) || lazyJavaResolverContextM90470k.m90508a().m90489q().mo90498b()) && UtilsKt.m90394b(d);
            List<ValueParameterDescriptor> listMo89339g = d2.mo89339g();
            listMo89339g.getClass();
            List<ValueParameterDescriptor> list = listMo89339g;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ValueParameterDescriptor valueParameterDescriptor : list) {
                arrayList.add(m90982t(d, valueParameterDescriptor, lazyJavaResolverContextM90470k, (predefinedFunctionEnhancementInfo == null || (listM90960b = predefinedFunctionEnhancementInfo.m90960b()) == null) ? null : (TypeEnhancementInfo) CollectionsKt.getOrNull(listM90960b, valueParameterDescriptor.getIndex()), z4, new xmf0(valueParameterDescriptor)));
            }
            PropertyDescriptor propertyDescriptor = d instanceof PropertyDescriptor ? (PropertyDescriptor) d : null;
            KotlinType kotlinTypeM90969j = m90969j(this, d, d2, true, lazyJavaResolverContextM90470k, (propertyDescriptor == null || !JavaDescriptorUtilKt.m90530a(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE : AnnotationQualifierApplicabilityType.FIELD, predefinedFunctionEnhancementInfo != null ? predefinedFunctionEnhancementInfo.m90961c() : null, false, ymf0.INSTANCE, 32, null);
            KotlinType returnType = d.getReturnType();
            returnType.getClass();
            if (m90975f(returnType)) {
                z = true;
            } else {
                ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = d.mo89337b0();
                if ((receiverParameterDescriptorMo89337b0 == null || (type = receiverParameterDescriptorMo89337b0.getType()) == null) ? false : m90975f(type)) {
                    z = true;
                } else {
                    List<ValueParameterDescriptor> listMo89339g2 = d.mo89339g();
                    listMo89339g2.getClass();
                    List<ValueParameterDescriptor> list2 = listMo89339g2;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z3 = false;
                                break;
                            }
                            KotlinType type3 = ((ValueParameterDescriptor) it.next()).getType();
                            type3.getClass();
                            if (m90975f(type3)) {
                                z3 = true;
                                break;
                            }
                        }
                    } else {
                        z3 = false;
                        break;
                    }
                    if (z3) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            Pair<CallableDescriptor.UserDataKey<?>, ?> pairM88129a = z ? TuplesKt.m88129a(DescriptorBasedDeprecationInfoKt.m92856a(), new DeprecationCausedByFunctionNInfo(d)) : null;
            if (kotlinTypeM90982t == null && kotlinTypeM90969j == null) {
                if (arrayList.isEmpty()) {
                    z2 = false;
                    break;
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((KotlinType) it2.next()) != null) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                }
            }
            JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) d;
            if (kotlinTypeM90982t == null) {
                ReceiverParameterDescriptor receiverParameterDescriptorMo89337b1 = d.mo89337b0();
                if (receiverParameterDescriptorMo89337b1 != null) {
                    type2 = receiverParameterDescriptorMo89337b1.getType();
                }
            } else {
                type2 = kotlinTypeM90982t;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                KotlinType type4 = (KotlinType) obj;
                if (type4 == null) {
                    type4 = d.mo89339g().get(i).getType();
                    type4.getClass();
                }
                arrayList2.add(type4);
                i = i2;
            }
            if (kotlinTypeM90969j == null) {
                kotlinTypeM90969j = d.getReturnType();
                kotlinTypeM90969j.getClass();
            }
            JavaCallableMemberDescriptor javaCallableMemberDescriptorMo90445g0 = javaCallableMemberDescriptor.mo90445g0(type2, arrayList2, kotlinTypeM90969j, pairM88129a);
            javaCallableMemberDescriptorMo90445g0.getClass();
            return javaCallableMemberDescriptorMo90445g0;
        }
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: p */
    public final <D extends CallableMemberDescriptor> Collection<D> m90979p(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Collection<? extends D> collection) {
        lazyJavaResolverContext.getClass();
        collection.getClass();
        Collection<? extends D> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(m90978l((CallableMemberDescriptor) it.next(), lazyJavaResolverContext));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final KotlinType m90980q(@NotNull KotlinType kotlinType, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        kotlinType.getClass();
        lazyJavaResolverContext.getClass();
        KotlinType kotlinTypeM90970k = m90970k(this, new bnf0(null, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_USE, true), kotlinType, CollectionsKt.emptyList(), null, false, 12, null);
        return kotlinTypeM90970k == null ? kotlinType : kotlinTypeM90970k;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final List<KotlinType> m90981r(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull List<? extends KotlinType> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        typeParameterDescriptor.getClass();
        list.getClass();
        lazyJavaResolverContext.getClass();
        List<? extends KotlinType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (KotlinType kotlinType : list2) {
            if (!TypeUtilsKt.m93976e(kotlinType, zmf0.INSTANCE)) {
                KotlinType kotlinTypeM90970k = m90970k(this, new bnf0(typeParameterDescriptor, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), kotlinType, CollectionsKt.emptyList(), null, false, 12, null);
                if (kotlinTypeM90970k != null) {
                    kotlinType = kotlinTypeM90970k;
                }
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public final KotlinType m90982t(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContextM90470k;
        return m90976h(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (lazyJavaResolverContextM90470k = ContextKt.m90470k(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : lazyJavaResolverContextM90470k, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z, function1);
    }

    /* JADX INFO: renamed from: u */
    public final <D extends CallableMemberDescriptor> Annotations m90983u(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassifierDescriptor classifierDescriptorM89369a = DescriptorUtilKt.m89369a(d);
        if (classifierDescriptorM89369a == null) {
            return d.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = classifierDescriptorM89369a instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) classifierDescriptorM89369a : null;
        List<JavaAnnotation> listM90563M0 = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.m90563M0() : null;
        List<JavaAnnotation> list = listM90563M0;
        if (list == null || list.isEmpty()) {
            return d.getAnnotations();
        }
        List<JavaAnnotation> list2 = listM90563M0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it.next(), true));
        }
        return Annotations.Companion.m89531a(CollectionsKt.plus((Iterable) d.getAnnotations(), (Iterable) arrayList));
    }
}
