package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.repo.DownloadState;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u0000 A2\u00020\u0001:\u00010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J^\u0010\"\u001a\u00020\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00190\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J¶\u0001\u00100\u001a\u00020\u00142\u0018\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\u00172-\u0010-\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+0*¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00140\u001d2-\u0010.\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00140\u001d2-\u0010/\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00140\u001dH\u0016¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\u00142\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0016¢\u0006\u0004\b3\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, m87232d2 = {"Ll/ygi;", "Ll/qgi;", "Ll/pfi;", "cleanupStrategy", "Ll/igi;", "preloaderStrategy", "Ll/aom;", "inAppAssetsStore", "Ll/dhi;", "fileStore", "Ll/lar;", "legacyInAppsStore", "<init>", "(Ll/pfi;Ll/igi;Ll/aom;Ll/dhi;Ll/lar;)V", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "meta", "Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;", "downloadState", "", "q", "(Lkotlin/Pair;Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;)V", "", "validUrls", "", "currentTime", "", "allFileUrls", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "url", "expiryTs", "j", "(Ljava/util/List;JLjava/util/Set;Lkotlin/jvm/functions/Function1;)V", "cleanupUrls", "h", "(Ljava/util/List;)V", "p", "()V", "urlMeta", "", "", "urlStatusMap", "completionCallback", "successBlock", "failureBlock", "a", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "urls", RXScreenCaptureService.KEY_INDEX, "Ll/pfi;", BLiveStormDanmakuGiftResourceType.f44444l, "()Ll/pfi;", "b", "Ll/igi;", "m", "()Ll/igi;", "c", "Ll/aom;", Constants.INAPP_DATA_TAG, "Ll/dhi;", "e", "Ll/lar;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ygi implements qgi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final long f198192f;

    /* JADX INFO: renamed from: g */
    @NotNull
    private static final Set<u8e> f198193g;

    /* JADX INFO: renamed from: h */
    @NotNull
    private static final HashMap<String, DownloadState> f198194h;

    /* JADX INFO: renamed from: i */
    @NotNull
    private static final Object f198195i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final pfi cleanupStrategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final igi preloaderStrategy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final aom inAppAssetsStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final dhi fileStore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final lar legacyInAppsStore;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f198192f = Duration.m93535u(DurationKt.m93561o(14, DurationUnit.DAYS));
        f198193g = new LinkedHashSet();
        f198194h = new HashMap<>();
        f198195i = new Object();
    }

    public ygi(@NotNull pfi pfiVar, @NotNull igi igiVar, @NotNull aom aomVar, @NotNull dhi dhiVar, @NotNull lar larVar) {
        pfiVar.getClass();
        igiVar.getClass();
        aomVar.getClass();
        dhiVar.getClass();
        larVar.getClass();
        this.cleanupStrategy = pfiVar;
        this.preloaderStrategy = igiVar;
        this.inAppAssetsStore = aomVar;
        this.fileStore = dhiVar;
        this.legacyInAppsStore = larVar;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m214708b(ygi ygiVar, String str) {
        ygiVar.getClass();
        str.getClass();
        ygiVar.fileStore.m111821a(str);
        ygiVar.inAppAssetsStore.m97917a(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m214709c(ygi ygiVar, Function1 function1, Pair pair) {
        ygiVar.getClass();
        function1.getClass();
        pair.getClass();
        INSTANCE.m214724a(pair, new Pair<>(ygiVar.fileStore, ygiVar.inAppAssetsStore));
        ygiVar.m214718q(pair, DownloadState.SUCCESSFUL);
        function1.invoke(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m214710d(ygi ygiVar, Function1 function1, Pair pair) {
        ygiVar.getClass();
        function1.getClass();
        pair.getClass();
        ygiVar.m214718q(pair, DownloadState.FAILED);
        function1.invoke(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static long m214711e(ygi ygiVar, String str) {
        ygiVar.getClass();
        str.getClass();
        return Math.max(ygiVar.fileStore.m111822b(str), ygiVar.inAppAssetsStore.m97918b(str));
    }

    /* JADX INFO: renamed from: f */
    public static Unit m214712f(ygi ygiVar, Pair pair) {
        ygiVar.getClass();
        pair.getClass();
        ygiVar.m214718q(pair, DownloadState.IN_PROGRESS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    private final void m214714h(List<String> cleanupUrls) {
        getCleanupStrategy().mo6504a(cleanupUrls, new Function1() { // from class: l.ugi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ygi.m214708b(this.f176393a, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    private final void m214715j(List<String> validUrls, long currentTime, Set<String> allFileUrls, Function1<? super String, Long> expiryTs) {
        List<String> list = validUrls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, (String) obj);
        }
        Set mutableSet = CollectionsKt.toMutableSet(allFileUrls);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : mutableSet) {
            String str = (String) obj2;
            boolean zContainsKey = linkedHashMap.containsKey(str);
            boolean z = currentTime > expiryTs.invoke(str).longValue();
            if (!zContainsKey && z) {
                arrayList.add(obj2);
            }
        }
        m214714h(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m214716k(final ygi ygiVar, List list, long j, Set set, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        if ((i & 4) != 0) {
            set = SetsKt.plus((Set) ygiVar.fileStore.m111823c(), (Iterable) ygiVar.inAppAssetsStore.m97919c());
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: l.tgi
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Long.valueOf(ygi.m214711e(this.f170098a, (String) obj2));
                }
            };
        }
        List list2 = list;
        ygiVar.m214715j(list2, j, set, function1);
    }

    /* JADX INFO: renamed from: p */
    private final void m214717p() {
        for (u8e u8eVar : f198193g) {
            List<String> listM192189b = u8eVar.m192189b();
            if (!(listM192189b instanceof Collection) || !listM192189b.isEmpty()) {
                Iterator<T> it = listM192189b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        HashMap<String, DownloadState> map = f198194h;
                        if (map.get(str) != DownloadState.SUCCESSFUL && map.get(str) != DownloadState.FAILED) {
                            break;
                        }
                    }
                }
            }
            u8eVar.m192188a().invoke();
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m214718q(Pair<String, ? extends CtCacheType> meta, DownloadState downloadState) {
        if (f198193g.isEmpty()) {
            return;
        }
        synchronized (f198195i) {
            f198194h.put(meta.getFirst(), downloadState);
            m214717p();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p149l.qgi
    /* JADX INFO: renamed from: a */
    public void mo174424a(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMeta, @NotNull Function1<? super Map<String, Boolean>, Unit> completionCallback, @NotNull final Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull final Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock) {
        urlMeta.getClass();
        completionCallback.getClass();
        successBlock.getClass();
        failureBlock.getClass();
        getPreloaderStrategy().mo6509a(urlMeta, new Function1() { // from class: l.vgi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ygi.m214709c(this.f181373a, successBlock, (Pair) obj);
            }
        }, new Function1() { // from class: l.wgi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ygi.m214710d(this.f186194a, failureBlock, (Pair) obj);
            }
        }, new Function1() { // from class: l.xgi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ygi.m214712f(this.f192771a, (Pair) obj);
            }
        }, completionCallback);
    }

    /* JADX INFO: renamed from: i */
    public void m214719i(@NotNull List<String> urls) {
        urls.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.legacyInAppsStore.m149172a() < f198192f) {
            return;
        }
        m214716k(this, urls, jCurrentTimeMillis, null, null, 12, null);
        this.legacyInAppsStore.m149175d(jCurrentTimeMillis);
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public pfi getCleanupStrategy() {
        return this.cleanupStrategy;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public igi getPreloaderStrategy() {
        return this.preloaderStrategy;
    }

    /* JADX INFO: renamed from: n */
    public void m214722n(@NotNull List<? extends Pair<String, ? extends CtCacheType>> list) {
        qgi.C19492a.m174430f(this, list);
    }

    /* JADX INFO: renamed from: o */
    public void m214723o(@NotNull List<? extends Pair<String, ? extends CtCacheType>> list, @NotNull Function1<? super Map<String, Boolean>, Unit> function1) {
        qgi.C19492a.m174431g(this, list, function1);
    }

    /* JADX INFO: renamed from: l.ygi$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/ygi$a;", "", "<init>", "()V", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMeta", "Ll/dhi;", "Ll/aom;", "storePair", "", "a", "(Lkotlin/Pair;Lkotlin/Pair;)V", "", "EXPIRY_OFFSET_MILLIS", "J", "", "Ll/u8e;", "urlTriggers", "Ljava/util/Set;", "Ljava/util/HashMap;", "Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;", "downloadInProgressUrls", "Ljava/util/HashMap;", "fetchAllFilesLock", "Ljava/lang/Object;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: l.ygi$a$a */
        @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f198201a;

            static {
                int[] iArr = new int[CtCacheType.values().length];
                try {
                    iArr[CtCacheType.IMAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CtCacheType.GIF.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CtCacheType.FILES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f198201a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m214724a(@NotNull Pair<String, ? extends CtCacheType> urlMeta, @NotNull Pair<dhi, aom> storePair) {
            urlMeta.getClass();
            storePair.getClass();
            String first = urlMeta.getFirst();
            long jCurrentTimeMillis = System.currentTimeMillis() + ygi.f198192f;
            dhi first2 = storePair.getFirst();
            aom second = storePair.getSecond();
            int i = a.f198201a[urlMeta.getSecond().ordinal()];
            if (i == 1 || i == 2) {
                second.m97920d(first, jCurrentTimeMillis);
                first2.m111824d(first, jCurrentTimeMillis);
            } else if (i == 3) {
                first2.m111824d(first, jCurrentTimeMillis);
            } else {
                l9r.m149037a();
            }
        }

        private Companion() {
        }
    }
}
