package com.p046p1.mobile.putong.live;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.LiveBridgeImpl;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.bgv;
import p149l.boq;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.ef2;
import p149l.f30;
import p149l.f5c0;
import p149l.ffw;
import p149l.fld0;
import p149l.fpq;
import p149l.ful;
import p149l.ggv;
import p149l.gld0;
import p149l.hfw;
import p149l.hgv;
import p149l.hoq;
import p149l.l9s;
import p149l.liq;
import p149l.muk;
import p149l.nj3;
import p149l.qib0;
import p149l.qoq;
import p149l.rlt;
import p149l.rwj0;
import p149l.s4c0;
import p149l.s9s;
import p149l.tht;
import p149l.tpv;
import p149l.u3g0;
import p149l.w9j;
import p149l.wd4;
import p149l.ypv;
import p149l.zfv;
import p149l.zhp0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveBridgeImpl extends ef2 {

    /* JADX INFO: renamed from: a */
    public final String f44047a = "from_h5";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.LiveBridgeImpl$a */
    public class C11418a implements zfv.C21687a.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boq f44048a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f44049b;

        public C11418a(boq boqVar, String str) {
            this.f44048a = boqVar;
            this.f44049b = str;
        }

        @Override // p149l.zfv.C21687a.b, p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            String str = TextUtils.isEmpty(bLiveGivenGiftBrief.sendGiftOriginalId) ? "" : bLiveGivenGiftBrief.sendGiftOriginalId;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("sendGiftOriginalId", str);
            this.f44048a.mo102962d().mo127285b(this.f44049b, "1", LiveBridgeImpl.this.m67158G(jsonObject.toString()));
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
            this.f44048a.mo102962d().mo127285b(this.f44049b, User.ID_TEAM_ACCOUNT);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
            this.f44048a.mo102962d().mo127285b(this.f44049b, "0");
        }
    }

    /* JADX INFO: renamed from: E */
    public static ful m67131E() {
        return hgv.m130924b();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m67138i(boq boqVar, String str, String str2, String str3) {
        if (boqVar.mo102960b()) {
            return;
        }
        m67131E().mo123189E1(new zhp0(str, str2, str3));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m67144o(boq boqVar, OperationWebView operationWebView) {
        boqVar.mo102959a().setTag(s4c0.f162304K0, null);
        operationWebView.m75094s0();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m67151v(String str, String str2, boq boqVar) {
        ful fulVarM67131E = m67131E();
        String url = boqVar.mo102959a().getUrl();
        final hoq hoqVarMo102962d = boqVar.mo102962d();
        Objects.requireNonNull(hoqVarMo102962d);
        fulVarM67131E.mo123190H1(new qoq(str, str2, url, new f30() { // from class: l.ryr
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                hoqVarMo102962d.mo127285b((String) obj, (String) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m67155z(Act act, String str, final boq boqVar, final String str2) {
        if (act == null || act.isFinishing()) {
            return;
        }
        l9s.m149073e0(act, str, new d30() { // from class: l.tyr
            @Override // p149l.d30
            public final void call() {
                boqVar.mo102962d().mo127285b(str2, new String[0]);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m67156D(@NonNull boq boqVar) {
        if (NullChecker.m81303a(boqVar.mo102959a().getTag(f5c0.f95020K2)) && (boqVar.mo102959a().getTag(f5c0.f95020K2) instanceof Dialog)) {
            Dialog dialog = (Dialog) boqVar.mo102959a().getTag(f5c0.f95020K2);
            boqVar.mo102959a().setTag(f5c0.f95020K2, null);
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: F */
    public final String m67157F(String str, LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        return String.format("javascript:(%s)", str + "(\"" + liveCampaignInfo.getUpdateType() + "\",'" + liveCampaignInfo.getData() + "')");
    }

    /* JADX INFO: renamed from: G */
    public final String m67158G(String str) {
        try {
            String strQuote = JSONObject.quote(str);
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: H */
    public final String m67159H(String str, String str2) {
        return "javascript:" + str + "('" + str2 + "')";
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void m67165N(@NonNull final boq boqVar, final String str, final LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        e51.m114742G(new Runnable() { // from class: l.syr
            @Override // java.lang.Runnable
            public final void run() {
                this.f166975a.m67164M(boqVar, str, liveCampaignInfo);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final boolean m67161J(@NonNull boq boqVar) {
        return boqVar.mo102961c() instanceof LiveAct;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m67162K(boq boqVar, String str, String str2) {
        boqVar.mo102959a().loadUrl(m67159H(str, str2));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m67163L(boq boqVar, String str, String str2) {
        WebViewX webViewXMo102959a = boqVar.mo102959a();
        String strM67159H = m67159H(str, str2);
        hfw.m130790a("shootGame", "shootGameConfig:" + strM67159H);
        webViewXMo102959a.loadUrl(strM67159H);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m67164M(boq boqVar, String str, LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        if (boqVar.mo102960b()) {
            return;
        }
        boqVar.mo102959a().loadUrl(m67157F(str, liveCampaignInfo));
    }

    @liq(key = "applyVoiceCall")
    public void applyVoiceCall(@NonNull boq boqVar) {
        e51.m114748M(new Runnable() { // from class: l.gyr
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m67131E().mo123204v1();
            }
        });
    }

    @liq(key = "campaignController")
    public void campaignController(@NonNull boq boqVar, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(str, "getCurrentServerTime")) {
            boqVar.mo102962d().mo127285b(str3, String.valueOf(qib0.f154693H.guessedCurrentServerTime()));
        } else {
            if (TextUtils.equals(str, "showLiveRankPage")) {
                return;
            }
            ((ggv) ypv.m215673l(fld0.f98148c)).m126013G(str, str2);
        }
    }

    @liq(key = "closeLiveCampaignDialog")
    public void closeLiveCampaignDialog(@NonNull boq boqVar) {
        m67131E().mo123198W();
    }

    @liq(key = "closeOperationWebview")
    public void closeOperationWebview(@NonNull final boq boqVar) {
        Object tag = boqVar.mo102959a().getTag(s4c0.f162304K0);
        if (tag instanceof OperationWebView) {
            final OperationWebView operationWebView = (OperationWebView) tag;
            e51.m114742G(new Runnable() { // from class: l.jyr
                @Override // java.lang.Runnable
                public final void run() {
                    LiveBridgeImpl.m67144o(boqVar, operationWebView);
                }
            });
        }
    }

    @liq(key = "fanBaseController")
    public void fanBaseController(@NonNull final boq boqVar, final String str, final String str2, final String str3) {
        e51.m114748M(new Runnable() { // from class: l.pyr
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m67131E().mo123201j0(new dpq(str, str2, new e30() { // from class: l.qyr
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        boqVar.mo102962d().mo127285b(str, (String) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "follow", uiThread = true)
    public void follow(@NonNull final boq boqVar, String str, String str2, final String str3, final String str4, final String str5, final boolean z) {
        if (m67161J(boqVar)) {
            m67131E().mo123197V0(str, str2, str3, str4, str5, z, new e30() { // from class: l.dyr
                @Override // p149l.e30
                public final void call(Object obj) {
                    boqVar.mo102962d().mo127284a((String) obj);
                }
            }, new e30() { // from class: l.eyr
                @Override // p149l.e30
                public final void call(Object obj) {
                    boqVar.mo102962d().mo127284a((String) obj);
                }
            });
        } else {
            final String str6 = TextUtils.isEmpty(str2) ? "liveRoom" : str2;
            boqVar.mo102961c().duringCreated((C22306c) LivingNormalApiProvider.m71554q5(str).flatMap(new w9j() { // from class: l.zyr
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return l9s.m149082j(l9s.m149093o0(), (User) obj, z, str6, str3);
                }
            })).subscribe(ffw.m121194e(new e30() { // from class: l.azr
                @Override // p149l.e30
                public final void call(Object obj) {
                    boqVar.mo102962d().mo127284a(str4);
                }
            }, new e30() { // from class: l.bzr
                @Override // p149l.e30
                public final void call(Object obj) {
                    boqVar.mo102962d().mo127284a(str5);
                }
            }));
        }
    }

    @liq(key = "getIntlConfig")
    public String getIntlConfig(@NonNull boq boqVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveRegionTag", TEnum.equals(qib0.f154719h0, "unknown_") ? "" : qib0.f154719h0.toString());
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(new Exception("H5Bridge error", e));
            return "";
        }
    }

    @liq(key = "getRoomConfig", uiThread = true)
    public void getRoomConfig(@NonNull final boq boqVar, final String str) {
        m67131E().mo122257j1(false, new e30() { // from class: l.yyr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200796a.m67162K(boqVar, str, (String) obj);
            }
        });
    }

    @liq(key = "getShootGameConfig", uiThread = true)
    public void getShootGameConfig(@NonNull final boq boqVar, final String str) {
        m67131E().mo123193M(new e30() { // from class: l.iyr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115472a.m67163L(boqVar, str, (String) obj);
            }
        });
    }

    @liq(key = "jumpRecharge")
    public void jumpRecharge(@NonNull boq boqVar, String str) {
        rwj0.m181414m(boqVar.mo102961c(), "jumpRecharge?successHandler=" + str);
    }

    @liq(key = "jumpToCover")
    public void jumpToCover(@NonNull boq boqVar) {
        rwj0.m181414m(boqVar.mo102961c(), "liveCover?source=from_h5");
    }

    @liq(key = "jumpToLiveAnchor")
    public void jumpToLiveAnchor(@NonNull boq boqVar) {
        jumpToPreviewPage(boqVar);
    }

    @liq(key = "jumpToPreviewPage")
    public void jumpToPreviewPage(@NonNull boq boqVar) {
        tht.m188929b(boqVar.mo102961c(), Uri.parse("tantanapp://liveAnchor?anchorSource=from_h5"));
    }

    @liq(key = "jumpToPreviewVoiceRoom", uiThread = true)
    public void jumpToPreviewVoiceRoom(@NonNull boq boqVar) {
        if (m67161J(boqVar)) {
            return;
        }
        m67131E().mo123198W();
        tht.m188929b(boqVar.mo102961c(), Uri.parse("tantanapp://startVoiceLive?anchorSource=from_h5"));
    }

    @liq(key = "jumpToProfile")
    public void jumpToProfile(@NonNull boq boqVar, String str, String str2) {
        if (m67161J(boqVar)) {
            if (rlt.m179881b(str2)) {
                m67131E().mo123192L0(str, str2);
                return;
            } else {
                m67131E().mo123192L0(str, "live_from_h5");
                return;
            }
        }
        rwj0.m181414m(boqVar.mo102961c(), "jumpToProfile?userId=" + str + "&from=live_from_h5");
    }

    @liq(key = "jumpToRoom")
    public void jumpToRoom(@NonNull final boq boqVar, final String str, final String str2, final String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "default";
        }
        if (m67161J(boqVar)) {
            e51.m114748M(new Runnable() { // from class: l.xyr
                @Override // java.lang.Runnable
                public final void run() {
                    LiveBridgeImpl.m67138i(boqVar, str, str2, str3);
                }
            });
            return;
        }
        rwj0.m181414m(boqVar.mo102961c(), "openLiveRoom?liveId=" + str + "&roomId=" + str2 + "&source=" + str3);
    }

    @liq(key = "jumpToStartLive")
    public void jumpToStartLive(@NonNull boq boqVar) {
        rwj0.m181414m(boqVar.mo102961c(), "jumpToStartLive?anchorSource=from_h5");
    }

    @liq(key = "jumpToVoiceRoom")
    public void jumpToVoiceRoom(@NonNull boq boqVar, String str, String str2) {
        m67156D(boqVar);
        rwj0.m181414m(boqVar.mo102961c(), "enterVoiceRoom?liveId=" + str + "&source=" + str2);
    }

    @liq(key = "liveGiftDialogController")
    public void liveGiftDialogController(@NonNull boq boqVar, String str, String str2, String str3) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126014H(str, str2, new C11418a(boqVar, str3));
    }

    @liq(key = "liveNativeLog")
    public void liveNativeLog(@NonNull boq boqVar, final String str) {
        if (m67161J(boqVar)) {
            e51.m114748M(new Runnable() { // from class: l.vyr
                @Override // java.lang.Runnable
                public final void run() {
                    LiveBridgeImpl.m67131E().mo123195S0(str);
                }
            });
        } else {
            muk.m156416b("unset", "unset", str);
        }
    }

    @liq(key = "liveNewUserRedPacketController")
    public void liveNewUserRedPacketController(@NonNull boq boqVar, String str, String str2, String str3) {
        if (!"getStatusAndSeconds".equals(str)) {
            ((ggv) ypv.m215673l(fld0.f98148c)).m126015I(str, str2);
            return;
        }
        hoq hoqVarMo102962d = boqVar.mo102962d();
        fld0<bgv> fld0Var = fld0.f98151f;
        hoqVarMo102962d.mo127285b(str3, ((bgv) ypv.m215673l(fld0Var)).m101735o(), String.valueOf(((bgv) ypv.m215673l(fld0Var)).m101736p()));
    }

    @liq(key = "nativeDialogController")
    public void nativeDialogController(@NonNull final boq boqVar, final String str, final String str2) {
        e51.m114748M(new Runnable() { // from class: l.cyr
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m67151v(str, str2, boqVar);
            }
        });
    }

    @liq(key = "onTeenModeEnable")
    public void onTeenModeEnable(@NonNull boq boqVar, boolean z) {
        rwj0.m181414m(boqVar.mo102961c(), "onTeenModeEnable?enable=" + z);
    }

    @liq(key = "openToSchema")
    public void openToSchema(@NonNull final boq boqVar, final String str) {
        e51.m114748M(new Runnable() { // from class: l.hyr
            @Override // java.lang.Runnable
            public final void run() {
                tht.m188929b(boqVar.mo102961c(), Uri.parse(str));
            }
        });
    }

    @liq(key = "openVoiceSharePanel", uiThread = true)
    public void openVoiceSharePanel(@NonNull boq boqVar) {
        m67131E().mo123200Z1();
    }

    @liq(key = "payFirstRecharge")
    public void payFirstRecharge(@NonNull boq boqVar, final String str) {
        e51.m114748M(new Runnable() { // from class: l.fyr
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m67131E().mo123202u0(str);
            }
        });
    }

    @liq(key = "redPointState")
    public void redPointState(@NonNull boq boqVar, boolean z) {
        ((nj3) s9s.m182763m(gld0.f103312b)).f139193q.m132487l(Boolean.valueOf(z));
    }

    @liq(key = "refreshGuildAuth")
    public void refreshGuildAuth(@NonNull boq boqVar) {
        rwj0.m181414m(boqVar.mo102961c(), "refreshGuildAuth");
    }

    @liq(key = "refreshLiveAuth")
    public void refreshLiveAuth(@NonNull boq boqVar) {
        rwj0.m181414m(boqVar.mo102961c(), "refreshLiveAuth");
    }

    @liq(key = "sendChatMessage")
    public void sendChatMessage(@NonNull boq boqVar, final String str, final String str2) {
        e51.m114748M(new Runnable() { // from class: l.uyr
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m67131E().mo123199X(new sy4(str, str2));
            }
        });
    }

    @liq(key = "showRechargeDialog")
    public void showRechargeDialog(@NonNull boq boqVar) {
        e51.m114748M(new Runnable() { // from class: l.myr
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m67131E().mo123194O1();
            }
        });
    }

    @liq(key = "showTTCoinDialog")
    public void showTTCoinDialog(@NonNull final boq boqVar, final String str, final String str2) {
        final PutongAct putongActMo102961c = boqVar.mo102961c();
        e51.m114748M(new Runnable() { // from class: l.nyr
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m67155z(putongActMo102961c, str2, boqVar, str);
            }
        });
    }

    @liq(key = "showVoteResultDialog")
    public void showVoteResultDialog(@NonNull boq boqVar, final String str) {
        e51.m114748M(new Runnable() { // from class: l.wyr
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m67131E().mo123191I1(str);
            }
        });
    }

    @liq(key = "subscribeCampaign", uiThread = true)
    public void subscribeCampaign(@NonNull final boq boqVar, String str, final String str2, final String str3) {
        WebViewX webViewXMo102959a = boqVar.mo102959a();
        m67131E().mo122256f0(new u3g0(str, webViewXMo102959a.hashCode(), new wd4() { // from class: l.kyr
            @Override // p149l.wd4
            /* JADX INFO: renamed from: a */
            public final void mo147900a(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
                this.f125328a.m67165N(boqVar, str3, liveCampaignInfo);
            }
        }, new e30() { // from class: l.lyr
            @Override // p149l.e30
            public final void call(Object obj) {
                boqVar.mo102962d().mo127285b(str2, ((Boolean) obj).booleanValue() ? "1" : "0");
            }
        }));
    }

    @liq(key = "syncShootGameStatus")
    public void syncShootGameStatus(@NonNull boq boqVar, final boolean z, final String str, final int i, final int i2, final int i3) {
        hfw.m130790a("shootGame", "syncShootGameStatus:" + z + ":" + str + ":" + i + ":" + i2 + ":" + i3);
        e51.m114748M(new Runnable() { // from class: l.oyr
            @Override // java.lang.Runnable
            public final void run() {
                LiveBridgeImpl.m67131E().mo123203v(z, str, i, i2, i3);
            }
        });
    }

    @liq(key = "userCardController", uiThread = true)
    public void userCardController(@NonNull boq boqVar, String str, String str2, String str3) {
        m67131E().mo123196U0(new fpq(str, str2, str3));
        if (TextUtils.equals(str, "show")) {
            if (TextUtils.isEmpty(str2) || str2.equals("0")) {
                CrashHelper.m81296c(new Exception("userCardController UserCardData userId is null url = " + boqVar.mo102959a().getUrl()));
            }
        }
    }

    @liq(key = "verifyTeenModePassword")
    public void verifyTeenModePassword(@NonNull boq boqVar, boolean z, int i) {
        rwj0.m181414m(boqVar.mo102961c(), "verifyTeenModePassword?verified=" + z + "&scenes=" + i);
    }

    @liq(key = "voiceAnchorNameVerified")
    public void voiceAnchorNameVerified(@NonNull boq boqVar) {
        if (m67161J(boqVar)) {
            ((tpv) ypv.m215673l(fld0.f98149d)).m190065d(true);
        }
    }

    @liq(key = "jumpRecharge")
    public void jumpRecharge(@NonNull boq boqVar) {
        liveGiftDialogController(boqVar, "showFastRecharge", "", "");
    }

    @liq(key = "follow", uiThread = true)
    public void follow(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5) {
        follow(boqVar, str, str2, str3, str4, str5, true);
    }
}
