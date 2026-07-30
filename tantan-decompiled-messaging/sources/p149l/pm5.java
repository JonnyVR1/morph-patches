package p149l;

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
public class pm5 {

    /* JADX INFO: renamed from: a */
    public static final GmsLogger f150192a = new GmsLogger(CommonUtils.TAG, "");

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public static String m170295a(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            f150192a.m12455e(CommonUtils.TAG, "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public static String m170296b(@NonNull Locale locale) {
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
