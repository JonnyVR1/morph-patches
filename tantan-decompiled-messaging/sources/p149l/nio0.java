package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class nio0 extends bk2<LongLinkLiveMessage.VoiceRoomTopicUpdate, LongLinkLiveMessage.VoiceRoomTopicUpdate> {
    public nio0(C22393b<LongLinkLiveMessage.VoiceRoomTopicUpdate> c22393b, und undVar) {
        super(c22393b, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate, String str) {
        return m199212r(voiceRoomTopicUpdate.getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate, String str2) {
        return (voiceRoomTopicUpdate.getTempdata() == null || voiceRoomTopicUpdate.getTempdata().getId() == 0) ? super.mo94401x(str, voiceRoomTopicUpdate, str2) : m199209n(str, voiceRoomTopicUpdate.getTempdata().getId(), voiceRoomTopicUpdate.getAnchor(), voiceRoomTopicUpdate.getManager(), voiceRoomTopicUpdate.getTempdata());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceRoomTopicUpdate> mo94398b() {
        return LongLinkLiveMessage.VoiceRoomTopicUpdate.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voiceRoom.updateTopic";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceRoomTopicUpdate mo94461z(String str, LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate) {
        return voiceRoomTopicUpdate;
    }
}
