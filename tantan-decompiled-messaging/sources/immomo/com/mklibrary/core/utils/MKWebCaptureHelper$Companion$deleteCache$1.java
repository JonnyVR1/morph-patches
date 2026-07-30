package immomo.com.mklibrary.core.utils;

import com.cosmos.mdlog.MDLog;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b0g0;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
@DebugMetadata(m87373c = "immomo.com.mklibrary.core.utils.MKWebCaptureHelper$Companion$deleteCache$1", m87374f = "MKWebCaptureHelper.kt", m87375l = {}, m87376m = "invokeSuspend")
public final class MKWebCaptureHelper$Companion$deleteCache$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $type;
    final /* synthetic */ String $url;
    int label;

    /* JADX INFO: renamed from: p$ */
    private ppb f63314p$;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKWebCaptureHelper$Companion$deleteCache$1(String str, int i, Continuation continuation) {
        super(2, continuation);
        this.$url = str;
        this.$type = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        MKWebCaptureHelper$Companion$deleteCache$1 mKWebCaptureHelper$Companion$deleteCache$1 = new MKWebCaptureHelper$Companion$deleteCache$1(this.$url, this.$type, continuation);
        mKWebCaptureHelper$Companion$deleteCache$1.f63314p$ = (ppb) obj;
        return mKWebCaptureHelper$Companion$deleteCache$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((MKWebCaptureHelper$Companion$deleteCache$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        String str;
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        try {
            if (b0g0.m99769b(this.$url)) {
                MKWebCaptureHelper.INSTANCE.m87178e();
            } else {
                MKWebCaptureHelper.Companion companion = MKWebCaptureHelper.INSTANCE;
                String str2 = this.$url;
                int i = this.$type;
                if (i != 0) {
                    str = i != 1 ? "" : "2";
                } else {
                    str = "1";
                }
                File fileM87184k = companion.m87184k(str2, str);
                if (fileM87184k != null && fileM87184k.exists()) {
                    fileM87184k.delete();
                }
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKWebCaptureHelper", th);
        }
        return Unit.INSTANCE;
    }
}
