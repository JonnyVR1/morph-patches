package com.clevertap.android.sdk.inapp.images.preload;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import p153l.drb;
import p153l.utd;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"Ll/drb;", "", "Lkotlin/Pair;", "", "", "<anonymous>", "(Ll/drb;)Ljava/util/List;"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$preloadAssets$job$1$pairs$1", m88263f = "FilePreloaderCoroutine.kt", m88264l = {106}, m88265m = "invokeSuspend")
public final class FilePreloaderCoroutine$preloadAssets$job$1$pairs$1 extends SuspendLambda implements Function2<drb, Continuation<? super List<? extends Pair<? extends String, ? extends Boolean>>>, Object> {
    final /* synthetic */ List<utd<Pair<String, Boolean>>> $dowloadResults;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePreloaderCoroutine$preloadAssets$job$1$pairs$1(List<utd<Pair<String, Boolean>>> list, Continuation<? super FilePreloaderCoroutine$preloadAssets$job$1$pairs$1> continuation) {
        super(2, continuation);
        this.$dowloadResults = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilePreloaderCoroutine$preloadAssets$job$1$pairs$1(this.$dowloadResults, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(drb drbVar, Continuation<? super List<Pair<String, Boolean>>> continuation) {
        return ((FilePreloaderCoroutine$preloadAssets$job$1$pairs$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m88128b(obj);
                return obj;
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        List<utd<Pair<String, Boolean>>> list = this.$dowloadResults;
        this.label = 1;
        Object objM94491a = AwaitKt.m94491a(list, this);
        return objM94491a == objM198688e ? objM198688e : objM94491a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(drb drbVar, Continuation<? super List<? extends Pair<? extends String, ? extends Boolean>>> continuation) {
        return invoke2(drbVar, (Continuation<? super List<Pair<String, Boolean>>>) continuation);
    }
}
