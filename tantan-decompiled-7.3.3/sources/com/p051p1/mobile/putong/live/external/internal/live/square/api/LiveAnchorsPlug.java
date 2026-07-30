package com.p051p1.mobile.putong.live.external.internal.live.square.api;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveAnchorsPlug;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.dhw;
import p153l.fo0;
import p153l.jyb;
import p153l.ner;
import p153l.qcj;
import p153l.rnl;
import p153l.x20;
import p153l.y20;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R'\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "getData", "()V", "", FirebaseAnalytics.Event.SEARCH, "Ljava/lang/String;", "getSearch", "()Ljava/lang/String;", "setSearch", "(Ljava/lang/String;)V", "source", "getSource", "setSource", "", Constants.KEY_LIMIT, "I", "getLimit", "()I", "setLimit", "(I)V", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "resultData", "Ljava/util/ArrayList;", "getResultData", "()Ljava/util/ArrayList;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveAnchorsPlug extends BaseAsyncPlug {
    private int limit;

    @NotNull
    private final ArrayList<BLiveAnchors> resultData;

    @NotNull
    private String search;

    @NotNull
    private String source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveAnchorsPlug(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
        this.search = "";
        this.source = "";
        this.resultData = new ArrayList<>();
    }

    /* JADX INFO: renamed from: f */
    public static void m70180f(LiveAnchorsPlug liveAnchorsPlug, List list) {
        list.getClass();
        liveAnchorsPlug.resultData.clear();
        List list2 = list;
        if (!jyb.m147479J(list2)) {
            liveAnchorsPlug.resultData.addAll(list2);
        }
        liveAnchorsPlug.success();
    }

    /* JADX INFO: renamed from: g */
    public static List m70181g(BLiveEnvelope bLiveEnvelope) {
        List<BLiveAnchors> list = bLiveEnvelope.data.liveAnchors;
        list.getClass();
        return list;
    }

    /* JADX INFO: renamed from: h */
    public static List m70182h(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static void m70183i(LiveAnchorsPlug liveAnchorsPlug, Throwable th) {
        th.getClass();
        liveAnchorsPlug.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static void m70184j(LiveAnchorsPlug liveAnchorsPlug) {
        liveAnchorsPlug.complete();
    }

    @Override // com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
        rnl rnlVarM182265r = rnl.m182265r(zvr.m221802b("/live-anchors"));
        rnlVarM182265r.getClass();
        C22421c<BLiveEnvelope> c22421cBuildLiveReadReqIO = LiveExternalApi.buildLiveReadReqIO(rnlVarM182265r.m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, this.search).m182300c("source", this.source).m182300c(Constants.KEY_LIMIT, String.valueOf(this.limit)).m182301d(), "live-anchors");
        c22421cBuildLiveReadReqIO.getClass();
        C22421c c22421cDuringCreated = duringCreated(c22421cBuildLiveReadReqIO);
        final Function1 function1 = new Function1() { // from class: l.bvr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveAnchorsPlug.m70181g((BLiveEnvelope) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.cvr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveAnchorsPlug.m70182h(function1, obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.dvr
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveAnchorsPlug.m70180f(this.f90943a, (List) obj);
            }
        }, new y20() { // from class: l.evr
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveAnchorsPlug.m70183i(this.f96022a, (Throwable) obj);
            }
        }, new x20() { // from class: l.fvr
            @Override // p153l.x20
            public final void call() {
                LiveAnchorsPlug.m70184j(this.f101084a);
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
