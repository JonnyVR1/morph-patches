package p009l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p1.mobile.putong.live.base.data.BLiveJsRoomInfo;
import com.p1.mobile.putong.live.base.data.BLiveShootGameStatus;
import com.p1.mobile.putong.live.base.data.BLiveShootGameTask;
import com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bsm;
import l.e30;
import l.ffw;
import l.fpq;
import l.ful;
import l.ho2;
import l.iqv;
import l.muk;
import l.pat;
import l.qib0;
import l.sy4;
import l.vdt;
import l.vwb;
import l.vwe0;
import l.w220;
import l.w9j;
import l.wxs;
import l.x4s;
import l.xpm0;
import l.zhp0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pgv extends pat<ho2> implements ful {

    /* JADX INFO: renamed from: i */
    public final String f18579i;

    /* JADX INFO: renamed from: j */
    public String f18580j;

    public pgv(bsm bsmVar) {
        super(bsmVar);
        this.f18579i = "LivingJsBridgePlug:";
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ String m20262K3(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.fanbases;
        return vwb.J(list) ? "" : ((BLiveFanBase) list.get(0)).id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m20268W3(iqv iqvVar) {
        this.f18580j = null;
    }

    /* JADX INFO: renamed from: E1 */
    public void m20269E1(zhp0 zhp0Var) {
        F2().LiveBridgeImplEvent.jumpToRoom().j(zhp0Var);
    }

    /* JADX INFO: renamed from: H1 */
    public void m20270H1(qoq qoqVar) {
        F2().LiveBridgeImplEvent.nativeDialogController().j(qoqVar);
    }

    /* JADX INFO: renamed from: I1 */
    public void m20271I1(String str) {
        F2().LiveBridgeImplEvent.showVoteResultDialog().j(str);
    }

    /* JADX INFO: renamed from: L0 */
    public void m20272L0(String str, String str2) {
        F2().LiveBridgeImplEvent.jumpToProfile().j(new sqq(str, str2));
    }

    /* JADX INFO: renamed from: M */
    public void m20273M(e30<String> e30Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taskDuration", F3(new vwe0()));
        e30Var.call(jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: O1 */
    public void m20274O1() {
        F2().LiveBridgeImplEvent.showRechargeDialog().p();
    }

    /* JADX INFO: renamed from: R3 */
    public final String m20275R3() {
        String strA0 = E2().A0();
        return (!TextUtils.equals(strA0, "live") && TextUtils.equals(strA0, "voice-live")) ? "voice" : "video";
    }

    /* JADX INFO: renamed from: S0 */
    public void m20276S0(String str) {
        if (NullChecker.a(((wxs) this).e.h)) {
            muk.b(((wxs) this).e.h.n().id, ((DbObject) ((wxs) this).e.h.l0()).id, str);
        } else {
            muk.b("unset", "unset", str);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m20277S3(boolean z, final e30<String> e30Var) {
        if (E2() == null || E2().j() == null) {
            muk.a("data() || data().getLive() == null.");
        } else {
            muk.a("isAnchor() is " + L2() + ", and live id is " + E2().j().id);
        }
        if (E2() == null || E2().n() == null || E2().j() == null) {
            e30Var.call("{}");
            return;
        }
        final BLiveJsRoomInfo bLiveJsRoomInfoNew_ = BLiveJsRoomInfo.new_();
        bLiveJsRoomInfoNew_.roomId = E2().n().id;
        bLiveJsRoomInfoNew_.liveId = E2().j().id;
        User userL0 = E2().l0();
        if (userL0 != null) {
            bLiveJsRoomInfoNew_.anchorId = ((DbObject) userL0).id;
        }
        bLiveJsRoomInfoNew_.roomType = m20275R3();
        bLiveJsRoomInfoNew_.pageId = R2();
        bLiveJsRoomInfoNew_.fakeId = w220.a();
        bLiveJsRoomInfoNew_.liveMode = TextUtils.isEmpty(E2().j().liveMode) ? "normal" : E2().j().liveMode;
        if (z) {
            String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfoNew_);
            this.f18580j = strSerialize;
            e30Var.call(strSerialize);
        } else {
            if (E2().p()) {
                String strUserId = qib0.b0.a.userId();
                if (TextUtils.isEmpty(strUserId) || "null".equals(strUserId)) {
                    CrashHelper.c(new Exception("JsRoomInfoPlug getAnchorFanbases"));
                }
                duringCreated(LivingNormalApiProvider.t4(qib0.b0.a.userId())).map(new w9j() { // from class: l.igv
                    public final Object call(Object obj) {
                        return pgv.m20262K3((BLiveEnvelope) obj);
                    }
                }).subscribe(ffw.e(new e30() { // from class: l.jgv
                    public final void call(Object obj) {
                        this.f15119a.m20281U3(bLiveJsRoomInfoNew_, e30Var, (String) obj);
                    }
                }, new e30() { // from class: l.kgv
                    public final void call(Object obj) {
                        this.f15671a.m20283V3(bLiveJsRoomInfoNew_, e30Var, (Throwable) obj);
                    }
                }));
                return;
            }
            BLiveFanBase bLiveFanBaseB = E2().r0().b();
            bLiveJsRoomInfoNew_.fanBaseId = bLiveFanBaseB == null ? "" : bLiveFanBaseB.id;
            String strSerialize2 = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfoNew_);
            this.f18580j = strSerialize2;
            e30Var.call(strSerialize2);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m20278T() {
        super/*l.k4t*/.T();
        hashCode();
        E2().getClass();
        hgv.m15697c(this);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ c m20279T3(boolean z, String str, String str2, User user) {
        vpv vpvVar = ypv.f23196a;
        return vpvVar.m23650d(vpvVar.m23619D0(), user, z, "liveRoom", str, E2().o(), R2(), str2);
    }

    /* JADX INFO: renamed from: U0 */
    public void m20280U0(fpq fpqVar) {
        F2().LiveBridgeImplEvent.userCardController().j(fpqVar);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m20281U3(BLiveJsRoomInfo bLiveJsRoomInfo, e30 e30Var, String str) {
        bLiveJsRoomInfo.fanBaseId = str;
        String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfo);
        this.f18580j = strSerialize;
        e30Var.call(strSerialize);
    }

    /* JADX INFO: renamed from: V0 */
    public void m20282V0(String str, final String str2, final String str3, final String str4, final String str5, final boolean z, final e30<String> e30Var, final e30<String> e30Var2) {
        duringCreated(LivingNormalApiProvider.q5(str).flatMap(new w9j() { // from class: l.mgv
            public final Object call(Object obj) {
                return this.f16912a.m20279T3(z, str3, str2, (User) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.ngv
            public final void call(Object obj) {
                e30Var.call(str4);
            }
        }, new e30() { // from class: l.ogv
            public final void call(Object obj) {
                e30Var2.call(str5);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m20283V3(BLiveJsRoomInfo bLiveJsRoomInfo, e30 e30Var, Throwable th) {
        if (vdt.b(1)) {
            e30Var.call("{}");
            return;
        }
        String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfo);
        this.f18580j = strSerialize;
        e30Var.call(strSerialize);
        CrashHelper.d(th, 1000);
    }

    /* JADX INFO: renamed from: W */
    public void m20284W() {
        F2().LiveBridgeImplEvent.closeLiveCampaignDialog().p();
    }

    /* JADX INFO: renamed from: X */
    public void m20285X(sy4 sy4Var) {
        F2().LiveBridgeImplEvent.sendChatMessage().j(sy4Var);
    }

    /* JADX INFO: renamed from: Z1 */
    public void m20286Z1() {
        F2().VoiceVirtualLiveEvent.openSharePanelDialog().p();
    }

    /* JADX INFO: renamed from: f0 */
    public void m20287f0(u3g0 u3g0Var) {
        F2().LiveBridgeImplEvent.subscribeCampaign().j(u3g0Var);
    }

    /* JADX INFO: renamed from: j0 */
    public void m20288j0(dpq dpqVar) {
        F2().LiveBridgeImplEvent.fanBaseController().j(dpqVar);
    }

    /* JADX INFO: renamed from: j1 */
    public void m20289j1(boolean z, e30<String> e30Var) {
        m20277S3(z, e30Var);
    }

    /* JADX INFO: renamed from: n */
    public void m20290n() {
        super/*l.h4t*/.n();
        hashCode();
        E2().getClass();
        hgv.m15695a(this);
        this.f18580j = null;
    }

    /* JADX INFO: renamed from: t */
    public void m20291t() {
        super/*l.k4t*/.t();
        if (x4s.b(E2().j().liveMode) || L2()) {
            return;
        }
        duringCreated(E2().u()).subscribe(ffw.h(new e30() { // from class: l.lgv
            public final void call(Object obj) {
                this.f16157a.m20268W3((iqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m20292u0(String str) {
        F2().LiveBridgeImplEvent.payFirstRecharge().j(Boolean.valueOf(str.equals("alipay")));
    }

    /* JADX INFO: renamed from: v */
    public void m20293v(boolean z, String str, int i, int i2, int i3) {
        BLiveShootGameTask bLiveShootGameTaskNew_ = BLiveShootGameTask.new_();
        if (z) {
            bLiveShootGameTaskNew_.status = BLiveShootGameStatus.get("autoReceived");
        } else {
            bLiveShootGameTaskNew_.status = BLiveShootGameStatus.get(str);
        }
        bLiveShootGameTaskNew_.stage = i;
        bLiveShootGameTaskNew_.duration = i2;
        bLiveShootGameTaskNew_.ballCount = i3;
        F2().ShootEvent.taskReceived().j(bLiveShootGameTaskNew_);
    }

    /* JADX INFO: renamed from: v1 */
    public void m20294v1() {
        F2().VoiceCallEvent.callApplyEvent().j(new xpm0());
    }
}
