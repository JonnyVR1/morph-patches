package com.p046p1.mobile.putong.live.external.intl.livesquare.api;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p046p1.mobile.putong.live.external.intl.livesquare.api.IntlLiveSquareSuggestApiPlug;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
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
import p149l.d30;
import p149l.e30;
import p149l.fbn;
import p149l.ffw;
import p149l.jo0;
import p149l.mcr;
import p149l.uvr;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.x4u;
import p149l.x9j;
import p149l.z6o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\nR\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlLiveSquareSuggestApiPlug;", "Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlBaseAsyncPlug;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "Ll/z6o;", "liveSuggestInfo", "", "checkNullData", "(Ll/z6o;)V", "Lrx/c;", "getZip", "()Lrx/c;", "", "", "stoppedLiveIds", "categories", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "curLives", "replaceStoppedLives", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lrx/c;", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannersBean;", "loadLiveBannersOb", "", "intlFeedRule", "()Z", "getData", "()V", "disableFilterRepeat", "loadNextPage", "(Z)V", "updateCurrentLiveInfo", "loadingNext", "Z", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "liveSquareTab", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "getLiveSquareTab", "()Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "setLiveSquareTab", "(Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;)V", "", Constants.KEY_LIMIT, "I", BaseSei.INFO, "Ll/z6o;", "getInfo", "()Ll/z6o;", "setInfo", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "", "mergeAndDropDelay", "J", "getExtraQueryList", "()Ljava/lang/String;", "extraQueryList", "Companion", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class IntlLiveSquareSuggestApiPlug extends IntlBaseAsyncPlug {

    @NotNull
    public static final String TYPE_LOAD_ALL = "TYPE_LOAD_ALL";

    @NotNull
    public static final String TYPE_LOAD_MORE = "TYPE_LOAD_MORE";

    @NotNull
    public static final String TYPE_LOAD_NORMAL = "TYPE_LOAD_NORMAL";

    @Nullable
    private z6o info;
    private final int limit;

    @Nullable
    private BLiveSquareTab liveSquareTab;
    private boolean loadingNext;
    private final long mergeAndDropDelay;

    @NotNull
    private final RxTaskQueue taskQueue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlLiveSquareSuggestApiPlug(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
        this.limit = x4u.f191061a;
        this.taskQueue = new RxTaskQueue("LiveSquareSuggest");
        this.mergeAndDropDelay = 3000L;
    }

    private final void checkNullData(z6o liveSuggestInfo) {
        if (liveSuggestInfo == null) {
            CrashHelper.m81296c(new NullPointerException("Null SuggestInfo"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static LiveSquareBannersBean m69971f(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m69972g(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, Throwable th) {
        th.getClass();
        intlLiveSquareSuggestApiPlug.error(th);
    }

    private final String getExtraQueryList() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (bLiveSquareTab != null) {
            return Intrinsics.m87488d(bLiveSquareTab.name, "square-multi-call") ? "liveTabSource=live-independent-multi-call" : "liveTabSource=live-independent-tab-suggested";
        }
        return null;
    }

    private final C22306c<z6o> getZip() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        C22306c<z6o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, bLiveSquareTab != null ? bLiveSquareTab.name : null, null, this.limit, null, false, getExtraQueryList(), intlFeedRule());
        C22306c<LiveSquareBannersBean> c22306cLoadLiveBannersOb = loadLiveBannersOb();
        final Function2 function2 = new Function2() { // from class: l.e6o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntlLiveSquareSuggestApiPlug.m69986u((z6o) obj, (LiveSquareBannersBean) obj2);
            }
        };
        C22306c<z6o> c22306cZip = C22306c.zip(liveListV2, c22306cLoadLiveBannersOb, new x9j() { // from class: l.n6o
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlLiveSquareSuggestApiPlug.m69976k(function2, obj, obj2);
            }
        });
        c22306cZip.getClass();
        return c22306cZip;
    }

    /* JADX INFO: renamed from: i */
    public static void m69974i(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug) {
        intlLiveSquareSuggestApiPlug.complete();
    }

    private final boolean intlFeedRule() {
        return uvr.m196087d().m162669G0();
    }

    /* JADX INFO: renamed from: j */
    public static void m69975j(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, Throwable th) {
        intlLiveSquareSuggestApiPlug.loadingNext = false;
        th.getClass();
        intlLiveSquareSuggestApiPlug.error(th);
    }

    /* JADX INFO: renamed from: k */
    public static z6o m69976k(Function2 function2, Object obj, Object obj2) {
        return (z6o) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public static C22306c m69977l(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive()) {
                z6o z6oVar = intlLiveSquareSuggestApiPlug.info;
                z6oVar.getClass();
                BLiveSuggestLive bLiveSuggestLiveM187664B = z6oVar.m187664B(bLiveSuggestLive.f44450id);
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
        return arrayList.isEmpty() ? C22306c.just(null) : intlLiveSquareSuggestApiPlug.replaceStoppedLives(arrayList, arrayList2, list);
    }

    private final C22306c<LiveSquareBannersBean> loadLiveBannersOb() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (!Intrinsics.m87488d(bLiveSquareTab != null ? bLiveSquareTab.name : null, "square-suggested")) {
            C22306c<LiveSquareBannersBean> c22306cJust = C22306c.just(null);
            c22306cJust.getClass();
            return c22306cJust;
        }
        if (!intlFeedRule()) {
            BLiveSquareTab bLiveSquareTab2 = this.liveSquareTab;
            C22306c<LiveSquareBannersBean> c22306cOnErrorReturn = IntlLiveSquareApi.getLiveBanners("live-independent-tab", bLiveSquareTab2 != null ? bLiveSquareTab2.bannerType : null, bLiveSquareTab2 != null ? bLiveSquareTab2.name : null).onErrorReturn(new w9j() { // from class: l.f6o
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlLiveSquareSuggestApiPlug.m69971f((Throwable) obj);
                }
            });
            c22306cOnErrorReturn.getClass();
            return c22306cOnErrorReturn;
        }
        fbn.Companion companion = fbn.INSTANCE;
        BLiveSquareTab bLiveSquareTab3 = this.liveSquareTab;
        C22306c<LiveSquareBannersBean> c22306cM120377q = companion.m120377q("live-independent-tab", bLiveSquareTab3 != null ? bLiveSquareTab3.bannerType : null, bLiveSquareTab3 != null ? bLiveSquareTab3.name : null);
        c22306cM120377q.getClass();
        C22306c<LiveSquareBannersBean> c22306cOnErrorReturn2 = c22306cM120377q.onErrorReturn(new w9j() { // from class: l.v6o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLiveSquareSuggestApiPlug.m69985t((Throwable) obj);
            }
        });
        c22306cOnErrorReturn2.getClass();
        return c22306cOnErrorReturn2;
    }

    /* JADX INFO: renamed from: m */
    public static C22306c m69978m(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static String m69979n(BLiveSuggestLive bLiveSuggestLive) {
        return bLiveSuggestLive.f44450id;
    }

    /* JADX INFO: renamed from: o */
    public static void m69980o(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, boolean z, z6o z6oVar) {
        z6o z6oVar2 = intlLiveSquareSuggestApiPlug.info;
        if (z6oVar2 != null) {
            z6oVar2.m187677x(z6oVar, z);
        }
        intlLiveSquareSuggestApiPlug.checkNullData(intlLiveSquareSuggestApiPlug.info);
        intlLiveSquareSuggestApiPlug.loadingNext = false;
        intlLiveSquareSuggestApiPlug.success("TYPE_LOAD_MORE");
    }

    /* JADX INFO: renamed from: p */
    public static C22306c m69981p(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug) {
        return intlLiveSquareSuggestApiPlug.taskQueue.m68617f("loadSuggestInfo", intlLiveSquareSuggestApiPlug.getZip(), 100);
    }

    /* JADX INFO: renamed from: q */
    public static void m69982q(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, z6o z6oVar) {
        intlLiveSquareSuggestApiPlug.info = z6oVar;
        intlLiveSquareSuggestApiPlug.checkNullData(z6oVar);
        intlLiveSquareSuggestApiPlug.success("TYPE_LOAD_ALL");
    }

    /* JADX INFO: renamed from: r */
    public static C22306c m69983r(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    private final C22306c<z6o> replaceStoppedLives(List<String> stoppedLiveIds, List<String> categories, final List<? extends BLiveSuggestLive> curLives) {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        bLiveSquareTab.getClass();
        C22306c<z6o> c22306cRefreshStoppedLivesV2 = IntlLiveSquareApi.refreshStoppedLivesV2(stoppedLiveIds, categories, bLiveSquareTab.name, intlFeedRule());
        final Function1 function1 = new Function1() { // from class: l.t6o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlLiveSquareSuggestApiPlug.m69987v(this.f168629a, curLives, (z6o) obj);
            }
        };
        C22306c c22306cFlatMap = c22306cRefreshStoppedLivesV2.flatMap(new w9j() { // from class: l.u6o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLiveSquareSuggestApiPlug.m69978m(function1, obj);
            }
        });
        c22306cFlatMap.getClass();
        return c22306cFlatMap;
    }

    /* JADX INFO: renamed from: s */
    public static void m69984s(final IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, final z6o z6oVar) {
        if (z6oVar != null) {
            intlLiveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
            C22306c<Long> c22306cTimer = C22306c.timer(intlLiveSquareSuggestApiPlug.mergeAndDropDelay, TimeUnit.MILLISECONDS);
            c22306cTimer.getClass();
            intlLiveSquareSuggestApiPlug.duringCreated(c22306cTimer).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.m6o
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlLiveSquareSuggestApiPlug.updateCurrentLiveInfo$lambda$3$0(this.f131710a, z6oVar, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t */
    public static LiveSquareBannersBean m69985t(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static z6o m69986u(z6o z6oVar, LiveSquareBannersBean liveSquareBannersBean) {
        z6oVar.getClass();
        if (liveSquareBannersBean != null) {
            if (!vwb.m200296J(liveSquareBannersBean.banners)) {
                vwb.m200354z(liveSquareBannersBean.banners, new e30() { // from class: l.s6o
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
        return z6oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCurrentLiveInfo$lambda$3$0(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, z6o z6oVar, Long l2) {
        z6o z6oVar2 = intlLiveSquareSuggestApiPlug.info;
        z6oVar2.getClass();
        z6oVar2.m187679z(z6oVar);
        intlLiveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
    }

    /* JADX INFO: renamed from: v */
    public static C22306c m69987v(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, List list, z6o z6oVar) {
        z6oVar.getClass();
        z6o z6oVar2 = intlLiveSquareSuggestApiPlug.info;
        if (z6oVar2 == null) {
            return C22306c.just(null);
        }
        int iM187670q = z6oVar.m187670q(z6oVar2.f169071a, z6oVar.f169071a);
        if (iM187670q == 0) {
            return C22306c.just(null);
        }
        z6o z6oVar3 = intlLiveSquareSuggestApiPlug.info;
        z6oVar3.getClass();
        z6oVar3.m187667E(list, iM187670q);
        return C22306c.just(z6oVar);
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.api.IntlBaseAsyncPlug
    public void getData() {
        loading();
        duringCreated(new v9j() { // from class: l.o6o
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return IntlLiveSquareSuggestApiPlug.m69981p(this.f142414a);
            }
        }, false).observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.p6o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveSquareSuggestApiPlug.m69982q(this.f147424a, (z6o) obj);
            }
        }, new e30() { // from class: l.q6o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveSquareSuggestApiPlug.m69972g(this.f152928a, (Throwable) obj);
            }
        }, new d30() { // from class: l.r6o
            @Override // p149l.d30
            public final void call() {
                IntlLiveSquareSuggestApiPlug.m69974i(this.f157969a);
            }
        }));
    }

    @Nullable
    public final z6o getInfo() {
        return this.info;
    }

    @Nullable
    public final BLiveSquareTab getLiveSquareTab() {
        return this.liveSquareTab;
    }

    public final void loadNextPage(final boolean disableFilterRepeat) {
        z6o z6oVar = this.info;
        if (z6oVar != null) {
            z6oVar.getClass();
            if (z6oVar.m187673t() && !this.loadingNext) {
                this.loadingNext = true;
                BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
                String str = bLiveSquareTab != null ? bLiveSquareTab.name : null;
                int i = this.limit;
                z6o z6oVar2 = this.info;
                Pagination paginationM187671r = z6oVar2 != null ? z6oVar2.m187671r() : null;
                paginationM187671r.getClass();
                C22306c<z6o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, str, "", i, paginationM187671r.links.next, false, getExtraQueryList(), intlFeedRule());
                liveListV2.getClass();
                duringCreated(liveListV2).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.k6o
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        IntlLiveSquareSuggestApiPlug.m69980o(this.f121494a, disableFilterRepeat, (z6o) obj);
                    }
                }, new e30() { // from class: l.l6o
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        IntlLiveSquareSuggestApiPlug.m69975j(this.f126651a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    public final void setInfo(@Nullable z6o z6oVar) {
        this.info = z6oVar;
    }

    public final void setLiveSquareTab(@Nullable BLiveSquareTab bLiveSquareTab) {
        this.liveSquareTab = bLiveSquareTab;
    }

    public final void updateCurrentLiveInfo() {
        z6o z6oVar = this.info;
        if (z6oVar != null) {
            z6oVar.getClass();
            if (vwb.m200296J(z6oVar.f169071a)) {
                return;
            }
            z6o z6oVar2 = this.info;
            z6oVar2.getClass();
            C22306c<List<BLiveSuggestLive>> c22306cQueryCurrentLivesInfo = IntlLiveSquareApi.queryCurrentLivesInfo(vwb.m200334k0(vwb.m200303Q(z6oVar2.f169071a, new w9j() { // from class: l.g6o
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlLiveSquareSuggestApiPlug.m69979n((BLiveSuggestLive) obj);
                }
            }), 100), intlFeedRule());
            c22306cQueryCurrentLivesInfo.getClass();
            C22306c c22306cDuringCreated = duringCreated(c22306cQueryCurrentLivesInfo);
            final Function1 function1 = new Function1() { // from class: l.h6o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlLiveSquareSuggestApiPlug.m69977l(this.f106105a, (List) obj);
                }
            };
            c22306cDuringCreated.flatMap(new w9j() { // from class: l.i6o
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlLiveSquareSuggestApiPlug.m69983r(function1, obj);
                }
            }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.j6o
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlLiveSquareSuggestApiPlug.m69984s(this.f116490a, (z6o) obj);
                }
            }));
        }
    }
}
