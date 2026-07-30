package p002l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p1.mobile.putong.live.base.data.BQuitLiveStayConfig;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.mqi0;
import l.s7m;
import l.tpd0;
import l.w9j;
import l.ypv;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ugt extends x6s<ho2, pgt> {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f20650j;

    /* JADX INFO: renamed from: k */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f20651k;

    /* JADX INFO: renamed from: l */
    public boolean f20652l;

    public ugt(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        this.f20650j = new zpd0("LiveRoomSuggestExitRetainDialog_show_time" + ypv.a.D0(), 0L);
        this.f20651k = new tpd0("LiveRoomSuggestExitRetainDialog_show_count" + ypv.a.D0(), 0);
        C(new pgt(bsmVar.f8332a, this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        this.f20652l = true;
        m25707N3(LivingNormalApiProvider.m4650M5(((DbObject) m25547E2().m14582l0()).id, TextUtils.isEmpty(m14194m3()) ? "" : m14194m3())).subscribe(ffw.e(new e30() { // from class: l.sgt
            public final void call(Object obj) {
                this.f19017a.m23464X3((LiveRoomSuggestBean) obj);
            }
        }, new e30() { // from class: l.tgt
            public final void call(Object obj) {
                this.f20233a.m23465Y3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public void m23462V3() {
        m25548F2().FragProxyEvent.clickClose().p();
    }

    /* JADX INFO: renamed from: W3 */
    public void m23463W3(String str, BLiveSuggestLive bLiveSuggestLive) {
        Intent intentM22252a = s91.m22252a(ypv.e, AudienceStartData.getBuilder().C(true).D(bLiveSuggestLive.expendToFullLive()).O("live-quit-popup").u());
        Act act = this.f22037f;
        if (act != null) {
            act.startActivity(intentM22252a);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m23464X3(LiveRoomSuggestBean liveRoomSuggestBean) {
        if (liveRoomSuggestBean.getLiveQuitPopup() != null && liveRoomSuggestBean.getLiveQuitPopup().giftInfo != null) {
            liveRoomSuggestBean.getLiveQuitPopup().giftInfo.eid = "e_live_exit_popup_toast";
            liveRoomSuggestBean.getLiveQuitPopup().giftInfo.pid = "p_live_exit_popup";
            m25548F2().CustomToastEvent.showCustomToast().j(liveRoomSuggestBean.getLiveQuitPopup().giftInfo);
        }
        ((pgt) ((bwr) this).viewModel).m20290M(liveRoomSuggestBean);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m23465Y3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.w(R$string.f3203c3);
            } else {
                lsi0.y(coreService.metaMessage);
            }
        } else {
            lsi0.w(R$string.f3203c3);
        }
        ((pgt) ((bwr) this).viewModel).m20288I(true);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m23466Z3(k7d0 k7d0Var) {
        return Boolean.valueOf(m23467a4());
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public boolean m23467a4() {
        boolean z;
        if (this.f20652l) {
            return false;
        }
        if (!TextUtils.isEmpty(jbd0.f13666r) && !TextUtils.equals(jbd0.f13666r, "LiveRoomSuggestExitRetainDialog")) {
            return false;
        }
        BQuitLiveStayConfig bQuitLiveStayConfigF5 = ypv.k().f5();
        if (bQuitLiveStayConfigF5 == null || !bQuitLiveStayConfigF5.on) {
            lsi0.r("livesetting开关false");
            return false;
        }
        long jLongValue = ((Long) this.f20650j.get()).longValue();
        int iIntValue = ((Integer) this.f20651k.get()).intValue();
        if (jLongValue != mqi0.n()) {
            z = false;
        } else {
            if (iIntValue >= bQuitLiveStayConfigF5.popupLimit) {
                lsi0.r("弹的次数超了");
                return false;
            }
            z = true;
        }
        if (LiveWatchCounter.h().i() > bQuitLiveStayConfigF5.watchLiveCount) {
            lsi0.r("观看的房间数超了");
            return false;
        }
        if (m25547E2().m14606v1() > bQuitLiveStayConfigF5.watchLiveDuration || LiveWatchCounter.h().k(1) > bQuitLiveStayConfigF5.watchLiveDuration * 1000) {
            lsi0.r("观看时间超了");
            return false;
        }
        ((pgt) ((bwr) this).viewModel).m5211E();
        jbd0.f13666r = "LiveRoomSuggestExitRetainDialog";
        tpd0 tpd0Var = this.f20651k;
        if (z) {
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        } else {
            tpd0Var.put(1);
        }
        this.f20650j.put(Long.valueOf(mqi0.n()));
        return true;
    }

    /* JADX INFO: renamed from: b4 */
    public void m23468b4(boolean z, String str) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((pgt) s7mVar).m20289L(z, str);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m23469t() {
        super.t();
        this.f20652l = false;
        m14188d3(k7d0.class, new w9j() { // from class: l.rgt
            public final Object call(Object obj) {
                return this.f18513a.m23466Z3((k7d0) obj);
            }
        });
    }
}
