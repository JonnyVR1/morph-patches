package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.dk */
/* JADX INFO: loaded from: classes9.dex */
public class C16395dk {
    /* JADX INFO: renamed from: a */
    public static final File m112155a(String str, String str2) {
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
}
