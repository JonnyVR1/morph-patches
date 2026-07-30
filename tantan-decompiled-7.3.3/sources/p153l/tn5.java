package p153l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class tn5 {

    /* JADX INFO: renamed from: a */
    public static final GmsLogger f175226a = new GmsLogger(CommonUtils.TAG, "");

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public static String m191875a(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            f175226a.m12509e(CommonUtils.TAG, "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public static String m191876b(@NonNull Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
