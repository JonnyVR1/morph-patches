package com.hellogroup.p036mk.business.util;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.hellogroup.common.thread.MMDispatchers;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
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
import p153l.d4e;
import p153l.drb;
import p153l.jzv;
import p153l.ndj;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.business.util.MKWebCaptureHelper$checkLoad$1", m88263f = "MKWebCaptureHelper.kt", m88264l = {287}, m88265m = "invokeSuspend")
public final class MKWebCaptureHelper$checkLoad$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
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
    private drb f12310p$;
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
        mKWebCaptureHelper$checkLoad$1.f12310p$ = (drb) obj;
        return mKWebCaptureHelper$checkLoad$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((MKWebCaptureHelper$checkLoad$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, android.graphics.drawable.Drawable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        File file;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m88128b(obj);
                drb drbVar = this.f12310p$;
                Uri uri = Uri.parse(this.$url);
                String queryParameter = uri.getQueryParameter("_capture");
                MKWebCaptureHelper.Companion companion = MKWebCaptureHelper.INSTANCE;
                File fileM18226k = companion.m18226k(this.$url, queryParameter);
                if (fileM18226k == null) {
                    return Unit.INSTANCE;
                }
                if (fileM18226k.exists()) {
                    if (companion.m18217c(fileM18226k)) {
                        fileM18226k.delete();
                        return Unit.INSTANCE;
                    }
                    fileM18226k.setLastModified(System.currentTimeMillis());
                    MKWebView mKWebView = (MKWebView) this.$cacheWeb.get();
                    if (mKWebView != null) {
                        ndj ndjVarM95643G0 = ComponentCallbacks2C1057a.m5326u(mKWebView).m156819r(fileM18226k).m155550e(d4e.f85034b).m95643G0();
                        ndjVarM95643G0.getClass();
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = (Drawable) ndjVarM95643G0.get();
                        CoroutineDispatcher coroutineDispatcherM17547a = MMDispatchers.INSTANCE.m17547a();
                        C3568x78597fa3 c3568x78597fa3 = new C3568x78597fa3(objectRef, null, this, fileM18226k);
                        this.L$0 = drbVar;
                        this.L$1 = uri;
                        this.L$2 = queryParameter;
                        this.L$3 = fileM18226k;
                        this.L$4 = mKWebView;
                        this.L$5 = mKWebView;
                        this.L$6 = ndjVarM95643G0;
                        this.L$7 = objectRef;
                        this.label = 1;
                        if (vh3.m201255g(coroutineDispatcherM17547a, c3568x78597fa3, this) == objM198688e) {
                            return objM198688e;
                        }
                        file = fileM18226k;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = (File) this.L$3;
            ResultKt.m88128b(obj);
            jzv.m147732e("MKWebCaptureHelper", "加载完成checkLoad=" + this.$url + "   \n使用文件:" + file.getName());
        } catch (Throwable th) {
            jzv.m147730c("MKWebCaptureHelper", "", th);
        }
        return Unit.INSTANCE;
    }
}
