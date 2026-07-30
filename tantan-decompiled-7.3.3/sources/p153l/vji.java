package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.repo.DownloadState;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.ranges.C15274a;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u0000 A2\u00020\u0001:\u00010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J^\u0010\"\u001a\u00020\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00190\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J¶\u0001\u00100\u001a\u00020\u00142\u0018\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\u00172-\u0010-\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+0*¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00140\u001d2-\u0010.\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00140\u001d2-\u0010/\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00140\u001dH\u0016¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\u00142\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0016¢\u0006\u0004\b3\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, m88121d2 = {"Ll/vji;", "Ll/nji;", "Ll/mii;", "cleanupStrategy", "Ll/fji;", "preloaderStrategy", "Ll/cqm;", "inAppAssetsStore", "Ll/aki;", "fileStore", "Ll/ncr;", "legacyInAppsStore", "<init>", "(Ll/mii;Ll/fji;Ll/cqm;Ll/aki;Ll/ncr;)V", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "meta", "Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;", "downloadState", "", "q", "(Lkotlin/Pair;Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;)V", "", "validUrls", "", "currentTime", "", "allFileUrls", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "url", "expiryTs", "j", "(Ljava/util/List;JLjava/util/Set;Lkotlin/jvm/functions/Function1;)V", "cleanupUrls", "h", "(Ljava/util/List;)V", "p", "()V", "urlMeta", "", "", "urlStatusMap", "completionCallback", "successBlock", "failureBlock", "a", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "urls", RXScreenCaptureService.KEY_INDEX, "Ll/mii;", BLiveStormDanmakuGiftResourceType.f45292l, "()Ll/mii;", "b", "Ll/fji;", "m", "()Ll/fji;", "c", "Ll/cqm;", Constants.INAPP_DATA_TAG, "Ll/aki;", "e", "Ll/ncr;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vji implements nji {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final long f184386f;

    /* JADX INFO: renamed from: g */
    @NotNull
    private static final Set<dae> f184387g;

    /* JADX INFO: renamed from: h */
    @NotNull
    private static final HashMap<String, DownloadState> f184388h;

    /* JADX INFO: renamed from: i */
    @NotNull
    private static final Object f184389i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final mii cleanupStrategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final fji preloaderStrategy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final cqm inAppAssetsStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final aki fileStore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ncr legacyInAppsStore;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f184386f = Duration.m94426u(DurationKt.m94452o(14, DurationUnit.DAYS));
        f184387g = new LinkedHashSet();
        f184388h = new HashMap<>();
        f184389i = new Object();
    }

    public vji(@NotNull mii miiVar, @NotNull fji fjiVar, @NotNull cqm cqmVar, @NotNull aki akiVar, @NotNull ncr ncrVar) {
        miiVar.getClass();
        fjiVar.getClass();
        cqmVar.getClass();
        akiVar.getClass();
        ncrVar.getClass();
        this.cleanupStrategy = miiVar;
        this.preloaderStrategy = fjiVar;
        this.inAppAssetsStore = cqmVar;
        this.fileStore = akiVar;
        this.legacyInAppsStore = ncrVar;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m201505b(vji vjiVar, String str) {
        vjiVar.getClass();
        str.getClass();
        vjiVar.fileStore.m98562a(str);
        vjiVar.inAppAssetsStore.m111960a(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m201506c(vji vjiVar, Function1 function1, Pair pair) {
        vjiVar.getClass();
        function1.getClass();
        pair.getClass();
        INSTANCE.m201521a(pair, new Pair<>(vjiVar.fileStore, vjiVar.inAppAssetsStore));
        vjiVar.m201515q(pair, DownloadState.SUCCESSFUL);
        function1.invoke(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m201507d(vji vjiVar, Function1 function1, Pair pair) {
        vjiVar.getClass();
        function1.getClass();
        pair.getClass();
        vjiVar.m201515q(pair, DownloadState.FAILED);
        function1.invoke(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static long m201508e(vji vjiVar, String str) {
        vjiVar.getClass();
        str.getClass();
        return Math.max(vjiVar.fileStore.m98563b(str), vjiVar.inAppAssetsStore.m111961b(str));
    }

    /* JADX INFO: renamed from: f */
    public static Unit m201509f(vji vjiVar, Pair pair) {
        vjiVar.getClass();
        pair.getClass();
        vjiVar.m201515q(pair, DownloadState.IN_PROGRESS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    private final void m201511h(List<String> cleanupUrls) {
        getCleanupStrategy().mo6558a(cleanupUrls, new Function1() { // from class: l.rji
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vji.m201505b(this.f163456a, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    private final void m201512j(List<String> validUrls, long currentTime, Set<String> allFileUrls, Function1<? super String, Long> expiryTs) {
        List<String> list = validUrls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
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
        m201511h(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m201513k(final vji vjiVar, List list, long j, Set set, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        if ((i & 4) != 0) {
            set = SetsKt.plus((Set) vjiVar.fileStore.m98564c(), (Iterable) vjiVar.inAppAssetsStore.m111962c());
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: l.qji
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Long.valueOf(vji.m201508e(this.f157974a, (String) obj2));
                }
            };
        }
        List list2 = list;
        vjiVar.m201512j(list2, j, set, function1);
    }

    /* JADX INFO: renamed from: p */
    private final void m201514p() {
        for (dae daeVar : f184387g) {
            List<String> listM115117b = daeVar.m115117b();
            if (!(listM115117b instanceof Collection) || !listM115117b.isEmpty()) {
                Iterator<T> it = listM115117b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        HashMap<String, DownloadState> map = f184388h;
                        if (map.get(str) != DownloadState.SUCCESSFUL && map.get(str) != DownloadState.FAILED) {
                            break;
                        }
                    }
                }
            }
            daeVar.m115116a().invoke();
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m201515q(Pair<String, ? extends CtCacheType> meta, DownloadState downloadState) {
        if (f184387g.isEmpty()) {
            return;
        }
        synchronized (f184389i) {
            f184388h.put(meta.getFirst(), downloadState);
            m201514p();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p153l.nji
    /* JADX INFO: renamed from: a */
    public void mo163420a(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMeta, @NotNull Function1<? super Map<String, Boolean>, Unit> completionCallback, @NotNull final Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull final Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock) {
        urlMeta.getClass();
        completionCallback.getClass();
        successBlock.getClass();
        failureBlock.getClass();
        getPreloaderStrategy().mo6563a(urlMeta, new Function1() { // from class: l.sji
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vji.m201506c(this.f168973a, successBlock, (Pair) obj);
            }
        }, new Function1() { // from class: l.tji
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vji.m201507d(this.f174590a, failureBlock, (Pair) obj);
            }
        }, new Function1() { // from class: l.uji
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vji.m201509f(this.f179220a, (Pair) obj);
            }
        }, completionCallback);
    }

    /* JADX INFO: renamed from: i */
    public void m201516i(@NotNull List<String> urls) {
        urls.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.legacyInAppsStore.m162590a() < f184386f) {
            return;
        }
        m201513k(this, urls, jCurrentTimeMillis, null, null, 12, null);
        this.legacyInAppsStore.m162593d(jCurrentTimeMillis);
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public mii getCleanupStrategy() {
        return this.cleanupStrategy;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public fji getPreloaderStrategy() {
        return this.preloaderStrategy;
    }

    /* JADX INFO: renamed from: n */
    public void m201519n(@NotNull List<? extends Pair<String, ? extends CtCacheType>> list) {
        nji.C18883a.m163426f(this, list);
    }

    /* JADX INFO: renamed from: o */
    public void m201520o(@NotNull List<? extends Pair<String, ? extends CtCacheType>> list, @NotNull Function1<? super Map<String, Boolean>, Unit> function1) {
        nji.C18883a.m163427g(this, list, function1);
    }

    /* JADX INFO: renamed from: l.vji$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/vji$a;", "", "<init>", "()V", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMeta", "Ll/aki;", "Ll/cqm;", "storePair", "", "a", "(Lkotlin/Pair;Lkotlin/Pair;)V", "", "EXPIRY_OFFSET_MILLIS", "J", "", "Ll/dae;", "urlTriggers", "Ljava/util/Set;", "Ljava/util/HashMap;", "Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;", "downloadInProgressUrls", "Ljava/util/HashMap;", "fetchAllFilesLock", "Ljava/lang/Object;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: l.vji$a$a */
        @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f184395a;

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
                f184395a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m201521a(@NotNull Pair<String, ? extends CtCacheType> urlMeta, @NotNull Pair<aki, cqm> storePair) {
            urlMeta.getClass();
            storePair.getClass();
            String first = urlMeta.getFirst();
            long jCurrentTimeMillis = System.currentTimeMillis() + vji.f184386f;
            aki first2 = storePair.getFirst();
            cqm second = storePair.getSecond();
            int i = a.f184395a[urlMeta.getSecond().ordinal()];
            if (i == 1 || i == 2) {
                second.m111963d(first, jCurrentTimeMillis);
                first2.m98565d(first, jCurrentTimeMillis);
            } else if (i == 3) {
                first2.m98565d(first, jCurrentTimeMillis);
            } else {
                nbr.m162172a();
            }
        }

        private Companion() {
        }
    }
}
