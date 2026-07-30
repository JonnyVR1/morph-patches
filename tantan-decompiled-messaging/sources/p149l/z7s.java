package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveSummary;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.other.liveend.LiveEndAct;

/* JADX INFO: loaded from: classes4.dex */
public class z7s extends jq2<c8s> {

    /* JADX INFO: renamed from: a */
    public BLive f202070a;

    /* JADX INFO: renamed from: b */
    public User f202071b;

    /* JADX INFO: renamed from: c */
    public String f202072c;

    /* JADX INFO: renamed from: d */
    public Act f202073d;

    public z7s(Act act) {
        super(act);
        this.f202073d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m217498i0(Bundle bundle) {
        ((c8s) this.viewModel).m105817e(this.f202073d, this.f202072c);
        duringCreated(LivingNormalApiProvider.m71545p5(this.f202070a.f44323id)).map(new w9j() { // from class: l.w7s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185095a.m217499k0((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.x7s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191375a.m217500l0((BLiveSummary) obj);
            }
        }, new e30() { // from class: l.y7s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196728a.m217501m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ BLiveSummary m217499k0(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.m200296J(bLiveEnvelope.data.liveSummaries)) {
            return bLiveEnvelope.data.liveSummaries.get(0);
        }
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = this.f202070a.rewardPoint;
        return bLiveSummaryNew_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m217500l0(BLiveSummary bLiveSummary) {
        ((c8s) this.viewModel).m105816d(this.f202071b, bLiveSummary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m217501m0(Throwable th) {
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = this.f202070a.rewardPoint;
        ((c8s) this.viewModel).m105816d(this.f202071b, bLiveSummaryNew_);
        lsi0.m151578h(R$string.f46720H9);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.v7s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180415a.m217498i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public cwf0 m217502j0() {
        cwf0 cwf0Var = new cwf0("p_anchor_live_end", LiveEndAct.class.getName());
        cwf0Var.m109040p(j760.m140076a("liveId", this.f202070a.f44323id), j760.m140076a("anchorId", this.f202071b.f56011id));
        return cwf0Var;
    }

    /* JADX INFO: renamed from: n0 */
    public void m217503n0(User user, BLive bLive, String str) {
        this.f202071b = user;
        this.f202070a = bLive;
        this.f202072c = str;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
