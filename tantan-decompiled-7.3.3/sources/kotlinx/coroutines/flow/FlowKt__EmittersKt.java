package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.aui;
import p153l.bui;
import p153l.l6f;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;
import p153l.wyi0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001ai\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\u0010\f\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ap\u0010\u0011\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032D\u0010\f\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "Lkotlin/Function3;", "Ll/bui;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", Constants.INAPP_DATA_TAG, "(Ll/aui;Lkotlin/jvm/functions/Function3;)Ll/aui;", "b", "(Ll/bui;)V", "c", "(Ll/bui;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__EmittersKt {
    /* JADX INFO: renamed from: b */
    public static final void m94977b(@NotNull bui<?> buiVar) {
        if (buiVar instanceof wyi0) {
            throw ((wyi0) buiVar).e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final <T> Object m94978c(bui<? super T> buiVar, Function3<? super bui<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3, Throwable th, Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (continuation instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuation;
            int i = flowKt__EmittersKt$invokeSafely$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuation);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuation);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__EmittersKt$invokeSafely$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                flowKt__EmittersKt$invokeSafely$1.L$0 = th;
                flowKt__EmittersKt$invokeSafely$1.label = 1;
                if (function3.invoke(buiVar, th, flowKt__EmittersKt$invokeSafely$1) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) flowKt__EmittersKt$invokeSafely$1.L$0;
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                l6f.m153058a(th2, th);
            }
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> aui<T> m94979d(@NotNull aui<? extends T> auiVar, @NotNull Function3<? super bui<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(auiVar, function3);
    }
}
