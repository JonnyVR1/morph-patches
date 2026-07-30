package p153l;

import android.util.Log;
import com.tencent.could.component.common.p084ai.clipphoto.FileUtils;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class e6r0 {

    /* JADX INFO: renamed from: a */
    private static final HashMap<String, String> f92342a;

    static {
        HashMap<String, String> map = new HashMap<>();
        f92342a = map;
        map.put("FFD8FF", "jpg");
        map.put("89504E47", "png");
        map.put("47494638", "gif");
        map.put("474946", "gif");
        map.put("424D", "bmp");
    }

    /* JADX INFO: renamed from: a */
    public static long m119666a(File file) {
        long jM119666a = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i = 0; i < fileArrListFiles.length; i++) {
                jM119666a += fileArrListFiles[i].isDirectory() ? m119666a(fileArrListFiles[i]) : fileArrListFiles[i].length();
            }
            return jM119666a;
        } catch (Exception e) {
            Log.e(FileUtils.TAG, "Get folder size error: " + e.getMessage());
            return jM119666a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m119667b(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                return (file.isDirectory() ? m119666a(file) : file.length()) < 104857600;
            }
            return true;
        } catch (Exception e) {
            Log.e(FileUtils.TAG, "Check if internal file can be written error :" + e.getMessage());
            return false;
        }
    }
}
