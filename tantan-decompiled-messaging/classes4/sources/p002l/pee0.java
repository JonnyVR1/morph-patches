package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraVoiceInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftReq;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftReqItem;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll/pee0;", "", "Ll/pge0;", "requestInfo", "<init>", "(Ll/pge0;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftReq;", "a", "()Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftReq;", "Ll/mlj;", "giftCall", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftReq;", "b", "(Ll/mlj;)Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftReq;", "", "sendGiftSource", "", "c", "(Ljava/lang/String;)Z", "Ll/pge0;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class pee0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final pge0 requestInfo;

    public pee0(@NotNull pge0 pge0Var) {
        pge0Var.getClass();
        this.requestInfo = pge0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final BLiveSendLiveMultiGiftReq m20192a() {
        ArrayList arrayList = new ArrayList();
        BLiveSendLiveMultiGiftReq bLiveSendLiveMultiGiftReqNew_ = BLiveSendLiveMultiGiftReq.new_();
        bLiveSendLiveMultiGiftReqNew_.givenGifts = arrayList;
        bLiveSendLiveMultiGiftReqNew_.originalId = UUID.randomUUID().toString();
        List<mlj> listM20244e = this.requestInfo.m20244e();
        listM20244e.getClass();
        for (mlj mljVar : listM20244e) {
            BLiveSendLiveMultiGiftReqItem bLiveSendLiveMultiGiftReqItemNew_ = BLiveSendLiveMultiGiftReqItem.new_();
            bLiveSendLiveMultiGiftReqItemNew_.toUserId = mljVar.f15446e.a;
            bLiveSendLiveMultiGiftReqItemNew_.givenGift = m20193b(mljVar);
            arrayList.add(bLiveSendLiveMultiGiftReqItemNew_);
        }
        return bLiveSendLiveMultiGiftReqNew_;
    }

    /* JADX INFO: renamed from: b */
    public final BLiveSendLiveGiftReq m20193b(mlj giftCall) {
        String str;
        BLiveSendLiveGiftReq bLiveSendLiveGiftReqNew_ = BLiveSendLiveGiftReq.new_();
        String str2 = "live";
        bLiveSendLiveGiftReqNew_.scenario = "live";
        bLiveSendLiveGiftReqNew_.originalId = UUID.randomUUID().toString();
        boolean zA = NullChecker.a(this.requestInfo.f17299x);
        pge0 pge0Var = this.requestInfo;
        if (zA) {
            BLiveGiftMultiCall bLiveGiftMultiCall = pge0Var.f17299x;
            bLiveGiftMultiCall.getClass();
            bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCall.receiveGiftRole.roomIdRoleIn;
            BLiveGiftMultiCall bLiveGiftMultiCall2 = this.requestInfo.f17299x;
            bLiveGiftMultiCall2.getClass();
            bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCall2.receiveGiftRole.liveIdRoleIn;
        } else {
            boolean zA2 = NullChecker.a(pge0Var.f17300y);
            pge0 pge0Var2 = this.requestInfo;
            if (zA2) {
                BLiveGiftMultiCall bLiveGiftMultiCall3 = pge0Var2.f17300y;
                bLiveGiftMultiCall3.getClass();
                bLiveSendLiveGiftReqNew_.roomId = bLiveGiftMultiCall3.receiveGiftRole.roomIdRoleIn;
                BLiveGiftMultiCall bLiveGiftMultiCall4 = this.requestInfo.f17300y;
                bLiveGiftMultiCall4.getClass();
                bLiveSendLiveGiftReqNew_.liveId = bLiveGiftMultiCall4.receiveGiftRole.liveIdRoleIn;
            } else {
                bLiveSendLiveGiftReqNew_.roomId = pge0Var2.f17277b;
                bLiveSendLiveGiftReqNew_.liveId = pge0Var2.f17276a;
            }
        }
        BLiveGiftInfo bLiveGiftInfoNew_ = BLiveGiftInfo.new_();
        BLiveGiftItem bLiveGiftItem = this.requestInfo.f17280e;
        if (bLiveGiftItem == null) {
            str = "";
        } else {
            bLiveGiftItem.getClass();
            str = bLiveGiftItem.giftType;
        }
        bLiveGiftInfoNew_.giftType = str;
        bLiveGiftInfoNew_.num = this.requestInfo.f17281f;
        bLiveSendLiveGiftReqNew_.giftInfo = CollectionsKt.mutableListOf(new BLiveGiftInfo[]{bLiveGiftInfoNew_});
        String str3 = giftCall.f15448g;
        if (m20194c(str3)) {
            str2 = "voiceLive";
        } else if (TextUtils.equals("guildCallAudience", str3)) {
            str2 = "guildLive";
        }
        bLiveSendLiveGiftReqNew_.type = str2;
        BLiveGiftExtraInfo bLiveGiftExtraInfoM20245f = this.requestInfo.m20245f();
        String str4 = giftCall.f15447f.f17800a;
        String str5 = giftCall.f15446e.a;
        str3.getClass();
        str4.getClass();
        str5.getClass();
        int i = giftCall.f15447f.f17803d;
        String str6 = this.requestInfo.f17278c;
        str6.getClass();
        String strM20249j = this.requestInfo.m20249j();
        strM20249j.getClass();
        cvj cvjVarM12060a = dvj.m12060a(str3, str4, str5, i, str6, strM20249j);
        bLiveGiftExtraInfoM20245f.call = cvjVarM12060a.getCallInfo();
        BLiveGiftExtraVoiceInfo voiceCallInfo = cvjVarM12060a.getVoiceCallInfo();
        bLiveGiftExtraInfoM20245f.voiceLive = voiceCallInfo;
        voiceCallInfo.voiceLiveMode = (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.requestInfo.m20246g()) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.requestInfo.m20246g()) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.requestInfo.m20246g())) ? this.requestInfo.m20246g() : "";
        bLiveSendLiveGiftReqNew_.extraInfo = bLiveGiftExtraInfoM20245f;
        bLiveSendLiveGiftReqNew_.liveMode = (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(this.requestInfo.m20246g()) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(this.requestInfo.m20246g()) || BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(this.requestInfo.m20246g())) ? "normal" : this.requestInfo.m20246g();
        if (w220.m24291b()) {
            bLiveSendLiveGiftReqNew_.fakeId = w220.m24290a();
        }
        return bLiveSendLiveGiftReqNew_;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20194c(String sendGiftSource) {
        return this.requestInfo.m20253n() || TextUtils.equals("voiceLiveMain", sendGiftSource) || TextUtils.equals("voiceLiveVice", sendGiftSource) || TextUtils.equals("voiceLiveAudience", sendGiftSource) || TextUtils.equals("voice-chat-admin", sendGiftSource) || TextUtils.equals("voiceLiveConfessDetail", sendGiftSource);
    }
}
