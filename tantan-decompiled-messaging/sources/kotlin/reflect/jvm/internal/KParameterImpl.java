package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ewq;
import p149l.fwq;
import p149l.zwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00182\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R!\u00101\u001a\b\u0012\u0004\u0012\u00020-0,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u00109¨\u0006<"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "callable", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/reflect/KParameter$Kind;", "kind", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Ljava/lang/reflect/Type;", "types", BLiveStormDanmakuGiftResourceType.f44444l, "([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "a", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "m", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "b", "I", "getIndex", "c", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", Constants.INAPP_DATA_TAG, "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "type", "f", "()Z", "isOptional", "isVararg", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class KParameterImpl implements KParameter {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f63673f = {Reflection.m87514i(new PropertyReference1Impl(KParameterImpl.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0)), Reflection.m87514i(new PropertyReference1Impl(KParameterImpl.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final KCallableImpl<?> callable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final KParameter.Kind kind;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal descriptor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal annotations;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KParameterImpl$a */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u001f\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl$a;", "Ljava/lang/reflect/Type;", "", "types", "<init>", "([Ljava/lang/reflect/Type;)V", "", "getTypeName", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "[Ljava/lang/reflect/Type;", "getTypes", "()[Ljava/lang/reflect/Type;", "b", "I", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15172a implements Type {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Type[] types;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int hashCode;

        public C15172a(@NotNull Type[] typeArr) {
            typeArr.getClass();
            this.types = typeArr;
            this.hashCode = Arrays.hashCode(typeArr);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof C15172a) && Arrays.equals(this.types, ((C15172a) other).types);
        }

        @Override // java.lang.reflect.Type
        @NotNull
        public String getTypeName() {
            return ArraysKt.joinToString$default(this.types, ", ", "[", Constants.AES_SUFFIX, 0, (CharSequence) null, (Function1) null, 56, (Object) null);
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public int getHashCode() {
            return this.hashCode;
        }

        @NotNull
        public String toString() {
            return getTypeName();
        }
    }

    public KParameterImpl(@NotNull KCallableImpl<?> kCallableImpl, int i, @NotNull KParameter.Kind kind, @NotNull Function0<? extends ParameterDescriptor> function0) {
        kCallableImpl.getClass();
        kind.getClass();
        function0.getClass();
        this.callable = kCallableImpl;
        this.index = i;
        this.kind = kind;
        this.descriptor = ReflectProperties.m87994c(function0);
        this.annotations = ReflectProperties.m87994c(new ewq(this));
    }

    /* JADX INFO: renamed from: d */
    public static final Type m87908d(KParameterImpl kParameterImpl) {
        List listSlice;
        ParameterDescriptor parameterDescriptorM87914n = kParameterImpl.m87914n();
        if ((parameterDescriptorM87914n instanceof ReceiverParameterDescriptor) && Intrinsics.m87488d(UtilKt.m88046i(kParameterImpl.callable.mo87946Z()), parameterDescriptorM87914n) && kParameterImpl.callable.mo87946Z().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            DeclarationDescriptor declarationDescriptorMo88299b = kParameterImpl.callable.mo87946Z().mo88299b();
            declarationDescriptorMo88299b.getClass();
            Class<?> clsM88054q = UtilKt.m88054q((ClassDescriptor) declarationDescriptorMo88299b);
            if (clsM88054q != null) {
                return clsM88054q;
            }
            zwq.m220685a("Cannot determine receiver Java type of inherited declaration: ", parameterDescriptorM87914n);
            return null;
        }
        Caller<?> callerMo87732Q = kParameterImpl.callable.mo87732Q();
        if (!(callerMo87732Q instanceof ValueClassAwareCaller)) {
            if (!(callerMo87732Q instanceof ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller)) {
                return callerMo87732Q.getParameterTypes().get(kParameterImpl.getIndex());
            }
            Class[] clsArr = (Class[]) ((ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller) callerMo87732Q).m88104e().get(kParameterImpl.getIndex()).toArray(new Class[0]);
            return kParameterImpl.m87912l((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (kParameterImpl.callable.mo87739X()) {
            ValueClassAwareCaller valueClassAwareCaller = (ValueClassAwareCaller) callerMo87732Q;
            IntRange intRangeM88101e = valueClassAwareCaller.m88101e(kParameterImpl.getIndex() + 1);
            int last = valueClassAwareCaller.m88101e(0).getLast() + 1;
            listSlice = CollectionsKt.slice((List) valueClassAwareCaller.getParameterTypes(), new IntRange(intRangeM88101e.getFirst() - last, intRangeM88101e.getLast() - last));
        } else {
            ValueClassAwareCaller valueClassAwareCaller2 = (ValueClassAwareCaller) callerMo87732Q;
            listSlice = CollectionsKt.slice((List) valueClassAwareCaller2.getParameterTypes(), valueClassAwareCaller2.m88101e(kParameterImpl.getIndex()));
        }
        Type[] typeArr = (Type[]) listSlice.toArray(new Type[0]);
        return kParameterImpl.m87912l((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    /* JADX INFO: renamed from: h */
    public static final List m87911h(KParameterImpl kParameterImpl) {
        return UtilKt.m88042e(kParameterImpl.m87914n());
    }

    @Override // kotlin.reflect.KParameter
    /* JADX INFO: renamed from: a */
    public boolean mo87606a() {
        ParameterDescriptor parameterDescriptorM87914n = m87914n();
        return (parameterDescriptorM87914n instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) parameterDescriptorM87914n).mo88618w0() != null;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof KParameterImpl)) {
            return false;
        }
        KParameterImpl kParameterImpl = (KParameterImpl) other;
        return Intrinsics.m87488d(this.callable, kParameterImpl.callable) && getIndex() == kParameterImpl.getIndex();
    }

    @Override // kotlin.reflect.KParameter
    /* JADX INFO: renamed from: f */
    public boolean mo87607f() {
        ParameterDescriptor parameterDescriptorM87914n = m87914n();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorM87914n instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorM87914n : null;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.m91973f(valueParameterDescriptor);
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.KParameter
    @NotNull
    public KParameter.Kind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.KParameter
    @Nullable
    public String getName() {
        ParameterDescriptor parameterDescriptorM87914n = m87914n();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorM87914n instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorM87914n : null;
        if (valueParameterDescriptor == null || valueParameterDescriptor.mo88299b().mo88449k0()) {
            return null;
        }
        Name name = valueParameterDescriptor.getName();
        name.getClass();
        if (name.m91085j()) {
            return null;
        }
        return name.m91082b();
    }

    @Override // kotlin.reflect.KParameter
    @NotNull
    public KType getType() {
        KotlinType type = m87914n().getType();
        type.getClass();
        return new KTypeImpl(type, new fwq(this));
    }

    public int hashCode() {
        return (this.callable.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    /* JADX INFO: renamed from: l */
    public final Type m87912l(Type... types) {
        int length = types.length;
        if (length != 0) {
            return length != 1 ? new C15172a(types) : (Type) ArraysKt.single(types);
        }
        throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final KCallableImpl<?> m87913m() {
        return this.callable;
    }

    /* JADX INFO: renamed from: n */
    public final ParameterDescriptor m87914n() {
        T tM87997b = this.descriptor.m87997b(this, f63673f[0]);
        tM87997b.getClass();
        return (ParameterDescriptor) tM87997b;
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.m88023v(this);
    }
}
