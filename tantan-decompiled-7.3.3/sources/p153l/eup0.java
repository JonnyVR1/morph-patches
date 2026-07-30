package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class eup0 {
    /* JADX INFO: renamed from: a */
    public static String m122677a(@NonNull Intent intent, Uri uri, @NonNull String str, boolean z, String str2) {
        String stringExtra = intent.getStringExtra(str);
        return (stringExtra == null && z && NullChecker.m82486a(uri)) ? m122679c(uri, str, str2) : stringExtra;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m122678b(@NonNull Intent intent, Uri uri, @NonNull String str, boolean z, boolean z2) {
        if (z && NullChecker.m82486a(uri)) {
            z2 = m122680d(uri, str, z2);
        }
        return intent.getBooleanExtra(str, z2);
    }

    /* JADX INFO: renamed from: c */
    public static String m122679c(Uri uri, String str, String str2) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            queryParameter = null;
        }
        return TextUtils.isEmpty(queryParameter) ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m122680d(Uri uri, String str, boolean z) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            queryParameter = null;
        }
        return TextUtils.isEmpty(queryParameter) ? z : "1".equals(queryParameter);
    }
}
