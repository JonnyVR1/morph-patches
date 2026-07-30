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
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.l6f;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a|\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0014\u0010\u0015\u001a0\u0010\u0017\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001e\u001a\u00020\u0012*\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "Lkotlin/Function3;", "Ll/bui;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "a", "(Ll/aui;Lkotlin/jvm/functions/Function3;)Ll/aui;", "Lkotlin/Function4;", "", "attempt", "", "predicate", "e", "(Ll/aui;Lkotlin/jvm/functions/Function4;)Ll/aui;", "collector", "b", "(Ll/aui;Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", Constants.INAPP_DATA_TAG, "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__ErrorsKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> aui<T> m94980a(@NotNull aui<? extends T> auiVar, @NotNull Function3<? super bui<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(auiVar, function3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94981b(@NotNull aui<? extends T> auiVar, @NotNull bui<? super T> buiVar, @NotNull Continuation<? super Throwable> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ErrorsKt$catchImpl$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                bui<? super Object> flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2<>(buiVar, objectRef2);
                flowKt__ErrorsKt$catchImpl$1.L$0 = objectRef2;
                flowKt__ErrorsKt$catchImpl$1.label = 1;
                if (auiVar.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == objM198688e) {
                    return objM198688e;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                objectRef = objectRef2;
                th = (Throwable) objectRef.element;
                if (m94983d(th, th)) {
                }
                throw th;
            }
        }
        if (i2 != 1) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        objectRef = (Ref.ObjectRef) flowKt__ErrorsKt$catchImpl$1.L$0;
        try {
            ResultKt.m88128b(obj);
            return null;
        } catch (Throwable th3) {
            th = th3;
            th = (Throwable) objectRef.element;
            if (!m94983d(th, th) || m94982c(th, flowKt__ErrorsKt$catchImpl$1.getContext())) {
                throw th;
            }
            if (th == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                l6f.m153058a(th, th);
                throw th;
            }
            l6f.m153058a(th, th);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m94982c(Throwable th, CoroutineContext coroutineContext) {
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) coroutineContext.get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o == null || !interfaceC15593o.isCancelled()) {
            return false;
        }
        return m94983d(th, interfaceC15593o.mo94544M());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m94983d(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.m88377d(th2, th);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> aui<T> m94984e(@NotNull aui<? extends T> auiVar, @NotNull Function4<? super bui<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(auiVar, function4);
    }
}
