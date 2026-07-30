package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.RewardPointMsg;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class a1n0<D extends rwn0> extends qct<D> {

    /* JADX INFO: renamed from: i */
    public final ztk0 f67825i;

    public a1n0(dum dumVar, ztk0 ztk0Var) {
        super(dumVar);
        this.f67825i = ztk0Var;
    }

    /* JADX INFO: renamed from: O3 */
    public void m95529O3(ezm0 ezm0Var) {
        fhw.m125605a("[voice][call]", "VoiceCallMessageModule addDeputy");
        this.f67825i.m221546O3(ezm0Var);
    }

    /* JADX INFO: renamed from: P3 */
    public void m95530P3(BLiveVoiceCall bLiveVoiceCall) {
        this.f67825i.m221547P3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m95531R3(LongLinkLiveMessage.LiveRewardPointInfo.CallRewardPoint callRewardPoint) {
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(callRewardPoint.getUserId());
        if (bLiveVoiceCallM136873l != null) {
            BLiveVoiceCall bLiveVoiceCallMo225055clone = bLiveVoiceCallM136873l.mo225055clone();
            bLiveVoiceCallMo225055clone.userRecvRewardPoint = callRewardPoint.getRewardPoint();
            m95538Y3(bLiveVoiceCallMo225055clone);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ Boolean m95532S3(RewardPointMsg rewardPointMsg) {
        return Boolean.valueOf(NullChecker.m82486a(m213810E2().mo183435j()) && !BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(m213810E2().mo183435j().liveMode));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX INFO: renamed from: T3 */
    public void m95533T3(gvn0 gvn0Var) {
        switch (gvn0Var.m132569j()) {
            case 4:
            case 5:
                if (!wft.m206159b(3)) {
                    m95538Y3(gvn0Var.m132564e());
                }
                break;
            case 6:
                m95529O3(new ezm0(gvn0Var.m132564e(), gvn0Var.m132566g()));
                break;
            case 7:
            case 8:
            case 10:
            case 11:
                m95538Y3(gvn0Var.m132564e());
                break;
            case 9:
                if (!m213815L2() && zrv.f205799a.m207631D0().equals(gvn0Var.m132566g().f143542a.f107997a)) {
                    if (gvn0Var.m132571l()) {
                        o1j0.m165649w(R$string.f48308ph);
                    } else if (m213810E2().m183434i3()) {
                        o1j0.m165649w(R$string.f48131hf);
                    } else {
                        o1j0.m165649w(R$string.f48286oh);
                    }
                }
                m95536W3(gvn0Var.m132564e());
                break;
            case 12:
            case 13:
                m95536W3(gvn0Var.m132564e());
                break;
            case 14:
                m95535V3(gvn0Var);
                break;
            case 15:
                m95530P3(gvn0Var.m132564e());
                m213811F2().GiftDialogEventGroup.onVoicePositionChange().m199277p();
                break;
            case 16:
                m213811F2().VoiceCallEvent.updateSelfCallEvent().mo199273j(gvn0Var.m132564e());
                break;
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m95534U3(RewardPointMsg rewardPointMsg) {
        List<LongLinkLiveMessage.LiveRewardPointInfo.CallRewardPoint> list = rewardPointMsg.callRewardPoint;
        if (jyb.m147479J(list)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.z0n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202360a.m95531R3((LongLinkLiveMessage.LiveRewardPointInfo.CallRewardPoint) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final void m95535V3(gvn0 gvn0Var) {
        h64 h64Var = gvn0Var.m132566g().f143542a;
        User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(h64Var.f107997a);
        if (userM144722i != null) {
            m95537X3(userM144722i);
        } else {
            duringCreated(LivingNormalApiProvider.m72757s7(h64Var.f107997a, m213810E2().m202191k())).doOnNext(new y20() { // from class: l.x0n0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((jfv) zrv.m221194l(htd0.f111520b)).m144714a((User) obj);
                }
            }).subscribe(dhw.m115829h(new y20() { // from class: l.y0n0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197025a.m95537X3((User) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m95536W3(BLiveVoiceCall bLiveVoiceCall) {
        this.f67825i.m221556f4(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m95537X3(User user) {
        if (y6s.m214494b(m213810E2().mo183435j().liveMode)) {
            o1j0.m165651y(xau.m209911u(R$string.f48240mf, user.name));
            return;
        }
        o1j0.m165651y(user.name + String.format(this.f196919f.getString(R$string.f47748Ph), xau.m209910t(user.isFemale() ? R$string.f47440Bd : R$string.f47841U5)));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m95538Y3(BLiveVoiceCall bLiveVoiceCall) {
        this.f67825i.m221561m4(bLiveVoiceCall);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m113231o2(m213810E2().m168545q1().m98337x0(), false).subscribe(dhw.m115829h(new y20() { // from class: l.u0n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176918a.m95533T3((gvn0) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98264Y()).filter(new qcj() { // from class: l.v0n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f181886a.m95532S3((RewardPointMsg) obj);
            }
        }).subscribe(new y20() { // from class: l.w0n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186620a.m95534U3((RewardPointMsg) obj);
            }
        });
    }
}
