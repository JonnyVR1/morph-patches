package kotlin.reflect.jvm.internal.calls;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.xqd0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a@\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0011*\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010!*\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010)\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010(\u001a\u0019\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u00100\u001a\u0004\u0018\u00010/*\u0004\u0018\u00010/2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u00101\"\u001a\u00104\u001a\u0004\u0018\u00010\u001c*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "", "u", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "type", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "", "Ljava/lang/reflect/Method;", "p", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/util/List;", "n", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "expectedArgsSize", "", "isDefault", "", "g", "(Lkotlin/reflect/jvm/internal/calls/Caller;ILkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)V", "Ljava/lang/reflect/Member;", "member", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/ExtensionFunctionType;", "isSpecificClass", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Ljava/lang/reflect/Member;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "a", "(Ljava/lang/reflect/Member;)Z", "M", RXScreenCaptureService.KEY_INDEX, "(Lkotlin/reflect/jvm/internal/calls/Caller;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "q", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Z", "Ljava/lang/Class;", "m", "(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/reflect/Method;", "k", Constants.KEY_T, "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", BLiveStormDanmakuGiftResourceType.f45294s, "(Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;)Ljava/lang/Class;", "", "h", "(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ValueClassAwareCallerKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m88999a(Member member) {
        Class<?> declaringClass = member.getDeclaringClass();
        if (declaringClass == null) {
            return false;
        }
        return !JvmClassMappingKt.m88344e(declaringClass).mo88358q();
    }

    /* JADX INFO: renamed from: g */
    public static final void m89005g(Caller<?> caller, int i, CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        if (CallerKt.m88982a(caller) == i) {
            return;
        }
        StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
        sb.append(CallerKt.m88982a(caller));
        sb.append(" != ");
        sb.append(i);
        sb.append("\nCalling: ");
        sb.append(callableMemberDescriptor);
        List<Type> parameterTypes = caller.getParameterTypes();
        sb.append("\nParameter types: ");
        sb.append(parameterTypes);
        sb.append(")\nDefault: ");
        sb.append(z);
        throw new KotlinReflectionInternalError(sb.toString());
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final Object m89006h(@Nullable Object obj, @NotNull CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType kotlinTypeM89010l;
        Class<?> clsM89018t;
        Method methodM89011m;
        callableMemberDescriptor.getClass();
        return (((callableMemberDescriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.m92681e((VariableDescriptor) callableMemberDescriptor)) || (kotlinTypeM89010l = m89010l(callableMemberDescriptor)) == null || (clsM89018t = m89018t(kotlinTypeM89010l)) == null || (methodM89011m = m89011m(clsM89018t, callableMemberDescriptor)) == null) ? obj : methodM89011m.invoke(obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:21:0x005c->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final <M extends Member> Caller<M> m89007i(@NotNull Caller<? extends M> caller, @NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        List<ValueParameterDescriptor> list;
        Iterator<T> it;
        KotlinType type;
        KotlinType returnType;
        caller.getClass();
        callableMemberDescriptor.getClass();
        if (!InlineClassesUtilsKt.m92677a(callableMemberDescriptor)) {
            List<ReceiverParameterDescriptor> listMo89341x0 = callableMemberDescriptor.mo89341x0();
            listMo89341x0.getClass();
            List<ReceiverParameterDescriptor> list2 = listMo89341x0;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                List<ValueParameterDescriptor> listMo89339g = callableMemberDescriptor.mo89339g();
                listMo89339g.getClass();
                list = listMo89339g;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((ValueParameterDescriptor) it.next()).getType();
                        type.getClass();
                        if (InlineClassesUtilsKt.m92684h(type)) {
                        }
                    }
                    returnType = callableMemberDescriptor.getReturnType();
                    if (returnType != null) {
                    }
                }
                it = list.iterator();
                while (it.hasNext()) {
                    type = ((ValueParameterDescriptor) it.next()).getType();
                    type.getClass();
                    if (InlineClassesUtilsKt.m92684h(type)) {
                    }
                }
                returnType = callableMemberDescriptor.getReturnType();
                if (returnType != null) {
                }
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                KotlinType type2 = ((ReceiverParameterDescriptor) it2.next()).getType();
                type2.getClass();
                if (InlineClassesUtilsKt.m92684h(type2)) {
                }
            }
            List<ValueParameterDescriptor> listMo89339g2 = callableMemberDescriptor.mo89339g();
            listMo89339g2.getClass();
            list = listMo89339g2;
            if (!(list instanceof Collection) && list.isEmpty()) {
                returnType = callableMemberDescriptor.getReturnType();
                return returnType != null ? caller : caller;
            }
            it = list.iterator();
            while (it.hasNext()) {
                type = ((ValueParameterDescriptor) it.next()).getType();
                type.getClass();
                if (InlineClassesUtilsKt.m92684h(type)) {
                }
            }
            returnType = callableMemberDescriptor.getReturnType();
            if ((returnType != null || !InlineClassesUtilsKt.m92679c(returnType)) && !m89015q(callableMemberDescriptor)) {
            }
        }
        return new ValueClassAwareCaller(callableMemberDescriptor, caller, z);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Caller m89008j(Caller caller, CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m89007i(caller, callableMemberDescriptor, z);
    }

    /* JADX INFO: renamed from: k */
    public static final Method m89009k(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", m89011m(cls, callableMemberDescriptor).getReturnType());
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            xqd0.m212728a("No box method found in inline class: ", cls, " (calling ", callableMemberDescriptor);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final KotlinType m89010l(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = callableMemberDescriptor.mo89337b0();
        ReceiverParameterDescriptor receiverParameterDescriptorMo89335Y = callableMemberDescriptor.mo89335Y();
        if (receiverParameterDescriptorMo89337b0 != null) {
            return receiverParameterDescriptorMo89337b0.getType();
        }
        if (receiverParameterDescriptorMo89335Y == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return receiverParameterDescriptorMo89335Y.getType();
        }
        DeclarationDescriptor declarationDescriptorMo89190b = callableMemberDescriptor.mo89190b();
        ClassDescriptor classDescriptor = declarationDescriptorMo89190b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo89190b : null;
        if (classDescriptor != null) {
            return classDescriptor.mo89349o();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final Method m89011m(@NotNull Class<?> cls, @NotNull CallableMemberDescriptor callableMemberDescriptor) {
        cls.getClass();
        callableMemberDescriptor.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            xqd0.m212728a("No unbox method found in inline class: ", cls, " (calling ", callableMemberDescriptor);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final List<Method> m89012n(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        List<String> listM89013o = m89013o(TypeSubstitutionKt.m93651a(simpleType));
        if (listM89013o == null) {
            return null;
        }
        List<String> list = listM89013o;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ClassifierDescriptor classifierDescriptorMo89207e = simpleType.mo92781G0().mo89207e();
        classifierDescriptorMo89207e.getClass();
        Class<?> clsM88945q = UtilKt.m88945q((ClassDescriptor) classifierDescriptorMo89207e);
        clsM88945q.getClass();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsM88945q.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: o */
    public static final List<String> m89013o(SimpleType simpleType) {
        Collection collectionListOf;
        if (!InlineClassesUtilsKt.m92685i(simpleType)) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo89207e = simpleType.mo92781G0().mo89207e();
        classifierDescriptorMo89207e.getClass();
        MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentationM92878t = DescriptorUtilsKt.m92878t((ClassDescriptor) classifierDescriptorMo89207e);
        multiFieldValueClassRepresentationM92878t.getClass();
        Iterable<Pair> iterableM89442c = multiFieldValueClassRepresentationM92878t.m89442c();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : iterableM89442c) {
            Name name = (Name) pair.component1();
            List<String> listM89013o = m89013o((SimpleType) pair.component2());
            if (listM89013o != null) {
                List<String> list = listM89013o;
                collectionListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    collectionListOf.add(name.m91975g() + '-' + ((String) it.next()));
                }
            } else {
                collectionListOf = CollectionsKt.listOf(name.m91975g());
            }
            CollectionsKt.addAll(arrayList, collectionListOf);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public static final List<Method> m89014p(SimpleType simpleType, CallableMemberDescriptor callableMemberDescriptor) {
        Method methodM89011m;
        List<Method> listM89012n = m89012n(simpleType);
        if (listM89012n != null) {
            return listM89012n;
        }
        Class<?> clsM89018t = m89018t(simpleType);
        if (clsM89018t == null || (methodM89011m = m89011m(clsM89018t, callableMemberDescriptor)) == null) {
            return null;
        }
        return CollectionsKt.listOf(methodM89011m);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m89015q(CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType kotlinTypeM89010l = m89010l(callableMemberDescriptor);
        return kotlinTypeM89010l != null && InlineClassesUtilsKt.m92684h(kotlinTypeM89010l);
    }

    /* JADX INFO: renamed from: r */
    public static final List<KotlinType> m89016r(CallableMemberDescriptor callableMemberDescriptor, Member member, Function1<? super ClassDescriptor, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = callableMemberDescriptor.mo89337b0();
        KotlinType type = receiverParameterDescriptorMo89337b0 != null ? receiverParameterDescriptorMo89337b0.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            ClassDescriptor classDescriptorMo89353F = ((ConstructorDescriptor) callableMemberDescriptor).mo89353F();
            classDescriptorMo89353F.getClass();
            if (classDescriptorMo89353F.mo89203t()) {
                DeclarationDescriptor declarationDescriptorMo89190b = classDescriptorMo89353F.mo89190b();
                declarationDescriptorMo89190b.getClass();
                arrayList.add(((ClassDescriptor) declarationDescriptorMo89190b).mo89349o());
            }
        } else {
            DeclarationDescriptor declarationDescriptorMo89190b2 = callableMemberDescriptor.mo89190b();
            declarationDescriptorMo89190b2.getClass();
            if ((declarationDescriptorMo89190b2 instanceof ClassDescriptor) && function1.invoke(declarationDescriptorMo89190b2).booleanValue()) {
                if (member == null || !m88999a(member)) {
                    arrayList.add(((ClassDescriptor) declarationDescriptorMo89190b2).mo89349o());
                } else {
                    SimpleType simpleTypeMo89349o = ((ClassDescriptor) declarationDescriptorMo89190b2).mo89349o();
                    simpleTypeMo89349o.getClass();
                    arrayList.add(TypeUtilsKt.m93967B(simpleTypeMo89349o));
                }
            }
        }
        List<ValueParameterDescriptor> listMo89339g = callableMemberDescriptor.mo89339g();
        listMo89339g.getClass();
        Iterator<T> it = listMo89339g.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static final Class<?> m89017s(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.m92678b(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class<?> clsM88945q = UtilKt.m88945q(classDescriptor);
        if (clsM88945q != null) {
            return clsM88945q;
        }
        StringBuilder sb = new StringBuilder("Class object for the class ");
        sb.append(classDescriptor.getName());
        ClassId classIdM92872n = DescriptorUtilsKt.m92872n((ClassifierDescriptor) declarationDescriptor);
        sb.append(" cannot be found (classId=");
        sb.append(classIdM92872n);
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }

    /* JADX INFO: renamed from: t */
    public static final Class<?> m89018t(KotlinType kotlinType) {
        KotlinType kotlinTypeM92686j;
        Class<?> clsM89017s = m89017s(kotlinType.mo92781G0().mo89207e());
        if (clsM89017s == null) {
            return null;
        }
        if (TypeUtils.m93692l(kotlinType) && ((kotlinTypeM92686j = InlineClassesUtilsKt.m92686j(kotlinType)) == null || TypeUtils.m93692l(kotlinTypeM92686j) || KotlinBuiltIns.m89089t0(kotlinTypeM92686j))) {
            return null;
        }
        return clsM89017s;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final String m89019u(@NotNull ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        ClassId classIdM92872n = DescriptorUtilsKt.m92872n(classifierDescriptor);
        classIdM92872n.getClass();
        return ClassMapperLite.m91897b(classIdM92872n.m91926b());
    }
}
