package p149l;

import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes13.dex */
public class me2 {
    /* JADX INFO: renamed from: a */
    public static String m154111a(String str) throws UnsupportedEncodingException {
        return new String(Base64.decode(str, 2), "utf-8");
    }

    /* JADX INFO: renamed from: b */
    public static String m154112b(String str) throws UnsupportedEncodingException {
        return Base64.encodeToString(str.getBytes("utf-8"), 2);
    }
}
