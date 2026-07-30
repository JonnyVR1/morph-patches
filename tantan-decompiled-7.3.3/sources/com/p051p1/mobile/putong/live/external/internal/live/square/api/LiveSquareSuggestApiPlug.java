package com.p051p1.mobile.putong.live.external.internal.live.square.api;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareSuggestApiPlug;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
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
import p137rx.C22421c;
import p153l.dhw;
import p153l.fo0;
import p153l.jyb;
import p153l.kcg0;
import p153l.ner;
import p153l.p5u;
import p153l.pcj;
import p153l.qcj;
import p153l.rcj;
import p153l.vxr;
import p153l.x20;
import p153l.y20;
import p153l.y6u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\u001cR\u0016\u0010(\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\nR\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveSquareSuggestApiPlug;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "Ll/p5u;", "liveSuggestInfo", "", "checkNullData", "(Ll/p5u;)V", "Lrx/c;", "getZip", "()Lrx/c;", "", "", "stoppedLiveIds", "categories", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "curLives", "replaceStoppedLives", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lrx/c;", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannersBean;", "loadLiveBannersOb", "", "intlFeedRule", "()Z", "getData", "()V", "", "retainSeconds", "Lkotlin/Function0;", "doOnSuccess", "Ll/kcg0;", "remainOfficialTime", "(JLkotlin/jvm/functions/Function0;)Ll/kcg0;", "disableFilterRepeat", "loadNextPage", "(Z)V", "updateCurrentLiveInfo", "loadingNext", "Z", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "liveSquareTab", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "getLiveSquareTab", "()Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "setLiveSquareTab", "(Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;)V", "", Constants.KEY_LIMIT, "I", BaseSei.INFO, "Ll/p5u;", "getInfo", "()Ll/p5u;", "setInfo", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "mergeAndDropDelay", "J", "getExtraQueryList", "()Ljava/lang/String;", "extraQueryList", "Companion", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class LiveSquareSuggestApiPlug extends BaseAsyncPlug {

    @NotNull
    public static final String TYPE_LOAD_ALL = "TYPE_LOAD_ALL";

    @NotNull
    public static final String TYPE_LOAD_MORE = "TYPE_LOAD_MORE";

    @NotNull
    public static final String TYPE_LOAD_NORMAL = "TYPE_LOAD_NORMAL";

    @Nullable
    private p5u info;
    private final int limit;

    @Nullable
    private BLiveSquareTab liveSquareTab;
    private boolean loadingNext;
    private final long mergeAndDropDelay;

    @NotNull
    private final RxTaskQueue taskQueue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSquareSuggestApiPlug(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
        this.limit = y6u.f197714a;
        this.taskQueue = new RxTaskQueue("LiveSquareSuggest");
        this.mergeAndDropDelay = 3000L;
    }

    private final void checkNullData(p5u liveSuggestInfo) {
        if (liveSuggestInfo == null) {
            CrashHelper.m82479c(new NullPointerException("Null SuggestInfo"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static C22421c m70185f(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static void m70186g(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, Function0 function0, p5u p5uVar) {
        liveSquareSuggestApiPlug.info = p5uVar;
        liveSquareSuggestApiPlug.checkNullData(p5uVar);
        liveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
        function0.invoke();
    }

    private final String getExtraQueryList() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (bLiveSquareTab != null) {
            return Intrinsics.m88377d(bLiveSquareTab.name, "square-multi-call") ? "liveTabSource=live-independent-multi-call" : "liveTabSource=live-independent-tab-suggested";
        }
        return null;
    }

    private final C22421c<p5u> getZip() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        C22421c<p5u> liveListV2 = LiveSquareApi.getLiveListV2(RelationshipStatus.suggested, bLiveSquareTab != null ? bLiveSquareTab.name : null, null, this.limit, null, false, getExtraQueryList(), intlFeedRule());
        C22421c<LiveSquareBannersBean> c22421cLoadLiveBannersOb = loadLiveBannersOb();
        final Function2 function2 = new Function2() { // from class: l.x4u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiveSquareSuggestApiPlug.m70198s((p5u) obj, (LiveSquareBannersBean) obj2);
            }
        };
        C22421c<p5u> c22421cZip = C22421c.zip(liveListV2, c22421cLoadLiveBannersOb, new rcj() { // from class: l.y4u
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return LiveSquareSuggestApiPlug.m70190k(function2, obj, obj2);
            }
        });
        c22421cZip.getClass();
        return c22421cZip;
    }

    /* JADX INFO: renamed from: h */
    public static void m70187h(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, Throwable th) {
        th.getClass();
        liveSquareSuggestApiPlug.error(th);
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m70188i(BLiveSuggestLive bLiveSuggestLive) {
        return Boolean.valueOf(!TextUtils.equals(bLiveSuggestLive.liveType, "videoChat"));
    }

    private final boolean intlFeedRule() {
        return vxr.m203876d().m170976G0();
    }

    /* JADX INFO: renamed from: j */
    public static C22421c m70189j(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, Long l2) {
        return liveSquareSuggestApiPlug.getZip();
    }

    /* JADX INFO: renamed from: k */
    public static p5u m70190k(Function2 function2, Object obj, Object obj2) {
        return (p5u) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public static void m70191l(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug) {
        liveSquareSuggestApiPlug.complete();
    }

    private final C22421c<LiveSquareBannersBean> loadLiveBannersOb() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (!Intrinsics.m88377d(bLiveSquareTab != null ? bLiveSquareTab.name : null, "square-suggested")) {
            BLiveSquareTab bLiveSquareTab2 = this.liveSquareTab;
            if (!Intrinsics.m88377d(bLiveSquareTab2 != null ? bLiveSquareTab2.name : null, "square-newcomer")) {
                C22421c<LiveSquareBannersBean> c22421cJust = C22421c.just(null);
                c22421cJust.getClass();
                return c22421cJust;
            }
        }
        BLiveSquareTab bLiveSquareTab3 = this.liveSquareTab;
        C22421c<LiveSquareBannersBean> c22421cOnErrorReturn = LiveSquareApi.getLiveBanners("live-independent-tab", bLiveSquareTab3 != null ? bLiveSquareTab3.bannerType : null, bLiveSquareTab3 != null ? bLiveSquareTab3.name : null).onErrorReturn(new qcj() { // from class: l.m5u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSquareSuggestApiPlug.m70200u((Throwable) obj);
            }
        });
        c22421cOnErrorReturn.getClass();
        return c22421cOnErrorReturn;
    }

    /* JADX INFO: renamed from: m */
    public static C22421c m70192m(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, List list, p5u p5uVar) {
        p5uVar.getClass();
        p5u p5uVar2 = liveSquareSuggestApiPlug.info;
        if (p5uVar2 == null) {
            return C22421c.just(null);
        }
        int iM195324q = p5uVar.m195324q(p5uVar2.f178357a, p5uVar.f178357a);
        if (iM195324q == 0) {
            return C22421c.just(null);
        }
        p5u p5uVar3 = liveSquareSuggestApiPlug.info;
        p5uVar3.getClass();
        p5uVar3.m195321E(list, iM195324q);
        return C22421c.just(p5uVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m70193n(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, Throwable th) {
        liveSquareSuggestApiPlug.loadingNext = false;
        th.getClass();
        liveSquareSuggestApiPlug.error(th);
    }

    /* JADX INFO: renamed from: o */
    public static String m70194o(BLiveSuggestLive bLiveSuggestLive) {
        return bLiveSuggestLive.f45298id;
    }

    /* JADX INFO: renamed from: p */
    public static C22421c m70195p(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive()) {
                p5u p5uVar = liveSquareSuggestApiPlug.info;
                p5uVar.getClass();
                BLiveSuggestLive bLiveSuggestLiveM195318B = p5uVar.m195318B(bLiveSuggestLive.f45298id);
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
        return arrayList.isEmpty() ? C22421c.just(null) : liveSquareSuggestApiPlug.replaceStoppedLives(arrayList, arrayList2, list);
    }

    /* JADX INFO: renamed from: q */
    public static C22421c m70196q(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static void m70197r(final LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, final p5u p5uVar) {
        if (p5uVar != null) {
            liveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
            C22421c<Long> c22421cTimer = C22421c.timer(liveSquareSuggestApiPlug.mergeAndDropDelay, TimeUnit.MILLISECONDS);
            c22421cTimer.getClass();
            liveSquareSuggestApiPlug.duringCreated(c22421cTimer).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.z4u
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveSquareSuggestApiPlug.updateCurrentLiveInfo$lambda$4$0(this.f202981a, p5uVar, (Long) obj);
                }
            }));
        }
    }

    private final C22421c<p5u> replaceStoppedLives(List<String> stoppedLiveIds, List<String> categories, final List<? extends BLiveSuggestLive> curLives) {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        bLiveSquareTab.getClass();
        C22421c<p5u> c22421cRefreshStoppedLivesV2 = LiveSquareApi.refreshStoppedLivesV2(stoppedLiveIds, categories, bLiveSquareTab.name, intlFeedRule());
        final Function1 function1 = new Function1() { // from class: l.n5u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveSquareSuggestApiPlug.m70192m(this.f140383a, curLives, (p5u) obj);
            }
        };
        C22421c c22421cFlatMap = c22421cRefreshStoppedLivesV2.flatMap(new qcj() { // from class: l.o5u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSquareSuggestApiPlug.m70185f(function1, obj);
            }
        });
        c22421cFlatMap.getClass();
        return c22421cFlatMap;
    }

    /* JADX INFO: renamed from: s */
    public static p5u m70198s(p5u p5uVar, LiveSquareBannersBean liveSquareBannersBean) {
        p5uVar.getClass();
        if (liveSquareBannersBean != null) {
            if (!jyb.m147479J(liveSquareBannersBean.banners)) {
                jyb.m147537z(liveSquareBannersBean.banners, new y20() { // from class: l.g5u
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((LiveSquareBannerBean) obj).removeLiveGroupBanners();
                    }
                });
            }
            if (!jyb.m147479J(liveSquareBannersBean.banners)) {
                List<LiveSquareBannerBean> list = p5uVar.f150693c;
                List<LiveSquareBannerBean> list2 = liveSquareBannersBean.banners;
                list2.getClass();
                list.addAll(list2);
            }
        }
        return p5uVar;
    }

    /* JADX INFO: renamed from: t */
    public static C22421c m70199t(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static LiveSquareBannersBean m70200u(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCurrentLiveInfo$lambda$4$0(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, p5u p5uVar, Long l2) {
        p5u p5uVar2 = liveSquareSuggestApiPlug.info;
        p5uVar2.getClass();
        p5uVar2.m195332y(p5uVar);
        liveSquareSuggestApiPlug.success("TYPE_LOAD_NORMAL");
    }

    /* JADX INFO: renamed from: v */
    public static void m70201v(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, boolean z, p5u p5uVar) {
        p5u p5uVar2 = liveSquareSuggestApiPlug.info;
        if (p5uVar2 != null) {
            p5uVar2.m195331x(p5uVar, z);
        }
        liveSquareSuggestApiPlug.checkNullData(liveSquareSuggestApiPlug.info);
        liveSquareSuggestApiPlug.loadingNext = false;
        liveSquareSuggestApiPlug.success("TYPE_LOAD_MORE");
    }

    /* JADX INFO: renamed from: w */
    public static C22421c m70202w(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug) {
        return liveSquareSuggestApiPlug.taskQueue.m69800f("loadSuggestInfo", liveSquareSuggestApiPlug.getZip(), 100);
    }

    /* JADX INFO: renamed from: x */
    public static void m70203x(LiveSquareSuggestApiPlug liveSquareSuggestApiPlug, p5u p5uVar) {
        liveSquareSuggestApiPlug.info = p5uVar;
        liveSquareSuggestApiPlug.checkNullData(p5uVar);
        liveSquareSuggestApiPlug.success("TYPE_LOAD_ALL");
    }

    @Override // com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
        loading();
        duringCreated(new pcj() { // from class: l.u4u
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return LiveSquareSuggestApiPlug.m70202w(this.f177504a);
            }
        }, false).observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.f5u
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareSuggestApiPlug.m70203x(this.f97339a, (p5u) obj);
            }
        }, new y20() { // from class: l.h5u
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareSuggestApiPlug.m70187h(this.f107974a, (Throwable) obj);
            }
        }, new x20() { // from class: l.i5u
            @Override // p153l.x20
            public final void call() {
                LiveSquareSuggestApiPlug.m70191l(this.f113098a);
            }
        }));
    }

    @Nullable
    public final p5u getInfo() {
        return this.info;
    }

    @Nullable
    public final BLiveSquareTab getLiveSquareTab() {
        return this.liveSquareTab;
    }

    public final void loadNextPage(final boolean disableFilterRepeat) {
        p5u p5uVar = this.info;
        if (p5uVar != null) {
            p5uVar.getClass();
            if (p5uVar.m195327t() && !this.loadingNext) {
                this.loadingNext = true;
                BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
                String str = bLiveSquareTab != null ? bLiveSquareTab.name : null;
                int i = this.limit;
                p5u p5uVar2 = this.info;
                Pagination paginationM195325r = p5uVar2 != null ? p5uVar2.m195325r() : null;
                paginationM195325r.getClass();
                C22421c<p5u> liveListV2 = LiveSquareApi.getLiveListV2(RelationshipStatus.suggested, str, "", i, paginationM195325r.links.next, false, getExtraQueryList(), intlFeedRule());
                liveListV2.getClass();
                duringCreated(liveListV2).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.v4u
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        LiveSquareSuggestApiPlug.m70201v(this.f182426a, disableFilterRepeat, (p5u) obj);
                    }
                }, new y20() { // from class: l.w4u
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        LiveSquareSuggestApiPlug.m70193n(this.f187437a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    @NotNull
    public final kcg0 remainOfficialTime(long retainSeconds, @NotNull final Function0<Unit> doOnSuccess) {
        doOnSuccess.getClass();
        C22421c<Long> c22421cTimer = C22421c.timer(retainSeconds, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: l.j5u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveSquareSuggestApiPlug.m70189j(this.f118500a, (Long) obj);
            }
        };
        Object objFlatMap = c22421cTimer.flatMap(new qcj() { // from class: l.k5u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSquareSuggestApiPlug.m70199t(function1, obj);
            }
        });
        objFlatMap.getClass();
        kcg0 kcg0VarSubscribe = duringCreated((C22421c) objFlatMap).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.l5u
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareSuggestApiPlug.m70186g(this.f130166a, doOnSuccess, (p5u) obj);
            }
        }));
        kcg0VarSubscribe.getClass();
        return kcg0VarSubscribe;
    }

    public final void setInfo(@Nullable p5u p5uVar) {
        this.info = p5uVar;
    }

    public final void setLiveSquareTab(@Nullable BLiveSquareTab bLiveSquareTab) {
        this.liveSquareTab = bLiveSquareTab;
    }

    public final void updateCurrentLiveInfo() {
        p5u p5uVar = this.info;
        if (p5uVar != null) {
            p5uVar.getClass();
            if (jyb.m147479J(p5uVar.f178357a)) {
                return;
            }
            p5u p5uVar2 = this.info;
            p5uVar2.getClass();
            C22421c<List<BLiveSuggestLive>> c22421cQueryCurrentLivesInfo = LiveSquareApi.queryCurrentLivesInfo(jyb.m147517k0(jyb.m147486Q(jyb.m147522n(p5uVar2.f178357a, new qcj() { // from class: l.a5u
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveSquareSuggestApiPlug.m70188i((BLiveSuggestLive) obj);
                }
            }), new qcj() { // from class: l.b5u
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveSquareSuggestApiPlug.m70194o((BLiveSuggestLive) obj);
                }
            }), 100), intlFeedRule());
            c22421cQueryCurrentLivesInfo.getClass();
            C22421c c22421cDuringCreated = duringCreated(c22421cQueryCurrentLivesInfo);
            final Function1 function1 = new Function1() { // from class: l.c5u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveSquareSuggestApiPlug.m70195p(this.f79900a, (List) obj);
                }
            };
            c22421cDuringCreated.flatMap(new qcj() { // from class: l.d5u
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveSquareSuggestApiPlug.m70196q(function1, obj);
                }
            }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.e5u
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveSquareSuggestApiPlug.m70197r(this.f92238a, (p5u) obj);
                }
            }));
        }
    }
}
