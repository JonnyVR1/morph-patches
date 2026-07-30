package com.p051p1.mobile.putong.live.external.intl.livesquare.api;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlLiveSquareSuggestApiPlug;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
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
import p137rx.C22421c;
import p153l.dhw;
import p153l.fdn;
import p153l.fo0;
import p153l.jyb;
import p153l.ner;
import p153l.pcj;
import p153l.qcj;
import p153l.rcj;
import p153l.vxr;
import p153l.x20;
import p153l.y20;
import p153l.y6u;
import p153l.z8o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\nR\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlLiveSquareSuggestApiPlug;", "Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlBaseAsyncPlug;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "Ll/z8o;", "liveSuggestInfo", "", "checkNullData", "(Ll/z8o;)V", "Lrx/c;", "getZip", "()Lrx/c;", "", "", "stoppedLiveIds", "categories", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "curLives", "replaceStoppedLives", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lrx/c;", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannersBean;", "loadLiveBannersOb", "", "intlFeedRule", "()Z", "getData", "()V", "disableFilterRepeat", "loadNextPage", "(Z)V", "updateCurrentLiveInfo", "loadingNext", "Z", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "liveSquareTab", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "getLiveSquareTab", "()Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "setLiveSquareTab", "(Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;)V", "", Constants.KEY_LIMIT, "I", BaseSei.INFO, "Ll/z8o;", "getInfo", "()Ll/z8o;", "setInfo", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "", "mergeAndDropDelay", "J", "getExtraQueryList", "()Ljava/lang/String;", "extraQueryList", "Companion", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlLiveSquareSuggestApiPlug extends IntlBaseAsyncPlug {

    @NotNull
    public static final String TYPE_LOAD_ALL = "TYPE_LOAD_ALL";

    @NotNull
    public static final String TYPE_LOAD_MORE = "TYPE_LOAD_MORE";

    @NotNull
    public static final String TYPE_LOAD_NORMAL = "TYPE_LOAD_NORMAL";

    @Nullable
    private z8o info;
    private final int limit;

    @Nullable
    private BLiveSquareTab liveSquareTab;
    private boolean loadingNext;
    private final long mergeAndDropDelay;

    @NotNull
    private final RxTaskQueue taskQueue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlLiveSquareSuggestApiPlug(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
        this.limit = y6u.f197714a;
        this.taskQueue = new RxTaskQueue("LiveSquareSuggest");
        this.mergeAndDropDelay = 3000L;
    }

    private final void checkNullData(z8o liveSuggestInfo) {
        if (liveSuggestInfo == null) {
            CrashHelper.m82479c(new NullPointerException("Null SuggestInfo"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static LiveSquareBannersBean m71154f(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m71155g(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, Throwable th) {
        th.getClass();
        intlLiveSquareSuggestApiPlug.error(th);
    }

    private final String getExtraQueryList() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (bLiveSquareTab != null) {
            return Intrinsics.m88377d(bLiveSquareTab.name, "square-multi-call") ? "liveTabSource=live-independent-multi-call" : "liveTabSource=live-independent-tab-suggested";
        }
        return null;
    }

    private final C22421c<z8o> getZip() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        C22421c<z8o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, bLiveSquareTab != null ? bLiveSquareTab.name : null, null, this.limit, null, false, getExtraQueryList(), intlFeedRule());
        C22421c<LiveSquareBannersBean> c22421cLoadLiveBannersOb = loadLiveBannersOb();
        final Function2 function2 = new Function2() { // from class: l.e8o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntlLiveSquareSuggestApiPlug.m71169u((z8o) obj, (LiveSquareBannersBean) obj2);
            }
        };
        C22421c<z8o> c22421cZip = C22421c.zip(liveListV2, c22421cLoadLiveBannersOb, new rcj() { // from class: l.n8o
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlLiveSquareSuggestApiPlug.m71159k(function2, obj, obj2);
            }
        });
        c22421cZip.getClass();
        return c22421cZip;
    }

    /* JADX INFO: renamed from: i */
    public static void m71157i(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug) {
        intlLiveSquareSuggestApiPlug.complete();
    }

    private final boolean intlFeedRule() {
        return vxr.m203876d().m170976G0();
    }

    /* JADX INFO: renamed from: j */
    public static void m71158j(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, Throwable th) {
        intlLiveSquareSuggestApiPlug.loadingNext = false;
        th.getClass();
        intlLiveSquareSuggestApiPlug.error(th);
    }

    /* JADX INFO: renamed from: k */
    public static z8o m71159k(Function2 function2, Object obj, Object obj2) {
        return (z8o) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public static C22421c m71160l(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive()) {
                z8o z8oVar = intlLiveSquareSuggestApiPlug.info;
                z8oVar.getClass();
                BLiveSuggestLive bLiveSuggestLiveM195318B = z8oVar.m195318B(bLiveSuggestLive.f45298id);
                if (bLiveSuggestLiveM195318B != null) {
                    String str = bLiveSuggestLiveM195318B.f45298id;
                    str.getClass();
                    arrayList.add(str);
                    String recommendCategory = bLiveSuggestLiveM195318B.getRecommendCategory();
                    recommendCategory.getClass();
                    arrayList2.add(recommendCategory);
                }
            }
            if (arrayList.size() >= 10) {
                break;
            }
        }
        return arrayList.isEmpty() ? C22421c.just(null) : intlLiveSquareSuggestApiPlug.replaceStoppedLives(arrayList, arrayList2, list);
    }

    private final C22421c<LiveSquareBannersBean> loadLiveBannersOb() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (!Intrinsics.m88377d(bLiveSquareTab != null ? bLiveSquareTab.name : null, "square-suggested")) {
            C22421c<LiveSquareBannersBean> c22421cJust = C22421c.just(null);
            c22421cJust.getClass();
            return c22421cJust;
        }
        if (!intlFeedRule()) {
            BLiveSquareTab bLiveSquareTab2 = this.liveSquareTab;
            C22421c<LiveSquareBannersBean> c22421cOnErrorReturn = IntlLiveSquareApi.getLiveBanners("live-independent-tab", bLiveSquareTab2 != null ? bLiveSquareTab2.bannerType : null, bLiveSquareTab2 != null ? bLiveSquareTab2.name : null).onErrorReturn(new qcj() { // from class: l.f8o
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlLiveSquareSuggestApiPlug.m71154f((Throwable) obj);
                }
            });
            c22421cOnErrorReturn.getClass();
            return c22421cOnErrorReturn;
        }
        fdn.Companion companion = fdn.INSTANCE;
        BLiveSquareTab bLiveSquareTab3 = this.liveSquareTab;
        C22421c<LiveSquareBannersBean> c22421cM125121q = companion.m125121q("live-independent-tab", bLiveSquareTab3 != null ? bLiveSquareTab3.bannerType : null, bLiveSquareTab3 != null ? bLiveSquareTab3.name : null);
        c22421cM125121q.getClass();
        C22421c<LiveSquareBannersBean> c22421cOnErrorReturn2 = c22421cM125121q.onErrorReturn(new qcj() { // from class: l.v8o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLiveSquareSuggestApiPlug.m71168t((Throwable) obj);
            }
        });
        c22421cOnErrorReturn2.getClass();
        return c22421cOnErrorReturn2;
    }

    /* JADX INFO: renamed from: m */
    public static C22421c m71161m(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static String m71162n(BLiveSuggestLive bLiveSuggestLive) {
        return bLiveSuggestLive.f45298id;
    }

    /* JADX INFO: renamed from: o */
    public static void m71163o(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, boolean z, z8o z8oVar) {
        z8o z8oVar2 = intlLiveSquareSuggestApiPlug.info;
        if (z8oVar2 != null) {
            z8oVar2.m195331x(z8oVar, z);
        }
        intlLiveSquareSuggestApiPlug.checkNullData(intlLiveSquareSuggestApiPlug.info);
        intlLiveSquareSuggestApiPlug.loadingNext = false;
        intlLiveSquareSuggestApiPlug.success("TYPE_LOAD_MORE");
    }

    /* JADX INFO: renamed from: p */
    public static C22421c m71164p(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug) {
        return intlLiveSquareSuggestApiPlug.taskQueue.m69800f("loadSuggestInfo", intlLiveSquareSuggestApiPlug.getZip(), 100);
    }

    /* JADX INFO: renamed from: q */
    public static void m71165q(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, z8o z8oVar) {
        intlLiveSquareSuggestApiPlug.info = z8oVar;
        intlLiveSquareSuggestApiPlug.checkNullData(z8oVar);
        intlLiveSquareSuggestApiPlug.success("TYPE_LOAD_ALL");
    }

    /* JADX INFO: renamed from: r */
    public static C22421c m71166r(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    private final C22421c<z8o> replaceStoppedLives(List<String> stoppedLiveIds, List<String> categories, final List<? extends BLiveSuggestLive> curLives) {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        bLiveSquareTab.getClass();
        C22421c<z8o> c22421cRefreshStoppedLivesV2 = IntlLiveSquareApi.refreshStoppedLivesV2(stoppedLiveIds, categories, bLiveSquareTab.name, intlFeedRule());
        final Function1 function1 = new Function1() { // from class: l.t8o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlLiveSquareSuggestApiPlug.m71170v(this.f172556a, curLives, (z8o) obj);
            }
        };
        C22421c c22421cFlatMap = c22421cRefreshStoppedLivesV2.flatMap(new qcj() { // from class: l.u8o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLiveSquareSuggestApiPlug.m71161m(function1, obj);
            }
        });
        c22421cFlatMap.getClass();
        return c22421cFlatMap;
    }

    /* JADX INFO: renamed from: s */
    public static void m71167s(final IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, final z8o z8oVar) {
        if (z8oVar != null) {
            intlLiveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
            C22421c<Long> c22421cTimer = C22421c.timer(intlLiveSquareSuggestApiPlug.mergeAndDropDelay, TimeUnit.MILLISECONDS);
            c22421cTimer.getClass();
            intlLiveSquareSuggestApiPlug.duringCreated(c22421cTimer).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.m8o
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlLiveSquareSuggestApiPlug.updateCurrentLiveInfo$lambda$3$0(this.f135266a, z8oVar, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t */
    public static LiveSquareBannersBean m71168t(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static z8o m71169u(z8o z8oVar, LiveSquareBannersBean liveSquareBannersBean) {
        z8oVar.getClass();
        if (liveSquareBannersBean != null) {
            if (!jyb.m147479J(liveSquareBannersBean.banners)) {
                jyb.m147537z(liveSquareBannersBean.banners, new y20() { // from class: l.s8o
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((LiveSquareBannerBean) obj).removeLiveGroupBanners();
                    }
                });
            }
            if (!jyb.m147479J(liveSquareBannersBean.banners)) {
                List<LiveSquareBannerBean> list = z8oVar.f203405c;
                List<LiveSquareBannerBean> list2 = liveSquareBannersBean.banners;
                list2.getClass();
                list.addAll(list2);
            }
        }
        return z8oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCurrentLiveInfo$lambda$3$0(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, z8o z8oVar, Long l2) {
        z8o z8oVar2 = intlLiveSquareSuggestApiPlug.info;
        z8oVar2.getClass();
        z8oVar2.m195333z(z8oVar);
        intlLiveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
    }

    /* JADX INFO: renamed from: v */
    public static C22421c m71170v(IntlLiveSquareSuggestApiPlug intlLiveSquareSuggestApiPlug, List list, z8o z8oVar) {
        z8oVar.getClass();
        z8o z8oVar2 = intlLiveSquareSuggestApiPlug.info;
        if (z8oVar2 == null) {
            return C22421c.just(null);
        }
        int iM195324q = z8oVar.m195324q(z8oVar2.f178357a, z8oVar.f178357a);
        if (iM195324q == 0) {
            return C22421c.just(null);
        }
        z8o z8oVar3 = intlLiveSquareSuggestApiPlug.info;
        z8oVar3.getClass();
        z8oVar3.m195321E(list, iM195324q);
        return C22421c.just(z8oVar);
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlBaseAsyncPlug
    public void getData() {
        loading();
        duringCreated(new pcj() { // from class: l.o8o
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return IntlLiveSquareSuggestApiPlug.m71164p(this.f145452a);
            }
        }, false).observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.p8o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveSquareSuggestApiPlug.m71165q(this.f151047a, (z8o) obj);
            }
        }, new y20() { // from class: l.q8o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveSquareSuggestApiPlug.m71155g(this.f156151a, (Throwable) obj);
            }
        }, new x20() { // from class: l.r8o
            @Override // p153l.x20
            public final void call() {
                IntlLiveSquareSuggestApiPlug.m71157i(this.f161742a);
            }
        }));
    }

    @Nullable
    public final z8o getInfo() {
        return this.info;
    }

    @Nullable
    public final BLiveSquareTab getLiveSquareTab() {
        return this.liveSquareTab;
    }

    public final void loadNextPage(final boolean disableFilterRepeat) {
        z8o z8oVar = this.info;
        if (z8oVar != null) {
            z8oVar.getClass();
            if (z8oVar.m195327t() && !this.loadingNext) {
                this.loadingNext = true;
                BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
                String str = bLiveSquareTab != null ? bLiveSquareTab.name : null;
                int i = this.limit;
                z8o z8oVar2 = this.info;
                Pagination paginationM195325r = z8oVar2 != null ? z8oVar2.m195325r() : null;
                paginationM195325r.getClass();
                C22421c<z8o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, str, "", i, paginationM195325r.links.next, false, getExtraQueryList(), intlFeedRule());
                liveListV2.getClass();
                duringCreated(liveListV2).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.k8o
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        IntlLiveSquareSuggestApiPlug.m71163o(this.f124402a, disableFilterRepeat, (z8o) obj);
                    }
                }, new y20() { // from class: l.l8o
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        IntlLiveSquareSuggestApiPlug.m71158j(this.f130504a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    public final void setInfo(@Nullable z8o z8oVar) {
        this.info = z8oVar;
    }

    public final void setLiveSquareTab(@Nullable BLiveSquareTab bLiveSquareTab) {
        this.liveSquareTab = bLiveSquareTab;
    }

    public final void updateCurrentLiveInfo() {
        z8o z8oVar = this.info;
        if (z8oVar != null) {
            z8oVar.getClass();
            if (jyb.m147479J(z8oVar.f178357a)) {
                return;
            }
            z8o z8oVar2 = this.info;
            z8oVar2.getClass();
            C22421c<List<BLiveSuggestLive>> c22421cQueryCurrentLivesInfo = IntlLiveSquareApi.queryCurrentLivesInfo(jyb.m147517k0(jyb.m147486Q(z8oVar2.f178357a, new qcj() { // from class: l.g8o
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlLiveSquareSuggestApiPlug.m71162n((BLiveSuggestLive) obj);
                }
            }), 100), intlFeedRule());
            c22421cQueryCurrentLivesInfo.getClass();
            C22421c c22421cDuringCreated = duringCreated(c22421cQueryCurrentLivesInfo);
            final Function1 function1 = new Function1() { // from class: l.h8o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlLiveSquareSuggestApiPlug.m71160l(this.f108257a, (List) obj);
                }
            };
            c22421cDuringCreated.flatMap(new qcj() { // from class: l.i8o
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlLiveSquareSuggestApiPlug.m71166r(function1, obj);
                }
            }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.j8o
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlLiveSquareSuggestApiPlug.m71167s(this.f118795a, (z8o) obj);
                }
            }));
        }
    }
}
