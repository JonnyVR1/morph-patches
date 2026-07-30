package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLivePopUp;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/gkn;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "getData", "()V", "o", "p", "Lcom/p1/mobile/putong/live/base/data/BLivePopUp;", "a", "Lcom/p1/mobile/putong/live/base/data/BLivePopUp;", "n", "()Lcom/p1/mobile/putong/live/base/data/BLivePopUp;", "setResultData", "(Lcom/p1/mobile/putong/live/base/data/BLivePopUp;)V", "resultData", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gkn extends BaseAsyncPlug {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public BLivePopUp resultData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkn(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: f */
    public static void m130587f(gkn gknVar, BLivePopUp bLivePopUp) {
        gknVar.resultData = bLivePopUp;
        gknVar.success();
    }

    /* JADX INFO: renamed from: g */
    public static BLivePopUp m130588g(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceLivePopUpGuild;
    }

    /* JADX INFO: renamed from: h */
    public static void m130589h(gkn gknVar, Throwable th) {
        th.getClass();
        gknVar.error(th);
    }

    /* JADX INFO: renamed from: i */
    public static void m130590i(gkn gknVar, Throwable th) {
        th.getClass();
        gknVar.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static BLivePopUp m130591j(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.livePopUpGuild;
    }

    /* JADX INFO: renamed from: k */
    public static void m130592k(gkn gknVar, BLivePopUp bLivePopUp) {
        gknVar.resultData = bLivePopUp;
        gknVar.success();
    }

    /* JADX INFO: renamed from: l */
    public static BLivePopUp m130593l(Function1 function1, Object obj) {
        return (BLivePopUp) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static BLivePopUp m130594m(Function1 function1, Object obj) {
        return (BLivePopUp) function1.invoke(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final BLivePopUp getResultData() {
        return this.resultData;
    }

    /* JADX INFO: renamed from: o */
    public final void m130596o() {
        rnl rnlVarM182265r = rnl.m182265r(zvr.m221802b("/live/popUp"));
        rnlVarM182265r.getClass();
        C22421c<BLiveEnvelope> c22421cBuildLiveReadReqIO = LiveExternalApi.buildLiveReadReqIO(rnlVarM182265r.m182288p().m182301d(), "live-popup");
        c22421cBuildLiveReadReqIO.getClass();
        C22421c c22421cDuringCreated = duringCreated(c22421cBuildLiveReadReqIO);
        final Function1 function1 = new Function1() { // from class: l.ckn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gkn.m130591j((BLiveEnvelope) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.dkn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gkn.m130593l(function1, obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.ekn
            @Override // p153l.y20
            public final void call(Object obj) {
                gkn.m130592k(this.f94414a, (BLivePopUp) obj);
            }
        }, new y20() { // from class: l.fkn
            @Override // p153l.y20
            public final void call(Object obj) {
                gkn.m130590i(this.f99533a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m130597p() {
        rnl rnlVarM182265r = rnl.m182265r(zvr.m221802b("/voice-live/popUp"));
        rnlVarM182265r.getClass();
        C22421c<BLiveEnvelope> c22421cBuildLiveReadReqIO = LiveExternalApi.buildLiveReadReqIO(rnlVarM182265r.m182288p().m182301d(), "voice-live-popup");
        c22421cBuildLiveReadReqIO.getClass();
        C22421c c22421cDuringCreated = duringCreated(c22421cBuildLiveReadReqIO);
        final Function1 function1 = new Function1() { // from class: l.yjn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gkn.m130588g((BLiveEnvelope) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.zjn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gkn.m130594m(function1, obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.akn
            @Override // p153l.y20
            public final void call(Object obj) {
                gkn.m130587f(this.f72021a, (BLivePopUp) obj);
            }
        }, new y20() { // from class: l.bkn
            @Override // p153l.y20
            public final void call(Object obj) {
                gkn.m130589h(this.f77103a, (Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
    }
}
