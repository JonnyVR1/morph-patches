package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveRole;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialOperation;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerKt;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.l9r;
import p149l.muq;
import p149l.pvq;
import p149l.qvq;
import p149l.rvq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b&\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010!J5\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0%2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001f\u0010@\u001a\u0006\u0012\u0002\b\u00030\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R!\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010/R\u0014\u0010K\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010-R\u0014\u0010L\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010GR\u0014\u0010M\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010GR\u0014\u0010N\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010GR\u0014\u0010O\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010GR\u0014\u0010P\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010G¨\u0006Q"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", AuthenticationTokenClaims.JSON_KEY_NAME, SocialOperation.GAME_SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptorInitialValue", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "t0", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "Ljava/lang/reflect/Method;", "member", "", "u0", "(Ljava/lang/reflect/Method;)Z", "isCallByToValueClassMangledMethod", "Lkotlin/reflect/jvm/internal/calls/Caller;", "g0", "(Ljava/lang/reflect/Method;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "f0", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "e0", "Ljava/lang/reflect/Constructor;", "isDefault", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "d0", "(Ljava/lang/reflect/Constructor;Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;Z)Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "h", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "R", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "j", "Ljava/lang/Object;", "k", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", BLiveStormDanmakuGiftResourceType.f44444l, "Lkotlin/Lazy;", "Q", "()Lkotlin/reflect/jvm/internal/calls/Caller;", BLiveRole.caller, "m", j6f.LATITUDE_SOUTH, "defaultCaller", "r0", "()Ljava/lang/Object;", "X", "()Z", "isBound", "getName", "getArity", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ KProperty<Object>[] f63649n = {Reflection.m87514i(new PropertyReference1Impl(KFunctionImpl.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final KDeclarationContainerImpl container;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String signature;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final Object rawBoundReceiver;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal descriptor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy caller;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy defaultCaller;

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = ReflectProperties.m87993b(functionDescriptor, new pvq(this, str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.caller = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new qvq(this));
        this.defaultCaller = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new rvq(this));
    }

    /* JADX INFO: renamed from: c0 */
    public static final Caller m87848c0(KFunctionImpl kFunctionImpl) {
        Object objM87685d;
        Caller<?> callerM87854f0;
        JvmFunctionSignature jvmFunctionSignatureM88033g = RuntimeTypeMapper.INSTANCE.m88033g(kFunctionImpl.mo87946Z());
        if (jvmFunctionSignatureM88033g instanceof JvmFunctionSignature.KotlinConstructor) {
            if (kFunctionImpl.m87738W()) {
                Class<?> clsMo87465d = kFunctionImpl.getContainer().mo87465d();
                List<KParameter> parameters = kFunctionImpl.getParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((KParameter) it.next()).getName();
                    name.getClass();
                    arrayList.add(name);
                }
                return new AnnotationConstructorCaller(clsMo87465d, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            objM87685d = kFunctionImpl.getContainer().m87831t(((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureM88033g).m87687b());
        } else if (jvmFunctionSignatureM88033g instanceof JvmFunctionSignature.KotlinFunction) {
            FunctionDescriptor functionDescriptorMo87946Z = kFunctionImpl.mo87946Z();
            DeclarationDescriptor declarationDescriptorMo88299b = functionDescriptorMo87946Z.mo88299b();
            declarationDescriptorMo88299b.getClass();
            if (InlineClassesUtilsKt.m91789d(declarationDescriptorMo88299b) && (functionDescriptorMo87946Z instanceof ConstructorDescriptor) && ((ConstructorDescriptor) functionDescriptorMo87946Z).mo88463i0()) {
                FunctionDescriptor functionDescriptorMo87946Z2 = kFunctionImpl.mo87946Z();
                KDeclarationContainerImpl container = kFunctionImpl.getContainer();
                String strM87688b = ((JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureM88033g).m87688b();
                List<ValueParameterDescriptor> listMo88448g = kFunctionImpl.mo87946Z().mo88448g();
                listMo88448g.getClass();
                return new ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller(functionDescriptorMo87946Z2, container, strM87688b, listMo88448g);
            }
            JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureM88033g;
            objM87685d = kFunctionImpl.getContainer().m87835y(kotlinFunction.m87689c(), kotlinFunction.m87688b());
        } else if (jvmFunctionSignatureM88033g instanceof JvmFunctionSignature.JavaMethod) {
            objM87685d = ((JvmFunctionSignature.JavaMethod) jvmFunctionSignatureM88033g).getCom.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String();
            objM87685d.getClass();
        } else {
            if (!(jvmFunctionSignatureM88033g instanceof JvmFunctionSignature.JavaConstructor)) {
                if (!(jvmFunctionSignatureM88033g instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                    l9r.m149037a();
                    return null;
                }
                List<Method> listM87682d = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureM88033g).m87682d();
                Class<?> clsMo87465d2 = kFunctionImpl.getContainer().mo87465d();
                List<Method> list = listM87682d;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(clsMo87465d2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, listM87682d);
            }
            objM87685d = ((JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureM88033g).m87685d();
            objM87685d.getClass();
        }
        if (objM87685d instanceof Constructor) {
            callerM87854f0 = kFunctionImpl.m87852d0((Constructor) objM87685d, kFunctionImpl.mo87946Z(), false);
        } else {
            if (!(objM87685d instanceof Method)) {
                muq.m156427a("Could not compute caller for function: ", kFunctionImpl.mo87946Z(), " (member = ", objM87685d);
                return null;
            }
            Method method = (Method) objM87685d;
            if (Modifier.isStatic(method.getModifiers())) {
                callerM87854f0 = kFunctionImpl.mo87946Z().getAnnotations().mo88638b(UtilKt.m88047j()) != null ? kFunctionImpl.m87854f0(method) : kFunctionImpl.m87855g0(method, false);
            } else {
                callerM87854f0 = kFunctionImpl.m87853e0(method);
            }
        }
        return ValueClassAwareCallerKt.m88117j(callerM87854f0, kFunctionImpl.mo87946Z(), false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0175  */
    /* JADX INFO: renamed from: p0 */
    public static final Caller m87849p0(KFunctionImpl kFunctionImpl) {
        GenericDeclaration genericDeclarationM87832u;
        Caller<?> callerM87855g0;
        RuntimeTypeMapper runtimeTypeMapper = RuntimeTypeMapper.INSTANCE;
        JvmFunctionSignature jvmFunctionSignatureM88033g = runtimeTypeMapper.m88033g(kFunctionImpl.mo87946Z());
        if (jvmFunctionSignatureM88033g instanceof JvmFunctionSignature.KotlinFunction) {
            FunctionDescriptor functionDescriptorMo87946Z = kFunctionImpl.mo87946Z();
            DeclarationDescriptor declarationDescriptorMo88299b = functionDescriptorMo87946Z.mo88299b();
            declarationDescriptorMo88299b.getClass();
            if (InlineClassesUtilsKt.m91789d(declarationDescriptorMo88299b) && (functionDescriptorMo87946Z instanceof ConstructorDescriptor) && ((ConstructorDescriptor) functionDescriptorMo87946Z).mo88463i0()) {
                throw new KotlinReflectionInternalError(kFunctionImpl.mo87946Z().mo88299b() + " cannot have default arguments");
            }
            FunctionDescriptor functionDescriptorM87865t0 = kFunctionImpl.m87865t0(kFunctionImpl.mo87946Z());
            if (functionDescriptorM87865t0 != null) {
                JvmFunctionSignature jvmFunctionSignatureM88033g2 = runtimeTypeMapper.m88033g(functionDescriptorM87865t0);
                jvmFunctionSignatureM88033g2.getClass();
                JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureM88033g2;
                genericDeclarationM87832u = kFunctionImpl.getContainer().m87833v(kotlinFunction.m87689c(), kotlinFunction.m87688b(), true);
            } else {
                KDeclarationContainerImpl container = kFunctionImpl.getContainer();
                JvmFunctionSignature.KotlinFunction kotlinFunction2 = (JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureM88033g;
                String strM87689c = kotlinFunction2.m87689c();
                String strM87688b = kotlinFunction2.m87688b();
                Member memberMo88059b = kFunctionImpl.mo87732Q().mo88059b();
                memberMo88059b.getClass();
                genericDeclarationM87832u = container.m87833v(strM87689c, strM87688b, !Modifier.isStatic(memberMo88059b.getModifiers()));
            }
        } else if (jvmFunctionSignatureM88033g instanceof JvmFunctionSignature.KotlinConstructor) {
            if (kFunctionImpl.m87738W()) {
                Class<?> clsMo87465d = kFunctionImpl.getContainer().mo87465d();
                List<KParameter> parameters = kFunctionImpl.getParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((KParameter) it.next()).getName();
                    name.getClass();
                    arrayList.add(name);
                }
                return new AnnotationConstructorCaller(clsMo87465d, arrayList, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            genericDeclarationM87832u = kFunctionImpl.getContainer().m87832u(((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureM88033g).m87687b());
        } else {
            if (jvmFunctionSignatureM88033g instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                List<Method> listM87682d = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureM88033g).m87682d();
                Class<?> clsMo87465d2 = kFunctionImpl.getContainer().mo87465d();
                List<Method> list = listM87682d;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(clsMo87465d2, arrayList2, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, listM87682d);
            }
            genericDeclarationM87832u = null;
        }
        if (genericDeclarationM87832u instanceof Constructor) {
            callerM87855g0 = kFunctionImpl.m87852d0((Constructor) genericDeclarationM87832u, kFunctionImpl.mo87946Z(), true);
        } else if (!(genericDeclarationM87832u instanceof Method)) {
            callerM87855g0 = null;
        } else if (kFunctionImpl.mo87946Z().getAnnotations().mo88638b(UtilKt.m88047j()) != null) {
            DeclarationDescriptor declarationDescriptorMo88299b2 = kFunctionImpl.mo87946Z().mo88299b();
            declarationDescriptorMo88299b2.getClass();
            if (((ClassDescriptor) declarationDescriptorMo88299b2).mo88302h0()) {
                callerM87855g0 = kFunctionImpl.m87855g0((Method) genericDeclarationM87832u, kFunctionImpl.mo87732Q().mo88058a());
            } else {
                callerM87855g0 = kFunctionImpl.m87854f0((Method) genericDeclarationM87832u);
            }
        } else {
            callerM87855g0 = kFunctionImpl.m87855g0((Method) genericDeclarationM87832u, kFunctionImpl.mo87732Q().mo88058a());
        }
        if (callerM87855g0 != null) {
            return ValueClassAwareCallerKt.m88116i(callerM87855g0, kFunctionImpl.mo87946Z(), true);
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public static final FunctionDescriptor m87850q0(KFunctionImpl kFunctionImpl, String str) {
        return kFunctionImpl.getContainer().m87834w(str, kFunctionImpl.signature);
    }

    /* JADX INFO: renamed from: r0 */
    private final Object m87851r0() {
        return ValueClassAwareCallerKt.m88115h(this.rawBoundReceiver, mo87946Z());
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* JADX INFO: renamed from: Q */
    public Caller<?> mo87732Q() {
        return (Caller) this.caller.getValue();
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
    public Caller<?> mo87734S() {
        return (Caller) this.defaultCaller.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: X */
    public boolean mo87739X() {
        return this.rawBoundReceiver != CallableReference.NO_RECEIVER;
    }

    /* JADX INFO: renamed from: d0 */
    public final CallerImpl<Constructor<?>> m87852d0(Constructor<?> member, FunctionDescriptor descriptor, boolean isDefault) {
        if (isDefault || !InlineClassManglingRulesKt.m92011f(descriptor)) {
            return mo87739X() ? new CallerImpl.BoundConstructor(member, m87851r0()) : new CallerImpl.Constructor(member);
        }
        return mo87739X() ? new CallerImpl.AccessorForHiddenBoundConstructor(member, m87851r0()) : new CallerImpl.AccessorForHiddenConstructor(member);
    }

    /* JADX INFO: renamed from: e0 */
    public final CallerImpl.Method m87853e0(Method member) {
        return mo87739X() ? new CallerImpl.Method.BoundInstance(member, m87851r0()) : new CallerImpl.Method.Instance(member);
    }

    public boolean equals(@Nullable Object other) {
        KFunctionImpl kFunctionImplM88040c = UtilKt.m88040c(other);
        return kFunctionImplM88040c != null && Intrinsics.m87488d(getContainer(), kFunctionImplM88040c.getContainer()) && Intrinsics.m87488d(getName(), kFunctionImplM88040c.getName()) && Intrinsics.m87488d(this.signature, kFunctionImplM88040c.signature) && Intrinsics.m87488d(this.rawBoundReceiver, kFunctionImplM88040c.rawBoundReceiver);
    }

    /* JADX INFO: renamed from: f0 */
    public final CallerImpl.Method m87854f0(Method member) {
        return mo87739X() ? new CallerImpl.Method.BoundJvmStaticInObject(member) : new CallerImpl.Method.JvmStaticInObject(member);
    }

    /* JADX INFO: renamed from: g0 */
    public final Caller<?> m87855g0(Method member, boolean isCallByToValueClassMangledMethod) {
        if (mo87739X()) {
            return new CallerImpl.Method.BoundStatic(member, isCallByToValueClassMangledMethod, m87866u0(member) ? this.rawBoundReceiver : m87851r0());
        }
        return new CallerImpl.Method.Static(member);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return CallerKt.m88091a(mo87732Q());
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public String getName() {
        String strM91082b = mo87946Z().getName().m91082b();
        strM91082b.getClass();
        return strM91082b;
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public Object m87856h0() {
        return call(new Object[0]);
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: i0 */
    public Object m87857i0(Object obj) {
        return call(obj);
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public /* bridge */ Object invoke() {
        return m87856h0();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return mo87946Z().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return mo87946Z().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return mo87946Z().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return mo87946Z().isOperator();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return mo87946Z().isSuspend();
    }

    @Nullable
    /* JADX INFO: renamed from: j0 */
    public Object m87858j0(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public Object m87859k0(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Nullable
    /* JADX INFO: renamed from: l0 */
    public Object m87860l0(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Nullable
    /* JADX INFO: renamed from: m0 */
    public Object m87861m0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Nullable
    /* JADX INFO: renamed from: n0 */
    public Object m87862n0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Nullable
    /* JADX INFO: renamed from: o0 */
    public Object m87863o0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public FunctionDescriptor mo87946Z() {
        T tM87997b = this.descriptor.m87997b(this, f63649n[0]);
        tM87997b.getClass();
        return (FunctionDescriptor) tM87997b;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0096 A[EDGE_INSN: B:40:0x0096->B:32:0x0096 BREAK  A[LOOP:0: B:18:0x005a->B:41:0x005a, LOOP_LABEL: LOOP:0: B:18:0x005a->B:41:0x005a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:1: B:26:0x0082->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: t0 */
    public final FunctionDescriptor m87865t0(FunctionDescriptor descriptor) {
        DeclarationDescriptor declarationDescriptorMo88299b;
        Member memberMo88059b;
        Iterator<CallableMemberDescriptor> it;
        CallableMemberDescriptor next;
        List<ValueParameterDescriptor> list;
        Iterator<T> it2;
        List<ValueParameterDescriptor> listMo88448g = descriptor.mo88448g();
        listMo88448g.getClass();
        List<ValueParameterDescriptor> list2 = listMo88448g;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            declarationDescriptorMo88299b = descriptor.mo88299b();
            declarationDescriptorMo88299b.getClass();
            if (InlineClassesUtilsKt.m91792g(declarationDescriptorMo88299b)) {
                memberMo88059b = mo87732Q().mo88059b();
                memberMo88059b.getClass();
                if (Modifier.isStatic(memberMo88059b.getModifiers())) {
                    it = DescriptorUtilsKt.m91993z(descriptor, false).iterator();
                    loop0: while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        List<ValueParameterDescriptor> listMo88448g2 = next.mo88448g();
                        listMo88448g2.getClass();
                        list = listMo88448g2;
                        if (list instanceof Collection) {
                        }
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((ValueParameterDescriptor) it2.next()).mo88615M()) {
                                break loop0;
                                break loop0;
                            }
                        }
                    }
                    if (next instanceof FunctionDescriptor) {
                        return (FunctionDescriptor) next;
                    }
                }
            }
        } else {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (((ValueParameterDescriptor) it3.next()).mo88615M()) {
                }
            }
            declarationDescriptorMo88299b = descriptor.mo88299b();
            declarationDescriptorMo88299b.getClass();
            if (InlineClassesUtilsKt.m91792g(declarationDescriptorMo88299b)) {
                memberMo88059b = mo87732Q().mo88059b();
                memberMo88059b.getClass();
                if (Modifier.isStatic(memberMo88059b.getModifiers())) {
                    it = DescriptorUtilsKt.m91993z(descriptor, false).iterator();
                    loop0: while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        List<ValueParameterDescriptor> listMo88448g3 = next.mo88448g();
                        listMo88448g3.getClass();
                        list = listMo88448g3;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((ValueParameterDescriptor) it2.next()).mo88615M()) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    if (next instanceof FunctionDescriptor) {
                        return (FunctionDescriptor) next;
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.m88020q(this);
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m87866u0(Method member) {
        KotlinType type;
        ReceiverParameterDescriptor receiverParameterDescriptorMo88444Y = mo87946Z().mo88444Y();
        if (receiverParameterDescriptorMo88444Y == null || (type = receiverParameterDescriptorMo88444Y.getType()) == null || !InlineClassesUtilsKt.m91788c(type)) {
            return false;
        }
        Class<?>[] parameterTypes = member.getParameterTypes();
        parameterTypes.getClass();
        Class cls = (Class) ArraysKt.firstOrNull(parameterTypes);
        return cls != null && cls.isInterface();
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public /* bridge */ Object invoke(@Nullable Object obj) {
        return m87857i0(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public /* bridge */ Object invoke(@Nullable Object obj, @Nullable Object obj2) {
        return m87858j0(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public /* bridge */ Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        return m87859k0(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    @Nullable
    public /* bridge */ Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4) {
        return m87860l0(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    @Nullable
    public /* bridge */ Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5) {
        return m87861m0(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    @Nullable
    public /* bridge */ Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6) {
        return m87862n0(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.functions.Function7
    @Nullable
    public /* bridge */ Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7) {
        return m87863o0(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, FunctionDescriptor functionDescriptor, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kDeclarationContainerImpl, str, str2, functionDescriptor, (i & 16) != 0 ? CallableReference.NO_RECEIVER : obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2, @Nullable Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull FunctionDescriptor functionDescriptor) {
        kDeclarationContainerImpl.getClass();
        functionDescriptor.getClass();
        String strM91082b = functionDescriptor.getName().m91082b();
        strM91082b.getClass();
        this(kDeclarationContainerImpl, strM91082b, RuntimeTypeMapper.INSTANCE.m88033g(functionDescriptor).get_signature(), functionDescriptor, null, 16, null);
    }
}
