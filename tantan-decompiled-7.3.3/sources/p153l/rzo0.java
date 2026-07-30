package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import p153l.oo2;

/* JADX INFO: loaded from: classes10.dex */
public class rzo0<D extends oo2> extends y8s<D, qct> {

    /* JADX INFO: renamed from: j */
    public dum f165560j;

    /* JADX INFO: renamed from: k */
    public boolean f165561k;

    public rzo0(dum dumVar) {
        super(dumVar);
        this.f165560j = dumVar;
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m183804S3(vxj0 vxj0Var) {
    }

    /* JADX INFO: renamed from: V3 */
    public final rq2 m183807V3(boolean z) {
        return this.f165561k ? qag0.m175923d(0.35f, z) : qag0.m175924e(z);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m183808W3(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.invite) {
            new e2p0(this.f196918e.f90815a, this, m183807V3(false)).m119151V(voiceCpBindMessage);
            return;
        }
        if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.agree) {
            new pyo0(this.f196918e.f90815a, this, m183807V3(true)).m174321O(voiceCpBindMessage);
            m213811F2().VoiceSweetEvent.undateRecommendUser().m199277p();
        } else if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.refuse) {
            new w1p0(this.f196918e.f90815a, this, m183807V3(true)).m204468L(voiceCpBindMessage);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m183809X3(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        new x2p0(this.f196918e.f90815a, this, m183807V3(true)).m209169M(voiceCpHouseUpgradeMessage);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m183810Y3(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        m213811F2().VoiceSweetEvent.showSweetCpDialog().mo199273j(voiceCpBindMessage);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m183811Z3(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, boolean z) {
        fwo0.m127827t(this.f165560j.f90822h.m202191k(), z ? "agree" : "refuse", voiceCpBindMessage.getOtherUserId()).subscribe(dhw.m115826e(new y20() { // from class: l.qzo0
            @Override // p153l.y20
            public final void call(Object obj) {
                rzo0.m183804S3((vxj0) obj);
            }
        }, new r5k()));
        if (z) {
            ryo0.m183630a(m213810E2().mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room");
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void m183812a4(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        m213811F2().VoiceSweetEvent.showSweetCpDialog().mo199273j(voiceCpBindMessage);
    }

    /* JADX INFO: renamed from: b4 */
    public void m183813b4(boolean z) {
        this.f165561k = z;
    }

    /* JADX INFO: renamed from: c4 */
    public void m183814c4(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        ydn0.m215258k(this, m213810E2().m168532l0().f56859id, str);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98318q1()).subscribe(dhw.m115829h(new y20() { // from class: l.ozo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149939a.m183808W3((VoiceSweet.VoiceCpBindMessage) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98324s1()).subscribe(dhw.m115829h(new y20() { // from class: l.pzo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154944a.m183809X3((VoiceSweet.VoiceCpHouseUpgradeMessage) obj);
            }
        }));
    }
}
