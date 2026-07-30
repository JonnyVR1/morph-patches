package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraVoiceInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/dvj;", "", "<init>", "()V", "", "giftSource", "callId", "callUserId", "", "callPosition", "anchorId", "templateType", "Ll/cvj;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/cvj;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class dvj {

    @NotNull
    public static final dvj INSTANCE = new dvj();

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final cvj m113780a(@NotNull String giftSource, @NotNull String callId, @NotNull String callUserId, int callPosition, @NotNull String anchorId, @NotNull String templateType) {
        giftSource.getClass();
        callId.getClass();
        callUserId.getClass();
        anchorId.getClass();
        templateType.getClass();
        BLiveGiftExtraCallInfo bLiveGiftExtraCallInfoNew_ = BLiveGiftExtraCallInfo.new_();
        BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfoNew_ = BLiveGiftExtraVoiceInfo.new_();
        switch (giftSource.hashCode()) {
            case -1476999145:
                if (giftSource.equals("voiceLiveMain")) {
                    bLiveGiftExtraVoiceInfoNew_.callId = callId;
                    bLiveGiftExtraVoiceInfoNew_.viceAnchorUserId = callUserId;
                    bLiveGiftExtraVoiceInfoNew_.mainUserId = anchorId;
                    bLiveGiftExtraVoiceInfoNew_.voiceAnchorType = BLiveTraceServerLocation.main;
                    bLiveGiftExtraVoiceInfoNew_.templateType = templateType;
                    bLiveGiftExtraVoiceInfoNew_.position = callPosition;
                }
                break;
            case -1476723533:
                if (giftSource.equals("voiceLiveVice")) {
                    bLiveGiftExtraVoiceInfoNew_.callId = callId;
                    bLiveGiftExtraVoiceInfoNew_.viceAnchorUserId = callUserId;
                    bLiveGiftExtraVoiceInfoNew_.mainUserId = anchorId;
                    bLiveGiftExtraVoiceInfoNew_.voiceAnchorType = "vice";
                    bLiveGiftExtraVoiceInfoNew_.templateType = templateType;
                    bLiveGiftExtraVoiceInfoNew_.position = callPosition;
                }
                break;
            case -1262742474:
                if (giftSource.equals("voice_auction")) {
                    bLiveGiftExtraVoiceInfoNew_.callId = callId;
                    bLiveGiftExtraVoiceInfoNew_.viceAnchorUserId = callUserId;
                    bLiveGiftExtraVoiceInfoNew_.mainUserId = anchorId;
                    if (TextUtils.isEmpty(callId)) {
                        bLiveGiftExtraVoiceInfoNew_.voiceAnchorType = "audience";
                    } else {
                        bLiveGiftExtraVoiceInfoNew_.voiceAnchorType = "vice";
                    }
                    bLiveGiftExtraVoiceInfoNew_.templateType = templateType;
                    bLiveGiftExtraVoiceInfoNew_.position = callPosition;
                }
                break;
            case -1092454456:
                if (giftSource.equals("call-main")) {
                    bLiveGiftExtraCallInfoNew_.mainUserId = anchorId;
                }
                break;
            case -849838926:
                if (giftSource.equals("callVideoVice")) {
                    bLiveGiftExtraCallInfoNew_.callId = callId;
                    bLiveGiftExtraCallInfoNew_.viceAnchorUserId = callUserId;
                    bLiveGiftExtraCallInfoNew_.mainUserId = anchorId;
                }
                break;
            case -77181598:
                if (giftSource.equals("voiceLiveAudience")) {
                    bLiveGiftExtraVoiceInfoNew_.mainUserId = anchorId;
                    bLiveGiftExtraVoiceInfoNew_.viceAnchorUserId = callUserId;
                    bLiveGiftExtraVoiceInfoNew_.voiceAnchorType = "audience";
                    bLiveGiftExtraVoiceInfoNew_.templateType = templateType;
                    bLiveGiftExtraVoiceInfoNew_.position = callPosition;
                }
                break;
            case 1093146089:
                if (giftSource.equals("callVoiceVice")) {
                    bLiveGiftExtraCallInfoNew_.callId = callId;
                    bLiveGiftExtraCallInfoNew_.viceAnchorUserId = callUserId;
                    bLiveGiftExtraCallInfoNew_.mainUserId = anchorId;
                }
                break;
        }
        bLiveGiftExtraCallInfoNew_.getClass();
        bLiveGiftExtraVoiceInfoNew_.getClass();
        return new cvj(bLiveGiftExtraCallInfoNew_, bLiveGiftExtraVoiceInfoNew_);
    }
}
