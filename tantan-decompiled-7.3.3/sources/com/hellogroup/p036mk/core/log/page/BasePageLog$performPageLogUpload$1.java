package com.hellogroup.p036mk.core.log.page;

import com.google.android.exoplayer2.offline.DownloadService;
import com.hellogroup.p036mk.core.log.core.MKLogLevel;
import com.hellogroup.p036mk.core.log.core.MKLogReporter;
import com.hellogroup.p036mk.core.log.core.MKLogSource;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p153l.drb;
import p153l.gkw;
import p153l.glw;
import p153l.kkw;
import p153l.sjw;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.core.log.page.BasePageLog$performPageLogUpload$1", m88263f = "BasePageLog.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class BasePageLog$performPageLogUpload$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $firstErr;
    final /* synthetic */ MKLogLevel $logLevel;
    final /* synthetic */ String $logStr;
    final /* synthetic */ List $logsToUpload;
    final /* synthetic */ MKLogSource $source;
    final /* synthetic */ String $thirdBiz;
    final /* synthetic */ String $triggerLevel;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12532p$;
    final /* synthetic */ BasePageLog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePageLog$performPageLogUpload$1(BasePageLog basePageLog, List list, boolean z, MKLogLevel mKLogLevel, String str, String str2, MKLogSource mKLogSource, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = basePageLog;
        this.$logsToUpload = list;
        this.$firstErr = z;
        this.$logLevel = mKLogLevel;
        this.$logStr = str;
        this.$triggerLevel = str2;
        this.$source = mKLogSource;
        this.$thirdBiz = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        BasePageLog$performPageLogUpload$1 basePageLog$performPageLogUpload$1 = new BasePageLog$performPageLogUpload$1(this.this$0, this.$logsToUpload, this.$firstErr, this.$logLevel, this.$logStr, this.$triggerLevel, this.$source, this.$thirdBiz, continuation);
        basePageLog$performPageLogUpload$1.f12532p$ = (drb) obj;
        return basePageLog$performPageLogUpload$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((BasePageLog$performPageLogUpload$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        Unit unit = null;
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.$logsToUpload.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        Pair pairM88129a = TuplesKt.m88129a("logID", this.this$0.pageId);
        Pair pairM88129a2 = TuplesKt.m88129a("url", this.this$0.getUrl());
        Pair pairM88129a3 = TuplesKt.m88129a("createTime", Boxing.m88261c(this.this$0.createTimeMs));
        Pair pairM88129a4 = TuplesKt.m88129a("uploadTime", Boxing.m88261c(System.currentTimeMillis()));
        Pair pairM88129a5 = TuplesKt.m88129a("isFirst", Boxing.m88260b(this.$firstErr ? 1 : 0));
        Object objM88260b = this.this$0.extraInfo.get("isResourceOfflined");
        if (objM88260b == null) {
            objM88260b = Boxing.m88260b(0);
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(pairM88129a, pairM88129a2, pairM88129a3, pairM88129a4, pairM88129a5, TuplesKt.m88129a("isOfflined", objM88260b), TuplesKt.m88129a("listArray", jSONArray), TuplesKt.m88129a("category", sjw.m186315d()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj2 = this.this$0.extraInfo.get("offlineVersion");
        if (obj2 != null) {
            linkedHashMap.put("offlineVersion", obj2);
        }
        Object obj3 = this.this$0.extraInfo.get("ua");
        if (obj3 != null) {
            linkedHashMap.put("ua", obj3);
        }
        Object obj4 = this.this$0.extraInfo.get("useDns");
        if (obj4 != null) {
            linkedHashMap.put("useDns", obj4);
        }
        Object obj5 = this.this$0.extraInfo.get("fep");
        if (obj5 != null) {
            linkedHashMap.put("fep", obj5);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String strMo115348d = gkw.m130601b().m130602a().mo115348d(1);
            if (strMo115348d != null) {
                linkedHashMap.put("deviceid", strMo115348d);
                unit = Unit.INSTANCE;
            }
            Result.m225066constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        if (this.$logLevel == MKLogLevel.ERROR) {
            linkedHashMap.put("msg", this.$logStr);
            if (Intrinsics.m88377d("ERR_1.1", this.$triggerLevel)) {
                mapMutableMapOf.put(DownloadService.KEY_FOREGROUND, Boxing.m88259a(sjw.m186325n()));
                long jM130708e = glw.m130708e();
                if (jM130708e > 0) {
                    linkedHashMap.put("availMemory", Boxing.m88261c(jM130708e));
                }
            }
        }
        kkw kkwVar = new kkw(this.$logLevel, this.$triggerLevel, this.$source, "MKPageQualityLog", this.this$0.getBid(), this.this$0.getUrl(), this.this$0.getBid(), this.$thirdBiz, mapMutableMapOf, linkedHashMap, false, 0L, 3072, null);
        MKLogReporter mKLogReporter = this.this$0.reporter;
        if (mKLogReporter != null) {
            mKLogReporter.m18439e(kkwVar);
        }
        return Unit.INSTANCE;
    }
}
