package p153l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class uw0 {
    /* JADX INFO: renamed from: a */
    public static long m198310a() {
        PackageInfo packageInfoM198313d = m198313d();
        if (packageInfoM198313d != null) {
            return packageInfoM198313d.firstInstallTime;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public static long m198311b() {
        PackageInfo packageInfoM198313d = m198313d();
        if (packageInfoM198313d != null) {
            return packageInfoM198313d.lastUpdateTime;
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX INFO: renamed from: c */
    public static String m198312c() {
        ApplicationInfo applicationInfo;
        int i;
        int string = 8;
        string = 8;
        string = 8;
        string = 8;
        string = 8;
        try {
            PackageInfo packageInfoM198313d = m198313d();
            if (packageInfoM198313d != null && (applicationInfo = packageInfoM198313d.applicationInfo) != null && (i = applicationInfo.labelRes) != 0) {
                try {
                    Context contextM120945a = eiw.m120945a();
                    if (contextM120945a != null) {
                        String string2 = contextM120945a.getResources().getString(i);
                        if (!TextUtils.isEmpty(string2)) {
                            return string2;
                        }
                    }
                } catch (Exception e) {
                    Log.e(qmw.m177151a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), qmw.m177151a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 6, 3, 68, 70, 80, 71, 17, 70, 94, 7, 92, 82, 65, 0, 66, 9, 92, 23, 19, 3, 67, 9, 68, 69, 2, 3, 67, 72, 17}) + e.getMessage());
                }
            }
            Context contextM120945a2 = eiw.m120945a();
            if (contextM120945a2 == null) {
                return "";
            }
            try {
                ApplicationInfo applicationInfo2 = contextM120945a2.getApplicationInfo();
                if (applicationInfo2 == null) {
                    return "";
                }
                CharSequence applicationLabel = contextM120945a2.getPackageManager().getApplicationLabel(applicationInfo2);
                if (TextUtils.isEmpty(applicationLabel)) {
                    return "";
                }
                string = applicationLabel.toString();
                return string;
            } catch (Exception e2) {
                Log.e(qmw.m177151a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), qmw.m177151a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 6, 3, 68, 70, 80, 71, 17, 70, 94, 7, 92, 82, 65, 0, 66, 9, 92, 23, 49, 7, 83, HttpTokens.CARRIAGE_RETURN, 80, 80, 4, 43, 81, 8, 80, 80, 4, 20, 30, 70}) + e2.getMessage());
                return "";
            }
            byte[] bArr = new byte[string];
            // fill-array-data instruction
            bArr[0] = 125;
            bArr[1] = 43;
            bArr[2] = 117;
            bArr[3] = 82;
            bArr[4] = 23;
            bArr[5] = 15;
            bArr[6] = 83;
            bArr[7] = 3;
            Log.e(qmw.m177151a(bArr), qmw.m177151a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 80, 71, 17, 70, 94, 7, 92, 82}), e);
            return "";
        } catch (Exception e3) {
            byte[] bArr2 = new byte[string];
            // fill-array-data instruction
            bArr2[0] = 125;
            bArr2[1] = 43;
            bArr2[2] = 117;
            bArr2[3] = 82;
            bArr2[4] = 23;
            bArr2[5] = 15;
            bArr2[6] = 83;
            bArr2[7] = 3;
            Log.e(qmw.m177151a(bArr2), qmw.m177151a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 80, 71, 17, 70, 94, 7, 92, 82}), e3);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    private static PackageInfo m198313d() {
        try {
            return m198314e().getPackageInfo(eiw.m120945a().getPackageName(), 0);
        } catch (Exception e) {
            Log.e(qmw.m177151a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), qmw.m177151a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 97, 86, 2, HttpTokens.CARRIAGE_RETURN, 81, 1, 84, 126, 15, 0, 95, 92, 17}) + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static PackageManager m198314e() {
        return eiw.m120945a().getPackageManager();
    }

    /* JADX INFO: renamed from: f */
    public static String m198315f() {
        return eiw.m120945a().getPackageName();
    }
}
