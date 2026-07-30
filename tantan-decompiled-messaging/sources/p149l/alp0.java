package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class alp0 {
    /* JADX INFO: renamed from: a */
    public static String m97411a(@NonNull Intent intent, Uri uri, @NonNull String str, boolean z, String str2) {
        String stringExtra = intent.getStringExtra(str);
        return (stringExtra == null && z && NullChecker.m81303a(uri)) ? m97413c(uri, str, str2) : stringExtra;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m97412b(@NonNull Intent intent, Uri uri, @NonNull String str, boolean z, boolean z2) {
        if (z && NullChecker.m81303a(uri)) {
            z2 = m97414d(uri, str, z2);
        }
        return intent.getBooleanExtra(str, z2);
    }

    /* JADX INFO: renamed from: c */
    public static String m97413c(Uri uri, String str, String str2) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            queryParameter = null;
        }
        return TextUtils.isEmpty(queryParameter) ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m97414d(Uri uri, String str, boolean z) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            queryParameter = null;
        }
        return TextUtils.isEmpty(queryParameter) ? z : "1".equals(queryParameter);
    }
}
