package p153l;

import android.media.ExifInterface;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ykm {
    /* JADX INFO: renamed from: a */
    public static HashMap<String, String> m216527a(ExifInterface exifInterface) throws IllegalAccessException {
        Field[] fields = ExifInterface.class.getFields();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < fields.length; i++) {
            String name = fields[i].getName();
            if (!TextUtils.isEmpty(name) && name.startsWith("TAG")) {
                String string = fields[i].get(ExifInterface.class).toString();
                map.put(string, exifInterface.getAttribute(string));
            }
        }
        return map;
    }
}
