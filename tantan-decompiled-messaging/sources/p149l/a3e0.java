package p149l;

import android.net.Uri;

/* JADX INFO: loaded from: classes11.dex */
public class a3e0 {
    /* JADX INFO: renamed from: a */
    public static String m94685a(String str) {
        Uri uri = Uri.parse(str);
        yl5 yl5Var = qib0.f154714c0;
        if (yl5Var != null) {
            yl5Var.signedIn_();
        }
        return uri.toString();
    }
}
