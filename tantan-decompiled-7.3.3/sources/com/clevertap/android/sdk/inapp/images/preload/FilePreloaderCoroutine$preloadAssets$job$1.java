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
import kotlin.ranges.C15274a;
import kotlinx.coroutines.TimeoutKt;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$preloadAssets$job$1", m88263f = "FilePreloaderCoroutine.kt", m88264l = {105}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class FilePreloaderCoroutine$preloadAssets$job$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
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
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FilePreloaderCoroutine$preloadAssets$job$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM94622d;
        Map<String, Boolean> map;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = (drb) this.L$0;
            ArrayList arrayList = new ArrayList();
            List<Pair<String, CtCacheType>> list = this.$urlMetas;
            ArrayList<Pair> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(TuplesKt.m88129a(((Pair) it.next()).getFirst(), Boxing.m88259a(false)));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
            for (Pair pair : arrayList2) {
                Pair pairM88129a = TuplesKt.m88129a(pair.getFirst(), pair.getSecond());
                linkedHashMap.put(pairM88129a.getFirst(), pairM88129a.getSecond());
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
                arrayList.add(xh3.m210978b(drbVar, null, null, new FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1(filePreloaderCoroutine, (Pair) it2.next(), function1, mutableMap, function2, function5, function6, null), 3, null));
                function3 = function5;
                function4 = function6;
            }
            long jM6567g = this.this$0.getTimeoutForPreload();
            FilePreloaderCoroutine$preloadAssets$job$1$pairs$1 filePreloaderCoroutine$preloadAssets$job$1$pairs$1 = new FilePreloaderCoroutine$preloadAssets$job$1$pairs$1(arrayList, null);
            this.L$0 = mutableMap;
            this.label = 1;
            objM94622d = TimeoutKt.m94622d(jM6567g, filePreloaderCoroutine$preloadAssets$job$1$pairs$1, this);
            if (objM94622d == objM198688e) {
                return objM198688e;
            }
            map = mutableMap;
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = (Map) this.L$0;
            ResultKt.m88128b(obj);
            objM94622d = obj;
        }
        List list3 = (List) objM94622d;
        Function1<Map<String, Boolean>, Unit> function7 = this.$preloadFinished;
        if (list3 != null) {
            function7.invoke(MapsKt.toMap(list3));
        } else {
            function7.invoke(map);
        }
        return Unit.INSTANCE;
    }
}
