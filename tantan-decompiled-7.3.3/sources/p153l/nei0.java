package p153l;

import android.app.Dialog;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.gson.JsonObject;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.camera.TTCameraAct;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.camera.upload.C4860b;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Objects;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class nei0 extends wc00 {

    /* JADX INFO: renamed from: h */
    public final String f141652h;

    /* JADX INFO: renamed from: i */
    public kcg0 f141653i;

    /* JADX INFO: renamed from: l.nei0$a */
    public class C18864a implements aiv.C15716a.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xc00 f141654a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f141655b;

        public C18864a(xc00 xc00Var, String str) {
            this.f141654a = xc00Var;
            this.f141655b = str;
        }

        @Override // p153l.aiv.C15716a.b, p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            String str = TextUtils.isEmpty(bLiveGivenGiftBrief.sendGiftOriginalId) ? "" : bLiveGivenGiftBrief.sendGiftOriginalId;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("sendGiftOriginalId", str);
            this.f141654a.mo99544d().mo97004b(this.f141655b, "1", nei0.this.m162894r0(jsonObject.toString()));
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
            this.f141654a.mo99544d().mo97004b(this.f141655b, User.ID_TEAM_ACCOUNT);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
            this.f141654a.mo99544d().mo97004b(this.f141655b, "0");
        }
    }

    public nei0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        this.f141652h = "from_h5";
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m162860L(xc00 xc00Var, String str, String str2, C4860b.b bVar) {
        if (bVar.f17976a == 1) {
            xc00Var.mo99544d().mo97004b(str, bVar.f17978c);
        }
        if (bVar.f17976a == 2) {
            xc00Var.mo99544d().mo97004b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m162866R(xc00 xc00Var, OperationWebView operationWebView) {
        xc00Var.mo99541a().setTag(ycc0.f198425K0, null);
        operationWebView.m76277s0();
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m162868T(xc00 xc00Var, String str, String str2, String str3) {
        if (xc00Var.mo99542b()) {
            return;
        }
        m162890q0().mo176773E1(new crp0(str, str2, str3));
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m162873Y(xc00 xc00Var, String str, String str2, C4860b.b bVar) {
        if (bVar.f17976a == 1) {
            xc00Var.mo99544d().mo97004b(str, bVar.f17978c);
        }
        if (bVar.f17976a == 2) {
            xc00Var.mo99544d().mo97004b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m162874Z(String str, String str2, xc00 xc00Var) {
        twl twlVarM162890q0 = m162890q0();
        String url = xc00Var.mo99541a().getUrl();
        final hqq hqqVarMo99544d = xc00Var.mo99544d();
        Objects.requireNonNull(hqqVarMo99544d);
        twlVarM162890q0.mo176774H1(new qqq(str, str2, url, new z20() { // from class: l.dei0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                hqqVarMo99544d.mo97004b((String) obj, (String) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m162876b0(Act act, String str, final xc00 xc00Var, final String str2) {
        if (act == null || act.isFinishing()) {
            return;
        }
        mbs.m157850e0(act, str, new x20() { // from class: l.bei0
            @Override // p153l.x20
            public final void call() {
                xc00Var.mo99544d().mo97004b(str2, new String[0]);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m162879e0(xc00 xc00Var, String str, String str2, C4860b.b bVar) {
        int i = bVar.f17976a;
        if (i == 1) {
            xc00Var.mo99544d().mo97004b(str, bVar.f17978c);
        } else if (i == 2) {
            xc00Var.mo99544d().mo97004b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m162887m0(xc00 xc00Var, String str, String str2, C4860b.b bVar) {
        if (bVar.f17976a == 1) {
            xc00Var.mo99544d().mo97004b(str, bVar.f17978c);
        }
        if (bVar.f17976a == 2) {
            xc00Var.mo99544d().mo97004b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static twl m162890q0() {
        return iiv.m140145b();
    }

    /* JADX INFO: renamed from: A0 */
    public void m162891A0(@NonNull final xc00 xc00Var, String str, final String str2, final String str3, String str4) {
        if (!TTCameraConfig.m30711n(str)) {
            xc00Var.mo99544d().mo97004b(str3, "2000");
        }
        psd0.m173633z(this.f141653i);
        this.f141653i = xc00Var.mo99543c().duringCreated(C4860b.m30824a().m30825b()).subscribe(psd0.m173596G(new y20() { // from class: l.mdi0
            @Override // p153l.y20
            public final void call(Object obj) {
                nei0.m162860L(xc00Var, str2, str3, (C4860b.b) obj);
            }
        }));
        TTCameraAct.m30705b2(xc00Var.mo99543c(), TTCameraConfig.m30712p().m30739e(true).m30741g(str).m30740f(30).m30742h(true).m30737c(true).m30736b(true).m30738d(str4).m30735a());
    }

    /* JADX INFO: renamed from: B0 */
    public void m162892B0(@NonNull final xc00 xc00Var, String str, final String str2, final String str3, String str4) {
        if (!TTCameraConfig.m30711n(str)) {
            xc00Var.mo99544d().mo97004b(str3, "2000");
        }
        psd0.m173633z(this.f141653i);
        this.f141653i = xc00Var.mo99543c().duringCreated(C4860b.m30824a().m30825b()).subscribe(psd0.m173596G(new y20() { // from class: l.gei0
            @Override // p153l.y20
            public final void call(Object obj) {
                nei0.m162873Y(xc00Var, str2, str3, (C4860b.b) obj);
            }
        }));
        TTCameraAct.m30705b2(xc00Var.mo99543c(), TTCameraConfig.m30712p().m30739e(false).m30741g(str).m30737c(true).m30738d(str4).m30742h(true).m30736b(true).m30735a());
    }

    @lkq(key = "applyVoiceCall")
    public void applyVoiceCall(@NonNull xc00 xc00Var) {
        l51.m152893M(new Runnable() { // from class: l.ldi0
            @Override // java.lang.Runnable
            public final void run() {
                nei0.m162890q0().mo176793v1();
            }
        });
    }

    @lkq(key = "campaignController")
    public void campaignController(@NonNull xc00 xc00Var, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(str, "getCurrentServerTime")) {
            xc00Var.mo99544d().mo97004b(str3, String.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        } else {
            if (TextUtils.equals(str, "showLiveRankPage")) {
                return;
            }
            ((hiv) zrv.m221194l(htd0.f111521c)).m135147G(str, str2);
        }
    }

    @lkq(key = "closeLiveCampaignDialog")
    public void closeLiveCampaignDialog(@NonNull xc00 xc00Var) {
        m162890q0().mo176787W();
    }

    @lkq(key = "closeOperationWebview")
    public void closeOperationWebview(@NonNull final xc00 xc00Var) {
        Object tag = xc00Var.mo99541a().getTag(ycc0.f198425K0);
        if (tag instanceof OperationWebView) {
            final OperationWebView operationWebView = (OperationWebView) tag;
            l51.m152887G(new Runnable() { // from class: l.udi0
                @Override // java.lang.Runnable
                public final void run() {
                    nei0.m162866R(xc00Var, operationWebView);
                }
            });
        }
    }

    @lkq(key = "fanBaseController")
    public void fanBaseController(@NonNull final xc00 xc00Var, final String str, final String str2, final String str3) {
        l51.m152893M(new Runnable() { // from class: l.zdi0
            @Override // java.lang.Runnable
            public final void run() {
                nei0.m162890q0().mo176790j0(new drq(str, str2, new y20() { // from class: l.cei0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        xc00Var.mo99544d().mo97004b(str, (String) obj);
                    }
                }));
            }
        });
    }

    @lkq(key = "follow", uiThread = true)
    public void follow(@NonNull final xc00 xc00Var, String str, String str2, final String str3, final String str4, final String str5, final boolean z) {
        if (m162896t0(xc00Var)) {
            m162890q0().mo176785V0(str, str2, str3, str4, str5, z, new y20() { // from class: l.sdi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc00Var.mo99544d().mo97003a((String) obj);
                }
            }, new y20() { // from class: l.tdi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc00Var.mo99544d().mo97003a((String) obj);
                }
            });
        } else {
            final String str6 = TextUtils.isEmpty(str2) ? "liveRoom" : str2;
            xc00Var.mo99543c().duringCreated((C22421c) LivingNormalApiProvider.m72737q5(str).flatMap(new qcj() { // from class: l.pdi0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return mbs.m157859j(mbs.m157870o0(), (User) obj, z, str6, str3);
                }
            })).subscribe(dhw.m115826e(new y20() { // from class: l.qdi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc00Var.mo99544d().mo97003a(str4);
                }
            }, new y20() { // from class: l.rdi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc00Var.mo99544d().mo97003a(str5);
                }
            }));
        }
    }

    @lkq(key = "getIntlConfig")
    public void getIntlConfig(@NonNull xc00 xc00Var, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveRegionTag", TEnum.equals(uqb0.f180402h0, "unknown_") ? "" : uqb0.f180402h0.toString());
            m205739G(str, jSONObject.toString());
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            m205738F(WeJson.EMPTY_MAP);
        }
    }

    @lkq(key = "getRoomConfig", uiThread = true)
    public void getRoomConfig(@NonNull xc00 xc00Var, boolean z, final String str) {
        m162890q0().mo131189j1(z, new y20() { // from class: l.iei0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114588a.m162897u0(str, (String) obj);
            }
        });
    }

    @lkq(key = "getShootGameConfig", uiThread = true)
    public void getShootGameConfig(@NonNull xc00 xc00Var, final String str) {
        m162890q0().mo176777M(new y20() { // from class: l.wdi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188557a.m162898v0(str, (String) obj);
            }
        });
    }

    @lkq(key = "jumpRecharge")
    public void jumpRecharge(@NonNull xc00 xc00Var, String str) {
        v5k0.m199901m(xc00Var.mo99543c(), "jumpRecharge?successHandler=" + str);
    }

    @lkq(key = "jumpToCover")
    public void jumpToCover(@NonNull xc00 xc00Var) {
        v5k0.m199901m(xc00Var.mo99543c(), "liveCover?source=from_h5");
    }

    @lkq(key = "jumpToLiveAnchor")
    public void jumpToLiveAnchor(@NonNull xc00 xc00Var) {
        jumpToPreviewPage(xc00Var);
    }

    @lkq(key = "jumpToPreviewPage")
    public void jumpToPreviewPage(@NonNull xc00 xc00Var) {
        ujt.m196460b(xc00Var.mo99543c(), Uri.parse("tantanapp://liveAnchor?anchorSource=from_h5"));
    }

    @lkq(key = "jumpToPreviewVoiceRoom", uiThread = true)
    public void jumpToPreviewVoiceRoom(@NonNull xc00 xc00Var) {
        if (m162896t0(xc00Var)) {
            return;
        }
        m162890q0().mo176787W();
        ujt.m196460b(xc00Var.mo99543c(), Uri.parse("tantanapp://startVoiceLive?anchorSource=from_h5"));
    }

    @lkq(key = "jumpToProfile")
    public void jumpToProfile(@NonNull xc00 xc00Var, String str, String str2) {
        if (m162896t0(xc00Var)) {
            if (tnt.m191965b(str2)) {
                m162890q0().mo176776L0(str, str2);
                return;
            } else {
                m162890q0().mo176776L0(str, "live_from_h5");
                return;
            }
        }
        v5k0.m199901m(xc00Var.mo99543c(), "jumpToProfile?userId=" + str + "&from=live_from_h5");
    }

    @lkq(key = "jumpToRoom")
    public void jumpToRoom(@NonNull final xc00 xc00Var, final String str, final String str2, final String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "default";
        }
        if (m162896t0(xc00Var)) {
            l51.m152893M(new Runnable() { // from class: l.ndi0
                @Override // java.lang.Runnable
                public final void run() {
                    nei0.m162868T(xc00Var, str, str2, str3);
                }
            });
            return;
        }
        v5k0.m199901m(xc00Var.mo99543c(), "openLiveRoom?liveId=" + str + "&roomId=" + str2 + "&source=" + str3);
    }

    @lkq(key = "jumpToStartLive")
    public void jumpToStartLive(@NonNull xc00 xc00Var) {
        v5k0.m199901m(xc00Var.mo99543c(), "jumpToStartLive?anchorSource=from_h5");
    }

    @lkq(key = "jumpToVoiceRoom")
    public void jumpToVoiceRoom(@NonNull xc00 xc00Var, String str, String str2) {
        m162893p0(xc00Var);
        v5k0.m199901m(xc00Var.mo99543c(), "enterVoiceRoom?liveId=" + str + "&source=" + str2);
    }

    @lkq(key = "liveGiftDialogController")
    public void liveGiftDialogController(@NonNull xc00 xc00Var, String str, String str2, String str3) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135148H(str, str2, new C18864a(xc00Var, str3));
    }

    @lkq(key = "liveNativeLog")
    public void liveNativeLog(@NonNull xc00 xc00Var, final String str) {
        if (m162896t0(xc00Var)) {
            l51.m152893M(new Runnable() { // from class: l.mei0
                @Override // java.lang.Runnable
                public final void run() {
                    nei0.m162890q0().mo176780S0(str);
                }
            });
        } else {
            cxk.m113043b("unset", "unset", str);
        }
    }

    @lkq(key = "liveNewUserRedPacketController")
    public void liveNewUserRedPacketController(@NonNull xc00 xc00Var, String str, String str2, String str3) {
        if (!"getStatusAndSeconds".equals(str)) {
            ((hiv) zrv.m221194l(htd0.f111521c)).m135149I(str, str2);
            return;
        }
        hqq hqqVarMo99544d = xc00Var.mo99544d();
        htd0<civ> htd0Var = htd0.f111524f;
        hqqVarMo99544d.mo97004b(str3, ((civ) zrv.m221194l(htd0Var)).m109971o(), String.valueOf(((civ) zrv.m221194l(htd0Var)).m109972p()));
    }

    @lkq(key = "nativeDialogController")
    public void nativeDialogController(@NonNull final xc00 xc00Var, final String str, final String str2) {
        l51.m152893M(new Runnable() { // from class: l.jei0
            @Override // java.lang.Runnable
            public final void run() {
                nei0.m162874Z(str, str2, xc00Var);
            }
        });
    }

    @lkq(key = "onTeenModeEnable")
    public void onTeenModeEnable(@NonNull xc00 xc00Var, boolean z) {
        v5k0.m199901m(xc00Var.mo99543c(), "onTeenModeEnable?enable=" + z);
    }

    @lkq(key = "openToSchema")
    public void openToSchema(@NonNull final xc00 xc00Var, final String str) {
        l51.m152893M(new Runnable() { // from class: l.kei0
            @Override // java.lang.Runnable
            public final void run() {
                ujt.m196460b(xc00Var.mo99543c(), Uri.parse(str));
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m162893p0(@NonNull xc00 xc00Var) {
        if (NullChecker.m82486a(xc00Var.mo99541a().getTag(ldc0.f131477K2)) && (xc00Var.mo99541a().getTag(ldc0.f131477K2) instanceof Dialog)) {
            Dialog dialog = (Dialog) xc00Var.mo99541a().getTag(ldc0.f131477K2);
            xc00Var.mo99541a().setTag(ldc0.f131477K2, null);
            dialog.dismiss();
        }
    }

    @lkq(key = "payFirstRecharge")
    public void payFirstRecharge(@NonNull xc00 xc00Var, final String str) {
        l51.m152893M(new Runnable() { // from class: l.vdi0
            @Override // java.lang.Runnable
            public final void run() {
                nei0.m162890q0().mo176791u0(str);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final String m162894r0(String str) {
        try {
            String strQuote = JSONObject.quote(str);
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    @lkq(key = "redPointState")
    public void redPointState(@NonNull xc00 xc00Var, boolean z) {
        ((fk3) tbs.m190077m(itd0.f116820b)).f99466q.m137019l(Boolean.valueOf(z));
    }

    @lkq(key = "refreshGuildAuth")
    public void refreshGuildAuth(@NonNull xc00 xc00Var) {
        v5k0.m199901m(xc00Var.mo99543c(), "refreshGuildAuth");
    }

    @lkq(key = "refreshLiveAuth")
    public void refreshLiveAuth(@NonNull xc00 xc00Var) {
        v5k0.m199901m(xc00Var.mo99543c(), "refreshLiveAuth");
    }

    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final void m162900x0(@NonNull final xc00 xc00Var, final String str, final LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        l51.m152887G(new Runnable() { // from class: l.eei0
            @Override // java.lang.Runnable
            public final void run() {
                this.f93647a.m162899w0(xc00Var, str, liveCampaignInfo);
            }
        });
    }

    @lkq(key = "sendChatMessage")
    public void sendChatMessage(@NonNull xc00 xc00Var, final String str, final String str2) {
        l51.m152893M(new Runnable() { // from class: l.lei0
            @Override // java.lang.Runnable
            public final void run() {
                nei0.m162890q0().mo176788X(new rz4(str, str2));
            }
        });
    }

    @lkq(key = "showRechargeDialog")
    public void showRechargeDialog(@NonNull xc00 xc00Var) {
        l51.m152893M(new Runnable() { // from class: l.kdi0
            @Override // java.lang.Runnable
            public final void run() {
                nei0.m162890q0().mo176778O1();
            }
        });
    }

    @lkq(key = "showTTCoinDialog")
    public void showTTCoinDialog(@NonNull final xc00 xc00Var, final String str, final String str2) {
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        l51.m152893M(new Runnable() { // from class: l.odi0
            @Override // java.lang.Runnable
            public final void run() {
                nei0.m162876b0(putongActMo99543c, str2, xc00Var, str);
            }
        });
    }

    @lkq(key = "showVoteResultDialog")
    public void showVoteResultDialog(@NonNull xc00 xc00Var, final String str) {
        l51.m152893M(new Runnable() { // from class: l.aei0
            @Override // java.lang.Runnable
            public final void run() {
                nei0.m162890q0().mo176775I1(str);
            }
        });
    }

    @lkq(key = "subscribeCampaign", uiThread = true)
    public void subscribeCampaign(@NonNull final xc00 xc00Var, String str, final String str2, final String str3) {
        MKWebView mKWebViewMo99541a = xc00Var.mo99541a();
        m162890q0().mo131188f0(new bcg0(str, mKWebViewMo99541a.hashCode(), new ve4() { // from class: l.xdi0
            @Override // p153l.ve4
            /* JADX INFO: renamed from: a */
            public final void mo152372a(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
                this.f193596a.m162900x0(xc00Var, str3, liveCampaignInfo);
            }
        }, new y20() { // from class: l.ydi0
            @Override // p153l.y20
            public final void call(Object obj) {
                xc00Var.mo99544d().mo97004b(str2, ((Boolean) obj).booleanValue() ? "1" : "0");
            }
        }));
    }

    @lkq(key = "syncShootGameStatus")
    public void syncShootGameStatus(@NonNull xc00 xc00Var, final boolean z, final String str, final int i, final int i2, final int i3) {
        fhw.m125605a("shootGame", "syncShootGameStatus:" + z + ":" + str + ":" + i + ":" + i2 + ":" + i3);
        l51.m152893M(new Runnable() { // from class: l.fei0
            @Override // java.lang.Runnable
            public final void run() {
                nei0.m162890q0().mo176792v(z, str, i, i2, i3);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m162896t0(@NonNull xc00 xc00Var) {
        return xc00Var.mo99543c() instanceof LiveAct;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m162897u0(String str, String str2) {
        m205739G(str, str2);
    }

    @lkq(key = "userCardController", uiThread = true)
    public void userCardController(@NonNull xc00 xc00Var, String str, String str2, String str3) {
        m162890q0().mo176783U0(new frq(str, str2, str3));
        if (TextUtils.equals(str, "show")) {
            if (TextUtils.isEmpty(str2) || str2.equals("0")) {
                CrashHelper.m82479c(new Exception("userCardController UserCardData userId is null url = " + xc00Var.mo99541a().getUrl()));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        byte b = -1;
        switch (str2.hashCode()) {
            case -2127327456:
                if (str2.equals("takeSpecialPhoto")) {
                    b = 0;
                }
                break;
            case -2077536394:
                if (str2.equals("liveNewUserRedPacketController")) {
                    b = 1;
                }
                break;
            case -1915690464:
                if (str2.equals("jumpToProfile")) {
                    b = 2;
                }
                break;
            case -1651917078:
                if (str2.equals("jumpToLiveAnchor")) {
                    b = 3;
                }
                break;
            case -1561940160:
                if (str2.equals("fanBaseController")) {
                    b = 4;
                }
                break;
            case -1528981329:
                if (str2.equals("refreshLiveAuth")) {
                    b = 5;
                }
                break;
            case -1350408550:
                if (str2.equals("voiceAnchorNameVerified")) {
                    b = 6;
                }
                break;
            case -1315597323:
                if (str2.equals("getIntlConfig")) {
                    b = 7;
                }
                break;
            case -1268958287:
                if (str2.equals("follow")) {
                    b = 8;
                }
                break;
            case -1121299171:
                if (str2.equals("getShootGameConfig")) {
                    b = 9;
                }
                break;
            case -986718345:
                if (str2.equals("userCardController")) {
                    b = 10;
                }
                break;
            case -966842450:
                if (str2.equals("jumpToPreviewVoiceRoom")) {
                    b = 11;
                }
                break;
            case -839680286:
                if (str2.equals("applyVoiceCall")) {
                    b = 12;
                }
                break;
            case -555494460:
                if (str2.equals("jumpToRoom")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case -474192671:
                if (str2.equals("previewSpecialPhoto")) {
                    b = 14;
                }
                break;
            case -468632790:
                if (str2.equals("previewSpecialVideo")) {
                    b = 15;
                }
                break;
            case -372407320:
                if (str2.equals("syncShootGameStatus")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case -355575686:
                if (str2.equals("subscribeCampaign")) {
                    b = 17;
                }
                break;
            case -350366289:
                if (str2.equals("payFirstRecharge")) {
                    b = 18;
                }
                break;
            case -250165003:
                if (str2.equals("jumpRecharge")) {
                    b = 19;
                }
                break;
            case -54305298:
                if (str2.equals("jumpToCover")) {
                    b = 20;
                }
                break;
            case 81856545:
                if (str2.equals("liveNativeLog")) {
                    b = 21;
                }
                break;
            case 96651104:
                if (str2.equals("liveGiftDialogController")) {
                    b = 22;
                }
                break;
            case 137833676:
                if (str2.equals("campaignController")) {
                    b = 23;
                }
                break;
            case 160261351:
                if (str2.equals("sendChatMessage")) {
                    b = 24;
                }
                break;
            case 166680563:
                if (str2.equals("getRoomConfig")) {
                    b = 25;
                }
                break;
            case 190922291:
                if (str2.equals("recordSpecialVideo")) {
                    b = 26;
                }
                break;
            case 238925142:
                if (str2.equals("showTTCoinDialog")) {
                    b = 27;
                }
                break;
            case 304847481:
                if (str2.equals("closeDialogWebview")) {
                    b = 28;
                }
                break;
            case 356638705:
                if (str2.equals("verifyTeenModePassword")) {
                    b = 29;
                }
                break;
            case 438304549:
                if (str2.equals("jumpToStartLive")) {
                    b = 30;
                }
                break;
            case 651020603:
                if (str2.equals("nativeDialogController")) {
                    b = 31;
                }
                break;
            case 695388262:
                if (str2.equals("openToSchema")) {
                    b = HttpTokens.SPACE;
                }
                break;
            case 711412818:
                if (str2.equals("redPointState")) {
                    b = 33;
                }
                break;
            case 1064131228:
                if (str2.equals("closeLiveCampaignDialog")) {
                    b = 34;
                }
                break;
            case 1089133422:
                if (str2.equals("jumpToPreviewPage")) {
                    b = 35;
                }
                break;
            case 1239070508:
                if (str2.equals("showRechargeDialog")) {
                    b = 36;
                }
                break;
            case 1310977952:
                if (str2.equals("refreshGuildAuth")) {
                    b = 37;
                }
                break;
            case 1348968106:
                if (str2.equals("closeOperationWebview")) {
                    b = 38;
                }
                break;
            case 1457636159:
                if (str2.equals("onTeenModeEnable")) {
                    b = 39;
                }
                break;
            case 1548747748:
                if (str2.equals("jumpToVoiceRoom")) {
                    b = 40;
                }
                break;
            case 2133689580:
                if (str2.equals("showVoteResultDialog")) {
                    b = 41;
                }
                break;
        }
        switch (b) {
            case 0:
                m162892B0(xc00Var, jSONObject.optString("type"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optString("description"));
                return true;
            case 1:
                liveNewUserRedPacketController(xc00Var, jSONObject.optString("type"), jSONObject.optString("content"), jSONObject.optString("callBack"));
                return true;
            case 2:
                jumpToProfile(xc00Var, jSONObject.optString("userId"), jSONObject.optString("from"));
                return true;
            case 3:
                jumpToLiveAnchor(xc00Var);
                return true;
            case 4:
                fanBaseController(xc00Var, jSONObject.optString("action"), jSONObject.optString("content"), jSONObject.optString("callback"));
                return true;
            case 5:
                refreshLiveAuth(xc00Var);
                return true;
            case 6:
                voiceAnchorNameVerified(xc00Var);
                return true;
            case 7:
                getIntlConfig(xc00Var, jSONObject.optString("success"));
                return true;
            case 8:
                follow(xc00Var, jSONObject.optString("otherUid"), jSONObject.optString("source"), jSONObject.optString("liveId"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optBoolean("isFollow", true));
                return true;
            case 9:
                getShootGameConfig(xc00Var, jSONObject.optString("callback"));
                return true;
            case 10:
                userCardController(xc00Var, jSONObject.optString("action"), jSONObject.optString("content"), jSONObject.optString("callBack"));
                return true;
            case 11:
                jumpToPreviewVoiceRoom(xc00Var);
                return true;
            case 12:
                applyVoiceCall(xc00Var);
                return true;
            case 13:
                jumpToRoom(xc00Var, jSONObject.optString("liveId"), jSONObject.optString("roomId"), jSONObject.optString("source"));
                return true;
            case 14:
                m162901y0(xc00Var, jSONObject.optString("type"), jSONObject.optString("url"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optString("description"));
                return true;
            case 15:
                m162902z0(xc00Var, jSONObject.optString("type"), jSONObject.optString("url"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optString("description"));
                return true;
            case 16:
                syncShootGameStatus(xc00Var, jSONObject.optBoolean("isAll"), jSONObject.optString(NotificationCompat.CATEGORY_STATUS), jSONObject.optInt("stage"), jSONObject.optInt(BLiveOperationTitleShowType.duration), jSONObject.optInt("ballCount"));
                return true;
            case 17:
                subscribeCampaign(xc00Var, jSONObject.optString("subscribeType"), jSONObject.optString("subscribeHandler"), jSONObject.optString("refreshHandler"));
                return true;
            case 18:
                payFirstRecharge(xc00Var, jSONObject.optString("payType"));
                return true;
            case 19:
                String strOptString = jSONObject.optString("successHandler");
                if (TextUtils.isEmpty(strOptString)) {
                    jumpRecharge(xc00Var);
                } else {
                    jumpRecharge(xc00Var, strOptString);
                }
                return true;
            case 20:
                jumpToCover(xc00Var);
                return true;
            case 21:
                liveNativeLog(xc00Var, jSONObject.optString("keyInfo"));
                return true;
            case 22:
                liveGiftDialogController(xc00Var, jSONObject.optString("type"), jSONObject.optString("content"), jSONObject.optString("callBack"));
                return true;
            case 23:
                campaignController(xc00Var, jSONObject.optString("action"), jSONObject.optString("content"), jSONObject.optString("callBack"));
                return true;
            case 24:
                sendChatMessage(xc00Var, jSONObject.optString("type"), jSONObject.optString("content"));
                return true;
            case 25:
                getRoomConfig(xc00Var, jSONObject.optBoolean("noFanBaseId", false), jSONObject.optString("callback"));
                return true;
            case 26:
                m162891A0(xc00Var, jSONObject.optString("type"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optString("description"));
                return true;
            case 27:
                showTTCoinDialog(xc00Var, jSONObject.optString("successHandler"), jSONObject.optString("from"));
                return true;
            case 28:
                m162893p0(xc00Var);
                return true;
            case 29:
                verifyTeenModePassword(xc00Var, jSONObject.optBoolean("verified"), jSONObject.optInt("scenes"));
                return true;
            case 30:
                jumpToStartLive(xc00Var);
                return true;
            case 31:
                nativeDialogController(xc00Var, jSONObject.optString("action"), jSONObject.optString("jsDialogConfig"));
                return true;
            case 32:
                openToSchema(xc00Var, jSONObject.optString("schema"));
                return true;
            case 33:
                redPointState(xc00Var, jSONObject.optBoolean("showRedPoint"));
                return true;
            case 34:
                closeLiveCampaignDialog(xc00Var);
                return true;
            case 35:
                jumpToPreviewPage(xc00Var);
                return true;
            case 36:
                showRechargeDialog(xc00Var);
                return true;
            case 37:
                refreshGuildAuth(xc00Var);
                return true;
            case 38:
                closeOperationWebview(xc00Var);
                return true;
            case 39:
                onTeenModeEnable(xc00Var, jSONObject.optBoolean("enable"));
                return true;
            case 40:
                jumpToVoiceRoom(xc00Var, jSONObject.optString("liveId"), jSONObject.optString("source"));
                return true;
            case 41:
                showVoteResultDialog(xc00Var, jSONObject.optString("voteRecordId"));
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m162898v0(String str, String str2) {
        m205739G(str, str2);
    }

    @lkq(key = "verifyTeenModePassword")
    public void verifyTeenModePassword(@NonNull xc00 xc00Var, boolean z, int i) {
        v5k0.m199901m(xc00Var.mo99543c(), "verifyTeenModePassword?verified=" + z + "&scenes=" + i);
    }

    @lkq(key = "voiceAnchorNameVerified")
    public void voiceAnchorNameVerified(@NonNull xc00 xc00Var) {
        if (m162896t0(xc00Var)) {
            ((urv) zrv.m221194l(htd0.f111522d)).m197668d(true);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m162899w0(xc00 xc00Var, String str, LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        if (xc00Var.mo99542b()) {
            return;
        }
        m205739G(str, liveCampaignInfo.getUpdateType(), liveCampaignInfo.getData());
    }

    /* JADX INFO: renamed from: y0 */
    public void m162901y0(@NonNull final xc00 xc00Var, String str, String str2, final String str3, final String str4, String str5) {
        if (!TTCameraConfig.m30711n(str)) {
            xc00Var.mo99544d().mo97004b(str4, "2000");
        }
        psd0.m173633z(this.f141653i);
        this.f141653i = xc00Var.mo99543c().duringCreated(C4860b.m30824a().m30825b()).subscribe(psd0.m173596G(new y20() { // from class: l.jdi0
            @Override // p153l.y20
            public final void call(Object obj) {
                nei0.m162887m0(xc00Var, str3, str4, (C4860b.b) obj);
            }
        }));
        TTCameraConfig tTCameraConfigM30735a = TTCameraConfig.m30712p().m30739e(false).m30737c(true).m30741g(str).m30742h(true).m30738d(str5).m30736b(true).m30735a();
        xc00Var.mo99543c().startActivity(TTCameraPreviewAndUploadAct.m30768Z1(xc00Var.mo99543c(), tTCameraConfigM30735a, TTCameraPreviewConfig.m30774e().m30796f(str2).m30793c(tTCameraConfigM30735a).m30797g(false).m30791a()));
    }

    /* JADX INFO: renamed from: z0 */
    public void m162902z0(@NonNull final xc00 xc00Var, String str, String str2, final String str3, final String str4, String str5) {
        if (!TTCameraConfig.m30711n(str)) {
            xc00Var.mo99544d().mo97004b(str4, "2000");
        }
        psd0.m173633z(this.f141653i);
        this.f141653i = xc00Var.mo99543c().duringCreated(C4860b.m30824a().m30825b()).subscribe(psd0.m173596G(new y20() { // from class: l.hei0
            @Override // p153l.y20
            public final void call(Object obj) {
                nei0.m162879e0(xc00Var, str3, str4, (C4860b.b) obj);
            }
        }));
        TTCameraConfig tTCameraConfigM30735a = TTCameraConfig.m30712p().m30739e(true).m30737c(true).m30742h(true).m30741g(str).m30740f(30).m30736b(true).m30738d(str5).m30735a();
        TTCameraPreviewAndUploadAct.m30769a2(xc00Var.mo99543c(), tTCameraConfigM30735a, TTCameraPreviewConfig.m30774e().m30796f(str2).m30799i().m30798h().m30793c(tTCameraConfigM30735a).m30797g(false).m30791a());
    }

    @lkq(key = "jumpRecharge")
    public void jumpRecharge(@NonNull xc00 xc00Var) {
        liveGiftDialogController(xc00Var, "showFastRecharge", "", "");
    }

    @lkq(key = "follow", uiThread = true)
    public void follow(@NonNull xc00 xc00Var, String str, String str2, String str3, String str4, String str5) {
        follow(xc00Var, str, str2, str3, str4, str5, true);
    }
}
