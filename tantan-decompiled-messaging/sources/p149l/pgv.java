package p149l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p046p1.mobile.putong.live.base.data.BLiveJsRoomInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameTask;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class pgv extends pat<ho2> implements ful {

    /* JADX INFO: renamed from: i */
    public final String f148830i;

    /* JADX INFO: renamed from: j */
    public String f148831j;

    public pgv(bsm bsmVar) {
        super(bsmVar);
        this.f148830i = "LivingJsBridgePlug:";
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ String m168904K3(BLiveEnvelope bLiveEnvelope) {
        List<BLiveFanBase> list = bLiveEnvelope.data.fanbases;
        return vwb.m200296J(list) ? "" : list.get(0).f44363id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m168910W3(iqv iqvVar) {
        this.f148831j = null;
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: E1 */
    public void mo123189E1(zhp0 zhp0Var) {
        m206028F2().LiveBridgeImplEvent.jumpToRoom().mo172463j(zhp0Var);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: H1 */
    public void mo123190H1(qoq qoqVar) {
        m206028F2().LiveBridgeImplEvent.nativeDialogController().mo172463j(qoqVar);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: I1 */
    public void mo123191I1(String str) {
        m206028F2().LiveBridgeImplEvent.showVoteResultDialog().mo172463j(str);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: L0 */
    public void mo123192L0(String str, String str2) {
        m206028F2().LiveBridgeImplEvent.jumpToProfile().mo172463j(new sqq(str, str2));
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: M */
    public void mo123193M(e30<String> e30Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taskDuration", m129297F3(new vwe0()));
        e30Var.call(jSONObject.toJSONString());
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: O1 */
    public void mo123194O1() {
        m206028F2().LiveBridgeImplEvent.showRechargeDialog().m172467p();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public final String m168911R3() {
        String strMo132054A0 = m206027E2().mo132054A0();
        return (!TextUtils.equals(strMo132054A0, "live") && TextUtils.equals(strMo132054A0, BLiveAbsData.VOICE_LIVE)) ? "voice" : "video";
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: S0 */
    public void mo123195S0(String str) {
        if (NullChecker.m81303a(this.f188512e.f77102h)) {
            muk.m156416b(this.f188512e.f77102h.mo149817n().f44324id, this.f188512e.f77102h.m132146l0().f56011id, str);
        } else {
            muk.m156416b("unset", "unset", str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v11, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v15, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v29, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ho2] */
    /* JADX INFO: renamed from: S3 */
    public final void m168912S3(boolean z, final e30<String> e30Var) {
        if (m206027E2() == 0 || m206027E2().mo149813j() == null) {
            muk.m156415a("data() || data().getLive() == null.");
        } else {
            muk.m156415a("isAnchor() is " + m206032L2() + ", and live id is " + m206027E2().mo149813j().f44323id);
        }
        if (m206027E2() == 0 || m206027E2().mo149817n() == null || m206027E2().mo149813j() == null) {
            e30Var.call(WeJson.EMPTY_MAP);
            return;
        }
        final BLiveJsRoomInfo bLiveJsRoomInfoNew_ = BLiveJsRoomInfo.new_();
        bLiveJsRoomInfoNew_.roomId = m206027E2().mo149817n().f44324id;
        bLiveJsRoomInfoNew_.liveId = m206027E2().mo149813j().f44323id;
        User userM132146l0 = m206027E2().m132146l0();
        if (userM132146l0 != null) {
            bLiveJsRoomInfoNew_.anchorId = userM132146l0.f56011id;
        }
        bLiveJsRoomInfoNew_.roomType = m168911R3();
        bLiveJsRoomInfoNew_.pageId = mo77274R2();
        bLiveJsRoomInfoNew_.fakeId = w220.m201014a();
        bLiveJsRoomInfoNew_.liveMode = TextUtils.isEmpty(m206027E2().mo149813j().liveMode) ? "normal" : m206027E2().mo149813j().liveMode;
        if (z) {
            String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfoNew_);
            this.f148831j = strSerialize;
            e30Var.call(strSerialize);
        } else {
            if (m206027E2().mo97490p()) {
                String strUserId = qib0.f154713b0.f139230a.userId();
                if (TextUtils.isEmpty(strUserId) || "null".equals(strUserId)) {
                    CrashHelper.m81296c(new Exception("JsRoomInfoPlug getAnchorFanbases"));
                }
                duringCreated(LivingNormalApiProvider.m71580t4(qib0.f154713b0.f139230a.userId())).map(new w9j() { // from class: l.igv
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return pgv.m168904K3((BLiveEnvelope) obj);
                    }
                }).subscribe(ffw.m121194e(new e30() { // from class: l.jgv
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f117848a.m168914U3(bLiveJsRoomInfoNew_, e30Var, (String) obj);
                    }
                }, new e30() { // from class: l.kgv
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f123097a.m168915V3(bLiveJsRoomInfoNew_, e30Var, (Throwable) obj);
                    }
                }));
                return;
            }
            BLiveFanBase bLiveFanBaseM129237b = m206027E2().m132161r0().m129237b();
            bLiveJsRoomInfoNew_.fanBaseId = bLiveFanBaseM129237b == null ? "" : bLiveFanBaseM129237b.f44363id;
            String strSerialize2 = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfoNew_);
            this.f148831j = strSerialize2;
            e30Var.call(strSerialize2);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        hashCode();
        m206027E2().getClass();
        hgv.m130925c(this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ C22306c m168913T3(boolean z, String str, String str2, User user) {
        vpv vpvVar = ypv.f199493a;
        return vpvVar.m199340d(vpvVar.m199309D0(), user, z, "liveRoom", str, m206027E2().m149818o(), mo77274R2(), str2);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: U0 */
    public void mo123196U0(fpq fpqVar) {
        m206028F2().LiveBridgeImplEvent.userCardController().mo172463j(fpqVar);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m168914U3(BLiveJsRoomInfo bLiveJsRoomInfo, e30 e30Var, String str) {
        bLiveJsRoomInfo.fanBaseId = str;
        String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfo);
        this.f148831j = strSerialize;
        e30Var.call(strSerialize);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: V0 */
    public void mo123197V0(String str, final String str2, final String str3, final String str4, final String str5, final boolean z, final e30<String> e30Var, final e30<String> e30Var2) {
        duringCreated((C22306c) LivingNormalApiProvider.m71554q5(str).flatMap(new w9j() { // from class: l.mgv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133734a.m168913T3(z, str3, str2, (User) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.ngv
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(str4);
            }
        }, new e30() { // from class: l.ogv
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var2.call(str5);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m168915V3(BLiveJsRoomInfo bLiveJsRoomInfo, e30 e30Var, Throwable th) {
        if (vdt.m198092b(1)) {
            e30Var.call(WeJson.EMPTY_MAP);
            return;
        }
        String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfo);
        this.f148831j = strSerialize;
        e30Var.call(strSerialize);
        CrashHelper.m81297d(th, 1000);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: W */
    public void mo123198W() {
        m206028F2().LiveBridgeImplEvent.closeLiveCampaignDialog().m172467p();
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: X */
    public void mo123199X(sy4 sy4Var) {
        m206028F2().LiveBridgeImplEvent.sendChatMessage().mo172463j(sy4Var);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: Z1 */
    public void mo123200Z1() {
        m206028F2().VoiceVirtualLiveEvent.openSharePanelDialog().m172467p();
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: f0 */
    public void mo122256f0(u3g0 u3g0Var) {
        m206028F2().LiveBridgeImplEvent.subscribeCampaign().mo172463j(u3g0Var);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: j0 */
    public void mo123201j0(dpq dpqVar) {
        m206028F2().LiveBridgeImplEvent.fanBaseController().mo172463j(dpqVar);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: j1 */
    public void mo122257j1(boolean z, e30<String> e30Var) {
        m168912S3(z, e30Var);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        hashCode();
        m206027E2().getClass();
        hgv.m130923a(this);
        this.f148831j = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (x4s.m207012b(m206027E2().mo149813j().liveMode) || m206032L2()) {
            return;
        }
        duringCreated(m206027E2().mo149823u()).subscribe(ffw.m121197h(new e30() { // from class: l.lgv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128018a.m168910W3((iqv) obj);
            }
        }));
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: u0 */
    public void mo123202u0(String str) {
        m206028F2().LiveBridgeImplEvent.payFirstRecharge().mo172463j(Boolean.valueOf(str.equals("alipay")));
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: v */
    public void mo123203v(boolean z, String str, int i, int i2, int i3) {
        BLiveShootGameTask bLiveShootGameTaskNew_ = BLiveShootGameTask.new_();
        if (z) {
            bLiveShootGameTaskNew_.status = BLiveShootGameStatus.get(BLiveShootGameStatus.autoReceived);
        } else {
            bLiveShootGameTaskNew_.status = BLiveShootGameStatus.get(str);
        }
        bLiveShootGameTaskNew_.stage = i;
        bLiveShootGameTaskNew_.duration = i2;
        bLiveShootGameTaskNew_.ballCount = i3;
        m206028F2().ShootEvent.taskReceived().mo172463j(bLiveShootGameTaskNew_);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: v1 */
    public void mo123204v1() {
        m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0());
    }
}
