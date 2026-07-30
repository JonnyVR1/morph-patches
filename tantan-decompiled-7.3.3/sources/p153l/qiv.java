package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p051p1.mobile.putong.live.base.data.BLiveJsRoomInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameTask;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class qiv extends qct<oo2> implements twl {

    /* JADX INFO: renamed from: i */
    public final String f157888i;

    /* JADX INFO: renamed from: j */
    public String f157889j;

    public qiv(dum dumVar) {
        super(dumVar);
        this.f157888i = "LivingJsBridgePlug:";
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ String m176766K3(BLiveEnvelope bLiveEnvelope) {
        List<BLiveFanBase> list = bLiveEnvelope.data.fanbases;
        return jyb.m147479J(list) ? "" : list.get(0).f45211id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m176772W3(jsv jsvVar) {
        this.f157889j = null;
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: E1 */
    public void mo176773E1(crp0 crp0Var) {
        m213811F2().LiveBridgeImplEvent.jumpToRoom().mo199273j(crp0Var);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: H1 */
    public void mo176774H1(qqq qqqVar) {
        m213811F2().LiveBridgeImplEvent.nativeDialogController().mo199273j(qqqVar);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: I1 */
    public void mo176775I1(String str) {
        m213811F2().LiveBridgeImplEvent.showVoteResultDialog().mo199273j(str);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: L0 */
    public void mo176776L0(String str, String str2) {
        m213811F2().LiveBridgeImplEvent.jumpToProfile().mo199273j(new tsq(str, str2));
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: M */
    public void mo176777M(y20<String> y20Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taskDuration", m138856F3(new c5f0()));
        y20Var.call(jSONObject.toJSONString());
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: O1 */
    public void mo176778O1() {
        m213811F2().LiveBridgeImplEvent.showRechargeDialog().m199277p();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: R3 */
    public final String m176779R3() {
        String strMo118362A0 = m213810E2().mo118362A0();
        return (!TextUtils.equals(strMo118362A0, "live") && TextUtils.equals(strMo118362A0, BLiveAbsData.VOICE_LIVE)) ? "voice" : "video";
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: S0 */
    public void mo176780S0(String str) {
        if (NullChecker.m82486a(this.f196918e.f90822h)) {
            cxk.m113043b(this.f196918e.f90822h.mo183440n().f45172id, this.f196918e.f90822h.m168532l0().f56859id, str);
        } else {
            cxk.m113043b("unset", "unset", str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v11, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v15, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v29, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.oo2] */
    /* JADX INFO: renamed from: S3 */
    public final void m176781S3(boolean z, final y20<String> y20Var) {
        if (m213810E2() == 0 || m213810E2().mo183435j() == null) {
            cxk.m113042a("data() || data().getLive() == null.");
        } else {
            cxk.m113042a("isAnchor() is " + m213815L2() + ", and live id is " + m213810E2().mo183435j().f45171id);
        }
        if (m213810E2() == 0 || m213810E2().mo183440n() == null || m213810E2().mo183435j() == null) {
            y20Var.call(WeJson.EMPTY_MAP);
            return;
        }
        final BLiveJsRoomInfo bLiveJsRoomInfoNew_ = BLiveJsRoomInfo.new_();
        bLiveJsRoomInfoNew_.roomId = m213810E2().mo183440n().f45172id;
        bLiveJsRoomInfoNew_.liveId = m213810E2().mo183435j().f45171id;
        User userM168532l0 = m213810E2().m168532l0();
        if (userM168532l0 != null) {
            bLiveJsRoomInfoNew_.anchorId = userM168532l0.f56859id;
        }
        bLiveJsRoomInfoNew_.roomType = m176779R3();
        bLiveJsRoomInfoNew_.pageId = mo78457R2();
        bLiveJsRoomInfoNew_.fakeId = eb20.m120148a();
        bLiveJsRoomInfoNew_.liveMode = TextUtils.isEmpty(m213810E2().mo183435j().liveMode) ? "normal" : m213810E2().mo183435j().liveMode;
        if (z) {
            String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfoNew_);
            this.f157889j = strSerialize;
            y20Var.call(strSerialize);
        } else {
            if (m213810E2().mo118373p()) {
                String strUserId = uqb0.f180396b0.f170324a.userId();
                if (TextUtils.isEmpty(strUserId) || "null".equals(strUserId)) {
                    CrashHelper.m82479c(new Exception("JsRoomInfoPlug getAnchorFanbases"));
                }
                duringCreated(LivingNormalApiProvider.m72763t4(uqb0.f180396b0.f170324a.userId())).map(new qcj() { // from class: l.jiv
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return qiv.m176766K3((BLiveEnvelope) obj);
                    }
                }).subscribe(dhw.m115826e(new y20() { // from class: l.kiv
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f127035a.m176784U3(bLiveJsRoomInfoNew_, y20Var, (String) obj);
                    }
                }, new y20() { // from class: l.liv
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f132254a.m176786V3(bLiveJsRoomInfoNew_, y20Var, (Throwable) obj);
                    }
                }));
                return;
            }
            BLiveFanBase bLiveFanBaseM199846b = m213810E2().m168546r0().m199846b();
            bLiveJsRoomInfoNew_.fanBaseId = bLiveFanBaseM199846b == null ? "" : bLiveFanBaseM199846b.f45211id;
            String strSerialize2 = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfoNew_);
            this.f157889j = strSerialize2;
            y20Var.call(strSerialize2);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        hashCode();
        m213810E2().getClass();
        iiv.m140146c(this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ C22421c m176782T3(boolean z, String str, String str2, User user) {
        wrv wrvVar = zrv.f205799a;
        return wrvVar.m207662d(wrvVar.m207631D0(), user, z, "liveRoom", str, m213810E2().m202194o(), mo78457R2(), str2);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: U0 */
    public void mo176783U0(frq frqVar) {
        m213811F2().LiveBridgeImplEvent.userCardController().mo199273j(frqVar);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m176784U3(BLiveJsRoomInfo bLiveJsRoomInfo, y20 y20Var, String str) {
        bLiveJsRoomInfo.fanBaseId = str;
        String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfo);
        this.f157889j = strSerialize;
        y20Var.call(strSerialize);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: V0 */
    public void mo176785V0(String str, final String str2, final String str3, final String str4, final String str5, final boolean z, final y20<String> y20Var, final y20<String> y20Var2) {
        duringCreated((C22421c) LivingNormalApiProvider.m72737q5(str).flatMap(new qcj() { // from class: l.niv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f142168a.m176782T3(z, str3, str2, (User) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.oiv
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(str4);
            }
        }, new y20() { // from class: l.piv
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var2.call(str5);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m176786V3(BLiveJsRoomInfo bLiveJsRoomInfo, y20 y20Var, Throwable th) {
        if (wft.m206159b(1)) {
            y20Var.call(WeJson.EMPTY_MAP);
            return;
        }
        String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfo);
        this.f157889j = strSerialize;
        y20Var.call(strSerialize);
        CrashHelper.m82480d(th, 1000);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: W */
    public void mo176787W() {
        m213811F2().LiveBridgeImplEvent.closeLiveCampaignDialog().m199277p();
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: X */
    public void mo176788X(rz4 rz4Var) {
        m213811F2().LiveBridgeImplEvent.sendChatMessage().mo199273j(rz4Var);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: Z1 */
    public void mo176789Z1() {
        m213811F2().VoiceVirtualLiveEvent.openSharePanelDialog().m199277p();
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: f0 */
    public void mo131188f0(bcg0 bcg0Var) {
        m213811F2().LiveBridgeImplEvent.subscribeCampaign().mo199273j(bcg0Var);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: j0 */
    public void mo176790j0(drq drqVar) {
        m213811F2().LiveBridgeImplEvent.fanBaseController().mo199273j(drqVar);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: j1 */
    public void mo131189j1(boolean z, y20<String> y20Var) {
        m176781S3(z, y20Var);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        hashCode();
        m213810E2().getClass();
        iiv.m140144a(this);
        this.f157889j = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (y6s.m214494b(m213810E2().mo183435j().liveMode) || m213815L2()) {
            return;
        }
        duringCreated(m213810E2().mo183449u()).subscribe(dhw.m115829h(new y20() { // from class: l.miv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137023a.m176772W3((jsv) obj);
            }
        }));
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: u0 */
    public void mo176791u0(String str) {
        m213811F2().LiveBridgeImplEvent.payFirstRecharge().mo199273j(Boolean.valueOf(str.equals("alipay")));
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: v */
    public void mo176792v(boolean z, String str, int i, int i2, int i3) {
        BLiveShootGameTask bLiveShootGameTaskNew_ = BLiveShootGameTask.new_();
        if (z) {
            bLiveShootGameTaskNew_.status = BLiveShootGameStatus.get(BLiveShootGameStatus.autoReceived);
        } else {
            bLiveShootGameTaskNew_.status = BLiveShootGameStatus.get(str);
        }
        bLiveShootGameTaskNew_.stage = i;
        bLiveShootGameTaskNew_.duration = i2;
        bLiveShootGameTaskNew_.ballCount = i3;
        m213811F2().ShootEvent.taskReceived().mo199273j(bLiveShootGameTaskNew_);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: v1 */
    public void mo176793v1() {
        m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0());
    }
}
