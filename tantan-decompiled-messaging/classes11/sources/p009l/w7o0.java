package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.p003pk.VoicePkMvpView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.p003pk.VoicePkTimeView;
import com.p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk;
import com.p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoicePkPoint;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bsm;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.h4t;
import l.jo0;
import l.mkd0;
import l.nnn0;
import l.vwb;
import l.w9j;
import l.x1e0;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w7o0 extends h4t<nnn0, VoicePkMvpView> {

    /* JADX INFO: renamed from: i */
    public BLiveVoicePkInfo f21937i;

    /* JADX INFO: renamed from: j */
    public VoicePkTimeView f21938j;

    /* JADX INFO: renamed from: k */
    public c4g0 f21939k;

    public w7o0(bsm<? extends nnn0> bsmVar, VoicePkMvpView voicePkMvpView, VoicePkTimeView voicePkTimeView) {
        super(bsmVar);
        C(voicePkMvpView);
        this.f21938j = voicePkTimeView;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m23977R3(BLiveVoicePkInfo bLiveVoicePkInfo) {
        this.f21937i = bLiveVoicePkInfo;
        ((VoicePkMvpView) ((bwr) this).viewModel).m8533w(bLiveVoicePkInfo);
        F2().VoicePkEvent.onVoicePkChange().j(bLiveVoicePkInfo);
        m23984Y3(bLiveVoicePkInfo);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m23978S3(BLiveVoicePkInfo bLiveVoicePkInfo, Long l2) {
        this.f21938j.m8535i0(bLiveVoicePkInfo);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m23979T3(final VoiceLivePk.CallPkPoint callPkPoint) {
        BLiveVoicePkPoint bLiveVoicePkPointNew_ = (BLiveVoicePkPoint) vwb.r(this.f21937i.onCallPoints, new w9j() { // from class: l.v7o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoicePkPoint) obj).userId, callPkPoint.getUserId()));
            }
        });
        if (bLiveVoicePkPointNew_ == null) {
            bLiveVoicePkPointNew_ = BLiveVoicePkPoint.new_();
            bLiveVoicePkPointNew_.userId = callPkPoint.getUserId();
            this.f21937i.onCallPoints.add(bLiveVoicePkPointNew_);
        }
        long point = callPkPoint.getPoint();
        bLiveVoicePkPointNew_.isScoreChange = bLiveVoicePkPointNew_.point != point;
        bLiveVoicePkPointNew_.point = point;
        bLiveVoicePkPointNew_.isNewTopOne = callPkPoint.getIsNewTopOne();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m23980U3(VoiceLivePk.VoiceLivePkModify voiceLivePkModify) {
        m23983X3();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ BLiveVoicePkInfo m23981V3(l7o0 l7o0Var) {
        return this.f21937i;
    }

    /* JADX INFO: renamed from: W3 */
    public void m23982W3() {
        if (this.f21937i != null) {
            F2().SchemeHandleEvent.handleScheme().j(x1e0.b(10300, this.f21937i.schema));
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final void m23983X3() {
        duringCreated(VoiceRoomApiProvider.getVoicePkDetail(E2().o())).subscribe(ffw.h(new e30() { // from class: l.t7o0
            public final void call(Object obj) {
                this.f20576a.m23977R3((BLiveVoicePkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m23984Y3(final BLiveVoicePkInfo bLiveVoicePkInfo) {
        mkd0.z(this.f21939k);
        if (!bLiveVoicePkInfo.enable || bLiveVoicePkInfo.endMill < 0) {
            xdl0.M(this.f21938j, false);
        } else {
            this.f21939k = c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.u7o0
                public final void call(Object obj) {
                    this.f21010a.m23978S3(bLiveVoicePkInfo, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m23985Z3(VoiceLivePk.VoiceLivePkPoint voiceLivePkPoint) {
        if (this.f21937i == null) {
            return;
        }
        List callRewardPointsList = voiceLivePkPoint.getCallRewardPointsList();
        if (vwb.J(callRewardPointsList)) {
            return;
        }
        vwb.z(callRewardPointsList, new e30() { // from class: l.s7o0
            public final void call(Object obj) {
                this.f20126a.m23979T3((VoiceLivePk.CallPkPoint) obj);
            }
        });
        F2().VoicePkEvent.onVoicePkChange().j(this.f21937i);
    }

    /* JADX INFO: renamed from: t */
    public void m23986t() {
        super/*l.k4t*/.t();
        duringCreated(E2().q1().k1()).subscribe(ffw.h(new e30() { // from class: l.p7o0
            public final void call(Object obj) {
                this.f18424a.m23985Z3((VoiceLivePk.VoiceLivePkPoint) obj);
            }
        }));
        duringCreated(E2().q1().j1()).subscribe(ffw.h(new e30() { // from class: l.q7o0
            public final void call(Object obj) {
                this.f19062a.m23980U3((VoiceLivePk.VoiceLivePkModify) obj);
            }
        }));
        d3(l7o0.class, new w9j() { // from class: l.r7o0
            public final Object call(Object obj) {
                return this.f19673a.m23981V3((l7o0) obj);
            }
        });
        m23983X3();
    }
}
