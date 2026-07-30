package p007l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.lang.reflect.Field;
import l.j6f;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class n6f {
    /* JADX INFO: renamed from: a */
    public static void m9950a(File file, File file2, boolean z) {
        m9951b(file.getAbsolutePath(), file2.getAbsolutePath(), z);
    }

    /* JADX INFO: renamed from: b */
    public static void m9951b(String str, String str2, boolean z) {
        String string;
        String attribute;
        try {
            j6f j6fVar = new j6f(str);
            j6f j6fVar2 = new j6f(str2);
            for (Field field : j6f.class.getFields()) {
                String name = field.getName();
                if (!TextUtils.isEmpty(name) && name.startsWith("TAG") && (attribute = j6fVar.getAttribute((string = field.get(j6f.class).toString()))) != null && (!TextUtils.equals(string, "Orientation") || z)) {
                    j6fVar2.setAttribute(string, attribute);
                }
            }
            j6fVar2.saveAttributes();
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }
}
