package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenu;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class u9o0 {
    /* JADX INFO: renamed from: b */
    public static C22421c<List<BLiveVoiceEmojiMenu>> m195108b() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/voice-live-emojiMenu")).m182288p().m182301d(), "getEmojiMenu").map(new qcj() { // from class: l.t9o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.emojiPlayMenu;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<BLiveEnvelope> m195109c(String str, String str2, String str3) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/intl-voice-emoji/play")).m182288p().m182300c("emojiType", str3).m182300c("roomId", str).m182300c("liveId", str2).m182301d(), "sendEmoji");
    }
}
