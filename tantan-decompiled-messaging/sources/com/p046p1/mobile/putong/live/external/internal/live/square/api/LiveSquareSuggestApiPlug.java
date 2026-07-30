package com.p046p1.mobile.putong.live.external.internal.live.square.api;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareSuggestApiPlug;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.jo0;
import p149l.mcr;
import p149l.o3u;
import p149l.uvr;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.x4u;
import p149l.x9j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\u001cR\u0016\u0010(\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\nR\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveSquareSuggestApiPlug;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "Ll/o3u;", "liveSuggestInfo", "", "checkNullData", "(Ll/o3u;)V", "Lrx/c;", "getZip", "()Lrx/c;", "", "", "stoppedLiveIds", "categories", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "curLives", "replaceStoppedLives", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lrx/c;", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannersBean;", "loadLiveBannersOb", "", "intlFeedRule", "()Z", "getData", "()V", "", "retainSeconds", "Lkotlin/Function0;", "doOnSuccess", "Ll/c4g0;", "remainOfficialTime", "(JLkotlin/jvm/functions/Function0;)Ll/c4g0;", "disableFilterRepeat", "loadNextPage", "(Z)V", "updateCurrentLiveInfo", "loadingNext", "Z", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "liveSquareTab", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "getLiveSquareTab", "()Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "setLiveSquareTab", "(Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;)V", "", Constants.KEY_LIMIT, "I", BaseSei.INFO, "Ll/o3u;", "getInfo", "()Ll/o3u;", "setInfo", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "mergeAndDropDelay", "J", "getExtraQueryList", "()Ljava/lang/String;", "extraQueryList", "Companion", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LiveSquareSuggestApiPlug extends BaseAsyncPlug {

    @NotNull
    public static final String TYPE_LOAD_ALL = "TYPE_LOAD_ALL";

    @NotNull
    public static final String TYPE_LOAD_MORE = "TYPE_LOAD_MORE";

    @NotNull
    public static final String TYPE_LOAD_NORMAL = "TYPE_LOAD_NORMAL";

    @Nullable
    private o3u info;
    private final int limit;

    @Nullable
    private BLiveSquareTab liveSquareTab;
    private boolean loadingNext;
    private final long mergeAndDropDelay;

    @NotNull
    private final RxTaskQueue taskQueue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSquareSuggestApiPlug(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
        this.limit = x4u.f191061a;
        this.taskQueue = new RxTaskQueue("LiveSquareSuggest");
        this.mergeAndDropDelay = 3000L;
    }

    private final void checkNullData(o3u liveSuggestInfo) {
        if (liveSuggestInfo == null) {
            CrashHelper.m81296c(new NullPointerException("Null SuggestInfo"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static C22306c m69002f(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static void m69003g(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, Function0 function0, o3u o3uVar) {
        liveSquareSuggestApiPlug.info = o3uVar;
        liveSquareSuggestApiPlug.checkNullData(o3uVar);
        liveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
        function0.invoke();
    }

    private final String getExtraQueryList() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (bLiveSquareTab != null) {
            return Intrinsics.m87488d(bLiveSquareTab.name, "square-multi-call") ? "liveTabSource=live-independent-multi-call" : "liveTabSource=live-independent-tab-suggested";
        }
        return null;
    }

    private final C22306c<o3u> getZip() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        C22306c<o3u> liveListV2 = LiveSquareApi.getLiveListV2(RelationshipStatus.suggested, bLiveSquareTab != null ? bLiveSquareTab.name : null, null, this.limit, null, false, getExtraQueryList(), intlFeedRule());
        C22306c<LiveSquareBannersBean> c22306cLoadLiveBannersOb = loadLiveBannersOb();
        final Function2 function2 = new Function2() { // from class: l.w2u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiveSquareSuggestApiPlug.m69015s((o3u) obj, (LiveSquareBannersBean) obj2);
            }
        };
        C22306c<o3u> c22306cZip = C22306c.zip(liveListV2, c22306cLoadLiveBannersOb, new x9j() { // from class: l.x2u
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return LiveSquareSuggestApiPlug.m69007k(function2, obj, obj2);
            }
        });
        c22306cZip.getClass();
        return c22306cZip;
    }

    /* JADX INFO: renamed from: h */
    public static void m69004h(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, Throwable th) {
        th.getClass();
        liveSquareSuggestApiPlug.error(th);
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m69005i(BLiveSuggestLive bLiveSuggestLive) {
        return Boolean.valueOf(!TextUtils.equals(bLiveSuggestLive.liveType, "videoChat"));
    }

    private final boolean intlFeedRule() {
        return uvr.m196087d().m162669G0();
    }

    /* JADX INFO: renamed from: j */
    public static C22306c m69006j(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, Long l2) {
        return liveSquareSuggestApiPlug.getZip();
    }

    /* JADX INFO: renamed from: k */
    public static o3u m69007k(Function2 function2, Object obj, Object obj2) {
        return (o3u) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public static void m69008l(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug) {
        liveSquareSuggestApiPlug.complete();
    }

    private final C22306c<LiveSquareBannersBean> loadLiveBannersOb() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (!Intrinsics.m87488d(bLiveSquareTab != null ? bLiveSquareTab.name : null, "square-suggested")) {
            BLiveSquareTab bLiveSquareTab2 = this.liveSquareTab;
            if (!Intrinsics.m87488d(bLiveSquareTab2 != null ? bLiveSquareTab2.name : null, "square-newcomer")) {
                C22306c<LiveSquareBannersBean> c22306cJust = C22306c.just(null);
                c22306cJust.getClass();
                return c22306cJust;
            }
        }
        BLiveSquareTab bLiveSquareTab3 = this.liveSquareTab;
        C22306c<LiveSquareBannersBean> c22306cOnErrorReturn = LiveSquareApi.getLiveBanners("live-independent-tab", bLiveSquareTab3 != null ? bLiveSquareTab3.bannerType : null, bLiveSquareTab3 != null ? bLiveSquareTab3.name : null).onErrorReturn(new w9j() { // from class: l.l3u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSquareSuggestApiPlug.m69017u((Throwable) obj);
            }
        });
        c22306cOnErrorReturn.getClass();
        return c22306cOnErrorReturn;
    }

    /* JADX INFO: renamed from: m */
    public static C22306c m69009m(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, List list, o3u o3uVar) {
        o3uVar.getClass();
        o3u o3uVar2 = liveSquareSuggestApiPlug.info;
        if (o3uVar2 == null) {
            return C22306c.just(null);
        }
        int iM187670q = o3uVar.m187670q(o3uVar2.f169071a, o3uVar.f169071a);
        if (iM187670q == 0) {
            return C22306c.just(null);
        }
        o3u o3uVar3 = liveSquareSuggestApiPlug.info;
        o3uVar3.getClass();
        o3uVar3.m187667E(list, iM187670q);
        return C22306c.just(o3uVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m69010n(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, Throwable th) {
        liveSquareSuggestApiPlug.loadingNext = false;
        th.getClass();
        liveSquareSuggestApiPlug.error(th);
    }

    /* JADX INFO: renamed from: o */
    public static String m69011o(BLiveSuggestLive bLiveSuggestLive) {
        return bLiveSuggestLive.f44450id;
    }

    /* JADX INFO: renamed from: p */
    public static C22306c m69012p(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive()) {
                o3u o3uVar = liveSquareSuggestApiPlug.info;
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
        return arrayList.isEmpty() ? C22306c.just(null) : liveSquareSuggestApiPlug.replaceStoppedLives(arrayList, arrayList2, list);
    }

    /* JADX INFO: renamed from: q */
    public static C22306c m69013q(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static void m69014r(final LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, final o3u o3uVar) {
        if (o3uVar != null) {
            liveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
            C22306c<Long> c22306cTimer = C22306c.timer(liveSquareSuggestApiPlug.mergeAndDropDelay, TimeUnit.MILLISECONDS);
            c22306cTimer.getClass();
            liveSquareSuggestApiPlug.duringCreated(c22306cTimer).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.y2u
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveSquareSuggestApiPlug.updateCurrentLiveInfo$lambda$4$0(this.f195711a, o3uVar, (Long) obj);
                }
            }));
        }
    }

    private final C22306c<o3u> replaceStoppedLives(List<String> stoppedLiveIds, List<String> categories, final List<? extends BLiveSuggestLive> curLives) {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        bLiveSquareTab.getClass();
        C22306c<o3u> c22306cRefreshStoppedLivesV2 = LiveSquareApi.refreshStoppedLivesV2(stoppedLiveIds, categories, bLiveSquareTab.name, intlFeedRule());
        final Function1 function1 = new Function1() { // from class: l.m3u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveSquareSuggestApiPlug.m69009m(this.f131121a, curLives, (o3u) obj);
            }
        };
        C22306c c22306cFlatMap = c22306cRefreshStoppedLivesV2.flatMap(new w9j() { // from class: l.n3u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSquareSuggestApiPlug.m69002f(function1, obj);
            }
        });
        c22306cFlatMap.getClass();
        return c22306cFlatMap;
    }

    /* JADX INFO: renamed from: s */
    public static o3u m69015s(o3u o3uVar, LiveSquareBannersBean liveSquareBannersBean) {
        o3uVar.getClass();
        if (liveSquareBannersBean != null) {
            if (!vwb.m200296J(liveSquareBannersBean.banners)) {
                vwb.m200354z(liveSquareBannersBean.banners, new e30() { // from class: l.f3u
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((LiveSquareBannerBean) obj).removeLiveGroupBanners();
                    }
                });
            }
            if (!vwb.m200296J(liveSquareBannersBean.banners)) {
                List<LiveSquareBannerBean> list = o3uVar.f141709c;
                List<LiveSquareBannerBean> list2 = liveSquareBannersBean.banners;
                list2.getClass();
                list.addAll(list2);
            }
        }
        return o3uVar;
    }

    /* JADX INFO: renamed from: t */
    public static C22306c m69016t(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static LiveSquareBannersBean m69017u(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCurrentLiveInfo$lambda$4$0(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, o3u o3uVar, Long l2) {
        o3u o3uVar2 = liveSquareSuggestApiPlug.info;
        o3uVar2.getClass();
        o3uVar2.m187678y(o3uVar);
        liveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
    }

    /* JADX INFO: renamed from: v */
    public static void m69018v(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, boolean z, o3u o3uVar) {
        o3u o3uVar2 = liveSquareSuggestApiPlug.info;
        if (o3uVar2 != null) {
            o3uVar2.m187677x(o3uVar, z);
        }
        liveSquareSuggestApiPlug.checkNullData(liveSquareSuggestApiPlug.info);
        liveSquareSuggestApiPlug.loadingNext = false;
        liveSquareSuggestApiPlug.success("TYPE_LOAD_MORE");
    }

    /* JADX INFO: renamed from: w */
    public static C22306c m69019w(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug) {
        return liveSquareSuggestApiPlug.taskQueue.m68617f("loadSuggestInfo", liveSquareSuggestApiPlug.getZip(), 100);
    }

    /* JADX INFO: renamed from: x */
    public static void m69020x(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, o3u o3uVar) {
        liveSquareSuggestApiPlug.info = o3uVar;
        liveSquareSuggestApiPlug.checkNullData(o3uVar);
        liveSquareSuggestApiPlug.success("TYPE_LOAD_ALL");
    }

    @Override // com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
        loading();
        duringCreated(new v9j() { // from class: l.t2u
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return LiveSquareSuggestApiPlug.m69019w(this.f167550a);
            }
        }, false).observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.e3u
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareSuggestApiPlug.m69020x(this.f89216a, (o3u) obj);
            }
        }, new e30() { // from class: l.g3u
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareSuggestApiPlug.m69004h(this.f100509a, (Throwable) obj);
            }
        }, new d30() { // from class: l.h3u
            @Override // p149l.d30
            public final void call() {
                LiveSquareSuggestApiPlug.m69008l(this.f105764a);
            }
        }));
    }

    @Nullable
    public final o3u getInfo() {
        return this.info;
    }

    @Nullable
    public final BLiveSquareTab getLiveSquareTab() {
        return this.liveSquareTab;
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
                C22306c<o3u> liveListV2 = LiveSquareApi.getLiveListV2(RelationshipStatus.suggested, str, "", i, paginationM187671r.links.next, false, getExtraQueryList(), intlFeedRule());
                liveListV2.getClass();
                duringCreated(liveListV2).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.u2u
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        LiveSquareSuggestApiPlug.m69018v(this.f173518a, disableFilterRepeat, (o3u) obj);
                    }
                }, new e30() { // from class: l.v2u
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        LiveSquareSuggestApiPlug.m69010n(this.f179608a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    @NotNull
    public final c4g0 remainOfficialTime(long retainSeconds, @NotNull final Function0<Unit> doOnSuccess) {
        doOnSuccess.getClass();
        C22306c<Long> c22306cTimer = C22306c.timer(retainSeconds, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: l.i3u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveSquareSuggestApiPlug.m69006j(this.f111378a, (Long) obj);
            }
        };
        Object objFlatMap = c22306cTimer.flatMap(new w9j() { // from class: l.j3u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSquareSuggestApiPlug.m69016t(function1, obj);
            }
        });
        objFlatMap.getClass();
        c4g0 c4g0VarSubscribe = duringCreated((C22306c) objFlatMap).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.k3u
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareSuggestApiPlug.m69003g(this.f120866a, doOnSuccess, (o3u) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        return c4g0VarSubscribe;
    }

    public final void setInfo(@Nullable o3u o3uVar) {
        this.info = o3uVar;
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
            C22306c<List<BLiveSuggestLive>> c22306cQueryCurrentLivesInfo = LiveSquareApi.queryCurrentLivesInfo(vwb.m200334k0(vwb.m200303Q(vwb.m200339n(o3uVar2.f169071a, new w9j() { // from class: l.z2u
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiveSquareSuggestApiPlug.m69005i((BLiveSuggestLive) obj);
                }
            }), new w9j() { // from class: l.a3u
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiveSquareSuggestApiPlug.m69011o((BLiveSuggestLive) obj);
                }
            }), 100), intlFeedRule());
            c22306cQueryCurrentLivesInfo.getClass();
            C22306c c22306cDuringCreated = duringCreated(c22306cQueryCurrentLivesInfo);
            final Function1 function1 = new Function1() { // from class: l.b3u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveSquareSuggestApiPlug.m69012p(this.f73259a, (List) obj);
                }
            };
            c22306cDuringCreated.flatMap(new w9j() { // from class: l.c3u
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiveSquareSuggestApiPlug.m69013q(function1, obj);
                }
            }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.d3u
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveSquareSuggestApiPlug.m69014r(this.f84258a, (o3u) obj);
                }
            }));
        }
    }
}
