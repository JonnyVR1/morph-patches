package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.other.liveend.IntlLiveEndAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveOwner;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.data.BLiveSummary;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import l.cwf0;
import l.e30;
import l.ffw;
import l.fld0;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.tpv;
import l.vwb;
import l.w9j;
import l.ypv;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kun extends jq2<mun> {

    /* JADX INFO: renamed from: a */
    public BLive f14539a;

    /* JADX INFO: renamed from: b */
    public User f14540b;

    /* JADX INFO: renamed from: c */
    public String f14541c;

    /* JADX INFO: renamed from: d */
    public Act f14542d;

    public kun(Act act) {
        super(act);
        this.f14542d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public void m16816k0(Bundle bundle) {
        ((mun) ((jq2) this).viewModel).m18202j(this.f14542d, this.f14541c);
        duringCreated(LivingNormalApiProvider.m4911p5(((BLiveAbsData) this.f14539a).id)).map(new w9j() { // from class: l.fun
            public final Object call(Object obj) {
                return this.f10640a.m16819m0((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.gun
            public final void call(Object obj) {
                this.f11632a.m16820n0((BLiveSummary) obj);
            }
        }, new e30() { // from class: l.hun
            public final void call(Object obj) {
                this.f12274a.m16821o0((Throwable) obj);
            }
        }));
        duringCreated(((tpv) ypv.l(fld0.d)).b()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.iun
            public final void call(Object obj) {
                this.f13419a.m16822p0((BLiveRoom) obj);
            }
        }));
        BLiveOwner bLiveOwner = ((BLiveAbsData) this.f14539a).room;
        if (bLiveOwner != null) {
            m16824r0(bLiveOwner.id);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m16817a0() {
        creates(new e30() { // from class: l.eun
            public final void call(Object obj) {
                this.f9972a.m16816k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public cwf0 m16818l0() {
        cwf0 cwf0Var = new cwf0("p_anchor_live_end", IntlLiveEndAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveId", ((BLiveAbsData) this.f14539a).id);
            jSONObject.put("anchorId", ((DbObject) this.f14540b).id);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        cwf0Var.o(jSONObject);
        return cwf0Var;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ BLiveSummary m16819m0(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.J(bLiveEnvelope.data.liveSummaries)) {
            return (BLiveSummary) bLiveEnvelope.data.liveSummaries.get(0);
        }
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = ((BLiveAbsData) this.f14539a).rewardPoint;
        return bLiveSummaryNew_;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m16820n0(BLiveSummary bLiveSummary) {
        ((mun) ((jq2) this).viewModel).m18200i(this.f14540b, bLiveSummary);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m16821o0(Throwable th) {
        BLiveSummary bLiveSummaryNew_ = BLiveSummary.new_();
        bLiveSummaryNew_.rewardPoint = ((BLiveAbsData) this.f14539a).rewardPoint;
        ((mun) ((jq2) this).viewModel).m18200i(this.f14540b, bLiveSummaryNew_);
        lsi0.h(R$string.f2762H9);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m16822p0(BLiveRoom bLiveRoom) {
        ((mun) ((jq2) this).viewModel).m18199f(bLiveRoom);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m16823q0(BLiveRoom bLiveRoom) {
        ((mun) ((jq2) this).viewModel).m18199f(bLiveRoom);
    }

    /* JADX INFO: renamed from: r0 */
    public void m16824r0(String str) {
        duringCreated(LivingNormalApiProvider.m4695R5(str)).subscribe(ffw.h(new e30() { // from class: l.jun
            public final void call(Object obj) {
                this.f14027a.m16823q0((BLiveRoom) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m16825s0(User user, BLive bLive, String str) {
        this.f14540b = user;
        this.f14539a = bLive;
        this.f14541c = str;
    }

    public void destroy() {
    }
}
