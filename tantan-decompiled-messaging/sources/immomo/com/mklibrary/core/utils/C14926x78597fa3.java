package immomo.com.mklibrary.core.utils;

import android.graphics.drawable.Drawable;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: renamed from: immomo.com.mklibrary.core.utils.MKWebCaptureHelper$checkLoad$1$invokeSuspend$$inlined$also$lambda$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "immomo/com/mklibrary/core/utils/MKWebCaptureHelper$checkLoad$1$1$1", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
public final class C14926x78597fa3 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef $drawable;
    final /* synthetic */ File $file$inlined;
    int label;

    /* JADX INFO: renamed from: p$ */
    private ppb f63316p$;
    final /* synthetic */ MKWebCaptureHelper$checkLoad$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14926x78597fa3(Ref.ObjectRef objectRef, Continuation continuation, MKWebCaptureHelper$checkLoad$1 mKWebCaptureHelper$checkLoad$1, File file) {
        super(2, continuation);
        this.$drawable = objectRef;
        this.this$0 = mKWebCaptureHelper$checkLoad$1;
        this.$file$inlined = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        C14926x78597fa3 c14926x78597fa3 = new C14926x78597fa3(this.$drawable, continuation, this.this$0, this.$file$inlined);
        c14926x78597fa3.f63316p$ = (ppb) obj;
        return c14926x78597fa3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((C14926x78597fa3) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        if (!this.this$0.this$0.isReleasedCaptureTask.get()) {
            MKWebView mKWebView = (MKWebView) this.this$0.$cacheWeb.get();
            if (mKWebView != null) {
                mKWebView.setForeground((Drawable) this.$drawable.element);
            }
            this.this$0.$mkWebView.setLoadedCapture(true);
        }
        return Unit.INSTANCE;
    }
}
