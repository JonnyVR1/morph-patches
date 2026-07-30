package p002l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkReceiveGiftRole;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraPkInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraTopChatInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveGiftMultiCallGiftRole;
import com.p1.mobile.putong.live.base.data.BLiveGiftOfficialShowExtraInfo;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p1.mobile.putong.live.base.data.BLiveSendStormDanmaku;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceAuctionGiftExtra;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import l.aag0;
import l.e30;
import l.s1e;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pge0 {

    /* JADX INFO: renamed from: E */
    public crj f17265E;

    /* JADX INFO: renamed from: F */
    @Nullable
    public s1e f17266F;

    /* JADX INFO: renamed from: G */
    public gvj f17267G;

    /* JADX INFO: renamed from: H */
    public String f17268H;

    /* JADX INFO: renamed from: J */
    public List<mlj> f17270J;

    /* JADX INFO: renamed from: K */
    public String f17271K;

    /* JADX INFO: renamed from: L */
    public String f17272L;

    /* JADX INFO: renamed from: M */
    public String f17273M;

    /* JADX INFO: renamed from: N */
    public String f17274N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public BLiveGiftOfficialShowExtraInfo f17275O;

    /* JADX INFO: renamed from: a */
    public String f17276a;

    /* JADX INFO: renamed from: b */
    public String f17277b;

    /* JADX INFO: renamed from: c */
    public String f17278c;

    /* JADX INFO: renamed from: d */
    public String f17279d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public BLiveGiftItem f17280e;

    /* JADX INFO: renamed from: f */
    public int f17281f;

    /* JADX INFO: renamed from: g */
    public String f17282g;

    /* JADX INFO: renamed from: h */
    public String f17283h;

    /* JADX INFO: renamed from: i */
    public BLiveGiftExtraMultiPkReceiveGiftRole f17284i;

    /* JADX INFO: renamed from: j */
    public String f17285j;

    /* JADX INFO: renamed from: k */
    public String f17286k;

    /* JADX INFO: renamed from: l */
    public String f17287l;

    /* JADX INFO: renamed from: m */
    public mnj f17288m;

    /* JADX INFO: renamed from: n */
    public String f17289n;

    /* JADX INFO: renamed from: o */
    public String f17290o;

    /* JADX INFO: renamed from: p */
    public boolean f17291p;

    /* JADX INFO: renamed from: q */
    public e30<BLiveGivenGiftBrief> f17292q;

    /* JADX INFO: renamed from: r */
    public e30<Throwable> f17293r;

    /* JADX INFO: renamed from: s */
    public e30<Integer> f17294s;

    /* JADX INFO: renamed from: t */
    public String f17295t;

    /* JADX INFO: renamed from: u */
    public String f17296u;

    /* JADX INFO: renamed from: w */
    public BLiveGiftExtraDrawInfo f17298w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public BLiveGiftMultiCall f17299x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public BLiveGiftMultiCall f17300y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public BLiveVoiceAuctionGiftExtra f17301z;

    /* JADX INFO: renamed from: v */
    @NonNull
    public BLiveTraceServerData f17297v = BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("unknown_"), "");

    /* JADX INFO: renamed from: A */
    public String f17261A = "";

    /* JADX INFO: renamed from: B */
    public String f17262B = "live";

    /* JADX INFO: renamed from: C */
    public boolean f17263C = true;

    /* JADX INFO: renamed from: D */
    public boolean f17264D = false;

    /* JADX INFO: renamed from: I */
    public boolean f17269I = false;

    /* JADX INFO: renamed from: d */
    public static pge0 m20240d(String str, @Nullable BLiveGiftItem bLiveGiftItem, @NotNull e30<BLiveGivenGiftBrief> e30Var, @NotNull e30<Throwable> e30Var2, @NotNull e30<Integer> e30Var3, boolean z, int i, String str2, mnj mnjVar, @NonNull BLiveTraceServerData bLiveTraceServerData) {
        pge0 pge0Var = new pge0();
        pge0Var.f17281f = i;
        pge0Var.f17279d = str;
        pge0Var.f17280e = bLiveGiftItem;
        pge0Var.f17289n = str2;
        pge0Var.f17291p = z;
        pge0Var.f17292q = e30Var;
        pge0Var.f17293r = e30Var2;
        pge0Var.f17294s = e30Var3;
        pge0Var.f17288m = mnjVar;
        pge0Var.f17297v = bLiveTraceServerData;
        return pge0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m20241a(BLiveGiftExtraInfo bLiveGiftExtraInfo) {
        bLiveGiftExtraInfo.giftSourceEvent = this.f17297v;
        if (NullChecker.a(this.f17288m) && !TextUtils.isEmpty(this.f17288m.m18089a())) {
            bLiveGiftExtraInfo.giftSourceEvent.biz = this.f17288m.m18089a();
        }
        gvj gvjVar = this.f17267G;
        if (gvjVar != null) {
            bLiveGiftExtraInfo.giftSourceEvent.enterSource = gvjVar.getCurrentSource();
        }
    }

    /* JADX INFO: renamed from: b */
    public BLiveSendLiveGiftReq m20242b() {
        BLiveSendLiveGiftReq bLiveSendLiveGiftReqNew_ = BLiveSendLiveGiftReq.new_();
        bLiveSendLiveGiftReqNew_.scenario = "live";
        bLiveSendLiveGiftReqNew_.originalId = UUID.randomUUID().toString();
        if (NullChecker.a(this.f17299x)) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = this.f17299x.receiveGiftRole;
            bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCallGiftRole.roomIdRoleIn;
            bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCallGiftRole.liveIdRoleIn;
        } else if (NullChecker.a(this.f17300y)) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole2 = this.f17300y.receiveGiftRole;
            bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCallGiftRole2.roomIdRoleIn;
            bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCallGiftRole2.liveIdRoleIn;
        } else {
            bLiveSendLiveGiftReqNew_.roomId = this.f17277b;
            bLiveSendLiveGiftReqNew_.liveId = this.f17276a;
        }
        BLiveGiftInfo bLiveGiftInfoNew_ = BLiveGiftInfo.new_();
        BLiveGiftItem bLiveGiftItem = this.f17280e;
        bLiveGiftInfoNew_.giftType = bLiveGiftItem == null ? "" : bLiveGiftItem.giftType;
        bLiveGiftInfoNew_.num = this.f17281f;
        ArrayList arrayList = new ArrayList();
        bLiveSendLiveGiftReqNew_.giftInfo = arrayList;
        arrayList.add(bLiveGiftInfoNew_);
        if (m20253n() || TextUtils.equals("voiceLiveMain", this.f17289n) || TextUtils.equals("voiceLiveVice", this.f17289n) || TextUtils.equals("voiceLiveAudience", this.f17289n) || TextUtils.equals("voice-chat-admin", this.f17289n) || TextUtils.equals("voiceLiveConfessDetail", this.f17289n) || TextUtils.equals("voice_auction", this.f17289n) || TextUtils.equals("voice_sweet_bind_cp", this.f17289n) || TextUtils.equals("voice_gift_wall", this.f17289n) || TextUtils.equals("source_voice_ktv_quick_gift", this.f17289n) || TextUtils.equals("source_voice_gift_guide", this.f17289n) || TextUtils.equals("source_voice_fan_base", this.f17289n)) {
            bLiveSendLiveGiftReqNew_.type = "voiceLive";
        } else if (TextUtils.equals("guildCallAudience", this.f17289n)) {
            bLiveSendLiveGiftReqNew_.type = "guildLive";
        } else {
            bLiveSendLiveGiftReqNew_.type = "live";
        }
        bLiveSendLiveGiftReqNew_.extraInfo = m20245f();
        bLiveSendLiveGiftReqNew_.liveMode = (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.f17268H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.f17268H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.f17268H)) ? "normal" : this.f17268H;
        return bLiveSendLiveGiftReqNew_;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m20243c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scenario", "live");
            jSONObject.put("originalId", UUID.randomUUID().toString());
            jSONObject.put("roomId", this.f17277b);
            jSONObject.put("liveId", this.f17276a);
            jSONObject.put("type", "videoChat");
            jSONObject.put("liveMode", "normal");
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            BLiveGiftItem bLiveGiftItem = this.f17280e;
            jSONObject2.put("giftType", bLiveGiftItem == null ? "" : bLiveGiftItem.giftType);
            jSONObject2.put("num", this.f17281f);
            jSONArray.put(jSONObject2);
            jSONObject.put("giftInfo", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("chatId", str);
            jSONObject3.put("videoChat", jSONObject4);
            jSONObject.put("extraInfo", jSONObject3);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.c(e);
            aag0.a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public List<mlj> m20244e() {
        return this.f17270J;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public BLiveGiftExtraInfo m20245f() {
        BLiveGiftExtraInfo bLiveGiftExtraInfoNew_ = BLiveGiftExtraInfo.new_();
        BLiveGiftExtraPkInfo bLiveGiftExtraPkInfoNew_ = BLiveGiftExtraPkInfo.new_();
        BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfoNew_ = BLiveGiftExtraMultiPkInfo.new_();
        bLiveGiftExtraPkInfoNew_.pkId = this.f17282g;
        bLiveGiftExtraInfoNew_.pk = bLiveGiftExtraPkInfoNew_;
        if (!TextUtils.isEmpty(this.f17283h)) {
            bLiveGiftExtraMultiPkInfoNew_.id = this.f17283h;
            bLiveGiftExtraMultiPkInfoNew_.receiveGiftRole = this.f17284i;
            bLiveGiftExtraInfoNew_.multiPk = bLiveGiftExtraMultiPkInfoNew_;
        }
        if (NullChecker.a(this.f17299x)) {
            bLiveGiftExtraInfoNew_.multiCall = this.f17299x;
        }
        if (NullChecker.a(this.f17300y)) {
            bLiveGiftExtraInfoNew_.guildCall = this.f17300y;
        }
        bLiveGiftExtraInfoNew_.officialShow = this.f17275O;
        if (NullChecker.a(this.f17301z)) {
            bLiveGiftExtraInfoNew_.voiceLiveAuction = this.f17301z;
        }
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f17298w;
        if (bLiveGiftExtraDrawInfo != null) {
            bLiveGiftExtraInfoNew_.draw = bLiveGiftExtraDrawInfo;
        }
        m20241a(bLiveGiftExtraInfoNew_);
        if (!TextUtils.isEmpty(this.f17286k) || !TextUtils.isEmpty(this.f17287l)) {
            BLiveSendStormDanmaku bLiveSendStormDanmakuNew_ = BLiveSendStormDanmaku.new_();
            bLiveSendStormDanmakuNew_.text = TextUtils.isEmpty(this.f17286k) ? "" : this.f17286k;
            bLiveSendStormDanmakuNew_.defaultCommentId = TextUtils.isEmpty(this.f17287l) ? "" : this.f17287l;
            bLiveGiftExtraInfoNew_.stormComment = bLiveSendStormDanmakuNew_;
        }
        if (!TextUtils.isEmpty(this.f17285j)) {
            BLiveGiftExtraTopChatInfo bLiveGiftExtraTopChatInfoNew_ = BLiveGiftExtraTopChatInfo.new_();
            bLiveGiftExtraTopChatInfoNew_.topChatText = this.f17285j;
            bLiveGiftExtraInfoNew_.topChat = bLiveGiftExtraTopChatInfoNew_;
        }
        if (!TextUtils.isEmpty(this.f17273M)) {
            BLiveCommonViewConfig bLiveCommonViewConfigNew_ = BLiveCommonViewConfig.new_();
            bLiveCommonViewConfigNew_.text = this.f17273M;
            bLiveGiftExtraInfoNew_.shoutingChat = bLiveCommonViewConfigNew_;
        }
        crj crjVar = this.f17265E;
        if (crjVar != null && crjVar.getNamingCardInfo() != null) {
            wrj.m25411j0(this.f17279d);
            bLiveGiftExtraInfoNew_.namingCard = this.f17265E.getNamingCardInfo();
        }
        s1e s1eVar = this.f17266F;
        if (s1eVar != null && !vwb.J(s1eVar.a())) {
            bLiveGiftExtraInfoNew_.discounts = new ArrayList(this.f17266F.a());
        }
        if (m20252m()) {
            mlj mljVar = this.f17270J.get(0);
            String str = mljVar.f15448g;
            q44 q44Var = mljVar.f15447f;
            cvj cvjVarM12060a = dvj.m12060a(str, q44Var.f17800a, mljVar.f15446e.a, q44Var.f17803d, this.f17278c, this.f17271K);
            bLiveGiftExtraInfoNew_.call = cvjVarM12060a.getCallInfo();
            bLiveGiftExtraInfoNew_.voiceLive = cvjVarM12060a.getVoiceCallInfo();
        } else {
            mnj mnjVar = this.f17288m;
            String strM18091c = mnjVar == null ? "" : mnjVar.m18091c();
            mnj mnjVar2 = this.f17288m;
            String strM18093e = mnjVar2 != null ? mnjVar2.m18093e() : "";
            mnj mnjVar3 = this.f17288m;
            cvj cvjVarM12060a2 = dvj.m12060a(this.f17289n, strM18091c, strM18093e, mnjVar3 != null ? mnjVar3.m18092d().f17803d : 0, this.f17278c, this.f17271K);
            bLiveGiftExtraInfoNew_.call = cvjVarM12060a2.getCallInfo();
            bLiveGiftExtraInfoNew_.voiceLive = cvjVarM12060a2.getVoiceCallInfo();
        }
        if (this.f17301z != null) {
            bLiveGiftExtraInfoNew_.voiceLive.voiceLiveMode = "auction";
            return bLiveGiftExtraInfoNew_;
        }
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.f17268H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.f17268H) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.f17268H)) {
            bLiveGiftExtraInfoNew_.voiceLive.voiceLiveMode = this.f17268H;
            return bLiveGiftExtraInfoNew_;
        }
        bLiveGiftExtraInfoNew_.voiceLive.voiceLiveMode = "normal";
        return bLiveGiftExtraInfoNew_;
    }

    /* JADX INFO: renamed from: g */
    public String m20246g() {
        return this.f17268H;
    }

    /* JADX INFO: renamed from: h */
    public String m20247h() {
        if (TextUtils.equals(this.f17289n, "source_voice_gift_guide") || TextUtils.equals(this.f17289n, "voice_sweet_bind_cp") || TextUtils.equals(this.f17289n, "voice_gift_wall") || TextUtils.equals(this.f17289n, "source_voice_ktv_quick_gift") || TextUtils.equals(this.f17289n, "source_voice_fan_base")) {
            return this.f17272L;
        }
        if (m20252m()) {
            return this.f17270J.get(0).f15446e.a;
        }
        if (!TextUtils.isEmpty(this.f17290o)) {
            return this.f17290o;
        }
        if (TextUtils.equals(this.f17289n, "live") || TextUtils.equals(this.f17289n, "call-main") || TextUtils.equals(this.f17289n, "voiceLiveMain")) {
            return this.f17278c;
        }
        mnj mnjVar = this.f17288m;
        return mnjVar == null ? this.f17278c : mnjVar.m18093e();
    }

    /* JADX INFO: renamed from: i */
    public boolean m20248i() {
        return this.f17269I;
    }

    /* JADX INFO: renamed from: j */
    public String m20249j() {
        return this.f17271K;
    }

    /* JADX INFO: renamed from: k */
    public boolean m20250k() {
        return TextUtils.equals("js", this.f17261A);
    }

    /* JADX INFO: renamed from: l */
    public boolean m20251l() {
        return !vwb.J(this.f17270J) && this.f17270J.size() >= 2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m20252m() {
        return !vwb.J(this.f17270J) && this.f17270J.size() == 1;
    }

    /* JADX INFO: renamed from: n */
    public boolean m20253n() {
        return m20250k() && TextUtils.equals(this.f17262B, "voice-live");
    }

    /* JADX INFO: renamed from: o */
    public pge0 m20254o(boolean z) {
        this.f17264D = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public pge0 m20255p(String str) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        this.f17263C = TextUtils.equals("1", str);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m20256q(List<mlj> list) {
        this.f17270J = list;
    }

    /* JADX INFO: renamed from: r */
    public void m20257r(String str) {
        this.f17268H = str;
    }

    /* JADX INFO: renamed from: s */
    public void m20258s(gvj gvjVar) {
        this.f17267G = gvjVar;
    }

    /* JADX INFO: renamed from: t */
    public pge0 m20259t(String str) {
        this.f17295t = str;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public pge0 m20260u(String str) {
        this.f17296u = str;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public void m20261v(String str) {
        this.f17271K = str;
    }
}
