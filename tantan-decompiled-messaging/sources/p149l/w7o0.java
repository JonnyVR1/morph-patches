package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkPoint;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.p064pk.VoicePkMvpView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.p064pk.VoicePkTimeView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class w7o0 extends h4t<nnn0, VoicePkMvpView> {

    /* JADX INFO: renamed from: i */
    public BLiveVoicePkInfo f185071i;

    /* JADX INFO: renamed from: j */
    public VoicePkTimeView f185072j;

    /* JADX INFO: renamed from: k */
    public c4g0 f185073k;

    public w7o0(bsm<? extends nnn0> bsmVar, VoicePkMvpView voicePkMvpView, VoicePkTimeView voicePkTimeView) {
        super(bsmVar);
        mo51532C(voicePkMvpView);
        this.f185072j = voicePkTimeView;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m202038R3(BLiveVoicePkInfo bLiveVoicePkInfo) {
        this.f185071i = bLiveVoicePkInfo;
        ((VoicePkMvpView) this.viewModel).m78336w(bLiveVoicePkInfo);
        m206028F2().VoicePkEvent.onVoicePkChange().mo172463j(bLiveVoicePkInfo);
        m202045Y3(bLiveVoicePkInfo);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m202039S3(BLiveVoicePkInfo bLiveVoicePkInfo, Long l2) {
        this.f185072j.m78338i0(bLiveVoicePkInfo);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m202040T3(final VoiceLivePk.CallPkPoint callPkPoint) {
        BLiveVoicePkPoint bLiveVoicePkPointNew_ = (BLiveVoicePkPoint) vwb.m200346r(this.f185071i.onCallPoints, new w9j() { // from class: l.v7o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoicePkPoint) obj).userId, callPkPoint.getUserId()));
            }
        });
        if (bLiveVoicePkPointNew_ == null) {
            bLiveVoicePkPointNew_ = BLiveVoicePkPoint.new_();
            bLiveVoicePkPointNew_.userId = callPkPoint.getUserId();
            this.f185071i.onCallPoints.add(bLiveVoicePkPointNew_);
        }
        long point = callPkPoint.getPoint();
        bLiveVoicePkPointNew_.isScoreChange = bLiveVoicePkPointNew_.point != point;
        bLiveVoicePkPointNew_.point = point;
        bLiveVoicePkPointNew_.isNewTopOne = callPkPoint.getIsNewTopOne();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m202041U3(VoiceLivePk.VoiceLivePkModify voiceLivePkModify) {
        m202044X3();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ BLiveVoicePkInfo m202042V3(l7o0 l7o0Var) {
        return this.f185071i;
    }

    /* JADX INFO: renamed from: W3 */
    public void m202043W3() {
        if (this.f185071i != null) {
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(x1e0.m206696b(10300, this.f185071i.schema));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m202044X3() {
        duringCreated(VoiceRoomApiProvider.getVoicePkDetail(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.t7o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168760a.m202038R3((BLiveVoicePkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m202045Y3(final BLiveVoicePkInfo bLiveVoicePkInfo) {
        mkd0.m154992z(this.f185073k);
        if (!bLiveVoicePkInfo.enable || bLiveVoicePkInfo.endMill < 0) {
            xdl0.m208344M(this.f185072j, false);
        } else {
            this.f185073k = C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.u7o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f175028a.m202039S3(bLiveVoicePkInfo, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m202046Z3(VoiceLivePk.VoiceLivePkPoint voiceLivePkPoint) {
        if (this.f185071i == null) {
            return;
        }
        List<VoiceLivePk.CallPkPoint> callRewardPointsList = voiceLivePkPoint.getCallRewardPointsList();
        if (vwb.m200296J(callRewardPointsList)) {
            return;
        }
        vwb.m200354z(callRewardPointsList, new e30() { // from class: l.s7o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162927a.m202040T3((VoiceLivePk.CallPkPoint) obj);
            }
        });
        m206028F2().VoicePkEvent.onVoicePkChange().mo172463j(this.f185071i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189118k1()).subscribe(ffw.m121197h(new e30() { // from class: l.p7o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147530a.m202046Z3((VoiceLivePk.VoiceLivePkPoint) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189115j1()).subscribe(ffw.m121197h(new e30() { // from class: l.q7o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153061a.m202041U3((VoiceLivePk.VoiceLivePkModify) obj);
            }
        }));
        m129301d3(l7o0.class, new w9j() { // from class: l.r7o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158053a.m202042V3((l7o0) obj);
            }
        });
        m202044X3();
    }
}
