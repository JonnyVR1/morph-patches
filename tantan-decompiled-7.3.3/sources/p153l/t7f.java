package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
public class t7f {
    /* JADX INFO: renamed from: a */
    public static void m189564a(File file, File file2, boolean z) {
        m189565b(file.getAbsolutePath(), file2.getAbsolutePath(), z);
    }

    /* JADX INFO: renamed from: b */
    public static void m189565b(String str, String str2, boolean z) {
        String string;
        String attribute;
        try {
            p7f p7fVar = new p7f(str);
            p7f p7fVar2 = new p7f(str2);
            for (Field field : p7f.class.getFields()) {
                String name = field.getName();
                if (!TextUtils.isEmpty(name) && name.startsWith("TAG") && (attribute = p7fVar.getAttribute((string = field.get(p7f.class).toString()))) != null && (!TextUtils.equals(string, p7f.TAG_ORIENTATION) || z)) {
                    p7fVar2.setAttribute(string, attribute);
                }
            }
            p7fVar2.saveAttributes();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }
}
