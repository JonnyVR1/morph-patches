package p002l;

import com.p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u2l0 extends bk2<LongLinkVideoChat.LiveVideoChatLiveChange, LongLinkVideoChat.LiveVideoChatLiveChange> {
    public u2l0(b<LongLinkVideoChat.LiveVideoChatLiveChange> bVar, und undVar) {
        super(bVar, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVideoChat.LiveVideoChatLiveChange> mo9244b() {
        return LongLinkVideoChat.LiveVideoChatLiveChange.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.videoChatLive.statusChange";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVideoChat.LiveVideoChatLiveChange mo9251z(String str, LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange) {
        return liveVideoChatLiveChange;
    }
}
