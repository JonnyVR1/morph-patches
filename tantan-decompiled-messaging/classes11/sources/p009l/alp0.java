package p009l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class alp0 {
    /* JADX INFO: renamed from: a */
    public static String m11511a(@NonNull Intent intent, Uri uri, @NonNull String str, boolean z, String str2) {
        String stringExtra = intent.getStringExtra(str);
        return (stringExtra == null && z && NullChecker.a(uri)) ? m11513c(uri, str, str2) : stringExtra;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11512b(@NonNull Intent intent, Uri uri, @NonNull String str, boolean z, boolean z2) {
        if (z && NullChecker.a(uri)) {
            z2 = m11514d(uri, str, z2);
        }
        return intent.getBooleanExtra(str, z2);
    }

    /* JADX INFO: renamed from: c */
    public static String m11513c(Uri uri, String str, String str2) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Exception e) {
            CrashHelper.c(e);
            queryParameter = null;
        }
        return TextUtils.isEmpty(queryParameter) ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11514d(Uri uri, String str, boolean z) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Throwable th) {
            CrashHelper.c(th);
            queryParameter = null;
        }
        return TextUtils.isEmpty(queryParameter) ? z : "1".equals(queryParameter);
    }
}
