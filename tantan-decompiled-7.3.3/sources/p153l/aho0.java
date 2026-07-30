package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkPoint;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.p069pk.VoicePkMvpView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.p069pk.VoicePkTimeView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class aho0 extends i6t<rwn0, VoicePkMvpView> {

    /* JADX INFO: renamed from: i */
    public BLiveVoicePkInfo f71387i;

    /* JADX INFO: renamed from: j */
    public VoicePkTimeView f71388j;

    /* JADX INFO: renamed from: k */
    public kcg0 f71389k;

    public aho0(dum<? extends rwn0> dumVar, VoicePkMvpView voicePkMvpView, VoicePkTimeView voicePkTimeView) {
        super(dumVar);
        mo52715C(voicePkMvpView);
        this.f71388j = voicePkTimeView;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m97874R3(BLiveVoicePkInfo bLiveVoicePkInfo) {
        this.f71387i = bLiveVoicePkInfo;
        ((VoicePkMvpView) this.viewModel).m79519w(bLiveVoicePkInfo);
        m213811F2().VoicePkEvent.onVoicePkChange().mo199273j(bLiveVoicePkInfo);
        m97881Y3(bLiveVoicePkInfo);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m97875S3(BLiveVoicePkInfo bLiveVoicePkInfo, Long l2) {
        this.f71388j.m79521i0(bLiveVoicePkInfo);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m97876T3(final VoiceLivePk.CallPkPoint callPkPoint) {
        BLiveVoicePkPoint bLiveVoicePkPointNew_ = (BLiveVoicePkPoint) jyb.m147529r(this.f71387i.onCallPoints, new qcj() { // from class: l.zgo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoicePkPoint) obj).userId, callPkPoint.getUserId()));
            }
        });
        if (bLiveVoicePkPointNew_ == null) {
            bLiveVoicePkPointNew_ = BLiveVoicePkPoint.new_();
            bLiveVoicePkPointNew_.userId = callPkPoint.getUserId();
            this.f71387i.onCallPoints.add(bLiveVoicePkPointNew_);
        }
        long point = callPkPoint.getPoint();
        bLiveVoicePkPointNew_.isScoreChange = bLiveVoicePkPointNew_.point != point;
        bLiveVoicePkPointNew_.point = point;
        bLiveVoicePkPointNew_.isNewTopOne = callPkPoint.getIsNewTopOne();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m97877U3(VoiceLivePk.VoiceLivePkModify voiceLivePkModify) {
        m97880X3();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ BLiveVoicePkInfo m97878V3(pgo0 pgo0Var) {
        return this.f71387i;
    }

    /* JADX INFO: renamed from: W3 */
    public void m97879W3() {
        if (this.f71387i != null) {
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(bae0.m103149b(10300, this.f71387i.schema));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m97880X3() {
        duringCreated(VoiceRoomApiProvider.getVoicePkDetail(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.xgo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194217a.m97874R3((BLiveVoicePkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m97881Y3(final BLiveVoicePkInfo bLiveVoicePkInfo) {
        psd0.m173633z(this.f71389k);
        if (!bLiveVoicePkInfo.enable || bLiveVoicePkInfo.endMill < 0) {
            bnl0.m105524M(this.f71388j, false);
        } else {
            this.f71389k = C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.ygo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f199853a.m97875S3(bLiveVoicePkInfo, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m97882Z3(VoiceLivePk.VoiceLivePkPoint voiceLivePkPoint) {
        if (this.f71387i == null) {
            return;
        }
        List<VoiceLivePk.CallPkPoint> callRewardPointsList = voiceLivePkPoint.getCallRewardPointsList();
        if (jyb.m147479J(callRewardPointsList)) {
            return;
        }
        jyb.m147537z(callRewardPointsList, new y20() { // from class: l.wgo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188999a.m97876T3((VoiceLivePk.CallPkPoint) obj);
            }
        });
        m213811F2().VoicePkEvent.onVoicePkChange().mo199273j(this.f71387i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98300k1()).subscribe(dhw.m115829h(new y20() { // from class: l.tgo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174117a.m97882Z3((VoiceLivePk.VoiceLivePkPoint) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98297j1()).subscribe(dhw.m115829h(new y20() { // from class: l.ugo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178921a.m97877U3((VoiceLivePk.VoiceLivePkModify) obj);
            }
        }));
        m138860d3(pgo0.class, new qcj() { // from class: l.vgo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184052a.m97878V3((pgo0) obj);
            }
        });
        m97880X3();
    }
}
