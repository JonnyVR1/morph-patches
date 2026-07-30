package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;

/* JADX INFO: loaded from: classes5.dex */
public class fln0 {

    /* JADX INFO: renamed from: a */
    public static String f99677a = "waiting";

    /* JADX INFO: renamed from: b */
    public static String f99678b = "grabbing";

    /* JADX INFO: renamed from: c */
    public static String f99679c = "end";

    /* JADX INFO: renamed from: a */
    public static boolean m126162a(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        return bLiveVoiceGrabHatGame != null && f99679c.equals(bLiveVoiceGrabHatGame.status);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m126163b(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        return bLiveVoiceGrabHatGame != null && f99678b.equals(bLiveVoiceGrabHatGame.status);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m126164c(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        return m126165d(bLiveVoiceGrabHatGame) || m126163b(bLiveVoiceGrabHatGame);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m126165d(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        return bLiveVoiceGrabHatGame != null && f99677a.equals(bLiveVoiceGrabHatGame.status);
    }
}
