package androidx.work.impl;

import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.DelayKt;
import p153l.bui;
import p153l.qzv;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m88121d2 = {"Ll/bui;", "", "", "throwable", "", "attempt", "<anonymous>", "(Ll/bui;Ljava/lang/Throwable;J)Z"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", m88263f = "UnfinishedWorkListener.kt", m88264l = {59}, m88265m = "invokeSuspend")
public final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 extends SuspendLambda implements Function4<bui<? super Boolean>, Throwable, Long, Continuation<? super Boolean>, Object> {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    public UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(Continuation<? super UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1> continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(bui<? super Boolean> buiVar, Throwable th, Long l2, Continuation<? super Boolean> continuation) {
        return invoke(buiVar, th, l2.longValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            Throwable th = (Throwable) this.L$0;
            long j = this.J$0;
            qzv.m178829e().mo178835d(UnfinishedWorkListenerKt.f3486a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, UnfinishedWorkListenerKt.f3487b);
            this.label = 1;
            if (DelayKt.m94502b(jMin, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Boxing.m88259a(true);
    }

    public final Object invoke(bui<? super Boolean> buiVar, Throwable th, long j, Continuation<? super Boolean> continuation) {
        UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 = new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(continuation);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.L$0 = th;
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.J$0 = j;
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.invokeSuspend(Unit.INSTANCE);
    }
}
