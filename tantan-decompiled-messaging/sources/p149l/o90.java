package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.AddressRecord;
import com.tantanapp.common.utils.CrashHelper;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o90 {
    /* JADX INFO: renamed from: a */
    public static boolean m163192a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return !m163193b(m163194d(str));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m163193b(String str) {
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
    public static String m163194d(String str) {
        return (str != null && str.startsWith("[") && str.endsWith(Constants.AES_SUFFIX)) ? str.substring(1, str.length() - 1) : str;
    }

    /* JADX INFO: renamed from: c */
    public List<AddressRecord> m163195c(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String strM163194d = m163194d(str);
        if (!m163193b(strM163194d)) {
            return Collections.EMPTY_LIST;
        }
        try {
            return Collections.singletonList(new AddressRecord(InetAddress.getByName(strM163194d), strM163194d));
        } catch (UnknownHostException e) {
            CrashHelper.m81296c(e);
            return Collections.EMPTY_LIST;
        }
    }
}
