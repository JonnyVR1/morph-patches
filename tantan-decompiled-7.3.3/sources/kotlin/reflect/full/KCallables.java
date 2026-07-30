package kotlin.reflect.full;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.azq;
import p153l.uyp;
import p153l.v1d0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\u001a8\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002\"\u0004\u0018\u00010\u0003H\u0087@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0087@¢\u0006\u0004\b\t\u0010\n\"(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000b*\u0006\u0012\u0002\b\u00030\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"$\u0010\u0014\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012\"(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u000b*\u0006\u0012\u0002\b\u00030\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0015\u0010\r¨\u0006\u0018"}, m88121d2 = {"R", "Lkotlin/reflect/KCallable;", "", "", "args", "a", "(Lkotlin/reflect/KCallable;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/reflect/KParameter;", "b", "(Lkotlin/reflect/KCallable;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "(Lkotlin/reflect/KCallable;)Ljava/util/List;", "getContextParameters$annotations", "(Lkotlin/reflect/KCallable;)V", "contextParameters", Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/KCallable;)Lkotlin/reflect/KParameter;", "getExtensionReceiverParameter$annotations", "extensionReceiverParameter", "e", "getValueParameters$annotations", "valueParameters", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class KCallables {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SinceKotlin
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <R> Object m88518a(@NotNull KCallable<? extends R> kCallable, @NotNull Object[] objArr, @NotNull Continuation<? super R> continuation) throws Throwable {
        KCallables$callSuspend$1 kCallables$callSuspend$1;
        if (continuation instanceof KCallables$callSuspend$1) {
            kCallables$callSuspend$1 = (KCallables$callSuspend$1) continuation;
            int i = kCallables$callSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                kCallables$callSuspend$1 = new KCallables$callSuspend$1(continuation);
            }
        } else {
            kCallables$callSuspend$1 = new KCallables$callSuspend$1(continuation);
        }
        Object objCall = kCallables$callSuspend$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = kCallables$callSuspend$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objCall);
            if (!kCallable.isSuspend()) {
                return kCallable.call(Arrays.copyOf(objArr, objArr.length));
            }
            if (!(kCallable instanceof KFunction)) {
                v1d0.m199002a("Cannot callSuspend on a property ", kCallable, ": suspend properties are not supported yet");
                return null;
            }
            kCallables$callSuspend$1.L$0 = kCallable;
            kCallables$callSuspend$1.L$1 = objArr;
            kCallables$callSuspend$1.label = 1;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.m88420b(objArr);
            spreadBuilder.m88419a(kCallables$callSuspend$1);
            objCall = kCallable.call(spreadBuilder.m88422d(new Object[spreadBuilder.m88421c()]));
            if (objCall == uyp.m198688e()) {
                DebugProbesKt.m88272c(kCallables$callSuspend$1);
            }
            if (objCall == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kCallable = (KCallable) kCallables$callSuspend$1.L$0;
            ResultKt.m88128b(objCall);
        }
        KFunction kFunction = (KFunction) kCallable;
        return (!Intrinsics.m88377d(kFunction.getReturnType().mo88449i(), Reflection.m88396b(Unit.class)) || kFunction.getReturnType().mo88451k()) ? objCall : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SinceKotlin
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <R> Object m88519b(@NotNull KCallable<? extends R> kCallable, @NotNull Map<KParameter, ? extends Object> map, @NotNull Continuation<? super R> continuation) throws Throwable {
        KCallables$callSuspendBy$1 kCallables$callSuspendBy$1;
        if (continuation instanceof KCallables$callSuspendBy$1) {
            kCallables$callSuspendBy$1 = (KCallables$callSuspendBy$1) continuation;
            int i = kCallables$callSuspendBy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspendBy$1.label = i - Integer.MIN_VALUE;
            } else {
                kCallables$callSuspendBy$1 = new KCallables$callSuspendBy$1(continuation);
            }
        } else {
            kCallables$callSuspendBy$1 = new KCallables$callSuspendBy$1(continuation);
        }
        Object objM88618L = kCallables$callSuspendBy$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = kCallables$callSuspendBy$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objM88618L);
            if (!kCallable.isSuspend()) {
                return kCallable.callBy(map);
            }
            if (!(kCallable instanceof KFunction)) {
                v1d0.m199002a("Cannot callSuspendBy on a property ", kCallable, ": suspend properties are not supported yet");
                return null;
            }
            KCallableImpl<?> kCallableImplM88930b = UtilKt.m88930b(kCallable);
            if (kCallableImplM88930b == null) {
                azq.m101080a("This callable does not support a default call: ", kCallable);
                return null;
            }
            kCallables$callSuspendBy$1.L$0 = kCallable;
            kCallables$callSuspendBy$1.L$1 = map;
            kCallables$callSuspendBy$1.L$2 = kCallableImplM88930b;
            kCallables$callSuspendBy$1.label = 1;
            objM88618L = kCallableImplM88930b.m88618L(map, kCallables$callSuspendBy$1);
            if (objM88618L == uyp.m198688e()) {
                DebugProbesKt.m88272c(kCallables$callSuspendBy$1);
            }
            if (objM88618L == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kCallable = (KCallable) kCallables$callSuspendBy$1.L$0;
            ResultKt.m88128b(objM88618L);
        }
        KFunction kFunction = (KFunction) kCallable;
        return (!Intrinsics.m88377d(kFunction.getReturnType().mo88449i(), Reflection.m88396b(Unit.class)) || kFunction.getReturnType().mo88451k()) ? objM88618L : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final List<KParameter> m88520c(@NotNull KCallable<?> kCallable) {
        kCallable.getClass();
        List<KParameter> parameters = kCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((KParameter) obj).getKind() == KParameter.Kind.CONTEXT) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final KParameter m88521d(@NotNull KCallable<?> kCallable) {
        kCallable.getClass();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        for (Object obj3 : kCallable.getParameters()) {
            if (((KParameter) obj3).getKind() == KParameter.Kind.EXTENSION_RECEIVER) {
                if (z) {
                    return (KParameter) obj;
                }
                z = true;
                obj2 = obj3;
            }
        }
        if (z) {
            obj = obj2;
        }
        return (KParameter) obj;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final List<KParameter> m88522e(@NotNull KCallable<?> kCallable) {
        kCallable.getClass();
        List<KParameter> parameters = kCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((KParameter) obj).getKind() == KParameter.Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
