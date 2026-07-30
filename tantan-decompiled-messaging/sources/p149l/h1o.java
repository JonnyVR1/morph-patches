package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 E2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00109\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\nR\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, m87232d2 = {"Ll/h1o;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Lcom/p1/mobile/android/app/Act;", "lifecycleProvider", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Ll/o3u;", "liveSuggestInfo", "", "checkNullData", "(Ll/o3u;)V", "Lrx/c;", "getZip", "()Lrx/c;", "", "", "stoppedLiveIds", "categories", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "curLives", "replaceStoppedLives", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lrx/c;", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannersBean;", "loadLiveBannersOb", "", "intlFeedRule", "()Z", "getData", "()V", "disableFilterRepeat", "loadNextPage", "(Z)V", "updateCurrentLiveInfo", "a", "Lcom/p1/mobile/android/app/Act;", "getLifecycleProvider", "()Lcom/p1/mobile/android/app/Act;", "b", "Z", "loadingNext", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "c", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "getLiveSquareTab", "()Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "setLiveSquareTab", "(Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;)V", "liveSquareTab", "", Constants.INAPP_DATA_TAG, "I", Constants.KEY_LIMIT, "e", "Ll/o3u;", "getInfo", "()Ll/o3u;", "setInfo", BaseSei.INFO, "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "f", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue", "", "g", "J", "mergeAndDropDelay", "getExtraQueryList", "()Ljava/lang/String;", "extraQueryList", "Companion", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class h1o extends BaseAsyncPlug {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act lifecycleProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean loadingNext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public BLiveSquareTab liveSquareTab;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int limit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public o3u info;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final RxTaskQueue taskQueue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final long mergeAndDropDelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1o(@NotNull Act act) {
        super(act);
        act.getClass();
        this.lifecycleProvider = act;
        this.limit = x4u.f191061a;
        this.taskQueue = new RxTaskQueue("LiveSquareSuggest");
        this.mergeAndDropDelay = 3000L;
    }

    /* JADX INFO: renamed from: A */
    public static void m129044A(h1o h1oVar, Throwable th) {
        h1oVar.loadingNext = false;
        th.getClass();
        h1oVar.error(th);
    }

    /* JADX INFO: renamed from: B */
    public static final void m129045B(h1o h1oVar, o3u o3uVar, Long l2) {
        o3u o3uVar2 = h1oVar.info;
        o3uVar2.getClass();
        o3uVar2.m187679z(o3uVar);
        h1oVar.success("TYPE_LOAD_NORMAL");
    }

    /* JADX INFO: renamed from: f */
    public static void m129046f(h1o h1oVar, Throwable th) {
        th.getClass();
        h1oVar.error(th);
    }

    /* JADX INFO: renamed from: g */
    public static o3u m129047g(Function2 function2, Object obj, Object obj2) {
        return (o3u) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: h */
    public static C22306c m129048h(h1o h1oVar, List list, o3u o3uVar) {
        o3uVar.getClass();
        o3u o3uVar2 = h1oVar.info;
        if (o3uVar2 == null) {
            return C22306c.just(null);
        }
        int iM187670q = o3uVar.m187670q(o3uVar2.f169071a, o3uVar.f169071a);
        if (iM187670q == 0) {
            return C22306c.just(null);
        }
        o3u o3uVar3 = h1oVar.info;
        o3uVar3.getClass();
        o3uVar3.m187667E(list, iM187670q);
        return C22306c.just(o3uVar);
    }

    /* JADX INFO: renamed from: i */
    public static void m129049i(final h1o h1oVar, final o3u o3uVar) {
        if (o3uVar != null) {
            h1oVar.success("TYPE_LOAD_NORMAL");
            C22306c<Long> c22306cTimer = C22306c.timer(h1oVar.mergeAndDropDelay, TimeUnit.MILLISECONDS);
            c22306cTimer.getClass();
            h1oVar.duringCreated(c22306cTimer).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.o0o
                @Override // p149l.e30
                public final void call(Object obj) {
                    h1o.m129045B(this.f141353a, o3uVar, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j */
    public static LiveSquareBannersBean m129050j(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static C22306c m129051k(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static void m129052l(h1o h1oVar, o3u o3uVar) {
        h1oVar.info = o3uVar;
        h1oVar.checkNullData(o3uVar);
        h1oVar.success("TYPE_LOAD_ALL");
    }

    /* JADX INFO: renamed from: m */
    public static C22306c m129053m(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static o3u m129054n(Function1 function1, Object obj) {
        return (o3u) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static C22306c m129055o(h1o h1oVar) {
        return h1oVar.taskQueue.m68617f("loadSuggestInfo", h1oVar.getZip(), 100);
    }

    /* JADX INFO: renamed from: p */
    public static C22306c m129056p(h1o h1oVar, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive()) {
                o3u o3uVar = h1oVar.info;
                o3uVar.getClass();
                BLiveSuggestLive bLiveSuggestLiveM187664B = o3uVar.m187664B(bLiveSuggestLive.f44450id);
                if (bLiveSuggestLiveM187664B != null) {
                    String str = bLiveSuggestLiveM187664B.f44450id;
                    str.getClass();
                    arrayList.add(str);
                    String recommendCategory = bLiveSuggestLiveM187664B.getRecommendCategory();
                    recommendCategory.getClass();
                    arrayList2.add(recommendCategory);
                }
            }
            if (arrayList.size() >= 10) {
                break;
            }
        }
        return arrayList.isEmpty() ? C22306c.just(null) : h1oVar.replaceStoppedLives(arrayList, arrayList2, list);
    }

    /* JADX INFO: renamed from: q */
    public static o3u m129057q(z6o z6oVar) {
        return new o3u(z6oVar.f169071a, z6oVar.m187671r());
    }

    /* JADX INFO: renamed from: s */
    public static void m129059s(h1o h1oVar) {
        h1oVar.complete();
    }

    /* JADX INFO: renamed from: t */
    public static LiveSquareBannersBean m129060t(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static o3u m129061u(z6o z6oVar, LiveSquareBannersBean liveSquareBannersBean) {
        z6oVar.getClass();
        if (liveSquareBannersBean != null) {
            if (!vwb.m200296J(liveSquareBannersBean.banners)) {
                vwb.m200354z(liveSquareBannersBean.banners, new e30() { // from class: l.y0o
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((LiveSquareBannerBean) obj).removeLiveGroupBanners();
                    }
                });
            }
            if (!vwb.m200296J(liveSquareBannersBean.banners)) {
                List<LiveSquareBannerBean> list = z6oVar.f201940c;
                List<LiveSquareBannerBean> list2 = liveSquareBannersBean.banners;
                list2.getClass();
                list.addAll(list2);
            }
        }
        o3u o3uVar = new o3u(z6oVar.f169071a, z6oVar.m187671r());
        o3uVar.f141709c = z6oVar.f201940c;
        return o3uVar;
    }

    /* JADX INFO: renamed from: v */
    public static o3u m129062v(Function1 function1, Object obj) {
        return (o3u) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static void m129064x(h1o h1oVar, boolean z, o3u o3uVar) {
        o3u o3uVar2 = h1oVar.info;
        if (o3uVar2 != null) {
            o3uVar2.m187677x(o3uVar, z);
        }
        h1oVar.checkNullData(h1oVar.info);
        h1oVar.loadingNext = false;
        h1oVar.success("TYPE_LOAD_MORE");
    }

    /* JADX INFO: renamed from: y */
    public static String m129065y(BLiveSuggestLive bLiveSuggestLive) {
        return bLiveSuggestLive.f44450id;
    }

    /* JADX INFO: renamed from: z */
    public static o3u m129066z(z6o z6oVar) {
        return new o3u(z6oVar != null ? z6oVar.f169071a : null, z6oVar != null ? z6oVar.m187671r() : null);
    }

    public final void checkNullData(o3u liveSuggestInfo) {
        if (liveSuggestInfo == null) {
            CrashHelper.m81296c(new NullPointerException("Null SuggestInfo"));
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
        loading();
        duringCreated(new v9j() { // from class: l.l0o
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h1o.m129055o(this.f125553a);
            }
        }, false).observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.w0o
            @Override // p149l.e30
            public final void call(Object obj) {
                h1o.m129052l(this.f183928a, (o3u) obj);
            }
        }, new e30() { // from class: l.z0o
            @Override // p149l.e30
            public final void call(Object obj) {
                h1o.m129046f(this.f201006a, (Throwable) obj);
            }
        }, new d30() { // from class: l.a1o
            @Override // p149l.d30
            public final void call() {
                h1o.m129059s(this.f67192a);
            }
        }));
    }

    public final String getExtraQueryList() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (bLiveSquareTab != null) {
            return Intrinsics.m87488d(bLiveSquareTab.name, "square-multi-call") ? "liveTabSource=live-independent-multi-call" : "liveTabSource=live-independent-tab-suggested";
        }
        return null;
    }

    @Nullable
    public final o3u getInfo() {
        return this.info;
    }

    public final C22306c<o3u> getZip() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        C22306c<z6o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, bLiveSquareTab != null ? bLiveSquareTab.name : null, null, this.limit, null, false, getExtraQueryList(), intlFeedRule());
        C22306c<LiveSquareBannersBean> c22306cLoadLiveBannersOb = loadLiveBannersOb();
        final Function2 function2 = new Function2() { // from class: l.t0o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return h1o.m129061u((z6o) obj, (LiveSquareBannersBean) obj2);
            }
        };
        C22306c<o3u> c22306cZip = C22306c.zip(liveListV2, c22306cLoadLiveBannersOb, new x9j() { // from class: l.u0o
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return h1o.m129047g(function2, obj, obj2);
            }
        });
        c22306cZip.getClass();
        return c22306cZip;
    }

    public final boolean intlFeedRule() {
        return uvr.m196087d().m162669G0();
    }

    public final C22306c<LiveSquareBannersBean> loadLiveBannersOb() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (!Intrinsics.m87488d(bLiveSquareTab != null ? bLiveSquareTab.name : null, "square-suggested")) {
            C22306c<LiveSquareBannersBean> c22306cJust = C22306c.just(null);
            c22306cJust.getClass();
            return c22306cJust;
        }
        if (!intlFeedRule()) {
            BLiveSquareTab bLiveSquareTab2 = this.liveSquareTab;
            C22306c<LiveSquareBannersBean> c22306cOnErrorReturn = IntlLiveSquareApi.getLiveBanners("live-independent-tab", bLiveSquareTab2 != null ? bLiveSquareTab2.bannerType : null, bLiveSquareTab2 != null ? bLiveSquareTab2.name : null).onErrorReturn(new w9j() { // from class: l.x0o
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return h1o.m129060t((Throwable) obj);
                }
            });
            c22306cOnErrorReturn.getClass();
            return c22306cOnErrorReturn;
        }
        fbn.Companion companion = fbn.INSTANCE;
        BLiveSquareTab bLiveSquareTab3 = this.liveSquareTab;
        C22306c<LiveSquareBannersBean> c22306cM120377q = companion.m120377q("live-independent-tab", bLiveSquareTab3 != null ? bLiveSquareTab3.bannerType : null, bLiveSquareTab3 != null ? bLiveSquareTab3.name : null);
        c22306cM120377q.getClass();
        C22306c<LiveSquareBannersBean> c22306cOnErrorReturn2 = c22306cM120377q.onErrorReturn(new w9j() { // from class: l.v0o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h1o.m129050j((Throwable) obj);
            }
        });
        c22306cOnErrorReturn2.getClass();
        return c22306cOnErrorReturn2;
    }

    public final void loadNextPage(final boolean disableFilterRepeat) {
        o3u o3uVar = this.info;
        if (o3uVar != null) {
            o3uVar.getClass();
            if (o3uVar.m187673t() && !this.loadingNext) {
                this.loadingNext = true;
                BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
                String str = bLiveSquareTab != null ? bLiveSquareTab.name : null;
                int i = this.limit;
                o3u o3uVar2 = this.info;
                Pagination paginationM187671r = o3uVar2 != null ? o3uVar2.m187671r() : null;
                paginationM187671r.getClass();
                C22306c<z6o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, str, "", i, paginationM187671r.links.next, false, getExtraQueryList(), intlFeedRule());
                liveListV2.getClass();
                C22306c c22306cDuringCreated = duringCreated(liveListV2);
                final Function1 function1 = new Function1() { // from class: l.f1o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return h1o.m129057q((z6o) obj);
                    }
                };
                c22306cDuringCreated.map(new w9j() { // from class: l.g1o
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return h1o.m129062v(function1, obj);
                    }
                }).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.m0o
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        h1o.m129064x(this.f130750a, disableFilterRepeat, (o3u) obj);
                    }
                }, new e30() { // from class: l.n0o
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        h1o.m129044A(this.f136577a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    public final C22306c<o3u> replaceStoppedLives(List<String> stoppedLiveIds, List<String> categories, final List<? extends BLiveSuggestLive> curLives) {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        bLiveSquareTab.getClass();
        C22306c<z6o> c22306cRefreshStoppedLivesV2 = IntlLiveSquareApi.refreshStoppedLivesV2(stoppedLiveIds, categories, bLiveSquareTab.name, intlFeedRule());
        final Function1 function1 = new Function1() { // from class: l.p0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1o.m129066z((z6o) obj);
            }
        };
        C22306c<R> map = c22306cRefreshStoppedLivesV2.map(new w9j() { // from class: l.q0o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h1o.m129054n(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.r0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1o.m129048h(this.f157182a, curLives, (o3u) obj);
            }
        };
        C22306c<o3u> c22306cFlatMap = map.flatMap(new w9j() { // from class: l.s0o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h1o.m129053m(function2, obj);
            }
        });
        c22306cFlatMap.getClass();
        return c22306cFlatMap;
    }

    public final void setLiveSquareTab(@Nullable BLiveSquareTab bLiveSquareTab) {
        this.liveSquareTab = bLiveSquareTab;
    }

    public final void updateCurrentLiveInfo() {
        o3u o3uVar = this.info;
        if (o3uVar != null) {
            o3uVar.getClass();
            if (vwb.m200296J(o3uVar.f169071a)) {
                return;
            }
            o3u o3uVar2 = this.info;
            o3uVar2.getClass();
            C22306c<List<BLiveSuggestLive>> c22306cQueryCurrentLivesInfo = IntlLiveSquareApi.queryCurrentLivesInfo(vwb.m200334k0(vwb.m200303Q(o3uVar2.f169071a, new w9j() { // from class: l.b1o
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return h1o.m129065y((BLiveSuggestLive) obj);
                }
            }), 100), intlFeedRule());
            c22306cQueryCurrentLivesInfo.getClass();
            C22306c c22306cDuringCreated = duringCreated(c22306cQueryCurrentLivesInfo);
            final Function1 function1 = new Function1() { // from class: l.c1o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h1o.m129056p(this.f78289a, (List) obj);
                }
            };
            c22306cDuringCreated.flatMap(new w9j() { // from class: l.d1o
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return h1o.m129051k(function1, obj);
                }
            }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.e1o
                @Override // p149l.e30
                public final void call(Object obj) {
                    h1o.m129049i(this.f88835a, (o3u) obj);
                }
            }));
        }
    }
}
