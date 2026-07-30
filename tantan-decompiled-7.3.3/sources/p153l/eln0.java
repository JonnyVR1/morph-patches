package p153l;

import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class eln0 {
    /* JADX INFO: renamed from: e */
    public static C22421c<BLiveVoiceGrabHatGame> m121247e(String str, String str2) {
        return m121248f(str, str2, "closeGame");
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<BLiveVoiceGrabHatGame> m121248f(String str, String str2, String str3) {
        return vrv.m202552m(LiveApiBuilder.m68490m(zvr.m221802b("/voice-lives/" + str + "/grab-hats/" + str2)).m182300c("action", str3).m182301d(), "controlGame" + str3, "").map(new qcj() { // from class: l.dln0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.grabHatGame;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<List<BLiveVoiceGrabHatCP>> m121249g(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-grab-hats/" + str + "/cps")), "getCps").map(new qcj() { // from class: l.bln0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.grabHatCps;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<BLiveVoiceGrabHatGame> m121250h(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/grabhats")), "grabhats").map(new qcj() { // from class: l.aln0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.grabHatGame;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<BLiveVoiceGrabHatGame> m121251i(String str) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/grab-hat")), "openGrabGame", "").map(new qcj() { // from class: l.cln0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.grabHatGame;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<BLiveVoiceGrabHatGame> m121252j(String str, String str2) {
        return m121248f(str, str2, "startGrab");
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<BLiveVoiceGrabHatGame> m121253k(String str, String str2) {
        return m121248f(str, str2, "stopGrab");
    }
}
