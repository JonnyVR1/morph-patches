package p149l;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class uhi {
    /* JADX INFO: renamed from: a */
    public static String m193723a(String str) {
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split("/");
        String str2 = strArrSplit[strArrSplit.length - 1];
        if (str2.contains(".")) {
            return str2.contains("?") ? str2.substring(0, str2.indexOf("?")) : str2;
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static File m193724b(String str) throws IOException {
        String strM193723a = m193723a(str);
        File file = new File(str);
        if (TextUtils.isEmpty(strM193723a)) {
            file.mkdirs();
        } else {
            new File(str.replace(strM193723a, "")).mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }
}
