package p002l;

import com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p1.mobile.putong.live.base.data.BLiveVideoChatUser;
import com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import java.util.ArrayList;
import l.e30;
import l.p3g0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g3l0 extends bk2<LongLinkVideoChat.LiveVideoChatChange, BLiveVideoChat> {
    public g3l0(p3g0<BLiveVideoChat, BLiveVideoChat> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m13546B(BLiveVideoChat bLiveVideoChat, LongLinkVideoChat.VideoChatPlayer videoChatPlayer) {
        BLiveVideoChatUser bLiveVideoChatUserNew_ = BLiveVideoChatUser.new_();
        bLiveVideoChatUserNew_.userId = videoChatPlayer.getUserId();
        bLiveVideoChatUserNew_.userName = videoChatPlayer.getUserName();
        bLiveVideoChatUserNew_.role = videoChatPlayer.getRole();
        bLiveVideoChatUserNew_.avatar = videoChatPlayer.getAvatar();
        bLiveVideoChat.players.add(bLiveVideoChatUserNew_);
    }

    /* JADX INFO: renamed from: C */
    public final String m13547C(LongLinkVideoChat.VideoChat.Status status) {
        return status == null ? "" : status.toString().toLowerCase();
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVideoChat.LiveVideoChatChange liveVideoChatChange, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public BLiveVideoChat mo9251z(String str, LongLinkVideoChat.LiveVideoChatChange liveVideoChatChange) {
        liveVideoChatChange.toString();
        LongLinkVideoChat.VideoChat videoChat = liveVideoChatChange.getVideoChat();
        final BLiveVideoChat bLiveVideoChat = new BLiveVideoChat();
        bLiveVideoChat.anchorId = videoChat.getAnchorId();
        bLiveVideoChat.liveId = videoChat.getLiveId();
        bLiveVideoChat.roomId = videoChat.getRoomId();
        bLiveVideoChat.status = m13547C(videoChat.getStatus());
        bLiveVideoChat.id = videoChat.getId();
        bLiveVideoChat.userId = videoChat.getUserId();
        bLiveVideoChat.createdTime = videoChat.getCreatedTime();
        bLiveVideoChat.startedTime = videoChat.getStartedTime();
        bLiveVideoChat.players = new ArrayList();
        if (!vwb.J(videoChat.getPlayersList())) {
            vwb.z(videoChat.getPlayersList(), new e30() { // from class: l.f3l0
                public final void call(Object obj) {
                    g3l0.m13546B(bLiveVideoChat, (LongLinkVideoChat.VideoChatPlayer) obj);
                }
            });
            bLiveVideoChat.ttc = videoChat.getTtc();
            bLiveVideoChat.giftId = videoChat.getGiftId();
        }
        bLiveVideoChat.called = videoChat.getCalled();
        bLiveVideoChat.endTipMessage = videoChat.getEndTipMessage();
        bLiveVideoChat.endType = videoChat.getEndType().toString();
        bLiveVideoChat.anchorCallId = videoChat.getAnchorCallId();
        bLiveVideoChat.source = videoChat.getSource();
        bLiveVideoChat.category = videoChat.getCategory().toString();
        BLiveVideoQualityConf bLiveVideoQualityConfNew_ = BLiveVideoQualityConf.new_();
        bLiveVideoChat.media = bLiveVideoQualityConfNew_;
        bLiveVideoQualityConfNew_.rtcProvider = videoChat.getRtcProvider();
        return bLiveVideoChat;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVideoChat.LiveVideoChatChange> mo9244b() {
        return LongLinkVideoChat.LiveVideoChatChange.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.videoChat.statusChange";
    }
}
