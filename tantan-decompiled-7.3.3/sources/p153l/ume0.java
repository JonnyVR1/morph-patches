package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraVoiceInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftReq;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftReqItem;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/ume0;", "", "Ll/uoe0;", "requestInfo", "<init>", "(Ll/uoe0;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftReq;", "a", "()Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftReq;", "Ll/coj;", "giftCall", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftReq;", "b", "(Ll/coj;)Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftReq;", "", "sendGiftSource", "", "c", "(Ljava/lang/String;)Z", "Ll/uoe0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ume0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final uoe0 requestInfo;

    public ume0(@NotNull uoe0 uoe0Var) {
        uoe0Var.getClass();
        this.requestInfo = uoe0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final BLiveSendLiveMultiGiftReq m196661a() {
        ArrayList arrayList = new ArrayList();
        BLiveSendLiveMultiGiftReq bLiveSendLiveMultiGiftReqNew_ = BLiveSendLiveMultiGiftReq.new_();
        bLiveSendLiveMultiGiftReqNew_.givenGifts = arrayList;
        bLiveSendLiveMultiGiftReqNew_.originalId = UUID.randomUUID().toString();
        List<coj> listM196978e = this.requestInfo.m196978e();
        listM196978e.getClass();
        for (coj cojVar : listM196978e) {
            BLiveSendLiveMultiGiftReqItem bLiveSendLiveMultiGiftReqItemNew_ = BLiveSendLiveMultiGiftReqItem.new_();
            bLiveSendLiveMultiGiftReqItemNew_.toUserId = cojVar.f82889e.f107997a;
            bLiveSendLiveMultiGiftReqItemNew_.givenGift = m196662b(cojVar);
            arrayList.add(bLiveSendLiveMultiGiftReqItemNew_);
        }
        return bLiveSendLiveMultiGiftReqNew_;
    }

    /* JADX INFO: renamed from: b */
    public final BLiveSendLiveGiftReq m196662b(coj giftCall) {
        String str;
        BLiveSendLiveGiftReq bLiveSendLiveGiftReqNew_ = BLiveSendLiveGiftReq.new_();
        String str2 = "live";
        bLiveSendLiveGiftReqNew_.scenario = "live";
        bLiveSendLiveGiftReqNew_.originalId = UUID.randomUUID().toString();
        boolean zM82486a = NullChecker.m82486a(this.requestInfo.f180076x);
        uoe0 uoe0Var = this.requestInfo;
        if (zM82486a) {
            BLiveGiftMultiCall bLiveGiftMultiCall = uoe0Var.f180076x;
            bLiveGiftMultiCall.getClass();
            bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCall.receiveGiftRole.roomIdRoleIn;
            BLiveGiftMultiCall bLiveGiftMultiCall2 = this.requestInfo.f180076x;
            bLiveGiftMultiCall2.getClass();
            bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCall2.receiveGiftRole.liveIdRoleIn;
        } else {
            boolean zM82486a2 = NullChecker.m82486a(uoe0Var.f180077y);
            uoe0 uoe0Var2 = this.requestInfo;
            if (zM82486a2) {
                BLiveGiftMultiCall bLiveGiftMultiCall3 = uoe0Var2.f180077y;
                bLiveGiftMultiCall3.getClass();
                bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCall3.receiveGiftRole.roomIdRoleIn;
                BLiveGiftMultiCall bLiveGiftMultiCall4 = this.requestInfo.f180077y;
                bLiveGiftMultiCall4.getClass();
                bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCall4.receiveGiftRole.liveIdRoleIn;
            } else {
                bLiveSendLiveGiftReqNew_.roomId = uoe0Var2.f180054b;
                bLiveSendLiveGiftReqNew_.liveId = uoe0Var2.f180053a;
            }
        }
        BLiveGiftInfo bLiveGiftInfoNew_ = BLiveGiftInfo.new_();
        BLiveGiftItem bLiveGiftItem = this.requestInfo.f180057e;
        if (bLiveGiftItem == null) {
            str = "";
        } else {
            bLiveGiftItem.getClass();
            str = bLiveGiftItem.giftType;
        }
        bLiveGiftInfoNew_.giftType = str;
        bLiveGiftInfoNew_.num = this.requestInfo.f180058f;
        bLiveSendLiveGiftReqNew_.giftInfo = CollectionsKt.mutableListOf(bLiveGiftInfoNew_);
        String str3 = giftCall.f82891g;
        if (m196663c(str3)) {
            str2 = BLiveType.voiceLive;
        } else if (TextUtils.equals("guildCallAudience", str3)) {
            str2 = "guildLive";
        }
        bLiveSendLiveGiftReqNew_.type = str2;
        BLiveGiftExtraInfo bLiveGiftExtraInfoM196979f = this.requestInfo.m196979f();
        String str4 = giftCall.f82890f.f150592a;
        String str5 = giftCall.f82889e.f107997a;
        str3.getClass();
        str4.getClass();
        str5.getClass();
        int i = giftCall.f82890f.f150595d;
        String str6 = this.requestInfo.f180055c;
        str6.getClass();
        String strM196983j = this.requestInfo.m196983j();
        strM196983j.getClass();
        sxj sxjVarM193500a = txj.m193500a(str3, str4, str5, i, str6, strM196983j);
        bLiveGiftExtraInfoM196979f.call = sxjVarM193500a.getCallInfo();
        BLiveGiftExtraVoiceInfo voiceCallInfo = sxjVarM193500a.getVoiceCallInfo();
        bLiveGiftExtraInfoM196979f.voiceLive = voiceCallInfo;
        voiceCallInfo.voiceLiveMode = (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.requestInfo.m196980g()) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.requestInfo.m196980g()) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.requestInfo.m196980g())) ? this.requestInfo.m196980g() : "";
        bLiveSendLiveGiftReqNew_.extraInfo = bLiveGiftExtraInfoM196979f;
        bLiveSendLiveGiftReqNew_.liveMode = (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.requestInfo.m196980g()) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.requestInfo.m196980g()) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.requestInfo.m196980g())) ? "normal" : this.requestInfo.m196980g();
        if (eb20.m120149b()) {
            bLiveSendLiveGiftReqNew_.fakeId = eb20.m120148a();
        }
        return bLiveSendLiveGiftReqNew_;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m196663c(String sendGiftSource) {
        return this.requestInfo.m196987n() || TextUtils.equals("voiceLiveMain", sendGiftSource) || TextUtils.equals("voiceLiveVice", sendGiftSource) || TextUtils.equals("voiceLiveAudience", sendGiftSource) || TextUtils.equals("voice-chat-admin", sendGiftSource) || TextUtils.equals("voiceLiveConfessDetail", sendGiftSource);
    }
}
