package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.RewardPointMsg;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class wrm0<D extends nnn0> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public final tkk0 f187808i;

    public wrm0(bsm bsmVar, tkk0 tkk0Var) {
        super(bsmVar);
        this.f187808i = tkk0Var;
    }

    /* JADX INFO: renamed from: O3 */
    public void m205267O3(aqm0 aqm0Var) {
        hfw.m130790a("[voice][call]", "VoiceCallMessageModule addDeputy");
        this.f187808i.m189505O3(aqm0Var);
    }

    /* JADX INFO: renamed from: P3 */
    public void m205268P3(BLiveVoiceCall bLiveVoiceCall) {
        this.f187808i.m189506P3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m205269R3(LongLinkLiveMessage.LiveRewardPointInfo.CallRewardPoint callRewardPoint) {
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(callRewardPoint.getUserId());
        if (bLiveVoiceCallM102063l != null) {
            BLiveVoiceCall bLiveVoiceCallMo223809clone = bLiveVoiceCallM102063l.mo223809clone();
            bLiveVoiceCallMo223809clone.userRecvRewardPoint = callRewardPoint.getRewardPoint();
            m205276Y3(bLiveVoiceCallMo223809clone);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ Boolean m205270S3(RewardPointMsg rewardPointMsg) {
        return Boolean.valueOf(NullChecker.m81303a(m206027E2().mo149813j()) && !BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(m206027E2().mo149813j().liveMode));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX INFO: renamed from: T3 */
    public void m205271T3(cmn0 cmn0Var) {
        switch (cmn0Var.m107682j()) {
            case 4:
            case 5:
                if (!vdt.m198092b(3)) {
                    m205276Y3(cmn0Var.m107677e());
                }
                break;
            case 6:
                m205267O3(new aqm0(cmn0Var.m107677e(), cmn0Var.m107679g()));
                break;
            case 7:
            case 8:
            case 10:
            case 11:
                m205276Y3(cmn0Var.m107677e());
                break;
            case 9:
                if (!m206032L2() && ypv.f199493a.m199309D0().equals(cmn0Var.m107679g().f135304a.f111520a)) {
                    if (cmn0Var.m107684l()) {
                        lsi0.m151593w(R$string.f47460ph);
                    } else if (m206027E2().m160271i3()) {
                        lsi0.m151593w(R$string.f47283hf);
                    } else {
                        lsi0.m151593w(R$string.f47438oh);
                    }
                }
                m205274W3(cmn0Var.m107677e());
                break;
            case 12:
            case 13:
                m205274W3(cmn0Var.m107677e());
                break;
            case 14:
                m205273V3(cmn0Var);
                break;
            case 15:
                m205268P3(cmn0Var.m107677e());
                m206028F2().GiftDialogEventGroup.onVoicePositionChange().m172467p();
                break;
            case 16:
                m206028F2().VoiceCallEvent.updateSelfCallEvent().mo172463j(cmn0Var.m107677e());
                break;
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m205272U3(RewardPointMsg rewardPointMsg) {
        List<LongLinkLiveMessage.LiveRewardPointInfo.CallRewardPoint> list = rewardPointMsg.callRewardPoint;
        if (vwb.m200296J(list)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.vrm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182734a.m205269R3((LongLinkLiveMessage.LiveRewardPointInfo.CallRewardPoint) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final void m205273V3(cmn0 cmn0Var) {
        i54 i54Var = cmn0Var.m107679g().f135304a;
        User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(i54Var.f111520a);
        if (userM135637i != null) {
            m205275X3(userM135637i);
        } else {
            duringCreated(LivingNormalApiProvider.m71574s7(i54Var.f111520a, m206027E2().m149814k())).doOnNext(new e30() { // from class: l.trm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((idv) ypv.m215673l(fld0.f98147b)).m135629a((User) obj);
                }
            }).subscribe(ffw.m121197h(new e30() { // from class: l.urm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177849a.m205275X3((User) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m205274W3(BLiveVoiceCall bLiveVoiceCall) {
        this.f187808i.m189515f4(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m205275X3(User user) {
        if (x4s.m207012b(m206027E2().mo149813j().liveMode)) {
            lsi0.m151595y(w8u.m202218u(R$string.f47392mf, user.name));
            return;
        }
        lsi0.m151595y(user.name + String.format(this.f188513f.getString(R$string.f46900Ph), w8u.m202217t(user.isFemale() ? R$string.f46592Bd : R$string.f46993U5)));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m205276Y3(BLiveVoiceCall bLiveVoiceCall) {
        this.f187808i.m189520m4(bLiveVoiceCall);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m104250o2(m206027E2().m132160q1().m189155x0(), false).subscribe(ffw.m121197h(new e30() { // from class: l.qrm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156006a.m205271T3((cmn0) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189082Y()).filter(new w9j() { // from class: l.rrm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f160758a.m205270S3((RewardPointMsg) obj);
            }
        }).subscribe(new e30() { // from class: l.srm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166112a.m205272U3((RewardPointMsg) obj);
            }
        });
    }
}
