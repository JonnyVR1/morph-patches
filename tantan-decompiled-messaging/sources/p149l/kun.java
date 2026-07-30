package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSummary;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.other.liveend.IntlLiveEndAct;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class kun extends jq2<mun> {

    /* JADX INFO: renamed from: a */
    public BLive f124700a;

    /* JADX INFO: renamed from: b */
    public User f124701b;

    /* JADX INFO: renamed from: c */
    public String f124702c;

    /* JADX INFO: renamed from: d */
    public Act f124703d;

    public kun(Act act) {
        super(act);
        this.f124703d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public void m147279k0(Bundle bundle) {
        ((mun) this.viewModel).m156425j(this.f124703d, this.f124702c);
        duringCreated(LivingNormalApiProvider.m71545p5(this.f124700a.f44323id)).map(new w9j() { // from class: l.fun
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f99352a.m147281m0((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.gun
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104420a.m147282n0((BLiveSummary) obj);
            }
        }, new e30() { // from class: l.hun
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109576a.m147283o0((Throwable) obj);
            }
        }));
        duringCreated(((tpv) ypv.m215673l(fld0.f98149d)).m190063b()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.iun
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115033a.m147284p0((BLiveRoom) obj);
            }
        }));
        BLiveOwner bLiveOwner = this.f124700a.room;
        if (bLiveOwner != null) {
            m147286r0(bLiveOwner.f44419id);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.eun
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93264a.m147279k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public cwf0 m147280l0() {
        cwf0 cwf0Var = new cwf0("p_anchor_live_end", IntlLiveEndAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveId", this.f124700a.f44323id);
            jSONObject.put("anchorId", this.f124701b.f56011id);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        cwf0Var.m109039o(jSONObject);
        return cwf0Var;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ BLiveSummary m147281m0(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.m200296J(bLiveEnvelope.data.liveSummaries)) {
            return bLiveEnvelope.data.liveSummaries.get(0);
        }
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = this.f124700a.rewardPoint;
        return bLiveSummaryNew_;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m147282n0(BLiveSummary bLiveSummary) {
        ((mun) this.viewModel).m156424i(this.f124701b, bLiveSummary);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m147283o0(Throwable th) {
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = this.f124700a.rewardPoint;
        ((mun) this.viewModel).m156424i(this.f124701b, bLiveSummaryNew_);
        lsi0.m151578h(R$string.f46720H9);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m147284p0(BLiveRoom bLiveRoom) {
        ((mun) this.viewModel).m156423f(bLiveRoom);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m147285q0(BLiveRoom bLiveRoom) {
        ((mun) this.viewModel).m156423f(bLiveRoom);
    }

    /* JADX INFO: renamed from: r0 */
    public void m147286r0(String str) {
        duringCreated(LivingNormalApiProvider.m71329R5(str)).subscribe(ffw.m121197h(new e30() { // from class: l.jun
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119799a.m147285q0((BLiveRoom) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m147287s0(User user, BLive bLive, String str) {
        this.f124701b = user;
        this.f124700a = bLive;
        this.f124702c = str;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
