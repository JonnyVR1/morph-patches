package kotlin.reflect.jvm.internal.calls;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p149l.uid0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a@\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0011*\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010!*\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010)\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010(\u001a\u0019\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u00100\u001a\u0004\u0018\u00010/*\u0004\u0018\u00010/2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u00101\"\u001a\u00104\u001a\u0004\u0018\u00010\u001c*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "", "u", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "type", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "", "Ljava/lang/reflect/Method;", "p", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/util/List;", "n", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "expectedArgsSize", "", "isDefault", "", "g", "(Lkotlin/reflect/jvm/internal/calls/Caller;ILkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)V", "Ljava/lang/reflect/Member;", "member", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/ExtensionFunctionType;", "isSpecificClass", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Ljava/lang/reflect/Member;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "a", "(Ljava/lang/reflect/Member;)Z", "M", RXScreenCaptureService.KEY_INDEX, "(Lkotlin/reflect/jvm/internal/calls/Caller;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "q", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Z", "Ljava/lang/Class;", "m", "(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/reflect/Method;", "k", Constants.KEY_T, "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", BLiveStormDanmakuGiftResourceType.f44446s, "(Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;)Ljava/lang/Class;", "", "h", "(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ValueClassAwareCallerKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m88108a(Member member) {
        Class<?> declaringClass = member.getDeclaringClass();
        if (declaringClass == null) {
            return false;
        }
        return !JvmClassMappingKt.m87455e(declaringClass).mo87469q();
    }

    /* JADX INFO: renamed from: g */
    public static final void m88114g(Caller<?> caller, int i, CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        if (CallerKt.m88091a(caller) == i) {
            return;
        }
        StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
        sb.append(CallerKt.m88091a(caller));
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
    public static final Object m88115h(@Nullable Object obj, @NotNull CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType kotlinTypeM88119l;
        Class<?> clsM88127t;
        Method methodM88120m;
        callableMemberDescriptor.getClass();
        return (((callableMemberDescriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.m91790e((VariableDescriptor) callableMemberDescriptor)) || (kotlinTypeM88119l = m88119l(callableMemberDescriptor)) == null || (clsM88127t = m88127t(kotlinTypeM88119l)) == null || (methodM88120m = m88120m(clsM88127t, callableMemberDescriptor)) == null) ? obj : methodM88120m.invoke(obj, null);
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
    public static final <M extends Member> Caller<M> m88116i(@NotNull Caller<? extends M> caller, @NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        List<ValueParameterDescriptor> list;
        Iterator<T> it;
        KotlinType type;
        KotlinType returnType;
        caller.getClass();
        callableMemberDescriptor.getClass();
        if (!InlineClassesUtilsKt.m91786a(callableMemberDescriptor)) {
            List<ReceiverParameterDescriptor> listMo88450x0 = callableMemberDescriptor.mo88450x0();
            listMo88450x0.getClass();
            List<ReceiverParameterDescriptor> list2 = listMo88450x0;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                List<ValueParameterDescriptor> listMo88448g = callableMemberDescriptor.mo88448g();
                listMo88448g.getClass();
                list = listMo88448g;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((ValueParameterDescriptor) it.next()).getType();
                        type.getClass();
                        if (InlineClassesUtilsKt.m91793h(type)) {
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
                    if (InlineClassesUtilsKt.m91793h(type)) {
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
                if (InlineClassesUtilsKt.m91793h(type2)) {
                }
            }
            List<ValueParameterDescriptor> listMo88448g2 = callableMemberDescriptor.mo88448g();
            listMo88448g2.getClass();
            list = listMo88448g2;
            if (!(list instanceof Collection) && list.isEmpty()) {
                returnType = callableMemberDescriptor.getReturnType();
                return returnType != null ? caller : caller;
            }
            it = list.iterator();
            while (it.hasNext()) {
                type = ((ValueParameterDescriptor) it.next()).getType();
                type.getClass();
                if (InlineClassesUtilsKt.m91793h(type)) {
                }
            }
            returnType = callableMemberDescriptor.getReturnType();
            if ((returnType != null || !InlineClassesUtilsKt.m91788c(returnType)) && !m88124q(callableMemberDescriptor)) {
            }
        }
        return new ValueClassAwareCaller(callableMemberDescriptor, caller, z);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Caller m88117j(Caller caller, CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m88116i(caller, callableMemberDescriptor, z);
    }

    /* JADX INFO: renamed from: k */
    public static final Method m88118k(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", m88120m(cls, callableMemberDescriptor).getReturnType());
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            uid0.m193868a("No box method found in inline class: ", cls, " (calling ", callableMemberDescriptor);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final KotlinType m88119l(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0 = callableMemberDescriptor.mo88446b0();
        ReceiverParameterDescriptor receiverParameterDescriptorMo88444Y = callableMemberDescriptor.mo88444Y();
        if (receiverParameterDescriptorMo88446b0 != null) {
            return receiverParameterDescriptorMo88446b0.getType();
        }
        if (receiverParameterDescriptorMo88444Y == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return receiverParameterDescriptorMo88444Y.getType();
        }
        DeclarationDescriptor declarationDescriptorMo88299b = callableMemberDescriptor.mo88299b();
        ClassDescriptor classDescriptor = declarationDescriptorMo88299b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo88299b : null;
        if (classDescriptor != null) {
            return classDescriptor.mo88458o();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final Method m88120m(@NotNull Class<?> cls, @NotNull CallableMemberDescriptor callableMemberDescriptor) {
        cls.getClass();
        callableMemberDescriptor.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            uid0.m193868a("No unbox method found in inline class: ", cls, " (calling ", callableMemberDescriptor);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final List<Method> m88121n(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        List<String> listM88122o = m88122o(TypeSubstitutionKt.m92760a(simpleType));
        if (listM88122o == null) {
            return null;
        }
        List<String> list = listM88122o;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ClassifierDescriptor classifierDescriptorMo88316e = simpleType.mo91890G0().mo88316e();
        classifierDescriptorMo88316e.getClass();
        Class<?> clsM88054q = UtilKt.m88054q((ClassDescriptor) classifierDescriptorMo88316e);
        clsM88054q.getClass();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsM88054q.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: o */
    public static final List<String> m88122o(SimpleType simpleType) {
        Collection collectionListOf;
        if (!InlineClassesUtilsKt.m91794i(simpleType)) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo88316e = simpleType.mo91890G0().mo88316e();
        classifierDescriptorMo88316e.getClass();
        MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentationM91987t = DescriptorUtilsKt.m91987t((ClassDescriptor) classifierDescriptorMo88316e);
        multiFieldValueClassRepresentationM91987t.getClass();
        Iterable<Pair> iterableM88551c = multiFieldValueClassRepresentationM91987t.m88551c();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : iterableM88551c) {
            Name name = (Name) pair.component1();
            List<String> listM88122o = m88122o((SimpleType) pair.component2());
            if (listM88122o != null) {
                List<String> list = listM88122o;
                collectionListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    collectionListOf.add(name.m91084g() + '-' + ((String) it.next()));
                }
            } else {
                collectionListOf = CollectionsKt.listOf(name.m91084g());
            }
            CollectionsKt.addAll(arrayList, collectionListOf);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public static final List<Method> m88123p(SimpleType simpleType, CallableMemberDescriptor callableMemberDescriptor) {
        Method methodM88120m;
        List<Method> listM88121n = m88121n(simpleType);
        if (listM88121n != null) {
            return listM88121n;
        }
        Class<?> clsM88127t = m88127t(simpleType);
        if (clsM88127t == null || (methodM88120m = m88120m(clsM88127t, callableMemberDescriptor)) == null) {
            return null;
        }
        return CollectionsKt.listOf(methodM88120m);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m88124q(CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType kotlinTypeM88119l = m88119l(callableMemberDescriptor);
        return kotlinTypeM88119l != null && InlineClassesUtilsKt.m91793h(kotlinTypeM88119l);
    }

    /* JADX INFO: renamed from: r */
    public static final List<KotlinType> m88125r(CallableMemberDescriptor callableMemberDescriptor, Member member, Function1<? super ClassDescriptor, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0 = callableMemberDescriptor.mo88446b0();
        KotlinType type = receiverParameterDescriptorMo88446b0 != null ? receiverParameterDescriptorMo88446b0.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            ClassDescriptor classDescriptorMo88462F = ((ConstructorDescriptor) callableMemberDescriptor).mo88462F();
            classDescriptorMo88462F.getClass();
            if (classDescriptorMo88462F.mo88312t()) {
                DeclarationDescriptor declarationDescriptorMo88299b = classDescriptorMo88462F.mo88299b();
                declarationDescriptorMo88299b.getClass();
                arrayList.add(((ClassDescriptor) declarationDescriptorMo88299b).mo88458o());
            }
        } else {
            DeclarationDescriptor declarationDescriptorMo88299b2 = callableMemberDescriptor.mo88299b();
            declarationDescriptorMo88299b2.getClass();
            if ((declarationDescriptorMo88299b2 instanceof ClassDescriptor) && function1.invoke(declarationDescriptorMo88299b2).booleanValue()) {
                if (member == null || !m88108a(member)) {
                    arrayList.add(((ClassDescriptor) declarationDescriptorMo88299b2).mo88458o());
                } else {
                    SimpleType simpleTypeMo88458o = ((ClassDescriptor) declarationDescriptorMo88299b2).mo88458o();
                    simpleTypeMo88458o.getClass();
                    arrayList.add(TypeUtilsKt.m93076B(simpleTypeMo88458o));
                }
            }
        }
        List<ValueParameterDescriptor> listMo88448g = callableMemberDescriptor.mo88448g();
        listMo88448g.getClass();
        Iterator<T> it = listMo88448g.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static final Class<?> m88126s(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.m91787b(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class<?> clsM88054q = UtilKt.m88054q(classDescriptor);
        if (clsM88054q != null) {
            return clsM88054q;
        }
        StringBuilder sb = new StringBuilder("Class object for the class ");
        sb.append(classDescriptor.getName());
        ClassId classIdM91981n = DescriptorUtilsKt.m91981n((ClassifierDescriptor) declarationDescriptor);
        sb.append(" cannot be found (classId=");
        sb.append(classIdM91981n);
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }

    /* JADX INFO: renamed from: t */
    public static final Class<?> m88127t(KotlinType kotlinType) {
        KotlinType kotlinTypeM91795j;
        Class<?> clsM88126s = m88126s(kotlinType.mo91890G0().mo88316e());
        if (clsM88126s == null) {
            return null;
        }
        if (TypeUtils.m92801l(kotlinType) && ((kotlinTypeM91795j = InlineClassesUtilsKt.m91795j(kotlinType)) == null || TypeUtils.m92801l(kotlinTypeM91795j) || KotlinBuiltIns.m88198t0(kotlinTypeM91795j))) {
            return null;
        }
        return clsM88126s;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final String m88128u(@NotNull ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        ClassId classIdM91981n = DescriptorUtilsKt.m91981n(classifierDescriptor);
        classIdM91981n.getClass();
        return ClassMapperLite.m91006b(classIdM91981n.m91035b());
    }
}
