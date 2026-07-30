package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenu;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class q0o0 {
    /* JADX INFO: renamed from: b */
    public static C22306c<List<BLiveVoiceEmojiMenu>> m172337b() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/voice-live-emojiMenu")).m107524p().m107537d(), "getEmojiMenu").map(new w9j() { // from class: l.p0o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.emojiPlayMenu;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<BLiveEnvelope> m172338c(String str, String str2, String str3) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/intl-voice-emoji/play")).m107524p().m107536c("emojiType", str3).m107536c("roomId", str).m107536c("liveId", str2).m107537d(), "sendEmoji");
    }
}
