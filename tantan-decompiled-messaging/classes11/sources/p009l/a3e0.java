package p009l;

import android.net.Uri;
import l.qib0;
import l.yl5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class a3e0 {
    /* JADX INFO: renamed from: a */
    public static String m11185a(String str) {
        Uri uri = Uri.parse(str);
        yl5 yl5Var = qib0.c0;
        if (yl5Var != null) {
            yl5Var.signedIn_();
        }
        return uri.toString();
    }
}
