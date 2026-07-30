package com.p046p1.mobile.putong.live.external.intl.livesquare.api;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p046p1.mobile.putong.live.external.intl.livesquare.api.IntlNearbyLiveListPlug;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.d30;
import p149l.e30;
import p149l.fbn;
import p149l.ffw;
import p149l.jo0;
import p149l.lor;
import p149l.mcr;
import p149l.x4u;
import p149l.z6o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0010¨\u0006,"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlNearbyLiveListPlug;", "Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlBaseAsyncPlug;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "Lrx/c;", "Ll/z6o;", "loadLiveListObs", "()Lrx/c;", "", "getData", "()V", "loadMore", "", "sourceTabName", "Ljava/lang/String;", "liveInfo", "Ll/z6o;", "getLiveInfo", "()Ll/z6o;", "setLiveInfo", "(Ll/z6o;)V", "Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue$delegate", "Lkotlin/Lazy;", "getTaskQueue", "()Lcom/p1/mobile/putong/live/base/util/RxTaskQueue;", "taskQueue", "", Constants.KEY_LIMIT, "I", "getLimit", "()I", "setLimit", "(I)V", "Lcom/p1/mobile/putong/data/Pagination;", Pagination.TYPE, "Lcom/p1/mobile/putong/data/Pagination;", "getPagination", "()Lcom/p1/mobile/putong/data/Pagination;", "setPagination", "(Lcom/p1/mobile/putong/data/Pagination;)V", "extraQueryList", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class IntlNearbyLiveListPlug extends IntlBaseAsyncPlug {

    @Nullable
    private final String extraQueryList;
    private int limit;

    @Nullable
    private z6o liveInfo;

    @Nullable
    private Pagination pagination;

    @NotNull
    private final String sourceTabName;

    /* JADX INFO: renamed from: taskQueue$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy taskQueue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlNearbyLiveListPlug(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
        this.sourceTabName = "square-nearby";
        this.taskQueue = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ulo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntlNearbyLiveListPlug.m69991h();
            }
        });
        this.limit = x4u.f191061a;
        this.extraQueryList = lor.m150807l() ? "liveTabSource=live-independent-tab-nearby" : null;
    }

    /* JADX INFO: renamed from: f */
    public static void m69989f(IntlNearbyLiveListPlug intlNearbyLiveListPlug) {
        intlNearbyLiveListPlug.complete();
    }

    /* JADX INFO: renamed from: g */
    public static void m69990g(IntlNearbyLiveListPlug intlNearbyLiveListPlug, Throwable th) {
        th.getClass();
        intlNearbyLiveListPlug.error(th);
    }

    private final RxTaskQueue getTaskQueue() {
        return (RxTaskQueue) this.taskQueue.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static RxTaskQueue m69991h() {
        return new RxTaskQueue("LiveSquareNearBy");
    }

    /* JADX INFO: renamed from: i */
    public static void m69992i(IntlNearbyLiveListPlug intlNearbyLiveListPlug, Throwable th) {
        th.getClass();
        intlNearbyLiveListPlug.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static void m69993j(IntlNearbyLiveListPlug intlNearbyLiveListPlug, z6o z6oVar) {
        intlNearbyLiveListPlug.pagination = z6oVar.m187671r();
        z6o z6oVar2 = intlNearbyLiveListPlug.liveInfo;
        if (z6oVar2 == null) {
            intlNearbyLiveListPlug.liveInfo = z6oVar;
        } else {
            z6oVar2.m187676w(z6oVar);
        }
        intlNearbyLiveListPlug.success();
    }

    /* JADX INFO: renamed from: k */
    public static void m69994k(IntlNearbyLiveListPlug intlNearbyLiveListPlug, z6o z6oVar) {
        intlNearbyLiveListPlug.pagination = z6oVar.m187671r();
        intlNearbyLiveListPlug.liveInfo = z6oVar;
        intlNearbyLiveListPlug.success();
    }

    /* JADX INFO: renamed from: l */
    public static void m69995l(IntlNearbyLiveListPlug intlNearbyLiveListPlug) {
        intlNearbyLiveListPlug.complete();
    }

    private final C22306c<z6o> loadLiveListObs() {
        C22306c<z6o> liveListV2 = IntlLiveNormalApi.getLiveListV2(RelationshipStatus.suggested, this.sourceTabName, null, this.limit, null, false, this.extraQueryList, fbn.INSTANCE.m120382v());
        liveListV2.getClass();
        return liveListV2;
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.api.IntlBaseAsyncPlug
    public void getData() {
        C22306c c22306cM68617f = getTaskQueue().m68617f("loadingLiveList", loadLiveListObs(), 100);
        c22306cM68617f.getClass();
        duringCreated(c22306cM68617f).observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.rlo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlNearbyLiveListPlug.m69994k(this.f159981a, (z6o) obj);
            }
        }, new e30() { // from class: l.slo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlNearbyLiveListPlug.m69992i(this.f165253a, (Throwable) obj);
            }
        }, new d30() { // from class: l.tlo
            @Override // p149l.d30
            public final void call() {
                IntlNearbyLiveListPlug.m69995l(this.f171037a);
            }
        }));
    }

    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    public final z6o getLiveInfo() {
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
            C22306c c22306cM68616e = getTaskQueue().m68616e("loadNextLives", IntlLiveNormalApi.getNextLiveListV2(RelationshipStatus.suggested, this.sourceTabName, "", x4u.f191061a, this.pagination, this.extraQueryList, fbn.INSTANCE.m120382v()));
            c22306cM68616e.getClass();
            duringCreated(c22306cM68616e).observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.vlo
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlNearbyLiveListPlug.m69993j(this.f181971a, (z6o) obj);
                }
            }, new e30() { // from class: l.wlo
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlNearbyLiveListPlug.m69990g(this.f186964a, (Throwable) obj);
                }
            }, new d30() { // from class: l.xlo
                @Override // p149l.d30
                public final void call() {
                    IntlNearbyLiveListPlug.m69989f(this.f193475a);
                }
            }));
        }
    }

    public final void setLimit(int i) {
        this.limit = i;
    }

    public final void setLiveInfo(@Nullable z6o z6oVar) {
        this.liveInfo = z6oVar;
    }

    public final void setPagination(@Nullable Pagination pagination) {
        this.pagination = pagination;
    }
}
