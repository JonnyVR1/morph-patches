package p153l;

import com.p051p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class zbl0 extends jk2<LongLinkVideoChat.LiveVideoChatLiveChange, LongLinkVideoChat.LiveVideoChatLiveChange> {
    public zbl0(C22508b<LongLinkVideoChat.LiveVideoChatLiveChange> c22508b, zod zodVar) {
        super(c22508b, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVideoChat.LiveVideoChatLiveChange> mo95510b() {
        return LongLinkVideoChat.LiveVideoChatLiveChange.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.videoChatLive.statusChange";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVideoChat.LiveVideoChatLiveChange mo95993z(String str, LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange) {
        return liveVideoChatLiveChange;
    }
}
