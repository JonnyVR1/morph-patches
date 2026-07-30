package com.clevertap.android.sdk.inapp.images.cleanup;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1", m88263f = "FileCleanupStrategyCoroutine.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $successBlock;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ FileCleanupStrategyCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1(FileCleanupStrategyCoroutine fileCleanupStrategyCoroutine, String str, Function1<? super String, Unit> function1, Continuation<? super FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1> continuation) {
        super(2, continuation);
        this.this$0 = fileCleanupStrategyCoroutine;
        this.$url = str;
        this.$successBlock = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1(this.this$0, this.$url, this.$successBlock, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        this.this$0.m6559b().invoke().m6551j(this.$url);
        this.$successBlock.invoke(this.$url);
        return Unit.INSTANCE;
    }
}
