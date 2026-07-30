package com.clevertap.android.sdk.inapp.images.preload;

import com.clevertap.android.sdk.inapp.data.CtCacheType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.axl;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"Ll/drb;", "Lkotlin/Pair;", "", "", "<anonymous>", "(Ll/drb;)Lkotlin/Pair;"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1", m88263f = "FilePreloaderCoroutine.kt", m88264l = {}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1 extends SuspendLambda implements Function2<drb, Continuation<? super Pair<? extends String, ? extends Boolean>>, Object> {
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Object> $assetBlock;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $failureBlock;
    final /* synthetic */ Pair<String, CtCacheType> $meta;
    final /* synthetic */ Map<String, Boolean> $results;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $startedBlock;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $successBlock;
    int label;
    final /* synthetic */ FilePreloaderCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1(FilePreloaderCoroutine filePreloaderCoroutine, Pair<String, ? extends CtCacheType> pair, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function1, Map<String, Boolean> map, Function1<? super Pair<String, ? extends CtCacheType>, ? extends Object> function2, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function3, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function4, Continuation<? super FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1> continuation) {
        super(2, continuation);
        this.this$0 = filePreloaderCoroutine;
        this.$meta = pair;
        this.$startedBlock = function1;
        this.$results = map;
        this.$assetBlock = function2;
        this.$successBlock = function3;
        this.$failureBlock = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1(this.this$0, this.$meta, this.$startedBlock, this.$results, this.$assetBlock, this.$successBlock, this.$failureBlock, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(drb drbVar, Continuation<? super Pair<String, Boolean>> continuation) {
        return ((FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        axl logger;
        axl logger2;
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        if (this.this$0.deepLogging && (logger2 = this.this$0.getLogger()) != null) {
            logger2.verbose("started asset url fetch " + this.$meta);
        }
        this.$startedBlock.invoke(this.$meta);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Function1<Pair<String, ? extends CtCacheType>, Object> function1 = this.$assetBlock;
        Pair<String, CtCacheType> pair = this.$meta;
        Function1<Pair<String, ? extends CtCacheType>, Unit> function2 = this.$successBlock;
        Function1<Pair<String, ? extends CtCacheType>, Unit> function3 = this.$failureBlock;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (function1.invoke(pair) != null) {
            function2.invoke(pair);
            booleanRef.element = true;
        } else {
            function3.invoke(pair);
            booleanRef.element = false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.this$0.deepLogging && (logger = this.this$0.getLogger()) != null) {
            logger.verbose("finished asset url fetch " + this.$meta + " in " + jCurrentTimeMillis2 + " ms");
        }
        this.$results.put(this.$meta.getFirst(), Boxing.m88259a(booleanRef.element));
        return TuplesKt.m88129a(this.$meta.getFirst(), Boxing.m88259a(booleanRef.element));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(drb drbVar, Continuation<? super Pair<? extends String, ? extends Boolean>> continuation) {
        return invoke2(drbVar, (Continuation<? super Pair<String, Boolean>>) continuation);
    }
}
