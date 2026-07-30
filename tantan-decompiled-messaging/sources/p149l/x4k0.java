package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class x4k0 {
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    /* JADX INFO: renamed from: a */
    public static String m206990a(User user) {
        String str;
        boolean zIsEmpty;
        Location location;
        int i = user.location.distance;
        String str2 = "";
        if (i <= 0) {
            str = "";
        } else if (i >= 1000) {
            str = "  (" + (i / 1000) + "km)";
        } else if (i > 0) {
            str = "  (" + i + "m)";
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(user.location.region.district)) {
            zIsEmpty = TextUtils.isEmpty(user.location.region.city);
            location = user.location;
            if (!zIsEmpty) {
                str2 = location.region.city;
            } else if (!TextUtils.isEmpty(location.region.country)) {
                str2 = user.location.region.country;
            }
        } else {
            Location location2 = user.location;
            if (location2.distance < 10000) {
                str2 = location2.region.district;
            } else {
                zIsEmpty = TextUtils.isEmpty(user.location.region.city);
                location = user.location;
                if (!zIsEmpty) {
                    str2 = location.region.city;
                } else if (!TextUtils.isEmpty(location.region.country)) {
                    str2 = user.location.region.country;
                }
            }
        }
        return str2 + str;
    }

    /* JADX INFO: renamed from: b */
    public static String m206991b(User user) {
        if (!NullChecker.m81303a(user) || !NullChecker.m81303a(user.location)) {
            return "";
        }
        int i = user.location.distance;
        if (i >= 1000) {
            return (i / 1000) + "km";
        }
        if (i <= 0) {
            return "";
        }
        return i + "m";
    }

    /* JADX INFO: renamed from: c */
    public static boolean m206992c(Message message) {
        return (TEnum.equals(message.messageType, MessageType.chat_gift) || TEnum.equals(message.messageType, MessageType.moment_gift)) && NullChecker.m81303a(message.additionalData);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m206993d(User user, Conversation conversation) {
        int i;
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.location) && NullChecker.m81303a(conversation) && (i = user.location.distance) > 0 && i < upa.m194700U() && upa.m194668M1()) {
            if (mqi0.m155944o() - user.location.updatedTime <= TimeUnit.DAYS.toMillis(upa.m194617C0()) && conversation.f20374mm <= upa.m194612B0()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m206994e(User user) {
        int i;
        return NullChecker.m81303a(user) && NullChecker.m81303a(user.location) && (i = user.location.distance) > 0 && i < upa.m194700U() && upa.m194673N1();
    }
}
