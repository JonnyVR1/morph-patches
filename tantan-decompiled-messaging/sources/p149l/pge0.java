package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkReceiveGiftRole;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraPkInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraTopChatInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftMultiCallGiftRole;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftOfficialShowExtraInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p046p1.mobile.putong.live.base.data.BLiveSendStormDanmaku;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAuctionGiftExtra;
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
public class pge0 {

    /* JADX INFO: renamed from: E */
    public crj f148641E;

    /* JADX INFO: renamed from: F */
    @Nullable
    public s1e f148642F;

    /* JADX INFO: renamed from: G */
    public gvj f148643G;

    /* JADX INFO: renamed from: H */
    public String f148644H;

    /* JADX INFO: renamed from: J */
    public List<mlj> f148646J;

    /* JADX INFO: renamed from: K */
    public String f148647K;

    /* JADX INFO: renamed from: L */
    public String f148648L;

    /* JADX INFO: renamed from: M */
    public String f148649M;

    /* JADX INFO: renamed from: N */
    public String f148650N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public BLiveGiftOfficialShowExtraInfo f148651O;

    /* JADX INFO: renamed from: a */
    public String f148652a;

    /* JADX INFO: renamed from: b */
    public String f148653b;

    /* JADX INFO: renamed from: c */
    public String f148654c;

    /* JADX INFO: renamed from: d */
    public String f148655d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public BLiveGiftItem f148656e;

    /* JADX INFO: renamed from: f */
    public int f148657f;

    /* JADX INFO: renamed from: g */
    public String f148658g;

    /* JADX INFO: renamed from: h */
    public String f148659h;

    /* JADX INFO: renamed from: i */
    public BLiveGiftExtraMultiPkReceiveGiftRole f148660i;

    /* JADX INFO: renamed from: j */
    public String f148661j;

    /* JADX INFO: renamed from: k */
    public String f148662k;

    /* JADX INFO: renamed from: l */
    public String f148663l;

    /* JADX INFO: renamed from: m */
    public mnj f148664m;

    /* JADX INFO: renamed from: n */
    public String f148665n;

    /* JADX INFO: renamed from: o */
    public String f148666o;

    /* JADX INFO: renamed from: p */
    public boolean f148667p;

    /* JADX INFO: renamed from: q */
    public e30<BLiveGivenGiftBrief> f148668q;

    /* JADX INFO: renamed from: r */
    public e30<Throwable> f148669r;

    /* JADX INFO: renamed from: s */
    public e30<Integer> f148670s;

    /* JADX INFO: renamed from: t */
    public String f148671t;

    /* JADX INFO: renamed from: u */
    public String f148672u;

    /* JADX INFO: renamed from: w */
    public BLiveGiftExtraDrawInfo f148674w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public BLiveGiftMultiCall f148675x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public BLiveGiftMultiCall f148676y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public BLiveVoiceAuctionGiftExtra f148677z;

    /* JADX INFO: renamed from: v */
    @NonNull
    public BLiveTraceServerData f148673v = BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("unknown_"), "");

    /* JADX INFO: renamed from: A */
    public String f148637A = "";

    /* JADX INFO: renamed from: B */
    public String f148638B = "live";

    /* JADX INFO: renamed from: C */
    public boolean f148639C = true;

    /* JADX INFO: renamed from: D */
    public boolean f148640D = false;

    /* JADX INFO: renamed from: I */
    public boolean f148645I = false;

    /* JADX INFO: renamed from: d */
    public static pge0 m168675d(String str, @Nullable BLiveGiftItem bLiveGiftItem, @NotNull e30<BLiveGivenGiftBrief> e30Var, @NotNull e30<Throwable> e30Var2, @NotNull e30<Integer> e30Var3, boolean z, int i, String str2, mnj mnjVar, @NonNull BLiveTraceServerData bLiveTraceServerData) {
        pge0 pge0Var = new pge0();
        pge0Var.f148657f = i;
        pge0Var.f148655d = str;
        pge0Var.f148656e = bLiveGiftItem;
        pge0Var.f148665n = str2;
        pge0Var.f148667p = z;
        pge0Var.f148668q = e30Var;
        pge0Var.f148669r = e30Var2;
        pge0Var.f148670s = e30Var3;
        pge0Var.f148664m = mnjVar;
        pge0Var.f148673v = bLiveTraceServerData;
        return pge0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m168676a(BLiveGiftExtraInfo bLiveGiftExtraInfo) {
        bLiveGiftExtraInfo.giftSourceEvent = this.f148673v;
        if (NullChecker.m81303a(this.f148664m) && !TextUtils.isEmpty(this.f148664m.m155512a())) {
            bLiveGiftExtraInfo.giftSourceEvent.biz = this.f148664m.m155512a();
        }
        gvj gvjVar = this.f148643G;
        if (gvjVar != null) {
            bLiveGiftExtraInfo.giftSourceEvent.enterSource = gvjVar.getCurrentSource();
        }
    }

    /* JADX INFO: renamed from: b */
    public BLiveSendLiveGiftReq m168677b() {
        BLiveSendLiveGiftReq bLiveSendLiveGiftReqNew_ = BLiveSendLiveGiftReq.new_();
        bLiveSendLiveGiftReqNew_.scenario = "live";
        bLiveSendLiveGiftReqNew_.originalId = UUID.randomUUID().toString();
        if (NullChecker.m81303a(this.f148675x)) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = this.f148675x.receiveGiftRole;
            bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCallGiftRole.roomIdRoleIn;
            bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCallGiftRole.liveIdRoleIn;
        } else if (NullChecker.m81303a(this.f148676y)) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole2 = this.f148676y.receiveGiftRole;
            bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCallGiftRole2.roomIdRoleIn;
            bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCallGiftRole2.liveIdRoleIn;
        } else {
            bLiveSendLiveGiftReqNew_.roomId = this.f148653b;
            bLiveSendLiveGiftReqNew_.liveId = this.f148652a;
        }
        BLiveGiftInfo bLiveGiftInfoNew_ = BLiveGiftInfo.new_();
        BLiveGiftItem bLiveGiftItem = this.f148656e;
        bLiveGiftInfoNew_.giftType = bLiveGiftItem == null ? "" : bLiveGiftItem.giftType;
        bLiveGiftInfoNew_.num = this.f148657f;
        ArrayList arrayList = new ArrayList();
        bLiveSendLiveGiftReqNew_.giftInfo = arrayList;
        arrayList.add(bLiveGiftInfoNew_);
        if (m168688n() || TextUtils.equals("voiceLiveMain", this.f148665n) || TextUtils.equals("voiceLiveVice", this.f148665n) || TextUtils.equals("voiceLiveAudience", this.f148665n) || TextUtils.equals("voice-chat-admin", this.f148665n) || TextUtils.equals("voiceLiveConfessDetail", this.f148665n) || TextUtils.equals("voice_auction", this.f148665n) || TextUtils.equals("voice_sweet_bind_cp", this.f148665n) || TextUtils.equals("voice_gift_wall", this.f148665n) || TextUtils.equals("source_voice_ktv_quick_gift", this.f148665n) || TextUtils.equals("source_voice_gift_guide", this.f148665n) || TextUtils.equals("source_voice_fan_base", this.f148665n)) {
            bLiveSendLiveGiftReqNew_.type = BLiveType.voiceLive;
        } else if (TextUtils.equals("guildCallAudience", this.f148665n)) {
            bLiveSendLiveGiftReqNew_.type = "guildLive";
        } else {
            bLiveSendLiveGiftReqNew_.type = "live";
        }
        bLiveSendLiveGiftReqNew_.extraInfo = m168680f();
        bLiveSendLiveGiftReqNew_.liveMode = (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.f148644H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.f148644H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.f148644H)) ? "normal" : this.f148644H;
        return bLiveSendLiveGiftReqNew_;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m168678c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MatchFrom.scenario, "live");
            jSONObject.put("originalId", UUID.randomUUID().toString());
            jSONObject.put("roomId", this.f148653b);
            jSONObject.put("liveId", this.f148652a);
            jSONObject.put("type", "videoChat");
            jSONObject.put("liveMode", "normal");
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            BLiveGiftItem bLiveGiftItem = this.f148656e;
            jSONObject2.put("giftType", bLiveGiftItem == null ? "" : bLiveGiftItem.giftType);
            jSONObject2.put("num", this.f148657f);
            jSONArray.put(jSONObject2);
            jSONObject.put("giftInfo", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("chatId", str);
            jSONObject3.put("videoChat", jSONObject4);
            jSONObject.put("extraInfo", jSONObject3);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public List<mlj> m168679e() {
        return this.f148646J;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public BLiveGiftExtraInfo m168680f() {
        BLiveGiftExtraInfo bLiveGiftExtraInfoNew_ = BLiveGiftExtraInfo.new_();
        BLiveGiftExtraPkInfo bLiveGiftExtraPkInfoNew_ = BLiveGiftExtraPkInfo.new_();
        BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfoNew_ = BLiveGiftExtraMultiPkInfo.new_();
        bLiveGiftExtraPkInfoNew_.pkId = this.f148658g;
        bLiveGiftExtraInfoNew_.f44375pk = bLiveGiftExtraPkInfoNew_;
        if (!TextUtils.isEmpty(this.f148659h)) {
            bLiveGiftExtraMultiPkInfoNew_.f44376id = this.f148659h;
            bLiveGiftExtraMultiPkInfoNew_.receiveGiftRole = this.f148660i;
            bLiveGiftExtraInfoNew_.multiPk = bLiveGiftExtraMultiPkInfoNew_;
        }
        if (NullChecker.m81303a(this.f148675x)) {
            bLiveGiftExtraInfoNew_.multiCall = this.f148675x;
        }
        if (NullChecker.m81303a(this.f148676y)) {
            bLiveGiftExtraInfoNew_.guildCall = this.f148676y;
        }
        bLiveGiftExtraInfoNew_.officialShow = this.f148651O;
        if (NullChecker.m81303a(this.f148677z)) {
            bLiveGiftExtraInfoNew_.voiceLiveAuction = this.f148677z;
        }
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f148674w;
        if (bLiveGiftExtraDrawInfo != null) {
            bLiveGiftExtraInfoNew_.draw = bLiveGiftExtraDrawInfo;
        }
        m168676a(bLiveGiftExtraInfoNew_);
        if (!TextUtils.isEmpty(this.f148662k) || !TextUtils.isEmpty(this.f148663l)) {
            BLiveSendStormDanmaku bLiveSendStormDanmakuNew_ = BLiveSendStormDanmaku.new_();
            bLiveSendStormDanmakuNew_.text = TextUtils.isEmpty(this.f148662k) ? "" : this.f148662k;
            bLiveSendStormDanmakuNew_.defaultCommentId = TextUtils.isEmpty(this.f148663l) ? "" : this.f148663l;
            bLiveGiftExtraInfoNew_.stormComment = bLiveSendStormDanmakuNew_;
        }
        if (!TextUtils.isEmpty(this.f148661j)) {
            BLiveGiftExtraTopChatInfo bLiveGiftExtraTopChatInfoNew_ = BLiveGiftExtraTopChatInfo.new_();
            bLiveGiftExtraTopChatInfoNew_.topChatText = this.f148661j;
            bLiveGiftExtraInfoNew_.topChat = bLiveGiftExtraTopChatInfoNew_;
        }
        if (!TextUtils.isEmpty(this.f148649M)) {
            BLiveCommonViewConfig bLiveCommonViewConfigNew_ = BLiveCommonViewConfig.new_();
            bLiveCommonViewConfigNew_.text = this.f148649M;
            bLiveGiftExtraInfoNew_.shoutingChat = bLiveCommonViewConfigNew_;
        }
        crj crjVar = this.f148641E;
        if (crjVar != null && crjVar.getNamingCardInfo() != null) {
            wrj.m205239j0(this.f148655d);
            bLiveGiftExtraInfoNew_.namingCard = this.f148641E.getNamingCardInfo();
        }
        s1e s1eVar = this.f148642F;
        if (s1eVar != null && !vwb.m200296J(s1eVar.m181958a())) {
            bLiveGiftExtraInfoNew_.discounts = new ArrayList(this.f148642F.m181958a());
        }
        if (m168687m()) {
            mlj mljVar = this.f148646J.get(0);
            String str = mljVar.f134446g;
            q44 q44Var = mljVar.f134445f;
            cvj cvjVarM113780a = dvj.m113780a(str, q44Var.f152537a, mljVar.f134444e.f111520a, q44Var.f152540d, this.f148654c, this.f148647K);
            bLiveGiftExtraInfoNew_.call = cvjVarM113780a.getCallInfo();
            bLiveGiftExtraInfoNew_.voiceLive = cvjVarM113780a.getVoiceCallInfo();
        } else {
            mnj mnjVar = this.f148664m;
            String strM155514c = mnjVar == null ? "" : mnjVar.m155514c();
            mnj mnjVar2 = this.f148664m;
            String strM155516e = mnjVar2 != null ? mnjVar2.m155516e() : "";
            mnj mnjVar3 = this.f148664m;
            cvj cvjVarM113780a2 = dvj.m113780a(this.f148665n, strM155514c, strM155516e, mnjVar3 != null ? mnjVar3.m155515d().f152540d : 0, this.f148654c, this.f148647K);
            bLiveGiftExtraInfoNew_.call = cvjVarM113780a2.getCallInfo();
            bLiveGiftExtraInfoNew_.voiceLive = cvjVarM113780a2.getVoiceCallInfo();
        }
        if (this.f148677z != null) {
            bLiveGiftExtraInfoNew_.voiceLive.voiceLiveMode = "auction";
            return bLiveGiftExtraInfoNew_;
        }
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.f148644H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.f148644H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.f148644H)) {
            bLiveGiftExtraInfoNew_.voiceLive.voiceLiveMode = this.f148644H;
            return bLiveGiftExtraInfoNew_;
        }
        bLiveGiftExtraInfoNew_.voiceLive.voiceLiveMode = "normal";
        return bLiveGiftExtraInfoNew_;
    }

    /* JADX INFO: renamed from: g */
    public String m168681g() {
        return this.f148644H;
    }

    /* JADX INFO: renamed from: h */
    public String m168682h() {
        if (TextUtils.equals(this.f148665n, "source_voice_gift_guide") || TextUtils.equals(this.f148665n, "voice_sweet_bind_cp") || TextUtils.equals(this.f148665n, "voice_gift_wall") || TextUtils.equals(this.f148665n, "source_voice_ktv_quick_gift") || TextUtils.equals(this.f148665n, "source_voice_fan_base")) {
            return this.f148648L;
        }
        if (m168687m()) {
            return this.f148646J.get(0).f134444e.f111520a;
        }
        if (!TextUtils.isEmpty(this.f148666o)) {
            return this.f148666o;
        }
        if (TextUtils.equals(this.f148665n, "live") || TextUtils.equals(this.f148665n, "call-main") || TextUtils.equals(this.f148665n, "voiceLiveMain")) {
            return this.f148654c;
        }
        mnj mnjVar = this.f148664m;
        return mnjVar == null ? this.f148654c : mnjVar.m155516e();
    }

    /* JADX INFO: renamed from: i */
    public boolean m168683i() {
        return this.f148645I;
    }

    /* JADX INFO: renamed from: j */
    public String m168684j() {
        return this.f148647K;
    }

    /* JADX INFO: renamed from: k */
    public boolean m168685k() {
        return TextUtils.equals("js", this.f148637A);
    }

    /* JADX INFO: renamed from: l */
    public boolean m168686l() {
        return !vwb.m200296J(this.f148646J) && this.f148646J.size() >= 2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m168687m() {
        return !vwb.m200296J(this.f148646J) && this.f148646J.size() == 1;
    }

    /* JADX INFO: renamed from: n */
    public boolean m168688n() {
        return m168685k() && TextUtils.equals(this.f148638B, BLiveAbsData.VOICE_LIVE);
    }

    /* JADX INFO: renamed from: o */
    public pge0 m168689o(boolean z) {
        this.f148640D = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public pge0 m168690p(String str) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        this.f148639C = TextUtils.equals("1", str);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m168691q(List<mlj> list) {
        this.f148646J = list;
    }

    /* JADX INFO: renamed from: r */
    public void m168692r(String str) {
        this.f148644H = str;
    }

    /* JADX INFO: renamed from: s */
    public void m168693s(gvj gvjVar) {
        this.f148643G = gvjVar;
    }

    /* JADX INFO: renamed from: t */
    public pge0 m168694t(String str) {
        this.f148671t = str;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public pge0 m168695u(String str) {
        this.f148672u = str;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public void m168696v(String str) {
        this.f148647K = str;
    }
}
