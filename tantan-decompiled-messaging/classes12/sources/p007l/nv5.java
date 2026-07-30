package p007l;

import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import l.rhi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nv5 {
    /* JADX INFO: renamed from: a */
    public static final File m12335a(String str, String str2) {
        File file = new File(rhi.v(), str);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                return null;
            }
            try {
                new File(file, str2).createNewFile();
                return file;
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: b */
    public static File m12336b() {
        return null;
    }
}
