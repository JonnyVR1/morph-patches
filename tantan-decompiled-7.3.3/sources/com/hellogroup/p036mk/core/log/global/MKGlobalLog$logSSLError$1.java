package com.hellogroup.p036mk.core.log.global;

import com.hellogroup.p036mk.core.log.core.MKLogSource;
import com.immomo.momomediaext.sei.BaseSei;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.d8g0;
import p153l.drb;
import p153l.i8g0;
import p153l.uyp;
import p153l.wo2;
import p153l.wtq0;
import p153l.xjw;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.core.log.global.MKGlobalLog$logSSLError$1", m88263f = "MKGlobalLog.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class MKGlobalLog$logSSLError$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $e */
    final /* synthetic */ Exception f12520$e;
    final /* synthetic */ String $errorUrl;
    final /* synthetic */ String $originUrl;
    final /* synthetic */ URI $uri;
    final /* synthetic */ String $url;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12521p$;
    final /* synthetic */ MKGlobalLog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKGlobalLog$logSSLError$1(MKGlobalLog mKGlobalLog, URI uri, String str, Exception exc, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mKGlobalLog;
        this.$uri = uri;
        this.$errorUrl = str;
        this.f12520$e = exc;
        this.$originUrl = str2;
        this.$url = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        MKGlobalLog$logSSLError$1 mKGlobalLog$logSSLError$1 = new MKGlobalLog$logSSLError$1(this.this$0, this.$uri, this.$errorUrl, this.f12520$e, this.$originUrl, this.$url, continuation);
        mKGlobalLog$logSSLError$1.f12521p$ = (drb) obj;
        return mKGlobalLog$logSSLError$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((MKGlobalLog$logSSLError$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM225066constructorimpl;
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            URI uri = this.$uri;
            InetAddress[] allByName = InetAddress.getAllByName(String.valueOf(uri != null ? uri.getHost() : null));
            allByName.getClass();
            objM225066constructorimpl = Result.m225066constructorimpl(i8g0.m139004f(CollectionsKt.listOf(Arrays.copyOf(allByName, allByName.length)), "."));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        if (Result.m225072isFailureimpl(objM225066constructorimpl)) {
            objM225066constructorimpl = null;
        }
        String strM114836a = d8g0.m114836a((String) objM225066constructorimpl);
        Pair pairM88129a = TuplesKt.m88129a("action", "showSSLDialog");
        Pair pairM88129a2 = TuplesKt.m88129a("category", this.$errorUrl);
        xjw xjwVarM211265a = xjw.m211265a();
        URI uri2 = this.$uri;
        Pair pairM88129a3 = TuplesKt.m88129a(BaseSei.INFO, xjwVarM211265a.m211266b(String.valueOf(uri2 != null ? uri2.getHost() : null)));
        Exception exc = this.f12520$e;
        HashMap mapHashMapOf = MapsKt.hashMapOf(pairM88129a, pairM88129a2, pairM88129a3, TuplesKt.m88129a("errorMsg", exc != null ? exc.getMessage() : null), TuplesKt.m88129a("msg", strM114836a), TuplesKt.m88129a("url", this.$originUrl));
        MKGlobalLog mKGlobalLog = this.this$0;
        MKGlobalErrorType mKGlobalErrorType = MKGlobalErrorType.SSL_ERROR;
        MKLogSource mKLogSource = MKLogSource.NATIVE;
        String str = this.$url;
        wo2.m207246c(mKGlobalLog, mKGlobalErrorType, mKLogSource, null, str, mapHashMapOf, "dns_log_fep", str, null, null, 384, null);
        return Unit.INSTANCE;
    }
}
