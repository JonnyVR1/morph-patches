package immomo.com.mklibrary.core.utils;

import com.cosmos.mdlog.MDLog;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
@DebugMetadata(m87373c = "immomo.com.mklibrary.core.utils.MKWebCaptureHelper$onRelease$1", m87374f = "MKWebCaptureHelper.kt", m87375l = {}, m87376m = "invokeSuspend")
public final class MKWebCaptureHelper$onRelease$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ MKWebView $mkWebView;
    int label;

    /* JADX INFO: renamed from: p$ */
    private ppb f63317p$;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKWebCaptureHelper$onRelease$1(MKWebView mKWebView, Continuation continuation) {
        super(2, continuation);
        this.$mkWebView = mKWebView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        MKWebCaptureHelper$onRelease$1 mKWebCaptureHelper$onRelease$1 = new MKWebCaptureHelper$onRelease$1(this.$mkWebView, continuation);
        mKWebCaptureHelper$onRelease$1.f63317p$ = (ppb) obj;
        return mKWebCaptureHelper$onRelease$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((MKWebCaptureHelper$onRelease$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        try {
            this.$mkWebView.setForeground(null);
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKWebCaptureHelper", th);
        }
        return Unit.INSTANCE;
    }
}
