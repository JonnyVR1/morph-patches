package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;

/* JADX INFO: loaded from: classes5.dex */
public class bcn0 {

    /* JADX INFO: renamed from: a */
    public static String f74950a = "waiting";

    /* JADX INFO: renamed from: b */
    public static String f74951b = "grabbing";

    /* JADX INFO: renamed from: c */
    public static String f74952c = "end";

    /* JADX INFO: renamed from: a */
    public static boolean m101092a(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        return bLiveVoiceGrabHatGame != null && f74952c.equals(bLiveVoiceGrabHatGame.status);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m101093b(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        return bLiveVoiceGrabHatGame != null && f74951b.equals(bLiveVoiceGrabHatGame.status);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m101094c(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        return m101095d(bLiveVoiceGrabHatGame) || m101093b(bLiveVoiceGrabHatGame);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m101095d(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        return bLiveVoiceGrabHatGame != null && f74950a.equals(bLiveVoiceGrabHatGame.status);
    }
}
