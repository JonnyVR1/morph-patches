package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLivePopUp;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Ll/gin;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "getData", "()V", "o", "p", "Lcom/p1/mobile/putong/live/base/data/BLivePopUp;", "a", "Lcom/p1/mobile/putong/live/base/data/BLivePopUp;", "n", "()Lcom/p1/mobile/putong/live/base/data/BLivePopUp;", "setResultData", "(Lcom/p1/mobile/putong/live/base/data/BLivePopUp;)V", "resultData", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class gin extends BaseAsyncPlug {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public BLivePopUp resultData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gin(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: f */
    public static void m126374f(gin ginVar, BLivePopUp bLivePopUp) {
        ginVar.resultData = bLivePopUp;
        ginVar.success();
    }

    /* JADX INFO: renamed from: g */
    public static BLivePopUp m126375g(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceLivePopUpGuild;
    }

    /* JADX INFO: renamed from: h */
    public static void m126376h(gin ginVar, Throwable th) {
        th.getClass();
        ginVar.error(th);
    }

    /* JADX INFO: renamed from: i */
    public static void m126377i(gin ginVar, Throwable th) {
        th.getClass();
        ginVar.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static BLivePopUp m126378j(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.livePopUpGuild;
    }

    /* JADX INFO: renamed from: k */
    public static void m126379k(gin ginVar, BLivePopUp bLivePopUp) {
        ginVar.resultData = bLivePopUp;
        ginVar.success();
    }

    /* JADX INFO: renamed from: l */
    public static BLivePopUp m126380l(Function1 function1, Object obj) {
        return (BLivePopUp) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static BLivePopUp m126381m(Function1 function1, Object obj) {
        return (BLivePopUp) function1.invoke(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final BLivePopUp getResultData() {
        return this.resultData;
    }

    /* JADX INFO: renamed from: o */
    public final void m126383o() {
        cll cllVarM107501r = cll.m107501r(ytr.m216073b("/live/popUp"));
        cllVarM107501r.getClass();
        C22306c<BLiveEnvelope> c22306cBuildLiveReadReqIO = LiveExternalApi.buildLiveReadReqIO(cllVarM107501r.m107524p().m107537d(), "live-popup");
        c22306cBuildLiveReadReqIO.getClass();
        C22306c c22306cDuringCreated = duringCreated(c22306cBuildLiveReadReqIO);
        final Function1 function1 = new Function1() { // from class: l.cin
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gin.m126378j((BLiveEnvelope) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.din
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gin.m126380l(function1, obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.ein
            @Override // p149l.e30
            public final void call(Object obj) {
                gin.m126379k(this.f91618a, (BLivePopUp) obj);
            }
        }, new e30() { // from class: l.fin
            @Override // p149l.e30
            public final void call(Object obj) {
                gin.m126377i(this.f97697a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m126384p() {
        cll cllVarM107501r = cll.m107501r(ytr.m216073b("/voice-live/popUp"));
        cllVarM107501r.getClass();
        C22306c<BLiveEnvelope> c22306cBuildLiveReadReqIO = LiveExternalApi.buildLiveReadReqIO(cllVarM107501r.m107524p().m107537d(), "voice-live-popup");
        c22306cBuildLiveReadReqIO.getClass();
        C22306c c22306cDuringCreated = duringCreated(c22306cBuildLiveReadReqIO);
        final Function1 function1 = new Function1() { // from class: l.yhn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gin.m126375g((BLiveEnvelope) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.zhn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gin.m126381m(function1, obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.ain
            @Override // p149l.e30
            public final void call(Object obj) {
                gin.m126374f(this.f70014a, (BLivePopUp) obj);
            }
        }, new e30() { // from class: l.bin
            @Override // p149l.e30
            public final void call(Object obj) {
                gin.m126376h(this.f75779a, (Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
    }
}
