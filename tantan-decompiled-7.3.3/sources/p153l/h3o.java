package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 E2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00109\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\nR\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, m88121d2 = {"Ll/h3o;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Lcom/p1/mobile/android/app/Act;", "lifecycleProvider", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Ll/p5u;", "liveSuggestInfo", "", "checkNullData", "(Ll/p5u;)V", "Lrx/c;", "getZip", "()Lrx/c;", "", "", "stoppedLiveIds", "categories", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "curLives", "replaceStoppedLives", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lrx/c;", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannersBean;", "loadLiveBannersOb", "", "intlFeedRule", "()Z", "getData", "()V", "disableFilterRepeat", "loadNextPage", "(Z)V", "updateCurrentLiveInfo", "a", "Lcom/p1/mobile/android/app/Act;", "getLifecycleProvider", "()Lcom/p1/mobile/android/app/Act;", "b", "Z", "loadingNext", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "c", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "getLiveSquareTab", "()Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "setLiveSquareTab", "(Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;)V", "liveSquareTab", "", Constants.INAPP_DATA_TAG, "I", Constants.KEY_LIMIT, "e", "Ll/p5u;", "getInfo", "()Ll/p5u;", "setInfo", BaseSei.INFO, "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "f", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue", "", "g", "J", "mergeAndDropDelay", "getExtraQueryList", "()Ljava/lang/String;", "extraQueryList", "Companion", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class h3o extends BaseAsyncPlug {

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
    public p5u info;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final RxTaskQueue taskQueue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final long mergeAndDropDelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3o(@NotNull Act act) {
        super(act);
        act.getClass();
        this.lifecycleProvider = act;
        this.limit = y6u.f197714a;
        this.taskQueue = new RxTaskQueue("LiveSquareSuggest");
        this.mergeAndDropDelay = 3000L;
    }

    /* JADX INFO: renamed from: A */
    public static void m133491A(h3o h3oVar, Throwable th) {
        h3oVar.loadingNext = false;
        th.getClass();
        h3oVar.error(th);
    }

    /* JADX INFO: renamed from: B */
    public static final void m133492B(h3o h3oVar, p5u p5uVar, Long l2) {
        p5u p5uVar2 = h3oVar.info;
        p5uVar2.getClass();
        p5uVar2.m195333z(p5uVar);
        h3oVar.success("TYPE_LOAD_NORMAL");
    }

    /* JADX INFO: renamed from: f */
    public static void m133493f(h3o h3oVar, Throwable th) {
        th.getClass();
        h3oVar.error(th);
    }

    /* JADX INFO: renamed from: g */
    public static p5u m133494g(Function2 function2, Object obj, Object obj2) {
        return (p5u) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: h */
    public static C22421c m133495h(h3o h3oVar, List list, p5u p5uVar) {
        p5uVar.getClass();
        p5u p5uVar2 = h3oVar.info;
        if (p5uVar2 == null) {
            return C22421c.just(null);
        }
        int iM195324q = p5uVar.m195324q(p5uVar2.f178357a, p5uVar.f178357a);
        if (iM195324q == 0) {
            return C22421c.just(null);
        }
        p5u p5uVar3 = h3oVar.info;
        p5uVar3.getClass();
        p5uVar3.m195321E(list, iM195324q);
        return C22421c.just(p5uVar);
    }

    /* JADX INFO: renamed from: i */
    public static void m133496i(final h3o h3oVar, final p5u p5uVar) {
        if (p5uVar != null) {
            h3oVar.success("TYPE_LOAD_NORMAL");
            C22421c<Long> c22421cTimer = C22421c.timer(h3oVar.mergeAndDropDelay, TimeUnit.MILLISECONDS);
            c22421cTimer.getClass();
            h3oVar.duringCreated(c22421cTimer).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.o2o
                @Override // p153l.y20
                public final void call(Object obj) {
                    h3o.m133492B(this.f144757a, p5uVar, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j */
    public static LiveSquareBannersBean m133497j(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static C22421c m133498k(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static void m133499l(h3o h3oVar, p5u p5uVar) {
        h3oVar.info = p5uVar;
        h3oVar.checkNullData(p5uVar);
        h3oVar.success("TYPE_LOAD_ALL");
    }

    /* JADX INFO: renamed from: m */
    public static C22421c m133500m(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static p5u m133501n(Function1 function1, Object obj) {
        return (p5u) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static C22421c m133502o(h3o h3oVar) {
        return h3oVar.taskQueue.m69800f("loadSuggestInfo", h3oVar.getZip(), 100);
    }

    /* JADX INFO: renamed from: p */
    public static C22421c m133503p(h3o h3oVar, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive()) {
                p5u p5uVar = h3oVar.info;
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
        return arrayList.isEmpty() ? C22421c.just(null) : h3oVar.replaceStoppedLives(arrayList, arrayList2, list);
    }

    /* JADX INFO: renamed from: q */
    public static p5u m133504q(z8o z8oVar) {
        return new p5u(z8oVar.f178357a, z8oVar.m195325r());
    }

    /* JADX INFO: renamed from: s */
    public static void m133506s(h3o h3oVar) {
        h3oVar.complete();
    }

    /* JADX INFO: renamed from: t */
    public static LiveSquareBannersBean m133507t(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static p5u m133508u(z8o z8oVar, LiveSquareBannersBean liveSquareBannersBean) {
        z8oVar.getClass();
        if (liveSquareBannersBean != null) {
            if (!jyb.m147479J(liveSquareBannersBean.banners)) {
                jyb.m147537z(liveSquareBannersBean.banners, new y20() { // from class: l.y2o
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
        p5u p5uVar = new p5u(z8oVar.f178357a, z8oVar.m195325r());
        p5uVar.f150693c = z8oVar.f203405c;
        return p5uVar;
    }

    /* JADX INFO: renamed from: v */
    public static p5u m133509v(Function1 function1, Object obj) {
        return (p5u) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static void m133511x(h3o h3oVar, boolean z, p5u p5uVar) {
        p5u p5uVar2 = h3oVar.info;
        if (p5uVar2 != null) {
            p5uVar2.m195331x(p5uVar, z);
        }
        h3oVar.checkNullData(h3oVar.info);
        h3oVar.loadingNext = false;
        h3oVar.success("TYPE_LOAD_MORE");
    }

    /* JADX INFO: renamed from: y */
    public static String m133512y(BLiveSuggestLive bLiveSuggestLive) {
        return bLiveSuggestLive.f45298id;
    }

    /* JADX INFO: renamed from: z */
    public static p5u m133513z(z8o z8oVar) {
        return new p5u(z8oVar != null ? z8oVar.f178357a : null, z8oVar != null ? z8oVar.m195325r() : null);
    }

    public final void checkNullData(p5u liveSuggestInfo) {
        if (liveSuggestInfo == null) {
            CrashHelper.m82479c(new NullPointerException("Null SuggestInfo"));
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
        loading();
        duringCreated(new pcj() { // from class: l.l2o
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return h3o.m133502o(this.f129788a);
            }
        }, false).observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.w2o
            @Override // p153l.y20
            public final void call(Object obj) {
                h3o.m133499l(this.f186919a, (p5u) obj);
            }
        }, new y20() { // from class: l.z2o
            @Override // p153l.y20
            public final void call(Object obj) {
                h3o.m133493f(this.f202724a, (Throwable) obj);
            }
        }, new x20() { // from class: l.a3o
            @Override // p153l.x20
            public final void call() {
                h3o.m133506s(this.f68301a);
            }
        }));
    }

    public final String getExtraQueryList() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (bLiveSquareTab != null) {
            return Intrinsics.m88377d(bLiveSquareTab.name, "square-multi-call") ? "liveTabSource=live-independent-multi-call" : "liveTabSource=live-independent-tab-suggested";
        }
        return null;
    }

    @Nullable
    public final p5u getInfo() {
        return this.info;
    }

    public final C22421c<p5u> getZip() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        C22421c<z8o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, bLiveSquareTab != null ? bLiveSquareTab.name : null, null, this.limit, null, false, getExtraQueryList(), intlFeedRule());
        C22421c<LiveSquareBannersBean> c22421cLoadLiveBannersOb = loadLiveBannersOb();
        final Function2 function2 = new Function2() { // from class: l.t2o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return h3o.m133508u((z8o) obj, (LiveSquareBannersBean) obj2);
            }
        };
        C22421c<p5u> c22421cZip = C22421c.zip(liveListV2, c22421cLoadLiveBannersOb, new rcj() { // from class: l.u2o
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return h3o.m133494g(function2, obj, obj2);
            }
        });
        c22421cZip.getClass();
        return c22421cZip;
    }

    public final boolean intlFeedRule() {
        return vxr.m203876d().m170976G0();
    }

    public final C22421c<LiveSquareBannersBean> loadLiveBannersOb() {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        if (!Intrinsics.m88377d(bLiveSquareTab != null ? bLiveSquareTab.name : null, "square-suggested")) {
            C22421c<LiveSquareBannersBean> c22421cJust = C22421c.just(null);
            c22421cJust.getClass();
            return c22421cJust;
        }
        if (!intlFeedRule()) {
            BLiveSquareTab bLiveSquareTab2 = this.liveSquareTab;
            C22421c<LiveSquareBannersBean> c22421cOnErrorReturn = IntlLiveSquareApi.getLiveBanners("live-independent-tab", bLiveSquareTab2 != null ? bLiveSquareTab2.bannerType : null, bLiveSquareTab2 != null ? bLiveSquareTab2.name : null).onErrorReturn(new qcj() { // from class: l.x2o
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return h3o.m133507t((Throwable) obj);
                }
            });
            c22421cOnErrorReturn.getClass();
            return c22421cOnErrorReturn;
        }
        fdn.Companion companion = fdn.INSTANCE;
        BLiveSquareTab bLiveSquareTab3 = this.liveSquareTab;
        C22421c<LiveSquareBannersBean> c22421cM125121q = companion.m125121q("live-independent-tab", bLiveSquareTab3 != null ? bLiveSquareTab3.bannerType : null, bLiveSquareTab3 != null ? bLiveSquareTab3.name : null);
        c22421cM125121q.getClass();
        C22421c<LiveSquareBannersBean> c22421cOnErrorReturn2 = c22421cM125121q.onErrorReturn(new qcj() { // from class: l.v2o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return h3o.m133497j((Throwable) obj);
            }
        });
        c22421cOnErrorReturn2.getClass();
        return c22421cOnErrorReturn2;
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
                C22421c<z8o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, str, "", i, paginationM195325r.links.next, false, getExtraQueryList(), intlFeedRule());
                liveListV2.getClass();
                C22421c c22421cDuringCreated = duringCreated(liveListV2);
                final Function1 function1 = new Function1() { // from class: l.f3o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return h3o.m133504q((z8o) obj);
                    }
                };
                c22421cDuringCreated.map(new qcj() { // from class: l.g3o
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return h3o.m133509v(function1, obj);
                    }
                }).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.m2o
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        h3o.m133511x(this.f134591a, disableFilterRepeat, (p5u) obj);
                    }
                }, new y20() { // from class: l.n2o
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        h3o.m133491A(this.f139878a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    public final C22421c<p5u> replaceStoppedLives(List<String> stoppedLiveIds, List<String> categories, final List<? extends BLiveSuggestLive> curLives) {
        BLiveSquareTab bLiveSquareTab = this.liveSquareTab;
        bLiveSquareTab.getClass();
        C22421c<z8o> c22421cRefreshStoppedLivesV2 = IntlLiveSquareApi.refreshStoppedLivesV2(stoppedLiveIds, categories, bLiveSquareTab.name, intlFeedRule());
        final Function1 function1 = new Function1() { // from class: l.p2o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h3o.m133513z((z8o) obj);
            }
        };
        C22421c<R> map = c22421cRefreshStoppedLivesV2.map(new qcj() { // from class: l.q2o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return h3o.m133501n(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.r2o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h3o.m133495h(this.f160953a, curLives, (p5u) obj);
            }
        };
        C22421c<p5u> c22421cFlatMap = map.flatMap(new qcj() { // from class: l.s2o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return h3o.m133500m(function2, obj);
            }
        });
        c22421cFlatMap.getClass();
        return c22421cFlatMap;
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
            C22421c<List<BLiveSuggestLive>> c22421cQueryCurrentLivesInfo = IntlLiveSquareApi.queryCurrentLivesInfo(jyb.m147517k0(jyb.m147486Q(p5uVar2.f178357a, new qcj() { // from class: l.b3o
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return h3o.m133512y((BLiveSuggestLive) obj);
                }
            }), 100), intlFeedRule());
            c22421cQueryCurrentLivesInfo.getClass();
            C22421c c22421cDuringCreated = duringCreated(c22421cQueryCurrentLivesInfo);
            final Function1 function1 = new Function1() { // from class: l.c3o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h3o.m133503p(this.f79634a, (List) obj);
                }
            };
            c22421cDuringCreated.flatMap(new qcj() { // from class: l.d3o
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return h3o.m133498k(function1, obj);
                }
            }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.e3o
                @Override // p153l.y20
                public final void call(Object obj) {
                    h3o.m133496i(this.f91983a, (p5u) obj);
                }
            }));
        }
    }
}
