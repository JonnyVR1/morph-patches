package p153l;

import android.os.Build;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes6.dex */
public class ln7 {
    /* JADX INFO: renamed from: a */
    public static boolean m154966a(int i) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (audioBusinessTypeMo171474c != AudioBusinessType.CHAT_ROOM_WINDOW && audioBusinessTypeMo171474c != AudioBusinessType.VIDEO_CHAT) {
            return true;
        }
        o1j0.m165651y(audioBusinessTypeMo171474c.getBusinessMsg());
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m154967b() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }
}
