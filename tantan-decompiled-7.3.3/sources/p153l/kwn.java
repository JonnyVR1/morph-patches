package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveSummary;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.other.liveend.IntlLiveEndAct;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class kwn extends ar2<mwn> {

    /* JADX INFO: renamed from: a */
    public BLive f129078a;

    /* JADX INFO: renamed from: b */
    public User f129079b;

    /* JADX INFO: renamed from: c */
    public String f129080c;

    /* JADX INFO: renamed from: d */
    public Act f129081d;

    public kwn(Act act) {
        super(act);
        this.f129081d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public void m151726k0(Bundle bundle) {
        ((mwn) this.viewModel).m160577j(this.f129081d, this.f129080c);
        duringCreated(LivingNormalApiProvider.m72728p5(this.f129078a.f45171id)).map(new qcj() { // from class: l.fwn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101185a.m151728m0((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.gwn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106856a.m151729n0((BLiveSummary) obj);
            }
        }, new y20() { // from class: l.hwn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111903a.m151730o0((Throwable) obj);
            }
        }));
        duringCreated(((urv) zrv.m221194l(htd0.f111522d)).m197666b()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.iwn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117283a.m151731p0((BLiveRoom) obj);
            }
        }));
        BLiveOwner bLiveOwner = this.f129078a.room;
        if (bLiveOwner != null) {
            m151733r0(bLiveOwner.f45267id);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.ewn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96176a.m151726k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public l4g0 m151727l0() {
        l4g0 l4g0Var = new l4g0("p_anchor_live_end", IntlLiveEndAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveId", this.f129078a.f45171id);
            jSONObject.put("anchorId", this.f129079b.f56859id);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        l4g0Var.m152780o(jSONObject);
        return l4g0Var;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ BLiveSummary m151728m0(BLiveEnvelope bLiveEnvelope) {
        if (!jyb.m147479J(bLiveEnvelope.data.liveSummaries)) {
            return bLiveEnvelope.data.liveSummaries.get(0);
        }
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = this.f129078a.rewardPoint;
        return bLiveSummaryNew_;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m151729n0(BLiveSummary bLiveSummary) {
        ((mwn) this.viewModel).m160576i(this.f129079b, bLiveSummary);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m151730o0(Throwable th) {
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = this.f129078a.rewardPoint;
        ((mwn) this.viewModel).m160576i(this.f129079b, bLiveSummaryNew_);
        o1j0.m165634h(R$string.f47568H9);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m151731p0(BLiveRoom bLiveRoom) {
        ((mwn) this.viewModel).m160575f(bLiveRoom);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m151732q0(BLiveRoom bLiveRoom) {
        ((mwn) this.viewModel).m160575f(bLiveRoom);
    }

    /* JADX INFO: renamed from: r0 */
    public void m151733r0(String str) {
        duringCreated(LivingNormalApiProvider.m72512R5(str)).subscribe(dhw.m115829h(new y20() { // from class: l.jwn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122945a.m151732q0((BLiveRoom) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m151734s0(User user, BLive bLive, String str) {
        this.f129079b = user;
        this.f129078a = bLive;
        this.f129080c = str;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
