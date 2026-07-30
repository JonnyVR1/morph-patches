package androidx.work.impl.utils;

import android.content.Context;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.AbstractC0762b;
import androidx.work.impl.WorkerWrapperKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p149l.gnr;
import p149l.haq0;
import p149l.nyi;
import p149l.ppb;
import p149l.pyi;
import p149l.qkq0;
import p149l.r2j;
import p149l.txv;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/ppb;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ll/ppb;)Ljava/lang/Void;"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", m87374f = "WorkForeground.kt", m87375l = {42, 50}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class WorkForegroundKt$workForeground$2 extends SuspendLambda implements Function2<ppb, Continuation<? super Void>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ pyi $foregroundUpdater;
    final /* synthetic */ haq0 $spec;
    final /* synthetic */ AbstractC0762b $worker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkForegroundKt$workForeground$2(AbstractC0762b abstractC0762b, haq0 haq0Var, pyi pyiVar, Context context, Continuation<? super WorkForegroundKt$workForeground$2> continuation) {
        super(2, continuation);
        this.$worker = abstractC0762b;
        this.$spec = haq0Var;
        this.$foregroundUpdater = pyiVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkForegroundKt$workForeground$2(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Void> continuation) {
        return ((WorkForegroundKt$workForeground$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            gnr<nyi> foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
            foregroundInfoAsync.getClass();
            AbstractC0762b abstractC0762b = this.$worker;
            this.label = 1;
            obj = WorkerWrapperKt.m4504d(foregroundInfoAsync, abstractC0762b, this);
            if (obj != objM196133e) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.m87239b(obj);
                return obj;
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        nyi nyiVar = (nyi) obj;
        if (nyiVar == null) {
            r2j.m177608a("Worker was marked important (", this.$spec.workerClassName, ") but did not provide ForegroundInfo");
            return null;
        }
        String str = WorkForegroundKt.f3613a;
        haq0 haq0Var = this.$spec;
        txv.m190976e().mo190979a(str, "Updating notification for " + haq0Var.workerClassName);
        gnr<Void> gnrVarMo140585a = this.$foregroundUpdater.mo140585a(this.$context, this.$worker.getId(), nyiVar);
        gnrVarMo140585a.getClass();
        this.label = 2;
        Object objM876b = ListenableFutureKt.m876b(gnrVarMo140585a, this);
        return objM876b == objM196133e ? objM196133e : objM876b;
    }
}
