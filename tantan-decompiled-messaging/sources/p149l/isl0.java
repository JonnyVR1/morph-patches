package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.nnn0;
import p149l.s7m;

/* JADX INFO: loaded from: classes5.dex */
public abstract class isl0<D extends nnn0, V extends s7m> extends h4t<D, V> implements y7m {

    /* JADX INFO: renamed from: i */
    public final C22392a<w3o0> f114780i;

    public isl0(bsm bsmVar) {
        super(bsmVar);
        this.f114780i = C22392a.m221512b();
        m144512z2(new p8n0(bsmVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m138046c4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        vwb.m200354z(m206027E2().m160249P2().m102067p(), new e30() { // from class: l.hsl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109330a.m138050T3(bLiveCallVolume, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N1 */
    public abstract void mo138047N1(BLiveVoiceCall bLiveVoiceCall);

    /* JADX INFO: renamed from: R3 */
    public void mo138048R3(bik0.C15867a c15867a) {
        this.f114780i.m132487l(m206027E2().m160249P2().m102069r());
    }

    /* JADX INFO: renamed from: S3 */
    public final void m138049S3(LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate) {
        hfw.m130790a("[voice][call]", "handleMemberUpdate：" + voiceMemberUpdate.toString());
        if (voiceMemberUpdate.getType().equals(LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Count)) {
            m206027E2().m160249P2().m102069r().m201368U(voiceMemberUpdate.getTotal());
            mo138053W3(voiceMemberUpdate.getTotal());
            return;
        }
        if (voiceMemberUpdate.getType().equals(LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Remove)) {
            m206027E2().m160249P2().m102075x(voiceMemberUpdate.getMemberId());
        } else {
            m206027E2().m160249P2().m102058g(mqv.m155998f(new i54(voiceMemberUpdate.getMemberId(), voiceMemberUpdate.getUserMask().getName(), voiceMemberUpdate.getUserMask().getAvatar())).m156001c(voiceMemberUpdate.getMemberId(), rxn0.m181617a(voiceMemberUpdate.getUserMask()), m206027E2().mo132103W0()), e0o0.m114320f(m206027E2(), voiceMemberUpdate.getMemberId()));
        }
        this.f114780i.m132487l(m206027E2().m160249P2().m102069r());
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m138050T3(BLiveCallVolume bLiveCallVolume, BLiveVoiceCall bLiveVoiceCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveVoiceCall.volume) {
            bLiveVoiceCall.isSpeak = false;
            bLiveVoiceCall.volume = 0.0f;
        } else {
            bLiveVoiceCall.isSpeak = true;
            bLiveVoiceCall.volume = f.floatValue();
        }
        mo138047N1(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: U3 */
    public abstract void mo138051U3(mqv<i54> mqvVar);

    /* JADX INFO: renamed from: V3 */
    public abstract void mo138052V3(mqv<i54> mqvVar, mqv<i54> mqvVar2, BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2, boolean z, String str, String str2);

    /* JADX INFO: renamed from: Y3 */
    public final void m138055Y3(tzo0 tzo0Var) {
        mqv<i54> mqvVarM102064m = m206027E2().m160249P2().m102064m(tzo0Var.f172746c);
        rsm0.m180699g(tzo0Var, mqvVarM102064m);
        if (mqvVarM102064m == null) {
            return;
        }
        hxn0 hxn0Var = (hxn0) mqvVarM102064m.m156004g();
        if (hxn0Var.f109896b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            return;
        }
        hxn0Var.f109896b.avatarConfig.frameConfig = tzo0Var.f172744a;
        mo138051U3(mqvVarM102064m);
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m138056Z3(BLiveUserMask bLiveUserMask) {
        mqv<i54> mqvVarM102064m = m206027E2().m160249P2().m102064m(bLiveUserMask.userId);
        hxn0 hxn0VarM133350c = hxn0.m133350c(mqvVarM102064m);
        BLiveUserMask bLiveUserMask2 = hxn0VarM133350c.f109896b;
        if (bLiveUserMask2 == null || !bLiveUserMask2.equals(bLiveUserMask)) {
            hxn0VarM133350c.f109896b = bLiveUserMask;
            if (m206027E2().m160249P2().m102063l(bLiveUserMask.userId) == null) {
                return;
            }
            mo138051U3(mqvVarM102064m);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m138057a4(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        BLiveUserMask bLiveUserMaskM181617a = rxn0.m181617a(userMaskUpdate.getMask());
        mqv<i54> mqvVarM102064m = m206027E2().m160249P2().m102064m(bLiveUserMaskM181617a.userId);
        if (mqvVarM102064m == null) {
            return;
        }
        hxn0 hxn0VarM133350c = hxn0.m133350c(mqvVarM102064m);
        BLiveUserMask bLiveUserMask = hxn0VarM133350c.f109896b;
        if ((bLiveUserMask == null || !bLiveUserMask.equals(bLiveUserMaskM181617a)) && !hxn0VarM133350c.f109896b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            hxn0VarM133350c.f109896b = bLiveUserMaskM181617a;
            mo138051U3(mqvVarM102064m);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m138058b4(VoiceSweet.VoiceSweetCpEffect voiceSweetCpEffect) {
        if (voiceSweetCpEffect == null || vwb.m200296J(voiceSweetCpEffect.getUserIdsList()) || voiceSweetCpEffect.getUserIdsList().size() != 2) {
            return;
        }
        m206027E2().m160249P2().m102069r().m201371X(voiceSweetCpEffect);
        String userIds = voiceSweetCpEffect.getUserIds(0);
        String userIds2 = voiceSweetCpEffect.getUserIds(1);
        mo138052V3(m206027E2().m160249P2().m102064m(userIds), m206027E2().m160249P2().m102064m(userIds2), m206027E2().m160249P2().m102063l(userIds), m206027E2().m160249P2().m102063l(userIds2), voiceSweetCpEffect.getOn(), voiceSweetCpEffect.getVerticalCallConnectionEffectSvga(), voiceSweetCpEffect.getHorizontalCallConnectionEffectSvga());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189053J0()).subscribe(ffw.m121197h(new e30() { // from class: l.zrl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204529a.m138055Y3((tzo0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().CallEvent.memberVolume().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.asl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71461a.m138046c4((BLiveCallVolume) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189120l0()).subscribe(ffw.m121193d(new e30() { // from class: l.bsl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77094a.m138057a4((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189094c1()).subscribe(ffw.m121197h(new e30() { // from class: l.csl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82361a.m138049S3((LongLinkLiveMessage.VoiceMemberUpdate) obj);
            }
        }));
        duringCreated(m206027E2().m160251Q2()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.dsl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87774a.mo138048R3((bik0.C15867a) obj);
            }
        }));
        duringCreated(this.f114780i).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.esl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93035a.mo138054X3((w3o0) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189139r1()).subscribe(ffw.m121197h(new e30() { // from class: l.fsl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99087a.m138058b4((VoiceSweet.VoiceSweetCpEffect) obj);
            }
        }));
        duringCreated(m206027E2().m160234E3()).subscribe(ffw.m121193d(new e30() { // from class: l.gsl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104188a.m138056Z3((BLiveUserMask) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public void mo138053W3(long j) {
    }

    /* JADX INFO: renamed from: X3 */
    public void mo138054X3(w3o0 w3o0Var) {
    }
}
