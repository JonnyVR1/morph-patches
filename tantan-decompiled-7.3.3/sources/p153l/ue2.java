package p153l;

import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes11.dex */
public class ue2 {
    /* JADX INFO: renamed from: a */
    public static String m195596a(String str) throws UnsupportedEncodingException {
        return new String(Base64.decode(str, 2), "utf-8");
    }

    /* JADX INFO: renamed from: b */
    public static String m195597b(String str) throws UnsupportedEncodingException {
        return Base64.encodeToString(str.getBytes("utf-8"), 2);
    }
}
