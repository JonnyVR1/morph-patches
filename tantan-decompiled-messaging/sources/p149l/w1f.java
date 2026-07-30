package p149l;

import io.agora.rtc2.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class w1f {
    /* JADX INFO: renamed from: a */
    public static int m200927a(int i) {
        if (i == -1084) {
            return Constants.RHYTHM_PLAYER_STATE_OPENING;
        }
        if (i == -1010) {
            return 808;
        }
        if (i == -1009) {
            return 809;
        }
        if (i == -1007) {
            return 807;
        }
        if (i == -1006) {
            return Constants.RHYTHM_PLAYER_STATE_FAILED;
        }
        if (i == -1001) {
            return Constants.RHYTHM_PLAYER_STATE_IDLE;
        }
        if (i != -1000) {
            return i;
        }
        return 808;
    }
}
