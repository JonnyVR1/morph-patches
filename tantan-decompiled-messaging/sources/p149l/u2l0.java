package p149l;

import com.p046p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class u2l0 extends bk2<LongLinkVideoChat.LiveVideoChatLiveChange, LongLinkVideoChat.LiveVideoChatLiveChange> {
    public u2l0(C22393b<LongLinkVideoChat.LiveVideoChatLiveChange> c22393b, und undVar) {
        super(c22393b, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVideoChat.LiveVideoChatLiveChange> mo94398b() {
        return LongLinkVideoChat.LiveVideoChatLiveChange.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.videoChatLive.statusChange";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVideoChat.LiveVideoChatLiveChange mo94461z(String str, LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange) {
        return liveVideoChatLiveChange;
    }
}
