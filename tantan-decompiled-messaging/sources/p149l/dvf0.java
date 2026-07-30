package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class dvf0 {
    /* JADX INFO: renamed from: a */
    public static String m113777a(int i) {
        if (i == 12) {
            return "IOError";
        }
        if (i == 13) {
            return "KeepAliveError";
        }
        switch (i) {
            case 1:
                return "Idle";
            case 2:
                return "Connecting";
            case 3:
                return "Connected";
            case 4:
                return "ConnectError";
            case 5:
                return "Disconnected";
            case 6:
                return "AuthSuccess";
            case 7:
                return "AuthError";
            default:
                return "no state:" + i;
        }
    }
}
