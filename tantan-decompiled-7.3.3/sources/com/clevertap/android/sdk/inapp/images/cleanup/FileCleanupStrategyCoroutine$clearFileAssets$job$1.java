package com.clevertap.android.sdk.inapp.images.cleanup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategyCoroutine$clearFileAssets$job$1", m88263f = "FileCleanupStrategyCoroutine.kt", m88264l = {48}, m88265m = "invokeSuspend")
public final class FileCleanupStrategyCoroutine$clearFileAssets$job$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $successBlock;
    final /* synthetic */ List<String> $urls;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FileCleanupStrategyCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileCleanupStrategyCoroutine$clearFileAssets$job$1(List<String> list, FileCleanupStrategyCoroutine fileCleanupStrategyCoroutine, Function1<? super String, Unit> function1, Continuation<? super FileCleanupStrategyCoroutine$clearFileAssets$job$1> continuation) {
        super(2, continuation);
        this.$urls = list;
        this.this$0 = fileCleanupStrategyCoroutine;
        this.$successBlock = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileCleanupStrategyCoroutine$clearFileAssets$job$1 fileCleanupStrategyCoroutine$clearFileAssets$job$1 = new FileCleanupStrategyCoroutine$clearFileAssets$job$1(this.$urls, this.this$0, this.$successBlock, continuation);
        fileCleanupStrategyCoroutine$clearFileAssets$job$1.L$0 = obj;
        return fileCleanupStrategyCoroutine$clearFileAssets$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FileCleanupStrategyCoroutine$clearFileAssets$job$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = (drb) this.L$0;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = this.$urls.iterator();
            while (it.hasNext()) {
                arrayList.add(xh3.m210978b(drbVar, null, null, new FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1(this.this$0, it.next(), this.$successBlock, null), 3, null));
            }
            this.label = 1;
            if (AwaitKt.m94491a(arrayList, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
