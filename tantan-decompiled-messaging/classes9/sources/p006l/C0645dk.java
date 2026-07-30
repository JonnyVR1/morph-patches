package p006l;

import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import l.rhi;

/* JADX INFO: renamed from: l.dk */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0645dk {
    /* JADX INFO: renamed from: a */
    public static final File m14050a(String str, String str2) {
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
}
