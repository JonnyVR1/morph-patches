package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.h5f;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a|\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0014\u0010\u0015\u001a0\u0010\u0017\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001e\u001a\u00020\u0012*\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "Lkotlin/Function3;", "Ll/fri;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "a", "(Ll/eri;Lkotlin/jvm/functions/Function3;)Ll/eri;", "Lkotlin/Function4;", "", "attempt", "", "predicate", "e", "(Ll/eri;Lkotlin/jvm/functions/Function4;)Ll/eri;", "collector", "b", "(Ll/eri;Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", Constants.INAPP_DATA_TAG, "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__ErrorsKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> eri<T> m94087a(@NotNull eri<? extends T> eriVar, @NotNull Function3<? super fri<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(eriVar, function3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94088b(@NotNull eri<? extends T> eriVar, @NotNull fri<? super T> friVar, @NotNull Continuation<? super Throwable> continuation) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Ref.ObjectRef objectRef;
        Throwable th;
        if (continuation instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuation;
            int i = flowKt__ErrorsKt$catchImpl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuation);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuation);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ErrorsKt$catchImpl$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                fri<? super Object> flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2<>(friVar, objectRef2);
                flowKt__ErrorsKt$catchImpl$1.L$0 = objectRef2;
                flowKt__ErrorsKt$catchImpl$1.label = 1;
                if (eriVar.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == objM196133e) {
                    return objM196133e;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                objectRef = objectRef2;
                th = (Throwable) objectRef.element;
                if (m94090d(th, th)) {
                }
                throw th;
            }
        }
        if (i2 != 1) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        objectRef = (Ref.ObjectRef) flowKt__ErrorsKt$catchImpl$1.L$0;
        try {
            ResultKt.m87239b(obj);
            return null;
        } catch (Throwable th3) {
            th = th3;
            th = (Throwable) objectRef.element;
            if (!m94090d(th, th) || m94089c(th, flowKt__ErrorsKt$catchImpl$1.getContext())) {
                throw th;
            }
            if (th == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                h5f.m129395a(th, th);
                throw th;
            }
            h5f.m129395a(th, th);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m94089c(Throwable th, CoroutineContext coroutineContext) {
        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) coroutineContext.get(InterfaceC15486o.INSTANCE);
        if (interfaceC15486o == null || !interfaceC15486o.isCancelled()) {
            return false;
        }
        return m94090d(th, interfaceC15486o.mo93653M());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m94090d(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.m87488d(th2, th);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> eri<T> m94091e(@NotNull eri<? extends T> eriVar, @NotNull Function4<? super fri<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(eriVar, function4);
    }
}
