package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class x4k0 {
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    /* JADX INFO: renamed from: a */
    public static String m24706a(User user) {
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
    public static String m24707b(User user) {
        if (!NullChecker.a(user) || !NullChecker.a(user.location)) {
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
    public static boolean m24708c(Message message) {
        return (TEnum.equals(message.messageType, "chat_gift") || TEnum.equals(message.messageType, "moment_gift")) && NullChecker.a(message.additionalData);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24709d(User user, Conversation conversation) {
        int i;
        if (NullChecker.a(user) && NullChecker.a(user.location) && NullChecker.a(conversation) && (i = user.location.distance) > 0 && i < upa.U() && upa.M1()) {
            if (mqi0.m18550o() - user.location.updatedTime <= TimeUnit.DAYS.toMillis(upa.C0()) && conversation.mm <= upa.B0()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24710e(User user) {
        int i;
        return NullChecker.a(user) && NullChecker.a(user.location) && (i = user.location.distance) > 0 && i < upa.U() && upa.N1();
    }
}
