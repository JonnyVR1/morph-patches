package com.hellogroup.p036mk.core.log.global;

import android.net.Uri;
import android.util.Log;
import com.hellogroup.p036mk.core.log.core.MKLogSource;
import com.immomo.momomediaext.sei.BaseSei;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
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
@DebugMetadata(m88262c = "com.hellogroup.mk.core.log.global.MKGlobalLog$logLoadRealUrl$1", m88263f = "MKGlobalLog.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class MKGlobalLog$logLoadRealUrl$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $firstEnterUrl;
    final /* synthetic */ Boolean $isFromWebCache;
    final /* synthetic */ String $url;
    final /* synthetic */ String $useDnsUrl;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12519p$;
    final /* synthetic */ MKGlobalLog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKGlobalLog$logLoadRealUrl$1(MKGlobalLog mKGlobalLog, String str, String str2, String str3, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mKGlobalLog;
        this.$useDnsUrl = str;
        this.$url = str2;
        this.$firstEnterUrl = str3;
        this.$isFromWebCache = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        MKGlobalLog$logLoadRealUrl$1 mKGlobalLog$logLoadRealUrl$1 = new MKGlobalLog$logLoadRealUrl$1(this.this$0, this.$useDnsUrl, this.$url, this.$firstEnterUrl, this.$isFromWebCache, continuation);
        mKGlobalLog$logLoadRealUrl$1.f12519p$ = (drb) obj;
        return mKGlobalLog$logLoadRealUrl$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((MKGlobalLog$logLoadRealUrl$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM225066constructorimpl;
        String host;
        uyp.m198688e();
        String strM211266b = null;
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                String str = this.$useDnsUrl;
                if (str != null) {
                    Uri uri = Uri.parse(str);
                    uri.getClass();
                    if (uri != null) {
                        host = uri.getHost();
                    } else {
                        host = null;
                    }
                } else {
                    host = null;
                }
                InetAddress[] allByName = InetAddress.getAllByName(String.valueOf(host));
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
            String str2 = this.$url;
            if (str2 != null) {
                if (!Boxing.m88259a(!StringsKt.m94329e0(str2)).booleanValue()) {
                    str2 = null;
                }
                if (str2 != null) {
                    strM211266b = xjw.m211265a().m211266b(new URI(str2).getHost().toString());
                }
            }
            wo2.m207246c(this.this$0, MKGlobalErrorType.LOAD_REAL_URL, MKLogSource.NATIVE, null, this.$url, MapsKt.hashMapOf(TuplesKt.m88129a("action", "loadRealUrl"), TuplesKt.m88129a("category", this.$firstEnterUrl), TuplesKt.m88129a("content", this.$useDnsUrl), TuplesKt.m88129a("id", String.valueOf(this.$isFromWebCache)), TuplesKt.m88129a("errorMsg", Log.getStackTraceString(new Exception())), TuplesKt.m88129a(BaseSei.INFO, d8g0.m114836a(strM211266b)), TuplesKt.m88129a("msg", strM114836a), TuplesKt.m88129a("url", this.$url)), "dns_log_fep", null, null, null, 448, null);
            Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th2));
        }
        return Unit.INSTANCE;
    }
}
