package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkReceiveGiftRole;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraPkInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraTopChatInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftMultiCallGiftRole;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftOfficialShowExtraInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p051p1.mobile.putong.live.base.data.BLiveSendStormDanmaku;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAuctionGiftExtra;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class uoe0 {

    /* JADX INFO: renamed from: E */
    public stj f180042E;

    /* JADX INFO: renamed from: F */
    @Nullable
    public g3e f180043F;

    /* JADX INFO: renamed from: G */
    public wxj f180044G;

    /* JADX INFO: renamed from: H */
    public String f180045H;

    /* JADX INFO: renamed from: J */
    public List<coj> f180047J;

    /* JADX INFO: renamed from: K */
    public String f180048K;

    /* JADX INFO: renamed from: L */
    public String f180049L;

    /* JADX INFO: renamed from: M */
    public String f180050M;

    /* JADX INFO: renamed from: N */
    public String f180051N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public BLiveGiftOfficialShowExtraInfo f180052O;

    /* JADX INFO: renamed from: a */
    public String f180053a;

    /* JADX INFO: renamed from: b */
    public String f180054b;

    /* JADX INFO: renamed from: c */
    public String f180055c;

    /* JADX INFO: renamed from: d */
    public String f180056d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public BLiveGiftItem f180057e;

    /* JADX INFO: renamed from: f */
    public int f180058f;

    /* JADX INFO: renamed from: g */
    public String f180059g;

    /* JADX INFO: renamed from: h */
    public String f180060h;

    /* JADX INFO: renamed from: i */
    public BLiveGiftExtraMultiPkReceiveGiftRole f180061i;

    /* JADX INFO: renamed from: j */
    public String f180062j;

    /* JADX INFO: renamed from: k */
    public String f180063k;

    /* JADX INFO: renamed from: l */
    public String f180064l;

    /* JADX INFO: renamed from: m */
    public cqj f180065m;

    /* JADX INFO: renamed from: n */
    public String f180066n;

    /* JADX INFO: renamed from: o */
    public String f180067o;

    /* JADX INFO: renamed from: p */
    public boolean f180068p;

    /* JADX INFO: renamed from: q */
    public y20<BLiveGivenGiftBrief> f180069q;

    /* JADX INFO: renamed from: r */
    public y20<Throwable> f180070r;

    /* JADX INFO: renamed from: s */
    public y20<Integer> f180071s;

    /* JADX INFO: renamed from: t */
    public String f180072t;

    /* JADX INFO: renamed from: u */
    public String f180073u;

    /* JADX INFO: renamed from: w */
    public BLiveGiftExtraDrawInfo f180075w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public BLiveGiftMultiCall f180076x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public BLiveGiftMultiCall f180077y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public BLiveVoiceAuctionGiftExtra f180078z;

    /* JADX INFO: renamed from: v */
    @NonNull
    public BLiveTraceServerData f180074v = BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("unknown_"), "");

    /* JADX INFO: renamed from: A */
    public String f180038A = "";

    /* JADX INFO: renamed from: B */
    public String f180039B = "live";

    /* JADX INFO: renamed from: C */
    public boolean f180040C = true;

    /* JADX INFO: renamed from: D */
    public boolean f180041D = false;

    /* JADX INFO: renamed from: I */
    public boolean f180046I = false;

    /* JADX INFO: renamed from: d */
    public static uoe0 m196974d(String str, @Nullable BLiveGiftItem bLiveGiftItem, @NotNull y20<BLiveGivenGiftBrief> y20Var, @NotNull y20<Throwable> y20Var2, @NotNull y20<Integer> y20Var3, boolean z, int i, String str2, cqj cqjVar, @NonNull BLiveTraceServerData bLiveTraceServerData) {
        uoe0 uoe0Var = new uoe0();
        uoe0Var.f180058f = i;
        uoe0Var.f180056d = str;
        uoe0Var.f180057e = bLiveGiftItem;
        uoe0Var.f180066n = str2;
        uoe0Var.f180068p = z;
        uoe0Var.f180069q = y20Var;
        uoe0Var.f180070r = y20Var2;
        uoe0Var.f180071s = y20Var3;
        uoe0Var.f180065m = cqjVar;
        uoe0Var.f180074v = bLiveTraceServerData;
        return uoe0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m196975a(BLiveGiftExtraInfo bLiveGiftExtraInfo) {
        bLiveGiftExtraInfo.giftSourceEvent = this.f180074v;
        if (NullChecker.m82486a(this.f180065m) && !TextUtils.isEmpty(this.f180065m.m111912a())) {
            bLiveGiftExtraInfo.giftSourceEvent.biz = this.f180065m.m111912a();
        }
        wxj wxjVar = this.f180044G;
        if (wxjVar != null) {
            bLiveGiftExtraInfo.giftSourceEvent.enterSource = wxjVar.getCurrentSource();
        }
    }

    /* JADX INFO: renamed from: b */
    public BLiveSendLiveGiftReq m196976b() {
        BLiveSendLiveGiftReq bLiveSendLiveGiftReqNew_ = BLiveSendLiveGiftReq.new_();
        bLiveSendLiveGiftReqNew_.scenario = "live";
        bLiveSendLiveGiftReqNew_.originalId = UUID.randomUUID().toString();
        if (NullChecker.m82486a(this.f180076x)) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = this.f180076x.receiveGiftRole;
            bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCallGiftRole.roomIdRoleIn;
            bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCallGiftRole.liveIdRoleIn;
        } else if (NullChecker.m82486a(this.f180077y)) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole2 = this.f180077y.receiveGiftRole;
            bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCallGiftRole2.roomIdRoleIn;
            bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCallGiftRole2.liveIdRoleIn;
        } else {
            bLiveSendLiveGiftReqNew_.roomId = this.f180054b;
            bLiveSendLiveGiftReqNew_.liveId = this.f180053a;
        }
        BLiveGiftInfo bLiveGiftInfoNew_ = BLiveGiftInfo.new_();
        BLiveGiftItem bLiveGiftItem = this.f180057e;
        bLiveGiftInfoNew_.giftType = bLiveGiftItem == null ? "" : bLiveGiftItem.giftType;
        bLiveGiftInfoNew_.num = this.f180058f;
        ArrayList arrayList = new ArrayList();
        bLiveSendLiveGiftReqNew_.giftInfo = arrayList;
        arrayList.add(bLiveGiftInfoNew_);
        if (m196987n() || TextUtils.equals("voiceLiveMain", this.f180066n) || TextUtils.equals("voiceLiveVice", this.f180066n) || TextUtils.equals("voiceLiveAudience", this.f180066n) || TextUtils.equals("voice-chat-admin", this.f180066n) || TextUtils.equals("voiceLiveConfessDetail", this.f180066n) || TextUtils.equals("voice_auction", this.f180066n) || TextUtils.equals("voice_sweet_bind_cp", this.f180066n) || TextUtils.equals("voice_gift_wall", this.f180066n) || TextUtils.equals("source_voice_ktv_quick_gift", this.f180066n) || TextUtils.equals("source_voice_gift_guide", this.f180066n) || TextUtils.equals("source_voice_fan_base", this.f180066n)) {
            bLiveSendLiveGiftReqNew_.type = BLiveType.voiceLive;
        } else if (TextUtils.equals("guildCallAudience", this.f180066n)) {
            bLiveSendLiveGiftReqNew_.type = "guildLive";
        } else {
            bLiveSendLiveGiftReqNew_.type = "live";
        }
        bLiveSendLiveGiftReqNew_.extraInfo = m196979f();
        bLiveSendLiveGiftReqNew_.liveMode = (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.f180045H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.f180045H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.f180045H)) ? "normal" : this.f180045H;
        return bLiveSendLiveGiftReqNew_;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m196977c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MatchFrom.scenario, "live");
            jSONObject.put("originalId", UUID.randomUUID().toString());
            jSONObject.put("roomId", this.f180054b);
            jSONObject.put("liveId", this.f180053a);
            jSONObject.put("type", "videoChat");
            jSONObject.put("liveMode", "normal");
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            BLiveGiftItem bLiveGiftItem = this.f180057e;
            jSONObject2.put("giftType", bLiveGiftItem == null ? "" : bLiveGiftItem.giftType);
            jSONObject2.put("num", this.f180058f);
            jSONArray.put(jSONObject2);
            jSONObject.put("giftInfo", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("chatId", str);
            jSONObject3.put("videoChat", jSONObject4);
            jSONObject.put("extraInfo", jSONObject3);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public List<coj> m196978e() {
        return this.f180047J;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public BLiveGiftExtraInfo m196979f() {
        BLiveGiftExtraInfo bLiveGiftExtraInfoNew_ = BLiveGiftExtraInfo.new_();
        BLiveGiftExtraPkInfo bLiveGiftExtraPkInfoNew_ = BLiveGiftExtraPkInfo.new_();
        BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfoNew_ = BLiveGiftExtraMultiPkInfo.new_();
        bLiveGiftExtraPkInfoNew_.pkId = this.f180059g;
        bLiveGiftExtraInfoNew_.f45223pk = bLiveGiftExtraPkInfoNew_;
        if (!TextUtils.isEmpty(this.f180060h)) {
            bLiveGiftExtraMultiPkInfoNew_.f45224id = this.f180060h;
            bLiveGiftExtraMultiPkInfoNew_.receiveGiftRole = this.f180061i;
            bLiveGiftExtraInfoNew_.multiPk = bLiveGiftExtraMultiPkInfoNew_;
        }
        if (NullChecker.m82486a(this.f180076x)) {
            bLiveGiftExtraInfoNew_.multiCall = this.f180076x;
        }
        if (NullChecker.m82486a(this.f180077y)) {
            bLiveGiftExtraInfoNew_.guildCall = this.f180077y;
        }
        bLiveGiftExtraInfoNew_.officialShow = this.f180052O;
        if (NullChecker.m82486a(this.f180078z)) {
            bLiveGiftExtraInfoNew_.voiceLiveAuction = this.f180078z;
        }
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f180075w;
        if (bLiveGiftExtraDrawInfo != null) {
            bLiveGiftExtraInfoNew_.draw = bLiveGiftExtraDrawInfo;
        }
        m196975a(bLiveGiftExtraInfoNew_);
        if (!TextUtils.isEmpty(this.f180063k) || !TextUtils.isEmpty(this.f180064l)) {
            BLiveSendStormDanmaku bLiveSendStormDanmakuNew_ = BLiveSendStormDanmaku.new_();
            bLiveSendStormDanmakuNew_.text = TextUtils.isEmpty(this.f180063k) ? "" : this.f180063k;
            bLiveSendStormDanmakuNew_.defaultCommentId = TextUtils.isEmpty(this.f180064l) ? "" : this.f180064l;
            bLiveGiftExtraInfoNew_.stormComment = bLiveSendStormDanmakuNew_;
        }
        if (!TextUtils.isEmpty(this.f180062j)) {
            BLiveGiftExtraTopChatInfo bLiveGiftExtraTopChatInfoNew_ = BLiveGiftExtraTopChatInfo.new_();
            bLiveGiftExtraTopChatInfoNew_.topChatText = this.f180062j;
            bLiveGiftExtraInfoNew_.topChat = bLiveGiftExtraTopChatInfoNew_;
        }
        if (!TextUtils.isEmpty(this.f180050M)) {
            BLiveCommonViewConfig bLiveCommonViewConfigNew_ = BLiveCommonViewConfig.new_();
            bLiveCommonViewConfigNew_.text = this.f180050M;
            bLiveGiftExtraInfoNew_.shoutingChat = bLiveCommonViewConfigNew_;
        }
        stj stjVar = this.f180042E;
        if (stjVar != null && stjVar.getNamingCardInfo() != null) {
            muj.m160203j0(this.f180056d);
            bLiveGiftExtraInfoNew_.namingCard = this.f180042E.getNamingCardInfo();
        }
        g3e g3eVar = this.f180043F;
        if (g3eVar != null && !jyb.m147479J(g3eVar.m128725a())) {
            bLiveGiftExtraInfoNew_.discounts = new ArrayList(this.f180043F.m128725a());
        }
        if (m196986m()) {
            coj cojVar = this.f180047J.get(0);
            String str = cojVar.f82891g;
            p54 p54Var = cojVar.f82890f;
            sxj sxjVarM193500a = txj.m193500a(str, p54Var.f150592a, cojVar.f82889e.f107997a, p54Var.f150595d, this.f180055c, this.f180048K);
            bLiveGiftExtraInfoNew_.call = sxjVarM193500a.getCallInfo();
            bLiveGiftExtraInfoNew_.voiceLive = sxjVarM193500a.getVoiceCallInfo();
        } else {
            cqj cqjVar = this.f180065m;
            String strM111914c = cqjVar == null ? "" : cqjVar.m111914c();
            cqj cqjVar2 = this.f180065m;
            String strM111916e = cqjVar2 != null ? cqjVar2.m111916e() : "";
            cqj cqjVar3 = this.f180065m;
            sxj sxjVarM193500a2 = txj.m193500a(this.f180066n, strM111914c, strM111916e, cqjVar3 != null ? cqjVar3.m111915d().f150595d : 0, this.f180055c, this.f180048K);
            bLiveGiftExtraInfoNew_.call = sxjVarM193500a2.getCallInfo();
            bLiveGiftExtraInfoNew_.voiceLive = sxjVarM193500a2.getVoiceCallInfo();
        }
        if (this.f180078z != null) {
            bLiveGiftExtraInfoNew_.voiceLive.voiceLiveMode = "auction";
            return bLiveGiftExtraInfoNew_;
        }
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.f180045H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.f180045H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.f180045H)) {
            bLiveGiftExtraInfoNew_.voiceLive.voiceLiveMode = this.f180045H;
            return bLiveGiftExtraInfoNew_;
        }
        bLiveGiftExtraInfoNew_.voiceLive.voiceLiveMode = "normal";
        return bLiveGiftExtraInfoNew_;
    }

    /* JADX INFO: renamed from: g */
    public String m196980g() {
        return this.f180045H;
    }

    /* JADX INFO: renamed from: h */
    public String m196981h() {
        if (TextUtils.equals(this.f180066n, "source_voice_gift_guide") || TextUtils.equals(this.f180066n, "voice_sweet_bind_cp") || TextUtils.equals(this.f180066n, "voice_gift_wall") || TextUtils.equals(this.f180066n, "source_voice_ktv_quick_gift") || TextUtils.equals(this.f180066n, "source_voice_fan_base")) {
            return this.f180049L;
        }
        if (m196986m()) {
            return this.f180047J.get(0).f82889e.f107997a;
        }
        if (!TextUtils.isEmpty(this.f180067o)) {
            return this.f180067o;
        }
        if (TextUtils.equals(this.f180066n, "live") || TextUtils.equals(this.f180066n, "call-main") || TextUtils.equals(this.f180066n, "voiceLiveMain")) {
            return this.f180055c;
        }
        cqj cqjVar = this.f180065m;
        return cqjVar == null ? this.f180055c : cqjVar.m111916e();
    }

    /* JADX INFO: renamed from: i */
    public boolean m196982i() {
        return this.f180046I;
    }

    /* JADX INFO: renamed from: j */
    public String m196983j() {
        return this.f180048K;
    }

    /* JADX INFO: renamed from: k */
    public boolean m196984k() {
        return TextUtils.equals("js", this.f180038A);
    }

    /* JADX INFO: renamed from: l */
    public boolean m196985l() {
        return !jyb.m147479J(this.f180047J) && this.f180047J.size() >= 2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m196986m() {
        return !jyb.m147479J(this.f180047J) && this.f180047J.size() == 1;
    }

    /* JADX INFO: renamed from: n */
    public boolean m196987n() {
        return m196984k() && TextUtils.equals(this.f180039B, BLiveAbsData.VOICE_LIVE);
    }

    /* JADX INFO: renamed from: o */
    public uoe0 m196988o(boolean z) {
        this.f180041D = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public uoe0 m196989p(String str) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        this.f180040C = TextUtils.equals("1", str);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m196990q(List<coj> list) {
        this.f180047J = list;
    }

    /* JADX INFO: renamed from: r */
    public void m196991r(String str) {
        this.f180045H = str;
    }

    /* JADX INFO: renamed from: s */
    public void m196992s(wxj wxjVar) {
        this.f180044G = wxjVar;
    }

    /* JADX INFO: renamed from: t */
    public uoe0 m196993t(String str) {
        this.f180072t = str;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public uoe0 m196994u(String str) {
        this.f180073u = str;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public void m196995v(String str) {
        this.f180048K = str;
    }
}
