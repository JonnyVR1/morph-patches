package p153l;

import com.google.zxing.NotFoundException;
import com.sina.weibo.sdk.utils.WbAuthConstants;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes7.dex */
public final class fii {

    /* JADX INFO: renamed from: a */
    public static final Object f99192a;

    /* JADX INFO: renamed from: b */
    public static final Object[][] f99193b;

    /* JADX INFO: renamed from: c */
    public static final Object[][] f99194c;

    /* JADX INFO: renamed from: d */
    public static final Object[][] f99195d;

    /* JADX INFO: renamed from: e */
    public static final Object[][] f99196e;

    static {
        Object obj = new Object();
        f99192a = obj;
        f99193b = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, obj, 20}, new Object[]{Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, 6}, new Object[]{Constants.VIA_REPORT_TYPE_SET_AVATAR, 6}, new Object[]{Constants.VIA_REPORT_TYPE_JOININ_GROUP, 6}, new Object[]{Constants.VIA_REPORT_TYPE_WPA_STATE, 6}, new Object[]{Constants.VIA_REPORT_TYPE_START_GROUP, 6}, new Object[]{"20", 2}, new Object[]{"21", obj, 20}, new Object[]{Constants.VIA_REPORT_TYPE_DATALINE, obj, 29}, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, new Object[]{"90", obj, 30}, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, new Object[]{"94", obj, 30}, new Object[]{"95", obj, 30}, new Object[]{"96", obj, 30}, new Object[]{"97", obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        f99194c = new Object[][]{new Object[]{"240", obj, 30}, new Object[]{"241", obj, 30}, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{"402", 17}, new Object[]{"403", obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, new Object[]{"422", 3}, new Object[]{"423", obj, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        f99195d = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj, 15}, new Object[]{"391", obj, 18}, new Object[]{"392", obj, 15}, new Object[]{"393", obj, 18}, new Object[]{"703", obj, 30}};
        f99196e = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj, 30}, new Object[]{"7003", 10}, new Object[]{WbAuthConstants.AUTH_FAILED_INSTALL_APP_COUNTERFEIT_CODE, 14}, new Object[]{WbAuthConstants.AUTH_FAILED_NOT_SUPPORT_QUICK_AUTH_CODE, obj, 20}, new Object[]{WbAuthConstants.FETCH_FAILED_NOT_SUPPORT_CODE, obj, 30}, new Object[]{WbAuthConstants.AUTH_FAILED_QUICK_ERROR_CODE, obj, 30}, new Object[]{WbAuthConstants.AUTH_FAILED_QUICK_NULL_TOKEN_ERROR_CODE, 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj, 30}, new Object[]{"8008", obj, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj, 70}, new Object[]{"8200", obj, 70}};
    }

    /* JADX INFO: renamed from: a */
    public static String m125681a(String str) throws NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, 2);
        for (Object[] objArr : f99193b) {
            if (objArr[0].equals(strSubstring)) {
                Object obj = objArr[1];
                return obj == f99192a ? m125683c(2, ((Integer) objArr[2]).intValue(), str) : m125682b(2, ((Integer) obj).intValue(), str);
            }
        }
        if (str.length() < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring2 = str.substring(0, 3);
        for (Object[] objArr2 : f99194c) {
            if (objArr2[0].equals(strSubstring2)) {
                Object obj2 = objArr2[1];
                return obj2 == f99192a ? m125683c(3, ((Integer) objArr2[2]).intValue(), str) : m125682b(3, ((Integer) obj2).intValue(), str);
            }
        }
        for (Object[] objArr3 : f99195d) {
            if (objArr3[0].equals(strSubstring2)) {
                Object obj3 = objArr3[1];
                return obj3 == f99192a ? m125683c(4, ((Integer) objArr3[2]).intValue(), str) : m125682b(4, ((Integer) obj3).intValue(), str);
            }
        }
        if (str.length() < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring3 = str.substring(0, 4);
        for (Object[] objArr4 : f99196e) {
            if (objArr4[0].equals(strSubstring3)) {
                Object obj4 = objArr4[1];
                return obj4 == f99192a ? m125683c(4, ((Integer) objArr4[2]).intValue(), str) : m125682b(4, ((Integer) obj4).intValue(), str);
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: b */
    public static String m125682b(int i, int i2, String str) throws NotFoundException {
        if (str.length() < i) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring2 = str.substring(i, i3);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String strM125681a = m125681a(str.substring(i3));
        return strM125681a == null ? str2 : str2.concat(strM125681a);
    }

    /* JADX INFO: renamed from: c */
    public static String m125683c(int i, int i2, String str) throws NotFoundException {
        String strSubstring = str.substring(0, i);
        int length = i2 + i;
        if (str.length() < length) {
            length = str.length();
        }
        String strSubstring2 = str.substring(i, length);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String strM125681a = m125681a(str.substring(length));
        return strM125681a == null ? str2 : str2.concat(strM125681a);
    }
}
