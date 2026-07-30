package p149l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BQuitLiveStayConfig;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;

/* JADX INFO: loaded from: classes4.dex */
public class ugt extends x6s<ho2, pgt> {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f176451j;

    /* JADX INFO: renamed from: k */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f176452k;

    /* JADX INFO: renamed from: l */
    public boolean f176453l;

    public ugt(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        this.f176451j = new zpd0("LiveRoomSuggestExitRetainDialog_show_time" + ypv.f199493a.m199309D0(), 0L);
        this.f176452k = new tpd0("LiveRoomSuggestExitRetainDialog_show_count" + ypv.f199493a.m199309D0(), 0);
        mo51532C(new pgt(bsmVar.f77095a, this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        this.f176453l = true;
        m207199N3(LivingNormalApiProvider.m71284M5(m206027E2().m132146l0().f56011id, TextUtils.isEmpty(m129307m3()) ? "" : m129307m3())).subscribe(ffw.m121194e(new e30() { // from class: l.sgt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164478a.m193580X3((LiveRoomSuggestBean) obj);
            }
        }, new e30() { // from class: l.tgt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170127a.m193581Y3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public void m193578V3() {
        m206028F2().FragProxyEvent.clickClose().m172467p();
    }

    /* JADX INFO: renamed from: W3 */
    public void m193579W3(String str, BLiveSuggestLive bLiveSuggestLive) {
        Intent intentM182688a = s91.m182688a(ypv.f199497e, AudienceStartData.getBuilder().m67592C(true).m67593D(bLiveSuggestLive.expendToFullLive()).m67604O("live-quit-popup").m67611u());
        Act act = this.f188513f;
        if (act != null) {
            act.startActivity(intentM182688a);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m193580X3(LiveRoomSuggestBean liveRoomSuggestBean) {
        if (liveRoomSuggestBean.getLiveQuitPopup() != null && liveRoomSuggestBean.getLiveQuitPopup().giftInfo != null) {
            liveRoomSuggestBean.getLiveQuitPopup().giftInfo.eid = "e_live_exit_popup_toast";
            liveRoomSuggestBean.getLiveQuitPopup().giftInfo.pid = "p_live_exit_popup";
            m206028F2().CustomToastEvent.showCustomToast().mo172463j(liveRoomSuggestBean.getLiveQuitPopup().giftInfo);
        }
        ((pgt) this.viewModel).m168900M(liveRoomSuggestBean);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m193581Y3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151593w(R$string.f47161c3);
            } else {
                lsi0.m151595y(coreService.metaMessage);
            }
        } else {
            lsi0.m151593w(R$string.f47161c3);
        }
        ((pgt) this.viewModel).m168898I(true);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m193582Z3(k7d0 k7d0Var) {
        return Boolean.valueOf(m193583a4());
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public boolean m193583a4() {
        boolean z;
        if (this.f176453l) {
            return false;
        }
        if (!TextUtils.isEmpty(jbd0.f117177r) && !TextUtils.equals(jbd0.f117177r, "LiveRoomSuggestExitRetainDialog")) {
            return false;
        }
        BQuitLiveStayConfig bQuitLiveStayConfigM195832f5 = ypv.m215672k().m195832f5();
        if (bQuitLiveStayConfigM195832f5 == null || !bQuitLiveStayConfigM195832f5.f44516on) {
            lsi0.m151588r("livesetting开关false");
            return false;
        }
        long jLongValue = this.f176451j.get().longValue();
        int iIntValue = this.f176452k.get().intValue();
        if (jLongValue != mqi0.m155943n()) {
            z = false;
        } else {
            if (iIntValue >= bQuitLiveStayConfigM195832f5.popupLimit) {
                lsi0.m151588r("弹的次数超了");
                return false;
            }
            z = true;
        }
        if (LiveWatchCounter.m76330h().m76334i() > bQuitLiveStayConfigM195832f5.watchLiveCount) {
            lsi0.m151588r("观看的房间数超了");
            return false;
        }
        if (m206027E2().m132170v1() > bQuitLiveStayConfigM195832f5.watchLiveDuration || LiveWatchCounter.m76330h().m76336k(1) > bQuitLiveStayConfigM195832f5.watchLiveDuration * 1000) {
            lsi0.m151588r("观看时间超了");
            return false;
        }
        ((pgt) this.viewModel).m71834E();
        jbd0.f117177r = "LiveRoomSuggestExitRetainDialog";
        tpd0 tpd0Var = this.f176452k;
        if (z) {
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        } else {
            tpd0Var.put(1);
        }
        this.f176451j.put(Long.valueOf(mqi0.m155943n()));
        return true;
    }

    /* JADX INFO: renamed from: b4 */
    public void m193584b4(boolean z, String str) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((pgt) v2).m168899L(z, str);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        this.f176453l = false;
        m129301d3(k7d0.class, new w9j() { // from class: l.rgt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159287a.m193582Z3((k7d0) obj);
            }
        });
    }
}
