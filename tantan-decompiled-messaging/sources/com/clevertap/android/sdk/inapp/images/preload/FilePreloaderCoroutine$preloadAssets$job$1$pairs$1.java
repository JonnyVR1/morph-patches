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
import p149l.gsd;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"Ll/ppb;", "", "Lkotlin/Pair;", "", "", "<anonymous>", "(Ll/ppb;)Ljava/util/List;"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$preloadAssets$job$1$pairs$1", m87374f = "FilePreloaderCoroutine.kt", m87375l = {106}, m87376m = "invokeSuspend")
public final class FilePreloaderCoroutine$preloadAssets$job$1$pairs$1 extends SuspendLambda implements Function2<ppb, Continuation<? super List<? extends Pair<? extends String, ? extends Boolean>>>, Object> {
    final /* synthetic */ List<gsd<Pair<String, Boolean>>> $dowloadResults;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePreloaderCoroutine$preloadAssets$job$1$pairs$1(List<gsd<Pair<String, Boolean>>> list, Continuation<? super FilePreloaderCoroutine$preloadAssets$job$1$pairs$1> continuation) {
        super(2, continuation);
        this.$dowloadResults = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilePreloaderCoroutine$preloadAssets$job$1$pairs$1(this.$dowloadResults, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ppb ppbVar, Continuation<? super List<Pair<String, Boolean>>> continuation) {
        return ((FilePreloaderCoroutine$preloadAssets$job$1$pairs$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m87239b(obj);
                return obj;
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        List<gsd<Pair<String, Boolean>>> list = this.$dowloadResults;
        this.label = 1;
        Object objM93600a = AwaitKt.m93600a(list, this);
        return objM93600a == objM196133e ? objM196133e : objM93600a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ppb ppbVar, Continuation<? super List<? extends Pair<? extends String, ? extends Boolean>>> continuation) {
        return invoke2(ppbVar, (Continuation<? super List<Pair<String, Boolean>>>) continuation);
    }
}
