package p153l;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class kx2 {
    /* JADX INFO: renamed from: a */
    public static boolean m151779a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return TextUtils.equals(Uri.parse(str).getQueryParameter("forbidLeftSlide"), "1");
        } catch (Exception e) {
            jzv.m147731d("BidBackPressUtil", e);
            return false;
        }
    }
}
