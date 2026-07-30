package com.p051p1.mobile.putong.live;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.LiveBridgeImpl;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.aiv;
import p153l.aqq;
import p153l.bcg0;
import p153l.civ;
import p153l.crp0;
import p153l.cxk;
import p153l.dhw;
import p153l.fhw;
import p153l.fk3;
import p153l.frq;
import p153l.hiv;
import p153l.hqq;
import p153l.htd0;
import p153l.iiv;
import p153l.itd0;
import p153l.l51;
import p153l.ldc0;
import p153l.lf2;
import p153l.lkq;
import p153l.mbs;
import p153l.qcj;
import p153l.qqq;
import p153l.tbs;
import p153l.tnt;
import p153l.twl;
import p153l.ujt;
import p153l.uqb0;
import p153l.urv;
import p153l.v5k0;
import p153l.ve4;
import p153l.x20;
import p153l.y20;
import p153l.ycc0;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes13.dex */
public class LiveBridgeImpl extends lf2 {

    /* JADX INFO: renamed from: a */
    public final String f44895a = "from_h5";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.LiveBridgeImpl$a */
    public class C11581a implements aiv.C15716a.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aqq f44896a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f44897b;

        public C11581a(aqq aqqVar, String str) {
            this.f44896a = aqqVar;
            this.f44897b = str;
        }

        @Override // p153l.aiv.C15716a.b, p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            String str = TextUtils.isEmpty(bLiveGivenGiftBrief.sendGiftOriginalId) ? "" : bLiveGivenGiftBrief.sendGiftOriginalId;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("sendGiftOriginalId", str);
            this.f44896a.mo99544d().mo97004b(this.f44897b, "1", LiveBridgeImpl.this.m68341G(jsonObject.toString()));
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
            this.f44896a.mo99544d().mo97004b(this.f44897b, User.ID_TEAM_ACCOUNT);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
            this.f44896a.mo99544d().mo97004b(this.f44897b, "0");
        }
    }

    /* JADX INFO: renamed from: E */
    public static twl m68314E() {
        return iiv.m140145b();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m68321i(aqq aqqVar, String str, String str2, String str3) {
        if (aqqVar.mo99542b()) {
            return;
        }
        m68314E().mo176773E1(new crp0(str, str2, str3));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m68327o(aqq aqqVar, OperationWebView operationWebView) {
        aqqVar.mo99541a().setTag(ycc0.f198425K0, null);
        operationWebView.m76277s0();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m68334v(String str, String str2, aqq aqqVar) {
        twl twlVarM68314E = m68314E();
        String url = aqqVar.mo99541a().getUrl();
        final hqq hqqVarMo99544d = aqqVar.mo99544d();
        Objects.requireNonNull(hqqVarMo99544d);
        twlVarM68314E.mo176774H1(new qqq(str, str2, url, new z20() { // from class: l.s0s
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                hqqVarMo99544d.mo97004b((String) obj, (String) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m68338z(Act act, String str, final aqq aqqVar, final String str2) {
        if (act == null || act.isFinishing()) {
            return;
        }
        mbs.m157850e0(act, str, new x20() { // from class: l.u0s
            @Override // p153l.x20
            public final void call() {
                aqqVar.mo99544d().mo97004b(str2, new String[0]);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m68339D(@NonNull aqq aqqVar) {
        if (NullChecker.m82486a(aqqVar.mo99541a().getTag(ldc0.f131477K2)) && (aqqVar.mo99541a().getTag(ldc0.f131477K2) instanceof Dialog)) {
            Dialog dialog = (Dialog) aqqVar.mo99541a().getTag(ldc0.f131477K2);
            aqqVar.mo99541a().setTag(ldc0.f131477K2, null);
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: F */
    public final String m68340F(String str, LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        return String.format("javascript:(%s)", str + "(\"" + liveCampaignInfo.getUpdateType() + "\",'" + liveCampaignInfo.getData() + "')");
    }

    /* JADX INFO: renamed from: G */
    public final String m68341G(String str) {
        try {
            String strQuote = JSONObject.quote(str);
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: H */
    public final String m68342H(String str, String str2) {
        return "javascript:" + str + "('" + str2 + "')";
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void m68348N(@NonNull final aqq aqqVar, final String str, final LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        l51.m152887G(new Runnable() { // from class: l.t0s
            @Override // java.lang.Runnable
            public final void run() {
                this.f171556a.m68347M(aqqVar, str, liveCampaignInfo);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final boolean m68344J(@NonNull aqq aqqVar) {
        return aqqVar.mo99543c() instanceof LiveAct;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m68345K(aqq aqqVar, String str, String str2) {
        aqqVar.mo99541a().loadUrl(m68342H(str, str2));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m68346L(aqq aqqVar, String str, String str2) {
        WebViewX webViewXMo99541a = aqqVar.mo99541a();
        String strM68342H = m68342H(str, str2);
        fhw.m125605a("shootGame", "shootGameConfig:" + strM68342H);
        webViewXMo99541a.loadUrl(strM68342H);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m68347M(aqq aqqVar, String str, LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        if (aqqVar.mo99542b()) {
            return;
        }
        aqqVar.mo99541a().loadUrl(m68340F(str, liveCampaignInfo));
    }

    @lkq(key = "applyVoiceCall")
    public void applyVoiceCall(@NonNull aqq aqqVar) {
        l51.m152893M(new Runnable() { // from class: l.h0s
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m68314E().mo176793v1();
            }
        });
    }

    @lkq(key = "campaignController")
    public void campaignController(@NonNull aqq aqqVar, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(str, "getCurrentServerTime")) {
            aqqVar.mo99544d().mo97004b(str3, String.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        } else {
            if (TextUtils.equals(str, "showLiveRankPage")) {
                return;
            }
            ((hiv) zrv.m221194l(htd0.f111521c)).m135147G(str, str2);
        }
    }

    @lkq(key = "closeLiveCampaignDialog")
    public void closeLiveCampaignDialog(@NonNull aqq aqqVar) {
        m68314E().mo176787W();
    }

    @lkq(key = "closeOperationWebview")
    public void closeOperationWebview(@NonNull final aqq aqqVar) {
        Object tag = aqqVar.mo99541a().getTag(ycc0.f198425K0);
        if (tag instanceof OperationWebView) {
            final OperationWebView operationWebView = (OperationWebView) tag;
            l51.m152887G(new Runnable() { // from class: l.k0s
                @Override // java.lang.Runnable
                public final void run() {
                    LiveBridgeImpl.m68327o(aqqVar, operationWebView);
                }
            });
        }
    }

    @lkq(key = "fanBaseController")
    public void fanBaseController(@NonNull final aqq aqqVar, final String str, final String str2, final String str3) {
        l51.m152893M(new Runnable() { // from class: l.q0s
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m68314E().mo176790j0(new drq(str, str2, new y20() { // from class: l.r0s
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        aqqVar.mo99544d().mo97004b(str, (String) obj);
                    }
                }));
            }
        });
    }

    @lkq(key = "follow", uiThread = true)
    public void follow(@NonNull final aqq aqqVar, String str, String str2, final String str3, final String str4, final String str5, final boolean z) {
        if (m68344J(aqqVar)) {
            m68314E().mo176785V0(str, str2, str3, str4, str5, z, new y20() { // from class: l.e0s
                @Override // p153l.y20
                public final void call(Object obj) {
                    aqqVar.mo99544d().mo97003a((String) obj);
                }
            }, new y20() { // from class: l.f0s
                @Override // p153l.y20
                public final void call(Object obj) {
                    aqqVar.mo99544d().mo97003a((String) obj);
                }
            });
        } else {
            final String str6 = TextUtils.isEmpty(str2) ? "liveRoom" : str2;
            aqqVar.mo99543c().duringCreated((C22421c) LivingNormalApiProvider.m72737q5(str).flatMap(new qcj() { // from class: l.a1s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return mbs.m157859j(mbs.m157870o0(), (User) obj, z, str6, str3);
                }
            })).subscribe(dhw.m115826e(new y20() { // from class: l.b1s
                @Override // p153l.y20
                public final void call(Object obj) {
                    aqqVar.mo99544d().mo97003a(str4);
                }
            }, new y20() { // from class: l.c1s
                @Override // p153l.y20
                public final void call(Object obj) {
                    aqqVar.mo99544d().mo97003a(str5);
                }
            }));
        }
    }

    @lkq(key = "getIntlConfig")
    public String getIntlConfig(@NonNull aqq aqqVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveRegionTag", TEnum.equals(uqb0.f180402h0, "unknown_") ? "" : uqb0.f180402h0.toString());
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(new Exception("H5Bridge error", e));
            return "";
        }
    }

    @lkq(key = "getRoomConfig", uiThread = true)
    public void getRoomConfig(@NonNull final aqq aqqVar, final String str) {
        m68314E().mo131189j1(false, new y20() { // from class: l.z0s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202378a.m68345K(aqqVar, str, (String) obj);
            }
        });
    }

    @lkq(key = "getShootGameConfig", uiThread = true)
    public void getShootGameConfig(@NonNull final aqq aqqVar, final String str) {
        m68314E().mo176777M(new y20() { // from class: l.j0s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117846a.m68346L(aqqVar, str, (String) obj);
            }
        });
    }

    @lkq(key = "jumpRecharge")
    public void jumpRecharge(@NonNull aqq aqqVar, String str) {
        v5k0.m199901m(aqqVar.mo99543c(), "jumpRecharge?successHandler=" + str);
    }

    @lkq(key = "jumpToCover")
    public void jumpToCover(@NonNull aqq aqqVar) {
        v5k0.m199901m(aqqVar.mo99543c(), "liveCover?source=from_h5");
    }

    @lkq(key = "jumpToLiveAnchor")
    public void jumpToLiveAnchor(@NonNull aqq aqqVar) {
        jumpToPreviewPage(aqqVar);
    }

    @lkq(key = "jumpToPreviewPage")
    public void jumpToPreviewPage(@NonNull aqq aqqVar) {
        ujt.m196460b(aqqVar.mo99543c(), Uri.parse("tantanapp://liveAnchor?anchorSource=from_h5"));
    }

    @lkq(key = "jumpToPreviewVoiceRoom", uiThread = true)
    public void jumpToPreviewVoiceRoom(@NonNull aqq aqqVar) {
        if (m68344J(aqqVar)) {
            return;
        }
        m68314E().mo176787W();
        ujt.m196460b(aqqVar.mo99543c(), Uri.parse("tantanapp://startVoiceLive?anchorSource=from_h5"));
    }

    @lkq(key = "jumpToProfile")
    public void jumpToProfile(@NonNull aqq aqqVar, String str, String str2) {
        if (m68344J(aqqVar)) {
            if (tnt.m191965b(str2)) {
                m68314E().mo176776L0(str, str2);
                return;
            } else {
                m68314E().mo176776L0(str, "live_from_h5");
                return;
            }
        }
        v5k0.m199901m(aqqVar.mo99543c(), "jumpToProfile?userId=" + str + "&from=live_from_h5");
    }

    @lkq(key = "jumpToRoom")
    public void jumpToRoom(@NonNull final aqq aqqVar, final String str, final String str2, final String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "default";
        }
        if (m68344J(aqqVar)) {
            l51.m152893M(new Runnable() { // from class: l.y0s
                @Override // java.lang.Runnable
                public final void run() {
                    LiveBridgeImpl.m68321i(aqqVar, str, str2, str3);
                }
            });
            return;
        }
        v5k0.m199901m(aqqVar.mo99543c(), "openLiveRoom?liveId=" + str + "&roomId=" + str2 + "&source=" + str3);
    }

    @lkq(key = "jumpToStartLive")
    public void jumpToStartLive(@NonNull aqq aqqVar) {
        v5k0.m199901m(aqqVar.mo99543c(), "jumpToStartLive?anchorSource=from_h5");
    }

    @lkq(key = "jumpToVoiceRoom")
    public void jumpToVoiceRoom(@NonNull aqq aqqVar, String str, String str2) {
        m68339D(aqqVar);
        v5k0.m199901m(aqqVar.mo99543c(), "enterVoiceRoom?liveId=" + str + "&source=" + str2);
    }

    @lkq(key = "liveGiftDialogController")
    public void liveGiftDialogController(@NonNull aqq aqqVar, String str, String str2, String str3) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135148H(str, str2, new C11581a(aqqVar, str3));
    }

    @lkq(key = "liveNativeLog")
    public void liveNativeLog(@NonNull aqq aqqVar, final String str) {
        if (m68344J(aqqVar)) {
            l51.m152893M(new Runnable() { // from class: l.w0s
                @Override // java.lang.Runnable
                public final void run() {
                    LiveBridgeImpl.m68314E().mo176780S0(str);
                }
            });
        } else {
            cxk.m113043b("unset", "unset", str);
        }
    }

    @lkq(key = "liveNewUserRedPacketController")
    public void liveNewUserRedPacketController(@NonNull aqq aqqVar, String str, String str2, String str3) {
        if (!"getStatusAndSeconds".equals(str)) {
            ((hiv) zrv.m221194l(htd0.f111521c)).m135149I(str, str2);
            return;
        }
        hqq hqqVarMo99544d = aqqVar.mo99544d();
        htd0<civ> htd0Var = htd0.f111524f;
        hqqVarMo99544d.mo97004b(str3, ((civ) zrv.m221194l(htd0Var)).m109971o(), String.valueOf(((civ) zrv.m221194l(htd0Var)).m109972p()));
    }

    @lkq(key = "nativeDialogController")
    public void nativeDialogController(@NonNull final aqq aqqVar, final String str, final String str2) {
        l51.m152893M(new Runnable() { // from class: l.d0s
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m68334v(str, str2, aqqVar);
            }
        });
    }

    @lkq(key = "onTeenModeEnable")
    public void onTeenModeEnable(@NonNull aqq aqqVar, boolean z) {
        v5k0.m199901m(aqqVar.mo99543c(), "onTeenModeEnable?enable=" + z);
    }

    @lkq(key = "openToSchema")
    public void openToSchema(@NonNull final aqq aqqVar, final String str) {
        l51.m152893M(new Runnable() { // from class: l.i0s
            @Override // java.lang.Runnable
            public final void run() {
                ujt.m196460b(aqqVar.mo99543c(), Uri.parse(str));
            }
        });
    }

    @lkq(key = "openVoiceSharePanel", uiThread = true)
    public void openVoiceSharePanel(@NonNull aqq aqqVar) {
        m68314E().mo176789Z1();
    }

    @lkq(key = "payFirstRecharge")
    public void payFirstRecharge(@NonNull aqq aqqVar, final String str) {
        l51.m152893M(new Runnable() { // from class: l.g0s
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m68314E().mo176791u0(str);
            }
        });
    }

    @lkq(key = "redPointState")
    public void redPointState(@NonNull aqq aqqVar, boolean z) {
        ((fk3) tbs.m190077m(itd0.f116820b)).f99466q.m137019l(Boolean.valueOf(z));
    }

    @lkq(key = "refreshGuildAuth")
    public void refreshGuildAuth(@NonNull aqq aqqVar) {
        v5k0.m199901m(aqqVar.mo99543c(), "refreshGuildAuth");
    }

    @lkq(key = "refreshLiveAuth")
    public void refreshLiveAuth(@NonNull aqq aqqVar) {
        v5k0.m199901m(aqqVar.mo99543c(), "refreshLiveAuth");
    }

    @lkq(key = "sendChatMessage")
    public void sendChatMessage(@NonNull aqq aqqVar, final String str, final String str2) {
        l51.m152893M(new Runnable() { // from class: l.v0s
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m68314E().mo176788X(new rz4(str, str2));
            }
        });
    }

    @lkq(key = "showRechargeDialog")
    public void showRechargeDialog(@NonNull aqq aqqVar) {
        l51.m152893M(new Runnable() { // from class: l.n0s
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m68314E().mo176778O1();
            }
        });
    }

    @lkq(key = "showTTCoinDialog")
    public void showTTCoinDialog(@NonNull final aqq aqqVar, final String str, final String str2) {
        final PutongAct putongActMo99543c = aqqVar.mo99543c();
        l51.m152893M(new Runnable() { // from class: l.o0s
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m68338z(putongActMo99543c, str2, aqqVar, str);
            }
        });
    }

    @lkq(key = "showVoteResultDialog")
    public void showVoteResultDialog(@NonNull aqq aqqVar, final String str) {
        l51.m152893M(new Runnable() { // from class: l.x0s
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m68314E().mo176775I1(str);
            }
        });
    }

    @lkq(key = "subscribeCampaign", uiThread = true)
    public void subscribeCampaign(@NonNull final aqq aqqVar, String str, final String str2, final String str3) {
        WebViewX webViewXMo99541a = aqqVar.mo99541a();
        m68314E().mo131188f0(new bcg0(str, webViewXMo99541a.hashCode(), new ve4() { // from class: l.l0s
            @Override // p153l.ve4
            /* JADX INFO: renamed from: a */
            public final void mo152372a(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
                this.f129585a.m68348N(aqqVar, str3, liveCampaignInfo);
            }
        }, new y20() { // from class: l.m0s
            @Override // p153l.y20
            public final void call(Object obj) {
                aqqVar.mo99544d().mo97004b(str2, ((Boolean) obj).booleanValue() ? "1" : "0");
            }
        }));
    }

    @lkq(key = "syncShootGameStatus")
    public void syncShootGameStatus(@NonNull aqq aqqVar, final boolean z, final String str, final int i, final int i2, final int i3) {
        fhw.m125605a("shootGame", "syncShootGameStatus:" + z + ":" + str + ":" + i + ":" + i2 + ":" + i3);
        l51.m152893M(new Runnable() { // from class: l.p0s
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m68314E().mo176792v(z, str, i, i2, i3);
            }
        });
    }

    @lkq(key = "userCardController", uiThread = true)
    public void userCardController(@NonNull aqq aqqVar, String str, String str2, String str3) {
        m68314E().mo176783U0(new frq(str, str2, str3));
        if (TextUtils.equals(str, "show")) {
            if (TextUtils.isEmpty(str2) || str2.equals("0")) {
                CrashHelper.m82479c(new Exception("userCardController UserCardData userId is null url = " + aqqVar.mo99541a().getUrl()));
            }
        }
    }

    @lkq(key = "verifyTeenModePassword")
    public void verifyTeenModePassword(@NonNull aqq aqqVar, boolean z, int i) {
        v5k0.m199901m(aqqVar.mo99543c(), "verifyTeenModePassword?verified=" + z + "&scenes=" + i);
    }

    @lkq(key = "voiceAnchorNameVerified")
    public void voiceAnchorNameVerified(@NonNull aqq aqqVar) {
        if (m68344J(aqqVar)) {
            ((urv) zrv.m221194l(htd0.f111522d)).m197668d(true);
        }
    }

    @lkq(key = "jumpRecharge")
    public void jumpRecharge(@NonNull aqq aqqVar) {
        liveGiftDialogController(aqqVar, "showFastRecharge", "", "");
    }

    @lkq(key = "follow", uiThread = true)
    public void follow(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5) {
        follow(aqqVar, str, str2, str3, str4, str5, true);
    }
}
