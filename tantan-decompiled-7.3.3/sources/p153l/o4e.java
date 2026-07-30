package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.common.internal.ImmutableMap;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006-"}, m88121d2 = {"Ll/o4e;", "Ll/a7h0;", "Ll/g4e;", "Ll/jii;", "fileCacheFactory", "Ll/aj80;", "poolFactory", "Ll/d7f;", "executorSupplier", "Ll/mhm;", "imageCacheStatsTracker", "", "memoryChunkType", "Ll/b4e;", "mainDiskCacheConfig", "smallImageDiskCacheConfig", "", "", "dynamicDiskCacheConfigMap", "<init>", "(Ll/jii;Ll/aj80;Ll/d7f;Ll/mhm;ILl/b4e;Ll/b4e;Ljava/util/Map;)V", "Ll/tjm;", Constants.KEY_CONFIG, "(Ll/jii;Ll/tjm;)V", "j", "()Ll/g4e;", "a", "Ll/jii;", "b", "Ll/aj80;", "c", "Ll/d7f;", Constants.INAPP_DATA_TAG, "Ll/mhm;", "e", "I", "f", "Ll/b4e;", "g", "h", "Ljava/util/Map;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "k", "diskCachesStore", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class o4e implements a7h0<g4e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final jii fileCacheFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final aj80 poolFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final d7f executorSupplier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final mhm imageCacheStatsTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int memoryChunkType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final b4e mainDiskCacheConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final b4e smallImageDiskCacheConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final Map<String, b4e> dynamicDiskCacheConfigMap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy diskCachesStore;

    /* JADX INFO: renamed from: l.o4e$a */
    @Metadata(m88120d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\r\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\t\u0010\u000bR'\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013R'\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"l/o4e$a", "Ll/g4e;", "Ll/iii;", "a", "Lkotlin/Lazy;", "e", "()Ll/iii;", "mainFileCache", "Ll/mh3;", "b", "c", "()Ll/mh3;", "mainBufferedDiskCache", "smallImageFileCache", Constants.INAPP_DATA_TAG, "smallImageBufferedDiskCache", "", "", BLiveStormDanmakuGiftResourceType.f45292l, "()Ljava/util/Map;", "dynamicFileCaches", "Lcom/facebook/common/internal/ImmutableMap;", "f", "()Lcom/facebook/common/internal/ImmutableMap;", "dynamicBufferedDiskCaches", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C19032a implements g4e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Lazy mainFileCache;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Lazy mainBufferedDiskCache;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final Lazy smallImageFileCache;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final Lazy smallImageBufferedDiskCache;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final Lazy dynamicFileCaches;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final Lazy dynamicBufferedDiskCaches;

        public C19032a(final o4e o4eVar) {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            this.mainFileCache = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.i4e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o4e.C19032a.m165995i(o4eVar);
                }
            });
            this.mainBufferedDiskCache = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.j4e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o4e.C19032a.m165994h(this.f118286a, o4eVar);
                }
            });
            this.smallImageFileCache = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.k4e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o4e.C19032a.m165992f(o4eVar);
                }
            });
            this.smallImageBufferedDiskCache = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.l4e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o4e.C19032a.m165993g(this.f129966a, o4eVar);
                }
            });
            this.dynamicFileCaches = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.m4e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o4e.C19032a.m165997k(o4eVar, this);
                }
            });
            this.dynamicBufferedDiskCaches = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.n4e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o4e.C19032a.m165996j(this.f140225a, o4eVar);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public static iii m165992f(o4e o4eVar) {
            o4eVar.getClass();
            return o4eVar.fileCacheFactory.mo102570a(o4eVar.smallImageDiskCacheConfig);
        }

        /* JADX INFO: renamed from: g */
        public static mh3 m165993g(C19032a c19032a, o4e o4eVar) {
            c19032a.getClass();
            o4eVar.getClass();
            iii iiiVarMo128865a = c19032a.mo128865a();
            fj80 fj80VarM98363i = o4eVar.poolFactory.m98363i(o4eVar.memoryChunkType);
            fj80VarM98363i.getClass();
            ij80 ij80VarM98364j = o4eVar.poolFactory.m98364j();
            ij80VarM98364j.getClass();
            Executor ioBoundExecutor = o4eVar.executorSupplier.getIoBoundExecutor();
            ioBoundExecutor.getClass();
            Executor executorMo114731e = o4eVar.executorSupplier.mo114731e();
            executorMo114731e.getClass();
            return new mh3(iiiVarMo128865a, fj80VarM98363i, ij80VarM98364j, ioBoundExecutor, executorMo114731e, o4eVar.imageCacheStatsTracker);
        }

        /* JADX INFO: renamed from: h */
        public static mh3 m165994h(C19032a c19032a, o4e o4eVar) {
            c19032a.getClass();
            o4eVar.getClass();
            iii iiiVarMo128869e = c19032a.mo128869e();
            fj80 fj80VarM98363i = o4eVar.poolFactory.m98363i(o4eVar.memoryChunkType);
            fj80VarM98363i.getClass();
            ij80 ij80VarM98364j = o4eVar.poolFactory.m98364j();
            ij80VarM98364j.getClass();
            Executor ioBoundExecutor = o4eVar.executorSupplier.getIoBoundExecutor();
            ioBoundExecutor.getClass();
            Executor executorMo114731e = o4eVar.executorSupplier.mo114731e();
            executorMo114731e.getClass();
            return new mh3(iiiVarMo128869e, fj80VarM98363i, ij80VarM98364j, ioBoundExecutor, executorMo114731e, o4eVar.imageCacheStatsTracker);
        }

        /* JADX INFO: renamed from: i */
        public static iii m165995i(o4e o4eVar) {
            o4eVar.getClass();
            return o4eVar.fileCacheFactory.mo102570a(o4eVar.mainDiskCacheConfig);
        }

        /* JADX INFO: renamed from: j */
        public static ImmutableMap m165996j(C19032a c19032a, o4e o4eVar) {
            c19032a.getClass();
            o4eVar.getClass();
            Map<String, iii> mapM165998l = c19032a.m165998l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapM165998l.size()));
            Iterator<T> it = mapM165998l.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                iii iiiVar = (iii) entry.getValue();
                fj80 fj80VarM98363i = o4eVar.poolFactory.m98363i(o4eVar.memoryChunkType);
                fj80VarM98363i.getClass();
                ij80 ij80VarM98364j = o4eVar.poolFactory.m98364j();
                ij80VarM98364j.getClass();
                Executor ioBoundExecutor = o4eVar.executorSupplier.getIoBoundExecutor();
                ioBoundExecutor.getClass();
                Executor executorMo114731e = o4eVar.executorSupplier.mo114731e();
                executorMo114731e.getClass();
                linkedHashMap.put(key, new mh3(iiiVar, fj80VarM98363i, ij80VarM98364j, ioBoundExecutor, executorMo114731e, o4eVar.imageCacheStatsTracker));
            }
            return ImmutableMap.copyOf((Map) linkedHashMap);
        }

        /* JADX INFO: renamed from: k */
        public static Map m165997k(o4e o4eVar, C19032a c19032a) {
            o4eVar.getClass();
            c19032a.getClass();
            Map map = o4eVar.dynamicDiskCacheConfigMap;
            if (map == null) {
                return MapsKt.emptyMap();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), o4eVar.fileCacheFactory.mo102570a((b4e) entry.getValue()));
            }
            return linkedHashMap;
        }

        @Override // p153l.g4e
        /* JADX INFO: renamed from: a */
        public iii mo128865a() {
            return (iii) this.smallImageFileCache.getValue();
        }

        @Override // p153l.g4e
        /* JADX INFO: renamed from: b */
        public mh3 mo128866b() {
            return (mh3) this.smallImageBufferedDiskCache.getValue();
        }

        @Override // p153l.g4e
        /* JADX INFO: renamed from: c */
        public mh3 mo128867c() {
            return (mh3) this.mainBufferedDiskCache.getValue();
        }

        @Override // p153l.g4e
        /* JADX INFO: renamed from: d */
        public ImmutableMap<String, mh3> mo128868d() {
            Object value = this.dynamicBufferedDiskCaches.getValue();
            value.getClass();
            return (ImmutableMap) value;
        }

        @Override // p153l.g4e
        /* JADX INFO: renamed from: e */
        public iii mo128869e() {
            return (iii) this.mainFileCache.getValue();
        }

        /* JADX INFO: renamed from: l */
        public Map<String, iii> m165998l() {
            return (Map) this.dynamicFileCaches.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o4e(@NotNull jii jiiVar, @NotNull aj80 aj80Var, @NotNull d7f d7fVar, @NotNull mhm mhmVar, int i, @NotNull b4e b4eVar, @NotNull b4e b4eVar2, @Nullable Map<String, ? extends b4e> map) {
        jiiVar.getClass();
        aj80Var.getClass();
        d7fVar.getClass();
        mhmVar.getClass();
        b4eVar.getClass();
        b4eVar2.getClass();
        this.fileCacheFactory = jiiVar;
        this.poolFactory = aj80Var;
        this.executorSupplier = d7fVar;
        this.imageCacheStatsTracker = mhmVar;
        this.memoryChunkType = i;
        this.mainDiskCacheConfig = b4eVar;
        this.smallImageDiskCacheConfig = b4eVar2;
        this.dynamicDiskCacheConfigMap = map;
        this.diskCachesStore = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l.h4e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o4e.m165981a(this.f107796a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C19032a m165981a(o4e o4eVar) {
        o4eVar.getClass();
        return new C19032a(o4eVar);
    }

    @Override // p153l.a7h0
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public g4e get() {
        return m165991k();
    }

    /* JADX INFO: renamed from: k */
    public final g4e m165991k() {
        return (g4e) this.diskCachesStore.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o4e(@NotNull jii jiiVar, @NotNull tjm tjmVar) {
        this(jiiVar, tjmVar.getPoolFactory(), tjmVar.getExecutorSupplier(), tjmVar.getImageCacheStatsTracker(), tjmVar.getMemoryChunkType(), tjmVar.getMainDiskCacheConfig(), tjmVar.getSmallImageDiskCacheConfig(), tjmVar.mo186182d());
        jiiVar.getClass();
        tjmVar.getClass();
    }
}
