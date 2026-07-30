package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveSummary;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.other.liveend.LiveEndAct;

/* JADX INFO: loaded from: classes5.dex */
public class aas extends ar2<das> {

    /* JADX INFO: renamed from: a */
    public BLive f69165a;

    /* JADX INFO: renamed from: b */
    public User f69166b;

    /* JADX INFO: renamed from: c */
    public String f69167c;

    /* JADX INFO: renamed from: d */
    public Act f69168d;

    public aas(Act act) {
        super(act);
        this.f69168d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m96659i0(Bundle bundle) {
        ((das) this.viewModel).m115135e(this.f69168d, this.f69167c);
        duringCreated(LivingNormalApiProvider.m72728p5(this.f69165a.f45171id)).map(new qcj() { // from class: l.x9s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192958a.m96660k0((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.y9s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198122a.m96661l0((BLiveSummary) obj);
            }
        }, new y20() { // from class: l.z9s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203510a.m96662m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ BLiveSummary m96660k0(BLiveEnvelope bLiveEnvelope) {
        if (!jyb.m147479J(bLiveEnvelope.data.liveSummaries)) {
            return bLiveEnvelope.data.liveSummaries.get(0);
        }
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = this.f69165a.rewardPoint;
        return bLiveSummaryNew_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m96661l0(BLiveSummary bLiveSummary) {
        ((das) this.viewModel).m115134d(this.f69166b, bLiveSummary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m96662m0(Throwable th) {
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = this.f69165a.rewardPoint;
        ((das) this.viewModel).m115134d(this.f69166b, bLiveSummaryNew_);
        o1j0.m165634h(R$string.f47568H9);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.w9s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188057a.m96659i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public l4g0 m96663j0() {
        l4g0 l4g0Var = new l4g0("p_anchor_live_end", LiveEndAct.class.getName());
        l4g0Var.m152781p(pf60.m172085a("liveId", this.f69165a.f45171id), pf60.m172085a("anchorId", this.f69166b.f56859id));
        return l4g0Var;
    }

    /* JADX INFO: renamed from: n0 */
    public void m96664n0(User user, BLive bLive, String str) {
        this.f69166b = user;
        this.f69165a = bLive;
        this.f69167c = str;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
