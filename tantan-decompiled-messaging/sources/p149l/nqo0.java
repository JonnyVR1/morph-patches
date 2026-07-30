package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import p149l.ho2;

/* JADX INFO: loaded from: classes11.dex */
public class nqo0<D extends ho2> extends x6s<D, pat> {

    /* JADX INFO: renamed from: j */
    public bsm f140089j;

    /* JADX INFO: renamed from: k */
    public boolean f140090k;

    public nqo0(bsm bsmVar) {
        super(bsmVar);
        this.f140089j = bsmVar;
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m160651S3(soj0 soj0Var) {
    }

    /* JADX INFO: renamed from: V3 */
    public final aq2 m160654V3(boolean z) {
        return this.f140090k ? j2g0.m139457d(0.35f, z) : j2g0.m139458e(z);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m160655W3(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.invite) {
            new ato0(this.f188512e.f77095a, this, m160654V3(false)).m98855V(voiceCpBindMessage);
            return;
        }
        if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.agree) {
            new lpo0(this.f188512e.f77095a, this, m160654V3(true)).m150897O(voiceCpBindMessage);
            m206028F2().VoiceSweetEvent.undateRecommendUser().m172467p();
        } else if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.refuse) {
            new sso0(this.f188512e.f77095a, this, m160654V3(true)).m185771L(voiceCpBindMessage);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m160656X3(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        new tto0(this.f188512e.f77095a, this, m160654V3(true)).m190615M(voiceCpHouseUpgradeMessage);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m160657Y3(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        m206028F2().VoiceSweetEvent.showSweetCpDialog().mo172463j(voiceCpBindMessage);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m160658Z3(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, boolean z) {
        bno0.m102817t(this.f140089j.f77102h.m149814k(), z ? "agree" : "refuse", voiceCpBindMessage.getOtherUserId()).subscribe(ffw.m121194e(new e30() { // from class: l.mqo0
            @Override // p149l.e30
            public final void call(Object obj) {
                nqo0.m160651S3((soj0) obj);
            }
        }, new z2k()));
        if (z) {
            npo0.m160529a(m206027E2().mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room");
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void m160659a4(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        m206028F2().VoiceSweetEvent.showSweetCpDialog().mo172463j(voiceCpBindMessage);
    }

    /* JADX INFO: renamed from: b4 */
    public void m160660b4(boolean z) {
        this.f140090k = z;
    }

    /* JADX INFO: renamed from: c4 */
    public void m160661c4(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        u4n0.m191752k(this, m206027E2().m132146l0().f56011id, str);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189136q1()).subscribe(ffw.m121197h(new e30() { // from class: l.kqo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124285a.m160655W3((VoiceSweet.VoiceCpBindMessage) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189142s1()).subscribe(ffw.m121197h(new e30() { // from class: l.lqo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129370a.m160656X3((VoiceSweet.VoiceCpHouseUpgradeMessage) obj);
            }
        }));
    }
}
