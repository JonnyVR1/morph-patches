package p153l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class xqx0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("PhenotypeConstants.class")
    public static final l01<String, Uri> f195867a = new l01<>();

    /* JADX INFO: renamed from: a */
    public static synchronized Uri m212767a(String str) {
        Uri uri;
        l01<String, Uri> l01Var = f195867a;
        uri = l01Var.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            l01Var.put(str, uri);
        }
        return uri;
    }

    /* JADX INFO: renamed from: b */
    public static String m212768b(Context context, String str) {
        if (str.contains("#")) {
            wg3.m206174a("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        return str + "#" + context.getPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m212769c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
