package p153l;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public class ebe0 {
    /* JADX INFO: renamed from: a */
    public static String m120159a(String str) {
        Uri uri = Uri.parse(str);
        bn5 bn5Var = uqb0.f180397c0;
        if (bn5Var != null) {
            bn5Var.signedIn_();
        }
        return uri.toString();
    }
}
