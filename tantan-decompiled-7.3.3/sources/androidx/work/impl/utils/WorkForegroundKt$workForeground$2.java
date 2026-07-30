package androidx.work.impl.utils;

import android.content.Context;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.AbstractC0764b;
import androidx.work.impl.WorkerWrapperKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.drb;
import p153l.hpr;
import p153l.i1j;
import p153l.k1j;
import p153l.m5j;
import p153l.mjq0;
import p153l.qzv;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/drb;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ll/drb;)Ljava/lang/Void;"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", m88263f = "WorkForeground.kt", m88264l = {42, 50}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class WorkForegroundKt$workForeground$2 extends SuspendLambda implements Function2<drb, Continuation<? super Void>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ k1j $foregroundUpdater;
    final /* synthetic */ mjq0 $spec;
    final /* synthetic */ AbstractC0764b $worker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkForegroundKt$workForeground$2(AbstractC0764b abstractC0764b, mjq0 mjq0Var, k1j k1jVar, Context context, Continuation<? super WorkForegroundKt$workForeground$2> continuation) {
        super(2, continuation);
        this.$worker = abstractC0764b;
        this.$spec = mjq0Var;
        this.$foregroundUpdater = k1jVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkForegroundKt$workForeground$2(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Void> continuation) {
        return ((WorkForegroundKt$workForeground$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            hpr<i1j> foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
            foregroundInfoAsync.getClass();
            AbstractC0764b abstractC0764b = this.$worker;
            this.label = 1;
            obj = WorkerWrapperKt.m4506d(foregroundInfoAsync, abstractC0764b, this);
            if (obj != objM198688e) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.m88128b(obj);
                return obj;
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        i1j i1jVar = (i1j) obj;
        if (i1jVar == null) {
            m5j.m157106a("Worker was marked important (", this.$spec.workerClassName, ") but did not provide ForegroundInfo");
            return null;
        }
        String str = WorkForegroundKt.f3613a;
        mjq0 mjq0Var = this.$spec;
        qzv.m178829e().mo178832a(str, "Updating notification for " + mjq0Var.workerClassName);
        hpr<Void> hprVarMo147863a = this.$foregroundUpdater.mo147863a(this.$context, this.$worker.getId(), i1jVar);
        hprVarMo147863a.getClass();
        this.label = 2;
        Object objM877b = ListenableFutureKt.m877b(hprVarMo147863a, this);
        return objM877b == objM198688e ? objM198688e : objM877b;
    }
}
