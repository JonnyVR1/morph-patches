package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialOperation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;
import p153l.nyq;
import p153l.oyq;
import p153l.p7f;
import p153l.pyq;
import p153l.qyq;
import p153l.ryq;
import p153l.syq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000 P*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004QRSPB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\t0\t048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010H\u001a\u0006\u0012\u0002\b\u00030E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010K\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010<R\u0014\u0010L\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010<R\u0014\u0010M\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010<R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006T"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", AuthenticationTokenClaims.JSON_KEY_NAME, SocialOperation.GAME_SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptorInitialValue", "", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "d0", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "f0", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "h", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "R", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "getName", "j", "j0", "k", "Ljava/lang/Object;", "Lkotlin/Lazy;", "Ljava/lang/reflect/Field;", BLiveStormDanmakuGiftResourceType.f45292l, "Lkotlin/Lazy;", "_javaField", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "m", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "_descriptor", "e0", "()Ljava/lang/Object;", "X", "()Z", "isBound", "i0", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "h0", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getter", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Q", "()Lkotlin/reflect/jvm/internal/calls/Caller;", BLiveRole.caller, p7f.LATITUDE_SOUTH, "defaultCaller", "isLateinit", "isConst", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Companion", "Accessor", "Getter", "Setter", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements KProperty<V> {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Object f64364n = new Object();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final KDeclarationContainerImpl container;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String signature;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final Object rawBoundReceiver;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Field> _javaField;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal<PropertyDescriptor> _descriptor;

    @Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "a0", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "property", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "R", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/calls/Caller;", p7f.LATITUDE_SOUTH, "()Lkotlin/reflect/jvm/internal/calls/Caller;", "defaultCaller", "", "X", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static abstract class Accessor<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, KProperty.Accessor<PropertyType> {
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        /* JADX INFO: renamed from: R */
        public KDeclarationContainerImpl getContainer() {
            return mo88499g().getContainer();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @Nullable
        /* JADX INFO: renamed from: S */
        public Caller<?> mo88625S() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* JADX INFO: renamed from: X */
        public boolean mo88630X() {
            return mo88499g().mo88630X();
        }

        @NotNull
        /* JADX INFO: renamed from: Z */
        public abstract PropertyAccessorDescriptor mo88837Z();

        @NotNull
        /* JADX INFO: renamed from: a0 */
        public abstract KPropertyImpl<PropertyType> mo88499g();

        @Override // kotlin.reflect.KFunction
        public boolean isExternal() {
            return mo88837Z().isExternal();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInfix() {
            return mo88837Z().isInfix();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInline() {
            return mo88837Z().isInline();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isOperator() {
            return mo88837Z().isOperator();
        }

        @Override // kotlin.reflect.KCallable
        public boolean isSuspend() {
            return mo88837Z().isSuspend();
        }
    }

    @Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "h", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/Caller;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "Q", "()Lkotlin/reflect/jvm/internal/calls/Caller;", BLiveRole.caller, "getName", AuthenticationTokenClaims.JSON_KEY_NAME, "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static abstract class Getter<V> extends Accessor<V, V> implements KProperty.Getter<V> {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ KProperty<Object>[] f64371j = {Reflection.m88403i(new PropertyReference1Impl(Getter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal descriptor = ReflectProperties.m88885c(new pyq(this));

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final Lazy caller = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new qyq(this));

        /* JADX INFO: renamed from: d0 */
        public static final Caller m88840d0(Getter getter) {
            return KPropertyImplKt.m88849b(getter, true);
        }

        /* JADX INFO: renamed from: e0 */
        public static final PropertyGetterDescriptor m88841e0(Getter getter) {
            PropertyGetterDescriptor getter2 = getter.mo88499g().mo88837Z().getGetter();
            if (getter2 != null) {
                return getter2;
            }
            PropertyGetterDescriptorImpl propertyGetterDescriptorImplM92623d = DescriptorFactory.m92623d(getter.mo88499g().mo88837Z(), Annotations.Companion.m89532b());
            propertyGetterDescriptorImplM92623d.getClass();
            return propertyGetterDescriptorImplM92623d;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        /* JADX INFO: renamed from: Q */
        public Caller<?> mo88623Q() {
            return (Caller) this.caller.getValue();
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Getter) && Intrinsics.m88377d(mo88499g(), ((Getter) other).mo88499g());
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        @NotNull
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public PropertyGetterDescriptor mo88837Z() {
            T tM88888b = this.descriptor.m88888b(this, f64371j[0]);
            tM88888b.getClass();
            return (PropertyGetterDescriptor) tM88888b;
        }

        @Override // kotlin.reflect.KCallable
        @NotNull
        public String getName() {
            return "<get-" + mo88499g().getName() + '>';
        }

        public int hashCode() {
            return mo88499g().hashCode();
        }

        @NotNull
        public String toString() {
            return "getter of " + mo88499g();
        }
    }

    @Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "h", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/Caller;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "Q", "()Lkotlin/reflect/jvm/internal/calls/Caller;", BLiveRole.caller, "getName", AuthenticationTokenClaims.JSON_KEY_NAME, "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static abstract class Setter<V> extends Accessor<V, Unit> implements KMutableProperty.Setter<V> {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ KProperty<Object>[] f64374j = {Reflection.m88403i(new PropertyReference1Impl(Setter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal descriptor = ReflectProperties.m88885c(new ryq(this));

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final Lazy caller = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new syq(this));

        /* JADX INFO: renamed from: d0 */
        public static final Caller m88845d0(Setter setter) {
            return KPropertyImplKt.m88849b(setter, false);
        }

        /* JADX INFO: renamed from: e0 */
        public static final PropertySetterDescriptor m88846e0(Setter setter) {
            PropertySetterDescriptor setter2 = setter.mo88499g().mo88837Z().getSetter();
            if (setter2 != null) {
                return setter2;
            }
            PropertyDescriptor propertyDescriptorMo88837Z = setter.mo88499g().mo88837Z();
            Annotations.Companion companion = Annotations.Companion;
            PropertySetterDescriptorImpl propertySetterDescriptorImplM92624e = DescriptorFactory.m92624e(propertyDescriptorMo88837Z, companion.m89532b(), companion.m89532b());
            propertySetterDescriptorImplM92624e.getClass();
            return propertySetterDescriptorImplM92624e;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        /* JADX INFO: renamed from: Q */
        public Caller<?> mo88623Q() {
            return (Caller) this.caller.getValue();
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Setter) && Intrinsics.m88377d(mo88499g(), ((Setter) other).mo88499g());
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        @NotNull
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
        public PropertySetterDescriptor mo88837Z() {
            T tM88888b = this.descriptor.m88888b(this, f64374j[0]);
            tM88888b.getClass();
            return (PropertySetterDescriptor) tM88888b;
        }

        @Override // kotlin.reflect.KCallable
        @NotNull
        public String getName() {
            return "<set-" + mo88499g().getName() + '>';
        }

        public int hashCode() {
            return mo88499g().hashCode();
        }

        @NotNull
        public String toString() {
            return "setter of " + mo88499g();
        }
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this._javaField = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new nyq(this));
        ReflectProperties.LazySoftVal<PropertyDescriptor> lazySoftValM88884b = ReflectProperties.m88884b(propertyDescriptor, new oyq(this));
        lazySoftValM88884b.getClass();
        this._descriptor = lazySoftValM88884b;
    }

    /* JADX INFO: renamed from: Z */
    public static final PropertyDescriptor m88827Z(KPropertyImpl kPropertyImpl) {
        return kPropertyImpl.getContainer().m88727z(kPropertyImpl.getName(), kPropertyImpl.signature);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Field m88828a0(KPropertyImpl kPropertyImpl) {
        Class<?> enclosingClass;
        JvmPropertySignature jvmPropertySignatureM88923f = RuntimeTypeMapper.INSTANCE.m88923f(kPropertyImpl.mo88837Z());
        if (!(jvmPropertySignatureM88923f instanceof JvmPropertySignature.KotlinProperty)) {
            if (jvmPropertySignatureM88923f instanceof JvmPropertySignature.JavaField) {
                return ((JvmPropertySignature.JavaField) jvmPropertySignatureM88923f).getField();
            }
            if ((jvmPropertySignatureM88923f instanceof JvmPropertySignature.JavaMethodProperty) || (jvmPropertySignatureM88923f instanceof JvmPropertySignature.MappedKotlinProperty)) {
                return null;
            }
            nbr.m162172a();
            return null;
        }
        JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureM88923f;
        PropertyDescriptor propertyDescriptorM88585b = kotlinProperty.getDescriptor();
        JvmMemberSignature.Field fieldM91909d = JvmProtoBufUtil.m91909d(JvmProtoBufUtil.INSTANCE, kotlinProperty.getProto(), kotlinProperty.getNameResolver(), kotlinProperty.getTypeTable(), false, 8, null);
        if (fieldM91909d == null) {
            return null;
        }
        if (DescriptorsJvmAbiUtil.m90264e(propertyDescriptorM88585b) || JvmProtoBufUtil.m91910f(kotlinProperty.getProto())) {
            enclosingClass = kPropertyImpl.getContainer().mo88354d().getEnclosingClass();
        } else {
            DeclarationDescriptor declarationDescriptorMo89190b = propertyDescriptorM88585b.mo89190b();
            enclosingClass = declarationDescriptorMo89190b instanceof ClassDescriptor ? UtilKt.m88945q((ClassDescriptor) declarationDescriptorMo89190b) : kPropertyImpl.getContainer().mo88354d();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(fieldM91909d.m91903e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* JADX INFO: renamed from: Q */
    public Caller<?> mo88623Q() {
        return mo88810h0().mo88623Q();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* JADX INFO: renamed from: R, reason: from getter */
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @Nullable
    /* JADX INFO: renamed from: S */
    public Caller<?> mo88625S() {
        return mo88810h0().mo88625S();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: X */
    public boolean mo88630X() {
        return this.rawBoundReceiver != CallableReference.NO_RECEIVER;
    }

    @Nullable
    /* JADX INFO: renamed from: d0 */
    public final Member m88831d0() {
        if (!mo88837Z().mo89513T()) {
            return null;
        }
        JvmPropertySignature jvmPropertySignatureM88923f = RuntimeTypeMapper.INSTANCE.m88923f(mo88837Z());
        if (jvmPropertySignatureM88923f instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureM88923f;
            if (kotlinProperty.getSignature().hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = kotlinProperty.getSignature().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return getContainer().m88726y(kotlinProperty.getNameResolver().getString(delegateMethod.getName()), kotlinProperty.getNameResolver().getString(delegateMethod.getDesc()));
            }
        }
        return m88835i0();
    }

    @Nullable
    /* JADX INFO: renamed from: e0 */
    public final Object m88832e0() {
        return ValueClassAwareCallerKt.m89006h(this.rawBoundReceiver, mo88837Z());
    }

    public boolean equals(@Nullable Object other) {
        KPropertyImpl<?> kPropertyImplM88932d = UtilKt.m88932d(other);
        return kPropertyImplM88932d != null && Intrinsics.m88377d(getContainer(), kPropertyImplM88932d.getContainer()) && Intrinsics.m88377d(getName(), kPropertyImplM88932d.getName()) && Intrinsics.m88377d(this.signature, kPropertyImplM88932d.signature) && Intrinsics.m88377d(this.rawBoundReceiver, kPropertyImplM88932d.rawBoundReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: f0 */
    public final Object m88833f0(@Nullable Member fieldOrMethod, @Nullable Object receiver1, @Nullable Object receiver2) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj = f64364n;
            if ((receiver1 == obj || receiver2 == obj) && mo88837Z().mo89337b0() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objM88832e0 = mo88630X() ? m88832e0() : receiver1;
            if (objM88832e0 == obj) {
                objM88832e0 = null;
            }
            if (!mo88630X()) {
                receiver1 = receiver2;
            }
            if (receiver1 == obj) {
                receiver1 = null;
            }
            AccessibleObject accessibleObject = fieldOrMethod instanceof AccessibleObject ? (AccessibleObject) fieldOrMethod : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(KCallablesJvm.m88528a(this));
            }
            if (fieldOrMethod == 0) {
                return null;
            }
            if (fieldOrMethod instanceof Field) {
                return ((Field) fieldOrMethod).get(objM88832e0);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError("delegate field/method " + fieldOrMethod + " neither field nor method");
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                if (objM88832e0 == null) {
                    Class<?> cls = ((Method) fieldOrMethod).getParameterTypes()[0];
                    cls.getClass();
                    objM88832e0 = UtilKt.m88935g(cls);
                }
                return method.invoke(null, objM88832e0);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + fieldOrMethod + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) fieldOrMethod;
            if (receiver1 == null) {
                Class<?> cls2 = ((Method) fieldOrMethod).getParameterTypes()[1];
                cls2.getClass();
                receiver1 = UtilKt.m88935g(cls2);
            }
            return method2.invoke(null, objM88832e0, receiver1);
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public PropertyDescriptor mo88837Z() {
        PropertyDescriptor propertyDescriptorInvoke = this._descriptor.invoke();
        propertyDescriptorInvoke.getClass();
        return propertyDescriptorInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public abstract Getter<V> mo88810h0();

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: i0 */
    public final Field m88835i0() {
        return this._javaField.getValue();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return mo88837Z().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return mo88837Z().mo89512y0();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.m88915w(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2, @Nullable Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        String strM91973b = propertyDescriptor.getName().m91973b();
        strM91973b.getClass();
        this(kDeclarationContainerImpl, strM91973b, RuntimeTypeMapper.INSTANCE.m88923f(propertyDescriptor).getString(), propertyDescriptor, CallableReference.NO_RECEIVER);
    }
}
