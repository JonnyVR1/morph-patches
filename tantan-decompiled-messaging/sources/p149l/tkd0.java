package p149l;

import android.os.Environment;
import android.os.StatFs;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class tkd0 {

    /* JADX INFO: renamed from: a */
    private static long f170854a;

    /* JADX INFO: renamed from: b */
    private static long f170855b;

    /* JADX INFO: renamed from: c */
    private static tkd0 f170856c;

    private tkd0() {
        m189472c();
        if (f170854a == 0 || f170855b == 0) {
            m189473d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static tkd0 m189471a() {
        if (f170856c == null) {
            f170856c = new tkd0();
        }
        return f170856c;
    }

    /* JADX INFO: renamed from: c */
    private void m189472c() {
        File externalStorageDirectory;
        if (e16.m114373a(ggw.m126041a(), rjw.m179664a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 117, 62, 101, 114, 51, 40, 113, 42, 110, 100, 53, 41, 98, 39, 118, 114})) == 0 && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && externalStorageDirectory.exists()) {
            try {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                f170854a = statFs.getTotalBytes();
                f170855b = statFs.getAvailableBytes();
            } catch (Exception unused) {
                f170854a = 0L;
                f170855b = 0L;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m189473d() {
        for (String str : kwe0.m147543a(new String[]{rjw.m179664a(new byte[]{84, 0}), rjw.m179664a(new byte[]{31, 11, 95, 67, 78, 21, 84, 5, 80, 69, 5})}, false).f124979b.split(SignParameters.NEW_LINE)) {
            if (!str.contains(rjw.m179664a(new byte[]{118, 15, 93, 82, 18, 31, 67, 18, 84, 90}))) {
                Matcher matcher = Pattern.compile(rjw.m179664a(new byte[]{108, 21, 26, 31, 61, 2, 27, 79, 109, 68, 74, 78, 108, 2, 26, 30, 61, 21, 27, 78, 109, 83, 74, 79, 108, 21, 26})).matcher(str);
                if (matcher.find()) {
                    f170854a = Long.parseLong(matcher.group(1));
                    f170855b = Long.parseLong(matcher.group(3));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Long m189474b() {
        return Long.valueOf(f170854a);
    }
}
