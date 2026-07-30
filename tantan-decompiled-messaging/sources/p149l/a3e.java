package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.common.internal.ImmutableMap;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006-"}, m87232d2 = {"Ll/a3e;", "Ll/syg0;", "Ll/s2e;", "Ll/nfi;", "fileCacheFactory", "Ll/ua80;", "poolFactory", "Ll/x5f;", "executorSupplier", "Ll/wem;", "imageCacheStatsTracker", "", "memoryChunkType", "Ll/n2e;", "mainDiskCacheConfig", "smallImageDiskCacheConfig", "", "", "dynamicDiskCacheConfigMap", "<init>", "(Ll/nfi;Ll/ua80;Ll/x5f;Ll/wem;ILl/n2e;Ll/n2e;Ljava/util/Map;)V", "Ll/qhm;", Constants.KEY_CONFIG, "(Ll/nfi;Ll/qhm;)V", "j", "()Ll/s2e;", "a", "Ll/nfi;", "b", "Ll/ua80;", "c", "Ll/x5f;", Constants.INAPP_DATA_TAG, "Ll/wem;", "e", "I", "f", "Ll/n2e;", "g", "h", "Ljava/util/Map;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "k", "diskCachesStore", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class a3e implements syg0<s2e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final nfi fileCacheFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ua80 poolFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final x5f executorSupplier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final wem imageCacheStatsTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int memoryChunkType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final n2e mainDiskCacheConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final n2e smallImageDiskCacheConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final Map<String, n2e> dynamicDiskCacheConfigMap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy diskCachesStore;

    /* JADX INFO: renamed from: l.a3e$a */
    @Metadata(m87231d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\r\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\t\u0010\u000bR'\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013R'\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"l/a3e$a", "Ll/s2e;", "Ll/mfi;", "a", "Lkotlin/Lazy;", "e", "()Ll/mfi;", "mainFileCache", "Ll/yg3;", "b", "c", "()Ll/yg3;", "mainBufferedDiskCache", "smallImageFileCache", Constants.INAPP_DATA_TAG, "smallImageBufferedDiskCache", "", "", BLiveStormDanmakuGiftResourceType.f44444l, "()Ljava/util/Map;", "dynamicFileCaches", "Lcom/facebook/common/internal/ImmutableMap;", "f", "()Lcom/facebook/common/internal/ImmutableMap;", "dynamicBufferedDiskCaches", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15517a implements s2e {

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

        public C15517a(final a3e a3eVar) {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            this.mainFileCache = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.u2e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a3e.C15517a.m94676i(a3eVar);
                }
            });
            this.mainBufferedDiskCache = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.v2e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a3e.C15517a.m94675h(this.f179531a, a3eVar);
                }
            });
            this.smallImageFileCache = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.w2e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a3e.C15517a.m94673f(a3eVar);
                }
            });
            this.smallImageBufferedDiskCache = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.x2e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a3e.C15517a.m94674g(this.f190796a, a3eVar);
                }
            });
            this.dynamicFileCaches = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.y2e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a3e.C15517a.m94678k(a3eVar, this);
                }
            });
            this.dynamicBufferedDiskCaches = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.z2e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a3e.C15517a.m94677j(this.f201221a, a3eVar);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public static mfi m94673f(a3e a3eVar) {
            a3eVar.getClass();
            return a3eVar.fileCacheFactory.mo157756a(a3eVar.smallImageDiskCacheConfig);
        }

        /* JADX INFO: renamed from: g */
        public static yg3 m94674g(C15517a c15517a, a3e a3eVar) {
            c15517a.getClass();
            a3eVar.getClass();
            mfi mfiVarMo94679a = c15517a.mo94679a();
            za80 za80VarM192744i = a3eVar.poolFactory.m192744i(a3eVar.memoryChunkType);
            za80VarM192744i.getClass();
            cb80 cb80VarM192745j = a3eVar.poolFactory.m192745j();
            cb80VarM192745j.getClass();
            Executor ioBoundExecutor = a3eVar.executorSupplier.getIoBoundExecutor();
            ioBoundExecutor.getClass();
            Executor executorMo146566e = a3eVar.executorSupplier.mo146566e();
            executorMo146566e.getClass();
            return new yg3(mfiVarMo94679a, za80VarM192744i, cb80VarM192745j, ioBoundExecutor, executorMo146566e, a3eVar.imageCacheStatsTracker);
        }

        /* JADX INFO: renamed from: h */
        public static yg3 m94675h(C15517a c15517a, a3e a3eVar) {
            c15517a.getClass();
            a3eVar.getClass();
            mfi mfiVarMo94683e = c15517a.mo94683e();
            za80 za80VarM192744i = a3eVar.poolFactory.m192744i(a3eVar.memoryChunkType);
            za80VarM192744i.getClass();
            cb80 cb80VarM192745j = a3eVar.poolFactory.m192745j();
            cb80VarM192745j.getClass();
            Executor ioBoundExecutor = a3eVar.executorSupplier.getIoBoundExecutor();
            ioBoundExecutor.getClass();
            Executor executorMo146566e = a3eVar.executorSupplier.mo146566e();
            executorMo146566e.getClass();
            return new yg3(mfiVarMo94683e, za80VarM192744i, cb80VarM192745j, ioBoundExecutor, executorMo146566e, a3eVar.imageCacheStatsTracker);
        }

        /* JADX INFO: renamed from: i */
        public static mfi m94676i(a3e a3eVar) {
            a3eVar.getClass();
            return a3eVar.fileCacheFactory.mo157756a(a3eVar.mainDiskCacheConfig);
        }

        /* JADX INFO: renamed from: j */
        public static ImmutableMap m94677j(C15517a c15517a, a3e a3eVar) {
            c15517a.getClass();
            a3eVar.getClass();
            Map<String, mfi> mapM94684l = c15517a.m94684l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapM94684l.size()));
            Iterator<T> it = mapM94684l.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                mfi mfiVar = (mfi) entry.getValue();
                za80 za80VarM192744i = a3eVar.poolFactory.m192744i(a3eVar.memoryChunkType);
                za80VarM192744i.getClass();
                cb80 cb80VarM192745j = a3eVar.poolFactory.m192745j();
                cb80VarM192745j.getClass();
                Executor ioBoundExecutor = a3eVar.executorSupplier.getIoBoundExecutor();
                ioBoundExecutor.getClass();
                Executor executorMo146566e = a3eVar.executorSupplier.mo146566e();
                executorMo146566e.getClass();
                linkedHashMap.put(key, new yg3(mfiVar, za80VarM192744i, cb80VarM192745j, ioBoundExecutor, executorMo146566e, a3eVar.imageCacheStatsTracker));
            }
            return ImmutableMap.copyOf((Map) linkedHashMap);
        }

        /* JADX INFO: renamed from: k */
        public static Map m94678k(a3e a3eVar, C15517a c15517a) {
            a3eVar.getClass();
            c15517a.getClass();
            Map map = a3eVar.dynamicDiskCacheConfigMap;
            if (map == null) {
                return MapsKt.emptyMap();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), a3eVar.fileCacheFactory.mo157756a((n2e) entry.getValue()));
            }
            return linkedHashMap;
        }

        @Override // p149l.s2e
        /* JADX INFO: renamed from: a */
        public mfi mo94679a() {
            return (mfi) this.smallImageFileCache.getValue();
        }

        @Override // p149l.s2e
        /* JADX INFO: renamed from: b */
        public yg3 mo94680b() {
            return (yg3) this.smallImageBufferedDiskCache.getValue();
        }

        @Override // p149l.s2e
        /* JADX INFO: renamed from: c */
        public yg3 mo94681c() {
            return (yg3) this.mainBufferedDiskCache.getValue();
        }

        @Override // p149l.s2e
        /* JADX INFO: renamed from: d */
        public ImmutableMap<String, yg3> mo94682d() {
            Object value = this.dynamicBufferedDiskCaches.getValue();
            value.getClass();
            return (ImmutableMap) value;
        }

        @Override // p149l.s2e
        /* JADX INFO: renamed from: e */
        public mfi mo94683e() {
            return (mfi) this.mainFileCache.getValue();
        }

        /* JADX INFO: renamed from: l */
        public Map<String, mfi> m94684l() {
            return (Map) this.dynamicFileCaches.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a3e(@NotNull nfi nfiVar, @NotNull ua80 ua80Var, @NotNull x5f x5fVar, @NotNull wem wemVar, int i, @NotNull n2e n2eVar, @NotNull n2e n2eVar2, @Nullable Map<String, ? extends n2e> map) {
        nfiVar.getClass();
        ua80Var.getClass();
        x5fVar.getClass();
        wemVar.getClass();
        n2eVar.getClass();
        n2eVar2.getClass();
        this.fileCacheFactory = nfiVar;
        this.poolFactory = ua80Var;
        this.executorSupplier = x5fVar;
        this.imageCacheStatsTracker = wemVar;
        this.memoryChunkType = i;
        this.mainDiskCacheConfig = n2eVar;
        this.smallImageDiskCacheConfig = n2eVar2;
        this.dynamicDiskCacheConfigMap = map;
        this.diskCachesStore = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l.t2e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a3e.m94662a(this.f167459a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C15517a m94662a(a3e a3eVar) {
        a3eVar.getClass();
        return new C15517a(a3eVar);
    }

    @Override // p149l.syg0
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public s2e get() {
        return m94672k();
    }

    /* JADX INFO: renamed from: k */
    public final s2e m94672k() {
        return (s2e) this.diskCachesStore.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a3e(@NotNull nfi nfiVar, @NotNull qhm qhmVar) {
        this(nfiVar, qhmVar.getPoolFactory(), qhmVar.getExecutorSupplier(), qhmVar.getImageCacheStatsTracker(), qhmVar.getMemoryChunkType(), qhmVar.getMainDiskCacheConfig(), qhmVar.getSmallImageDiskCacheConfig(), qhmVar.mo168991d());
        nfiVar.getClass();
        qhmVar.getClass();
    }
}
