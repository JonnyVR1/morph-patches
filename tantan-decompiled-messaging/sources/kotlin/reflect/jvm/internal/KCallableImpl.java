package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.live.base.data.BLiveRole;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.auq;
import p149l.buq;
import p149l.cn5;
import p149l.cuq;
import p149l.duq;
import p149l.euq;
import p149l.fuq;
import p149l.guq;
import p149l.gyx;
import p149l.huq;
import p149l.ig3;
import p149l.iuq;
import p149l.j6f;
import p149l.juq;
import p149l.kuq;
import p149l.luq;
import p149l.qhg0;
import p149l.ztq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00028\u00002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00028\u00002\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000b\"\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00028\u00002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014H\u0016¢\u0006\u0004\b!\u0010\u0017J3\u0010$\u001a\u00028\u00002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00142\f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"H\u0000¢\u0006\u0004\b$\u0010%R.\u0010+\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020' (*\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00070\u00070&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*RD\u0010/\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u000f (*\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010,j\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`-0,j\b\u0012\u0004\u0012\u00020\u000f`-0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*RD\u00101\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u000f (*\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010,j\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`-0,j\b\u0012\u0004\u0012\u00020\u000f`-0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\"\u00104\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u000102020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010*R.\u00107\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000205 (*\n\u0012\u0004\u0012\u000205\u0018\u00010\u00070\u00070&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010*R2\u00109\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f (*\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b0\u000b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010*R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0006\u0012\u0002\b\u00030?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010?8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010G\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010FR\u0014\u0010J\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020'0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078F¢\u0006\u0006\u001a\u0004\bN\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010LR\u0014\u0010T\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020U0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010LR\u0016\u0010[\u001a\u0004\u0018\u00010X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010IR\u0014\u0010]\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010IR\u0014\u0010^\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010IR\u0014\u0010`\u001a\u00020;8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b_\u0010IR\u0014\u0010c\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006d"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "M", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/util/List;", "", "", "P", "()[Ljava/lang/Object;", "Lkotlin/reflect/KParameter;", "parameter", "", "U", "(Lkotlin/reflect/KParameter;)I", "", "args", "K", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/KType;", "type", "N", "(Lkotlin/reflect/KType;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", BloodType.f38728O, "()Ljava/lang/reflect/Type;", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lkotlin/coroutines/Continuation;", "continuationArgument", "L", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "kotlin.jvm.PlatformType", "a", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "_annotations", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "_receiverParameters", "c", "_parameters", "Lkotlin/reflect/jvm/internal/KTypeImpl;", Constants.INAPP_DATA_TAG, "_returnType", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "e", "_typeParameters", "f", "_absentArguments", "Lkotlin/Lazy;", "", "g", "Lkotlin/Lazy;", "parametersNeedMFVCFlattening", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Q", "()Lkotlin/reflect/jvm/internal/calls/Caller;", BLiveRole.caller, j6f.LATITUDE_SOUTH, "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "X", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", j6f.GPS_MEASUREMENT_INTERRUPTED, "receiverParameters", "getParameters", "parameters", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "W", "isAnnotationConstructor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal<List<Annotation>> _annotations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal<ArrayList<KParameter>> _receiverParameters;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal<ArrayList<KParameter>> _parameters;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal<KTypeImpl> _returnType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> _typeParameters;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal<Object[]> _absentArguments;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Boolean> parametersNeedMFVCFlattening;

    public KCallableImpl() {
        ReflectProperties.LazySoftVal<List<Annotation>> lazySoftValM87994c = ReflectProperties.m87994c(new auq(this));
        lazySoftValM87994c.getClass();
        this._annotations = lazySoftValM87994c;
        ReflectProperties.LazySoftVal<ArrayList<KParameter>> lazySoftValM87994c2 = ReflectProperties.m87994c(new duq(this));
        lazySoftValM87994c2.getClass();
        this._receiverParameters = lazySoftValM87994c2;
        ReflectProperties.LazySoftVal<ArrayList<KParameter>> lazySoftValM87994c3 = ReflectProperties.m87994c(new euq(this));
        lazySoftValM87994c3.getClass();
        this._parameters = lazySoftValM87994c3;
        ReflectProperties.LazySoftVal<KTypeImpl> lazySoftValM87994c4 = ReflectProperties.m87994c(new fuq(this));
        lazySoftValM87994c4.getClass();
        this._returnType = lazySoftValM87994c4;
        ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> lazySoftValM87994c5 = ReflectProperties.m87994c(new guq(this));
        lazySoftValM87994c5.getClass();
        this._typeParameters = lazySoftValM87994c5;
        ReflectProperties.LazySoftVal<Object[]> lazySoftValM87994c6 = ReflectProperties.m87994c(new huq(this));
        lazySoftValM87994c6.getClass();
        this._absentArguments = lazySoftValM87994c6;
        this.parametersNeedMFVCFlattening = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new iuq(this));
    }

    /* JADX INFO: renamed from: Y */
    public static final boolean m87712Y(KCallableImpl kCallableImpl) {
        List<KParameter> parameters = kCallableImpl.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return false;
        }
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            if (UtilKt.m88048k(((KParameter) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final Object[] m87713h(KCallableImpl kCallableImpl) {
        int iM87736U;
        List<KParameter> parameters = kCallableImpl.getParameters();
        int size = parameters.size() + (kCallableImpl.isSuspend() ? 1 : 0);
        if (kCallableImpl.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            iM87736U = 0;
            for (KParameter kParameter : parameters) {
                iM87736U += kParameter.getKind() == KParameter.Kind.VALUE ? kCallableImpl.m87736U(kParameter) : 0;
            }
        } else {
            List<KParameter> list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                iM87736U = 0;
            } else {
                Iterator<T> it = list.iterator();
                iM87736U = 0;
                while (it.hasNext()) {
                    if (((KParameter) it.next()).getKind() == KParameter.Kind.VALUE && (iM87736U = iM87736U + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        int i = (iM87736U + 31) / 32;
        Object[] objArr = new Object[size + i + 1];
        for (KParameter kParameter2 : parameters) {
            if (kParameter2.mo87607f() && !UtilKt.m88049l(kParameter2.getType())) {
                objArr[kParameter2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()] = UtilKt.m88044g(ReflectJvmMapping.m87646f(kParameter2.getType()));
            } else if (kParameter2.mo87606a()) {
                objArr[kParameter2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()] = kCallableImpl.m87729N(kParameter2.getType());
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[size + i2] = 0;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: l */
    public static final List m87714l(KCallableImpl kCallableImpl) {
        return UtilKt.m88042e(kCallableImpl.mo87946Z());
    }

    /* JADX INFO: renamed from: m */
    public static final ArrayList m87715m(KCallableImpl kCallableImpl) {
        CallableMemberDescriptor callableMemberDescriptorMo87946Z = kCallableImpl.mo87946Z();
        ArrayList arrayList = new ArrayList();
        if (!kCallableImpl.mo87739X()) {
            arrayList.addAll(kCallableImpl.m87737V());
        }
        int size = callableMemberDescriptorMo87946Z.mo88448g().size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new KParameterImpl(kCallableImpl, arrayList.size(), KParameter.Kind.VALUE, new buq(callableMemberDescriptorMo87946Z, i)));
        }
        if (kCallableImpl.m87738W() && (callableMemberDescriptorMo87946Z instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$lambda$0$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return cn5.m107733d(((KParameter) t).getName(), ((KParameter) t2).getName());
                }
            });
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static final ParameterDescriptor m87716n(CallableMemberDescriptor callableMemberDescriptor, int i) {
        ValueParameterDescriptor valueParameterDescriptor = callableMemberDescriptor.mo88448g().get(i);
        valueParameterDescriptor.getClass();
        return valueParameterDescriptor;
    }

    /* JADX INFO: renamed from: o */
    public static final ArrayList m87717o(KCallableImpl kCallableImpl) {
        ArrayList arrayList = new ArrayList();
        ReceiverParameterDescriptor receiverParameterDescriptorM88046i = UtilKt.m88046i(kCallableImpl.mo87946Z());
        if (receiverParameterDescriptorM88046i != null) {
            arrayList.add(new KParameterImpl(kCallableImpl, arrayList.size(), KParameter.Kind.INSTANCE, new juq(receiverParameterDescriptorM88046i)));
        }
        List<ValueParameterDescriptor> listM87728M = kCallableImpl.m87728M(kCallableImpl.mo87946Z());
        int size = listM87728M.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new KParameterImpl(kCallableImpl, arrayList.size(), KParameter.Kind.CONTEXT, new kuq(listM87728M, i)));
        }
        ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0 = kCallableImpl.mo87946Z().mo88446b0();
        if (receiverParameterDescriptorMo88446b0 != null) {
            arrayList.add(new KParameterImpl(kCallableImpl, arrayList.size(), KParameter.Kind.EXTENSION_RECEIVER, new luq(receiverParameterDescriptorMo88446b0)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public static final ParameterDescriptor m87718p(ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }

    /* JADX INFO: renamed from: t */
    public static final ParameterDescriptor m87719t(List list, int i) {
        return (ParameterDescriptor) list.get(i);
    }

    /* JADX INFO: renamed from: u */
    public static final ParameterDescriptor m87720u(ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }

    /* JADX INFO: renamed from: v */
    public static final KTypeImpl m87721v(KCallableImpl kCallableImpl) {
        KotlinType returnType = kCallableImpl.mo87946Z().getReturnType();
        returnType.getClass();
        return new KTypeImpl(returnType, new cuq(kCallableImpl));
    }

    /* JADX INFO: renamed from: w */
    public static final Type m87722w(KCallableImpl kCallableImpl) {
        Type typeM87730O = kCallableImpl.m87730O();
        return typeM87730O == null ? kCallableImpl.mo87732Q().getReturnType() : typeM87730O;
    }

    /* JADX INFO: renamed from: x */
    public static final List m87723x(KCallableImpl kCallableImpl) {
        List<TypeParameterDescriptor> typeParameters = kCallableImpl.mo87946Z().getTypeParameters();
        typeParameters.getClass();
        List<TypeParameterDescriptor> list = typeParameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            typeParameterDescriptor.getClass();
            arrayList.add(new KTypeParameterImpl(kCallableImpl, typeParameterDescriptor));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public final R m87726K(Map<KParameter, ? extends Object> args) throws IllegalCallableAccessException {
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
        Iterator<T> it = parameters.iterator();
        while (true) {
            Object objM87729N = null;
            if (!it.hasNext()) {
                Caller<?> callerMo87734S = mo87734S();
                if (callerMo87734S == null) {
                    ztq.m220129a("This callable does not support a default call: ", mo87946Z());
                    return null;
                }
                try {
                    return (R) callerMo87734S.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            KParameter kParameter = (KParameter) it.next();
            if (args.containsKey(kParameter)) {
                Object obj = args.get(kParameter);
                if (obj == null) {
                    gyx.m128786a("Annotation argument value cannot be null (", kParameter, 41);
                    return null;
                }
                objM87729N = obj;
            } else if (kParameter.mo87607f()) {
                continue;
            } else {
                if (!kParameter.mo87606a()) {
                    qhg0.m174539a("No argument provided for a required parameter: ", kParameter);
                    return null;
                }
                objM87729N = m87729N(kParameter.getType());
            }
            arrayList.add(objM87729N);
        }
    }

    /* JADX INFO: renamed from: L */
    public final R m87727L(@NotNull Map<KParameter, ? extends Object> args, @Nullable Continuation<?> continuationArgument) throws IllegalCallableAccessException {
        args.getClass();
        List<KParameter> parameters = getParameters();
        boolean z = false;
        if (parameters.isEmpty()) {
            try {
                return (R) mo87732Q().call(isSuspend() ? new Continuation[]{continuationArgument} : new Continuation[0]);
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrM87731P = m87731P();
        if (isSuspend()) {
            objArrM87731P[parameters.size()] = continuationArgument;
        }
        boolean zBooleanValue = this.parametersNeedMFVCFlattening.getValue().booleanValue();
        int i = 0;
        for (KParameter kParameter : parameters) {
            int iM87736U = zBooleanValue ? m87736U(kParameter) : 1;
            if (args.containsKey(kParameter)) {
                objArrM87731P[kParameter.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()] = args.get(kParameter);
            } else if (kParameter.mo87607f()) {
                if (zBooleanValue) {
                    int i2 = i + iM87736U;
                    for (int i3 = i; i3 < i2; i3++) {
                        int i4 = (i3 / 32) + size;
                        Object obj = objArrM87731P[i4];
                        obj.getClass();
                        objArrM87731P[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                    }
                } else {
                    int i5 = (i / 32) + size;
                    Object obj2 = objArrM87731P[i5];
                    obj2.getClass();
                    objArrM87731P[i5] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i % 32)));
                }
                z = true;
            } else if (!kParameter.mo87606a()) {
                qhg0.m174539a("No argument provided for a required parameter: ", kParameter);
                return null;
            }
            if (kParameter.getKind() == KParameter.Kind.VALUE) {
                i += iM87736U;
            }
        }
        if (!z) {
            try {
                return (R) mo87732Q().call(Arrays.copyOf(objArrM87731P, size));
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        Caller<?> callerMo87734S = mo87734S();
        if (callerMo87734S == null) {
            ztq.m220129a("This callable does not support a default call: ", mo87946Z());
            return null;
        }
        try {
            return (R) callerMo87734S.call(objArrM87731P);
        } catch (IllegalAccessException e3) {
            throw new IllegalCallableAccessException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX INFO: renamed from: M */
    public final List<ValueParameterDescriptor> m87728M(CallableMemberDescriptor callableMemberDescriptor) {
        Pair pairM87240a;
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        if (callableMemberDescriptor2 instanceof DeserializedSimpleFunctionDescriptor) {
            DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = (DeserializedSimpleFunctionDescriptor) callableMemberDescriptor2;
            pairM87240a = TuplesKt.m87240a(deserializedSimpleFunctionDescriptor.mo92287W(), deserializedSimpleFunctionDescriptor.mo92286G().getContextParameterList());
        } else if (callableMemberDescriptor2 instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) callableMemberDescriptor2;
            pairM87240a = TuplesKt.m87240a(deserializedPropertyDescriptor.mo92287W(), deserializedPropertyDescriptor.mo92286G().getContextParameterList());
        } else if (callableMemberDescriptor2 instanceof PropertyAccessorDescriptor) {
            PropertyDescriptor propertyDescriptorMo88582d0 = ((PropertyAccessorDescriptor) callableMemberDescriptor2).mo88582d0();
            DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = propertyDescriptorMo88582d0 instanceof DeserializedPropertyDescriptor ? (DeserializedPropertyDescriptor) propertyDescriptorMo88582d0 : null;
            if (deserializedPropertyDescriptor2 != null) {
                pairM87240a = TuplesKt.m87240a(deserializedPropertyDescriptor2.mo92287W(), deserializedPropertyDescriptor2.mo92286G().getContextParameterList());
            } else {
                pairM87240a = null;
            }
        } else {
            pairM87240a = null;
        }
        if (pairM87240a == null) {
            return CollectionsKt.emptyList();
        }
        NameResolver nameResolver = (NameResolver) pairM87240a.component1();
        List list = (List) pairM87240a.component2();
        List<ReceiverParameterDescriptor> listMo88450x0 = callableMemberDescriptor2.mo88450x0();
        listMo88450x0.getClass();
        List<ReceiverParameterDescriptor> list2 = listMo88450x0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) obj;
            Annotations annotations = receiverParameterDescriptor.getAnnotations();
            Name nameM91078h = Name.m91078h(nameResolver.getString(((ProtoBuf.ValueParameter) list.get(i)).getName()));
            nameM91078h.getClass();
            KotlinType type = receiverParameterDescriptor.getType();
            type.getClass();
            SourceElement source = receiverParameterDescriptor.getSource();
            source.getClass();
            arrayList.add(new ValueParameterDescriptorImpl(callableMemberDescriptor2, null, i, annotations, nameM91078h, type, false, false, false, null, source));
            callableMemberDescriptor2 = callableMemberDescriptor;
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public final Object m87729N(KType type) {
        Class clsM87452b = JvmClassMappingKt.m87452b(KTypesJvm.m87640b(type));
        if (clsM87452b.isArray()) {
            Object objNewInstance = Array.newInstance(clsM87452b.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsM87452b.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: renamed from: O */
    public final Type m87730O() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) mo87732Q().getParameterTypes());
            ParameterizedType parameterizedType = objLastOrNull instanceof ParameterizedType ? (ParameterizedType) objLastOrNull : null;
            if (Intrinsics.m87488d(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objSingle = ArraysKt.single(actualTypeArguments);
                WildcardType wildcardType = objSingle instanceof WildcardType ? (WildcardType) objSingle : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) ArraysKt.first(lowerBounds);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final Object[] m87731P() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public abstract Caller<?> mo87732Q();

    @NotNull
    /* JADX INFO: renamed from: R */
    public abstract KDeclarationContainerImpl getContainer();

    @Nullable
    /* JADX INFO: renamed from: S */
    public abstract Caller<?> mo87734S();

    @NotNull
    /* JADX INFO: renamed from: T */
    public abstract CallableMemberDescriptor mo87946Z();

    /* JADX INFO: renamed from: U */
    public final int m87736U(KParameter parameter) {
        if (!this.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            ig3.m135964a("Check if parametersNeedMFVCFlattening is true before");
            return 0;
        }
        if (!UtilKt.m88048k(parameter.getType())) {
            return 1;
        }
        KType type = parameter.getType();
        type.getClass();
        List<Method> listM88121n = ValueClassAwareCallerKt.m88121n(TypeSubstitutionKt.m92760a(((KTypeImpl) type).getType()));
        listM88121n.getClass();
        return listM88121n.size();
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final List<KParameter> m87737V() {
        ArrayList<KParameter> arrayListInvoke = this._receiverParameters.invoke();
        arrayListInvoke.getClass();
        return arrayListInvoke;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m87738W() {
        return Intrinsics.m87488d(getName(), "<init>") && getContainer().mo87465d().isAnnotation();
    }

    /* JADX INFO: renamed from: X */
    public abstract boolean mo87739X();

    @Override // kotlin.reflect.KCallable
    public R call(@NotNull Object... args) throws IllegalCallableAccessException {
        args.getClass();
        try {
            return (R) mo87732Q().call(args);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(@NotNull Map<KParameter, ? extends Object> args) {
        args.getClass();
        return m87738W() ? m87726K(args) : m87727L(args, null);
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this._annotations.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KParameter> getParameters() {
        ArrayList<KParameter> arrayListInvoke = this._parameters.invoke();
        arrayListInvoke.getClass();
        return arrayListInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public KType getReturnType() {
        KTypeImpl kTypeImplInvoke = this._returnType.invoke();
        kTypeImplInvoke.getClass();
        return kTypeImplInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        List<KTypeParameterImpl> listInvoke = this._typeParameters.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility visibility = mo87946Z().getVisibility();
        visibility.getClass();
        return UtilKt.m88055r(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return mo87946Z().mo88303i() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return mo87946Z().mo88303i() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return mo87946Z().mo88303i() == Modality.OPEN;
    }
}
