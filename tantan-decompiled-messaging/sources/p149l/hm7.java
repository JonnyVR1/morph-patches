package p149l;

import android.os.Build;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes6.dex */
public class hm7 {
    /* JADX INFO: renamed from: a */
    public static boolean m131699a(int i) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (audioBusinessTypeMo135235c != AudioBusinessType.CHAT_ROOM_WINDOW && audioBusinessTypeMo135235c != AudioBusinessType.VIDEO_CHAT) {
            return true;
        }
        lsi0.m151595y(audioBusinessTypeMo135235c.getBusinessMsg());
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m131700b() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }
}
