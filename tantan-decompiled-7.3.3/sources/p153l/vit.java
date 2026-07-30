package p153l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BQuitLiveStayConfig;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;

/* JADX INFO: loaded from: classes4.dex */
public class vit extends y8s<oo2, qit> {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public byd0 f184321j;

    /* JADX INFO: renamed from: k */
    @SuppressLint({"SV_USE_DUP_ID"})
    public vxd0 f184322k;

    /* JADX INFO: renamed from: l */
    public boolean f184323l;

    public vit(dum<? extends oo2> dumVar) {
        super(dumVar);
        this.f184321j = new byd0("LiveRoomSuggestExitRetainDialog_show_time" + zrv.f205799a.m207631D0(), 0L);
        this.f184322k = new vxd0("LiveRoomSuggestExitRetainDialog_show_count" + zrv.f205799a.m207631D0(), 0);
        mo52715C(new qit(dumVar.f90815a, this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        this.f184323l = true;
        m214779N3(LivingNormalApiProvider.m72467M5(m213810E2().m168532l0().f56859id, TextUtils.isEmpty(m138866m3()) ? "" : m138866m3())).subscribe(dhw.m115826e(new y20() { // from class: l.tit
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174507a.m201420X3((LiveRoomSuggestBean) obj);
            }
        }, new y20() { // from class: l.uit
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179146a.m201421Y3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public void m201418V3() {
        m213811F2().FragProxyEvent.clickClose().m199277p();
    }

    /* JADX INFO: renamed from: W3 */
    public void m201419W3(String str, BLiveSuggestLive bLiveSuggestLive) {
        Intent intentM219041a = z91.m219041a(zrv.f205803e, AudienceStartData.getBuilder().m68775C(true).m68776D(bLiveSuggestLive.expendToFullLive()).m68787O("live-quit-popup").m68794u());
        Act act = this.f196919f;
        if (act != null) {
            act.startActivity(intentM219041a);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m201420X3(LiveRoomSuggestBean liveRoomSuggestBean) {
        if (liveRoomSuggestBean.getLiveQuitPopup() != null && liveRoomSuggestBean.getLiveQuitPopup().giftInfo != null) {
            liveRoomSuggestBean.getLiveQuitPopup().giftInfo.eid = "e_live_exit_popup_toast";
            liveRoomSuggestBean.getLiveQuitPopup().giftInfo.pid = "p_live_exit_popup";
            m213811F2().CustomToastEvent.showCustomToast().mo199273j(liveRoomSuggestBean.getLiveQuitPopup().giftInfo);
        }
        ((qit) this.viewModel).m176764M(liveRoomSuggestBean);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m201421Y3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165649w(R$string.f48009c3);
            } else {
                o1j0.m165651y(coreService.metaMessage);
            }
        } else {
            o1j0.m165649w(R$string.f48009c3);
        }
        ((qit) this.viewModel).m176762I(true);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m201422Z3(nfd0 nfd0Var) {
        return Boolean.valueOf(m201423a4());
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [l.oo2] */
    /* JADX INFO: renamed from: a4 */
    public boolean m201423a4() {
        boolean z;
        if (this.f184323l) {
            return false;
        }
        if (!TextUtils.isEmpty(ljd0.f132319r) && !TextUtils.equals(ljd0.f132319r, "LiveRoomSuggestExitRetainDialog")) {
            return false;
        }
        BQuitLiveStayConfig bQuitLiveStayConfigM203619f5 = zrv.m221193k().m203619f5();
        if (bQuitLiveStayConfigM203619f5 == null || !bQuitLiveStayConfigM203619f5.f45364on) {
            o1j0.m165644r("livesetting开关false");
            return false;
        }
        long jLongValue = this.f184321j.get().longValue();
        int iIntValue = this.f184322k.get().intValue();
        if (jLongValue != pzi0.m174453n()) {
            z = false;
        } else {
            if (iIntValue >= bQuitLiveStayConfigM203619f5.popupLimit) {
                o1j0.m165644r("弹的次数超了");
                return false;
            }
            z = true;
        }
        if (LiveWatchCounter.m77513h().m77517i() > bQuitLiveStayConfigM203619f5.watchLiveCount) {
            o1j0.m165644r("观看的房间数超了");
            return false;
        }
        if (m213810E2().m168554v1() > bQuitLiveStayConfigM203619f5.watchLiveDuration || LiveWatchCounter.m77513h().m77519k(1) > bQuitLiveStayConfigM203619f5.watchLiveDuration * 1000) {
            o1j0.m165644r("观看时间超了");
            return false;
        }
        ((qit) this.viewModel).m73017E();
        ljd0.f132319r = "LiveRoomSuggestExitRetainDialog";
        vxd0 vxd0Var = this.f184322k;
        if (z) {
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        } else {
            vxd0Var.put(1);
        }
        this.f184321j.put(Long.valueOf(pzi0.m174453n()));
        return true;
    }

    /* JADX INFO: renamed from: b4 */
    public void m201424b4(boolean z, String str) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((qit) v2).m176763L(z, str);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        this.f184323l = false;
        m138860d3(nfd0.class, new qcj() { // from class: l.sit
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f168868a.m201422Z3((nfd0) obj);
            }
        });
    }
}
