package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartData;

/* JADX INFO: loaded from: classes13.dex */
public class t4l0 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public final String f167733a;

    /* JADX INFO: renamed from: b */
    public final String f167734b;

    /* JADX INFO: renamed from: c */
    public BLiveVideoChatLive f167735c;

    public t4l0(BLiveVideoChatLive bLiveVideoChatLive, String str, String str2) {
        this.f167735c = bLiveVideoChatLive;
        this.f167733a = str;
        this.f167734b = str2;
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(Act act) {
        super.mo94566a(act);
        act.startActivity(LiveVChatAct.m69166b2(act, new VChatStartData(this.f167735c, this.f167733a, this.f167734b)));
        act.overridePendingTransition(wzb0.f188722e, 0);
        dt0.m113504D(act);
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "VideoFakeChatActChecker";
    }
}
