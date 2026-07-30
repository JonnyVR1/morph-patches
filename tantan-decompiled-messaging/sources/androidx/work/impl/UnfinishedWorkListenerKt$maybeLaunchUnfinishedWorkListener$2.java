package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.l460;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m87232d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", m87374f = "UnfinishedWorkListener.kt", m87375l = {}, m87376m = "invokeSuspend")
public final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $appContext;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(Context context, Continuation<? super UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2> continuation) {
        super(2, continuation);
        this.$appContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 = new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(this.$appContext, continuation);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2.Z$0 = ((Boolean) obj).booleanValue();
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2;
    }

    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        l460.m148427c(this.$appContext, RescheduleReceiver.class, this.Z$0);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }
}
