package immomo.com.mklibrary.core.utils;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.task.MMDispatchers;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hh3;
import p149l.p2e;
import p149l.ppb;
import p149l.qkq0;
import p149l.taj;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
@DebugMetadata(m87373c = "immomo.com.mklibrary.core.utils.MKWebCaptureHelper$checkLoad$1", m87374f = "MKWebCaptureHelper.kt", m87375l = {287}, m87376m = "invokeSuspend")
public final class MKWebCaptureHelper$checkLoad$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ WeakReference $cacheWeb;
    final /* synthetic */ MKWebView $mkWebView;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX INFO: renamed from: p$ */
    private ppb f63315p$;
    final /* synthetic */ MKWebCaptureHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKWebCaptureHelper$checkLoad$1(MKWebCaptureHelper mKWebCaptureHelper, String str, WeakReference weakReference, MKWebView mKWebView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mKWebCaptureHelper;
        this.$url = str;
        this.$cacheWeb = weakReference;
        this.$mkWebView = mKWebView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        MKWebCaptureHelper$checkLoad$1 mKWebCaptureHelper$checkLoad$1 = new MKWebCaptureHelper$checkLoad$1(this.this$0, this.$url, this.$cacheWeb, this.$mkWebView, continuation);
        mKWebCaptureHelper$checkLoad$1.f63315p$ = (ppb) obj;
        return mKWebCaptureHelper$checkLoad$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((MKWebCaptureHelper$checkLoad$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, android.graphics.drawable.Drawable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        File file;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = this.f63315p$;
                Uri uri = Uri.parse(this.$url);
                String queryParameter = uri.getQueryParameter("_capture");
                MKWebCaptureHelper.Companion companion = MKWebCaptureHelper.INSTANCE;
                File fileM87184k = companion.m87184k(this.$url, queryParameter);
                if (fileM87184k == null) {
                    return Unit.INSTANCE;
                }
                if (fileM87184k.exists()) {
                    if (companion.m87175c(fileM87184k)) {
                        fileM87184k.delete();
                        return Unit.INSTANCE;
                    }
                    fileM87184k.setLastModified(System.currentTimeMillis());
                    MKWebView mKWebView = (MKWebView) this.$cacheWeb.get();
                    if (mKWebView != null) {
                        taj tajVarM199986E0 = ComponentCallbacks2C1053a.m5317v(mKWebView).m143274r(fileM87184k).m199423e(p2e.f146846b).m199986E0();
                        tajVarM199986E0.getClass();
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = (Drawable) tajVarM199986E0.get();
                        CoroutineDispatcher coroutineDispatcherM18428a = MMDispatchers.INSTANCE.m18428a();
                        C14926x78597fa3 c14926x78597fa3 = new C14926x78597fa3(objectRef, null, this, fileM87184k);
                        this.L$0 = ppbVar;
                        this.L$1 = uri;
                        this.L$2 = queryParameter;
                        this.L$3 = fileM87184k;
                        this.L$4 = mKWebView;
                        this.L$5 = mKWebView;
                        this.L$6 = tajVarM199986E0;
                        this.L$7 = objectRef;
                        this.label = 1;
                        if (hh3.m130938g(coroutineDispatcherM18428a, c14926x78597fa3, this) == objM196133e) {
                            return objM196133e;
                        }
                        file = fileM87184k;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = (File) this.L$3;
            ResultKt.m87239b(obj);
            MDLog.m7395i("MKWebCaptureHelper", "加载完成checkLoad=" + this.$url + "   \n使用文件:" + file.getName());
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKWebCaptureHelper", th);
        }
        return Unit.INSTANCE;
    }
}
