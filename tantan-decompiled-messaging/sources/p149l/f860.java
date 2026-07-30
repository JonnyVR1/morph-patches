package p149l;

import com.immomo.momomediaext.utils.MMLiveRoomParams;

/* JADX INFO: loaded from: classes7.dex */
public class f860 {
    /* JADX INFO: renamed from: a */
    public static String m119872a(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            if (i != 813) {
                if (i != 4353) {
                    if (i != 12545) {
                        if (i == 16640) {
                            sb.append("Camera open error");
                        } else if (i == 1000001) {
                            if (i2 == 100) {
                                sb.append("linkType error, check enterRoom linktype");
                            } else if (i2 == 101) {
                                sb.append("livesource is null");
                            }
                        }
                    } else if (i2 == 1) {
                        sb.append("rtmp pusher connect timeout, check network or rtmp pushurl");
                    } else if (i2 == 11 || i2 == 12 || i2 == 13) {
                        sb.append("rtmp write header or packet error, check network or rtmp pushpurl");
                    } else if (i2 == 14) {
                        sb.append("rtmp send size is 0, check network");
                    }
                } else if (i2 == 812) {
                    sb.append("rtc network error");
                }
            } else if (i2 == 100) {
                sb.append("linkType error, check enterRoom linktype not support tx, mm, wl");
            }
        } else if (mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG) {
            if (i2 == 109) {
                sb.append("Token Expired");
            } else if (i2 == 110) {
                sb.append("Token Invalid");
            } else if (i2 == 101) {
                sb.append("appid Invalid");
            } else if (i2 == -100) {
                sb.append("roomid or userid is null");
            }
        } else if (mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc && i2 == -100) {
            sb.append("roomid or userid is null");
        }
        return sb.toString();
    }
}
