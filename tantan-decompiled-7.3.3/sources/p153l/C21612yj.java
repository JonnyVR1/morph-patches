package p153l;

import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.yj */
/* JADX INFO: loaded from: classes9.dex */
public class C21612yj {
    /* JADX INFO: renamed from: a */
    public static final File m216354a(String str, String str2) {
        File file = new File(oki.m168034v(), str);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                return null;
            }
            try {
                new File(file, str2).createNewFile();
                return file;
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
        return file;
    }
}
