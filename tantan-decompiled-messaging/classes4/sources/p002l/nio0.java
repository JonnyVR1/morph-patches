package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nio0 extends bk2<LongLinkLiveMessage.VoiceRoomTopicUpdate, LongLinkLiveMessage.VoiceRoomTopicUpdate> {
    public nio0(b<LongLinkLiveMessage.VoiceRoomTopicUpdate> bVar, und undVar) {
        super(bVar, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate, String str) {
        return m24095r(voiceRoomTopicUpdate.getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate, String str2) {
        return (voiceRoomTopicUpdate.getTempdata() == null || voiceRoomTopicUpdate.getTempdata().getId() == 0) ? super.mo9247x(str, voiceRoomTopicUpdate, str2) : m24092n(str, voiceRoomTopicUpdate.getTempdata().getId(), voiceRoomTopicUpdate.getAnchor(), voiceRoomTopicUpdate.getManager(), voiceRoomTopicUpdate.getTempdata());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceRoomTopicUpdate> mo9244b() {
        return LongLinkLiveMessage.VoiceRoomTopicUpdate.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voiceRoom.updateTopic";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceRoomTopicUpdate mo9251z(String str, LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate) {
        return voiceRoomTopicUpdate;
    }
}
