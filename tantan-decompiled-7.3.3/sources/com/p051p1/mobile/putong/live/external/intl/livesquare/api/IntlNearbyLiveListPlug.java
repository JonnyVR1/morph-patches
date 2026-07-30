package com.p051p1.mobile.putong.live.external.intl.livesquare.api;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlNearbyLiveListPlug;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.dhw;
import p153l.fdn;
import p153l.fo0;
import p153l.mqr;
import p153l.ner;
import p153l.x20;
import p153l.y20;
import p153l.y6u;
import p153l.z8o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0010¨\u0006,"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlNearbyLiveListPlug;", "Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlBaseAsyncPlug;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "Lrx/c;", "Ll/z8o;", "loadLiveListObs", "()Lrx/c;", "", "getData", "()V", "loadMore", "", "sourceTabName", "Ljava/lang/String;", "liveInfo", "Ll/z8o;", "getLiveInfo", "()Ll/z8o;", "setLiveInfo", "(Ll/z8o;)V", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue$delegate", "Lkotlin/Lazy;", "getTaskQueue", "()Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue", "", Constants.KEY_LIMIT, "I", "getLimit", "()I", "setLimit", "(I)V", "Lcom/p1/mobile/putong/data/Pagination;", Pagination.TYPE, "Lcom/p1/mobile/putong/data/Pagination;", "getPagination", "()Lcom/p1/mobile/putong/data/Pagination;", "setPagination", "(Lcom/p1/mobile/putong/data/Pagination;)V", "extraQueryList", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlNearbyLiveListPlug extends IntlBaseAsyncPlug {

    @Nullable
    private final String extraQueryList;
    private int limit;

    @Nullable
    private z8o liveInfo;

    @Nullable
    private Pagination pagination;

    @NotNull
    private final String sourceTabName;

    /* JADX INFO: renamed from: taskQueue$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy taskQueue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlNearbyLiveListPlug(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
        this.sourceTabName = "square-nearby";
        this.taskQueue = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.uno
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntlNearbyLiveListPlug.m71174h();
            }
        });
        this.limit = y6u.f197714a;
        this.extraQueryList = mqr.m159592l() ? "liveTabSource=live-independent-tab-nearby" : null;
    }

    /* JADX INFO: renamed from: f */
    public static void m71172f(IntlNearbyLiveListPlug intlNearbyLiveListPlug) {
        intlNearbyLiveListPlug.complete();
    }

    /* JADX INFO: renamed from: g */
    public static void m71173g(IntlNearbyLiveListPlug intlNearbyLiveListPlug, Throwable th) {
        th.getClass();
        intlNearbyLiveListPlug.error(th);
    }

    private final RxTaskQueue getTaskQueue() {
        return (RxTaskQueue) this.taskQueue.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static RxTaskQueue m71174h() {
        return new RxTaskQueue("LiveSquareNearBy");
    }

    /* JADX INFO: renamed from: i */
    public static void m71175i(IntlNearbyLiveListPlug intlNearbyLiveListPlug, Throwable th) {
        th.getClass();
        intlNearbyLiveListPlug.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static void m71176j(IntlNearbyLiveListPlug intlNearbyLiveListPlug, z8o z8oVar) {
        intlNearbyLiveListPlug.pagination = z8oVar.m195325r();
        z8o z8oVar2 = intlNearbyLiveListPlug.liveInfo;
        if (z8oVar2 == null) {
            intlNearbyLiveListPlug.liveInfo = z8oVar;
        } else {
            z8oVar2.m195330w(z8oVar);
        }
        intlNearbyLiveListPlug.success();
    }

    /* JADX INFO: renamed from: k */
    public static void m71177k(IntlNearbyLiveListPlug intlNearbyLiveListPlug, z8o z8oVar) {
        intlNearbyLiveListPlug.pagination = z8oVar.m195325r();
        intlNearbyLiveListPlug.liveInfo = z8oVar;
        intlNearbyLiveListPlug.success();
    }

    /* JADX INFO: renamed from: l */
    public static void m71178l(IntlNearbyLiveListPlug intlNearbyLiveListPlug) {
        intlNearbyLiveListPlug.complete();
    }

    private final C22421c<z8o> loadLiveListObs() {
        C22421c<z8o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, this.sourceTabName, null, this.limit, null, false, this.extraQueryList, fdn.INSTANCE.m125126v());
        liveListV2.getClass();
        return liveListV2;
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlBaseAsyncPlug
    public void getData() {
        C22421c c22421cM69800f = getTaskQueue().m69800f("loadingLiveList", loadLiveListObs(), 100);
        c22421cM69800f.getClass();
        duringCreated(c22421cM69800f).observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.rno
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlNearbyLiveListPlug.m71177k(this.f164090a, (z8o) obj);
            }
        }, new y20() { // from class: l.sno
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlNearbyLiveListPlug.m71175i(this.f169747a, (Throwable) obj);
            }
        }, new x20() { // from class: l.tno
            @Override // p153l.x20
            public final void call() {
                IntlNearbyLiveListPlug.m71178l(this.f175299a);
            }
        }));
    }

    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    public final z8o getLiveInfo() {
        return this.liveInfo;
    }

    @Nullable
    public final Pagination getPagination() {
        return this.pagination;
    }

    public final void loadMore() {
        Pagination pagination = this.pagination;
        if (pagination != null) {
            pagination.getClass();
            if (TextUtils.isEmpty(pagination.links.next)) {
                return;
            }
            C22421c c22421cM69799e = getTaskQueue().m69799e("loadNextLives", IntlLiveNormalApi.getNextLiveListV2(RelationshipStatus.suggested, this.sourceTabName, "", y6u.f197714a, this.pagination, this.extraQueryList, fdn.INSTANCE.m125126v()));
            c22421cM69799e.getClass();
            duringCreated(c22421cM69799e).observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.vno
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlNearbyLiveListPlug.m71176j(this.f184903a, (z8o) obj);
                }
            }, new y20() { // from class: l.wno
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlNearbyLiveListPlug.m71173g(this.f189969a, (Throwable) obj);
                }
            }, new x20() { // from class: l.xno
                @Override // p153l.x20
                public final void call() {
                    IntlNearbyLiveListPlug.m71172f(this.f195460a);
                }
            }));
        }
    }

    public final void setLimit(int i) {
        this.limit = i;
    }

    public final void setLiveInfo(@Nullable z8o z8oVar) {
        this.liveInfo = z8oVar;
    }

    public final void setPagination(@Nullable Pagination pagination) {
        this.pagination = pagination;
    }
}
