package p149l;

import android.util.Log;
import com.tencent.could.component.common.p079ai.clipphoto.FileUtils;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ywq0 {

    /* JADX INFO: renamed from: a */
    private static final HashMap<String, String> f200524a;

    static {
        HashMap<String, String> map = new HashMap<>();
        f200524a = map;
        map.put("FFD8FF", "jpg");
        map.put("89504E47", "png");
        map.put("47494638", "gif");
        map.put("474946", "gif");
        map.put("424D", "bmp");
    }

    /* JADX INFO: renamed from: a */
    public static long m216409a(File file) {
        long jM216409a = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i = 0; i < fileArrListFiles.length; i++) {
                jM216409a += fileArrListFiles[i].isDirectory() ? m216409a(fileArrListFiles[i]) : fileArrListFiles[i].length();
            }
            return jM216409a;
        } catch (Exception e) {
            Log.e(FileUtils.TAG, "Get folder size error: " + e.getMessage());
            return jM216409a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m216410b(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                return (file.isDirectory() ? m216409a(file) : file.length()) < 104857600;
            }
            return true;
        } catch (Exception e) {
            Log.e(FileUtils.TAG, "Check if internal file can be written error :" + e.getMessage());
            return false;
        }
    }
}
