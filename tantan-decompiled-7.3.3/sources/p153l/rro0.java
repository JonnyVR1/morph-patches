package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class rro0 extends jk2<LongLinkLiveMessage.VoiceRoomTopicUpdate, LongLinkLiveMessage.VoiceRoomTopicUpdate> {
    public rro0(C22508b<LongLinkLiveMessage.VoiceRoomTopicUpdate> c22508b, zod zodVar) {
        super(c22508b, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate, String str) {
        return m159460r(voiceRoomTopicUpdate.getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate, String str2) {
        return (voiceRoomTopicUpdate.getTempdata() == null || voiceRoomTopicUpdate.getTempdata().getId() == 0) ? super.mo113619x(str, voiceRoomTopicUpdate, str2) : m159457n(str, voiceRoomTopicUpdate.getTempdata().getId(), voiceRoomTopicUpdate.getAnchor(), voiceRoomTopicUpdate.getManager(), voiceRoomTopicUpdate.getTempdata());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceRoomTopicUpdate> mo95510b() {
        return LongLinkLiveMessage.VoiceRoomTopicUpdate.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voiceRoom.updateTopic";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceRoomTopicUpdate mo95993z(String str, LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate) {
        return voiceRoomTopicUpdate;
    }
}
