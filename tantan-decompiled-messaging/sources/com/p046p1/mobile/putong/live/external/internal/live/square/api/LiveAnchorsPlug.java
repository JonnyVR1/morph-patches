package com.p046p1.mobile.putong.live.external.internal.live.square.api;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveAnchorsPlug;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.cll;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.jo0;
import p149l.mcr;
import p149l.vwb;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R'\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "getData", "()V", "", FirebaseAnalytics.Event.SEARCH, "Ljava/lang/String;", "getSearch", "()Ljava/lang/String;", "setSearch", "(Ljava/lang/String;)V", "source", "getSource", "setSource", "", Constants.KEY_LIMIT, "I", "getLimit", "()I", "setLimit", "(I)V", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "resultData", "Ljava/util/ArrayList;", "getResultData", "()Ljava/util/ArrayList;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveAnchorsPlug extends BaseAsyncPlug {
    private int limit;

    @NotNull
    private final ArrayList<BLiveAnchors> resultData;

    @NotNull
    private String search;

    @NotNull
    private String source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveAnchorsPlug(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
        this.search = "";
        this.source = "";
        this.resultData = new ArrayList<>();
    }

    /* JADX INFO: renamed from: f */
    public static void m68997f(LiveAnchorsPlug liveAnchorsPlug, List list) {
        list.getClass();
        liveAnchorsPlug.resultData.clear();
        List list2 = list;
        if (!vwb.m200296J(list2)) {
            liveAnchorsPlug.resultData.addAll(list2);
        }
        liveAnchorsPlug.success();
    }

    /* JADX INFO: renamed from: g */
    public static List m68998g(BLiveEnvelope bLiveEnvelope) {
        List<BLiveAnchors> list = bLiveEnvelope.data.liveAnchors;
        list.getClass();
        return list;
    }

    /* JADX INFO: renamed from: h */
    public static List m68999h(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static void m69000i(LiveAnchorsPlug liveAnchorsPlug, Throwable th) {
        th.getClass();
        liveAnchorsPlug.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static void m69001j(LiveAnchorsPlug liveAnchorsPlug) {
        liveAnchorsPlug.complete();
    }

    @Override // com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
        cll cllVarM107501r = cll.m107501r(ytr.m216073b("/live-anchors"));
        cllVarM107501r.getClass();
        C22306c<BLiveEnvelope> c22306cBuildLiveReadReqIO = LiveExternalApi.buildLiveReadReqIO(cllVarM107501r.m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, this.search).m107536c("source", this.source).m107536c(Constants.KEY_LIMIT, String.valueOf(this.limit)).m107537d(), "live-anchors");
        c22306cBuildLiveReadReqIO.getClass();
        C22306c c22306cDuringCreated = duringCreated(c22306cBuildLiveReadReqIO);
        final Function1 function1 = new Function1() { // from class: l.atr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveAnchorsPlug.m68998g((BLiveEnvelope) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.btr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveAnchorsPlug.m68999h(function1, obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.ctr
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveAnchorsPlug.m68997f(this.f82498a, (List) obj);
            }
        }, new e30() { // from class: l.dtr
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveAnchorsPlug.m69000i(this.f87870a, (Throwable) obj);
            }
        }, new d30() { // from class: l.etr
            @Override // p149l.d30
            public final void call() {
                LiveAnchorsPlug.m69001j(this.f93169a);
            }
        }));
    }

    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final ArrayList<BLiveAnchors> getResultData() {
        return this.resultData;
    }

    @NotNull
    public final String getSearch() {
        return this.search;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final void setLimit(int i) {
        this.limit = i;
    }

    public final void setSearch(@NotNull String str) {
        str.getClass();
        this.search = str;
    }

    public final void setSource(@NotNull String str) {
        str.getClass();
        this.source = str;
    }
}
