package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.other.liveend.LiveEndAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveSummary;
import com.tantanapp.common.data.DbObject;
import l.cwf0;
import l.e30;
import l.ffw;
import l.j760;
import l.jq2;
import l.lsi0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z7s extends jq2<c8s> {

    /* JADX INFO: renamed from: a */
    public BLive f23296a;

    /* JADX INFO: renamed from: b */
    public User f23297b;

    /* JADX INFO: renamed from: c */
    public String f23298c;

    /* JADX INFO: renamed from: d */
    public Act f23299d;

    public z7s(Act act) {
        super(act);
        this.f23299d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m27115i0(Bundle bundle) {
        ((c8s) ((jq2) this).viewModel).m10907e(this.f23299d, this.f23298c);
        duringCreated(LivingNormalApiProvider.m4911p5(((BLiveAbsData) this.f23296a).id)).map(new w9j() { // from class: l.w7s
            public final Object call(Object obj) {
                return this.f21549a.m27116k0((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.x7s
            public final void call(Object obj) {
                this.f22162a.m27117l0((BLiveSummary) obj);
            }
        }, new e30() { // from class: l.y7s
            public final void call(Object obj) {
                this.f22734a.m27118m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ BLiveSummary m27116k0(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.J(bLiveEnvelope.data.liveSummaries)) {
            return (BLiveSummary) bLiveEnvelope.data.liveSummaries.get(0);
        }
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = ((BLiveAbsData) this.f23296a).rewardPoint;
        return bLiveSummaryNew_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m27117l0(BLiveSummary bLiveSummary) {
        ((c8s) ((jq2) this).viewModel).m10906d(this.f23297b, bLiveSummary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m27118m0(Throwable th) {
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = ((BLiveAbsData) this.f23296a).rewardPoint;
        ((c8s) ((jq2) this).viewModel).m10906d(this.f23297b, bLiveSummaryNew_);
        lsi0.h(R$string.f2762H9);
    }

    /* JADX INFO: renamed from: a0 */
    public void m27119a0() {
        creates(new e30() { // from class: l.v7s
            public final void call(Object obj) {
                this.f21027a.m27115i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public cwf0 m27120j0() {
        cwf0 cwf0Var = new cwf0("p_anchor_live_end", LiveEndAct.class.getName());
        cwf0Var.p(new j760[]{j760.a("liveId", ((BLiveAbsData) this.f23296a).id), j760.a("anchorId", ((DbObject) this.f23297b).id)});
        return cwf0Var;
    }

    /* JADX INFO: renamed from: n0 */
    public void m27121n0(User user, BLive bLive, String str) {
        this.f23297b = user;
        this.f23296a = bLive;
        this.f23298c = str;
    }

    public void destroy() {
    }
}
