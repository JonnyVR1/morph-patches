package p149l;

import android.app.Dialog;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.gson.JsonObject;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.camera.TTCameraAct;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.camera.upload.C4709b;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.Objects;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class c6i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public final String f79547h;

    /* JADX INFO: renamed from: i */
    public c4g0 f79548i;

    /* JADX INFO: renamed from: l.c6i0$a */
    public class C16087a implements zfv.C21687a.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f79549a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f79550b;

        public C16087a(f400 f400Var, String str) {
            this.f79549a = f400Var;
            this.f79550b = str;
        }

        @Override // p149l.zfv.C21687a.b, p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            String str = TextUtils.isEmpty(bLiveGivenGiftBrief.sendGiftOriginalId) ? "" : bLiveGivenGiftBrief.sendGiftOriginalId;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("sendGiftOriginalId", str);
            this.f79549a.mo102962d().mo127285b(this.f79550b, "1", c6i0.this.m105464j0(jsonObject.toString()));
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
            this.f79549a.mo102962d().mo127285b(this.f79550b, User.ID_TEAM_ACCOUNT);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
            this.f79549a.mo102962d().mo127285b(this.f79550b, "0");
        }
    }

    public c6i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        this.f79547h = "from_h5";
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m105432D(f400 f400Var, String str, String str2, C4709b.b bVar) {
        if (bVar.f17257a == 1) {
            f400Var.mo102962d().mo127285b(str, bVar.f17259c);
        }
        if (bVar.f17257a == 2) {
            f400Var.mo102962d().mo127285b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m105438J(f400 f400Var, OperationWebView operationWebView) {
        f400Var.mo102959a().setTag(s4c0.f162304K0, null);
        operationWebView.m75094s0();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m105440L(f400 f400Var, String str, String str2, String str3) {
        if (f400Var.mo102960b()) {
            return;
        }
        m105462i0().mo123189E1(new zhp0(str, str2, str3));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m105445Q(f400 f400Var, String str, String str2, C4709b.b bVar) {
        if (bVar.f17257a == 1) {
            f400Var.mo102962d().mo127285b(str, bVar.f17259c);
        }
        if (bVar.f17257a == 2) {
            f400Var.mo102962d().mo127285b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m105446R(String str, String str2, f400 f400Var) {
        ful fulVarM105462i0 = m105462i0();
        String url = f400Var.mo102959a().getUrl();
        final hoq hoqVarMo102962d = f400Var.mo102962d();
        Objects.requireNonNull(hoqVarMo102962d);
        fulVarM105462i0.mo123190H1(new qoq(str, str2, url, new f30() { // from class: l.s5i0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                hoqVarMo102962d.mo127285b((String) obj, (String) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m105448T(Act act, String str, final f400 f400Var, final String str2) {
        if (act == null || act.isFinishing()) {
            return;
        }
        l9s.m149073e0(act, str, new d30() { // from class: l.q5i0
            @Override // p149l.d30
            public final void call() {
                f400Var.mo102962d().mo127285b(str2, new String[0]);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m105451W(f400 f400Var, String str, String str2, C4709b.b bVar) {
        int i = bVar.f17257a;
        if (i == 1) {
            f400Var.mo102962d().mo127285b(str, bVar.f17259c);
        } else if (i == 2) {
            f400Var.mo102962d().mo127285b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m105459e0(f400 f400Var, String str, String str2, C4709b.b bVar) {
        if (bVar.f17257a == 1) {
            f400Var.mo102962d().mo127285b(str, bVar.f17259c);
        }
        if (bVar.f17257a == 2) {
            f400Var.mo102962d().mo127285b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static ful m105462i0() {
        return hgv.m130924b();
    }

    @liq(key = "applyVoiceCall")
    public void applyVoiceCall(@NonNull f400 f400Var) {
        e51.m114748M(new Runnable() { // from class: l.a5i0
            @Override // java.lang.Runnable
            public final void run() {
                c6i0.m105462i0().mo123204v1();
            }
        });
    }

    @liq(key = "campaignController")
    public void campaignController(@NonNull f400 f400Var, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(str, "getCurrentServerTime")) {
            f400Var.mo102962d().mo127285b(str3, String.valueOf(qib0.f154693H.guessedCurrentServerTime()));
        } else {
            if (TextUtils.equals(str, "showLiveRankPage")) {
                return;
            }
            ((ggv) ypv.m215673l(fld0.f98148c)).m126013G(str, str2);
        }
    }

    @liq(key = "closeLiveCampaignDialog")
    public void closeLiveCampaignDialog(@NonNull f400 f400Var) {
        m105462i0().mo123198W();
    }

    @liq(key = "closeOperationWebview")
    public void closeOperationWebview(@NonNull final f400 f400Var) {
        Object tag = f400Var.mo102959a().getTag(s4c0.f162304K0);
        if (tag instanceof OperationWebView) {
            final OperationWebView operationWebView = (OperationWebView) tag;
            e51.m114742G(new Runnable() { // from class: l.j5i0
                @Override // java.lang.Runnable
                public final void run() {
                    c6i0.m105438J(f400Var, operationWebView);
                }
            });
        }
    }

    @liq(key = "fanBaseController")
    public void fanBaseController(@NonNull final f400 f400Var, final String str, final String str2, final String str3) {
        e51.m114748M(new Runnable() { // from class: l.o5i0
            @Override // java.lang.Runnable
            public final void run() {
                c6i0.m105462i0().mo123201j0(new dpq(str, str2, new e30() { // from class: l.r5i0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        f400Var.mo102962d().mo127285b(str, (String) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "follow", uiThread = true)
    public void follow(@NonNull final f400 f400Var, String str, String str2, final String str3, final String str4, final String str5, final boolean z) {
        if (m105466l0(f400Var)) {
            m105462i0().mo123197V0(str, str2, str3, str4, str5, z, new e30() { // from class: l.h5i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    f400Var.mo102962d().mo127284a((String) obj);
                }
            }, new e30() { // from class: l.i5i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    f400Var.mo102962d().mo127284a((String) obj);
                }
            });
        } else {
            final String str6 = TextUtils.isEmpty(str2) ? "liveRoom" : str2;
            f400Var.mo102961c().duringCreated((C22306c) LivingNormalApiProvider.m71554q5(str).flatMap(new w9j() { // from class: l.e5i0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return l9s.m149082j(l9s.m149093o0(), (User) obj, z, str6, str3);
                }
            })).subscribe(ffw.m121194e(new e30() { // from class: l.f5i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    f400Var.mo102962d().mo127284a(str4);
                }
            }, new e30() { // from class: l.g5i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    f400Var.mo102962d().mo127284a(str5);
                }
            }));
        }
    }

    @liq(key = "getIntlConfig")
    public void getIntlConfig(@NonNull f400 f400Var, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveRegionTag", TEnum.equals(qib0.f154719h0, "unknown_") ? "" : qib0.f154719h0.toString());
            m114660y(str, jSONObject.toString());
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            m114659x(WeJson.EMPTY_MAP);
        }
    }

    @liq(key = "getRoomConfig", uiThread = true)
    public void getRoomConfig(@NonNull f400 f400Var, boolean z, final String str) {
        m105462i0().mo122257j1(z, new e30() { // from class: l.x5i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191148a.m105467m0(str, (String) obj);
            }
        });
    }

    @liq(key = "getShootGameConfig", uiThread = true)
    public void getShootGameConfig(@NonNull f400 f400Var, final String str) {
        m105462i0().mo123193M(new e30() { // from class: l.l5i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126176a.m105468n0(str, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m105463h0(@NonNull f400 f400Var) {
        if (NullChecker.m81303a(f400Var.mo102959a().getTag(f5c0.f95020K2)) && (f400Var.mo102959a().getTag(f5c0.f95020K2) instanceof Dialog)) {
            Dialog dialog = (Dialog) f400Var.mo102959a().getTag(f5c0.f95020K2);
            f400Var.mo102959a().setTag(f5c0.f95020K2, null);
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final String m105464j0(String str) {
        try {
            String strQuote = JSONObject.quote(str);
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    @liq(key = "jumpRecharge")
    public void jumpRecharge(@NonNull f400 f400Var, String str) {
        rwj0.m181414m(f400Var.mo102961c(), "jumpRecharge?successHandler=" + str);
    }

    @liq(key = "jumpToCover")
    public void jumpToCover(@NonNull f400 f400Var) {
        rwj0.m181414m(f400Var.mo102961c(), "liveCover?source=from_h5");
    }

    @liq(key = "jumpToLiveAnchor")
    public void jumpToLiveAnchor(@NonNull f400 f400Var) {
        jumpToPreviewPage(f400Var);
    }

    @liq(key = "jumpToPreviewPage")
    public void jumpToPreviewPage(@NonNull f400 f400Var) {
        tht.m188929b(f400Var.mo102961c(), Uri.parse("tantanapp://liveAnchor?anchorSource=from_h5"));
    }

    @liq(key = "jumpToPreviewVoiceRoom", uiThread = true)
    public void jumpToPreviewVoiceRoom(@NonNull f400 f400Var) {
        if (m105466l0(f400Var)) {
            return;
        }
        m105462i0().mo123198W();
        tht.m188929b(f400Var.mo102961c(), Uri.parse("tantanapp://startVoiceLive?anchorSource=from_h5"));
    }

    @liq(key = "jumpToProfile")
    public void jumpToProfile(@NonNull f400 f400Var, String str, String str2) {
        if (m105466l0(f400Var)) {
            if (rlt.m179881b(str2)) {
                m105462i0().mo123192L0(str, str2);
                return;
            } else {
                m105462i0().mo123192L0(str, "live_from_h5");
                return;
            }
        }
        rwj0.m181414m(f400Var.mo102961c(), "jumpToProfile?userId=" + str + "&from=live_from_h5");
    }

    @liq(key = "jumpToRoom")
    public void jumpToRoom(@NonNull final f400 f400Var, final String str, final String str2, final String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "default";
        }
        if (m105466l0(f400Var)) {
            e51.m114748M(new Runnable() { // from class: l.c5i0
                @Override // java.lang.Runnable
                public final void run() {
                    c6i0.m105440L(f400Var, str, str2, str3);
                }
            });
            return;
        }
        rwj0.m181414m(f400Var.mo102961c(), "openLiveRoom?liveId=" + str + "&roomId=" + str2 + "&source=" + str3);
    }

    @liq(key = "jumpToStartLive")
    public void jumpToStartLive(@NonNull f400 f400Var) {
        rwj0.m181414m(f400Var.mo102961c(), "jumpToStartLive?anchorSource=from_h5");
    }

    @liq(key = "jumpToVoiceRoom")
    public void jumpToVoiceRoom(@NonNull f400 f400Var, String str, String str2) {
        m105463h0(f400Var);
        rwj0.m181414m(f400Var.mo102961c(), "enterVoiceRoom?liveId=" + str + "&source=" + str2);
    }

    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final void m105470p0(@NonNull final f400 f400Var, final String str, final LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        e51.m114742G(new Runnable() { // from class: l.t5i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f167828a.m105469o0(f400Var, str, liveCampaignInfo);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m105466l0(@NonNull f400 f400Var) {
        return f400Var.mo102961c() instanceof LiveAct;
    }

    @liq(key = "liveGiftDialogController")
    public void liveGiftDialogController(@NonNull f400 f400Var, String str, String str2, String str3) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126014H(str, str2, new C16087a(f400Var, str3));
    }

    @liq(key = "liveNativeLog")
    public void liveNativeLog(@NonNull f400 f400Var, final String str) {
        if (m105466l0(f400Var)) {
            e51.m114748M(new Runnable() { // from class: l.b6i0
                @Override // java.lang.Runnable
                public final void run() {
                    c6i0.m105462i0().mo123195S0(str);
                }
            });
        } else {
            muk.m156416b("unset", "unset", str);
        }
    }

    @liq(key = "liveNewUserRedPacketController")
    public void liveNewUserRedPacketController(@NonNull f400 f400Var, String str, String str2, String str3) {
        if (!"getStatusAndSeconds".equals(str)) {
            ((ggv) ypv.m215673l(fld0.f98148c)).m126015I(str, str2);
            return;
        }
        hoq hoqVarMo102962d = f400Var.mo102962d();
        fld0<bgv> fld0Var = fld0.f98151f;
        hoqVarMo102962d.mo127285b(str3, ((bgv) ypv.m215673l(fld0Var)).m101735o(), String.valueOf(((bgv) ypv.m215673l(fld0Var)).m101736p()));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m105467m0(String str, String str2) {
        m114660y(str, str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
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
                m105474t0(f400Var, jSONObject.optString("type"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optString("description"));
                return true;
            case 1:
                liveNewUserRedPacketController(f400Var, jSONObject.optString("type"), jSONObject.optString("content"), jSONObject.optString("callBack"));
                return true;
            case 2:
                jumpToProfile(f400Var, jSONObject.optString("userId"), jSONObject.optString("from"));
                return true;
            case 3:
                jumpToLiveAnchor(f400Var);
                return true;
            case 4:
                fanBaseController(f400Var, jSONObject.optString("action"), jSONObject.optString("content"), jSONObject.optString("callback"));
                return true;
            case 5:
                refreshLiveAuth(f400Var);
                return true;
            case 6:
                voiceAnchorNameVerified(f400Var);
                return true;
            case 7:
                getIntlConfig(f400Var, jSONObject.optString("success"));
                return true;
            case 8:
                follow(f400Var, jSONObject.optString("otherUid"), jSONObject.optString("source"), jSONObject.optString("liveId"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optBoolean("isFollow", true));
                return true;
            case 9:
                getShootGameConfig(f400Var, jSONObject.optString("callback"));
                return true;
            case 10:
                userCardController(f400Var, jSONObject.optString("action"), jSONObject.optString("content"), jSONObject.optString("callBack"));
                return true;
            case 11:
                jumpToPreviewVoiceRoom(f400Var);
                return true;
            case 12:
                applyVoiceCall(f400Var);
                return true;
            case 13:
                jumpToRoom(f400Var, jSONObject.optString("liveId"), jSONObject.optString("roomId"), jSONObject.optString("source"));
                return true;
            case 14:
                m105471q0(f400Var, jSONObject.optString("type"), jSONObject.optString("url"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optString("description"));
                return true;
            case 15:
                m105472r0(f400Var, jSONObject.optString("type"), jSONObject.optString("url"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optString("description"));
                return true;
            case 16:
                syncShootGameStatus(f400Var, jSONObject.optBoolean("isAll"), jSONObject.optString(NotificationCompat.CATEGORY_STATUS), jSONObject.optInt("stage"), jSONObject.optInt(BLiveOperationTitleShowType.duration), jSONObject.optInt("ballCount"));
                return true;
            case 17:
                subscribeCampaign(f400Var, jSONObject.optString("subscribeType"), jSONObject.optString("subscribeHandler"), jSONObject.optString("refreshHandler"));
                return true;
            case 18:
                payFirstRecharge(f400Var, jSONObject.optString("payType"));
                return true;
            case 19:
                String strOptString = jSONObject.optString("successHandler");
                if (TextUtils.isEmpty(strOptString)) {
                    jumpRecharge(f400Var);
                } else {
                    jumpRecharge(f400Var, strOptString);
                }
                return true;
            case 20:
                jumpToCover(f400Var);
                return true;
            case 21:
                liveNativeLog(f400Var, jSONObject.optString("keyInfo"));
                return true;
            case 22:
                liveGiftDialogController(f400Var, jSONObject.optString("type"), jSONObject.optString("content"), jSONObject.optString("callBack"));
                return true;
            case 23:
                campaignController(f400Var, jSONObject.optString("action"), jSONObject.optString("content"), jSONObject.optString("callBack"));
                return true;
            case 24:
                sendChatMessage(f400Var, jSONObject.optString("type"), jSONObject.optString("content"));
                return true;
            case 25:
                getRoomConfig(f400Var, jSONObject.optBoolean("noFanBaseId", false), jSONObject.optString("callback"));
                return true;
            case 26:
                m105473s0(f400Var, jSONObject.optString("type"), jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optString("description"));
                return true;
            case 27:
                showTTCoinDialog(f400Var, jSONObject.optString("successHandler"), jSONObject.optString("from"));
                return true;
            case 28:
                m105463h0(f400Var);
                return true;
            case 29:
                verifyTeenModePassword(f400Var, jSONObject.optBoolean("verified"), jSONObject.optInt("scenes"));
                return true;
            case 30:
                jumpToStartLive(f400Var);
                return true;
            case 31:
                nativeDialogController(f400Var, jSONObject.optString("action"), jSONObject.optString("jsDialogConfig"));
                return true;
            case 32:
                openToSchema(f400Var, jSONObject.optString("schema"));
                return true;
            case 33:
                redPointState(f400Var, jSONObject.optBoolean("showRedPoint"));
                return true;
            case 34:
                closeLiveCampaignDialog(f400Var);
                return true;
            case 35:
                jumpToPreviewPage(f400Var);
                return true;
            case 36:
                showRechargeDialog(f400Var);
                return true;
            case 37:
                refreshGuildAuth(f400Var);
                return true;
            case 38:
                closeOperationWebview(f400Var);
                return true;
            case 39:
                onTeenModeEnable(f400Var, jSONObject.optBoolean("enable"));
                return true;
            case 40:
                jumpToVoiceRoom(f400Var, jSONObject.optString("liveId"), jSONObject.optString("source"));
                return true;
            case 41:
                showVoteResultDialog(f400Var, jSONObject.optString("voteRecordId"));
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m105468n0(String str, String str2) {
        m114660y(str, str2);
    }

    @liq(key = "nativeDialogController")
    public void nativeDialogController(@NonNull final f400 f400Var, final String str, final String str2) {
        e51.m114748M(new Runnable() { // from class: l.y5i0
            @Override // java.lang.Runnable
            public final void run() {
                c6i0.m105446R(str, str2, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m105469o0(f400 f400Var, String str, LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        if (f400Var.mo102960b()) {
            return;
        }
        m114660y(str, liveCampaignInfo.getUpdateType(), liveCampaignInfo.getData());
    }

    @liq(key = "onTeenModeEnable")
    public void onTeenModeEnable(@NonNull f400 f400Var, boolean z) {
        rwj0.m181414m(f400Var.mo102961c(), "onTeenModeEnable?enable=" + z);
    }

    @liq(key = "openToSchema")
    public void openToSchema(@NonNull final f400 f400Var, final String str) {
        e51.m114748M(new Runnable() { // from class: l.z5i0
            @Override // java.lang.Runnable
            public final void run() {
                tht.m188929b(f400Var.mo102961c(), Uri.parse(str));
            }
        });
    }

    @liq(key = "payFirstRecharge")
    public void payFirstRecharge(@NonNull f400 f400Var, final String str) {
        e51.m114748M(new Runnable() { // from class: l.k5i0
            @Override // java.lang.Runnable
            public final void run() {
                c6i0.m105462i0().mo123202u0(str);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public void m105471q0(@NonNull final f400 f400Var, String str, String str2, final String str3, final String str4, String str5) {
        if (!TTCameraConfig.m29713n(str)) {
            f400Var.mo102962d().mo127285b(str4, "2000");
        }
        mkd0.m154992z(this.f79548i);
        this.f79548i = f400Var.mo102961c().duringCreated(C4709b.m29826a().m29827b()).subscribe(mkd0.m154955G(new e30() { // from class: l.y4i0
            @Override // p149l.e30
            public final void call(Object obj) {
                c6i0.m105459e0(f400Var, str3, str4, (C4709b.b) obj);
            }
        }));
        TTCameraConfig tTCameraConfigM29737a = TTCameraConfig.m29714p().m29741e(false).m29739c(true).m29743g(str).m29744h(true).m29740d(str5).m29738b(true).m29737a();
        f400Var.mo102961c().startActivity(TTCameraPreviewAndUploadAct.m29770Y1(f400Var.mo102961c(), tTCameraConfigM29737a, TTCameraPreviewConfig.m29776e().m29798f(str2).m29795c(tTCameraConfigM29737a).m29799g(false).m29793a()));
    }

    /* JADX INFO: renamed from: r0 */
    public void m105472r0(@NonNull final f400 f400Var, String str, String str2, final String str3, final String str4, String str5) {
        if (!TTCameraConfig.m29713n(str)) {
            f400Var.mo102962d().mo127285b(str4, "2000");
        }
        mkd0.m154992z(this.f79548i);
        this.f79548i = f400Var.mo102961c().duringCreated(C4709b.m29826a().m29827b()).subscribe(mkd0.m154955G(new e30() { // from class: l.w5i0
            @Override // p149l.e30
            public final void call(Object obj) {
                c6i0.m105451W(f400Var, str3, str4, (C4709b.b) obj);
            }
        }));
        TTCameraConfig tTCameraConfigM29737a = TTCameraConfig.m29714p().m29741e(true).m29739c(true).m29744h(true).m29743g(str).m29742f(30).m29738b(true).m29740d(str5).m29737a();
        TTCameraPreviewAndUploadAct.m29771Z1(f400Var.mo102961c(), tTCameraConfigM29737a, TTCameraPreviewConfig.m29776e().m29798f(str2).m29801i().m29800h().m29795c(tTCameraConfigM29737a).m29799g(false).m29793a());
    }

    @liq(key = "redPointState")
    public void redPointState(@NonNull f400 f400Var, boolean z) {
        ((nj3) s9s.m182763m(gld0.f103312b)).f139193q.m132487l(Boolean.valueOf(z));
    }

    @liq(key = "refreshGuildAuth")
    public void refreshGuildAuth(@NonNull f400 f400Var) {
        rwj0.m181414m(f400Var.mo102961c(), "refreshGuildAuth");
    }

    @liq(key = "refreshLiveAuth")
    public void refreshLiveAuth(@NonNull f400 f400Var) {
        rwj0.m181414m(f400Var.mo102961c(), "refreshLiveAuth");
    }

    /* JADX INFO: renamed from: s0 */
    public void m105473s0(@NonNull final f400 f400Var, String str, final String str2, final String str3, String str4) {
        if (!TTCameraConfig.m29713n(str)) {
            f400Var.mo102962d().mo127285b(str3, "2000");
        }
        mkd0.m154992z(this.f79548i);
        this.f79548i = f400Var.mo102961c().duringCreated(C4709b.m29826a().m29827b()).subscribe(mkd0.m154955G(new e30() { // from class: l.b5i0
            @Override // p149l.e30
            public final void call(Object obj) {
                c6i0.m105432D(f400Var, str2, str3, (C4709b.b) obj);
            }
        }));
        TTCameraAct.m29707a2(f400Var.mo102961c(), TTCameraConfig.m29714p().m29741e(true).m29743g(str).m29742f(30).m29744h(true).m29739c(true).m29738b(true).m29740d(str4).m29737a());
    }

    @liq(key = "sendChatMessage")
    public void sendChatMessage(@NonNull f400 f400Var, final String str, final String str2) {
        e51.m114748M(new Runnable() { // from class: l.a6i0
            @Override // java.lang.Runnable
            public final void run() {
                c6i0.m105462i0().mo123199X(new sy4(str, str2));
            }
        });
    }

    @liq(key = "showRechargeDialog")
    public void showRechargeDialog(@NonNull f400 f400Var) {
        e51.m114748M(new Runnable() { // from class: l.z4i0
            @Override // java.lang.Runnable
            public final void run() {
                c6i0.m105462i0().mo123194O1();
            }
        });
    }

    @liq(key = "showTTCoinDialog")
    public void showTTCoinDialog(@NonNull final f400 f400Var, final String str, final String str2) {
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        e51.m114748M(new Runnable() { // from class: l.d5i0
            @Override // java.lang.Runnable
            public final void run() {
                c6i0.m105448T(putongActMo102961c, str2, f400Var, str);
            }
        });
    }

    @liq(key = "showVoteResultDialog")
    public void showVoteResultDialog(@NonNull f400 f400Var, final String str) {
        e51.m114748M(new Runnable() { // from class: l.p5i0
            @Override // java.lang.Runnable
            public final void run() {
                c6i0.m105462i0().mo123191I1(str);
            }
        });
    }

    @liq(key = "subscribeCampaign", uiThread = true)
    public void subscribeCampaign(@NonNull final f400 f400Var, String str, final String str2, final String str3) {
        MKWebView mKWebViewMo102959a = f400Var.mo102959a();
        m105462i0().mo122256f0(new u3g0(str, mKWebViewMo102959a.hashCode(), new wd4() { // from class: l.m5i0
            @Override // p149l.wd4
            /* JADX INFO: renamed from: a */
            public final void mo147900a(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
                this.f131397a.m105470p0(f400Var, str3, liveCampaignInfo);
            }
        }, new e30() { // from class: l.n5i0
            @Override // p149l.e30
            public final void call(Object obj) {
                f400Var.mo102962d().mo127285b(str2, ((Boolean) obj).booleanValue() ? "1" : "0");
            }
        }));
    }

    @liq(key = "syncShootGameStatus")
    public void syncShootGameStatus(@NonNull f400 f400Var, final boolean z, final String str, final int i, final int i2, final int i3) {
        hfw.m130790a("shootGame", "syncShootGameStatus:" + z + ":" + str + ":" + i + ":" + i2 + ":" + i3);
        e51.m114748M(new Runnable() { // from class: l.u5i0
            @Override // java.lang.Runnable
            public final void run() {
                c6i0.m105462i0().mo123203v(z, str, i, i2, i3);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public void m105474t0(@NonNull final f400 f400Var, String str, final String str2, final String str3, String str4) {
        if (!TTCameraConfig.m29713n(str)) {
            f400Var.mo102962d().mo127285b(str3, "2000");
        }
        mkd0.m154992z(this.f79548i);
        this.f79548i = f400Var.mo102961c().duringCreated(C4709b.m29826a().m29827b()).subscribe(mkd0.m154955G(new e30() { // from class: l.v5i0
            @Override // p149l.e30
            public final void call(Object obj) {
                c6i0.m105445Q(f400Var, str2, str3, (C4709b.b) obj);
            }
        }));
        TTCameraAct.m29707a2(f400Var.mo102961c(), TTCameraConfig.m29714p().m29741e(false).m29743g(str).m29739c(true).m29740d(str4).m29744h(true).m29738b(true).m29737a());
    }

    @liq(key = "userCardController", uiThread = true)
    public void userCardController(@NonNull f400 f400Var, String str, String str2, String str3) {
        m105462i0().mo123196U0(new fpq(str, str2, str3));
        if (TextUtils.equals(str, "show")) {
            if (TextUtils.isEmpty(str2) || str2.equals("0")) {
                CrashHelper.m81296c(new Exception("userCardController UserCardData userId is null url = " + f400Var.mo102959a().getUrl()));
            }
        }
    }

    @liq(key = "verifyTeenModePassword")
    public void verifyTeenModePassword(@NonNull f400 f400Var, boolean z, int i) {
        rwj0.m181414m(f400Var.mo102961c(), "verifyTeenModePassword?verified=" + z + "&scenes=" + i);
    }

    @liq(key = "voiceAnchorNameVerified")
    public void voiceAnchorNameVerified(@NonNull f400 f400Var) {
        if (m105466l0(f400Var)) {
            ((tpv) ypv.m215673l(fld0.f98149d)).m190065d(true);
        }
    }

    @liq(key = "jumpRecharge")
    public void jumpRecharge(@NonNull f400 f400Var) {
        liveGiftDialogController(f400Var, "showFastRecharge", "", "");
    }

    @liq(key = "follow", uiThread = true)
    public void follow(@NonNull f400 f400Var, String str, String str2, String str3, String str4, String str5) {
        follow(f400Var, str, str2, str3, str4, str5, true);
    }
}
