package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dvf0 {
    /* JADX INFO: renamed from: a */
    public static String m12059a(int i) {
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
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                return "AuthError";
            default:
                return "no state:" + i;
        }
    }
}
