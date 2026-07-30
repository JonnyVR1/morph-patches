package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartData;

/* JADX INFO: loaded from: classes9.dex */
public class xdl0 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public final String f193610a;

    /* JADX INFO: renamed from: b */
    public final String f193611b;

    /* JADX INFO: renamed from: c */
    public BLiveVideoChatLive f193612c;

    public xdl0(BLiveVideoChatLive bLiveVideoChatLive, String str, String str2) {
        this.f193612c = bLiveVideoChatLive;
        this.f193610a = str;
        this.f193611b = str2;
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(Act act) {
        super.mo96996a(act);
        act.startActivity(LiveVChatAct.m70349c2(act, new VChatStartData(this.f193612c, this.f193610a, this.f193611b)));
        act.overridePendingTransition(q7c0.f155956e, 0);
        it0.m142010D(act);
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "VideoFakeChatActChecker";
    }
}
