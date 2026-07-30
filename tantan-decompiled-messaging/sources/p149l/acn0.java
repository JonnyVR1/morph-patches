package p149l;

import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class acn0 {
    /* JADX INFO: renamed from: e */
    public static C22306c<BLiveVoiceGrabHatGame> m95823e(String str, String str2) {
        return m95824f(str, str2, "closeGame");
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<BLiveVoiceGrabHatGame> m95824f(String str, String str2, String str3) {
        return upv.m194925m(LiveApiBuilder.m67307m(ytr.m216073b("/voice-lives/" + str + "/grab-hats/" + str2)).m107536c("action", str3).m107537d(), "controlGame" + str3, "").map(new w9j() { // from class: l.zbn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.grabHatGame;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<List<BLiveVoiceGrabHatCP>> m95825g(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-grab-hats/" + str + "/cps")), "getCps").map(new w9j() { // from class: l.xbn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.grabHatCps;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<BLiveVoiceGrabHatGame> m95826h(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/grabhats")), "grabhats").map(new w9j() { // from class: l.wbn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.grabHatGame;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<BLiveVoiceGrabHatGame> m95827i(String str) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/grab-hat")), "openGrabGame", "").map(new w9j() { // from class: l.ybn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.grabHatGame;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<BLiveVoiceGrabHatGame> m95828j(String str, String str2) {
        return m95824f(str, str2, "startGrab");
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<BLiveVoiceGrabHatGame> m95829k(String str, String str2) {
        return m95824f(str, str2, "stopGrab");
    }
}
