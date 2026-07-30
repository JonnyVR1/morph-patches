package p009l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.tantanapp.common.data.DbObject;
import l.aq2;
import l.bsm;
import l.e30;
import l.ffw;
import l.ho2;
import l.j2g0;
import l.pat;
import l.soj0;
import l.u4n0;
import l.wxs;
import l.x6s;
import l.z2k;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nqo0<D extends ho2> extends x6s<D, pat> {

    /* JADX INFO: renamed from: j */
    public bsm f17618j;

    /* JADX INFO: renamed from: k */
    public boolean f17619k;

    public nqo0(bsm bsmVar) {
        super(bsmVar);
        this.f17618j = bsmVar;
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m19031S3(soj0 soj0Var) {
    }

    /* JADX INFO: renamed from: V3 */
    public final aq2 m19034V3(boolean z) {
        return this.f17619k ? j2g0.d(0.35f, z) : j2g0.e(z);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m19035W3(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.invite) {
            new ato0(((wxs) this).e.a, this, m19034V3(false)).m11641V(voiceCpBindMessage);
            return;
        }
        if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.agree) {
            new lpo0(((wxs) this).e.a, this, m19034V3(true)).m17982O(voiceCpBindMessage);
            F2().VoiceSweetEvent.undateRecommendUser().p();
        } else if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.refuse) {
            new sso0(((wxs) this).e.a, this, m19034V3(true)).m22380L(voiceCpBindMessage);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m19036X3(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        new tto0(((wxs) this).e.a, this, m19034V3(true)).m22669M(voiceCpHouseUpgradeMessage);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m19037Y3(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        F2().VoiceSweetEvent.showSweetCpDialog().j(voiceCpBindMessage);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m19038Z3(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, boolean z) {
        bno0.m12177t(this.f17618j.h.k(), z ? "agree" : "refuse", voiceCpBindMessage.getOtherUserId()).subscribe(ffw.e(new e30() { // from class: l.mqo0
            public final void call(Object obj) {
                nqo0.m19031S3((soj0) obj);
            }
        }, new z2k()));
        if (z) {
            npo0.m19003a(E2().p() ? "p_anchor_audio_room" : "p_user_audio_room");
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void m19039a4(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        F2().VoiceSweetEvent.showSweetCpDialog().j(voiceCpBindMessage);
    }

    /* JADX INFO: renamed from: b4 */
    public void m19040b4(boolean z) {
        this.f17619k = z;
    }

    /* JADX INFO: renamed from: c4 */
    public void m19041c4(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        u4n0.k(this, ((DbObject) E2().l0()).id, str);
    }

    /* JADX INFO: renamed from: t */
    public void m19042t() {
        super/*l.k4t*/.t();
        duringCreated(E2().q1().q1()).subscribe(ffw.h(new e30() { // from class: l.kqo0
            public final void call(Object obj) {
                this.f15818a.m19035W3((VoiceSweet.VoiceCpBindMessage) obj);
            }
        }));
        duringCreated(E2().q1().s1()).subscribe(ffw.h(new e30() { // from class: l.lqo0
            public final void call(Object obj) {
                this.f16307a.m19036X3((VoiceSweet.VoiceCpHouseUpgradeMessage) obj);
            }
        }));
    }
}
