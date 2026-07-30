package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class nv5 {
    /* JADX INFO: renamed from: a */
    public static final File m161567a(String str, String str2) {
        File file = new File(rhi.m179378v(), str);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                return null;
            }
            try {
                new File(file, str2).createNewFile();
                return file;
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: b */
    public static File m161568b() {
        return null;
    }
}
