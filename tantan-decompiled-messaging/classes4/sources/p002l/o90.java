package p002l;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.AddressRecord;
import com.tantanapp.common.utils.CrashHelper;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o90 {
    /* JADX INFO: renamed from: a */
    public static boolean m19325a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return !m19326b(m19327d(str));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19326b(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.contains(":")) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '.' && (cCharAt < '0' || cCharAt > '9')) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static String m19327d(String str) {
        return (str != null && str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    /* JADX INFO: renamed from: c */
    public List<AddressRecord> m19328c(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String strM19327d = m19327d(str);
        if (!m19326b(strM19327d)) {
            return Collections.EMPTY_LIST;
        }
        try {
            return Collections.singletonList(new AddressRecord(InetAddress.getByName(strM19327d), strM19327d));
        } catch (UnknownHostException e) {
            CrashHelper.c(e);
            return Collections.EMPTY_LIST;
        }
    }
}
