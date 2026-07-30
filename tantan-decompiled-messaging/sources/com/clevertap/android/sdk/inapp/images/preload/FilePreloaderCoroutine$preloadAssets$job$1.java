package com.clevertap.android.sdk.inapp.images.preload;

import com.clevertap.android.sdk.inapp.data.CtCacheType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlinx.coroutines.TimeoutKt;
import p149l.jh3;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$preloadAssets$job$1", m87374f = "FilePreloaderCoroutine.kt", m87375l = {105}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class FilePreloaderCoroutine$preloadAssets$job$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Object> $assetBlock;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $failureBlock;
    final /* synthetic */ Function1<Map<String, Boolean>, Unit> $preloadFinished;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $startedBlock;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $successBlock;
    final /* synthetic */ List<Pair<String, CtCacheType>> $urlMetas;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FilePreloaderCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilePreloaderCoroutine$preloadAssets$job$1(List<? extends Pair<String, ? extends CtCacheType>> list, FilePreloaderCoroutine filePreloaderCoroutine, Function1<? super Map<String, Boolean>, Unit> function1, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function2, Function1<? super Pair<String, ? extends CtCacheType>, ? extends Object> function3, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function4, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function5, Continuation<? super FilePreloaderCoroutine$preloadAssets$job$1> continuation) {
        super(2, continuation);
        this.$urlMetas = list;
        this.this$0 = filePreloaderCoroutine;
        this.$preloadFinished = function1;
        this.$startedBlock = function2;
        this.$assetBlock = function3;
        this.$successBlock = function4;
        this.$failureBlock = function5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FilePreloaderCoroutine$preloadAssets$job$1 filePreloaderCoroutine$preloadAssets$job$1 = new FilePreloaderCoroutine$preloadAssets$job$1(this.$urlMetas, this.this$0, this.$preloadFinished, this.$startedBlock, this.$assetBlock, this.$successBlock, this.$failureBlock, continuation);
        filePreloaderCoroutine$preloadAssets$job$1.L$0 = obj;
        return filePreloaderCoroutine$preloadAssets$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((FilePreloaderCoroutine$preloadAssets$job$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM93730c;
        Map<String, Boolean> map;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ppb ppbVar = (ppb) this.L$0;
            ArrayList arrayList = new ArrayList();
            List<Pair<String, CtCacheType>> list = this.$urlMetas;
            ArrayList<Pair> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(TuplesKt.m87240a(((Pair) it.next()).getFirst(), Boxing.m87370a(false)));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
            for (Pair pair : arrayList2) {
                Pair pairM87240a = TuplesKt.m87240a(pair.getFirst(), pair.getSecond());
                linkedHashMap.put(pairM87240a.getFirst(), pairM87240a.getSecond());
            }
            Map<String, Boolean> mutableMap = MapsKt.toMutableMap(linkedHashMap);
            List<Pair<String, CtCacheType>> list2 = this.$urlMetas;
            FilePreloaderCoroutine filePreloaderCoroutine = this.this$0;
            Function1<Pair<String, ? extends CtCacheType>, Unit> function1 = this.$startedBlock;
            Function1<Pair<String, ? extends CtCacheType>, Object> function2 = this.$assetBlock;
            Function1<Pair<String, ? extends CtCacheType>, Unit> function3 = this.$successBlock;
            Function1<Pair<String, ? extends CtCacheType>, Unit> function4 = this.$failureBlock;
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                Function1<Pair<String, ? extends CtCacheType>, Unit> function5 = function3;
                Function1<Pair<String, ? extends CtCacheType>, Unit> function6 = function4;
                arrayList.add(jh3.m141365b(ppbVar, null, null, new FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1(filePreloaderCoroutine, (Pair) it2.next(), function1, mutableMap, function2, function5, function6, null), 3, null));
                function3 = function5;
                function4 = function6;
            }
            long jM6513g = this.this$0.getTimeoutForPreload();
            FilePreloaderCoroutine$preloadAssets$job$1$pairs$1 filePreloaderCoroutine$preloadAssets$job$1$pairs$1 = new FilePreloaderCoroutine$preloadAssets$job$1$pairs$1(arrayList, null);
            this.L$0 = mutableMap;
            this.label = 1;
            objM93730c = TimeoutKt.m93730c(jM6513g, filePreloaderCoroutine$preloadAssets$job$1$pairs$1, this);
            if (objM93730c == objM196133e) {
                return objM196133e;
            }
            map = mutableMap;
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = (Map) this.L$0;
            ResultKt.m87239b(obj);
            objM93730c = obj;
        }
        List list3 = (List) objM93730c;
        Function1<Map<String, Boolean>, Unit> function7 = this.$preloadFinished;
        if (list3 != null) {
            function7.invoke(MapsKt.toMap(list3));
        } else {
            function7.invoke(map);
        }
        return Unit.INSTANCE;
    }
}
