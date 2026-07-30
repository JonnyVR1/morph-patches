package p153l;

import android.os.Environment;
import android.os.StatFs;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class wsd0 {

    /* JADX INFO: renamed from: a */
    private static long f190613a;

    /* JADX INFO: renamed from: b */
    private static long f190614b;

    /* JADX INFO: renamed from: c */
    private static wsd0 f190615c;

    private wsd0() {
        m207750c();
        if (f190613a == 0 || f190614b == 0) {
            m207751d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static wsd0 m207749a() {
        if (f190615c == null) {
            f190615c = new wsd0();
        }
        return f190615c;
    }

    /* JADX INFO: renamed from: c */
    private void m207750c() {
        File externalStorageDirectory;
        if (j26.m143188a(eiw.m120945a(), qmw.m177151a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 117, 62, 101, 114, 51, 40, 113, 42, 110, 100, 53, 41, 98, 39, 118, 114})) == 0 && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && externalStorageDirectory.exists()) {
            try {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                f190613a = statFs.getTotalBytes();
                f190614b = statFs.getAvailableBytes();
            } catch (Exception unused) {
                f190613a = 0L;
                f190614b = 0L;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m207751d() {
        for (String str : r4f0.m179748a(new String[]{qmw.m177151a(new byte[]{84, 0}), qmw.m177151a(new byte[]{31, 11, 95, 67, 78, 21, 84, 5, 80, 69, 5})}, false).f161199b.split(SignParameters.NEW_LINE)) {
            if (!str.contains(qmw.m177151a(new byte[]{118, 15, 93, 82, 18, 31, 67, 18, 84, 90}))) {
                Matcher matcher = Pattern.compile(qmw.m177151a(new byte[]{108, 21, 26, 31, 61, 2, 27, 79, 109, 68, 74, 78, 108, 2, 26, 30, 61, 21, 27, 78, 109, 83, 74, 79, 108, 21, 26})).matcher(str);
                if (matcher.find()) {
                    f190613a = Long.parseLong(matcher.group(1));
                    f190614b = Long.parseLong(matcher.group(3));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Long m207752b() {
        return Long.valueOf(f190613a);
    }
}
