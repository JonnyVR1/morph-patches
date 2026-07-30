package kotlin.reflect.jvm.internal.calls;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;
import p153l.uyp;
import p153l.w0l0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u00150B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020&0*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010.¨\u00061"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/ranges/IntRange;", "e", "(I)Lkotlin/ranges/IntRange;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Z", "b", "Lkotlin/reflect/jvm/internal/calls/Caller;", BLiveRole.caller, "c", "Ljava/lang/reflect/Member;", "()Ljava/lang/reflect/Member;", "member", "Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$a;", Constants.INAPP_DATA_TAG, "Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$a;", "data", "[Lkotlin/ranges/IntRange;", "slices", "f", "hasMfvcParameters", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "()Z", "isBoundInstanceCallWithValueClasses", "MultiFieldValueClassPrimaryConstructorCaller", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ValueClassAwareCaller<M extends Member> implements Caller<M> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isDefault;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Caller<M> caller;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final M member;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C15281a data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final IntRange[] slices;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean hasMfvcParameters;

    @Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR'\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\t0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR \u0010#\u001a\b\u0012\u0004\u0012\u00020!0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\"\u0010\u001fR\u0016\u0010%\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010$R\u0014\u0010(\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "constructorDesc", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "constructorImpl", "b", "boxMethod", "c", "Ljava/util/List;", "parameterUnboxMethods", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "e", "()Ljava/util/List;", "originalParametersGroups", "Ljava/lang/reflect/Type;", "getParameterTypes", "parameterTypes", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class MultiFieldValueClassPrimaryConstructorCaller implements Caller {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Method constructorImpl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Method boxMethod;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final List<List<Method>> parameterUnboxMethods;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<List<Class<?>>> originalParametersGroups;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final List<Type> parameterTypes;

        public MultiFieldValueClassPrimaryConstructorCaller(@NotNull FunctionDescriptor functionDescriptor, @NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull List<? extends ParameterDescriptor> list) {
            Collection collectionListOf;
            functionDescriptor.getClass();
            kDeclarationContainerImpl.getClass();
            str.getClass();
            list.getClass();
            Method methodM88726y = kDeclarationContainerImpl.m88726y("constructor-impl", str);
            methodM88726y.getClass();
            this.constructorImpl = methodM88726y;
            Method methodM88726y2 = kDeclarationContainerImpl.m88726y("box-impl", StringsKt.m94349y0(str, p7f.GPS_MEASUREMENT_INTERRUPTED) + ReflectClassUtilKt.m89883f(kDeclarationContainerImpl.mo88354d()));
            methodM88726y2.getClass();
            this.boxMethod = methodM88726y2;
            List<? extends ParameterDescriptor> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                KotlinType type = ((ParameterDescriptor) it.next()).getType();
                type.getClass();
                arrayList.add(ValueClassAwareCallerKt.m89014p(TypeSubstitutionKt.m93651a(type), functionDescriptor));
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ClassifierDescriptor classifierDescriptorMo89207e = ((ParameterDescriptor) obj).getType().mo92781G0().mo89207e();
                classifierDescriptorMo89207e.getClass();
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo89207e;
                List<Method> list3 = this.parameterUnboxMethods.get(i);
                if (list3 != null) {
                    List<Method> list4 = list3;
                    collectionListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        collectionListOf.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> clsM88945q = UtilKt.m88945q(classDescriptor);
                    clsM88945q.getClass();
                    collectionListOf = CollectionsKt.listOf(clsM88945q);
                }
                arrayList2.add(collectionListOf);
                i = i2;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = CollectionsKt.flatten(arrayList2);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo88949a() {
            return m88993c();
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ Member mo88950b() {
            return (Member) m88994d();
        }

        /* JADX INFO: renamed from: c */
        public boolean m88993c() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
            Collection collectionListOf;
            args.getClass();
            List<Pair> listZip = ArraysKt.zip(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listZip) {
                Object objComponent1 = pair.component1();
                List list = (List) pair.component2();
                if (list != null) {
                    List list2 = list;
                    collectionListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionListOf.add(((Method) it.next()).invoke(objComponent1, null));
                    }
                } else {
                    collectionListOf = CollectionsKt.listOf(objComponent1);
                }
                CollectionsKt.addAll(arrayList, collectionListOf);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public Void m88994d() {
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final List<List<Class<?>>> m88995e() {
            return this.originalParametersGroups;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public List<Type> getParameterTypes() {
            return this.parameterTypes;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public Type getReturnType() {
            Class<?> returnType = this.boxMethod.getReturnType();
            returnType.getClass();
            return returnType;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$a;", "", "Lkotlin/ranges/IntRange;", "argumentRange", "", "", "Ljava/lang/reflect/Method;", "unboxParameters", "box", "<init>", "(Lkotlin/ranges/IntRange;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "a", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "b", "[Ljava/util/List;", "c", "()[Ljava/util/List;", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15281a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final IntRange argumentRange;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Method>[] unboxParameters;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Method box;

        public C15281a(@NotNull IntRange intRange, @NotNull List<Method>[] listArr, @Nullable Method method) {
            intRange.getClass();
            listArr.getClass();
            this.argumentRange = intRange;
            this.unboxParameters = listArr;
            this.box = method;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final IntRange getArgumentRange() {
            return this.argumentRange;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Method getBox() {
            return this.box;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<Method>[] m88998c() {
            return this.unboxParameters;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:1: B:25:0x0076->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    public ValueClassAwareCaller(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Caller<? extends M> caller, boolean z) {
        Class clsM89018t;
        C15281a c15281a;
        KotlinType kotlinTypeM92686j;
        ArrayList arrayList;
        Iterator<T> it;
        callableMemberDescriptor.getClass();
        caller.getClass();
        this.isDefault = z;
        boolean z2 = false;
        if (caller instanceof CallerImpl.Method.BoundStatic) {
            ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = callableMemberDescriptor.mo89337b0();
            receiverParameterDescriptorMo89337b0 = receiverParameterDescriptorMo89337b0 == null ? callableMemberDescriptor.mo89335Y() : receiverParameterDescriptorMo89337b0;
            KotlinType type = receiverParameterDescriptorMo89337b0 != null ? receiverParameterDescriptorMo89337b0.getType() : null;
            if (type != null && InlineClassesUtilsKt.m92685i(type)) {
                if (z) {
                    List<ValueParameterDescriptor> listMo89339g = callableMemberDescriptor.mo89339g();
                    listMo89339g.getClass();
                    List<ValueParameterDescriptor> list = listMo89339g;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((ValueParameterDescriptor) it2.next()).mo89506M()) {
                                    List<Method> listM89012n = ValueClassAwareCallerKt.m89012n(TypeSubstitutionKt.m93651a(type));
                                    listM89012n.getClass();
                                    List<Method> list2 = listM89012n;
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((CallerImpl.Method.BoundStatic) caller).getBoundReceiver(), null));
                                    }
                                    caller = new CallerImpl.Method.BoundStaticMultiFieldValueClass(((CallerImpl.Method) caller).mo88950b(), arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    List<Method> listM89012n2 = ValueClassAwareCallerKt.m89012n(TypeSubstitutionKt.m93651a(type));
                    listM89012n2.getClass();
                    List<Method> list3 = listM89012n2;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((CallerImpl.Method.BoundStatic) caller).getBoundReceiver(), null));
                    }
                    caller = new CallerImpl.Method.BoundStaticMultiFieldValueClass(((CallerImpl.Method) caller).mo88950b(), arrayList.toArray(new Object[0]));
                }
            }
        }
        this.caller = (Caller<M>) caller;
        this.member = (M) caller.mo88950b();
        KotlinType returnType = callableMemberDescriptor.getReturnType();
        returnType.getClass();
        boolean z3 = callableMemberDescriptor instanceof FunctionDescriptor;
        Method methodM89009k = ((z3 && ((FunctionDescriptor) callableMemberDescriptor).isSuspend() && (kotlinTypeM92686j = InlineClassesUtilsKt.m92686j(returnType)) != null && KotlinBuiltIns.m89089t0(kotlinTypeM92686j)) || (clsM89018t = ValueClassAwareCallerKt.m89018t(returnType)) == null) ? null : ValueClassAwareCallerKt.m89009k(clsM89018t, callableMemberDescriptor);
        if (InlineClassesUtilsKt.m92677a(callableMemberDescriptor)) {
            c15281a = new C15281a(IntRange.INSTANCE.m88477a(), new List[0], methodM89009k);
        } else {
            int i = -1;
            if ((!(caller instanceof CallerImpl.Method.BoundStatic) || caller.getIsCallByToValueClassMangledMethod()) && !(caller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass)) {
                if (callableMemberDescriptor instanceof ConstructorDescriptor) {
                    if (!(caller instanceof BoundCaller)) {
                        i = 0;
                    }
                } else if (callableMemberDescriptor.mo89335Y() == null || (caller instanceof BoundCaller)) {
                    i = 0;
                } else {
                    DeclarationDescriptor declarationDescriptorMo89190b = callableMemberDescriptor.mo89190b();
                    declarationDescriptorMo89190b.getClass();
                    if (InlineClassesUtilsKt.m92683g(declarationDescriptorMo89190b)) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                }
            }
            int i2 = caller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? -caller.m88981j() : i;
            List listM89016r = ValueClassAwareCallerKt.m89016r(callableMemberDescriptor, caller.mo88950b(), w0l0.INSTANCE);
            Iterator it3 = listM89016r.iterator();
            int size = 0;
            while (it3.hasNext()) {
                List<Method> listM89012n3 = ValueClassAwareCallerKt.m89012n(TypeSubstitutionKt.m93651a((KotlinType) it3.next()));
                size += listM89012n3 != null ? listM89012n3.size() : 1;
            }
            int i3 = size + i2 + (this.isDefault ? ((size + 31) / 32) + 1 : 0) + ((z3 && ((FunctionDescriptor) callableMemberDescriptor).isSuspend()) ? 1 : 0);
            ValueClassAwareCallerKt.m89005g(this, i3, callableMemberDescriptor, this.isDefault);
            IntRange intRangeM88496l = C15274a.m88496l(Math.max(i, 0), listM89016r.size() + i);
            List[] listArr = new List[i3];
            int i4 = 0;
            while (i4 < i3) {
                listArr[i4] = (i4 > intRangeM88496l.getLast() || intRangeM88496l.getFirst() > i4) ? null : ValueClassAwareCallerKt.m89014p(TypeSubstitutionKt.m93651a((KotlinType) listM89016r.get(i4 - i)), callableMemberDescriptor);
                i4++;
            }
            c15281a = new C15281a(intRangeM88496l, listArr, methodM89009k);
        }
        this.data = c15281a;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Caller<M> caller2 = this.caller;
        int length = caller2 instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? ((CallerImpl.Method.BoundStaticMultiFieldValueClass) caller2).getBoundReceiverComponents().length : caller2 instanceof CallerImpl.Method.BoundStatic ? 1 : 0;
        if (length > 0) {
            listCreateListBuilder.add(C15274a.m88496l(0, length));
        }
        List<Method>[] listArrM88998c = c15281a.m88998c();
        int length2 = listArrM88998c.length;
        int i5 = 0;
        while (i5 < length2) {
            List<Method> list4 = listArrM88998c[i5];
            int size2 = (list4 != null ? list4.size() : 1) + length;
            listCreateListBuilder.add(C15274a.m88496l(length, size2));
            i5++;
            length = size2;
        }
        this.slices = (IntRange[]) CollectionsKt.build(listCreateListBuilder).toArray(new IntRange[0]);
        Iterable argumentRange = this.data.getArgumentRange();
        if (!(argumentRange instanceof Collection) || !((Collection) argumentRange).isEmpty()) {
            Iterator it4 = argumentRange.iterator();
            while (it4.hasNext()) {
                List<Method> list5 = this.data.m88998c()[((IntIterator) it4).nextInt()];
                if (list5 != null && list5.size() > 1) {
                    z2 = true;
                    break;
                }
            }
        }
        this.hasMfvcParameters = z2;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m88991d(ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return InlineClassesUtilsKt.m92683g(classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: a */
    public boolean mo88949a() {
        return this.caller instanceof CallerImpl.Method.BoundInstance;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: b */
    public M mo88950b() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objM88935g;
        Object objM88935g2;
        args.getClass();
        IntRange argumentRange = this.data.getArgumentRange();
        List<Method>[] listArrM88998c = this.data.m88998c();
        Method box = this.data.getBox();
        if (!argumentRange.isEmpty()) {
            if (this.hasMfvcParameters) {
                List listCreateListBuilder = CollectionsKt.createListBuilder(args.length);
                int first = argumentRange.getFirst();
                for (int i = 0; i < first; i++) {
                    listCreateListBuilder.add(args[i]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = listArrM88998c[first2];
                        Object obj = args[first2];
                        if (list != null) {
                            List list2 = listCreateListBuilder;
                            for (Method method : list) {
                                if (obj != null) {
                                    objM88935g2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    returnType.getClass();
                                    objM88935g2 = UtilKt.m88935g(returnType);
                                }
                                list2.add(objM88935g2);
                            }
                        } else {
                            listCreateListBuilder.add(obj);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int lastIndex = ArraysKt.getLastIndex(args);
                if (last2 <= lastIndex) {
                    while (true) {
                        listCreateListBuilder.add(args[last2]);
                        if (last2 == lastIndex) {
                            break;
                        }
                        last2++;
                    }
                }
                args = CollectionsKt.build(listCreateListBuilder).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int first3 = argumentRange.getFirst();
                    if (i2 > argumentRange.getLast() || first3 > i2) {
                        objM88935g = args[i2];
                    } else {
                        List<Method> list3 = listArrM88998c[i2];
                        Method method2 = list3 != null ? (Method) CollectionsKt.single((List) list3) : null;
                        objM88935g = args[i2];
                        if (method2 != null) {
                            if (objM88935g != null) {
                                objM88935g = method2.invoke(objM88935g, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                returnType2.getClass();
                                objM88935g = UtilKt.m88935g(returnType2);
                            }
                        }
                    }
                    objArr[i2] = objM88935g;
                }
                args = objArr;
            }
        }
        Object objCall = this.caller.call(args);
        return (objCall == uyp.m198688e() || box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final IntRange m88992e(int index) {
        if (index >= 0) {
            IntRange[] intRangeArr = this.slices;
            if (index < intRangeArr.length) {
                return intRangeArr[index];
            }
        }
        IntRange[] intRangeArr2 = this.slices;
        if (intRangeArr2.length == 0) {
            return new IntRange(index, index);
        }
        int length = (index - intRangeArr2.length) + ((IntRange) ArraysKt.last(intRangeArr2)).getLast() + 1;
        return new IntRange(length, length);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.caller.getReturnType();
    }
}
