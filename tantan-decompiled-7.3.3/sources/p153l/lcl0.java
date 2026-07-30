package p153l;

import com.p051p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatUser;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class lcl0 extends jk2<LongLinkVideoChat.LiveVideoChatChange, BLiveVideoChat> {
    public lcl0(wbg0<BLiveVideoChat, BLiveVideoChat> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m153686B(BLiveVideoChat bLiveVideoChat, LongLinkVideoChat.VideoChatPlayer videoChatPlayer) {
        BLiveVideoChatUser bLiveVideoChatUserNew_ = BLiveVideoChatUser.new_();
        bLiveVideoChatUserNew_.userId = videoChatPlayer.getUserId();
        bLiveVideoChatUserNew_.userName = videoChatPlayer.getUserName();
        bLiveVideoChatUserNew_.role = videoChatPlayer.getRole();
        bLiveVideoChatUserNew_.avatar = videoChatPlayer.getAvatar();
        bLiveVideoChat.players.add(bLiveVideoChatUserNew_);
    }

    /* JADX INFO: renamed from: C */
    public final String m153687C(LongLinkVideoChat.VideoChat.Status status) {
        return status == null ? "" : status.toString().toLowerCase();
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVideoChat.LiveVideoChatChange liveVideoChatChange, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public BLiveVideoChat mo95993z(String str, LongLinkVideoChat.LiveVideoChatChange liveVideoChatChange) {
        liveVideoChatChange.toString();
        LongLinkVideoChat.VideoChat videoChat = liveVideoChatChange.getVideoChat();
        final BLiveVideoChat bLiveVideoChat = new BLiveVideoChat();
        bLiveVideoChat.anchorId = videoChat.getAnchorId();
        bLiveVideoChat.liveId = videoChat.getLiveId();
        bLiveVideoChat.roomId = videoChat.getRoomId();
        bLiveVideoChat.status = m153687C(videoChat.getStatus());
        bLiveVideoChat.f45322id = videoChat.getId();
        bLiveVideoChat.userId = videoChat.getUserId();
        bLiveVideoChat.createdTime = videoChat.getCreatedTime();
        bLiveVideoChat.startedTime = videoChat.getStartedTime();
        bLiveVideoChat.players = new ArrayList();
        if (!jyb.m147479J(videoChat.getPlayersList())) {
            jyb.m147537z(videoChat.getPlayersList(), new y20() { // from class: l.kcl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    lcl0.m153686B(bLiveVideoChat, (LongLinkVideoChat.VideoChatPlayer) obj);
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

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVideoChat.LiveVideoChatChange> mo95510b() {
        return LongLinkVideoChat.LiveVideoChatChange.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.videoChat.statusChange";
    }
}
