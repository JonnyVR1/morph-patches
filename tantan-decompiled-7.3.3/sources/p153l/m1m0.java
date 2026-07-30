package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.iam;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m1m0<D extends rwn0, V extends iam> extends i6t<D, V> implements oam {

    /* JADX INFO: renamed from: i */
    public final C22507a<ado0> f134449i;

    public m1m0(dum dumVar) {
        super(dumVar);
        this.f134449i = C22507a.m222758b();
        m153103z2(new thn0(dumVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m156706c4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        jyb.m147537z(m213810E2().m183411P2().m136877p(), new y20() { // from class: l.l1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129703a.m156709T3(bLiveCallVolume, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N1 */
    public abstract void mo156707N1(BLiveVoiceCall bLiveVoiceCall);

    /* JADX INFO: renamed from: R3 */
    public void mo113719R3(hrk0.C17564a c17564a) {
        this.f134449i.m137019l(m213810E2().m183411P2().m136879r());
    }

    /* JADX INFO: renamed from: S3 */
    public final void m156708S3(LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate) {
        fhw.m125605a("[voice][call]", "handleMemberUpdate：" + voiceMemberUpdate.toString());
        if (voiceMemberUpdate.getType().equals(LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Count)) {
            m213810E2().m183411P2().m136879r().m97125U(voiceMemberUpdate.getTotal());
            mo156712W3(voiceMemberUpdate.getTotal());
            return;
        }
        if (voiceMemberUpdate.getType().equals(LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Remove)) {
            m213810E2().m183411P2().m136885x(voiceMemberUpdate.getMemberId());
        } else {
            m213810E2().m183411P2().m136868g(nsv.m164636f(new h64(voiceMemberUpdate.getMemberId(), voiceMemberUpdate.getUserMask().getName(), voiceMemberUpdate.getUserMask().getAvatar())).m164639c(voiceMemberUpdate.getMemberId(), v6o0.m200134a(voiceMemberUpdate.getUserMask()), m213810E2().mo168489W0()), i9o0.m139135f(m213810E2(), voiceMemberUpdate.getMemberId()));
        }
        this.f134449i.m137019l(m213810E2().m183411P2().m136879r());
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m156709T3(BLiveCallVolume bLiveCallVolume, BLiveVoiceCall bLiveVoiceCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveVoiceCall.volume) {
            bLiveVoiceCall.isSpeak = false;
            bLiveVoiceCall.volume = 0.0f;
        } else {
            bLiveVoiceCall.isSpeak = true;
            bLiveVoiceCall.volume = f.floatValue();
        }
        mo156707N1(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: U3 */
    public abstract void mo156710U3(nsv<h64> nsvVar);

    /* JADX INFO: renamed from: V3 */
    public abstract void mo156711V3(nsv<h64> nsvVar, nsv<h64> nsvVar2, BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2, boolean z, String str, String str2);

    /* JADX INFO: renamed from: Y3 */
    public final void m156714Y3(x8p0 x8p0Var) {
        nsv<h64> nsvVarM136874m = m213810E2().m183411P2().m136874m(x8p0Var.f192862c);
        v1n0.m199029g(x8p0Var, nsvVarM136874m);
        if (nsvVarM136874m == null) {
            return;
        }
        l6o0 l6o0Var = (l6o0) nsvVarM136874m.m164642g();
        if (l6o0Var.f130275b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            return;
        }
        l6o0Var.f130275b.avatarConfig.frameConfig = x8p0Var.f192860a;
        mo156710U3(nsvVarM136874m);
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m156715Z3(BLiveUserMask bLiveUserMask) {
        nsv<h64> nsvVarM136874m = m213810E2().m183411P2().m136874m(bLiveUserMask.userId);
        l6o0 l6o0VarM153068c = l6o0.m153068c(nsvVarM136874m);
        BLiveUserMask bLiveUserMask2 = l6o0VarM153068c.f130275b;
        if (bLiveUserMask2 == null || !bLiveUserMask2.equals(bLiveUserMask)) {
            l6o0VarM153068c.f130275b = bLiveUserMask;
            if (m213810E2().m183411P2().m136873l(bLiveUserMask.userId) == null) {
                return;
            }
            mo156710U3(nsvVarM136874m);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m156716a4(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        BLiveUserMask bLiveUserMaskM200134a = v6o0.m200134a(userMaskUpdate.getMask());
        nsv<h64> nsvVarM136874m = m213810E2().m183411P2().m136874m(bLiveUserMaskM200134a.userId);
        if (nsvVarM136874m == null) {
            return;
        }
        l6o0 l6o0VarM153068c = l6o0.m153068c(nsvVarM136874m);
        BLiveUserMask bLiveUserMask = l6o0VarM153068c.f130275b;
        if ((bLiveUserMask == null || !bLiveUserMask.equals(bLiveUserMaskM200134a)) && !l6o0VarM153068c.f130275b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            l6o0VarM153068c.f130275b = bLiveUserMaskM200134a;
            mo156710U3(nsvVarM136874m);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m156717b4(VoiceSweet.VoiceSweetCpEffect voiceSweetCpEffect) {
        if (voiceSweetCpEffect == null || jyb.m147479J(voiceSweetCpEffect.getUserIdsList()) || voiceSweetCpEffect.getUserIdsList().size() != 2) {
            return;
        }
        m213810E2().m183411P2().m136879r().m97128X(voiceSweetCpEffect);
        String userIds = voiceSweetCpEffect.getUserIds(0);
        String userIds2 = voiceSweetCpEffect.getUserIds(1);
        mo156711V3(m213810E2().m183411P2().m136874m(userIds), m213810E2().m183411P2().m136874m(userIds2), m213810E2().m183411P2().m136873l(userIds), m213810E2().m183411P2().m136873l(userIds2), voiceSweetCpEffect.getOn(), voiceSweetCpEffect.getVerticalCallConnectionEffectSvga(), voiceSweetCpEffect.getHorizontalCallConnectionEffectSvga());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98235J0()).subscribe(dhw.m115829h(new y20() { // from class: l.d1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84702a.m156714Y3((x8p0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().CallEvent.memberVolume().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.e1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91637a.m156706c4((BLiveCallVolume) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98302l0()).subscribe(dhw.m115825d(new y20() { // from class: l.f1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96807a.m156716a4((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98276c1()).subscribe(dhw.m115829h(new y20() { // from class: l.g1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101767a.m156708S3((LongLinkLiveMessage.VoiceMemberUpdate) obj);
            }
        }));
        duringCreated(m213810E2().m183413Q2()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.h1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107470a.mo113719R3((hrk0.C17564a) obj);
            }
        }));
        duringCreated(this.f134449i).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.i1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112536a.mo156713X3((ado0) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98321r1()).subscribe(dhw.m115829h(new y20() { // from class: l.j1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117976a.m156717b4((VoiceSweet.VoiceSweetCpEffect) obj);
            }
        }));
        duringCreated(m213810E2().m183396E3()).subscribe(dhw.m115825d(new y20() { // from class: l.k1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123517a.m156715Z3((BLiveUserMask) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public void mo156712W3(long j) {
    }

    /* JADX INFO: renamed from: X3 */
    public void mo156713X3(ado0 ado0Var) {
    }
}
