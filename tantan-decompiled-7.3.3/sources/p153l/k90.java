package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.AddressRecord;
import com.tantanapp.common.utils.CrashHelper;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class k90 {
    /* JADX INFO: renamed from: a */
    public static boolean m148785a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return !m148786b(m148787d(str));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m148786b(String str) {
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
    public static String m148787d(String str) {
        return (str != null && str.startsWith("[") && str.endsWith(Constants.AES_SUFFIX)) ? str.substring(1, str.length() - 1) : str;
    }

    /* JADX INFO: renamed from: c */
    public List<AddressRecord> m148788c(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String strM148787d = m148787d(str);
        if (!m148786b(strM148787d)) {
            return Collections.EMPTY_LIST;
        }
        try {
            return Collections.singletonList(new AddressRecord(InetAddress.getByName(strM148787d), strM148787d));
        } catch (UnknownHostException e) {
            CrashHelper.m82479c(e);
            return Collections.EMPTY_LIST;
        }
    }
}
